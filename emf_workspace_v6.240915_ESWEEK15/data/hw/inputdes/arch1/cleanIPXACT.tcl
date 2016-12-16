set listfiles {
axi_clkgen_0.xml	axi_interconnect_2.xml	image_filter_top_0.xml
axi_dma_i2s.xml		axi_interconnect_3.xml	processing_system7_0.xml
axi_dma_spdif.xml	axi_spdif_tx_0.xml	System.1.0.xml
axi_dma_spd.xml		axi_spdif_tx.xml	System.design.1.0.xml
axi_hdmi_tx_16b_0.xml	axi_vdma_0.xml		test_mem_0.xml
axi_i2s_adi_0.xml	axi_vdma_1.xml		util_i2c_mixer_0.xml
axi_iic_0.xml		camera_interface_0.xml	util_vector_logic_0.xml
axi_interconnect_0.xml	cam_mem_0.xml
axi_interconnect_1.xml	clock_generator_0.xml
}


foreach fi $listfiles {

	set f [open $fi r]
	set fo [open $fi.tmp w]

	while {[gets $f line] >= 0} {
		regsub componentType $line component line
		regsub design_._type $line design line	
		puts $fo $line
	}
close $f 
close $fo
exec mv $fi.tmp $fi
}
