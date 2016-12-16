package generativeGrammar.utils;

import generativeGrammar.designAbstractionGraph.CompAbstraction;

public class PortCompPair {

	private String port;

	private CompAbstraction refComp;

	private String refPort;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRefPort() {
		return refPort;
	}

	public void setRefPort(String refPort) {
		this.refPort = refPort;
	}

	public void setPair(String aPort, String aRefPort, CompAbstraction aRefComp) {
		port = aPort;
		refComp = aRefComp;
		refPort = aRefPort;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public CompAbstraction getRefComp() {
		return refComp;
	}

	public void setRefComp(CompAbstraction refComp) {
		this.refComp = refComp;
	}

	public PortCompPair() {
		super();
	}

	public PortCompPair(String aPort, String aRefPort, CompAbstraction aRefComp) {
		port = aPort;
		refPort = aRefPort;
		refComp = aRefComp;
	}
}