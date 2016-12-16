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

import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad Hoc Connections Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AdHocConnectionsTypeImpl#getAdHocConnection <em>Ad Hoc Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdHocConnectionsTypeImpl extends EObjectImpl implements AdHocConnectionsType {
	/**
	 * The cached value of the '{@link #getAdHocConnection() <em>Ad Hoc Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdHocConnection()
	 * @generated
	 * @ordered
	 */
	protected EList adHocConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdHocConnectionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getAdHocConnectionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAdHocConnection() {
		if (adHocConnection == null) {
			adHocConnection = new EObjectContainmentEList(AdHocConnectionType.class, this, _1Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION);
		}
		return adHocConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				return ((InternalEList)getAdHocConnection()).basicRemove(otherEnd, msgs);
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
			case _1Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				return getAdHocConnection();
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
			case _1Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				getAdHocConnection().clear();
				getAdHocConnection().addAll((Collection)newValue);
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
			case _1Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				getAdHocConnection().clear();
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
			case _1Package.AD_HOC_CONNECTIONS_TYPE__AD_HOC_CONNECTION:
				return adHocConnection != null && !adHocConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdHocConnectionsTypeImpl
