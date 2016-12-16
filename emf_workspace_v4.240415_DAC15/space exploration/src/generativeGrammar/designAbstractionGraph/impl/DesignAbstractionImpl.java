package generativeGrammar.designAbstractionGraph.impl;

import generativeGrammar.designAbstractionGraph.BusAbstraction;
import generativeGrammar.designAbstractionGraph.CompAbstraction;
import generativeGrammar.designAbstractionGraph.DesignAbstraction;
import generativeGrammar.designAbstractionGraph.GlobalVars;
import generativeGrammar.designAbstractionGraph.LibCompAbstraction;
import generativeGrammar.designAbstractionGraph.PeriAbstraction;
import generativeGrammar.utils.AdHocConnection;
import generativeGrammar.utils.ConnectedPort;
import generativeGrammar.utils.InternalPortRef;
import generativeGrammar.utils.Parameter;
import generativeGrammar.utils.PortCompPair;
import generativeGrammar.utils.PortRefCompPair;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.math.BigInteger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType;
import org.spiritconsortium.xml.schema.spirit.spirit.NameValuePairType;
import org.spiritconsortium.xml.schema.spirit.spirit.NameValueTypeType;
import org.spiritconsortium.xml.schema.spirit.spirit.ParametersType;
import org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1;
import org.spiritconsortium.xml.schema.spirit.spirit.PhaseType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortType1;
import org.spiritconsortium.xml.schema.spirit.spirit.PortsType1;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;
import org.spiritconsortium.xml.schema.spirit.spirit.util._1ResourceFactoryImpl;

import com.rits.cloning.Cloner;

public class DesignAbstractionImpl extends EObjectImpl implements DesignAbstraction {

	public List<BusAbstraction> buses = new ArrayList<BusAbstraction>();

	public List<PeriAbstraction> peripherals = new ArrayList<PeriAbstraction>();

	public List<CompAbstraction> desComponents = new ArrayList<CompAbstraction>();
	
	public List<AdHocConnection> adHocConnections = new ArrayList<AdHocConnection>();
	
	protected List<PortCompPair> pinToRefComponentPair = new ArrayList<PortCompPair>();
	
	protected List<Parameter> parameters = new ArrayList<Parameter>();

	protected List<ConnectedPort> allPins = new ArrayList<ConnectedPort>();

	
	private DesignType design;
	
	
	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	
	public void addParameter(Parameter parameter) {
		this.parameters.add(parameter);
	}

	public List<ConnectedPort> getAllPins() {
		return allPins;
	}

	public void setAllPins(List<ConnectedPort> allPins) {
		this.allPins = allPins;
	}

	public void addPin(ConnectedPort aPin) {
		this.allPins.add(aPin);
	}

	public List<AdHocConnection> getAdHocConnections() {
		return adHocConnections;
	}

	public void setAdHocConnections(List<AdHocConnection> adHocConnections) {
		this.adHocConnections = adHocConnections;
	}
	
	public List<PortCompPair> getPinToRefComponentPair() {
		return pinToRefComponentPair;
	}

	public void setPinToRefComponentPair(List<PortCompPair> pinToRefComponentPair) {
		this.pinToRefComponentPair = pinToRefComponentPair;
	}

	public void addPinToRefComponentPair(PortCompPair pintoref) {
		this.pinToRefComponentPair.add(pintoref);
	}

	public DesignType getDesign() {
		return design;
	}

	public void setDesign(DesignType design) {
		this.design = design;
	}

//	public List<ComponentType> getComponents() {
//		return components;
//	}
//
//	public void setComponents(List<ComponentType> components) {
//		this.components = components;
//	}
//
//	private List<ComponentType> components;
//	
//	

	public List<BusAbstraction> getBuses() {
		return buses;
	}

	public void setBuses(List<BusAbstraction> buses) {
		this.buses = buses;
	}

	public List<PeriAbstraction> getPeripherals() {
		return peripherals;
	}

	public void setPeripherals(List<PeriAbstraction> peripherals) {
		this.peripherals = peripherals;
	}

	public List<CompAbstraction> getDesComponents() {
		return desComponents;
	}

	public void setDesComponents(List<CompAbstraction> desComponents) {
		this.desComponents = desComponents;
	}

	public void addDesComponent(CompAbstraction desComponent) {
		this.desComponents.add(desComponent);
	}
	
