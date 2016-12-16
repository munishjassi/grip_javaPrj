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

import org.spiritconsortium.xml.schema.spirit.spirit.RegisterType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.RegisterType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegisterTypeItemProvider
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
	public RegisterTypeItemProvider(AdapterFactory adapterFactory) {
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
			addDimPropertyDescriptor(object);
			addAddressOffsetPropertyDescriptor(object);
			addTypeIdentifierPropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
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
				 getString("_UI_RegisterType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_name_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_Name(),
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
				 getString("_UI_RegisterType_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_displayName_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_DisplayName(),
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
				 getString("_UI_RegisterType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_description_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dim feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegisterType_dim_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_dim_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_Dim(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Address Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegisterType_addressOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_addressOffset_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_AddressOffset(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Identifier feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeIdentifierPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegisterType_typeIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_typeIdentifier_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_TypeIdentifier(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volatile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolatilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegisterType_volatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_volatile_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_Volatile(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegisterType_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_access_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RegisterType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RegisterType_id_feature", "_UI_RegisterType_type"),
				 _1Package.eINSTANCE.getRegisterType_Id(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getRegisterType_Size());
			childrenFeatures.add(_1Package.eINSTANCE.getRegisterType_Reset());
			childrenFeatures.add(_1Package.eINSTANCE.getRegisterType_Field());
			childrenFeatures.add(_1Package.eINSTANCE.getRegisterType_AlternateRegisters());
			childrenFeatures.add(_1Package.eINSTANCE.getRegisterType_Parameters());
			childrenFeatures.add(_1Package.eINSTANCE.getRegisterType_VendorExtensions());
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
	 * This returns RegisterType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RegisterType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((RegisterType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RegisterType_type") :
			getString("_UI_RegisterType_type") + " " + label;
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

		switch (notification.getFeatureID(RegisterType.class)) {
			case _1Package.REGISTER_TYPE__NAME:
			case _1Package.REGISTER_TYPE__DISPLAY_NAME:
			case _1Package.REGISTER_TYPE__DESCRIPTION:
			case _1Package.REGISTER_TYPE__DIM:
			case _1Package.REGISTER_TYPE__ADDRESS_OFFSET:
			case _1Package.REGISTER_TYPE__TYPE_IDENTIFIER:
			case _1Package.REGISTER_TYPE__VOLATILE:
			case _1Package.REGISTER_TYPE__ACCESS:
			case _1Package.REGISTER_TYPE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.REGISTER_TYPE__SIZE:
			case _1Package.REGISTER_TYPE__RESET:
			case _1Package.REGISTER_TYPE__FIELD:
			case _1Package.REGISTER_TYPE__ALTERNATE_REGISTERS:
			case _1Package.REGISTER_TYPE__PARAMETERS:
			case _1Package.REGISTER_TYPE__VENDOR_EXTENSIONS:
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
				(_1Package.eINSTANCE.getRegisterType_Size(),
				 _1Factory.eINSTANCE.createSizeType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getRegisterType_Reset(),
				 _1Factory.eINSTANCE.createResetType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getRegisterType_Field(),
				 _1Factory.eINSTANCE.createFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getRegisterType_AlternateRegisters(),
				 _1Factory.eINSTANCE.createAlternateRegistersType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getRegisterType_Parameters(),
				 _1Factory.eINSTANCE.createParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getRegisterType_VendorExtensions(),
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
