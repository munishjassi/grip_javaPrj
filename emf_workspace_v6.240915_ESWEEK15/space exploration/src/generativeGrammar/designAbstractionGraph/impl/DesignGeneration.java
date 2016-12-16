package generativeGrammar.designAbstractionGraph.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentPortDirectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentType;
import org.spiritconsortium.xml.schema.spirit.spirit.DefaultValueType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.DriverType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.Interface;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.LeftType2;
import org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.ModelType;
import org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1;
import org.spiritconsortium.xml.schema.spirit.spirit.PortType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortWireType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortsType1;
import org.spiritconsortium.xml.schema.spirit.spirit.RightType2;
import org.spiritconsortium.xml.schema.spirit.spirit.ValueType2;
import org.spiritconsortium.xml.schema.spirit.spirit.VectorType2;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.ComponentTypeImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.DefaultValueTypeImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.DriverTypeImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.LeftType2Impl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.NameValuePairTypeImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.PortTypeImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.PortWireTypeImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.PortsType1Impl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.RightType2Impl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.ValueType2Impl;
import org.spiritconsortium.xml.schema.spirit.spirit.impl.VectorType2Impl;
import org.spiritconsortium.xml.schema.spirit.spirit.util._1ResourceFactoryImpl;

import com.rits.cloning.Cloner;

import generativeGrammar.designAbstractionGraph.CompAbstraction;
import generativeGrammar.designAbstractionGraph.DesignAbstraction;
import generativeGrammar.designAbstractionGraph.GlobalVars;
import generativeGrammar.designAbstractionGraph.LibCompAbstraction;
import generativeGrammar.utils.AdHocConnection;
import generativeGrammar.utils.ConnectedPort;
import generativeGrammar.utils.GenerativRulePair;
import generativeGrammar.utils.InternalPortRef;
import generativeGrammar.utils.Parameter;
import generativeGrammar.utils.PortCompPair;

public class DesignGeneration {

	// Note: seedDesign and rule are assumed as STATIC input linked to
	// GlobalVars
	// seedDesign is locally deep cloned.
	// Returns new design
	//
	
	
	public DesignAbstraction GenerateNewDesign(DesignAbstraction seedDesign, GenerativRulePair rule) {

		System.out.println("Design Generation: STARTING GENERATION OF NEW DESIGN BY USING GERERATIVE RULES....");
		Cloner cloner = new Cloner();
		DesignAbstraction finalDesign = cloner.deepClone(seedDesign);

		DesignAbstraction rulePat = rule.getGenerativPattern();
		DesignAbstraction replacementPat = rule.getReplacementPattern();
		//List<CompAbstraction> toRemoveComps = new ArrayList<CompAbstraction>();
		//List<CompAbstraction> toAddComps = new ArrayList<CompAbstraction>();
		
		//if (!seedDesign.MatchPattern(rulePat, false)) { //06.01.15
		if (!finalDesign.MatchPattern(rulePat, false)) { //06.01.15
			System.out.printf("Design Generation: Given rule-pattern was NOT FOUND in the Seed Design. \n");
			return null;
		} else {
			System.out.printf("Design Generation: Given rule-pattern was FOUND in the Seed Design. \n");
		}
		
		//
		// Report startPat and replacementPat
		// before GRIP rule reduction
		//
		System.out.printf("RULE REDUCTION: Rule reduction Start");
		rulePat.PrintDesignSummary();
		replacementPat.PrintDesignSummary();
		
		//
		// Reduction of GRIP RULE
		// Reducing the "rule" to the reduced form
		// * Removes the context from LHS and RHS Pattern
		// * Copies the new Parameters to finalDesign from RHS pat
		// * Overrides the existing Parameters with the new values defined in RHS
		// * Copies new Pins to finalDesign from RHS pat
		// * Copies new AdHocConnections to finalDesign from RHS pat
		// * Renames the component instance names both for LHS and RHS pat in match to finalDesign components
		// 
		GenerativRulePair reducedRule = this.ReduceRule(finalDesign, rule);

		//
		// Report startPat and replacementPat for "reducedRule"
		// after GRIP rule reduction
		//
		System.out.printf("RULE REDUCTION: Rule reduction Finished");
		reducedRule.getGenerativPattern().PrintDesignSummary();
		reducedRule.getReplacementPattern().PrintDesignSummary();
		
		List<String> desComps = new ArrayList<String>();
		for (Iterator<CompAbstraction> i = finalDesign.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction obj = i.next();
			desComps.add(obj.getInstanceName());
		}
		
		System.out.println("Design Generation: BEFORE APPLYING RULE...");
		finalDesign.PrintDesignSummary();
		
		//
		// Removing connections for the components from final design, 
		// defined by LHS pattern (generativPattern) of the reducedGenerativRule
		//
		PortCompPair toremovePort = new PortCompPair(); 
		boolean toremove = false;
		for (Iterator<CompAbstraction> i = reducedRule.getGenerativPattern().getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
		//	if (!object.getIS_BUS()) {
		//		toRemoveComps.add(object);
			for (Iterator<CompAbstraction> j = finalDesign.getDesComponents().iterator(); j.hasNext();) {
				CompAbstraction obj = (CompAbstraction) j.next();
				if (obj.getInstanceName().equals(object.getInstanceName())) {
					for (Iterator<PortCompPair> l = object.getPortToRefComponentPair().iterator();l.hasNext();) {
						PortCompPair oo = (PortCompPair) l.next();
						toremove = false;
						for (Iterator<PortCompPair> m = obj.getPortToRefComponentPair().iterator();m.hasNext();) {
							PortCompPair o = (PortCompPair) m.next();
							if (oo.getRefComp().getInstanceName().equals(o.getRefComp().getInstanceName())) {
								//System.out.println("Design Generation: Removed Component connection from the Final Design : "
								//		+ " " + obj.getInstanceName() + " Port:" + o.getPort() );
								//obj.getPortToRefComponentPair().remove(o);
								toremovePort = o;
								toremove = true;
							}
						}
						if (toremove) {
							System.out.println("Design Generation: Removed Component connection from the Final Design : "
									+ " " + obj.getInstanceName() + " Port:" + toremovePort.getPort() );
							obj.getPortToRefComponentPair().remove(toremovePort);	
						}
					}
				}
			}
		}
		//finalDesign = this.RemoveComponent(finalDesign, object);
		//	System.out.println("Design Generation: Removed Component from Final Design : " + object.getInstanceName());
		//	}
		
		
		// Adding required Buses to the final design, defined by GenerativRule
//		for (Iterator<CompAbstraction> i = reducedRule.getReplacementPattern().getDesComponents().iterator(); i.hasNext();) {
//			CompAbstraction object = (CompAbstraction) i.next();
//			if (object.getIS_BUS()) {
//				boolean busExist = false;
//				//toAddComps.add(object);
//				for (Iterator<CompAbstraction> j = reducedRule.getGenerativPattern().getDesComponents().iterator(); j.hasNext();) {
//					CompAbstraction obj = (CompAbstraction) j.next();
//					if (obj.getInstanceName() == object.getInstanceName()) {
//						busExist = true;
//					}
//				}			
//				
//				if (!busExist) {
//					finalDesign = this.AddBusComponent(finalDesign, object);
//					System.out.println("Design Generation: ADDED Bus Component to Final Design : " + object.getInstanceName());
//				}
//			}
//		}

		//
		// Adding connections for the components to the final design, 
		// defined by RHS pattern (replacementPattern) of the reducedGenerativRule
		//
		String type;
		String uport;
		String bustype;
		for (Iterator<CompAbstraction> i = reducedRule.getReplacementPattern().getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			if (desComps.contains(object.getInstanceName())) {
					for (Iterator<CompAbstraction> j = finalDesign.getDesComponents().iterator(); j.hasNext();) {
						CompAbstraction obj = (CompAbstraction) j.next();
						obj.resetPortConnections();
						if (obj.getInstanceName().equals(object.getInstanceName())) {
							for (Iterator<PortCompPair> l = object.getPortToRefComponentPair().iterator();l.hasNext();) {
								PortCompPair oo = (PortCompPair) l.next();									
								if (obj.getConnectedPorts().contains(oo.getPort())) {
									type = obj.getPortType(oo.getPort());
									bustype = obj.getBusType(oo.getPort());
									try{
										uport = obj.getUnconnectedPorts(type, bustype).get(0);
										} 
									catch (Exception e) {
										System.err.println("ERROR: No available unconnected port: " + obj.getInstanceName() + " Type:" + type + " BusType:" + bustype);
										uport = null;
										System.exit(0);
									}
									
									
									for (Iterator<PortCompPair> k = oo.getRefComp().getPortToRefComponentPair().iterator();k.hasNext();) {
										PortCompPair pp = k.next();
										if (pp.getRefPort().equals(oo.getPort()) 
												&& pp.getRefComp().getInstanceName().equals(obj.getInstanceName())) {
											pp.setRefPort(uport);
											System.out.println("Design generation: Port name clash found, Changed port connection for " 
														+ obj.getInstanceName() + " " + oo.getPort() + ". " + "Changed to " +
													uport);
										}
									}
									oo.setPort(uport);
								}
								
								obj.getPortToRefComponentPair().add(oo);
								System.out.println("Design Generation: Added Component connection to Final Design : "
											+ " " + obj.getInstanceName() + " Port:" + oo.getPort() + " RefPort:" + oo.getRefPort() + 
											" RefComp:" + oo.getRefComp().getInstanceName());
							}
//							for (Iterator<Parameter> ii = object.getParameters().iterator(); ii.hasNext();) {
//								Parameter para = (Parameter) ii.next(); 
//								obj.getParameters().add(para);
//							}
//							
//							for (Iterator<ConnectedPort> ii = object.getAllPins().iterator(); ii.hasNext();) {
//								ConnectedPort port = (ConnectedPort) ii.next();
//								obj.getAllPins().add(port);
//							}
						}
					}
				} else {
				//
				// Adding required Peripheral components to the final design, defined by GenerativRule
				//
				System.out.println("Design Generation: Adding Peripheral component to Final Design : " + object.getInstanceName());
				finalDesign.getDesComponents().add(object);
				System.out.println("Design Generation: ADDED Peripheral component to Final Design : " + object.getInstanceName());
			}
		}
		
		
		//
		// Adding AdHocConnections to the finalDesign from RHS pat
		//	* All but CPU interrupt connections
		//
		int cnt = 0;
		for (Iterator<AdHocConnection> i = reducedRule.getReplacementPattern().getAdHocConnections().iterator(); i.hasNext();) {
			AdHocConnection object = i.next();
			String listirq = "";
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef obj = j.next();
				listirq = listirq + obj.getRefComponent() + "/" + obj.getRefPort() + " ";
			}
			if (listirq.contains("processing_system") && listirq.contains("IRQ_F2P")) {
				cnt++;
			} else {
				finalDesign.getAdHocConnections().add(object);	
			}
		}
		
