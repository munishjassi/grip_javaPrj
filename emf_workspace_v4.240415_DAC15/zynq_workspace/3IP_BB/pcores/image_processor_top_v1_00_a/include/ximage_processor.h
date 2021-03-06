// ==============================================================
// File generated by Vivado(TM) HLS - High-Level Synthesis from C, C++ and SystemC
// Version: 2013.1
// Copyright (C) 2013 Xilinx Inc. All rights reserved.
// 
// ==============================================================

#ifndef XIMAGE_PROCESSOR_H
#define XIMAGE_PROCESSOR_H

#ifdef __cplusplus
extern "C" {
#endif

/***************************** Include Files *********************************/
#include "xil_types.h"
#include "xil_assert.h"
#include "xstatus.h"
#include "xil_io.h"
#include "ximage_processor_CONTROL_BUS.h"

/**************************** Type Definitions ******************************/
typedef struct {
    u16 DeviceId; // currently not used
    u32 Control_bus_BaseAddress;
} XImage_processor_Config;

typedef struct {
    u32 Control_bus_BaseAddress;
    u32 IsReady;
} XImage_processor;

/***************** Macros (Inline Functions) Definitions *********************/
#define XImage_processor_WriteReg(BaseAddress, RegOffset, Data) \
    Xil_Out32((BaseAddress) + (RegOffset), (u32)(Data))

#define XImage_processor_ReadReg(BaseAddress, RegOffset) \
    Xil_In32((BaseAddress) + (RegOffset))

/************************** Function Prototypes *****************************/
int XImage_processor_Initialize(XImage_processor *InstancePtr, XImage_processor_Config *ConfigPtr);

void XImage_processor_Start(XImage_processor *InstancePtr);
u32 XImage_processor_IsDone(XImage_processor *InstancePtr);
u32 XImage_processor_IsIdle(XImage_processor *InstancePtr);
u32 XImage_processor_IsReady(XImage_processor *InstancePtr);
void XImage_processor_EnableAutoRestart(XImage_processor *InstancePtr);
void XImage_processor_DisableAutoRestart(XImage_processor *InstancePtr);

void XImage_processor_SetRows(XImage_processor *InstancePtr, u32 Data);
u32 XImage_processor_GetRows(XImage_processor *InstancePtr);
void XImage_processor_SetCols(XImage_processor *InstancePtr, u32 Data);
u32 XImage_processor_GetCols(XImage_processor *InstancePtr);

void XImage_processor_InterruptGlobalEnable(XImage_processor *InstancePtr);
void XImage_processor_InterruptGlobalDisable(XImage_processor *InstancePtr);
void XImage_processor_InterruptEnable(XImage_processor *InstancePtr, u32 Mask);
void XImage_processor_InterruptDisable(XImage_processor *InstancePtr, u32 Mask);
void XImage_processor_InterruptClear(XImage_processor *InstancePtr, u32 Mask);
u32 XImage_processor_InterruptGetEnabled(XImage_processor *InstancePtr);
u32 XImage_processor_InterruptGetStatus(XImage_processor *InstancePtr);

#ifdef __cplusplus
}
#endif

#endif
