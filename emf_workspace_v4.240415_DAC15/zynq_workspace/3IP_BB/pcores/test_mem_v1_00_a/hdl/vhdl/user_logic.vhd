------------------------------------------------------------------------------
-- user_logic.vhd - entity/architecture pair
------------------------------------------------------------------------------
--
-- ***************************************************************************
-- ** Copyright (c) 1995-2012 Xilinx, Inc.  All rights reserved.            **
-- **                                                                       **
-- ** Xilinx, Inc.                                                          **
-- ** XILINX IS PROVIDING THIS DESIGN, CODE, OR INFORMATION "AS IS"         **
-- ** AS A COURTESY TO YOU, SOLELY FOR USE IN DEVELOPING PROGRAMS AND       **
-- ** SOLUTIONS FOR XILINX DEVICES.  BY PROVIDING THIS DESIGN, CODE,        **
-- ** OR INFORMATION AS ONE POSSIBLE IMPLEMENTATION OF THIS FEATURE,        **
-- ** APPLICATION OR STANDARD, XILINX IS MAKING NO REPRESENTATION           **
-- ** THAT THIS IMPLEMENTATION IS FREE FROM ANY CLAIMS OF INFRINGEMENT,     **
-- ** AND YOU ARE RESPONSIBLE FOR OBTAINING ANY RIGHTS YOU MAY REQUIRE      **
-- ** FOR YOUR IMPLEMENTATION.  XILINX EXPRESSLY DISCLAIMS ANY              **
-- ** WARRANTY WHATSOEVER WITH RESPECT TO THE ADEQUACY OF THE               **
-- ** IMPLEMENTATION, INCLUDING BUT NOT LIMITED TO ANY WARRANTIES OR        **
-- ** REPRESENTATIONS THAT THIS IMPLEMENTATION IS FREE FROM CLAIMS OF       **
-- ** INFRINGEMENT, IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS       **
-- ** FOR A PARTICULAR PURPOSE.                                             **
-- **                                                                       **
-- ***************************************************************************
--
------------------------------------------------------------------------------
-- Filename:          user_logic.vhd
-- Version:           1.00.a
-- Description:       User logic.
-- Date:              Thu Aug 22 10:56:06 2013 (by Create and Import Peripheral Wizard)
-- VHDL Standard:     VHDL'93
------------------------------------------------------------------------------
-- Naming Conventions:
--   active low signals:                    "*_n"
--   clock signals:                         "clk", "clk_div#", "clk_#x"
--   reset signals:                         "rst", "rst_n"
--   generics:                              "C_*"
--   user defined types:                    "*_TYPE"
--   state machine next state:              "*_ns"
--   state machine current state:           "*_cs"
--   combinatorial signals:                 "*_com"
--   pipelined or register delay signals:   "*_d#"
--   counter signals:                       "*cnt*"
--   clock enable signals:                  "*_ce"
--   internal version of output port:       "*_i"
--   device pins:                           "*_pin"
--   ports:                                 "- Names begin with Uppercase"
--   processes:                             "*_PROCESS"
--   component instantiations:              "<ENTITY_>I_<#|FUNC>"
------------------------------------------------------------------------------

-- DO NOT EDIT BELOW THIS LINE --------------------
library ieee;
use ieee.std_logic_1164.all;
use ieee.std_logic_arith.all;
use ieee.std_logic_unsigned.all;

library proc_common_v3_00_a;
use proc_common_v3_00_a.proc_common_pkg.all;

-- DO NOT EDIT ABOVE THIS LINE --------------------

--USER libraries added here

------------------------------------------------------------------------------
-- Entity section
------------------------------------------------------------------------------
-- Definition of Generics:
--   C_SLV_AWIDTH                 -- Slave interface address bus width
--   C_SLV_DWIDTH                 -- Slave interface data bus width
--   C_NUM_MEM                    -- Number of memory spaces
--
-- Definition of Ports:
--   Bus2IP_Clk                   -- Bus to IP clock
--   Bus2IP_Resetn                -- Bus to IP reset
--   Bus2IP_Addr                  -- Bus to IP address bus
--   Bus2IP_CS                    -- Bus to IP chip select for user logic memory selection
--   Bus2IP_RNW                   -- Bus to IP read/not write
--   Bus2IP_Data                  -- Bus to IP data bus
--   Bus2IP_BE                    -- Bus to IP byte enables
--   Bus2IP_RdCE                  -- Bus to IP read chip enable
--   Bus2IP_WrCE                  -- Bus to IP write chip enable
--   Bus2IP_Burst                 -- Bus to IP burst-mode qualifier
--   Bus2IP_BurstLength           -- Bus to IP burst length
--   Bus2IP_RdReq                 -- Bus to IP read request
--   Bus2IP_WrReq                 -- Bus to IP write request
--   Type_of_xfer                 -- Transfer Type
--   IP2Bus_AddrAck               -- IP to Bus address acknowledgement
--   IP2Bus_Data                  -- IP to Bus data bus
--   IP2Bus_RdAck                 -- IP to Bus read transfer acknowledgement
--   IP2Bus_WrAck                 -- IP to Bus write transfer acknowledgement
--   IP2Bus_Error                 -- IP to Bus error response
------------------------------------------------------------------------------

