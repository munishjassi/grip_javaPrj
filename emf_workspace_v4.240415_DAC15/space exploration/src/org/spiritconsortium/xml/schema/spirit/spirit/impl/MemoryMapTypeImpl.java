/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType;
import org.spiritconsortium.xml.schema.spirit.spirit.MemoryRemapType;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getMemoryMap <em>Memory Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getAddressBlock <em>Address Block</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getBank <em>Bank</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getSubspaceMap <em>Subspace Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getMemoryRemap <em>Memory Remap</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getAddressUnitBits <em>Address Unit Bits</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.MemoryMapTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryMapTypeImpl extends EObjectImpl implements MemoryMapType {
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
	 * The cached value of the '{@link #getMemoryMap() <em>Memory Map</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryMap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap memoryMap;

	/**
	 * The cached value of the '{@link #getMemoryRemap() <em>Memory Remap</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryRemap()
	 * @generated
	 * @ordered
	 */
	protected EList memoryRemap;

	/**
	 * The default value of the '{@link #getAddressUnitBits() <em>Address Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnitBits()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ADDRESS_UNIT_BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressUnitBits() <em>Address Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressUnitBits()
	 * @generated
	 * @ordered
	 */
	protected BigInteger addressUnitBits = ADDRESS_UNIT_BITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVendorExtensions() <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorExtensions()
	 * @generated
	 * @ordered
	 */
	protected VendorExtensionsType vendorExtensions;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getMemoryMapType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MEMORY_MAP_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MEMORY_MAP_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MEMORY_MAP_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMemoryMap() {
		if (memoryMap == null) {
			memoryMap = new BasicFeatureMap(this, _1Package.MEMORY_MAP_TYPE__MEMORY_MAP);
		}
		return memoryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAddressBlock() {
		return getMemoryMap().list(_1Package.eINSTANCE.getMemoryMapType_AddressBlock());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBank() {
		return getMemoryMap().list(_1Package.eINSTANCE.getMemoryMapType_Bank());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubspaceMap() {
		return getMemoryMap().list(_1Package.eINSTANCE.getMemoryMapType_SubspaceMap());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMemoryRemap() {
		if (memoryRemap == null) {
			memoryRemap = new EObjectContainmentEList(MemoryRemapType.class, this, _1Package.MEMORY_MAP_TYPE__MEMORY_REMAP);
		}
		return memoryRemap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAddressUnitBits() {
		return addressUnitBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressUnitBits(BigInteger newAddressUnitBits) {
		BigInteger oldAddressUnitBits = addressUnitBits;
		addressUnitBits = newAddressUnitBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MEMORY_MAP_TYPE__ADDRESS_UNIT_BITS, oldAddressUnitBits, addressUnitBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorExtensionsType getVendorExtensions() {
		return vendorExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVendorExtensions(VendorExtensionsType newVendorExtensions, NotificationChain msgs) {
		VendorExtensionsType oldVendorExtensions = vendorExtensions;
		vendorExtensions = newVendorExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendorExtensions(VendorExtensionsType newVendorExtensions) {
		if (newVendorExtensions != vendorExtensions) {
			NotificationChain msgs = null;
			if (vendorExtensions != null)
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.MEMORY_MAP_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.MEMORY_MAP_TYPE__MEMORY_MAP:
				return ((InternalEList)getMemoryMap()).basicRemove(otherEnd, msgs);
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_BLOCK:
				return ((InternalEList)getAddressBlock()).basicRemove(otherEnd, msgs);
			case _1Package.MEMORY_MAP_TYPE__BANK:
				return ((InternalEList)getBank()).basicRemove(otherEnd, msgs);
			case _1Package.MEMORY_MAP_TYPE__SUBSPACE_MAP:
				return ((InternalEList)getSubspaceMap()).basicRemove(otherEnd, msgs);
			case _1Package.MEMORY_MAP_TYPE__MEMORY_REMAP:
				return ((InternalEList)getMemoryRemap()).basicRemove(otherEnd, msgs);
			case _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS:
				return basicSetVendorExtensions(null, msgs);
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
			case _1Package.MEMORY_MAP_TYPE__NAME:
				return getName();
			case _1Package.MEMORY_MAP_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _1Package.MEMORY_MAP_TYPE__DESCRIPTION:
				return getDescription();
			case _1Package.MEMORY_MAP_TYPE__MEMORY_MAP:
				if (coreType) return getMemoryMap();
				return ((FeatureMap.Internal)getMemoryMap()).getWrapper();
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_BLOCK:
				return getAddressBlock();
			case _1Package.MEMORY_MAP_TYPE__BANK:
				return getBank();
			case _1Package.MEMORY_MAP_TYPE__SUBSPACE_MAP:
				return getSubspaceMap();
			case _1Package.MEMORY_MAP_TYPE__MEMORY_REMAP:
				return getMemoryRemap();
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_UNIT_BITS:
				return getAddressUnitBits();
			case _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
			case _1Package.MEMORY_MAP_TYPE__ID:
				return getId();
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
			case _1Package.MEMORY_MAP_TYPE__NAME:
				setName((String)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__MEMORY_MAP:
				((FeatureMap.Internal)getMemoryMap()).set(newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_BLOCK:
				getAddressBlock().clear();
				getAddressBlock().addAll((Collection)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__BANK:
				getBank().clear();
				getBank().addAll((Collection)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__SUBSPACE_MAP:
				getSubspaceMap().clear();
				getSubspaceMap().addAll((Collection)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__MEMORY_REMAP:
				getMemoryRemap().clear();
				getMemoryRemap().addAll((Collection)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_UNIT_BITS:
				setAddressUnitBits((BigInteger)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
				return;
			case _1Package.MEMORY_MAP_TYPE__ID:
				setId((String)newValue);
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
			case _1Package.MEMORY_MAP_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _1Package.MEMORY_MAP_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _1Package.MEMORY_MAP_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _1Package.MEMORY_MAP_TYPE__MEMORY_MAP:
				getMemoryMap().clear();
				return;
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_BLOCK:
				getAddressBlock().clear();
				return;
			case _1Package.MEMORY_MAP_TYPE__BANK:
				getBank().clear();
				return;
			case _1Package.MEMORY_MAP_TYPE__SUBSPACE_MAP:
				getSubspaceMap().clear();
				return;
			case _1Package.MEMORY_MAP_TYPE__MEMORY_REMAP:
				getMemoryRemap().clear();
				return;
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_UNIT_BITS:
				setAddressUnitBits(ADDRESS_UNIT_BITS_EDEFAULT);
				return;
			case _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
				return;
			case _1Package.MEMORY_MAP_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case _1Package.MEMORY_MAP_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _1Package.MEMORY_MAP_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _1Package.MEMORY_MAP_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _1Package.MEMORY_MAP_TYPE__MEMORY_MAP:
				return memoryMap != null && !memoryMap.isEmpty();
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_BLOCK:
				return !getAddressBlock().isEmpty();
			case _1Package.MEMORY_MAP_TYPE__BANK:
				return !getBank().isEmpty();
			case _1Package.MEMORY_MAP_TYPE__SUBSPACE_MAP:
				return !getSubspaceMap().isEmpty();
			case _1Package.MEMORY_MAP_TYPE__MEMORY_REMAP:
				return memoryRemap != null && !memoryRemap.isEmpty();
			case _1Package.MEMORY_MAP_TYPE__ADDRESS_UNIT_BITS:
				return ADDRESS_UNIT_BITS_EDEFAULT == null ? addressUnitBits != null : !ADDRESS_UNIT_BITS_EDEFAULT.equals(addressUnitBits);
			case _1Package.MEMORY_MAP_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
			case _1Package.MEMORY_MAP_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", memoryMap: ");
		result.append(memoryMap);
		result.append(", addressUnitBits: ");
		result.append(addressUnitBits);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //MemoryMapTypeImpl
