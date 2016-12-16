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

import org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefType;
import org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Type Defs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.ServiceTypeDefsTypeImpl#getServiceTypeDef <em>Service Type Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceTypeDefsTypeImpl extends EObjectImpl implements ServiceTypeDefsType {
	/**
	 * The cached value of the '{@link #getServiceTypeDef() <em>Service Type Def</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTypeDef()
	 * @generated
	 * @ordered
	 */
	protected EList serviceTypeDef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTypeDefsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getServiceTypeDefsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getServiceTypeDef() {
		if (serviceTypeDef == null) {
			serviceTypeDef = new EObjectContainmentEList(ServiceTypeDefType.class, this, _1Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF);
		}
		return serviceTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				return ((InternalEList)getServiceTypeDef()).basicRemove(otherEnd, msgs);
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
			case _1Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				return getServiceTypeDef();
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
			case _1Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				getServiceTypeDef().clear();
				getServiceTypeDef().addAll((Collection)newValue);
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
			case _1Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				getServiceTypeDef().clear();
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
			case _1Package.SERVICE_TYPE_DEFS_TYPE__SERVICE_TYPE_DEF:
				return serviceTypeDef != null && !serviceTypeDef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceTypeDefsTypeImpl
