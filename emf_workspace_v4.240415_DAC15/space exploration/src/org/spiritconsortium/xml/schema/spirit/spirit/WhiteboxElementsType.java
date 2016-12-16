/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Whitebox Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementsType#getWhiteboxElement <em>Whitebox Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getWhiteboxElementsType()
 * @model extendedMetaData="name='whiteboxElements_._type' kind='elementOnly'"
 * @generated
 */
public interface WhiteboxElementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Whitebox Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A whiteboxElement is a useful way to identify elements of a component that can not be identified through other means such as internal signals and non-software accessible registers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Whitebox Element</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getWhiteboxElementsType_WhiteboxElement()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='whiteboxElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getWhiteboxElement();

} // WhiteboxElementsType
