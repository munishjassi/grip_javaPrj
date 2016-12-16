/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.MonitorInterconnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interconnections Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.InterconnectionsTypeImpl#getInterconnection <em>Interconnection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.InterconnectionsTypeImpl#getMonitorInterconnection <em>Monitor Interconnection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterconnectionsTypeImpl extends EObjectImpl implements InterconnectionsType {
	/**
	 * The cached value of the '{@link #getInterconnection() <em>Interconnection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnection()
	 * @generated
	 * @ordered
	 */
	protected EList interconnection;

	/**
	 * The cached value of the '{@link #getMonitorInterconnection() <em>Monitor Interconnection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorInterconnection()
	 * @generated
	 * @ordered
	 */
	protected EList monitorInterconnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterconnectionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getInterconnectionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInterconnection() {
		if (interconnection == null) {
			interconnection = new EObjectContainmentEList(InterconnectionType.class, this, _1Package.INTERCONNECTIONS_TYPE__INTERCONNECTION);
		}
		return interconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMonitorInterconnection() {
		if (monitorInterconnection == null) {
			monitorInterconnection = new EObjectContainmentEList(MonitorInterconnectionType.class, this, _1Package.INTERCONNECTIONS_TYPE__MONITOR_INTERCONNECTION);
		}
		return monitorInterconnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.INTERCONNECTIONS_TYPE__INTERCONNECTION:
				return ((InternalEList)getInterconnection()).basicRemove(otherEnd, msgs);
			case _1Package.INTERCONNECTIONS_TYPE__MONITOR_INTERCONNECTION:
				return ((InternalEList)getMonitorInterconnection()).basicRemove(otherEnd, msgs);
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
			case _1Package.INTERCONNECTIONS_TYPE__INTERCONNECTION:
				return getInterconnection();
			case _1Package.INTERCONNECTIONS_TYPE__MONITOR_INTERCONNECTION:
				return getMonitorInterconnection();
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
			case _1Package.INTERCONNECTIONS_TYPE__INTERCONNECTION:
				getInterconnection().clear();
				getInterconnection().addAll((Collection)newValue);
				return;
			case _1Package.INTERCONNECTIONS_TYPE__MONITOR_INTERCONNECTION:
				getMonitorInterconnection().clear();
				getMonitorInterconnection().addAll((Collection)newValue);
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
			case _1Package.INTERCONNECTIONS_TYPE__INTERCONNECTION:
				getInterconnection().clear();
				return;
			case _1Package.INTERCONNECTIONS_TYPE__MONITOR_INTERCONNECTION:
				getMonitorInterconnection().clear();
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
			case _1Package.INTERCONNECTIONS_TYPE__INTERCONNECTION:
				return interconnection != null && !interconnection.isEmpty();
			case _1Package.INTERCONNECTIONS_TYPE__MONITOR_INTERCONNECTION:
				return monitorInterconnection != null && !monitorInterconnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterconnectionsTypeImpl
