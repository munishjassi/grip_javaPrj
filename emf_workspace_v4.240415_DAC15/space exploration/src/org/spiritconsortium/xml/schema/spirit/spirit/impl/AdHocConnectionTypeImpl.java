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

import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType;
import org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ad Hoc Connection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AdHocConnectionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AdHocConnectionTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AdHocConnectionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AdHocConnectionTypeImpl#getInternalPortReference <em>Internal Port Reference</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AdHocConnectionTypeImpl#getExternalPortReference <em>External Port Reference</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AdHocConnectionTypeImpl#getTiedValue <em>Tied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdHocConnectionTypeImpl extends EObjectImpl implements AdHocConnectionType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInternalPortReference() <em>Internal Port Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPortReference()
	 * @generated
	 * @ordered
	 */
	protected EList internalPortReference;

	/**
	 * The cached value of the '{@link #getExternalPortReference() <em>External Port Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalPortReference()
	 * @generated
	 * @ordered
	 */
	protected EList externalPortReference;

	/**
	 * The default value of the '{@link #getTiedValue() <em>Tied Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TIED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTiedValue() <em>Tied Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiedValue()
	 * @generated
	 * @ordered
	 */
	protected String tiedValue = TIED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdHocConnectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getAdHocConnectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.AD_HOC_CONNECTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.AD_HOC_CONNECTION_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.AD_HOC_CONNECTION_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInternalPortReference() {
		if (internalPortReference == null) {
			internalPortReference = new EObjectContainmentEList(InternalPortReferenceType.class, this, _1Package.AD_HOC_CONNECTION_TYPE__INTERNAL_PORT_REFERENCE);
		}
		return internalPortReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getExternalPortReference() {
		if (externalPortReference == null) {
			externalPortReference = new EObjectContainmentEList(ExternalPortReferenceType.class, this, _1Package.AD_HOC_CONNECTION_TYPE__EXTERNAL_PORT_REFERENCE);
		}
		return externalPortReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTiedValue() {
		return tiedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiedValue(String newTiedValue) {
		String oldTiedValue = tiedValue;
		tiedValue = newTiedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.AD_HOC_CONNECTION_TYPE__TIED_VALUE, oldTiedValue, tiedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.AD_HOC_CONNECTION_TYPE__INTERNAL_PORT_REFERENCE:
				return ((InternalEList)getInternalPortReference()).basicRemove(otherEnd, msgs);
			case _1Package.AD_HOC_CONNECTION_TYPE__EXTERNAL_PORT_REFERENCE:
				return ((InternalEList)getExternalPortReference()).basicRemove(otherEnd, msgs);
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
			case _1Package.AD_HOC_CONNECTION_TYPE__NAME:
				return getName();
			case _1Package.AD_HOC_CONNECTION_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _1Package.AD_HOC_CONNECTION_TYPE__DESCRIPTION:
				return getDescription();
			case _1Package.AD_HOC_CONNECTION_TYPE__INTERNAL_PORT_REFERENCE:
				return getInternalPortReference();
			case _1Package.AD_HOC_CONNECTION_TYPE__EXTERNAL_PORT_REFERENCE:
				return getExternalPortReference();
			case _1Package.AD_HOC_CONNECTION_TYPE__TIED_VALUE:
				return getTiedValue();
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
			case _1Package.AD_HOC_CONNECTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__INTERNAL_PORT_REFERENCE:
				getInternalPortReference().clear();
				getInternalPortReference().addAll((Collection)newValue);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__EXTERNAL_PORT_REFERENCE:
				getExternalPortReference().clear();
				getExternalPortReference().addAll((Collection)newValue);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__TIED_VALUE:
				setTiedValue((String)newValue);
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
			case _1Package.AD_HOC_CONNECTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__INTERNAL_PORT_REFERENCE:
				getInternalPortReference().clear();
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__EXTERNAL_PORT_REFERENCE:
				getExternalPortReference().clear();
				return;
			case _1Package.AD_HOC_CONNECTION_TYPE__TIED_VALUE:
				setTiedValue(TIED_VALUE_EDEFAULT);
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
			case _1Package.AD_HOC_CONNECTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _1Package.AD_HOC_CONNECTION_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _1Package.AD_HOC_CONNECTION_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _1Package.AD_HOC_CONNECTION_TYPE__INTERNAL_PORT_REFERENCE:
				return internalPortReference != null && !internalPortReference.isEmpty();
			case _1Package.AD_HOC_CONNECTION_TYPE__EXTERNAL_PORT_REFERENCE:
				return externalPortReference != null && !externalPortReference.isEmpty();
			case _1Package.AD_HOC_CONNECTION_TYPE__TIED_VALUE:
				return TIED_VALUE_EDEFAULT == null ? tiedValue != null : !TIED_VALUE_EDEFAULT.equals(tiedValue);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", description: ");
		result.append(description);
		result.append(", tiedValue: ");
		result.append(tiedValue);
		result.append(')');
		return result.toString();
	}

} //AdHocConnectionTypeImpl