		//
		// Adding AdHocConnections for CPU interrupt: IRQ_F2P
		// WARNING: Specific to ZedBoard (processing_system7_0)
		// * Reconnecting Left-Right bit of IRQ_F2P in the priority order of new RHS interrupts
		//
		
		// Find the Right most bit for already connected IRQ_F2P
		BigInteger minRight = BigInteger.valueOf(15);
		for (Iterator<AdHocConnection> i = finalDesign.getAdHocConnections().iterator(); i.hasNext();) {
			AdHocConnection object = i.next();
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef obj = j.next();
				if (obj.getRefComponent().contains("processing_system") && obj.getRefPort().equals("IRQ_F2P")) {
					if (minRight.compareTo(obj.getRight()) == 1) {
						minRight = obj.getRight();
						//System.out.println(" HERE minRight : " + object.getName() + " " + minRight);
					}
				}
			}
		}

		// Find the number of new interrupts to be connected from RHS pat
		int rnd;
		String name = "";
		String listname = "";
		for (rnd = 1 ; rnd <= cnt; rnd++) {
			int cntCk = 0;
			name = "";
			for (Iterator<AdHocConnection> i = reducedRule.getReplacementPattern().getAdHocConnections().iterator(); i.hasNext();) {
				AdHocConnection object = i.next();
				for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
					InternalPortRef obj = j.next();
					if (obj.getRefComponent().contains("processing_system") && obj.getRefPort().equals("IRQ_F2P") 
							&& obj.getRight().intValue()>= cntCk 
								&& !listname.contains(object.getName())) {
						cntCk = obj.getRight().intValue();
						name = object.getName();
					}
				}
			}
			listname = listname + " " + name;

			//
			// * Change the connectivity of IRQ_F2P connections on RHS pat in accordance with minRight for RHS pat 
			// * Add modified interrupt IRQ_F2P adHoCConnection to finalDesign
			//
			for (Iterator<AdHocConnection> i = reducedRule.getReplacementPattern().getAdHocConnections().iterator(); i.hasNext();) {
				AdHocConnection object = i.next();
				if (object.getName().equals(name)) {
					for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
						InternalPortRef obj = j.next();
						if (obj.getRefComponent().contains("processing_system") && obj.getRefPort().equals("IRQ_F2P")){
							System.out.println("Design Generation: Changing IRQ_F2P connection Left: " + obj.getLeft() + "->" 
														+ minRight.subtract(BigInteger.valueOf(rnd)) + " Right: " + obj.getRight() + "->" 
														+ minRight.subtract(BigInteger.valueOf(rnd)) + " Net: " + object.getName() );
							obj.setRight(minRight.subtract(BigInteger.valueOf(rnd)));
							obj.setLeft(minRight.subtract(BigInteger.valueOf(rnd)));
							if (obj.getRight().intValue() < 0) {
								System.err.println("ERROR: Design Generation: Not sufficient Interrupt ports available");
								System.exit(0);
							}
						}
					}
					finalDesign.getAdHocConnections().add(object);
				}
			}
		} // ends rnd

		
		/*
		String listConnectedPins = "";
		String listConnectedPinsa = "";
		String checkPin = "";
		boolean pinConnected = false;
		for (Iterator<AdHocConnection> i = finalDesign.getAdHocConnections().iterator(); i.hasNext();) {
			AdHocConnection object = i.next();
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef intport = j.next();
				listConnectedPinsa = listConnectedPinsa + " " + intport.getRefComponent() + "/" + intport.getRefPort();
			}
		}

		
		for (Iterator<AdHocConnection> i = reducedRule.getReplacementPattern().getAdHocConnections().iterator(); i.hasNext();) {
			AdHocConnection object = i.next();
			pinConnected = false;
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef intport = j.next();
				checkPin = intport.getRefComponent() + "/" + intport.getRefPort();
				if (listConnectedPinsa.contains(checkPin)) {
					pinConnected = true;
					System.out.println("Design Generation: Already existing adHocConnection found for Pin: " + checkPin);
				}
			}
			
			if (!pinConnected) {
				finalDesign.getAdHocConnections().add(object);
			} else {
				for (Iterator<AdHocConnection> ii = finalDesign.getAdHocConnections().iterator(); ii.hasNext();) {
					AdHocConnection obj = ii.next();
					listConnectedPins = "";
					for (Iterator<InternalPortRef> j = obj.getInternalPortRef().iterator(); j.hasNext();) {
						InternalPortRef intport = j.next();
						listConnectedPins = listConnectedPins + " " + intport.getRefComponent() + "/" + intport.getRefPort();
					}
					System.out.println("HERE: " + listConnectedPins);
					pinConnected = false;
					for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
						InternalPortRef intport = j.next();
						checkPin = intport.getRefComponent() + "/" + intport.getRefPort();
						if (listConnectedPins.contains(checkPin)) {
							pinConnected = true;
						}
					}
					
					if (pinConnected) {
						for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
							InternalPortRef intport = j.next();
							obj.addInternalPortRef(intport);
							System.out.println("Design Generation: Merged adHocConnection found for Pin: " + intport.getRefComponent() + "/" + intport.getRefPort() + 
									"\n \t with existing adHocConnection: " + obj.getName());
						}
					}
				}
			}
		}
			
		*/
		
		finalDesign.SetAdHocConnectionNames();
		finalDesign.SetInterconnectionNames();
		
		// 26.12
		finalDesign.RefineAdHocConnections();
		finalDesign.SetAdHocConnectionNames();
		
		System.out.println("Design Generation: GRIP RULE APPLYING FINISHED...");
		finalDesign.PrintDesignSummary();
		return finalDesign;
		
	} // End Method GenerateNewDesign(DesignAbstraction seedDesign,
		// GenerativRulePair rule)


	public void GenerateMHS (String outMHS, DesignAbstraction newDesAbs) throws IOException {
		System.out.println();
		System.out.println("Calling Function: DesignGeneration.GenerateMHS(outMHS, newDesAbs)");
		PrintWriter writer = new PrintWriter(outMHS, "UTF-8");
		
		//
		// Generating MHS PARAMETER for top-level
		//
		writer.println("");
		for (Iterator<Parameter> j = newDesAbs.getParameters().iterator(); j.hasNext();) {
			Parameter obj = (Parameter) j.next();
			writer.println(" PARAMETER " + obj.getParameter() + " = " + obj.getValue());
		}
		writer.println("");
		writer.println("");
		String dir = "";

		//
		// Generating MHS PORT for top-level
		//		
		for (Iterator<ConnectedPort> j = newDesAbs.getAllPins().iterator(); j.hasNext();) {
			ConnectedPort obj = (ConnectedPort) j.next();
			if (obj.getDirection().equals("out")) {dir = "O";}
			if (obj.getDirection().equals("in")) {dir = "I";}
			if (obj.getDirection().equals("inout")) {dir = "IO";}
			
			if (obj.getLeft().toString().equals("0")) {
			writer.print(" PORT " + obj.getPort() + " = " + obj.getName() + 
					", DIR = " + dir);
			} else {
				writer.print(" PORT " + obj.getPort() + " = " + obj.getName() + 
						", DIR = " + dir + ", VEC = [" + obj.getLeft().toString() + ":" + obj.getRight().toString() + "]" );	
			}
			
			if (obj.getDriver()!=null && obj.getDriver().length()>0) {
					writer.println(", SIGIS = " +  obj.getDriver());
			} else {
				writer.println();
			}
			
		}
		writer.println("");
		writer.println("");
		
		for (Iterator<CompAbstraction> i = newDesAbs.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			writer.println("BEGIN " + object.getLibAbsRef().getInstanceName());
			
			//
			// Generating MHS PARAMETER for Components
			//
			if (object.getInstanceName().equals("processing_system7_0")) {
				for (Iterator<Parameter> j = object.getParameters().iterator(); j.hasNext();) {
					Parameter obj = (Parameter) j.next();
					
					// Normal design configuration parameters (excluding C_INTERCONNECT_S_AXI_HP*, C_USE_S_AXI_HP*, C_USE_M_AXI_GP*)
					if (!(obj.getParameter().contains("C_INTERCONNECT_S_AXI_HP") || obj.getParameter().contains("C_USE_S_AXI_HP") 
							|| obj.getParameter().contains("C_USE_M_AXI_GP"))) {
						if (obj.getParameter().contains("INSTANCE")) {
							writer.println(" PARAMETER " + obj.getParameter() + " = " + object.getInstanceName());
						} else {
							writer.println(" PARAMETER " + obj.getParameter() + " = " + obj.getValue());	
						}
					}
					
					// Special dependent parameters C_INTERCONNECT_S_AXI_HP* (Design dependent parameter)
					if(obj.getParameter().contains("C_INTERCONNECT_S_AXI_HP")) {
						String port = "";
						String bus = "";
						String para = "";
						int first = 0;
						if (obj.getParameter().contains("0")) port = "S_AXI_HP0";
						if (obj.getParameter().contains("1")) port = "S_AXI_HP1";
						if (obj.getParameter().contains("2")) port = "S_AXI_HP2";
						if (obj.getParameter().contains("3")) port = "S_AXI_HP3";
						
						for (Iterator<PortCompPair> k = object.getPortToRefComponentPair().iterator(); k.hasNext();) {
							PortCompPair o = k.next();
							if (o.getPort().equals(port)) bus = o.getRefComp().getInstanceName();
						}
							
						for (Iterator<CompAbstraction> ii = newDesAbs.getDesComponents().iterator(); ii.hasNext();) {
							CompAbstraction oo = (CompAbstraction) ii.next();
							if (oo.getInstanceName().equals(bus)) {
								for (Iterator<PortCompPair> kk = oo.getPortToRefComponentPair().iterator(); kk.hasNext();) {
									PortCompPair ooo = kk.next();
									if (!ooo.getRefComp().getInstanceName().contains("processing_system7")) {
										if (first == 0) {
											para = ooo.getRefComp().getInstanceName() + "." + ooo.getRefPort();
											first ++;
										} else {
											para = para + " & " + ooo.getRefComp().getInstanceName() + "." + ooo.getRefPort();	
										}
									}
								}
							}
						}
						writer.println(" PARAMETER " + obj.getParameter() + " = " + para);
					}
				}
			
				// Special dependent parameters C_USE_S_AXI_HP* and C_USE_M_AXI_GP* (Design dependent parameter)
				String ports = "";
				for (Iterator<PortCompPair> k = object.getPortToRefComponentPair().iterator(); k.hasNext();) {
					PortCompPair o = k.next();
					ports = ports + " " + o.getPort();
				}
				if (ports.contains("S_AXI_HP0")) writer.println(" PARAMETER C_USE_S_AXI_HP0 = 1"); else  writer.println(" PARAMETER C_USE_S_AXI_HP0 = 0");  //System.out.println("HERE PP C_USE_S_AXI_HP0");
				if (ports.contains("S_AXI_HP1")) writer.println(" PARAMETER C_USE_S_AXI_HP1 = 1"); else  writer.println(" PARAMETER C_USE_S_AXI_HP1 = 0"); //System.out.println("HERE PP C_USE_S_AXI_HP1");
				if (ports.contains("S_AXI_HP2")) writer.println(" PARAMETER C_USE_S_AXI_HP2 = 1"); else  writer.println(" PARAMETER C_USE_S_AXI_HP2 = 0"); //System.out.println("HERE PP C_USE_S_AXI_HP2");
				if (ports.contains("S_AXI_HP3")) writer.println(" PARAMETER C_USE_S_AXI_HP3 = 1"); else  writer.println(" PARAMETER C_USE_S_AXI_HP3 = 0"); //System.out.println("HERE PP C_USE_S_AXI_HP3");
				if (ports.contains("M_AXI_GP0")) writer.println(" PARAMETER C_USE_M_AXI_GP0 = 1"); else  writer.println(" PARAMETER C_USE_M_AXI_GP0 = 0"); //System.out.println("HERE PP C_USE_M_AXI_GP0");
				if (ports.contains("M_AXI_GP1")) writer.println(" PARAMETER C_USE_M_AXI_GP1 = 1"); else  writer.println(" PARAMETER C_USE_M_AXI_GP1 = 0"); //System.out.println("HERE PP C_USE_M_AXI_GP1");
			} else {
				for (Iterator<Parameter> j = object.getParameters().iterator(); j.hasNext();) {
					Parameter obj = (Parameter) j.next();
					if (obj.getParameter().contains("INSTANCE")) {
						writer.println(" PARAMETER " + obj.getParameter() + " = " + object.getInstanceName());
					} else {
						writer.println(" PARAMETER " + obj.getParameter() + " = " + obj.getValue());	
					}
				}
			}
			
			//
			// Generating MHS BUS_INTERFACE for Components
			//
			if (!object.getIS_BUS()) {
				for (Iterator<PortCompPair> j = object.getPortToRefComponentPair().iterator(); j.hasNext();) {
					PortCompPair obj = (PortCompPair) j.next();
					if (obj.getRefComp().getLibAbsRef().getInstanceName().contains("AXIBUS") ||
							obj.getRefComp().getLibAbsRef().getInstanceName().contains("AXILITE") ||
							obj.getRefComp().getLibAbsRef().getInstanceName().contains("axi_interconnect")
							) {
						writer.println(" BUS_INTERFACE " + obj.getPort() + " = " + obj.getRefComp().getInstanceName());	
					} else {
						writer.println(" BUS_INTERFACE " + obj.getPort() + " = " + obj.getName());
					}
				}
			}

			
			// Munish added : 06.01.15
			//
			// Generating MHS PORTS for Components
			//
			if (object.getInstanceName().equals("processing_system7_0")) {
				//
				// Write all ports but IRQ_F2P
				//
				for (Iterator<PortCompPair> j = object.getPinToRefComponentPair().iterator(); j.hasNext();) {
					PortCompPair obj = (PortCompPair) j.next();
					if (!obj.getPort().equals("IRQ_F2P")) {
						writer.println(" PORT " + obj.getPort() + " = " + obj.getName());	
					}
				}
				//
				// Write port IRQ_F2P
				//
				String irq = "";
				int cnt;
				int first=0;
				for (cnt = 15; cnt >= 0; cnt--) {
					for (Iterator<AdHocConnection> j = newDesAbs.getAdHocConnections().iterator(); j.hasNext();) {
						AdHocConnection ad = j.next();
						if (ad.getInternalPortRef().size() == 2) {
							if (ad.getInternalPortRef().get(0).getRefPort().equals("IRQ_F2P")) {
								if (ad.getInternalPortRef().get(0).getLeft().toString().equals(String.valueOf(cnt))) {
									if (first==0) {
										irq = ad.getName();
										first++;
									} else {
										irq = irq + " & " + ad.getName();
									}
								}
							}
							if (ad.getInternalPortRef().get(1).getRefPort().equals("IRQ_F2P")) {
								if (ad.getInternalPortRef().get(1).getLeft().equals(String.valueOf(cnt))) {
									if (first==0) {
										irq = ad.getName();
										first++;
									} else {
										irq = irq + " & " + ad.getName();
									}
								}
							}
						}
					}	
				}
				writer.println(" PORT IRQ_F2P" + " = " + irq);
			} else {
				for (Iterator<PortCompPair> j = object.getPinToRefComponentPair().iterator(); j.hasNext();) {
					PortCompPair obj = (PortCompPair) j.next();
					writer.println(" PORT " + obj.getPort() + " = " + obj.getName());
				}
			}
			writer.println("END");
			writer.println("");
		}

		writer.close();
	}
	
	
	public void GenerateIPXACT (String finalDesign, DesignAbstraction newDesAbs) throws IOException {
		
		System.out.println();
		System.out.println("Calling Function: DesignGeneration.GenerateDesIPXACT(String designFile)");

		
		//
		// Register the appropriate resource factory to handle all file
		// extensions.
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());

		
		//
		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);
