package generativeGrammar.utils;

import java.util.ArrayList;
import java.util.List;

public class BusPorts {
	
	protected String Bus = new String();
	
	protected List<String> Ports = new ArrayList<String>();
	
	
	public String getBus() {
		return Bus;
	}
	public void setBus(String bus) {
		Bus = bus;
	}
	public List<String> getPorts() {
		return Ports;
	}
	public void setPorts(List<String> ports) {
		Ports = ports;
	}
	
	public void addPort(String port) {
		Ports.add(port);
	}
	
}
