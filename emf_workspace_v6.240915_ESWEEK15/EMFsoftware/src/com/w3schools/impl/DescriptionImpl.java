/**
 */
package com.w3schools.impl;

import com.w3schools.Description;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.DescriptionImpl#getCdescription <em>Cdescription</em>}</li>
 *   <li>{@link com.w3schools.impl.DescriptionImpl#getCppdescription <em>Cppdescription</em>}</li>
 *   <li>{@link com.w3schools.impl.DescriptionImpl#getAsmdescription <em>Asmdescription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionImpl extends MinimalEObjectImpl.Container implements Description {
	/**
	 * The default value of the '{@link #getCdescription() <em>Cdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdescription() <em>Cdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdescription()
	 * @generated
	 * @ordered
	 */
	protected String cdescription = CDESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCppdescription() <em>Cppdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCppdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CPPDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCppdescription() <em>Cppdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCppdescription()
	 * @generated
	 * @ordered
	 */
	protected String cppdescription = CPPDESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsmdescription() <em>Asmdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsmdescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ASMDESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsmdescription() <em>Asmdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsmdescription()
	 * @generated
	 * @ordered
	 */
	protected String asmdescription = ASMDESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCdescription() {
		return cdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdescription(String newCdescription) {
		String oldCdescription = cdescription;
		cdescription = newCdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.DESCRIPTION__CDESCRIPTION, oldCdescription, cdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCppdescription() {
		return cppdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCppdescription(String newCppdescription) {
		String oldCppdescription = cppdescription;
		cppdescription = newCppdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.DESCRIPTION__CPPDESCRIPTION, oldCppdescription, cppdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAsmdescription() {
		return asmdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsmdescription(String newAsmdescription) {
		String oldAsmdescription = asmdescription;
		asmdescription = newAsmdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.DESCRIPTION__ASMDESCRIPTION, oldAsmdescription, asmdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3schoolsPackage.DESCRIPTION__CDESCRIPTION:
				return getCdescription();
			case W3schoolsPackage.DESCRIPTION__CPPDESCRIPTION:
				return getCppdescription();
			case W3schoolsPackage.DESCRIPTION__ASMDESCRIPTION:
				return getAsmdescription();
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
			case W3schoolsPackage.DESCRIPTION__CDESCRIPTION:
				setCdescription((String)newValue);
				return;
			case W3schoolsPackage.DESCRIPTION__CPPDESCRIPTION:
				setCppdescription((String)newValue);
				return;
			case W3schoolsPackage.DESCRIPTION__ASMDESCRIPTION:
				setAsmdescription((String)newValue);
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
			case W3schoolsPackage.DESCRIPTION__CDESCRIPTION:
				setCdescription(CDESCRIPTION_EDEFAULT);
				return;
			case W3schoolsPackage.DESCRIPTION__CPPDESCRIPTION:
				setCppdescription(CPPDESCRIPTION_EDEFAULT);
				return;
			case W3schoolsPackage.DESCRIPTION__ASMDESCRIPTION:
				setAsmdescription(ASMDESCRIPTION_EDEFAULT);
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
			case W3schoolsPackage.DESCRIPTION__CDESCRIPTION:
				return CDESCRIPTION_EDEFAULT == null ? cdescription != null : !CDESCRIPTION_EDEFAULT.equals(cdescription);
			case W3schoolsPackage.DESCRIPTION__CPPDESCRIPTION:
				return CPPDESCRIPTION_EDEFAULT == null ? cppdescription != null : !CPPDESCRIPTION_EDEFAULT.equals(cppdescription);
			case W3schoolsPackage.DESCRIPTION__ASMDESCRIPTION:
				return ASMDESCRIPTION_EDEFAULT == null ? asmdescription != null : !ASMDESCRIPTION_EDEFAULT.equals(asmdescription);
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
		result.append(" (cdescription: ");
		result.append(cdescription);
		result.append(", cppdescription: ");
		result.append(cppdescription);
		result.append(", asmdescription: ");
		result.append(asmdescription);
		result.append(')');
		return result.toString();
	}

} //DescriptionImpl