//		URI uri = URI.createFileURI(startDesignFile);
//		Resource resource = resourceSet.getResource(uri, true);
//		System.out.println("LOADED " + uri);
//		DocumentRoot designRoot = (DocumentRoot) resource.getContents().get(0);
//		DesignType rootNode = designRoot.getDesign();
		DesignType newNode = new DesignTypeImpl();
		// 
		// spiritPackage for generating new elements for output IPXACT
		//
		_1Package spiritPackage = _1Package.eINSTANCE;
		_1Factory spiritFactory = spiritPackage.get_1Factory();
		
	
		//
		// Creating new ComponentInstancesType for output IPXACT
		//
		ComponentInstancesType components = spiritFactory.createComponentInstancesType();
		List<ComponentInstanceType> componentsList = components.getComponentInstance();

		List<String> componentsListString = new ArrayList<String>();
		List<String> interconnectionsListString = new ArrayList<String>();
		
		List<CompAbstraction> newDesAbsComponents = newDesAbs.getDesComponents();
		
		for (Iterator<ComponentInstanceType> j = componentsList.iterator(); j.hasNext();) {
			ComponentInstanceType object = (ComponentInstanceType) j.next();
			componentsListString.add(object.getInstanceName());
		}
		

	    ComponentInstanceType newComponentChild = spiritFactory.createComponentInstanceType();
	    LibraryRefType newLibRefType = spiritFactory.createLibraryRefType();
	    Cloner cloner = new Cloner();
	
