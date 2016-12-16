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

import org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType1;
import org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Set Ref Group Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetRefGroupType1Impl#getFileSetRef <em>File Set Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSetRefGroupType1Impl extends EObjectImpl implements FileSetRefGroupType1 {
	/**
	 * The cached value of the '{@link #getFileSetRef() <em>File Set Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSetRef()
	 * @generated
	 * @ordered
	 */
	protected EList fileSetRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSetRefGroupType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getFileSetRefGroupType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFileSetRef() {
		if (fileSetRef == null) {
			fileSetRef = new EObjectContainmentEList(FileSetRefType.class, this, _1Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF);
		}
		return fileSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				return ((InternalEList)getFileSetRef()).basicRemove(otherEnd, msgs);
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
			case _1Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				return getFileSetRef();
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
			case _1Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				getFileSetRef().clear();
				getFileSetRef().addAll((Collection)newValue);
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
			case _1Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				getFileSetRef().clear();
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
			case _1Package.FILE_SET_REF_GROUP_TYPE1__FILE_SET_REF:
				return fileSetRef != null && !fileSetRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileSetRefGroupType1Impl