entity user_logic is
  generic
  (
    -- ADD USER GENERICS BELOW THIS LINE ---------------
    --USER generics added here
    -- ADD USER GENERICS ABOVE THIS LINE ---------------

    -- DO NOT EDIT BELOW THIS LINE ---------------------
    -- Bus protocol parameters, do not add to or delete
    C_SLV_AWIDTH                   : integer              := 32;
    C_SLV_DWIDTH                   : integer              := 32;
    C_NUM_MEM                      : integer              := 2
    -- DO NOT EDIT ABOVE THIS LINE ---------------------
  );
  port
  (
    -- ADD USER PORTS BELOW THIS LINE ------------------
		 clk100 			: IN std_logic;
		 --CAM IF signals
		 OV7670_SIOC 	: OUT std_logic;
		 OV7670_SIOD 	: OUT  std_logic;
		 OV7670_RESET : OUT  std_logic;
		 OV7670_PWDN 	: OUT  std_logic;
		 OV7670_VSYNC : IN  std_logic;
		 OV7670_HREF 	: IN  std_logic;
		 OV7670_PCLK 	: IN  std_logic;
		 OV7670_XCLK 	: OUT  std_logic;
		 OV7670_D 		: IN  std_logic_vector(7 downto 0);
		 config_finished : out std_logic;
		 href_negedge	: out std_logic;
		 href_posedge	: out std_logic;
		 vsync_negedge: out std_logic;
		 btn 					: in std_logic;
		 
    -- ADD USER PORTS ABOVE THIS LINE ------------------

    -- DO NOT EDIT BELOW THIS LINE ---------------------
    -- Bus protocol ports, do not add to or delete
    Bus2IP_Clk                     : in  std_logic;
    Bus2IP_Resetn                  : in  std_logic;
    Bus2IP_Addr                    : in  std_logic_vector(C_SLV_AWIDTH-1 downto 0);
    Bus2IP_CS                      : in  std_logic_vector(C_NUM_MEM-1 downto 0);
    Bus2IP_RNW                     : in  std_logic;
    Bus2IP_Data                    : in  std_logic_vector(C_SLV_DWIDTH-1 downto 0);
    Bus2IP_BE                      : in  std_logic_vector(C_SLV_DWIDTH/8-1 downto 0);
    Bus2IP_RdCE                    : in  std_logic_vector(C_NUM_MEM-1 downto 0);
    Bus2IP_WrCE                    : in  std_logic_vector(C_NUM_MEM-1 downto 0);
    Bus2IP_Burst                   : in  std_logic;
    Bus2IP_BurstLength             : in  std_logic_vector(7 downto 0);
    Bus2IP_RdReq                   : in  std_logic;
    Bus2IP_WrReq                   : in  std_logic;
    Type_of_xfer                   : in  std_logic;
    IP2Bus_AddrAck                 : out std_logic;
    IP2Bus_Data                    : out std_logic_vector(C_SLV_DWIDTH-1 downto 0);
    IP2Bus_RdAck                   : out std_logic;
    IP2Bus_WrAck                   : out std_logic;
    IP2Bus_Error                   : out std_logic
    -- DO NOT EDIT ABOVE THIS LINE ---------------------
  );

  attribute MAX_FANOUT : string;
  attribute SIGIS : string;

  attribute SIGIS of Bus2IP_Clk    : signal is "CLK";
  attribute SIGIS of Bus2IP_Resetn : signal is "RST";

end entity user_logic;

------------------------------------------------------------------------------
-- Architecture section
------------------------------------------------------------------------------

