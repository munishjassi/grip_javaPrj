set input ../system_8.mhs
set output out.adhoc.xml

set fi [open $input r]
set fo [open $output w]
catch {unset adhoc}
set TOP System


set module $TOP
while {[gets $fi line] >= 0} {
	if {[regexp INSTANCE $line]} {
		set module [lindex $line 3]
	}


	if {[regexp PORT $line]} {
		set port [lindex $line 1]
		set net [lindex $line 3]
		if {[regexp "&" $line]} {
			set net [lrange $line 3 end]
		}
		regsub -all "," $net "" net
		regsub -all "&" $net "" net
		foreach n $net {
			set pair " {$module $port}"
			append adhoc($n) $pair
		}
	}
}

puts $fo "	<spirit:adHocConnections>"
foreach p [array names adhoc] {
	puts $fo "		<spirit:adHocConnection>"
	puts $fo "			<spirit:name>$p</spirit:name>"
	puts $fo " 			<spirit:displayName></spirit:displayName>"
	puts $fo "			<spirit:description></spirit:description>"
	
	foreach k $adhoc($p) {
	if {[regexp $TOP $k]} {
		puts $fo "			<spirit:externalPortReference spirit:portRef=\"[lindex $k 1]\" spirit:left=\"0\" spirit:right=\"0\"/>"
	} else {
		puts $fo "			<spirit:internalPortReference spirit:componentRef=\"[lindex $k 0]\" spirit:portRef=\"[lindex $k 1]\" spirit:left=\"0\" spirit:right=\"0\"/>"
	}
	}
	puts $fo "		</spirit:adHocConnection>"
#	puts "[llength $adhoc($p)] $p >>>>>>> $adhoc($p)"
}

puts $fo "	</spirit:adHocConnections>"

close $fo
close $fi