//		boolean instanceExist = false;
	    //
	    // Generates the Component abstraction for Final design
	    //
	    this.GenerateDesCompIPXACT(finalDesign, newDesAbs);
	    
		for (Iterator<CompAbstraction> j = newDesAbsComponents.iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			
			//
			// Generates the IPXACT output for Final design Components
			//
			this.GenerateCompIPXACT(finalDesign, object);
			
//			instanceExist = false;
//			for (Iterator<ComponentInstanceType> i = components.getComponentInstance().iterator(); i.hasNext();) {
//				ComponentInstanceType obj = (ComponentInstanceType) i.next();
//				if (obj.getInstanceName().equals(object.getInstanceName())) {
//					componentsList.add(obj);
//					instanceExist = true;
//				}
//			}
//			if (!instanceExist) {
			ComponentInstanceType newComponent = cloner.deepClone(newComponentChild);
			newComponent.setInstanceName(object.getInstanceName());
			for (Iterator<LibCompAbstraction> i = GlobalVars.LIBRARY.iterator(); i.hasNext();) {
				LibCompAbstraction obj = (LibCompAbstraction) i.next();
				if (object.getLibAbsRef().getInstanceName().equals(obj.getInstanceName())) {
					LibraryRefType newLibRef = cloner.deepClone(newLibRefType);
					newLibRef.setLibrary(obj.getLibrary());
					newLibRef.setName(obj.getInstanceName());
					newLibRef.setVendor(obj.getVendor());
					newLibRef.setVersion(obj.getVersion());
					newComponent.setComponentRef(newLibRef);
				}
			}
			newComponent.setDisplayName("");
			newComponent.setDescription("");
			componentsList.add(newComponent);
			System.out.println("IPXACT generation: New design component found - " + newComponent.getInstanceName());
//			}
		}
		
		
		InterconnectionsType interconnections =  spiritFactory.createInterconnectionsType();
		List<InterconnectionType> interconnectionsList = interconnections.getInterconnection();
		
//		for (Iterator<InterconnectionType> j = interconnectionsList.iterator(); j.hasNext();) {
//			InterconnectionType object = (InterconnectionType) j.next();
//			interconnectionsListString.add(object.getName());
//		}
		
		
		// Creating interconnections tag for IPXACT
		for (Iterator<CompAbstraction> i = newDesAbs.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction Object = (CompAbstraction) i.next();
			List<PortCompPair> connections = Object.getPortToRefComponentPair();
			List<ConnectedPort> masters = Object.getMasterPorts();
			List<ConnectedPort> mirSlaves = Object.getMirSlavePorts();

			InterconnectionType newInterconnectionType = spiritFactory.createInterconnectionType();
			Interface newActiveInterfaceType = spiritFactory.createInterface();


			if (masters.size() > 0) {
				for (Iterator<ConnectedPort> j = masters.iterator(); j.hasNext();) {
					ConnectedPort Obj = (ConnectedPort) j.next();
					InterconnectionType newInterconnection = cloner.deepClone(newInterconnectionType);
					Interface newActiveInterface1 = cloner.deepClone(newActiveInterfaceType);
					Interface newActiveInterface2 = cloner.deepClone(newActiveInterfaceType);
					
					for (Iterator<PortCompPair> k = connections.iterator(); k.hasNext();) {
						PortCompPair O = (PortCompPair) k.next();
						if (Obj.getPort().equals(O.getPort())) {
							newActiveInterface1.setBusRef(Obj.getPort());
							newActiveInterface1.setComponentRef(Object.getInstanceName());
							newActiveInterface2.setComponentRef(O.getRefComp().getInstanceName());
							newActiveInterface2.setBusRef(O.getRefPort());
							newInterconnection.getActiveInterface().add(newActiveInterface1);
							newInterconnection.getActiveInterface().add(newActiveInterface2);
							newInterconnection.setDescription("");
							newInterconnection.setDisplayName("");
							newInterconnection.setName(O.getName());
							interconnectionsList.add(newInterconnection);
						}
					}

				}
			}
			

			if (mirSlaves.size() > 0) {
				for (Iterator<ConnectedPort> j = mirSlaves.iterator(); j.hasNext();) {
					InterconnectionType newInterconnection = cloner.deepClone(newInterconnectionType);
					
					ConnectedPort Obj = (ConnectedPort) j.next();
					for (Iterator<PortCompPair> k = connections.iterator(); k.hasNext();) {
						PortCompPair O = (PortCompPair) k.next();
						if (Obj.getPort().equals(O.getPort())) {
							Interface newActiveInterface1 = cloner.deepClone(newActiveInterfaceType);
							Interface newActiveInterface2 = cloner.deepClone(newActiveInterfaceType);
							newActiveInterface1.setBusRef(Obj.getPort());
							newActiveInterface1.setComponentRef(Object.getInstanceName());
							newActiveInterface2.setComponentRef(O.getRefComp().getInstanceName());
							int ii = 0;
							for (Iterator<PortCompPair> l = O.getRefComp().getPortToRefComponentPair().iterator(); l.hasNext();) {
								ii++;
								PortCompPair OO = (PortCompPair) l.next();
								if (OO.getRefComp().getInstanceName().equals(Object.getInstanceName())) {
									newActiveInterface2.setBusRef(OO.getPort());
								}
							}
							newInterconnection.getActiveInterface().add(newActiveInterface1);
							newInterconnection.getActiveInterface().add(newActiveInterface2);
							newInterconnection.setDescription("");
							newInterconnection.setDisplayName("");
							newInterconnection.setName(O.getName());
							interconnectionsList.add(newInterconnection);
						}
					}
				}
			}
		} // interconnections tag ends here
		
		AdHocConnectionsType adhocConnectionsType = spiritFactory.createAdHocConnectionsType();
		AdHocConnectionsType adhocConnections = cloner.deepClone(adhocConnectionsType);

		InternalPortReferenceType intPortRefType = spiritFactory.createInternalPortReferenceType(); 
		AdHocConnectionType adhocConnectionType = spiritFactory.createAdHocConnectionType();
		
		String name = "";
		
		for (Iterator<AdHocConnection> i = newDesAbs.getAdHocConnections().iterator(); i.hasNext();) {
			AdHocConnection object = i.next();
			name = object.getName();
			AdHocConnectionType adhocConnection = cloner.deepClone(adhocConnectionType);					
			for (Iterator<InternalPortRef> j = object.getInternalPortRef().iterator(); j.hasNext();) {
				InternalPortRef obj = j.next();
				InternalPortReferenceType intPortRef = cloner.deepClone(intPortRefType);
				intPortRef.setComponentRef(obj.getRefComponent());
				intPortRef.setPortRef(obj.getRefPort());
				intPortRef.setLeft(obj.getLeft());
				intPortRef.setRight(obj.getRight());
				//name +=obj.getRefComponent() + "_" + obj.getRefPort() + "_";
				adhocConnection.getInternalPortReference().add(intPortRef);
			}
			adhocConnection.setName(name);
			adhocConnections.getAdHocConnection().add(adhocConnection);
		}
		
		
//		AdHocConnectionsType adhocConnections = rootNode.getAdHocConnections();
//		List<AdHocConnectionType> adhoc = rootNode.getAdHocConnections().getAdHocConnection();
//		adhocConnections.getAdHocConnection().add(adhoc.get(0));
		
		// Creating vendorExtensions tag for IPXACT
		//System.out.print("ADHOC" + rootNode.getAdHocConnections().getAdHocConnection().get(0).toString());
		newNode.setVendor("ARM");
		newNode.setLibrary("design");
		newNode.setName("System.design");
		newNode.setVersion("1.0");
		newNode.setComponentInstances(components);
		newNode.setInterconnections(interconnections);
		newNode.setAdHocConnections(adhocConnections);
		
