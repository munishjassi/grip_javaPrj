package generativeGrammar.designAbstractionGraph;

import generativeGrammar.utils.ConnectedPort;
import generativeGrammar.utils.Parameter;
import generativeGrammar.utils.PortCompPair;
//import generativeGrammar.utils.PortRefCompPair;




import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;

public interface CompAbstraction extends EObject {


	public boolean getIS_BUS();

	public List<String> getConnectedPorts();
	
	public void setIS_BUS(boolean iS_BUS);
	
	public List<Parameter> getParameters();
	
	public void setParameters(List<Parameter> parameters);

	public void addParameter(Parameter parameter);
	
	public List<ConnectedPort> getAllPins();

	public void setAllPins(List<ConnectedPort> allPins);

	public void addPin(ConnectedPort pin);
	
	public List<PortCompPair> getPinToRefComponentPair();
	
	public void setPinToRefComponentPair(List<PortCompPair> pinToRefComponentPair);
	
	public void addPinToRefComponentPair(PortCompPair pintoref);
	
	boolean addPortToRefComponentPair(PortCompPair e);
	
	public String getPortType(String aport);
	
	public String getBusType(String aport);

	List<PortCompPair> getPortToRefComponentPair();

	void setPortToRefComponentPair(List<PortCompPair> portToRefComponentPair);

	LibraryRefType getLibRefComponent();

	LibCompAbstraction getLibAbsRef();

	void setLibAbsRef(LibCompAbstraction libAbsRef);
	
	void setLibRefComponent(LibraryRefType libRefComponent);

	void setInstanceName(String name);

	List<ConnectedPort> getMasterPorts();

	List<ConnectedPort> getSlavePorts();

	List<ConnectedPort> getMirMasterPorts();

	List<ConnectedPort> getMirSlavePorts();

	List<ConnectedPort> getAllPorts();
	
	int getCompId();

	void setCompId(int compId);
	
	void setPortConnections();

	String getInstanceName();

	void removeConnection(String portName);

	List<String> getUnconnectedPorts(String portType, String busType);

	void resetPortConnections();
	
	boolean IsEquivalent(CompAbstraction comp, boolean strict);
	
	int getMapped();

	void setMapped(int mapped);
	
	public boolean isToRemoved();

	public void setToRemoved(boolean toRemoved);
}