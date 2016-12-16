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

import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whitebox Element Refs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementRefsTypeImpl#getWhiteboxElementRef <em>Whitebox Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhiteboxElementRefsTypeImpl extends EObjectImpl implements WhiteboxElementRefsType {
	/**
	 * The cached value of the '{@link #getWhiteboxElementRef() <em>Whitebox Element Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxElementRef()
	 * @generated
	 * @ordered
	 */
	protected EList whiteboxElementRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhiteboxElementRefsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getWhiteboxElementRefsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWhiteboxElementRef() {
		if (whiteboxElementRef == null) {
			whiteboxElementRef = new EObjectContainmentEList(WhiteboxElementRefType.class, this, _1Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF);
		}
		return whiteboxElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				return ((InternalEList)getWhiteboxElementRef()).basicRemove(otherEnd, msgs);
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
			case _1Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				return getWhiteboxElementRef();
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
			case _1Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				getWhiteboxElementRef().clear();
				getWhiteboxElementRef().addAll((Collection)newValue);
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
			case _1Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				getWhiteboxElementRef().clear();
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
			case _1Package.WHITEBOX_ELEMENT_REFS_TYPE__WHITEBOX_ELEMENT_REF:
				return whiteboxElementRef != null && !whiteboxElementRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhiteboxElementRefsTypeImpl
