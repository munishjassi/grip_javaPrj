/**
 */
package com.w3schools.impl;

import com.w3schools.AppSpecificationsType;
import com.w3schools.ApplicationType;
import com.w3schools.Description;
import com.w3schools.DocumentRoot;
import com.w3schools.Hwmapping;
import com.w3schools.Hwmappings;
import com.w3schools.LoopSpecificationsType;
import com.w3schools.LoopType;
import com.w3schools.ModSpecificationsType;
import com.w3schools.Performance;
import com.w3schools.SubmoduleType;
import com.w3schools.SubmodulesType;
import com.w3schools.W3schoolsFactory;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class W3schoolsPackageImpl extends EPackageImpl implements W3schoolsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appSpecificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwmappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwmappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopSpecificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modSpecificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submodulesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submoduleTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.w3schools.W3schoolsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private W3schoolsPackageImpl() {
		super(eNS_URI, W3schoolsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link W3schoolsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static W3schoolsPackage init() {
		if (isInited) return (W3schoolsPackage)EPackage.Registry.INSTANCE.getEPackage(W3schoolsPackage.eNS_URI);

		// Obtain or create and register package
		W3schoolsPackageImpl theW3schoolsPackage = (W3schoolsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof W3schoolsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new W3schoolsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theW3schoolsPackage.createPackageContents();

		// Initialize created meta-data
		theW3schoolsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theW3schoolsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(W3schoolsPackage.eNS_URI, theW3schoolsPackage);
		return theW3schoolsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationType() {
		return applicationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationType_Specifications() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationType_Submodules() {
		return (EReference)applicationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppSpecificationsType() {
		return appSpecificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppSpecificationsType_Applicationname() {
		return (EAttribute)appSpecificationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppSpecificationsType_Cpucycles() {
		return (EAttribute)appSpecificationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppSpecificationsType_Buscycles() {
		return (EAttribute)appSpecificationsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Cdescription() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Cppdescription() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Asmdescription() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Application() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Specifications() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Submodules() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwmapping() {
		return hwmappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHwmapping_Mappingname() {
		return (EAttribute)hwmappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwmapping_Performance() {
		return (EReference)hwmappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwmapping_Description() {
		return (EReference)hwmappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwmappings() {
		return hwmappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwmappings_Hwmapping() {
		return (EReference)hwmappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopSpecificationsType() {
		return loopSpecificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopSpecificationsType_Loopname() {
		return (EAttribute)loopSpecificationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopSpecificationsType_Number() {
		return (EAttribute)loopSpecificationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopSpecificationsType_Startsubmodule() {
		return (EAttribute)loopSpecificationsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopType() {
		return loopTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopType_Specifications() {
		return (EReference)loopTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModSpecificationsType() {
		return modSpecificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModSpecificationsType_Mapping() {
		return (EAttribute)modSpecificationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModSpecificationsType_Mode() {
		return (EAttribute)modSpecificationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformance() {
		return performanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Cpucycles() {
		return (EAttribute)performanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerformance_Buscycles() {
		return (EAttribute)performanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmodulesType() {
		return submodulesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmodulesType_Submodule() {
		return (EReference)submodulesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmodulesType_Loop() {
		return (EReference)submodulesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubmoduleType() {
		return submoduleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubmoduleType_Modulename() {
		return (EAttribute)submoduleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmoduleType_Specifications() {
		return (EReference)submoduleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubmoduleType_Hwmappings() {
		return (EReference)submoduleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3schoolsFactory getW3schoolsFactory() {
		return (W3schoolsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		applicationTypeEClass = createEClass(APPLICATION_TYPE);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__SPECIFICATIONS);
		createEReference(applicationTypeEClass, APPLICATION_TYPE__SUBMODULES);

		appSpecificationsTypeEClass = createEClass(APP_SPECIFICATIONS_TYPE);
		createEAttribute(appSpecificationsTypeEClass, APP_SPECIFICATIONS_TYPE__APPLICATIONNAME);
		createEAttribute(appSpecificationsTypeEClass, APP_SPECIFICATIONS_TYPE__CPUCYCLES);
		createEAttribute(appSpecificationsTypeEClass, APP_SPECIFICATIONS_TYPE__BUSCYCLES);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__CDESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__CPPDESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__ASMDESCRIPTION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPLICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPECIFICATIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBMODULES);

		hwmappingEClass = createEClass(HWMAPPING);
		createEAttribute(hwmappingEClass, HWMAPPING__MAPPINGNAME);
		createEReference(hwmappingEClass, HWMAPPING__PERFORMANCE);
		createEReference(hwmappingEClass, HWMAPPING__DESCRIPTION);

		hwmappingsEClass = createEClass(HWMAPPINGS);
		createEReference(hwmappingsEClass, HWMAPPINGS__HWMAPPING);

		loopSpecificationsTypeEClass = createEClass(LOOP_SPECIFICATIONS_TYPE);
		createEAttribute(loopSpecificationsTypeEClass, LOOP_SPECIFICATIONS_TYPE__LOOPNAME);
		createEAttribute(loopSpecificationsTypeEClass, LOOP_SPECIFICATIONS_TYPE__NUMBER);
		createEAttribute(loopSpecificationsTypeEClass, LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE);

		loopTypeEClass = createEClass(LOOP_TYPE);
		createEReference(loopTypeEClass, LOOP_TYPE__SPECIFICATIONS);

		modSpecificationsTypeEClass = createEClass(MOD_SPECIFICATIONS_TYPE);
		createEAttribute(modSpecificationsTypeEClass, MOD_SPECIFICATIONS_TYPE__MAPPING);
		createEAttribute(modSpecificationsTypeEClass, MOD_SPECIFICATIONS_TYPE__MODE);

		performanceEClass = createEClass(PERFORMANCE);
		createEAttribute(performanceEClass, PERFORMANCE__CPUCYCLES);
		createEAttribute(performanceEClass, PERFORMANCE__BUSCYCLES);

		submodulesTypeEClass = createEClass(SUBMODULES_TYPE);
		createEReference(submodulesTypeEClass, SUBMODULES_TYPE__SUBMODULE);
		createEReference(submodulesTypeEClass, SUBMODULES_TYPE__LOOP);

		submoduleTypeEClass = createEClass(SUBMODULE_TYPE);
		createEAttribute(submoduleTypeEClass, SUBMODULE_TYPE__MODULENAME);
		createEReference(submoduleTypeEClass, SUBMODULE_TYPE__SPECIFICATIONS);
		createEReference(submoduleTypeEClass, SUBMODULE_TYPE__HWMAPPINGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(applicationTypeEClass, ApplicationType.class, "ApplicationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationType_Specifications(), this.getAppSpecificationsType(), null, "specifications", null, 1, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationType_Submodules(), this.getSubmodulesType(), null, "submodules", null, 1, 1, ApplicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appSpecificationsTypeEClass, AppSpecificationsType.class, "AppSpecificationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppSpecificationsType_Applicationname(), theXMLTypePackage.getString(), "applicationname", null, 1, 1, AppSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppSpecificationsType_Cpucycles(), theXMLTypePackage.getInt(), "cpucycles", null, 1, 1, AppSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppSpecificationsType_Buscycles(), theXMLTypePackage.getInt(), "buscycles", null, 1, 1, AppSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Cdescription(), theXMLTypePackage.getString(), "cdescription", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Cppdescription(), theXMLTypePackage.getString(), "cppdescription", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Asmdescription(), theXMLTypePackage.getString(), "asmdescription", null, 1, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Application(), this.getApplicationType(), null, "application", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Specifications(), this.getAppSpecificationsType(), null, "specifications", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Submodules(), this.getSubmodulesType(), null, "submodules", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hwmappingEClass, Hwmapping.class, "Hwmapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHwmapping_Mappingname(), theXMLTypePackage.getString(), "mappingname", null, 1, 1, Hwmapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwmapping_Performance(), this.getPerformance(), null, "performance", null, 1, 1, Hwmapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHwmapping_Description(), this.getDescription(), null, "description", null, 1, 1, Hwmapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hwmappingsEClass, Hwmappings.class, "Hwmappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwmappings_Hwmapping(), this.getHwmapping(), null, "hwmapping", null, 1, -1, Hwmappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopSpecificationsTypeEClass, LoopSpecificationsType.class, "LoopSpecificationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoopSpecificationsType_Loopname(), theXMLTypePackage.getString(), "loopname", null, 1, 1, LoopSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopSpecificationsType_Number(), theXMLTypePackage.getString(), "number", null, 1, 1, LoopSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoopSpecificationsType_Startsubmodule(), theXMLTypePackage.getString(), "startsubmodule", null, 1, 1, LoopSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopTypeEClass, LoopType.class, "LoopType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopType_Specifications(), this.getLoopSpecificationsType(), null, "specifications", null, 1, 1, LoopType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modSpecificationsTypeEClass, ModSpecificationsType.class, "ModSpecificationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModSpecificationsType_Mapping(), theXMLTypePackage.getString(), "mapping", null, 1, 1, ModSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModSpecificationsType_Mode(), theXMLTypePackage.getString(), "mode", null, 1, 1, ModSpecificationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceEClass, Performance.class, "Performance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformance_Cpucycles(), theXMLTypePackage.getInt(), "cpucycles", null, 1, 1, Performance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerformance_Buscycles(), theXMLTypePackage.getInt(), "buscycles", null, 1, 1, Performance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submodulesTypeEClass, SubmodulesType.class, "SubmodulesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubmodulesType_Submodule(), this.getSubmoduleType(), null, "submodule", null, 1, -1, SubmodulesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmodulesType_Loop(), this.getLoopType(), null, "loop", null, 1, -1, SubmodulesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submoduleTypeEClass, SubmoduleType.class, "SubmoduleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmoduleType_Modulename(), theXMLTypePackage.getString(), "modulename", null, 1, 1, SubmoduleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmoduleType_Specifications(), this.getModSpecificationsType(), null, "specifications", null, 1, 1, SubmoduleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmoduleType_Hwmappings(), this.getHwmappings(), null, "hwmappings", null, 1, 1, SubmoduleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (applicationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "application_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getApplicationType_Specifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "specifications",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getApplicationType_Submodules(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submodules",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (appSpecificationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "appSpecificationsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAppSpecificationsType_Applicationname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "applicationname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAppSpecificationsType_Cpucycles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cpucycles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAppSpecificationsType_Buscycles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "buscycles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (descriptionEClass, 
		   source, 
		   new String[] {
			 "name", "description",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDescription_Cdescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cdescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDescription_Cppdescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cppdescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDescription_Asmdescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "asmdescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Application(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "application",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Specifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "specifications",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Submodules(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submodules",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hwmappingEClass, 
		   source, 
		   new String[] {
			 "name", "hwmapping",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHwmapping_Mappingname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mappingname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHwmapping_Performance(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "performance",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHwmapping_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (hwmappingsEClass, 
		   source, 
		   new String[] {
			 "name", "hwmappings",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHwmappings_Hwmapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hwmapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (loopSpecificationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "loopSpecificationsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLoopSpecificationsType_Loopname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "loopname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLoopSpecificationsType_Number(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "number",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLoopSpecificationsType_Startsubmodule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "startsubmodule",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (loopTypeEClass, 
		   source, 
		   new String[] {
			 "name", "loopType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLoopType_Specifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "specifications",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modSpecificationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "modSpecificationsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModSpecificationsType_Mapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mapping",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModSpecificationsType_Mode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (performanceEClass, 
		   source, 
		   new String[] {
			 "name", "performance",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPerformance_Cpucycles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cpucycles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPerformance_Buscycles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "buscycles",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (submodulesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "submodulesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubmodulesType_Submodule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "submodule",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubmodulesType_Loop(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "loop",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (submoduleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "submoduleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubmoduleType_Modulename(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modulename",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubmoduleType_Specifications(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "specifications",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubmoduleType_Hwmappings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hwmappings",
			 "namespace", "##targetNamespace"
		   });
	}

} //W3schoolsPackageImpl
