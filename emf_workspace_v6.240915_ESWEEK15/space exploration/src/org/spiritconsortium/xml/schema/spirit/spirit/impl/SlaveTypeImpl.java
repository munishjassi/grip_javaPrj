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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.BridgeType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType;
import org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.SlaveType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slave Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.SlaveTypeImpl#getMemoryMapRef <em>Memory Map Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.SlaveTypeImpl#getBridge <em>Bridge</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.SlaveTypeImpl#getFileSetRefGroup <em>File Set Ref Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlaveTypeImpl extends EObjectImpl implements SlaveType {
	/**
	 * The cached value of the '{@link #getMemoryMapRef() <em>Memory Map Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMapRef()
	 * @generated
	 * @ordered
	 */
	protected MemoryMapRefType memoryMapRef;

	/**
	 * The cached value of the '{@link #getBridge() <em>Bridge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridge()
	 * @generated
	 * @ordered
	 */
	protected EList bridge;

	/**
	 * The cached value of the '{@link #getFileSetRefGroup() <em>File Set Ref Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSetRefGroup()
	 * @generated
	 * @ordered
	 */
	protected EList fileSetRefGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlaveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getSlaveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryMapRefType getMemoryMapRef() {
		return memoryMapRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryMapRef(MemoryMapRefType newMemoryMapRef, NotificationChain msgs) {
		MemoryMapRefType oldMemoryMapRef = memoryMapRef;
		memoryMapRef = newMemoryMapRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.SLAVE_TYPE__MEMORY_MAP_REF, oldMemoryMapRef, newMemoryMapRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryMapRef(MemoryMapRefType newMemoryMapRef) {
		if (newMemoryMapRef != memoryMapRef) {
			NotificationChain msgs = null;
			if (memoryMapRef != null)
				msgs = ((InternalEObject)memoryMapRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.SLAVE_TYPE__MEMORY_MAP_REF, null, msgs);
			if (newMemoryMapRef != null)
				msgs = ((InternalEObject)newMemoryMapRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.SLAVE_TYPE__MEMORY_MAP_REF, null, msgs);
			msgs = basicSetMemoryMapRef(newMemoryMapRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.SLAVE_TYPE__MEMORY_MAP_REF, newMemoryMapRef, newMemoryMapRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBridge() {
		if (bridge == null) {
			bridge = new EObjectContainmentEList(BridgeType.class, this, _1Package.SLAVE_TYPE__BRIDGE);
		}
		return bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFileSetRefGroup() {
		if (fileSetRefGroup == null) {
			fileSetRefGroup = new EObjectContainmentEList(FileSetRefGroupType.class, this, _1Package.SLAVE_TYPE__FILE_SET_REF_GROUP);
		}
		return fileSetRefGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.SLAVE_TYPE__MEMORY_MAP_REF:
				return basicSetMemoryMapRef(null, msgs);
			case _1Package.SLAVE_TYPE__BRIDGE:
				return ((InternalEList)getBridge()).basicRemove(otherEnd, msgs);
			case _1Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				return ((InternalEList)getFileSetRefGroup()).basicRemove(otherEnd, msgs);
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
			case _1Package.SLAVE_TYPE__MEMORY_MAP_REF:
				return getMemoryMapRef();
			case _1Package.SLAVE_TYPE__BRIDGE:
				return getBridge();
			case _1Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				return getFileSetRefGroup();
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
			case _1Package.SLAVE_TYPE__MEMORY_MAP_REF:
				setMemoryMapRef((MemoryMapRefType)newValue);
				return;
			case _1Package.SLAVE_TYPE__BRIDGE:
				getBridge().clear();
				getBridge().addAll((Collection)newValue);
				return;
			case _1Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				getFileSetRefGroup().clear();
				getFileSetRefGroup().addAll((Collection)newValue);
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
			case _1Package.SLAVE_TYPE__MEMORY_MAP_REF:
				setMemoryMapRef((MemoryMapRefType)null);
				return;
			case _1Package.SLAVE_TYPE__BRIDGE:
				getBridge().clear();
				return;
			case _1Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				getFileSetRefGroup().clear();
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
			case _1Package.SLAVE_TYPE__MEMORY_MAP_REF:
				return memoryMapRef != null;
			case _1Package.SLAVE_TYPE__BRIDGE:
				return bridge != null && !bridge.isEmpty();
			case _1Package.SLAVE_TYPE__FILE_SET_REF_GROUP:
				return fileSetRefGroup != null && !fileSetRefGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SlaveTypeImpl
