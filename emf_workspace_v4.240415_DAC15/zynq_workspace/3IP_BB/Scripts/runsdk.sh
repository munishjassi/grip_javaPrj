export PP=$PWD
cd $PRJDIR/SDK/SDK_Export/hw/
cp {system.bit,system.xml,ps7_init.tcl,ps7_init.c,ps7_init.h} $HWPLAT
cd $BSPDIR

appguru \
 -hw $PRJDIR/SDK/SDK_Export/hw/system.xml \
 -app empty_application \
 -pe ps7_cortexa9_0 \
 -lp /nfs/tools/xilinx/ise/14.7/ISE_DS/ISE/data/zynqconfig/ps7_internals/pcores \
 -stdin ps7_uart_1 \
 -stdout ps7_uart_1 \
 -od  $BSPDIR \
 -lp ps7_cortexa9_0 

### Command line for libgen
echo -----------------------------------------
echo Running libgen
echo -----------------------------------------  
# Not redundant: Added to overcome Server access error
cd ..
cd $BSPNAME
############

#libgen \
#-hw $PRJDIR/SDK/SDK_Export/hw/system.xml \
#-pe ps7_cortexa9_0 \
#-log libgen.log \
#-mhs $PRJDIR/$MHS \
#-lp $APPDIR/lib  \
#-lp $PRJDIR/pcores \
#-p xc7z020clg484-1 \
# system.mss

echo -----------------------------------------
echo libgen completed. Driver files generated
echo -----------------------------------------
echo ""
echo ""
echo ""
echo -----------------------------------------
echo Running Application compilation
echo -----------------------------------------

cp $BSPDIR/lscript.ld $APPDIR/src
cd $APPDIR/Debug
make clean
make all

echo -----------------------------------------
echo Application Compilation completed. Generated ELF file
echo -----------------------------------------
echo ""
echo ""
echo ""
cd $PP
