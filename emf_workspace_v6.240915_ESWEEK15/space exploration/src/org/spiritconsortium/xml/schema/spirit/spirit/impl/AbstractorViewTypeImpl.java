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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType;
import org.spiritconsortium.xml.schema.spirit.spirit.LanguageType1;
import org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstractor View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getEnvIdentifier <em>Env Identifier</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getDefaultFileBuilder <em>Default File Builder</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getFileSetRef <em>File Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.AbstractorViewTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractorViewTypeImpl extends EObjectImpl implements AbstractorViewType {
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
	 * The cached value of the '{@link #getEnvIdentifier() <em>Env Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList envIdentifier;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected LanguageType1 language;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultFileBuilder() <em>Default File Builder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFileBuilder()
	 * @generated
	 * @ordered
	 */
	protected EList defaultFileBuilder;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType1 parameters;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractorViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getAbstractorViewType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnvIdentifier() {
		if (envIdentifier == null) {
			envIdentifier = new EDataTypeEList(String.class, this, _1Package.ABSTRACTOR_VIEW_TYPE__ENV_IDENTIFIER);
		}
		return envIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType1 getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(LanguageType1 newLanguage, NotificationChain msgs) {
		LanguageType1 oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(LanguageType1 newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__MODEL_NAME, oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDefaultFileBuilder() {
		if (defaultFileBuilder == null) {
			defaultFileBuilder = new EObjectContainmentEList(FileBuilderType.class, this, _1Package.ABSTRACTOR_VIEW_TYPE__DEFAULT_FILE_BUILDER);
		}
		return defaultFileBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFileSetRef() {
		if (fileSetRef == null) {
			fileSetRef = new EObjectContainmentEList(FileSetRefType.class, this, _1Package.ABSTRACTOR_VIEW_TYPE__FILE_SET_REF);
		}
		return fileSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType1 getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType1 newParameters, NotificationChain msgs) {
		ParametersType1 oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParametersType1 newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case _1Package.ABSTRACTOR_VIEW_TYPE__DEFAULT_FILE_BUILDER:
				return ((InternalEList)getDefaultFileBuilder()).basicRemove(otherEnd, msgs);
			case _1Package.ABSTRACTOR_VIEW_TYPE__FILE_SET_REF:
				return ((InternalEList)getFileSetRef()).basicRemove(otherEnd, msgs);
			case _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.ABSTRACTOR_VIEW_TYPE__NAME:
				return getName();
			case _1Package.ABSTRACTOR_VIEW_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _1Package.ABSTRACTOR_VIEW_TYPE__DESCRIPTION:
				return getDescription();
			case _1Package.ABSTRACTOR_VIEW_TYPE__ENV_IDENTIFIER:
				return getEnvIdentifier();
			case _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE:
				return getLanguage();
			case _1Package.ABSTRACTOR_VIEW_TYPE__MODEL_NAME:
				return getModelName();
			case _1Package.ABSTRACTOR_VIEW_TYPE__DEFAULT_FILE_BUILDER:
				return getDefaultFileBuilder();
			case _1Package.ABSTRACTOR_VIEW_TYPE__FILE_SET_REF:
				return getFileSetRef();
			case _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS:
				return getParameters();
			case _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS:
				return getVendorExtensions();
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
			case _1Package.ABSTRACTOR_VIEW_TYPE__NAME:
				setName((String)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__ENV_IDENTIFIER:
				getEnvIdentifier().clear();
				getEnvIdentifier().addAll((Collection)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE:
				setLanguage((LanguageType1)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__MODEL_NAME:
				setModelName((String)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__DEFAULT_FILE_BUILDER:
				getDefaultFileBuilder().clear();
				getDefaultFileBuilder().addAll((Collection)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__FILE_SET_REF:
				getFileSetRef().clear();
				getFileSetRef().addAll((Collection)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)newValue);
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
			case _1Package.ABSTRACTOR_VIEW_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__ENV_IDENTIFIER:
				getEnvIdentifier().clear();
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE:
				setLanguage((LanguageType1)null);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__MODEL_NAME:
				setModelName(MODEL_NAME_EDEFAULT);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__DEFAULT_FILE_BUILDER:
				getDefaultFileBuilder().clear();
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__FILE_SET_REF:
				getFileSetRef().clear();
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS:
				setVendorExtensions((VendorExtensionsType)null);
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
			case _1Package.ABSTRACTOR_VIEW_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _1Package.ABSTRACTOR_VIEW_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _1Package.ABSTRACTOR_VIEW_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _1Package.ABSTRACTOR_VIEW_TYPE__ENV_IDENTIFIER:
				return envIdentifier != null && !envIdentifier.isEmpty();
			case _1Package.ABSTRACTOR_VIEW_TYPE__LANGUAGE:
				return language != null;
			case _1Package.ABSTRACTOR_VIEW_TYPE__MODEL_NAME:
				return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
			case _1Package.ABSTRACTOR_VIEW_TYPE__DEFAULT_FILE_BUILDER:
				return defaultFileBuilder != null && !defaultFileBuilder.isEmpty();
			case _1Package.ABSTRACTOR_VIEW_TYPE__FILE_SET_REF:
				return fileSetRef != null && !fileSetRef.isEmpty();
			case _1Package.ABSTRACTOR_VIEW_TYPE__PARAMETERS:
				return parameters != null;
			case _1Package.ABSTRACTOR_VIEW_TYPE__VENDOR_EXTENSIONS:
				return vendorExtensions != null;
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
		result.append(", envIdentifier: ");
		result.append(envIdentifier);
		result.append(", modelName: ");
		result.append(modelName);
		result.append(')');
		return result.toString();
	}

} //AbstractorViewTypeImpl
