-------------------------------------------------------------------------------
-- system.vhd
-------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

library UNISIM;
use UNISIM.VCOMPONENTS.ALL;

entity system is
  port (
    processing_system7_0_MIO : inout std_logic_vector(53 downto 0);
    processing_system7_0_PS_SRSTB : inout std_logic;
    processing_system7_0_PS_CLK : inout std_logic;
    processing_system7_0_PS_PORB : inout std_logic;
    processing_system7_0_DDR_Clk : inout std_logic;
    processing_system7_0_DDR_Clk_n : inout std_logic;
    processing_system7_0_DDR_CKE : inout std_logic;
    processing_system7_0_DDR_CS_n : inout std_logic;
    processing_system7_0_DDR_RAS_n : inout std_logic;
    processing_system7_0_DDR_CAS_n : inout std_logic;
    processing_system7_0_DDR_WEB_pin : out std_logic;
    processing_system7_0_DDR_BankAddr : inout std_logic_vector(2 downto 0);
    processing_system7_0_DDR_Addr : inout std_logic_vector(14 downto 0);
    processing_system7_0_DDR_ODT : inout std_logic;
    processing_system7_0_DDR_DRSTB : inout std_logic;
    processing_system7_0_DDR_DQ : inout std_logic_vector(31 downto 0);
    processing_system7_0_DDR_DM : inout std_logic_vector(3 downto 0);
    processing_system7_0_DDR_DQS : inout std_logic_vector(3 downto 0);
    processing_system7_0_DDR_DQS_n : inout std_logic_vector(3 downto 0);
    processing_system7_0_DDR_VRN : inout std_logic;
    processing_system7_0_DDR_VRP : inout std_logic;
    hdmi_clk : out std_logic;
    hdmi_data : out std_logic_vector(15 downto 0);
    hdmi_hsync : out std_logic;
    hdmi_vsync : out std_logic;
    hdmi_data_e : out std_logic;
    hdmi_spdif : out std_logic;
    hdmi_int : in std_logic;
    otg_reset : out std_logic;
    otg_vbusoc : in std_logic;
    util_vector_logic_0_Op1_pin : in std_logic;
    axi_i2s_adi_0_BCLK_O_pin : out std_logic;
    axi_i2s_adi_0_LRCLK_O_pin : out std_logic;
    axi_i2s_adi_0_SDATA_I_pin : in std_logic;
    axi_i2s_adi_0_SDATA_O_pin : out std_logic;
    axi_i2s_adi_0_MCLK_pin : out std_logic;
    util_i2c_mixer_0_downstream_scl_pin : inout std_logic_vector(1 downto 0);
    util_i2c_mixer_0_downstream_sda_pin : inout std_logic_vector(1 downto 0);
    cam_mem_0_clk100 : in std_logic;
    cam_mem_0_OV7670_SIOC : out std_logic;
    cam_mem_0_OV7670_RESET : out std_logic;
    cam_mem_0_OV7670_VSYNC : in std_logic;
    cam_mem_0_OV7670_PWDN : out std_logic;
    cam_mem_0_OV7670_HREF : in std_logic;
    cam_mem_0_OV7670_PCLK : in std_logic;
    cam_mem_0_OV7670_XCLK : out std_logic;
    cam_mem_0_config_finished : out std_logic;
    cam_mem_0_btn : in std_logic;
    cam_mem_0_OV7670_SIOD : inout std_logic;
    cam_mem_0_OV7670_D : in std_logic_vector(7 downto 0)
  );
end system;

