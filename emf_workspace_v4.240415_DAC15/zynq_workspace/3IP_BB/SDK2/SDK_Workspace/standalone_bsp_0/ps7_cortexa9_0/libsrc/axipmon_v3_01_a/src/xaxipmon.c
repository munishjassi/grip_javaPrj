/******************************************************************************
*
* (c) Copyright 2012 Xilinx, Inc. All rights reserved.
*
* This file contains confidential and proprietary information of Xilinx, Inc.
* and is protected under U.S. and international copyright and other
* intellectual property laws.
*
* DISCLAIMER
* This disclaimer is not a license and does not grant any rights to the
* materials distributed herewith. Except as otherwise provided in a valid
* license issued to you by Xilinx, and to the maximum extent permitted by
* applicable law: (1) THESE MATERIALS ARE MADE AVAILABLE "AS IS" AND WITH ALL
* FAULTS, AND XILINX HEREBY DISCLAIMS ALL WARRANTIES AND CONDITIONS, EXPRESS,
* IMPLIED, OR STATUTORY, INCLUDING BUT NOT LIMITED TO WARRANTIES OF
* MERCHANTABILITY, NON-INFRINGEMENT, OR FITNESS FOR ANY PARTICULAR PURPOSE;
* and (2) Xilinx shall not be liable (whether in contract or tort, including
* negligence, or under any other theory of liability) for any loss or damage
* of any kind or nature related to, arising under or in connection with these
* materials, including for any direct, or any indirect, special, incidental,
* or consequential loss or damage (including loss of data, profits, goodwill,
* or any type of loss or damage suffered as a result of any action brought by
* a third party) even if such damage or loss was reasonably foreseeable or
* Xilinx had been advised of the possibility of the same.
*
* CRITICAL APPLICATIONS
* Xilinx products are not designed or intended to be fail-safe, or for use in
* any application requiring fail-safe performance, such as life-support or
* safety devices or systems, Class III medical devices, nuclear facilities,
* applications related to the deployment of airbags, or any other applications
* that could lead to death, personal injury, or severe property or
* environmental damage (individually and collectively, "Critical
* Applications"). Customer assumes the sole risk and liability of any use of
* Xilinx products in Critical Applications, subject only to applicable laws
* and regulations governing limitations on product liability.
*
* THIS COPYRIGHT NOTICE AND DISCLAIMER MUST BE RETAINED AS PART OF THIS FILE
* AT ALL TIMES.
*
******************************************************************************/
/****************************************************************************/
/**
*
* @file xaxipmon.c
*
* This file contains the driver API functions that can be used to access
* the AXI Performance Monitor device.
*
* Refer to the xaxipmon.h header file for more information about this driver.
*
* @note 	None.
*
* <pre>
*
* MODIFICATION HISTORY:
*
* Ver   Who    Date     Changes
* ----- -----  -------- -----------------------------------------------------
* 1.00a bss   02/27/12  First release
* 2.00a bss   06/23/12  Updated to support v2_00a version of IP.
* 3.00a bss   09/03/12  Deleted XAxiPmon_SetAgent, XAxiPmon_GetAgent APIs and
*			modified XAxiPmon_SetMetrics, XAxiPmon_GetMetrics APIs
*			to support v2_01a version of IP.
* 3.01a bss   10/25/12  Added XAxiPmon_StartCounters and XAxiPmon_StopCounters
*			APIs (CR #683799).
*			Added XAxiPmon_StartEventLog and XAxiPmon_StopEventLog
*			APIs (CR #683801).
*			Added XAxiPmon_GetMetricName API (CR #683803).
*			Modified XAxiPmon_SetMetrics and XAxiPmon_GetMetrics
*			(CR #683746)
*			Added XAxiPmon_EnableEventLog,
*			XAxiPmon_DisableMetricsCounter,
*			XAxiPmon_EnableMetricsCounter APIs to replace macros.
*			Added XAxiPmon_SetMetricCounterCutOff,
*			XAxiPmon_GetMetricCounterCutOff,
*			XAxiPmon_EnableExternalTrigger and
*			XAxiPmon_DisableExternalTrigger APIs to support new
*			version of IP.
*
* </pre>
*
*****************************************************************************/

/***************************** Include Files ********************************/

#include "xaxipmon.h"

/************************** Constant Definitions *****************************/

/**************************** Type Definitions *******************************/

/***************** Macros (Inline Functions) Definitions *********************/

