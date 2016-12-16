/*
 * hw_config.c
 *
 *  Created on: Feb 14, 2014
 *      Author: ga73koz
 */
#include "hw_config.h"
#include "xbasic_types.h"
#include "xgray_scale.h"
#include "ximage_filter.h"
#include "xsobel_filter.h"

#include "cf_hdmi.h"

extern unsigned char currentResolution;
extern XGray_scale 	  xGrayScaleFilter;
extern XImage_filter xErodeFilter;
extern XSobel_filter xSobelFilter;


void config_filterVDMA(int VDMA_baseAddr, int vdma_direction, unsigned long base_address)
{

	if(vdma_direction == DMA_DEV_TO_MEM)		// from device to memory
	{// rx : S2MM
		/* FOR HDMI RELEVANT SETTINGS of VDMA*/
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_CTRL), 0x00011003); // enable circular mode
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_START1), base_address); // start address
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_START2), base_address); // start address
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_START3), base_address); // start address
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_FRMDLY_STRIDE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h offset
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_HSIZE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h size
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_VSIZE),
				detailedTiming[currentResolution][V_ACTIVE_TIME]); // v size

	}
	else if (vdma_direction ==DMA_MEM_TO_DEV)		// from memory to device
	{//tx : MM2S
		/* FOR HDMI RELEVANT SETTINGS of VDMA */
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_CTRL), 0x00011003); // enable circular mode, genlock synEn
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_START1), base_address); // start address
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_START2), base_address); // start address
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_START3), base_address); // start address
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_FRMDLY_STRIDE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h offset
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_HSIZE),
				  (detailedTiming[currentResolution][H_ACTIVE_TIME]*4)); // h size
		Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_VSIZE),
				detailedTiming[currentResolution][V_ACTIVE_TIME]); // v size
	}

}


/*void config_grayScaleFilter()
{

	XGray_scale_InterruptGlobalDisable(&xGrayScaleFilter);
	XGray_scale_InterruptDisable(&xGrayScaleFilter, 1);
	XGray_scale_DisableAutoRestart(&xGrayScaleFilter);

	XGray_scale_SetRows(&xGrayScaleFilter, detailedTiming[currentResolution][V_ACTIVE_TIME]);
	XGray_scale_SetCols(&xGrayScaleFilter, detailedTiming[cmake: *** [src/hw_config.o] Error 1
	urrentResolution][H_ACTIVE_TIME]);

//	XGray_scale_InterruptGlobalEnable(&xGrayScaleFilter);
//	XGray_scale_InterruptEnable(&xGrayScaleFilter, 1);
	XGray_scale_EnableAutoRestart(&xGrayScaleFilter);
	XGray_scale_Start(&xGrayScaleFilter);
}
*/
void config_grayScaleFilter(){
	XGray_scale_InterruptGlobalDisable(&xGrayScaleFilter);
	XGray_scale_InterruptDisable(&xGrayScaleFilter, 1);
	XGray_scale_DisableAutoRestart(&xGrayScaleFilter);
	XGray_scale_SetRows(&xGrayScaleFilter, detailedTiming[currentResolution][V_ACTIVE_TIME]);
	XGray_scale_SetCols(&xGrayScaleFilter, detailedTiming[currentResolution][H_ACTIVE_TIME]);
//	XGray_scale_InterruptGlobalEnable(&xGrayScaleFilter);
//	XGray_scale_InterruptEnable(&xGrayScaleFilter, 1);
	XGray_scale_EnableAutoRestart(&xGrayScaleFilter);
	XGray_scale_Start(&xGrayScaleFilter);
}

void config_erodefilter(){
	XImage_filter_SetRows(&xErodeFilter, detailedTiming[currentResolution][V_ACTIVE_TIME]);
	XImage_filter_SetCols(&xErodeFilter, detailedTiming[currentResolution][H_ACTIVE_TIME]);
	//	XImage_filter_InterruptGlobalEnable(&xfilter);
	//	XImage_filter_InterruptEnable(&xfilter, 3);
	XImage_filter_EnableAutoRestart(&xErodeFilter);
	XImage_filter_Start(&xErodeFilter);
}

void config_sobelfilter(){
	XSobel_filter_SetRows(&xSobelFilter, detailedTiming[currentResolution][V_ACTIVE_TIME]);
	XSobel_filter_SetCols(&xSobelFilter, detailedTiming[currentResolution][H_ACTIVE_TIME]);
	//	XImage_filter_InterruptGlobalEnable(&xfilter);
	//	XImage_filter_InterruptEnable(&xfilter, 3);
	XSobel_filter_EnableAutoRestart(&xSobelFilter);
	XSobel_filter_Start(&xSobelFilter);
}
void resetVDMA(int VDMA_baseAddr){
	//RX: reset S2MM
	Xil_Out32((VDMA_baseAddr + AXI_FILTER_RX_CTRL), 0x00000004);
	//TX: reset MM2S
	Xil_Out32((VDMA_baseAddr + AXI_FILTER_TX_CTRL), 0x00000004);
}
