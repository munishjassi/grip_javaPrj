#!/bin/sh -e
#if /var/lock/LCK..ttyACM0==1 then rm /var/lock/LCK..ttyACM0

exec gnome-terminal -e {minicom -D /dev/ttyACM0 -C $SRCDIR/minicomOUT.txt}
#tclsh exec gnome-terminal -e {minicom -D /dev/ttyACM0 -C ~/zync_work/Scripts_performance/minicomOUT.txt}

#gnome-terminal -e {minicom -D /dev/ttyACM0 -C ~/zync_work/Scripts_performance/minicomOUT.txt}
#gnome-terminal -e {TERM=linux minicom -D /dev/ttyACM0 -C ~/zync_work/Scripts_performance/minicomOUT.txt}
#minicom -D /dev/ttyACM0 -C ~/Scripts_performance/minicomOUT.txt
#TERM=linux minicom -D /dev/ttyACM0 -C ~/zync_work/Scripts_performance/minicomOUT.txt
