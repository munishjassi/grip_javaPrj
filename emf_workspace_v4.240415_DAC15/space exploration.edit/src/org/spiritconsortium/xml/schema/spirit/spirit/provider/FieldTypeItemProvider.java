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

import org.spiritconsortium.xml.schema.spirit.spirit.FieldType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.FieldType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldTypeItemProvider
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
	public FieldTypeItemProvider(AdapterFactory adapterFactory) {
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
			addBitOffsetPropertyDescriptor(object);
			addTypeIdentifierPropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addModifiedWriteValuePropertyDescriptor(object);
			addReadActionPropertyDescriptor(object);
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
				 getString("_UI_FieldType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_name_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_Name(),
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
				 getString("_UI_FieldType_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_displayName_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_DisplayName(),
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
				 getString("_UI_FieldType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_description_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bit Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldType_bitOffset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_bitOffset_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_BitOffset(),
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
				 getString("_UI_FieldType_typeIdentifier_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_typeIdentifier_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_TypeIdentifier(),
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
				 getString("_UI_FieldType_volatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_volatile_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_Volatile(),
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
				 getString("_UI_FieldType_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_access_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_Access(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified Write Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedWriteValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldType_modifiedWriteValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_modifiedWriteValue_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_ModifiedWriteValue(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FieldType_readAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_readAction_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_ReadAction(),
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
				 getString("_UI_FieldType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FieldType_id_feature", "_UI_FieldType_type"),
				 _1Package.eINSTANCE.getFieldType_Id(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getFieldType_BitWidth());
			childrenFeatures.add(_1Package.eINSTANCE.getFieldType_EnumeratedValues());
			childrenFeatures.add(_1Package.eINSTANCE.getFieldType_WriteValueConstraint());
			childrenFeatures.add(_1Package.eINSTANCE.getFieldType_Testable());
			childrenFeatures.add(_1Package.eINSTANCE.getFieldType_Parameters());
			childrenFeatures.add(_1Package.eINSTANCE.getFieldType_VendorExtensions());
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
	 * This returns FieldType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FieldType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((FieldType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FieldType_type") :
			getString("_UI_FieldType_type") + " " + label;
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

		switch (notification.getFeatureID(FieldType.class)) {
			case _1Package.FIELD_TYPE__NAME:
			case _1Package.FIELD_TYPE__DISPLAY_NAME:
			case _1Package.FIELD_TYPE__DESCRIPTION:
			case _1Package.FIELD_TYPE__BIT_OFFSET:
			case _1Package.FIELD_TYPE__TYPE_IDENTIFIER:
			case _1Package.FIELD_TYPE__VOLATILE:
			case _1Package.FIELD_TYPE__ACCESS:
			case _1Package.FIELD_TYPE__MODIFIED_WRITE_VALUE:
			case _1Package.FIELD_TYPE__READ_ACTION:
			case _1Package.FIELD_TYPE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.FIELD_TYPE__BIT_WIDTH:
			case _1Package.FIELD_TYPE__ENUMERATED_VALUES:
			case _1Package.FIELD_TYPE__WRITE_VALUE_CONSTRAINT:
			case _1Package.FIELD_TYPE__TESTABLE:
			case _1Package.FIELD_TYPE__PARAMETERS:
			case _1Package.FIELD_TYPE__VENDOR_EXTENSIONS:
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
				(_1Package.eINSTANCE.getFieldType_BitWidth(),
				 _1Factory.eINSTANCE.createBitWidthType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFieldType_EnumeratedValues(),
				 _1Factory.eINSTANCE.createEnumeratedValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFieldType_WriteValueConstraint(),
				 _1Factory.eINSTANCE.createWriteValueConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFieldType_Testable(),
				 _1Factory.eINSTANCE.createTestableType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFieldType_Parameters(),
				 _1Factory.eINSTANCE.createParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFieldType_VendorExtensions(),
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
