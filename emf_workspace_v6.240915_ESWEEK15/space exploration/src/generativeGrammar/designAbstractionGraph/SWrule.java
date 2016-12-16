package generativeGrammar.designAbstractionGraph;

import java.util.List;
import java.util.ArrayList;

import generativeGrammar.utils.ConnectedPort;
import generativeGrammar.utils.SWmappingPair;

import org.eclipse.emf.common.util.EList;



public class SWrule {
	
	protected String ruleName;
	
	protected List<SWmappingPair> mappings = new ArrayList<SWmappingPair>();
	
	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public List<SWmappingPair> getMappings() {
		return mappings;
	}

	public void setMappings(EList<SWmappingPair> mappings) {
		this.mappings = mappings;
	}

	public void addMappings(SWmappingPair mapping) {
		this.mappings.add(mapping);
	}

	/*
	public SWrule () {
		this.ruleName = "";
		this.mappings = new ArrayList<SWmappingPair>();
	}
	*/
}
