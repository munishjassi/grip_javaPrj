/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressesType;
import org.spiritconsortium.xml.schema.spirit.spirit.RangeType2;
import org.spiritconsortium.xml.schema.spirit.spirit.RemapAddressType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Addresses Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BaseAddressesTypeImpl#getRemapAddress <em>Remap Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BaseAddressesTypeImpl#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseAddressesTypeImpl extends EObjectImpl implements BaseAddressesType {
	/**
	 * The cached value of the '{@link #getRemapAddress() <em>Remap Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemapAddress()
	 * @generated
	 * @ordered
	 */
	protected EList remapAddress;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeType2 range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseAddressesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getBaseAddressesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRemapAddress() {
		if (remapAddress == null) {
			remapAddress = new EObjectContainmentEList(RemapAddressType.class, this, _1Package.BASE_ADDRESSES_TYPE__REMAP_ADDRESS);
		}
		return remapAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeType2 getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(RangeType2 newRange, NotificationChain msgs) {
		RangeType2 oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.BASE_ADDRESSES_TYPE__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(RangeType2 newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.BASE_ADDRESSES_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.BASE_ADDRESSES_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.BASE_ADDRESSES_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				return ((InternalEList)getRemapAddress()).basicRemove(otherEnd, msgs);
			case _1Package.BASE_ADDRESSES_TYPE__RANGE:
				return basicSetRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				return getRemapAddress();
			case _1Package.BASE_ADDRESSES_TYPE__RANGE:
				return getRange();
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
			case _1Package.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				getRemapAddress().clear();
				getRemapAddress().addAll((Collection)newValue);
				return;
			case _1Package.BASE_ADDRESSES_TYPE__RANGE:
				setRange((RangeType2)newValue);
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
			case _1Package.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				getRemapAddress().clear();
				return;
			case _1Package.BASE_ADDRESSES_TYPE__RANGE:
				setRange((RangeType2)null);
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
			case _1Package.BASE_ADDRESSES_TYPE__REMAP_ADDRESS:
				return remapAddress != null && !remapAddress.isEmpty();
			case _1Package.BASE_ADDRESSES_TYPE__RANGE:
				return range != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseAddressesTypeImpl
