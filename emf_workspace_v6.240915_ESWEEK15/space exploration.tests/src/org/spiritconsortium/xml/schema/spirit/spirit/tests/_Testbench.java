package org.spiritconsortium.xml.schema.spirit.spirit.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.w3schools.ApplicationType;
import com.w3schools.DocumentRoot;
import com.w3schools.W3schoolsPackage;
import com.w3schools.util.W3schoolsResourceFactoryImpl;

public class _Testbench {


	public static void main(String[] args) throws IOException {
		
		System.out.printf("Entering the Main() function");

		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new W3schoolsResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(W3schoolsPackage.eNS_URI, W3schoolsPackage.eINSTANCE);

		
		URI uri = URI.createFileURI("../data/sw/out");

		try {
			// Demand load resource for this file.
			//
			Resource resource = resourceSet.getResource(uri, true);
			System.out.println();
			System.out.println("LOADED " + uri);
			// Munish Commented
			// resource.save(System.out, null);
			// System.out.println();

			System.out.println("Traversing EMF EObject");

			DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);
			ApplicationType rootTreeNode = documentRoot.getApplication();

			EClass rootTreeClass = rootTreeNode.eClass();

			System.out.println(rootTreeNode.getSubmodules().getSubmodule().get(1).getHwmappings().getHwmapping().get(1).getMappingname());
			System.out.println(rootTreeNode.getSubmodules().getLoop().get(1).getSpecifications().getStartsubmodule());

	
	} catch (RuntimeException exception) {
		System.out.println("Problem loading " + uri);
		exception.printStackTrace();
	}
		
	System.out.printf("\nI am put here in example test end");
	}
}
