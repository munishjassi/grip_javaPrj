/**
 */
package com.w3schools.impl;

import com.w3schools.Hwmappings;
import com.w3schools.ModSpecificationsType;
import com.w3schools.SubmoduleType;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.SubmoduleTypeImpl#getModulename <em>Modulename</em>}</li>
 *   <li>{@link com.w3schools.impl.SubmoduleTypeImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link com.w3schools.impl.SubmoduleTypeImpl#getHwmappings <em>Hwmappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmoduleTypeImpl extends MinimalEObjectImpl.Container implements SubmoduleType {
	/**
	 * The default value of the '{@link #getModulename() <em>Modulename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulename()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulename() <em>Modulename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulename()
	 * @generated
	 * @ordered
	 */
	protected String modulename = MODULENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected ModSpecificationsType specifications;

	/**
	 * The cached value of the '{@link #getHwmappings() <em>Hwmappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwmappings()
	 * @generated
	 * @ordered
	 */
	protected Hwmappings hwmappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmoduleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.SUBMODULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModulename() {
		return modulename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulename(String newModulename) {
		String oldModulename = modulename;
		modulename = newModulename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.SUBMODULE_TYPE__MODULENAME, oldModulename, modulename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModSpecificationsType getSpecifications() {
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecifications(ModSpecificationsType newSpecifications, NotificationChain msgs) {
		ModSpecificationsType oldSpecifications = specifications;
		specifications = newSpecifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS, oldSpecifications, newSpecifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecifications(ModSpecificationsType newSpecifications) {
		if (newSpecifications != specifications) {
			NotificationChain msgs = null;
			if (specifications != null)
				msgs = ((InternalEObject)specifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS, null, msgs);
			if (newSpecifications != null)
				msgs = ((InternalEObject)newSpecifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS, null, msgs);
			msgs = basicSetSpecifications(newSpecifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS, newSpecifications, newSpecifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hwmappings getHwmappings() {
		return hwmappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHwmappings(Hwmappings newHwmappings, NotificationChain msgs) {
		Hwmappings oldHwmappings = hwmappings;
		hwmappings = newHwmappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS, oldHwmappings, newHwmappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHwmappings(Hwmappings newHwmappings) {
		if (newHwmappings != hwmappings) {
			NotificationChain msgs = null;
			if (hwmappings != null)
				msgs = ((InternalEObject)hwmappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS, null, msgs);
			if (newHwmappings != null)
				msgs = ((InternalEObject)newHwmappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS, null, msgs);
			msgs = basicSetHwmappings(newHwmappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS, newHwmappings, newHwmappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS:
				return basicSetSpecifications(null, msgs);
			case W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS:
				return basicSetHwmappings(null, msgs);
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
			case W3schoolsPackage.SUBMODULE_TYPE__MODULENAME:
				return getModulename();
			case W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS:
				return getSpecifications();
			case W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS:
				return getHwmappings();
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
			case W3schoolsPackage.SUBMODULE_TYPE__MODULENAME:
				setModulename((String)newValue);
				return;
			case W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS:
				setSpecifications((ModSpecificationsType)newValue);
				return;
			case W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS:
				setHwmappings((Hwmappings)newValue);
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
			case W3schoolsPackage.SUBMODULE_TYPE__MODULENAME:
				setModulename(MODULENAME_EDEFAULT);
				return;
			case W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS:
				setSpecifications((ModSpecificationsType)null);
				return;
			case W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS:
				setHwmappings((Hwmappings)null);
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
			case W3schoolsPackage.SUBMODULE_TYPE__MODULENAME:
				return MODULENAME_EDEFAULT == null ? modulename != null : !MODULENAME_EDEFAULT.equals(modulename);
			case W3schoolsPackage.SUBMODULE_TYPE__SPECIFICATIONS:
				return specifications != null;
			case W3schoolsPackage.SUBMODULE_TYPE__HWMAPPINGS:
				return hwmappings != null;
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
		result.append(" (modulename: ");
		result.append(modulename);
		result.append(')');
		return result.toString();
	}

} //SubmoduleTypeImpl
