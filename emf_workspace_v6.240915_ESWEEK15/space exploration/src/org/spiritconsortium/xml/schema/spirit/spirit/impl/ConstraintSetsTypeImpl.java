/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType;
import org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Sets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.ConstraintSetsTypeImpl#getConstraintSet <em>Constraint Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintSetsTypeImpl extends EObjectImpl implements ConstraintSetsType {
	/**
	 * The cached value of the '{@link #getConstraintSet() <em>Constraint Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintSet()
	 * @generated
	 * @ordered
	 */
	protected EList constraintSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getConstraintSetsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConstraintSet() {
		if (constraintSet == null) {
			constraintSet = new EObjectContainmentEList(ConstraintSetType.class, this, _1Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET);
		}
		return constraintSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				return ((InternalEList)getConstraintSet()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				return getConstraintSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _1Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				getConstraintSet().clear();
				getConstraintSet().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case _1Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				getConstraintSet().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _1Package.CONSTRAINT_SETS_TYPE__CONSTRAINT_SET:
				return constraintSet != null && !constraintSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintSetsTypeImpl
