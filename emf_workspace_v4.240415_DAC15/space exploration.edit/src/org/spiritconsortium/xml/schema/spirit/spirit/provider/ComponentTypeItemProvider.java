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

import org.spiritconsortium.xml.schema.spirit.spirit.ComponentType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentTypeItemProvider
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
	public ComponentTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ComponentType_vendor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_vendor_feature", "_UI_ComponentType_type"),
				 _1Package.eINSTANCE.getComponentType_Vendor(),
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
				 getString("_UI_ComponentType_library_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_library_feature", "_UI_ComponentType_type"),
				 _1Package.eINSTANCE.getComponentType_Library(),
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
				 getString("_UI_ComponentType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_name_feature", "_UI_ComponentType_type"),
				 _1Package.eINSTANCE.getComponentType_Name(),
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
				 getString("_UI_ComponentType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_version_feature", "_UI_ComponentType_type"),
				 _1Package.eINSTANCE.getComponentType_Version(),
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
				 getString("_UI_ComponentType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ComponentType_description_feature", "_UI_ComponentType_type"),
				 _1Package.eINSTANCE.getComponentType_Description(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_BusInterfaces());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_Channels());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_RemapStates());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_AddressSpaces());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_MemoryMaps());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_Model());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_ComponentGenerators());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_Choices());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_FileSets());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_WhiteboxElements());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_Cpus());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_OtherClockDrivers());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_Parameters());
			childrenFeatures.add(_1Package.eINSTANCE.getComponentType_VendorExtensions());
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
	 * This returns ComponentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((ComponentType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentType_type") :
			getString("_UI_ComponentType_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentType.class)) {
			case _1Package.COMPONENT_TYPE__VENDOR:
			case _1Package.COMPONENT_TYPE__LIBRARY:
			case _1Package.COMPONENT_TYPE__NAME:
			case _1Package.COMPONENT_TYPE__VERSION:
			case _1Package.COMPONENT_TYPE__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.COMPONENT_TYPE__BUS_INTERFACES:
			case _1Package.COMPONENT_TYPE__CHANNELS:
			case _1Package.COMPONENT_TYPE__REMAP_STATES:
			case _1Package.COMPONENT_TYPE__ADDRESS_SPACES:
			case _1Package.COMPONENT_TYPE__MEMORY_MAPS:
			case _1Package.COMPONENT_TYPE__MODEL:
			case _1Package.COMPONENT_TYPE__COMPONENT_GENERATORS:
			case _1Package.COMPONENT_TYPE__CHOICES:
			case _1Package.COMPONENT_TYPE__FILE_SETS:
			case _1Package.COMPONENT_TYPE__WHITEBOX_ELEMENTS:
			case _1Package.COMPONENT_TYPE__CPUS:
			case _1Package.COMPONENT_TYPE__OTHER_CLOCK_DRIVERS:
			case _1Package.COMPONENT_TYPE__PARAMETERS:
			case _1Package.COMPONENT_TYPE__VENDOR_EXTENSIONS:
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
				(_1Package.eINSTANCE.getComponentType_BusInterfaces(),
				 _1Factory.eINSTANCE.createBusInterfacesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_Channels(),
				 _1Factory.eINSTANCE.createChannelsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_RemapStates(),
				 _1Factory.eINSTANCE.createRemapStatesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_AddressSpaces(),
				 _1Factory.eINSTANCE.createAddressSpacesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_MemoryMaps(),
				 _1Factory.eINSTANCE.createMemoryMapsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_Model(),
				 _1Factory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_ComponentGenerators(),
				 _1Factory.eINSTANCE.createComponentGeneratorsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_Choices(),
				 _1Factory.eINSTANCE.createChoicesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_FileSets(),
				 _1Factory.eINSTANCE.createFileSetsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_WhiteboxElements(),
				 _1Factory.eINSTANCE.createWhiteboxElementsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_Cpus(),
				 _1Factory.eINSTANCE.createCpusType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_OtherClockDrivers(),
				 _1Factory.eINSTANCE.createOtherClocks()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_Parameters(),
				 _1Factory.eINSTANCE.createParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getComponentType_VendorExtensions(),
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
