package generativeGrammar.designAbstractionGraph.impl;

import generativeGrammar.designAbstractionGraph.GlobalVars;
import generativeGrammar.designAbstractionGraph.LibCompAbstraction;
import generativeGrammar.utils.BusPorts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfacesType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentType;
import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;
import org.spiritconsortium.xml.schema.spirit.spirit.util._1ResourceFactoryImpl;

import com.rits.cloning.Cloner;

public class LibAbstractionGenerateImpl {

	public List<LibCompAbstraction> GenerateLibAbstraction(String searchPath) throws IOException {

		System.out.println();
		System.out.println("Calling Function: LibAbstractionGenerateImpl.GenerateLibAbstraction(String searchPath)");

		List<LibCompAbstraction> abstractionLib = new ArrayList<LibCompAbstraction>();
		String path = searchPath;
		System.out.println("Starting Library Prepration.....");
		System.out.println("Start loading libraries from path: " + path);
		System.out.println();

		String file;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		System.out.println("List of IP-XACT Library files: ");
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				file = listOfFiles[i].getName();
				System.out.println(file);
			}
		}

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				file = listOfFiles[i].toString();
				if (file.endsWith(".xml")) {
					System.out.println("Abstrating Library from file: " + file);
					LibCompAbstraction lca = AbstractLib(file);
					abstractionLib.add(lca);
				}
			}
		}
		System.out.println("Library Prepration COMPLETED");
		System.out.println("Library Components");
		
		return abstractionLib;
	}

	public void PrintLibraryGenSummary (List<LibCompAbstraction> abstractionLib) {
		
		System.out.println("Summary of Library generation: ");
		for (Iterator <LibCompAbstraction> i = abstractionLib.iterator(); i.hasNext();) {
			LibCompAbstraction object = (LibCompAbstraction) i.next();
			System.out.println("Instance Name: " + object.getInstanceName());
			for (Iterator <BusPorts> j = object.getMasterPorts().iterator(); j.hasNext();) {
				BusPorts obj = j.next();
				System.out.println("	Master Ports: " + obj.getBus() + " " + obj.getPorts());	
			}
			for (Iterator <BusPorts> j = object.getSlavePorts().iterator(); j.hasNext();) {
				BusPorts obj = j.next();
				System.out.println("	Slave Ports: " + obj.getBus() + " " + obj.getPorts());	
			}
			for (Iterator <BusPorts> j = object.getMirMasterPorts().iterator(); j.hasNext();) {
				BusPorts obj = j.next();
				System.out.println("	MirMaster Ports: " + obj.getBus() + " " + obj.getPorts());	
			}
			for (Iterator <BusPorts> j = object.getMirSlavePorts().iterator(); j.hasNext();) {
				BusPorts obj = j.next();
				System.out.println("	MirSlave Ports: " + obj.getBus() + " " + obj.getPorts());	
			}
			
			System.out.println("	All Ports: " + object.getAllports());
		}
			
	}
	
	public LibCompAbstraction AbstractLib(String file) throws IOException {

		System.out.println("Reading from IP-XACT file: " + file);

		LibCompAbstraction libCompAbs = new LibCompAbstractionImpl();
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);

		URI uri = URI.createFileURI(file);
		Resource resource = resourceSet.getResource(uri, true);
		System.out.println("LOADED " + uri);
		DocumentRoot libRoot = (DocumentRoot) resource.getContents().get(0);
		ComponentType libTreeNode = libRoot.getComponent();


		// Setting Library/Name/Vendor/Version
		libCompAbs.setLibrary(libTreeNode.getLibrary());
		libCompAbs.setInstanceName(libTreeNode.getName());
		libCompAbs.setVendor(libTreeNode.getVendor());
		libCompAbs.setVersion(libTreeNode.getVersion());
		
		// Setting Library Type - Bus/Peripheral
		List<String> busInstances = GlobalVars.LIBRARY_BUSES;
		boolean isbus = false;
		for (Iterator<String> k = busInstances.iterator(); k.hasNext();) {
			String obj = (String) k.next();
			if (obj.equals(libTreeNode.getName())) {
				isbus = true;
			}
		}
		
		if (isbus) {
			libCompAbs.setIS_BUS(true);
			System.out.println("Type of Library Component is Bus.");
		} else
		{
			libCompAbs.setIS_BUS(false);
			System.out.println("Type of Library Component is Peripheral.");
		}

		// Setting Port types
		BusInterfacesType businterfaces = libTreeNode.getBusInterfaces();
		List<BusInterfaceType> busInterfaceList = businterfaces.getBusInterface();

		String type;
		String bustype;
		Boolean added;
		BusPorts port = new BusPorts();
		Cloner cloner = new Cloner();
		
		for (Iterator<BusInterfaceType> j = busInterfaceList.iterator(); j.hasNext();) {
			BusInterfaceType object = (BusInterfaceType) j.next();
			String name = object.getName();
			bustype = object.getBusType().getName();
			//@SuppressWarnings("unused")
			added = false;
			
			try {
				type = object.getMirroredSlave().toString();
				libCompAbs.getMirSlaves().add(name);
				for (Iterator<BusPorts> i = libCompAbs.getMirSlavePorts().iterator(); i.hasNext();) {
					BusPorts obj = i.next();
					if (obj.getBus().equals(bustype)) {
						obj.addPort(name);
						added = true;
						System.out.println("Port is MirroredSlave: " + name);
					}
				}
				
				if (!added) {
					BusPorts port1 = cloner.deepClone(port);
					port1.setBus(bustype);
					port1.addPort(name);
					libCompAbs.addMirSlavePort(port1);
					System.out.println("Port is MirroredSlave: " + name);
				}
				} catch (NullPointerException e){}			
			try {
				type = object.getSlave().toString();
				libCompAbs.getSlaves().add(name);
				for (Iterator<BusPorts> i = libCompAbs.getSlavePorts().iterator(); i.hasNext();) {
					BusPorts obj = i.next();
					if (obj.getBus().equals(bustype)) {
						obj.addPort(name);
						added = true;
						System.out.println("Port is Slave: " + name);
					}
				}
				if (!added) {
					BusPorts port1 = cloner.deepClone(port);
					port1.setBus(bustype);
					port1.addPort(name);
					libCompAbs.addSlavePort(port1);
					System.out.println("Port is Slave: " + name);
				}
				} catch (NullPointerException e){}
			try {
				type = object.getMirroredMaster().toString();
				libCompAbs.getMirMasters().add(name);
				for (Iterator<BusPorts> i = libCompAbs.getMirMasterPorts().iterator(); i.hasNext();) {
					BusPorts obj = i.next();
					if (obj.getBus().equals(bustype)) {
						obj.addPort(name);
						added = true;
						System.out.println("Port is MirroredMaster: " + name);
					}
				}
				if (!added) {
					BusPorts port1 = cloner.deepClone(port);
					port1.setBus(bustype);
					port1.addPort(name);
					libCompAbs.addMirMasterPort(port1);
					System.out.println("Port is MirroredMaster: " + name);
				}
				} catch (NullPointerException e){}
			try {
				type = object.getMaster().toString();
				libCompAbs.getMasters().add(name);
				for (Iterator<BusPorts> i = libCompAbs.getMasterPorts().iterator(); i.hasNext();) {
					BusPorts obj = i.next();
					if (obj.getBus().equals(bustype)) {
						obj.addPort(name);
						added = true;
						System.out.println("Port is Master: " + name);
					}
				}
				if (!added) {
					BusPorts port1 = cloner.deepClone(port);
					port1.setBus(bustype);
					port1.addPort(name);
					libCompAbs.addMasterPort(port1);
					System.out.println("Port is Master: " + name);
				}
				} catch (NullPointerException e){}
			
		} // Close loop over all the BusInterfaceList
		
		return libCompAbs;
	}
	
	public LibAbstractionGenerateImpl() {
		super();
	}
}
