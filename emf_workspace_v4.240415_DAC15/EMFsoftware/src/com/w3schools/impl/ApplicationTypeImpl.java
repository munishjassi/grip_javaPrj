/**
 */
package com.w3schools.impl;

import com.w3schools.AppSpecificationsType;
import com.w3schools.ApplicationType;
import com.w3schools.SubmodulesType;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.ApplicationTypeImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link com.w3schools.impl.ApplicationTypeImpl#getSubmodules <em>Submodules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationTypeImpl extends MinimalEObjectImpl.Container implements ApplicationType {
	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected AppSpecificationsType specifications;

	/**
	 * The cached value of the '{@link #getSubmodules() <em>Submodules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodules()
	 * @generated
	 * @ordered
	 */
	protected SubmodulesType submodules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.APPLICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSpecificationsType getSpecifications() {
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifications(AppSpecificationsType newSpecifications, NotificationChain msgs) {
		AppSpecificationsType oldSpecifications = specifications;
		specifications = newSpecifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS, oldSpecifications, newSpecifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifications(AppSpecificationsType newSpecifications) {
		if (newSpecifications != specifications) {
			NotificationChain msgs = null;
			if (specifications != null)
				msgs = ((InternalEObject)specifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS, null, msgs);
			if (newSpecifications != null)
				msgs = ((InternalEObject)newSpecifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS, null, msgs);
			msgs = basicSetSpecifications(newSpecifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS, newSpecifications, newSpecifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmodulesType getSubmodules() {
		return submodules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmodules(SubmodulesType newSubmodules, NotificationChain msgs) {
		SubmodulesType oldSubmodules = submodules;
		submodules = newSubmodules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.APPLICATION_TYPE__SUBMODULES, oldSubmodules, newSubmodules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmodules(SubmodulesType newSubmodules) {
		if (newSubmodules != submodules) {
			NotificationChain msgs = null;
			if (submodules != null)
				msgs = ((InternalEObject)submodules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.APPLICATION_TYPE__SUBMODULES, null, msgs);
			if (newSubmodules != null)
				msgs = ((InternalEObject)newSubmodules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.APPLICATION_TYPE__SUBMODULES, null, msgs);
			msgs = basicSetSubmodules(newSubmodules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.APPLICATION_TYPE__SUBMODULES, newSubmodules, newSubmodules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS:
				return basicSetSpecifications(null, msgs);
			case W3schoolsPackage.APPLICATION_TYPE__SUBMODULES:
				return basicSetSubmodules(null, msgs);
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
			case W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS:
				return getSpecifications();
			case W3schoolsPackage.APPLICATION_TYPE__SUBMODULES:
				return getSubmodules();
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
			case W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS:
				setSpecifications((AppSpecificationsType)newValue);
				return;
			case W3schoolsPackage.APPLICATION_TYPE__SUBMODULES:
				setSubmodules((SubmodulesType)newValue);
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
			case W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS:
				setSpecifications((AppSpecificationsType)null);
				return;
			case W3schoolsPackage.APPLICATION_TYPE__SUBMODULES:
				setSubmodules((SubmodulesType)null);
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
			case W3schoolsPackage.APPLICATION_TYPE__SPECIFICATIONS:
				return specifications != null;
			case W3schoolsPackage.APPLICATION_TYPE__SUBMODULES:
				return submodules != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationTypeImpl
