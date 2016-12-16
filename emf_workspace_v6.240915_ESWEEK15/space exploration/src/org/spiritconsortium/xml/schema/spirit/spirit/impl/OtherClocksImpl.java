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

import org.spiritconsortium.xml.schema.spirit.spirit.OtherClockDriverType;
import org.spiritconsortium.xml.schema.spirit.spirit.OtherClocks;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Clocks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.OtherClocksImpl#getOtherClockDriver <em>Other Clock Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherClocksImpl extends EObjectImpl implements OtherClocks {
	/**
	 * The cached value of the '{@link #getOtherClockDriver() <em>Other Clock Driver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClockDriver()
	 * @generated
	 * @ordered
	 */
	protected EList otherClockDriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OtherClocksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getOtherClocks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOtherClockDriver() {
		if (otherClockDriver == null) {
			otherClockDriver = new EObjectContainmentEList(OtherClockDriverType.class, this, _1Package.OTHER_CLOCKS__OTHER_CLOCK_DRIVER);
		}
		return otherClockDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.OTHER_CLOCKS__OTHER_CLOCK_DRIVER:
				return ((InternalEList)getOtherClockDriver()).basicRemove(otherEnd, msgs);
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
			case _1Package.OTHER_CLOCKS__OTHER_CLOCK_DRIVER:
				return getOtherClockDriver();
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
			case _1Package.OTHER_CLOCKS__OTHER_CLOCK_DRIVER:
				getOtherClockDriver().clear();
				getOtherClockDriver().addAll((Collection)newValue);
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
			case _1Package.OTHER_CLOCKS__OTHER_CLOCK_DRIVER:
				getOtherClockDriver().clear();
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
			case _1Package.OTHER_CLOCKS__OTHER_CLOCK_DRIVER:
				return otherClockDriver != null && !otherClockDriver.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OtherClocksImpl
