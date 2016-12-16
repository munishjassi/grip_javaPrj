/**
 */
package com.w3schools.impl;

import com.w3schools.LoopType;
import com.w3schools.SubmoduleType;
import com.w3schools.SubmodulesType;
import com.w3schools.W3schoolsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Submodules Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.w3schools.impl.SubmodulesTypeImpl#getSubmodule <em>Submodule</em>}</li>
 *   <li>{@link com.w3schools.impl.SubmodulesTypeImpl#getLoop <em>Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubmodulesTypeImpl extends MinimalEObjectImpl.Container implements SubmodulesType {
	/**
	 * The cached value of the '{@link #getSubmodule() <em>Submodule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmodule()
	 * @generated
	 * @ordered
	 */
	protected EList<SubmoduleType> submodule;

	/**
	 * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoop()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopType> loop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmodulesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return W3schoolsPackage.Literals.SUBMODULES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubmoduleType> getSubmodule() {
		if (submodule == null) {
			submodule = new EObjectContainmentEList<SubmoduleType>(SubmoduleType.class, this, W3schoolsPackage.SUBMODULES_TYPE__SUBMODULE);
		}
		return submodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopType> getLoop() {
		if (loop == null) {
			loop = new EObjectContainmentEList<LoopType>(LoopType.class, this, W3schoolsPackage.SUBMODULES_TYPE__LOOP);
		}
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case W3schoolsPackage.SUBMODULES_TYPE__SUBMODULE:
				return ((InternalEList<?>)getSubmodule()).basicRemove(otherEnd, msgs);
			case W3schoolsPackage.SUBMODULES_TYPE__LOOP:
				return ((InternalEList<?>)getLoop()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case W3schoolsPackage.SUBMODULES_TYPE__SUBMODULE:
				return getSubmodule();
			case W3schoolsPackage.SUBMODULES_TYPE__LOOP:
				return getLoop();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case W3schoolsPackage.SUBMODULES_TYPE__SUBMODULE:
				getSubmodule().clear();
				getSubmodule().addAll((Collection<? extends SubmoduleType>)newValue);
				return;
			case W3schoolsPackage.SUBMODULES_TYPE__LOOP:
				getLoop().clear();
				getLoop().addAll((Collection<? extends LoopType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case W3schoolsPackage.SUBMODULES_TYPE__SUBMODULE:
				getSubmodule().clear();
				return;
			case W3schoolsPackage.SUBMODULES_TYPE__LOOP:
				getLoop().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case W3schoolsPackage.SUBMODULES_TYPE__SUBMODULE:
				return submodule != null && !submodule.isEmpty();
			case W3schoolsPackage.SUBMODULES_TYPE__LOOP:
				return loop != null && !loop.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubmodulesTypeImpl
