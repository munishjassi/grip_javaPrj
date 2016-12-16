package generativeGrammar.designAbstractionGraph.impl;

import generativeGrammar.designAbstractionGraph.LibCompAbstraction;
import generativeGrammar.utils.BusPorts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.impl.EObjectImpl;

public class LibCompAbstractionImpl extends EObjectImpl implements LibCompAbstraction {

	protected List<BusPorts> mirMasterPorts = new ArrayList<BusPorts>();

	protected List<BusPorts> mirSlavePorts = new ArrayList<BusPorts>();

	protected List<BusPorts> masterPorts = new ArrayList<BusPorts>();

	protected List<BusPorts> slavePorts = new ArrayList<BusPorts>();

	protected List<BusPorts> allPorts = new ArrayList<BusPorts>();


	protected List<String> mirMasters = new ArrayList<String>();

	protected List<String> mirSlaves = new ArrayList<String>();

	protected List<String> masters = new ArrayList<String>();

	protected List<String> slaves = new ArrayList<String>();

	protected List<String> allports = new ArrayList<String>();

	public List<String> getMirMasters() {
		return mirMasters;
	}

	public void setMirMasters(List<String> mirMasters) {
		this.mirMasters = mirMasters;
	}

	public List<String> getMirSlaves() {
		return mirSlaves;
	}

	public void setMirSlaves(List<String> mirSlaves) {
		this.mirSlaves = mirSlaves;
	}

	public List<String> getMasters() {
		return masters;
	}

	public void setMasters(List<String> masters) {
		this.masters = masters;
	}

	public List<String> getSlaves() {
		return slaves;
	}

	public void setSlaves(List<String> slaves) {
		this.slaves = slaves;
	}

	public List<String> getAllports() {
		return allports;
	}

	public void setAllports(List<String> allports) {
		this.allports = allports;
	}
	
	protected String instanceName;
	
	protected String library;
	
	protected String vendor;
	
	protected String version;
	
	boolean IS_BUS = false;
	
	
	public String getLibrary() {
		return library;
	}

	public void setLibrary(String library) {
		this.library = library;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


	public boolean getIS_BUS() {
		return IS_BUS;
	}

	public void setIS_BUS(boolean is_bus) {
		IS_BUS = is_bus;
	}

	@Override
	public void setInstanceName(String name) {
		instanceName = name;
	}

	@Override
	public String getInstanceName() {
		return instanceName;
	}

	@Override
	public void addMirMasterPort(BusPorts port) {
		mirMasterPorts.add(port);
	}

	@Override
	public void addMirSlavePort(BusPorts port) {
		mirSlavePorts.add(port);
	}

	@Override
	public void addMasterPort(BusPorts port) {
		masterPorts.add(port);
	}

	@Override
	public void addSlavePort(BusPorts port) {
		slavePorts.add(port);
	}

	@Override
	public List<BusPorts> getMirMasterPorts() {
		return mirMasterPorts;
	}

	@Override
	public List<BusPorts> getMirSlavePorts() {
		return mirSlavePorts;
	}

	@Override
	public List<BusPorts> getMasterPorts() {
		return masterPorts;
	}

	@Override
	public List<BusPorts> getSlavePorts() {
		return slavePorts;
	}

	@Override
	public List<BusPorts> getAllPorts() {
		this.allPorts = new ArrayList<BusPorts>();
		this.allPorts.addAll(mirMasterPorts);
		this.allPorts.addAll(mirSlavePorts);
		this.allPorts.addAll(masterPorts);
		this.allPorts.addAll(slavePorts);
		
		return allPorts;
	}

	public boolean IsEquivalent(LibCompAbstraction lib) {
		boolean equi = true;
		if (lib.getIS_BUS() != this.getIS_BUS()) {equi = false;}
		if (lib.getInstanceName() != this.getInstanceName()) { equi = false;}
		if (lib.getMasterPorts().size()!=this.getMasterPorts().size())  { equi = false;}
		if (lib.getSlavePorts().size()!=this.getSlavePorts().size())  { equi = false;}
		if (lib.getMirMasterPorts().size()!=this.getMirMasterPorts().size())  { equi = false;}
		if (lib.getMirSlavePorts().size()!=this.getMirSlavePorts().size())  { equi = false;}
		
		List<String> masters = new ArrayList<String>();
		List<String> slaves = new ArrayList<String>();
		List<String> mirmasters = new ArrayList<String>();
		List<String> mirslaves = new ArrayList<String>();
		
		
		
		for (Iterator<String> i = lib.getMasters().iterator(); i.hasNext();) {
			String object = (String) i.next();
			if (!this.masters.contains(object)) { equi = false ; }
		}
		for (Iterator<String> i = lib.getSlaves().iterator(); i.hasNext();) {
			String object = (String) i.next();
			if (!this.slaves.contains(object)) { equi = false ; }
		}
		for (Iterator<String> i = lib.getMirMasters().iterator(); i.hasNext();) {
			String object = (String) i.next();
			if (!this.mirMasters.contains(object)) { equi = false ; }
		}
		for (Iterator<String> i = lib.getMirSlaves().iterator(); i.hasNext();) {
			String object = (String) i.next();
			if (!this.mirSlaves.contains(object)) { equi = false ; }
		}
		if (!equi) System.out.println("Equivalence Check: Library mapping is not Equivalent: " + this.getInstanceName() + "!=" + lib.getInstanceName());
		else System.out.println("Equivalence Check: Library mapping is Equivalent: " + this.getInstanceName() + "==" + lib.getInstanceName());
		
		return equi;
	}
	
	public LibCompAbstractionImpl() {
		super();
	}
}