/************************** Function Prototypes ******************************/

/************************** Variable Definitions *****************************/

/*****************************************************************************/
/**
*
* This function initializes a specific XAxiPmon device/instance. This function
* must be called prior to using the AXI Performance Monitor device.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	ConfigPtr points to the XAxiPmon device configuration structure.
* @param	EffectiveAddr is the device base address in the virtual memory
*		address space. If the address translation is not used then the
*		physical address is passed.
*		Unexpected errors may occur if the address mapping is changed
*		after this function is invoked.
*
* @return
*		- XST_SUCCESS if successful.
*
* @note		The user needs to first call the XAxiPmon_LookupConfig() API
*		which returns the Configuration structure pointer which is
*		passed as a parameter to the XAxiPmon_CfgInitialize() API.
*
******************************************************************************/
int XAxiPmon_CfgInitialize(XAxiPmon *InstancePtr, XAxiPmon_Config *ConfigPtr,
			  u32 EffectiveAddr)
{
	/*
	 * Assert the input arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(ConfigPtr != NULL);

	/*
	 * Set the values read from the device config and the base address.
	 */
	InstancePtr->Config.DeviceId = ConfigPtr->DeviceId;
	InstancePtr->Config.BaseAddress = EffectiveAddr;
	InstancePtr->Config.GlobalClkCounterWidth =
				ConfigPtr->GlobalClkCounterWidth;
	InstancePtr->Config.MetricSampleCounterWidth =
				ConfigPtr->MetricSampleCounterWidth;
	InstancePtr->Config.IsEventCount =
				ConfigPtr->IsEventCount;
	InstancePtr->Config.NumberofSlots =
				ConfigPtr->NumberofSlots;
	InstancePtr->Config.NumberofCounters =
				ConfigPtr->NumberofCounters;
	InstancePtr->Config.HaveSampledCounters =
				ConfigPtr->HaveSampledCounters;
	InstancePtr->Config.IsEventLog =
				ConfigPtr->IsEventLog;
	InstancePtr->Config.FifoDepth =
				ConfigPtr->FifoDepth;
	InstancePtr->Config.FifoWidth =
				ConfigPtr->FifoWidth;
	InstancePtr->Config.TidWidth =
				ConfigPtr->TidWidth;

	/*
	 * Indicate the instance is now ready to use, initialized without error.
	 */
	InstancePtr->IsReady = XIL_COMPONENT_IS_READY;

	/*
	 * Reset the Counters and FIFO.
	 */
	XAxiPmon_ResetMetricCounter(InstancePtr);
	XAxiPmon_ResetGlobalClkCounter(InstancePtr);
	XAxiPmon_ResetFifo(InstancePtr);

	return XST_SUCCESS;
}

/*****************************************************************************/
/**
*
* This function resets all Metric Counters of AXI Performance Monitor
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	XST_SUCCESS
*
*
* @note		None.
*
******************************************************************************/
int XAxiPmon_ResetMetricCounter(XAxiPmon *InstancePtr)
{

	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

	/*
	 * Write the reset value to the Control register to reset
	 * Metric counters
	 */
	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							 XAPM_CTL_OFFSET);
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
					(RegValue | XAPM_CR_MCNTR_RESET_MASK));
	/*
	 * Release from Reset
	 */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
				(RegValue & ~(XAPM_CR_MCNTR_RESET_MASK)));
	return XST_SUCCESS;

}

/*****************************************************************************/
/**
*
* This function resets Global Clock Counter of AXI Performance Monitor
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None.
*
* @note		None.
*
******************************************************************************/
void XAxiPmon_ResetGlobalClkCounter(XAxiPmon *InstancePtr)
{

	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);

	/*
	 * Write the reset value to the Control register to reset
	 * Global Clock Counter
	 */
	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							 XAPM_CTL_OFFSET);
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
					(RegValue | XAPM_CR_GCC_RESET_MASK));

	/*
	 * Release from Reset
	 */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
				(RegValue & ~(XAPM_CR_GCC_RESET_MASK)));

}

