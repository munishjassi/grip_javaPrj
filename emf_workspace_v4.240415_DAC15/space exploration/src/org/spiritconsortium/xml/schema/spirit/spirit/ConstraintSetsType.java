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
 * A representation of the model object '<em><b>Constraint Sets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType#getConstraintSet <em>Constraint Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getConstraintSetsType()
 * @model extendedMetaData="name='constraintSets_._type' kind='elementOnly'"
 * @generated
 */
public interface ConstraintSetsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines constraints that apply to a component port. If multiple constraintSet elements are used, each must have a unique value for the constraintSetId attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Set</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getConstraintSetsType_ConstraintSet()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='constraintSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getConstraintSet();

} // ConstraintSetsType
