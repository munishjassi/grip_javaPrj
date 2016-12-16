----------------------------------------------------------------------------------
-- Engineer: Umair Razzaq
-- 
-- Description: Top level for the OV7670 camera interface.
--							Configures the camera module over i2c.
--							sends out RGB444 data and its addr along with 
--							write clock and we.
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

Library UNISIM;
use UNISIM.vcomponents.all;

entity ov7670cam_IF is
    Port ( 
		clk100       : in    STD_LOGIC;
		rstn  			 : in   STD_LOGIC;
		OV7670_SIOC  : out   STD_LOGIC;
		OV7670_SIOD  : out STD_LOGIC;
		OV7670_RESET : out   STD_LOGIC;
		OV7670_PWDN  : out   STD_LOGIC;
		OV7670_VSYNC : in    STD_LOGIC;
		OV7670_HREF  : in    STD_LOGIC;
		OV7670_PCLK  : in    STD_LOGIC;
		OV7670_XCLK  : out   STD_LOGIC;
		OV7670_D     : in    STD_LOGIC_VECTOR(7 downto 0);

		config_finished : out STD_LOGIC;
		capture_clk		: out   STD_LOGIC;
		capture_addr	: out STD_LOGIC_VECTOR(9 downto 0);
		capture_data	: out STD_LOGIC_VECTOR(11 downto 0);
		capture_we		: out STD_LOGIC_VECTOR(1 downto 0);
		href_negedge	: out std_logic;
		href_posedge	: out std_logic;
		vsync_negedge : out std_logic;
		
		btn 		    : in    STD_LOGIC
	 );
end ov7670cam_IF;

architecture Behavioral of ov7670cam_IF is

	COMPONENT debounce
	PORT(
		clk : IN std_logic;
		i : IN std_logic;          
		o : OUT std_logic
		);
	END COMPONENT;

	component clocking
	port
	 (-- Clock in ports
		CLK_100           : in     std_logic;
		-- Clock out ports
		CLK_50          : out    std_logic;
		CLK_25          : out    std_logic
	 );
	end component;

	COMPONENT ov7670_controller
	PORT(
		clk   : IN    std_logic;    
		resend: IN    std_logic;    
		config_finished : out std_logic;
		siod  : OUT std_logic;      
		sioc  : OUT   std_logic;
		reset : OUT   std_logic;
		pwdn  : OUT   std_logic;
		xclk  : OUT   std_logic
		);
	END COMPONENT;

	COMPONENT ov7670_capture
	PORT(
		pclk 	: IN std_logic;
		rstn 	: IN std_logic;
		vsync : IN std_logic;
		href  : IN std_logic;
		d     : IN std_logic_vector(7 downto 0);          
		addr  : OUT std_logic_vector(9 downto 0);
		dout  : OUT std_logic_vector(11 downto 0);
		cap_we: OUT std_logic_vector(1 downto 0);
		href_negedge_o : out std_logic ;
		href_posedge_o : out std_logic ;
		vsync_negedge  : out std_logic
		);
	END COMPONENT;

	signal resend          : std_logic;
--	signal config_finished : std_logic;
	
	signal clk50         : std_logic;
	signal clk25         : std_logic;
	
begin

BUFG_pclk : BUFG
   port map (
      O => capture_clk, 		-- 1-bit output: Clock output
      I => OV7670_PCLK  -- 1-bit input: Clock input
   );
 
btn_debounce: debounce PORT MAP(
		clk => clk50,
		i   => btn,
		o   => resend
	);
  
--  led <= "0000000" & config_finished;
  
capture: ov7670_capture PORT MAP(
		pclk  => OV7670_PCLK,
		rstn  => rstn,
		vsync => OV7670_VSYNC,
		href  => OV7670_HREF,
		d     => OV7670_D,
		addr  => capture_addr,
		dout  => capture_data,
		cap_we=> capture_we,
		href_negedge_o => href_negedge,
		href_posedge_o => href_posedge,
		vsync_negedge => vsync_negedge
	);
  
controller: ov7670_controller PORT MAP(
		clk   => clk50,
		sioc  => ov7670_sioc,
		resend => resend ,
		config_finished => config_finished,
		siod  => ov7670_siod,
		pwdn  => OV7670_PWDN,
		reset => OV7670_RESET,
		xclk  => OV7670_XCLK
	);

your_instance_name : clocking
  port map
   (-- Clock in ports
    CLK_100 => CLK100,
    -- Clock out ports
    CLK_50 => CLK50,
    CLK_25 => CLK25);

end Behavioral;