/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstractor View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstraction view type
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getEnvIdentifier <em>Env Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getDefaultFileBuilder <em>Default File Builder</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getFileSetRef <em>File Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType()
 * @model extendedMetaData="name='abstractorViewType' kind='elementOnly'"
 * @generated
 */
public interface AbstractorViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getName <em>Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='displayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Env Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Defines the hardware environment in which this view applies. The format of the string is language:tool:vendor_extension, with each piece being optional. The language must be one of the types from spirit:fileType. The tool values are defined by the SPIRIT Consortium, and include generic values "*Simulation" and "*Synthesis" to imply any tool of the indicated type. Having more than one envIdentifier indicates that the view applies to multiple environments.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env Identifier</em>' attribute list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_EnvIdentifier()
	 * @model unique="false" dataType="org.spiritconsortium.xml.schema.spirit.spirit.EnvIdentifierType1" required="true"
	 *        extendedMetaData="kind='element' name='envIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getEnvIdentifier();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The hardware description language used such as "verilog" or "vhdl". If the attribute "strict" is "true", this value must match the language being generated for the design.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(LanguageType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageType1 getLanguage();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(LanguageType1 value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language specific name to identity the model. Verilog or SystemVerilog this is the module name. For VHDL this is, with ()’s, the entity(architecture) name pair or without a single configuration name.  For SystemC this is the class name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_ModelName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='modelName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Default File Builder</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default command and flags used to build derived files from the sourceName files in the referenced file sets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default File Builder</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_DefaultFileBuilder()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType" containment="true"
	 *        extendedMetaData="kind='element' name='defaultFileBuilder' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getDefaultFileBuilder();

	/**
	 * Returns the value of the '<em><b>File Set Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a fileSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Set Ref</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_FileSetRef()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType" containment="true"
	 *        extendedMetaData="kind='element' name='fileSetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getFileSetRef();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType1 getParameters();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getParameters <em>Parameters</em>}' containment reference.
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
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorViewType_VendorExtensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vendorExtensions' namespace='##targetNamespace'"
	 * @generated
	 */
	VendorExtensionsType getVendorExtensions();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType#getVendorExtensions <em>Vendor Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Extensions</em>' containment reference.
	 * @see #getVendorExtensions()
	 * @generated
	 */
	void setVendorExtensions(VendorExtensionsType value);

} // AbstractorViewType