//		File file = new File("System");
		name = finalDesign + "/"  + "System.design.1.0.xml";
		
//		System.out.println("CHECK" + name);
		Resource resource2 = resourceSet.createResource(URI.createFileURI(name));
		resource2.getContents().add(newNode);
		resource2.save(null);
		
	}
 
	
	
	public static final int IN = 0;
	public static final int OUT = 1;
	public static final int INOUT = 2;

	public void GenerateCompIPXACT(String compDirectory, CompAbstraction comp) throws IOException {
		
		ComponentType newNode = new ComponentTypeImpl();
		//Component nn = new ComponentImpl();
		newNode.setVendor(comp.getLibAbsRef().getVendor());
		newNode.setLibrary(comp.getLibAbsRef().getLibrary());
		newNode.setName(comp.getInstanceName());
		newNode.setVersion(comp.getLibAbsRef().getVersion());
		
		List<Parameter> absParameters = comp.getParameters();
		List<ConnectedPort> absPins = comp.getAllPins();
		

		_1Package spiritPackage = _1Package.eINSTANCE;
		_1Factory spiritFactory = spiritPackage.get_1Factory();
		NameValuePairTypeImpl para = new NameValuePairTypeImpl();
		ValueType2 val = new ValueType2Impl();
		ParametersType1 pp = spiritFactory.createParametersType1();			
		ModelType model = spiritFactory.createModelType();
		PortsType1 ports = new PortsType1Impl();
		PortType port = new PortTypeImpl();
		PortWireType wire = new PortWireTypeImpl();
		VectorType2 vec = new VectorType2Impl();
		LeftType2 left = new LeftType2Impl();
		RightType2 right = new RightType2Impl();
		Cloner cloner = new Cloner();
		
		model.setPorts(ports);
		newNode.setModel(model);
		
		for (Iterator<Parameter> i = absParameters.iterator(); i.hasNext();) {
			Parameter obj = i.next();
			
			NameValuePairTypeImpl para1 = cloner.deepClone(para);
			ValueType2 val1 = cloner.deepClone(val);
			
			//System.out.println(obj.getParameter() + " || " + obj.getValue());
			val1.setValue(obj.getValue());
			para1.setName(obj.getParameter());
			para1.setValue(val1);
			pp.getParameter().add(para1);
			newNode.setParameters(pp);
		}
		
		ComponentPortDirectionType idir = new ComponentPortDirectionType(IN, "in", "in");
		ComponentPortDirectionType odir = new ComponentPortDirectionType(OUT, "out", "out");
		ComponentPortDirectionType iodir = new ComponentPortDirectionType(INOUT, "inout", "inout");
//		for (Iterator<ConnectedPort> i = absPins.iterator(); i.hasNext();) {
//			ConnectedPort obj = i.next();
//			PortType port1 = cloner.deepClone(port);
//			PortWireType wire1 = cloner.deepClone(wire);
//			port1.setWire(wire1);
//			port1.setName(obj.getPort());
//			try {if (obj.getDirection().equals("in")) port1.getWire().setDirection(idir);} catch (Exception e) { System.out.println(
//												"IPXACT Generation: Pin direction not available: " + comp.getInstanceName() + "/" + obj.getName());} 
//			try {if (obj.getDirection().equals("out")) port1.getWire().setDirection(odir);} catch (Exception e) {} 
//			try {if (obj.getDirection().equals("inout")) port1.getWire().setDirection(iodir);} catch (Exception e) {} 
//			ports.getPort().add(port1);
//		}
		for (Iterator<ConnectedPort> i = absPins.iterator(); i.hasNext();) {
			ConnectedPort obj = i.next();
			PortType port1 = cloner.deepClone(port);
			PortWireType wire1 = cloner.deepClone(wire);
			VectorType2 vec1 = cloner.deepClone(vec);
			LeftType2 left1 = cloner.deepClone(left);
			RightType2 right1 = cloner.deepClone(right);
			BigInteger lval1 = BigInteger.valueOf(0);
			BigInteger rval1 = BigInteger.valueOf(0);
			
			left1.setValue(lval1);
			right1.setValue(rval1);
			vec1.setLeft(left1);
			vec1.setRight(right1);
			wire1.setVector(vec1);
			port1.setWire(wire1);
			ports.getPort().add(port1);

			try {port1.setName(obj.getPort());} catch (Exception e) {}
			try {if (obj.getDirection().equals("in")) port1.getWire().setDirection(idir);} catch (Exception e) { System.out.println(
					"IPXACT Generation: Pin direction not available: " + comp.getInstanceName() + "/" + obj.getName());} 
			try {if (obj.getDirection().equals("out")) port1.getWire().setDirection(odir);} catch (Exception e) {} 
			try {if (obj.getDirection().equals("inout")) port1.getWire().setDirection(iodir);} catch (Exception e) {}
			try {lval1 = obj.getLeft();} catch (Exception e) {System.out.println(
					"IPXACT Generation: Left vector value not available: " + comp.getInstanceName() + "/" + obj.getName());} 
			try {rval1 = obj.getRight();} catch (Exception e) {System.out.println(
					"IPXACT Generation: Right vector value not available: " + comp.getInstanceName() + "/" + obj.getName());} 
			
			wire1.setAllLogicalDirectionsAllowed(false);
			vec1.getLeft().setValue(lval1);
			vec1.getRight().setValue(rval1);
		}
		
		String outfile = compDirectory + "/" + newNode.getName() + ".xml";
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);

		System.out.println("Design Generation: Generated IPXACT file " +outfile);
		Resource resource2 = resourceSet.createResource(URI.createFileURI(outfile));
		resource2.getContents().add(newNode);
		resource2.save(null);			
	}
	

	public void GenerateDesCompIPXACT(String compDirectory, DesignAbstraction des) throws IOException {
		
		ComponentType newNode = new ComponentTypeImpl();
		newNode.setVendor(des.getDesign().getVendor());
		newNode.setLibrary(des.getDesign().getLibrary());
		newNode.setName(des.getDesign().getName());
		newNode.setVersion(des.getDesign().getVersion());
		
		
		List<Parameter> absParameters = des.getParameters();
		List<ConnectedPort> absPins = des.getAllPins();
		

		_1Package spiritPackage = _1Package.eINSTANCE;
		_1Factory spiritFactory = spiritPackage.get_1Factory();
		NameValuePairTypeImpl para = new NameValuePairTypeImpl();
		ValueType2 val = new ValueType2Impl();
		ParametersType1 pp = spiritFactory.createParametersType1();			
		ModelType model = spiritFactory.createModelType();
		PortsType1 ports = new PortsType1Impl();
		PortType port = new PortTypeImpl();
		PortWireType wire = new PortWireTypeImpl();
		VectorType2 vec = new VectorType2Impl();
		LeftType2 left = new LeftType2Impl();
		RightType2 right = new RightType2Impl();
		DriverType dri = new DriverTypeImpl();
		Cloner cloner = new Cloner();
		
 
		model.setPorts(ports);
		newNode.setModel(model);
		
		//
		// Creating IPXACT parameters description
		//
		for (Iterator<Parameter> i = absParameters.iterator(); i.hasNext();) {
			Parameter obj = i.next();
			
			NameValuePairTypeImpl para1 = cloner.deepClone(para);
			ValueType2 val1 = cloner.deepClone(val);
			
			//System.out.println(obj.getParameter() + " || " + obj.getValue());
			val1.setValue(obj.getValue());
			para1.setName(obj.getParameter());
			para1.setValue(val1);
			pp.getParameter().add(para1);
			newNode.setParameters(pp);
		}
		
		
		//
		// Creating IPXACT ports description
		//
		ComponentPortDirectionType idir = new ComponentPortDirectionType(IN, "in", "in");
		ComponentPortDirectionType odir = new ComponentPortDirectionType(OUT, "out", "out");
		ComponentPortDirectionType iodir = new ComponentPortDirectionType(INOUT, "inout", "inout");
		DefaultValueType def = new DefaultValueTypeImpl();
		
		for (Iterator<ConnectedPort> i = absPins.iterator(); i.hasNext();) {
			ConnectedPort obj = i.next();
			PortType port1 = cloner.deepClone(port);
			PortWireType wire1 = cloner.deepClone(wire);
			VectorType2 vec1 = cloner.deepClone(vec);
			LeftType2 left1 = cloner.deepClone(left);
			RightType2 right1 = cloner.deepClone(right);
			DriverType dri1 = cloner.deepClone(dri);
			DefaultValueType def1 = cloner.deepClone(def);
			BigInteger lval1 = BigInteger.valueOf(0);
			BigInteger rval1 = BigInteger.valueOf(0);
			
			left1.setValue(lval1);
			right1.setValue(rval1);
			vec1.setLeft(left1);
			vec1.setRight(right1);
			dri1.setDefaultValue(def1);
			wire1.setDriver(dri1);
			wire1.setVector(vec1);
			port1.setWire(wire1);
			ports.getPort().add(port1);

			try {port1.setName(obj.getPort());} catch (Exception e) {}
			try {if (obj.getDirection().equals("in")) wire1.setDirection(idir);} catch (Exception e) { System.out.println(
					"IPXACT Generation: Pin direction not available: " + des.getDesign().getName() + "/" + obj.getName());} 
			try {if (obj.getDirection().equals("out")) wire1.setDirection(odir);} catch (Exception e) {} 
			try {if (obj.getDirection().equals("inout")) wire1.setDirection(iodir);} catch (Exception e) {}
			try {lval1 = obj.getLeft();} catch (Exception e) {System.out.println(
					"IPXACT Generation: Left vector value not available: " + des.getDesign().getName() + "/" + obj.getName());} 
			try {rval1 = obj.getRight();} catch (Exception e) {System.out.println(
					"IPXACT Generation: Right vector value not available: " + des.getDesign().getName() + "/" + obj.getName());} 
			try {def1.setValue(obj.getDriver());} catch (Exception e) {}
			
			wire1.setAllLogicalDirectionsAllowed(false);
			vec1.getLeft().setValue(lval1);
			vec1.getRight().setValue(rval1);
		}

		String outfile = compDirectory + "/" + newNode.getName() + ".1.0.xml";
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);

		System.out.println("Design Generation: Generated IPXACT file " + outfile);
		Resource resource2 = resourceSet.createResource(URI.createFileURI(outfile));
		resource2.getContents().add(newNode);
		resource2.save(null);			
	}
	
	public DesignAbstraction AddBusComponent(DesignAbstraction inDesign, CompAbstraction bus) {

		Cloner cloner = new Cloner();
		DesignAbstraction outDesign = cloner.deepClone(inDesign);
		CompAbstraction bus1 = cloner.deepClone(bus);
		
		int rm = bus1.getPortToRefComponentPair().size();
		for (int r = rm-1; r >=0 ; r--) {
			bus1.getPortToRefComponentPair().remove(r);
		}

		List<String> desComps = new ArrayList<String>();
		for (Iterator<CompAbstraction> j = outDesign.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			desComps.add(object.getInstanceName());
		}

		String name = bus1.getInstanceName();
		String nname  = bus1.getInstanceName();
		int suff = 0;
		while (desComps.contains(nname)) {
			nname = name.concat("_" + suff);
			suff++;
		}
		bus1.setInstanceName(nname);
		outDesign.addDesComponent(bus1);
	
		return outDesign;
	}

	
	public DesignAbstraction AddComponent(DesignAbstraction inDesign, CompAbstraction comp) {

		Cloner cloner = new Cloner();
		DesignAbstraction outDesign = cloner.deepClone(inDesign);
		
		List<String> desComps = new ArrayList<String>();
		boolean connectedBus = false;
		String connectedPort = "";
		boolean isMaster = false;
		CompAbstraction bus = new CompAbstractionImpl();
		//CompAbstraction pbus = new CompAbstractionImpl();
		//CompAbstraction sbus = new CompAbstractionImpl();
		
		int cnt = 0;
		int chkCnt1 = 0;
		int pbusCnt = 0;
		int sbusCnt = 0;
		
		//
		// Prepare List of all the components in the inDesign and get the index of Buses.
		//
		for (Iterator<CompAbstraction> j = outDesign.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			if (object.getIS_BUS()) {
				//bus = object;
				//chkCnt1 = cnt;
				if (object.getInstanceName().equals(GlobalVars.BUS_INSTANCES.get(0))){
					pbusCnt = cnt;
					//pbus = object;
				} else {
					sbusCnt = cnt;
					//sbus = object;
				}
			}
			desComps.add(object.getInstanceName());
			++cnt;
		}

		// Uniquifying the instance name of new "comp" to be added
		CompAbstraction comp1 = cloner.deepClone(comp);
		
		String name = comp1.getInstanceName();
		String nname  = comp1.getInstanceName();
		int suff = 0;
		while (desComps.contains(nname)) {
			nname = name.concat("_" + suff);
			suff++;
		}
		comp1.setInstanceName(nname);
		
		
		// Cache the port connection to Bus for "comp" to be added.
		// Check if the "comp" needs to be connected to System bus.
		 List<PortCompPair> unconnectedports = cloner.deepClone(comp.getPortToRefComponentPair());
		 unconnectedports.size();
		
		
		int rounds = comp1.getPortToRefComponentPair().size();
		String bustype;
		
		for (int rnd = 0 ; rnd < rounds ; rnd ++) {
			
			cnt = 0;
			int chkCnt2 = 0;
			boolean busisprimary = false;
			
			/*
			for (Iterator<PortCompPair> j = comp.getPortToRefComponentPair().iterator(); j.hasNext();) {
				PortCompPair object = (PortCompPair) j.next();
				if (object.getRefComp().getIS_BUS()) {
					connectedBus = true;
					connectedPort = object.getPort();
					if (object.getRefComp().getInstanceName().equals(GlobalVars.BUS_INSTANCES.get(0))) {
						busisprimary = true;
					}
					chkCnt2 = cnt;
				}
				++cnt;
			}*/
	
			for (Iterator<PortCompPair> j = unconnectedports.iterator(); j.hasNext();) {
				PortCompPair object = (PortCompPair) j.next();
				
				if (object.getRefComp().getIS_BUS()) {
					connectedBus = true;
					connectedPort = object.getPort();
					busisprimary = false;
					if (object.getRefComp().getInstanceName().equals(GlobalVars.BUS_INSTANCES.get(0))) {
						busisprimary = true;
					}
					chkCnt2 = cnt;
				}
				++cnt;
			}
			
			isMaster = false;
			// Checks for Type of component - Master or Slave.
			for (Iterator<ConnectedPort> i = comp.getMasterPorts().iterator(); i.hasNext();) {
				ConnectedPort object = (ConnectedPort) i.next();
				if (object.getPort().equals(connectedPort)) {
					isMaster = true;
					bustype = comp.getBusType(object.getPort());
				}
			}
			//if (comp.getMasterPorts().contains(connectedPort)) { isMaster = true ;}
	
			
			// If "comp" needs connection to System bus.
			// Correct PortToRefComponentPair list for "comp" and "outDesign" bus-component.
			if (connectedBus) {
				if (busisprimary) {
					bus = outDesign.getDesComponents().get(pbusCnt);
					chkCnt1 = pbusCnt;
				} else {
					bus = outDesign.getDesComponents().get(sbusCnt);
					chkCnt1 = sbusCnt;
				}
				
				//System.out.println(unconnectedports.size() + "P: "+ pbusCnt + "S: " + sbusCnt);
				comp.getPortToRefComponentPair().remove(chkCnt2);
				unconnectedports.remove(unconnectedports.size()-1);
					
				if (isMaster) {
					//
					// MUNISH ----  HARD CODED -- EDIT WHEN NEEDED
					//
					List<String> freeports = bus.getUnconnectedPorts("mirMaster", "wb_bus");
					if (freeports.size() == 0) {
						System.err.println("Error: No unconnected MirMaster port was found on Bus.");
					} else {
						PortCompPair cpair = new PortCompPair(connectedPort, freeports.get(0), 
																outDesign.getDesComponents().get(chkCnt1));
						PortCompPair bpair = new PortCompPair(freeports.get(0), connectedPort, comp );
						comp.addPortToRefComponentPair(cpair);
						outDesign.getDesComponents().get(chkCnt1).getPortToRefComponentPair().add(bpair);
					}
				} else {
					//
					// MUNISH ----  HARD CODED -- EDIT WHEN NEEDED
					//
					List<String> freeports = bus.getUnconnectedPorts("mirSlave", "wb_soc");
					if (freeports.size() == 0) {
						System.err.println("Error: No unconnected MirSlave port was found on Bus.");
					} else {
						PortCompPair cpair = new PortCompPair(connectedPort, freeports.get(0), outDesign.getDesComponents().get(chkCnt1));
						PortCompPair bpair = new PortCompPair(freeports.get(0), connectedPort, comp );
						comp.addPortToRefComponentPair(cpair);
						outDesign.getDesComponents().get(chkCnt1).addPortToRefComponentPair(bpair);
					}
				}
			}
		}
		
		outDesign.addDesComponent(comp);
		
		return outDesign;
	}

	// Assumes "rule" is static variable input
	public GenerativRulePair ReduceRule(DesignAbstraction design, GenerativRulePair rule) {

		//this.FindCommonComponents(rule.getGenerativPattern(), rule.getReplacementPattern());
		
		Cloner cloner = new Cloner();
		DesignAbstraction nrulePat = cloner.deepClone(rule.getGenerativPattern());
		DesignAbstraction nreplacePat = cloner.deepClone(rule.getReplacementPattern());

		this.FindCommonComponents(nrulePat, nreplacePat);

		boolean found = false;
		
		List<CompAbstraction> commonComps = new ArrayList<CompAbstraction>();
		for (Iterator<CompAbstraction> j = nreplacePat.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			if (object.getMapped()==1) {
				commonComps.add(object);
				System.out.println("Design Generation: Common component found (Strictly equivalent): " + object.getInstanceName());
				found = true;
			}
		}
		if (!found) {
				System.out.println("Design Generation: No common component found (Strictly equivalent) between Left and Right pat of the GRIP rule");
		}

		List<String> desComps = new ArrayList<String>();
		for (Iterator<CompAbstraction> j = design.getDesComponents().iterator(); j.hasNext();) {
			desComps.add(j.next().getInstanceName());
		}
			

		//
		// renames the "nrulePat" design components names to match 
		// input design component names.
		//
		for (Iterator<CompAbstraction> i = nrulePat.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			for (Iterator<CompAbstraction> j = design.getDesComponents().iterator(); j.hasNext();) {
				CompAbstraction obj = (CompAbstraction) j.next();
				if (obj.IsEquivalent(object, false)) {
				// Munish added 06.01.15
					for (Iterator<CompAbstraction> k = nreplacePat.getDesComponents().iterator(); k.hasNext();) {
						CompAbstraction o = (CompAbstraction) k.next();
						if (o.getInstanceName().equals(object.getInstanceName())) {
							System.out.println("Design Generation: Changing rightpat component instance name from " + o.getInstanceName() + " to " + obj.getInstanceName());
							o.setInstanceName(obj.getInstanceName());
						}
					}
						
					System.out.println("Design Generation: Changing leftpat component instance name from " + object.getInstanceName() + " to " + obj.getInstanceName());
					object.setInstanceName(obj.getInstanceName());
				} 
			}
		}

		// 
		// Set the "nreplacePat" Design comp names to "design components" names
		//
		/* Munish commented 06.01.15
		for (Iterator<CompAbstraction> i = nrulePat.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			for (Iterator<CompAbstraction> j = nreplacePat.getDesComponents().iterator(); j.hasNext();) {
				CompAbstraction obj = (CompAbstraction) j.next();
				if (obj.IsEquivalent(object, false)) {
					obj.setInstanceName(object.getInstanceName());
					System.out.println("Design Generation: Changing rightpat component instance name from " + obj.getInstanceName() + " to " + object.getInstanceName());
				} 
			}
		}
		*/
		// 
		// Copies "Parameter" from nreplacePat to "design components" 
		// Copies "Pins" from nreplacePat to "design components"
		//
		// Renames the nrulePat design components names to match 
		// input design component names.
		//
		String listPARM, listPORT, name, nname, oname = "";
		boolean matched = false;
		int cnt = 0;
		
		for (Iterator<CompAbstraction> i = nreplacePat.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			matched = false;
			for (Iterator<CompAbstraction> j = design.getDesComponents().iterator(); j.hasNext();) {
				CompAbstraction obj = (CompAbstraction) j.next();
				// 
				// getmapped() check is required to match to component to already found leftpat pattern in the design graph
				//
				//if (object.IsEquivalent(obj, false) && (object.getMapped()>0 || object.getIS_BUS())) {
				if (object.getInstanceName().equals(obj.getInstanceName()) && (obj.getMapped() > 0 || obj.getIS_BUS())) {
					matched = true;
					//System.out.println("HERE match found " + obj.getInstanceName() + "  && " + object.getInstanceName());
					object.setInstanceName(obj.getInstanceName());
				
					//
					// This is to override existing Parameter with the new value 29.12
					//
					listPARM = "";
					listPORT = "";
					for (Iterator<Parameter> jj = obj.getParameters().iterator(); jj.hasNext();) {
						listPARM = listPARM + " " + jj.next().getParameter() + " ";
					}
					for (Iterator<ConnectedPort> jj = obj.getAllPins().iterator(); jj.hasNext();) {
						listPORT = listPORT + " " + jj.next().getPort() + " ";
					}
					
					for (Iterator<Parameter> k=object.getParameters().iterator(); k.hasNext();) {
						Parameter o = k.next();
						if (!listPARM.contains(" " + o.getParameter() + " ")) {
							Parameter oo = cloner.deepClone(o);
							obj.addParameter(oo);	
						} else {
							for (Iterator<Parameter> jj = obj.getParameters().iterator(); jj.hasNext();) {
								Parameter ooo = jj.next();
								if (ooo.getParameter().equals(o.getParameter())) {
									ooo.setValue(o.getValue());
								}
							}
						}
					}
					
					for (Iterator<ConnectedPort> k=object.getAllPins().iterator(); k.hasNext();) {
						ConnectedPort o = k.next();
						if (!listPORT.contains(o.getPort())) {
							ConnectedPort oo = cloner.deepClone(o);
							obj.addPin(oo);	
						}
						//ConnectedPort oo = cloner.deepClone(o);
						//obj.addPin(oo);
					}
				}
			}
			if (!matched) {
				cnt = 0;
				oname = name = object.getInstanceName();
				nname = object.getInstanceName();
				while (desComps.contains(name)) {
					name = nname + "_" + cnt;
					++cnt;
				}
				System.out.println("Design Generation: Changing the Instance name for " + object.getInstanceName() + " to "+ name);
				object.setInstanceName(name);
			
				for (Iterator<AdHocConnection> j = nreplacePat.getAdHocConnections().iterator(); j.hasNext();) {
					AdHocConnection obj = j.next();
					for (Iterator<InternalPortRef> k = obj.getInternalPortRef().iterator(); k.hasNext();) {
						InternalPortRef o = k.next();
						if (o.getRefComponent().equals(oname)) {
							o.setRefComponent(name);
							System.out.println("Design Generation: Changing the AdHocConnection name for Component: " + oname + " to "+ name);
						}
					}
				}
			}
		}
		//
		// Copies adHocConnections from 'nreplacePat' to 'design'
		// Munish Commented: 26.12 --- Seems redundant 
		// Munish Commented: 08.01.15
		//
//		for (Iterator<PortCompPair> i = nreplacePat.getPinToRefComponentPair().iterator(); i.hasNext();){
//			PortCompPair obj = i.next();
//			PortCompPair oobj = cloner.deepClone(obj);
//			design.getPinToRefComponentPair().add(oobj);
//		}

		//
		// remove the Common Components from 'nreplacePat' and 'nrulePat'
		//
		for (Iterator<CompAbstraction> j = commonComps.iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			if (!object.getIS_BUS()) {
				nrulePat = this.nRemoveComponent(nrulePat, object);
				nreplacePat = this.nRemoveComponent(nreplacePat, object);
			}
		}

		//
		// Clean the Port connections removing unnecessary ports for removed components
		// 
		nrulePat = this.CleanPortConnections(nrulePat);
		nreplacePat = this.CleanPortConnections(nreplacePat);
		GenerativRulePair nrule = new GenerativRulePair(nrulePat, nreplacePat);
		

		return nrule;
	}

	//
	// Clean the port connections for design components
	// removes the PortCompPair for the components which doesn't exist in the design
	//
	public DesignAbstraction CleanPortConnections(DesignAbstraction design) {
		
		System.out.println("Design Generation: Starting Port Cleaning for design...");
		Cloner cloner = new Cloner();
		DesignAbstraction ndesign = cloner.deepClone(design);
		
		int cnt = 0;
		int chkCnt = 0;
		boolean cleanPort = false;
		int maxConns = design.getDesComponents().size();
		List<String> desComps = new ArrayList<String>();
		
		for (Iterator<CompAbstraction> i = ndesign.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			desComps.add(object.getInstanceName());
			if (maxConns< object.getPortToRefComponentPair().size()) maxConns = object.getPortToRefComponentPair().size();
		}
		
		System.out.println("Design Generation: Remaining design components: " + desComps);
		
		for (int n = 0; n < maxConns; n++) {
			for (Iterator<CompAbstraction> i = ndesign.getDesComponents().iterator(); i.hasNext();) {
				CompAbstraction object = (CompAbstraction) i.next();
				cnt = 0;
				for (Iterator<PortCompPair> j = object.getPortToRefComponentPair().iterator(); j.hasNext();) {
					PortCompPair obj = (PortCompPair) j.next();
				//	System.out.println(desComps + " "  + obj.getRefComp().getInstanceName() + " "  + object.getInstanceName());
					if (!desComps.contains(obj.getRefComp().getInstanceName())) {
						chkCnt = cnt; 
						cleanPort = true;
					//	System.out.println("INSIDE  " + desComps + " "  + obj.getRefComp().getInstanceName() + " "  + object.getInstanceName());
					}
					++cnt;
				}
				if (cleanPort == true) {
					System.out.println("Design Generation: Cleaning Port Connection: Instance-Port: " + object.getInstanceName() + " - " + object.getPortToRefComponentPair().get(chkCnt).getPort());
					object.getPortToRefComponentPair().remove(chkCnt);
					//object.setPortConnections();
				}
				cleanPort = false;
			}
		}
		System.out.println("Design Generation: Port Cleaning for design Completed.");
		return ndesign;
	}

	public void CleanDesignConnections(DesignAbstraction design) {
		
		String desInstances = "";
		
		for (Iterator<CompAbstraction> j = design.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			desInstances+= " " + object.getInstanceName();
		}
		
		for (Iterator<CompAbstraction> j = design.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			
			int nPorts = object.getPortToRefComponentPair().size();
			
			for (int i = nPorts-1; i >= 1; i--) {
				PortCompPair p = object.getPortToRefComponentPair().get(i);
				for (int k = i-1; k >= 0; k--) {
					if (p.getRefComp().getInstanceName() == object.getPortToRefComponentPair().get(k).getRefComp().getInstanceName() 
							&& p.getPort() == object.getPortToRefComponentPair().get(k).getPort()) {
						System.out.println("Cleaning design Connection:" + object.getInstanceName() + ": " + 
								object.getPortToRefComponentPair().get(k).getPort() + " " + 
									object.getPortToRefComponentPair().get(k).getRefComp().getInstanceName());
						object.getPortToRefComponentPair().remove(k);
						k = -1;
					}
				}
			}
			
			nPorts = object.getPortToRefComponentPair().size();
			
			for (int i = nPorts-1; i>= 0; i--) {
				PortCompPair p = object.getPortToRefComponentPair().get(i);
				if (!desInstances.contains(p.getRefComp().getInstanceName())) {
					System.out.println("Cleaning design Connection:" + object.getInstanceName() + ": " + 
							object.getPortToRefComponentPair().get(i).getPort() + " " + 
								object.getPortToRefComponentPair().get(i).getRefComp().getInstanceName());
					object.getPortToRefComponentPair().remove(i);
				}
			}
		}
		
	}


	// 
	// Removes the desired component from inputDesign 
	// also takeover the 'parameters', 'port' and 'port connections' (AdHocConnections)
	//

	public DesignAbstraction RemoveComponent(DesignAbstraction inputDesign, CompAbstraction comp) {

		Cloner cloner = new Cloner();
		DesignAbstraction outputDesign = cloner.deepClone(inputDesign);

		int cnt = 0;
		int chkCnt = 0;
		//List<CompAbstraction> connectedComps = new ArrayList<CompAbstraction>();

		for (Iterator<CompAbstraction> j = outputDesign.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			if (object.getInstanceName().equals(comp.getInstanceName()) &&
					object.getLibAbsRef().getInstanceName().equals(comp.getLibAbsRef().getInstanceName())) {
				chkCnt = cnt;
			}
			++cnt;
		}

		System.out.println("Design Generation: REMOVING Component " + outputDesign.getDesComponents().get(chkCnt).getInstanceName()
				+ " from Design. ");
		for (Iterator<Parameter> i = outputDesign.getDesComponents().get(chkCnt).getParameters().iterator(); i.hasNext();) {
			Parameter object = (Parameter) i.next();
			comp.getParameters().add(object);
		}
		
		for (Iterator<ConnectedPort> i = outputDesign.getDesComponents().get(chkCnt).getAllPins().iterator(); i.hasNext();) {
			ConnectedPort object = (ConnectedPort) i.next();
			comp.getAllPins().add(object);
		}
		
		outputDesign.getDesComponents().remove(chkCnt);
		
		this.CleanDesignConnections(outputDesign);
		
		/*
		for (Iterator<PortCompPair> i = outputDesign.getDesComponents().get(chkCnt).getPortToRefComponentPair().iterator(); i.hasNext();) {
			PortCompPair object = (PortCompPair) i.next();
			connectedComps.add(object.getRefComp());
		}

		for (Iterator<CompAbstraction> i = connectedComps.iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			cnt = 0;
			for (Iterator<CompAbstraction> j = outputDesign.getDesComponents().iterator(); j.hasNext();) {
				CompAbstraction obj = (CompAbstraction) j.next();
				if (obj.getLibAbsRef().getInstanceName().equals(object.getLibAbsRef().getInstanceName())) {
					chkCnt = cnt;
				}
				++cnt;
			}
		}
*/
		
		return outputDesign;

	}

	// 
	// Only removes the component 
	// but doesn't takeover the 'parameters', 'port' and 'port connections' (AdHocConnections)
	//
	public DesignAbstraction nRemoveComponent(DesignAbstraction inputDesign, CompAbstraction comp) {

		Cloner cloner = new Cloner();
		DesignAbstraction outputDesign = cloner.deepClone(inputDesign);

		int cnt = 0;
		int chkCnt = 0;
		//List<CompAbstraction> connectedComps = new ArrayList<CompAbstraction>();
		for (Iterator<CompAbstraction> j = outputDesign.getDesComponents().iterator(); j.hasNext();) {
			CompAbstraction object = (CompAbstraction) j.next();
			if (object.getInstanceName().equals(comp.getInstanceName()) &&
					object.getLibAbsRef().getInstanceName().equals(comp.getLibAbsRef().getInstanceName())) {
				chkCnt = cnt;
			}
			++cnt;
		}

		System.out.println("Design Generation: REMOVING Component " + outputDesign.getDesComponents().get(chkCnt).getInstanceName()
				+ " from Design. ");
		outputDesign.getDesComponents().remove(chkCnt);
		this.CleanDesignConnections(outputDesign);
		
		return outputDesign;

	}

