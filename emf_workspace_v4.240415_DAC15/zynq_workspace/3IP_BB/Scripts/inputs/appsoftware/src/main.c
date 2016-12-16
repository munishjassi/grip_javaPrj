/***************************************************************************//**
 *   @file   main.c
********************************************************************************
 * Copyright 2013(c) Analog Devices, Inc.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *  - Neither the name of Analog Devices, Inc. nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *  - The use of this software may or may not infringe the patent rights
 *    of one or more patent holders.  This license does not release you
 *    from the requirement that you obtain separate licenses from these
 *    patent holders to use this software.
 *  - Use of the software either in source or binary form, must be run
 *    on or directly connected to an Analog Devices Inc. component.
 *
 * THIS SOFTWARE IS PROVIDED BY ANALOG DEVICES "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, NON-INFRINGEMENT,
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL ANALOG DEVICES BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, INTELLECTUAL PROPERTY RIGHTS, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
********************************************************************************
 *   SVN Revision: $WCREV$
*******************************************************************************/

/******************************************************************************/
/***************************** Include Files **********************************/
/******************************************************************************/
#include <stdio.h>
#include "xil_cache.h"
#include "xbasic_types.h"
#include "xil_io.h"
#include "cf_hdmi.h"
#include "atv_platform.h"
#include "transmitter.h"
#include "xil_exception.h"
#include "xuartps.h"
// for interrupt handling
#include "axi_interrupt.h"
#include "xscugic.h"
// for cycle profiling
//#include "profile_cnt.h"

#include "xconvert_to_gray.h"
#include "ximage_filter.h"
#include "xsobel_filter.h"
#include "xaxivdma.h"

#include "driver_include.h"

extern char inbyte(void);

/******************************************************************************/
/************************** Macros Definitions ********************************/
/******************************************************************************/
#define HDMI_CALL_INTERVAL_MS	10			/* Interval between two         */
											/* iterations of the main loop  */
#define DBG_MSG                 xil_printf
#define VDMA2
#define VDMA3
#define VDMA4

/******************************************************************************/
/************************ Variables Definitions *******************************/
/******************************************************************************/
static UCHAR    MajorRev;      /* Major Release Number */
static UCHAR    MinorRev;      /* Usually used for code-drops */
static UCHAR    RcRev;         /* Release Candidate Number */
static BOOL     DriverEnable;
static BOOL     LastEnable;


XConvert_to_gray	xColorFilter;
XImage_filter		xErodeFilter;
XSobel_filter		xSobelFilter;

XAxiVdma pAxiVdma;
//XAxiVdma_Config *Config;
int vdma_init( u16 uDeviceId )
{
   int Status;
   XAxiVdma_Config *dmaConfig;

   dmaConfig = XAxiVdma_LookupConfig( uDeviceId );
   if (!dmaConfig)
   {
      xil_printf( "No video DMA found for ID %d\n\r", uDeviceId);
      return 1;
   }

   /* Initialize DMA engine */
   Status = XAxiVdma_CfgInitialize(&pAxiVdma, dmaConfig, dmaConfig->BaseAddress);
   if (Status != XST_SUCCESS)
   {
      xil_printf( "Initialization failed %d\n\r", Status);
      return 1;
   }
   xil_printf("configure vdma's addr %x \r\n", dmaConfig->BaseAddress);

   return 0;
}


