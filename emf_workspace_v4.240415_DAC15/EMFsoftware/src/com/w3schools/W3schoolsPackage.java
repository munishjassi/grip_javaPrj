/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.w3schools.W3schoolsFactory
 * @model kind="package"
 * @generated
 */
public interface W3schoolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "w3schools";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3schools.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "w3schools";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	W3schoolsPackage eINSTANCE = com.w3schools.impl.W3schoolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.w3schools.impl.ApplicationTypeImpl <em>Application Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.ApplicationTypeImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getApplicationType()
	 * @generated
	 */
	int APPLICATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__SPECIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Submodules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE__SUBMODULES = 1;

	/**
	 * The number of structural features of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Application Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.AppSpecificationsTypeImpl <em>App Specifications Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.AppSpecificationsTypeImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getAppSpecificationsType()
	 * @generated
	 */
	int APP_SPECIFICATIONS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Applicationname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SPECIFICATIONS_TYPE__APPLICATIONNAME = 0;

	/**
	 * The feature id for the '<em><b>Cpucycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SPECIFICATIONS_TYPE__CPUCYCLES = 1;

	/**
	 * The feature id for the '<em><b>Buscycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SPECIFICATIONS_TYPE__BUSCYCLES = 2;

	/**
	 * The number of structural features of the '<em>App Specifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SPECIFICATIONS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>App Specifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_SPECIFICATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.DescriptionImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Cdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CDESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Cppdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CPPDESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Asmdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__ASMDESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.DocumentRootImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPECIFICATIONS = 4;

	/**
	 * The feature id for the '<em><b>Submodules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBMODULES = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.HwmappingImpl <em>Hwmapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.HwmappingImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getHwmapping()
	 * @generated
	 */
	int HWMAPPING = 4;

	/**
	 * The feature id for the '<em><b>Mappingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPING__MAPPINGNAME = 0;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPING__PERFORMANCE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPING__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Hwmapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hwmapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.HwmappingsImpl <em>Hwmappings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.HwmappingsImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getHwmappings()
	 * @generated
	 */
	int HWMAPPINGS = 5;

	/**
	 * The feature id for the '<em><b>Hwmapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPINGS__HWMAPPING = 0;

	/**
	 * The number of structural features of the '<em>Hwmappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hwmappings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HWMAPPINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.LoopSpecificationsTypeImpl <em>Loop Specifications Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.LoopSpecificationsTypeImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getLoopSpecificationsType()
	 * @generated
	 */
	int LOOP_SPECIFICATIONS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Loopname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_SPECIFICATIONS_TYPE__LOOPNAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_SPECIFICATIONS_TYPE__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Startsubmodule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE = 2;

	/**
	 * The number of structural features of the '<em>Loop Specifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_SPECIFICATIONS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Loop Specifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_SPECIFICATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.LoopTypeImpl <em>Loop Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.LoopTypeImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getLoopType()
	 * @generated
	 */
	int LOOP_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TYPE__SPECIFICATIONS = 0;

	/**
	 * The number of structural features of the '<em>Loop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Loop Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.ModSpecificationsTypeImpl <em>Mod Specifications Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.ModSpecificationsTypeImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getModSpecificationsType()
	 * @generated
	 */
	int MOD_SPECIFICATIONS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_SPECIFICATIONS_TYPE__MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_SPECIFICATIONS_TYPE__MODE = 1;

	/**
	 * The number of structural features of the '<em>Mod Specifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_SPECIFICATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mod Specifications Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_SPECIFICATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.PerformanceImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 9;

	/**
	 * The feature id for the '<em><b>Cpucycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__CPUCYCLES = 0;

	/**
	 * The feature id for the '<em><b>Buscycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__BUSCYCLES = 1;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.SubmodulesTypeImpl <em>Submodules Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.SubmodulesTypeImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getSubmodulesType()
	 * @generated
	 */
	int SUBMODULES_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Submodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULES_TYPE__SUBMODULE = 0;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULES_TYPE__LOOP = 1;

	/**
	 * The number of structural features of the '<em>Submodules Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Submodules Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.w3schools.impl.SubmoduleTypeImpl <em>Submodule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.w3schools.impl.SubmoduleTypeImpl
	 * @see com.w3schools.impl.W3schoolsPackageImpl#getSubmoduleType()
	 * @generated
	 */
	int SUBMODULE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Modulename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_TYPE__MODULENAME = 0;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_TYPE__SPECIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Hwmappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_TYPE__HWMAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>Submodule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Submodule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.w3schools.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Type</em>'.
	 * @see com.w3schools.ApplicationType
	 * @generated
	 */
	EClass getApplicationType();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.ApplicationType#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specifications</em>'.
	 * @see com.w3schools.ApplicationType#getSpecifications()
	 * @see #getApplicationType()
	 * @generated
	 */
	EReference getApplicationType_Specifications();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.ApplicationType#getSubmodules <em>Submodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Submodules</em>'.
	 * @see com.w3schools.ApplicationType#getSubmodules()
	 * @see #getApplicationType()
	 * @generated
	 */
	EReference getApplicationType_Submodules();

	/**
	 * Returns the meta object for class '{@link com.w3schools.AppSpecificationsType <em>App Specifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Specifications Type</em>'.
	 * @see com.w3schools.AppSpecificationsType
	 * @generated
	 */
	EClass getAppSpecificationsType();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.AppSpecificationsType#getApplicationname <em>Applicationname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicationname</em>'.
	 * @see com.w3schools.AppSpecificationsType#getApplicationname()
	 * @see #getAppSpecificationsType()
	 * @generated
	 */
	EAttribute getAppSpecificationsType_Applicationname();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.AppSpecificationsType#getCpucycles <em>Cpucycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpucycles</em>'.
	 * @see com.w3schools.AppSpecificationsType#getCpucycles()
	 * @see #getAppSpecificationsType()
	 * @generated
	 */
	EAttribute getAppSpecificationsType_Cpucycles();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.AppSpecificationsType#getBuscycles <em>Buscycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buscycles</em>'.
	 * @see com.w3schools.AppSpecificationsType#getBuscycles()
	 * @see #getAppSpecificationsType()
	 * @generated
	 */
	EAttribute getAppSpecificationsType_Buscycles();

	/**
	 * Returns the meta object for class '{@link com.w3schools.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see com.w3schools.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.Description#getCdescription <em>Cdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdescription</em>'.
	 * @see com.w3schools.Description#getCdescription()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Cdescription();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.Description#getCppdescription <em>Cppdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cppdescription</em>'.
	 * @see com.w3schools.Description#getCppdescription()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Cppdescription();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.Description#getAsmdescription <em>Asmdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asmdescription</em>'.
	 * @see com.w3schools.Description#getAsmdescription()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Asmdescription();

	/**
	 * Returns the meta object for class '{@link com.w3schools.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.w3schools.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.w3schools.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.w3schools.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.w3schools.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.w3schools.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.w3schools.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.w3schools.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.DocumentRoot#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see com.w3schools.DocumentRoot#getApplication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Application();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.DocumentRoot#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specifications</em>'.
	 * @see com.w3schools.DocumentRoot#getSpecifications()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Specifications();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.DocumentRoot#getSubmodules <em>Submodules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Submodules</em>'.
	 * @see com.w3schools.DocumentRoot#getSubmodules()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Submodules();

	/**
	 * Returns the meta object for class '{@link com.w3schools.Hwmapping <em>Hwmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hwmapping</em>'.
	 * @see com.w3schools.Hwmapping
	 * @generated
	 */
	EClass getHwmapping();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.Hwmapping#getMappingname <em>Mappingname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mappingname</em>'.
	 * @see com.w3schools.Hwmapping#getMappingname()
	 * @see #getHwmapping()
	 * @generated
	 */
	EAttribute getHwmapping_Mappingname();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.Hwmapping#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance</em>'.
	 * @see com.w3schools.Hwmapping#getPerformance()
	 * @see #getHwmapping()
	 * @generated
	 */
	EReference getHwmapping_Performance();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.Hwmapping#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see com.w3schools.Hwmapping#getDescription()
	 * @see #getHwmapping()
	 * @generated
	 */
	EReference getHwmapping_Description();

	/**
	 * Returns the meta object for class '{@link com.w3schools.Hwmappings <em>Hwmappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hwmappings</em>'.
	 * @see com.w3schools.Hwmappings
	 * @generated
	 */
	EClass getHwmappings();

	/**
	 * Returns the meta object for the containment reference list '{@link com.w3schools.Hwmappings#getHwmapping <em>Hwmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hwmapping</em>'.
	 * @see com.w3schools.Hwmappings#getHwmapping()
	 * @see #getHwmappings()
	 * @generated
	 */
	EReference getHwmappings_Hwmapping();

	/**
	 * Returns the meta object for class '{@link com.w3schools.LoopSpecificationsType <em>Loop Specifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Specifications Type</em>'.
	 * @see com.w3schools.LoopSpecificationsType
	 * @generated
	 */
	EClass getLoopSpecificationsType();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.LoopSpecificationsType#getLoopname <em>Loopname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loopname</em>'.
	 * @see com.w3schools.LoopSpecificationsType#getLoopname()
	 * @see #getLoopSpecificationsType()
	 * @generated
	 */
	EAttribute getLoopSpecificationsType_Loopname();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.LoopSpecificationsType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.w3schools.LoopSpecificationsType#getNumber()
	 * @see #getLoopSpecificationsType()
	 * @generated
	 */
	EAttribute getLoopSpecificationsType_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.LoopSpecificationsType#getStartsubmodule <em>Startsubmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startsubmodule</em>'.
	 * @see com.w3schools.LoopSpecificationsType#getStartsubmodule()
	 * @see #getLoopSpecificationsType()
	 * @generated
	 */
	EAttribute getLoopSpecificationsType_Startsubmodule();

	/**
	 * Returns the meta object for class '{@link com.w3schools.LoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Type</em>'.
	 * @see com.w3schools.LoopType
	 * @generated
	 */
	EClass getLoopType();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.LoopType#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specifications</em>'.
	 * @see com.w3schools.LoopType#getSpecifications()
	 * @see #getLoopType()
	 * @generated
	 */
	EReference getLoopType_Specifications();

	/**
	 * Returns the meta object for class '{@link com.w3schools.ModSpecificationsType <em>Mod Specifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod Specifications Type</em>'.
	 * @see com.w3schools.ModSpecificationsType
	 * @generated
	 */
	EClass getModSpecificationsType();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.ModSpecificationsType#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping</em>'.
	 * @see com.w3schools.ModSpecificationsType#getMapping()
	 * @see #getModSpecificationsType()
	 * @generated
	 */
	EAttribute getModSpecificationsType_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.ModSpecificationsType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see com.w3schools.ModSpecificationsType#getMode()
	 * @see #getModSpecificationsType()
	 * @generated
	 */
	EAttribute getModSpecificationsType_Mode();

	/**
	 * Returns the meta object for class '{@link com.w3schools.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see com.w3schools.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.Performance#getCpucycles <em>Cpucycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpucycles</em>'.
	 * @see com.w3schools.Performance#getCpucycles()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Cpucycles();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.Performance#getBuscycles <em>Buscycles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buscycles</em>'.
	 * @see com.w3schools.Performance#getBuscycles()
	 * @see #getPerformance()
	 * @generated
	 */
	EAttribute getPerformance_Buscycles();

	/**
	 * Returns the meta object for class '{@link com.w3schools.SubmodulesType <em>Submodules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodules Type</em>'.
	 * @see com.w3schools.SubmodulesType
	 * @generated
	 */
	EClass getSubmodulesType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.w3schools.SubmodulesType#getSubmodule <em>Submodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodule</em>'.
	 * @see com.w3schools.SubmodulesType#getSubmodule()
	 * @see #getSubmodulesType()
	 * @generated
	 */
	EReference getSubmodulesType_Submodule();

	/**
	 * Returns the meta object for the containment reference list '{@link com.w3schools.SubmodulesType#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop</em>'.
	 * @see com.w3schools.SubmodulesType#getLoop()
	 * @see #getSubmodulesType()
	 * @generated
	 */
	EReference getSubmodulesType_Loop();

	/**
	 * Returns the meta object for class '{@link com.w3schools.SubmoduleType <em>Submodule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodule Type</em>'.
	 * @see com.w3schools.SubmoduleType
	 * @generated
	 */
	EClass getSubmoduleType();

	/**
	 * Returns the meta object for the attribute '{@link com.w3schools.SubmoduleType#getModulename <em>Modulename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modulename</em>'.
	 * @see com.w3schools.SubmoduleType#getModulename()
	 * @see #getSubmoduleType()
	 * @generated
	 */
	EAttribute getSubmoduleType_Modulename();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.SubmoduleType#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specifications</em>'.
	 * @see com.w3schools.SubmoduleType#getSpecifications()
	 * @see #getSubmoduleType()
	 * @generated
	 */
	EReference getSubmoduleType_Specifications();

	/**
	 * Returns the meta object for the containment reference '{@link com.w3schools.SubmoduleType#getHwmappings <em>Hwmappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hwmappings</em>'.
	 * @see com.w3schools.SubmoduleType#getHwmappings()
	 * @see #getSubmoduleType()
	 * @generated
	 */
	EReference getSubmoduleType_Hwmappings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	W3schoolsFactory getW3schoolsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.w3schools.impl.ApplicationTypeImpl <em>Application Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.ApplicationTypeImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getApplicationType()
		 * @generated
		 */
		EClass APPLICATION_TYPE = eINSTANCE.getApplicationType();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TYPE__SPECIFICATIONS = eINSTANCE.getApplicationType_Specifications();

		/**
		 * The meta object literal for the '<em><b>Submodules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TYPE__SUBMODULES = eINSTANCE.getApplicationType_Submodules();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.AppSpecificationsTypeImpl <em>App Specifications Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.AppSpecificationsTypeImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getAppSpecificationsType()
		 * @generated
		 */
		EClass APP_SPECIFICATIONS_TYPE = eINSTANCE.getAppSpecificationsType();

		/**
		 * The meta object literal for the '<em><b>Applicationname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_SPECIFICATIONS_TYPE__APPLICATIONNAME = eINSTANCE.getAppSpecificationsType_Applicationname();

		/**
		 * The meta object literal for the '<em><b>Cpucycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_SPECIFICATIONS_TYPE__CPUCYCLES = eINSTANCE.getAppSpecificationsType_Cpucycles();

		/**
		 * The meta object literal for the '<em><b>Buscycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_SPECIFICATIONS_TYPE__BUSCYCLES = eINSTANCE.getAppSpecificationsType_Buscycles();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.DescriptionImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Cdescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__CDESCRIPTION = eINSTANCE.getDescription_Cdescription();

		/**
		 * The meta object literal for the '<em><b>Cppdescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__CPPDESCRIPTION = eINSTANCE.getDescription_Cppdescription();

		/**
		 * The meta object literal for the '<em><b>Asmdescription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__ASMDESCRIPTION = eINSTANCE.getDescription_Asmdescription();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.DocumentRootImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPLICATION = eINSTANCE.getDocumentRoot_Application();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPECIFICATIONS = eINSTANCE.getDocumentRoot_Specifications();

		/**
		 * The meta object literal for the '<em><b>Submodules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBMODULES = eINSTANCE.getDocumentRoot_Submodules();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.HwmappingImpl <em>Hwmapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.HwmappingImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getHwmapping()
		 * @generated
		 */
		EClass HWMAPPING = eINSTANCE.getHwmapping();

		/**
		 * The meta object literal for the '<em><b>Mappingname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HWMAPPING__MAPPINGNAME = eINSTANCE.getHwmapping_Mappingname();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HWMAPPING__PERFORMANCE = eINSTANCE.getHwmapping_Performance();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HWMAPPING__DESCRIPTION = eINSTANCE.getHwmapping_Description();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.HwmappingsImpl <em>Hwmappings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.HwmappingsImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getHwmappings()
		 * @generated
		 */
		EClass HWMAPPINGS = eINSTANCE.getHwmappings();

		/**
		 * The meta object literal for the '<em><b>Hwmapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HWMAPPINGS__HWMAPPING = eINSTANCE.getHwmappings_Hwmapping();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.LoopSpecificationsTypeImpl <em>Loop Specifications Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.LoopSpecificationsTypeImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getLoopSpecificationsType()
		 * @generated
		 */
		EClass LOOP_SPECIFICATIONS_TYPE = eINSTANCE.getLoopSpecificationsType();

		/**
		 * The meta object literal for the '<em><b>Loopname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_SPECIFICATIONS_TYPE__LOOPNAME = eINSTANCE.getLoopSpecificationsType_Loopname();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_SPECIFICATIONS_TYPE__NUMBER = eINSTANCE.getLoopSpecificationsType_Number();

		/**
		 * The meta object literal for the '<em><b>Startsubmodule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE = eINSTANCE.getLoopSpecificationsType_Startsubmodule();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.LoopTypeImpl <em>Loop Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.LoopTypeImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getLoopType()
		 * @generated
		 */
		EClass LOOP_TYPE = eINSTANCE.getLoopType();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_TYPE__SPECIFICATIONS = eINSTANCE.getLoopType_Specifications();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.ModSpecificationsTypeImpl <em>Mod Specifications Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.ModSpecificationsTypeImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getModSpecificationsType()
		 * @generated
		 */
		EClass MOD_SPECIFICATIONS_TYPE = eINSTANCE.getModSpecificationsType();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD_SPECIFICATIONS_TYPE__MAPPING = eINSTANCE.getModSpecificationsType_Mapping();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOD_SPECIFICATIONS_TYPE__MODE = eINSTANCE.getModSpecificationsType_Mode();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.PerformanceImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '<em><b>Cpucycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__CPUCYCLES = eINSTANCE.getPerformance_Cpucycles();

		/**
		 * The meta object literal for the '<em><b>Buscycles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE__BUSCYCLES = eINSTANCE.getPerformance_Buscycles();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.SubmodulesTypeImpl <em>Submodules Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.SubmodulesTypeImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getSubmodulesType()
		 * @generated
		 */
		EClass SUBMODULES_TYPE = eINSTANCE.getSubmodulesType();

		/**
		 * The meta object literal for the '<em><b>Submodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULES_TYPE__SUBMODULE = eINSTANCE.getSubmodulesType_Submodule();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULES_TYPE__LOOP = eINSTANCE.getSubmodulesType_Loop();

		/**
		 * The meta object literal for the '{@link com.w3schools.impl.SubmoduleTypeImpl <em>Submodule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.w3schools.impl.SubmoduleTypeImpl
		 * @see com.w3schools.impl.W3schoolsPackageImpl#getSubmoduleType()
		 * @generated
		 */
		EClass SUBMODULE_TYPE = eINSTANCE.getSubmoduleType();

		/**
		 * The meta object literal for the '<em><b>Modulename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODULE_TYPE__MODULENAME = eINSTANCE.getSubmoduleType_Modulename();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE_TYPE__SPECIFICATIONS = eINSTANCE.getSubmoduleType_Specifications();

		/**
		 * The meta object literal for the '<em><b>Hwmappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE_TYPE__HWMAPPINGS = eINSTANCE.getSubmoduleType_Hwmappings();

	}

} //W3schoolsPackage
