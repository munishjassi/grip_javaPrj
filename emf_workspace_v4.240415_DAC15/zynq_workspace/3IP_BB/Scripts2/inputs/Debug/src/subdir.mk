################################################################################
# Automatically-generated file. Do not edit!
################################################################################

C_SRCS += $(wildcard ../src/*.c)
LD_SRCS += ../src/lscript.ld 
C_DEPS +=  $(patsubst %.c, %.d, $(C_SRCS))
OBJS +=  $(patsubst %.c, %.o, $(C_SRCS))


# Add inputs and outputs from these tool invocations to the build variables 

# Each subdirectory must supply rules for building sources it contributes
../src/%.o: ../src/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: ARM gcc compiler'
	arm-xilinx-eabi-gcc -Wall -O0 -g3 -I.././inc -I.././inc -I"../inc" -I../../$(BSPNAME)/ps7_cortexa9_0/include -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '
