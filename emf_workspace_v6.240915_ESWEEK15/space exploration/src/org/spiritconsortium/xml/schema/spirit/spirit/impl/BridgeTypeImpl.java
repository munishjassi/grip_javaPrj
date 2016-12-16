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

import org.spiritconsortium.xml.schema.spirit.spirit.BridgeType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bridge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BridgeTypeImpl#getMasterRef <em>Master Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.BridgeTypeImpl#isOpaque <em>Opaque</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeTypeImpl extends EObjectImpl implements BridgeType {
	/**
	 * The default value of the '{@link #getMasterRef() <em>Master Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMasterRef() <em>Master Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterRef()
	 * @generated
	 * @ordered
	 */
	protected String masterRef = MASTER_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPAQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOpaque() <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpaque()
	 * @generated
	 * @ordered
	 */
	protected boolean opaque = OPAQUE_EDEFAULT;

	/**
	 * This is true if the Opaque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean opaqueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getBridgeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMasterRef() {
		return masterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterRef(String newMasterRef) {
		String oldMasterRef = masterRef;
		masterRef = newMasterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.BRIDGE_TYPE__MASTER_REF, oldMasterRef, masterRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpaque() {
		return opaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpaque(boolean newOpaque) {
		boolean oldOpaque = opaque;
		opaque = newOpaque;
		boolean oldOpaqueESet = opaqueESet;
		opaqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.BRIDGE_TYPE__OPAQUE, oldOpaque, opaque, !oldOpaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOpaque() {
		boolean oldOpaque = opaque;
		boolean oldOpaqueESet = opaqueESet;
		opaque = OPAQUE_EDEFAULT;
		opaqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.BRIDGE_TYPE__OPAQUE, oldOpaque, OPAQUE_EDEFAULT, oldOpaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOpaque() {
		return opaqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.BRIDGE_TYPE__MASTER_REF:
				return getMasterRef();
			case _1Package.BRIDGE_TYPE__OPAQUE:
				return isOpaque() ? Boolean.TRUE : Boolean.FALSE;
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
			case _1Package.BRIDGE_TYPE__MASTER_REF:
				setMasterRef((String)newValue);
				return;
			case _1Package.BRIDGE_TYPE__OPAQUE:
				setOpaque(((Boolean)newValue).booleanValue());
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
			case _1Package.BRIDGE_TYPE__MASTER_REF:
				setMasterRef(MASTER_REF_EDEFAULT);
				return;
			case _1Package.BRIDGE_TYPE__OPAQUE:
				unsetOpaque();
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
			case _1Package.BRIDGE_TYPE__MASTER_REF:
				return MASTER_REF_EDEFAULT == null ? masterRef != null : !MASTER_REF_EDEFAULT.equals(masterRef);
			case _1Package.BRIDGE_TYPE__OPAQUE:
				return isSetOpaque();
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
		result.append(" (masterRef: ");
		result.append(masterRef);
		result.append(", opaque: ");
		if (opaqueESet) result.append(opaque); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BridgeTypeImpl