architecture IMP of user_logic is

	-- USER components
		COMPONENT ov7670cam_if
    PORT(
					 clk100 			: IN std_logic;
					 rstn  			 	: in STD_LOGIC;
					 --CAM IF signals
					 OV7670_SIOC 	: OUT std_logic;
					 OV7670_SIOD 	: OUT  std_logic;
					 OV7670_RESET : OUT  std_logic;
					 OV7670_PWDN 	: OUT  std_logic;
					 OV7670_VSYNC : IN  std_logic;
					 OV7670_HREF 	: IN  std_logic;
					 OV7670_PCLK 	: IN  std_logic;
					 OV7670_XCLK 	: OUT  std_logic;
					 OV7670_D 		: IN  std_logic_vector(7 downto 0);
					config_finished : out STD_LOGIC;
					--Memory IF signals
					capture_clk		: out STD_LOGIC;
					capture_addr	: out STD_LOGIC_VECTOR(9 downto 0);
					capture_data	: out STD_LOGIC_VECTOR(11 downto 0);
					capture_we		: out STD_LOGIC_VECTOR(1 downto 0);
					href_negedge	: out std_logic;
					href_posedge	: out std_logic;
					vsync_negedge : out std_logic;
					btn 					: IN  std_logic
        );	
    END COMPONENT;
		
		component  flag_crossing 
			PORT (
			rstn					: in std_logic;
			clkA 					: in std_logic;
			FlagIn_clkA		: in std_logic; 
			clkB					: in std_logic;
			FlagOut_clkB	: out std_logic
			);
		end component;

  --USER signal declarations added here, as needed for user logic
	constant PIX_BIT_WIDTH								: integer := 12 ;
  ------------------------------------------
  -- Signals for user logic memory space example
  ------------------------------------------
--  type BYTE_RAM_TYPE is array (0 to 255) of std_logic_vector(7 downto 0);
  type BYTE_RAM_TYPE is array (0 to 1024) of std_logic_vector(PIX_BIT_WIDTH-1 downto 0);
  type DO_TYPE is array (0 to C_NUM_MEM-1) of std_logic_vector(C_SLV_DWIDTH-1 downto 0);
  signal mem_data_out                   : DO_TYPE;
  signal mem_rd_address                 : std_logic_vector(9 downto 0);
  signal mem_select                     : std_logic_vector(0 to 1);
  signal mem_read_enable                : std_logic;
  signal mem_ip2bus_data                : std_logic_vector(C_SLV_DWIDTH-1 downto 0);
  signal mem_read_ack_dly1              : std_logic;
  signal mem_read_ack_dly2              : std_logic;
  signal mem_read_ack                   : std_logic;
  signal mem_write_ack                  : std_logic;
	
	--Umair
	signal capture_clk					: std_logic;
  signal mem_wr_address       : std_logic_vector(9 downto 0);
	signal capture_addr					: std_logic_vector(9 downto 0);
	signal capture_data					: std_logic_vector(11 downto 0);
	signal capture_we						: std_logic_vector(1 downto 0);
	signal href_negedge_pclk		: std_logic;
	signal href_posedge_pclk		: std_logic;
	signal vsync_negedge_pclk		: std_logic;

