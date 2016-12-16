/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.ApplicationType#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link com.w3schools.ApplicationType#getSubmodules <em>Submodules</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getApplicationType()
 * @model extendedMetaData="name='application_._type' kind='elementOnly'"
 * @generated
 */
public interface ApplicationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference.
	 * @see #setSpecifications(AppSpecificationsType)
	 * @see com.w3schools.W3schoolsPackage#getApplicationType_Specifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specifications' namespace='##targetNamespace'"
	 * @generated
	 */
	AppSpecificationsType getSpecifications();

	/**
	 * Sets the value of the '{@link com.w3schools.ApplicationType#getSpecifications <em>Specifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifications</em>' containment reference.
	 * @see #getSpecifications()
	 * @generated
	 */
	void setSpecifications(AppSpecificationsType value);

	/**
	 * Returns the value of the '<em><b>Submodules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submodules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodules</em>' containment reference.
	 * @see #setSubmodules(SubmodulesType)
	 * @see com.w3schools.W3schoolsPackage#getApplicationType_Submodules()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='submodules' namespace='##targetNamespace'"
	 * @generated
	 */
	SubmodulesType getSubmodules();

	/**
	 * Sets the value of the '{@link com.w3schools.ApplicationType#getSubmodules <em>Submodules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submodules</em>' containment reference.
	 * @see #getSubmodules()
	 * @generated
	 */
	void setSubmodules(SubmodulesType value);

} // ApplicationType
