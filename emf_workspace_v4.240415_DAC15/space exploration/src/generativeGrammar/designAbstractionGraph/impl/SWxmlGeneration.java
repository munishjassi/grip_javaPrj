package generativeGrammar.designAbstractionGraph.impl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.w3schools.ApplicationType;
import com.w3schools.DocumentRoot;
import com.w3schools.Hwmapping;
import com.w3schools.SubmoduleType;
import com.w3schools.W3schoolsPackage;
import com.w3schools.util.W3schoolsResourceFactoryImpl;

import generativeGrammar.designAbstractionGraph.SWrule;
import generativeGrammar.utils.SWmappingPair;


public class SWxmlGeneration {

	public void GenerateNewSWxml(SWrule swrule, String inputSWxml, String outSWxml) {
		
		System.out.println();
		System.out.println("Calling Function: SWxmlGeneration.GenerateNewSWxml(String inputSWxml, SWrule rule)");

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new W3schoolsResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(W3schoolsPackage.eNS_URI, W3schoolsPackage.eINSTANCE);

		// Demand load resource for this file.
		URI uri = URI.createFileURI(inputSWxml);
		Resource resource = resourceSet.getResource(uri, true);
		System.out.println();
		System.out.println("LOADED " + uri);
		System.out.println("Traversing EMF EObject " + inputSWxml);
		DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
		ApplicationType rootTreeNode = documentRoot.getApplication();

		List<SubmoduleType> submodules = rootTreeNode.getSubmodules().getSubmodule();
		List<SWmappingPair> mappings = swrule.getMappings();
		
		for (Iterator<SWmappingPair> i = mappings.iterator(); i.hasNext();) {
			SWmappingPair object = (SWmappingPair) i.next();
			String swtask = object.getSwTask();
			String hwmodule = object.getHwModule();
 
			for (Iterator<SubmoduleType> j = submodules.iterator(); j.hasNext();) {
				SubmoduleType obj = (SubmoduleType) j.next();
				String name = obj.getModulename();
 
				if (name.equalsIgnoreCase(swtask)) {
					obj.getSpecifications().setMapping(hwmodule.toString());
				}
			}
		}
		
		try {
		Resource resource2 = resourceSet.createResource(URI.createFileURI(outSWxml));
		resource2.getContents().add(rootTreeNode);
		resource2.save(null);
		} catch (IOException e) {
			System.out.println("Problem writing " + outSWxml);
			e.printStackTrace();
		}
	}
	
	public void ComputePerformances(String inputSWxml) {
		System.out.println();
		System.out.println("Calling Function: SWxmlGeneration.GenerateNewSWxml(String inputSWxml, SWrule rule)");

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new W3schoolsResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		resourceSet.getPackageRegistry().put(W3schoolsPackage.eNS_URI, W3schoolsPackage.eINSTANCE);

		// Demand load resource for this file.
		URI uri = URI.createFileURI(inputSWxml);
		Resource resource = resourceSet.getResource(uri, true);
		System.out.println();
		System.out.println("LOADED " + uri);
		System.out.println("Traversing EMF EObject " + inputSWxml);
		DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
		ApplicationType rootTreeNode = documentRoot.getApplication();
		List<SubmoduleType> submodules = rootTreeNode.getSubmodules().getSubmodule();

		int cpucycles = 0;
		int buscycles = 0;
		
		for (Iterator<SubmoduleType> i = submodules.iterator(); i.hasNext();) {
			SubmoduleType object = (SubmoduleType) i.next();
			String mapping = object.getSpecifications().getMapping();
			List<Hwmapping> hwmappings = object.getHwmappings().getHwmapping();
			for (Iterator<Hwmapping> j = hwmappings.iterator(); j.hasNext();) {
				Hwmapping obj = (Hwmapping) j.next();
				if (mapping.equalsIgnoreCase(obj.getMappingname().toString())) {
					cpucycles += obj.getPerformance().getCpucycles();
					buscycles += obj.getPerformance().getBuscycles();
					System.out.println("Adding performances for Task: " + object.getModulename() + 
									" CPU cycles:" + obj.getPerformance().getCpucycles() +
									" Bus cycles:" + obj.getPerformance().getBuscycles());
				}
			}
		}

		System.out.println("Total performances for Application: " + rootTreeNode.getSpecifications().getApplicationname() + 
				" CPU cycles:" + cpucycles +
				" Bus cycles:" + buscycles);

		rootTreeNode.getSpecifications().setCpucycles(cpucycles);
		rootTreeNode.getSpecifications().setBuscycles(buscycles);
		
		try {
			//resource.getContents().add(rootTreeNode);
			resource.save(null);
			} catch (IOException e) {
				System.out.println("Problem writing " + inputSWxml);
				e.printStackTrace();
			}
	}
}
