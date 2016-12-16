set inmhs ../system_8.mhs
set inport ports.xml
set outparm out.parmipxact.xml
set outport out.portipxact.xml
set f [open $inmhs r]
set fo [open $outparm w]

set TOP System 


set mod $TOP
set first 0

puts $fo "================"
puts $fo "MODULE: $mod INSTANCE: $mod"
puts $fo "================"
puts $fo "<spirit:parameters>"

while { [gets $f line]>=0 } {
if ([regexp BEGIN $line]) {
	incr first
	if {$first == 1} {
		puts $fo "</spirit:parameters>"
	}
	set mod [lindex $line 1]
	gets $f line
	puts $fo ""
	puts $fo "================"
	puts $fo "MODULE: $mod INSTANCE: [lindex $line 3]"
	puts $fo "================"
	puts $fo "<spirit:parameters>"
}

if ([regexp PARAMETER $line]) {
	set par [lindex $line 1]
	set val [lrange $line 3 end]
	puts $fo "	<spirit:parameter>"
	puts $fo "		<spirit:name>$par</spirit:name>"
	puts $fo "		<spirit:value>$val</spirit:value>"
	puts $fo "	</spirit:parameter>"
}


if ([regexp END $line]) {
	puts $fo "</spirit:parameters>"
	puts $fo ""
}
}
close $f
close $fo

#
# Generation for ports file 
#
set f [open $inmhs r]
set fo [open $outport w]

set mod System
set first 0
puts $fo "================"
puts $fo "MODULE: $mod INSTANCE: $mod"
puts $fo "================"
puts $fo "<spirit:ports>"

while { [gets $f line]>=0 } {
if ([regexp BEGIN $line]) {
	incr first
	if {$first == 1} {
		puts $fo "</spirit:ports>"
	}
	set mod [lindex $line 1]
	gets $f line
	puts $fo ""
	puts $fo "================"
	puts $fo "MODULE: $mod INSTANCE: [lindex $line 3]"
	puts $fo "================"
	puts $fo "<spirit:ports>"
}

if ([regexp PORT $line]) {
	set check 0
	set port [lindex $line 1]
	set fi [open $inport r]
	while { [gets $fi line1] >=0 } {
		if {( [regexp $port $line1] && [regexp PORT $line1]) } {
			set portconfig $line1
			set check 1
		}
		if {($check == 1)} {
			break
		}
	}
	close $fi
	if {($check == 0)} {
		puts "match not found: MODULE : $mod      PORT: $port"
	} else {
		set msb [lsearch -regexp $portconfig MSB]
		set lsb [lsearch -regexp $portconfig LSB]
		set dir [lsearch -regexp $portconfig DIR]
		set dri [lsearch -regexp $portconfig SIGIS]

		regsub DIR= [lindex $portconfig $dir] "" dir
		regsub -all {"} $dir "" dir
		if {($dir=="I")} {set dir in}
		if {($dir=="O")} {set dir out}
		if {($dir=="IO")} {set dir inout}

		if {($dri>0)} {
			regsub SIGIS= [lindex $portconfig $dri] "" dri
			regsub -all {"} $dri "" dri	
		} else {
			set dri "NOTEXIST"
		}
			

		if {($msb>=0)} {
			regsub MSB= [lindex $portconfig $msb] "" msb
			regsub -all {"} $msb "" msb
			regsub LSB= [lindex $portconfig $lsb] "" lsb
			regsub -all {"} $lsb "" lsb
			

			puts $fo "	<spirit:port>"
			puts $fo "		<spirit:name>$port</spirit:name>"
			puts $fo {		<spirit:wire spirit:allLogicalDirectionsAllowed="false">}
			puts $fo "			<spirit:direction>$dir</spirit:direction>"
			if {($dri!="NOTEXIST")} {
			puts $fo "			<spirit:driver>"
			puts $fo "				<spirit:defaultValue>$dri</spirit:defaultValue>"
			puts $fo "			</spirit:driver>"
			}
			puts $fo "			<spirit:vector>"
			puts $fo "				<spirit:left>$msb</spirit:left>"
			puts $fo "				<spirit:right>$lsb</spirit:right>"
			puts $fo "			</spirit:vector>"
			puts $fo "			<spirit:wireTypeDefs>"
			puts $fo "				<spirit:wireTypeDef>"
			puts $fo {				<spirit:typeName spirit:constrained="false">std_logic_vector</spirit:typeName>}
			puts $fo "				<spirit:typeDefinition>IEEE.std_logic_1164.all</spirit:typeDefinition>"
			puts $fo "				<spirit:viewNameRef>flat</spirit:viewNameRef>"
			puts $fo "				<spirit:viewNameRef>hierarchical</spirit:viewNameRef>"
			puts $fo "			</spirit:wireTypeDef>"
			puts $fo "		</spirit:wireTypeDefs>"
			puts $fo "	</spirit:wire>"
			puts $fo "	<spirit:vendorExtensions/>"
			puts $fo "	</spirit:port>"
		} else {
			puts $fo "	<spirit:port>"
			puts $fo "		<spirit:name>$port</spirit:name>"
			puts $fo {		<spirit:wire spirit:allLogicalDirectionsAllowed="false">}
			puts $fo "			<spirit:direction>$dir</spirit:direction>"
			if {($dri!="NOTEXIST")} {
			puts $fo "			<spirit:driver>"
			puts $fo "				<spirit:defaultValue>$dri</spirit:defaultValue>"
			puts $fo "			</spirit:driver>"
			}
			puts $fo "			<spirit:wireTypeDefs>"
			puts $fo "				<spirit:wireTypeDef>"
			puts $fo {				<spirit:typeName spirit:constrained="false">std_logic</spirit:typeName>}
			puts $fo "				<spirit:typeDefinition>IEEE.std_logic_1164.all</spirit:typeDefinition>"
			puts $fo "				<spirit:viewNameRef>flat</spirit:viewNameRef>"
			puts $fo "				<spirit:viewNameRef>hierarchical</spirit:viewNameRef>"
			puts $fo "			</spirit:wireTypeDef>"
			puts $fo "		</spirit:wireTypeDefs>"
			puts $fo "	</spirit:wire>"
			puts $fo "	<spirit:vendorExtensions/>"
			puts $fo "	</spirit:port>"

		}
	}
}

if ([regexp END $line]) {
	puts $fo "</spirit:ports>"
	puts $fo ""
}
}

close $f
close $fo