XScuGic InterruptController; /* Instance of the Interrupt Controller */
static XScuGic_Config *GicConfig;/* The configuration parameters of the controller */
int ScuGicInterrupt_Init()
{
	int Status;
	/*
	 * Initialize the interrupt controller driver so that it is ready to
	 * use.
	 * */
	Xil_ExceptionInit();

	GicConfig = XScuGic_LookupConfig(XPAR_PS7_SCUGIC_0_DEVICE_ID);
	if (NULL == GicConfig) {
		return XST_FAILURE;
	}

	Status = XScuGic_CfgInitialize(&InterruptController, GicConfig,
			GicConfig->CpuBaseAddress);
	if (Status != XST_SUCCESS) {
		return XST_FAILURE;
	}

	 // **** Setup the Interrupt System *****

//	 * Connect the interrupt controller interrupt handler to the hardware
//	 * interrupt handling logic in the ARM processor.
	Xil_ExceptionRegisterHandler(XIL_EXCEPTION_ID_IRQ_INT,
			(Xil_ExceptionHandler) XScuGic_InterruptHandler,
			(void *) &InterruptController);

//	 * Connect a device driver handler that will be called when an
//	 * interrupt for the device occurs, the device driver handler performs
//	 * the specific interrupt processing for the device
	Status = XScuGic_Connect(&InterruptController,85,
			(Xil_ExceptionHandler)AXI_INTERRUPT_VsyncIntr_Handler,
			(void *) &InterruptController);
	XScuGic_Enable(&InterruptController, 85);

	/*Status = XScuGic_Connect(&InterruptController,84,
				(Xil_ExceptionHandler)AXI_INTERRUPT_HrefIntr_Handler,
				(void *) &InterruptController);
		XScuGic_Enable(&InterruptController, 84);*/


// 	Enable interrupts in the ARM
	Xil_ExceptionEnable();

	//Only used for edge sensitive Interrupts
	XScuGic_SetPriorityTriggerType(&InterruptController, 85, 0xa0, 3);
//	XScuGic_SetPriorityTriggerType(&InterruptController, 84, 0xa0, 3);

	if (Status != XST_SUCCESS) {
		return XST_FAILURE;
	}
	return XST_SUCCESS ; // added by umair
}

void delay_us(u32 us_count) {
  u32 count;
  for (count = 0; count < ((us_count * 800) + 1); count++) {
    asm("nop");
  }
}

/* Cycle profiling related functions
 */
static inline void EnablePerfCounters()
{
	/* enable user-mode access to the performance counter*/
	  asm ("MCR p15, 0, %0, C9, C14, 0\n\t" :: "r"(1));

	  /* disable counter overflow interrupts (just in case)*/
	  asm ("MCR p15, 0, %0, C9, C14, 2\n\t" :: "r"(0x8000000f));
}

static inline unsigned int get_cyclecount (void)
{
 unsigned int value;
 // Read CCNT Register
 asm volatile ("MRC p15, 0, %0, c9, c13, 0\t\n": "=r"(value));
 return value;
}

static inline void init_perfcounters (unsigned long do_reset, unsigned long enable_divider)
{
 // in general enable all counters (including cycle counter)
	unsigned long value = 1;

 // perform reset:
 if (do_reset)
 {
   value |= 2;     // reset all counters to zero.
   value |= 4;     // reset cycle counter to zero.
 }

 if (enable_divider)
   value |= 8;     // enable "by 64" divider for CCNT.

 value |= 16;

 // program the performance-counter control-register:
 asm volatile ("MCR p15, 0, %0, c9, c12, 0\t\n" :: "r"(value));

 // enable all counters:
 asm volatile ("MCR p15, 0, %0, c9, c12, 1\t\n" :: "r"(0x8000000f));

 // clear overflows:
 asm volatile ("MCR p15, 0, %0, c9, c12, 3\t\n" :: "r"(0x8000000f));
}

/****************************************************************************
 * For configuration of VDMA and start transfer
 */
void configureFilterVDMA(int vdma_id, int vdma_direction, unsigned long base_address)
{
	u32 VDMA_BASEADDR;
	// vdma_id can be used to select the  VDMA base address instead of VDMA_BASEADDR
	if (vdma_id == VDMA_ID_1)
		VDMA_BASEADDR = VDMA1_BASEADDR;
#ifdef VDMA2
	else if (vdma_id == VDMA_ID_2)
		VDMA_BASEADDR = VDMA2_BASEADDR;
#endif
#ifdef VDMA3
	else if (vdma_id == VDMA_ID_3)
		VDMA_BASEADDR = VDMA3_BASEADDR;
#endif
#ifdef VDMA4
	else if (vdma_id == VDMA_ID_4)
		VDMA_BASEADDR = VDMA4_BASEADDR;
#endif

	if(vdma_direction == DMA_DEV_TO_MEM)		// from device to memory
	{// rx : S2MM

		/* FOR HDMI RELEVANT SETTINGS of VDMA*/
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_RX_CTRL), 0x00000003); // enable circular mode
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_RX_START1), base_address); // start address
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_RX_START2), base_address); // start address
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_RX_START3), base_address); // start address
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_RX_FRMDLY_STRIDE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h offset
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_RX_HSIZE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h size
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_RX_VSIZE),
				detailedTiming[currentResolution][V_ACTIVE_TIME]); // v size

	}
	else if (vdma_direction ==DMA_MEM_TO_DEV)		// from memory to device
	{//tx : MM2S

		/* FOR HDMI RELEVANT SETTINGS of VDMA */
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_TX_CTRL), 0x00000003); // enable circular mode, genlock synEn
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_TX_START1), base_address); // start address
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_TX_START2), base_address); // start address
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_TX_START3), base_address); // start address
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_TX_FRMDLY_STRIDE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h offset
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_TX_HSIZE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h size
		Xil_Out32((VDMA_BASEADDR + AXI_FILTER_TX_VSIZE),
				detailedTiming[currentResolution][V_ACTIVE_TIME]); // v size
	}

}

