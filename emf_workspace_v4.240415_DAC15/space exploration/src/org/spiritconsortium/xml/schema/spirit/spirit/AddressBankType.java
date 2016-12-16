/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Bank Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Top level bank the specify an address
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getAddressBlock <em>Address Block</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getBank <em>Bank</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getSubspaceMap <em>Subspace Map</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getAccess <em>Access</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getBankAlignment <em>Bank Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType()
 * @model extendedMetaData="name='addressBankType' kind='elementOnly'"
 * @generated
 */
public interface AddressBankType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Name" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base of an address block, bank, subspace map or address space. Expressed as the number of addressable units from the containing memoryMap or localMemoryMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Address</em>' containment reference.
	 * @see #setBaseAddress(BaseAddressType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_BaseAddress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseAddressType1 getBaseAddress();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getBaseAddress <em>Base Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Address</em>' containment reference.
	 * @see #getBaseAddress()
	 * @generated
	 */
	void setBaseAddress(BaseAddressType1 value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:4'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Address Block</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.BankedBlockType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An address block within the bank.  No address information is supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Block</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_AddressBlock()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.BankedBlockType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='addressBlock' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList getAddressBlock();

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.BankedBankType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A nested bank of blocks within a bank.  No address information is supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bank</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Bank()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.BankedBankType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bank' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList getBank();

	/**
	 * Returns the value of the '<em><b>Subspace Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.BankedSubspaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A subspace map within the bank.  No address information is supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subspace Map</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_SubspaceMap()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.BankedSubspaceType" containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='subspaceMap' namespace='##targetNamespace' group='#group:4'"
	 * @generated
	 */
	EList getSubspaceMap();

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit.spirit.UsageType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the usage of this block.  Possible values are 'memory', 'register' and 'reserved'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.UsageType1
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(UsageType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Usage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	UsageType1 getUsage();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.UsageType1
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageType1 value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageType1)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageType1)
	 * @generated
	 */
	boolean isSetUsage();

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the data is volatile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #setVolatile(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Volatile()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='volatile' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isSetVolatile()
	 * @see #unsetVolatile()
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolatile()
	 * @see #isVolatile()
	 * @see #setVolatile(boolean)
	 * @generated
	 */
	void unsetVolatile();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#isVolatile <em>Volatile</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volatile</em>' attribute is set.
	 * @see #unsetVolatile()
	 * @see #isVolatile()
	 * @see #setVolatile(boolean)
	 * @generated
	 */
	boolean isSetVolatile();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the accessibility of the data in the address bank, address block, register or field.  Possible values are 'read-write', 'read-only',  'write-only', 'writeOnce' and 'read-writeOnce'. If not specified the value is inherited from the containing object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(AccessType)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Access()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit.spirit.AccessType1"
	 *        extendedMetaData="kind='element' name='access' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccess();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(AccessType value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional parameters needed to describe this address block to the generators.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Vendor Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for vendor specific extensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #setVendorExtensions(VendorExtensionsType)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Bank Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit.spirit.BankAlignmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes whether this bank's blocks are aligned in 'parallel' or 'serial'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bank Alignment</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankAlignmentType
	 * @see #isSetBankAlignment()
	 * @see #unsetBankAlignment()
	 * @see #setBankAlignment(BankAlignmentType)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAddressBankType_BankAlignment()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='bankAlignment' namespace='##targetNamespace'"
	 * @generated
	 */
	BankAlignmentType getBankAlignment();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getBankAlignment <em>Bank Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Alignment</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankAlignmentType
	 * @see #isSetBankAlignment()
	 * @see #unsetBankAlignment()
	 * @see #getBankAlignment()
	 * @generated
	 */
	void setBankAlignment(BankAlignmentType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getBankAlignment <em>Bank Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBankAlignment()
	 * @see #getBankAlignment()
	 * @see #setBankAlignment(BankAlignmentType)
	 * @generated
	 */
	void unsetBankAlignment();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType#getBankAlignment <em>Bank Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bank Alignment</em>' attribute is set.
	 * @see #unsetBankAlignment()
	 * @see #getBankAlignment()
	 * @see #setBankAlignment(BankAlignmentType)
	 * @generated
	 */
	boolean isSetBankAlignment();

} // AddressBankType
