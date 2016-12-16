/**
 */
package com.w3schools.impl;

import com.w3schools.Description;
import com.w3schools.Hwmapping;
import com.w3schools.Performance;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hwmapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.HwmappingImpl#getMappingname <em>Mappingname</em>}</li>
 *   <li>{@link com.w3schools.impl.HwmappingImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link com.w3schools.impl.HwmappingImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HwmappingImpl extends MinimalEObjectImpl.Container implements Hwmapping {
	/**
	 * The default value of the '{@link #getMappingname() <em>Mappingname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingname()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPINGNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappingname() <em>Mappingname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingname()
	 * @generated
	 * @ordered
	 */
	protected String mappingname = MAPPINGNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected Performance performance;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwmappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.HWMAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappingname() {
		return mappingname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingname(String newMappingname) {
		String oldMappingname = mappingname;
		mappingname = newMappingname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.HWMAPPING__MAPPINGNAME, oldMappingname, mappingname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformance(Performance newPerformance, NotificationChain msgs) {
		Performance oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.HWMAPPING__PERFORMANCE, oldPerformance, newPerformance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformance(Performance newPerformance) {
		if (newPerformance != performance) {
			NotificationChain msgs = null;
			if (performance != null)
				msgs = ((InternalEObject)performance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.HWMAPPING__PERFORMANCE, null, msgs);
			if (newPerformance != null)
				msgs = ((InternalEObject)newPerformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.HWMAPPING__PERFORMANCE, null, msgs);
			msgs = basicSetPerformance(newPerformance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.HWMAPPING__PERFORMANCE, newPerformance, newPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, W3schoolsPackage.HWMAPPING__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.HWMAPPING__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - W3schoolsPackage.HWMAPPING__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.HWMAPPING__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3schoolsPackage.HWMAPPING__PERFORMANCE:
				return basicSetPerformance(null, msgs);
			case W3schoolsPackage.HWMAPPING__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case W3schoolsPackage.HWMAPPING__MAPPINGNAME:
				return getMappingname();
			case W3schoolsPackage.HWMAPPING__PERFORMANCE:
				return getPerformance();
			case W3schoolsPackage.HWMAPPING__DESCRIPTION:
				return getDescription();
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
			case W3schoolsPackage.HWMAPPING__MAPPINGNAME:
				setMappingname((String)newValue);
				return;
			case W3schoolsPackage.HWMAPPING__PERFORMANCE:
				setPerformance((Performance)newValue);
				return;
			case W3schoolsPackage.HWMAPPING__DESCRIPTION:
				setDescription((Description)newValue);
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
			case W3schoolsPackage.HWMAPPING__MAPPINGNAME:
				setMappingname(MAPPINGNAME_EDEFAULT);
				return;
			case W3schoolsPackage.HWMAPPING__PERFORMANCE:
				setPerformance((Performance)null);
				return;
			case W3schoolsPackage.HWMAPPING__DESCRIPTION:
				setDescription((Description)null);
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
			case W3schoolsPackage.HWMAPPING__MAPPINGNAME:
				return MAPPINGNAME_EDEFAULT == null ? mappingname != null : !MAPPINGNAME_EDEFAULT.equals(mappingname);
			case W3schoolsPackage.HWMAPPING__PERFORMANCE:
				return performance != null;
			case W3schoolsPackage.HWMAPPING__DESCRIPTION:
				return description != null;
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
		result.append(" (mappingname: ");
		result.append(mappingname);
		result.append(')');
		return result.toString();
	}

} //HwmappingImpl
