library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.NUMERIC_STD.ALL;

entity  flag_crossing is
	PORT (
	rstn				: in std_logic;
	clkA 				: in std_logic;
	FlagIn_clkA	: in std_logic; 
	clkB				: in std_logic;
	FlagOut_clkB: out std_logic
	);
end flag_crossing;

architecture behav of flag_crossing is

signal FlagToggle_clkA 	: std_logic := '0';
signal SyncA_clkB 	: std_logic_vector(2 downto 0) := (others => '0');
begin
--this changes level when the FlagIn_clkA is seen in clkA
	process(clkA)
	begin
		if rstn = '0' then
			FlagToggle_clkA <= '0';
		elsif rising_edge(clkA) then
			FlagToggle_clkA <= FlagToggle_clkA xor FlagIn_clkA;
		end if;
	end process;

--which can then be sync-ed to clkB
	process(clkB)
	begin
		if rstn = '0' then
			SyncA_clkB <= (others => '0');
		elsif rising_edge(clkB) then
			SyncA_clkB <= SyncA_clkB(1 downto 0) & FlagToggle_clkA;
		end if;
	end process;
--and recreate the flag in clkB
FlagOut_clkB <= SyncA_clkB(2) xor SyncA_clkB(1);

end behav;