//
//	public void RechangeConnections(DesignAbstraction inputDesign, CompAbstraction comp) {
//		
//		List<ConnectedPort> busconnections = comp.getAllPorts();
//		List<ConnectedPort> mbusconnections = comp.getMasterPorts();
//		List<ConnectedPort> sbusconnections = comp.getSlavePorts();
//		List<PortCompPair> portRefs = comp.getPortToRefComponentPair();
//		for (Iterator<CompAbstraction> j = inputDesign.getDesComponents().iterator(); j.hasNext();) {
//			CompAbstraction object = (CompAbstraction) j.next();
//			if (object.getLibAbsRef().getInstanceName().equals(comp.getLibAbsRef().getInstanceName())) {
//				object.setPortToRefComponentPair(portRefs);
//			}
//			
//		}
//		
//	}
//
//	public void PrintDesignSummary(DesignAbstraction ades) {
//
//		System.out.println("Design Generation: Summary for the Design: Components-");
//		for (Iterator<CompAbstraction> i = ades.getDesComponents().iterator(); i.hasNext();) {
//			CompAbstraction object = (CompAbstraction) i.next();
//			System.out.println("\n	" + object.getInstanceName());
//			for (Iterator<PortCompPair> j = object.getPortToRefComponentPair().iterator(); j.hasNext();) {
//				PortCompPair obj = (PortCompPair) j.next();
//				System.out.println("		" + obj.getPort() + "	" + obj.getRefComp().getInstanceName());
//			}
//			System.out.println("Parameters: ");
//			for (Iterator<Parameter> j = object.getParameters().iterator(); j.hasNext();) {
//				Parameter obj = (Parameter) j.next();
//				System.out.println("		" + obj.getParameter() + ": " + obj.getValue());
//			}
//		}
//	}

	// Assumes ades and bdes are static objects which comes from
	// GlobalVars.GENERATIV_RULES
	public void FindCommonComponents(DesignAbstraction ades, DesignAbstraction bdes) {

		ades.ResetMapped();
		bdes.ResetMapped();

		for (Iterator<CompAbstraction> i = ades.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			for (Iterator<CompAbstraction> j = bdes.getDesComponents().iterator(); j.hasNext();) {
				CompAbstraction obj = (CompAbstraction) j.next();
				if (obj.getMapped() == 0) {
					if (!obj.getIS_BUS()) {
						if (obj.IsEquivalent(object,false)) {
							System.out.println("Design Generation: Non-Strict Equivalent Component found for Generative Rule: " + object.getInstanceName()
									+ "==" + obj.getInstanceName());
							obj.setMapped(2);
							object.setMapped(2);
							break;
						}
						if (object.IsEquivalent(obj,true)) {
							System.out.println("Design Generation: Strict Equivalent Component found for Generative Rule: " + object.getInstanceName()
									+ "==" + obj.getInstanceName());
							obj.setMapped(1);
							object.setMapped(1);
							break;
						}
					}
				}
			}
		}
		System.out.println("Design Generation: Equivalence check Summary");
		System.out.println("	Design: " + ades.getDesign().getName());
		for (Iterator<CompAbstraction> i = ades.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			System.out.println("	" + object.getInstanceName() + ": " + object.getMapped());
		}
		System.out.println("	Design: " + bdes.getDesign().getName());
		for (Iterator<CompAbstraction> i = bdes.getDesComponents().iterator(); i.hasNext();) {
			CompAbstraction object = (CompAbstraction) i.next();
			System.out.println("	" + object.getInstanceName() + ": " + object.getMapped());
		}
	} // FindCommonComponents(DesignAbstraction ades, DesignAbstraction bdes) finishes here
	

} // Class Design Generation Ends

