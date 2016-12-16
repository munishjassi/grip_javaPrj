/**
 */
package com.w3schools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hwmappings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.Hwmappings#getHwmapping <em>Hwmapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getHwmappings()
 * @model extendedMetaData="name='hwmappings' kind='elementOnly'"
 * @generated
 */
public interface Hwmappings extends EObject {
	/**
	 * Returns the value of the '<em><b>Hwmapping</b></em>' containment reference list.
	 * The list contents are of type {@link com.w3schools.Hwmapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hwmapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hwmapping</em>' containment reference list.
	 * @see com.w3schools.W3schoolsPackage#getHwmappings_Hwmapping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hwmapping' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Hwmapping> getHwmapping();

} // Hwmappings
