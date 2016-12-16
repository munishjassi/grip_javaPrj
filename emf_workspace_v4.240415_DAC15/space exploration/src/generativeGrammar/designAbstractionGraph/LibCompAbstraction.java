package generativeGrammar.designAbstractionGraph;

import generativeGrammar.utils.BusPorts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface LibCompAbstraction extends EObject {

	
	public List<String> getMirMasters();

	public void setMirMasters(List<String> mirMasters);

	public List<String> getMirSlaves();

	public void setMirSlaves(List<String> mirSlaves);

	public List<String> getMasters();

	public void setMasters(List<String> masters);
	
	public List<String> getSlaves();
	
	public void setSlaves(List<String> slaves);
	
	public List<String> getAllports();

	public void setAllports(List<String> allports);
	
	
	
	public boolean getIS_BUS();

	public void setIS_BUS(boolean iS_BUS);

	void addMirMasterPort(BusPorts port);

	void addMirSlavePort(BusPorts port);

	void addMasterPort(BusPorts port);

	void addSlavePort(BusPorts port);

	void setInstanceName(String name);

	String getInstanceName();

	List<BusPorts> getMasterPorts();

	List<BusPorts> getSlavePorts();

	List<BusPorts> getMirMasterPorts();

	List<BusPorts> getMirSlavePorts();

	List<BusPorts> getAllPorts();
	
	String getLibrary();

	void setLibrary(String library);

	String getVendor();

	void setVendor(String vendor);

	String getVersion();

	void setVersion(String version);
	
	boolean IsEquivalent(LibCompAbstraction lib);

}
