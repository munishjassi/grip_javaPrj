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

import org.spiritconsortium.xml.schema.spirit.spirit.GeneratorSelectorType;
import org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator Selector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.GeneratorSelectorTypeImpl#getGroupSelector <em>Group Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorSelectorTypeImpl extends EObjectImpl implements GeneratorSelectorType {
	/**
	 * The cached value of the '{@link #getGroupSelector() <em>Group Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupSelector()
	 * @generated
	 * @ordered
	 */
	protected GroupSelectorType groupSelector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorSelectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getGeneratorSelectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupSelectorType getGroupSelector() {
		return groupSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupSelector(GroupSelectorType newGroupSelector, NotificationChain msgs) {
		GroupSelectorType oldGroupSelector = groupSelector;
		groupSelector = newGroupSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR, oldGroupSelector, newGroupSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupSelector(GroupSelectorType newGroupSelector) {
		if (newGroupSelector != groupSelector) {
			NotificationChain msgs = null;
			if (groupSelector != null)
				msgs = ((InternalEObject)groupSelector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR, null, msgs);
			if (newGroupSelector != null)
				msgs = ((InternalEObject)newGroupSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR, null, msgs);
			msgs = basicSetGroupSelector(newGroupSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR, newGroupSelector, newGroupSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR:
				return basicSetGroupSelector(null, msgs);
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
			case _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR:
				return getGroupSelector();
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
			case _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR:
				setGroupSelector((GroupSelectorType)newValue);
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
			case _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR:
				setGroupSelector((GroupSelectorType)null);
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
			case _1Package.GENERATOR_SELECTOR_TYPE__GROUP_SELECTOR:
				return groupSelector != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneratorSelectorTypeImpl
