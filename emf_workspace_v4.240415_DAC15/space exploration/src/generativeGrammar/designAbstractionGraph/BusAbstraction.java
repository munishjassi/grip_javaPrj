package generativeGrammar.designAbstractionGraph;

import generativeGrammar.utils.PortRefCompPair;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;

public interface BusAbstraction extends EObject {

	// public List <PortRefCompPair> portToRefComponentPair = new
	// ArrayList<PortRefCompPair>();
	boolean addPortToRefComponentPair(PortRefCompPair e);

	List<PortRefCompPair> getPortToRefComponentPair();

	void setPortToRefComponentPair(List<PortRefCompPair> portToRefComponentPair);

	LibraryRefType getLibRefComponent();

	void setLibRefComponent(LibraryRefType libRefComponent);

	void addMirMasterPort(Interface port);

	void addMirSlavePort(Interface port);

	void setInstanceName(String name);
	
	int getBusId();
	
	void setBusId(int busId);

	List<Interface> getMirMasterPorts();

	List<Interface> getMirSlavePorts();

	List<Interface> getAllPorts();

	String getInstanceName();

	void removeConnection(String portName);

}
