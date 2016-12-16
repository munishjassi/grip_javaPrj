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

import org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType;
import org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxTypeType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Whitebox Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#getWhiteboxType <em>Whitebox Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#isDriveable <em>Driveable</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#getRegisterRef <em>Register Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.WhiteboxElementTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhiteboxElementTypeImpl extends EObjectImpl implements WhiteboxElementType {
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
	 * The default value of the '{@link #getWhiteboxType() <em>Whitebox Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxType()
	 * @generated
	 * @ordered
	 */
	protected static final WhiteboxTypeType WHITEBOX_TYPE_EDEFAULT = WhiteboxTypeType.REGISTER_LITERAL;

	/**
	 * The cached value of the '{@link #getWhiteboxType() <em>Whitebox Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteboxType()
	 * @generated
	 * @ordered
	 */
	protected WhiteboxTypeType whiteboxType = WHITEBOX_TYPE_EDEFAULT;

	/**
	 * This is true if the Whitebox Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean whiteboxTypeESet;

	/**
	 * The default value of the '{@link #isDriveable() <em>Driveable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDriveable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DRIVEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDriveable() <em>Driveable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDriveable()
	 * @generated
	 * @ordered
	 */
	protected boolean driveable = DRIVEABLE_EDEFAULT;

	/**
	 * This is true if the Driveable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean driveableESet;

	/**
	 * The default value of the '{@link #getRegisterRef() <em>Register Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTER_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterRef() <em>Register Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterRef()
	 * @generated
	 * @ordered
	 */
	protected String registerRef = REGISTER_REF_EDEFAULT;

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
	protected WhiteboxElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getWhiteboxElementType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteboxTypeType getWhiteboxType() {
		return whiteboxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteboxType(WhiteboxTypeType newWhiteboxType) {
		WhiteboxTypeType oldWhiteboxType = whiteboxType;
		whiteboxType = newWhiteboxType == null ? WHITEBOX_TYPE_EDEFAULT : newWhiteboxType;
		boolean oldWhiteboxTypeESet = whiteboxTypeESet;
		whiteboxTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__WHITEBOX_TYPE, oldWhiteboxType, whiteboxType, !oldWhiteboxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWhiteboxType() {
		WhiteboxTypeType oldWhiteboxType = whiteboxType;
		boolean oldWhiteboxTypeESet = whiteboxTypeESet;
		whiteboxType = WHITEBOX_TYPE_EDEFAULT;
		whiteboxTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.WHITEBOX_ELEMENT_TYPE__WHITEBOX_TYPE, oldWhiteboxType, WHITEBOX_TYPE_EDEFAULT, oldWhiteboxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWhiteboxType() {
		return whiteboxTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDriveable() {
		return driveable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriveable(boolean newDriveable) {
		boolean oldDriveable = driveable;
		driveable = newDriveable;
		boolean oldDriveableESet = driveableESet;
		driveableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__DRIVEABLE, oldDriveable, driveable, !oldDriveableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDriveable() {
		boolean oldDriveable = driveable;
		boolean oldDriveableESet = driveableESet;
		driveable = DRIVEABLE_EDEFAULT;
		driveableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _1Package.WHITEBOX_ELEMENT_TYPE__DRIVEABLE, oldDriveable, DRIVEABLE_EDEFAULT, oldDriveableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDriveable() {
		return driveableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegisterRef() {
		return registerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterRef(String newRegisterRef) {
		String oldRegisterRef = registerRef;
		registerRef = newRegisterRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__REGISTER_REF, oldRegisterRef, registerRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS, oldParameters, newParameters);
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
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS, newParameters, newParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
			case _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.WHITEBOX_ELEMENT_TYPE__NAME:
				return getName();
			case _1Package.WHITEBOX_ELEMENT_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case _1Package.WHITEBOX_ELEMENT_TYPE__DESCRIPTION:
				return getDescription();
			case _1Package.WHITEBOX_ELEMENT_TYPE__WHITEBOX_TYPE:
				return getWhiteboxType();
			case _1Package.WHITEBOX_ELEMENT_TYPE__DRIVEABLE:
				return isDriveable() ? Boolean.TRUE : Boolean.FALSE;
			case _1Package.WHITEBOX_ELEMENT_TYPE__REGISTER_REF:
				return getRegisterRef();
			case _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS:
				return getParameters();
			case _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.WHITEBOX_ELEMENT_TYPE__NAME:
				setName((String)newValue);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__WHITEBOX_TYPE:
				setWhiteboxType((WhiteboxTypeType)newValue);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__DRIVEABLE:
				setDriveable(((Boolean)newValue).booleanValue());
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__REGISTER_REF:
				setRegisterRef((String)newValue);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS:
				setParameters((ParametersType1)newValue);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.WHITEBOX_ELEMENT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__WHITEBOX_TYPE:
				unsetWhiteboxType();
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__DRIVEABLE:
				unsetDriveable();
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__REGISTER_REF:
				setRegisterRef(REGISTER_REF_EDEFAULT);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS:
				setParameters((ParametersType1)null);
				return;
			case _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.WHITEBOX_ELEMENT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _1Package.WHITEBOX_ELEMENT_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case _1Package.WHITEBOX_ELEMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _1Package.WHITEBOX_ELEMENT_TYPE__WHITEBOX_TYPE:
				return isSetWhiteboxType();
			case _1Package.WHITEBOX_ELEMENT_TYPE__DRIVEABLE:
				return isSetDriveable();
			case _1Package.WHITEBOX_ELEMENT_TYPE__REGISTER_REF:
				return REGISTER_REF_EDEFAULT == null ? registerRef != null : !REGISTER_REF_EDEFAULT.equals(registerRef);
			case _1Package.WHITEBOX_ELEMENT_TYPE__PARAMETERS:
				return parameters != null;
			case _1Package.WHITEBOX_ELEMENT_TYPE__VENDOR_EXTENSIONS:
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
		result.append(", whiteboxType: ");
		if (whiteboxTypeESet) result.append(whiteboxType); else result.append("<unset>");
		result.append(", driveable: ");
		if (driveableESet) result.append(driveable); else result.append("<unset>");
		result.append(", registerRef: ");
		result.append(registerRef);
		result.append(')');
		return result.toString();
	}

} //WhiteboxElementTypeImpl
