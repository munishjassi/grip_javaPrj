/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.MasterType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MasterTypeImpl#getAddressSpaceRef <em>Address Space Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MasterTypeImpl extends EObjectImpl implements MasterType {
	/**
	 * The cached value of the '{@link #getAddressSpaceRef() <em>Address Space Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceRef()
	 * @generated
	 * @ordered
	 */
	protected AddressSpaceRefType addressSpaceRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getMasterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceRefType getAddressSpaceRef() {
		return addressSpaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpaceRef(AddressSpaceRefType newAddressSpaceRef, NotificationChain msgs) {
		AddressSpaceRefType oldAddressSpaceRef = addressSpaceRef;
		addressSpaceRef = newAddressSpaceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MASTER_TYPE__ADDRESS_SPACE_REF, oldAddressSpaceRef, newAddressSpaceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaceRef(AddressSpaceRefType newAddressSpaceRef) {
		if (newAddressSpaceRef != addressSpaceRef) {
			NotificationChain msgs = null;
			if (addressSpaceRef != null)
				msgs = ((InternalEObject)addressSpaceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MASTER_TYPE__ADDRESS_SPACE_REF, null, msgs);
			if (newAddressSpaceRef != null)
				msgs = ((InternalEObject)newAddressSpaceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MASTER_TYPE__ADDRESS_SPACE_REF, null, msgs);
			msgs = basicSetAddressSpaceRef(newAddressSpaceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MASTER_TYPE__ADDRESS_SPACE_REF, newAddressSpaceRef, newAddressSpaceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.MASTER_TYPE__ADDRESS_SPACE_REF:
				return basicSetAddressSpaceRef(null, msgs);
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
			case _1Package.MASTER_TYPE__ADDRESS_SPACE_REF:
				return getAddressSpaceRef();
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
			case _1Package.MASTER_TYPE__ADDRESS_SPACE_REF:
				setAddressSpaceRef((AddressSpaceRefType)newValue);
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
			case _1Package.MASTER_TYPE__ADDRESS_SPACE_REF:
				setAddressSpaceRef((AddressSpaceRefType)null);
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
			case _1Package.MASTER_TYPE__ADDRESS_SPACE_REF:
				return addressSpaceRef != null;
		}
		return super.eIsSet(featureID);
	}

} //MasterTypeImpl
