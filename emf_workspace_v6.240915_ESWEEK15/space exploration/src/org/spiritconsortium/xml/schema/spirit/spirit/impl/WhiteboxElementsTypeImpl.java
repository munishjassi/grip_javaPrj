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

import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType;
import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whitebox Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementsTypeImpl#getWhiteboxElement <em>Whitebox Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhiteboxElementsTypeImpl extends EObjectImpl implements WhiteboxElementsType {
	/**
	 * The cached value of the '{@link #getWhiteboxElement() <em>Whitebox Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxElement()
	 * @generated
	 * @ordered
	 */
	protected EList whiteboxElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhiteboxElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getWhiteboxElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWhiteboxElement() {
		if (whiteboxElement == null) {
			whiteboxElement = new EObjectContainmentEList(WhiteboxElementType.class, this, _1Package.WHITEBOX_ELEMENTS_TYPE__WHITEBOX_ELEMENT);
		}
		return whiteboxElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.WHITEBOX_ELEMENTS_TYPE__WHITEBOX_ELEMENT:
				return ((InternalEList)getWhiteboxElement()).basicRemove(otherEnd, msgs);
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
			case _1Package.WHITEBOX_ELEMENTS_TYPE__WHITEBOX_ELEMENT:
				return getWhiteboxElement();
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
			case _1Package.WHITEBOX_ELEMENTS_TYPE__WHITEBOX_ELEMENT:
				getWhiteboxElement().clear();
				getWhiteboxElement().addAll((Collection)newValue);
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
			case _1Package.WHITEBOX_ELEMENTS_TYPE__WHITEBOX_ELEMENT:
				getWhiteboxElement().clear();
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
			case _1Package.WHITEBOX_ELEMENTS_TYPE__WHITEBOX_ELEMENT:
				return whiteboxElement != null && !whiteboxElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WhiteboxElementsTypeImpl
