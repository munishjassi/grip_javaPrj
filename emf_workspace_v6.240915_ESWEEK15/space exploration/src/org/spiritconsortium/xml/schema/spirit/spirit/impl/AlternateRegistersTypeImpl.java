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

import org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegisterType;
import org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegistersType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternate Registers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AlternateRegistersTypeImpl#getAlternateRegister <em>Alternate Register</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternateRegistersTypeImpl extends EObjectImpl implements AlternateRegistersType {
	/**
	 * The cached value of the '{@link #getAlternateRegister() <em>Alternate Register</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateRegister()
	 * @generated
	 * @ordered
	 */
	protected EList alternateRegister;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternateRegistersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getAlternateRegistersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAlternateRegister() {
		if (alternateRegister == null) {
			alternateRegister = new EObjectContainmentEList(AlternateRegisterType.class, this, _1Package.ALTERNATE_REGISTERS_TYPE__ALTERNATE_REGISTER);
		}
		return alternateRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ALTERNATE_REGISTERS_TYPE__ALTERNATE_REGISTER:
				return ((InternalEList)getAlternateRegister()).basicRemove(otherEnd, msgs);
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
			case _1Package.ALTERNATE_REGISTERS_TYPE__ALTERNATE_REGISTER:
				return getAlternateRegister();
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
			case _1Package.ALTERNATE_REGISTERS_TYPE__ALTERNATE_REGISTER:
				getAlternateRegister().clear();
				getAlternateRegister().addAll((Collection)newValue);
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
			case _1Package.ALTERNATE_REGISTERS_TYPE__ALTERNATE_REGISTER:
				getAlternateRegister().clear();
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
			case _1Package.ALTERNATE_REGISTERS_TYPE__ALTERNATE_REGISTER:
				return alternateRegister != null && !alternateRegister.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AlternateRegistersTypeImpl
