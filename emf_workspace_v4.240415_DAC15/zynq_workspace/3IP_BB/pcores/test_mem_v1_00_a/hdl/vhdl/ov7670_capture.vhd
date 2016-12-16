----------------------------------------------------------------------------------
--  
-- Description: Captures the pixels coming from the OV7670 camera 
--	generates a 'cap_we' select signal to write to one of the two line buffers
--	
----------------------------------------------------------------------------------
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity ov7670_capture is
    Port ( pclk  : in   STD_LOGIC;
					 rstn  : in   STD_LOGIC;
           vsync : in   STD_LOGIC;
           href  : in   STD_LOGIC;
           d     : in   STD_LOGIC_VECTOR (7 downto 0);
           addr  : out  STD_LOGIC_VECTOR (9 downto 0);
           dout  : out  STD_LOGIC_VECTOR (11 downto 0);
           cap_we: out  STD_LOGIC_VECTOR (1 downto 0);
					 href_negedge_o : out std_logic ;
					 href_posedge_o : out std_logic ;
					 vsync_negedge 	: out std_logic 


					 );
end ov7670_capture;

architecture Behavioral of ov7670_capture is
   signal d_latch      : std_logic_vector(15 downto 0) 	:= (others => '0');
   signal address      : STD_LOGIC_VECTOR(9 downto 0) 	:= (others => '0');
   signal address_next : STD_LOGIC_VECTOR(9 downto 0) 	:= (others => '0');
   signal wr_hold      : std_logic_vector(1 downto 0)  	:= (others => '0');
   
	 signal href_del1    : std_logic := '0';
	 signal href_del2    : std_logic := '0';
   signal href_negedge : std_logic := '0';
   signal href_posedge : std_logic := '0';
   signal buff_sel 		 : std_logic_vector(1 downto 0) := "01";
   signal we    			 : std_logic := '0';
	 
	 signal vsync_del1    : std_logic := '0';
	 signal vsync_del2    : std_logic := '0';
   
begin
   addr <= address;
	we_gen: for i in 0 to 1 generate
		cap_we(i) <= '1' when (buff_sel(i)= '1' and we = '1') else '0';
	end generate we_gen;

-- negedge detection of HREF 
-- to toggle buffer selection and clear status reg in top module
	 process(pclk)
	 begin
		if rising_edge(pclk) then
			if (rstn = '0') then
			href_del1 		<= '0';
			href_del2			<= '0';
			href_negedge 	<= '0';
			href_posedge 	<= '0';
			else
			href_del1 		<= href;
			href_del2			<= href_del1;
			href_negedge 	<= (not href_del1) and href_del2;
			href_posedge 	<=  href_del1 and (not href_del2);
			end if;
		end if;		
	 end process;
	 href_negedge_o <= href_negedge ;
	 href_posedge_o <= href_posedge ;
-- toggle the buff_sel at the end of every HREF
	 process(pclk)
	 begin 
		if rising_edge(pclk) then
			if (rstn = '0') then
				buff_sel <= "01";
			elsif(href_negedge = '1') then
				if(buff_sel = "01" ) then
					buff_sel <= "10";
				elsif (buff_sel = "10" ) then	
					buff_sel <= "01";
				end if;
			end if;
		end if;	
	 end process;
-- negedge detection of Vsync 	 
	 process(pclk)
	 begin
		if rising_edge(pclk) then
			if (rstn = '0') then
			vsync_del1 			<= '0';
			vsync_del2			<= '0';
			vsync_negedge 	<= '0';
			else
			vsync_del1 			<= vsync;
			vsync_del2			<= vsync_del1;
			vsync_negedge 	<= (not vsync_del1) and vsync_del2;
			end if;
		end if;		
	 end process;
-- PIXEL data processing for Capture	 
   process(pclk)
   begin
      if rising_edge(pclk) then
         -- This is a bit tricky href starts a pixel transfer that takes 3 cycles
         --        Input   | state after clock tick   
         --         href   | wr_hold    d_latch           d                 we address  address_next
         -- cycle -1  x    |    xx      xxxxxxxxxxxxxxxx  xxxxxxxxxxxxxxxx  x   xxxx     xxxx
         -- cycle 0   1    |    x1      xxxxxxxxRRRRRGGG  xxxxxxxxxxxxxxxx  x   xxxx     addr
         -- cycle 1   0    |    10      RRRRRGGGGGGBBBBB  xxxxxxxxRRRRRGGG  x   addr     addr
         -- cycle 2   x    |    0x      GGGBBBBBxxxxxxxx  RRRRRGGGGGGBBBBB  1   addr     addr+1

--         if vsync = '1' then 
         if href_negedge = '1' or rstn = '0' then 
            address <= (others => '0');
            address_next <= (others => '0');
            wr_hold <= (others => '0');
         else

            dout    <= d_latch(15 downto 12) & d_latch(10 downto 7) & d_latch(4 downto 1); 
            address <= address_next;
            we      <= wr_hold(1);
            wr_hold <= wr_hold(0) & (href and not wr_hold(0));
            d_latch <= d_latch( 7 downto  0) & d;

            if wr_hold(1) = '1' then
               address_next <= std_logic_vector(unsigned(address_next)+1);
            end if;

         end if;
      end if;
   end process;
end Behavioral;