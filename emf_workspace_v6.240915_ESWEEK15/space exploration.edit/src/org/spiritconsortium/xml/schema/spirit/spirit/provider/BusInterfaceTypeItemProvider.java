/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusInterfaceTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusInterfaceTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addDisplayNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addConnectionRequiredPropertyDescriptor(object);
			addBitsInLauPropertyDescriptor(object);
			addEndiannessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusInterfaceType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusInterfaceType_name_feature", "_UI_BusInterfaceType_type"),
				 _1Package.eINSTANCE.getBusInterfaceType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusInterfaceType_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusInterfaceType_displayName_feature", "_UI_BusInterfaceType_type"),
				 _1Package.eINSTANCE.getBusInterfaceType_DisplayName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusInterfaceType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusInterfaceType_description_feature", "_UI_BusInterfaceType_type"),
				 _1Package.eINSTANCE.getBusInterfaceType_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connection Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectionRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusInterfaceType_connectionRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusInterfaceType_connectionRequired_feature", "_UI_BusInterfaceType_type"),
				 _1Package.eINSTANCE.getBusInterfaceType_ConnectionRequired(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bits In Lau feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitsInLauPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusInterfaceType_bitsInLau_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusInterfaceType_bitsInLau_feature", "_UI_BusInterfaceType_type"),
				 _1Package.eINSTANCE.getBusInterfaceType_BitsInLau(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endianness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndiannessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusInterfaceType_endianness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusInterfaceType_endianness_feature", "_UI_BusInterfaceType_type"),
				 _1Package.eINSTANCE.getBusInterfaceType_Endianness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_BusType());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_AbstractionType());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_Master());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_Slave());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_System());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_MirroredSlave());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_MirroredMaster());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_MirroredSystem());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_Monitor());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_PortMaps());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_BitSteering());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_Parameters());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_VendorExtensions());
			childrenFeatures.add(_1Package.eINSTANCE.getBusInterfaceType_AnyAttribute());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BusInterfaceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusInterfaceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((BusInterfaceType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusInterfaceType_type") :
			getString("_UI_BusInterfaceType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BusInterfaceType.class)) {
			case _1Package.BUS_INTERFACE_TYPE__NAME:
			case _1Package.BUS_INTERFACE_TYPE__DISPLAY_NAME:
			case _1Package.BUS_INTERFACE_TYPE__DESCRIPTION:
			case _1Package.BUS_INTERFACE_TYPE__CONNECTION_REQUIRED:
			case _1Package.BUS_INTERFACE_TYPE__BITS_IN_LAU:
			case _1Package.BUS_INTERFACE_TYPE__ENDIANNESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.BUS_INTERFACE_TYPE__BUS_TYPE:
			case _1Package.BUS_INTERFACE_TYPE__ABSTRACTION_TYPE:
			case _1Package.BUS_INTERFACE_TYPE__MASTER:
			case _1Package.BUS_INTERFACE_TYPE__SLAVE:
			case _1Package.BUS_INTERFACE_TYPE__SYSTEM:
			case _1Package.BUS_INTERFACE_TYPE__MIRRORED_SLAVE:
			case _1Package.BUS_INTERFACE_TYPE__MIRRORED_MASTER:
			case _1Package.BUS_INTERFACE_TYPE__MIRRORED_SYSTEM:
			case _1Package.BUS_INTERFACE_TYPE__MONITOR:
			case _1Package.BUS_INTERFACE_TYPE__PORT_MAPS:
			case _1Package.BUS_INTERFACE_TYPE__BIT_STEERING:
			case _1Package.BUS_INTERFACE_TYPE__PARAMETERS:
			case _1Package.BUS_INTERFACE_TYPE__VENDOR_EXTENSIONS:
			case _1Package.BUS_INTERFACE_TYPE__ANY_ATTRIBUTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_BusType(),
				 _1Factory.eINSTANCE.createLibraryRefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_AbstractionType(),
				 _1Factory.eINSTANCE.createLibraryRefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_Master(),
				 _1Factory.eINSTANCE.createMasterType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_Slave(),
				 _1Factory.eINSTANCE.createSlaveType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_System(),
				 _1Factory.eINSTANCE.createSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_MirroredSlave(),
				 _1Factory.eINSTANCE.createMirroredSlaveType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_MirroredMaster(),
				 _1Factory.eINSTANCE.createMirroredMasterType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_MirroredSystem(),
				 _1Factory.eINSTANCE.createMirroredSystemType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_Monitor(),
				 _1Factory.eINSTANCE.createMonitorType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_PortMaps(),
				 _1Factory.eINSTANCE.createPortMapsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_BitSteering(),
				 _1Factory.eINSTANCE.createBitSteeringType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_Parameters(),
				 _1Factory.eINSTANCE.createParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusInterfaceType_VendorExtensions(),
				 _1Factory.eINSTANCE.createVendorExtensionsType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == _1Package.eINSTANCE.getBusInterfaceType_BusType() ||
			childFeature == _1Package.eINSTANCE.getBusInterfaceType_AbstractionType();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return AbstractionDefinitionEditPlugin.INSTANCE;
	}

}
