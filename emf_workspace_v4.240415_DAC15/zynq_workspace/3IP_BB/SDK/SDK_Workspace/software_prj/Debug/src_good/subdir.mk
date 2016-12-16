################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../src_good/axi_interrupt.c \
../src_good/cf_hdmi.c \
../src_good/img_filters.c \
../src_good/main.c \
../src_good/transmitter.c 

LD_SRCS += \
../src_good/lscript.ld 

OBJS += \
./src_good/axi_interrupt.o \
./src_good/cf_hdmi.o \
./src_good/img_filters.o \
./src_good/main.o \
./src_good/transmitter.o 

C_DEPS += \
./src_good/axi_interrupt.d \
./src_good/cf_hdmi.d \
./src_good/img_filters.d \
./src_good/main.d \
./src_good/transmitter.d 


# Each subdirectory must supply rules for building sources it contributes
src_good/%.o: ../src_good/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: ARM gcc compiler'
	arm-xilinx-eabi-gcc -Wall -O0 -g3 -I/home/ga46sam/zync_work/Performances/opencv_install -I"/nfs/TUEIEDAprojects/SystemDesign/work/zynq/benjamin-bordes/Performances/Projects/cf_adv7511_cam_viv2_9/SDK/SDK_Workspace/software_prj/inc" -c -fmessage-length=0 -I../../standalone_bsp_0/ps7_cortexa9_0/include -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


