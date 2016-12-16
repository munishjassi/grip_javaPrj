package generativeGrammar.designAbstractionGraph.impl;

import generativeGrammar.designAbstractionGraph.PeriAbstraction;
import generativeGrammar.utils.PortRefCompPair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;

public class PeriAbstractionImpl extends EObjectImpl implements PeriAbstraction {

	protected List<Interface> masterPorts = new ArrayList<Interface>();

	protected List<Interface> slavePorts = new ArrayList<Interface>();

	protected List<Interface> allPorts = new ArrayList<Interface>();

	protected String instanceName;

	protected List<PortRefCompPair> portToRefComponentPair = new ArrayList<PortRefCompPair>();;

	protected LibraryRefType libRefComponent;

	public void setLibRefComponent(LibraryRefType libRefComponent) {
		this.libRefComponent = libRefComponent;
	}

	public LibraryRefType getLibRefComponent() {
		return libRefComponent;
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
	public void addMasterPort(Interface port) {
		masterPorts.add(port);
	}

	@Override
	public void addSlavePort(Interface port) {
		slavePorts.add(port);
	}

	@Override
	public List<Interface> getMasterPorts() {
		return masterPorts;
	}

	@Override
	public List<Interface> getSlavePorts() {
		return slavePorts;
	}

	@Override
	public List<Interface> getAllPorts() {
		allPorts = new ArrayList<Interface>();
		allPorts.addAll(masterPorts);
		allPorts.addAll(slavePorts);
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

	public PeriAbstractionImpl() {
		super();
	}

}