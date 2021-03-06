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
* @file xaxipmon.h
*
* The XAxiPmon driver supports the Xilinx AXI Performance Monitor device.
*
* The AXI Performance Monitor device provides following features:
*
*	Configurable number of Metric Counters and Incrementers
* 	Computes performance metrics for Agents connected to
*	monitor slots (Up to 8 slots)
*
* The following Metrics can be computed:
*
* Metrics computed for an AXI4 MM agent:
*	Write Request Count: Total number of write requests by/to the agent.
*	Read Request Count: Total number of read requests given by/to the
*			    agent.
*	Read Latency: It is defined as the time from the start of read address
*       	      transaction to the beginning of the read data service.
*	Write Latency: It is defined as the period needed a master completes
*        	       write data transaction, i.e. from write address
*        	       transaction to write response from slave.
*	Write Byte Count: Total number of bytes written by/to the agent.
*        		  This metric is helpful when calculating the
*        		  throughput of the system.
*	Read Byte Count: Total number of bytes read from/by the agent.
*	Average Write Latency: Average write latency seen by the agent.
*        		       It can be derived from total write latency
*        		       and the write request count.
*	Average Read Latency: Average read latency seen by the agent. It can be
*        		      derived from total read latency and the read
*        		      request count.
*	Master Write Idle Cycle Count: Number of idle cycles caused by the
*        			       masters during write transactions to
*        			       the slave.
*	Slave Write Idle Cycle Count: Number of idle cycles caused by this slave
*        			      during write transactions to the slave.
*	Master Read Idle Cycle Count: Number of idle cycles caused by the
*        			      master during read transactions to the
*        			      slave.
*	Slave Read Idle Cycle Count: Number of idle cycles caused by this slave
*        			     during read transactions to the slave.
*
* Metrics computed for an AXI4-Stream agent:
*
*	Transfer Cycle Count: Total number of writes by/to the agent.
*	Data Byte Count: Total number of data bytes written by/to the agent.
*			 This metric helps in calculating the throughput
*			 of the system.
*	Position Byte Count: Total number of position bytes transferred.
*	Null Byte Count: Total number of null bytes transferred.
*	Packet Count: Total number of packets transferred.
*
* The user should refer to the hardware device specification for detailed
* information about the device.
*
* This header file contains the prototypes of driver functions that can
* be used to access the AXI Performance Monitor device.
*
*
* <b> Initialization and Configuration </b>
*
* The device driver enables higher layer software (e.g., an application) to
* communicate to the AXI Performance Monitor device.
*
* XAxiPmon_CfgInitialize() API is used to initialize the AXI Performance Monitor
* device. The user needs to first call the XAxiPmon_LookupConfig() API which
* returns the Configuration structure pointer which is passed as a parameter to
* the XAxiPmon_CfgInitialize() API.
*
*
* <b>Interrupts</b>
*
* The AXI Performance Monitor does not support Interrupts
*
*
* <b> Virtual Memory </b>
*
* This driver supports Virtual Memory. The RTOS is responsible for calculating
* the correct device base address in Virtual Memory space.
*
*
* <b> Threads </b>
*
* This driver is not thread safe. Any needs for threads or thread mutual
* exclusion must be satisfied by the layer above this driver.
*
* <b> Asserts </b>
*
* Asserts are used within all Xilinx drivers to enforce constraints on argument
* values. Asserts can be turned off on a system-wide basis by defining, at
* compile time, the NDEBUG identifier. By default, asserts are turned on and it
* is recommended that users leave asserts on during development.
*
*
* <b> Building the driver </b>
*
* The XAxiPmon driver is composed of several source files. This allows the user
* to build and link only those parts of the driver that are necessary.
*
* <b> Limitations of the driver </b>
*
*
* <br><br>
*
* <pre>
*
* MODIFICATION HISTORY:
*
* Ver   Who    Date     Changes
* ----- -----  -------- -----------------------------------------------------
* 1.00a bss    02/27/12 First release
* 2.00a bss    06/23/12 Updated to support v2_00a version of IP.
* 3.00a bss    09/03/12 To support v2_01_a version of IP:
*			Deleted XAxiPmon_SetAgent, XAxiPmon_GetAgent APIs and
*			added XAPM_FLAG_EVENT, XAPM_FLAG_EVNTSTAR,
*			XAPM_FLAG_EVNTSTOP.
*			Deleted XAxiPmon_SetAgent, XAxiPmon_GetAgent APIs and
*			modified XAxiPmon_SetMetrics, XAxiPmon_GetMetrics APIs
*			in xaxipmon.c
*			Deleted XAPM_AGENT_OFFSET Macro in xaxipmon_hw.h
* 3.01a bss    10/25/12 To support new version of IP:
*			Added XAPM_MCXLOGEN_OFFSET macros in xaxipmon_hw.h.
*			Added XAxiPmon_SetMetricCounterCutOff,
*			XAxiPmon_GetMetricCounterCutOff,
*			XAxiPmon_EnableExternalTrigger and
*			XAxiPmon_DisableExternalTrigger APIs in xaxipmon.c
*			Modified XAxiPmon_SetMetrics and XAxiPmon_GetMetrics
*			(CR #683746) in xaxipmon.c
*			Added XAxiPmon_EnableEventLog,
*			XAxiPmon_DisableMetricsCounter,
*			XAxiPmon_EnableMetricsCounter APIs in xaxipmon.c to
*			replace macros in this file.
*			Added XAPM_FLAG_XXX macros.
*			Added XAxiPmon_StartCounters and XAxiPmon_StopCounters
*			APIs (CR #683799).
*			Added XAxiPmon_StartEventLog and XAxiPmon_StopEventLog
*			APIs (CR #683801).
*			Added XAxiPmon_GetMetricName API (CR #683803).
*			Deleted XAxiPmon_SetAgent, XAxiPmon_GetAgent
*			declarations (CR #677337)
*
* </pre>
*
*****************************************************************************/
#ifndef XAXIPMON_H /* Prevent circular inclusions */
#define XAXIPMON_H /* by using protection macros  */

#ifdef __cplusplus
extern "C" {
#endif

/***************************** Include Files ********************************/

#include "xil_types.h"
#include "xil_assert.h"
#include "xstatus.h"
#include "xaxipmon_hw.h"

/************************** Constant Definitions ****************************/


/**
 * @name Macro for Maximum number of Counters
 *
 * @{
 */
#define XAPM_MAX_COUNTERS		10 /**< Maximum number of Counters */

/*@}*/


/**
 * @name Indices for Metric Counters and Sampled Metric Coounters used with
 * 	 XAxiPmon_GetMetricCounter and XAxiPmon_GetSampledMetricCounter APIs
 * @{
 */

#define XAPM_METRIC_COUNTER_0	0 /**< Metric Counter 0 Register Index */
#define XAPM_METRIC_COUNTER_1	1 /**< Metric Counter 1 Register Index */
#define XAPM_METRIC_COUNTER_2	2 /**< Metric Counter 2 Register Index */
#define XAPM_METRIC_COUNTER_3	3 /**< Metric Counter 3 Register Index */
#define XAPM_METRIC_COUNTER_4	4 /**< Metric Counter 4 Register Index */
#define XAPM_METRIC_COUNTER_5	5 /**< Metric Counter 5 Register Index */
#define XAPM_METRIC_COUNTER_6	6 /**< Metric Counter 6 Register Index */
#define XAPM_METRIC_COUNTER_7	7 /**< Metric Counter 7 Register Index */
#define XAPM_METRIC_COUNTER_8	8 /**< Metric Counter 8 Register Index */
#define XAPM_METRIC_COUNTER_9	9 /**< Metric Counter 9 Register Index */

/*@}*/

/**
 * @name Indices for Incrementers and Sampled Incrementers used with
 * 	 XAxiPmon_GetIncrementer and XAxiPmon_GetSampledIncrementer APIs
 * @{
 */

#define XAPM_INCREMENTER_0	0 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_1	1 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_2	2 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_3	3 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_4	4 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_5	5 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_6	6 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_7	7 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_8	8 /**< Metric Counter 0 Register Index */
#define XAPM_INCREMENTER_9	9 /**< Metric Counter 0 Register Index */

/*@}*/

/**
 * @name Macros for Metric Selector Settings
 * @{
 */

#define XAPM_METRIC_SET_0		0 /**< Write Transaction Count */
#define XAPM_METRIC_SET_1		1 /**< Read Transaction Count */
#define XAPM_METRIC_SET_2		2 /**< Write Byte Count */
#define XAPM_METRIC_SET_3		3 /**< Read Byte Count */
#define XAPM_METRIC_SET_4		4 /**< Write Beat Count */
#define XAPM_METRIC_SET_5		5 /**< Total Read Latency */
#define XAPM_METRIC_SET_6		6 /**< Total Write Latency */
#define XAPM_METRIC_SET_7		7 /**< Slv_Wr_Idle_Cnt */
#define XAPM_METRIC_SET_8		8 /**< Mst_Rd_Idle_Cnt */
#define XAPM_METRIC_SET_9		9 /**< Num_BValids */
#define XAPM_METRIC_SET_10		10 /**< Num_WLasts */
#define XAPM_METRIC_SET_11		11 /**< Num_RLasts */
#define XAPM_METRIC_SET_16		16 /**< Transfer Cycle Count */
#define XAPM_METRIC_SET_17		17 /**< Packet Count */
#define XAPM_METRIC_SET_18		18 /**< Data Byte Count */
#define XAPM_METRIC_SET_19		19 /**< Position Byte Count */
#define XAPM_METRIC_SET_20		20 /**< Null Byte Count */
#define XAPM_METRIC_SET_21		21 /**< Slv_Idle_Cnt */
#define XAPM_METRIC_SET_22		22 /**< Mst_Idle_Cnt */
#define XAPM_METRIC_SET_30		30 /**< External event count */



/*@}*/


/**
 * @name Macros for Maximum number of Agents
 * @{
 */

#define XAPM_MAX_AGENTS 	8 /**< Maximum number of Agents */

/*@}*/

/**
 * @name Macros for Flags in Flag Enable Control Register
 * @{
 */

#define XAPM_FLAG_WRADDR	0x00000001 /**< Write Address Flag */
#define XAPM_FLAG_FIRSTWR	0x00000002 /**< First Write Flag */
#define XAPM_FLAG_LASTWR	0x00000004 /**< Last Write Flag */
#define XAPM_FLAG_RESPONSE	0x00000008 /**< Response Flag */
#define XAPM_FLAG_RDADDR	0x00000010 /**< Read Address Flag */
#define XAPM_FLAG_FIRSTRD	0x00000020 /**< First Read Flag */
#define XAPM_FLAG_LASTRD	0x00000040 /**< Last Read Flag */
#define XAPM_FLAG_SWDATA	0x00010000 /**< Software-written Data Flag */
#define XAPM_FLAG_EVENT		0x00020000 /**< Last Read Flag */
#define XAPM_FLAG_EVNTSTOP	0x00040000 /**< Last Read Flag */
#define XAPM_FLAG_EVNTSTART	0x00080000 /**< Last Read Flag */
#define XAPM_FLAG_GCCOVF	0x00100000 /**< Global Clock Counter Overflow
										 *  Flag */
#define XAPM_FLAG_SCLAPSE	0x00200000 /**< Sample Counter Lapse Flag */
#define XAPM_FLAG_MC0		0x00400000 /**< Metric Counter 0 Flag */
#define XAPM_FLAG_MC1		0x00800000 /**< Metric Counter 1 Flag */
#define XAPM_FLAG_MC2		0x01000000 /**< Metric Counter 2 Flag */
#define XAPM_FLAG_MC3		0x02000000 /**< Metric Counter 3 Flag */
#define XAPM_FLAG_MC4		0x04000000 /**< Metric Counter 4 Flag */
#define XAPM_FLAG_MC5		0x08000000 /**< Metric Counter 5 Flag */
#define XAPM_FLAG_MC6		0x10000000 /**< Metric Counter 6 Flag */
#define XAPM_FLAG_MC7		0x20000000 /**< Metric Counter 7 Flag */
#define XAPM_FLAG_MC8		0x40000000 /**< Metric Counter 8 Flag */
#define XAPM_FLAG_MC9		0x80000000 /**< Metric Counter 9 Flag */

/*@}*/

/**************************** Type Definitions ******************************/

/**
 * This typedef contains configuration information for the AXI Performance
 * Monitor device.
 */
typedef struct {
	u16 DeviceId;			/**< Unique ID of device */
	u32 BaseAddress;		/**< Device base address */
	int GlobalClkCounterWidth;	/**< Global Clock Counter Width */
	int MetricSampleCounterWidth ;	/**< Metric Sample Counters Width */
	u8  IsEventCount;		/**< Event Count Enabled 1 - enabled
							   0 - not enabled */
	u8  NumberofSlots;		/**< Number of Monitor Slots */
	u8  NumberofCounters;		/**< Number of Counters */
	u8  HaveSampledCounters;	/**< Have Sampled Counters 1 - present
						 	    0 - Not present */
	u8 IsEventLog;			/**< Event Logging Enabled 1 - enabled
							    0 - Not enabled */
	u32 FifoDepth;			/**< Event Log FIFO Depth */
	u32 FifoWidth;			/**< Event Log FIFO Width */
	u32 TidWidth; 			/**< Streaming Interface TID Width */

} XAxiPmon_Config;


/**
 * The driver's instance data. The user is required to allocate a variable
 * of this type for every AXI Performance Monitor device in system. A pointer
 * to a variable of this type is then passed to the driver API functions.
 */
typedef struct {
	XAxiPmon_Config Config;	/**< XAxiPmon_Config of current device */
	u32  IsReady;		/**< Device is initialized and ready  */
} XAxiPmon;

/***************** Macros (Inline Functions) Definitions ********************/


/****************************************************************************/
/**
*
* This routine enables the Global Interrupt.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None.
*
* @note		C-Style signature:
*		void XAxiPmon_IntrGlobalEnable(XAxiPmon *InstancePtr)
*
*****************************************************************************/
#define XAxiPmon_IntrGlobalEnable(InstancePtr)			\
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, 	\
			XAPM_GIE_OFFSET, 1)


/****************************************************************************/
/**
*
* This routine disables the Global Interrupt.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None.
*
* @note		C-Style signature:
*		void XAxiPmon_IntrGlobalDisable(XAxiPmon *InstancePtr)
*
*****************************************************************************/
#define XAxiPmon_IntrGlobalDisable(InstancePtr)				\
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, 		\
				XAPM_GIE_OFFSET, 0)


/****************************************************************************/
/**
*
* This routine enables interrupt(s). Use the XAPM_IXR_* constants defined in
* xaxipmon_hw.h to create the bit-mask to enable interrupts.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	Mask is the mask to enable. Bit positions of 1 will be enabled.
*		Bit positions of 0 will keep the previous setting. This mask is
*		formed by OR'ing XAPM_IXR__* bits defined in xaxipmon_hw.h.
*
* @return	None.
*
* @note		C-Style signature:
*		void XAxiPmon_IntrEnable(XAxiPmon *InstancePtr, u32 Mask)
*
*****************************************************************************/
#define XAxiPmon_IntrEnable(InstancePtr, Mask)				     \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_IE_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_IE_OFFSET) | Mask);


/****************************************************************************/
/**
*
* This routine disable interrupt(s). Use the XAPM_IXR_* constants defined in
* xaxipmon_hw.h to create the bit-mask to disable interrupts.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	Mask is the mask to disable. Bit positions of 1 will be
*		disabled. Bit positions of 0 will keep the previous setting.
*		This mask is formed by OR'ing XAPM_IXR_* bits defined in
*		xaxipmon_hw.h.
*
* @return	None.
*
* @note		C-Style signature:
*		void XAxiPmon_IntrEnable(XAxiPmon *InstancePtr, u32 Mask)
*
*****************************************************************************/
#define XAxiPmon_IntrDisable(InstancePtr, Mask)				     \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_IE_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_IE_OFFSET) | Mask);

/****************************************************************************/
/**
*
* This routine clears the specified interrupt(s).
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param	Mask is the mask to clear. Bit positions of 1 will be cleared.
*		This mask is formed by OR'ing XAPM_IXR_* bits defined in
*		xaxipmon_hw.h.
*
* @return	None.
*
* @note		C-Style signature:
*		void XAxiPmon_IntrClear(XAxiPmon *InstancePtr, u32 Mask)
*
*****************************************************************************/
#define XAxiPmon_IntrClear(InstancePtr, Mask)				     \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_IS_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_IS_OFFSET) | Mask);

/****************************************************************************/
/**
*
* This routine returns the Interrupt Status Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	Interrupt Status Register contents
*
* @note		C-Style signature:
*		void XAxiPmon_IntrClear(XAxiPmon *InstancePtr)
*
*****************************************************************************/
#define XAxiPmon_IntrGetStatus(InstancePtr)				     \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_IS_OFFSET);

/****************************************************************************/
/**
*
* This function enables the Global Clock Counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		C-Style signature:
*		void XAxiPmon_EnableGlobalClkCounter(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_EnableGlobalClkCounter(InstancePtr) \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_CTL_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_CTL_OFFSET) | XAPM_CR_GCC_ENABLE_MASK);

/****************************************************************************/
/**
*
* This function disbles the Global Clock Counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		C-Style signature:
*		void XAxiPmon_DisableGlobalClkCounter(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_DisableGlobalClkCounter(InstancePtr) \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_CTL_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_CTL_OFFSET) & ~(XAPM_CR_GCC_ENABLE_MASK));

/****************************************************************************/
/**
*
* This function enables the specified flag in Flag Control Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param 	Flag is one of the XAPM_FLAG_* masks defined in xaxipmon.h
*
* @return	None
*
* @note		C-Style signature:
*		void XAxiPmon_EnableFlag(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_EnableFlag(InstancePtr, Flag) \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_FEC_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_FEC_OFFSET) | Flag);

/****************************************************************************/
/**
*
* This function disables the specified flag in Flag Control Register.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
* @param 	Flag is one of the XAPM_FLAG_* masks defined in xaxipmon.h*
* @return	None
*
* @note		C-Style signature:
*		void XAxiPmon_DisableFlag(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_DisableFlag(InstancePtr, Flag) \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_FEC_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_FEC_OFFSET) & ~(Flag));

/****************************************************************************/
/**
*
* This function loads the sample interval register value into the sample
* interval counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		C-Style signature:
*		void XAxiPmon_LoadSampleIntervalCounter(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_LoadSampleIntervalCounter(InstancePtr) \
       XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_SICR_OFFSET, \
							XAPM_SICR_LOAD_MASK);



/****************************************************************************/
/**
*
* This enables the down count of the sample interval counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		C-Style signature:
*	   void XAxiPmon_EnableSampleIntervalCounter(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_EnableSampleIntervalCounter(InstancePtr) \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_SICR_OFFSET,\
							XAPM_SICR_ENABLE_MASK);


/****************************************************************************/
/**
*
* This disables the down count of the sample interval counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		C-Style signature:
*	    void XAxiPmon_DisableSampleIntervalCounter(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_DisableSampleIntervalCounter(InstancePtr) \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_SICR_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_SICR_OFFSET) & ~(XAPM_SICR_ENABLE_MASK));

/****************************************************************************/
/**
*
* This enables Reset of Metric Counters when Sample Interval Counter lapses.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		C-Style signature:
*		void XAxiPmon_EnableMetricCounterReset(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_EnableMetricCounterReset(InstancePtr) \
	XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_SICR_OFFSET,\
						XAPM_SICR_MCNTR_RST_MASK);

/****************************************************************************/
/**
*
* This disables the down count of the sample interval counter.
*
* @param	InstancePtr is a pointer to the XAxiPmon instance.
*
* @return	None
*
* @note		C-Style signature:
*		void XAxiPmon_DisableMetricCounterReset(XAxiPmon *InstancePtr);
*
*****************************************************************************/
#define XAxiPmon_DisableMetricCounterReset(InstancePtr) \
       XAxiPmon_WriteReg((InstancePtr)->Config.BaseAddress, XAPM_SICR_OFFSET, \
			XAxiPmon_ReadReg((InstancePtr)->Config.BaseAddress, \
			XAPM_SICR_OFFSET) & ~(XAPM_SICR_MCNTR_RST_MASK));

/************************** Function Prototypes *****************************/

/**
 * Functions in xaxipmon_sinit.c
 */
XAxiPmon_Config *XAxiPmon_LookupConfig(u16 DeviceId);

/**
 * Functions in xaxipmon.c
 */
int XAxiPmon_CfgInitialize(XAxiPmon *InstancePtr,
		XAxiPmon_Config *ConfigPtr, u32 EffectiveAddr);

int XAxiPmon_ResetMetricCounter(XAxiPmon *InstancePtr);

void XAxiPmon_ResetGlobalClkCounter(XAxiPmon *InstancePtr);

int XAxiPmon_ResetFifo(XAxiPmon *InstancePtr);

void XAxiPmon_SetIncrementerRange(XAxiPmon *InstancePtr, u8 IncrementerNum,
					u16 RangeUpper,	u16 RangeLower);

void XAxiPmon_GetIncrementerRange(XAxiPmon *InstancePtr, u8 IncrementerNum,
				u16 *RangeUpper, u16 *RangeLower);

void XAxiPmon_SetSampleInterval(XAxiPmon *InstancePtr, u32 SampleIntervalHigh,
						u32 SampleIntervalLow);

void XAxiPmon_GetSampleInterval(XAxiPmon *InstancePtr, u32 *SampleIntervalHigh,
						u32 *SampleIntervalLow);

int XAxiPmon_SetMetrics(XAxiPmon *InstancePtr, u8 Slot, u8 Metrics,
							u8 CounterNum);

int XAxiPmon_GetMetrics(XAxiPmon *InstancePtr, u8 CounterNum, u8 *Metrics,
								u8 *Slot);
void XAxiPmon_GetGlobalClkCounter(XAxiPmon *InstancePtr,u32 *CntHighValue,
							u32 *CntLowValue);

u32 XAxiPmon_GetMetricCounter(XAxiPmon *InstancePtr, u32 CounterNum);

u32 XAxiPmon_GetSampledMetricCounter(XAxiPmon *InstancePtr, u32 CounterNum);

u32 XAxiPmon_GetIncrementer(XAxiPmon *InstancePtr, u32 IncrementerNum);

u32 XAxiPmon_GetSampledIncrementer(XAxiPmon *InstancePtr, u32 IncrementerNum);

void XAxiPmon_SetSwDataReg(XAxiPmon *InstancePtr, u32 SwData);

u32 XAxiPmon_GetSwDataReg(XAxiPmon *InstancePtr);

int XAxiPmon_StartEventLog(XAxiPmon *InstancePtr, u32 FlagEnables);

int XAxiPmon_StopEventLog(XAxiPmon *InstancePtr);

int XAxiPmon_StartCounters(XAxiPmon *InstancePtr, u32 SampleIntervalHigh,
                           			u32 SampleIntervalLow);

int XAxiPmon_StopCounters(XAxiPmon *InstancePtr);

void XAxiPmon_EnableMetricsCounter(XAxiPmon *InstancePtr);

void XAxiPmon_DisableMetricsCounter(XAxiPmon *InstancePtr);

void XAxiPmon_SetMetricCounterCutOff(XAxiPmon *InstancePtr, u32 CounterNum,
								u32 CutOff);

u32 XAxiPmon_GetMetricCounterCutOff(XAxiPmon *InstancePtr, u32 CounterNum);

void XAxiPmon_EnableEventLog(XAxiPmon *InstancePtr);

void XAxiPmon_EnableExternalTrigger(XAxiPmon *InstancePtr);

void XAxiPmon_DisableExternalTrigger(XAxiPmon *InstancePtr);

const char * XAxiPmon_GetMetricName(u8 Metrics);

/**
 * Functions in xaxipmon_selftest.c
 */
int XAxiPmon_SelfTest(XAxiPmon *InstancePtr);

#ifdef __cplusplus
}
#endif

#endif  /* End of protection macro. */
