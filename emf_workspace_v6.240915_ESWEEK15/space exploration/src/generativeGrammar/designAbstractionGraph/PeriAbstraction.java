package generativeGrammar.designAbstractionGraph;

import generativeGrammar.utils.PortRefCompPair;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;

public interface PeriAbstraction extends EObject{
	
	boolean addPortToRefComponentPair(PortRefCompPair e);

	List<PortRefCompPair> getPortToRefComponentPair();

	void setPortToRefComponentPair(List<PortRefCompPair> portToRefComponentPair);
	
	LibraryRefType getLibRefComponent();

	void setLibRefComponent(LibraryRefType libRefComponent);

	void addMasterPort(Interface port) ;
	
	void addSlavePort(Interface port) ;
	
	void setInstanceName(String name);	
	
	List<Interface> getMasterPorts();
	
	List<Interface> getSlavePorts();
	
	List<Interface> getAllPorts();
	
	String getInstanceName();
	
	void removeConnection(String portName);
		
}
