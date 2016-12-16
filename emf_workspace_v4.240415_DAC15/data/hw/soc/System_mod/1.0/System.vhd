-- ***************************************************
-- File: System.vhd
-- Creation date: 17.04.2014
-- Creation time: 17:16:40
-- Description: 
-- Created by: Munish
-- This file was generated with Kactus2 vhdl generator.
-- ***************************************************
library IEEE;
library work;
use work.all;
use IEEE.std_logic_1164.all;

entity System is

end System;


architecture hierarchical of System is

	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sACK : std_logic;
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sADDR : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sCLK : std_logic;
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sCYC : std_logic;
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sDATA : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sRST : std_logic;
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sSEL : std_logic;
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sSTB : std_logic;
	signal wishbone_bus_0_s3_wb__To__CAM_0_cam_sWE : std_logic;
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbACK : std_logic;
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbADDR : std_logic_vector(31 downto 0);
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbCLK : std_logic;
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbCYC : std_logic;
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbDATA : std_logic_vector(31 downto 0);
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbRST : std_logic;
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbSEL : std_logic;
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbSTB : std_logic;
	signal CPU_0_cpu_m__To__wishbone_bus_0_m1_wbWE : std_logic;
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbACK : std_logic;
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbADDR : std_logic_vector(31 downto 0);
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbCLK : std_logic;
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbCYC : std_logic;
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbDATA : std_logic_vector(31 downto 0);
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbRST : std_logic;
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbSEL : std_logic;
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbSTB : std_logic;
	signal DMA_0_dma_m__To__wishbone_bus_0_m2_wbWE : std_logic;
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbACK : std_logic;
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbADDR : std_logic_vector(31 downto 0);
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbCLK : std_logic;
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbCYC : std_logic;
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbDATA : std_logic_vector(31 downto 0);
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbRST : std_logic;
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbSEL : std_logic;
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbSTB : std_logic;
	signal DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbWE : std_logic;
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ACK : std_logic;
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ADDR : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CLK : std_logic;
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CYC : std_logic;
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1DATA : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1RST : std_logic;
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1SEL : std_logic;
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1STB : std_logic;
	signal wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1WE : std_logic;
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sACK : std_logic;
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sADDR : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sCLK : std_logic;
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sCYC : std_logic;
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sDATA : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sRST : std_logic;
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sSEL : std_logic;
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sSTB : std_logic;
	signal wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sWE : std_logic;
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sACK : std_logic;
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sADDR : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sCLK : std_logic;
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sCYC : std_logic;
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sDATA : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sRST : std_logic;
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sSEL : std_logic;
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sSTB : std_logic;
	signal wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sWE : std_logic;
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sACK : std_logic;
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sADDR : std_logic_vector(31 downto 0);
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sCLK : std_logic;
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sCYC : std_logic;
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sDATA : std_logic_vector(31 downto 0);
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sRST : std_logic;
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sSEL : std_logic;
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sSTB : std_logic;
	signal wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sWE : std_logic;
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sACK : std_logic;
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sADDR : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sCLK : std_logic;
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sCYC : std_logic;
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sDATA : std_logic_vector(31 downto 0);
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sRST : std_logic;
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sSEL : std_logic;
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sSTB : std_logic;
	signal wishbone_bus_0_s2_wb__To__MEM_0_mem_sWE : std_logic;

	component CAM
		port (

			-- Interface: cam_s
			CAM_addr : in std_logic_vector(31 downto 0);
			CAM_clk : in std_logic;
			CAM_cyc : in std_logic;
			CAM_rst : in std_logic;
			CAM_sel : in std_logic;
			CAM_stb : in std_logic;
			CAM_we : in std_logic;
			CAM_ack : out std_logic;
			CAM_data : inout std_logic_vector(31 downto 0)

		);
	end component;

	component CPU
		port (

			-- Interface: cpu_m
			cpu_ack : in std_logic;
			cpu_clk : in std_logic;
			cpu_rst : in std_logic;
			cpu_addr : out std_logic_vector(31 downto 0);
			cpu_cyc : out std_logic;
			cpu_sel : out std_logic;
			cpu_stb : out std_logic;
			cpu_we : out std_logic;
			cpu_data : inout std_logic_vector(31 downto 0);

			-- These ports are not in any interface
			-- tempPort : out std_logic

		);
	end component;

	component DMA
		port (

			-- Interface: dma_m
			dma_ack : in std_logic;
			dma_clk : in std_logic;
			dma_rst : in std_logic;
			dma_addr : out std_logic_vector(31 downto 0);
			dma_cyc : out std_logic;
			dma_sel : out std_logic;
			dma_stb : out std_logic;
			dma_we : out std_logic;
			dma_data : inout std_logic_vector(31 downto 0)

		);
	end component;

	component DMA2
		port (

			-- Interface: dma_m1
			dma_m1_ack : in std_logic;
			dma_m1_clk : in std_logic;
			dma_m1_rst : in std_logic;
			dma_m1_addr : out std_logic_vector(31 downto 0);
			dma_m1_cyc : out std_logic;
			dma_m1_sel : out std_logic;
			dma_m1_stb : out std_logic;
			dma_m1_we : out std_logic;
			dma_m1_data : inout std_logic_vector(31 downto 0);

			-- Interface: dma_m2
			dma_m2_ack : in std_logic;
			dma_m2_clk : in std_logic;
			dma_m2_rst : in std_logic;
			dma_m2_addr : out std_logic_vector(31 downto 0);
			dma_m2_cyc : out std_logic;
			dma_m2_sel : out std_logic;
			dma_m2_stb : out std_logic;
			dma_m2_we : out std_logic;
			dma_m2_data : inout std_logic_vector(31 downto 0);

			-- Interface: dma_s1
			dma_s1_addr : in std_logic_vector(31 downto 0);
			dma_s1_clk : in std_logic;
			dma_s1_cyc : in std_logic;
			dma_s1_rst : in std_logic;
			dma_s1_sel : in std_logic;
			dma_s1_stb : in std_logic;
			dma_s1_we : in std_logic;
			dma_s1_ack : out std_logic;
			dma_s1_data : inout std_logic_vector(31 downto 0)

		);
	end component;

	component HW_acc1
		port (

			-- Interface: HW_s
			HW1_addr : in std_logic_vector(31 downto 0);
			HW1_clk : in std_logic;
			HW1_cyc : in std_logic;
			HW1_rst : in std_logic;
			HW1_sel : in std_logic;
			HW1_stb : in std_logic;
			HW1_we : in std_logic;
			HW1_ack : out std_logic;
			HW1_data : inout std_logic_vector(31 downto 0)

		);
	end component;

	component HW_acc2
		port (

			-- Interface: HW2_s
			HW2_addr : in std_logic_vector(31 downto 0);
			HW2_clk : in std_logic;
			HW2_cyc : in std_logic;
			HW2_rst : in std_logic;
			HW2_sel : in std_logic;
			HW2_stb : in std_logic;
			HW2_we : in std_logic;
			HW2_ack : out std_logic;
			HW2_data : inout std_logic_vector(31 downto 0)

		);
	end component;

	component MEM
		port (

			-- Interface: mem_s
			HW1_addr : in std_logic_vector(31 downto 0);
			HW1_clk : in std_logic;
			HW1_cyc : in std_logic;
			HW1_rst : in std_logic;
			HW1_sel : in std_logic;
			HW1_stb : in std_logic;
			HW1_we : in std_logic;
			HW1_ack : out std_logic;
			HW1_data : inout std_logic_vector(31 downto 0)

		);
	end component;

	component wishbone_bus
		port (

			-- Interface: m1_wb
			m1_addr : in std_logic_vector(31 downto 0);
			m1_cyc : in std_logic;
			m1_sel : in std_logic;
			m1_stb : in std_logic;
			m1_we : in std_logic;
			m1_ack : out std_logic;
			m1_clk : out std_logic;
			m1_rst : out std_logic;
			m1_data : inout std_logic_vector(31 downto 0);

			-- Interface: m2_wb
			m2_addr : in std_logic_vector(31 downto 0);
			m2_cyc : in std_logic;
			m2_sel : in std_logic;
			m2_stb : in std_logic;
			m2_we : in std_logic;
			m2_ack : out std_logic;
			m2_clk : out std_logic;
			m2_rst : out std_logic;
			m2_data : inout std_logic_vector(31 downto 0);

			-- Interface: m3_wb
			-- m3_addr : in std_logic_vector(31 downto 0);
			-- m3_cyc : in std_logic;
			-- m3_sel : in std_logic;
			-- m3_stb : in std_logic;
			-- m3_we : in std_logic;
			-- m3_ack : out std_logic;
			-- m3_clk : out std_logic;
			-- m3_rst : out std_logic;
			-- m3_data : inout std_logic_vector(31 downto 0);

			-- Interface: m4_wb
			-- m4_addr : in std_logic_vector(31 downto 0);
			-- m4_cyc : in std_logic;
			-- m4_sel : in std_logic;
			-- m4_stb : in std_logic;
			-- m4_we : in std_logic;
			-- m4_ack : out std_logic;
			-- m4_clk : out std_logic;
			-- m4_rst : out std_logic;
			-- m4_data : inout std_logic_vector(31 downto 0);

			-- Interface: m5_wb
			-- m5_addr : in std_logic_vector(31 downto 0);
			-- m5_cyc : in std_logic;
			-- m5_sel : in std_logic;
			-- m5_stb : in std_logic;
			-- m5_we : in std_logic;
			-- m5_ack : out std_logic;
			-- m5_clk : out std_logic;
			-- m5_rst : out std_logic;
			-- m5_data : inout std_logic_vector(31 downto 0);

			-- Interface: m6_wb
			-- m6_addr : in std_logic_vector(31 downto 0);
			-- m6_cyc : in std_logic;
			-- m6_sel : in std_logic;
			-- m6_stb : in std_logic;
			-- m6_we : in std_logic;
			-- m6_ack : out std_logic;
			-- m6_clk : out std_logic;
			-- m6_rst : out std_logic;
			-- m6_data : inout std_logic_vector(31 downto 0);

			-- Interface: m7_wb
			-- m7_addr : in std_logic_vector(31 downto 0);
			-- m7_cyc : in std_logic;
			-- m7_sel : in std_logic;
			-- m7_stb : in std_logic;
			-- m7_we : in std_logic;
			-- m7_ack : out std_logic;
			-- m7_clk : out std_logic;
			-- m7_rst : out std_logic;
			-- m7_data : inout std_logic_vector(31 downto 0);

			-- Interface: m8_wb
			-- m8_addr : in std_logic_vector(31 downto 0);
			-- m8_cyc : in std_logic;
			-- m8_sel : in std_logic;
			-- m8_stb : in std_logic;
			-- m8_we : in std_logic;
			-- m8_ack : out std_logic;
			-- m8_clk : out std_logic;
			-- m8_rst : out std_logic;
			-- m8_data : inout std_logic_vector(31 downto 0);

			-- Interface: s1_wb
			s1_ack : in std_logic;
			s1_addr : out std_logic_vector(31 downto 0);
			s1_clk : out std_logic;
			s1_cyc : out std_logic;
			s1_rst : out std_logic;
			s1_sel : out std_logic;
			s1_stb : out std_logic;
			s1_we : out std_logic;
			s1_data : inout std_logic_vector(31 downto 0);

			-- Interface: s2_wb
			s2_ack : in std_logic;
			s2_addr : out std_logic_vector(31 downto 0);
			s2_clk : out std_logic;
			s2_cyc : out std_logic;
			s2_rst : out std_logic;
			s2_sel : out std_logic;
			s2_stb : out std_logic;
			s2_we : out std_logic;
			s2_data : inout std_logic_vector(31 downto 0);

			-- Interface: s3_wb
			s3_ack : in std_logic;
			s3_addr : out std_logic_vector(31 downto 0);
			s3_clk : out std_logic;
			s3_cyc : out std_logic;
			s3_rst : out std_logic;
			s3_sel : out std_logic;
			s3_stb : out std_logic;
			s3_we : out std_logic;
			s3_data : inout std_logic_vector(31 downto 0);

			-- Interface: s4_wb
			s4_ack : in std_logic;
			s4_addr : out std_logic_vector(31 downto 0);
			s4_clk : out std_logic;
			s4_cyc : out std_logic;
			s4_rst : out std_logic;
			s4_sel : out std_logic;
			s4_stb : out std_logic;
			s4_we : out std_logic;
			s4_data : inout std_logic_vector(31 downto 0);

			-- Interface: s5_wb
			s5_ack : in std_logic;
			s5_addr : out std_logic_vector(31 downto 0);
			s5_clk : out std_logic;
			s5_cyc : out std_logic;
			s5_rst : out std_logic;
			s5_sel : out std_logic;
			s5_stb : out std_logic;
			s5_we : out std_logic;
			s5_data : inout std_logic_vector(31 downto 0);

			-- Interface: s6_wb
			-- s6_ack : in std_logic;
			-- s6_addr : out std_logic_vector(31 downto 0);
			-- s6_clk : out std_logic;
			-- s6_cyc : out std_logic;
			-- s6_rst : out std_logic;
			-- s6_sel : out std_logic;
			-- s6_stb : out std_logic;
			-- s6_we : out std_logic;
			-- s6_data : inout std_logic_vector(31 downto 0);

			-- Interface: s7_wb
			-- s7_ack : in std_logic;
			-- s7_addr : out std_logic_vector(31 downto 0);
			-- s7_clk : out std_logic;
			-- s7_cyc : out std_logic;
			-- s7_rst : out std_logic;
			-- s7_sel : out std_logic;
			-- s7_stb : out std_logic;
			-- s7_we : out std_logic;
			-- s7_data : inout std_logic_vector(31 downto 0);

			-- Interface: s8_wb
			-- s8_ack : in std_logic;
			-- s8_addr : out std_logic_vector(31 downto 0);
			-- s8_clk : out std_logic;
			-- s8_cyc : out std_logic;
			-- s8_rst : out std_logic;
			-- s8_sel : out std_logic;
			-- s8_stb : out std_logic;
			-- s8_we : out std_logic;
			-- s8_data : inout std_logic_vector(31 downto 0)

		);
	end component;

	-- You can write vhdl code after this tag and it is saved through the generator.
	-- ##KACTUS2_BLACK_BOX_DECLARATIONS_BEGIN##
	-- ##KACTUS2_BLACK_BOX_DECLARATIONS_END##
	-- Stop writing your code after this tag.


