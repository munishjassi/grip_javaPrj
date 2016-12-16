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

import org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType;
import org.spiritconsortium.xml.schema.spirit.spirit.DesignType;
import org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Design Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getInterconnections <em>Interconnections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getAdHocConnections <em>Ad Hoc Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getHierConnections <em>Hier Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.impl.DesignTypeImpl#getVendorExtensions <em>Vendor Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DesignTypeImpl extends EObjectImpl implements DesignType {
	/**
	 * The default value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendor() <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendor()
	 * @generated
	 * @ordered
	 */
	protected String vendor = VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected String library = LIBRARY_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstancesType componentInstances;

	/**
	 * The cached value of the '{@link #getInterconnections() <em>Interconnections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnections()
	 * @generated
	 * @ordered
	 */
	protected InterconnectionsType interconnections;

	/**
	 * The cached value of the '{@link #getAdHocConnections() <em>Ad Hoc Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdHocConnections()
	 * @generated
	 * @ordered
	 */
	protected AdHocConnectionsType adHocConnections;

	/**
	 * The cached value of the '{@link #getHierConnections() <em>Hier Connections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierConnections()
	 * @generated
	 * @ordered
	 */
	protected HierConnectionsType hierConnections;

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
	public DesignTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return _1Package.eINSTANCE.getDesignType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVendor(String newVendor) {
		String oldVendor = vendor;
		vendor = newVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__VENDOR, oldVendor, vendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(String newLibrary) {
		String oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__LIBRARY, oldLibrary, library));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstancesType getComponentInstances() {
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstances(ComponentInstancesType newComponentInstances, NotificationChain msgs) {
		ComponentInstancesType oldComponentInstances = componentInstances;
		componentInstances = newComponentInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__COMPONENT_INSTANCES, oldComponentInstances, newComponentInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstances(ComponentInstancesType newComponentInstances) {
		if (newComponentInstances != componentInstances) {
			NotificationChain msgs = null;
			if (componentInstances != null)
				msgs = ((InternalEObject)componentInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__COMPONENT_INSTANCES, null, msgs);
			if (newComponentInstances != null)
				msgs = ((InternalEObject)newComponentInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__COMPONENT_INSTANCES, null, msgs);
			msgs = basicSetComponentInstances(newComponentInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__COMPONENT_INSTANCES, newComponentInstances, newComponentInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterconnectionsType getInterconnections() {
		return interconnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterconnections(InterconnectionsType newInterconnections, NotificationChain msgs) {
		InterconnectionsType oldInterconnections = interconnections;
		interconnections = newInterconnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__INTERCONNECTIONS, oldInterconnections, newInterconnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterconnections(InterconnectionsType newInterconnections) {
		if (newInterconnections != interconnections) {
			NotificationChain msgs = null;
			if (interconnections != null)
				msgs = ((InternalEObject)interconnections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__INTERCONNECTIONS, null, msgs);
			if (newInterconnections != null)
				msgs = ((InternalEObject)newInterconnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__INTERCONNECTIONS, null, msgs);
			msgs = basicSetInterconnections(newInterconnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__INTERCONNECTIONS, newInterconnections, newInterconnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocConnectionsType getAdHocConnections() {
		return adHocConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdHocConnections(AdHocConnectionsType newAdHocConnections, NotificationChain msgs) {
		AdHocConnectionsType oldAdHocConnections = adHocConnections;
		adHocConnections = newAdHocConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS, oldAdHocConnections, newAdHocConnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdHocConnections(AdHocConnectionsType newAdHocConnections) {
		if (newAdHocConnections != adHocConnections) {
			NotificationChain msgs = null;
			if (adHocConnections != null)
				msgs = ((InternalEObject)adHocConnections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS, null, msgs);
			if (newAdHocConnections != null)
				msgs = ((InternalEObject)newAdHocConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS, null, msgs);
			msgs = basicSetAdHocConnections(newAdHocConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS, newAdHocConnections, newAdHocConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierConnectionsType getHierConnections() {
		return hierConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierConnections(HierConnectionsType newHierConnections, NotificationChain msgs) {
		HierConnectionsType oldHierConnections = hierConnections;
		hierConnections = newHierConnections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__HIER_CONNECTIONS, oldHierConnections, newHierConnections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierConnections(HierConnectionsType newHierConnections) {
		if (newHierConnections != hierConnections) {
			NotificationChain msgs = null;
			if (hierConnections != null)
				msgs = ((InternalEObject)hierConnections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__HIER_CONNECTIONS, null, msgs);
			if (newHierConnections != null)
				msgs = ((InternalEObject)newHierConnections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__HIER_CONNECTIONS, null, msgs);
			msgs = basicSetHierConnections(newHierConnections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__HIER_CONNECTIONS, newHierConnections, newHierConnections));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS, oldVendorExtensions, newVendorExtensions);
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
				msgs = ((InternalEObject)vendorExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS, null, msgs);
			if (newVendorExtensions != null)
				msgs = ((InternalEObject)newVendorExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS, null, msgs);
			msgs = basicSetVendorExtensions(newVendorExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS, newVendorExtensions, newVendorExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _1Package.DESIGN_TYPE__COMPONENT_INSTANCES:
				return basicSetComponentInstances(null, msgs);
			case _1Package.DESIGN_TYPE__INTERCONNECTIONS:
				return basicSetInterconnections(null, msgs);
			case _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS:
				return basicSetAdHocConnections(null, msgs);
			case _1Package.DESIGN_TYPE__HIER_CONNECTIONS:
				return basicSetHierConnections(null, msgs);
			case _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.DESIGN_TYPE__VENDOR:
				return getVendor();
			case _1Package.DESIGN_TYPE__LIBRARY:
				return getLibrary();
			case _1Package.DESIGN_TYPE__NAME:
				return getName();
			case _1Package.DESIGN_TYPE__VERSION:
				return getVersion();
			case _1Package.DESIGN_TYPE__COMPONENT_INSTANCES:
				return getComponentInstances();
			case _1Package.DESIGN_TYPE__INTERCONNECTIONS:
				return getInterconnections();
			case _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS:
				return getAdHocConnections();
			case _1Package.DESIGN_TYPE__HIER_CONNECTIONS:
				return getHierConnections();
			case _1Package.DESIGN_TYPE__DESCRIPTION:
				return getDescription();
			case _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.DESIGN_TYPE__VENDOR:
				setVendor((String)newValue);
				return;
			case _1Package.DESIGN_TYPE__LIBRARY:
				setLibrary((String)newValue);
				return;
			case _1Package.DESIGN_TYPE__NAME:
				setName((String)newValue);
				return;
			case _1Package.DESIGN_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case _1Package.DESIGN_TYPE__COMPONENT_INSTANCES:
				setComponentInstances((ComponentInstancesType)newValue);
				return;
			case _1Package.DESIGN_TYPE__INTERCONNECTIONS:
				setInterconnections((InterconnectionsType)newValue);
				return;
			case _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS:
				setAdHocConnections((AdHocConnectionsType)newValue);
				return;
			case _1Package.DESIGN_TYPE__HIER_CONNECTIONS:
				setHierConnections((HierConnectionsType)newValue);
				return;
			case _1Package.DESIGN_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.DESIGN_TYPE__VENDOR:
				setVendor(VENDOR_EDEFAULT);
				return;
			case _1Package.DESIGN_TYPE__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case _1Package.DESIGN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _1Package.DESIGN_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case _1Package.DESIGN_TYPE__COMPONENT_INSTANCES:
				setComponentInstances((ComponentInstancesType)null);
				return;
			case _1Package.DESIGN_TYPE__INTERCONNECTIONS:
				setInterconnections((InterconnectionsType)null);
				return;
			case _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS:
				setAdHocConnections((AdHocConnectionsType)null);
				return;
			case _1Package.DESIGN_TYPE__HIER_CONNECTIONS:
				setHierConnections((HierConnectionsType)null);
				return;
			case _1Package.DESIGN_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS:
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
			case _1Package.DESIGN_TYPE__VENDOR:
				return VENDOR_EDEFAULT == null ? vendor != null : !VENDOR_EDEFAULT.equals(vendor);
			case _1Package.DESIGN_TYPE__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case _1Package.DESIGN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _1Package.DESIGN_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case _1Package.DESIGN_TYPE__COMPONENT_INSTANCES:
				return componentInstances != null;
			case _1Package.DESIGN_TYPE__INTERCONNECTIONS:
				return interconnections != null;
			case _1Package.DESIGN_TYPE__AD_HOC_CONNECTIONS:
				return adHocConnections != null;
			case _1Package.DESIGN_TYPE__HIER_CONNECTIONS:
				return hierConnections != null;
			case _1Package.DESIGN_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _1Package.DESIGN_TYPE__VENDOR_EXTENSIONS:
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
		result.append(" (vendor: ");
		result.append(vendor);
		result.append(", library: ");
		result.append(library);
		result.append(", name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DesignTypeImpl
