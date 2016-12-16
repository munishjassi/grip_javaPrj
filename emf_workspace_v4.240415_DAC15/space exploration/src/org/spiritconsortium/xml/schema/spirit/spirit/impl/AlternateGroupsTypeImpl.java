/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.spiritconsortium.xml.schema.spirit.spirit.AlternateGroupsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternate Groups Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AlternateGroupsTypeImpl#getAlternateGroup <em>Alternate Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternateGroupsTypeImpl extends EObjectImpl implements AlternateGroupsType {
	/**
	 * The cached value of the '{@link #getAlternateGroup() <em>Alternate Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateGroup()
	 * @generated
	 * @ordered
	 */
	protected EList alternateGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternateGroupsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getAlternateGroupsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAlternateGroup() {
		if (alternateGroup == null) {
			alternateGroup = new EDataTypeEList(String.class, this, _1Package.ALTERNATE_GROUPS_TYPE__ALTERNATE_GROUP);
		}
		return alternateGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.ALTERNATE_GROUPS_TYPE__ALTERNATE_GROUP:
				return getAlternateGroup();
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
			case _1Package.ALTERNATE_GROUPS_TYPE__ALTERNATE_GROUP:
				getAlternateGroup().clear();
				getAlternateGroup().addAll((Collection)newValue);
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
			case _1Package.ALTERNATE_GROUPS_TYPE__ALTERNATE_GROUP:
				getAlternateGroup().clear();
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
			case _1Package.ALTERNATE_GROUPS_TYPE__ALTERNATE_GROUP:
				return alternateGroup != null && !alternateGroup.isEmpty();
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
		result.append(" (alternateGroup: ");
		result.append(alternateGroup);
		result.append(')');
		return result.toString();
	}

} //AlternateGroupsTypeImpl
