/*
 * AXI_Exerciser.c
 *
 *  Created on: Jun 12, 2014
 *      Author: ga46sam
 */

#include <stdio.h>
#include "xil_types.h"
#include "xparameters.h"
#include "AXI_Exerciser.h"
//#include "cf_hdmi.h"
//#include "hw_config.h"

#define PARAM_RAM_OFFSET_RD		0x1000	/**< Parameter RAM Offset */
#define PARAM_RAM_OFFSET_WR		0x1400	/**< Parameter RAM Offset */
#define COMMAND_RAM_OFFSET_RD	0x8000	/**< Command RAM Offset for reads*/
#define COMMAND_RAM_OFFSET_WR	0x9000	/**< Command RAM Offset for writes*/
#define MASTER_RAM_OFFSET		0x10000	/**< Master RAM Offset */
#define MASTER_RAM_END		0x7FFFFF	/**< Master RAM Offset */
#define Half_MASTER_RAM_OFFSET    0x407FFF /**<use for read to DDR*/
#define CMD_NBR 256

/* Exerciser functionality
 1. Load commands into the CMDRAM
 2. Load extra op codes into PARAM RAM if needed
 3. Load data into MST RAM for writes
*/

/* Commands consist of 4 words
 * 1. Address
 * 2. Type
 * 3. Dependencies
 * 4. Type
 */


void AXI_Exerciser_config(int XPAR_AXI_EXERCISER_BASEADDR,int HWPROC_VIDEO_BASEADDR_WR,int HWPROC_VIDEO_BASEADDR_RD, int config1)
{
	    u32 *MasterRAMAddress;
	    u32 *CmdRAMAddress;
	    u32 *paraRAMAddress;
        int j;


	//
	// Writing data to the internal read memory for write operations
	//
	    MasterRAMAddress = (u32 *) (XPAR_AXI_EXERCISER_BASEADDR + MASTER_RAM_OFFSET);
 for (j=0;j<(CMD_NBR*2*2)-1;j++) //2*512 times to write 2*512*4Bytes=2*256*8Bytes (2 Burst availables)
// for (j=0;j<(CMD_NBR*2)-1;j++)
    	 {
	                *MasterRAMAddress = j; //32bits;4 Bytes
	                 MasterRAMAddress++;
         }

	//
	// Write commands for the Instruction memory
	//
	    CmdRAMAddress = (u32 *) (XPAR_AXI_EXERCISER_BASEADDR + COMMAND_RAM_OFFSET_WR);
		for (j=0;j<CMD_NBR;j=j+1)
		{
				*CmdRAMAddress = HWPROC_VIDEO_BASEADDR_WR+j*64;
				CmdRAMAddress++;
				*CmdRAMAddress = config1;
				CmdRAMAddress++;
	            *CmdRAMAddress = j*8;   //No dependencies, MstRAM at location j*8
	           // 	*CmdRAMAddress = j;   //No dependencies, MstRAM at location j
				CmdRAMAddress++;
				*CmdRAMAddress = 0x00000037;		// Any response OK, cacheable
				CmdRAMAddress++;
		}


		//
		// Read commands for the Instruction memory
		//
		CmdRAMAddress = (u32 *) (XPAR_AXI_EXERCISER_BASEADDR + COMMAND_RAM_OFFSET_RD);
			for (j=0;j<CMD_NBR;j=j+1)
			{
					*CmdRAMAddress =HWPROC_VIDEO_BASEADDR_RD+j*64;
					CmdRAMAddress++;
					*CmdRAMAddress = config1;
					CmdRAMAddress++;
                    *CmdRAMAddress = 0x00000F00+j*8;//No dependencies, MstRAM at location 0xF00+j*8
				    CmdRAMAddress++;
				    *CmdRAMAddress = 0x00000037;  // Any response OK, cacheable
					CmdRAMAddress++;
			}


		//
		// Parameters for the Instruction memory (Write commands)
		//
			paraRAMAddress = (u32 *) (XPAR_AXI_EXERCISER_BASEADDR + PARAM_RAM_OFFSET_WR);
			for (j=0;j<CMD_NBR;j=j+1)
			{
				*paraRAMAddress =0x00000000;
				paraRAMAddress++;
			}

		//
		// Parameters for the Instruction memory (Read commands)
		//
			paraRAMAddress = (u32 *) (XPAR_AXI_EXERCISER_BASEADDR + PARAM_RAM_OFFSET_RD);
			for (j=0;j<CMD_NBR;j=j+1)
			{
				*paraRAMAddress =0x00000000;
				paraRAMAddress++;
			}
}


void AXI_Exerciser_start1(int XPAR_AXI_EXERCISER_BASEADDR)
{
	    u32 *Reg0_Master_ctl;
 	   	Reg0_Master_ctl = (u32 *) (XPAR_AXI_EXERCISER_BASEADDR);
	 	*Reg0_Master_ctl = 0x0100000;
}


void AXI_Exerciser_clear(int XPAR_AXI_EXERCISER_BASEADDR)
{

		printf("########################################################################################\r\n");
		printf("########################################################################################\r\n");
	    printf("AXI exerciser reg master active bit value is:\r\n");
	    printf("0x%08X : 0x%08X\r\n",XPAR_AXI_EXERCISER_BASEADDR, Xil_In32(XPAR_AXI_EXERCISER_BASEADDR));
	    printf("AXI exerciser Reg2_error active bit value is:\r\n");
	    printf("0x%08X : 0x%08X\r\n",XPAR_AXI_EXERCISER_BASEADDR+0x08, Xil_In32(XPAR_AXI_EXERCISER_BASEADDR+0x08));

	    printf("AXI exerciser Reg6_error_alias value is:\r\n");
	    printf("0x%08X : 0x%08X\r\n",XPAR_AXI_EXERCISER_BASEADDR+0x18, Xil_In32(XPAR_AXI_EXERCISER_BASEADDR+0x18));

            printf("AXI exerciser Reg2_error active bit value is:\r\n");
	 	   	printf("0x%08X : 0x%08X\r\n",XPAR_AXI_EXERCISER_BASEADDR+0x08, Xil_In32(XPAR_AXI_EXERCISER_BASEADDR+0x08));
	 	    printf("########################################################################################\r\n");
	 		printf("########################################################################################\r\n");


	    			//		}
	 }


void AXI_Exerciser_stop(int XPAR_AXI_EXERCISER_BASEADDR)
{
	   // u32 *Reg0_Master_ctl;
	   // u32 *Reg6_error_alias;

		u32 *Reg0_Master_ctl;
		Reg0_Master_ctl = (u32 *) (XPAR_AXI_EXERCISER_BASEADDR);
		//	*Reg0_Master_ctl = 0x47000000;
		*Reg0_Master_ctl = 0x0000000;

	 }

void mem_clean(int mem_base_addr,int mem_high_addr)
{
	int i=mem_base_addr;
	while (i< mem_high_addr)
	{
		i=i+1;
		//Xil_Out32(i,0x00000000);
		Xil_Out32(i,0x11111111);

	}
}
