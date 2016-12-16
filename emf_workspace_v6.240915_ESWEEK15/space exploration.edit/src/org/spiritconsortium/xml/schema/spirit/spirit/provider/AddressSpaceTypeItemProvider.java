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

import org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressSpaceTypeItemProvider
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
	public AddressSpaceTypeItemProvider(AdapterFactory adapterFactory) {
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
			addAddressUnitBitsPropertyDescriptor(object);
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
				 getString("_UI_AddressSpaceType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressSpaceType_name_feature", "_UI_AddressSpaceType_type"),
				 _1Package.eINSTANCE.getAddressSpaceType_Name(),
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
				 getString("_UI_AddressSpaceType_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressSpaceType_displayName_feature", "_UI_AddressSpaceType_type"),
				 _1Package.eINSTANCE.getAddressSpaceType_DisplayName(),
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
				 getString("_UI_AddressSpaceType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressSpaceType_description_feature", "_UI_AddressSpaceType_type"),
				 _1Package.eINSTANCE.getAddressSpaceType_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Address Unit Bits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressUnitBitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AddressSpaceType_addressUnitBits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AddressSpaceType_addressUnitBits_feature", "_UI_AddressSpaceType_type"),
				 _1Package.eINSTANCE.getAddressSpaceType_AddressUnitBits(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getAddressSpaceType_Range());
			childrenFeatures.add(_1Package.eINSTANCE.getAddressSpaceType_Width());
			childrenFeatures.add(_1Package.eINSTANCE.getAddressSpaceType_Segments());
			childrenFeatures.add(_1Package.eINSTANCE.getAddressSpaceType_ExecutableImage());
			childrenFeatures.add(_1Package.eINSTANCE.getAddressSpaceType_LocalMemoryMap());
			childrenFeatures.add(_1Package.eINSTANCE.getAddressSpaceType_Parameters());
			childrenFeatures.add(_1Package.eINSTANCE.getAddressSpaceType_VendorExtensions());
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
	 * This returns AddressSpaceType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddressSpaceType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((AddressSpaceType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AddressSpaceType_type") :
			getString("_UI_AddressSpaceType_type") + " " + label;
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

		switch (notification.getFeatureID(AddressSpaceType.class)) {
			case _1Package.ADDRESS_SPACE_TYPE__NAME:
			case _1Package.ADDRESS_SPACE_TYPE__DISPLAY_NAME:
			case _1Package.ADDRESS_SPACE_TYPE__DESCRIPTION:
			case _1Package.ADDRESS_SPACE_TYPE__ADDRESS_UNIT_BITS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.ADDRESS_SPACE_TYPE__RANGE:
			case _1Package.ADDRESS_SPACE_TYPE__WIDTH:
			case _1Package.ADDRESS_SPACE_TYPE__SEGMENTS:
			case _1Package.ADDRESS_SPACE_TYPE__EXECUTABLE_IMAGE:
			case _1Package.ADDRESS_SPACE_TYPE__LOCAL_MEMORY_MAP:
			case _1Package.ADDRESS_SPACE_TYPE__PARAMETERS:
			case _1Package.ADDRESS_SPACE_TYPE__VENDOR_EXTENSIONS:
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
				(_1Package.eINSTANCE.getAddressSpaceType_Range(),
				 _1Factory.eINSTANCE.createRangeType3()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAddressSpaceType_Width(),
				 _1Factory.eINSTANCE.createWidthType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAddressSpaceType_Segments(),
				 _1Factory.eINSTANCE.createSegmentsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAddressSpaceType_ExecutableImage(),
				 _1Factory.eINSTANCE.createExecutableImageType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAddressSpaceType_LocalMemoryMap(),
				 _1Factory.eINSTANCE.createLocalMemoryMapType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAddressSpaceType_Parameters(),
				 _1Factory.eINSTANCE.createParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAddressSpaceType_VendorExtensions(),
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
