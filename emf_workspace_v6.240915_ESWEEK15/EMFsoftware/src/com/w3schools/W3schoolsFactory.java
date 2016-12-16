/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.w3schools.W3schoolsPackage
 * @generated
 */
public interface W3schoolsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	W3schoolsFactory eINSTANCE = com.w3schools.impl.W3schoolsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Application Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Type</em>'.
	 * @generated
	 */
	ApplicationType createApplicationType();

	/**
	 * Returns a new object of class '<em>App Specifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Specifications Type</em>'.
	 * @generated
	 */
	AppSpecificationsType createAppSpecificationsType();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Hwmapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hwmapping</em>'.
	 * @generated
	 */
	Hwmapping createHwmapping();

	/**
	 * Returns a new object of class '<em>Hwmappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hwmappings</em>'.
	 * @generated
	 */
	Hwmappings createHwmappings();

	/**
	 * Returns a new object of class '<em>Loop Specifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Specifications Type</em>'.
	 * @generated
	 */
	LoopSpecificationsType createLoopSpecificationsType();

	/**
	 * Returns a new object of class '<em>Loop Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Type</em>'.
	 * @generated
	 */
	LoopType createLoopType();

	/**
	 * Returns a new object of class '<em>Mod Specifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mod Specifications Type</em>'.
	 * @generated
	 */
	ModSpecificationsType createModSpecificationsType();

	/**
	 * Returns a new object of class '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance</em>'.
	 * @generated
	 */
	Performance createPerformance();

	/**
	 * Returns a new object of class '<em>Submodules Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submodules Type</em>'.
	 * @generated
	 */
	SubmodulesType createSubmodulesType();

	/**
	 * Returns a new object of class '<em>Submodule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Submodule Type</em>'.
	 * @generated
	 */
	SubmoduleType createSubmoduleType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	W3schoolsPackage getW3schoolsPackage();

} //W3schoolsFactory
