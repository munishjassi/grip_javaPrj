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

import org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType;
import org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstractor Generators Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorGeneratorsTypeImpl#getAbstractorGenerator <em>Abstractor Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractorGeneratorsTypeImpl extends EObjectImpl implements AbstractorGeneratorsType {
	/**
	 * The cached value of the '{@link #getAbstractorGenerator() <em>Abstractor Generator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractorGenerator()
	 * @generated
	 * @ordered
	 */
	protected EList abstractorGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractorGeneratorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getAbstractorGeneratorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAbstractorGenerator() {
		if (abstractorGenerator == null) {
			abstractorGenerator = new EObjectContainmentEList(InstanceGeneratorType.class, this, _1Package.ABSTRACTOR_GENERATORS_TYPE__ABSTRACTOR_GENERATOR);
		}
		return abstractorGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ABSTRACTOR_GENERATORS_TYPE__ABSTRACTOR_GENERATOR:
				return ((InternalEList)getAbstractorGenerator()).basicRemove(otherEnd, msgs);
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
			case _1Package.ABSTRACTOR_GENERATORS_TYPE__ABSTRACTOR_GENERATOR:
				return getAbstractorGenerator();
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
			case _1Package.ABSTRACTOR_GENERATORS_TYPE__ABSTRACTOR_GENERATOR:
				getAbstractorGenerator().clear();
				getAbstractorGenerator().addAll((Collection)newValue);
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
			case _1Package.ABSTRACTOR_GENERATORS_TYPE__ABSTRACTOR_GENERATOR:
				getAbstractorGenerator().clear();
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
			case _1Package.ABSTRACTOR_GENERATORS_TYPE__ABSTRACTOR_GENERATOR:
				return abstractorGenerator != null && !abstractorGenerator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractorGeneratorsTypeImpl
