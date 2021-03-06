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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusDefinitionTypeItemProvider
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
	public BusDefinitionTypeItemProvider(AdapterFactory adapterFactory) {
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

			addVendorPropertyDescriptor(object);
			addLibraryPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
			addDirectConnectionPropertyDescriptor(object);
			addIsAddressablePropertyDescriptor(object);
			addMaxMastersPropertyDescriptor(object);
			addMaxSlavesPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vendor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVendorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusDefinitionType_vendor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_vendor_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_Vendor(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Library feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLibraryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusDefinitionType_library_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_library_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_Library(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_BusDefinitionType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_name_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusDefinitionType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_version_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_Version(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Direct Connection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectConnectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusDefinitionType_directConnection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_directConnection_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_DirectConnection(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Addressable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAddressablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusDefinitionType_isAddressable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_isAddressable_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_IsAddressable(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Masters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxMastersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusDefinitionType_maxMasters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_maxMasters_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_MaxMasters(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Slaves feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxSlavesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BusDefinitionType_maxSlaves_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_maxSlaves_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_MaxSlaves(),
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
				 getString("_UI_BusDefinitionType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BusDefinitionType_description_feature", "_UI_BusDefinitionType_type"),
				 _1Package.eINSTANCE.getBusDefinitionType_Description(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getBusDefinitionType_Extends());
			childrenFeatures.add(_1Package.eINSTANCE.getBusDefinitionType_SystemGroupNames());
			childrenFeatures.add(_1Package.eINSTANCE.getBusDefinitionType_VendorExtensions());
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
	 * This returns BusDefinitionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BusDefinitionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((BusDefinitionType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BusDefinitionType_type") :
			getString("_UI_BusDefinitionType_type") + " " + label;
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

		switch (notification.getFeatureID(BusDefinitionType.class)) {
			case _1Package.BUS_DEFINITION_TYPE__VENDOR:
			case _1Package.BUS_DEFINITION_TYPE__LIBRARY:
			case _1Package.BUS_DEFINITION_TYPE__NAME:
			case _1Package.BUS_DEFINITION_TYPE__VERSION:
			case _1Package.BUS_DEFINITION_TYPE__DIRECT_CONNECTION:
			case _1Package.BUS_DEFINITION_TYPE__IS_ADDRESSABLE:
			case _1Package.BUS_DEFINITION_TYPE__MAX_MASTERS:
			case _1Package.BUS_DEFINITION_TYPE__MAX_SLAVES:
			case _1Package.BUS_DEFINITION_TYPE__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.BUS_DEFINITION_TYPE__EXTENDS:
			case _1Package.BUS_DEFINITION_TYPE__SYSTEM_GROUP_NAMES:
			case _1Package.BUS_DEFINITION_TYPE__VENDOR_EXTENSIONS:
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
				(_1Package.eINSTANCE.getBusDefinitionType_Extends(),
				 _1Factory.eINSTANCE.createLibraryRefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusDefinitionType_SystemGroupNames(),
				 _1Factory.eINSTANCE.createSystemGroupNamesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getBusDefinitionType_VendorExtensions(),
				 _1Factory.eINSTANCE.createVendorExtensionsType()));
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
