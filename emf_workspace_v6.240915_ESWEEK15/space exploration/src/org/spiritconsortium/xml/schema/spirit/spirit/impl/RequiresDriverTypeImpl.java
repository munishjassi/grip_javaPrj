/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.DriverTypeType;
import org.spiritconsortium.xml.schema.spirit.spirit.RequiresDriverType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requires Driver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.RequiresDriverTypeImpl#isValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.RequiresDriverTypeImpl#getDriverType <em>Driver Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequiresDriverTypeImpl extends EObjectImpl implements RequiresDriverType {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getDriverType() <em>Driver Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverType()
	 * @generated
	 * @ordered
	 */
	protected static final DriverTypeType DRIVER_TYPE_EDEFAULT = DriverTypeType.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getDriverType() <em>Driver Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriverType()
	 * @generated
	 * @ordered
	 */
	protected DriverTypeType driverType = DRIVER_TYPE_EDEFAULT;

	/**
	 * This is true if the Driver Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean driverTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiresDriverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getRequiresDriverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REQUIRES_DRIVER_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		boolean oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.REQUIRES_DRIVER_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DriverTypeType getDriverType() {
		return driverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriverType(DriverTypeType newDriverType) {
		DriverTypeType oldDriverType = driverType;
		driverType = newDriverType == null ? DRIVER_TYPE_EDEFAULT : newDriverType;
		boolean oldDriverTypeESet = driverTypeESet;
		driverTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.REQUIRES_DRIVER_TYPE__DRIVER_TYPE, oldDriverType, driverType, !oldDriverTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDriverType() {
		DriverTypeType oldDriverType = driverType;
		boolean oldDriverTypeESet = driverTypeESet;
		driverType = DRIVER_TYPE_EDEFAULT;
		driverTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.REQUIRES_DRIVER_TYPE__DRIVER_TYPE, oldDriverType, DRIVER_TYPE_EDEFAULT, oldDriverTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDriverType() {
		return driverTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.REQUIRES_DRIVER_TYPE__VALUE:
				return isValue() ? Boolean.TRUE : Boolean.FALSE;
			case _1Package.REQUIRES_DRIVER_TYPE__DRIVER_TYPE:
				return getDriverType();
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
			case _1Package.REQUIRES_DRIVER_TYPE__VALUE:
				setValue(((Boolean)newValue).booleanValue());
				return;
			case _1Package.REQUIRES_DRIVER_TYPE__DRIVER_TYPE:
				setDriverType((DriverTypeType)newValue);
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
			case _1Package.REQUIRES_DRIVER_TYPE__VALUE:
				unsetValue();
				return;
			case _1Package.REQUIRES_DRIVER_TYPE__DRIVER_TYPE:
				unsetDriverType();
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
			case _1Package.REQUIRES_DRIVER_TYPE__VALUE:
				return isSetValue();
			case _1Package.REQUIRES_DRIVER_TYPE__DRIVER_TYPE:
				return isSetDriverType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		if (valueESet) result.append(value); else result.append("<unset>");
		result.append(", driverType: ");
		if (driverTypeESet) result.append(driverType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RequiresDriverTypeImpl
