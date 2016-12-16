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
 * A representation of the model object '<em><b>Enumerated Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValuesType#getEnumeratedValue <em>Enumerated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getEnumeratedValuesType()
 * @model extendedMetaData="name='enumeratedValues_._type' kind='elementOnly'"
 * @generated
 */
public interface EnumeratedValuesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Enumerated Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumerates specific values that can be assigned to the bit field. The name of this enumerated value. This may be used as a token in generating code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumerated Value</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getEnumeratedValuesType_EnumeratedValue()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValueType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='enumeratedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getEnumeratedValue();

} // EnumeratedValuesType
