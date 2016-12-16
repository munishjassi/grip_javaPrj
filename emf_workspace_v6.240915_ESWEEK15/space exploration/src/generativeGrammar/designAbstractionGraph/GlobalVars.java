package generativeGrammar.designAbstractionGraph;

import generativeGrammar.utils.GenerativRulePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import generativeGrammar.designAbstractionGraph.LibCompAbstraction;
import generativeGrammar.designAbstractionGraph.impl.DesignAbstractionImpl;

public class GlobalVars {

	// First element in BUS_INSTANCES list is the primary bus. Others are secondary
	public static final List<String> BUS_INSTANCES = Arrays.asList("axi_interconnect_0", "axi_interconnect_1", "axi_interconnect_2", "axi_interconnect_3");
	
	public static final List<String> LIBRARY_BUSES = Arrays.asList("AXIBUS, AXILITEBUS");
	
	public static DesignAbstractionImpl TOP_DESIGN = new DesignAbstractionImpl();
	
	public static List<DesignAbstraction> ALL_DESIGNS = new ArrayList<DesignAbstraction>();

	public static List<LibCompAbstraction> LIBRARY = new ArrayList<LibCompAbstraction>();

	public static List<GenerativRulePair> GENERATV_HW_RULES = new ArrayList<GenerativRulePair>();
	
	public static List<SWrule> GENERATV_SW_RULES = new ArrayList<SWrule>();
	
	public static final String LIB_DIR_PATH = "../data/hw/library_arm/v2";
	
	
	
	public static final String InDes = "../data/hw/inputdes/arch0";
	public static final String OutDir = "../data/hw/outputdes1";
	public static final String OutDes = "../data/hw/outputdes1/archn1";
	public static final String ApplyRule = "../data/hw/rules/rule1.1_addSO";
	public static List<String> ApplyRules = Arrays.asList("../data/hw/rules/rule1.1_addSO", 
															"../data/hw/rules/rule2.1_addER",
															"../data/hw/rules/rule3.1_addGR",
															"../data/hw/rules/rule1.2_addSO_existingBus",				
															"../data/hw/rules/rule2.2_addER_existingBus",
															"../data/hw/rules/rule3.2_addGR_existingBus",
															"../data/hw/rules/rule2.3_addER_PP",
															"../data/hw/rules/rule3.3_addGR_PP");


}
