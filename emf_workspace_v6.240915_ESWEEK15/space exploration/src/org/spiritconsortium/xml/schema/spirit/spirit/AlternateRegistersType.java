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
 * A representation of the model object '<em><b>Alternate Registers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegistersType#getAlternateRegister <em>Alternate Register</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAlternateRegistersType()
 * @model extendedMetaData="name='alternateRegisters_._type' kind='elementOnly'"
 * @generated
 */
public interface AlternateRegistersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternate Register</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegisterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternate definition for the current register
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Register</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAlternateRegistersType_AlternateRegister()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegisterType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='alternateRegister' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAlternateRegister();

} // AlternateRegistersType