/*****************************************************************************/
/**
*
* This function resets Streaming FIFO of AXI Performance Monitor
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	XST_SUCCESS
*
* @note		None.
*
******************************************************************************/
int XAxiPmon_ResetFifo(XAxiPmon *InstancePtr)
{

	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);

	/* Check Event Logging is enabled in Hardware */
	if(InstancePtr->Config.IsEventLog == 0)
	{
		/*Event Counters are not enabled in Hardware*/
		return XST_SUCCESS;
	}
	/*
	 * Write the reset value to the Control register to reset
	 * FIFO
	 */
	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							 XAPM_CTL_OFFSET);
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
					(RegValue | XAPM_CR_FIFO_RESET_MASK));
	/*
	 * Release from Reset
	 */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
				(RegValue & ~(XAPM_CR_FIFO_RESET_MASK)));

	return XST_SUCCESS;

}

/****************************************************************************/
/**
*
* This function sets Ranges for Incrementers depending on parameters passed.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	IncrementerNum specifies the Incrementer for which Ranges
*		need to be set
* @param 	RangeUpper specifies the Upper limit in 32 bit Register
* @param 	RangeLower specifies the Lower limit in 32 bit Register
*
* @return	None.
*
* @note		None
*
*****************************************************************************/
void XAxiPmon_SetIncrementerRange(XAxiPmon *InstancePtr, u8 IncrementerNum,
					u16 RangeUpper,	u16 RangeLower)
 {

 	u32 RegValue;

 	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(IncrementerNum <= (InstancePtr->
						Config.NumberofCounters - 1));

	/*
	 * Write to the specified Range register
	 */
 	RegValue = RangeUpper << 16;
 	RegValue |= RangeLower;
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress,
			(XAPM_RANGE0_OFFSET + (IncrementerNum * 16)),
			RegValue);
 }

/****************************************************************************/
/**
*
* This function returns the Ranges of Incrementers Registers.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	IncrementerNum specifies the Incrementer for which Ranges
*		need to be returned.
* @param 	RangeUpper specifies the user reference variable which returns
*		the Upper Range Value of the specified Incrementer.
* @param 	RangeLower specifies the user reference variable which returns
*		the Lower Range Value of the specified Incrementer.
*
* @return	None.
*
* @note		None
*
*****************************************************************************/
void XAxiPmon_GetIncrementerRange(XAxiPmon *InstancePtr, u8 IncrementerNum,
				u16 *RangeUpper, u16 *RangeLower)
 {

 	u32 RegValue;
 	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(IncrementerNum <= (InstancePtr->
						Config.NumberofCounters - 1));

 	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
 				(XAPM_RANGE0_OFFSET + (IncrementerNum * 16)));

 	*RangeLower = RegValue & 0xFFFF;
 	*RangeUpper = (RegValue >> 16) & 0xFFFF;
 }

/****************************************************************************/
/**
*
* This function sets the Sample Interval Register
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	SampleIntervalHigh is the Sample Interval Register higher
*		32 bits.
* @param	SampleIntervalLow is the Sample Interval Register lower
*		32 bits.
*
* @return	None
*
* @note		None.
*
*****************************************************************************/
void XAxiPmon_SetSampleInterval(XAxiPmon *InstancePtr, u32 SampleIntervalHigh,
				u32 SampleIntervalLow)
{

	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);

	if(InstancePtr->Config.MetricSampleCounterWidth == 64) {
		/*
		 * Set Sample Interval Upper
		 */
		XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress,
			XAPM_SI_HIGH_OFFSET, SampleIntervalHigh);
	}

	/*
	 * Set Sample Interval Lower
	 */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress,
		XAPM_SI_LOW_OFFSET, SampleIntervalLow);

}

/****************************************************************************/
/**
*
* This function returns the contents of Sample Interval Register
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	SampleIntervalHigh is a pointer where the upper 32 bits value
*		of Sample Interval Counter is returned.
* @param	SampleIntervalLow is a pointer where the lower 32 bits value
*		of Sample Interval Counter is returned.
*
* @return 	None.
*
* @note		None.
*
******************************************************************************/
void XAxiPmon_GetSampleInterval(XAxiPmon *InstancePtr, u32 *SampleIntervalHigh,
							u32 *SampleIntervalLow)
{
	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);

	if(InstancePtr->Config.MetricSampleCounterWidth == 64) {
		/*
		 * Get Sample Interval Upper
		 */
		*SampleIntervalHigh =
			XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
			XAPM_SI_HIGH_OFFSET);
	}

	/*
	 * Set Sample Interval Lower
	 */
	*SampleIntervalLow =
		XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
		XAPM_SI_LOW_OFFSET);

}

