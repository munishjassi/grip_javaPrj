/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.spiritconsortium.xml.schema.spirit.spirit.TransTypeDefType;
import org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trans Type Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TransTypeDefTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.TransTypeDefTypeImpl#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransTypeDefTypeImpl extends EObjectImpl implements TransTypeDefType {
	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected TypeNameType typeName;

	/**
	 * The cached value of the '{@link #getTypeDefinition() <em>Type Definition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList typeDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransTypeDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getTransTypeDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeNameType getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeName(TypeNameType newTypeName, NotificationChain msgs) {
		TypeNameType oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME, oldTypeName, newTypeName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(TypeNameType newTypeName) {
		if (newTypeName != typeName) {
			NotificationChain msgs = null;
			if (typeName != null)
				msgs = ((InternalEObject)typeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME, null, msgs);
			if (newTypeName != null)
				msgs = ((InternalEObject)newTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME, null, msgs);
			msgs = basicSetTypeName(newTypeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME, newTypeName, newTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTypeDefinition() {
		if (typeDefinition == null) {
			typeDefinition = new EDataTypeEList(String.class, this, _1Package.TRANS_TYPE_DEF_TYPE__TYPE_DEFINITION);
		}
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME:
				return basicSetTypeName(null, msgs);
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
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME:
				return getTypeName();
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_DEFINITION:
				return getTypeDefinition();
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
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME:
				setTypeName((TypeNameType)newValue);
				return;
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_DEFINITION:
				getTypeDefinition().clear();
				getTypeDefinition().addAll((Collection)newValue);
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
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME:
				setTypeName((TypeNameType)null);
				return;
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_DEFINITION:
				getTypeDefinition().clear();
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
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_NAME:
				return typeName != null;
			case _1Package.TRANS_TYPE_DEF_TYPE__TYPE_DEFINITION:
				return typeDefinition != null && !typeDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeDefinition: ");
		result.append(typeDefinition);
		result.append(')');
		return result.toString();
	}

} //TransTypeDefTypeImpl
