################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../inc/xgray_scale.c \
../inc/ximage_filter.c \
../inc/xsobel_filter.c 

OBJS += \
./inc/xgray_scale.o \
./inc/ximage_filter.o \
./inc/xsobel_filter.o 

C_DEPS += \
./inc/xgray_scale.d \
./inc/ximage_filter.d \
./inc/xsobel_filter.d 


# Each subdirectory must supply rules for building sources it contributes
inc/%.o: ../inc/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: ARM gcc compiler'
	arm-xilinx-eabi-gcc -Wall -O0 -g3 -I/home/ga46sam/zync_work/Performances/opencv_install -I"/nfs/TUEIEDAprojects/SystemDesign/work/ipxact/benjamin-bordes/DSE/3IP_/3IP/SDK2/SDK_Workspace/software_prj/inc" -c -fmessage-length=0 -I../../standalone_bsp_0/ps7_cortexa9_0/include -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