begin

  --USER logic implementation added here
	cam_if: ov7670cam_if PORT MAP (
          clk100 	=> clk100,
          rstn 		=> Bus2IP_Resetn,
					-- Camera IF signals
          OV7670_SIOC 	=> OV7670_SIOC,
          OV7670_SIOD 	=> OV7670_SIOD,
          OV7670_RESET 	=> OV7670_RESET,
          OV7670_PWDN 	=> OV7670_PWDN,
          OV7670_VSYNC 	=> OV7670_VSYNC,
          OV7670_HREF 	=> OV7670_HREF,
          OV7670_PCLK 	=> OV7670_PCLK,
          OV7670_XCLK 	=> OV7670_XCLK,
					OV7670_D 			=> OV7670_D,
					config_finished => config_finished,
					-- Memory IF signals
          capture_clk 	=> capture_clk	,			
					capture_addr 	=> capture_addr	,
					capture_data 	=> capture_data	,
					capture_we 	 	=> capture_we		,
					href_negedge 	=> href_negedge_pclk,
					href_posedge 	=> href_posedge_pclk,
					vsync_negedge	=> vsync_negedge_pclk ,
					btn => btn
        );
				
			cdc_vsync :	flag_crossing 
			port map (
			rstn					=>	Bus2IP_Resetn,
			clkA 					=>	OV7670_PCLK,
			FlagIn_clkA		=>	vsync_negedge_pclk,
			clkB					=>	Bus2IP_Clk,
			FlagOut_clkB	=>	vsync_negedge
			);	
			cdc_hrefn :	flag_crossing 
			port map (
			rstn					=>	Bus2IP_Resetn,
			clkA 					=>	OV7670_PCLK,
			FlagIn_clkA		=>	href_negedge_pclk,
			clkB					=>	Bus2IP_Clk,
			FlagOut_clkB	=>	href_negedge
			);	
			cdc_hrefp :	flag_crossing 
			port map (
			rstn					=>	Bus2IP_Resetn,
			clkA 					=>	OV7670_PCLK,
			FlagIn_clkA		=>	href_posedge_pclk,
			clkB					=>	Bus2IP_Clk,
			FlagOut_clkB	=>	href_posedge
			);
  ------------------------------------------
  -- Example code to access user logic memory region
  -- 
  -- Note:
  -- The example code presented here is to show you one way of using
  -- the user logic memory space features. The Bus2IP_Addr, Bus2IP_CS,
  -- and Bus2IP_RNW IPIC signals are dedicated to these user logic
  -- memory spaces. Each user logic memory space has its own address
  -- range and is allocated one bit on the Bus2IP_CS signal to indicated
  -- selection of that memory space. Typically these user logic memory
  -- spaces are used to implement memory controller type cores, but it
  -- can also be used in cores that need to access additional address space
  -- (non C_BASEADDR based), s.t. bridges. This code snippet infers
  -- 2 256x32-bit (byte accessible) single-port Block RAM by XST.
  ------------------------------------------
  mem_select      <= Bus2IP_CS;
  mem_read_enable <= ( Bus2IP_RdCE(0) or Bus2IP_RdCE(1) );
  mem_read_ack    <= mem_read_ack_dly1 and (not mem_read_ack_dly2);
  mem_write_ack   <= ( Bus2IP_WrCE(0) or Bus2IP_WrCE(1) );
  mem_rd_address  <= Bus2IP_Addr(11 downto 2); --read address from AXI
  mem_wr_address  <= capture_addr ; --write address from cam_IF

  -- this process generates the read acknowledge 1 clock after read enable
  -- is presented to the BRAM block. The BRAM block has a 1 clock delay
  -- from read enable to data out.
  BRAM_RD_ACK_PROC : process( Bus2IP_Clk ) is
  begin

    if ( Bus2IP_Clk'event and Bus2IP_Clk = '1' ) then
      if ( Bus2IP_Resetn = '0' ) then
        mem_read_ack_dly1 <= '0';
        mem_read_ack_dly2 <= '0';
      else
        mem_read_ack_dly1 <= mem_read_enable;
        mem_read_ack_dly2 <= mem_read_ack_dly1;
      end if;
    end if;

  end process BRAM_RD_ACK_PROC;

  -- implement Block RAM(s)
  BRAM_GEN : for i in 0 to C_NUM_MEM-1 generate
    constant NUM_BYTE_LANES : integer := (C_SLV_DWIDTH+7)/8;
		signal ram           : BYTE_RAM_TYPE;
		signal write_enable  : std_logic;
		signal data_in       : std_logic_vector(PIX_BIT_WIDTH-1 downto 0);
		signal data_out      : std_logic_vector(PIX_BIT_WIDTH-1 downto 0);
		signal read_address  : std_logic_vector(9 downto 0);
	
	begin
	
      write_enable <= capture_we(i);-- and Bus2IP_BE(byte_index);
      data_in <= capture_data(PIX_BIT_WIDTH-1 downto 0);
      
			RAM_WR_PROC : process( capture_clk ) is
      begin
        if rising_edge(capture_clk) then
          if ( write_enable = '1' ) then
            ram(CONV_INTEGER(mem_wr_address)) <= data_in;
          end if;
        end if;
      end process RAM_WR_PROC;
      
			RAM_RD_PROC : process( Bus2IP_Clk ) is
      begin
        if ( Bus2IP_Clk'event and Bus2IP_Clk = '1' ) then
          read_address <= mem_rd_address;
        end if;
      end process RAM_RD_PROC;

      data_out <= ram(CONV_INTEGER(read_address));
      mem_data_out(i)(PIX_BIT_WIDTH-1 downto 0) <= data_out;

  end generate BRAM_GEN;

  -- implement Block RAM read mux
  MEM_IP2BUS_DATA_PROC : process( mem_data_out, mem_select ) is
  begin

    case mem_select is
      when "01" => mem_ip2bus_data <= mem_data_out(0);
      when "10" => mem_ip2bus_data <= mem_data_out(1);
      when others => mem_ip2bus_data <= (others => '0');
    end case;

  end process MEM_IP2BUS_DATA_PROC;

  ------------------------------------------
  -- Example code to drive IP to Bus signals
  ------------------------------------------
  IP2Bus_Data  <= mem_ip2bus_data when mem_read_ack = '1' else
                  (others => '0');

  IP2Bus_AddrAck <= mem_write_ack or (mem_read_enable and mem_read_ack);
  IP2Bus_WrAck <= mem_write_ack;
  IP2Bus_RdAck <= mem_read_ack;
  IP2Bus_Error <= '0';

end IMP;
