set bitFile $env(HWPLAT)/$env(SYS).bit
set tclFile $env(HWPLAT)/ps7_init.tcl 
set elfFile $env(APPDIR)/Debug/$env(APPNAME).elf

fpga -debugdevice devicenr 2 -f $bitFile
connect arm hw
rst -processor
source $tclFile
ps7_init
init_user
dow $elfFile
run
exit