/****************************************************************************/
/**
*
* This function sets Metrics for specified Counter in the corresponding
* Metric Selector Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	Slot is the slot ID for which specified counter has to
*		be connected.
* @param	Metrics is one of the Metric Sets. User has to use
*		XAPM_METRIC_SET_* macros in xaxipmon.h for this parameter
* @param	CounterNum is the Counter Number.
*		The valid values are 0 to 9.
*
* @return	XST_SUCCESS if Success
*		XST_FAILURE if Failure
*
* @note		None.
*
*****************************************************************************/
int XAxiPmon_SetMetrics(XAxiPmon *InstancePtr, u8 Slot, u8 Metrics,
						u8 CounterNum)
{
	u32 RegValue;
	u32 Mask;
	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(Slot < XAPM_MAX_AGENTS);
	Xil_AssertNonvoid((Metrics <= XAPM_METRIC_SET_11) ||
			((Metrics >= XAPM_METRIC_SET_16) &&
			(Metrics <= XAPM_METRIC_SET_22)) ||
			(Metrics == XAPM_METRIC_SET_30));
	Xil_AssertNonvoid(CounterNum <= (InstancePtr->
						Config.NumberofCounters - 1));
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

	/* Find Mask value to force zero in counternum byte range */
	if (CounterNum == 0 || CounterNum == 4 || CounterNum == 8) {
	  	Mask = 0xFFFFFF00;
	}
	else if (CounterNum == 1 || CounterNum == 5 || CounterNum == 9) {
	  	Mask = 0xFFFF00FF;
	}
	else if (CounterNum == 2 || CounterNum == 6) {
	  	Mask = 0xFF00FFFF;
	}
	else {
	  	Mask = 0x00FFFFFF;
	}

	if(CounterNum <= 3) {
		RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
					    XAPM_MSR0_OFFSET);

		RegValue = RegValue & Mask;
		RegValue = RegValue | (Metrics << (CounterNum * 8));
		RegValue = RegValue | (Slot << (CounterNum * 8 + 5));
		XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress,
					XAPM_MSR0_OFFSET,RegValue);
	}
	else if((CounterNum >= 4) && (CounterNum <= 7)) {
		CounterNum = CounterNum - 4;
		RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
					    XAPM_MSR1_OFFSET);

		RegValue = RegValue & Mask;
		RegValue = RegValue | (Metrics << (CounterNum * 8));
		RegValue = RegValue | (Slot << (CounterNum * 8 + 5));
		XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress,
					XAPM_MSR1_OFFSET,RegValue);
	}
	else {
		CounterNum = CounterNum - 8;
		RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
					    XAPM_MSR2_OFFSET);

		RegValue = RegValue & Mask;
		RegValue = RegValue | (Metrics << (CounterNum * 8));
		RegValue = RegValue | (Slot << (CounterNum * 8 + 5));
		XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress,
					XAPM_MSR2_OFFSET,RegValue);
	}
	return XST_SUCCESS;
}

/*****************************************************************************/
/**
*
* This function returns Metrics in the specified Counter from the corresponding
* Metric Selector Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	CounterNum is the Counter Number.
*		The valid values are 0 to 9.
* @param	Metrics is a reference parameter from application where metrics
*		of specified counter is filled.
* @praram	Slot is a reference parameter in which slot Id of
*		specified counter is filled
* @return	XST_SUCCESS if Success
*		XST_FAILURE if Failure
*
* @note		None.
*
*****************************************************************************/
int XAxiPmon_GetMetrics(XAxiPmon *InstancePtr, u8 CounterNum, u8 *Metrics,
								u8 *Slot)
{
	u32 RegValue;
	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(CounterNum <= (InstancePtr->
						Config.NumberofCounters - 1));
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

	if(CounterNum <= 3) {
		RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
					XAPM_MSR0_OFFSET);
		*Metrics = (RegValue >> (CounterNum * 8)) & 0x1F;
		*Slot 	= (RegValue >> (CounterNum * 8 + 5)) & 0x7;

	}
	else if((CounterNum >= 4) && (CounterNum <= 7)) {
		CounterNum = CounterNum - 4;
		RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
					XAPM_MSR1_OFFSET);
		*Metrics = (RegValue >> (CounterNum * 8)) & 0x1F;
		*Slot 	= (RegValue >> (CounterNum * 8 + 5)) & 0x7;
	}
	else {
		CounterNum = CounterNum - 8;
		RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
					XAPM_MSR2_OFFSET);
		*Metrics = (RegValue >> (CounterNum * 8)) & 0x1F;
		*Slot 	= (RegValue >> (CounterNum * 8 + 5)) & 0x7;
	}
	return XST_SUCCESS;
}

