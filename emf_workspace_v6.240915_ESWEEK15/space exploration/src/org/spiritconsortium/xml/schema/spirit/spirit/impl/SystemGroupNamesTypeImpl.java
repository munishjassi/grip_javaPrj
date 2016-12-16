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

import org.spiritconsortium.xml.schema.spirit.spirit.SystemGroupNamesType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Group Names Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.SystemGroupNamesTypeImpl#getSystemGroupName <em>System Group Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemGroupNamesTypeImpl extends EObjectImpl implements SystemGroupNamesType {
	/**
	 * The cached value of the '{@link #getSystemGroupName() <em>System Group Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemGroupName()
	 * @generated
	 * @ordered
	 */
	protected EList systemGroupName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemGroupNamesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getSystemGroupNamesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSystemGroupName() {
		if (systemGroupName == null) {
			systemGroupName = new EDataTypeEList(String.class, this, _1Package.SYSTEM_GROUP_NAMES_TYPE__SYSTEM_GROUP_NAME);
		}
		return systemGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _1Package.SYSTEM_GROUP_NAMES_TYPE__SYSTEM_GROUP_NAME:
				return getSystemGroupName();
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
			case _1Package.SYSTEM_GROUP_NAMES_TYPE__SYSTEM_GROUP_NAME:
				getSystemGroupName().clear();
				getSystemGroupName().addAll((Collection)newValue);
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
			case _1Package.SYSTEM_GROUP_NAMES_TYPE__SYSTEM_GROUP_NAME:
				getSystemGroupName().clear();
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
			case _1Package.SYSTEM_GROUP_NAMES_TYPE__SYSTEM_GROUP_NAME:
				return systemGroupName != null && !systemGroupName.isEmpty();
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
		result.append(" (systemGroupName: ");
		result.append(systemGroupName);
		result.append(')');
		return result.toString();
	}

} //SystemGroupNamesTypeImpl
