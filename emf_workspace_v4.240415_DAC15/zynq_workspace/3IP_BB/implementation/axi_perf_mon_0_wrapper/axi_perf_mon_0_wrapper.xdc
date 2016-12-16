set_false_path -from [all_fanout -from [get_pins -hier CORE_ACLK]] -to [all_fanout -from [get_pins -hier S_AXI_ACLK] -only_cells]
set_false_path -from [all_fanout -from [get_pins -hier S_AXI_ACLK]] -to [all_fanout -from [get_pins -hier CORE_ACLK] -only_cells]
