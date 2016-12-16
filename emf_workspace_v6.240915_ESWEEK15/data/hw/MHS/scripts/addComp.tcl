set in1 "out.parmipxact.xml"
set in2 "out.portipxact.xml"
set lib "/home/gu53voh/ipxact_work/Development_BAK_MAC141015/java_workspace/emf_workspace/data/hw/library_arm/v2"
set wkdir "/home/gu53voh/ipxact_work/Development_BAK_MAC141015/java_workspace/emf_workspace/data/hw/MHS/scripts/output"
#set wkdir "/home/gu53voh/ipxact_work/Development_BAK_MAC141015/java_workspace/emf_workspace/data/hw/inputdes/arch0/"
#set des "$wkdir"
set temp "$wkdir/temp"
set out "$wkdir/out"

set files [exec ls $lib]
set CHANGENAME 1

if {[file exists $temp]} {
	puts "$temp exists"
	GETTING_EXITED_HERE temp folder exists
} else {
	exec mkdir $temp
	puts "Created temporary directory $temp"
}

if {[file exists $out]} {
	puts "$out exists"
	GETTING_EXITED_HERE OUT folder exists
} else {
	exec mkdir $out
	puts "Created temporary directory $out"
}

puts ""
puts "Now Started adding Parameters to component files"

#
# Adding Parameter variables
#
set fi [open $in1 r]
while {[gets $fi line]>=0} {
	if {[regexp MODULE $line] && ![regexp TOP $line] && ![regexp interconnect $line]} {
		set mod [lindex $line 1]
		set inst [lindex $line 3]
		set found false
		foreach a $files {
			if {[regexp ^$mod $a]} { 
				set f $a 
				set found true
			}
		}
		set fii [open $lib/$f r]
		set fo [open $temp/$inst.1.0.xml w]

		while {[gets $fii iline]>=0} {
			if {$CHANGENAME == 1} {
				if {[regsub "<spirit:name>$mod</spirit:name>" $iline "<spirit:name>$inst</spirit:name>" iline]} {
					puts "Changes Name from $mod to $inst"
				}
			}
			puts $fo $iline
			if {[regexp "</spirit:model>" $iline]} {
				gets $fi line
				gets $fi line
				puts "Adding parameters to file $f, MODULE name $mod found: $found"
				puts $fo $line
				while {[gets $fi line] >= 0 && $line != "================"  } {
					puts $fo $line
				}
			}
		}
		close $fo
		close $fii
	}
}
close $fi


puts ""
puts "Now Started adding Ports to component files"
#
# Adding Ports variables
#
set fi [open $in2 r]
while {[gets $fi line]>=0} {
	if {[regexp MODULE $line] && ![regexp TOP $line] && ![regexp interconnect $line]} {
		set mod [lindex $line 1]
		set inst [lindex $line 3]
		set found false

		foreach a $files {
			if {[regexp ^$mod $a]} { 
				set f $a 
				set found true
			}
		}
		set fii [open $temp/$inst.1.0.xml r]
		#set fo [open $des/$f w]
		set fo [open $out/$inst.1.0.xml w]
	

		while {[gets $fii iline]>=0} {
			puts $fo $iline
			if {[regexp "</spirit:views>" $iline]} {
				gets $fi line
				gets $fi line
				puts "Adding ports to file $f, MODULE name $mod found: $found"
				puts $fo $line
				while {[gets $fi line] >= 0 && $line != "================"  } {
					puts $fo $line
				}
			}
		}
		close $fo
		close $fii
	}
}
close $fi
