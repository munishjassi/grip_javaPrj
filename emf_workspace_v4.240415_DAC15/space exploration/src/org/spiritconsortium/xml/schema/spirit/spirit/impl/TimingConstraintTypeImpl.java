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

import org.spiritconsortium.xml.schema.spirit.spirit.DelayValueType;
import org.spiritconsortium.xml.schema.spirit.spirit.EdgeValueType;
import org.spiritconsortium.xml.schema.spirit.spirit.TimingConstraintType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timing Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TimingConstraintTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TimingConstraintTypeImpl#getClockEdge <em>Clock Edge</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TimingConstraintTypeImpl#getClockName <em>Clock Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TimingConstraintTypeImpl#getDelayType <em>Delay Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimingConstraintTypeImpl extends EObjectImpl implements TimingConstraintType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getClockEdge() <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockEdge()
	 * @generated
	 * @ordered
	 */
	protected static final EdgeValueType CLOCK_EDGE_EDEFAULT = EdgeValueType.RISE_LITERAL;

	/**
	 * The cached value of the '{@link #getClockEdge() <em>Clock Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockEdge()
	 * @generated
	 * @ordered
	 */
	protected EdgeValueType clockEdge = CLOCK_EDGE_EDEFAULT;

	/**
	 * This is true if the Clock Edge attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clockEdgeESet;

	/**
	 * The default value of the '{@link #getClockName() <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOCK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockName() <em>Clock Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockName()
	 * @generated
	 * @ordered
	 */
	protected String clockName = CLOCK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelayType() <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayType()
	 * @generated
	 * @ordered
	 */
	protected static final DelayValueType DELAY_TYPE_EDEFAULT = DelayValueType.MIN_LITERAL;

	/**
	 * The cached value of the '{@link #getDelayType() <em>Delay Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayType()
	 * @generated
	 * @ordered
	 */
	protected DelayValueType delayType = DELAY_TYPE_EDEFAULT;

	/**
	 * This is true if the Delay Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delayTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimingConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getTimingConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TIMING_CONSTRAINT_TYPE__VALUE, oldValue, value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		float oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.TIMING_CONSTRAINT_TYPE__VALUE, oldValue, VALUE_EDEFAULT, oldValueESet));
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
	public EdgeValueType getClockEdge() {
		return clockEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockEdge(EdgeValueType newClockEdge) {
		EdgeValueType oldClockEdge = clockEdge;
		clockEdge = newClockEdge == null ? CLOCK_EDGE_EDEFAULT : newClockEdge;
		boolean oldClockEdgeESet = clockEdgeESet;
		clockEdgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE, oldClockEdge, clockEdge, !oldClockEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClockEdge() {
		EdgeValueType oldClockEdge = clockEdge;
		boolean oldClockEdgeESet = clockEdgeESet;
		clockEdge = CLOCK_EDGE_EDEFAULT;
		clockEdgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE, oldClockEdge, CLOCK_EDGE_EDEFAULT, oldClockEdgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClockEdge() {
		return clockEdgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClockName() {
		return clockName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockName(String newClockName) {
		String oldClockName = clockName;
		clockName = newClockName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME, oldClockName, clockName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayValueType getDelayType() {
		return delayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayType(DelayValueType newDelayType) {
		DelayValueType oldDelayType = delayType;
		delayType = newDelayType == null ? DELAY_TYPE_EDEFAULT : newDelayType;
		boolean oldDelayTypeESet = delayTypeESet;
		delayTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE, oldDelayType, delayType, !oldDelayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelayType() {
		DelayValueType oldDelayType = delayType;
		boolean oldDelayTypeESet = delayTypeESet;
		delayType = DELAY_TYPE_EDEFAULT;
		delayTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE, oldDelayType, DELAY_TYPE_EDEFAULT, oldDelayTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelayType() {
		return delayTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.TIMING_CONSTRAINT_TYPE__VALUE:
				return new Float(getValue());
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				return getClockEdge();
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				return getClockName();
			case _1Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				return getDelayType();
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
			case _1Package.TIMING_CONSTRAINT_TYPE__VALUE:
				setValue(((Float)newValue).floatValue());
				return;
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				setClockEdge((EdgeValueType)newValue);
				return;
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				setClockName((String)newValue);
				return;
			case _1Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				setDelayType((DelayValueType)newValue);
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
			case _1Package.TIMING_CONSTRAINT_TYPE__VALUE:
				unsetValue();
				return;
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				unsetClockEdge();
				return;
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				setClockName(CLOCK_NAME_EDEFAULT);
				return;
			case _1Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				unsetDelayType();
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
			case _1Package.TIMING_CONSTRAINT_TYPE__VALUE:
				return isSetValue();
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_EDGE:
				return isSetClockEdge();
			case _1Package.TIMING_CONSTRAINT_TYPE__CLOCK_NAME:
				return CLOCK_NAME_EDEFAULT == null ? clockName != null : !CLOCK_NAME_EDEFAULT.equals(clockName);
			case _1Package.TIMING_CONSTRAINT_TYPE__DELAY_TYPE:
				return isSetDelayType();
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
		result.append(", clockEdge: ");
		if (clockEdgeESet) result.append(clockEdge); else result.append("<unset>");
		result.append(", clockName: ");
		result.append(clockName);
		result.append(", delayType: ");
		if (delayTypeESet) result.append(delayType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TimingConstraintTypeImpl
