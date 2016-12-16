/**
 */
package com.w3schools.impl;

import com.w3schools.LoopSpecificationsType;
import com.w3schools.W3schoolsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Specifications Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.LoopSpecificationsTypeImpl#getLoopname <em>Loopname</em>}</li>
 *   <li>{@link com.w3schools.impl.LoopSpecificationsTypeImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.w3schools.impl.LoopSpecificationsTypeImpl#getStartsubmodule <em>Startsubmodule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopSpecificationsTypeImpl extends MinimalEObjectImpl.Container implements LoopSpecificationsType {
	/**
	 * The default value of the '{@link #getLoopname() <em>Loopname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopname()
	 * @generated
	 * @ordered
	 */
	protected static final String LOOPNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopname() <em>Loopname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopname()
	 * @generated
	 * @ordered
	 */
	protected String loopname = LOOPNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartsubmodule() <em>Startsubmodule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartsubmodule()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTSUBMODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartsubmodule() <em>Startsubmodule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartsubmodule()
	 * @generated
	 * @ordered
	 */
	protected String startsubmodule = STARTSUBMODULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopSpecificationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.LOOP_SPECIFICATIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoopname() {
		return loopname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopname(String newLoopname) {
		String oldLoopname = loopname;
		loopname = newLoopname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__LOOPNAME, oldLoopname, loopname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartsubmodule() {
		return startsubmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartsubmodule(String newStartsubmodule) {
		String oldStartsubmodule = startsubmodule;
		startsubmodule = newStartsubmodule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE, oldStartsubmodule, startsubmodule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__LOOPNAME:
				return getLoopname();
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__NUMBER:
				return getNumber();
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE:
				return getStartsubmodule();
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
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__LOOPNAME:
				setLoopname((String)newValue);
				return;
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__NUMBER:
				setNumber((String)newValue);
				return;
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE:
				setStartsubmodule((String)newValue);
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
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__LOOPNAME:
				setLoopname(LOOPNAME_EDEFAULT);
				return;
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE:
				setStartsubmodule(STARTSUBMODULE_EDEFAULT);
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
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__LOOPNAME:
				return LOOPNAME_EDEFAULT == null ? loopname != null : !LOOPNAME_EDEFAULT.equals(loopname);
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE__STARTSUBMODULE:
				return STARTSUBMODULE_EDEFAULT == null ? startsubmodule != null : !STARTSUBMODULE_EDEFAULT.equals(startsubmodule);
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
		result.append(" (loopname: ");
		result.append(loopname);
		result.append(", number: ");
		result.append(number);
		result.append(", startsubmodule: ");
		result.append(startsubmodule);
		result.append(')');
		return result.toString();
	}

} //LoopSpecificationsTypeImpl
