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

import org.spiritconsortium.xml.schema.spirit.spirit.CommandLineSwitchType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.CommandLineSwitchType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandLineSwitchTypeItemProvider
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
	public CommandLineSwitchTypeItemProvider(AdapterFactory adapterFactory) {
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

			addValuePropertyDescriptor(object);
			addBitStringLengthPropertyDescriptor(object);
			addChoiceRefPropertyDescriptor(object);
			addConfigGroupsPropertyDescriptor(object);
			addDependencyPropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addMaximumPropertyDescriptor(object);
			addMinimumPropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
			addPromptPropertyDescriptor(object);
			addRangeTypePropertyDescriptor(object);
			addResolvePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_value_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Value(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bit String Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitStringLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_bitStringLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_bitStringLength_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_BitStringLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Choice Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChoiceRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_choiceRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_choiceRef_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_ChoiceRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Config Groups feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigGroupsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_configGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_configGroups_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_ConfigGroups(),
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
				 getString("_UI_CommandLineSwitchType_dependency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_dependency_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Dependency(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_format_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Format(),
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
				 getString("_UI_CommandLineSwitchType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_id_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_maximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_maximum_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Maximum(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_minimum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_minimum_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Minimum(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_order_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_order_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Order(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prompt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPromptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_prompt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_prompt_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Prompt(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_rangeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_rangeType_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_RangeType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolve feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolvePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineSwitchType_resolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineSwitchType_resolve_feature", "_UI_CommandLineSwitchType_type"),
				 _1Package.eINSTANCE.getCommandLineSwitchType_Resolve(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getCommandLineSwitchType_AnyAttribute());
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
	 * This returns CommandLineSwitchType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommandLineSwitchType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((CommandLineSwitchType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_CommandLineSwitchType_type") :
			getString("_UI_CommandLineSwitchType_type") + " " + label;
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

		switch (notification.getFeatureID(CommandLineSwitchType.class)) {
			case _1Package.COMMAND_LINE_SWITCH_TYPE__VALUE:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__BIT_STRING_LENGTH:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__CHOICE_REF:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__CONFIG_GROUPS:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__DEPENDENCY:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__FORMAT:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__ID:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__MAXIMUM:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__MINIMUM:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__ORDER:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__PROMPT:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__RANGE_TYPE:
			case _1Package.COMMAND_LINE_SWITCH_TYPE__RESOLVE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.COMMAND_LINE_SWITCH_TYPE__ANY_ATTRIBUTE:
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
