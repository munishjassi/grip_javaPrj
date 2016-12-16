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

import org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileSetType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileType;
import org.spiritconsortium.xml.schema.spirit.spirit.FunctionType;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Set Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getDefaultFileBuilder <em>Default File Builder</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.FileSetTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileSetTypeImpl extends EObjectImpl implements FileSetType {
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
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList group;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList file;

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
	 * The cached value of the '{@link #getDependency() <em>Dependency</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependency()
	 * @generated
	 * @ordered
	 */
	protected EList dependency;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EList function;

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
	protected FileSetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getFileSetType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FILE_SET_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FILE_SET_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FILE_SET_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGroup() {
		if (group == null) {
			group = new EDataTypeEList(String.class, this, _1Package.FILE_SET_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFile() {
		if (file == null) {
			file = new EObjectContainmentEList(FileType.class, this, _1Package.FILE_SET_TYPE__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDefaultFileBuilder() {
		if (defaultFileBuilder == null) {
			defaultFileBuilder = new EObjectContainmentEList(FileBuilderType.class, this, _1Package.FILE_SET_TYPE__DEFAULT_FILE_BUILDER);
		}
		return defaultFileBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDependency() {
		if (dependency == null) {
			dependency = new EDataTypeEList(String.class, this, _1Package.FILE_SET_TYPE__DEPENDENCY);
		}
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFunction() {
		if (function == null) {
			function = new EObjectContainmentEList(FunctionType.class, this, _1Package.FILE_SET_TYPE__FUNCTION);
		}
		return function;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.FILE_SET_TYPE__FILE:
				return ((InternalEList)getFile()).basicRemove(otherEnd, msgs);
			case _1Package.FILE_SET_TYPE__DEFAULT_FILE_BUILDER:
				return ((InternalEList)getDefaultFileBuilder()).basicRemove(otherEnd, msgs);
			case _1Package.FILE_SET_TYPE__FUNCTION:
				return ((InternalEList)getFunction()).basicRemove(otherEnd, msgs);
			case _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.FILE_SET_TYPE__NAME:
				return getName();
			case _1Package.FILE_SET_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _1Package.FILE_SET_TYPE__DESCRIPTION:
				return getDescription();
			case _1Package.FILE_SET_TYPE__GROUP:
				return getGroup();
			case _1Package.FILE_SET_TYPE__FILE:
				return getFile();
			case _1Package.FILE_SET_TYPE__DEFAULT_FILE_BUILDER:
				return getDefaultFileBuilder();
			case _1Package.FILE_SET_TYPE__DEPENDENCY:
				return getDependency();
			case _1Package.FILE_SET_TYPE__FUNCTION:
				return getFunction();
			case _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.FILE_SET_TYPE__NAME:
				setName((String)newValue);
				return;
			case _1Package.FILE_SET_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _1Package.FILE_SET_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _1Package.FILE_SET_TYPE__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection)newValue);
				return;
			case _1Package.FILE_SET_TYPE__FILE:
				getFile().clear();
				getFile().addAll((Collection)newValue);
				return;
			case _1Package.FILE_SET_TYPE__DEFAULT_FILE_BUILDER:
				getDefaultFileBuilder().clear();
				getDefaultFileBuilder().addAll((Collection)newValue);
				return;
			case _1Package.FILE_SET_TYPE__DEPENDENCY:
				getDependency().clear();
				getDependency().addAll((Collection)newValue);
				return;
			case _1Package.FILE_SET_TYPE__FUNCTION:
				getFunction().clear();
				getFunction().addAll((Collection)newValue);
				return;
			case _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.FILE_SET_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _1Package.FILE_SET_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _1Package.FILE_SET_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _1Package.FILE_SET_TYPE__GROUP:
				getGroup().clear();
				return;
			case _1Package.FILE_SET_TYPE__FILE:
				getFile().clear();
				return;
			case _1Package.FILE_SET_TYPE__DEFAULT_FILE_BUILDER:
				getDefaultFileBuilder().clear();
				return;
			case _1Package.FILE_SET_TYPE__DEPENDENCY:
				getDependency().clear();
				return;
			case _1Package.FILE_SET_TYPE__FUNCTION:
				getFunction().clear();
				return;
			case _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.FILE_SET_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _1Package.FILE_SET_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _1Package.FILE_SET_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _1Package.FILE_SET_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case _1Package.FILE_SET_TYPE__FILE:
				return file != null && !file.isEmpty();
			case _1Package.FILE_SET_TYPE__DEFAULT_FILE_BUILDER:
				return defaultFileBuilder != null && !defaultFileBuilder.isEmpty();
			case _1Package.FILE_SET_TYPE__DEPENDENCY:
				return dependency != null && !dependency.isEmpty();
			case _1Package.FILE_SET_TYPE__FUNCTION:
				return function != null && !function.isEmpty();
			case _1Package.FILE_SET_TYPE__VENDOR_EXTENSIONS:
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
		result.append(", group: ");
		result.append(group);
		result.append(", dependency: ");
		result.append(dependency);
		result.append(')');
		return result.toString();
	}

} //FileSetTypeImpl
