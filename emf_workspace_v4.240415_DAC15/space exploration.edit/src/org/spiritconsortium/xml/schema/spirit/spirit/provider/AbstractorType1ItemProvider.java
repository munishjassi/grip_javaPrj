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

import org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractorType1ItemProvider
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
	public AbstractorType1ItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_AbstractorType1_vendor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractorType1_vendor_feature", "_UI_AbstractorType1_type"),
				 _1Package.eINSTANCE.getAbstractorType1_Vendor(),
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
				 getString("_UI_AbstractorType1_library_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractorType1_library_feature", "_UI_AbstractorType1_type"),
				 _1Package.eINSTANCE.getAbstractorType1_Library(),
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
				 getString("_UI_AbstractorType1_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractorType1_name_feature", "_UI_AbstractorType1_type"),
				 _1Package.eINSTANCE.getAbstractorType1_Name(),
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
				 getString("_UI_AbstractorType1_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractorType1_version_feature", "_UI_AbstractorType1_type"),
				 _1Package.eINSTANCE.getAbstractorType1_Version(),
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
				 getString("_UI_AbstractorType1_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractorType1_description_feature", "_UI_AbstractorType1_type"),
				 _1Package.eINSTANCE.getAbstractorType1_Description(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_AbstractorMode());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_BusType());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_AbstractorInterfaces());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_Model());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_AbstractorGenerators());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_Choices());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_FileSets());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_Parameters());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractorType1_VendorExtensions());
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
	 * This returns AbstractorType1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractorType1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((AbstractorType1)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractorType1_type") :
			getString("_UI_AbstractorType1_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractorType1.class)) {
			case _1Package.ABSTRACTOR_TYPE1__VENDOR:
			case _1Package.ABSTRACTOR_TYPE1__LIBRARY:
			case _1Package.ABSTRACTOR_TYPE1__NAME:
			case _1Package.ABSTRACTOR_TYPE1__VERSION:
			case _1Package.ABSTRACTOR_TYPE1__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.ABSTRACTOR_TYPE1__ABSTRACTOR_MODE:
			case _1Package.ABSTRACTOR_TYPE1__BUS_TYPE:
			case _1Package.ABSTRACTOR_TYPE1__ABSTRACTOR_INTERFACES:
			case _1Package.ABSTRACTOR_TYPE1__MODEL:
			case _1Package.ABSTRACTOR_TYPE1__ABSTRACTOR_GENERATORS:
			case _1Package.ABSTRACTOR_TYPE1__CHOICES:
			case _1Package.ABSTRACTOR_TYPE1__FILE_SETS:
			case _1Package.ABSTRACTOR_TYPE1__PARAMETERS:
			case _1Package.ABSTRACTOR_TYPE1__VENDOR_EXTENSIONS:
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
				(_1Package.eINSTANCE.getAbstractorType1_AbstractorMode(),
				 _1Factory.eINSTANCE.createAbstractorModeType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_BusType(),
				 _1Factory.eINSTANCE.createLibraryRefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_AbstractorInterfaces(),
				 _1Factory.eINSTANCE.createAbstractorInterfacesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_Model(),
				 _1Factory.eINSTANCE.createAbstractorModelType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_AbstractorGenerators(),
				 _1Factory.eINSTANCE.createAbstractorGeneratorsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_Choices(),
				 _1Factory.eINSTANCE.createChoicesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_FileSets(),
				 _1Factory.eINSTANCE.createFileSetsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_Parameters(),
				 _1Factory.eINSTANCE.createParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractorType1_VendorExtensions(),
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
