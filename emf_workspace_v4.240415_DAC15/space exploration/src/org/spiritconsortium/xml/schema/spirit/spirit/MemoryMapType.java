/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Map of address space blocks on slave slave bus interface.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getMemoryMap <em>Memory Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getAddressBlock <em>Address Block</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getBank <em>Bank</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getSubspaceMap <em>Subspace Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getMemoryRemap <em>Memory Remap</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getAddressUnitBits <em>Address Unit Bits</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType()
 * @model extendedMetaData="name='memoryMapType' kind='elementOnly'"
 * @generated
 */
public interface MemoryMapType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element name for display purposes. Typically a few words providing a more detailed and/or user-friendly name than the spirit:name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full description string, typically for documentation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Memory Map</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Map</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Map</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_MemoryMap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='MemoryMap:3'"
	 * @generated
	 */
	FeatureMap getMemoryMap();

	/**
	 * Returns the value of the '<em><b>Address Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a single contiguous block of memory inside a memory map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Block</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_AddressBlock()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addressBlock' namespace='##targetNamespace' group='#MemoryMap:3'"
	 * @generated
	 */
	EList getAddressBlock();

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a bank of memory made up of address blocks or other banks.  It has a bankAlignment attribute indicating whether its blocks are aligned in 'parallel' (occupying adjacent bit fields) or 'serial' (occupying contiguous addresses). Its child blocks do not contain addresses or bit offsets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bank</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_Bank()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bank' namespace='##targetNamespace' group='#MemoryMap:3'"
	 * @generated
	 */
	EList getBank();

	/**
	 * Returns the value of the '<em><b>Subspace Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.SubspaceRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps in an address subspace from across a bus bridge.  Its masterRef attribute refers by name to the master bus interface on the other side of the bridge.  It must match the masterRef attribute of a bridge element on the slave interface, and that bridge element must be designated as opaque.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subspace Map</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_SubspaceMap()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.SubspaceRefType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subspaceMap' namespace='##targetNamespace' group='#MemoryMap:3'"
	 * @generated
	 */
	EList getSubspaceMap();

	/**
	 * Returns the value of the '<em><b>Memory Remap</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryRemapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional memory map elements that are dependent on the component state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Remap</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_MemoryRemap()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.MemoryRemapType" containment="true"
	 *        extendedMetaData="kind='element' name='memoryRemap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getMemoryRemap();

	/**
	 * Returns the value of the '<em><b>Address Unit Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of data bits in an addressable unit. The default is byte addressable (8 bits).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Unit Bits</em>' attribute.
	 * @see #setAddressUnitBits(BigInteger)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_AddressUnitBits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='addressUnitBits' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getAddressUnitBits();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getAddressUnitBits <em>Address Unit Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Unit Bits</em>' attribute.
	 * @see #getAddressUnitBits()
	 * @generated
	 */
	void setAddressUnitBits(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID attribute for uniquely identifying an element within its document. On elements with spirit:resolve attribute is used to refer to this element and otherwise can be used as a documentation ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // MemoryMapType
