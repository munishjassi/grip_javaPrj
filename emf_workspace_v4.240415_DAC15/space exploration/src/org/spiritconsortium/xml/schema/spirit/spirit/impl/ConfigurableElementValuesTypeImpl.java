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

import org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValueType;
import org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValuesType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurable Element Values Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.ConfigurableElementValuesTypeImpl#getConfigurableElementValue <em>Configurable Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurableElementValuesTypeImpl extends EObjectImpl implements ConfigurableElementValuesType {
	/**
	 * The cached value of the '{@link #getConfigurableElementValue() <em>Configurable Element Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurableElementValue()
	 * @generated
	 * @ordered
	 */
	protected EList configurableElementValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurableElementValuesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getConfigurableElementValuesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConfigurableElementValue() {
		if (configurableElementValue == null) {
			configurableElementValue = new EObjectContainmentEList(ConfigurableElementValueType.class, this, _1Package.CONFIGURABLE_ELEMENT_VALUES_TYPE__CONFIGURABLE_ELEMENT_VALUE);
		}
		return configurableElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.CONFIGURABLE_ELEMENT_VALUES_TYPE__CONFIGURABLE_ELEMENT_VALUE:
				return ((InternalEList)getConfigurableElementValue()).basicRemove(otherEnd, msgs);
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
			case _1Package.CONFIGURABLE_ELEMENT_VALUES_TYPE__CONFIGURABLE_ELEMENT_VALUE:
				return getConfigurableElementValue();
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
			case _1Package.CONFIGURABLE_ELEMENT_VALUES_TYPE__CONFIGURABLE_ELEMENT_VALUE:
				getConfigurableElementValue().clear();
				getConfigurableElementValue().addAll((Collection)newValue);
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
			case _1Package.CONFIGURABLE_ELEMENT_VALUES_TYPE__CONFIGURABLE_ELEMENT_VALUE:
				getConfigurableElementValue().clear();
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
			case _1Package.CONFIGURABLE_ELEMENT_VALUES_TYPE__CONFIGURABLE_ELEMENT_VALUE:
				return configurableElementValue != null && !configurableElementValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurableElementValuesTypeImpl
