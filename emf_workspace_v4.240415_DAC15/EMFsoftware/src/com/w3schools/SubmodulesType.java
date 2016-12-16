/**
 */
package com.w3schools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodules Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.SubmodulesType#getSubmodule <em>Submodule</em>}</li>
 *   <li>{@link com.w3schools.SubmodulesType#getLoop <em>Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getSubmodulesType()
 * @model extendedMetaData="name='submodulesType' kind='elementOnly'"
 * @generated
 */
public interface SubmodulesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Submodule</b></em>' containment reference list.
	 * The list contents are of type {@link com.w3schools.SubmoduleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submodule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submodule</em>' containment reference list.
	 * @see com.w3schools.W3schoolsPackage#getSubmodulesType_Submodule()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='submodule' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubmoduleType> getSubmodule();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
	 * The list contents are of type {@link com.w3schools.LoopType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference list.
	 * @see com.w3schools.W3schoolsPackage#getSubmodulesType_Loop()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoopType> getLoop();

} // SubmodulesType
