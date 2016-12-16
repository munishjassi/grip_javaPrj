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

import org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType1;
import org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1;
import org.spiritconsortium.xml.schema.spirit.spirit.PortMapType1;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Map Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.PortMapType1Impl#getLogicalPort <em>Logical Port</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.PortMapType1Impl#getPhysicalPort <em>Physical Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortMapType1Impl extends EObjectImpl implements PortMapType1 {
	/**
	 * The cached value of the '{@link #getLogicalPort() <em>Logical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalPort()
	 * @generated
	 * @ordered
	 */
	protected LogicalPortType1 logicalPort;

	/**
	 * The cached value of the '{@link #getPhysicalPort() <em>Physical Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalPort()
	 * @generated
	 * @ordered
	 */
	protected PhysicalPortType1 physicalPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortMapType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getPortMapType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalPortType1 getLogicalPort() {
		return logicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogicalPort(LogicalPortType1 newLogicalPort, NotificationChain msgs) {
		LogicalPortType1 oldLogicalPort = logicalPort;
		logicalPort = newLogicalPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE1__LOGICAL_PORT, oldLogicalPort, newLogicalPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalPort(LogicalPortType1 newLogicalPort) {
		if (newLogicalPort != logicalPort) {
			NotificationChain msgs = null;
			if (logicalPort != null)
				msgs = ((InternalEObject)logicalPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE1__LOGICAL_PORT, null, msgs);
			if (newLogicalPort != null)
				msgs = ((InternalEObject)newLogicalPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE1__LOGICAL_PORT, null, msgs);
			msgs = basicSetLogicalPort(newLogicalPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE1__LOGICAL_PORT, newLogicalPort, newLogicalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPortType1 getPhysicalPort() {
		return physicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalPort(PhysicalPortType1 newPhysicalPort, NotificationChain msgs) {
		PhysicalPortType1 oldPhysicalPort = physicalPort;
		physicalPort = newPhysicalPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT, oldPhysicalPort, newPhysicalPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalPort(PhysicalPortType1 newPhysicalPort) {
		if (newPhysicalPort != physicalPort) {
			NotificationChain msgs = null;
			if (physicalPort != null)
				msgs = ((InternalEObject)physicalPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT, null, msgs);
			if (newPhysicalPort != null)
				msgs = ((InternalEObject)newPhysicalPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT, null, msgs);
			msgs = basicSetPhysicalPort(newPhysicalPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT, newPhysicalPort, newPhysicalPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.PORT_MAP_TYPE1__LOGICAL_PORT:
				return basicSetLogicalPort(null, msgs);
			case _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT:
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
			case _1Package.PORT_MAP_TYPE1__LOGICAL_PORT:
				return getLogicalPort();
			case _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT:
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
			case _1Package.PORT_MAP_TYPE1__LOGICAL_PORT:
				setLogicalPort((LogicalPortType1)newValue);
				return;
			case _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT:
				setPhysicalPort((PhysicalPortType1)newValue);
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
			case _1Package.PORT_MAP_TYPE1__LOGICAL_PORT:
				setLogicalPort((LogicalPortType1)null);
				return;
			case _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT:
				setPhysicalPort((PhysicalPortType1)null);
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
			case _1Package.PORT_MAP_TYPE1__LOGICAL_PORT:
				return logicalPort != null;
			case _1Package.PORT_MAP_TYPE1__PHYSICAL_PORT:
				return physicalPort != null;
		}
		return super.eIsSet(featureID);
	}

} //PortMapType1Impl