/****************************************************************************/
/**
*
* This function returns the contents of the Global Clock Counter Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	CntHighValue is the user space pointer with which upper 32 bits
*		of Global Clock Counter has to be filled
* @param	CntLowValue is the user space pointer with which lower 32 bits
*		of Global Clock Counter has to be filled
*
* @return	None.
*
* @note		None.
*
*****************************************************************************/
void XAxiPmon_GetGlobalClkCounter(XAxiPmon *InstancePtr,u32 *CntHighValue,
							u32 *CntLowValue)
{
	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);

	*CntHighValue = 0x0;
	*CntLowValue  = 0x0;

	/*
	 * If Counter width is 64 bit then Counter Value has to be
	 * filled at CntHighValue address also.
	 */
	if(InstancePtr->Config.GlobalClkCounterWidth == 64) {

		/* Bits[63:32] exists at XAPM_GCC_HIGH_OFFSET */
		*CntHighValue = XAxiPmon_ReadReg(InstancePtr->
				Config.BaseAddress, XAPM_GCC_HIGH_OFFSET);
	}
		/* Bits[31:0] exists at XAPM_GCC_LOW_OFFSET */
		*CntLowValue = XAxiPmon_ReadReg(InstancePtr->
				Config.BaseAddress, XAPM_GCC_LOW_OFFSET);
}

/****************************************************************************/
/**
*
* This function returns the contents of the Metric Counter Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	CounterNum is the number of the Metric Counter to be read.
*		Use the XAPM_METRIC_COUNTER* defines for the counter number in
*		xaxipmon.h. The valid values are 0 (XAPM_METRIC_COUNTER_0) to
*		9 (XAPM_METRIC_COUNTER_9).
* @return	RegValue is the content of specified Metric Counter.
*
* @note		None.
*
*****************************************************************************/
u32 XAxiPmon_GetMetricCounter(XAxiPmon *InstancePtr, u32 CounterNum)
{

	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(CounterNum <=
			(InstancePtr->Config.NumberofCounters - 1));
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
			(XAPM_MC0_OFFSET + (CounterNum * 16)));
	return RegValue;
}

/****************************************************************************/
/**
*
* This function returns the contents of the Sampled Metric Counter Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	CounterNum is the number of the Sampled Metric Counter to read.
*		Use the XAPM_METRIC_COUNTER* defines for the counter number in
*		xaxipmon.h. The valid values are 0 (XAPM_METRIC_COUNTER_0) to
*		9 (XAPM_METRIC_COUNTER_9).
*
* @return	RegValue is the content of specified Sampled Metric Counter.
*
* @note		None.
*
*****************************************************************************/
u32 XAxiPmon_GetSampledMetricCounter(XAxiPmon *InstancePtr, u32 CounterNum)
{
	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(CounterNum <= (InstancePtr->Config.NumberofCounters - 1));
	Xil_AssertNonvoid(InstancePtr->Config.HaveSampledCounters == 1);

	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
				(XAPM_SMC0_OFFSET + (CounterNum * 16)));
	return RegValue;
}

/****************************************************************************/
/**
*
* This function returns the contents of the Incrementer Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	IncrementerNum is the number of the Incrementer register to
*		read.Use the XAPM_INCREMENTER_* defines for the Incrementer
*		number.The valid values are 0 (XAPM_INCREMENTER_0) to
*		9 (XAPM_INCREMENTER_9).
* @param	IncrementerNum is the number of the specified Incrementer
*		register
* @return	RegValue is content of specified Metric Incrementer register.
*
* @note		None.
*
*****************************************************************************/
u32 XAxiPmon_GetIncrementer(XAxiPmon *InstancePtr, u32 IncrementerNum)
{
	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(IncrementerNum < XAPM_MAX_COUNTERS);
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
			(XAPM_INC0_OFFSET + (IncrementerNum * 16)));

	return RegValue;
}

