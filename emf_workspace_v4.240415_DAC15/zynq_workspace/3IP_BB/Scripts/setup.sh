#!/bin/sh -e
export PRJ=3IP

export SYS=system
export BSPNAME=standalone_bsp_0 #SDK BSP project name
export APPNAME=software_prj #SDK C/C++ application project.name
#export APPNAME=sw_cf_adv #SDK C/C++ application project.name
export WORKDIR=/nfs/TUEIEDAprojects/SystemDesign/work/ipxact/benjamin-bordes/DSE/3IP_/$PRJ
export SRCDIR=$WORKDIR/Scripts

#INPUT FILES
export INPUTS=$WORKDIR
export MHS=$SYS.mhs
export PS7XML=ps7_$SYS\_prj.xml
export XMP=$SYS.xmp
export UCF=$SYS.ucf
export PCORELIB=cf_lib
export SWDIRS="appsoftware/src appsoftware/lib appsoftware/inc"


export PRJDIR=$WORKDIR
export LIBRARY_PATH=/usr/lib/x86_64-linux-gnu:$LIBRARY_PATH
export LD_LIBRARY_PATH=/nfs/tools/xilinx/ise/14.7/ISE_DS/ISE/lib/lin64:/nfs/tools/xilinx/ise/14.7/ISE_DS/EDK/lib/lin64:$LD_LIBRARY_PATH
export WSPACE=$PRJDIR/SDK/SDK_Workspace #path to the workspace to be used.

export HWPLAT=$WSPACE/$PRJ\_hw_platform #path to the SDK hardware platform project; "hardware platform"
#export HWPLAT=$WSPACE/test_hw #path to the SDK hardware platform project; "hardware platform"


export XILINX_EDK=/nfs/tools/xilinx/ise/14.7/ISE_DS/EDK #environment variable that points to the EDK or SDK installation.
export XILINX=/nfs/tools/xilinx/ise/14.7/ISE_DS/ISE #environment variable that points to the XILINX ISE installation.
export ECLIPSE=$XILINX_EDK/eclipse/lin64/eclipse/eclipse #a shortcut to the Eclipse console application inside SDK installation
export VM=$XILINX/java6/lin64/jre/bin #Path to Java VM used by SDK.
export XILINX_SDK=$XILINX_EDK #environment variable that points to the SDK installation path.
export BSPDIR=$WSPACE/$BSPNAME #path to the SDK BSP project; "software platform"
export APPDIR=$WSPACE/$APPNAME #path to SDK C/C++ application project


module load xilinx/ise/14.7
#mkdir -p $PRJDIR/{SDK/{SDK_Workspace/$PRJ\_hw_platform,SDK_Export/hw},pcores}
#mkdir -p $APPDIR
#mkdir -p $BSPDIR
#mkdir -p $PRJDIR/data

export PP=$PWD
cd $INPUTS
#cp {$INPUTS/$MHS,$INPUTS/$XMP,mhs_update.tcl} $PRJDIR/.
#cp -r $INPUTS/$PCORELIB/edk/pcores/* $PRJDIR/pcores
#cp -r $INPUTS/$SWDIRS $APPDIR
#cp    $INPUTS/$PS7XML $PRJDIR/data
#cp    $INPUTS/$UCF $PRJDIR/data/.
#cp -r $INPUTS/Debug $APPDIR/.

cd $PP
