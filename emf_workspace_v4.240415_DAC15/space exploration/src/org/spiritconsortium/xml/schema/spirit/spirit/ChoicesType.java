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
 * A representation of the model object '<em><b>Choices Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ChoicesType#getChoice <em>Choice</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getChoicesType()
 * @model extendedMetaData="name='choices_._type' kind='elementOnly'"
 * @generated
 */
public interface ChoicesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Choice</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.ChoiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Non-empty set of legal values for a elements with an attribute spirit:choiceRef.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Choice</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getChoicesType_Choice()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.ChoiceType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChoice();

} // ChoicesType