architecture STRUCTURE of system is

  component system_axi_spdif_tx_0_wrapper is
    port (
      S_AXI_ACLK : in std_logic;
      S_AXI_ARESETN : in std_logic;
      S_AXI_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_AWVALID : in std_logic;
      S_AXI_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_WVALID : in std_logic;
      S_AXI_BREADY : in std_logic;
      S_AXI_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ARVALID : in std_logic;
      S_AXI_RREADY : in std_logic;
      S_AXI_ARREADY : out std_logic;
      S_AXI_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RVALID : out std_logic;
      S_AXI_WREADY : out std_logic;
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BVALID : out std_logic;
      S_AXI_AWREADY : out std_logic;
      ACLK : in std_logic;
      ARESETN : in std_logic;
      S_AXIS_TREADY : out std_logic;
      S_AXIS_TDATA : in std_logic_vector(31 downto 0);
      S_AXIS_TLAST : in std_logic;
      S_AXIS_TVALID : in std_logic;
      spdif_data_clk : in std_logic;
      spdif_tx_o : out std_logic;
      spdif_tx_int_o : out std_logic
    );
  end component;

  component system_axi_dma_spdif_wrapper is
    port (
      s_axi_lite_aclk : in std_logic;
      m_axi_sg_aclk : in std_logic;
      m_axi_mm2s_aclk : in std_logic;
      m_axi_s2mm_aclk : in std_logic;
      axi_resetn : in std_logic;
      s_axi_lite_awvalid : in std_logic;
      s_axi_lite_awready : out std_logic;
      s_axi_lite_awaddr : in std_logic_vector(31 downto 0);
      s_axi_lite_wvalid : in std_logic;
      s_axi_lite_wready : out std_logic;
      s_axi_lite_wdata : in std_logic_vector(31 downto 0);
      s_axi_lite_bresp : out std_logic_vector(1 downto 0);
      s_axi_lite_bvalid : out std_logic;
      s_axi_lite_bready : in std_logic;
      s_axi_lite_arvalid : in std_logic;
      s_axi_lite_arready : out std_logic;
      s_axi_lite_araddr : in std_logic_vector(31 downto 0);
      s_axi_lite_rvalid : out std_logic;
      s_axi_lite_rready : in std_logic;
      s_axi_lite_rdata : out std_logic_vector(31 downto 0);
      s_axi_lite_rresp : out std_logic_vector(1 downto 0);
      m_axi_sg_awaddr : out std_logic_vector(31 downto 0);
      m_axi_sg_awlen : out std_logic_vector(7 downto 0);
      m_axi_sg_awsize : out std_logic_vector(2 downto 0);
      m_axi_sg_awburst : out std_logic_vector(1 downto 0);
      m_axi_sg_awprot : out std_logic_vector(2 downto 0);
      m_axi_sg_awcache : out std_logic_vector(3 downto 0);
      m_axi_sg_awvalid : out std_logic;
      m_axi_sg_awready : in std_logic;
      m_axi_sg_wdata : out std_logic_vector(31 downto 0);
      m_axi_sg_wstrb : out std_logic_vector(3 downto 0);
      m_axi_sg_wlast : out std_logic;
      m_axi_sg_wvalid : out std_logic;
      m_axi_sg_wready : in std_logic;
      m_axi_sg_bresp : in std_logic_vector(1 downto 0);
      m_axi_sg_bvalid : in std_logic;
      m_axi_sg_bready : out std_logic;
      m_axi_sg_araddr : out std_logic_vector(31 downto 0);
      m_axi_sg_arlen : out std_logic_vector(7 downto 0);
      m_axi_sg_arsize : out std_logic_vector(2 downto 0);
      m_axi_sg_arburst : out std_logic_vector(1 downto 0);
      m_axi_sg_arprot : out std_logic_vector(2 downto 0);
      m_axi_sg_arcache : out std_logic_vector(3 downto 0);
      m_axi_sg_arvalid : out std_logic;
      m_axi_sg_arready : in std_logic;
      m_axi_sg_rdata : in std_logic_vector(31 downto 0);
      m_axi_sg_rresp : in std_logic_vector(1 downto 0);
      m_axi_sg_rlast : in std_logic;
      m_axi_sg_rvalid : in std_logic;
      m_axi_sg_rready : out std_logic;
      m_axi_mm2s_araddr : out std_logic_vector(31 downto 0);
      m_axi_mm2s_arlen : out std_logic_vector(7 downto 0);
      m_axi_mm2s_arsize : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arburst : out std_logic_vector(1 downto 0);
      m_axi_mm2s_arprot : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arcache : out std_logic_vector(3 downto 0);
      m_axi_mm2s_arvalid : out std_logic;
      m_axi_mm2s_arready : in std_logic;
      m_axi_mm2s_rdata : in std_logic_vector(31 downto 0);
      m_axi_mm2s_rresp : in std_logic_vector(1 downto 0);
      m_axi_mm2s_rlast : in std_logic;
      m_axi_mm2s_rvalid : in std_logic;
      m_axi_mm2s_rready : out std_logic;
      mm2s_prmry_reset_out_n : out std_logic;
      m_axis_mm2s_tdata : out std_logic_vector(31 downto 0);
      m_axis_mm2s_tkeep : out std_logic_vector(3 downto 0);
      m_axis_mm2s_tvalid : out std_logic;
      m_axis_mm2s_tready : in std_logic;
      m_axis_mm2s_tlast : out std_logic;
      mm2s_cntrl_reset_out_n : out std_logic;
      m_axis_mm2s_cntrl_tdata : out std_logic_vector(31 downto 0);
      m_axis_mm2s_cntrl_tkeep : out std_logic_vector(3 downto 0);
      m_axis_mm2s_cntrl_tvalid : out std_logic;
      m_axis_mm2s_cntrl_tready : in std_logic;
      m_axis_mm2s_cntrl_tlast : out std_logic;
      m_axi_s2mm_awaddr : out std_logic_vector(31 downto 0);
      m_axi_s2mm_awlen : out std_logic_vector(7 downto 0);
      m_axi_s2mm_awsize : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awburst : out std_logic_vector(1 downto 0);
      m_axi_s2mm_awprot : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awcache : out std_logic_vector(3 downto 0);
      m_axi_s2mm_awvalid : out std_logic;
      m_axi_s2mm_awready : in std_logic;
      m_axi_s2mm_wdata : out std_logic_vector(31 downto 0);
      m_axi_s2mm_wstrb : out std_logic_vector(3 downto 0);
      m_axi_s2mm_wlast : out std_logic;
      m_axi_s2mm_wvalid : out std_logic;
      m_axi_s2mm_wready : in std_logic;
      m_axi_s2mm_bresp : in std_logic_vector(1 downto 0);
      m_axi_s2mm_bvalid : in std_logic;
      m_axi_s2mm_bready : out std_logic;
      s2mm_prmry_reset_out_n : out std_logic;
      s_axis_s2mm_tdata : in std_logic_vector(31 downto 0);
      s_axis_s2mm_tkeep : in std_logic_vector(3 downto 0);
      s_axis_s2mm_tvalid : in std_logic;
      s_axis_s2mm_tready : out std_logic;
      s_axis_s2mm_tlast : in std_logic;
      s2mm_sts_reset_out_n : out std_logic;
      s_axis_s2mm_sts_tdata : in std_logic_vector(31 downto 0);
      s_axis_s2mm_sts_tkeep : in std_logic_vector(3 downto 0);
      s_axis_s2mm_sts_tvalid : in std_logic;
      s_axis_s2mm_sts_tready : out std_logic;
      s_axis_s2mm_sts_tlast : in std_logic;
      mm2s_introut : out std_logic;
      s2mm_introut : out std_logic
    );
  end component;

  component system_axi_hdmi_tx_16b_0_wrapper is
    port (
      hdmi_ref_clk : in std_logic;
      hdmi_clk : out std_logic;
      hdmi_vsync : out std_logic;
      hdmi_hsync : out std_logic;
      hdmi_data_e : out std_logic;
      hdmi_data : out std_logic_vector(15 downto 0);
      vdma_clk : in std_logic;
      vdma_fs : out std_logic;
      vdma_fs_ret : in std_logic;
      vdma_empty : in std_logic;
      vdma_almost_empty : in std_logic;
      up_status : out std_logic_vector(7 downto 0);
      debug_trigger : out std_logic_vector(7 downto 0);
      debug_data : out std_logic_vector(63 downto 0);
      S_AXI_ACLK : in std_logic;
      S_AXI_ARESETN : in std_logic;
      S_AXI_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_AWVALID : in std_logic;
      S_AXI_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_WVALID : in std_logic;
      S_AXI_BREADY : in std_logic;
      S_AXI_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ARVALID : in std_logic;
      S_AXI_RREADY : in std_logic;
      S_AXI_ARREADY : out std_logic;
      S_AXI_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RVALID : out std_logic;
      S_AXI_WREADY : out std_logic;
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BVALID : out std_logic;
      S_AXI_AWREADY : out std_logic;
      M_AXIS_MM2S_TVALID : in std_logic;
      M_AXIS_MM2S_TKEEP : in std_logic_vector(7 downto 0);
      M_AXIS_MM2S_TDATA : in std_logic_vector(63 downto 0);
      M_AXIS_MM2S_TLAST : in std_logic;
      M_AXIS_MM2S_TREADY : out std_logic
    );
  end component;

  component system_axi_vdma_0_wrapper is
    port (
      s_axi_lite_aclk : in std_logic;
      m_axi_sg_aclk : in std_logic;
      m_axi_mm2s_aclk : in std_logic;
      m_axi_s2mm_aclk : in std_logic;
      m_axis_mm2s_aclk : in std_logic;
      s_axis_s2mm_aclk : in std_logic;
      axi_resetn : in std_logic;
      s_axi_lite_awvalid : in std_logic;
      s_axi_lite_awready : out std_logic;
      s_axi_lite_awaddr : in std_logic_vector(8 downto 0);
      s_axi_lite_wvalid : in std_logic;
      s_axi_lite_wready : out std_logic;
      s_axi_lite_wdata : in std_logic_vector(31 downto 0);
      s_axi_lite_bresp : out std_logic_vector(1 downto 0);
      s_axi_lite_bvalid : out std_logic;
      s_axi_lite_bready : in std_logic;
      s_axi_lite_arvalid : in std_logic;
      s_axi_lite_arready : out std_logic;
      s_axi_lite_araddr : in std_logic_vector(8 downto 0);
      s_axi_lite_rvalid : out std_logic;
      s_axi_lite_rready : in std_logic;
      s_axi_lite_rdata : out std_logic_vector(31 downto 0);
      s_axi_lite_rresp : out std_logic_vector(1 downto 0);
      m_axi_sg_araddr : out std_logic_vector(31 downto 0);
      m_axi_sg_arlen : out std_logic_vector(7 downto 0);
      m_axi_sg_arsize : out std_logic_vector(2 downto 0);
      m_axi_sg_arburst : out std_logic_vector(1 downto 0);
      m_axi_sg_arprot : out std_logic_vector(2 downto 0);
      m_axi_sg_arcache : out std_logic_vector(3 downto 0);
      m_axi_sg_arvalid : out std_logic;
      m_axi_sg_arready : in std_logic;
      m_axi_sg_rdata : in std_logic_vector(31 downto 0);
      m_axi_sg_rresp : in std_logic_vector(1 downto 0);
      m_axi_sg_rlast : in std_logic;
      m_axi_sg_rvalid : in std_logic;
      m_axi_sg_rready : out std_logic;
      m_axi_mm2s_araddr : out std_logic_vector(31 downto 0);
      m_axi_mm2s_arlen : out std_logic_vector(7 downto 0);
      m_axi_mm2s_arsize : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arburst : out std_logic_vector(1 downto 0);
      m_axi_mm2s_arprot : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arcache : out std_logic_vector(3 downto 0);
      m_axi_mm2s_arvalid : out std_logic;
      m_axi_mm2s_arready : in std_logic;
      m_axi_mm2s_rdata : in std_logic_vector(63 downto 0);
      m_axi_mm2s_rresp : in std_logic_vector(1 downto 0);
      m_axi_mm2s_rlast : in std_logic;
      m_axi_mm2s_rvalid : in std_logic;
      m_axi_mm2s_rready : out std_logic;
      mm2s_prmry_reset_out_n : out std_logic;
      m_axis_mm2s_tdata : out std_logic_vector(63 downto 0);
      m_axis_mm2s_tkeep : out std_logic_vector(7 downto 0);
      m_axis_mm2s_tvalid : out std_logic;
      m_axis_mm2s_tready : in std_logic;
      m_axis_mm2s_tlast : out std_logic;
      m_axis_mm2s_tuser : out std_logic_vector(0 to 0);
      m_axi_s2mm_awaddr : out std_logic_vector(31 downto 0);
      m_axi_s2mm_awlen : out std_logic_vector(7 downto 0);
      m_axi_s2mm_awsize : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awburst : out std_logic_vector(1 downto 0);
      m_axi_s2mm_awprot : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awcache : out std_logic_vector(3 downto 0);
      m_axi_s2mm_awvalid : out std_logic;
      m_axi_s2mm_awready : in std_logic;
      m_axi_s2mm_wdata : out std_logic_vector(31 downto 0);
      m_axi_s2mm_wstrb : out std_logic_vector(3 downto 0);
      m_axi_s2mm_wlast : out std_logic;
      m_axi_s2mm_wvalid : out std_logic;
      m_axi_s2mm_wready : in std_logic;
      m_axi_s2mm_bresp : in std_logic_vector(1 downto 0);
      m_axi_s2mm_bvalid : in std_logic;
      m_axi_s2mm_bready : out std_logic;
      s2mm_prmry_reset_out_n : out std_logic;
      s_axis_s2mm_tdata : in std_logic_vector(31 downto 0);
      s_axis_s2mm_tkeep : in std_logic_vector(3 downto 0);
      s_axis_s2mm_tvalid : in std_logic;
      s_axis_s2mm_tready : out std_logic;
      s_axis_s2mm_tlast : in std_logic;
      s_axis_s2mm_tuser : in std_logic_vector(0 to 0);
      mm2s_fsync : in std_logic;
      mm2s_frame_ptr_in : in std_logic_vector(5 downto 0);
      mm2s_frame_ptr_out : out std_logic_vector(5 downto 0);
      mm2s_fsync_out : out std_logic;
      mm2s_prmtr_update : out std_logic;
      mm2s_buffer_empty : out std_logic;
      mm2s_buffer_almost_empty : out std_logic;
      s2mm_fsync : in std_logic;
      s2mm_frame_ptr_in : in std_logic_vector(5 downto 0);
      s2mm_frame_ptr_out : out std_logic_vector(5 downto 0);
      s2mm_fsync_out : out std_logic;
      s2mm_buffer_full : out std_logic;
      s2mm_buffer_almost_full : out std_logic;
      s2mm_prmtr_update : out std_logic;
      mm2s_introut : out std_logic;
      s2mm_introut : out std_logic;
      axi_vdma_tstvec : out std_logic_vector(63 downto 0)
    );
  end component;

  component system_axi_dma_i2s_wrapper is
    port (
      s_axi_lite_aclk : in std_logic;
      m_axi_sg_aclk : in std_logic;
      m_axi_mm2s_aclk : in std_logic;
      m_axi_s2mm_aclk : in std_logic;
      axi_resetn : in std_logic;
      s_axi_lite_awvalid : in std_logic;
      s_axi_lite_awready : out std_logic;
      s_axi_lite_awaddr : in std_logic_vector(31 downto 0);
      s_axi_lite_wvalid : in std_logic;
      s_axi_lite_wready : out std_logic;
      s_axi_lite_wdata : in std_logic_vector(31 downto 0);
      s_axi_lite_bresp : out std_logic_vector(1 downto 0);
      s_axi_lite_bvalid : out std_logic;
      s_axi_lite_bready : in std_logic;
      s_axi_lite_arvalid : in std_logic;
      s_axi_lite_arready : out std_logic;
      s_axi_lite_araddr : in std_logic_vector(31 downto 0);
      s_axi_lite_rvalid : out std_logic;
      s_axi_lite_rready : in std_logic;
      s_axi_lite_rdata : out std_logic_vector(31 downto 0);
      s_axi_lite_rresp : out std_logic_vector(1 downto 0);
      m_axi_sg_awaddr : out std_logic_vector(31 downto 0);
      m_axi_sg_awlen : out std_logic_vector(7 downto 0);
      m_axi_sg_awsize : out std_logic_vector(2 downto 0);
      m_axi_sg_awburst : out std_logic_vector(1 downto 0);
      m_axi_sg_awprot : out std_logic_vector(2 downto 0);
      m_axi_sg_awcache : out std_logic_vector(3 downto 0);
      m_axi_sg_awvalid : out std_logic;
      m_axi_sg_awready : in std_logic;
      m_axi_sg_wdata : out std_logic_vector(31 downto 0);
      m_axi_sg_wstrb : out std_logic_vector(3 downto 0);
      m_axi_sg_wlast : out std_logic;
      m_axi_sg_wvalid : out std_logic;
      m_axi_sg_wready : in std_logic;
      m_axi_sg_bresp : in std_logic_vector(1 downto 0);
      m_axi_sg_bvalid : in std_logic;
      m_axi_sg_bready : out std_logic;
      m_axi_sg_araddr : out std_logic_vector(31 downto 0);
      m_axi_sg_arlen : out std_logic_vector(7 downto 0);
      m_axi_sg_arsize : out std_logic_vector(2 downto 0);
      m_axi_sg_arburst : out std_logic_vector(1 downto 0);
      m_axi_sg_arprot : out std_logic_vector(2 downto 0);
      m_axi_sg_arcache : out std_logic_vector(3 downto 0);
      m_axi_sg_arvalid : out std_logic;
      m_axi_sg_arready : in std_logic;
      m_axi_sg_rdata : in std_logic_vector(31 downto 0);
      m_axi_sg_rresp : in std_logic_vector(1 downto 0);
      m_axi_sg_rlast : in std_logic;
      m_axi_sg_rvalid : in std_logic;
      m_axi_sg_rready : out std_logic;
      m_axi_mm2s_araddr : out std_logic_vector(31 downto 0);
      m_axi_mm2s_arlen : out std_logic_vector(7 downto 0);
      m_axi_mm2s_arsize : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arburst : out std_logic_vector(1 downto 0);
      m_axi_mm2s_arprot : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arcache : out std_logic_vector(3 downto 0);
      m_axi_mm2s_arvalid : out std_logic;
      m_axi_mm2s_arready : in std_logic;
      m_axi_mm2s_rdata : in std_logic_vector(31 downto 0);
      m_axi_mm2s_rresp : in std_logic_vector(1 downto 0);
      m_axi_mm2s_rlast : in std_logic;
      m_axi_mm2s_rvalid : in std_logic;
      m_axi_mm2s_rready : out std_logic;
      mm2s_prmry_reset_out_n : out std_logic;
      m_axis_mm2s_tdata : out std_logic_vector(31 downto 0);
      m_axis_mm2s_tkeep : out std_logic_vector(3 downto 0);
      m_axis_mm2s_tvalid : out std_logic;
      m_axis_mm2s_tready : in std_logic;
      m_axis_mm2s_tlast : out std_logic;
      mm2s_cntrl_reset_out_n : out std_logic;
      m_axis_mm2s_cntrl_tdata : out std_logic_vector(31 downto 0);
      m_axis_mm2s_cntrl_tkeep : out std_logic_vector(3 downto 0);
      m_axis_mm2s_cntrl_tvalid : out std_logic;
      m_axis_mm2s_cntrl_tready : in std_logic;
      m_axis_mm2s_cntrl_tlast : out std_logic;
      m_axi_s2mm_awaddr : out std_logic_vector(31 downto 0);
      m_axi_s2mm_awlen : out std_logic_vector(7 downto 0);
      m_axi_s2mm_awsize : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awburst : out std_logic_vector(1 downto 0);
      m_axi_s2mm_awprot : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awcache : out std_logic_vector(3 downto 0);
      m_axi_s2mm_awvalid : out std_logic;
      m_axi_s2mm_awready : in std_logic;
      m_axi_s2mm_wdata : out std_logic_vector(31 downto 0);
      m_axi_s2mm_wstrb : out std_logic_vector(3 downto 0);
      m_axi_s2mm_wlast : out std_logic;
      m_axi_s2mm_wvalid : out std_logic;
      m_axi_s2mm_wready : in std_logic;
      m_axi_s2mm_bresp : in std_logic_vector(1 downto 0);
      m_axi_s2mm_bvalid : in std_logic;
      m_axi_s2mm_bready : out std_logic;
      s2mm_prmry_reset_out_n : out std_logic;
      s_axis_s2mm_tdata : in std_logic_vector(31 downto 0);
      s_axis_s2mm_tkeep : in std_logic_vector(3 downto 0);
      s_axis_s2mm_tvalid : in std_logic;
      s_axis_s2mm_tready : out std_logic;
      s_axis_s2mm_tlast : in std_logic;
      s2mm_sts_reset_out_n : out std_logic;
      s_axis_s2mm_sts_tdata : in std_logic_vector(31 downto 0);
      s_axis_s2mm_sts_tkeep : in std_logic_vector(3 downto 0);
      s_axis_s2mm_sts_tvalid : in std_logic;
      s_axis_s2mm_sts_tready : out std_logic;
      s_axis_s2mm_sts_tlast : in std_logic;
      mm2s_introut : out std_logic;
      s2mm_introut : out std_logic
    );
  end component;

  component system_axi_i2s_adi_0_wrapper is
    port (
      DATA_CLK_I : in std_logic;
      BCLK_O : out std_logic;
      LRCLK_O : out std_logic;
      SDATA_I : in std_logic;
      SDATA_O : out std_logic;
      MEM_RD_O : out std_logic;
      ACLK : in std_logic;
      ARESETN : in std_logic;
      S_AXIS_TREADY : out std_logic;
      S_AXIS_TDATA : in std_logic_vector(31 downto 0);
      S_AXIS_TLAST : in std_logic;
      S_AXIS_TVALID : in std_logic;
      M_AXIS_ACLK : in std_logic;
      M_AXIS_TVALID : out std_logic;
      M_AXIS_TDATA : out std_logic_vector(31 downto 0);
      M_AXIS_TLAST : out std_logic;
      M_AXIS_TREADY : in std_logic;
      M_AXIS_TKEEP : out std_logic_vector(3 downto 0);
      S_AXI_ACLK : in std_logic;
      S_AXI_ARESETN : in std_logic;
      S_AXI_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_AWVALID : in std_logic;
      S_AXI_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_WVALID : in std_logic;
      S_AXI_BREADY : in std_logic;
      S_AXI_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ARVALID : in std_logic;
      S_AXI_RREADY : in std_logic;
      S_AXI_ARREADY : out std_logic;
      S_AXI_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RVALID : out std_logic;
      S_AXI_WREADY : out std_logic;
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BVALID : out std_logic;
      S_AXI_AWREADY : out std_logic
    );
  end component;

  component system_axi_interconnect_1_wrapper is
    port (
      INTERCONNECT_ACLK : in std_logic;
      INTERCONNECT_ARESETN : in std_logic;
      S_AXI_ARESET_OUT_N : out std_logic_vector(0 to 0);
      M_AXI_ARESET_OUT_N : out std_logic_vector(10 downto 0);
      IRQ : out std_logic;
      S_AXI_ACLK : in std_logic_vector(0 to 0);
      S_AXI_AWID : in std_logic_vector(5 downto 0);
      S_AXI_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_AWLEN : in std_logic_vector(7 downto 0);
      S_AXI_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_AWUSER : in std_logic_vector(0 to 0);
      S_AXI_AWVALID : in std_logic_vector(0 to 0);
      S_AXI_AWREADY : out std_logic_vector(0 to 0);
      S_AXI_WID : in std_logic_vector(5 downto 0);
      S_AXI_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_WLAST : in std_logic_vector(0 to 0);
      S_AXI_WUSER : in std_logic_vector(0 to 0);
      S_AXI_WVALID : in std_logic_vector(0 to 0);
      S_AXI_WREADY : out std_logic_vector(0 to 0);
      S_AXI_BID : out std_logic_vector(5 downto 0);
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BUSER : out std_logic_vector(0 to 0);
      S_AXI_BVALID : out std_logic_vector(0 to 0);
      S_AXI_BREADY : in std_logic_vector(0 to 0);
      S_AXI_ARID : in std_logic_vector(5 downto 0);
      S_AXI_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ARLEN : in std_logic_vector(7 downto 0);
      S_AXI_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_ARUSER : in std_logic_vector(0 to 0);
      S_AXI_ARVALID : in std_logic_vector(0 to 0);
      S_AXI_ARREADY : out std_logic_vector(0 to 0);
      S_AXI_RID : out std_logic_vector(5 downto 0);
      S_AXI_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RLAST : out std_logic_vector(0 to 0);
      S_AXI_RUSER : out std_logic_vector(0 to 0);
      S_AXI_RVALID : out std_logic_vector(0 to 0);
      S_AXI_RREADY : in std_logic_vector(0 to 0);
      M_AXI_ACLK : in std_logic_vector(10 downto 0);
      M_AXI_AWID : out std_logic_vector(65 downto 0);
      M_AXI_AWADDR : out std_logic_vector(351 downto 0);
      M_AXI_AWLEN : out std_logic_vector(87 downto 0);
      M_AXI_AWSIZE : out std_logic_vector(32 downto 0);
      M_AXI_AWBURST : out std_logic_vector(21 downto 0);
      M_AXI_AWLOCK : out std_logic_vector(21 downto 0);
      M_AXI_AWCACHE : out std_logic_vector(43 downto 0);
      M_AXI_AWPROT : out std_logic_vector(32 downto 0);
      M_AXI_AWREGION : out std_logic_vector(43 downto 0);
      M_AXI_AWQOS : out std_logic_vector(43 downto 0);
      M_AXI_AWUSER : out std_logic_vector(10 downto 0);
      M_AXI_AWVALID : out std_logic_vector(10 downto 0);
      M_AXI_AWREADY : in std_logic_vector(10 downto 0);
      M_AXI_WID : out std_logic_vector(65 downto 0);
      M_AXI_WDATA : out std_logic_vector(351 downto 0);
      M_AXI_WSTRB : out std_logic_vector(43 downto 0);
      M_AXI_WLAST : out std_logic_vector(10 downto 0);
      M_AXI_WUSER : out std_logic_vector(10 downto 0);
      M_AXI_WVALID : out std_logic_vector(10 downto 0);
      M_AXI_WREADY : in std_logic_vector(10 downto 0);
      M_AXI_BID : in std_logic_vector(65 downto 0);
      M_AXI_BRESP : in std_logic_vector(21 downto 0);
      M_AXI_BUSER : in std_logic_vector(10 downto 0);
      M_AXI_BVALID : in std_logic_vector(10 downto 0);
      M_AXI_BREADY : out std_logic_vector(10 downto 0);
      M_AXI_ARID : out std_logic_vector(65 downto 0);
      M_AXI_ARADDR : out std_logic_vector(351 downto 0);
      M_AXI_ARLEN : out std_logic_vector(87 downto 0);
      M_AXI_ARSIZE : out std_logic_vector(32 downto 0);
      M_AXI_ARBURST : out std_logic_vector(21 downto 0);
      M_AXI_ARLOCK : out std_logic_vector(21 downto 0);
      M_AXI_ARCACHE : out std_logic_vector(43 downto 0);
      M_AXI_ARPROT : out std_logic_vector(32 downto 0);
      M_AXI_ARREGION : out std_logic_vector(43 downto 0);
      M_AXI_ARQOS : out std_logic_vector(43 downto 0);
      M_AXI_ARUSER : out std_logic_vector(10 downto 0);
      M_AXI_ARVALID : out std_logic_vector(10 downto 0);
      M_AXI_ARREADY : in std_logic_vector(10 downto 0);
      M_AXI_RID : in std_logic_vector(65 downto 0);
      M_AXI_RDATA : in std_logic_vector(351 downto 0);
      M_AXI_RRESP : in std_logic_vector(21 downto 0);
      M_AXI_RLAST : in std_logic_vector(10 downto 0);
      M_AXI_RUSER : in std_logic_vector(10 downto 0);
      M_AXI_RVALID : in std_logic_vector(10 downto 0);
      M_AXI_RREADY : out std_logic_vector(10 downto 0);
      S_AXI_CTRL_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_AWVALID : in std_logic;
      S_AXI_CTRL_AWREADY : out std_logic;
      S_AXI_CTRL_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_WVALID : in std_logic;
      S_AXI_CTRL_WREADY : out std_logic;
      S_AXI_CTRL_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_BVALID : out std_logic;
      S_AXI_CTRL_BREADY : in std_logic;
      S_AXI_CTRL_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_ARVALID : in std_logic;
      S_AXI_CTRL_ARREADY : out std_logic;
      S_AXI_CTRL_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_CTRL_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_RVALID : out std_logic;
      S_AXI_CTRL_RREADY : in std_logic;
      INTERCONNECT_ARESET_OUT_N : out std_logic;
      DEBUG_AW_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AR_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AW_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AW_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AW_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AW_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AW_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AR_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AR_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AR_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AR_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_B_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_R_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_R_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_BID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_BID_ERROR : out std_logic;
      DEBUG_RID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_RID_ERROR : out std_logic;
      DEBUG_SR_SC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_ARADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_SR_SC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_AWADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_SR_SC_BRESP : out std_logic_vector(9 downto 0);
      DEBUG_SR_SC_RDATA : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_RDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SR_SC_WDATA : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_WDATACONTROL : out std_logic_vector(6 downto 0);
      DEBUG_SC_SF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_ARADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_SC_SF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_AWADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_SC_SF_BRESP : out std_logic_vector(9 downto 0);
      DEBUG_SC_SF_RDATA : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_RDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SC_SF_WDATA : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_WDATACONTROL : out std_logic_vector(6 downto 0);
      DEBUG_SF_CB_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_ARADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_SF_CB_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_AWADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_SF_CB_BRESP : out std_logic_vector(9 downto 0);
      DEBUG_SF_CB_RDATA : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_RDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SF_CB_WDATA : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_WDATACONTROL : out std_logic_vector(6 downto 0);
      DEBUG_CB_MF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_ARADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_CB_MF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_AWADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_CB_MF_BRESP : out std_logic_vector(9 downto 0);
      DEBUG_CB_MF_RDATA : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_RDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_CB_MF_WDATA : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_WDATACONTROL : out std_logic_vector(6 downto 0);
      DEBUG_MF_MC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_ARADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_MF_MC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_AWADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_MF_MC_BRESP : out std_logic_vector(9 downto 0);
      DEBUG_MF_MC_RDATA : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_RDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MF_MC_WDATA : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_WDATACONTROL : out std_logic_vector(6 downto 0);
      DEBUG_MC_MP_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_ARADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_MC_MP_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_AWADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_MC_MP_BRESP : out std_logic_vector(9 downto 0);
      DEBUG_MC_MP_RDATA : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_RDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MC_MP_WDATA : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_WDATACONTROL : out std_logic_vector(6 downto 0);
      DEBUG_MP_MR_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_ARADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_MP_MR_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_AWADDRCONTROL : out std_logic_vector(28 downto 0);
      DEBUG_MP_MR_BRESP : out std_logic_vector(9 downto 0);
      DEBUG_MP_MR_RDATA : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_RDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MP_MR_WDATA : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_WDATACONTROL : out std_logic_vector(6 downto 0)
    );
  end component;

  component system_axi_interconnect_2_wrapper is
    port (
      INTERCONNECT_ACLK : in std_logic;
      INTERCONNECT_ARESETN : in std_logic;
      S_AXI_ARESET_OUT_N : out std_logic_vector(0 to 0);
      M_AXI_ARESET_OUT_N : out std_logic_vector(0 to 0);
      IRQ : out std_logic;
      S_AXI_ACLK : in std_logic_vector(0 to 0);
      S_AXI_AWID : in std_logic_vector(0 to 0);
      S_AXI_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_AWLEN : in std_logic_vector(7 downto 0);
      S_AXI_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_AWUSER : in std_logic_vector(0 to 0);
      S_AXI_AWVALID : in std_logic_vector(0 to 0);
      S_AXI_AWREADY : out std_logic_vector(0 to 0);
      S_AXI_WID : in std_logic_vector(0 to 0);
      S_AXI_WDATA : in std_logic_vector(63 downto 0);
      S_AXI_WSTRB : in std_logic_vector(7 downto 0);
      S_AXI_WLAST : in std_logic_vector(0 to 0);
      S_AXI_WUSER : in std_logic_vector(0 to 0);
      S_AXI_WVALID : in std_logic_vector(0 to 0);
      S_AXI_WREADY : out std_logic_vector(0 to 0);
      S_AXI_BID : out std_logic_vector(0 to 0);
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BUSER : out std_logic_vector(0 to 0);
      S_AXI_BVALID : out std_logic_vector(0 to 0);
      S_AXI_BREADY : in std_logic_vector(0 to 0);
      S_AXI_ARID : in std_logic_vector(0 to 0);
      S_AXI_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ARLEN : in std_logic_vector(7 downto 0);
      S_AXI_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_ARUSER : in std_logic_vector(0 to 0);
      S_AXI_ARVALID : in std_logic_vector(0 to 0);
      S_AXI_ARREADY : out std_logic_vector(0 to 0);
      S_AXI_RID : out std_logic_vector(0 to 0);
      S_AXI_RDATA : out std_logic_vector(63 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RLAST : out std_logic_vector(0 to 0);
      S_AXI_RUSER : out std_logic_vector(0 to 0);
      S_AXI_RVALID : out std_logic_vector(0 to 0);
      S_AXI_RREADY : in std_logic_vector(0 to 0);
      M_AXI_ACLK : in std_logic_vector(0 to 0);
      M_AXI_AWID : out std_logic_vector(0 to 0);
      M_AXI_AWADDR : out std_logic_vector(31 downto 0);
      M_AXI_AWLEN : out std_logic_vector(7 downto 0);
      M_AXI_AWSIZE : out std_logic_vector(2 downto 0);
      M_AXI_AWBURST : out std_logic_vector(1 downto 0);
      M_AXI_AWLOCK : out std_logic_vector(1 downto 0);
      M_AXI_AWCACHE : out std_logic_vector(3 downto 0);
      M_AXI_AWPROT : out std_logic_vector(2 downto 0);
      M_AXI_AWREGION : out std_logic_vector(3 downto 0);
      M_AXI_AWQOS : out std_logic_vector(3 downto 0);
      M_AXI_AWUSER : out std_logic_vector(0 to 0);
      M_AXI_AWVALID : out std_logic_vector(0 to 0);
      M_AXI_AWREADY : in std_logic_vector(0 to 0);
      M_AXI_WID : out std_logic_vector(0 to 0);
      M_AXI_WDATA : out std_logic_vector(63 downto 0);
      M_AXI_WSTRB : out std_logic_vector(7 downto 0);
      M_AXI_WLAST : out std_logic_vector(0 to 0);
      M_AXI_WUSER : out std_logic_vector(0 to 0);
      M_AXI_WVALID : out std_logic_vector(0 to 0);
      M_AXI_WREADY : in std_logic_vector(0 to 0);
      M_AXI_BID : in std_logic_vector(0 to 0);
      M_AXI_BRESP : in std_logic_vector(1 downto 0);
      M_AXI_BUSER : in std_logic_vector(0 to 0);
      M_AXI_BVALID : in std_logic_vector(0 to 0);
      M_AXI_BREADY : out std_logic_vector(0 to 0);
      M_AXI_ARID : out std_logic_vector(0 to 0);
      M_AXI_ARADDR : out std_logic_vector(31 downto 0);
      M_AXI_ARLEN : out std_logic_vector(7 downto 0);
      M_AXI_ARSIZE : out std_logic_vector(2 downto 0);
      M_AXI_ARBURST : out std_logic_vector(1 downto 0);
      M_AXI_ARLOCK : out std_logic_vector(1 downto 0);
      M_AXI_ARCACHE : out std_logic_vector(3 downto 0);
      M_AXI_ARPROT : out std_logic_vector(2 downto 0);
      M_AXI_ARREGION : out std_logic_vector(3 downto 0);
      M_AXI_ARQOS : out std_logic_vector(3 downto 0);
      M_AXI_ARUSER : out std_logic_vector(0 to 0);
      M_AXI_ARVALID : out std_logic_vector(0 to 0);
      M_AXI_ARREADY : in std_logic_vector(0 to 0);
      M_AXI_RID : in std_logic_vector(0 to 0);
      M_AXI_RDATA : in std_logic_vector(63 downto 0);
      M_AXI_RRESP : in std_logic_vector(1 downto 0);
      M_AXI_RLAST : in std_logic_vector(0 to 0);
      M_AXI_RUSER : in std_logic_vector(0 to 0);
      M_AXI_RVALID : in std_logic_vector(0 to 0);
      M_AXI_RREADY : out std_logic_vector(0 to 0);
      S_AXI_CTRL_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_AWVALID : in std_logic;
      S_AXI_CTRL_AWREADY : out std_logic;
      S_AXI_CTRL_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_WVALID : in std_logic;
      S_AXI_CTRL_WREADY : out std_logic;
      S_AXI_CTRL_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_BVALID : out std_logic;
      S_AXI_CTRL_BREADY : in std_logic;
      S_AXI_CTRL_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_ARVALID : in std_logic;
      S_AXI_CTRL_ARREADY : out std_logic;
      S_AXI_CTRL_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_CTRL_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_RVALID : out std_logic;
      S_AXI_CTRL_RREADY : in std_logic;
      INTERCONNECT_ARESET_OUT_N : out std_logic;
      DEBUG_AW_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AR_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AW_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AW_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AW_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AW_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AW_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AR_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AR_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AR_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AR_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_B_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_R_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_R_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_BID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_BID_ERROR : out std_logic;
      DEBUG_RID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_RID_ERROR : out std_logic;
      DEBUG_SR_SC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SR_SC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SR_SC_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_SR_SC_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SR_SC_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_SR_SC_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SR_SC_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SC_SF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SC_SF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SC_SF_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_SC_SF_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SC_SF_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_SC_SF_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SC_SF_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SF_CB_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SF_CB_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SF_CB_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_SF_CB_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SF_CB_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_SF_CB_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SF_CB_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_CB_MF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_CB_MF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_CB_MF_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_CB_MF_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_CB_MF_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_CB_MF_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_CB_MF_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MF_MC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MF_MC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MF_MC_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_MF_MC_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MF_MC_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_MF_MC_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MF_MC_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MC_MP_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MC_MP_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MC_MP_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_MC_MP_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MC_MP_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_MC_MP_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MC_MP_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MP_MR_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MP_MR_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MP_MR_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_MP_MR_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MP_MR_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_MP_MR_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MP_MR_WDATACONTROL : out std_logic_vector(10 downto 0)
    );
  end component;

  component system_axi_interconnect_0_wrapper is
    port (
      INTERCONNECT_ACLK : in std_logic;
      INTERCONNECT_ARESETN : in std_logic;
      S_AXI_ARESET_OUT_N : out std_logic_vector(4 downto 0);
      M_AXI_ARESET_OUT_N : out std_logic_vector(0 to 0);
      IRQ : out std_logic;
      S_AXI_ACLK : in std_logic_vector(4 downto 0);
      S_AXI_AWID : in std_logic_vector(14 downto 0);
      S_AXI_AWADDR : in std_logic_vector(159 downto 0);
      S_AXI_AWLEN : in std_logic_vector(39 downto 0);
      S_AXI_AWSIZE : in std_logic_vector(14 downto 0);
      S_AXI_AWBURST : in std_logic_vector(9 downto 0);
      S_AXI_AWLOCK : in std_logic_vector(9 downto 0);
      S_AXI_AWCACHE : in std_logic_vector(19 downto 0);
      S_AXI_AWPROT : in std_logic_vector(14 downto 0);
      S_AXI_AWQOS : in std_logic_vector(19 downto 0);
      S_AXI_AWUSER : in std_logic_vector(4 downto 0);
      S_AXI_AWVALID : in std_logic_vector(4 downto 0);
      S_AXI_AWREADY : out std_logic_vector(4 downto 0);
      S_AXI_WID : in std_logic_vector(14 downto 0);
      S_AXI_WDATA : in std_logic_vector(319 downto 0);
      S_AXI_WSTRB : in std_logic_vector(39 downto 0);
      S_AXI_WLAST : in std_logic_vector(4 downto 0);
      S_AXI_WUSER : in std_logic_vector(4 downto 0);
      S_AXI_WVALID : in std_logic_vector(4 downto 0);
      S_AXI_WREADY : out std_logic_vector(4 downto 0);
      S_AXI_BID : out std_logic_vector(14 downto 0);
      S_AXI_BRESP : out std_logic_vector(9 downto 0);
      S_AXI_BUSER : out std_logic_vector(4 downto 0);
      S_AXI_BVALID : out std_logic_vector(4 downto 0);
      S_AXI_BREADY : in std_logic_vector(4 downto 0);
      S_AXI_ARID : in std_logic_vector(14 downto 0);
      S_AXI_ARADDR : in std_logic_vector(159 downto 0);
      S_AXI_ARLEN : in std_logic_vector(39 downto 0);
      S_AXI_ARSIZE : in std_logic_vector(14 downto 0);
      S_AXI_ARBURST : in std_logic_vector(9 downto 0);
      S_AXI_ARLOCK : in std_logic_vector(9 downto 0);
      S_AXI_ARCACHE : in std_logic_vector(19 downto 0);
      S_AXI_ARPROT : in std_logic_vector(14 downto 0);
      S_AXI_ARQOS : in std_logic_vector(19 downto 0);
      S_AXI_ARUSER : in std_logic_vector(4 downto 0);
      S_AXI_ARVALID : in std_logic_vector(4 downto 0);
      S_AXI_ARREADY : out std_logic_vector(4 downto 0);
      S_AXI_RID : out std_logic_vector(14 downto 0);
      S_AXI_RDATA : out std_logic_vector(319 downto 0);
      S_AXI_RRESP : out std_logic_vector(9 downto 0);
      S_AXI_RLAST : out std_logic_vector(4 downto 0);
      S_AXI_RUSER : out std_logic_vector(4 downto 0);
      S_AXI_RVALID : out std_logic_vector(4 downto 0);
      S_AXI_RREADY : in std_logic_vector(4 downto 0);
      M_AXI_ACLK : in std_logic_vector(0 to 0);
      M_AXI_AWID : out std_logic_vector(2 downto 0);
      M_AXI_AWADDR : out std_logic_vector(31 downto 0);
      M_AXI_AWLEN : out std_logic_vector(7 downto 0);
      M_AXI_AWSIZE : out std_logic_vector(2 downto 0);
      M_AXI_AWBURST : out std_logic_vector(1 downto 0);
      M_AXI_AWLOCK : out std_logic_vector(1 downto 0);
      M_AXI_AWCACHE : out std_logic_vector(3 downto 0);
      M_AXI_AWPROT : out std_logic_vector(2 downto 0);
      M_AXI_AWREGION : out std_logic_vector(3 downto 0);
      M_AXI_AWQOS : out std_logic_vector(3 downto 0);
      M_AXI_AWUSER : out std_logic_vector(0 to 0);
      M_AXI_AWVALID : out std_logic_vector(0 to 0);
      M_AXI_AWREADY : in std_logic_vector(0 to 0);
      M_AXI_WID : out std_logic_vector(2 downto 0);
      M_AXI_WDATA : out std_logic_vector(63 downto 0);
      M_AXI_WSTRB : out std_logic_vector(7 downto 0);
      M_AXI_WLAST : out std_logic_vector(0 to 0);
      M_AXI_WUSER : out std_logic_vector(0 to 0);
      M_AXI_WVALID : out std_logic_vector(0 to 0);
      M_AXI_WREADY : in std_logic_vector(0 to 0);
      M_AXI_BID : in std_logic_vector(2 downto 0);
      M_AXI_BRESP : in std_logic_vector(1 downto 0);
      M_AXI_BUSER : in std_logic_vector(0 to 0);
      M_AXI_BVALID : in std_logic_vector(0 to 0);
      M_AXI_BREADY : out std_logic_vector(0 to 0);
      M_AXI_ARID : out std_logic_vector(2 downto 0);
      M_AXI_ARADDR : out std_logic_vector(31 downto 0);
      M_AXI_ARLEN : out std_logic_vector(7 downto 0);
      M_AXI_ARSIZE : out std_logic_vector(2 downto 0);
      M_AXI_ARBURST : out std_logic_vector(1 downto 0);
      M_AXI_ARLOCK : out std_logic_vector(1 downto 0);
      M_AXI_ARCACHE : out std_logic_vector(3 downto 0);
      M_AXI_ARPROT : out std_logic_vector(2 downto 0);
      M_AXI_ARREGION : out std_logic_vector(3 downto 0);
      M_AXI_ARQOS : out std_logic_vector(3 downto 0);
      M_AXI_ARUSER : out std_logic_vector(0 to 0);
      M_AXI_ARVALID : out std_logic_vector(0 to 0);
      M_AXI_ARREADY : in std_logic_vector(0 to 0);
      M_AXI_RID : in std_logic_vector(2 downto 0);
      M_AXI_RDATA : in std_logic_vector(63 downto 0);
      M_AXI_RRESP : in std_logic_vector(1 downto 0);
      M_AXI_RLAST : in std_logic_vector(0 to 0);
      M_AXI_RUSER : in std_logic_vector(0 to 0);
      M_AXI_RVALID : in std_logic_vector(0 to 0);
      M_AXI_RREADY : out std_logic_vector(0 to 0);
      S_AXI_CTRL_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_AWVALID : in std_logic;
      S_AXI_CTRL_AWREADY : out std_logic;
      S_AXI_CTRL_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_WVALID : in std_logic;
      S_AXI_CTRL_WREADY : out std_logic;
      S_AXI_CTRL_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_BVALID : out std_logic;
      S_AXI_CTRL_BREADY : in std_logic;
      S_AXI_CTRL_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_ARVALID : in std_logic;
      S_AXI_CTRL_ARREADY : out std_logic;
      S_AXI_CTRL_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_CTRL_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_RVALID : out std_logic;
      S_AXI_CTRL_RREADY : in std_logic;
      INTERCONNECT_ARESET_OUT_N : out std_logic;
      DEBUG_AW_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AR_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AW_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AW_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AW_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AW_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AW_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AR_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AR_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AR_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AR_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_B_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_R_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_R_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_BID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_BID_ERROR : out std_logic;
      DEBUG_RID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_RID_ERROR : out std_logic;
      DEBUG_SR_SC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_ARADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_SR_SC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_AWADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_SR_SC_BRESP : out std_logic_vector(6 downto 0);
      DEBUG_SR_SC_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SR_SC_RDATACONTROL : out std_logic_vector(7 downto 0);
      DEBUG_SR_SC_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SR_SC_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SC_SF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_ARADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_SC_SF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_AWADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_SC_SF_BRESP : out std_logic_vector(6 downto 0);
      DEBUG_SC_SF_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SC_SF_RDATACONTROL : out std_logic_vector(7 downto 0);
      DEBUG_SC_SF_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SC_SF_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SF_CB_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_ARADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_SF_CB_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_AWADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_SF_CB_BRESP : out std_logic_vector(6 downto 0);
      DEBUG_SF_CB_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SF_CB_RDATACONTROL : out std_logic_vector(7 downto 0);
      DEBUG_SF_CB_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SF_CB_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_CB_MF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_ARADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_CB_MF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_AWADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_CB_MF_BRESP : out std_logic_vector(6 downto 0);
      DEBUG_CB_MF_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_CB_MF_RDATACONTROL : out std_logic_vector(7 downto 0);
      DEBUG_CB_MF_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_CB_MF_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MF_MC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_ARADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_MF_MC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_AWADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_MF_MC_BRESP : out std_logic_vector(6 downto 0);
      DEBUG_MF_MC_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MF_MC_RDATACONTROL : out std_logic_vector(7 downto 0);
      DEBUG_MF_MC_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MF_MC_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MC_MP_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_ARADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_MC_MP_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_AWADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_MC_MP_BRESP : out std_logic_vector(6 downto 0);
      DEBUG_MC_MP_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MC_MP_RDATACONTROL : out std_logic_vector(7 downto 0);
      DEBUG_MC_MP_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MC_MP_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MP_MR_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_ARADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_MP_MR_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_AWADDRCONTROL : out std_logic_vector(25 downto 0);
      DEBUG_MP_MR_BRESP : out std_logic_vector(6 downto 0);
      DEBUG_MP_MR_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MP_MR_RDATACONTROL : out std_logic_vector(7 downto 0);
      DEBUG_MP_MR_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MP_MR_WDATACONTROL : out std_logic_vector(10 downto 0)
    );
  end component;

  component system_axi_iic_0_wrapper is
    port (
      S_AXI_ACLK : in std_logic;
      S_AXI_ARESETN : in std_logic;
      IIC2INTC_Irpt : out std_logic;
      S_AXI_AWADDR : in std_logic_vector(8 downto 0);
      S_AXI_AWVALID : in std_logic;
      S_AXI_AWREADY : out std_logic;
      S_AXI_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_WVALID : in std_logic;
      S_AXI_WREADY : out std_logic;
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BVALID : out std_logic;
      S_AXI_BREADY : in std_logic;
      S_AXI_ARADDR : in std_logic_vector(8 downto 0);
      S_AXI_ARVALID : in std_logic;
      S_AXI_ARREADY : out std_logic;
      S_AXI_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RVALID : out std_logic;
      S_AXI_RREADY : in std_logic;
      Sda_I : in std_logic;
      Sda_O : out std_logic;
      Sda_T : out std_logic;
      Scl_I : in std_logic;
      Scl_O : out std_logic;
      Scl_T : out std_logic;
      Gpo : out std_logic_vector(0 to 0)
    );
  end component;

  component system_clock_generator_0_wrapper is
    port (
      CLKIN : in std_logic;
      CLKOUT0 : out std_logic;
      CLKOUT1 : out std_logic;
      CLKOUT2 : out std_logic;
      CLKOUT3 : out std_logic;
      CLKOUT4 : out std_logic;
      CLKOUT5 : out std_logic;
      CLKOUT6 : out std_logic;
      CLKOUT7 : out std_logic;
      CLKOUT8 : out std_logic;
      CLKOUT9 : out std_logic;
      CLKOUT10 : out std_logic;
      CLKOUT11 : out std_logic;
      CLKOUT12 : out std_logic;
      CLKOUT13 : out std_logic;
      CLKOUT14 : out std_logic;
      CLKOUT15 : out std_logic;
      CLKFBIN : in std_logic;
      CLKFBOUT : out std_logic;
      PSCLK : in std_logic;
      PSEN : in std_logic;
      PSINCDEC : in std_logic;
      PSDONE : out std_logic;
      RST : in std_logic;
      LOCKED : out std_logic
    );
  end component;

  component system_axi_clkgen_0_wrapper is
    port (
      ref_clk : in std_logic;
      clk : out std_logic;
      S_AXI_ACLK : in std_logic;
      S_AXI_ARESETN : in std_logic;
      S_AXI_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_AWVALID : in std_logic;
      S_AXI_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_WVALID : in std_logic;
      S_AXI_BREADY : in std_logic;
      S_AXI_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ARVALID : in std_logic;
      S_AXI_RREADY : in std_logic;
      S_AXI_ARREADY : out std_logic;
      S_AXI_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RVALID : out std_logic;
      S_AXI_WREADY : out std_logic;
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BVALID : out std_logic;
      S_AXI_AWREADY : out std_logic
    );
  end component;

  component system_cam_mem_0_wrapper is
    port (
      clk100 : in std_logic;
      OV7670_SIOC : out std_logic;
      OV7670_SIOD : out std_logic;
      OV7670_RESET : out std_logic;
      OV7670_PWDN : out std_logic;
      OV7670_VSYNC : in std_logic;
      OV7670_HREF : in std_logic;
      OV7670_PCLK : in std_logic;
      OV7670_XCLK : out std_logic;
      OV7670_D : in std_logic_vector(7 downto 0);
      config_finished : out std_logic;
      href_negedge : out std_logic;
      href_posedge : out std_logic;
      vsync_negedge : out std_logic;
      btn : in std_logic;
      S_AXI_ACLK : in std_logic;
      S_AXI_ARESETN : in std_logic;
      S_AXI_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_AWVALID : in std_logic;
      S_AXI_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_WVALID : in std_logic;
      S_AXI_BREADY : in std_logic;
      S_AXI_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ARVALID : in std_logic;
      S_AXI_RREADY : in std_logic;
      S_AXI_ARREADY : out std_logic;
      S_AXI_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_RVALID : out std_logic;
      S_AXI_WREADY : out std_logic;
      S_AXI_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_BVALID : out std_logic;
      S_AXI_AWREADY : out std_logic;
      S_AXI_AWID : in std_logic_vector(5 downto 0);
      S_AXI_AWLEN : in std_logic_vector(7 downto 0);
      S_AXI_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_AWLOCK : in std_logic;
      S_AXI_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_WLAST : in std_logic;
      S_AXI_BID : out std_logic_vector(5 downto 0);
      S_AXI_ARID : in std_logic_vector(5 downto 0);
      S_AXI_ARLEN : in std_logic_vector(7 downto 0);
      S_AXI_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_ARLOCK : in std_logic;
      S_AXI_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_RID : out std_logic_vector(5 downto 0);
      S_AXI_RLAST : out std_logic
    );
  end component;

  component system_util_i2c_mixer_0_wrapper is
    port (
      upstream_scl_T : in std_logic;
      upstream_sda_T : in std_logic;
      upstream_scl_I : in std_logic;
      upstream_sda_I : in std_logic;
      upstream_scl_O : out std_logic;
      upstream_sda_O : out std_logic;
      downstream_scl_I : in std_logic_vector(1 downto 0);
      downstream_scl_O : out std_logic_vector(1 downto 0);
      downstream_scl_T : out std_logic;
      downstream_sda_I : in std_logic_vector(1 downto 0);
      downstream_sda_O : out std_logic_vector(1 downto 0);
      downstream_sda_T : out std_logic
    );
  end component;

  component system_util_vector_logic_0_wrapper is
    port (
      Op1 : in std_logic_vector(0 to 0);
      Op2 : in std_logic_vector(0 to 0);
      Res : out std_logic_vector(0 to 0)
    );
  end component;

  component system_processing_system7_0_wrapper is
    port (
      CAN0_PHY_TX : out std_logic;
      CAN0_PHY_RX : in std_logic;
      CAN1_PHY_TX : out std_logic;
      CAN1_PHY_RX : in std_logic;
      ENET0_GMII_TX_EN : out std_logic;
      ENET0_GMII_TX_ER : out std_logic;
      ENET0_MDIO_MDC : out std_logic;
      ENET0_MDIO_O : out std_logic;
      ENET0_MDIO_T : out std_logic;
      ENET0_PTP_DELAY_REQ_RX : out std_logic;
      ENET0_PTP_DELAY_REQ_TX : out std_logic;
      ENET0_PTP_PDELAY_REQ_RX : out std_logic;
      ENET0_PTP_PDELAY_REQ_TX : out std_logic;
      ENET0_PTP_PDELAY_RESP_RX : out std_logic;
      ENET0_PTP_PDELAY_RESP_TX : out std_logic;
      ENET0_PTP_SYNC_FRAME_RX : out std_logic;
      ENET0_PTP_SYNC_FRAME_TX : out std_logic;
      ENET0_SOF_RX : out std_logic;
      ENET0_SOF_TX : out std_logic;
      ENET0_GMII_TXD : out std_logic_vector(7 downto 0);
      ENET0_GMII_COL : in std_logic;
      ENET0_GMII_CRS : in std_logic;
      ENET0_EXT_INTIN : in std_logic;
      ENET0_GMII_RX_CLK : in std_logic;
      ENET0_GMII_RX_DV : in std_logic;
      ENET0_GMII_RX_ER : in std_logic;
      ENET0_GMII_TX_CLK : in std_logic;
      ENET0_MDIO_I : in std_logic;
      ENET0_GMII_RXD : in std_logic_vector(7 downto 0);
      ENET1_GMII_TX_EN : out std_logic;
      ENET1_GMII_TX_ER : out std_logic;
      ENET1_MDIO_MDC : out std_logic;
      ENET1_MDIO_O : out std_logic;
      ENET1_MDIO_T : out std_logic;
      ENET1_PTP_DELAY_REQ_RX : out std_logic;
      ENET1_PTP_DELAY_REQ_TX : out std_logic;
      ENET1_PTP_PDELAY_REQ_RX : out std_logic;
      ENET1_PTP_PDELAY_REQ_TX : out std_logic;
      ENET1_PTP_PDELAY_RESP_RX : out std_logic;
      ENET1_PTP_PDELAY_RESP_TX : out std_logic;
      ENET1_PTP_SYNC_FRAME_RX : out std_logic;
      ENET1_PTP_SYNC_FRAME_TX : out std_logic;
      ENET1_SOF_RX : out std_logic;
      ENET1_SOF_TX : out std_logic;
      ENET1_GMII_TXD : out std_logic_vector(7 downto 0);
      ENET1_GMII_COL : in std_logic;
      ENET1_GMII_CRS : in std_logic;
      ENET1_EXT_INTIN : in std_logic;
      ENET1_GMII_RX_CLK : in std_logic;
      ENET1_GMII_RX_DV : in std_logic;
      ENET1_GMII_RX_ER : in std_logic;
      ENET1_GMII_TX_CLK : in std_logic;
      ENET1_MDIO_I : in std_logic;
      ENET1_GMII_RXD : in std_logic_vector(7 downto 0);
      GPIO_I : in std_logic_vector(63 downto 0);
      GPIO_O : out std_logic_vector(63 downto 0);
      GPIO_T : out std_logic_vector(63 downto 0);
      I2C0_SDA_I : in std_logic;
      I2C0_SDA_O : out std_logic;
      I2C0_SDA_T : out std_logic;
      I2C0_SCL_I : in std_logic;
      I2C0_SCL_O : out std_logic;
      I2C0_SCL_T : out std_logic;
      I2C1_SDA_I : in std_logic;
      I2C1_SDA_O : out std_logic;
      I2C1_SDA_T : out std_logic;
      I2C1_SCL_I : in std_logic;
      I2C1_SCL_O : out std_logic;
      I2C1_SCL_T : out std_logic;
      PJTAG_TCK : in std_logic;
      PJTAG_TMS : in std_logic;
      PJTAG_TD_I : in std_logic;
      PJTAG_TD_T : out std_logic;
      PJTAG_TD_O : out std_logic;
      SDIO0_CLK : out std_logic;
      SDIO0_CLK_FB : in std_logic;
      SDIO0_CMD_O : out std_logic;
      SDIO0_CMD_I : in std_logic;
      SDIO0_CMD_T : out std_logic;
      SDIO0_DATA_I : in std_logic_vector(3 downto 0);
      SDIO0_DATA_O : out std_logic_vector(3 downto 0);
      SDIO0_DATA_T : out std_logic_vector(3 downto 0);
      SDIO0_LED : out std_logic;
      SDIO0_CDN : in std_logic;
      SDIO0_WP : in std_logic;
      SDIO0_BUSPOW : out std_logic;
      SDIO0_BUSVOLT : out std_logic_vector(2 downto 0);
      SDIO1_CLK : out std_logic;
      SDIO1_CLK_FB : in std_logic;
      SDIO1_CMD_O : out std_logic;
      SDIO1_CMD_I : in std_logic;
      SDIO1_CMD_T : out std_logic;
      SDIO1_DATA_I : in std_logic_vector(3 downto 0);
      SDIO1_DATA_O : out std_logic_vector(3 downto 0);
      SDIO1_DATA_T : out std_logic_vector(3 downto 0);
      SDIO1_LED : out std_logic;
      SDIO1_CDN : in std_logic;
      SDIO1_WP : in std_logic;
      SDIO1_BUSPOW : out std_logic;
      SDIO1_BUSVOLT : out std_logic_vector(2 downto 0);
      SPI0_SCLK_I : in std_logic;
      SPI0_SCLK_O : out std_logic;
      SPI0_SCLK_T : out std_logic;
      SPI0_MOSI_I : in std_logic;
      SPI0_MOSI_O : out std_logic;
      SPI0_MOSI_T : out std_logic;
      SPI0_MISO_I : in std_logic;
      SPI0_MISO_O : out std_logic;
      SPI0_MISO_T : out std_logic;
      SPI0_SS_I : in std_logic;
      SPI0_SS_O : out std_logic;
      SPI0_SS1_O : out std_logic;
      SPI0_SS2_O : out std_logic;
      SPI0_SS_T : out std_logic;
      SPI1_SCLK_I : in std_logic;
      SPI1_SCLK_O : out std_logic;
      SPI1_SCLK_T : out std_logic;
      SPI1_MOSI_I : in std_logic;
      SPI1_MOSI_O : out std_logic;
      SPI1_MOSI_T : out std_logic;
      SPI1_MISO_I : in std_logic;
      SPI1_MISO_O : out std_logic;
      SPI1_MISO_T : out std_logic;
      SPI1_SS_I : in std_logic;
      SPI1_SS_O : out std_logic;
      SPI1_SS1_O : out std_logic;
      SPI1_SS2_O : out std_logic;
      SPI1_SS_T : out std_logic;
      UART0_DTRN : out std_logic;
      UART0_RTSN : out std_logic;
      UART0_TX : out std_logic;
      UART0_CTSN : in std_logic;
      UART0_DCDN : in std_logic;
      UART0_DSRN : in std_logic;
      UART0_RIN : in std_logic;
      UART0_RX : in std_logic;
      UART1_DTRN : out std_logic;
      UART1_RTSN : out std_logic;
      UART1_TX : out std_logic;
      UART1_CTSN : in std_logic;
      UART1_DCDN : in std_logic;
      UART1_DSRN : in std_logic;
      UART1_RIN : in std_logic;
      UART1_RX : in std_logic;
      TTC0_WAVE_OUT : out std_logic_vector(2 downto 0);
      TTC0_CLK_IN : in std_logic_vector(2 downto 0);
      TTC1_WAVE_OUT : out std_logic_vector(2 downto 0);
      TTC1_CLK_IN : in std_logic_vector(2 downto 0);
      WDT_CLK_IN : in std_logic;
      WDT_RST_OUT : out std_logic;
      TRACE_CLK : in std_logic;
      TRACE_CTL : out std_logic;
      TRACE_DATA : out std_logic_vector(31 downto 0);
      USB0_PORT_INDCTL : out std_logic_vector(1 downto 0);
      USB1_PORT_INDCTL : out std_logic_vector(1 downto 0);
      USB0_VBUS_PWRSELECT : out std_logic;
      USB1_VBUS_PWRSELECT : out std_logic;
      USB0_VBUS_PWRFAULT : in std_logic;
      USB1_VBUS_PWRFAULT : in std_logic;
      SRAM_INTIN : in std_logic;
      M_AXI_GP0_ARESETN : out std_logic;
      M_AXI_GP0_ARVALID : out std_logic;
      M_AXI_GP0_AWVALID : out std_logic;
      M_AXI_GP0_BREADY : out std_logic;
      M_AXI_GP0_RREADY : out std_logic;
      M_AXI_GP0_WLAST : out std_logic;
      M_AXI_GP0_WVALID : out std_logic;
      M_AXI_GP0_ARID : out std_logic_vector(5 downto 0);
      M_AXI_GP0_AWID : out std_logic_vector(5 downto 0);
      M_AXI_GP0_WID : out std_logic_vector(5 downto 0);
      M_AXI_GP0_ARBURST : out std_logic_vector(1 downto 0);
      M_AXI_GP0_ARLOCK : out std_logic_vector(1 downto 0);
      M_AXI_GP0_ARSIZE : out std_logic_vector(2 downto 0);
      M_AXI_GP0_AWBURST : out std_logic_vector(1 downto 0);
      M_AXI_GP0_AWLOCK : out std_logic_vector(1 downto 0);
      M_AXI_GP0_AWSIZE : out std_logic_vector(2 downto 0);
      M_AXI_GP0_ARPROT : out std_logic_vector(2 downto 0);
      M_AXI_GP0_AWPROT : out std_logic_vector(2 downto 0);
      M_AXI_GP0_ARADDR : out std_logic_vector(31 downto 0);
      M_AXI_GP0_AWADDR : out std_logic_vector(31 downto 0);
      M_AXI_GP0_WDATA : out std_logic_vector(31 downto 0);
      M_AXI_GP0_ARCACHE : out std_logic_vector(3 downto 0);
      M_AXI_GP0_ARLEN : out std_logic_vector(3 downto 0);
      M_AXI_GP0_ARQOS : out std_logic_vector(3 downto 0);
      M_AXI_GP0_AWCACHE : out std_logic_vector(3 downto 0);
      M_AXI_GP0_AWLEN : out std_logic_vector(3 downto 0);
      M_AXI_GP0_AWQOS : out std_logic_vector(3 downto 0);
      M_AXI_GP0_WSTRB : out std_logic_vector(3 downto 0);
      M_AXI_GP0_ACLK : in std_logic;
      M_AXI_GP0_ARREADY : in std_logic;
      M_AXI_GP0_AWREADY : in std_logic;
      M_AXI_GP0_BVALID : in std_logic;
      M_AXI_GP0_RLAST : in std_logic;
      M_AXI_GP0_RVALID : in std_logic;
      M_AXI_GP0_WREADY : in std_logic;
      M_AXI_GP0_BID : in std_logic_vector(5 downto 0);
      M_AXI_GP0_RID : in std_logic_vector(5 downto 0);
      M_AXI_GP0_BRESP : in std_logic_vector(1 downto 0);
      M_AXI_GP0_RRESP : in std_logic_vector(1 downto 0);
      M_AXI_GP0_RDATA : in std_logic_vector(31 downto 0);
      M_AXI_GP1_ARESETN : out std_logic;
      M_AXI_GP1_ARVALID : out std_logic;
      M_AXI_GP1_AWVALID : out std_logic;
      M_AXI_GP1_BREADY : out std_logic;
      M_AXI_GP1_RREADY : out std_logic;
      M_AXI_GP1_WLAST : out std_logic;
      M_AXI_GP1_WVALID : out std_logic;
      M_AXI_GP1_ARID : out std_logic_vector(5 downto 0);
      M_AXI_GP1_AWID : out std_logic_vector(5 downto 0);
      M_AXI_GP1_WID : out std_logic_vector(5 downto 0);
      M_AXI_GP1_ARBURST : out std_logic_vector(1 downto 0);
      M_AXI_GP1_ARLOCK : out std_logic_vector(1 downto 0);
      M_AXI_GP1_ARSIZE : out std_logic_vector(2 downto 0);
      M_AXI_GP1_AWBURST : out std_logic_vector(1 downto 0);
      M_AXI_GP1_AWLOCK : out std_logic_vector(1 downto 0);
      M_AXI_GP1_AWSIZE : out std_logic_vector(2 downto 0);
      M_AXI_GP1_ARPROT : out std_logic_vector(2 downto 0);
      M_AXI_GP1_AWPROT : out std_logic_vector(2 downto 0);
      M_AXI_GP1_ARADDR : out std_logic_vector(31 downto 0);
      M_AXI_GP1_AWADDR : out std_logic_vector(31 downto 0);
      M_AXI_GP1_WDATA : out std_logic_vector(31 downto 0);
      M_AXI_GP1_ARCACHE : out std_logic_vector(3 downto 0);
      M_AXI_GP1_ARLEN : out std_logic_vector(3 downto 0);
      M_AXI_GP1_ARQOS : out std_logic_vector(3 downto 0);
      M_AXI_GP1_AWCACHE : out std_logic_vector(3 downto 0);
      M_AXI_GP1_AWLEN : out std_logic_vector(3 downto 0);
      M_AXI_GP1_AWQOS : out std_logic_vector(3 downto 0);
      M_AXI_GP1_WSTRB : out std_logic_vector(3 downto 0);
      M_AXI_GP1_ACLK : in std_logic;
      M_AXI_GP1_ARREADY : in std_logic;
      M_AXI_GP1_AWREADY : in std_logic;
      M_AXI_GP1_BVALID : in std_logic;
      M_AXI_GP1_RLAST : in std_logic;
      M_AXI_GP1_RVALID : in std_logic;
      M_AXI_GP1_WREADY : in std_logic;
      M_AXI_GP1_BID : in std_logic_vector(5 downto 0);
      M_AXI_GP1_RID : in std_logic_vector(5 downto 0);
      M_AXI_GP1_BRESP : in std_logic_vector(1 downto 0);
      M_AXI_GP1_RRESP : in std_logic_vector(1 downto 0);
      M_AXI_GP1_RDATA : in std_logic_vector(31 downto 0);
      S_AXI_GP0_ARESETN : out std_logic;
      S_AXI_GP0_ARREADY : out std_logic;
      S_AXI_GP0_AWREADY : out std_logic;
      S_AXI_GP0_BVALID : out std_logic;
      S_AXI_GP0_RLAST : out std_logic;
      S_AXI_GP0_RVALID : out std_logic;
      S_AXI_GP0_WREADY : out std_logic;
      S_AXI_GP0_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_GP0_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_GP0_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_GP0_BID : out std_logic_vector(5 downto 0);
      S_AXI_GP0_RID : out std_logic_vector(5 downto 0);
      S_AXI_GP0_ACLK : in std_logic;
      S_AXI_GP0_ARVALID : in std_logic;
      S_AXI_GP0_AWVALID : in std_logic;
      S_AXI_GP0_BREADY : in std_logic;
      S_AXI_GP0_RREADY : in std_logic;
      S_AXI_GP0_WLAST : in std_logic;
      S_AXI_GP0_WVALID : in std_logic;
      S_AXI_GP0_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_GP0_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_GP0_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_GP0_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_GP0_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_GP0_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_GP0_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_GP0_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_GP0_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_GP0_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_GP0_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_GP0_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_GP0_ARLEN : in std_logic_vector(3 downto 0);
      S_AXI_GP0_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_GP0_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_GP0_AWLEN : in std_logic_vector(3 downto 0);
      S_AXI_GP0_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_GP0_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_GP0_ARID : in std_logic_vector(5 downto 0);
      S_AXI_GP0_AWID : in std_logic_vector(5 downto 0);
      S_AXI_GP0_WID : in std_logic_vector(5 downto 0);
      S_AXI_GP1_ARESETN : out std_logic;
      S_AXI_GP1_ARREADY : out std_logic;
      S_AXI_GP1_AWREADY : out std_logic;
      S_AXI_GP1_BVALID : out std_logic;
      S_AXI_GP1_RLAST : out std_logic;
      S_AXI_GP1_RVALID : out std_logic;
      S_AXI_GP1_WREADY : out std_logic;
      S_AXI_GP1_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_GP1_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_GP1_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_GP1_BID : out std_logic_vector(5 downto 0);
      S_AXI_GP1_RID : out std_logic_vector(5 downto 0);
      S_AXI_GP1_ACLK : in std_logic;
      S_AXI_GP1_ARVALID : in std_logic;
      S_AXI_GP1_AWVALID : in std_logic;
      S_AXI_GP1_BREADY : in std_logic;
      S_AXI_GP1_RREADY : in std_logic;
      S_AXI_GP1_WLAST : in std_logic;
      S_AXI_GP1_WVALID : in std_logic;
      S_AXI_GP1_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_GP1_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_GP1_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_GP1_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_GP1_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_GP1_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_GP1_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_GP1_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_GP1_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_GP1_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_GP1_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_GP1_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_GP1_ARLEN : in std_logic_vector(3 downto 0);
      S_AXI_GP1_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_GP1_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_GP1_AWLEN : in std_logic_vector(3 downto 0);
      S_AXI_GP1_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_GP1_WSTRB : in std_logic_vector(3 downto 0);
      S_AXI_GP1_ARID : in std_logic_vector(5 downto 0);
      S_AXI_GP1_AWID : in std_logic_vector(5 downto 0);
      S_AXI_GP1_WID : in std_logic_vector(5 downto 0);
      S_AXI_ACP_ARESETN : out std_logic;
      S_AXI_ACP_AWREADY : out std_logic;
      S_AXI_ACP_ARREADY : out std_logic;
      S_AXI_ACP_BVALID : out std_logic;
      S_AXI_ACP_RLAST : out std_logic;
      S_AXI_ACP_RVALID : out std_logic;
      S_AXI_ACP_WREADY : out std_logic;
      S_AXI_ACP_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_ACP_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_ACP_BID : out std_logic_vector(2 downto 0);
      S_AXI_ACP_RID : out std_logic_vector(2 downto 0);
      S_AXI_ACP_RDATA : out std_logic_vector(63 downto 0);
      S_AXI_ACP_ACLK : in std_logic;
      S_AXI_ACP_ARVALID : in std_logic;
      S_AXI_ACP_AWVALID : in std_logic;
      S_AXI_ACP_BREADY : in std_logic;
      S_AXI_ACP_RREADY : in std_logic;
      S_AXI_ACP_WLAST : in std_logic;
      S_AXI_ACP_WVALID : in std_logic;
      S_AXI_ACP_ARID : in std_logic_vector(2 downto 0);
      S_AXI_ACP_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_ACP_AWID : in std_logic_vector(2 downto 0);
      S_AXI_ACP_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_ACP_WID : in std_logic_vector(2 downto 0);
      S_AXI_ACP_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_ACP_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_ACP_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_ACP_ARLEN : in std_logic_vector(3 downto 0);
      S_AXI_ACP_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_ACP_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_ACP_AWLEN : in std_logic_vector(3 downto 0);
      S_AXI_ACP_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_ACP_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_ACP_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_ACP_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_ACP_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_ACP_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_ACP_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_ACP_ARUSER : in std_logic_vector(4 downto 0);
      S_AXI_ACP_AWUSER : in std_logic_vector(4 downto 0);
      S_AXI_ACP_WDATA : in std_logic_vector(63 downto 0);
      S_AXI_ACP_WSTRB : in std_logic_vector(7 downto 0);
      S_AXI_HP0_ARESETN : out std_logic;
      S_AXI_HP0_ARREADY : out std_logic;
      S_AXI_HP0_AWREADY : out std_logic;
      S_AXI_HP0_BVALID : out std_logic;
      S_AXI_HP0_RLAST : out std_logic;
      S_AXI_HP0_RVALID : out std_logic;
      S_AXI_HP0_WREADY : out std_logic;
      S_AXI_HP0_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP0_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP0_BID : out std_logic_vector(0 to 0);
      S_AXI_HP0_RID : out std_logic_vector(0 to 0);
      S_AXI_HP0_RDATA : out std_logic_vector(63 downto 0);
      S_AXI_HP0_RCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP0_WCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP0_RACOUNT : out std_logic_vector(2 downto 0);
      S_AXI_HP0_WACOUNT : out std_logic_vector(5 downto 0);
      S_AXI_HP0_ACLK : in std_logic;
      S_AXI_HP0_ARVALID : in std_logic;
      S_AXI_HP0_AWVALID : in std_logic;
      S_AXI_HP0_BREADY : in std_logic;
      S_AXI_HP0_RDISSUECAP1_EN : in std_logic;
      S_AXI_HP0_RREADY : in std_logic;
      S_AXI_HP0_WLAST : in std_logic;
      S_AXI_HP0_WRISSUECAP1_EN : in std_logic;
      S_AXI_HP0_WVALID : in std_logic;
      S_AXI_HP0_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP0_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP0_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP0_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP0_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP0_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP0_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP0_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP0_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP0_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP0_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP0_ARLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP0_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP0_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP0_AWLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP0_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP0_ARID : in std_logic_vector(0 to 0);
      S_AXI_HP0_AWID : in std_logic_vector(0 to 0);
      S_AXI_HP0_WID : in std_logic_vector(0 to 0);
      S_AXI_HP0_WDATA : in std_logic_vector(63 downto 0);
      S_AXI_HP0_WSTRB : in std_logic_vector(7 downto 0);
      S_AXI_HP1_ARESETN : out std_logic;
      S_AXI_HP1_ARREADY : out std_logic;
      S_AXI_HP1_AWREADY : out std_logic;
      S_AXI_HP1_BVALID : out std_logic;
      S_AXI_HP1_RLAST : out std_logic;
      S_AXI_HP1_RVALID : out std_logic;
      S_AXI_HP1_WREADY : out std_logic;
      S_AXI_HP1_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP1_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP1_BID : out std_logic_vector(2 downto 0);
      S_AXI_HP1_RID : out std_logic_vector(2 downto 0);
      S_AXI_HP1_RDATA : out std_logic_vector(63 downto 0);
      S_AXI_HP1_RCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP1_WCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP1_RACOUNT : out std_logic_vector(2 downto 0);
      S_AXI_HP1_WACOUNT : out std_logic_vector(5 downto 0);
      S_AXI_HP1_ACLK : in std_logic;
      S_AXI_HP1_ARVALID : in std_logic;
      S_AXI_HP1_AWVALID : in std_logic;
      S_AXI_HP1_BREADY : in std_logic;
      S_AXI_HP1_RDISSUECAP1_EN : in std_logic;
      S_AXI_HP1_RREADY : in std_logic;
      S_AXI_HP1_WLAST : in std_logic;
      S_AXI_HP1_WRISSUECAP1_EN : in std_logic;
      S_AXI_HP1_WVALID : in std_logic;
      S_AXI_HP1_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP1_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP1_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP1_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP1_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP1_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP1_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP1_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP1_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP1_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP1_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP1_ARLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP1_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP1_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP1_AWLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP1_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP1_ARID : in std_logic_vector(2 downto 0);
      S_AXI_HP1_AWID : in std_logic_vector(2 downto 0);
      S_AXI_HP1_WID : in std_logic_vector(2 downto 0);
      S_AXI_HP1_WDATA : in std_logic_vector(63 downto 0);
      S_AXI_HP1_WSTRB : in std_logic_vector(7 downto 0);
      S_AXI_HP2_ARESETN : out std_logic;
      S_AXI_HP2_ARREADY : out std_logic;
      S_AXI_HP2_AWREADY : out std_logic;
      S_AXI_HP2_BVALID : out std_logic;
      S_AXI_HP2_RLAST : out std_logic;
      S_AXI_HP2_RVALID : out std_logic;
      S_AXI_HP2_WREADY : out std_logic;
      S_AXI_HP2_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP2_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP2_BID : out std_logic_vector(0 to 0);
      S_AXI_HP2_RID : out std_logic_vector(0 to 0);
      S_AXI_HP2_RDATA : out std_logic_vector(63 downto 0);
      S_AXI_HP2_RCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP2_WCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP2_RACOUNT : out std_logic_vector(2 downto 0);
      S_AXI_HP2_WACOUNT : out std_logic_vector(5 downto 0);
      S_AXI_HP2_ACLK : in std_logic;
      S_AXI_HP2_ARVALID : in std_logic;
      S_AXI_HP2_AWVALID : in std_logic;
      S_AXI_HP2_BREADY : in std_logic;
      S_AXI_HP2_RDISSUECAP1_EN : in std_logic;
      S_AXI_HP2_RREADY : in std_logic;
      S_AXI_HP2_WLAST : in std_logic;
      S_AXI_HP2_WRISSUECAP1_EN : in std_logic;
      S_AXI_HP2_WVALID : in std_logic;
      S_AXI_HP2_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP2_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP2_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP2_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP2_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP2_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP2_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP2_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP2_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP2_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP2_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP2_ARLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP2_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP2_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP2_AWLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP2_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP2_ARID : in std_logic_vector(0 to 0);
      S_AXI_HP2_AWID : in std_logic_vector(0 to 0);
      S_AXI_HP2_WID : in std_logic_vector(0 to 0);
      S_AXI_HP2_WDATA : in std_logic_vector(63 downto 0);
      S_AXI_HP2_WSTRB : in std_logic_vector(7 downto 0);
      S_AXI_HP3_ARESETN : out std_logic;
      S_AXI_HP3_ARREADY : out std_logic;
      S_AXI_HP3_AWREADY : out std_logic;
      S_AXI_HP3_BVALID : out std_logic;
      S_AXI_HP3_RLAST : out std_logic;
      S_AXI_HP3_RVALID : out std_logic;
      S_AXI_HP3_WREADY : out std_logic;
      S_AXI_HP3_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP3_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_HP3_BID : out std_logic_vector(5 downto 0);
      S_AXI_HP3_RID : out std_logic_vector(5 downto 0);
      S_AXI_HP3_RDATA : out std_logic_vector(63 downto 0);
      S_AXI_HP3_RCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP3_WCOUNT : out std_logic_vector(7 downto 0);
      S_AXI_HP3_RACOUNT : out std_logic_vector(2 downto 0);
      S_AXI_HP3_WACOUNT : out std_logic_vector(5 downto 0);
      S_AXI_HP3_ACLK : in std_logic;
      S_AXI_HP3_ARVALID : in std_logic;
      S_AXI_HP3_AWVALID : in std_logic;
      S_AXI_HP3_BREADY : in std_logic;
      S_AXI_HP3_RDISSUECAP1_EN : in std_logic;
      S_AXI_HP3_RREADY : in std_logic;
      S_AXI_HP3_WLAST : in std_logic;
      S_AXI_HP3_WRISSUECAP1_EN : in std_logic;
      S_AXI_HP3_WVALID : in std_logic;
      S_AXI_HP3_ARBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP3_ARLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP3_ARSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP3_AWBURST : in std_logic_vector(1 downto 0);
      S_AXI_HP3_AWLOCK : in std_logic_vector(1 downto 0);
      S_AXI_HP3_AWSIZE : in std_logic_vector(2 downto 0);
      S_AXI_HP3_ARPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP3_AWPROT : in std_logic_vector(2 downto 0);
      S_AXI_HP3_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP3_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_HP3_ARCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP3_ARLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP3_ARQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP3_AWCACHE : in std_logic_vector(3 downto 0);
      S_AXI_HP3_AWLEN : in std_logic_vector(3 downto 0);
      S_AXI_HP3_AWQOS : in std_logic_vector(3 downto 0);
      S_AXI_HP3_ARID : in std_logic_vector(5 downto 0);
      S_AXI_HP3_AWID : in std_logic_vector(5 downto 0);
      S_AXI_HP3_WID : in std_logic_vector(5 downto 0);
      S_AXI_HP3_WDATA : in std_logic_vector(63 downto 0);
      S_AXI_HP3_WSTRB : in std_logic_vector(7 downto 0);
      DMA0_DATYPE : out std_logic_vector(1 downto 0);
      DMA0_DAVALID : out std_logic;
      DMA0_DRREADY : out std_logic;
      DMA0_RSTN : out std_logic;
      DMA0_ACLK : in std_logic;
      DMA0_DAREADY : in std_logic;
      DMA0_DRLAST : in std_logic;
      DMA0_DRVALID : in std_logic;
      DMA0_DRTYPE : in std_logic_vector(1 downto 0);
      DMA1_DATYPE : out std_logic_vector(1 downto 0);
      DMA1_DAVALID : out std_logic;
      DMA1_DRREADY : out std_logic;
      DMA1_RSTN : out std_logic;
      DMA1_ACLK : in std_logic;
      DMA1_DAREADY : in std_logic;
      DMA1_DRLAST : in std_logic;
      DMA1_DRVALID : in std_logic;
      DMA1_DRTYPE : in std_logic_vector(1 downto 0);
      DMA2_DATYPE : out std_logic_vector(1 downto 0);
      DMA2_DAVALID : out std_logic;
      DMA2_DRREADY : out std_logic;
      DMA2_RSTN : out std_logic;
      DMA2_ACLK : in std_logic;
      DMA2_DAREADY : in std_logic;
      DMA2_DRLAST : in std_logic;
      DMA2_DRVALID : in std_logic;
      DMA3_DRVALID : in std_logic;
      DMA3_DATYPE : out std_logic_vector(1 downto 0);
      DMA3_DAVALID : out std_logic;
      DMA3_DRREADY : out std_logic;
      DMA3_RSTN : out std_logic;
      DMA3_ACLK : in std_logic;
      DMA3_DAREADY : in std_logic;
      DMA3_DRLAST : in std_logic;
      DMA2_DRTYPE : in std_logic_vector(1 downto 0);
      DMA3_DRTYPE : in std_logic_vector(1 downto 0);
      FTMD_TRACEIN_DATA : in std_logic_vector(31 downto 0);
      FTMD_TRACEIN_VALID : in std_logic;
      FTMD_TRACEIN_CLK : in std_logic;
      FTMD_TRACEIN_ATID : in std_logic_vector(3 downto 0);
      FTMT_F2P_TRIG : in std_logic_vector(3 downto 0);
      FTMT_F2P_TRIGACK : out std_logic_vector(3 downto 0);
      FTMT_F2P_DEBUG : in std_logic_vector(31 downto 0);
      FTMT_P2F_TRIGACK : in std_logic_vector(3 downto 0);
      FTMT_P2F_TRIG : out std_logic_vector(3 downto 0);
      FTMT_P2F_DEBUG : out std_logic_vector(31 downto 0);
      FCLK_CLK3 : out std_logic;
      FCLK_CLK2 : out std_logic;
      FCLK_CLK1 : out std_logic;
      FCLK_CLK0 : out std_logic;
      FCLK_CLKTRIG3_N : in std_logic;
      FCLK_CLKTRIG2_N : in std_logic;
      FCLK_CLKTRIG1_N : in std_logic;
      FCLK_CLKTRIG0_N : in std_logic;
      FCLK_RESET3_N : out std_logic;
      FCLK_RESET2_N : out std_logic;
      FCLK_RESET1_N : out std_logic;
      FCLK_RESET0_N : out std_logic;
      FPGA_IDLE_N : in std_logic;
      DDR_ARB : in std_logic_vector(3 downto 0);
      IRQ_F2P : in std_logic_vector(10 downto 0);
      Core0_nFIQ : in std_logic;
      Core0_nIRQ : in std_logic;
      Core1_nFIQ : in std_logic;
      Core1_nIRQ : in std_logic;
      EVENT_EVENTO : out std_logic;
      EVENT_STANDBYWFE : out std_logic_vector(1 downto 0);
      EVENT_STANDBYWFI : out std_logic_vector(1 downto 0);
      EVENT_EVENTI : in std_logic;
      MIO : inout std_logic_vector(53 downto 0);
      DDR_Clk : inout std_logic;
      DDR_Clk_n : inout std_logic;
      DDR_CKE : inout std_logic;
      DDR_CS_n : inout std_logic;
      DDR_RAS_n : inout std_logic;
      DDR_CAS_n : inout std_logic;
      DDR_WEB : out std_logic;
      DDR_BankAddr : inout std_logic_vector(2 downto 0);
      DDR_Addr : inout std_logic_vector(14 downto 0);
      DDR_ODT : inout std_logic;
      DDR_DRSTB : inout std_logic;
      DDR_DQ : inout std_logic_vector(31 downto 0);
      DDR_DM : inout std_logic_vector(3 downto 0);
      DDR_DQS : inout std_logic_vector(3 downto 0);
      DDR_DQS_n : inout std_logic_vector(3 downto 0);
      DDR_VRN : inout std_logic;
      DDR_VRP : inout std_logic;
      PS_SRSTB : inout std_logic;
      PS_CLK : inout std_logic;
      PS_PORB : inout std_logic;
      IRQ_P2F_DMAC_ABORT : out std_logic;
      IRQ_P2F_DMAC0 : out std_logic;
      IRQ_P2F_DMAC1 : out std_logic;
      IRQ_P2F_DMAC2 : out std_logic;
      IRQ_P2F_DMAC3 : out std_logic;
      IRQ_P2F_DMAC4 : out std_logic;
      IRQ_P2F_DMAC5 : out std_logic;
      IRQ_P2F_DMAC6 : out std_logic;
      IRQ_P2F_DMAC7 : out std_logic;
      IRQ_P2F_SMC : out std_logic;
      IRQ_P2F_QSPI : out std_logic;
      IRQ_P2F_CTI : out std_logic;
      IRQ_P2F_GPIO : out std_logic;
      IRQ_P2F_USB0 : out std_logic;
      IRQ_P2F_ENET0 : out std_logic;
      IRQ_P2F_ENET_WAKE0 : out std_logic;
      IRQ_P2F_SDIO0 : out std_logic;
      IRQ_P2F_I2C0 : out std_logic;
      IRQ_P2F_SPI0 : out std_logic;
      IRQ_P2F_UART0 : out std_logic;
      IRQ_P2F_CAN0 : out std_logic;
      IRQ_P2F_USB1 : out std_logic;
      IRQ_P2F_ENET1 : out std_logic;
      IRQ_P2F_ENET_WAKE1 : out std_logic;
      IRQ_P2F_SDIO1 : out std_logic;
      IRQ_P2F_I2C1 : out std_logic;
      IRQ_P2F_SPI1 : out std_logic;
      IRQ_P2F_UART1 : out std_logic;
      IRQ_P2F_CAN1 : out std_logic
    );
  end component;

  component system_axi_vdma_1_wrapper is
    port (
      s_axi_lite_aclk : in std_logic;
      m_axi_sg_aclk : in std_logic;
      m_axi_mm2s_aclk : in std_logic;
      m_axi_s2mm_aclk : in std_logic;
      m_axis_mm2s_aclk : in std_logic;
      s_axis_s2mm_aclk : in std_logic;
      axi_resetn : in std_logic;
      s_axi_lite_awvalid : in std_logic;
      s_axi_lite_awready : out std_logic;
      s_axi_lite_awaddr : in std_logic_vector(8 downto 0);
      s_axi_lite_wvalid : in std_logic;
      s_axi_lite_wready : out std_logic;
      s_axi_lite_wdata : in std_logic_vector(31 downto 0);
      s_axi_lite_bresp : out std_logic_vector(1 downto 0);
      s_axi_lite_bvalid : out std_logic;
      s_axi_lite_bready : in std_logic;
      s_axi_lite_arvalid : in std_logic;
      s_axi_lite_arready : out std_logic;
      s_axi_lite_araddr : in std_logic_vector(8 downto 0);
      s_axi_lite_rvalid : out std_logic;
      s_axi_lite_rready : in std_logic;
      s_axi_lite_rdata : out std_logic_vector(31 downto 0);
      s_axi_lite_rresp : out std_logic_vector(1 downto 0);
      m_axi_sg_araddr : out std_logic_vector(31 downto 0);
      m_axi_sg_arlen : out std_logic_vector(7 downto 0);
      m_axi_sg_arsize : out std_logic_vector(2 downto 0);
      m_axi_sg_arburst : out std_logic_vector(1 downto 0);
      m_axi_sg_arprot : out std_logic_vector(2 downto 0);
      m_axi_sg_arcache : out std_logic_vector(3 downto 0);
      m_axi_sg_arvalid : out std_logic;
      m_axi_sg_arready : in std_logic;
      m_axi_sg_rdata : in std_logic_vector(31 downto 0);
      m_axi_sg_rresp : in std_logic_vector(1 downto 0);
      m_axi_sg_rlast : in std_logic;
      m_axi_sg_rvalid : in std_logic;
      m_axi_sg_rready : out std_logic;
      m_axi_mm2s_araddr : out std_logic_vector(31 downto 0);
      m_axi_mm2s_arlen : out std_logic_vector(7 downto 0);
      m_axi_mm2s_arsize : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arburst : out std_logic_vector(1 downto 0);
      m_axi_mm2s_arprot : out std_logic_vector(2 downto 0);
      m_axi_mm2s_arcache : out std_logic_vector(3 downto 0);
      m_axi_mm2s_arvalid : out std_logic;
      m_axi_mm2s_arready : in std_logic;
      m_axi_mm2s_rdata : in std_logic_vector(63 downto 0);
      m_axi_mm2s_rresp : in std_logic_vector(1 downto 0);
      m_axi_mm2s_rlast : in std_logic;
      m_axi_mm2s_rvalid : in std_logic;
      m_axi_mm2s_rready : out std_logic;
      mm2s_prmry_reset_out_n : out std_logic;
      m_axis_mm2s_tdata : out std_logic_vector(31 downto 0);
      m_axis_mm2s_tkeep : out std_logic_vector(3 downto 0);
      m_axis_mm2s_tvalid : out std_logic;
      m_axis_mm2s_tready : in std_logic;
      m_axis_mm2s_tlast : out std_logic;
      m_axis_mm2s_tuser : out std_logic_vector(0 to 0);
      m_axi_s2mm_awaddr : out std_logic_vector(31 downto 0);
      m_axi_s2mm_awlen : out std_logic_vector(7 downto 0);
      m_axi_s2mm_awsize : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awburst : out std_logic_vector(1 downto 0);
      m_axi_s2mm_awprot : out std_logic_vector(2 downto 0);
      m_axi_s2mm_awcache : out std_logic_vector(3 downto 0);
      m_axi_s2mm_awvalid : out std_logic;
      m_axi_s2mm_awready : in std_logic;
      m_axi_s2mm_wdata : out std_logic_vector(63 downto 0);
      m_axi_s2mm_wstrb : out std_logic_vector(7 downto 0);
      m_axi_s2mm_wlast : out std_logic;
      m_axi_s2mm_wvalid : out std_logic;
      m_axi_s2mm_wready : in std_logic;
      m_axi_s2mm_bresp : in std_logic_vector(1 downto 0);
      m_axi_s2mm_bvalid : in std_logic;
      m_axi_s2mm_bready : out std_logic;
      s2mm_prmry_reset_out_n : out std_logic;
      s_axis_s2mm_tdata : in std_logic_vector(31 downto 0);
      s_axis_s2mm_tkeep : in std_logic_vector(3 downto 0);
      s_axis_s2mm_tvalid : in std_logic;
      s_axis_s2mm_tready : out std_logic;
      s_axis_s2mm_tlast : in std_logic;
      s_axis_s2mm_tuser : in std_logic_vector(0 to 0);
      mm2s_fsync : in std_logic;
      mm2s_frame_ptr_in : in std_logic_vector(5 downto 0);
      mm2s_frame_ptr_out : out std_logic_vector(5 downto 0);
      mm2s_fsync_out : out std_logic;
      mm2s_prmtr_update : out std_logic;
      mm2s_buffer_empty : out std_logic;
      mm2s_buffer_almost_empty : out std_logic;
      s2mm_fsync : in std_logic;
      s2mm_frame_ptr_in : in std_logic_vector(5 downto 0);
      s2mm_frame_ptr_out : out std_logic_vector(5 downto 0);
      s2mm_fsync_out : out std_logic;
      s2mm_buffer_full : out std_logic;
      s2mm_buffer_almost_full : out std_logic;
      s2mm_prmtr_update : out std_logic;
      mm2s_introut : out std_logic;
      s2mm_introut : out std_logic;
      axi_vdma_tstvec : out std_logic_vector(63 downto 0)
    );
  end component;

  component system_sobel_filter_top_0_wrapper is
    port (
      aclk : in std_logic;
      aresetn : in std_logic;
      s_axi_CONTROL_BUS_AWADDR : in std_logic_vector(4 downto 0);
      s_axi_CONTROL_BUS_AWVALID : in std_logic;
      s_axi_CONTROL_BUS_AWREADY : out std_logic;
      s_axi_CONTROL_BUS_WDATA : in std_logic_vector(31 downto 0);
      s_axi_CONTROL_BUS_WSTRB : in std_logic_vector(3 downto 0);
      s_axi_CONTROL_BUS_WVALID : in std_logic;
      s_axi_CONTROL_BUS_WREADY : out std_logic;
      s_axi_CONTROL_BUS_BRESP : out std_logic_vector(1 downto 0);
      s_axi_CONTROL_BUS_BVALID : out std_logic;
      s_axi_CONTROL_BUS_BREADY : in std_logic;
      s_axi_CONTROL_BUS_ARADDR : in std_logic_vector(4 downto 0);
      s_axi_CONTROL_BUS_ARVALID : in std_logic;
      s_axi_CONTROL_BUS_ARREADY : out std_logic;
      s_axi_CONTROL_BUS_RDATA : out std_logic_vector(31 downto 0);
      s_axi_CONTROL_BUS_RRESP : out std_logic_vector(1 downto 0);
      s_axi_CONTROL_BUS_RVALID : out std_logic;
      s_axi_CONTROL_BUS_RREADY : in std_logic;
      interrupt : out std_logic;
      INPUT_STREAM_TVALID : in std_logic;
      INPUT_STREAM_TREADY : out std_logic;
      INPUT_STREAM_TDATA : in std_logic_vector(31 downto 0);
      INPUT_STREAM_TSTRB : in std_logic_vector(3 downto 0);
      INPUT_STREAM_TUSER : in std_logic_vector(0 to 0);
      INPUT_STREAM_TLAST : in std_logic_vector(0 to 0);
      INPUT_STREAM_TDEST : in std_logic_vector(0 to 0);
      OUTPUT_STREAM_TVALID : out std_logic;
      OUTPUT_STREAM_TREADY : in std_logic;
      OUTPUT_STREAM_TDATA : out std_logic_vector(31 downto 0);
      OUTPUT_STREAM_TSTRB : out std_logic_vector(3 downto 0);
      OUTPUT_STREAM_TUSER : out std_logic_vector(0 to 0);
      OUTPUT_STREAM_TLAST : out std_logic_vector(0 to 0);
      OUTPUT_STREAM_TDEST : out std_logic_vector(0 to 0)
    );
  end component;

  component system_axi_interconnect_3_wrapper is
    port (
      INTERCONNECT_ACLK : in std_logic;
      INTERCONNECT_ARESETN : in std_logic;
      S_AXI_ARESET_OUT_N : out std_logic_vector(1 downto 0);
      M_AXI_ARESET_OUT_N : out std_logic_vector(0 to 0);
      IRQ : out std_logic;
      S_AXI_ACLK : in std_logic_vector(1 downto 0);
      S_AXI_AWID : in std_logic_vector(1 downto 0);
      S_AXI_AWADDR : in std_logic_vector(63 downto 0);
      S_AXI_AWLEN : in std_logic_vector(15 downto 0);
      S_AXI_AWSIZE : in std_logic_vector(5 downto 0);
      S_AXI_AWBURST : in std_logic_vector(3 downto 0);
      S_AXI_AWLOCK : in std_logic_vector(3 downto 0);
      S_AXI_AWCACHE : in std_logic_vector(7 downto 0);
      S_AXI_AWPROT : in std_logic_vector(5 downto 0);
      S_AXI_AWQOS : in std_logic_vector(7 downto 0);
      S_AXI_AWUSER : in std_logic_vector(1 downto 0);
      S_AXI_AWVALID : in std_logic_vector(1 downto 0);
      S_AXI_AWREADY : out std_logic_vector(1 downto 0);
      S_AXI_WID : in std_logic_vector(1 downto 0);
      S_AXI_WDATA : in std_logic_vector(127 downto 0);
      S_AXI_WSTRB : in std_logic_vector(15 downto 0);
      S_AXI_WLAST : in std_logic_vector(1 downto 0);
      S_AXI_WUSER : in std_logic_vector(1 downto 0);
      S_AXI_WVALID : in std_logic_vector(1 downto 0);
      S_AXI_WREADY : out std_logic_vector(1 downto 0);
      S_AXI_BID : out std_logic_vector(1 downto 0);
      S_AXI_BRESP : out std_logic_vector(3 downto 0);
      S_AXI_BUSER : out std_logic_vector(1 downto 0);
      S_AXI_BVALID : out std_logic_vector(1 downto 0);
      S_AXI_BREADY : in std_logic_vector(1 downto 0);
      S_AXI_ARID : in std_logic_vector(1 downto 0);
      S_AXI_ARADDR : in std_logic_vector(63 downto 0);
      S_AXI_ARLEN : in std_logic_vector(15 downto 0);
      S_AXI_ARSIZE : in std_logic_vector(5 downto 0);
      S_AXI_ARBURST : in std_logic_vector(3 downto 0);
      S_AXI_ARLOCK : in std_logic_vector(3 downto 0);
      S_AXI_ARCACHE : in std_logic_vector(7 downto 0);
      S_AXI_ARPROT : in std_logic_vector(5 downto 0);
      S_AXI_ARQOS : in std_logic_vector(7 downto 0);
      S_AXI_ARUSER : in std_logic_vector(1 downto 0);
      S_AXI_ARVALID : in std_logic_vector(1 downto 0);
      S_AXI_ARREADY : out std_logic_vector(1 downto 0);
      S_AXI_RID : out std_logic_vector(1 downto 0);
      S_AXI_RDATA : out std_logic_vector(127 downto 0);
      S_AXI_RRESP : out std_logic_vector(3 downto 0);
      S_AXI_RLAST : out std_logic_vector(1 downto 0);
      S_AXI_RUSER : out std_logic_vector(1 downto 0);
      S_AXI_RVALID : out std_logic_vector(1 downto 0);
      S_AXI_RREADY : in std_logic_vector(1 downto 0);
      M_AXI_ACLK : in std_logic_vector(0 to 0);
      M_AXI_AWID : out std_logic_vector(0 to 0);
      M_AXI_AWADDR : out std_logic_vector(31 downto 0);
      M_AXI_AWLEN : out std_logic_vector(7 downto 0);
      M_AXI_AWSIZE : out std_logic_vector(2 downto 0);
      M_AXI_AWBURST : out std_logic_vector(1 downto 0);
      M_AXI_AWLOCK : out std_logic_vector(1 downto 0);
      M_AXI_AWCACHE : out std_logic_vector(3 downto 0);
      M_AXI_AWPROT : out std_logic_vector(2 downto 0);
      M_AXI_AWREGION : out std_logic_vector(3 downto 0);
      M_AXI_AWQOS : out std_logic_vector(3 downto 0);
      M_AXI_AWUSER : out std_logic_vector(0 to 0);
      M_AXI_AWVALID : out std_logic_vector(0 to 0);
      M_AXI_AWREADY : in std_logic_vector(0 to 0);
      M_AXI_WID : out std_logic_vector(0 to 0);
      M_AXI_WDATA : out std_logic_vector(63 downto 0);
      M_AXI_WSTRB : out std_logic_vector(7 downto 0);
      M_AXI_WLAST : out std_logic_vector(0 to 0);
      M_AXI_WUSER : out std_logic_vector(0 to 0);
      M_AXI_WVALID : out std_logic_vector(0 to 0);
      M_AXI_WREADY : in std_logic_vector(0 to 0);
      M_AXI_BID : in std_logic_vector(0 to 0);
      M_AXI_BRESP : in std_logic_vector(1 downto 0);
      M_AXI_BUSER : in std_logic_vector(0 to 0);
      M_AXI_BVALID : in std_logic_vector(0 to 0);
      M_AXI_BREADY : out std_logic_vector(0 to 0);
      M_AXI_ARID : out std_logic_vector(0 to 0);
      M_AXI_ARADDR : out std_logic_vector(31 downto 0);
      M_AXI_ARLEN : out std_logic_vector(7 downto 0);
      M_AXI_ARSIZE : out std_logic_vector(2 downto 0);
      M_AXI_ARBURST : out std_logic_vector(1 downto 0);
      M_AXI_ARLOCK : out std_logic_vector(1 downto 0);
      M_AXI_ARCACHE : out std_logic_vector(3 downto 0);
      M_AXI_ARPROT : out std_logic_vector(2 downto 0);
      M_AXI_ARREGION : out std_logic_vector(3 downto 0);
      M_AXI_ARQOS : out std_logic_vector(3 downto 0);
      M_AXI_ARUSER : out std_logic_vector(0 to 0);
      M_AXI_ARVALID : out std_logic_vector(0 to 0);
      M_AXI_ARREADY : in std_logic_vector(0 to 0);
      M_AXI_RID : in std_logic_vector(0 to 0);
      M_AXI_RDATA : in std_logic_vector(63 downto 0);
      M_AXI_RRESP : in std_logic_vector(1 downto 0);
      M_AXI_RLAST : in std_logic_vector(0 to 0);
      M_AXI_RUSER : in std_logic_vector(0 to 0);
      M_AXI_RVALID : in std_logic_vector(0 to 0);
      M_AXI_RREADY : out std_logic_vector(0 to 0);
      S_AXI_CTRL_AWADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_AWVALID : in std_logic;
      S_AXI_CTRL_AWREADY : out std_logic;
      S_AXI_CTRL_WDATA : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_WVALID : in std_logic;
      S_AXI_CTRL_WREADY : out std_logic;
      S_AXI_CTRL_BRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_BVALID : out std_logic;
      S_AXI_CTRL_BREADY : in std_logic;
      S_AXI_CTRL_ARADDR : in std_logic_vector(31 downto 0);
      S_AXI_CTRL_ARVALID : in std_logic;
      S_AXI_CTRL_ARREADY : out std_logic;
      S_AXI_CTRL_RDATA : out std_logic_vector(31 downto 0);
      S_AXI_CTRL_RRESP : out std_logic_vector(1 downto 0);
      S_AXI_CTRL_RVALID : out std_logic;
      S_AXI_CTRL_RREADY : in std_logic;
      INTERCONNECT_ARESET_OUT_N : out std_logic;
      DEBUG_AW_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AR_ARB_GRANT : out std_logic_vector(7 downto 0);
      DEBUG_AW_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AW_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AW_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AW_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AW_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AW_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_TRANS_QUAL : out std_logic_vector(0 to 0);
      DEBUG_AR_ACCEPT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_THREAD : out std_logic_vector(15 downto 0);
      DEBUG_AR_ACTIVE_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_AR_ACTIVE_REGION : out std_logic_vector(7 downto 0);
      DEBUG_AR_ERROR : out std_logic_vector(7 downto 0);
      DEBUG_AR_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_B_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_R_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_R_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_AW_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_AR_ISSUING_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_BEAT_CNT : out std_logic_vector(7 downto 0);
      DEBUG_W_TRANS_SEQ : out std_logic_vector(7 downto 0);
      DEBUG_BID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_BID_ERROR : out std_logic;
      DEBUG_RID_TARGET : out std_logic_vector(7 downto 0);
      DEBUG_RID_ERROR : out std_logic;
      DEBUG_SR_SC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SR_SC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SR_SC_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SR_SC_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_SR_SC_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SR_SC_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_SR_SC_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SR_SC_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SC_SF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SC_SF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SC_SF_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SC_SF_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_SC_SF_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SC_SF_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_SC_SF_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SC_SF_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_SF_CB_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SF_CB_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_SF_CB_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_SF_CB_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_SF_CB_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_SF_CB_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_SF_CB_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_SF_CB_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_CB_MF_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_CB_MF_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_CB_MF_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_CB_MF_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_CB_MF_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_CB_MF_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_CB_MF_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_CB_MF_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MF_MC_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MF_MC_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MF_MC_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MF_MC_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_MF_MC_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MF_MC_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_MF_MC_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MF_MC_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MC_MP_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MC_MP_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MC_MP_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MC_MP_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_MC_MP_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MC_MP_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_MC_MP_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MC_MP_WDATACONTROL : out std_logic_vector(10 downto 0);
      DEBUG_MP_MR_ARADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_ARADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MP_MR_AWADDR : out std_logic_vector(31 downto 0);
      DEBUG_MP_MR_AWADDRCONTROL : out std_logic_vector(23 downto 0);
      DEBUG_MP_MR_BRESP : out std_logic_vector(4 downto 0);
      DEBUG_MP_MR_RDATA : out std_logic_vector(63 downto 0);
      DEBUG_MP_MR_RDATACONTROL : out std_logic_vector(5 downto 0);
      DEBUG_MP_MR_WDATA : out std_logic_vector(63 downto 0);
      DEBUG_MP_MR_WDATACONTROL : out std_logic_vector(10 downto 0)
    );
  end component;

  component IOBUF is
    port (
      I : in std_logic;
      IO : inout std_logic;
      O : out std_logic;
      T : in std_logic
    );
  end component;

  -- Internal signals

  signal axi_clkgen_0_clk : std_logic;
  signal axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TDATA : std_logic_vector(31 downto 0);
  signal axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TLAST : std_logic;
  signal axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TREADY : std_logic;
  signal axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TVALID : std_logic;
  signal axi_dma_i2s_mm2s_introut : std_logic;
  signal axi_dma_i2s_s2mm_introut : std_logic;
  signal axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TDATA : std_logic_vector(31 downto 0);
  signal axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TLAST : std_logic;
  signal axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TREADY : std_logic;
  signal axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TVALID : std_logic;
  signal axi_dma_spdif_mm2s_introut : std_logic;
  signal axi_hdmi_tx_16b_0_hdmi_clk : std_logic;
  signal axi_hdmi_tx_16b_0_hdmi_data : std_logic_vector(15 downto 0);
  signal axi_hdmi_tx_16b_0_hdmi_data_e : std_logic;
  signal axi_hdmi_tx_16b_0_hdmi_hsync : std_logic;
  signal axi_hdmi_tx_16b_0_hdmi_vsync : std_logic;
  signal axi_i2s_adi_0_BCLK_O : std_logic;
  signal axi_i2s_adi_0_LRCLK_O : std_logic;
  signal axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TDATA : std_logic_vector(31 downto 0);
  signal axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TKEEP : std_logic_vector(3 downto 0);
  signal axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TLAST : std_logic;
  signal axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TREADY : std_logic;
  signal axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TVALID : std_logic;
  signal axi_i2s_adi_0_SDATA_I : std_logic;
  signal axi_i2s_adi_0_SDATA_O : std_logic;
  signal axi_iic_0_IIC2INTC_Irpt : std_logic;
  signal axi_interconnect_0_INTERCONNECT_ARESETN : std_logic;
  signal axi_interconnect_0_M_ARADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_0_M_ARBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_0_M_ARCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_0_M_ARID : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_ARLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_0_M_ARLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_0_M_ARPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_ARQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_0_M_ARREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_ARSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_ARVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_AWADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_0_M_AWBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_0_M_AWCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_0_M_AWID : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_AWLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_0_M_AWLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_0_M_AWPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_AWQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_0_M_AWREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_AWSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_AWVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_BID : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_BREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_BRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_0_M_BVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_RDATA : std_logic_vector(63 downto 0);
  signal axi_interconnect_0_M_RID : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_RLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_RREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_RRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_0_M_RVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_WDATA : std_logic_vector(63 downto 0);
  signal axi_interconnect_0_M_WID : std_logic_vector(2 downto 0);
  signal axi_interconnect_0_M_WLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_WREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_0_M_WSTRB : std_logic_vector(7 downto 0);
  signal axi_interconnect_0_M_WVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_0_S_ARADDR : std_logic_vector(159 downto 0);
  signal axi_interconnect_0_S_ARBURST : std_logic_vector(9 downto 0);
  signal axi_interconnect_0_S_ARCACHE : std_logic_vector(19 downto 0);
  signal axi_interconnect_0_S_ARLEN : std_logic_vector(39 downto 0);
  signal axi_interconnect_0_S_ARPROT : std_logic_vector(14 downto 0);
  signal axi_interconnect_0_S_ARREADY : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_ARSIZE : std_logic_vector(14 downto 0);
  signal axi_interconnect_0_S_ARVALID : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_AWADDR : std_logic_vector(159 downto 0);
  signal axi_interconnect_0_S_AWBURST : std_logic_vector(9 downto 0);
  signal axi_interconnect_0_S_AWCACHE : std_logic_vector(19 downto 0);
  signal axi_interconnect_0_S_AWLEN : std_logic_vector(39 downto 0);
  signal axi_interconnect_0_S_AWPROT : std_logic_vector(14 downto 0);
  signal axi_interconnect_0_S_AWREADY : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_AWSIZE : std_logic_vector(14 downto 0);
  signal axi_interconnect_0_S_AWVALID : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_BREADY : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_BRESP : std_logic_vector(9 downto 0);
  signal axi_interconnect_0_S_BVALID : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_RDATA : std_logic_vector(319 downto 0);
  signal axi_interconnect_0_S_RLAST : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_RREADY : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_RRESP : std_logic_vector(9 downto 0);
  signal axi_interconnect_0_S_RVALID : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_WDATA : std_logic_vector(319 downto 0);
  signal axi_interconnect_0_S_WLAST : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_WREADY : std_logic_vector(4 downto 0);
  signal axi_interconnect_0_S_WSTRB : std_logic_vector(39 downto 0);
  signal axi_interconnect_0_S_WVALID : std_logic_vector(4 downto 0);
  signal axi_interconnect_1_M_ARADDR : std_logic_vector(351 downto 0);
  signal axi_interconnect_1_M_ARBURST : std_logic_vector(21 downto 0);
  signal axi_interconnect_1_M_ARCACHE : std_logic_vector(43 downto 0);
  signal axi_interconnect_1_M_ARESETN : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_ARID : std_logic_vector(65 downto 0);
  signal axi_interconnect_1_M_ARLEN : std_logic_vector(87 downto 0);
  signal axi_interconnect_1_M_ARLOCK : std_logic_vector(21 downto 0);
  signal axi_interconnect_1_M_ARPROT : std_logic_vector(32 downto 0);
  signal axi_interconnect_1_M_ARREADY : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_ARSIZE : std_logic_vector(32 downto 0);
  signal axi_interconnect_1_M_ARVALID : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_AWADDR : std_logic_vector(351 downto 0);
  signal axi_interconnect_1_M_AWBURST : std_logic_vector(21 downto 0);
  signal axi_interconnect_1_M_AWCACHE : std_logic_vector(43 downto 0);
  signal axi_interconnect_1_M_AWID : std_logic_vector(65 downto 0);
  signal axi_interconnect_1_M_AWLEN : std_logic_vector(87 downto 0);
  signal axi_interconnect_1_M_AWLOCK : std_logic_vector(21 downto 0);
  signal axi_interconnect_1_M_AWPROT : std_logic_vector(32 downto 0);
  signal axi_interconnect_1_M_AWREADY : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_AWSIZE : std_logic_vector(32 downto 0);
  signal axi_interconnect_1_M_AWVALID : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_BID : std_logic_vector(65 downto 0);
  signal axi_interconnect_1_M_BREADY : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_BRESP : std_logic_vector(21 downto 0);
  signal axi_interconnect_1_M_BVALID : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_RDATA : std_logic_vector(351 downto 0);
  signal axi_interconnect_1_M_RID : std_logic_vector(65 downto 0);
  signal axi_interconnect_1_M_RLAST : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_RREADY : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_RRESP : std_logic_vector(21 downto 0);
  signal axi_interconnect_1_M_RVALID : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_WDATA : std_logic_vector(351 downto 0);
  signal axi_interconnect_1_M_WLAST : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_WREADY : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_M_WSTRB : std_logic_vector(43 downto 0);
  signal axi_interconnect_1_M_WVALID : std_logic_vector(10 downto 0);
  signal axi_interconnect_1_S_ARADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_1_S_ARBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_1_S_ARCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_1_S_ARID : std_logic_vector(5 downto 0);
  signal axi_interconnect_1_S_ARLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_1_S_ARLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_1_S_ARPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_1_S_ARQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_1_S_ARREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_ARSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_1_S_ARVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_AWADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_1_S_AWBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_1_S_AWCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_1_S_AWID : std_logic_vector(5 downto 0);
  signal axi_interconnect_1_S_AWLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_1_S_AWLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_1_S_AWPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_1_S_AWQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_1_S_AWREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_AWSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_1_S_AWVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_BID : std_logic_vector(5 downto 0);
  signal axi_interconnect_1_S_BREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_BRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_1_S_BVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_RDATA : std_logic_vector(31 downto 0);
  signal axi_interconnect_1_S_RID : std_logic_vector(5 downto 0);
  signal axi_interconnect_1_S_RLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_RREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_RRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_1_S_RVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_WDATA : std_logic_vector(31 downto 0);
  signal axi_interconnect_1_S_WID : std_logic_vector(5 downto 0);
  signal axi_interconnect_1_S_WLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_WREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_1_S_WSTRB : std_logic_vector(3 downto 0);
  signal axi_interconnect_1_S_WVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_INTERCONNECT_ARESETN : std_logic;
  signal axi_interconnect_2_M_ARADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_2_M_ARBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_M_ARCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_2_M_ARID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_ARLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_2_M_ARLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_M_ARPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_2_M_ARQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_2_M_ARREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_ARSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_2_M_ARVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_AWADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_2_M_AWBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_M_AWCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_2_M_AWID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_AWLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_2_M_AWLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_M_AWPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_2_M_AWQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_2_M_AWREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_AWSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_2_M_AWVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_BID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_BREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_BRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_M_BVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_RDATA : std_logic_vector(63 downto 0);
  signal axi_interconnect_2_M_RID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_RLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_RREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_RRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_M_RVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_WDATA : std_logic_vector(63 downto 0);
  signal axi_interconnect_2_M_WID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_WLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_WREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_2_M_WSTRB : std_logic_vector(7 downto 0);
  signal axi_interconnect_2_M_WVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_S_ARADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_2_S_ARBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_S_ARCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_2_S_ARLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_2_S_ARPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_2_S_ARREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_2_S_ARSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_2_S_ARVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_2_S_RDATA : std_logic_vector(63 downto 0);
  signal axi_interconnect_2_S_RLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_2_S_RREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_2_S_RRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_2_S_RVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_INTERCONNECT_ACLK : std_logic_vector(0 to 0);
  signal axi_interconnect_3_INTERCONNECT_ARESETN : std_logic;
  signal axi_interconnect_3_M_ARADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_3_M_ARBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_M_ARCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_M_ARID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_ARLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_3_M_ARLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_M_ARPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_3_M_ARQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_M_ARREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_ARSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_3_M_ARVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_AWADDR : std_logic_vector(31 downto 0);
  signal axi_interconnect_3_M_AWBURST : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_M_AWCACHE : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_M_AWID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_AWLEN : std_logic_vector(7 downto 0);
  signal axi_interconnect_3_M_AWLOCK : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_M_AWPROT : std_logic_vector(2 downto 0);
  signal axi_interconnect_3_M_AWQOS : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_M_AWREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_AWSIZE : std_logic_vector(2 downto 0);
  signal axi_interconnect_3_M_AWVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_BID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_BREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_BRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_M_BVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_RDATA : std_logic_vector(63 downto 0);
  signal axi_interconnect_3_M_RID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_RLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_RREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_RRESP : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_M_RVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_WDATA : std_logic_vector(63 downto 0);
  signal axi_interconnect_3_M_WID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_WLAST : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_WREADY : std_logic_vector(0 to 0);
  signal axi_interconnect_3_M_WSTRB : std_logic_vector(7 downto 0);
  signal axi_interconnect_3_M_WVALID : std_logic_vector(0 to 0);
  signal axi_interconnect_3_S_ARADDR : std_logic_vector(63 downto 0);
  signal axi_interconnect_3_S_ARBURST : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_S_ARCACHE : std_logic_vector(7 downto 0);
  signal axi_interconnect_3_S_ARLEN : std_logic_vector(15 downto 0);
  signal axi_interconnect_3_S_ARPROT : std_logic_vector(5 downto 0);
  signal axi_interconnect_3_S_ARREADY : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_ARSIZE : std_logic_vector(5 downto 0);
  signal axi_interconnect_3_S_ARVALID : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_AWADDR : std_logic_vector(63 downto 0);
  signal axi_interconnect_3_S_AWBURST : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_S_AWCACHE : std_logic_vector(7 downto 0);
  signal axi_interconnect_3_S_AWLEN : std_logic_vector(15 downto 0);
  signal axi_interconnect_3_S_AWPROT : std_logic_vector(5 downto 0);
  signal axi_interconnect_3_S_AWREADY : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_AWSIZE : std_logic_vector(5 downto 0);
  signal axi_interconnect_3_S_AWVALID : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_BREADY : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_BRESP : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_S_BVALID : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_RDATA : std_logic_vector(127 downto 0);
  signal axi_interconnect_3_S_RLAST : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_RREADY : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_RRESP : std_logic_vector(3 downto 0);
  signal axi_interconnect_3_S_RVALID : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_WDATA : std_logic_vector(127 downto 0);
  signal axi_interconnect_3_S_WLAST : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_WREADY : std_logic_vector(1 downto 0);
  signal axi_interconnect_3_S_WSTRB : std_logic_vector(15 downto 0);
  signal axi_interconnect_3_S_WVALID : std_logic_vector(1 downto 0);
  signal axi_spdif_tx_0_spdif_tx_o : std_logic;
  signal axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TDATA : std_logic_vector(63 downto 0);
  signal axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TKEEP : std_logic_vector(7 downto 0);
  signal axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TLAST : std_logic;
  signal axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TREADY : std_logic;
  signal axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TVALID : std_logic;
  signal axi_vdma_0_mm2s_buffer_almost_empty : std_logic;
  signal axi_vdma_0_mm2s_buffer_empty : std_logic;
  signal axi_vdma_0_mm2s_fsync : std_logic;
  signal axi_vdma_0_mm2s_fsync_out : std_logic;
  signal axi_vdma_0_mm2s_introut : std_logic;
  signal axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TDATA : std_logic_vector(31 downto 0);
  signal axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TLAST : std_logic_vector(0 to 0);
  signal axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TREADY : std_logic;
  signal axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TUSER : std_logic_vector(0 to 0);
  signal axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TVALID : std_logic;
  signal axi_vdma_1_mm2s_introut : std_logic;
  signal axi_vdma_1_s2mm_introut : std_logic;
  signal cam_mem_0_href_negedge : std_logic;
  signal cam_mem_0_vsync_negedge : std_logic;
  signal clock_generator_0_CLKOUT0 : std_logic;
  signal net_gnd0 : std_logic;
  signal net_gnd1 : std_logic_vector(0 to 0);
  signal net_gnd2 : std_logic_vector(1 downto 0);
  signal net_gnd3 : std_logic_vector(2 downto 0);
  signal net_gnd4 : std_logic_vector(3 downto 0);
  signal net_gnd5 : std_logic_vector(4 downto 0);
  signal net_gnd6 : std_logic_vector(5 downto 0);
  signal net_gnd8 : std_logic_vector(7 downto 0);
  signal net_gnd10 : std_logic_vector(9 downto 0);
  signal net_gnd11 : std_logic_vector(10 downto 0);
  signal net_gnd15 : std_logic_vector(14 downto 0);
  signal net_gnd20 : std_logic_vector(19 downto 0);
  signal net_gnd32 : std_logic_vector(31 downto 0);
  signal net_gnd64 : std_logic_vector(63 downto 0);
  signal net_vcc0 : std_logic;
  signal net_vcc4 : std_logic_vector(3 downto 0);
  signal pgassign1 : std_logic_vector(10 downto 0);
  signal pgassign2 : std_logic_vector(4 downto 0);
  signal pgassign3 : std_logic_vector(10 downto 0);
  signal pgassign4 : std_logic_vector(1 downto 0);
  signal processing_system7_0_DDR_WEB : std_logic;
  signal processing_system7_0_FCLK_CLK0 : std_logic_vector(0 to 0);
  signal processing_system7_0_FCLK_CLK1 : std_logic_vector(0 to 0);
  signal processing_system7_0_FCLK_CLK2 : std_logic;
  signal processing_system7_0_IRQ_F2P : std_logic;
  signal processing_system7_0_USB0_VBUS_PWRFAULT : std_logic_vector(0 to 0);
  signal sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TDATA : std_logic_vector(31 downto 0);
  signal sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TLAST : std_logic_vector(0 to 0);
  signal sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TREADY : std_logic;
  signal sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TUSER : std_logic_vector(0 to 0);
  signal sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TVALID : std_logic;
  signal sobel_filter_top_0_interrupt : std_logic;
  signal util_i2c_mixer_0_downstream_scl_I : std_logic_vector(1 downto 0);
  signal util_i2c_mixer_0_downstream_scl_O : std_logic_vector(1 downto 0);
  signal util_i2c_mixer_0_downstream_scl_T : std_logic;
  signal util_i2c_mixer_0_downstream_sda_I : std_logic_vector(1 downto 0);
  signal util_i2c_mixer_0_downstream_sda_O : std_logic_vector(1 downto 0);
  signal util_i2c_mixer_0_downstream_sda_T : std_logic;
  signal util_i2c_mixer_0_upstream_scl_I : std_logic;
  signal util_i2c_mixer_0_upstream_scl_O : std_logic;
  signal util_i2c_mixer_0_upstream_scl_T : std_logic;
  signal util_i2c_mixer_0_upstream_sda_I : std_logic;
  signal util_i2c_mixer_0_upstream_sda_O : std_logic;
  signal util_i2c_mixer_0_upstream_sda_T : std_logic;
  signal util_vector_logic_0_Op1 : std_logic_vector(0 to 0);

  attribute BOX_TYPE : STRING;
  attribute BOX_TYPE of system_axi_spdif_tx_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_dma_spdif_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_hdmi_tx_16b_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_vdma_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_dma_i2s_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_i2s_adi_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_interconnect_1_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_interconnect_2_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_interconnect_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_iic_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_clock_generator_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_clkgen_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_cam_mem_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_util_i2c_mixer_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_util_vector_logic_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_processing_system7_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_vdma_1_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_sobel_filter_top_0_wrapper : component is "user_black_box";
  attribute BOX_TYPE of system_axi_interconnect_3_wrapper : component is "user_black_box";

begin

  -- Internal assignments

  processing_system7_0_DDR_WEB_pin <= processing_system7_0_DDR_WEB;
  hdmi_clk <= axi_hdmi_tx_16b_0_hdmi_clk;
  hdmi_data <= axi_hdmi_tx_16b_0_hdmi_data;
  hdmi_hsync <= axi_hdmi_tx_16b_0_hdmi_hsync;
  hdmi_vsync <= axi_hdmi_tx_16b_0_hdmi_vsync;
  hdmi_data_e <= axi_hdmi_tx_16b_0_hdmi_data_e;
  hdmi_spdif <= axi_spdif_tx_0_spdif_tx_o;
  processing_system7_0_IRQ_F2P <= hdmi_int;
  util_vector_logic_0_Op1(0) <= otg_vbusoc;
  axi_i2s_adi_0_BCLK_O_pin <= axi_i2s_adi_0_BCLK_O;
  axi_i2s_adi_0_LRCLK_O_pin <= axi_i2s_adi_0_LRCLK_O;
  axi_i2s_adi_0_SDATA_I <= axi_i2s_adi_0_SDATA_I_pin;
  axi_i2s_adi_0_SDATA_O_pin <= axi_i2s_adi_0_SDATA_O;
  axi_i2s_adi_0_MCLK_pin <= clock_generator_0_CLKOUT0;
  axi_interconnect_0_S_AWADDR(63 downto 32) <= B"00000000000000000000000000000000";
  axi_interconnect_0_S_AWADDR(127 downto 96) <= B"00000000000000000000000000000000";
  axi_interconnect_0_S_AWLEN(15 downto 8) <= B"00000000";
  axi_interconnect_0_S_AWLEN(31 downto 24) <= B"00000000";
  axi_interconnect_0_S_AWSIZE(5 downto 3) <= B"000";
  axi_interconnect_0_S_AWSIZE(11 downto 9) <= B"000";
  axi_interconnect_0_S_AWBURST(3 downto 2) <= B"00";
  axi_interconnect_0_S_AWBURST(7 downto 6) <= B"00";
  axi_interconnect_0_S_AWPROT(5 downto 3) <= B"000";
  axi_interconnect_0_S_AWPROT(11 downto 9) <= B"000";
  axi_interconnect_0_S_AWCACHE(7 downto 4) <= B"0000";
  axi_interconnect_0_S_AWCACHE(15 downto 12) <= B"0000";
  axi_interconnect_0_S_AWVALID(1 downto 1) <= B"0";
  axi_interconnect_0_S_AWVALID(3 downto 3) <= B"0";
  axi_interconnect_0_S_WDATA(127 downto 64) <= B"0000000000000000000000000000000000000000000000000000000000000000";
  axi_interconnect_0_S_WDATA(255 downto 192) <= B"0000000000000000000000000000000000000000000000000000000000000000";
  axi_interconnect_0_S_WSTRB(15 downto 8) <= B"00000000";
  axi_interconnect_0_S_WSTRB(31 downto 24) <= B"00000000";
  axi_interconnect_0_S_WLAST(1 downto 1) <= B"0";
  axi_interconnect_0_S_WLAST(3 downto 3) <= B"0";
  axi_interconnect_0_S_WVALID(1 downto 1) <= B"0";
  axi_interconnect_0_S_WVALID(3 downto 3) <= B"0";
  axi_interconnect_0_S_BREADY(1 downto 1) <= B"0";
  axi_interconnect_0_S_BREADY(3 downto 3) <= B"0";
  axi_interconnect_0_S_ARADDR(159 downto 128) <= B"00000000000000000000000000000000";
  axi_interconnect_0_S_ARLEN(39 downto 32) <= B"00000000";
  axi_interconnect_0_S_ARSIZE(14 downto 12) <= B"000";
  axi_interconnect_0_S_ARBURST(9 downto 8) <= B"00";
  axi_interconnect_0_S_ARPROT(14 downto 12) <= B"000";
  axi_interconnect_0_S_ARCACHE(19 downto 16) <= B"0000";
  axi_interconnect_0_S_ARVALID(4 downto 4) <= B"0";
  axi_interconnect_0_S_RREADY(4 downto 4) <= B"0";
  axi_interconnect_1_M_BID(5 downto 0) <= B"000000";
  axi_interconnect_1_M_BID(11 downto 6) <= B"000000";
  axi_interconnect_1_M_BID(17 downto 12) <= B"000000";
  axi_interconnect_1_M_BID(23 downto 18) <= B"000000";
  axi_interconnect_1_M_BID(29 downto 24) <= B"000000";
  axi_interconnect_1_M_BID(35 downto 30) <= B"000000";
  axi_interconnect_1_M_BID(41 downto 36) <= B"000000";
  axi_interconnect_1_M_BID(47 downto 42) <= B"000000";
  axi_interconnect_1_M_BID(59 downto 54) <= B"000000";
  axi_interconnect_1_M_BID(65 downto 60) <= B"000000";
  axi_interconnect_1_M_RID(5 downto 0) <= B"000000";
  axi_interconnect_1_M_RID(11 downto 6) <= B"000000";
  axi_interconnect_1_M_RID(17 downto 12) <= B"000000";
  axi_interconnect_1_M_RID(23 downto 18) <= B"000000";
  axi_interconnect_1_M_RID(29 downto 24) <= B"000000";
  axi_interconnect_1_M_RID(35 downto 30) <= B"000000";
  axi_interconnect_1_M_RID(41 downto 36) <= B"000000";
  axi_interconnect_1_M_RID(47 downto 42) <= B"000000";
  axi_interconnect_1_M_RID(59 downto 54) <= B"000000";
  axi_interconnect_1_M_RID(65 downto 60) <= B"000000";
  axi_interconnect_1_M_RLAST(0 downto 0) <= B"0";
  axi_interconnect_1_M_RLAST(1 downto 1) <= B"0";
  axi_interconnect_1_M_RLAST(2 downto 2) <= B"0";
  axi_interconnect_1_M_RLAST(3 downto 3) <= B"0";
  axi_interconnect_1_M_RLAST(4 downto 4) <= B"0";
  axi_interconnect_1_M_RLAST(5 downto 5) <= B"0";
  axi_interconnect_1_M_RLAST(6 downto 6) <= B"0";
  axi_interconnect_1_M_RLAST(7 downto 7) <= B"0";
  axi_interconnect_1_M_RLAST(9 downto 9) <= B"0";
  axi_interconnect_1_M_RLAST(10 downto 10) <= B"0";
  axi_interconnect_3_S_ARADDR(63 downto 32) <= B"00000000000000000000000000000000";
  axi_interconnect_3_S_ARLEN(15 downto 8) <= B"00000000";
  axi_interconnect_3_S_ARSIZE(5 downto 3) <= B"000";
  axi_interconnect_3_S_ARBURST(3 downto 2) <= B"00";
  axi_interconnect_3_S_ARPROT(5 downto 3) <= B"000";
  axi_interconnect_3_S_ARCACHE(7 downto 4) <= B"0000";
  axi_interconnect_3_S_ARVALID(1 downto 1) <= B"0";
  axi_interconnect_3_S_RREADY(1 downto 1) <= B"0";
  axi_interconnect_3_S_AWADDR(31 downto 0) <= B"00000000000000000000000000000000";
  axi_interconnect_3_S_AWLEN(7 downto 0) <= B"00000000";
  axi_interconnect_3_S_AWSIZE(2 downto 0) <= B"000";
  axi_interconnect_3_S_AWBURST(1 downto 0) <= B"00";
  axi_interconnect_3_S_AWPROT(2 downto 0) <= B"000";
  axi_interconnect_3_S_AWCACHE(3 downto 0) <= B"0000";
  axi_interconnect_3_S_AWVALID(0 downto 0) <= B"0";
  axi_interconnect_3_S_WDATA(63 downto 0) <= B"0000000000000000000000000000000000000000000000000000000000000000";
  axi_interconnect_3_S_WSTRB(7 downto 0) <= B"00000000";
  axi_interconnect_3_S_WLAST(0 downto 0) <= B"0";
  axi_interconnect_3_S_WVALID(0 downto 0) <= B"0";
  axi_interconnect_3_S_BREADY(0 downto 0) <= B"0";
  pgassign1(10 downto 10) <= axi_interconnect_3_INTERCONNECT_ACLK(0 to 0);
  pgassign1(9 downto 9) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(8 downto 8) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(7 downto 7) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(6 downto 6) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(5 downto 5) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(4 downto 4) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(3 downto 3) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(2 downto 2) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(1 downto 1) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign1(0 downto 0) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign2(4 downto 4) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign2(3 downto 3) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign2(2 downto 2) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign2(1 downto 1) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign2(0 downto 0) <= processing_system7_0_FCLK_CLK0(0 to 0);
  pgassign3(10) <= axi_vdma_0_mm2s_introut;
  pgassign3(9) <= axi_dma_spdif_mm2s_introut;
  pgassign3(8) <= processing_system7_0_IRQ_F2P;
  pgassign3(7) <= axi_iic_0_IIC2INTC_Irpt;
  pgassign3(6) <= axi_dma_i2s_s2mm_introut;
  pgassign3(5) <= axi_dma_i2s_mm2s_introut;
  pgassign3(4) <= cam_mem_0_vsync_negedge;
  pgassign3(3) <= cam_mem_0_href_negedge;
  pgassign3(2) <= sobel_filter_top_0_interrupt;
  pgassign3(1) <= axi_vdma_1_mm2s_introut;
  pgassign3(0) <= axi_vdma_1_s2mm_introut;
  pgassign4(1 downto 1) <= axi_interconnect_3_INTERCONNECT_ACLK(0 to 0);
  pgassign4(0 downto 0) <= axi_interconnect_3_INTERCONNECT_ACLK(0 to 0);
  net_gnd0 <= '0';
  net_gnd1(0 to 0) <= B"0";
  net_gnd10(9 downto 0) <= B"0000000000";
  net_gnd11(10 downto 0) <= B"00000000000";
  net_gnd15(14 downto 0) <= B"000000000000000";
  net_gnd2(1 downto 0) <= B"00";
  net_gnd20(19 downto 0) <= B"00000000000000000000";
  net_gnd3(2 downto 0) <= B"000";
  net_gnd32(31 downto 0) <= B"00000000000000000000000000000000";
  net_gnd4(3 downto 0) <= B"0000";
  net_gnd5(4 downto 0) <= B"00000";
  net_gnd6(5 downto 0) <= B"000000";
  net_gnd64(63 downto 0) <= B"0000000000000000000000000000000000000000000000000000000000000000";
  net_gnd8(7 downto 0) <= B"00000000";
  net_vcc0 <= '1';
  otg_reset <= net_vcc0;
  net_vcc4(3 downto 0) <= B"1111";

  axi_spdif_tx_0 : system_axi_spdif_tx_0_wrapper
    port map (
      S_AXI_ACLK => pgassign1(9),
      S_AXI_ARESETN => axi_interconnect_1_M_ARESETN(0),
      S_AXI_AWADDR => axi_interconnect_1_M_AWADDR(31 downto 0),
      S_AXI_AWVALID => axi_interconnect_1_M_AWVALID(0),
      S_AXI_WDATA => axi_interconnect_1_M_WDATA(31 downto 0),
      S_AXI_WSTRB => axi_interconnect_1_M_WSTRB(3 downto 0),
      S_AXI_WVALID => axi_interconnect_1_M_WVALID(0),
      S_AXI_BREADY => axi_interconnect_1_M_BREADY(0),
      S_AXI_ARADDR => axi_interconnect_1_M_ARADDR(31 downto 0),
      S_AXI_ARVALID => axi_interconnect_1_M_ARVALID(0),
      S_AXI_RREADY => axi_interconnect_1_M_RREADY(0),
      S_AXI_ARREADY => axi_interconnect_1_M_ARREADY(0),
      S_AXI_RDATA => axi_interconnect_1_M_RDATA(31 downto 0),
      S_AXI_RRESP => axi_interconnect_1_M_RRESP(1 downto 0),
      S_AXI_RVALID => axi_interconnect_1_M_RVALID(0),
      S_AXI_WREADY => axi_interconnect_1_M_WREADY(0),
      S_AXI_BRESP => axi_interconnect_1_M_BRESP(1 downto 0),
      S_AXI_BVALID => axi_interconnect_1_M_BVALID(0),
      S_AXI_AWREADY => axi_interconnect_1_M_AWREADY(0),
      ACLK => pgassign1(9),
      ARESETN => net_gnd0,
      S_AXIS_TREADY => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TREADY,
      S_AXIS_TDATA => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TDATA,
      S_AXIS_TLAST => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TLAST,
      S_AXIS_TVALID => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TVALID,
      spdif_data_clk => clock_generator_0_CLKOUT0,
      spdif_tx_o => axi_spdif_tx_0_spdif_tx_o,
      spdif_tx_int_o => open
    );

  axi_dma_spdif : system_axi_dma_spdif_wrapper
    port map (
      s_axi_lite_aclk => pgassign1(9),
      m_axi_sg_aclk => pgassign1(9),
      m_axi_mm2s_aclk => pgassign1(9),
      m_axi_s2mm_aclk => net_gnd0,
      axi_resetn => axi_interconnect_1_M_ARESETN(1),
      s_axi_lite_awvalid => axi_interconnect_1_M_AWVALID(1),
      s_axi_lite_awready => axi_interconnect_1_M_AWREADY(1),
      s_axi_lite_awaddr => axi_interconnect_1_M_AWADDR(63 downto 32),
      s_axi_lite_wvalid => axi_interconnect_1_M_WVALID(1),
      s_axi_lite_wready => axi_interconnect_1_M_WREADY(1),
      s_axi_lite_wdata => axi_interconnect_1_M_WDATA(63 downto 32),
      s_axi_lite_bresp => axi_interconnect_1_M_BRESP(3 downto 2),
      s_axi_lite_bvalid => axi_interconnect_1_M_BVALID(1),
      s_axi_lite_bready => axi_interconnect_1_M_BREADY(1),
      s_axi_lite_arvalid => axi_interconnect_1_M_ARVALID(1),
      s_axi_lite_arready => axi_interconnect_1_M_ARREADY(1),
      s_axi_lite_araddr => axi_interconnect_1_M_ARADDR(63 downto 32),
      s_axi_lite_rvalid => axi_interconnect_1_M_RVALID(1),
      s_axi_lite_rready => axi_interconnect_1_M_RREADY(1),
      s_axi_lite_rdata => axi_interconnect_1_M_RDATA(63 downto 32),
      s_axi_lite_rresp => axi_interconnect_1_M_RRESP(3 downto 2),
      m_axi_sg_awaddr => axi_interconnect_0_S_AWADDR(31 downto 0),
      m_axi_sg_awlen => axi_interconnect_0_S_AWLEN(7 downto 0),
      m_axi_sg_awsize => axi_interconnect_0_S_AWSIZE(2 downto 0),
      m_axi_sg_awburst => axi_interconnect_0_S_AWBURST(1 downto 0),
      m_axi_sg_awprot => axi_interconnect_0_S_AWPROT(2 downto 0),
      m_axi_sg_awcache => axi_interconnect_0_S_AWCACHE(3 downto 0),
      m_axi_sg_awvalid => axi_interconnect_0_S_AWVALID(0),
      m_axi_sg_awready => axi_interconnect_0_S_AWREADY(0),
      m_axi_sg_wdata => axi_interconnect_0_S_WDATA(31 downto 0),
      m_axi_sg_wstrb => axi_interconnect_0_S_WSTRB(3 downto 0),
      m_axi_sg_wlast => axi_interconnect_0_S_WLAST(0),
      m_axi_sg_wvalid => axi_interconnect_0_S_WVALID(0),
      m_axi_sg_wready => axi_interconnect_0_S_WREADY(0),
      m_axi_sg_bresp => axi_interconnect_0_S_BRESP(1 downto 0),
      m_axi_sg_bvalid => axi_interconnect_0_S_BVALID(0),
      m_axi_sg_bready => axi_interconnect_0_S_BREADY(0),
      m_axi_sg_araddr => axi_interconnect_0_S_ARADDR(31 downto 0),
      m_axi_sg_arlen => axi_interconnect_0_S_ARLEN(7 downto 0),
      m_axi_sg_arsize => axi_interconnect_0_S_ARSIZE(2 downto 0),
      m_axi_sg_arburst => axi_interconnect_0_S_ARBURST(1 downto 0),
      m_axi_sg_arprot => axi_interconnect_0_S_ARPROT(2 downto 0),
      m_axi_sg_arcache => axi_interconnect_0_S_ARCACHE(3 downto 0),
      m_axi_sg_arvalid => axi_interconnect_0_S_ARVALID(0),
      m_axi_sg_arready => axi_interconnect_0_S_ARREADY(0),
      m_axi_sg_rdata => axi_interconnect_0_S_RDATA(31 downto 0),
      m_axi_sg_rresp => axi_interconnect_0_S_RRESP(1 downto 0),
      m_axi_sg_rlast => axi_interconnect_0_S_RLAST(0),
      m_axi_sg_rvalid => axi_interconnect_0_S_RVALID(0),
      m_axi_sg_rready => axi_interconnect_0_S_RREADY(0),
      m_axi_mm2s_araddr => axi_interconnect_0_S_ARADDR(63 downto 32),
      m_axi_mm2s_arlen => axi_interconnect_0_S_ARLEN(15 downto 8),
      m_axi_mm2s_arsize => axi_interconnect_0_S_ARSIZE(5 downto 3),
      m_axi_mm2s_arburst => axi_interconnect_0_S_ARBURST(3 downto 2),
      m_axi_mm2s_arprot => axi_interconnect_0_S_ARPROT(5 downto 3),
      m_axi_mm2s_arcache => axi_interconnect_0_S_ARCACHE(7 downto 4),
      m_axi_mm2s_arvalid => axi_interconnect_0_S_ARVALID(1),
      m_axi_mm2s_arready => axi_interconnect_0_S_ARREADY(1),
      m_axi_mm2s_rdata => axi_interconnect_0_S_RDATA(95 downto 64),
      m_axi_mm2s_rresp => axi_interconnect_0_S_RRESP(3 downto 2),
      m_axi_mm2s_rlast => axi_interconnect_0_S_RLAST(1),
      m_axi_mm2s_rvalid => axi_interconnect_0_S_RVALID(1),
      m_axi_mm2s_rready => axi_interconnect_0_S_RREADY(1),
      mm2s_prmry_reset_out_n => open,
      m_axis_mm2s_tdata => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TDATA,
      m_axis_mm2s_tkeep => open,
      m_axis_mm2s_tvalid => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TVALID,
      m_axis_mm2s_tready => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TREADY,
      m_axis_mm2s_tlast => axi_dma_spdif_M_AXIS_MM2S__To__axi_spdif_tx_0_S_AXIS_MM2S_TLAST,
      mm2s_cntrl_reset_out_n => open,
      m_axis_mm2s_cntrl_tdata => open,
      m_axis_mm2s_cntrl_tkeep => open,
      m_axis_mm2s_cntrl_tvalid => open,
      m_axis_mm2s_cntrl_tready => net_gnd0,
      m_axis_mm2s_cntrl_tlast => open,
      m_axi_s2mm_awaddr => open,
      m_axi_s2mm_awlen => open,
      m_axi_s2mm_awsize => open,
      m_axi_s2mm_awburst => open,
      m_axi_s2mm_awprot => open,
      m_axi_s2mm_awcache => open,
      m_axi_s2mm_awvalid => open,
      m_axi_s2mm_awready => net_gnd0,
      m_axi_s2mm_wdata => open,
      m_axi_s2mm_wstrb => open,
      m_axi_s2mm_wlast => open,
      m_axi_s2mm_wvalid => open,
      m_axi_s2mm_wready => net_gnd0,
      m_axi_s2mm_bresp => net_gnd2,
      m_axi_s2mm_bvalid => net_gnd0,
      m_axi_s2mm_bready => open,
      s2mm_prmry_reset_out_n => open,
      s_axis_s2mm_tdata => net_gnd32,
      s_axis_s2mm_tkeep => net_vcc4,
      s_axis_s2mm_tvalid => net_gnd0,
      s_axis_s2mm_tready => open,
      s_axis_s2mm_tlast => net_gnd0,
      s2mm_sts_reset_out_n => open,
      s_axis_s2mm_sts_tdata => net_gnd32,
      s_axis_s2mm_sts_tkeep => net_vcc4,
      s_axis_s2mm_sts_tvalid => net_gnd0,
      s_axis_s2mm_sts_tready => open,
      s_axis_s2mm_sts_tlast => net_gnd0,
      mm2s_introut => axi_dma_spdif_mm2s_introut,
      s2mm_introut => open
    );

  axi_hdmi_tx_16b_0 : system_axi_hdmi_tx_16b_0_wrapper
    port map (
      hdmi_ref_clk => axi_clkgen_0_clk,
      hdmi_clk => axi_hdmi_tx_16b_0_hdmi_clk,
      hdmi_vsync => axi_hdmi_tx_16b_0_hdmi_vsync,
      hdmi_hsync => axi_hdmi_tx_16b_0_hdmi_hsync,
      hdmi_data_e => axi_hdmi_tx_16b_0_hdmi_data_e,
      hdmi_data => axi_hdmi_tx_16b_0_hdmi_data,
      vdma_clk => processing_system7_0_FCLK_CLK1(0),
      vdma_fs => axi_vdma_0_mm2s_fsync,
      vdma_fs_ret => axi_vdma_0_mm2s_fsync_out,
      vdma_empty => axi_vdma_0_mm2s_buffer_empty,
      vdma_almost_empty => axi_vdma_0_mm2s_buffer_almost_empty,
      up_status => open,
      debug_trigger => open,
      debug_data => open,
      S_AXI_ACLK => pgassign1(9),
      S_AXI_ARESETN => axi_interconnect_1_M_ARESETN(2),
      S_AXI_AWADDR => axi_interconnect_1_M_AWADDR(95 downto 64),
      S_AXI_AWVALID => axi_interconnect_1_M_AWVALID(2),
      S_AXI_WDATA => axi_interconnect_1_M_WDATA(95 downto 64),
      S_AXI_WSTRB => axi_interconnect_1_M_WSTRB(11 downto 8),
      S_AXI_WVALID => axi_interconnect_1_M_WVALID(2),
      S_AXI_BREADY => axi_interconnect_1_M_BREADY(2),
      S_AXI_ARADDR => axi_interconnect_1_M_ARADDR(95 downto 64),
      S_AXI_ARVALID => axi_interconnect_1_M_ARVALID(2),
      S_AXI_RREADY => axi_interconnect_1_M_RREADY(2),
      S_AXI_ARREADY => axi_interconnect_1_M_ARREADY(2),
      S_AXI_RDATA => axi_interconnect_1_M_RDATA(95 downto 64),
      S_AXI_RRESP => axi_interconnect_1_M_RRESP(5 downto 4),
      S_AXI_RVALID => axi_interconnect_1_M_RVALID(2),
      S_AXI_WREADY => axi_interconnect_1_M_WREADY(2),
      S_AXI_BRESP => axi_interconnect_1_M_BRESP(5 downto 4),
      S_AXI_BVALID => axi_interconnect_1_M_BVALID(2),
      S_AXI_AWREADY => axi_interconnect_1_M_AWREADY(2),
      M_AXIS_MM2S_TVALID => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TVALID,
      M_AXIS_MM2S_TKEEP => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TKEEP,
      M_AXIS_MM2S_TDATA => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TDATA,
      M_AXIS_MM2S_TLAST => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TLAST,
      M_AXIS_MM2S_TREADY => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TREADY
    );

  axi_vdma_0 : system_axi_vdma_0_wrapper
    port map (
      s_axi_lite_aclk => pgassign1(9),
      m_axi_sg_aclk => net_gnd0,
      m_axi_mm2s_aclk => processing_system7_0_FCLK_CLK1(0),
      m_axi_s2mm_aclk => net_gnd0,
      m_axis_mm2s_aclk => processing_system7_0_FCLK_CLK1(0),
      s_axis_s2mm_aclk => net_gnd0,
      axi_resetn => axi_interconnect_1_M_ARESETN(3),
      s_axi_lite_awvalid => axi_interconnect_1_M_AWVALID(3),
      s_axi_lite_awready => axi_interconnect_1_M_AWREADY(3),
      s_axi_lite_awaddr => axi_interconnect_1_M_AWADDR(104 downto 96),
      s_axi_lite_wvalid => axi_interconnect_1_M_WVALID(3),
      s_axi_lite_wready => axi_interconnect_1_M_WREADY(3),
      s_axi_lite_wdata => axi_interconnect_1_M_WDATA(127 downto 96),
      s_axi_lite_bresp => axi_interconnect_1_M_BRESP(7 downto 6),
      s_axi_lite_bvalid => axi_interconnect_1_M_BVALID(3),
      s_axi_lite_bready => axi_interconnect_1_M_BREADY(3),
      s_axi_lite_arvalid => axi_interconnect_1_M_ARVALID(3),
      s_axi_lite_arready => axi_interconnect_1_M_ARREADY(3),
      s_axi_lite_araddr => axi_interconnect_1_M_ARADDR(104 downto 96),
      s_axi_lite_rvalid => axi_interconnect_1_M_RVALID(3),
      s_axi_lite_rready => axi_interconnect_1_M_RREADY(3),
      s_axi_lite_rdata => axi_interconnect_1_M_RDATA(127 downto 96),
      s_axi_lite_rresp => axi_interconnect_1_M_RRESP(7 downto 6),
      m_axi_sg_araddr => open,
      m_axi_sg_arlen => open,
      m_axi_sg_arsize => open,
      m_axi_sg_arburst => open,
      m_axi_sg_arprot => open,
      m_axi_sg_arcache => open,
      m_axi_sg_arvalid => open,
      m_axi_sg_arready => net_gnd0,
      m_axi_sg_rdata => net_gnd32,
      m_axi_sg_rresp => net_gnd2,
      m_axi_sg_rlast => net_gnd0,
      m_axi_sg_rvalid => net_gnd0,
      m_axi_sg_rready => open,
      m_axi_mm2s_araddr => axi_interconnect_2_S_ARADDR,
      m_axi_mm2s_arlen => axi_interconnect_2_S_ARLEN,
      m_axi_mm2s_arsize => axi_interconnect_2_S_ARSIZE,
      m_axi_mm2s_arburst => axi_interconnect_2_S_ARBURST,
      m_axi_mm2s_arprot => axi_interconnect_2_S_ARPROT,
      m_axi_mm2s_arcache => axi_interconnect_2_S_ARCACHE,
      m_axi_mm2s_arvalid => axi_interconnect_2_S_ARVALID(0),
      m_axi_mm2s_arready => axi_interconnect_2_S_ARREADY(0),
      m_axi_mm2s_rdata => axi_interconnect_2_S_RDATA,
      m_axi_mm2s_rresp => axi_interconnect_2_S_RRESP,
      m_axi_mm2s_rlast => axi_interconnect_2_S_RLAST(0),
      m_axi_mm2s_rvalid => axi_interconnect_2_S_RVALID(0),
      m_axi_mm2s_rready => axi_interconnect_2_S_RREADY(0),
      mm2s_prmry_reset_out_n => open,
      m_axis_mm2s_tdata => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TDATA,
      m_axis_mm2s_tkeep => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TKEEP,
      m_axis_mm2s_tvalid => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TVALID,
      m_axis_mm2s_tready => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TREADY,
      m_axis_mm2s_tlast => axi_vdma_0_M_AXIS_MM2S__To__axi_hdmi_tx_16b_0_M_AXIS_MM2S_TLAST,
      m_axis_mm2s_tuser => open,
      m_axi_s2mm_awaddr => open,
      m_axi_s2mm_awlen => open,
      m_axi_s2mm_awsize => open,
      m_axi_s2mm_awburst => open,
      m_axi_s2mm_awprot => open,
      m_axi_s2mm_awcache => open,
      m_axi_s2mm_awvalid => open,
      m_axi_s2mm_awready => net_gnd0,
      m_axi_s2mm_wdata => open,
      m_axi_s2mm_wstrb => open,
      m_axi_s2mm_wlast => open,
      m_axi_s2mm_wvalid => open,
      m_axi_s2mm_wready => net_gnd0,
      m_axi_s2mm_bresp => net_gnd2,
      m_axi_s2mm_bvalid => net_gnd0,
      m_axi_s2mm_bready => open,
      s2mm_prmry_reset_out_n => open,
      s_axis_s2mm_tdata => net_gnd32,
      s_axis_s2mm_tkeep => net_vcc4,
      s_axis_s2mm_tvalid => net_gnd0,
      s_axis_s2mm_tready => open,
      s_axis_s2mm_tlast => net_gnd0,
      s_axis_s2mm_tuser => net_gnd1(0 to 0),
      mm2s_fsync => axi_vdma_0_mm2s_fsync,
      mm2s_frame_ptr_in => net_gnd6,
      mm2s_frame_ptr_out => open,
      mm2s_fsync_out => axi_vdma_0_mm2s_fsync_out,
      mm2s_prmtr_update => open,
      mm2s_buffer_empty => axi_vdma_0_mm2s_buffer_empty,
      mm2s_buffer_almost_empty => axi_vdma_0_mm2s_buffer_almost_empty,
      s2mm_fsync => net_gnd0,
      s2mm_frame_ptr_in => net_gnd6,
      s2mm_frame_ptr_out => open,
      s2mm_fsync_out => open,
      s2mm_buffer_full => open,
      s2mm_buffer_almost_full => open,
      s2mm_prmtr_update => open,
      mm2s_introut => axi_vdma_0_mm2s_introut,
      s2mm_introut => open,
      axi_vdma_tstvec => open
    );

  axi_dma_i2s : system_axi_dma_i2s_wrapper
    port map (
      s_axi_lite_aclk => pgassign1(9),
      m_axi_sg_aclk => pgassign1(9),
      m_axi_mm2s_aclk => pgassign1(9),
      m_axi_s2mm_aclk => pgassign1(9),
      axi_resetn => axi_interconnect_1_M_ARESETN(4),
      s_axi_lite_awvalid => axi_interconnect_1_M_AWVALID(4),
      s_axi_lite_awready => axi_interconnect_1_M_AWREADY(4),
      s_axi_lite_awaddr => axi_interconnect_1_M_AWADDR(159 downto 128),
      s_axi_lite_wvalid => axi_interconnect_1_M_WVALID(4),
      s_axi_lite_wready => axi_interconnect_1_M_WREADY(4),
      s_axi_lite_wdata => axi_interconnect_1_M_WDATA(159 downto 128),
      s_axi_lite_bresp => axi_interconnect_1_M_BRESP(9 downto 8),
      s_axi_lite_bvalid => axi_interconnect_1_M_BVALID(4),
      s_axi_lite_bready => axi_interconnect_1_M_BREADY(4),
      s_axi_lite_arvalid => axi_interconnect_1_M_ARVALID(4),
      s_axi_lite_arready => axi_interconnect_1_M_ARREADY(4),
      s_axi_lite_araddr => axi_interconnect_1_M_ARADDR(159 downto 128),
      s_axi_lite_rvalid => axi_interconnect_1_M_RVALID(4),
      s_axi_lite_rready => axi_interconnect_1_M_RREADY(4),
      s_axi_lite_rdata => axi_interconnect_1_M_RDATA(159 downto 128),
      s_axi_lite_rresp => axi_interconnect_1_M_RRESP(9 downto 8),
      m_axi_sg_awaddr => axi_interconnect_0_S_AWADDR(95 downto 64),
      m_axi_sg_awlen => axi_interconnect_0_S_AWLEN(23 downto 16),
      m_axi_sg_awsize => axi_interconnect_0_S_AWSIZE(8 downto 6),
      m_axi_sg_awburst => axi_interconnect_0_S_AWBURST(5 downto 4),
      m_axi_sg_awprot => axi_interconnect_0_S_AWPROT(8 downto 6),
      m_axi_sg_awcache => axi_interconnect_0_S_AWCACHE(11 downto 8),
      m_axi_sg_awvalid => axi_interconnect_0_S_AWVALID(2),
      m_axi_sg_awready => axi_interconnect_0_S_AWREADY(2),
      m_axi_sg_wdata => axi_interconnect_0_S_WDATA(159 downto 128),
      m_axi_sg_wstrb => axi_interconnect_0_S_WSTRB(19 downto 16),
      m_axi_sg_wlast => axi_interconnect_0_S_WLAST(2),
      m_axi_sg_wvalid => axi_interconnect_0_S_WVALID(2),
      m_axi_sg_wready => axi_interconnect_0_S_WREADY(2),
      m_axi_sg_bresp => axi_interconnect_0_S_BRESP(5 downto 4),
      m_axi_sg_bvalid => axi_interconnect_0_S_BVALID(2),
      m_axi_sg_bready => axi_interconnect_0_S_BREADY(2),
      m_axi_sg_araddr => axi_interconnect_0_S_ARADDR(95 downto 64),
      m_axi_sg_arlen => axi_interconnect_0_S_ARLEN(23 downto 16),
      m_axi_sg_arsize => axi_interconnect_0_S_ARSIZE(8 downto 6),
      m_axi_sg_arburst => axi_interconnect_0_S_ARBURST(5 downto 4),
      m_axi_sg_arprot => axi_interconnect_0_S_ARPROT(8 downto 6),
      m_axi_sg_arcache => axi_interconnect_0_S_ARCACHE(11 downto 8),
      m_axi_sg_arvalid => axi_interconnect_0_S_ARVALID(2),
      m_axi_sg_arready => axi_interconnect_0_S_ARREADY(2),
      m_axi_sg_rdata => axi_interconnect_0_S_RDATA(159 downto 128),
      m_axi_sg_rresp => axi_interconnect_0_S_RRESP(5 downto 4),
      m_axi_sg_rlast => axi_interconnect_0_S_RLAST(2),
      m_axi_sg_rvalid => axi_interconnect_0_S_RVALID(2),
      m_axi_sg_rready => axi_interconnect_0_S_RREADY(2),
      m_axi_mm2s_araddr => axi_interconnect_0_S_ARADDR(127 downto 96),
      m_axi_mm2s_arlen => axi_interconnect_0_S_ARLEN(31 downto 24),
      m_axi_mm2s_arsize => axi_interconnect_0_S_ARSIZE(11 downto 9),
      m_axi_mm2s_arburst => axi_interconnect_0_S_ARBURST(7 downto 6),
      m_axi_mm2s_arprot => axi_interconnect_0_S_ARPROT(11 downto 9),
      m_axi_mm2s_arcache => axi_interconnect_0_S_ARCACHE(15 downto 12),
      m_axi_mm2s_arvalid => axi_interconnect_0_S_ARVALID(3),
      m_axi_mm2s_arready => axi_interconnect_0_S_ARREADY(3),
      m_axi_mm2s_rdata => axi_interconnect_0_S_RDATA(223 downto 192),
      m_axi_mm2s_rresp => axi_interconnect_0_S_RRESP(7 downto 6),
      m_axi_mm2s_rlast => axi_interconnect_0_S_RLAST(3),
      m_axi_mm2s_rvalid => axi_interconnect_0_S_RVALID(3),
      m_axi_mm2s_rready => axi_interconnect_0_S_RREADY(3),
      mm2s_prmry_reset_out_n => open,
      m_axis_mm2s_tdata => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TDATA,
      m_axis_mm2s_tkeep => open,
      m_axis_mm2s_tvalid => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TVALID,
      m_axis_mm2s_tready => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TREADY,
      m_axis_mm2s_tlast => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TLAST,
      mm2s_cntrl_reset_out_n => open,
      m_axis_mm2s_cntrl_tdata => open,
      m_axis_mm2s_cntrl_tkeep => open,
      m_axis_mm2s_cntrl_tvalid => open,
      m_axis_mm2s_cntrl_tready => net_gnd0,
      m_axis_mm2s_cntrl_tlast => open,
      m_axi_s2mm_awaddr => axi_interconnect_0_S_AWADDR(159 downto 128),
      m_axi_s2mm_awlen => axi_interconnect_0_S_AWLEN(39 downto 32),
      m_axi_s2mm_awsize => axi_interconnect_0_S_AWSIZE(14 downto 12),
      m_axi_s2mm_awburst => axi_interconnect_0_S_AWBURST(9 downto 8),
      m_axi_s2mm_awprot => axi_interconnect_0_S_AWPROT(14 downto 12),
      m_axi_s2mm_awcache => axi_interconnect_0_S_AWCACHE(19 downto 16),
      m_axi_s2mm_awvalid => axi_interconnect_0_S_AWVALID(4),
      m_axi_s2mm_awready => axi_interconnect_0_S_AWREADY(4),
      m_axi_s2mm_wdata => axi_interconnect_0_S_WDATA(287 downto 256),
      m_axi_s2mm_wstrb => axi_interconnect_0_S_WSTRB(35 downto 32),
      m_axi_s2mm_wlast => axi_interconnect_0_S_WLAST(4),
      m_axi_s2mm_wvalid => axi_interconnect_0_S_WVALID(4),
      m_axi_s2mm_wready => axi_interconnect_0_S_WREADY(4),
      m_axi_s2mm_bresp => axi_interconnect_0_S_BRESP(9 downto 8),
      m_axi_s2mm_bvalid => axi_interconnect_0_S_BVALID(4),
      m_axi_s2mm_bready => axi_interconnect_0_S_BREADY(4),
      s2mm_prmry_reset_out_n => open,
      s_axis_s2mm_tdata => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TDATA,
      s_axis_s2mm_tkeep => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TKEEP,
      s_axis_s2mm_tvalid => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TVALID,
      s_axis_s2mm_tready => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TREADY,
      s_axis_s2mm_tlast => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TLAST,
      s2mm_sts_reset_out_n => open,
      s_axis_s2mm_sts_tdata => net_gnd32,
      s_axis_s2mm_sts_tkeep => net_vcc4,
      s_axis_s2mm_sts_tvalid => net_gnd0,
      s_axis_s2mm_sts_tready => open,
      s_axis_s2mm_sts_tlast => net_gnd0,
      mm2s_introut => axi_dma_i2s_mm2s_introut,
      s2mm_introut => axi_dma_i2s_s2mm_introut
    );

  axi_i2s_adi_0 : system_axi_i2s_adi_0_wrapper
    port map (
      DATA_CLK_I => clock_generator_0_CLKOUT0,
      BCLK_O => axi_i2s_adi_0_BCLK_O,
      LRCLK_O => axi_i2s_adi_0_LRCLK_O,
      SDATA_I => axi_i2s_adi_0_SDATA_I,
      SDATA_O => axi_i2s_adi_0_SDATA_O,
      MEM_RD_O => open,
      ACLK => pgassign1(9),
      ARESETN => net_gnd0,
      S_AXIS_TREADY => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TREADY,
      S_AXIS_TDATA => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TDATA,
      S_AXIS_TLAST => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TLAST,
      S_AXIS_TVALID => axi_dma_i2s_M_AXIS_MM2S__To__axi_i2s_adi_0_S_AXIS_MM2S_TVALID,
      M_AXIS_ACLK => pgassign1(9),
      M_AXIS_TVALID => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TVALID,
      M_AXIS_TDATA => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TDATA,
      M_AXIS_TLAST => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TLAST,
      M_AXIS_TREADY => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TREADY,
      M_AXIS_TKEEP => axi_i2s_adi_0_M_AXIS_S2MM__To__axi_dma_i2s_S_AXIS_S2MM_TKEEP,
      S_AXI_ACLK => pgassign1(9),
      S_AXI_ARESETN => axi_interconnect_1_M_ARESETN(5),
      S_AXI_AWADDR => axi_interconnect_1_M_AWADDR(191 downto 160),
      S_AXI_AWVALID => axi_interconnect_1_M_AWVALID(5),
      S_AXI_WDATA => axi_interconnect_1_M_WDATA(191 downto 160),
      S_AXI_WSTRB => axi_interconnect_1_M_WSTRB(23 downto 20),
      S_AXI_WVALID => axi_interconnect_1_M_WVALID(5),
      S_AXI_BREADY => axi_interconnect_1_M_BREADY(5),
      S_AXI_ARADDR => axi_interconnect_1_M_ARADDR(191 downto 160),
      S_AXI_ARVALID => axi_interconnect_1_M_ARVALID(5),
      S_AXI_RREADY => axi_interconnect_1_M_RREADY(5),
      S_AXI_ARREADY => axi_interconnect_1_M_ARREADY(5),
      S_AXI_RDATA => axi_interconnect_1_M_RDATA(191 downto 160),
      S_AXI_RRESP => axi_interconnect_1_M_RRESP(11 downto 10),
      S_AXI_RVALID => axi_interconnect_1_M_RVALID(5),
      S_AXI_WREADY => axi_interconnect_1_M_WREADY(5),
      S_AXI_BRESP => axi_interconnect_1_M_BRESP(11 downto 10),
      S_AXI_BVALID => axi_interconnect_1_M_BVALID(5),
      S_AXI_AWREADY => axi_interconnect_1_M_AWREADY(5)
    );

  axi_interconnect_1 : system_axi_interconnect_1_wrapper
    port map (
      INTERCONNECT_ACLK => pgassign1(9),
      INTERCONNECT_ARESETN => axi_interconnect_0_INTERCONNECT_ARESETN,
      S_AXI_ARESET_OUT_N => open,
      M_AXI_ARESET_OUT_N => axi_interconnect_1_M_ARESETN,
      IRQ => open,
      S_AXI_ACLK => pgassign1(9 downto 9),
      S_AXI_AWID => axi_interconnect_1_S_AWID,
      S_AXI_AWADDR => axi_interconnect_1_S_AWADDR,
      S_AXI_AWLEN => axi_interconnect_1_S_AWLEN,
      S_AXI_AWSIZE => axi_interconnect_1_S_AWSIZE,
      S_AXI_AWBURST => axi_interconnect_1_S_AWBURST,
      S_AXI_AWLOCK => axi_interconnect_1_S_AWLOCK,
      S_AXI_AWCACHE => axi_interconnect_1_S_AWCACHE,
      S_AXI_AWPROT => axi_interconnect_1_S_AWPROT,
      S_AXI_AWQOS => axi_interconnect_1_S_AWQOS,
      S_AXI_AWUSER => net_gnd1(0 to 0),
      S_AXI_AWVALID => axi_interconnect_1_S_AWVALID(0 to 0),
      S_AXI_AWREADY => axi_interconnect_1_S_AWREADY(0 to 0),
      S_AXI_WID => axi_interconnect_1_S_WID,
      S_AXI_WDATA => axi_interconnect_1_S_WDATA,
      S_AXI_WSTRB => axi_interconnect_1_S_WSTRB,
      S_AXI_WLAST => axi_interconnect_1_S_WLAST(0 to 0),
      S_AXI_WUSER => net_gnd1(0 to 0),
      S_AXI_WVALID => axi_interconnect_1_S_WVALID(0 to 0),
      S_AXI_WREADY => axi_interconnect_1_S_WREADY(0 to 0),
      S_AXI_BID => axi_interconnect_1_S_BID,
      S_AXI_BRESP => axi_interconnect_1_S_BRESP,
      S_AXI_BUSER => open,
      S_AXI_BVALID => axi_interconnect_1_S_BVALID(0 to 0),
      S_AXI_BREADY => axi_interconnect_1_S_BREADY(0 to 0),
      S_AXI_ARID => axi_interconnect_1_S_ARID,
      S_AXI_ARADDR => axi_interconnect_1_S_ARADDR,
      S_AXI_ARLEN => axi_interconnect_1_S_ARLEN,
      S_AXI_ARSIZE => axi_interconnect_1_S_ARSIZE,
      S_AXI_ARBURST => axi_interconnect_1_S_ARBURST,
      S_AXI_ARLOCK => axi_interconnect_1_S_ARLOCK,
      S_AXI_ARCACHE => axi_interconnect_1_S_ARCACHE,
      S_AXI_ARPROT => axi_interconnect_1_S_ARPROT,
      S_AXI_ARQOS => axi_interconnect_1_S_ARQOS,
      S_AXI_ARUSER => net_gnd1(0 to 0),
      S_AXI_ARVALID => axi_interconnect_1_S_ARVALID(0 to 0),
      S_AXI_ARREADY => axi_interconnect_1_S_ARREADY(0 to 0),
      S_AXI_RID => axi_interconnect_1_S_RID,
      S_AXI_RDATA => axi_interconnect_1_S_RDATA,
      S_AXI_RRESP => axi_interconnect_1_S_RRESP,
      S_AXI_RLAST => axi_interconnect_1_S_RLAST(0 to 0),
      S_AXI_RUSER => open,
      S_AXI_RVALID => axi_interconnect_1_S_RVALID(0 to 0),
      S_AXI_RREADY => axi_interconnect_1_S_RREADY(0 to 0),
      M_AXI_ACLK => pgassign1,
      M_AXI_AWID => axi_interconnect_1_M_AWID,
      M_AXI_AWADDR => axi_interconnect_1_M_AWADDR,
      M_AXI_AWLEN => axi_interconnect_1_M_AWLEN,
      M_AXI_AWSIZE => axi_interconnect_1_M_AWSIZE,
      M_AXI_AWBURST => axi_interconnect_1_M_AWBURST,
      M_AXI_AWLOCK => axi_interconnect_1_M_AWLOCK,
      M_AXI_AWCACHE => axi_interconnect_1_M_AWCACHE,
      M_AXI_AWPROT => axi_interconnect_1_M_AWPROT,
      M_AXI_AWREGION => open,
      M_AXI_AWQOS => open,
      M_AXI_AWUSER => open,
      M_AXI_AWVALID => axi_interconnect_1_M_AWVALID,
      M_AXI_AWREADY => axi_interconnect_1_M_AWREADY,
      M_AXI_WID => open,
      M_AXI_WDATA => axi_interconnect_1_M_WDATA,
      M_AXI_WSTRB => axi_interconnect_1_M_WSTRB,
      M_AXI_WLAST => axi_interconnect_1_M_WLAST,
      M_AXI_WUSER => open,
      M_AXI_WVALID => axi_interconnect_1_M_WVALID,
      M_AXI_WREADY => axi_interconnect_1_M_WREADY,
      M_AXI_BID => axi_interconnect_1_M_BID,
      M_AXI_BRESP => axi_interconnect_1_M_BRESP,
      M_AXI_BUSER => net_gnd11,
      M_AXI_BVALID => axi_interconnect_1_M_BVALID,
      M_AXI_BREADY => axi_interconnect_1_M_BREADY,
      M_AXI_ARID => axi_interconnect_1_M_ARID,
      M_AXI_ARADDR => axi_interconnect_1_M_ARADDR,
      M_AXI_ARLEN => axi_interconnect_1_M_ARLEN,
      M_AXI_ARSIZE => axi_interconnect_1_M_ARSIZE,
      M_AXI_ARBURST => axi_interconnect_1_M_ARBURST,
      M_AXI_ARLOCK => axi_interconnect_1_M_ARLOCK,
      M_AXI_ARCACHE => axi_interconnect_1_M_ARCACHE,
      M_AXI_ARPROT => axi_interconnect_1_M_ARPROT,
      M_AXI_ARREGION => open,
      M_AXI_ARQOS => open,
      M_AXI_ARUSER => open,
      M_AXI_ARVALID => axi_interconnect_1_M_ARVALID,
      M_AXI_ARREADY => axi_interconnect_1_M_ARREADY,
      M_AXI_RID => axi_interconnect_1_M_RID,
      M_AXI_RDATA => axi_interconnect_1_M_RDATA,
      M_AXI_RRESP => axi_interconnect_1_M_RRESP,
      M_AXI_RLAST => axi_interconnect_1_M_RLAST,
      M_AXI_RUSER => net_gnd11,
      M_AXI_RVALID => axi_interconnect_1_M_RVALID,
      M_AXI_RREADY => axi_interconnect_1_M_RREADY,
      S_AXI_CTRL_AWADDR => net_gnd32,
      S_AXI_CTRL_AWVALID => net_gnd0,
      S_AXI_CTRL_AWREADY => open,
      S_AXI_CTRL_WDATA => net_gnd32,
      S_AXI_CTRL_WVALID => net_gnd0,
      S_AXI_CTRL_WREADY => open,
      S_AXI_CTRL_BRESP => open,
      S_AXI_CTRL_BVALID => open,
      S_AXI_CTRL_BREADY => net_gnd0,
      S_AXI_CTRL_ARADDR => net_gnd32,
      S_AXI_CTRL_ARVALID => net_gnd0,
      S_AXI_CTRL_ARREADY => open,
      S_AXI_CTRL_RDATA => open,
      S_AXI_CTRL_RRESP => open,
      S_AXI_CTRL_RVALID => open,
      S_AXI_CTRL_RREADY => net_gnd0,
      INTERCONNECT_ARESET_OUT_N => open,
      DEBUG_AW_TRANS_SEQ => open,
      DEBUG_AW_ARB_GRANT => open,
      DEBUG_AR_TRANS_SEQ => open,
      DEBUG_AR_ARB_GRANT => open,
      DEBUG_AW_TRANS_QUAL => open,
      DEBUG_AW_ACCEPT_CNT => open,
      DEBUG_AW_ACTIVE_THREAD => open,
      DEBUG_AW_ACTIVE_TARGET => open,
      DEBUG_AW_ACTIVE_REGION => open,
      DEBUG_AW_ERROR => open,
      DEBUG_AW_TARGET => open,
      DEBUG_AR_TRANS_QUAL => open,
      DEBUG_AR_ACCEPT_CNT => open,
      DEBUG_AR_ACTIVE_THREAD => open,
      DEBUG_AR_ACTIVE_TARGET => open,
      DEBUG_AR_ACTIVE_REGION => open,
      DEBUG_AR_ERROR => open,
      DEBUG_AR_TARGET => open,
      DEBUG_B_TRANS_SEQ => open,
      DEBUG_R_BEAT_CNT => open,
      DEBUG_R_TRANS_SEQ => open,
      DEBUG_AW_ISSUING_CNT => open,
      DEBUG_AR_ISSUING_CNT => open,
      DEBUG_W_BEAT_CNT => open,
      DEBUG_W_TRANS_SEQ => open,
      DEBUG_BID_TARGET => open,
      DEBUG_BID_ERROR => open,
      DEBUG_RID_TARGET => open,
      DEBUG_RID_ERROR => open,
      DEBUG_SR_SC_ARADDR => open,
      DEBUG_SR_SC_ARADDRCONTROL => open,
      DEBUG_SR_SC_AWADDR => open,
      DEBUG_SR_SC_AWADDRCONTROL => open,
      DEBUG_SR_SC_BRESP => open,
      DEBUG_SR_SC_RDATA => open,
      DEBUG_SR_SC_RDATACONTROL => open,
      DEBUG_SR_SC_WDATA => open,
      DEBUG_SR_SC_WDATACONTROL => open,
      DEBUG_SC_SF_ARADDR => open,
      DEBUG_SC_SF_ARADDRCONTROL => open,
      DEBUG_SC_SF_AWADDR => open,
      DEBUG_SC_SF_AWADDRCONTROL => open,
      DEBUG_SC_SF_BRESP => open,
      DEBUG_SC_SF_RDATA => open,
      DEBUG_SC_SF_RDATACONTROL => open,
      DEBUG_SC_SF_WDATA => open,
      DEBUG_SC_SF_WDATACONTROL => open,
      DEBUG_SF_CB_ARADDR => open,
      DEBUG_SF_CB_ARADDRCONTROL => open,
      DEBUG_SF_CB_AWADDR => open,
      DEBUG_SF_CB_AWADDRCONTROL => open,
      DEBUG_SF_CB_BRESP => open,
      DEBUG_SF_CB_RDATA => open,
      DEBUG_SF_CB_RDATACONTROL => open,
      DEBUG_SF_CB_WDATA => open,
      DEBUG_SF_CB_WDATACONTROL => open,
      DEBUG_CB_MF_ARADDR => open,
      DEBUG_CB_MF_ARADDRCONTROL => open,
      DEBUG_CB_MF_AWADDR => open,
      DEBUG_CB_MF_AWADDRCONTROL => open,
      DEBUG_CB_MF_BRESP => open,
      DEBUG_CB_MF_RDATA => open,
      DEBUG_CB_MF_RDATACONTROL => open,
      DEBUG_CB_MF_WDATA => open,
      DEBUG_CB_MF_WDATACONTROL => open,
      DEBUG_MF_MC_ARADDR => open,
      DEBUG_MF_MC_ARADDRCONTROL => open,
      DEBUG_MF_MC_AWADDR => open,
      DEBUG_MF_MC_AWADDRCONTROL => open,
      DEBUG_MF_MC_BRESP => open,
      DEBUG_MF_MC_RDATA => open,
      DEBUG_MF_MC_RDATACONTROL => open,
      DEBUG_MF_MC_WDATA => open,
      DEBUG_MF_MC_WDATACONTROL => open,
      DEBUG_MC_MP_ARADDR => open,
      DEBUG_MC_MP_ARADDRCONTROL => open,
      DEBUG_MC_MP_AWADDR => open,
      DEBUG_MC_MP_AWADDRCONTROL => open,
      DEBUG_MC_MP_BRESP => open,
      DEBUG_MC_MP_RDATA => open,
      DEBUG_MC_MP_RDATACONTROL => open,
      DEBUG_MC_MP_WDATA => open,
      DEBUG_MC_MP_WDATACONTROL => open,
      DEBUG_MP_MR_ARADDR => open,
      DEBUG_MP_MR_ARADDRCONTROL => open,
      DEBUG_MP_MR_AWADDR => open,
      DEBUG_MP_MR_AWADDRCONTROL => open,
      DEBUG_MP_MR_BRESP => open,
      DEBUG_MP_MR_RDATA => open,
      DEBUG_MP_MR_RDATACONTROL => open,
      DEBUG_MP_MR_WDATA => open,
      DEBUG_MP_MR_WDATACONTROL => open
    );

  axi_interconnect_2 : system_axi_interconnect_2_wrapper
    port map (
      INTERCONNECT_ACLK => processing_system7_0_FCLK_CLK1(0),
      INTERCONNECT_ARESETN => axi_interconnect_2_INTERCONNECT_ARESETN,
      S_AXI_ARESET_OUT_N => open,
      M_AXI_ARESET_OUT_N => open,
      IRQ => open,
      S_AXI_ACLK => processing_system7_0_FCLK_CLK1(0 to 0),
      S_AXI_AWID => net_gnd1(0 to 0),
      S_AXI_AWADDR => net_gnd32,
      S_AXI_AWLEN => net_gnd8,
      S_AXI_AWSIZE => net_gnd3,
      S_AXI_AWBURST => net_gnd2,
      S_AXI_AWLOCK => net_gnd2,
      S_AXI_AWCACHE => net_gnd4,
      S_AXI_AWPROT => net_gnd3,
      S_AXI_AWQOS => net_gnd4,
      S_AXI_AWUSER => net_gnd1(0 to 0),
      S_AXI_AWVALID => net_gnd1(0 to 0),
      S_AXI_AWREADY => open,
      S_AXI_WID => net_gnd1(0 to 0),
      S_AXI_WDATA => net_gnd64,
      S_AXI_WSTRB => net_gnd8,
      S_AXI_WLAST => net_gnd1(0 to 0),
      S_AXI_WUSER => net_gnd1(0 to 0),
      S_AXI_WVALID => net_gnd1(0 to 0),
      S_AXI_WREADY => open,
      S_AXI_BID => open,
      S_AXI_BRESP => open,
      S_AXI_BUSER => open,
      S_AXI_BVALID => open,
      S_AXI_BREADY => net_gnd1(0 to 0),
      S_AXI_ARID => net_gnd1(0 to 0),
      S_AXI_ARADDR => axi_interconnect_2_S_ARADDR,
      S_AXI_ARLEN => axi_interconnect_2_S_ARLEN,
      S_AXI_ARSIZE => axi_interconnect_2_S_ARSIZE,
      S_AXI_ARBURST => axi_interconnect_2_S_ARBURST,
      S_AXI_ARLOCK => net_gnd2,
      S_AXI_ARCACHE => axi_interconnect_2_S_ARCACHE,
      S_AXI_ARPROT => axi_interconnect_2_S_ARPROT,
      S_AXI_ARQOS => net_gnd4,
      S_AXI_ARUSER => net_gnd1(0 to 0),
      S_AXI_ARVALID => axi_interconnect_2_S_ARVALID(0 to 0),
      S_AXI_ARREADY => axi_interconnect_2_S_ARREADY(0 to 0),
      S_AXI_RID => open,
      S_AXI_RDATA => axi_interconnect_2_S_RDATA,
      S_AXI_RRESP => axi_interconnect_2_S_RRESP,
      S_AXI_RLAST => axi_interconnect_2_S_RLAST(0 to 0),
      S_AXI_RUSER => open,
      S_AXI_RVALID => axi_interconnect_2_S_RVALID(0 to 0),
      S_AXI_RREADY => axi_interconnect_2_S_RREADY(0 to 0),
      M_AXI_ACLK => processing_system7_0_FCLK_CLK1(0 to 0),
      M_AXI_AWID => axi_interconnect_2_M_AWID(0 to 0),
      M_AXI_AWADDR => axi_interconnect_2_M_AWADDR,
      M_AXI_AWLEN => axi_interconnect_2_M_AWLEN,
      M_AXI_AWSIZE => axi_interconnect_2_M_AWSIZE,
      M_AXI_AWBURST => axi_interconnect_2_M_AWBURST,
      M_AXI_AWLOCK => axi_interconnect_2_M_AWLOCK,
      M_AXI_AWCACHE => axi_interconnect_2_M_AWCACHE,
      M_AXI_AWPROT => axi_interconnect_2_M_AWPROT,
      M_AXI_AWREGION => open,
      M_AXI_AWQOS => axi_interconnect_2_M_AWQOS,
      M_AXI_AWUSER => open,
      M_AXI_AWVALID => axi_interconnect_2_M_AWVALID(0 to 0),
      M_AXI_AWREADY => axi_interconnect_2_M_AWREADY(0 to 0),
      M_AXI_WID => axi_interconnect_2_M_WID(0 to 0),
      M_AXI_WDATA => axi_interconnect_2_M_WDATA,
      M_AXI_WSTRB => axi_interconnect_2_M_WSTRB,
      M_AXI_WLAST => axi_interconnect_2_M_WLAST(0 to 0),
      M_AXI_WUSER => open,
      M_AXI_WVALID => axi_interconnect_2_M_WVALID(0 to 0),
      M_AXI_WREADY => axi_interconnect_2_M_WREADY(0 to 0),
      M_AXI_BID => axi_interconnect_2_M_BID(0 to 0),
      M_AXI_BRESP => axi_interconnect_2_M_BRESP,
      M_AXI_BUSER => net_gnd1(0 to 0),
      M_AXI_BVALID => axi_interconnect_2_M_BVALID(0 to 0),
      M_AXI_BREADY => axi_interconnect_2_M_BREADY(0 to 0),
      M_AXI_ARID => axi_interconnect_2_M_ARID(0 to 0),
      M_AXI_ARADDR => axi_interconnect_2_M_ARADDR,
      M_AXI_ARLEN => axi_interconnect_2_M_ARLEN,
      M_AXI_ARSIZE => axi_interconnect_2_M_ARSIZE,
      M_AXI_ARBURST => axi_interconnect_2_M_ARBURST,
      M_AXI_ARLOCK => axi_interconnect_2_M_ARLOCK,
      M_AXI_ARCACHE => axi_interconnect_2_M_ARCACHE,
      M_AXI_ARPROT => axi_interconnect_2_M_ARPROT,
      M_AXI_ARREGION => open,
      M_AXI_ARQOS => axi_interconnect_2_M_ARQOS,
      M_AXI_ARUSER => open,
      M_AXI_ARVALID => axi_interconnect_2_M_ARVALID(0 to 0),
      M_AXI_ARREADY => axi_interconnect_2_M_ARREADY(0 to 0),
      M_AXI_RID => axi_interconnect_2_M_RID(0 to 0),
      M_AXI_RDATA => axi_interconnect_2_M_RDATA,
      M_AXI_RRESP => axi_interconnect_2_M_RRESP,
      M_AXI_RLAST => axi_interconnect_2_M_RLAST(0 to 0),
      M_AXI_RUSER => net_gnd1(0 to 0),
      M_AXI_RVALID => axi_interconnect_2_M_RVALID(0 to 0),
      M_AXI_RREADY => axi_interconnect_2_M_RREADY(0 to 0),
      S_AXI_CTRL_AWADDR => net_gnd32,
      S_AXI_CTRL_AWVALID => net_gnd0,
      S_AXI_CTRL_AWREADY => open,
      S_AXI_CTRL_WDATA => net_gnd32,
      S_AXI_CTRL_WVALID => net_gnd0,
      S_AXI_CTRL_WREADY => open,
      S_AXI_CTRL_BRESP => open,
      S_AXI_CTRL_BVALID => open,
      S_AXI_CTRL_BREADY => net_gnd0,
      S_AXI_CTRL_ARADDR => net_gnd32,
      S_AXI_CTRL_ARVALID => net_gnd0,
      S_AXI_CTRL_ARREADY => open,
      S_AXI_CTRL_RDATA => open,
      S_AXI_CTRL_RRESP => open,
      S_AXI_CTRL_RVALID => open,
      S_AXI_CTRL_RREADY => net_gnd0,
      INTERCONNECT_ARESET_OUT_N => open,
      DEBUG_AW_TRANS_SEQ => open,
      DEBUG_AW_ARB_GRANT => open,
      DEBUG_AR_TRANS_SEQ => open,
      DEBUG_AR_ARB_GRANT => open,
      DEBUG_AW_TRANS_QUAL => open,
      DEBUG_AW_ACCEPT_CNT => open,
      DEBUG_AW_ACTIVE_THREAD => open,
      DEBUG_AW_ACTIVE_TARGET => open,
      DEBUG_AW_ACTIVE_REGION => open,
      DEBUG_AW_ERROR => open,
      DEBUG_AW_TARGET => open,
      DEBUG_AR_TRANS_QUAL => open,
      DEBUG_AR_ACCEPT_CNT => open,
      DEBUG_AR_ACTIVE_THREAD => open,
      DEBUG_AR_ACTIVE_TARGET => open,
      DEBUG_AR_ACTIVE_REGION => open,
      DEBUG_AR_ERROR => open,
      DEBUG_AR_TARGET => open,
      DEBUG_B_TRANS_SEQ => open,
      DEBUG_R_BEAT_CNT => open,
      DEBUG_R_TRANS_SEQ => open,
      DEBUG_AW_ISSUING_CNT => open,
      DEBUG_AR_ISSUING_CNT => open,
      DEBUG_W_BEAT_CNT => open,
      DEBUG_W_TRANS_SEQ => open,
      DEBUG_BID_TARGET => open,
      DEBUG_BID_ERROR => open,
      DEBUG_RID_TARGET => open,
      DEBUG_RID_ERROR => open,
      DEBUG_SR_SC_ARADDR => open,
      DEBUG_SR_SC_ARADDRCONTROL => open,
      DEBUG_SR_SC_AWADDR => open,
      DEBUG_SR_SC_AWADDRCONTROL => open,
      DEBUG_SR_SC_BRESP => open,
      DEBUG_SR_SC_RDATA => open,
      DEBUG_SR_SC_RDATACONTROL => open,
      DEBUG_SR_SC_WDATA => open,
      DEBUG_SR_SC_WDATACONTROL => open,
      DEBUG_SC_SF_ARADDR => open,
      DEBUG_SC_SF_ARADDRCONTROL => open,
      DEBUG_SC_SF_AWADDR => open,
      DEBUG_SC_SF_AWADDRCONTROL => open,
      DEBUG_SC_SF_BRESP => open,
      DEBUG_SC_SF_RDATA => open,
      DEBUG_SC_SF_RDATACONTROL => open,
      DEBUG_SC_SF_WDATA => open,
      DEBUG_SC_SF_WDATACONTROL => open,
      DEBUG_SF_CB_ARADDR => open,
      DEBUG_SF_CB_ARADDRCONTROL => open,
      DEBUG_SF_CB_AWADDR => open,
      DEBUG_SF_CB_AWADDRCONTROL => open,
      DEBUG_SF_CB_BRESP => open,
      DEBUG_SF_CB_RDATA => open,
      DEBUG_SF_CB_RDATACONTROL => open,
      DEBUG_SF_CB_WDATA => open,
      DEBUG_SF_CB_WDATACONTROL => open,
      DEBUG_CB_MF_ARADDR => open,
      DEBUG_CB_MF_ARADDRCONTROL => open,
      DEBUG_CB_MF_AWADDR => open,
      DEBUG_CB_MF_AWADDRCONTROL => open,
      DEBUG_CB_MF_BRESP => open,
      DEBUG_CB_MF_RDATA => open,
      DEBUG_CB_MF_RDATACONTROL => open,
      DEBUG_CB_MF_WDATA => open,
      DEBUG_CB_MF_WDATACONTROL => open,
      DEBUG_MF_MC_ARADDR => open,
      DEBUG_MF_MC_ARADDRCONTROL => open,
      DEBUG_MF_MC_AWADDR => open,
      DEBUG_MF_MC_AWADDRCONTROL => open,
      DEBUG_MF_MC_BRESP => open,
      DEBUG_MF_MC_RDATA => open,
      DEBUG_MF_MC_RDATACONTROL => open,
      DEBUG_MF_MC_WDATA => open,
      DEBUG_MF_MC_WDATACONTROL => open,
      DEBUG_MC_MP_ARADDR => open,
      DEBUG_MC_MP_ARADDRCONTROL => open,
      DEBUG_MC_MP_AWADDR => open,
      DEBUG_MC_MP_AWADDRCONTROL => open,
      DEBUG_MC_MP_BRESP => open,
      DEBUG_MC_MP_RDATA => open,
      DEBUG_MC_MP_RDATACONTROL => open,
      DEBUG_MC_MP_WDATA => open,
      DEBUG_MC_MP_WDATACONTROL => open,
      DEBUG_MP_MR_ARADDR => open,
      DEBUG_MP_MR_ARADDRCONTROL => open,
      DEBUG_MP_MR_AWADDR => open,
      DEBUG_MP_MR_AWADDRCONTROL => open,
      DEBUG_MP_MR_BRESP => open,
      DEBUG_MP_MR_RDATA => open,
      DEBUG_MP_MR_RDATACONTROL => open,
      DEBUG_MP_MR_WDATA => open,
      DEBUG_MP_MR_WDATACONTROL => open
    );

  axi_interconnect_0 : system_axi_interconnect_0_wrapper
    port map (
      INTERCONNECT_ACLK => pgassign1(9),
      INTERCONNECT_ARESETN => axi_interconnect_0_INTERCONNECT_ARESETN,
      S_AXI_ARESET_OUT_N => open,
      M_AXI_ARESET_OUT_N => open,
      IRQ => open,
      S_AXI_ACLK => pgassign2,
      S_AXI_AWID => net_gnd15,
      S_AXI_AWADDR => axi_interconnect_0_S_AWADDR,
      S_AXI_AWLEN => axi_interconnect_0_S_AWLEN,
      S_AXI_AWSIZE => axi_interconnect_0_S_AWSIZE,
      S_AXI_AWBURST => axi_interconnect_0_S_AWBURST,
      S_AXI_AWLOCK => net_gnd10,
      S_AXI_AWCACHE => axi_interconnect_0_S_AWCACHE,
      S_AXI_AWPROT => axi_interconnect_0_S_AWPROT,
      S_AXI_AWQOS => net_gnd20,
      S_AXI_AWUSER => net_gnd5,
      S_AXI_AWVALID => axi_interconnect_0_S_AWVALID,
      S_AXI_AWREADY => axi_interconnect_0_S_AWREADY,
      S_AXI_WID => net_gnd15,
      S_AXI_WDATA => axi_interconnect_0_S_WDATA,
      S_AXI_WSTRB => axi_interconnect_0_S_WSTRB,
      S_AXI_WLAST => axi_interconnect_0_S_WLAST,
      S_AXI_WUSER => net_gnd5,
      S_AXI_WVALID => axi_interconnect_0_S_WVALID,
      S_AXI_WREADY => axi_interconnect_0_S_WREADY,
      S_AXI_BID => open,
      S_AXI_BRESP => axi_interconnect_0_S_BRESP,
      S_AXI_BUSER => open,
      S_AXI_BVALID => axi_interconnect_0_S_BVALID,
      S_AXI_BREADY => axi_interconnect_0_S_BREADY,
      S_AXI_ARID => net_gnd15,
      S_AXI_ARADDR => axi_interconnect_0_S_ARADDR,
      S_AXI_ARLEN => axi_interconnect_0_S_ARLEN,
      S_AXI_ARSIZE => axi_interconnect_0_S_ARSIZE,
      S_AXI_ARBURST => axi_interconnect_0_S_ARBURST,
      S_AXI_ARLOCK => net_gnd10,
      S_AXI_ARCACHE => axi_interconnect_0_S_ARCACHE,
      S_AXI_ARPROT => axi_interconnect_0_S_ARPROT,
      S_AXI_ARQOS => net_gnd20,
      S_AXI_ARUSER => net_gnd5,
      S_AXI_ARVALID => axi_interconnect_0_S_ARVALID,
      S_AXI_ARREADY => axi_interconnect_0_S_ARREADY,
      S_AXI_RID => open,
      S_AXI_RDATA => axi_interconnect_0_S_RDATA,
      S_AXI_RRESP => axi_interconnect_0_S_RRESP,
      S_AXI_RLAST => axi_interconnect_0_S_RLAST,
      S_AXI_RUSER => open,
      S_AXI_RVALID => axi_interconnect_0_S_RVALID,
      S_AXI_RREADY => axi_interconnect_0_S_RREADY,
      M_AXI_ACLK => pgassign1(9 downto 9),
      M_AXI_AWID => axi_interconnect_0_M_AWID,
      M_AXI_AWADDR => axi_interconnect_0_M_AWADDR,
      M_AXI_AWLEN => axi_interconnect_0_M_AWLEN,
      M_AXI_AWSIZE => axi_interconnect_0_M_AWSIZE,
      M_AXI_AWBURST => axi_interconnect_0_M_AWBURST,
      M_AXI_AWLOCK => axi_interconnect_0_M_AWLOCK,
      M_AXI_AWCACHE => axi_interconnect_0_M_AWCACHE,
      M_AXI_AWPROT => axi_interconnect_0_M_AWPROT,
      M_AXI_AWREGION => open,
      M_AXI_AWQOS => axi_interconnect_0_M_AWQOS,
      M_AXI_AWUSER => open,
      M_AXI_AWVALID => axi_interconnect_0_M_AWVALID(0 to 0),
      M_AXI_AWREADY => axi_interconnect_0_M_AWREADY(0 to 0),
      M_AXI_WID => axi_interconnect_0_M_WID,
      M_AXI_WDATA => axi_interconnect_0_M_WDATA,
      M_AXI_WSTRB => axi_interconnect_0_M_WSTRB,
      M_AXI_WLAST => axi_interconnect_0_M_WLAST(0 to 0),
      M_AXI_WUSER => open,
      M_AXI_WVALID => axi_interconnect_0_M_WVALID(0 to 0),
      M_AXI_WREADY => axi_interconnect_0_M_WREADY(0 to 0),
      M_AXI_BID => axi_interconnect_0_M_BID,
      M_AXI_BRESP => axi_interconnect_0_M_BRESP,
      M_AXI_BUSER => net_gnd1(0 to 0),
      M_AXI_BVALID => axi_interconnect_0_M_BVALID(0 to 0),
      M_AXI_BREADY => axi_interconnect_0_M_BREADY(0 to 0),
      M_AXI_ARID => axi_interconnect_0_M_ARID,
      M_AXI_ARADDR => axi_interconnect_0_M_ARADDR,
      M_AXI_ARLEN => axi_interconnect_0_M_ARLEN,
      M_AXI_ARSIZE => axi_interconnect_0_M_ARSIZE,
      M_AXI_ARBURST => axi_interconnect_0_M_ARBURST,
      M_AXI_ARLOCK => axi_interconnect_0_M_ARLOCK,
      M_AXI_ARCACHE => axi_interconnect_0_M_ARCACHE,
      M_AXI_ARPROT => axi_interconnect_0_M_ARPROT,
      M_AXI_ARREGION => open,
      M_AXI_ARQOS => axi_interconnect_0_M_ARQOS,
      M_AXI_ARUSER => open,
      M_AXI_ARVALID => axi_interconnect_0_M_ARVALID(0 to 0),
      M_AXI_ARREADY => axi_interconnect_0_M_ARREADY(0 to 0),
      M_AXI_RID => axi_interconnect_0_M_RID,
      M_AXI_RDATA => axi_interconnect_0_M_RDATA,
      M_AXI_RRESP => axi_interconnect_0_M_RRESP,
      M_AXI_RLAST => axi_interconnect_0_M_RLAST(0 to 0),
      M_AXI_RUSER => net_gnd1(0 to 0),
      M_AXI_RVALID => axi_interconnect_0_M_RVALID(0 to 0),
      M_AXI_RREADY => axi_interconnect_0_M_RREADY(0 to 0),
      S_AXI_CTRL_AWADDR => net_gnd32,
      S_AXI_CTRL_AWVALID => net_gnd0,
      S_AXI_CTRL_AWREADY => open,
      S_AXI_CTRL_WDATA => net_gnd32,
      S_AXI_CTRL_WVALID => net_gnd0,
      S_AXI_CTRL_WREADY => open,
      S_AXI_CTRL_BRESP => open,
      S_AXI_CTRL_BVALID => open,
      S_AXI_CTRL_BREADY => net_gnd0,
      S_AXI_CTRL_ARADDR => net_gnd32,
      S_AXI_CTRL_ARVALID => net_gnd0,
      S_AXI_CTRL_ARREADY => open,
      S_AXI_CTRL_RDATA => open,
      S_AXI_CTRL_RRESP => open,
      S_AXI_CTRL_RVALID => open,
      S_AXI_CTRL_RREADY => net_gnd0,
      INTERCONNECT_ARESET_OUT_N => open,
      DEBUG_AW_TRANS_SEQ => open,
      DEBUG_AW_ARB_GRANT => open,
      DEBUG_AR_TRANS_SEQ => open,
      DEBUG_AR_ARB_GRANT => open,
      DEBUG_AW_TRANS_QUAL => open,
      DEBUG_AW_ACCEPT_CNT => open,
      DEBUG_AW_ACTIVE_THREAD => open,
      DEBUG_AW_ACTIVE_TARGET => open,
      DEBUG_AW_ACTIVE_REGION => open,
      DEBUG_AW_ERROR => open,
      DEBUG_AW_TARGET => open,
      DEBUG_AR_TRANS_QUAL => open,
      DEBUG_AR_ACCEPT_CNT => open,
      DEBUG_AR_ACTIVE_THREAD => open,
      DEBUG_AR_ACTIVE_TARGET => open,
      DEBUG_AR_ACTIVE_REGION => open,
      DEBUG_AR_ERROR => open,
      DEBUG_AR_TARGET => open,
      DEBUG_B_TRANS_SEQ => open,
      DEBUG_R_BEAT_CNT => open,
      DEBUG_R_TRANS_SEQ => open,
      DEBUG_AW_ISSUING_CNT => open,
      DEBUG_AR_ISSUING_CNT => open,
      DEBUG_W_BEAT_CNT => open,
      DEBUG_W_TRANS_SEQ => open,
      DEBUG_BID_TARGET => open,
      DEBUG_BID_ERROR => open,
      DEBUG_RID_TARGET => open,
      DEBUG_RID_ERROR => open,
      DEBUG_SR_SC_ARADDR => open,
      DEBUG_SR_SC_ARADDRCONTROL => open,
      DEBUG_SR_SC_AWADDR => open,
      DEBUG_SR_SC_AWADDRCONTROL => open,
      DEBUG_SR_SC_BRESP => open,
      DEBUG_SR_SC_RDATA => open,
      DEBUG_SR_SC_RDATACONTROL => open,
      DEBUG_SR_SC_WDATA => open,
      DEBUG_SR_SC_WDATACONTROL => open,
      DEBUG_SC_SF_ARADDR => open,
      DEBUG_SC_SF_ARADDRCONTROL => open,
      DEBUG_SC_SF_AWADDR => open,
      DEBUG_SC_SF_AWADDRCONTROL => open,
      DEBUG_SC_SF_BRESP => open,
      DEBUG_SC_SF_RDATA => open,
      DEBUG_SC_SF_RDATACONTROL => open,
      DEBUG_SC_SF_WDATA => open,
      DEBUG_SC_SF_WDATACONTROL => open,
      DEBUG_SF_CB_ARADDR => open,
      DEBUG_SF_CB_ARADDRCONTROL => open,
      DEBUG_SF_CB_AWADDR => open,
      DEBUG_SF_CB_AWADDRCONTROL => open,
      DEBUG_SF_CB_BRESP => open,
      DEBUG_SF_CB_RDATA => open,
      DEBUG_SF_CB_RDATACONTROL => open,
      DEBUG_SF_CB_WDATA => open,
      DEBUG_SF_CB_WDATACONTROL => open,
      DEBUG_CB_MF_ARADDR => open,
      DEBUG_CB_MF_ARADDRCONTROL => open,
      DEBUG_CB_MF_AWADDR => open,
      DEBUG_CB_MF_AWADDRCONTROL => open,
      DEBUG_CB_MF_BRESP => open,
      DEBUG_CB_MF_RDATA => open,
      DEBUG_CB_MF_RDATACONTROL => open,
      DEBUG_CB_MF_WDATA => open,
      DEBUG_CB_MF_WDATACONTROL => open,
      DEBUG_MF_MC_ARADDR => open,
      DEBUG_MF_MC_ARADDRCONTROL => open,
      DEBUG_MF_MC_AWADDR => open,
      DEBUG_MF_MC_AWADDRCONTROL => open,
      DEBUG_MF_MC_BRESP => open,
      DEBUG_MF_MC_RDATA => open,
      DEBUG_MF_MC_RDATACONTROL => open,
      DEBUG_MF_MC_WDATA => open,
      DEBUG_MF_MC_WDATACONTROL => open,
      DEBUG_MC_MP_ARADDR => open,
      DEBUG_MC_MP_ARADDRCONTROL => open,
      DEBUG_MC_MP_AWADDR => open,
      DEBUG_MC_MP_AWADDRCONTROL => open,
      DEBUG_MC_MP_BRESP => open,
      DEBUG_MC_MP_RDATA => open,
      DEBUG_MC_MP_RDATACONTROL => open,
      DEBUG_MC_MP_WDATA => open,
      DEBUG_MC_MP_WDATACONTROL => open,
      DEBUG_MP_MR_ARADDR => open,
      DEBUG_MP_MR_ARADDRCONTROL => open,
      DEBUG_MP_MR_AWADDR => open,
      DEBUG_MP_MR_AWADDRCONTROL => open,
      DEBUG_MP_MR_BRESP => open,
      DEBUG_MP_MR_RDATA => open,
      DEBUG_MP_MR_RDATACONTROL => open,
      DEBUG_MP_MR_WDATA => open,
      DEBUG_MP_MR_WDATACONTROL => open
    );

  axi_iic_0 : system_axi_iic_0_wrapper
    port map (
      S_AXI_ACLK => pgassign1(9),
      S_AXI_ARESETN => axi_interconnect_1_M_ARESETN(6),
      IIC2INTC_Irpt => axi_iic_0_IIC2INTC_Irpt,
      S_AXI_AWADDR => axi_interconnect_1_M_AWADDR(200 downto 192),
      S_AXI_AWVALID => axi_interconnect_1_M_AWVALID(6),
      S_AXI_AWREADY => axi_interconnect_1_M_AWREADY(6),
      S_AXI_WDATA => axi_interconnect_1_M_WDATA(223 downto 192),
      S_AXI_WSTRB => axi_interconnect_1_M_WSTRB(27 downto 24),
      S_AXI_WVALID => axi_interconnect_1_M_WVALID(6),
      S_AXI_WREADY => axi_interconnect_1_M_WREADY(6),
      S_AXI_BRESP => axi_interconnect_1_M_BRESP(13 downto 12),
      S_AXI_BVALID => axi_interconnect_1_M_BVALID(6),
      S_AXI_BREADY => axi_interconnect_1_M_BREADY(6),
      S_AXI_ARADDR => axi_interconnect_1_M_ARADDR(200 downto 192),
      S_AXI_ARVALID => axi_interconnect_1_M_ARVALID(6),
      S_AXI_ARREADY => axi_interconnect_1_M_ARREADY(6),
      S_AXI_RDATA => axi_interconnect_1_M_RDATA(223 downto 192),
      S_AXI_RRESP => axi_interconnect_1_M_RRESP(13 downto 12),
      S_AXI_RVALID => axi_interconnect_1_M_RVALID(6),
      S_AXI_RREADY => axi_interconnect_1_M_RREADY(6),
      Sda_I => util_i2c_mixer_0_upstream_sda_O,
      Sda_O => util_i2c_mixer_0_upstream_sda_I,
      Sda_T => util_i2c_mixer_0_upstream_sda_T,
      Scl_I => util_i2c_mixer_0_upstream_scl_O,
      Scl_O => util_i2c_mixer_0_upstream_scl_I,
      Scl_T => util_i2c_mixer_0_upstream_scl_T,
      Gpo => open
    );

  clock_generator_0 : system_clock_generator_0_wrapper
    port map (
      CLKIN => processing_system7_0_FCLK_CLK2,
      CLKOUT0 => clock_generator_0_CLKOUT0,
      CLKOUT1 => open,
      CLKOUT2 => open,
      CLKOUT3 => open,
      CLKOUT4 => open,
      CLKOUT5 => open,
      CLKOUT6 => open,
      CLKOUT7 => open,
      CLKOUT8 => open,
      CLKOUT9 => open,
      CLKOUT10 => open,
      CLKOUT11 => open,
      CLKOUT12 => open,
      CLKOUT13 => open,
      CLKOUT14 => open,
      CLKOUT15 => open,
      CLKFBIN => net_gnd0,
      CLKFBOUT => open,
      PSCLK => net_gnd0,
      PSEN => net_gnd0,
      PSINCDEC => net_gnd0,
      PSDONE => open,
      RST => net_gnd0,
      LOCKED => open
    );

  axi_clkgen_0 : system_axi_clkgen_0_wrapper
    port map (
      ref_clk => processing_system7_0_FCLK_CLK2,
      clk => axi_clkgen_0_clk,
      S_AXI_ACLK => pgassign1(9),
      S_AXI_ARESETN => axi_interconnect_1_M_ARESETN(7),
      S_AXI_AWADDR => axi_interconnect_1_M_AWADDR(255 downto 224),
      S_AXI_AWVALID => axi_interconnect_1_M_AWVALID(7),
      S_AXI_WDATA => axi_interconnect_1_M_WDATA(255 downto 224),
      S_AXI_WSTRB => axi_interconnect_1_M_WSTRB(31 downto 28),
      S_AXI_WVALID => axi_interconnect_1_M_WVALID(7),
      S_AXI_BREADY => axi_interconnect_1_M_BREADY(7),
      S_AXI_ARADDR => axi_interconnect_1_M_ARADDR(255 downto 224),
      S_AXI_ARVALID => axi_interconnect_1_M_ARVALID(7),
      S_AXI_RREADY => axi_interconnect_1_M_RREADY(7),
      S_AXI_ARREADY => axi_interconnect_1_M_ARREADY(7),
      S_AXI_RDATA => axi_interconnect_1_M_RDATA(255 downto 224),
      S_AXI_RRESP => axi_interconnect_1_M_RRESP(15 downto 14),
      S_AXI_RVALID => axi_interconnect_1_M_RVALID(7),
      S_AXI_WREADY => axi_interconnect_1_M_WREADY(7),
      S_AXI_BRESP => axi_interconnect_1_M_BRESP(15 downto 14),
      S_AXI_BVALID => axi_interconnect_1_M_BVALID(7),
      S_AXI_AWREADY => axi_interconnect_1_M_AWREADY(7)
    );

  cam_mem_0 : system_cam_mem_0_wrapper
    port map (
      clk100 => cam_mem_0_clk100,
      OV7670_SIOC => cam_mem_0_OV7670_SIOC,
      OV7670_SIOD => cam_mem_0_OV7670_SIOD,
      OV7670_RESET => cam_mem_0_OV7670_RESET,
      OV7670_PWDN => cam_mem_0_OV7670_PWDN,
      OV7670_VSYNC => cam_mem_0_OV7670_VSYNC,
      OV7670_HREF => cam_mem_0_OV7670_HREF,
      OV7670_PCLK => cam_mem_0_OV7670_PCLK,
      OV7670_XCLK => cam_mem_0_OV7670_XCLK,
      OV7670_D => cam_mem_0_OV7670_D,
      config_finished => cam_mem_0_config_finished,
      href_negedge => cam_mem_0_href_negedge,
      href_posedge => open,
      vsync_negedge => cam_mem_0_vsync_negedge,
      btn => cam_mem_0_btn,
      S_AXI_ACLK => pgassign1(9),
      S_AXI_ARESETN => axi_interconnect_1_M_ARESETN(8),
      S_AXI_AWADDR => axi_interconnect_1_M_AWADDR(287 downto 256),
      S_AXI_AWVALID => axi_interconnect_1_M_AWVALID(8),
      S_AXI_WDATA => axi_interconnect_1_M_WDATA(287 downto 256),
      S_AXI_WSTRB => axi_interconnect_1_M_WSTRB(35 downto 32),
      S_AXI_WVALID => axi_interconnect_1_M_WVALID(8),
      S_AXI_BREADY => axi_interconnect_1_M_BREADY(8),
      S_AXI_ARADDR => axi_interconnect_1_M_ARADDR(287 downto 256),
      S_AXI_ARVALID => axi_interconnect_1_M_ARVALID(8),
      S_AXI_RREADY => axi_interconnect_1_M_RREADY(8),
      S_AXI_ARREADY => axi_interconnect_1_M_ARREADY(8),
      S_AXI_RDATA => axi_interconnect_1_M_RDATA(287 downto 256),
      S_AXI_RRESP => axi_interconnect_1_M_RRESP(17 downto 16),
      S_AXI_RVALID => axi_interconnect_1_M_RVALID(8),
      S_AXI_WREADY => axi_interconnect_1_M_WREADY(8),
      S_AXI_BRESP => axi_interconnect_1_M_BRESP(17 downto 16),
      S_AXI_BVALID => axi_interconnect_1_M_BVALID(8),
      S_AXI_AWREADY => axi_interconnect_1_M_AWREADY(8),
      S_AXI_AWID => axi_interconnect_1_M_AWID(53 downto 48),
      S_AXI_AWLEN => axi_interconnect_1_M_AWLEN(71 downto 64),
      S_AXI_AWSIZE => axi_interconnect_1_M_AWSIZE(26 downto 24),
      S_AXI_AWBURST => axi_interconnect_1_M_AWBURST(17 downto 16),
      S_AXI_AWLOCK => axi_interconnect_1_M_AWLOCK(16),
      S_AXI_AWCACHE => axi_interconnect_1_M_AWCACHE(35 downto 32),
      S_AXI_AWPROT => axi_interconnect_1_M_AWPROT(26 downto 24),
      S_AXI_WLAST => axi_interconnect_1_M_WLAST(8),
      S_AXI_BID => axi_interconnect_1_M_BID(53 downto 48),
      S_AXI_ARID => axi_interconnect_1_M_ARID(53 downto 48),
      S_AXI_ARLEN => axi_interconnect_1_M_ARLEN(71 downto 64),
      S_AXI_ARSIZE => axi_interconnect_1_M_ARSIZE(26 downto 24),
      S_AXI_ARBURST => axi_interconnect_1_M_ARBURST(17 downto 16),
      S_AXI_ARLOCK => axi_interconnect_1_M_ARLOCK(16),
      S_AXI_ARCACHE => axi_interconnect_1_M_ARCACHE(35 downto 32),
      S_AXI_ARPROT => axi_interconnect_1_M_ARPROT(26 downto 24),
      S_AXI_RID => axi_interconnect_1_M_RID(53 downto 48),
      S_AXI_RLAST => axi_interconnect_1_M_RLAST(8)
    );

  util_i2c_mixer_0 : system_util_i2c_mixer_0_wrapper
    port map (
      upstream_scl_T => util_i2c_mixer_0_upstream_scl_T,
      upstream_sda_T => util_i2c_mixer_0_upstream_sda_T,
      upstream_scl_I => util_i2c_mixer_0_upstream_scl_I,
      upstream_sda_I => util_i2c_mixer_0_upstream_sda_I,
      upstream_scl_O => util_i2c_mixer_0_upstream_scl_O,
      upstream_sda_O => util_i2c_mixer_0_upstream_sda_O,
      downstream_scl_I => util_i2c_mixer_0_downstream_scl_I,
      downstream_scl_O => util_i2c_mixer_0_downstream_scl_O,
      downstream_scl_T => util_i2c_mixer_0_downstream_scl_T,
      downstream_sda_I => util_i2c_mixer_0_downstream_sda_I,
      downstream_sda_O => util_i2c_mixer_0_downstream_sda_O,
      downstream_sda_T => util_i2c_mixer_0_downstream_sda_T
    );

  util_vector_logic_0 : system_util_vector_logic_0_wrapper
    port map (
      Op1 => util_vector_logic_0_Op1(0 to 0),
      Op2 => net_gnd1(0 to 0),
      Res => processing_system7_0_USB0_VBUS_PWRFAULT(0 to 0)
    );

  processing_system7_0 : system_processing_system7_0_wrapper
    port map (
      CAN0_PHY_TX => open,
      CAN0_PHY_RX => net_gnd0,
      CAN1_PHY_TX => open,
      CAN1_PHY_RX => net_gnd0,
      ENET0_GMII_TX_EN => open,
      ENET0_GMII_TX_ER => open,
      ENET0_MDIO_MDC => open,
      ENET0_MDIO_O => open,
      ENET0_MDIO_T => open,
      ENET0_PTP_DELAY_REQ_RX => open,
      ENET0_PTP_DELAY_REQ_TX => open,
      ENET0_PTP_PDELAY_REQ_RX => open,
      ENET0_PTP_PDELAY_REQ_TX => open,
      ENET0_PTP_PDELAY_RESP_RX => open,
      ENET0_PTP_PDELAY_RESP_TX => open,
      ENET0_PTP_SYNC_FRAME_RX => open,
      ENET0_PTP_SYNC_FRAME_TX => open,
      ENET0_SOF_RX => open,
      ENET0_SOF_TX => open,
      ENET0_GMII_TXD => open,
      ENET0_GMII_COL => net_gnd0,
      ENET0_GMII_CRS => net_gnd0,
      ENET0_EXT_INTIN => net_gnd0,
      ENET0_GMII_RX_CLK => net_gnd0,
      ENET0_GMII_RX_DV => net_gnd0,
      ENET0_GMII_RX_ER => net_gnd0,
      ENET0_GMII_TX_CLK => net_gnd0,
      ENET0_MDIO_I => net_gnd0,
      ENET0_GMII_RXD => net_gnd8,
      ENET1_GMII_TX_EN => open,
      ENET1_GMII_TX_ER => open,
      ENET1_MDIO_MDC => open,
      ENET1_MDIO_O => open,
      ENET1_MDIO_T => open,
      ENET1_PTP_DELAY_REQ_RX => open,
      ENET1_PTP_DELAY_REQ_TX => open,
      ENET1_PTP_PDELAY_REQ_RX => open,
      ENET1_PTP_PDELAY_REQ_TX => open,
      ENET1_PTP_PDELAY_RESP_RX => open,
      ENET1_PTP_PDELAY_RESP_TX => open,
      ENET1_PTP_SYNC_FRAME_RX => open,
      ENET1_PTP_SYNC_FRAME_TX => open,
      ENET1_SOF_RX => open,
      ENET1_SOF_TX => open,
      ENET1_GMII_TXD => open,
      ENET1_GMII_COL => net_gnd0,
      ENET1_GMII_CRS => net_gnd0,
      ENET1_EXT_INTIN => net_gnd0,
      ENET1_GMII_RX_CLK => net_gnd0,
      ENET1_GMII_RX_DV => net_gnd0,
      ENET1_GMII_RX_ER => net_gnd0,
      ENET1_GMII_TX_CLK => net_gnd0,
      ENET1_MDIO_I => net_gnd0,
      ENET1_GMII_RXD => net_gnd8,
      GPIO_I => net_gnd64,
      GPIO_O => open,
      GPIO_T => open,
      I2C0_SDA_I => net_gnd0,
      I2C0_SDA_O => open,
      I2C0_SDA_T => open,
      I2C0_SCL_I => net_gnd0,
      I2C0_SCL_O => open,
      I2C0_SCL_T => open,
      I2C1_SDA_I => net_gnd0,
      I2C1_SDA_O => open,
      I2C1_SDA_T => open,
      I2C1_SCL_I => net_gnd0,
      I2C1_SCL_O => open,
      I2C1_SCL_T => open,
      PJTAG_TCK => net_gnd0,
      PJTAG_TMS => net_gnd0,
      PJTAG_TD_I => net_gnd0,
      PJTAG_TD_T => open,
      PJTAG_TD_O => open,
      SDIO0_CLK => open,
      SDIO0_CLK_FB => net_gnd0,
      SDIO0_CMD_O => open,
      SDIO0_CMD_I => net_gnd0,
      SDIO0_CMD_T => open,
      SDIO0_DATA_I => net_gnd4,
      SDIO0_DATA_O => open,
      SDIO0_DATA_T => open,
      SDIO0_LED => open,
      SDIO0_CDN => net_gnd0,
      SDIO0_WP => net_gnd0,
      SDIO0_BUSPOW => open,
      SDIO0_BUSVOLT => open,
      SDIO1_CLK => open,
      SDIO1_CLK_FB => net_gnd0,
      SDIO1_CMD_O => open,
      SDIO1_CMD_I => net_gnd0,
      SDIO1_CMD_T => open,
      SDIO1_DATA_I => net_gnd4,
      SDIO1_DATA_O => open,
      SDIO1_DATA_T => open,
      SDIO1_LED => open,
      SDIO1_CDN => net_gnd0,
      SDIO1_WP => net_gnd0,
      SDIO1_BUSPOW => open,
      SDIO1_BUSVOLT => open,
      SPI0_SCLK_I => net_gnd0,
      SPI0_SCLK_O => open,
      SPI0_SCLK_T => open,
      SPI0_MOSI_I => net_gnd0,
      SPI0_MOSI_O => open,
      SPI0_MOSI_T => open,
      SPI0_MISO_I => net_gnd0,
      SPI0_MISO_O => open,
      SPI0_MISO_T => open,
      SPI0_SS_I => net_gnd0,
      SPI0_SS_O => open,
      SPI0_SS1_O => open,
      SPI0_SS2_O => open,
      SPI0_SS_T => open,
      SPI1_SCLK_I => net_gnd0,
      SPI1_SCLK_O => open,
      SPI1_SCLK_T => open,
      SPI1_MOSI_I => net_gnd0,
      SPI1_MOSI_O => open,
      SPI1_MOSI_T => open,
      SPI1_MISO_I => net_gnd0,
      SPI1_MISO_O => open,
      SPI1_MISO_T => open,
      SPI1_SS_I => net_gnd0,
      SPI1_SS_O => open,
      SPI1_SS1_O => open,
      SPI1_SS2_O => open,
      SPI1_SS_T => open,
      UART0_DTRN => open,
      UART0_RTSN => open,
      UART0_TX => open,
      UART0_CTSN => net_gnd0,
      UART0_DCDN => net_gnd0,
      UART0_DSRN => net_gnd0,
      UART0_RIN => net_gnd0,
      UART0_RX => net_gnd0,
      UART1_DTRN => open,
      UART1_RTSN => open,
      UART1_TX => open,
      UART1_CTSN => net_gnd0,
      UART1_DCDN => net_gnd0,
      UART1_DSRN => net_gnd0,
      UART1_RIN => net_gnd0,
      UART1_RX => net_gnd0,
      TTC0_WAVE_OUT => open,
      TTC0_CLK_IN => net_gnd3,
      TTC1_WAVE_OUT => open,
      TTC1_CLK_IN => net_gnd3,
      WDT_CLK_IN => net_gnd0,
      WDT_RST_OUT => open,
      TRACE_CLK => net_gnd0,
      TRACE_CTL => open,
      TRACE_DATA => open,
      USB0_PORT_INDCTL => open,
      USB1_PORT_INDCTL => open,
      USB0_VBUS_PWRSELECT => open,
      USB1_VBUS_PWRSELECT => open,
      USB0_VBUS_PWRFAULT => processing_system7_0_USB0_VBUS_PWRFAULT(0),
      USB1_VBUS_PWRFAULT => net_gnd0,
      SRAM_INTIN => net_gnd0,
      M_AXI_GP0_ARESETN => open,
      M_AXI_GP0_ARVALID => axi_interconnect_1_S_ARVALID(0),
      M_AXI_GP0_AWVALID => axi_interconnect_1_S_AWVALID(0),
      M_AXI_GP0_BREADY => axi_interconnect_1_S_BREADY(0),
      M_AXI_GP0_RREADY => axi_interconnect_1_S_RREADY(0),
      M_AXI_GP0_WLAST => axi_interconnect_1_S_WLAST(0),
      M_AXI_GP0_WVALID => axi_interconnect_1_S_WVALID(0),
      M_AXI_GP0_ARID => axi_interconnect_1_S_ARID,
      M_AXI_GP0_AWID => axi_interconnect_1_S_AWID,
      M_AXI_GP0_WID => axi_interconnect_1_S_WID,
      M_AXI_GP0_ARBURST => axi_interconnect_1_S_ARBURST,
      M_AXI_GP0_ARLOCK => axi_interconnect_1_S_ARLOCK,
      M_AXI_GP0_ARSIZE => axi_interconnect_1_S_ARSIZE,
      M_AXI_GP0_AWBURST => axi_interconnect_1_S_AWBURST,
      M_AXI_GP0_AWLOCK => axi_interconnect_1_S_AWLOCK,
      M_AXI_GP0_AWSIZE => axi_interconnect_1_S_AWSIZE,
      M_AXI_GP0_ARPROT => axi_interconnect_1_S_ARPROT,
      M_AXI_GP0_AWPROT => axi_interconnect_1_S_AWPROT,
      M_AXI_GP0_ARADDR => axi_interconnect_1_S_ARADDR,
      M_AXI_GP0_AWADDR => axi_interconnect_1_S_AWADDR,
      M_AXI_GP0_WDATA => axi_interconnect_1_S_WDATA,
      M_AXI_GP0_ARCACHE => axi_interconnect_1_S_ARCACHE,
      M_AXI_GP0_ARLEN => axi_interconnect_1_S_ARLEN(3 downto 0),
      M_AXI_GP0_ARQOS => axi_interconnect_1_S_ARQOS,
      M_AXI_GP0_AWCACHE => axi_interconnect_1_S_AWCACHE,
      M_AXI_GP0_AWLEN => axi_interconnect_1_S_AWLEN(3 downto 0),
      M_AXI_GP0_AWQOS => axi_interconnect_1_S_AWQOS,
      M_AXI_GP0_WSTRB => axi_interconnect_1_S_WSTRB,
      M_AXI_GP0_ACLK => pgassign1(9),
      M_AXI_GP0_ARREADY => axi_interconnect_1_S_ARREADY(0),
      M_AXI_GP0_AWREADY => axi_interconnect_1_S_AWREADY(0),
      M_AXI_GP0_BVALID => axi_interconnect_1_S_BVALID(0),
      M_AXI_GP0_RLAST => axi_interconnect_1_S_RLAST(0),
      M_AXI_GP0_RVALID => axi_interconnect_1_S_RVALID(0),
      M_AXI_GP0_WREADY => axi_interconnect_1_S_WREADY(0),
      M_AXI_GP0_BID => axi_interconnect_1_S_BID,
      M_AXI_GP0_RID => axi_interconnect_1_S_RID,
      M_AXI_GP0_BRESP => axi_interconnect_1_S_BRESP,
      M_AXI_GP0_RRESP => axi_interconnect_1_S_RRESP,
      M_AXI_GP0_RDATA => axi_interconnect_1_S_RDATA,
      M_AXI_GP1_ARESETN => open,
      M_AXI_GP1_ARVALID => open,
      M_AXI_GP1_AWVALID => open,
      M_AXI_GP1_BREADY => open,
      M_AXI_GP1_RREADY => open,
      M_AXI_GP1_WLAST => open,
      M_AXI_GP1_WVALID => open,
      M_AXI_GP1_ARID => open,
      M_AXI_GP1_AWID => open,
      M_AXI_GP1_WID => open,
      M_AXI_GP1_ARBURST => open,
      M_AXI_GP1_ARLOCK => open,
      M_AXI_GP1_ARSIZE => open,
      M_AXI_GP1_AWBURST => open,
      M_AXI_GP1_AWLOCK => open,
      M_AXI_GP1_AWSIZE => open,
      M_AXI_GP1_ARPROT => open,
      M_AXI_GP1_AWPROT => open,
      M_AXI_GP1_ARADDR => open,
      M_AXI_GP1_AWADDR => open,
      M_AXI_GP1_WDATA => open,
      M_AXI_GP1_ARCACHE => open,
      M_AXI_GP1_ARLEN => open,
      M_AXI_GP1_ARQOS => open,
      M_AXI_GP1_AWCACHE => open,
      M_AXI_GP1_AWLEN => open,
      M_AXI_GP1_AWQOS => open,
      M_AXI_GP1_WSTRB => open,
      M_AXI_GP1_ACLK => net_gnd0,
      M_AXI_GP1_ARREADY => net_gnd0,
      M_AXI_GP1_AWREADY => net_gnd0,
      M_AXI_GP1_BVALID => net_gnd0,
      M_AXI_GP1_RLAST => net_gnd0,
      M_AXI_GP1_RVALID => net_gnd0,
      M_AXI_GP1_WREADY => net_gnd0,
      M_AXI_GP1_BID => net_gnd6,
      M_AXI_GP1_RID => net_gnd6,
      M_AXI_GP1_BRESP => net_gnd2,
      M_AXI_GP1_RRESP => net_gnd2,
      M_AXI_GP1_RDATA => net_gnd32,
      S_AXI_GP0_ARESETN => open,
      S_AXI_GP0_ARREADY => open,
      S_AXI_GP0_AWREADY => open,
      S_AXI_GP0_BVALID => open,
      S_AXI_GP0_RLAST => open,
      S_AXI_GP0_RVALID => open,
      S_AXI_GP0_WREADY => open,
      S_AXI_GP0_BRESP => open,
      S_AXI_GP0_RRESP => open,
      S_AXI_GP0_RDATA => open,
      S_AXI_GP0_BID => open,
      S_AXI_GP0_RID => open,
      S_AXI_GP0_ACLK => net_gnd0,
      S_AXI_GP0_ARVALID => net_gnd0,
      S_AXI_GP0_AWVALID => net_gnd0,
      S_AXI_GP0_BREADY => net_gnd0,
      S_AXI_GP0_RREADY => net_gnd0,
      S_AXI_GP0_WLAST => net_gnd0,
      S_AXI_GP0_WVALID => net_gnd0,
      S_AXI_GP0_ARBURST => net_gnd2,
      S_AXI_GP0_ARLOCK => net_gnd2,
      S_AXI_GP0_ARSIZE => net_gnd3,
      S_AXI_GP0_AWBURST => net_gnd2,
      S_AXI_GP0_AWLOCK => net_gnd2,
      S_AXI_GP0_AWSIZE => net_gnd3,
      S_AXI_GP0_ARPROT => net_gnd3,
      S_AXI_GP0_AWPROT => net_gnd3,
      S_AXI_GP0_ARADDR => net_gnd32,
      S_AXI_GP0_AWADDR => net_gnd32,
      S_AXI_GP0_WDATA => net_gnd32,
      S_AXI_GP0_ARCACHE => net_gnd4,
      S_AXI_GP0_ARLEN => net_gnd4,
      S_AXI_GP0_ARQOS => net_gnd4,
      S_AXI_GP0_AWCACHE => net_gnd4,
      S_AXI_GP0_AWLEN => net_gnd4,
      S_AXI_GP0_AWQOS => net_gnd4,
      S_AXI_GP0_WSTRB => net_gnd4,
      S_AXI_GP0_ARID => net_gnd6,
      S_AXI_GP0_AWID => net_gnd6,
      S_AXI_GP0_WID => net_gnd6,
      S_AXI_GP1_ARESETN => open,
      S_AXI_GP1_ARREADY => open,
      S_AXI_GP1_AWREADY => open,
      S_AXI_GP1_BVALID => open,
      S_AXI_GP1_RLAST => open,
      S_AXI_GP1_RVALID => open,
      S_AXI_GP1_WREADY => open,
      S_AXI_GP1_BRESP => open,
      S_AXI_GP1_RRESP => open,
      S_AXI_GP1_RDATA => open,
      S_AXI_GP1_BID => open,
      S_AXI_GP1_RID => open,
      S_AXI_GP1_ACLK => net_gnd0,
      S_AXI_GP1_ARVALID => net_gnd0,
      S_AXI_GP1_AWVALID => net_gnd0,
      S_AXI_GP1_BREADY => net_gnd0,
      S_AXI_GP1_RREADY => net_gnd0,
      S_AXI_GP1_WLAST => net_gnd0,
      S_AXI_GP1_WVALID => net_gnd0,
      S_AXI_GP1_ARBURST => net_gnd2,
      S_AXI_GP1_ARLOCK => net_gnd2,
      S_AXI_GP1_ARSIZE => net_gnd3,
      S_AXI_GP1_AWBURST => net_gnd2,
      S_AXI_GP1_AWLOCK => net_gnd2,
      S_AXI_GP1_AWSIZE => net_gnd3,
      S_AXI_GP1_ARPROT => net_gnd3,
      S_AXI_GP1_AWPROT => net_gnd3,
      S_AXI_GP1_ARADDR => net_gnd32,
      S_AXI_GP1_AWADDR => net_gnd32,
      S_AXI_GP1_WDATA => net_gnd32,
      S_AXI_GP1_ARCACHE => net_gnd4,
      S_AXI_GP1_ARLEN => net_gnd4,
      S_AXI_GP1_ARQOS => net_gnd4,
      S_AXI_GP1_AWCACHE => net_gnd4,
      S_AXI_GP1_AWLEN => net_gnd4,
      S_AXI_GP1_AWQOS => net_gnd4,
      S_AXI_GP1_WSTRB => net_gnd4,
      S_AXI_GP1_ARID => net_gnd6,
      S_AXI_GP1_AWID => net_gnd6,
      S_AXI_GP1_WID => net_gnd6,
      S_AXI_ACP_ARESETN => open,
      S_AXI_ACP_AWREADY => open,
      S_AXI_ACP_ARREADY => open,
      S_AXI_ACP_BVALID => open,
      S_AXI_ACP_RLAST => open,
      S_AXI_ACP_RVALID => open,
      S_AXI_ACP_WREADY => open,
      S_AXI_ACP_BRESP => open,
      S_AXI_ACP_RRESP => open,
      S_AXI_ACP_BID => open,
      S_AXI_ACP_RID => open,
      S_AXI_ACP_RDATA => open,
      S_AXI_ACP_ACLK => net_gnd0,
      S_AXI_ACP_ARVALID => net_gnd0,
      S_AXI_ACP_AWVALID => net_gnd0,
      S_AXI_ACP_BREADY => net_gnd0,
      S_AXI_ACP_RREADY => net_gnd0,
      S_AXI_ACP_WLAST => net_gnd0,
      S_AXI_ACP_WVALID => net_gnd0,
      S_AXI_ACP_ARID => net_gnd3,
      S_AXI_ACP_ARPROT => net_gnd3,
      S_AXI_ACP_AWID => net_gnd3,
      S_AXI_ACP_AWPROT => net_gnd3,
      S_AXI_ACP_WID => net_gnd3,
      S_AXI_ACP_ARADDR => net_gnd32,
      S_AXI_ACP_AWADDR => net_gnd32,
      S_AXI_ACP_ARCACHE => net_gnd4,
      S_AXI_ACP_ARLEN => net_gnd4,
      S_AXI_ACP_ARQOS => net_gnd4,
      S_AXI_ACP_AWCACHE => net_gnd4,
      S_AXI_ACP_AWLEN => net_gnd4,
      S_AXI_ACP_AWQOS => net_gnd4,
      S_AXI_ACP_ARBURST => net_gnd2,
      S_AXI_ACP_ARLOCK => net_gnd2,
      S_AXI_ACP_ARSIZE => net_gnd3,
      S_AXI_ACP_AWBURST => net_gnd2,
      S_AXI_ACP_AWLOCK => net_gnd2,
      S_AXI_ACP_AWSIZE => net_gnd3,
      S_AXI_ACP_ARUSER => net_gnd5,
      S_AXI_ACP_AWUSER => net_gnd5,
      S_AXI_ACP_WDATA => net_gnd64,
      S_AXI_ACP_WSTRB => net_gnd8,
      S_AXI_HP0_ARESETN => open,
      S_AXI_HP0_ARREADY => axi_interconnect_2_M_ARREADY(0),
      S_AXI_HP0_AWREADY => axi_interconnect_2_M_AWREADY(0),
      S_AXI_HP0_BVALID => axi_interconnect_2_M_BVALID(0),
      S_AXI_HP0_RLAST => axi_interconnect_2_M_RLAST(0),
      S_AXI_HP0_RVALID => axi_interconnect_2_M_RVALID(0),
      S_AXI_HP0_WREADY => axi_interconnect_2_M_WREADY(0),
      S_AXI_HP0_BRESP => axi_interconnect_2_M_BRESP,
      S_AXI_HP0_RRESP => axi_interconnect_2_M_RRESP,
      S_AXI_HP0_BID => axi_interconnect_2_M_BID(0 to 0),
      S_AXI_HP0_RID => axi_interconnect_2_M_RID(0 to 0),
      S_AXI_HP0_RDATA => axi_interconnect_2_M_RDATA,
      S_AXI_HP0_RCOUNT => open,
      S_AXI_HP0_WCOUNT => open,
      S_AXI_HP0_RACOUNT => open,
      S_AXI_HP0_WACOUNT => open,
      S_AXI_HP0_ACLK => processing_system7_0_FCLK_CLK1(0),
      S_AXI_HP0_ARVALID => axi_interconnect_2_M_ARVALID(0),
      S_AXI_HP0_AWVALID => axi_interconnect_2_M_AWVALID(0),
      S_AXI_HP0_BREADY => axi_interconnect_2_M_BREADY(0),
      S_AXI_HP0_RDISSUECAP1_EN => net_gnd0,
      S_AXI_HP0_RREADY => axi_interconnect_2_M_RREADY(0),
      S_AXI_HP0_WLAST => axi_interconnect_2_M_WLAST(0),
      S_AXI_HP0_WRISSUECAP1_EN => net_gnd0,
      S_AXI_HP0_WVALID => axi_interconnect_2_M_WVALID(0),
      S_AXI_HP0_ARBURST => axi_interconnect_2_M_ARBURST,
      S_AXI_HP0_ARLOCK => axi_interconnect_2_M_ARLOCK,
      S_AXI_HP0_ARSIZE => axi_interconnect_2_M_ARSIZE,
      S_AXI_HP0_AWBURST => axi_interconnect_2_M_AWBURST,
      S_AXI_HP0_AWLOCK => axi_interconnect_2_M_AWLOCK,
      S_AXI_HP0_AWSIZE => axi_interconnect_2_M_AWSIZE,
      S_AXI_HP0_ARPROT => axi_interconnect_2_M_ARPROT,
      S_AXI_HP0_AWPROT => axi_interconnect_2_M_AWPROT,
      S_AXI_HP0_ARADDR => axi_interconnect_2_M_ARADDR,
      S_AXI_HP0_AWADDR => axi_interconnect_2_M_AWADDR,
      S_AXI_HP0_ARCACHE => axi_interconnect_2_M_ARCACHE,
      S_AXI_HP0_ARLEN => axi_interconnect_2_M_ARLEN(3 downto 0),
      S_AXI_HP0_ARQOS => axi_interconnect_2_M_ARQOS,
      S_AXI_HP0_AWCACHE => axi_interconnect_2_M_AWCACHE,
      S_AXI_HP0_AWLEN => axi_interconnect_2_M_AWLEN(3 downto 0),
      S_AXI_HP0_AWQOS => axi_interconnect_2_M_AWQOS,
      S_AXI_HP0_ARID => axi_interconnect_2_M_ARID(0 to 0),
      S_AXI_HP0_AWID => axi_interconnect_2_M_AWID(0 to 0),
      S_AXI_HP0_WID => axi_interconnect_2_M_WID(0 to 0),
      S_AXI_HP0_WDATA => axi_interconnect_2_M_WDATA,
      S_AXI_HP0_WSTRB => axi_interconnect_2_M_WSTRB,
      S_AXI_HP1_ARESETN => open,
      S_AXI_HP1_ARREADY => axi_interconnect_0_M_ARREADY(0),
      S_AXI_HP1_AWREADY => axi_interconnect_0_M_AWREADY(0),
      S_AXI_HP1_BVALID => axi_interconnect_0_M_BVALID(0),
      S_AXI_HP1_RLAST => axi_interconnect_0_M_RLAST(0),
      S_AXI_HP1_RVALID => axi_interconnect_0_M_RVALID(0),
      S_AXI_HP1_WREADY => axi_interconnect_0_M_WREADY(0),
      S_AXI_HP1_BRESP => axi_interconnect_0_M_BRESP,
      S_AXI_HP1_RRESP => axi_interconnect_0_M_RRESP,
      S_AXI_HP1_BID => axi_interconnect_0_M_BID,
      S_AXI_HP1_RID => axi_interconnect_0_M_RID,
      S_AXI_HP1_RDATA => axi_interconnect_0_M_RDATA,
      S_AXI_HP1_RCOUNT => open,
      S_AXI_HP1_WCOUNT => open,
      S_AXI_HP1_RACOUNT => open,
      S_AXI_HP1_WACOUNT => open,
      S_AXI_HP1_ACLK => pgassign1(9),
      S_AXI_HP1_ARVALID => axi_interconnect_0_M_ARVALID(0),
      S_AXI_HP1_AWVALID => axi_interconnect_0_M_AWVALID(0),
      S_AXI_HP1_BREADY => axi_interconnect_0_M_BREADY(0),
      S_AXI_HP1_RDISSUECAP1_EN => net_gnd0,
      S_AXI_HP1_RREADY => axi_interconnect_0_M_RREADY(0),
      S_AXI_HP1_WLAST => axi_interconnect_0_M_WLAST(0),
      S_AXI_HP1_WRISSUECAP1_EN => net_gnd0,
      S_AXI_HP1_WVALID => axi_interconnect_0_M_WVALID(0),
      S_AXI_HP1_ARBURST => axi_interconnect_0_M_ARBURST,
      S_AXI_HP1_ARLOCK => axi_interconnect_0_M_ARLOCK,
      S_AXI_HP1_ARSIZE => axi_interconnect_0_M_ARSIZE,
      S_AXI_HP1_AWBURST => axi_interconnect_0_M_AWBURST,
      S_AXI_HP1_AWLOCK => axi_interconnect_0_M_AWLOCK,
      S_AXI_HP1_AWSIZE => axi_interconnect_0_M_AWSIZE,
      S_AXI_HP1_ARPROT => axi_interconnect_0_M_ARPROT,
      S_AXI_HP1_AWPROT => axi_interconnect_0_M_AWPROT,
      S_AXI_HP1_ARADDR => axi_interconnect_0_M_ARADDR,
      S_AXI_HP1_AWADDR => axi_interconnect_0_M_AWADDR,
      S_AXI_HP1_ARCACHE => axi_interconnect_0_M_ARCACHE,
      S_AXI_HP1_ARLEN => axi_interconnect_0_M_ARLEN(3 downto 0),
      S_AXI_HP1_ARQOS => axi_interconnect_0_M_ARQOS,
      S_AXI_HP1_AWCACHE => axi_interconnect_0_M_AWCACHE,
      S_AXI_HP1_AWLEN => axi_interconnect_0_M_AWLEN(3 downto 0),
      S_AXI_HP1_AWQOS => axi_interconnect_0_M_AWQOS,
      S_AXI_HP1_ARID => axi_interconnect_0_M_ARID,
      S_AXI_HP1_AWID => axi_interconnect_0_M_AWID,
      S_AXI_HP1_WID => axi_interconnect_0_M_WID,
      S_AXI_HP1_WDATA => axi_interconnect_0_M_WDATA,
      S_AXI_HP1_WSTRB => axi_interconnect_0_M_WSTRB,
      S_AXI_HP2_ARESETN => open,
      S_AXI_HP2_ARREADY => axi_interconnect_3_M_ARREADY(0),
      S_AXI_HP2_AWREADY => axi_interconnect_3_M_AWREADY(0),
      S_AXI_HP2_BVALID => axi_interconnect_3_M_BVALID(0),
      S_AXI_HP2_RLAST => axi_interconnect_3_M_RLAST(0),
      S_AXI_HP2_RVALID => axi_interconnect_3_M_RVALID(0),
      S_AXI_HP2_WREADY => axi_interconnect_3_M_WREADY(0),
      S_AXI_HP2_BRESP => axi_interconnect_3_M_BRESP,
      S_AXI_HP2_RRESP => axi_interconnect_3_M_RRESP,
      S_AXI_HP2_BID => axi_interconnect_3_M_BID(0 to 0),
      S_AXI_HP2_RID => axi_interconnect_3_M_RID(0 to 0),
      S_AXI_HP2_RDATA => axi_interconnect_3_M_RDATA,
      S_AXI_HP2_RCOUNT => open,
      S_AXI_HP2_WCOUNT => open,
      S_AXI_HP2_RACOUNT => open,
      S_AXI_HP2_WACOUNT => open,
      S_AXI_HP2_ACLK => pgassign1(10),
      S_AXI_HP2_ARVALID => axi_interconnect_3_M_ARVALID(0),
      S_AXI_HP2_AWVALID => axi_interconnect_3_M_AWVALID(0),
      S_AXI_HP2_BREADY => axi_interconnect_3_M_BREADY(0),
      S_AXI_HP2_RDISSUECAP1_EN => net_gnd0,
      S_AXI_HP2_RREADY => axi_interconnect_3_M_RREADY(0),
      S_AXI_HP2_WLAST => axi_interconnect_3_M_WLAST(0),
      S_AXI_HP2_WRISSUECAP1_EN => net_gnd0,
      S_AXI_HP2_WVALID => axi_interconnect_3_M_WVALID(0),
      S_AXI_HP2_ARBURST => axi_interconnect_3_M_ARBURST,
      S_AXI_HP2_ARLOCK => axi_interconnect_3_M_ARLOCK,
      S_AXI_HP2_ARSIZE => axi_interconnect_3_M_ARSIZE,
      S_AXI_HP2_AWBURST => axi_interconnect_3_M_AWBURST,
      S_AXI_HP2_AWLOCK => axi_interconnect_3_M_AWLOCK,
      S_AXI_HP2_AWSIZE => axi_interconnect_3_M_AWSIZE,
      S_AXI_HP2_ARPROT => axi_interconnect_3_M_ARPROT,
      S_AXI_HP2_AWPROT => axi_interconnect_3_M_AWPROT,
      S_AXI_HP2_ARADDR => axi_interconnect_3_M_ARADDR,
      S_AXI_HP2_AWADDR => axi_interconnect_3_M_AWADDR,
      S_AXI_HP2_ARCACHE => axi_interconnect_3_M_ARCACHE,
      S_AXI_HP2_ARLEN => axi_interconnect_3_M_ARLEN(3 downto 0),
      S_AXI_HP2_ARQOS => axi_interconnect_3_M_ARQOS,
      S_AXI_HP2_AWCACHE => axi_interconnect_3_M_AWCACHE,
      S_AXI_HP2_AWLEN => axi_interconnect_3_M_AWLEN(3 downto 0),
      S_AXI_HP2_AWQOS => axi_interconnect_3_M_AWQOS,
      S_AXI_HP2_ARID => axi_interconnect_3_M_ARID(0 to 0),
      S_AXI_HP2_AWID => axi_interconnect_3_M_AWID(0 to 0),
      S_AXI_HP2_WID => axi_interconnect_3_M_WID(0 to 0),
      S_AXI_HP2_WDATA => axi_interconnect_3_M_WDATA,
      S_AXI_HP2_WSTRB => axi_interconnect_3_M_WSTRB,
      S_AXI_HP3_ARESETN => open,
      S_AXI_HP3_ARREADY => open,
      S_AXI_HP3_AWREADY => open,
      S_AXI_HP3_BVALID => open,
      S_AXI_HP3_RLAST => open,
      S_AXI_HP3_RVALID => open,
      S_AXI_HP3_WREADY => open,
      S_AXI_HP3_BRESP => open,
      S_AXI_HP3_RRESP => open,
      S_AXI_HP3_BID => open,
      S_AXI_HP3_RID => open,
      S_AXI_HP3_RDATA => open,
      S_AXI_HP3_RCOUNT => open,
      S_AXI_HP3_WCOUNT => open,
      S_AXI_HP3_RACOUNT => open,
      S_AXI_HP3_WACOUNT => open,
      S_AXI_HP3_ACLK => net_gnd0,
      S_AXI_HP3_ARVALID => net_gnd0,
      S_AXI_HP3_AWVALID => net_gnd0,
      S_AXI_HP3_BREADY => net_gnd0,
      S_AXI_HP3_RDISSUECAP1_EN => net_gnd0,
      S_AXI_HP3_RREADY => net_gnd0,
      S_AXI_HP3_WLAST => net_gnd0,
      S_AXI_HP3_WRISSUECAP1_EN => net_gnd0,
      S_AXI_HP3_WVALID => net_gnd0,
      S_AXI_HP3_ARBURST => net_gnd2,
      S_AXI_HP3_ARLOCK => net_gnd2,
      S_AXI_HP3_ARSIZE => net_gnd3,
      S_AXI_HP3_AWBURST => net_gnd2,
      S_AXI_HP3_AWLOCK => net_gnd2,
      S_AXI_HP3_AWSIZE => net_gnd3,
      S_AXI_HP3_ARPROT => net_gnd3,
      S_AXI_HP3_AWPROT => net_gnd3,
      S_AXI_HP3_ARADDR => net_gnd32,
      S_AXI_HP3_AWADDR => net_gnd32,
      S_AXI_HP3_ARCACHE => net_gnd4,
      S_AXI_HP3_ARLEN => net_gnd4,
      S_AXI_HP3_ARQOS => net_gnd4,
      S_AXI_HP3_AWCACHE => net_gnd4,
      S_AXI_HP3_AWLEN => net_gnd4,
      S_AXI_HP3_AWQOS => net_gnd4,
      S_AXI_HP3_ARID => net_gnd6,
      S_AXI_HP3_AWID => net_gnd6,
      S_AXI_HP3_WID => net_gnd6,
      S_AXI_HP3_WDATA => net_gnd64,
      S_AXI_HP3_WSTRB => net_gnd8,
      DMA0_DATYPE => open,
      DMA0_DAVALID => open,
      DMA0_DRREADY => open,
      DMA0_RSTN => open,
      DMA0_ACLK => net_gnd0,
      DMA0_DAREADY => net_gnd0,
      DMA0_DRLAST => net_gnd0,
      DMA0_DRVALID => net_gnd0,
      DMA0_DRTYPE => net_gnd2,
      DMA1_DATYPE => open,
      DMA1_DAVALID => open,
      DMA1_DRREADY => open,
      DMA1_RSTN => open,
      DMA1_ACLK => net_gnd0,
      DMA1_DAREADY => net_gnd0,
      DMA1_DRLAST => net_gnd0,
      DMA1_DRVALID => net_gnd0,
      DMA1_DRTYPE => net_gnd2,
      DMA2_DATYPE => open,
      DMA2_DAVALID => open,
      DMA2_DRREADY => open,
      DMA2_RSTN => open,
      DMA2_ACLK => net_gnd0,
      DMA2_DAREADY => net_gnd0,
      DMA2_DRLAST => net_gnd0,
      DMA2_DRVALID => net_gnd0,
      DMA3_DRVALID => net_gnd0,
      DMA3_DATYPE => open,
      DMA3_DAVALID => open,
      DMA3_DRREADY => open,
      DMA3_RSTN => open,
      DMA3_ACLK => net_gnd0,
      DMA3_DAREADY => net_gnd0,
      DMA3_DRLAST => net_gnd0,
      DMA2_DRTYPE => net_gnd2,
      DMA3_DRTYPE => net_gnd2,
      FTMD_TRACEIN_DATA => net_gnd32,
      FTMD_TRACEIN_VALID => net_gnd0,
      FTMD_TRACEIN_CLK => net_gnd0,
      FTMD_TRACEIN_ATID => net_gnd4,
      FTMT_F2P_TRIG => net_gnd4,
      FTMT_F2P_TRIGACK => open,
      FTMT_F2P_DEBUG => net_gnd32,
      FTMT_P2F_TRIGACK => net_gnd4,
      FTMT_P2F_TRIG => open,
      FTMT_P2F_DEBUG => open,
      FCLK_CLK3 => axi_interconnect_3_INTERCONNECT_ACLK(0),
      FCLK_CLK2 => processing_system7_0_FCLK_CLK2,
      FCLK_CLK1 => processing_system7_0_FCLK_CLK1(0),
      FCLK_CLK0 => processing_system7_0_FCLK_CLK0(0),
      FCLK_CLKTRIG3_N => net_gnd0,
      FCLK_CLKTRIG2_N => net_gnd0,
      FCLK_CLKTRIG1_N => net_gnd0,
      FCLK_CLKTRIG0_N => net_gnd0,
      FCLK_RESET3_N => axi_interconnect_3_INTERCONNECT_ARESETN,
      FCLK_RESET2_N => open,
      FCLK_RESET1_N => axi_interconnect_2_INTERCONNECT_ARESETN,
      FCLK_RESET0_N => axi_interconnect_0_INTERCONNECT_ARESETN,
      FPGA_IDLE_N => net_gnd0,
      DDR_ARB => net_gnd4,
      IRQ_F2P => pgassign3,
      Core0_nFIQ => net_gnd0,
      Core0_nIRQ => net_gnd0,
      Core1_nFIQ => net_gnd0,
      Core1_nIRQ => net_gnd0,
      EVENT_EVENTO => open,
      EVENT_STANDBYWFE => open,
      EVENT_STANDBYWFI => open,
      EVENT_EVENTI => net_gnd0,
      MIO => processing_system7_0_MIO,
      DDR_Clk => processing_system7_0_DDR_Clk,
      DDR_Clk_n => processing_system7_0_DDR_Clk_n,
      DDR_CKE => processing_system7_0_DDR_CKE,
      DDR_CS_n => processing_system7_0_DDR_CS_n,
      DDR_RAS_n => processing_system7_0_DDR_RAS_n,
      DDR_CAS_n => processing_system7_0_DDR_CAS_n,
      DDR_WEB => processing_system7_0_DDR_WEB,
      DDR_BankAddr => processing_system7_0_DDR_BankAddr,
      DDR_Addr => processing_system7_0_DDR_Addr,
      DDR_ODT => processing_system7_0_DDR_ODT,
      DDR_DRSTB => processing_system7_0_DDR_DRSTB,
      DDR_DQ => processing_system7_0_DDR_DQ,
      DDR_DM => processing_system7_0_DDR_DM,
      DDR_DQS => processing_system7_0_DDR_DQS,
      DDR_DQS_n => processing_system7_0_DDR_DQS_n,
      DDR_VRN => processing_system7_0_DDR_VRN,
      DDR_VRP => processing_system7_0_DDR_VRP,
      PS_SRSTB => processing_system7_0_PS_SRSTB,
      PS_CLK => processing_system7_0_PS_CLK,
      PS_PORB => processing_system7_0_PS_PORB,
      IRQ_P2F_DMAC_ABORT => open,
      IRQ_P2F_DMAC0 => open,
      IRQ_P2F_DMAC1 => open,
      IRQ_P2F_DMAC2 => open,
      IRQ_P2F_DMAC3 => open,
      IRQ_P2F_DMAC4 => open,
      IRQ_P2F_DMAC5 => open,
      IRQ_P2F_DMAC6 => open,
      IRQ_P2F_DMAC7 => open,
      IRQ_P2F_SMC => open,
      IRQ_P2F_QSPI => open,
      IRQ_P2F_CTI => open,
      IRQ_P2F_GPIO => open,
      IRQ_P2F_USB0 => open,
      IRQ_P2F_ENET0 => open,
      IRQ_P2F_ENET_WAKE0 => open,
      IRQ_P2F_SDIO0 => open,
      IRQ_P2F_I2C0 => open,
      IRQ_P2F_SPI0 => open,
      IRQ_P2F_UART0 => open,
      IRQ_P2F_CAN0 => open,
      IRQ_P2F_USB1 => open,
      IRQ_P2F_ENET1 => open,
      IRQ_P2F_ENET_WAKE1 => open,
      IRQ_P2F_SDIO1 => open,
      IRQ_P2F_I2C1 => open,
      IRQ_P2F_SPI1 => open,
      IRQ_P2F_UART1 => open,
      IRQ_P2F_CAN1 => open
    );

  axi_vdma_1 : system_axi_vdma_1_wrapper
    port map (
      s_axi_lite_aclk => pgassign1(9),
      m_axi_sg_aclk => net_gnd0,
      m_axi_mm2s_aclk => pgassign1(10),
      m_axi_s2mm_aclk => pgassign1(10),
      m_axis_mm2s_aclk => pgassign1(10),
      s_axis_s2mm_aclk => pgassign1(10),
      axi_resetn => axi_interconnect_1_M_ARESETN(9),
      s_axi_lite_awvalid => axi_interconnect_1_M_AWVALID(9),
      s_axi_lite_awready => axi_interconnect_1_M_AWREADY(9),
      s_axi_lite_awaddr => axi_interconnect_1_M_AWADDR(296 downto 288),
      s_axi_lite_wvalid => axi_interconnect_1_M_WVALID(9),
      s_axi_lite_wready => axi_interconnect_1_M_WREADY(9),
      s_axi_lite_wdata => axi_interconnect_1_M_WDATA(319 downto 288),
      s_axi_lite_bresp => axi_interconnect_1_M_BRESP(19 downto 18),
      s_axi_lite_bvalid => axi_interconnect_1_M_BVALID(9),
      s_axi_lite_bready => axi_interconnect_1_M_BREADY(9),
      s_axi_lite_arvalid => axi_interconnect_1_M_ARVALID(9),
      s_axi_lite_arready => axi_interconnect_1_M_ARREADY(9),
      s_axi_lite_araddr => axi_interconnect_1_M_ARADDR(296 downto 288),
      s_axi_lite_rvalid => axi_interconnect_1_M_RVALID(9),
      s_axi_lite_rready => axi_interconnect_1_M_RREADY(9),
      s_axi_lite_rdata => axi_interconnect_1_M_RDATA(319 downto 288),
      s_axi_lite_rresp => axi_interconnect_1_M_RRESP(19 downto 18),
      m_axi_sg_araddr => open,
      m_axi_sg_arlen => open,
      m_axi_sg_arsize => open,
      m_axi_sg_arburst => open,
      m_axi_sg_arprot => open,
      m_axi_sg_arcache => open,
      m_axi_sg_arvalid => open,
      m_axi_sg_arready => net_gnd0,
      m_axi_sg_rdata => net_gnd32,
      m_axi_sg_rresp => net_gnd2,
      m_axi_sg_rlast => net_gnd0,
      m_axi_sg_rvalid => net_gnd0,
      m_axi_sg_rready => open,
      m_axi_mm2s_araddr => axi_interconnect_3_S_ARADDR(31 downto 0),
      m_axi_mm2s_arlen => axi_interconnect_3_S_ARLEN(7 downto 0),
      m_axi_mm2s_arsize => axi_interconnect_3_S_ARSIZE(2 downto 0),
      m_axi_mm2s_arburst => axi_interconnect_3_S_ARBURST(1 downto 0),
      m_axi_mm2s_arprot => axi_interconnect_3_S_ARPROT(2 downto 0),
      m_axi_mm2s_arcache => axi_interconnect_3_S_ARCACHE(3 downto 0),
      m_axi_mm2s_arvalid => axi_interconnect_3_S_ARVALID(0),
      m_axi_mm2s_arready => axi_interconnect_3_S_ARREADY(0),
      m_axi_mm2s_rdata => axi_interconnect_3_S_RDATA(63 downto 0),
      m_axi_mm2s_rresp => axi_interconnect_3_S_RRESP(1 downto 0),
      m_axi_mm2s_rlast => axi_interconnect_3_S_RLAST(0),
      m_axi_mm2s_rvalid => axi_interconnect_3_S_RVALID(0),
      m_axi_mm2s_rready => axi_interconnect_3_S_RREADY(0),
      mm2s_prmry_reset_out_n => open,
      m_axis_mm2s_tdata => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TDATA,
      m_axis_mm2s_tkeep => open,
      m_axis_mm2s_tvalid => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TVALID,
      m_axis_mm2s_tready => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TREADY,
      m_axis_mm2s_tlast => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TLAST(0),
      m_axis_mm2s_tuser => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TUSER(0 to 0),
      m_axi_s2mm_awaddr => axi_interconnect_3_S_AWADDR(63 downto 32),
      m_axi_s2mm_awlen => axi_interconnect_3_S_AWLEN(15 downto 8),
      m_axi_s2mm_awsize => axi_interconnect_3_S_AWSIZE(5 downto 3),
      m_axi_s2mm_awburst => axi_interconnect_3_S_AWBURST(3 downto 2),
      m_axi_s2mm_awprot => axi_interconnect_3_S_AWPROT(5 downto 3),
      m_axi_s2mm_awcache => axi_interconnect_3_S_AWCACHE(7 downto 4),
      m_axi_s2mm_awvalid => axi_interconnect_3_S_AWVALID(1),
      m_axi_s2mm_awready => axi_interconnect_3_S_AWREADY(1),
      m_axi_s2mm_wdata => axi_interconnect_3_S_WDATA(127 downto 64),
      m_axi_s2mm_wstrb => axi_interconnect_3_S_WSTRB(15 downto 8),
      m_axi_s2mm_wlast => axi_interconnect_3_S_WLAST(1),
      m_axi_s2mm_wvalid => axi_interconnect_3_S_WVALID(1),
      m_axi_s2mm_wready => axi_interconnect_3_S_WREADY(1),
      m_axi_s2mm_bresp => axi_interconnect_3_S_BRESP(3 downto 2),
      m_axi_s2mm_bvalid => axi_interconnect_3_S_BVALID(1),
      m_axi_s2mm_bready => axi_interconnect_3_S_BREADY(1),
      s2mm_prmry_reset_out_n => open,
      s_axis_s2mm_tdata => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TDATA,
      s_axis_s2mm_tkeep => net_vcc4,
      s_axis_s2mm_tvalid => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TVALID,
      s_axis_s2mm_tready => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TREADY,
      s_axis_s2mm_tlast => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TLAST(0),
      s_axis_s2mm_tuser => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TUSER(0 to 0),
      mm2s_fsync => net_gnd0,
      mm2s_frame_ptr_in => net_gnd6,
      mm2s_frame_ptr_out => open,
      mm2s_fsync_out => open,
      mm2s_prmtr_update => open,
      mm2s_buffer_empty => open,
      mm2s_buffer_almost_empty => open,
      s2mm_fsync => net_gnd0,
      s2mm_frame_ptr_in => net_gnd6,
      s2mm_frame_ptr_out => open,
      s2mm_fsync_out => open,
      s2mm_buffer_full => open,
      s2mm_buffer_almost_full => open,
      s2mm_prmtr_update => open,
      mm2s_introut => axi_vdma_1_mm2s_introut,
      s2mm_introut => axi_vdma_1_s2mm_introut,
      axi_vdma_tstvec => open
    );

  sobel_filter_top_0 : system_sobel_filter_top_0_wrapper
    port map (
      aclk => pgassign1(10),
      aresetn => axi_interconnect_1_M_ARESETN(10),
      s_axi_CONTROL_BUS_AWADDR => axi_interconnect_1_M_AWADDR(324 downto 320),
      s_axi_CONTROL_BUS_AWVALID => axi_interconnect_1_M_AWVALID(10),
      s_axi_CONTROL_BUS_AWREADY => axi_interconnect_1_M_AWREADY(10),
      s_axi_CONTROL_BUS_WDATA => axi_interconnect_1_M_WDATA(351 downto 320),
      s_axi_CONTROL_BUS_WSTRB => axi_interconnect_1_M_WSTRB(43 downto 40),
      s_axi_CONTROL_BUS_WVALID => axi_interconnect_1_M_WVALID(10),
      s_axi_CONTROL_BUS_WREADY => axi_interconnect_1_M_WREADY(10),
      s_axi_CONTROL_BUS_BRESP => axi_interconnect_1_M_BRESP(21 downto 20),
      s_axi_CONTROL_BUS_BVALID => axi_interconnect_1_M_BVALID(10),
      s_axi_CONTROL_BUS_BREADY => axi_interconnect_1_M_BREADY(10),
      s_axi_CONTROL_BUS_ARADDR => axi_interconnect_1_M_ARADDR(324 downto 320),
      s_axi_CONTROL_BUS_ARVALID => axi_interconnect_1_M_ARVALID(10),
      s_axi_CONTROL_BUS_ARREADY => axi_interconnect_1_M_ARREADY(10),
      s_axi_CONTROL_BUS_RDATA => axi_interconnect_1_M_RDATA(351 downto 320),
      s_axi_CONTROL_BUS_RRESP => axi_interconnect_1_M_RRESP(21 downto 20),
      s_axi_CONTROL_BUS_RVALID => axi_interconnect_1_M_RVALID(10),
      s_axi_CONTROL_BUS_RREADY => axi_interconnect_1_M_RREADY(10),
      interrupt => sobel_filter_top_0_interrupt,
      INPUT_STREAM_TVALID => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TVALID,
      INPUT_STREAM_TREADY => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TREADY,
      INPUT_STREAM_TDATA => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TDATA,
      INPUT_STREAM_TSTRB => net_gnd4,
      INPUT_STREAM_TUSER => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TUSER(0 to 0),
      INPUT_STREAM_TLAST => axi_vdma_1_M_AXIS_MM2S__To__sobel_filter_top_0_INPUT_STREAM_TLAST(0 to 0),
      INPUT_STREAM_TDEST => net_gnd1(0 to 0),
      OUTPUT_STREAM_TVALID => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TVALID,
      OUTPUT_STREAM_TREADY => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TREADY,
      OUTPUT_STREAM_TDATA => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TDATA,
      OUTPUT_STREAM_TSTRB => open,
      OUTPUT_STREAM_TUSER => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TUSER(0 to 0),
      OUTPUT_STREAM_TLAST => sobel_filter_top_0_OUTPUT_STREAM__To__axi_vdma_1_S_AXIS_S2MM_TLAST(0 to 0),
      OUTPUT_STREAM_TDEST => open
    );

  axi_interconnect_3 : system_axi_interconnect_3_wrapper
    port map (
      INTERCONNECT_ACLK => pgassign1(10),
      INTERCONNECT_ARESETN => axi_interconnect_3_INTERCONNECT_ARESETN,
      S_AXI_ARESET_OUT_N => open,
      M_AXI_ARESET_OUT_N => open,
      IRQ => open,
      S_AXI_ACLK => pgassign4,
      S_AXI_AWID => net_gnd2,
      S_AXI_AWADDR => axi_interconnect_3_S_AWADDR,
      S_AXI_AWLEN => axi_interconnect_3_S_AWLEN,
      S_AXI_AWSIZE => axi_interconnect_3_S_AWSIZE,
      S_AXI_AWBURST => axi_interconnect_3_S_AWBURST,
      S_AXI_AWLOCK => net_gnd4,
      S_AXI_AWCACHE => axi_interconnect_3_S_AWCACHE,
      S_AXI_AWPROT => axi_interconnect_3_S_AWPROT,
      S_AXI_AWQOS => net_gnd8,
      S_AXI_AWUSER => net_gnd2,
      S_AXI_AWVALID => axi_interconnect_3_S_AWVALID,
      S_AXI_AWREADY => axi_interconnect_3_S_AWREADY,
      S_AXI_WID => net_gnd2,
      S_AXI_WDATA => axi_interconnect_3_S_WDATA,
      S_AXI_WSTRB => axi_interconnect_3_S_WSTRB,
      S_AXI_WLAST => axi_interconnect_3_S_WLAST,
      S_AXI_WUSER => net_gnd2,
      S_AXI_WVALID => axi_interconnect_3_S_WVALID,
      S_AXI_WREADY => axi_interconnect_3_S_WREADY,
      S_AXI_BID => open,
      S_AXI_BRESP => axi_interconnect_3_S_BRESP,
      S_AXI_BUSER => open,
      S_AXI_BVALID => axi_interconnect_3_S_BVALID,
      S_AXI_BREADY => axi_interconnect_3_S_BREADY,
      S_AXI_ARID => net_gnd2,
      S_AXI_ARADDR => axi_interconnect_3_S_ARADDR,
      S_AXI_ARLEN => axi_interconnect_3_S_ARLEN,
      S_AXI_ARSIZE => axi_interconnect_3_S_ARSIZE,
      S_AXI_ARBURST => axi_interconnect_3_S_ARBURST,
      S_AXI_ARLOCK => net_gnd4,
      S_AXI_ARCACHE => axi_interconnect_3_S_ARCACHE,
      S_AXI_ARPROT => axi_interconnect_3_S_ARPROT,
      S_AXI_ARQOS => net_gnd8,
      S_AXI_ARUSER => net_gnd2,
      S_AXI_ARVALID => axi_interconnect_3_S_ARVALID,
      S_AXI_ARREADY => axi_interconnect_3_S_ARREADY,
      S_AXI_RID => open,
      S_AXI_RDATA => axi_interconnect_3_S_RDATA,
      S_AXI_RRESP => axi_interconnect_3_S_RRESP,
      S_AXI_RLAST => axi_interconnect_3_S_RLAST,
      S_AXI_RUSER => open,
      S_AXI_RVALID => axi_interconnect_3_S_RVALID,
      S_AXI_RREADY => axi_interconnect_3_S_RREADY,
      M_AXI_ACLK => pgassign1(10 downto 10),
      M_AXI_AWID => axi_interconnect_3_M_AWID(0 to 0),
      M_AXI_AWADDR => axi_interconnect_3_M_AWADDR,
      M_AXI_AWLEN => axi_interconnect_3_M_AWLEN,
      M_AXI_AWSIZE => axi_interconnect_3_M_AWSIZE,
      M_AXI_AWBURST => axi_interconnect_3_M_AWBURST,
      M_AXI_AWLOCK => axi_interconnect_3_M_AWLOCK,
      M_AXI_AWCACHE => axi_interconnect_3_M_AWCACHE,
      M_AXI_AWPROT => axi_interconnect_3_M_AWPROT,
      M_AXI_AWREGION => open,
      M_AXI_AWQOS => axi_interconnect_3_M_AWQOS,
      M_AXI_AWUSER => open,
      M_AXI_AWVALID => axi_interconnect_3_M_AWVALID(0 to 0),
      M_AXI_AWREADY => axi_interconnect_3_M_AWREADY(0 to 0),
      M_AXI_WID => axi_interconnect_3_M_WID(0 to 0),
      M_AXI_WDATA => axi_interconnect_3_M_WDATA,
      M_AXI_WSTRB => axi_interconnect_3_M_WSTRB,
      M_AXI_WLAST => axi_interconnect_3_M_WLAST(0 to 0),
      M_AXI_WUSER => open,
      M_AXI_WVALID => axi_interconnect_3_M_WVALID(0 to 0),
      M_AXI_WREADY => axi_interconnect_3_M_WREADY(0 to 0),
      M_AXI_BID => axi_interconnect_3_M_BID(0 to 0),
      M_AXI_BRESP => axi_interconnect_3_M_BRESP,
      M_AXI_BUSER => net_gnd1(0 to 0),
      M_AXI_BVALID => axi_interconnect_3_M_BVALID(0 to 0),
      M_AXI_BREADY => axi_interconnect_3_M_BREADY(0 to 0),
      M_AXI_ARID => axi_interconnect_3_M_ARID(0 to 0),
      M_AXI_ARADDR => axi_interconnect_3_M_ARADDR,
      M_AXI_ARLEN => axi_interconnect_3_M_ARLEN,
      M_AXI_ARSIZE => axi_interconnect_3_M_ARSIZE,
      M_AXI_ARBURST => axi_interconnect_3_M_ARBURST,
      M_AXI_ARLOCK => axi_interconnect_3_M_ARLOCK,
      M_AXI_ARCACHE => axi_interconnect_3_M_ARCACHE,
      M_AXI_ARPROT => axi_interconnect_3_M_ARPROT,
      M_AXI_ARREGION => open,
      M_AXI_ARQOS => axi_interconnect_3_M_ARQOS,
      M_AXI_ARUSER => open,
      M_AXI_ARVALID => axi_interconnect_3_M_ARVALID(0 to 0),
      M_AXI_ARREADY => axi_interconnect_3_M_ARREADY(0 to 0),
      M_AXI_RID => axi_interconnect_3_M_RID(0 to 0),
      M_AXI_RDATA => axi_interconnect_3_M_RDATA,
      M_AXI_RRESP => axi_interconnect_3_M_RRESP,
      M_AXI_RLAST => axi_interconnect_3_M_RLAST(0 to 0),
      M_AXI_RUSER => net_gnd1(0 to 0),
      M_AXI_RVALID => axi_interconnect_3_M_RVALID(0 to 0),
      M_AXI_RREADY => axi_interconnect_3_M_RREADY(0 to 0),
      S_AXI_CTRL_AWADDR => net_gnd32,
      S_AXI_CTRL_AWVALID => net_gnd0,
      S_AXI_CTRL_AWREADY => open,
      S_AXI_CTRL_WDATA => net_gnd32,
      S_AXI_CTRL_WVALID => net_gnd0,
      S_AXI_CTRL_WREADY => open,
      S_AXI_CTRL_BRESP => open,
      S_AXI_CTRL_BVALID => open,
      S_AXI_CTRL_BREADY => net_gnd0,
      S_AXI_CTRL_ARADDR => net_gnd32,
      S_AXI_CTRL_ARVALID => net_gnd0,
      S_AXI_CTRL_ARREADY => open,
      S_AXI_CTRL_RDATA => open,
      S_AXI_CTRL_RRESP => open,
      S_AXI_CTRL_RVALID => open,
      S_AXI_CTRL_RREADY => net_gnd0,
      INTERCONNECT_ARESET_OUT_N => open,
      DEBUG_AW_TRANS_SEQ => open,
      DEBUG_AW_ARB_GRANT => open,
      DEBUG_AR_TRANS_SEQ => open,
      DEBUG_AR_ARB_GRANT => open,
      DEBUG_AW_TRANS_QUAL => open,
      DEBUG_AW_ACCEPT_CNT => open,
      DEBUG_AW_ACTIVE_THREAD => open,
      DEBUG_AW_ACTIVE_TARGET => open,
      DEBUG_AW_ACTIVE_REGION => open,
      DEBUG_AW_ERROR => open,
      DEBUG_AW_TARGET => open,
      DEBUG_AR_TRANS_QUAL => open,
      DEBUG_AR_ACCEPT_CNT => open,
      DEBUG_AR_ACTIVE_THREAD => open,
      DEBUG_AR_ACTIVE_TARGET => open,
      DEBUG_AR_ACTIVE_REGION => open,
      DEBUG_AR_ERROR => open,
      DEBUG_AR_TARGET => open,
      DEBUG_B_TRANS_SEQ => open,
      DEBUG_R_BEAT_CNT => open,
      DEBUG_R_TRANS_SEQ => open,
      DEBUG_AW_ISSUING_CNT => open,
      DEBUG_AR_ISSUING_CNT => open,
      DEBUG_W_BEAT_CNT => open,
      DEBUG_W_TRANS_SEQ => open,
      DEBUG_BID_TARGET => open,
      DEBUG_BID_ERROR => open,
      DEBUG_RID_TARGET => open,
      DEBUG_RID_ERROR => open,
      DEBUG_SR_SC_ARADDR => open,
      DEBUG_SR_SC_ARADDRCONTROL => open,
      DEBUG_SR_SC_AWADDR => open,
      DEBUG_SR_SC_AWADDRCONTROL => open,
      DEBUG_SR_SC_BRESP => open,
      DEBUG_SR_SC_RDATA => open,
      DEBUG_SR_SC_RDATACONTROL => open,
      DEBUG_SR_SC_WDATA => open,
      DEBUG_SR_SC_WDATACONTROL => open,
      DEBUG_SC_SF_ARADDR => open,
      DEBUG_SC_SF_ARADDRCONTROL => open,
      DEBUG_SC_SF_AWADDR => open,
      DEBUG_SC_SF_AWADDRCONTROL => open,
      DEBUG_SC_SF_BRESP => open,
      DEBUG_SC_SF_RDATA => open,
      DEBUG_SC_SF_RDATACONTROL => open,
      DEBUG_SC_SF_WDATA => open,
      DEBUG_SC_SF_WDATACONTROL => open,
      DEBUG_SF_CB_ARADDR => open,
      DEBUG_SF_CB_ARADDRCONTROL => open,
      DEBUG_SF_CB_AWADDR => open,
      DEBUG_SF_CB_AWADDRCONTROL => open,
      DEBUG_SF_CB_BRESP => open,
      DEBUG_SF_CB_RDATA => open,
      DEBUG_SF_CB_RDATACONTROL => open,
      DEBUG_SF_CB_WDATA => open,
      DEBUG_SF_CB_WDATACONTROL => open,
      DEBUG_CB_MF_ARADDR => open,
      DEBUG_CB_MF_ARADDRCONTROL => open,
      DEBUG_CB_MF_AWADDR => open,
      DEBUG_CB_MF_AWADDRCONTROL => open,
      DEBUG_CB_MF_BRESP => open,
      DEBUG_CB_MF_RDATA => open,
      DEBUG_CB_MF_RDATACONTROL => open,
      DEBUG_CB_MF_WDATA => open,
      DEBUG_CB_MF_WDATACONTROL => open,
      DEBUG_MF_MC_ARADDR => open,
      DEBUG_MF_MC_ARADDRCONTROL => open,
      DEBUG_MF_MC_AWADDR => open,
      DEBUG_MF_MC_AWADDRCONTROL => open,
      DEBUG_MF_MC_BRESP => open,
      DEBUG_MF_MC_RDATA => open,
      DEBUG_MF_MC_RDATACONTROL => open,
      DEBUG_MF_MC_WDATA => open,
      DEBUG_MF_MC_WDATACONTROL => open,
      DEBUG_MC_MP_ARADDR => open,
      DEBUG_MC_MP_ARADDRCONTROL => open,
      DEBUG_MC_MP_AWADDR => open,
      DEBUG_MC_MP_AWADDRCONTROL => open,
      DEBUG_MC_MP_BRESP => open,
      DEBUG_MC_MP_RDATA => open,
      DEBUG_MC_MP_RDATACONTROL => open,
      DEBUG_MC_MP_WDATA => open,
      DEBUG_MC_MP_WDATACONTROL => open,
      DEBUG_MP_MR_ARADDR => open,
      DEBUG_MP_MR_ARADDRCONTROL => open,
      DEBUG_MP_MR_AWADDR => open,
      DEBUG_MP_MR_AWADDRCONTROL => open,
      DEBUG_MP_MR_BRESP => open,
      DEBUG_MP_MR_RDATA => open,
      DEBUG_MP_MR_RDATACONTROL => open,
      DEBUG_MP_MR_WDATA => open,
      DEBUG_MP_MR_WDATACONTROL => open
    );

  iobuf_0 : IOBUF
    port map (
      I => util_i2c_mixer_0_downstream_scl_O(1),
      IO => util_i2c_mixer_0_downstream_scl_pin(1),
      O => util_i2c_mixer_0_downstream_scl_I(1),
      T => util_i2c_mixer_0_downstream_scl_T
    );

  iobuf_1 : IOBUF
    port map (
      I => util_i2c_mixer_0_downstream_scl_O(0),
      IO => util_i2c_mixer_0_downstream_scl_pin(0),
      O => util_i2c_mixer_0_downstream_scl_I(0),
      T => util_i2c_mixer_0_downstream_scl_T
    );

  iobuf_2 : IOBUF
    port map (
      I => util_i2c_mixer_0_downstream_sda_O(1),
      IO => util_i2c_mixer_0_downstream_sda_pin(1),
      O => util_i2c_mixer_0_downstream_sda_I(1),
      T => util_i2c_mixer_0_downstream_sda_T
    );

  iobuf_3 : IOBUF
    port map (
      I => util_i2c_mixer_0_downstream_sda_O(0),
      IO => util_i2c_mixer_0_downstream_sda_pin(0),
      O => util_i2c_mixer_0_downstream_sda_I(0),
      T => util_i2c_mixer_0_downstream_sda_T
    );

end architecture STRUCTURE;

