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

import org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType;
import org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortMapType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.PortMapTypeImpl#getLogicalPort <em>Logical Port</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.PortMapTypeImpl#getPhysicalPort <em>Physical Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortMapTypeImpl extends EObjectImpl implements PortMapType {
	/**
	 * The cached value of the '{@link #getLogicalPort() <em>Logical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalPort()
	 * @generated
	 * @ordered
	 */
	protected LogicalPortType logicalPort;

	/**
	 * The cached value of the '{@link #getPhysicalPort() <em>Physical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalPort()
	 * @generated
	 * @ordered
	 */
	protected PhysicalPortType physicalPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getPortMapType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPortType getLogicalPort() {
		return logicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalPort(LogicalPortType newLogicalPort, NotificationChain msgs) {
		LogicalPortType oldLogicalPort = logicalPort;
		logicalPort = newLogicalPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE__LOGICAL_PORT, oldLogicalPort, newLogicalPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalPort(LogicalPortType newLogicalPort) {
		if (newLogicalPort != logicalPort) {
			NotificationChain msgs = null;
			if (logicalPort != null)
				msgs = ((InternalEObject)logicalPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE__LOGICAL_PORT, null, msgs);
			if (newLogicalPort != null)
				msgs = ((InternalEObject)newLogicalPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE__LOGICAL_PORT, null, msgs);
			msgs = basicSetLogicalPort(newLogicalPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE__LOGICAL_PORT, newLogicalPort, newLogicalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPortType getPhysicalPort() {
		return physicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalPort(PhysicalPortType newPhysicalPort, NotificationChain msgs) {
		PhysicalPortType oldPhysicalPort = physicalPort;
		physicalPort = newPhysicalPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE__PHYSICAL_PORT, oldPhysicalPort, newPhysicalPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalPort(PhysicalPortType newPhysicalPort) {
		if (newPhysicalPort != physicalPort) {
			NotificationChain msgs = null;
			if (physicalPort != null)
				msgs = ((InternalEObject)physicalPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE__PHYSICAL_PORT, null, msgs);
			if (newPhysicalPort != null)
				msgs = ((InternalEObject)newPhysicalPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE__PHYSICAL_PORT, null, msgs);
			msgs = basicSetPhysicalPort(newPhysicalPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE__PHYSICAL_PORT, newPhysicalPort, newPhysicalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.PORT_MAP_TYPE__LOGICAL_PORT:
				return basicSetLogicalPort(null, msgs);
			case _1Package.PORT_MAP_TYPE__PHYSICAL_PORT:
				return basicSetPhysicalPort(null, msgs);
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
			case _1Package.PORT_MAP_TYPE__LOGICAL_PORT:
				return getLogicalPort();
			case _1Package.PORT_MAP_TYPE__PHYSICAL_PORT:
				return getPhysicalPort();
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
			case _1Package.PORT_MAP_TYPE__LOGICAL_PORT:
				setLogicalPort((LogicalPortType)newValue);
				return;
			case _1Package.PORT_MAP_TYPE__PHYSICAL_PORT:
				setPhysicalPort((PhysicalPortType)newValue);
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
			case _1Package.PORT_MAP_TYPE__LOGICAL_PORT:
				setLogicalPort((LogicalPortType)null);
				return;
			case _1Package.PORT_MAP_TYPE__PHYSICAL_PORT:
				setPhysicalPort((PhysicalPortType)null);
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
			case _1Package.PORT_MAP_TYPE__LOGICAL_PORT:
				return logicalPort != null;
			case _1Package.PORT_MAP_TYPE__PHYSICAL_PORT:
				return physicalPort != null;
		}
		return super.eIsSet(featureID);
	}

} //PortMapTypeImpl
