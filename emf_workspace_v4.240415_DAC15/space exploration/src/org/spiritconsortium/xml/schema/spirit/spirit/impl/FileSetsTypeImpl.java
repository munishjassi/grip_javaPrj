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

import org.spiritconsortium.xml.schema.spirit.spirit.FileSetType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileSetsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Sets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetsTypeImpl#getFileSet <em>File Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSetsTypeImpl extends EObjectImpl implements FileSetsType {
	/**
	 * The cached value of the '{@link #getFileSet() <em>File Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSet()
	 * @generated
	 * @ordered
	 */
	protected EList fileSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getFileSetsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFileSet() {
		if (fileSet == null) {
			fileSet = new EObjectContainmentEList(FileSetType.class, this, _1Package.FILE_SETS_TYPE__FILE_SET);
		}
		return fileSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.FILE_SETS_TYPE__FILE_SET:
				return ((InternalEList)getFileSet()).basicRemove(otherEnd, msgs);
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
			case _1Package.FILE_SETS_TYPE__FILE_SET:
				return getFileSet();
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
			case _1Package.FILE_SETS_TYPE__FILE_SET:
				getFileSet().clear();
				getFileSet().addAll((Collection)newValue);
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
			case _1Package.FILE_SETS_TYPE__FILE_SET:
				getFileSet().clear();
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
			case _1Package.FILE_SETS_TYPE__FILE_SET:
				return fileSet != null && !fileSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileSetsTypeImpl
