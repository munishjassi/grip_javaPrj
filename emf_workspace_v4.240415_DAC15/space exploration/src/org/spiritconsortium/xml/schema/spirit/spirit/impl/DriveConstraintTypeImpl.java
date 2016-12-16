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

import org.spiritconsortium.xml.schema.spirit.spirit.CellSpecificationType;
import org.spiritconsortium.xml.schema.spirit.spirit.DriveConstraintType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drive Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DriveConstraintTypeImpl#getCellSpecification <em>Cell Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DriveConstraintTypeImpl extends EObjectImpl implements DriveConstraintType {
	/**
	 * The cached value of the '{@link #getCellSpecification() <em>Cell Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSpecification()
	 * @generated
	 * @ordered
	 */
	protected CellSpecificationType cellSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriveConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getDriveConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellSpecificationType getCellSpecification() {
		return cellSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellSpecification(CellSpecificationType newCellSpecification, NotificationChain msgs) {
		CellSpecificationType oldCellSpecification = cellSpecification;
		cellSpecification = newCellSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION, oldCellSpecification, newCellSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellSpecification(CellSpecificationType newCellSpecification) {
		if (newCellSpecification != cellSpecification) {
			NotificationChain msgs = null;
			if (cellSpecification != null)
				msgs = ((InternalEObject)cellSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION, null, msgs);
			if (newCellSpecification != null)
				msgs = ((InternalEObject)newCellSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION, null, msgs);
			msgs = basicSetCellSpecification(newCellSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION, newCellSpecification, newCellSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION:
				return basicSetCellSpecification(null, msgs);
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
			case _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION:
				return getCellSpecification();
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
			case _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION:
				setCellSpecification((CellSpecificationType)newValue);
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
			case _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION:
				setCellSpecification((CellSpecificationType)null);
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
			case _1Package.DRIVE_CONSTRAINT_TYPE__CELL_SPECIFICATION:
				return cellSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //DriveConstraintTypeImpl
