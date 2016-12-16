package org.spiritconsortium.xml.schema.spirit.spirit.tests;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;

public class _MyEMFEdit {

	  /**
	   * When running this examle as an Eclipse project, 
	   * the current directory will be the root folder of the project.
	   */
	  public static final String WORKING_FOLDER;
	  static
	  {
	    String result = "."; 
	    try
	    {
	      result = new File(".").getCanonicalPath() + "/";
	    }
	    catch (Exception exception)
	    {
	    }
	    WORKING_FOLDER = result;
	  }
	  
	  /**
	   * We will store data files in the "data" subfolder of the project.
	   */
	  public static final String DATA_FOLDER = WORKING_FOLDER + "data/";
	  
	  

public static void main(String[] args) throws Exception
{
  //demonstrateDOMCreateAndSave();
  //demonstrateDOMLoadAndTraverse();
  //demonstateEMFDOMCreateAndSave();
  //demonstrateEMFDOMLoadAndTraverse();
  //demonstrateSchema();
  demonstrateDynamicSchemaLoad();
  //demonstrateStaticLoadAndTraverse();
  //demonstrateMultiResourceStaticLoadAndTraverse();
  //demonstrateEMFUsingFactory();
}

private static void demonstrateDynamicSchemaLoad() throws IOException {
	// TODO Auto-generated method stub
	System.out.println("EMF Dynamic Load Schema");
    
    // Set up the context as before.
    //
    ResourceSet resourceSet = new ResourceSetImpl();
    final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(resourceSet.getPackageRegistry());
    resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
      (Resource.Factory.Registry.DEFAULT_EXTENSION, 
       new GenericXMLResourceFactoryImpl());
       
    // Load the example resource containing the xsi:schemaLocation,
    // and display what's loaded.
    //
    
    //Resource resource = resourceSet.getResource(URI.createFileURI(DATA_FOLDER + "System.xml"), true);
    Resource resource = resourceSet.getResource(URI.createFileURI(DATA_FOLDER + "../../space exploration/model/spirit.ecore"), true);
    resource.save(System.out, null);
    System.out.println();
    
    System.out.println("Traversing EMF EObject");
    
    // Fetch the root object as before.
    //
    EObject documentRoot = (EObject)resource.getContents().get(0);
    EObject rootTreeNode = (EObject)documentRoot.eContents().get(0);

    EPackage treePackage = (EPackage)resource.getContents().get(0);
    EClass rootTreeClass = rootTreeNode.eClass();
    
    
    
    System.out.println(rootTreeClass.getEStructuralFeature("mixed"));
 
    for (Iterator iter = rootTreeClass.getEAllAttributes().iterator(); iter.hasNext();)
    {
    	EAttribute attribute = (EAttribute)iter.next();
    	//Object value = object.
    	System.out.println("  " + attribute.getName());
    	
    }
    for (Iterator iter = treePackage.getEClassifiers().iterator(); iter.hasNext();)
    {
    	EClassifier classifier = (EClassifier)iter.next();
    	//Object value = object.
    	System.out.println("  Classfier" + classifier.getName());
    }
    
    
    System.out.println(WORKING_FOLDER);
     
    final EStructuralFeature mixedFeature = extendedMetaData.getMixedFeature(rootTreeNode.eClass());
    final EStructuralFeature vendorAttribute = extendedMetaData.getAttribute(rootTreeNode.eClass(), null, "spirit:vendor");
    final EStructuralFeature referencesAttribute = extendedMetaData.getAttribute(rootTreeNode.eClass(), null, "references");
    final EStructuralFeature name = extendedMetaData.getAttribute(rootTreeNode.eClass(), null, "name");
    final EStructuralFeature munishElement = extendedMetaData.getElement(rootTreeNode.eClass(), null, "muniNode");
    final EStructuralFeature childElement = extendedMetaData.getElement(rootTreeNode.eClass(), null, "spirit:componentInstances");
    final EStructuralFeature vendorElement = extendedMetaData.getElement(rootTreeNode.eClass(), null, "vendor");

    final EStructuralFeature nameAttribute = extendedMetaData.getAttribute(rootTreeNode.eClass(), null, "instanceName");

    new Object()
    {
      public void traverse(String indent, EObject eObject)
      {
    	//  ((TreeNode)eObject).getMuniNodes().add("Just added");
  		//eObject.eClass().getEStructuralFeatures().add(eObject.eClass().getEStructuralFeature(1));
  //		System.out.println("eObject Structure >>>" + eObject.eClass().getEStructuralFeatures());
    	    EClass eClass = eObject.eClass();
    	    //EStructuralFeature fea = eObject.eClass().getEStructuralFeature("muniNode");
 //   	    eObject.eSet(fea, "NNN");
    	    
    	   // System.out.println("InstanceName :" +eClass.getEStructuralFeature("nameAttribute"));
    	   // System.out.println("Class Name :" +eClass.getEStructuralFeature("name"));
    	    
    	    FeatureMap featureMap = (FeatureMap)eObject.eGet(mixedFeature);
    	    //      featureMap.add(6, munishElement, "adf");
 //   	    System.out.println("FEATUREMAP:::::" + featureMap.toString());
    	    
            for (int i = 0, size = featureMap.size(); i < size; ++i)
            {
              EStructuralFeature feature = featureMap.getEStructuralFeature(i);         
  //           System.out.println("FEATURE:: " + featureMap.size()+ "/"+ i + " :::" + feature.getEContainingClass() + featureMap.getValue(i));

             if (feature instanceof EReference)
             {
  //        	    System.out.println("Feature is EReference");
 //          	    System.out.println("EReference Feature  :" +featureMap.getValue(i));
               traverse(indent + "  ", (EObject)featureMap.getValue(i));

             } else if (feature instanceof EAttribute)
             {
            //	  System.out.println("Feature is EAttribute");
             	  System.out.println("EAttribute Feature  :" +feature.getName() );
 //            	 System.out.println("EAttribute Feature :"+ featureMap.size()+ "/"+ i +"  " + featureMap.getValue(i));
             } else 
             {
           	    System.out.println("Other Feature  :" +feature);
             }

             
            }
    	          
      }
      
    }.traverse("", rootTreeNode);   
    	  
}


}
