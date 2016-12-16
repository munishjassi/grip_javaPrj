source list

foreach f $list {
	set fi [open $f r]

	regsub -all "/" $f " " f
	set out [lindex $f end]
	set pat {CPU VDMA HDMI AXI_IIC AXI_CLKGEN CLKGEN UTIL_VECTOR_LOGIC AXI_I2S_ADI AXI_DMA CAM_INTERFACE GRAY_SCALE_TOP AXI_SPDIF_TX}
	set rpat {processing_system7 axi_vdma axi_hdmi_tx_16b axi_iic axi_clkgen clock_generator util_vector_logic axi_i2s_adi axi_dma cam_interface gray_scale_top axi_spdif_tx}
	set size [llength $pat]
	set i 0
	while { $i < $size } {
		set p [lindex $pat $i]
		set rp [lindex $rpat $i]
		if { [regsub -all $p $out $rp out] } {
				puts $out
		}
		incr i
	}
	set fo [open ./new/$out w]

	while {[gets $fi line] > 0} {
		set i 0
		while { $i < $size } {
			set p [lindex $pat $i]
			set rp [lindex $rpat $i]
	#		puts "====================="
	#		puts "Replacing $p with $rp"
	#		puts "====================="
			if { [regsub -all $p $line $rp line] } {
	#			puts $out
			}
			incr i
		}
		
		puts $fo $line		
	}
	close $fi
	close $fo
}
