/**
 */
package com.w3schools.impl;

import com.w3schools.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class W3schoolsFactoryImpl extends EFactoryImpl implements W3schoolsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static W3schoolsFactory init() {
		try {
			W3schoolsFactory theW3schoolsFactory = (W3schoolsFactory)EPackage.Registry.INSTANCE.getEFactory(W3schoolsPackage.eNS_URI);
			if (theW3schoolsFactory != null) {
				return theW3schoolsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new W3schoolsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3schoolsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case W3schoolsPackage.APPLICATION_TYPE: return createApplicationType();
			case W3schoolsPackage.APP_SPECIFICATIONS_TYPE: return createAppSpecificationsType();
			case W3schoolsPackage.DESCRIPTION: return createDescription();
			case W3schoolsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case W3schoolsPackage.HWMAPPING: return createHwmapping();
			case W3schoolsPackage.HWMAPPINGS: return createHwmappings();
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE: return createLoopSpecificationsType();
			case W3schoolsPackage.LOOP_TYPE: return createLoopType();
			case W3schoolsPackage.MOD_SPECIFICATIONS_TYPE: return createModSpecificationsType();
			case W3schoolsPackage.PERFORMANCE: return createPerformance();
			case W3schoolsPackage.SUBMODULES_TYPE: return createSubmodulesType();
			case W3schoolsPackage.SUBMODULE_TYPE: return createSubmoduleType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationType createApplicationType() {
		ApplicationTypeImpl applicationType = new ApplicationTypeImpl();
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSpecificationsType createAppSpecificationsType() {
		AppSpecificationsTypeImpl appSpecificationsType = new AppSpecificationsTypeImpl();
		return appSpecificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hwmapping createHwmapping() {
		HwmappingImpl hwmapping = new HwmappingImpl();
		return hwmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hwmappings createHwmappings() {
		HwmappingsImpl hwmappings = new HwmappingsImpl();
		return hwmappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopSpecificationsType createLoopSpecificationsType() {
		LoopSpecificationsTypeImpl loopSpecificationsType = new LoopSpecificationsTypeImpl();
		return loopSpecificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopType createLoopType() {
		LoopTypeImpl loopType = new LoopTypeImpl();
		return loopType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModSpecificationsType createModSpecificationsType() {
		ModSpecificationsTypeImpl modSpecificationsType = new ModSpecificationsTypeImpl();
		return modSpecificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance createPerformance() {
		PerformanceImpl performance = new PerformanceImpl();
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmodulesType createSubmodulesType() {
		SubmodulesTypeImpl submodulesType = new SubmodulesTypeImpl();
		return submodulesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmoduleType createSubmoduleType() {
		SubmoduleTypeImpl submoduleType = new SubmoduleTypeImpl();
		return submoduleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3schoolsPackage getW3schoolsPackage() {
		return (W3schoolsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static W3schoolsPackage getPackage() {
		return W3schoolsPackage.eINSTANCE;
	}

} //W3schoolsFactoryImpl
