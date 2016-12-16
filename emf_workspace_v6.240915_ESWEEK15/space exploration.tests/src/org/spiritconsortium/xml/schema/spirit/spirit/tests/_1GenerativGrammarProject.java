/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */


package org.spiritconsortium.xml.schema.spirit.spirit.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;
import org.spiritconsortium.xml.schema.spirit.spirit.util._1ResourceFactoryImpl;
import com.rits.cloning.Cloner;
import generativeGrammar.designAbstractionGraph.DesignAbstraction;
import generativeGrammar.designAbstractionGraph.GlobalVars;
import generativeGrammar.designAbstractionGraph.SWrule;
import generativeGrammar.designAbstractionGraph.impl.DesignAbstractionImpl;
import generativeGrammar.designAbstractionGraph.impl.DesignGeneration;
import generativeGrammar.designAbstractionGraph.impl.LibAbstractionGenerateImpl;
import generativeGrammar.designAbstractionGraph.impl.SWxmlGeneration;
import generativeGrammar.utils.GenerativRulePair;
import generativeGrammar.utils.SWmappingPair;

/**
 * <!-- begin-user-doc --> A sample utility for the '<em><b>spirit</b></em>'
 * package. <!-- end-user-doc -->
 * 
 * @generated
 */
public class _1GenerativGrammarProject {
	/**
	 * <!-- begin-user-doc --> Load all the argument file paths or URIs as
	 * instances of the model. <!-- end-user-doc -->
	 * 
	 * @param args
	 *            the file paths or URIs.
	 * @throws IOException
	 * @generated
	 */
	
	public static void main(String[] args) throws IOException {
		// Create a resource set to hold the resources.
		//

		System.out.printf("Entering the Main() function");

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new _1ResourceFactoryImpl());
		
		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(_1Package.eNS_URI, _1Package.eINSTANCE);

		URI uri = URI.createFileURI("../data/hw/System_temp.xml");

