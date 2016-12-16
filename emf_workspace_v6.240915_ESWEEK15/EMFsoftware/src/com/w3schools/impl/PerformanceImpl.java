/**
 */
package com.w3schools.impl;

import com.w3schools.Performance;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.PerformanceImpl#getCpucycles <em>Cpucycles</em>}</li>
 *   <li>{@link com.w3schools.impl.PerformanceImpl#getBuscycles <em>Buscycles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerformanceImpl extends MinimalEObjectImpl.Container implements Performance {
	/**
	 * The default value of the '{@link #getCpucycles() <em>Cpucycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpucycles()
	 * @generated
	 * @ordered
	 */
	protected static final int CPUCYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpucycles() <em>Cpucycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpucycles()
	 * @generated
	 * @ordered
	 */
	protected int cpucycles = CPUCYCLES_EDEFAULT;

	/**
	 * This is true if the Cpucycles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cpucyclesESet;

	/**
	 * The default value of the '{@link #getBuscycles() <em>Buscycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuscycles()
	 * @generated
	 * @ordered
	 */
	protected static final int BUSCYCLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuscycles() <em>Buscycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuscycles()
	 * @generated
	 * @ordered
	 */
	protected int buscycles = BUSCYCLES_EDEFAULT;

	/**
	 * This is true if the Buscycles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean buscyclesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpucycles() {
		return cpucycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpucycles(int newCpucycles) {
		int oldCpucycles = cpucycles;
		cpucycles = newCpucycles;
		boolean oldCpucyclesESet = cpucyclesESet;
		cpucyclesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.PERFORMANCE__CPUCYCLES, oldCpucycles, cpucycles, !oldCpucyclesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCpucycles() {
		int oldCpucycles = cpucycles;
		boolean oldCpucyclesESet = cpucyclesESet;
		cpucycles = CPUCYCLES_EDEFAULT;
		cpucyclesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, W3schoolsPackage.PERFORMANCE__CPUCYCLES, oldCpucycles, CPUCYCLES_EDEFAULT, oldCpucyclesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCpucycles() {
		return cpucyclesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBuscycles() {
		return buscycles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuscycles(int newBuscycles) {
		int oldBuscycles = buscycles;
		buscycles = newBuscycles;
		boolean oldBuscyclesESet = buscyclesESet;
		buscyclesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.PERFORMANCE__BUSCYCLES, oldBuscycles, buscycles, !oldBuscyclesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuscycles() {
		int oldBuscycles = buscycles;
		boolean oldBuscyclesESet = buscyclesESet;
		buscycles = BUSCYCLES_EDEFAULT;
		buscyclesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, W3schoolsPackage.PERFORMANCE__BUSCYCLES, oldBuscycles, BUSCYCLES_EDEFAULT, oldBuscyclesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuscycles() {
		return buscyclesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3schoolsPackage.PERFORMANCE__CPUCYCLES:
				return getCpucycles();
			case W3schoolsPackage.PERFORMANCE__BUSCYCLES:
				return getBuscycles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case W3schoolsPackage.PERFORMANCE__CPUCYCLES:
				setCpucycles((Integer)newValue);
				return;
			case W3schoolsPackage.PERFORMANCE__BUSCYCLES:
				setBuscycles((Integer)newValue);
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
			case W3schoolsPackage.PERFORMANCE__CPUCYCLES:
				unsetCpucycles();
				return;
			case W3schoolsPackage.PERFORMANCE__BUSCYCLES:
				unsetBuscycles();
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
			case W3schoolsPackage.PERFORMANCE__CPUCYCLES:
				return isSetCpucycles();
			case W3schoolsPackage.PERFORMANCE__BUSCYCLES:
				return isSetBuscycles();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cpucycles: ");
		if (cpucyclesESet) result.append(cpucycles); else result.append("<unset>");
		result.append(", buscycles: ");
		if (buscyclesESet) result.append(buscycles); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PerformanceImpl
