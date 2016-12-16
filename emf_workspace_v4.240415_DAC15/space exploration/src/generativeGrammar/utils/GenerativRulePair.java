package generativeGrammar.utils;

import generativeGrammar.designAbstractionGraph.DesignAbstraction;
import generativeGrammar.designAbstractionGraph.GlobalVars;
import generativeGrammar.designAbstractionGraph.impl.DesignAbstractionImpl;
import generativeGrammar.designAbstractionGraph.GlobalVars;



public class GenerativRulePair {

	private DesignAbstraction generativPattern;

	private DesignAbstraction replacementPattern;

	public DesignAbstraction getGenerativPattern() {
		return generativPattern;
	}

	public void setGenerativPattern(DesignAbstraction generativPattern) {
		this.generativPattern = generativPattern;
	}

	public DesignAbstraction getReplacementPattern() {
		return replacementPattern;
	}

	public void setReplacementPattern(DesignAbstraction replacementPattern) {
		this.replacementPattern = replacementPattern;
	}

	public void setPair(DesignAbstraction generativPattern, DesignAbstraction replacementPattern) {
		this.generativPattern = generativPattern;
		this.replacementPattern = replacementPattern;
	}

	public GenerativRulePair() {
		super();
	}

	public GenerativRulePair(DesignAbstraction generativPattern, DesignAbstraction replacementPattern) {
		this.generativPattern = generativPattern;
		this.replacementPattern = replacementPattern;
	}
	
	public GenerativRulePair(String gripRuleDir) {
		
		// Left side pattern input and conversion to Architecture graph
		DesignAbstractionImpl leftpat = new DesignAbstractionImpl();
		leftpat.genGraph(gripRuleDir + "/leftpat");
		leftpat.PrintDesignSummary();
		// Right side pattern input and conversion to Architecture graph
		DesignAbstractionImpl rightpat = new DesignAbstractionImpl();
		rightpat.genGraph(gripRuleDir + "/rightpat");
		rightpat.PrintDesignSummary();
		
		
		this.generativPattern = leftpat;
		this.replacementPattern = rightpat;
	}
	
}