package generativeGrammar.utils;

public class PortRefCompPair {
	private String port;

	private String refComp;

	public void setPair(String aPort, String aRefComp) {
		port = aPort;
		refComp = aRefComp;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getRefComp() {
		return refComp;
	}

	public void setRefComp(String refComp) {
		this.refComp = refComp;
	}

	public PortRefCompPair() {
		super();
	}

	public PortRefCompPair(String aPort, String aRefComp) {
		port = aPort;
		refComp = aRefComp;
	}
}