	public void genGraph(String desDir) {
		System.out.println();
		System.out.println("Calling Function: DesignAbstractionImpl.GenGraph(String desDir)");

		System.out.println("Starting Design Graph Preparation.....");
		System.out.println();

		String file;
		File folder = new File(desDir);
		File[] listOfFiles = folder.listFiles();
		
		int cnt = 0;
		System.out.println("List of IP-XACT Library files: ");
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				file = listOfFiles[i].getName();
				System.out.println(file);
				if (file.contains("design") && file.endsWith(".xml") ) {
					cnt = i;
					String infile = desDir + "/" + file;
					this.genCompDesignGraph(infile);
				}
			}
		}
		

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				file = listOfFiles[i].toString();
				if (!file.contains("design") && file.endsWith(".xml")) {
					System.out.println("Abstracting Pins/Parameters from file: " + file);
					this.modifyComponent(file);
				}
			}
		}
		
		this.SetAdHocConnectionNames();
		this.SetInterconnectionNames();
		this.PrintDesignSummary();
	}

	public void modifyComponent(String compFile) {
		System.out.println("modifyComponent(): Reading from IPXACT file: " + compFile);

		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());

		//
		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);

		URI uri = URI.createFileURI(compFile);
		Resource resource = resourceSet.getResource(uri, true);
		System.out.println("LOADED " + uri);
		DocumentRoot compRoot = (DocumentRoot) resource.getContents().get(0);
		ComponentType compNode = compRoot.getComponent();
		String name = compNode.getName();

		for (Iterator<CompAbstraction> i = this.desComponents.iterator(); i.hasNext();) {
			CompAbstraction object = i.next();
			String nn = object.getInstanceName();
			if (name.matches(nn)) {
				ParametersType1 parameters = compNode.getParameters();
				if (parameters!= null) {
					List<NameValuePairType> listParameters = parameters.getParameter();	
					for (Iterator<NameValuePairType> j = listParameters.iterator(); j.hasNext();) {
						NameValuePairType obj = j.next();
						String nam = obj.getName();
						String val = obj.getValue().getValue();
						Parameter pp = new Parameter(nam, val);
						object.addParameter(pp);
					}
				}
				
				PortsType1 ports = compNode.getModel().getPorts();
				if (ports!=null) {
					List<PortType> listPorts = ports.getPort();	
					for (Iterator<PortType> j = listPorts.iterator(); j.hasNext();) {
						PortType obj = j.next();
						String nam = obj.getName();
						ConnectedPort pin = new ConnectedPort(nam, false);
						// Munish Check 06.01.15
						try { pin.setLeft(obj.getWire().getVector().getLeft().getValue()); } catch (Exception e) {} 
						try { pin.setRight(obj.getWire().getVector().getRight().getValue()); } catch (Exception e) {}
						try { pin.setDriver(obj.getWire().getDriver().getDefaultValue().getValue().toString());} catch (Exception e) {}
						try { pin.setDirection(obj.getWire().getDirection().getName());} catch (Exception e) { System.out.println(" HERE pin direction not avialble: " 
									+ nn + "/" + obj.getName());}
						// Munish check finish 06.01.15
						object.addPin(pin);
					}
				}
			}
		}
		
		if ((name + ".design").equals(this.design.getName())) {
			ParametersType1 parameters = compNode.getParameters();
			if (parameters!= null) {
				List<NameValuePairType> listParameters = parameters.getParameter();	
				for (Iterator<NameValuePairType> j = listParameters.iterator(); j.hasNext();) {
					NameValuePairType obj = j.next();
					String nam = obj.getName();
					String val = obj.getValue().getValue();
					Parameter pp = new Parameter(nam, val);
					this.addParameter(pp);
				}
			}
			
			PortsType1 ports = compNode.getModel().getPorts();
			if (ports!=null) {
				List<PortType> listPorts = ports.getPort();	
				for (Iterator<PortType> j = listPorts.iterator(); j.hasNext();) {
					PortType obj = j.next();
					String nam = obj.getName();
					ConnectedPort pin = new ConnectedPort(nam, false);
					try { pin.setLeft(obj.getWire().getVector().getLeft().getValue()); } catch (Exception e) {} 
					try { pin.setRight(obj.getWire().getVector().getRight().getValue()); } catch (Exception e) {}
					try { pin.setDriver(obj.getWire().getDriver().getDefaultValue().getValue().toString());} catch (Exception e) {}
					pin.setDirection(obj.getWire().getDirection().getName());
					this.addPin(pin);
				}
			}	
		}
	}
	
	public void genDesignGraph(String designFile) {

		System.out.println();
		System.out.println("Calling Function: DesignAbstractionImpl.genDesignGraph(String designFile)");

		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);
		URI uri = URI.createFileURI(designFile);
		Resource resource = resourceSet.getResource(uri, true);
		System.out.println("LOADED " + uri);
		DocumentRoot designRoot = (DocumentRoot) resource.getContents().get(0);
		DesignType rootNode = designRoot.getDesign();

		this.design = designRoot.getDesign();
		
		InterconnectionsType interconnections = rootNode.getInterconnections();
		List<InterconnectionType> interconnectionsList = interconnections.getInterconnection();

		ComponentInstancesType components = rootNode.getComponentInstances();
		List<ComponentInstanceType> componentsList = components.getComponentInstance();

		List<String> busInstances = GlobalVars.BUS_INSTANCES;

		for (Iterator<ComponentInstanceType> j = componentsList.iterator(); j.hasNext();) {
			boolean isbus = false;
			ComponentInstanceType object = (ComponentInstanceType) j.next();
			String name = object.getInstanceName();
			LibraryRefType ref = object.getComponentRef();

			System.out.println("\nStart Design Parsing...");
			for (Iterator<String> k = busInstances.iterator(); k.hasNext();) {
				String obj = (String) k.next();
				if (obj.equals(name)) {
					BusAbstraction bus = new BusAbstractionImpl();
					bus.setInstanceName(obj);
					bus.setLibRefComponent(ref);
					buses.add(bus);
					isbus = true;
					System.out.printf("Bus Component found : " + obj);
					continue;
				}
			}
			if (!isbus) {
				PeriAbstraction peri = new PeriAbstractionImpl();
				peri.setInstanceName(object.getInstanceName());
				peri.setLibRefComponent(ref);
				peripherals.add(peri);
				System.out.printf("Peripheral Component found : " + peri.getInstanceName());
			}
		}

		int ii = 0;

		for (Iterator<InterconnectionType> j = interconnectionsList.iterator(); j.hasNext();) {
			InterconnectionType object = (InterconnectionType) j.next();
			List<Interface> interfaces = new ArrayList<Interface>();
			interfaces = object.getActiveInterface();
			List<String> refComps = new ArrayList<String>();
			List<String> compPorts = new ArrayList<String>();

			if (interfaces.size() != 2) {
				System.err.println("Error: Only port to port "
						+ "interconnections are allowed in the current version. Also floating nets are " + "not allowed --- "
						+ object.getName());
			}

			for (Iterator<Interface> i = interfaces.iterator(); i.hasNext();) {
				Interface obj = (Interface) i.next();
				String port = obj.getBusRef();
				String comp = obj.getComponentRef();
				compPorts.add(port);
				refComps.add(comp);
			}

			if (refComps.size() != 2 || compPorts.size() != 2) {
				System.err.println("Error: Only port to port "
						+ "interconnections are allowed in the current version. Also floating nets are " + "not allowed --- "
						+ object.getName());
			}

			int iter = 0;

			for (Iterator<PeriAbstraction> k = peripherals.iterator(); k.hasNext();) {
				PeriAbstraction obj = (PeriAbstraction) k.next();
				String name = obj.getInstanceName();

				if (name.equals(refComps.get(0))) {
					PortRefCompPair ent = new PortRefCompPair();// compPorts.get(1),
																// refComps.get(1));
					ent.setPort(compPorts.get(0));
					ent.setRefComp(refComps.get(1));
					peripherals.get(iter).addPortToRefComponentPair(ent);
					System.out.println("port-refComp pair added to Peripheral Instance: " + name + "  RefComp: "
							+ peripherals.get(iter).getPortToRefComponentPair().get(0).getRefComp() + "  CompPort: "
							+ peripherals.get(iter).getPortToRefComponentPair().get(0).getPort());
				}
				if (name.equals(refComps.get(1))) {
					PortRefCompPair ent = new PortRefCompPair(compPorts.get(1), refComps.get(0));
					peripherals.get(iter).addPortToRefComponentPair(ent);
					System.out.println("port-refComp pair added to Peripheral Instance: " + name + "  RefComp: "
							+ peripherals.get(iter).getPortToRefComponentPair().get(0).getRefComp() + "  CompPort: "
							+ peripherals.get(iter).getPortToRefComponentPair().get(0).getPort());
				}
				iter++;
			}

			iter = 0;

			for (Iterator<BusAbstraction> k = buses.iterator(); k.hasNext();) {
				BusAbstraction obj = (BusAbstraction) k.next();
				String name = obj.getInstanceName();
				PortRefCompPair ent;
				if (name.equals(refComps.get(0))) {
					ent = new PortRefCompPair(compPorts.get(0), refComps.get(1));
					buses.get(iter).addPortToRefComponentPair(ent);
					System.out.println("port-refComp pair added to Bus Instance: " + name + "  RefComp: "
							+ buses.get(iter).getPortToRefComponentPair().get(ii).getRefComp() + "  CompPort: "
							+ buses.get(iter).getPortToRefComponentPair().get(ii).getPort());
					ii++;
				}
				if (name.equals(refComps.get(1))) {
					ent = new PortRefCompPair(compPorts.get(1), refComps.get(0));
					buses.get(iter).addPortToRefComponentPair(ent);
					System.out.println("port-refComp pair added to Bus Instance: " + name + "  RefComp: "
							+ buses.get(iter).getPortToRefComponentPair().get(ii).getRefComp() + "  CompPort: "
							+ buses.get(iter).getPortToRefComponentPair().get(ii).getPort());
					ii++;
				}
				iter++;
			}

		}

		int idbus = 0;
		int idperi = 0;
		
		// Its not correct --- to be corrected
		System.out.println("\nDesign Graph generation COMPLETED: " + designFile + " ..." + "\nDesign Summary: ");
		for (Iterator<CompAbstraction> j = desComponents.iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			List<PortCompPair> pairs = object.getPortToRefComponentPair();
			if (object.getIS_BUS()) {
				System.out.printf("%-25s %-12s %-15s %-5d %-20s", "Bus Instance Name:", object.getInstanceName(), "BusId: ", object.getCompId(), "RefComp-CompPort: ");
				if (object.getInstanceName() == GlobalVars.BUS_INSTANCES.get(0)) { 
					object.setCompId(0); 
					} else {
						object.setCompId(idbus);
						idbus++;
					}
				for (Iterator<PortCompPair> k = pairs.iterator(); k.hasNext();) {
					PortCompPair obj = (PortCompPair) k.next();
					System.out.print(obj.getRefComp().getInstanceName() + "-" + obj.getPort() + " ,");
				}
				System.out.printf("%10s %12s\n", "LibRef: ", object.getLibAbsRef().getInstanceName());
			} else {
				object.setCompId(idperi);
				idperi++;
				if (object.getPortToRefComponentPair().size() > 0) {
					System.out.printf("%-25s %-12s %-15s %-5d %-10s %-12s %-10s %-12s %-10s %s \n", "Peripheral Instance Name:", object.getInstanceName(), "PeriId: ", object.getCompId(),
							" RefComp: ", object.getPortToRefComponentPair().get(0).getRefComp().getInstanceName(), " CompPort: ", object
									.getPortToRefComponentPair().get(0).getPort(), "LibRef: ", object.getLibAbsRef().getInstanceName());
				}
			}
		}
	} // End Method genDesignGraph(String designFile)

	/* (non-Javadoc)
	 * @see generativeGrammar.designAbstractionGraph.DesignAbstraction#genCompDesignGraph(java.lang.String)
	 */
	public void genCompDesignGraph(String designFile) {

		System.out.println();
		System.out.println("Calling Function: DesignAbstractionImpl.genCompDesignGraph(String designFile)");

		ResourceSet resourceSet = new ResourceSetImpl();
		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);
		URI uri = URI.createFileURI(designFile);
		Resource resource = resourceSet.getResource(uri, true);
		System.out.println("LOADED " + uri);
		DocumentRoot designRoot = (DocumentRoot) resource.getContents().get(0);
		DesignType rootNode = designRoot.getDesign();
		this.design = designRoot.getDesign();
		
		
		InterconnectionsType interconnections = rootNode.getInterconnections();
		List<InterconnectionType> interconnectionsList = interconnections.getInterconnection();

		ComponentInstancesType components = rootNode.getComponentInstances();
		List<ComponentInstanceType> componentsList = components.getComponentInstance();
		List<String> busInstances = GlobalVars.BUS_INSTANCES;

	
		System.out.println("Start Design Parsing...");

		int idbus = 1;
		int idperi = 0;

		for (Iterator<ComponentInstanceType> j = componentsList.iterator(); j.hasNext();) {
			boolean isbus = false;
			ComponentInstanceType object = (ComponentInstanceType) j.next();
			String name = object.getInstanceName();
			LibraryRefType ref = object.getComponentRef();

			for (Iterator<String> k = busInstances.iterator(); k.hasNext();) {
				String obj = (String) k.next();
				if (obj.equals(name)) {
					CompAbstraction desComp = new CompAbstractionImpl();
					desComp.setInstanceName(obj);
					desComp.setLibRefComponent(ref);
					//desComp.getLibAbsRef().setInstanceName(ref.getName());
					desComp.setIS_BUS(true);
					if (name.equals(GlobalVars.BUS_INSTANCES.get(0))) {
						desComp.setCompId(0);
					} else {
						desComp.setCompId(idbus);
						idbus++;
					}
					desComponents.add(desComp);
					isbus = true;
					System.out.printf("%-30s %s \n", "Bus Component found : ", obj);
					continue;
				}
			}
			if (!isbus) {
				CompAbstraction desComp = new CompAbstractionImpl();
				desComp.setInstanceName(object.getInstanceName());
				desComp.setLibRefComponent(ref);
				desComp.setIS_BUS(false);
				desComp.setCompId(idperi);
				idperi++;
				desComponents.add(desComp);
				System.out.printf("%-30s %s \n", "Peripheral Component found : ", desComp.getInstanceName());
			}
			
			
			
		}

		for (Iterator<InterconnectionType> j = interconnectionsList.iterator(); j.hasNext();) {
			InterconnectionType object = (InterconnectionType) j.next();
			List<Interface> interfaces = new ArrayList<Interface>();
			interfaces = object.getActiveInterface();

			List<CompAbstraction> refComps = new ArrayList<CompAbstraction>();
			List<String> compPorts = new ArrayList<String>();

			if (interfaces.size() != 2) {
				System.err.println("Error: Only port to port "
						+ "interconnections are allowed in the current version. Also floating nets are " + "not allowed --- "
						+ object.getName());
			}

			for (Iterator<Interface> i = interfaces.iterator(); i.hasNext();) {
				Interface obj = (Interface) i.next();
				String port = obj.getBusRef();
				String name = obj.getComponentRef();
				CompAbstraction comp = new CompAbstractionImpl();
				for (Iterator<CompAbstraction> k = desComponents.iterator(); k.hasNext();) {
					CompAbstraction ob = (CompAbstraction) k.next();
					if (ob.getInstanceName().equals(name)) {
						comp = ob;
					}
				}

				compPorts.add(port);
				refComps.add(comp);
			}

			if (refComps.size() != 2 || compPorts.size() != 2) {
				System.err.println("Error: Only port to port "
						+ "interconnections are allowed in the current version. Also floating nets are " + "not allowed --- "
						+ object.getName());
			}

			int iter = 0;

			for (Iterator<CompAbstraction> k = desComponents.iterator(); k.hasNext();) {
				CompAbstraction obj = (CompAbstraction) k.next();
				String name = obj.getInstanceName();

				if (name.equals(refComps.get(0).getInstanceName())) {
					PortCompPair ent = new PortCompPair();
					ent.setPort(compPorts.get(0));
					ent.setRefComp(refComps.get(1));
					ent.setRefPort(compPorts.get(1));
					desComponents.get(iter).addPortToRefComponentPair(ent);
					System.out.println("port-refComp pair added to Peripheral Instance: " + refComps.get(0).getInstanceName() + ":  CompPort: "
							+ compPorts.get(0) + "  RefPort: " + compPorts.get(1) + "  RefComp:" + refComps.get(1).getInstanceName());
				}
				if (name.equals(refComps.get(1).getInstanceName())) {
					PortCompPair ent = new PortCompPair(compPorts.get(1), compPorts.get(0), refComps.get(0));
					desComponents.get(iter).addPortToRefComponentPair(ent);
					System.out.println("port-refComp pair added to Peripheral Instance: " + refComps.get(1).getInstanceName() + ":  CompPort: "
							+ compPorts.get(1) + "  RefPort: " + compPorts.get(0) + "  RefComp:" + refComps.get(0).getInstanceName());
				}
				iter++;
			}
		}

		// Setting LibAbstraction References
		// CAUTION: Library Preparation must be completed before this.
		this.SetLibAbstractionReference();

		// Setting ConnectedPort status on Ports
		for (Iterator<CompAbstraction> j = desComponents.iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			object.setPortConnections();
		}
		
		// 
		// Abstraction of adHocConnections in Arch. graph
		//

		AdHocConnectionsType adhocconnections = rootNode.getAdHocConnections();
		if (adhocconnections!=null) {
			List<AdHocConnectionType> adhocconnectionsList = adhocconnections.getAdHocConnection();
	
	
			Cloner cloner = new Cloner();
			AdHocConnection adhoc = new AdHocConnection();
			InternalPortRef portRef = new InternalPortRef();
			
			for (Iterator<AdHocConnectionType> i = adhocconnectionsList.iterator(); i.hasNext();) {
				AdHocConnectionType object = (AdHocConnectionType) i.next();
				AdHocConnection adhoc1 = cloner.deepClone(adhoc);
	
				List<InternalPortReferenceType> intRefList = object.getInternalPortReference();
				List<ExternalPortReferenceType> extRefList = object.getExternalPortReference();
				
				for (Iterator<InternalPortReferenceType> j = intRefList.iterator(); j.hasNext();) {
					InternalPortReferenceType obj = j.next();
					InternalPortRef portRef1 = cloner.deepClone(portRef);
					
					portRef1.setRefComponent(obj.getComponentRef());
					portRef1.setRefPort(obj.getPortRef());
					portRef1.setLeft(obj.getLeft());
					portRef1.setRight(obj.getRight());
					
					adhoc1.getInternalPortRef().add(portRef1);
				}
				for (Iterator<ExternalPortReferenceType> j = extRefList.iterator(); j.hasNext();) {
					ExternalPortReferenceType obj = j.next();
					InternalPortRef portRef1 = cloner.deepClone(portRef);
					//portRef1.setRefComponent(obj.getComponentRef());
					portRef1.setRefPort(obj.getPortRef());
					portRef1.setLeft(obj.getLeft());
					portRef1.setRight(obj.getRight());
					adhoc1.getInternalPortRef().add(portRef1);
				}
				
				adhoc1.setName(object.getName()); // Munish 18.08.15
				adHocConnections.add(adhoc1);
			}
		}
			
		
		System.out.println("\nDesign Graph generation COMPLETED: " + designFile + " ..." + "\nDesign Summary: ");
		System.out.println("AdHocConenctions: ");
		
		for (Iterator<AdHocConnection> i = adHocConnections.iterator(); i.hasNext();) {
			AdHocConnection object = (AdHocConnection) i.next();
			System.out.println("	AdHocConnection: ");
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef obj = j.next();
				System.out.print("		" + obj.getRefComponent() +"::" +obj.getRefPort());
			}
			System.out.println();
		}
		
		for (Iterator<CompAbstraction> j = desComponents.iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			List<PortCompPair> pairs = object.getPortToRefComponentPair();
			if (object.getIS_BUS()) {
				System.out.printf("%-25s %-12s %-15s %-5d %-20s", "Bus Instance Name:", object.getInstanceName(), "BusId: ", object.getCompId(), "RefComp-CompPort: ");
				for (Iterator<PortCompPair> k = pairs.iterator(); k.hasNext();) {
					PortCompPair obj = (PortCompPair) k.next();
					System.out.print(obj.getRefComp().getInstanceName() + "-" + obj.getPort() + " ,");
				}
				//System.out.printf("%10s %12s\n", "LibRef: ", object.getLibRefComponent().toString()); Munish Modified
				System.out.printf("%10s %12s\n", "LibRef: ", object.getLibAbsRef().getInstanceName());
			} else {
				if (object.getPortToRefComponentPair().size() > 0) {
					System.out.printf("%-25s %-12s %-15s %-5d %-10s %-12s %-10s %-12s %-10s %s \n", "Peripheral Instance Name:", object.getInstanceName(), "PeriId: ", object.getCompId(),
							" RefComp: ", object.getPortToRefComponentPair().get(0).getRefComp().getInstanceName(), " CompPort: ", object
//									.getPortToRefComponentPair().get(0).getPort(), "LibRef: ", object.getLibRefComponent().toString()); Munish Modified
					.getPortToRefComponentPair().get(0).getPort(), "LibRef: ", object.getLibAbsRef().getInstanceName());

				}
			}
		}
	} // End Method genCompDesignGraph(String designFile)

	public void SetLibAbstractionReference() {
		System.out
				.println("## CAUTION: Library prepration must be COMPLETED SUCCESSFULLY before running DesignAbstractionImpl.SetLibAbstractionReference().");
		if (GlobalVars.LIBRARY.size() == 0) {
			System.err
					.println("Error: Library prepration must be COMPLETED SUCCESSFULLY before running this. Refer to Class: LibAbstractionGenerate.");
		}

		int cntDes = 0;
		int cntAbsLib = 0;
		int setAbsLib = 0;
		for (Iterator<CompAbstraction> i = desComponents.iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			String name = object.getLibRefComponent().getName(); 

			boolean hasLibrary = false;
			LibCompAbstraction absLib = new LibCompAbstractionImpl();
			cntAbsLib = 0;
			for (Iterator<LibCompAbstraction> j = GlobalVars.LIBRARY.iterator(); j.hasNext();) {
				LibCompAbstraction obj = (LibCompAbstraction) j.next();
				if (obj.getInstanceName().equals(name)) {
					hasLibrary = true;
					setAbsLib = cntAbsLib;
					absLib = obj;
				}
				++cntAbsLib;
			}
			if (hasLibrary) {
				desComponents.get(cntDes).setLibAbsRef(GlobalVars.LIBRARY.get(setAbsLib));
				System.out.println("Abstraction Library Reference for " + object.getInstanceName() + " is set to "
						+ absLib.getInstanceName());
			} else {
				System.err.println("ERROR: Abstract Library instance couldn't be found for " + object.getInstanceName());
			}
			++cntDes;
		}
	} // End Method SetLibAbstractionReference()

	// 
	// function returns the match for input pattern 'pattern' in the Architecture graph
	// 'strict' set to 'true' check the match for each port strictly. 
	// while 'strict' set to 'false' check for port containment.
	//
	public boolean MatchPattern(DesignAbstraction pattern, boolean strict) {

		
		boolean match = true;

		this.ResetMapped();

		int matchCnt = 0;
		int numMatch = 0;
		for (Iterator<CompAbstraction> i = pattern.getDesComponents().iterator(); i.hasNext();) {
			numMatch = 0;
			CompAbstraction object = (CompAbstraction) i.next();
			for (Iterator<CompAbstraction> j = this.getDesComponents().iterator(); j.hasNext();) {
				CompAbstraction obj = (CompAbstraction) j.next();
				if (obj.getMapped()==0) {
					if (obj.IsEquivalent(object, strict)) {
						++numMatch;
						System.out.println("Equivalence Check: Equivalent Component found: " + object.getInstanceName() + "=="
								+ obj.getInstanceName());
						if (strict) {
							obj.setMapped(1);
						} else {
							obj.setMapped(2);
						}
						++matchCnt;
						break;
					}
				}
			}
			if (numMatch > 1) {
				System.out.println("More than 1 Component match found for " + object.getInstanceName());
				return false;
			}
		}

		if (pattern.getDesComponents().size() == matchCnt) {
			match = true;
			System.out.println("Equivalence Check: Pattern match FOUND in the Top-Design");
		} else {
			match = false;
			System.out.println("Equivalence Check: Pattern match NOT FOUND in the Top-Design");
		}

		System.out.println("Equivalence Check: These Component matches were found in the Top-Design -");
		for (Iterator<CompAbstraction> j = this.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction obj = (CompAbstraction) j.next();
			if (obj.getMapped()>0) {
				System.out.println("	" + obj.getInstanceName() + " Mapped: " + obj.getMapped());
			}
		}
		// this.ResetMapped(); Munish commented 06.01.15

		return match;
	} // End Method - MatchPattern()

	public void ResetMapped() {
		for (Iterator<CompAbstraction> i = this.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			object.setMapped(0);
		}
		System.out.println("ResetMapped() Completed.");
	}

	public void UniquifyInstanceNames() {

		int noComps = this.getDesComponents().size();
		int cnt = 0;
		int suff = 0;
		boolean changeName = false;
		String nname = "";

		for (int n = 0; n < noComps - 1; n++) {
			cnt = 0;
			changeName = false;
			List<String> instanceNames = new ArrayList<String>();

			for (Iterator<CompAbstraction> i = this.getDesComponents().iterator(); i.hasNext();) {
				CompAbstraction object = (CompAbstraction) i.next();
				String name = object.getInstanceName();
				if (instanceNames.contains(name)) {
					nname = name;
					while (instanceNames.contains(nname)) {
						nname = name.concat("_" + suff);
						suff++;
						changeName = true;
					}
					break;
				} else {
					instanceNames.add(object.getInstanceName());
					cnt++;
				}
			}
			if (changeName) {
				this.getDesComponents().get(cnt).setInstanceName(nname);
			}
		}

	}
	

	// Only valid on static input designs.
	public void DesignDelineation() {

		int cnt = 0;
		int compCnt = 0;
		int pinCnt = 0;
		CompAbstraction comp = new CompAbstractionImpl();

		String portName = "";
		String rportName = "";

		for (Iterator<CompAbstraction> i = this.getDesComponents().iterator(); i.hasNext();) {
			List<PortCompPair> plist = new ArrayList<PortCompPair>();
			CompAbstraction object = (CompAbstraction) i.next();

			for (Iterator<PortCompPair> j = object.getPortToRefComponentPair().iterator(); j.hasNext();) {
				PortCompPair obj = (PortCompPair) j.next();
				portName = obj.getPort();
				rportName = obj.getRefPort();
				for (Iterator<CompAbstraction> k = this.getDesComponents().iterator(); k.hasNext();) {
					CompAbstraction ob = (CompAbstraction) k.next();
					if (ob.getInstanceName().equals(obj.getRefComp().getInstanceName())) {
						//comp = ob;
						PortCompPair pp = new PortCompPair(portName,rportName, ob);
						plist.add(pp);
					}
				}
				++pinCnt;
			}
			++compCnt;
			object.setPortToRefComponentPair(plist);
			/*
			System.out.println("	After resetting PortToCompPair ");
			for (Iterator<PortCompPair> j = object.getPortToRefComponentPair().iterator(); j.hasNext();) {
				PortCompPair obj = (PortCompPair) j.next();
				System.out.println("		" + object.getInstanceName() + " " + obj.getPort() + " " + obj.getRefComp().getInstanceName());
			}
			*/
		}
	}


	//
	// Munish added: 26.12
	//
	public void RefineAdHocConnections() {
		System.out.println("Design Abstraction: Calling function- RefineAdHocConnections()" );
		
		String listConnectedPins = "";
		String checkPin = "";
		int count = 0;
		int chkCnt = 0;
		int limit = this.getAdHocConnections().size();
		//int limit = 20;
		int l = 0;
		boolean pinConnected = false;
		
		for (l = 0; l < limit; l++) {
			listConnectedPins = "";
			checkPin = "";
			count = 0;
			chkCnt = 0;
			pinConnected = false;
			System.out.println("Design Abstraction: AdHocConnection clean-up Iteration .... " + l);
			
			for (Iterator<AdHocConnection> i = this.getAdHocConnections().iterator(); i.hasNext();) {
				AdHocConnection object = i.next();
				for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
					InternalPortRef intport = j.next();
					checkPin = " " + intport.getRefComponent() + "/" + intport.getRefPort() + "/" + intport.getLeft() + "-" + intport.getRight() + " ";
					if (!listConnectedPins.contains(checkPin)) {
						listConnectedPins = listConnectedPins + " " + checkPin + " ";	
					} else {
						System.out.println("Design Abstraction: Matching adHocConnection found, Pin: " + checkPin + " NET: " + object.getName() + " " + count);
						chkCnt = count;
					}
				}
				count++;
			}
			
			count = 0;
			int chk2Cnt = 0;
			String cPin = "";
			for (Iterator<InternalPortRef> j = this.getAdHocConnections().get(chkCnt).getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef intport = j.next();
				checkPin = " " + intport.getRefComponent() + "/" + intport.getRefPort() + "/" + intport.getLeft() + "-" + intport.getRight() + " ";
				for (Iterator<AdHocConnection> i = this.getAdHocConnections().iterator(); i.hasNext();) {
					AdHocConnection object = i.next();
					listConnectedPins = "";
					for (Iterator<InternalPortRef> jj = object.getInternalPortRef().iterator(); jj.hasNext();) {
						InternalPortRef iport = jj.next();
						cPin = " " + iport.getRefComponent() + "/" + iport.getRefPort() + "/" + iport.getLeft() + "-" + iport.getRight() + " ";
						listConnectedPins = listConnectedPins + " " + cPin + " ";	
					}
					if (listConnectedPins.contains(checkPin) && count !=chkCnt) {
						chk2Cnt = count;
					//	System.out.println("HERE INSIDE: " + checkPin + " " + chkCnt + " " + chk2Cnt);
					}
					count++;
				}
				count = 0;
			}
			
			if (chkCnt!=0) {
				//System.out.println("HERE int size: " + this.getAdHocConnections().get(chk2Cnt).getInternalPortRef().size());
				listConnectedPins = "";
				for (Iterator<InternalPortRef> j = this.getAdHocConnections().get(chk2Cnt).getInternalPortRef().iterator(); j.hasNext();) {
					InternalPortRef intport = j.next();
					checkPin = " " + intport.getRefComponent() + "/" + intport.getRefPort() + "/" + intport.getLeft() + "-" + intport.getRight() + " ";
					listConnectedPins = listConnectedPins + " " + checkPin + " ";	
				}
				
				for (Iterator<InternalPortRef> j = this.getAdHocConnections().get(chkCnt).getInternalPortRef().iterator(); j.hasNext();) {
					InternalPortRef iport = j.next();
					checkPin = " " + iport.getRefComponent() + "/" + iport.getRefPort() + "/" + iport.getLeft() + "-" + iport.getRight() + " ";
					if (!listConnectedPins.contains(checkPin)) {
						this.getAdHocConnections().get(chk2Cnt).addInternalPortRef(iport);
						//System.out.println("HERE ADDING PIN:" + checkPin);
					}
				}
	//			System.out.println("HERE int size: " + this.getAdHocConnections().get(chk2Cnt).getInternalPortRef().size());
	//			System.out.println("HERE adHoc size: " + this.getAdHocConnections().size());
				this.getAdHocConnections().remove(chkCnt);
	//			System.out.println("HERE adHoc size: " + this.getAdHocConnections().size());
			}
		
		}
		
		
