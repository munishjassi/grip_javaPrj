/**
 */
package com.w3schools.impl;

import com.w3schools.LoopSpecificationsType;
import com.w3schools.LoopType;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.LoopTypeImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopTypeImpl extends MinimalEObjectImpl.Container implements LoopType {
	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected LoopSpecificationsType specifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.LOOP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopSpecificationsType getSpecifications() {
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifications(LoopSpecificationsType newSpecifications, NotificationChain msgs) {
		LoopSpecificationsType oldSpecifications = specifications;
		specifications = newSpecifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS, oldSpecifications, newSpecifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifications(LoopSpecificationsType newSpecifications) {
		if (newSpecifications != specifications) {
			NotificationChain msgs = null;
			if (specifications != null)
				msgs = ((InternalEObject)specifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS, null, msgs);
			if (newSpecifications != null)
				msgs = ((InternalEObject)newSpecifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS, null, msgs);
			msgs = basicSetSpecifications(newSpecifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS, newSpecifications, newSpecifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS:
				return basicSetSpecifications(null, msgs);
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
			case W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS:
				return getSpecifications();
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
			case W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS:
				setSpecifications((LoopSpecificationsType)newValue);
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
			case W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS:
				setSpecifications((LoopSpecificationsType)null);
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
			case W3schoolsPackage.LOOP_TYPE__SPECIFICATIONS:
				return specifications != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopTypeImpl
