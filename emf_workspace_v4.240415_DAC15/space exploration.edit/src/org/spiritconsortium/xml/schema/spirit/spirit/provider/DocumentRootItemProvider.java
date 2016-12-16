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

import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

			addConstraintSetRefPropertyDescriptor(object);
			addDependencyPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addDisplayNamePropertyDescriptor(object);
			addGeneratorRefPropertyDescriptor(object);
			addInitiativePropertyDescriptor(object);
			addPortAccessHandlePropertyDescriptor(object);
			addPortAccessTypePropertyDescriptor(object);
			addPresencePropertyDescriptor(object);
			addBitStringLengthPropertyDescriptor(object);
			addCellStrengthPropertyDescriptor(object);
			addChoiceRefPropertyDescriptor(object);
			addClockEdgePropertyDescriptor(object);
			addConfigGroupsPropertyDescriptor(object);
			addConstraintSetIdPropertyDescriptor(object);
			addDelayTypePropertyDescriptor(object);
			addDependency1PropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addMaximumPropertyDescriptor(object);
			addMinimumPropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
			addPromptPropertyDescriptor(object);
			addRangeTypePropertyDescriptor(object);
			addResolvePropertyDescriptor(object);
			addAccessPropertyDescriptor(object);
			addAddressUnitBitsPropertyDescriptor(object);
			addBitsInLauPropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addInstanceNamePropertyDescriptor(object);
			addVolatilePropertyDescriptor(object);
			addAddressSpaceRef1PropertyDescriptor(object);
			addBankAlignmentPropertyDescriptor(object);
			addMasterRefPropertyDescriptor(object);
			addMemoryMapRef1PropertyDescriptor(object);
			addSegmentRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Constraint Set Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintSetRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_constraintSetRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_constraintSetRef_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_ConstraintSetRef(),
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
				 getString("_UI_DocumentRoot_dependency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dependency_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Dependency(),
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
				 getString("_UI_DocumentRoot_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_description_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Description(),
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
				 getString("_UI_DocumentRoot_displayName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_displayName_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_DisplayName(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Generator Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeneratorRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_generatorRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_generatorRef_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_GeneratorRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initiative feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitiativePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_initiative_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_initiative_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Initiative(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Access Handle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortAccessHandlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_portAccessHandle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_portAccessHandle_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_PortAccessHandle(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port Access Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortAccessTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_portAccessType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_portAccessType_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_PortAccessType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Presence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_presence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_presence_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Presence(),
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
				 getString("_UI_DocumentRoot_bitStringLength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_bitStringLength_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_BitStringLength(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cell Strength feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCellStrengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_cellStrength_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_cellStrength_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_CellStrength(),
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
				 getString("_UI_DocumentRoot_choiceRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_choiceRef_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_ChoiceRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clock Edge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockEdgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_clockEdge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_clockEdge_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_ClockEdge(),
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
				 getString("_UI_DocumentRoot_configGroups_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_configGroups_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_ConfigGroups(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint Set Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintSetIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_constraintSetId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_constraintSetId_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_ConstraintSetId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delay Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelayTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_delayType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_delayType_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_DelayType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependency1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependency1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_dependency1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_dependency1_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Dependency1(),
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
				 getString("_UI_DocumentRoot_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_format_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Format(),
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
				 getString("_UI_DocumentRoot_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_id_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Id(),
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
				 getString("_UI_DocumentRoot_maximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_maximum_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Maximum(),
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
				 getString("_UI_DocumentRoot_minimum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_minimum_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Minimum(),
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
				 getString("_UI_DocumentRoot_order_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_order_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Order(),
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
				 getString("_UI_DocumentRoot_prompt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_prompt_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Prompt(),
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
				 getString("_UI_DocumentRoot_rangeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_rangeType_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_RangeType(),
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
				 getString("_UI_DocumentRoot_resolve_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_resolve_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Resolve(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_DocumentRoot_access_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_access_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Access(),
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
				 getString("_UI_DocumentRoot_addressUnitBits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_addressUnitBits_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_AddressUnitBits(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_DocumentRoot_bitsInLau_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_bitsInLau_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_BitsInLau(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_group_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Group(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_instanceName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_instanceName_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_InstanceName(),
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
				 getString("_UI_DocumentRoot_volatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_volatile_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_Volatile(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Address Space Ref1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressSpaceRef1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_addressSpaceRef1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_addressSpaceRef1_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_AddressSpaceRef1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bank Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBankAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_bankAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_bankAlignment_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_BankAlignment(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Master Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_masterRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_masterRef_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_MasterRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Map Ref1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryMapRef1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_memoryMapRef1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_memoryMapRef1_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_MemoryMapRef1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Segment Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSegmentRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DocumentRoot_segmentRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DocumentRoot_segmentRef_feature", "_UI_DocumentRoot_type"),
				 _1Package.eINSTANCE.getDocumentRoot_SegmentRef(),
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
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AbstractionDefinition());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AbstractorGenerator());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AbstractorGenerators());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_CellSpecification());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Choices());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ClockDriver());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ComponentGenerator());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ComponentGenerators());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ConstraintSet());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ConstraintSets());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_DefaultValue());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_DriveConstraint());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Driver());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ExecutableImage());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_File());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_FileSet());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_FileSetRef());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_FileSets());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Generator());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_GeneratorChain());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_GroupSelector());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_LoadConstraint());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_OtherClockDriver());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Parameter());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Parameters());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Phase());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Port());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_RequiresDriver());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ServiceTypeDef());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ServiceTypeDefs());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_SingleShotDriver());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_TimingConstraint());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_TransTypeDef());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Vector());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_VendorExtensions());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_WireTypeDef());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_WireTypeDefs());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Abstractor());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AddressBlock());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AddressSpaceRef());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AddressSpaces());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AdHocConnection());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_AdHocConnections());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Bank());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_BaseAddress());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_BusInterface());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_BusInterfaces());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Channels());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ComponentInstance());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ComponentInstances());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ConfigurableElementValue());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_ConfigurableElementValues());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_EnumeratedValues());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Interconnection());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Interconnections());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_MemoryMapRef());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_MemoryMaps());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Model());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_MonitorInterconnection());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_RegisterFile());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_RemapStates());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_BusDefinition());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Component());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_Design());
			childrenFeatures.add(_1Package.eINSTANCE.getDocumentRoot_DesignConfiguration());
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((DocumentRoot)object).getDisplayName();
		return label == null || label.length() == 0 ?
			getString("_UI_DocumentRoot_type") :
			getString("_UI_DocumentRoot_type") + " " + label;
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case _1Package.DOCUMENT_ROOT__CONSTRAINT_SET_REF:
			case _1Package.DOCUMENT_ROOT__DEPENDENCY:
			case _1Package.DOCUMENT_ROOT__DESCRIPTION:
			case _1Package.DOCUMENT_ROOT__DISPLAY_NAME:
			case _1Package.DOCUMENT_ROOT__GENERATOR_REF:
			case _1Package.DOCUMENT_ROOT__INITIATIVE:
			case _1Package.DOCUMENT_ROOT__PORT_ACCESS_HANDLE:
			case _1Package.DOCUMENT_ROOT__PORT_ACCESS_TYPE:
			case _1Package.DOCUMENT_ROOT__PRESENCE:
			case _1Package.DOCUMENT_ROOT__BIT_STRING_LENGTH:
			case _1Package.DOCUMENT_ROOT__CELL_STRENGTH:
			case _1Package.DOCUMENT_ROOT__CHOICE_REF:
			case _1Package.DOCUMENT_ROOT__CLOCK_EDGE:
			case _1Package.DOCUMENT_ROOT__CONFIG_GROUPS:
			case _1Package.DOCUMENT_ROOT__CONSTRAINT_SET_ID:
			case _1Package.DOCUMENT_ROOT__DELAY_TYPE:
			case _1Package.DOCUMENT_ROOT__DEPENDENCY1:
			case _1Package.DOCUMENT_ROOT__FORMAT:
			case _1Package.DOCUMENT_ROOT__ID:
			case _1Package.DOCUMENT_ROOT__MAXIMUM:
			case _1Package.DOCUMENT_ROOT__MINIMUM:
			case _1Package.DOCUMENT_ROOT__ORDER:
			case _1Package.DOCUMENT_ROOT__PROMPT:
			case _1Package.DOCUMENT_ROOT__RANGE_TYPE:
			case _1Package.DOCUMENT_ROOT__RESOLVE:
			case _1Package.DOCUMENT_ROOT__ACCESS:
			case _1Package.DOCUMENT_ROOT__ADDRESS_UNIT_BITS:
			case _1Package.DOCUMENT_ROOT__BITS_IN_LAU:
			case _1Package.DOCUMENT_ROOT__GROUP:
			case _1Package.DOCUMENT_ROOT__INSTANCE_NAME:
			case _1Package.DOCUMENT_ROOT__VOLATILE:
			case _1Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF1:
			case _1Package.DOCUMENT_ROOT__BANK_ALIGNMENT:
			case _1Package.DOCUMENT_ROOT__MASTER_REF:
			case _1Package.DOCUMENT_ROOT__MEMORY_MAP_REF1:
			case _1Package.DOCUMENT_ROOT__SEGMENT_REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case _1Package.DOCUMENT_ROOT__ABSTRACTION_DEFINITION:
			case _1Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATOR:
			case _1Package.DOCUMENT_ROOT__ABSTRACTOR_GENERATORS:
			case _1Package.DOCUMENT_ROOT__CELL_SPECIFICATION:
			case _1Package.DOCUMENT_ROOT__CHOICES:
			case _1Package.DOCUMENT_ROOT__CLOCK_DRIVER:
			case _1Package.DOCUMENT_ROOT__COMPONENT_GENERATOR:
			case _1Package.DOCUMENT_ROOT__COMPONENT_GENERATORS:
			case _1Package.DOCUMENT_ROOT__CONSTRAINT_SET:
			case _1Package.DOCUMENT_ROOT__CONSTRAINT_SETS:
			case _1Package.DOCUMENT_ROOT__DEFAULT_VALUE:
			case _1Package.DOCUMENT_ROOT__DRIVE_CONSTRAINT:
			case _1Package.DOCUMENT_ROOT__DRIVER:
			case _1Package.DOCUMENT_ROOT__EXECUTABLE_IMAGE:
			case _1Package.DOCUMENT_ROOT__FILE:
			case _1Package.DOCUMENT_ROOT__FILE_SET:
			case _1Package.DOCUMENT_ROOT__FILE_SET_REF:
			case _1Package.DOCUMENT_ROOT__FILE_SETS:
			case _1Package.DOCUMENT_ROOT__GENERATOR:
			case _1Package.DOCUMENT_ROOT__GENERATOR_CHAIN:
			case _1Package.DOCUMENT_ROOT__GROUP_SELECTOR:
			case _1Package.DOCUMENT_ROOT__LOAD_CONSTRAINT:
			case _1Package.DOCUMENT_ROOT__OTHER_CLOCK_DRIVER:
			case _1Package.DOCUMENT_ROOT__PARAMETER:
			case _1Package.DOCUMENT_ROOT__PARAMETERS:
			case _1Package.DOCUMENT_ROOT__PHASE:
			case _1Package.DOCUMENT_ROOT__PORT:
			case _1Package.DOCUMENT_ROOT__REQUIRES_DRIVER:
			case _1Package.DOCUMENT_ROOT__SERVICE_TYPE_DEF:
			case _1Package.DOCUMENT_ROOT__SERVICE_TYPE_DEFS:
			case _1Package.DOCUMENT_ROOT__SINGLE_SHOT_DRIVER:
			case _1Package.DOCUMENT_ROOT__TIMING_CONSTRAINT:
			case _1Package.DOCUMENT_ROOT__TRANS_TYPE_DEF:
			case _1Package.DOCUMENT_ROOT__VECTOR:
			case _1Package.DOCUMENT_ROOT__VENDOR_EXTENSIONS:
			case _1Package.DOCUMENT_ROOT__WIRE_TYPE_DEF:
			case _1Package.DOCUMENT_ROOT__WIRE_TYPE_DEFS:
			case _1Package.DOCUMENT_ROOT__ABSTRACTOR:
			case _1Package.DOCUMENT_ROOT__ADDRESS_BLOCK:
			case _1Package.DOCUMENT_ROOT__ADDRESS_SPACE_REF:
			case _1Package.DOCUMENT_ROOT__ADDRESS_SPACES:
			case _1Package.DOCUMENT_ROOT__AD_HOC_CONNECTION:
			case _1Package.DOCUMENT_ROOT__AD_HOC_CONNECTIONS:
			case _1Package.DOCUMENT_ROOT__BANK:
			case _1Package.DOCUMENT_ROOT__BASE_ADDRESS:
			case _1Package.DOCUMENT_ROOT__BUS_INTERFACE:
			case _1Package.DOCUMENT_ROOT__BUS_INTERFACES:
			case _1Package.DOCUMENT_ROOT__CHANNELS:
			case _1Package.DOCUMENT_ROOT__COMPONENT_INSTANCE:
			case _1Package.DOCUMENT_ROOT__COMPONENT_INSTANCES:
			case _1Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUE:
			case _1Package.DOCUMENT_ROOT__CONFIGURABLE_ELEMENT_VALUES:
			case _1Package.DOCUMENT_ROOT__ENUMERATED_VALUES:
			case _1Package.DOCUMENT_ROOT__INTERCONNECTION:
			case _1Package.DOCUMENT_ROOT__INTERCONNECTIONS:
			case _1Package.DOCUMENT_ROOT__MEMORY_MAP_REF:
			case _1Package.DOCUMENT_ROOT__MEMORY_MAPS:
			case _1Package.DOCUMENT_ROOT__MODEL:
			case _1Package.DOCUMENT_ROOT__MONITOR_INTERCONNECTION:
			case _1Package.DOCUMENT_ROOT__REGISTER_FILE:
			case _1Package.DOCUMENT_ROOT__REMAP_STATES:
			case _1Package.DOCUMENT_ROOT__BUS_DEFINITION:
			case _1Package.DOCUMENT_ROOT__COMPONENT:
			case _1Package.DOCUMENT_ROOT__DESIGN:
			case _1Package.DOCUMENT_ROOT__DESIGN_CONFIGURATION:
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
				(_1Package.eINSTANCE.getDocumentRoot_AbstractionDefinition(),
				 _1Factory.eINSTANCE.createAbstractionDefinitionType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_AbstractorGenerator(),
				 _1Factory.eINSTANCE.createInstanceGeneratorType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_AbstractorGenerators(),
				 _1Factory.eINSTANCE.createAbstractorGeneratorsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_CellSpecification(),
				 _1Factory.eINSTANCE.createCellSpecificationType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Choices(),
				 _1Factory.eINSTANCE.createChoicesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ClockDriver(),
				 _1Factory.eINSTANCE.createClockDriverType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ComponentGenerator(),
				 _1Factory.eINSTANCE.createComponentGeneratorType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ComponentGenerators(),
				 _1Factory.eINSTANCE.createComponentGeneratorsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ConstraintSet(),
				 _1Factory.eINSTANCE.createConstraintSetType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ConstraintSets(),
				 _1Factory.eINSTANCE.createConstraintSetsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_DefaultValue(),
				 _1Factory.eINSTANCE.createDefaultValueType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_DriveConstraint(),
				 _1Factory.eINSTANCE.createDriveConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Driver(),
				 _1Factory.eINSTANCE.createDriverType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ExecutableImage(),
				 _1Factory.eINSTANCE.createExecutableImageType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_File(),
				 _1Factory.eINSTANCE.createFileType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_FileSet(),
				 _1Factory.eINSTANCE.createFileSetType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_FileSetRef(),
				 _1Factory.eINSTANCE.createFileSetRefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_FileSets(),
				 _1Factory.eINSTANCE.createFileSetsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Generator(),
				 _1Factory.eINSTANCE.createGeneratorType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_GeneratorChain(),
				 _1Factory.eINSTANCE.createGeneratorChainType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_GroupSelector(),
				 _1Factory.eINSTANCE.createGroupSelectorType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_LoadConstraint(),
				 _1Factory.eINSTANCE.createLoadConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_OtherClockDriver(),
				 _1Factory.eINSTANCE.createOtherClockDriverType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Parameter(),
				 _1Factory.eINSTANCE.createNameValuePairType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Parameter(),
				 _1Factory.eINSTANCE.createNameValueTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Parameters(),
				 _1Factory.eINSTANCE.createParametersType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Phase(),
				 _1Factory.eINSTANCE.createPhaseType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Port(),
				 _1Factory.eINSTANCE.createPortType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Port(),
				 _1Factory.eINSTANCE.createAbstractorPortType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_RequiresDriver(),
				 _1Factory.eINSTANCE.createRequiresDriverType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ServiceTypeDef(),
				 _1Factory.eINSTANCE.createServiceTypeDefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ServiceTypeDefs(),
				 _1Factory.eINSTANCE.createServiceTypeDefsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_SingleShotDriver(),
				 _1Factory.eINSTANCE.createSingleShotDriverType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_TimingConstraint(),
				 _1Factory.eINSTANCE.createTimingConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_TransTypeDef(),
				 _1Factory.eINSTANCE.createTransTypeDefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Vector(),
				 _1Factory.eINSTANCE.createVectorType2()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_VendorExtensions(),
				 _1Factory.eINSTANCE.createVendorExtensionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_WireTypeDef(),
				 _1Factory.eINSTANCE.createWireTypeDefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_WireTypeDefs(),
				 _1Factory.eINSTANCE.createWireTypeDefsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Abstractor(),
				 _1Factory.eINSTANCE.createAbstractorType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_AddressBlock(),
				 _1Factory.eINSTANCE.createAddressBlockType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_AddressSpaceRef(),
				 _1Factory.eINSTANCE.createAddrSpaceRefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_AddressSpaces(),
				 _1Factory.eINSTANCE.createAddressSpacesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_AdHocConnection(),
				 _1Factory.eINSTANCE.createAdHocConnectionType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_AdHocConnections(),
				 _1Factory.eINSTANCE.createAdHocConnectionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Bank(),
				 _1Factory.eINSTANCE.createAddressBankType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_BaseAddress(),
				 _1Factory.eINSTANCE.createBaseAddressType1()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_BusInterface(),
				 _1Factory.eINSTANCE.createBusInterfaceType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_BusInterfaces(),
				 _1Factory.eINSTANCE.createBusInterfacesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Channels(),
				 _1Factory.eINSTANCE.createChannelsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ComponentInstance(),
				 _1Factory.eINSTANCE.createComponentInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ComponentInstances(),
				 _1Factory.eINSTANCE.createComponentInstancesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ConfigurableElementValue(),
				 _1Factory.eINSTANCE.createConfigurableElementValueType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_ConfigurableElementValues(),
				 _1Factory.eINSTANCE.createConfigurableElementValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_EnumeratedValues(),
				 _1Factory.eINSTANCE.createEnumeratedValuesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Interconnection(),
				 _1Factory.eINSTANCE.createInterconnectionType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Interconnections(),
				 _1Factory.eINSTANCE.createInterconnectionsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_MemoryMapRef(),
				 _1Factory.eINSTANCE.createMemoryMapRefType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_MemoryMaps(),
				 _1Factory.eINSTANCE.createMemoryMapsType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Model(),
				 _1Factory.eINSTANCE.createModelType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_MonitorInterconnection(),
				 _1Factory.eINSTANCE.createMonitorInterconnectionType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_RegisterFile(),
				 _1Factory.eINSTANCE.createRegisterFileType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_RemapStates(),
				 _1Factory.eINSTANCE.createRemapStatesType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_BusDefinition(),
				 _1Factory.eINSTANCE.createBusDefinitionType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Component(),
				 _1Factory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_Design(),
				 _1Factory.eINSTANCE.createDesignType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getDocumentRoot_DesignConfiguration(),
				 _1Factory.eINSTANCE.createDesignConfigurationType()));
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
