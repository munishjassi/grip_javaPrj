################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src/AXI_Exerciser.c \
../src/AXI_monitor.c \
../src/axi_interrupt.c \
../src/cf_hdmi.c \
../src/hw_config.c \
../src/img_filters.c \
../src/main.c \
../src/sw_functions.c \
../src/transmitter.c 

LD_SRCS += \
../src/lscript.ld 

OBJS += \
./src/AXI_Exerciser.o \
./src/AXI_monitor.o \
./src/axi_interrupt.o \
./src/cf_hdmi.o \
./src/hw_config.o \
./src/img_filters.o \
./src/main.o \
./src/sw_functions.o \
./src/transmitter.o 

C_DEPS += \
./src/AXI_Exerciser.d \
./src/AXI_monitor.d \
./src/axi_interrupt.d \
./src/cf_hdmi.d \
./src/hw_config.d \
./src/img_filters.d \
./src/main.d \
./src/sw_functions.d \
./src/transmitter.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: ARM gcc compiler'
	arm-xilinx-eabi-gcc -Wall -O0 -g3 -I"/nfs/TUEIEDAprojects/SystemDesign/work/ipxact/benjamin-bordes/DSE/3IP_/3IP/SDK/SDK_Workspace/software_prj/inc" -c -fmessage-length=0 -I../../standalone_bsp_0/ps7_cortexa9_0/include -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