		try {
			// ####################################################
			// KEEP THIS CODE FOR FUTURE REFERENCES FOR LOAD DESIGN
			// ####################################################
			
			//
			// Demand load resource for this file.
			//
			/*
			Resource resource = resourceSet.getResource(uri, true);
			System.out.println();
			System.out.println("LOADED " + uri);
			System.out.println("Traversing EMF EObject");

			List<DesignType> designs = new ArrayList<DesignType>();	
			List<DesignAbstraction> allDesigns = new ArrayList<DesignAbstraction>();
			DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
			DesignType rootTreeNode = documentRoot.getDesign();
			EClass rootTreeClass = rootTreeNode.eClass();
			System.out.println(rootTreeClass.getEStructuralFeature("vendor"));
			final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
			resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
			
			designs.add(rootTreeNode);
			designs.add(rootTreeNode);
			
			InterconnectionsType interconnections = rootTreeNode.getInterconnections();
			List<InterconnectionType> interconnectionsList = interconnections.getInterconnection();

			ComponentInstancesType components = rootTreeNode.getComponentInstances();
			List<ComponentInstanceType> componentsList = components.getComponentInstance();

			System.out.println("\nDesign Components Found: ");
			for (Iterator<ComponentInstanceType> j = componentsList.iterator(); j.hasNext();) {
				ComponentInstanceType object = (ComponentInstanceType) j.next();
				System.out.printf("%-20s" + "\t Component Ref: " + object.getComponentRef() + "\n", object.getInstanceName());

			}

			System.out.println("Interconnects Found: ");
			for (Iterator<InterconnectionType> j = interconnectionsList.iterator(); j.hasNext();) {
				InterconnectionType object = (InterconnectionType) j.next();
				System.out.printf("%-40s" + "   Active Interfaces:" + object.getActiveInterface() + "\n", object.getName());
			}
			System.out.println("\nLoaded " + uri);

			*/
			
			// ####################################################
			// KEEP THIS CODE FOR FUTURE REFERENCES FOR LOAD DESIGN
			// ####################################################
			
			
//---------------------------------------- LIBRARY CHARACTERIZATION -----------
			
			//
			//	Library characterization: Generation of IP-Xact for library elements
			//
			LibAbstractionGenerateImpl GenerateLib = new LibAbstractionGenerateImpl();
			GlobalVars.LIBRARY = GenerateLib.GenerateLibAbstraction(GlobalVars.LIB_DIR_PATH);			
			GenerateLib.PrintLibraryGenSummary(GlobalVars.LIBRARY);

//---------------------------------------- LIBRARY CHARACTERIZATION FINISH -----
											
//---------------------------------------- LOAD INITIAL DESIGN -----------------
			
			//
			// Load Input design: Architectural Graph Representation (AGR)
			// Input is the String to directory path with Design and Component description
			//
			DesignAbstractionImpl designAbs = new DesignAbstractionImpl();
			designAbs.genGraph(GlobalVars.InDes);
			GlobalVars.TOP_DESIGN = designAbs;
			GlobalVars.ALL_DESIGNS.add(designAbs);
			
//---------------------------------------- LOAD INITIAL DESIGN FINISH ----------
						
//---------------------------------------- GRIP HW RULES ----------------------
			
			// 
			// Adding Single GRIP rule
			//
			
			/*
			// Left side pattern input and conversion to Architecture graph
			DesignAbstractionImpl leftpat1 = new DesignAbstractionImpl();
			leftpat1.genGraph(GlobalVars.ApplyRule + "/leftpat");
			leftpat1.PrintDesignSummary();
			// Right side pattern input and conversion to Architecture graph
			DesignAbstractionImpl rightpat1 = new DesignAbstractionImpl();
			rightpat1.genGraph(GlobalVars.ApplyRule + "/rightpat");
			rightpat1.PrintDesignSummary();
			// Creation of Rule pair for Rule1
			GenerativRulePair gp = new GenerativRulePair(leftpat1, rightpat1);
			*/
			
			// 
			// Adding multiple GRIP rules at a time
			//
			
			for (Iterator<String> i= GlobalVars.ApplyRules.iterator(); i.hasNext();) {
				String rule = i.next();
				GenerativRulePair gp = new GenerativRulePair(rule);
				GlobalVars.GENERATV_HW_RULES.add(gp);
			}
						

//---------------------------------------- GRIP HW RULES FINISH --------------
			
			

//---------------------------------------- GRIP SW RULES ----------------------
			
			//
			// Define SW mappings. Define SW rules
			// 
			SWmappingPair map1 = new SWmappingPair();
			SWmappingPair map2 = new SWmappingPair();
			SWrule swrule1 = new SWrule();
			SWrule swrule2 = new SWrule();
	
			map1.setSWruleMapping("Task1", "DMA");
			map2.setSWruleMapping("Task2", "hwacc1");
			
			swrule1.setRuleName("Rule1");
			swrule2.setRuleName("Rule2");
			swrule1.addMappings(map1);
			swrule2.addMappings(map2);
			
//---------------------------------------- GRIP SW RULES FINISH ----------------

			
			
//---------------------------------------- APPLY GRIP RULES --------------------
	

			//
			// Applying Single GRIP Rule on Input design to generate new Design
			//
/*
			DesignGeneration generateDesign = new DesignGeneration();
			DesignAbstraction genDes = generateDesign.GenerateNewDesign(designAbs, GlobalVars.GENERATV_HW_RULES.get(0));

			// Generate IPXACT output design
			File f = new File(GlobalVars.OutDes);
			if(f.exists() && f.isDirectory()) {
				new File(GlobalVars.OutDes).mkdir();
			}
			
			genDes.getDesign().setName("System");
			generateDesign.GenerateIPXACT(GlobalVars.OutDes, genDes);
			// generateDesign.GenerateIPXACT("../data/hw/arch3_arm1/System.design.1.0.xml", "../data/hw/archn1", genDes);

			// Generate MHS for ZedBoard prototyping
			designAbs.RefineAdHocConnections();
			designAbs.SetAdHocConnectionNames();
			generateDesign.GenerateMHS(GlobalVars.OutDes + "/System.input.mhs", designAbs);
			generateDesign.GenerateMHS(GlobalVars.OutDes + "/System.mhs", genDes);
			
			GlobalVars.ALL_DESIGNS.add(genDes);
			
*/
			//
			// Applying All GRIP Rules on the Input design as the seed-design to generate new Designs
			//
			designAbs.RefineAdHocConnections();
			designAbs.SetAdHocConnectionNames();
			
			List<DesignAbstraction> EndNodes = new ArrayList<DesignAbstraction>();
			List<DesignAbstraction> nEndNodes = new ArrayList<DesignAbstraction>();

			EndNodes.add(designAbs);
			int size = EndNodes.size();
			int cnt = 0;

			
			// RULE applications: Rule1.1 Rule2.1 Rule3.1
			for (Iterator<DesignAbstraction> j = EndNodes.iterator(); j.hasNext();) {
				DesignAbstraction nodeDes = (DesignAbstraction) j.next();		
				cnt = 0;
				for (Iterator<GenerativRulePair> i= GlobalVars.GENERATV_HW_RULES.iterator(); i.hasNext() && cnt < 3;) {
					GenerativRulePair rule = (GenerativRulePair)i.next();
					cnt++;

					// Applying Rules on Input design to generate new Design
					DesignGeneration generateDesign = new DesignGeneration();
					DesignAbstraction genDes = generateDesign.GenerateNewDesign(nodeDes, rule);

					
					// Code Generation: Generate IPXACT output design
					String dir = "archn1";
					int post = 1;
					File f = new File(GlobalVars.OutDir +"/" + dir);
					while (f.exists()) {
						post++;
						dir ="archn" +post;
						f = new File(GlobalVars.OutDir + "/" +dir);
					}
					new File(GlobalVars.OutDir +"/archn" + post).mkdir();
	
					genDes.getDesign().setName("System");
					generateDesign.GenerateIPXACT(GlobalVars.OutDir + "/" + dir, genDes);
	
					// Code Generation: Generate MHS for ZedBoard prototyping
					generateDesign.GenerateMHS(GlobalVars.OutDir + "/" + dir + "/System.input.mhs", nodeDes);
					generateDesign.GenerateMHS(GlobalVars.OutDir + "/" + dir + "/System.mhs", genDes);
					
					GlobalVars.ALL_DESIGNS.add(genDes);
					nEndNodes.add(genDes);
				}
			}
			
			while (size > 0) {
				EndNodes.remove(size-1);
				--size;
			}
			Cloner cloner = new Cloner();
			EndNodes =  cloner.deepClone(nEndNodes);
			
			size = nEndNodes.size();
			while (size > 0) {
				nEndNodes.remove(size-1);
				--size;
			}
			
			// RULE applications: Rule2.2 Rule2.3 Rule3.2 Rule3.3
			for (Iterator<DesignAbstraction> j = EndNodes.iterator(); j.hasNext();) {
				DesignAbstraction nodeDes = (DesignAbstraction) j.next();		
				cnt = 0;
				for (Iterator<GenerativRulePair> i= GlobalVars.GENERATV_HW_RULES.iterator(); i.hasNext();) {
					GenerativRulePair rule = (GenerativRulePair)i.next();
					cnt++;
					if (cnt > 3) {
						// Applying Rules on Input design to generate new Design
						DesignGeneration generateDesign = new DesignGeneration();
						DesignAbstraction genDes = generateDesign.GenerateNewDesign(nodeDes, rule);
						if (genDes== null) {
							System.out.println("ERROR: RULE APPLICATION FAILED");
							break;
						}
						
						// Code Generation: Generate IPXACT output design
						String dir = "archn1";
						int post = 1;
						File f = new File(GlobalVars.OutDir +"/" + dir);
						while (f.exists()) {
							post++;
							dir ="archn" +post;
							f = new File(GlobalVars.OutDir + "/" +dir);
						}
						new File(GlobalVars.OutDir +"/archn" + post).mkdir();
		
						genDes.getDesign().setName("System");
						generateDesign.GenerateIPXACT(GlobalVars.OutDir + "/" + dir, genDes);
		
						// Code Generation: Generate MHS for ZedBoard prototyping
						generateDesign.GenerateMHS(GlobalVars.OutDir + "/" + dir + "/System.input.mhs", nodeDes);
						generateDesign.GenerateMHS(GlobalVars.OutDir + "/" + dir + "/System.mhs", genDes);
						
						GlobalVars.ALL_DESIGNS.add(genDes);
						nEndNodes.add(genDes);
					}
				}
			}
			
			
//---------------------------------------- APPLY GRIP RULES FINISH --------------
			
			
			
//---------------------------------------- DESIGN UNIQUIFICATION ----------------
			for (int i = 0 ; i < GlobalVars.ALL_DESIGNS.size(); i++) {

				// Design summary of all the DSE found designs
				GlobalVars.ALL_DESIGNS.get(i).PrintDesignSummary();
				
				//
				//  Use Uniquification function in required  
				//  Uniquification of the design to rectify the interdependencies of the components
				//
				/*	
			 	GlobalVars.ALL_DESIGNS.get(i).UniquifyInstanceNames();
				System.out.println("POST UNIQUIFICATION");
				GlobalVars.ALL_DESIGNS.get(i).PrintDesignSummary();
				GlobalVars.ALL_DESIGNS.get(i).DesignDelineation();
				System.out.println("POST Delineation");
				GlobalVars.ALL_DESIGNS.get(i).PrintDesignSummary();
				*/
			}
			
//---------------------------------------- DESIGN UNIQUIFICATION FINISH ----------
			
//---------------------------------------- GENERATE SW XML -----------------------

			SWxmlGeneration swGenerationObj = new SWxmlGeneration();
			swGenerationObj.GenerateNewSWxml(swrule2, "../data/sw/out", "../data/sw/out_new");
			swGenerationObj.ComputePerformances("../data/sw/out");

//---------------------------------------- GENERATE SW XML FINISH ----------------
			
			//desigAbs = cloner.deepClone(designAbs);
			//GlobalVars.ALL_DESIGNS.add(desigAbs);
			
			//GlobalVars.ALL_DESIGNS.get(0).getDesComponents().get(0).setMapped(true);
			//System.out.println(GlobalVars.ALL_DESIGNS.get(0).getDesComponents().get(4).getPortTORefComponentPair().get(1).getRefComp().isMapped());
			//GlobalVars.ALL_DESIGNS.get(0).getDesComponents().get(0).setMapped(true);
			//System.out.println (GlobalVars.ALL_DESIGNS.get(0).getDesComponents().get(0).isMapped());
			//System.out.println (GlobalVars.ALL_DESIGNS.get(1).getDesComponents().get(0).isMapped());
			//System.out.println (GlobalVars.ALL_DESIGNS.get(0).getDesComponents().get(0).getInstanceName());			
			//System.out.println (GlobalVars.ALL_DESIGNS.get(1).getDesComponents().get(0).getInstanceName());

			
			/*
			 * new Object() { public void traverse(String indent, EObject
			 * eObject) { //
			 * ((TreeNode)eObject).getMuniNodes().add("Just added"); //eObject
			 * .eClass().getEStructuralFeatures().add(eObject.eClass
			 * ().getEStructuralFeature(1)); //
			 * System.out.println("eObject Structure >>>" +
			 * eObject.eClass().getEStructuralFeatures()); EClass eClass =
			 * eObject.eClass(); //EStructuralFeature fea =
			 * eObject.eClass().getEStructuralFeature("muniNode"); //
			 * eObject.eSet(fea, "NNN");
			 * 
			 * // System.out.println("InstanceName :"
			 * +eClass.getEStructuralFeature("nameAttribute")); //
			 * System.out.println("Class Name :"
			 * +eClass.getEStructuralFeature("name"));
			 * 
			 * FeatureMap featureMap =
			 * (FeatureMap)eObject.eGet(vendorAttribute); // featureMap.add(6,
			 * munishElement, "adf"); // System.out.println("FEATUREMAP:::::" +
			 * featureMap.toString());
			 * 
			 * for (int i = 0, size = featureMap.size(); i < size; ++i) {
			 * EStructuralFeature feature = featureMap.getEStructuralFeature(i);
			 * // System.out.println("FEATURE:: " + featureMap.size()+ "/"+ i +
			 * " :::" + feature.getEContainingClass() + featureMap.getValue(i));
			 * 
			 * if (feature instanceof EReference) { //
			 * System.out.println("Feature is EReference"); //
			 * System.out.println("EReference Feature  :"
			 * +featureMap.getValue(i)); traverse(indent + "  ",
			 * (EObject)featureMap.getValue(i));
			 * 
			 * } else if (feature instanceof EAttribute) { //
			 * System.out.println("Feature is EAttribute");
			 * System.out.println("EAttribute Feature  :" +feature.getName() );
			 * // System.out.println("EAttribute Feature :"+ featureMap.size()+
			 * "/"+ i +"  " + featureMap.getValue(i)); } else {
			 * System.out.println("Other Feature  :" +feature); }
			 * 
			 * }
			 * 
			 * }
			 * 
			 * }.traverse("", rootTreeNode);
			 */

		} catch (RuntimeException exception) {
			System.out.println("Problem loading " + uri);
			exception.printStackTrace();
		}
		System.out.printf("\nI am put here in example test end");

	}

	/**
	 * <!-- begin-user-doc --> Prints diagnostics with indentation. <!--
	 * end-user-doc -->
	 * 
	 * @param diagnostic
	 *            the diagnostic to print.
	 * @param indent
	 *            the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Iterator<Diagnostic> i = diagnostic.getChildren().iterator(); i.hasNext();) {
			printDiagnostic((Diagnostic) i.next(), indent + "  ");
		}
	}

} // _1Example