/****************************************************************************/
/**
*
* This function returns the contents of the Sampled Incrementer Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	IncrementerNum is the number of the Sampled Incrementer
*		register to read.Use the XAPM_INCREMENTER_* defines for the
*		Incrementer number.The valid values are 0 (XAPM_INCREMENTER_0)
*		to 9 (XAPM_INCREMENTER_9).
* @param	IncrementerNum is the number of the specified Sampled
*		Incrementer register
* @return	RegValue is content of specified Sampled Incrementer register.
*
* @note		None.
*
*****************************************************************************/
u32 XAxiPmon_GetSampledIncrementer(XAxiPmon *InstancePtr, u32 IncrementerNum)
{
	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(IncrementerNum < XAPM_MAX_COUNTERS);
	Xil_AssertNonvoid(InstancePtr->Config.HaveSampledCounters == 1);

	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
				(XAPM_SINC0_OFFSET + (IncrementerNum * 16)));
	return RegValue;
}

/****************************************************************************/
/**
*
* This function sets Software-written Data Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	SwData is the Software written Data.
*
* @return	None.
*
* @note		None.
*
*****************************************************************************/
void XAxiPmon_SetSwDataReg(XAxiPmon *InstancePtr, u32 SwData)
{
	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);

	/*
	 * Set Software-written Data Register
	 */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_SWD_OFFSET,
								SwData);
}

/****************************************************************************/
/**
*
* This function returns contents of Software-written Data Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	SwData.
*
* @note		None.
*
*****************************************************************************/
u32 XAxiPmon_GetSwDataReg(XAxiPmon *InstancePtr)
{
	 u32 SwData;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);

	/*
	 * Set Metric Selector Register
	 */
	SwData = (u32)XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
						XAPM_SWD_OFFSET);
	return SwData;
}

/*****************************************************************************/
/**
*
* This function enables the following in the AXI Performance Monitor:
*   - Event logging
*
* @param        InstancePtr is a pointer to the XAxiPmon instance.
* @param        FlagEnables is a value to write to the flag enables
*               register defined by XAPM_FEC_OFFSET. It is recommended
*               to use the XAPM_FEC_*_MASK mask bits to generate.
*               A value of 0x0 will disable all events to the event
*               log streaming FIFO.
*
* @return       XST_SUCCESS
*
* @note         None
*
******************************************************************************/
int XAxiPmon_StartEventLog(XAxiPmon *InstancePtr, u32 FlagEnables)
{
	u32 RegValue;

  	/*
  	 * Assert the arguments.
  	 */
  	Xil_AssertNonvoid(InstancePtr != NULL);
  	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
  	Xil_AssertNonvoid(InstancePtr->Config.IsEventLog == 1);

  	/* Read current register value */
  	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
  							XAPM_CTL_OFFSET);
  	/* Now write to flag enables register */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_FEC_OFFSET,
	  	                  			FlagEnables);
	/* Write the new value to the Control register to
	 *	enable event logging */
  	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
  	                  RegValue | XAPM_CR_EVENTLOG_ENABLE_MASK);

  	return XST_SUCCESS;
}

/*****************************************************************************/
/**
*
* This function disables the following in the AXI Performance Monitor:
*   - Event logging
*
* @param        InstancePtr is a pointer to the XAxiPmon instance.
*
* @return       XST_SUCCESS
*
* @note         None
*
******************************************************************************/
int XAxiPmon_StopEventLog(XAxiPmon *InstancePtr)
{
	u32 RegValue;

  	/*
  	 * Assert the arguments.
  	 */
  	Xil_AssertNonvoid(InstancePtr != NULL);
  	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(InstancePtr->Config.IsEventLog == 1);

	/* Read current register value */
	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
						XAPM_CTL_OFFSET);

	/* Write the new value to the Control register to disable
	 * event logging */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
	                    RegValue & ~XAPM_CR_EVENTLOG_ENABLE_MASK);

	return XST_SUCCESS;
}

/*****************************************************************************/
/**
*
* This function enables the following in the AXI Performance Monitor:
*   - Global clock counter
*   - All metric counters
*   - All sampled metric counters
*
* @param    InstancePtr is a pointer to the XAxiPmon instance.
*           SampleIntervalHigh is the sample interval for the sampled metric
*           counters (higher 32 bits)
*           SampleIntervalLow is the sample interval for the sampled metric
*           counters (lower 32 bits)
* @return   XST_SUCCESS
*
* @note	    None
******************************************************************************/
int XAxiPmon_StartCounters(XAxiPmon *InstancePtr, u32 SampleIntervalHigh,
                           u32 SampleIntervalLow)
{
	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
 	Xil_AssertNonvoid(InstancePtr != NULL);
  	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

  	/* Read current register value */
  	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
  							XAPM_CTL_OFFSET);

  	/*
  	 * Write the new value to the Control register to enable
  	 * global clock counter and metric counters
  	 */
  	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
              RegValue | XAPM_CR_GCC_ENABLE_MASK | XAPM_CR_MCNTR_ENABLE_MASK);

  	/* Set, enable, and load sampled counters */
  	XAxiPmon_SetSampleInterval(InstancePtr, SampleIntervalHigh,
  						SampleIntervalLow);
  	XAxiPmon_LoadSampleIntervalCounter(InstancePtr);
  	XAxiPmon_EnableSampleIntervalCounter(InstancePtr);

  	return XST_SUCCESS;
}

