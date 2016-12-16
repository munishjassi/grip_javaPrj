//-----------------------------------------------------------------------------
// system_convert_to_gray_top_0_wrapper.v
//-----------------------------------------------------------------------------

module system_convert_to_gray_top_0_wrapper
  (
    aclk,
    aresetn,
    OUTPUT_STREAM_TVALID,
    OUTPUT_STREAM_TREADY,
    OUTPUT_STREAM_TDATA,
    OUTPUT_STREAM_TKEEP,
    OUTPUT_STREAM_TSTRB,
    OUTPUT_STREAM_TUSER,
    OUTPUT_STREAM_TLAST,
    OUTPUT_STREAM_TID,
    OUTPUT_STREAM_TDEST,
    INPUT_STREAM_TVALID,
    INPUT_STREAM_TREADY,
    INPUT_STREAM_TDATA,
    INPUT_STREAM_TKEEP,
    INPUT_STREAM_TSTRB,
    INPUT_STREAM_TUSER,
    INPUT_STREAM_TLAST,
    INPUT_STREAM_TID,
    INPUT_STREAM_TDEST,
    s_axi_CONTROL_BUS_AWADDR,
    s_axi_CONTROL_BUS_AWVALID,
    s_axi_CONTROL_BUS_AWREADY,
    s_axi_CONTROL_BUS_WDATA,
    s_axi_CONTROL_BUS_WSTRB,
    s_axi_CONTROL_BUS_WVALID,
    s_axi_CONTROL_BUS_WREADY,
    s_axi_CONTROL_BUS_BRESP,
    s_axi_CONTROL_BUS_BVALID,
    s_axi_CONTROL_BUS_BREADY,
    s_axi_CONTROL_BUS_ARADDR,
    s_axi_CONTROL_BUS_ARVALID,
    s_axi_CONTROL_BUS_ARREADY,
    s_axi_CONTROL_BUS_RDATA,
    s_axi_CONTROL_BUS_RRESP,
    s_axi_CONTROL_BUS_RVALID,
    s_axi_CONTROL_BUS_RREADY,
    interrupt
  );
  input aclk;
  input aresetn;
  output OUTPUT_STREAM_TVALID;
  input OUTPUT_STREAM_TREADY;
  output [31:0] OUTPUT_STREAM_TDATA;
  output [3:0] OUTPUT_STREAM_TKEEP;
  output [3:0] OUTPUT_STREAM_TSTRB;
  output [0:0] OUTPUT_STREAM_TUSER;
  output [0:0] OUTPUT_STREAM_TLAST;
  output [0:0] OUTPUT_STREAM_TID;
  output [0:0] OUTPUT_STREAM_TDEST;
  input INPUT_STREAM_TVALID;
  output INPUT_STREAM_TREADY;
  input [31:0] INPUT_STREAM_TDATA;
  input [3:0] INPUT_STREAM_TKEEP;
  input [3:0] INPUT_STREAM_TSTRB;
  input [0:0] INPUT_STREAM_TUSER;
  input [0:0] INPUT_STREAM_TLAST;
  input [0:0] INPUT_STREAM_TID;
  input [0:0] INPUT_STREAM_TDEST;
  input [4:0] s_axi_CONTROL_BUS_AWADDR;
  input s_axi_CONTROL_BUS_AWVALID;
  output s_axi_CONTROL_BUS_AWREADY;
  input [31:0] s_axi_CONTROL_BUS_WDATA;
  input [3:0] s_axi_CONTROL_BUS_WSTRB;
  input s_axi_CONTROL_BUS_WVALID;
  output s_axi_CONTROL_BUS_WREADY;
  output [1:0] s_axi_CONTROL_BUS_BRESP;
  output s_axi_CONTROL_BUS_BVALID;
  input s_axi_CONTROL_BUS_BREADY;
  input [4:0] s_axi_CONTROL_BUS_ARADDR;
  input s_axi_CONTROL_BUS_ARVALID;
  output s_axi_CONTROL_BUS_ARREADY;
  output [31:0] s_axi_CONTROL_BUS_RDATA;
  output [1:0] s_axi_CONTROL_BUS_RRESP;
  output s_axi_CONTROL_BUS_RVALID;
  input s_axi_CONTROL_BUS_RREADY;
  output interrupt;

  convert_to_gray_top
    #(
      .C_S_AXI_CONTROL_BUS_ADDR_WIDTH ( 5 ),
      .C_S_AXI_CONTROL_BUS_DATA_WIDTH ( 32 )
    )
    convert_to_gray_top_0 (
      .aclk ( aclk ),
      .aresetn ( aresetn ),
      .OUTPUT_STREAM_TVALID ( OUTPUT_STREAM_TVALID ),
      .OUTPUT_STREAM_TREADY ( OUTPUT_STREAM_TREADY ),
      .OUTPUT_STREAM_TDATA ( OUTPUT_STREAM_TDATA ),
      .OUTPUT_STREAM_TKEEP ( OUTPUT_STREAM_TKEEP ),
      .OUTPUT_STREAM_TSTRB ( OUTPUT_STREAM_TSTRB ),
      .OUTPUT_STREAM_TUSER ( OUTPUT_STREAM_TUSER ),
      .OUTPUT_STREAM_TLAST ( OUTPUT_STREAM_TLAST ),
      .OUTPUT_STREAM_TID ( OUTPUT_STREAM_TID ),
      .OUTPUT_STREAM_TDEST ( OUTPUT_STREAM_TDEST ),
      .INPUT_STREAM_TVALID ( INPUT_STREAM_TVALID ),
      .INPUT_STREAM_TREADY ( INPUT_STREAM_TREADY ),
      .INPUT_STREAM_TDATA ( INPUT_STREAM_TDATA ),
      .INPUT_STREAM_TKEEP ( INPUT_STREAM_TKEEP ),
      .INPUT_STREAM_TSTRB ( INPUT_STREAM_TSTRB ),
      .INPUT_STREAM_TUSER ( INPUT_STREAM_TUSER ),
      .INPUT_STREAM_TLAST ( INPUT_STREAM_TLAST ),
      .INPUT_STREAM_TID ( INPUT_STREAM_TID ),
      .INPUT_STREAM_TDEST ( INPUT_STREAM_TDEST ),
      .s_axi_CONTROL_BUS_AWADDR ( s_axi_CONTROL_BUS_AWADDR ),
      .s_axi_CONTROL_BUS_AWVALID ( s_axi_CONTROL_BUS_AWVALID ),
      .s_axi_CONTROL_BUS_AWREADY ( s_axi_CONTROL_BUS_AWREADY ),
      .s_axi_CONTROL_BUS_WDATA ( s_axi_CONTROL_BUS_WDATA ),
      .s_axi_CONTROL_BUS_WSTRB ( s_axi_CONTROL_BUS_WSTRB ),
      .s_axi_CONTROL_BUS_WVALID ( s_axi_CONTROL_BUS_WVALID ),
      .s_axi_CONTROL_BUS_WREADY ( s_axi_CONTROL_BUS_WREADY ),
      .s_axi_CONTROL_BUS_BRESP ( s_axi_CONTROL_BUS_BRESP ),
      .s_axi_CONTROL_BUS_BVALID ( s_axi_CONTROL_BUS_BVALID ),
      .s_axi_CONTROL_BUS_BREADY ( s_axi_CONTROL_BUS_BREADY ),
      .s_axi_CONTROL_BUS_ARADDR ( s_axi_CONTROL_BUS_ARADDR ),
      .s_axi_CONTROL_BUS_ARVALID ( s_axi_CONTROL_BUS_ARVALID ),
      .s_axi_CONTROL_BUS_ARREADY ( s_axi_CONTROL_BUS_ARREADY ),
      .s_axi_CONTROL_BUS_RDATA ( s_axi_CONTROL_BUS_RDATA ),
      .s_axi_CONTROL_BUS_RRESP ( s_axi_CONTROL_BUS_RRESP ),
      .s_axi_CONTROL_BUS_RVALID ( s_axi_CONTROL_BUS_RVALID ),
      .s_axi_CONTROL_BUS_RREADY ( s_axi_CONTROL_BUS_RREADY ),
      .interrupt ( interrupt )
    );

endmodule

