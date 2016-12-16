package generativeGrammar.designAbstractionGraph.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import generativeGrammar.designAbstractionGraph.BusAbstraction;
import generativeGrammar.utils.PortRefCompPair;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;

public class BusAbstractionImpl extends EObjectImpl implements BusAbstraction {
	
	protected List<Interface> mirMasterPorts;
	
	protected List<Interface> mirSlavePorts;
	
	protected List<Interface> allPorts;
	
	protected String instanceName;
	
	protected LibraryRefType libRefComponent;
	
	protected int busId;

	public int getBusId() {
		return busId;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}

	protected List <PortRefCompPair> portToRefComponentPair = new ArrayList<PortRefCompPair>();;

	public LibraryRefType getLibRefComponent() {
		return libRefComponent;
	}


	public void setLibRefComponent(LibraryRefType libRefComponent) {
		this.libRefComponent = libRefComponent;
	}

	
	public boolean addPortToRefComponentPair(PortRefCompPair e) {
		return portToRefComponentPair.add(e);
	}


	public List<PortRefCompPair> getPortToRefComponentPair() {
		return portToRefComponentPair;
	}


	public void setPortToRefComponentPair(List<PortRefCompPair> portToRefComponentPair) {
		this.portToRefComponentPair = portToRefComponentPair;
	}
	
	@Override
	public void setInstanceName(String name) {
		instanceName = name;		
	}


	@Override
	public void addMirMasterPort(Interface port) {
		mirMasterPorts.add(port);
	}

	@Override
	public void addMirSlavePort(Interface port) {
		mirSlavePorts.add(port);
	}

	@Override
	public List<Interface> getMirMasterPorts() {
		return mirMasterPorts;
	}

	@Override
	public List<Interface> getMirSlavePorts() {
		return mirSlavePorts;
	}

	@Override
	public List<Interface> getAllPorts() {
		allPorts = new ArrayList<Interface>();
		allPorts.addAll(mirMasterPorts);
		allPorts.addAll(mirSlavePorts);
		return allPorts;
	}

	@Override
	public String getInstanceName() {
		return instanceName;
	}

	@Override
	public void removeConnection(String portName) {
		int cnt = 0;
        for (Iterator<PortRefCompPair> j = portToRefComponentPair.iterator(); j.hasNext(); ) {
        	PortRefCompPair pair = (PortRefCompPair)j.next();
        	if (pair.getPort().equals(portName)) {
        		portToRefComponentPair.remove(cnt);
        	}
        }
	}
	
	public BusAbstractionImpl() {
		super();
	}
	

}