/*****************************************************************************/
/**
*
* This function disables the following in the AXI Performance Monitor:
*   - Global clock counter
*   - All metric counters
*
* @param        InstancePtr is a pointer to the XAxiPmon instance.
*
* @return       XST_SUCCESS
*
* @note         None
*
******************************************************************************/
int XAxiPmon_StopCounters(XAxiPmon *InstancePtr)
{
	u32 RegValue;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

	/* Read current register value */
	RegValue = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							XAPM_CTL_OFFSET);

	/*
  	 * Write the new value to the Control register to disable
  	 * global clock counter and metric counters
  	 */
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
	RegValue & ~XAPM_CR_GCC_ENABLE_MASK & ~XAPM_CR_MCNTR_ENABLE_MASK);

	return XST_SUCCESS;
}

/*****************************************************************************/
/**
*
* This function enables Metric Counters.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		None
*
*******************************************************************************/
void XAxiPmon_EnableMetricsCounter(XAxiPmon *InstancePtr)
{
	u32 RegVal;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(InstancePtr->Config.IsEventCount == 1);

	RegVal = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
						XAPM_CTL_OFFSET);
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
					RegVal | XAPM_CR_MCNTR_ENABLE_MASK);
}
/****************************************************************************/
/**
*
* This function disables the Metric Counters.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		None
*
*****************************************************************************/
void XAxiPmon_DisableMetricsCounter(XAxiPmon *InstancePtr)
{
	u32 RegVal;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(InstancePtr->Config.IsEventCount == 1);

	RegVal = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							XAPM_CTL_OFFSET);

	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
					RegVal & ~(XAPM_CR_MCNTR_ENABLE_MASK));
}

/****************************************************************************/
/**
*
* This function sets the cutoff value for specified Metric Counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	CounterNum is the Metric Counter number for which
*		cutoff value to be assigned.Use the XAPM_METRIC_COUNTER*
*		defines for the counter number in xaxipmon.h.
*		The valid values are 0 (XAPM_METRIC_COUNTER_0) to
*		9 (XAPM_METRIC_COUNTER_9).
* @param	CutOff is the value to be assigned in Metric Counter Log
*		Enable register so that Event logging starts when Metric
*		Counter value is equal to or greater than it.
* @return	None
*
* @note		None.
*
*****************************************************************************/
void XAxiPmon_SetMetricCounterCutOff(XAxiPmon *InstancePtr, u32 CounterNum,
								u32 CutOff)
{
	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(CounterNum < XAPM_MAX_COUNTERS);
	Xil_AssertVoid(InstancePtr->Config.IsEventCount == 1);

	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress,
			(XAPM_MC0LOGEN_OFFSET + (CounterNum * 16)), CutOff);

}

/****************************************************************************/
/**
*
* This function returns the cutoff value for specified Metric Counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	CounterNum is the Metric Counter number for which
*		cutoff value to be returned.Use the XAPM_METRIC_COUNTER*
*		defines for the counter number in xaxipmon.h.
*		The valid values are 0 (XAPM_METRIC_COUNTER_0) to
*		9 (XAPM_METRIC_COUNTER_9).
*
* @return	CutOff is the value in specifed Metric Counter Log
*		Enable register.
*
* @note		None.
*
*****************************************************************************/
u32 XAxiPmon_GetMetricCounterCutOff(XAxiPmon *InstancePtr, u32 CounterNum)
{
	u32 CutOff;
	/*
	 * Assert the arguments.
	 */
	Xil_AssertNonvoid(InstancePtr != NULL);
	Xil_AssertNonvoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertNonvoid(CounterNum < XAPM_MAX_COUNTERS);
	Xil_AssertNonvoid(InstancePtr->Config.IsEventCount == 1);

	CutOff = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
			(XAPM_MC0LOGEN_OFFSET + (CounterNum * 16)));
	return CutOff;
}

