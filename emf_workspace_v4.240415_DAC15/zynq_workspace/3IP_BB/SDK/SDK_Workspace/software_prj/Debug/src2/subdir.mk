################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src2/axi_interrupt.c \
../src2/cf_hdmi.c \
../src2/hw_config.c \
../src2/main.c \
../src2/sw_functions.c \
../src2/transmitter.c 

LD_SRCS += \
../src2/lscript.ld 

OBJS += \
./src2/axi_interrupt.o \
./src2/cf_hdmi.o \
./src2/hw_config.o \
./src2/main.o \
./src2/sw_functions.o \
./src2/transmitter.o 

C_DEPS += \
./src2/axi_interrupt.d \
./src2/cf_hdmi.d \
./src2/hw_config.d \
./src2/main.d \
./src2/sw_functions.d \
./src2/transmitter.d 


# Each subdirectory must supply rules for building sources it contributes
src2/%.o: ../src2/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: ARM gcc compiler'
	arm-xilinx-eabi-gcc -Wall -O0 -g3 -I/home/ga46sam/zync_work/Performances/opencv_install -I"/nfs/TUEIEDAprojects/SystemDesign/work/zynq/benjamin-bordes/Performances/Projects/cf_adv7511_cam_viv2_9/SDK/SDK_Workspace/software_prj/inc" -c -fmessage-length=0 -I../../standalone_bsp_0/ps7_cortexa9_0/include -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


