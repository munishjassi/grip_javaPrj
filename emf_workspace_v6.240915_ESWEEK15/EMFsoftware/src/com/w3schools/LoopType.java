/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.LoopType#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getLoopType()
 * @model extendedMetaData="name='loopType' kind='elementOnly'"
 * @generated
 */
public interface LoopType extends EObject {
	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference.
	 * @see #setSpecifications(LoopSpecificationsType)
	 * @see com.w3schools.W3schoolsPackage#getLoopType_Specifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specifications' namespace='##targetNamespace'"
	 * @generated
	 */
	LoopSpecificationsType getSpecifications();

	/**
	 * Sets the value of the '{@link com.w3schools.LoopType#getSpecifications <em>Specifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifications</em>' containment reference.
	 * @see #getSpecifications()
	 * @generated
	 */
	void setSpecifications(LoopSpecificationsType value);

} // LoopType
