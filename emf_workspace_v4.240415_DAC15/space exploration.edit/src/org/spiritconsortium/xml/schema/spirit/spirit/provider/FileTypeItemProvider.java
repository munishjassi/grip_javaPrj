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

import org.spiritconsortium.xml.schema.spirit.spirit.FileType;
import org.spiritconsortium.xml.schema.spirit.spirit.FileTypeType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.FileType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FileTypeItemProvider
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
	public FileTypeItemProvider(AdapterFactory adapterFactory) {
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

			addFileType1PropertyDescriptor(object);
			addUserFileTypePropertyDescriptor(object);
			addExportedNamePropertyDescriptor(object);
			addDependencyPropertyDescriptor(object);
			addImageTypePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addFileIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the File Type1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileType1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileType_fileType1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileType_fileType1_feature", "_UI_FileType_type"),
				 _1Package.eINSTANCE.getFileType_FileType1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User File Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserFileTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileType_userFileType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileType_userFileType_feature", "_UI_FileType_type"),
				 _1Package.eINSTANCE.getFileType_UserFileType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exported Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExportedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileType_exportedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileType_exportedName_feature", "_UI_FileType_type"),
				 _1Package.eINSTANCE.getFileType_ExportedName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileType_dependency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileType_dependency_feature", "_UI_FileType_type"),
				 _1Package.eINSTANCE.getFileType_Dependency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Image Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileType_imageType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileType_imageType_feature", "_UI_FileType_type"),
				 _1Package.eINSTANCE.getFileType_ImageType(),
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
				 getString("_UI_FileType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileType_description_feature", "_UI_FileType_type"),
				 _1Package.eINSTANCE.getFileType_Description(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the File Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFileIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FileType_fileId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FileType_fileId_feature", "_UI_FileType_type"),
				 _1Package.eINSTANCE.getFileType_FileId(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_Name());
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_FileType());
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_IsIncludeFile());
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_LogicalName());
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_BuildCommand());
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_Define());
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_VendorExtensions());
			childrenFeatures.add(_1Package.eINSTANCE.getFileType_AnyAttribute());
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
	 * This returns FileType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FileType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((FileType)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_FileType_type") :
			getString("_UI_FileType_type") + " " + label;
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

		switch (notification.getFeatureID(FileType.class)) {
			case _1Package.FILE_TYPE__FILE_TYPE1:
			case _1Package.FILE_TYPE__USER_FILE_TYPE:
			case _1Package.FILE_TYPE__EXPORTED_NAME:
			case _1Package.FILE_TYPE__DEPENDENCY:
			case _1Package.FILE_TYPE__IMAGE_TYPE:
			case _1Package.FILE_TYPE__DESCRIPTION:
			case _1Package.FILE_TYPE__FILE_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.FILE_TYPE__NAME:
			case _1Package.FILE_TYPE__FILE_TYPE:
			case _1Package.FILE_TYPE__IS_INCLUDE_FILE:
			case _1Package.FILE_TYPE__LOGICAL_NAME:
			case _1Package.FILE_TYPE__BUILD_COMMAND:
			case _1Package.FILE_TYPE__DEFINE:
			case _1Package.FILE_TYPE__VENDOR_EXTENSIONS:
			case _1Package.FILE_TYPE__ANY_ATTRIBUTE:
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
				(_1Package.eINSTANCE.getFileType_Name(),
				 _1Factory.eINSTANCE.createNameType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_FileType(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getFileType_FileType1(),
					 FileTypeType.UNKNOWN_LITERAL)));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_FileType(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getFileType_UserFileType(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_IsIncludeFile(),
				 _1Factory.eINSTANCE.createIsIncludeFileType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_LogicalName(),
				 _1Factory.eINSTANCE.createLogicalNameType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_BuildCommand(),
				 _1Factory.eINSTANCE.createBuildCommandType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_Define(),
				 _1Factory.eINSTANCE.createNameValuePairType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_Define(),
				 _1Factory.eINSTANCE.createNameValueTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getFileType_VendorExtensions(),
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
