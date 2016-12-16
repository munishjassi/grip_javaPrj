/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.SubmoduleType#getModulename <em>Modulename</em>}</li>
 *   <li>{@link com.w3schools.SubmoduleType#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link com.w3schools.SubmoduleType#getHwmappings <em>Hwmappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getSubmoduleType()
 * @model extendedMetaData="name='submoduleType' kind='elementOnly'"
 * @generated
 */
public interface SubmoduleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Modulename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulename</em>' attribute.
	 * @see #setModulename(String)
	 * @see com.w3schools.W3schoolsPackage#getSubmoduleType_Modulename()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='modulename' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModulename();

	/**
	 * Sets the value of the '{@link com.w3schools.SubmoduleType#getModulename <em>Modulename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulename</em>' attribute.
	 * @see #getModulename()
	 * @generated
	 */
	void setModulename(String value);

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference.
	 * @see #setSpecifications(ModSpecificationsType)
	 * @see com.w3schools.W3schoolsPackage#getSubmoduleType_Specifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specifications' namespace='##targetNamespace'"
	 * @generated
	 */
	ModSpecificationsType getSpecifications();

	/**
	 * Sets the value of the '{@link com.w3schools.SubmoduleType#getSpecifications <em>Specifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifications</em>' containment reference.
	 * @see #getSpecifications()
	 * @generated
	 */
	void setSpecifications(ModSpecificationsType value);

	/**
	 * Returns the value of the '<em><b>Hwmappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hwmappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hwmappings</em>' containment reference.
	 * @see #setHwmappings(Hwmappings)
	 * @see com.w3schools.W3schoolsPackage#getSubmoduleType_Hwmappings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hwmappings' namespace='##targetNamespace'"
	 * @generated
	 */
	Hwmappings getHwmappings();

	/**
	 * Sets the value of the '{@link com.w3schools.SubmoduleType#getHwmappings <em>Hwmappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwmappings</em>' containment reference.
	 * @see #getHwmappings()
	 * @generated
	 */
	void setHwmappings(Hwmappings value);

} // SubmoduleType
