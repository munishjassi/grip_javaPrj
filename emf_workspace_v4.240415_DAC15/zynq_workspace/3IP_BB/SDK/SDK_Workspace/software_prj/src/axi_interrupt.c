/*****************************************************************************
 * Filename:          C:\Cases\subcases\nan\929077\sp605_axi_interrupt/drivers/axi_interrupt_v1_00_a/src/axi_interrupt.c
 * Version:           1.00.a
 * Description:       axi_interrupt Driver Source File
 * Date:              Wed Jul 25 16:45:59 2012 (by Create and Import Peripheral Wizard)
 *****************************************************************************/

/***************************** Include Files *******************************/

#include "axi_interrupt.h"
#include "cf_hdmi.h"

#include "profile_cnt.h"


#include "hw_config.h"
#include "xbasic_types.h"
#include "xgray_scale.h"
#include "ximage_filter.h"
#include "xsobel_filter.h"


extern short int FRAME_INTR;
extern short int GRAY_INTR;
extern short int ERODE_INTR;
extern short int SOBEL_INTR;

/************************** Function Definitions ***************************/

/**
 *
 * Enable all possible interrupts from TEST_AXI device.
 *
 * @param   baseaddr_p is the base address of the TEST_AXI device.
 *
 * @return  None.
 *
 * @note    None.
 *
 */
void AXI_INTERRUPT_EnableInterrupt(void * baseaddr_p) {
	Xuint32 baseaddr;
	baseaddr = (Xuint32) baseaddr_p;

	/*
	 * Enable all interrupt source from user logic.
	 */
	AXI_INTERRUPT_mWriteReg(baseaddr, AXI_INTERRUPT_INTR_IPIER_OFFSET,
			0x00000003);

	/*
	 * Set global interrupt enable.
	 */
	AXI_INTERRUPT_mWriteReg(baseaddr, AXI_INTERRUPT_INTR_DGIER_OFFSET,
			INTR_GIE_MASK);
}

/**
 *
 * Example interrupt controller handler for TEST_AXI device.
 * This is to show example of how to toggle write back ISR to clear interrupts.
 *
 * @param   baseaddr_p is the base address of the TEST_AXI device.
 *
 * @return  None.
 *
 * @note    None.
 *
 */
unsigned int t = 0;
static int cnt = 0;

void AXI_INTERRUPT_VsyncIntr_Handler(void * baseaddr_p) {
//	PerfResult(XPAR_AXI_PERF_MON_0_BASEADDR);
//	AXI_monitor_reset(XPAR_AXI_PERF_MON_0_BASEADDR);
	cnt++;
	if (cnt > 2) {
		cnt = 0;
		DDRVideoWr(640, 480, detailedTiming[currentResolution][H_ACTIVE_TIME],
				detailedTiming[currentResolution][V_ACTIVE_TIME]);
		FRAME_INTR = 1;
	}
}

void AXI_INTERRUPT_HrefIntr_Handler(void * baseaddr_p) {
	static int cnt = 0;
	cnt++;
	imageRow++;

}

void AXI_INTERRUPT__VDMA3_S2MMIntr_Handler(void * baseaddr_p)
{
//	resetVDMA(XPAR_AXI_VDMA_3_BASEADDR);
	Xil_Out32((XPAR_AXI_VDMA_3_BASEADDR + AXI_FILTER_RX_CTRL), 0x00000004); // Mun
	//Xil_Out32((XPAR_AXI_VDMA_3_BASEADDR + AXI_FILTER_TX_CTRL), 0x00000004); // Mun

//	printf("GRAY VDMA3_S2MM: %d clk\n\r", get_cyclecount());
//	PerfResult(XPAR_AXI_PERF_MON_0_BASEADDR);
	GRAY_INTR = 1;
}

void AXI_INTERRUPT__VDMA4_S2MMIntr_Handler(void * baseaddr_p)
{
//	resetVDMA(XPAR_AXI_VDMA_4_BASEADDR);
	Xil_Out32((XPAR_AXI_VDMA_4_BASEADDR + AXI_FILTER_RX_CTRL), 0x00000004); // Mun
	//Xil_Out32((XPAR_AXI_VDMA_4_BASEADDR + AXI_FILTER_TX_CTRL), 0x00000004); // Mun

//	printf("SOBEL VDMA4_S2MM: %d clk\n\r", get_cyclecount());
//	PerfResult(XPAR_AXI_PERF_MON_0_BASEADDR);
	SOBEL_INTR = 1;
}

void AXI_INTERRUPT__VDMA2_S2MMIntr_Handler(void * baseaddr_p)
{
//	resetVDMA(XPAR_AXI_VDMA_2_BASEADDR);
	Xil_Out32((XPAR_AXI_VDMA_2_BASEADDR + AXI_FILTER_RX_CTRL), 0x00000004); // Mun
	//Xil_Out32((XPAR_AXI_VDMA_2_BASEADDR + AXI_FILTER_TX_CTRL), 0x00000004); // Mun

//	printf("ERODE VDMA2_S2MM: %d clk\n\r", get_cyclecount());
//	PerfResult(XPAR_AXI_PERF_MON_0_BASEADDR);
	ERODE_INTR = 1;
}
//	SOBEL_INTR = 1;
//	PerfResult(XPAR_AXI_PERF_MON_0_BASEADDR);
//}
