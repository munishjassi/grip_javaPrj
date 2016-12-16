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

import org.spiritconsortium.xml.schema.spirit.spirit.AbstractorBusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit.AbstractorInterfacesType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstractor Interfaces Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorInterfacesTypeImpl#getAbstractorInterface <em>Abstractor Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractorInterfacesTypeImpl extends EObjectImpl implements AbstractorInterfacesType {
	/**
	 * The cached value of the '{@link #getAbstractorInterface() <em>Abstractor Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractorInterface()
	 * @generated
	 * @ordered
	 */
	protected EList abstractorInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractorInterfacesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getAbstractorInterfacesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbstractorInterface() {
		if (abstractorInterface == null) {
			abstractorInterface = new EObjectContainmentEList(AbstractorBusInterfaceType.class, this, _1Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE);
		}
		return abstractorInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				return ((InternalEList)getAbstractorInterface()).basicRemove(otherEnd, msgs);
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
			case _1Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				return getAbstractorInterface();
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
			case _1Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				getAbstractorInterface().clear();
				getAbstractorInterface().addAll((Collection)newValue);
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
			case _1Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				getAbstractorInterface().clear();
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
			case _1Package.ABSTRACTOR_INTERFACES_TYPE__ABSTRACTOR_INTERFACE:
				return abstractorInterface != null && !abstractorInterface.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractorInterfacesTypeImpl
