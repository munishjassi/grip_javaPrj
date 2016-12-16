/**
 */
package com.w3schools.impl;

import com.w3schools.Hwmapping;
import com.w3schools.Hwmappings;
import com.w3schools.W3schoolsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hwmappings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.HwmappingsImpl#getHwmapping <em>Hwmapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HwmappingsImpl extends MinimalEObjectImpl.Container implements Hwmappings {
	/**
	 * The cached value of the '{@link #getHwmapping() <em>Hwmapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwmapping()
	 * @generated
	 * @ordered
	 */
	protected EList<Hwmapping> hwmapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwmappingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.HWMAPPINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hwmapping> getHwmapping() {
		if (hwmapping == null) {
			hwmapping = new EObjectContainmentEList<Hwmapping>(Hwmapping.class, this, W3schoolsPackage.HWMAPPINGS__HWMAPPING);
		}
		return hwmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3schoolsPackage.HWMAPPINGS__HWMAPPING:
				return ((InternalEList<?>)getHwmapping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3schoolsPackage.HWMAPPINGS__HWMAPPING:
				return getHwmapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case W3schoolsPackage.HWMAPPINGS__HWMAPPING:
				getHwmapping().clear();
				getHwmapping().addAll((Collection<? extends Hwmapping>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case W3schoolsPackage.HWMAPPINGS__HWMAPPING:
				getHwmapping().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case W3schoolsPackage.HWMAPPINGS__HWMAPPING:
				return hwmapping != null && !hwmapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwmappingsImpl
