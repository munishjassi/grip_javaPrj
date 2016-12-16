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

import org.spiritconsortium.xml.schema.spirit.spirit.TransportMethodType;
import org.spiritconsortium.xml.schema.spirit.spirit.TransportMethodsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Methods Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TransportMethodsTypeImpl#getTransportMethod <em>Transport Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportMethodsTypeImpl extends EObjectImpl implements TransportMethodsType {
	/**
	 * The default value of the '{@link #getTransportMethod() <em>Transport Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethod()
	 * @generated
	 * @ordered
	 */
	protected static final TransportMethodType TRANSPORT_METHOD_EDEFAULT = TransportMethodType.FILE_LITERAL;

	/**
	 * The cached value of the '{@link #getTransportMethod() <em>Transport Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMethod()
	 * @generated
	 * @ordered
	 */
	protected TransportMethodType transportMethod = TRANSPORT_METHOD_EDEFAULT;

	/**
	 * This is true if the Transport Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportMethodESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportMethodsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getTransportMethodsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportMethodType getTransportMethod() {
		return transportMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportMethod(TransportMethodType newTransportMethod) {
		TransportMethodType oldTransportMethod = transportMethod;
		transportMethod = newTransportMethod == null ? TRANSPORT_METHOD_EDEFAULT : newTransportMethod;
		boolean oldTransportMethodESet = transportMethodESet;
		transportMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TRANSPORT_METHODS_TYPE__TRANSPORT_METHOD, oldTransportMethod, transportMethod, !oldTransportMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportMethod() {
		TransportMethodType oldTransportMethod = transportMethod;
		boolean oldTransportMethodESet = transportMethodESet;
		transportMethod = TRANSPORT_METHOD_EDEFAULT;
		transportMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.TRANSPORT_METHODS_TYPE__TRANSPORT_METHOD, oldTransportMethod, TRANSPORT_METHOD_EDEFAULT, oldTransportMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportMethod() {
		return transportMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.TRANSPORT_METHODS_TYPE__TRANSPORT_METHOD:
				return getTransportMethod();
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
			case _1Package.TRANSPORT_METHODS_TYPE__TRANSPORT_METHOD:
				setTransportMethod((TransportMethodType)newValue);
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
			case _1Package.TRANSPORT_METHODS_TYPE__TRANSPORT_METHOD:
				unsetTransportMethod();
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
			case _1Package.TRANSPORT_METHODS_TYPE__TRANSPORT_METHOD:
				return isSetTransportMethod();
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
		result.append(" (transportMethod: ");
		if (transportMethodESet) result.append(transportMethod); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TransportMethodsTypeImpl