void readDDR(unsigned long base_address)
{
	int i;
	for (i=0 ; i<15 ; i++ ){
		xil_printf ("%x : %x \r\n",base_address+i*4, Xil_In32(base_address+(i * 4)));
	}
}

void readConfigurationVDMA(int vdma_id)
{
	u32 VDMA_BASEADDR;
		// vdma_id can be used to select the  VDMA base address instead of VDMA_BASEADDR
	if (vdma_id == VDMA_ID_1){
			VDMA_BASEADDR = VDMA1_BASEADDR;
			xil_printf("VDMA1's Configurations \r\n");
		}
#ifdef VDMA2
	else if (vdma_id == VDMA_ID_2){
			VDMA_BASEADDR = VDMA2_BASEADDR;
			xil_printf("VDMA2's Configurations \r\n");}
#endif
#ifdef VDMA3
	else if (vdma_id == VDMA_ID_3){
			VDMA_BASEADDR = VDMA3_BASEADDR;
			xil_printf("VDMA3's Configurations \r\n");}
#endif
#ifdef VDMA4
	else if (vdma_id == VDMA_ID_4){
		VDMA_BASEADDR = VDMA4_BASEADDR;
		xil_printf("VDMA3's Configurations \r\n");}
#endif
	xil_printf("AXI_FILTER_RX_CTRL 	 %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_RX_CTRL));
	xil_printf("AXI_FILTER_RX_STATUS %x \r\n", Xil_In32(VDMA_BASEADDR + XAXIVDMA_SR_OFFSET));
	xil_printf("AXI_FILTER_RX_START1 %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_RX_START1));
	xil_printf("AXI_FILTER_RX_START2 %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_RX_START2));
	xil_printf("AXI_FILTER_RX_START3 %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_RX_START3));
	xil_printf("AXI_FILTER_RX_FRMDLY_STRIDE %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_RX_FRMDLY_STRIDE));
	xil_printf("AXI_FILTER_RX_HSIZE %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_RX_HSIZE));
	xil_printf("AXI_FILTER_RX_VSIZE %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_RX_VSIZE));

	xil_printf("AXI_FILTER_TX_CTRL %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_TX_CTRL));
	xil_printf("AXI_FILTER_RX_STATUS %x \r\n", Xil_In32(VDMA_BASEADDR + 0x30 + XAXIVDMA_SR_OFFSET));
	xil_printf("AXI_FILTER_TX_START1 %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_TX_START1));
	xil_printf("AXI_FILTER_TX_START2 %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_TX_START2));
	xil_printf("AXI_FILTER_TX_START3 %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_TX_START3));
	xil_printf("AXI_FILTER_TX_FRMDLY_STRIDE %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_TX_FRMDLY_STRIDE));
	xil_printf("AXI_FILTER_TX_HSIZE %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_TX_HSIZE));
	xil_printf("AXI_FILTER_TX_VSIZE %x \r\n", Xil_In32(VDMA_BASEADDR + AXI_FILTER_TX_VSIZE)); // enable ci

	//HDMI VDMA
		xil_printf("HDMI AXI_FILTER_TX_CTRL %x \r\n", Xil_In32(Hdmi_VDMA_BASEADDR + AXI_FILTER_TX_CTRL));
		xil_printf("AXI_FILTER_TX_START1 %x \r\n", Xil_In32(Hdmi_VDMA_BASEADDR + AXI_FILTER_TX_START1));
		xil_printf("AXI_FILTER_TX_START2 %x \r\n", Xil_In32(Hdmi_VDMA_BASEADDR + AXI_FILTER_TX_START2));
		xil_printf("AXI_FILTER_TX_START3 %x \r\n", Xil_In32(Hdmi_VDMA_BASEADDR + AXI_FILTER_TX_START3));
		xil_printf("AXI_FILTER_TX_FRMDLY_STRIDE %x \r\n", Xil_In32(Hdmi_VDMA_BASEADDR + AXI_FILTER_TX_FRMDLY_STRIDE));
		xil_printf("AXI_FILTER_TX_HSIZE %x \r\n", Xil_In32(Hdmi_VDMA_BASEADDR + AXI_FILTER_TX_HSIZE));
		xil_printf("AXI_FILTER_TX_VSIZE %x \r\n", Xil_In32(Hdmi_VDMA_BASEADDR + AXI_FILTER_TX_VSIZE));
		xil_printf("\r\n");
}


void init_erodefilter()
{
	XImage_filter_SetRows(&xErodeFilter, detailedTiming[currentResolution][V_ACTIVE_TIME]);
	XImage_filter_SetCols(&xErodeFilter, detailedTiming[currentResolution][H_ACTIVE_TIME]);

	//	XImage_filter_InterruptGlobalEnable(&xfilter);
	//	XImage_filter_InterruptEnable(&xfilter, 3);
	XImage_filter_EnableAutoRestart(&xErodeFilter);
	XImage_filter_Start(&xErodeFilter);
}

void init_colorfilter()
{
	XConvert_to_gray_SetRows(&xColorFilter, detailedTiming[currentResolution][V_ACTIVE_TIME]);
	XConvert_to_gray_SetCols(&xColorFilter, detailedTiming[currentResolution][H_ACTIVE_TIME]);

	//	XImage_filter_InterruptGlobalEnable(&xfilter);
	//	XImage_filter_InterruptEnable(&xfilter, 3);
	XConvert_to_gray_EnableAutoRestart(&xColorFilter);
	XConvert_to_gray_Start(&xColorFilter);
}

void init_sobelfilter()
{
	XSobel_filter_SetRows(&xSobelFilter, detailedTiming[currentResolution][V_ACTIVE_TIME]);
	XSobel_filter_SetCols(&xSobelFilter, detailedTiming[currentResolution][H_ACTIVE_TIME]);

	//	XImage_filter_InterruptGlobalEnable(&xfilter);
	//	XImage_filter_InterruptEnable(&xfilter, 3);
	XSobel_filter_EnableAutoRestart(&xSobelFilter);
	XSobel_filter_Start(&xSobelFilter);
}
/***************************************************************************//**
 * @brief Enables the driver.
 *
 * @return Returns ATVERR_OK.
*******************************************************************************/
void APP_EnableDriver (BOOL Enable)
{
    DriverEnable = Enable;
}

/***************************************************************************//**
 * @brief Returns the driver enable status.
 *
 * @return Returns the driver enable status.
*******************************************************************************/
static BOOL APP_DriverEnabled (void)
{
    if ((DriverEnable && HAL_GetMBSwitchState()) != LastEnable)
    {
        LastEnable = DriverEnable && HAL_GetMBSwitchState();
        DBG_MSG ("APP: Driver %s\n\r", LastEnable? "Enabled": "Disabled");
    }
    return (LastEnable);
}

/***************************************************************************//**
 * @brief Displays the application version and the chip revision.
 *
 * @return None.
*******************************************************************************/
/*static void APP_PrintRevisions (void)
{
	UINT16 TxRev;

	ADIAPI_TxGetChipRevision(&TxRev);

	DBG_MSG("\n\r********************************************************************\r\n");
	DBG_MSG("  ADI HDMI Trasmitter Application Ver R%d.%d.%d\n\r", MajorRev, MinorRev, RcRev);
	DBG_MSG("  HDMI-TX:  ADV7511 Rev 0x%x\r\n", TxRev);
	DBG_MSG("  Created:  %s At %s\n\r", __DATE__, __TIME__);
	DBG_MSG("********************************************************************\r\n\n\r");
}*/

/***************************************************************************//**
 * @brief Changes the video resolution.
 *
 * @return None.
*******************************************************************************/
static int APP_ChangeResolution (void)
{
	char *resolutions[7] = {"640x480", "800x600", "1024x768", "1280x720", "1360x768", "1600x900", "1920x1080"};
	char *displaylocation[4] = {"Raw", "SW processed", "HW Processed", "Sobel Processed"};
	char receivedChar    = 0;

	if(XUartPs_IsReceiveData(UART_BASEADDR))
	{
		receivedChar = inbyte();
		if (receivedChar == 'q') {
					DBG_MSG("Exiting Application \r\n");
				    return(0);
				    }
		/*else if ((receivedChar == 'o'){
			SetVideoResolution(receivedChar - 0x30);
		}*/
		else if((receivedChar >= 0x30) && (receivedChar <= 0x36))
					{
						SetVideoResolution(receivedChar - 0x30);
						DBG_MSG("Resolution was changed to %s \r\n", resolutions[receivedChar - 0x30]);
					}
		else if(receivedChar == 'r')
		{
			configHdmiVDMA(Raw, detailedTiming[currentResolution][H_ACTIVE_TIME],
							detailedTiming[currentResolution][V_ACTIVE_TIME] );
			DBG_MSG("Display location was changed to %s image\r\n", displaylocation[Raw]);
		}
		else if(receivedChar == 's')
		{
			configHdmiVDMA(SWProcessed, detailedTiming[currentResolution][H_ACTIVE_TIME],
							detailedTiming[currentResolution][V_ACTIVE_TIME] );
			DBG_MSG("Display location was changed to %s image\r\n", displaylocation[SWProcessed]);
		}
		else if(receivedChar == 'h')
		{
			configHdmiVDMA(HWProcessed, detailedTiming[currentResolution][H_ACTIVE_TIME],
							detailedTiming[currentResolution][V_ACTIVE_TIME] );
			DBG_MSG("Display location was changed to %s image\r\n", displaylocation[HWProcessed]);
		}
		else if(receivedChar == 'b')
		{
			configHdmiVDMA(SobProcessed, detailedTiming[currentResolution][H_ACTIVE_TIME],
							detailedTiming[currentResolution][V_ACTIVE_TIME] );
			DBG_MSG("Display location was changed to %s image\r\n", displaylocation[SobProcessed]);
		}
		else
		{
			if((receivedChar != 0x0A) && (receivedChar != 0x0D))
			{
				SetVideoResolution(RESOLUTION_640x480);
				DBG_MSG("Resolution was changed to %s \r\n", resolutions[0]);
			}
		}
	}
	return 1;
}

/***************************************************************************//**
 * @brief Main function.
 *
 * @return Returns 0.
*******************************************************************************/
int main()
{
	UINT32 StartCount;
	unsigned int t;
	MajorRev     = 1;
	MinorRev     = 1;
	RcRev        = 1;
	DriverEnable = TRUE;
	LastEnable   = FALSE;

	currentDisplayLoc = Raw;

	Xil_ICacheEnable();
	Xil_DCacheEnable();

	HAL_PlatformInit(XPAR_AXI_IIC_0_BASEADDR,	/* Perform any required platform init */
					 XPAR_SCUTIMER_DEVICE_ID,	/* including hardware reset to HDMI devices */
					 XPAR_SCUGIC_SINGLE_DEVICE_ID,
					 XPAR_SCUTIMER_INTR);


	//Xil_ExceptionEnable();
	EnablePerfCounters();
	// init counters:
	init_perfcounters (1, 0); // Reset the counters, NO Div by 64
//	// measure the counting overhead:
//	unsigned int overhead = get_cyclecount();
//	overhead = get_cyclecount() - overhead;
//
	t = get_cyclecount();

	InitHdmiAudioPcore();
	t = get_cyclecount() - t;
	printf ("function took %d cycles \n", t);

	//APP_PrintRevisions();       /* Display S/W and H/W revisions */

	DBG_MSG("To change the video resolution press:\r\n");
	DBG_MSG("  '0' - 640x480;  '1' - 800x600;  '2' - 1024x768; '3' - 1280x720 \r\n");
	DBG_MSG("  '4' - 1360x768; '5' - 1600x900; '6' - 1920x1080.\r\n");
	DBG_MSG("  'r' - Raw ; 's' - SW Processed; 'h' - HW processed \r\n");

	ADIAPI_TransmitterInit();   /* Initialize ADI repeater software and h/w */
	ADIAPI_TransmitterSetPowerMode(REP_POWER_UP);

	StartCount = HAL_GetCurrentMsCount();

	ADIAPI_TransmitterMain();
	SetVideoResolution(RESOLUTION_640x480);

	int xstatus;
	init_perfcounters (1, 0);
	xstatus = ScuGicInterrupt_Init();
	if (xstatus != XST_SUCCESS) {
	  		printf("Unable to initialize Interrupts");
	  		//return XST_FAILURE;
	  	}

	/********** Adding Image Filter HW Accel + VDMA **********
	 * This should be later added to SetVideoResolution() function
	 */
	//XImage_filter_Initialize(&xErodeFilter, "FILTER");
	xSobelFilter.Control_bus_BaseAddress = XPAR_SOBEL_FILTER_TOP_0_S_AXI_CONTROL_BUS_BASEADDR;
//	xSobelFilter.Control_bus_BaseAddress = XPAR_IMAGE_PROCESSOR_TOP_0_S_AXI_CONTROL_BUS_BASEADDR;
	xSobelFilter.IsReady = XIL_COMPONENT_IS_READY;
	init_sobelfilter();

	xErodeFilter.Control_bus_BaseAddress = XPAR_IMAGE_FILTER_TOP_0_S_AXI_CONTROL_BUS_BASEADDR;
	xErodeFilter.IsReady = XIL_COMPONENT_IS_READY;
	init_erodefilter();

	xColorFilter.Control_bus_BaseAddress = XPAR_CONVERT_TO_GRAY_TOP_0_S_AXI_CONTROL_BUS_BASEADDR;
	xColorFilter.IsReady = XIL_COMPONENT_IS_READY;
	init_colorfilter();

	/********** Setup VDMAs **************/
/*	configureFilterVDMA(VDMA_ID_1, DMA_MEM_TO_DEV , VIDEO_BASEADDR);
	configureFilterVDMA(VDMA_ID_1, DMA_DEV_TO_MEM, 0x5000000);
	readConfigurationVDMA(VDMA_ID_1);
*/
#ifdef VDMA2
	configureFilterVDMA(VDMA_ID_2, DMA_MEM_TO_DEV , SOBPROC_VIDEO_BASEADDR);
	configureFilterVDMA(VDMA_ID_2, DMA_DEV_TO_MEM, 0x25000000);
	readConfigurationVDMA(VDMA_ID_2);
#endif
#ifdef VDMA3
	configureFilterVDMA(VDMA_ID_3, DMA_MEM_TO_DEV , VIDEO_BASEADDR);
	configureFilterVDMA(VDMA_ID_3, DMA_DEV_TO_MEM, 	HWPROC_VIDEO_BASEADDR);
	readConfigurationVDMA(VDMA_ID_3);
#endif
#ifdef VDMA4
	configureFilterVDMA(VDMA_ID_4, DMA_MEM_TO_DEV , VIDEO_BASEADDR);
	configureFilterVDMA(VDMA_ID_4, DMA_DEV_TO_MEM, 	SOBPROC_VIDEO_BASEADDR  );
	readConfigurationVDMA(VDMA_ID_4);
#endif

	readDDR(SOBPROC_VIDEO_BASEADDR + 100*640*4);
	readDDR(SWPROC_VIDEO_BASEADDR + 100*640*4);

	/*	***********	**************	*/


	while(APP_ChangeResolution())
	{
		if (ATV_GetElapsedMs (StartCount, NULL) >= HDMI_CALL_INTERVAL_MS)
		{
			StartCount = HAL_GetCurrentMsCount();
			if (APP_DriverEnabled())
			{
				ADIAPI_TransmitterMain();
			}
		}
		//APP_ChangeResolution();
//		init_perfcounters (1, 0);
//		t = get_cyclecount() - t;
		EdgeDetection(VIDEO_BASEADDR,SWPROC_VIDEO_BASEADDR, 640, 480, detailedTiming[currentResolution][H_ACTIVE_TIME]);
		//Erode(VIDEO_BASEADDR,SWPROC_VIDEO_BASEADDR, 640, 480, detailedTiming[currentResolution][H_ACTIVE_TIME]);
		//ConvToGray(VIDEO_BASEADDR,SWPROC_VIDEO_BASEADDR, detailedTiming[currentResolution][H_ACTIVE_TIME], detailedTiming[currentResolution][V_ACTIVE_TIME]);
//		readDDR(VIDEO_BASEADDR + 140*640*4);
//		readDDR(HWPROC_VIDEO_BASEADDR + 140*640*4);

//		t = get_cyclecount() - t;
//		printf ("function took %d cycles \n", t);

	}

	Xil_DCacheDisable();
	Xil_ICacheDisable();

	return(0);
}
