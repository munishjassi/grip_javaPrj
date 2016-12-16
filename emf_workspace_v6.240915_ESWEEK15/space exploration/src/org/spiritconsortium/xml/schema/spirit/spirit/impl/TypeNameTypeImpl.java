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

import org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TypeNameTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TypeNameTypeImpl#isConstrained <em>Constrained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeNameTypeImpl extends EObjectImpl implements TypeNameType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrained()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRAINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstrained()
	 * @generated
	 * @ordered
	 */
	protected boolean constrained = CONSTRAINED_EDEFAULT;

	/**
	 * This is true if the Constrained attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constrainedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getTypeNameType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_NAME_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstrained() {
		return constrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrained(boolean newConstrained) {
		boolean oldConstrained = constrained;
		constrained = newConstrained;
		boolean oldConstrainedESet = constrainedESet;
		constrainedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TYPE_NAME_TYPE__CONSTRAINED, oldConstrained, constrained, !oldConstrainedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstrained() {
		boolean oldConstrained = constrained;
		boolean oldConstrainedESet = constrainedESet;
		constrained = CONSTRAINED_EDEFAULT;
		constrainedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.TYPE_NAME_TYPE__CONSTRAINED, oldConstrained, CONSTRAINED_EDEFAULT, oldConstrainedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstrained() {
		return constrainedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.TYPE_NAME_TYPE__VALUE:
				return getValue();
			case _1Package.TYPE_NAME_TYPE__CONSTRAINED:
				return isConstrained() ? Boolean.TRUE : Boolean.FALSE;
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
			case _1Package.TYPE_NAME_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case _1Package.TYPE_NAME_TYPE__CONSTRAINED:
				setConstrained(((Boolean)newValue).booleanValue());
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
			case _1Package.TYPE_NAME_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case _1Package.TYPE_NAME_TYPE__CONSTRAINED:
				unsetConstrained();
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
			case _1Package.TYPE_NAME_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case _1Package.TYPE_NAME_TYPE__CONSTRAINED:
				return isSetConstrained();
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
		result.append(value);
		result.append(", constrained: ");
		if (constrainedESet) result.append(constrained); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeNameTypeImpl
