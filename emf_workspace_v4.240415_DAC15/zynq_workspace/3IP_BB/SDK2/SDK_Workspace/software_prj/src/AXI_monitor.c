
#include "AXI_monitor.h"
#include "profile_cnt.h"
#include "xparameters.h"
int cnt = 0;
int avrg=5; //number of frames considered for performance metrics averaging
int CPUavrg= 0;
int BUSavrg= 0;
int BusRdTravrg= 0;
int BusWrTravrg= 0;
int BusRdByavrg= 0;
int BusWrByavrg= 0;
int CPUclk=0;
char *monitor[]={"WRITE","READ"};

void AXI_monitor_config(int XPAR_AXI_MONITOR_BASEADDR)
{
printf("Monitoring Write transactions 1\r\n");
Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x300,0x00000002);

Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x44,0x01030002);
Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x48,0x00000000);
Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x4C,0x00000000);
//Xil_Out32(XPAR_AXI_PERF_MON_0_BASEADDR+0x48,0x00004042);
//Xil_Out32(XPAR_AXI_PERF_MON_0_BASEADDR+0x4C,0x0000E0E2);


	Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x30,0x00000001);
	Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x34,0x00000FFF);
	Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x24,0x00001000);
}


void AXI_monitor_reset(int XPAR_AXI_MONITOR_BASEADDR)
{
	  Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x300,0x00020002); //Reset of Global Cnt and Metric cnt
		  //  Xil_Out32(0x75C20028,0x00000002);
		  //  Xil_Out32(0x75C20028,0x00000001);
	Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x300,0x00010001); //Enable Global Cnt and Metric cnt

}

void AXI_monitor_stop(int XPAR_AXI_MONITOR_BASEADDR)
{
		Xil_Out32(XPAR_AXI_MONITOR_BASEADDR+0x300,0x00000000); //Disable Global Cnt and Metric cnt
		//	Xil_Out32(0x75C20028,0x0000000); //Disable the Down counter

}

void PerfResult(int XPAR_AXI_MONITOR_BASEADDR)
{ int i=0;
int test;

	    test= get_cyclecount();
		AXI_monitor_stop(XPAR_AXI_MONITOR_BASEADDR);
		printf("CPU clk cycles: %d \n\r",test);
		printf("BUS clk cycles: %u\r\n", (int)Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x4));
        
      //  printf("AXI_HP2:\r\n");
		printf("Bytes/Transactions:\r\n");
		//printf("%s \r\n",mode);
		for (i=0;i<2;i=i+1){
			printf("%s: %u/%u \r\n",monitor[i], (int)Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x100+16*(2*i)), (int)Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x100+16*((2*i)+1)));
			}
/*		for (i=0;i<=3;i++)
		{
		get_config_lvl_shifter();
		get_priority_AXI_HP(i);
		get_level_AXI_HP(i);
		//this register should only be read if a valid HP port clock is actively running. If not: will hang.
		}
*/
xil_printf("-----------------------------------------------\n\r");

				//	printf("AXI exerciser reg master active bit value is:\r\n");
				//	printf("0x%08X : 0x%08X\r\n",XPAR_AXI_EXERCISER_0_BASEADDR, Xil_In32(XPAR_AXI_EXERCISER_0_BASEADDR));

/*	printf("AXI exerciser reg master active bit value is:\r\n");
	printf("0x%08X : 0x%08X\r\n",XPAR_AXI_EXERCISER_0_BASEADDR, Xil_In32(XPAR_AXI_EXERCISER_0_BASEADDR));
	printf("#######################################");
	printf("AXI exerciser Reg2_error active bit value is:\r\n");
		 	   	printf("0x%08X : 0x%08X\r\n",XPAR_AXI_EXERCISER_0_BASEADDR+0x08, Xil_In32(XPAR_AXI_EXERCISER_0_BASEADDR+0x08));
		 	    printf("######################################\r\n");
*/
}

int AVRGPerfResult(int XPAR_AXI_MONITOR_BASEADDR)
{
				CPUclk= get_cyclecount();
				AXI_monitor_stop(XPAR_AXI_MONITOR_BASEADDR);

				if (cnt<avrg) {
						//	xil_printf("-----------------------------------------------\n\r");
						//	printf("new value : %d \n\r",Mytest);
							CPUavrg=CPUavrg+CPUclk;
							BUSavrg=BUSavrg+Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x4);
							BusWrByavrg=BusWrByavrg+Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x100);
							BusWrTravrg=BusWrTravrg+Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x100+16);
							BusRdByavrg=BusRdByavrg+Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x100+16*2);
							BusRdTravrg=BusRdTravrg+Xil_In32(XPAR_AXI_MONITOR_BASEADDR+0x100+16*3);

						//	printf("average : %d \n\r",AVRG);
						//	xil_printf("-----------------------------------------------\n\r");
							cnt++;
							}
				else 		{
						cnt=0;
						xil_printf("-----------------------------------------------\n\r");
					/*
					 	printf("Averaging over %d frames\n\r",avrg);
						printf("CPU clk cycles: %d \n\r",CPUavrg/avrg);
						printf("BUS clk cycles: %u \r\n",BUSavrg/avrg);
						printf("WR %d B / %d Tr:\r\n",BusWrByavrg/avrg,BusWrTravrg/avrg);
						printf("RD %d B / %d Tr:\r\n",BusRdByavrg/avrg,BusRdTravrg/avrg);
					*/
						//printf("CPU clk / BUS clk / WR Bytes / WR Tr / RD Bytes / RD Tr \n\r");
						printf("%d / %d / %d / %d / %d / %d \n\r",CPUavrg/avrg,BUSavrg/avrg,BusWrByavrg/avrg,BusWrTravrg/avrg,BusRdByavrg/avrg,BusRdTravrg/avrg);
						CPUavrg=0;
						BUSavrg=0;
						BusWrByavrg=0;
						BusWrTravrg=0;
						BusRdByavrg=0;
						BusRdTravrg=0;
							}

}