begin

	-- You can write vhdl code after this tag and it is saved through the generator.
	-- ##KACTUS2_BLACK_BOX_ASSIGNMENTS_BEGIN##
	-- ##KACTUS2_BLACK_BOX_ASSIGNMENTS_END##
	-- Stop writing your code after this tag.

	CAM_0 : CAM
		port map (
			CAM_ack => wishbone_bus_0_s3_wb__To__CAM_0_cam_sACK,
			CAM_addr(31 downto 0) => wishbone_bus_0_s3_wb__To__CAM_0_cam_sADDR(31 downto 0),
			CAM_clk => wishbone_bus_0_s3_wb__To__CAM_0_cam_sCLK,
			CAM_cyc => wishbone_bus_0_s3_wb__To__CAM_0_cam_sCYC,
			CAM_data(31 downto 0) => wishbone_bus_0_s3_wb__To__CAM_0_cam_sDATA(31 downto 0),
			CAM_rst => wishbone_bus_0_s3_wb__To__CAM_0_cam_sRST,
			CAM_sel => wishbone_bus_0_s3_wb__To__CAM_0_cam_sSEL,
			CAM_stb => wishbone_bus_0_s3_wb__To__CAM_0_cam_sSTB,
			CAM_we => wishbone_bus_0_s3_wb__To__CAM_0_cam_sWE
		);

	CPU_0 : CPU
		port map (
			cpu_ack => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbACK,
			cpu_addr(31 downto 0) => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbADDR(31 downto 0),
			cpu_clk => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbCLK,
			cpu_cyc => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbCYC,
			cpu_data(31 downto 0) => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbDATA(31 downto 0),
			cpu_rst => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbRST,
			cpu_sel => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbSEL,
			cpu_stb => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbSTB,
			cpu_we => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbWE
		);

	DMA2_0 : DMA2
		port map (
			dma_m1_ack => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbACK,
			dma_m1_addr(31 downto 0) => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbADDR(31 downto 0),
			dma_m1_clk => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbCLK,
			dma_m1_cyc => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbCYC,
			dma_m1_data(31 downto 0) => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbDATA(31 downto 0),
			dma_m1_rst => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbRST,
			dma_m1_sel => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbSEL,
			dma_m1_stb => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbSTB,
			dma_m1_we => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbWE,
			dma_m2_ack => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ACK,
			dma_m2_addr(31 downto 0) => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ADDR(31 downto 0),
			dma_m2_clk => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CLK,
			dma_m2_cyc => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CYC,
			dma_m2_data(31 downto 0) => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1DATA(31 downto 0),
			dma_m2_rst => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1RST,
			dma_m2_sel => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1SEL,
			dma_m2_stb => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1STB,
			dma_m2_we => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1WE,
			dma_s1_ack => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ACK,
			dma_s1_addr(31 downto 0) => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ADDR(31 downto 0),
			dma_s1_clk => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CLK,
			dma_s1_cyc => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CYC,
			dma_s1_data(31 downto 0) => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1DATA(31 downto 0),
			dma_s1_rst => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1RST,
			dma_s1_sel => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1SEL,
			dma_s1_stb => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1STB,
			dma_s1_we => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1WE
		);

	DMA_0 : DMA
		port map (
			dma_ack => DMA_0_dma_m__To__wishbone_bus_0_m2_wbACK,
			dma_addr(31 downto 0) => DMA_0_dma_m__To__wishbone_bus_0_m2_wbADDR(31 downto 0),
			dma_clk => DMA_0_dma_m__To__wishbone_bus_0_m2_wbCLK,
			dma_cyc => DMA_0_dma_m__To__wishbone_bus_0_m2_wbCYC,
			dma_data(31 downto 0) => DMA_0_dma_m__To__wishbone_bus_0_m2_wbDATA(31 downto 0),
			dma_rst => DMA_0_dma_m__To__wishbone_bus_0_m2_wbRST,
			dma_sel => DMA_0_dma_m__To__wishbone_bus_0_m2_wbSEL,
			dma_stb => DMA_0_dma_m__To__wishbone_bus_0_m2_wbSTB,
			dma_we => DMA_0_dma_m__To__wishbone_bus_0_m2_wbWE
		);

	HW_acc1_0 : HW_acc1
		port map (
			HW1_ack => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sACK,
			HW1_addr(31 downto 0) => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sADDR(31 downto 0),
			HW1_clk => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sCLK,
			HW1_cyc => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sCYC,
			HW1_data(31 downto 0) => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sDATA(31 downto 0),
			HW1_rst => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sRST,
			HW1_sel => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sSEL,
			HW1_stb => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sSTB,
			HW1_we => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sWE
		);

	HW_acc2_0 : HW_acc2
		port map (
			HW2_ack => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sACK,
			HW2_addr(31 downto 0) => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sADDR(31 downto 0),
			HW2_clk => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sCLK,
			HW2_cyc => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sCYC,
			HW2_data(31 downto 0) => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sDATA(31 downto 0),
			HW2_rst => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sRST,
			HW2_sel => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sSEL,
			HW2_stb => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sSTB,
			HW2_we => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sWE
		);

	HW_acc2_0_0 : HW_acc2
		port map (
			HW2_ack => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sACK,
			HW2_addr(31 downto 0) => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sADDR(31 downto 0),
			HW2_clk => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sCLK,
			HW2_cyc => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sCYC,
			HW2_data(31 downto 0) => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sDATA(31 downto 0),
			HW2_rst => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sRST,
			HW2_sel => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sSEL,
			HW2_stb => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sSTB,
			HW2_we => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sWE
		);

	MEM_0 : MEM
		port map (
			HW1_ack => wishbone_bus_0_s2_wb__To__MEM_0_mem_sACK,
			HW1_addr(31 downto 0) => wishbone_bus_0_s2_wb__To__MEM_0_mem_sADDR(31 downto 0),
			HW1_clk => wishbone_bus_0_s2_wb__To__MEM_0_mem_sCLK,
			HW1_cyc => wishbone_bus_0_s2_wb__To__MEM_0_mem_sCYC,
			HW1_data(31 downto 0) => wishbone_bus_0_s2_wb__To__MEM_0_mem_sDATA(31 downto 0),
			HW1_rst => wishbone_bus_0_s2_wb__To__MEM_0_mem_sRST,
			HW1_sel => wishbone_bus_0_s2_wb__To__MEM_0_mem_sSEL,
			HW1_stb => wishbone_bus_0_s2_wb__To__MEM_0_mem_sSTB,
			HW1_we => wishbone_bus_0_s2_wb__To__MEM_0_mem_sWE
		);

	wishbone_bus_0 : wishbone_bus
		port map (
			m1_ack => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbACK,
			m1_addr(31 downto 0) => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbADDR(31 downto 0),
			m1_clk => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbCLK,
			m1_cyc => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbCYC,
			m1_data(31 downto 0) => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbDATA(31 downto 0),
			m1_rst => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbRST,
			m1_sel => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbSEL,
			m1_stb => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbSTB,
			m1_we => CPU_0_cpu_m__To__wishbone_bus_0_m1_wbWE,
			m2_ack => DMA_0_dma_m__To__wishbone_bus_0_m2_wbACK,
			m2_addr(31 downto 0) => DMA_0_dma_m__To__wishbone_bus_0_m2_wbADDR(31 downto 0),
			m2_clk => DMA_0_dma_m__To__wishbone_bus_0_m2_wbCLK,
			m2_cyc => DMA_0_dma_m__To__wishbone_bus_0_m2_wbCYC,
			m2_data(31 downto 0) => DMA_0_dma_m__To__wishbone_bus_0_m2_wbDATA(31 downto 0),
			m2_rst => DMA_0_dma_m__To__wishbone_bus_0_m2_wbRST,
			m2_sel => DMA_0_dma_m__To__wishbone_bus_0_m2_wbSEL,
			m2_stb => DMA_0_dma_m__To__wishbone_bus_0_m2_wbSTB,
			m2_we => DMA_0_dma_m__To__wishbone_bus_0_m2_wbWE,
			s1_ack => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sACK,
			s1_addr(31 downto 0) => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sADDR(31 downto 0),
			s1_clk => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sCLK,
			s1_cyc => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sCYC,
			s1_data(31 downto 0) => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sDATA(31 downto 0),
			s1_rst => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sRST,
			s1_sel => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sSEL,
			s1_stb => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sSTB,
			s1_we => wishbone_bus_0_s1_wb__To__HW_acc1_0_HW_sWE,
			s2_ack => wishbone_bus_0_s2_wb__To__MEM_0_mem_sACK,
			s2_addr(31 downto 0) => wishbone_bus_0_s2_wb__To__MEM_0_mem_sADDR(31 downto 0),
			s2_clk => wishbone_bus_0_s2_wb__To__MEM_0_mem_sCLK,
			s2_cyc => wishbone_bus_0_s2_wb__To__MEM_0_mem_sCYC,
			s2_data(31 downto 0) => wishbone_bus_0_s2_wb__To__MEM_0_mem_sDATA(31 downto 0),
			s2_rst => wishbone_bus_0_s2_wb__To__MEM_0_mem_sRST,
			s2_sel => wishbone_bus_0_s2_wb__To__MEM_0_mem_sSEL,
			s2_stb => wishbone_bus_0_s2_wb__To__MEM_0_mem_sSTB,
			s2_we => wishbone_bus_0_s2_wb__To__MEM_0_mem_sWE,
			s3_ack => wishbone_bus_0_s3_wb__To__CAM_0_cam_sACK,
			s3_addr(31 downto 0) => wishbone_bus_0_s3_wb__To__CAM_0_cam_sADDR(31 downto 0),
			s3_clk => wishbone_bus_0_s3_wb__To__CAM_0_cam_sCLK,
			s3_cyc => wishbone_bus_0_s3_wb__To__CAM_0_cam_sCYC,
			s3_data(31 downto 0) => wishbone_bus_0_s3_wb__To__CAM_0_cam_sDATA(31 downto 0),
			s3_rst => wishbone_bus_0_s3_wb__To__CAM_0_cam_sRST,
			s3_sel => wishbone_bus_0_s3_wb__To__CAM_0_cam_sSEL,
			s3_stb => wishbone_bus_0_s3_wb__To__CAM_0_cam_sSTB,
			s3_we => wishbone_bus_0_s3_wb__To__CAM_0_cam_sWE,
			s4_ack => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sACK,
			s4_addr(31 downto 0) => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sADDR(31 downto 0),
			s4_clk => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sCLK,
			s4_cyc => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sCYC,
			s4_data(31 downto 0) => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sDATA(31 downto 0),
			s4_rst => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sRST,
			s4_sel => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sSEL,
			s4_stb => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sSTB,
			s4_we => wishbone_bus_0_s4_wb__To__HW_acc2_0_HW2_sWE,
			s5_ack => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ACK,
			s5_addr(31 downto 0) => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1ADDR(31 downto 0),
			s5_clk => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CLK,
			s5_cyc => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1CYC,
			s5_data(31 downto 0) => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1DATA(31 downto 0),
			s5_rst => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1RST,
			s5_sel => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1SEL,
			s5_stb => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1STB,
			s5_we => wishbone_bus_0_s5_wb__To__DMA2_0_dma_s1WE
		);

	wishbone_bus_1 : wishbone_bus
		port map (
			m1_ack => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbACK,
			m1_addr(31 downto 0) => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbADDR(31 downto 0),
			m1_clk => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbCLK,
			m1_cyc => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbCYC,
			m1_data(31 downto 0) => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbDATA(31 downto 0),
			m1_rst => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbRST,
			m1_sel => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbSEL,
			m1_stb => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbSTB,
			m1_we => DMA2_0_dma_m1__To__wishbone_bus_1_m1_wbWE,
			s2_ack => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sACK,
			s2_addr(31 downto 0) => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sADDR(31 downto 0),
			s2_clk => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sCLK,
			s2_cyc => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sCYC,
			s2_data(31 downto 0) => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sDATA(31 downto 0),
			s2_rst => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sRST,
			s2_sel => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sSEL,
			s2_stb => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sSTB,
			s2_we => wishbone_bus_1_s2_wb__To__HW_acc2_0_0_HW2_sWE
		);

end hierarchical;