//		
//		for (Iterator<AdHocConnection> i = this.getAdHocConnections().iterator(); i.hasNext();) {
//			AdHocConnection object = i.next();
//			
//		}
		
	} // RefineAdHocConnections() finishes here
	
	
	public void SetAdHocConnectionNames() {
		System.out.println("Design Abstraction: Calling function- SetAdHocConnectionNames()" );
		String name = "";
		
		PortCompPair portpair = new PortCompPair();
		Cloner cloner = new Cloner();
		
				
		// Munish added: 16.12.2014
		// Resets PinToRefComponentPair
		int size = 0;
		for (Iterator<CompAbstraction> k = this.getDesComponents().iterator(); k.hasNext();) {
			CompAbstraction obj = k.next();
			size = obj.getPinToRefComponentPair().size();
			int j = 0;
			for (j = size -1; j >= 0 ; j--) {
				obj.getPinToRefComponentPair().remove(j);
			}
		}
			
		// Creating AdHocconnections tag for IPXACT
		boolean checkin = false;
		for (Iterator<AdHocConnection> i = this.getAdHocConnections().iterator(); i.hasNext();) {
			AdHocConnection object = i.next();
			/* Munish commented 06.01.15
			name = object.getInternalPortRef().get(0).getRefComponent()  + "_" +
					object.getInternalPortRef().get(0).getRefPort(); 
			*/ 
			
			// Munish check 06.01.15
			checkin = false;
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef intport = j.next();
				for (Iterator<CompAbstraction> k = this.getDesComponents().iterator(); k.hasNext();) {
					CompAbstraction obj = k.next();
					for (Iterator<ConnectedPort> l = obj.getAllPins().iterator(); l.hasNext();) {
						ConnectedPort o = l.next();
						if (obj.getInstanceName().equals(intport.getRefComponent()) && o.getPort().equals(intport.getRefPort()) && o.getDirection().contains("out")) {
							name = intport.getRefComponent() + "_" + intport.getRefPort();
							System.out.println ("Design Abstration: Output port found, setting Net name to: " + name);
							checkin = true;
						}
					}
				}
			}
					
			if (!checkin) {
				name = object.getInternalPortRef().get(0).getRefComponent()  + "_" +
						object.getInternalPortRef().get(0).getRefPort();
				System.out.println ("Design Abstration: Output port not found, setting Net name to: " + name);
			}
			// Munish check finish 06.01.15
			
			// Munish Commented ::: Checkpoint if error occurs
//					+ "_" + "TO" + "_" +
//					object.getInternalPortRef().get(1).getRefComponent()  + "_" +
//					object.getInternalPortRef().get(1).getRefPort();
//					
			// Added on 18.08.15 -- Munish 
			// To set proper net_gnd and net_vdd names
			//
			if (object.getName().equals("net_gnd")) {
				System.out.println ("Design Abstration: net_gnd"
						+ " conflict resolved, setting Net name from NET: " + name + " to: net_gnd");
				name = "net_gnd";
			}
			if (object.getName().equals("net_vcc")) {
				System.out.println ("Design Abstration: net_vcc conflict resolved, setting Net name from NET: " + name + " to: net_vcc");
				name = "net_vcc";
			}
			
			object.setName(name);
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef intport = j.next();
				
				for (Iterator<CompAbstraction> k = this.getDesComponents().iterator(); k.hasNext();) {
					CompAbstraction obj = k.next();
					//
					// Munish :: redundant loop to check if Ports are declared in the Module definition
					//
					for (Iterator<ConnectedPort> l = obj.getAllPins().iterator(); l.hasNext();) {
						ConnectedPort o = l.next();
						if (obj.getInstanceName().equals(intport.getRefComponent()) && o.getPort().equals(intport.getRefPort())) {
							PortCompPair portpair1 = cloner.deepClone(portpair);
							portpair1.setName(name);
							portpair1.setPort(o.getPort());
							obj.getPinToRefComponentPair().add(portpair1);
							o.setIsConnected(true);
							System.out.println("Design Abstraction: Setting the AdHocConnection name to " + obj.getInstanceName() + 
									" " + portpair1.getPort() + " " + name);
						}						
					}
				}
				
				for (Iterator <ConnectedPort> k = this.getAllPins().iterator(); k.hasNext();) {
					ConnectedPort o = k.next();
					if (intport.getRefComponent().equals("") && o.getPort().equals(intport.getRefPort())) {
	//					PortCompPair portpair1 = cloner.deepClone(portpair);
	//					portpair1.setName(name);
	//					portpair1.setPort(o.getPort());
	//					this.getPinToRefComponentPair().add(portpair1);
						o.setIsConnected(true);
						o.setName(name);
						System.out.println("Design Abstraction: Setting the AdHocConnection name to System "  + 
								" " + o.getPort() + " " + name);
					}
				}
			}
		}
	} // Function SetAdHocConnectionNames() end here

	public void SetInterconnectionNames() {
		System.out.println("Design Abstraction: Calling function- SetInterconnectionNames()" );
		
		for (Iterator<CompAbstraction> i = this.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction Object = (CompAbstraction) i.next();
			List<PortCompPair> connections = Object.getPortToRefComponentPair();
			List<ConnectedPort> masters = Object.getMasterPorts();
			List<ConnectedPort> mirSlaves = Object.getMirSlavePorts();
			List<ConnectedPort> mirMasters = Object.getMirMasterPorts();
			List<ConnectedPort> slaves = Object.getSlavePorts();
			String name = "";

			if (masters.size() > 0) {
				for (Iterator<ConnectedPort> j = masters.iterator(); j.hasNext();) {
					ConnectedPort Obj = (ConnectedPort) j.next();					
					for (Iterator<PortCompPair> k = connections.iterator(); k.hasNext();) {
						PortCompPair O = (PortCompPair) k.next();
						if (Obj.getPort().equals(O.getPort())) {					
							name = Object.getInstanceName();
							name += "_";
							name += O.getPort();
							name += "_";
							name += "_To_";
							name += "_";
							name += O.getRefComp().getInstanceName();
							name += "_";
							name += O.getRefPort();
							O.setName(name);
							System.out.println("Design Abstraction: Setting Interconnection name to " + Object.getInstanceName() + " " + name);
						}
					}
				}
			}
			

			if (mirSlaves.size() > 0) {
				for (Iterator<ConnectedPort> j = mirSlaves.iterator(); j.hasNext();) {
					ConnectedPort Obj = (ConnectedPort) j.next();					
					for (Iterator<PortCompPair> k = connections.iterator(); k.hasNext();) {
						PortCompPair O = (PortCompPair) k.next();
						if (Obj.getPort().equals(O.getPort())) {					
							name = Object.getInstanceName();
							name += "_";
							name += O.getPort();
							name += "_";
							name += "_To_";
							name += "_";
							name += O.getRefComp().getInstanceName();
							name += "_";
							name += O.getRefPort();
							O.setName(name);
							System.out.println("Design Abstraction: Setting Interconnection name to " + Object.getInstanceName() + " " + name);
						}
					}
				}
			}
			
			if (mirMasters.size() > 0) {
				for (Iterator<ConnectedPort> j = mirMasters.iterator(); j.hasNext();) {
					ConnectedPort Obj = (ConnectedPort) j.next();					
					for (Iterator<PortCompPair> k = connections.iterator(); k.hasNext();) {
						PortCompPair O = (PortCompPair) k.next();
						if (Obj.getPort().equals(O.getPort())) {					
							name = O.getRefComp().getInstanceName();
							name += "_";
							name += O.getRefPort();
							name += "_";
							name += "_To_";
							name += "_";
							name += Object.getInstanceName();
							name += "_";
							name += O.getPort();							
							O.setName(name);
							System.out.println("Design Abstraction: Setting Interconnection name to " + Object.getInstanceName() + " " + name);
						}
					}
				}
			}
			
			if (slaves.size() > 0) {
				for (Iterator<ConnectedPort> j = slaves.iterator(); j.hasNext();) {
					ConnectedPort Obj = (ConnectedPort) j.next();					
					for (Iterator<PortCompPair> k = connections.iterator(); k.hasNext();) {
						PortCompPair O = (PortCompPair) k.next();
						if (Obj.getPort().equals(O.getPort())) {					
							name = O.getRefComp().getInstanceName();
							name += "_";
							name += O.getRefPort();
							name += "_";
							name += "_To_";
							name += "_";
							name += Object.getInstanceName();
							name += "_";
							name += O.getPort();							
							O.setName(name);
							System.out.println("Design Abstraction: Setting Interconnection name to " + Object.getInstanceName() + " " + name);
						}
					}
				}
			}
			
		} // interconnections tag ends here

		
	} // Function SetInterconnectionNames() end here
	
	
	public void PrintDesignSummary() {
		
		boolean PARAMETER = false;
		boolean PINS = false;
		boolean ADHOC = false;
		
		System.out.println();
		System.out.println("PrintDesignSummary for the Design: " + this.design.getName() );
		System.out.println("				" + "Parameters: ");
		for (Iterator<Parameter> j = this.getParameters().iterator(); j.hasNext();) {
			Parameter obj = (Parameter) j.next();
			System.out.println("					" + obj.getParameter() + ": " + obj.getValue() + "||");
		}
		System.out.println("				" + "Pins: ");
		for (Iterator<ConnectedPort> j = this.getAllPins().iterator(); j.hasNext();) {
			ConnectedPort obj = (ConnectedPort) j.next();
			System.out.println("					" + obj.getPort() + ": " + obj.isConnected());
		}
		
		System.out.println( "Components-");
		for (Iterator<CompAbstraction> i = this.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			System.out.println("\n	" + object.getInstanceName());
			for (Iterator<PortCompPair> j = object.getPortToRefComponentPair().iterator(); j.hasNext();) {
				PortCompPair obj = (PortCompPair) j.next();
				System.out.println("		" + obj.getPort() + "	" + obj.getRefComp().getInstanceName());
			}
			if (PARAMETER) {
				System.out.println("				" + "Parameters: ");
				for (Iterator<Parameter> j = object.getParameters().iterator(); j.hasNext();) {
					Parameter obj = (Parameter) j.next();
					System.out.println("					" + obj.getParameter() + ": " + obj.getValue() + "||");
				}
			} else {
				System.out.println("\n		!!!Parameters SKIPPED (Set 'PARAMETER' flag in PrintDesignSummary() to print parameters)");
			}
				
			if (PINS) {
				System.out.println("				" + "Pins: ");
				for (Iterator<ConnectedPort> j = object.getAllPins().iterator(); j.hasNext();) {
					ConnectedPort obj = (ConnectedPort) j.next();
					System.out.println("					" + obj.getPort() + ": " + obj.isConnected());
				}
			} else {
				System.out.println("		!!!Pins SKIPPED (Set 'PINS' flag in PrintDesignSummary() to print pins)");
			}
		}
		
		if (ADHOC) {
			System.out.println( "	AdHocConnections:");
			for (Iterator <AdHocConnection> i = this.getAdHocConnections().iterator(); i.hasNext();) {
				AdHocConnection obj = i.next();
				System.out.println("		NetName:" + obj.getName());
				for (Iterator <InternalPortRef> j = obj.getInternalPortRef().iterator(); j.hasNext();) {
					InternalPortRef o = j.next();
					System.out.println("			Comp: " + o.getRefComponent() + " 		Pin: " + o.getRefPort());
				}
			}
		} else {
			System.out.println("\n	!!!AdHoc SKIPPED (Set 'ADHOC' flag in PrintDesignSummary() to print AdHoc)");
		}
	}
	
	public DesignAbstractionImpl() {
		super();
	}
}