/*****************************************************************************/
/**
*
* This function enables Event Logging.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		None
*
*******************************************************************************/
void XAxiPmon_EnableEventLog(XAxiPmon *InstancePtr)
{
	u32 RegVal;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(InstancePtr->Config.IsEventLog == 1);

	RegVal = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							XAPM_CTL_OFFSET);
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
				RegVal | XAPM_CR_EVENTLOG_ENABLE_MASK);
}

/*****************************************************************************/
/**
*
* This function enables External trigger pulse so that Metric Counters can be
* started on external trigger pulse for a Slot.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		None
*
*******************************************************************************/
void XAxiPmon_EnableExternalTrigger(XAxiPmon *InstancePtr)
{
	u32 RegVal;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(InstancePtr->Config.IsEventLog == 1);

	RegVal = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							XAPM_CTL_OFFSET);
	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
				RegVal | XAPM_CR_EXTERNAL_TRIGGER_MASK);
}

/****************************************************************************/
/**
*
* This function disables the External trigger pulse used to start Metric
* Counters on external trigger pulse for a Slot.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		None
*
*****************************************************************************/
void XAxiPmon_DisableExternalTrigger(XAxiPmon *InstancePtr)
{
	u32 RegVal;

	/*
	 * Assert the arguments.
	 */
	Xil_AssertVoid(InstancePtr != NULL);
	Xil_AssertVoid(InstancePtr->IsReady == XIL_COMPONENT_IS_READY);
	Xil_AssertVoid(InstancePtr->Config.IsEventCount == 1);

	RegVal = XAxiPmon_ReadReg(InstancePtr->Config.BaseAddress,
							XAPM_CTL_OFFSET);

	XAxiPmon_WriteReg(InstancePtr->Config.BaseAddress, XAPM_CTL_OFFSET,
					RegVal & ~(XAPM_CR_EXTERNAL_TRIGGER_MASK));
}

/****************************************************************************/
/**
*
* This function returns a name for a given Metric.
*
* @param        Metrics is one of the Metric Sets. User has to use
*               XAPM_METRIC_SET_* macros in xaxipmon.h for this parameter
*
* @return       const char *
*
* @note         None
*
*****************************************************************************/
const char * XAxiPmon_GetMetricName(u8 Metrics)
{
	if (Metrics == XAPM_METRIC_SET_0 ){
  		return "Write Transaction Count";
	}
	if (Metrics == XAPM_METRIC_SET_1 ){
			return "Read Transaction Count";
	}
	if (Metrics == XAPM_METRIC_SET_2 ){
			return "Write Byte Count";
	}
	if (Metrics == XAPM_METRIC_SET_3 ){
			return "Read Byte Count";
	}
	if (Metrics == XAPM_METRIC_SET_4 ){
			return "Write Beat Count";
	}
	if (Metrics == XAPM_METRIC_SET_5 ){
			return "Total Read Latency";
	}
	if (Metrics == XAPM_METRIC_SET_6 ){
			return "Total Write Latency";
	}
	if (Metrics == XAPM_METRIC_SET_7 ){
		return "Slv_Wr_Idle_Cnt";
	}
	if (Metrics == XAPM_METRIC_SET_8 ){
			return "Mst_Rd_Idle_Cnt";
	}
	if (Metrics == XAPM_METRIC_SET_9 ){
			return "Num_BValids";
	}
	if (Metrics == XAPM_METRIC_SET_10){
		return "Num_WLasts";
	}
	if (Metrics == XAPM_METRIC_SET_11){
			return "Num_RLasts";
	}
	if (Metrics == XAPM_METRIC_SET_16){
			return "Transfer Cycle Count";
	}
	if (Metrics == XAPM_METRIC_SET_17){
			return "Packet Count";
	}
	if (Metrics == XAPM_METRIC_SET_18){
			return "Data Byte Count";
	}
	if (Metrics == XAPM_METRIC_SET_19){
			return "Position Byte Count";
	}
	if (Metrics == XAPM_METRIC_SET_20){
			return "Null Byte Count";
	}
	if (Metrics == XAPM_METRIC_SET_21){
			return "Slv_Idle_Cnt";
	}
	if (Metrics == XAPM_METRIC_SET_22){
			return "Mst_Idle_Cnt";
	}
	if (Metrics == XAPM_METRIC_SET_30){
			return "External event count";
	}
	return "Unsupported";
}

