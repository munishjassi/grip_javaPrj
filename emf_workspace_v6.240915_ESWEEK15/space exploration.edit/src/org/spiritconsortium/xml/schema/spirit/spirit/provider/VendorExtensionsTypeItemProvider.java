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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.spiritconsortium.xml.schema.spirit.spirit.InitiativeType;
import org.spiritconsortium.xml.schema.spirit.spirit.PortAccessTypeType;
import org.spiritconsortium.xml.schema.spirit.spirit.PresenceType;
import org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VendorExtensionsTypeItemProvider
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
	public VendorExtensionsTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(_1Package.eINSTANCE.getVendorExtensionsType_Any());
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
	 * This returns VendorExtensionsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VendorExtensionsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_VendorExtensionsType_type");
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

		switch (notification.getFeatureID(VendorExtensionsType.class)) {
			case _1Package.VENDOR_EXTENSIONS_TYPE__ANY:
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
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AbstractionDefinition(),
					 _1Factory.eINSTANCE.createAbstractionDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AbstractorGenerator(),
					 _1Factory.eINSTANCE.createInstanceGeneratorType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AbstractorGenerators(),
					 _1Factory.eINSTANCE.createAbstractorGeneratorsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_CellSpecification(),
					 _1Factory.eINSTANCE.createCellSpecificationType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Choices(),
					 _1Factory.eINSTANCE.createChoicesType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ClockDriver(),
					 _1Factory.eINSTANCE.createClockDriverType1())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ComponentGenerator(),
					 _1Factory.eINSTANCE.createComponentGeneratorType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ComponentGenerators(),
					 _1Factory.eINSTANCE.createComponentGeneratorsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ConstraintSet(),
					 _1Factory.eINSTANCE.createConstraintSetType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ConstraintSetRef(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ConstraintSets(),
					 _1Factory.eINSTANCE.createConstraintSetsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_DefaultValue(),
					 _1Factory.eINSTANCE.createDefaultValueType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Dependency(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Description(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_DisplayName(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_DriveConstraint(),
					 _1Factory.eINSTANCE.createDriveConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Driver(),
					 _1Factory.eINSTANCE.createDriverType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ExecutableImage(),
					 _1Factory.eINSTANCE.createExecutableImageType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_File(),
					 _1Factory.eINSTANCE.createFileType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_FileSet(),
					 _1Factory.eINSTANCE.createFileSetType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_FileSetRef(),
					 _1Factory.eINSTANCE.createFileSetRefType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_FileSets(),
					 _1Factory.eINSTANCE.createFileSetsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Generator(),
					 _1Factory.eINSTANCE.createGeneratorType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_GeneratorChain(),
					 _1Factory.eINSTANCE.createGeneratorChainType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_GeneratorRef(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_GroupSelector(),
					 _1Factory.eINSTANCE.createGroupSelectorType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Initiative(),
					 InitiativeType.REQUIRES_LITERAL)));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_LoadConstraint(),
					 _1Factory.eINSTANCE.createLoadConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_OtherClockDriver(),
					 _1Factory.eINSTANCE.createOtherClockDriverType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Parameter(),
					 _1Factory.eINSTANCE.createNameValuePairType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Parameter(),
					 _1Factory.eINSTANCE.createNameValueTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Parameters(),
					 _1Factory.eINSTANCE.createParametersType1())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Phase(),
					 _1Factory.eINSTANCE.createPhaseType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Port(),
					 _1Factory.eINSTANCE.createPortType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Port(),
					 _1Factory.eINSTANCE.createAbstractorPortType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_PortAccessHandle(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_PortAccessType(),
					 PortAccessTypeType.REF_LITERAL)));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Presence(),
					 PresenceType.OPTIONAL_LITERAL)));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_RequiresDriver(),
					 _1Factory.eINSTANCE.createRequiresDriverType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ServiceTypeDef(),
					 _1Factory.eINSTANCE.createServiceTypeDefType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ServiceTypeDefs(),
					 _1Factory.eINSTANCE.createServiceTypeDefsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_SingleShotDriver(),
					 _1Factory.eINSTANCE.createSingleShotDriverType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_TimingConstraint(),
					 _1Factory.eINSTANCE.createTimingConstraintType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_TransTypeDef(),
					 _1Factory.eINSTANCE.createTransTypeDefType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Vector(),
					 _1Factory.eINSTANCE.createVectorType2())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_VendorExtensions(),
					 _1Factory.eINSTANCE.createVendorExtensionsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_WireTypeDef(),
					 _1Factory.eINSTANCE.createWireTypeDefType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_WireTypeDefs(),
					 _1Factory.eINSTANCE.createWireTypeDefsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Abstractor(),
					 _1Factory.eINSTANCE.createAbstractorType1())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Access(),
					 _1Factory.eINSTANCE.createFromString(_1Package.eINSTANCE.getAccessType1(), null)))); // TODO: ensure this is a valid literal value

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AddressBlock(),
					 _1Factory.eINSTANCE.createAddressBlockType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AddressSpaceRef(),
					 _1Factory.eINSTANCE.createAddrSpaceRefType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AddressSpaces(),
					 _1Factory.eINSTANCE.createAddressSpacesType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AddressUnitBits(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AdHocConnection(),
					 _1Factory.eINSTANCE.createAdHocConnectionType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_AdHocConnections(),
					 _1Factory.eINSTANCE.createAdHocConnectionsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Bank(),
					 _1Factory.eINSTANCE.createAddressBankType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_BaseAddress(),
					 _1Factory.eINSTANCE.createBaseAddressType1())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_BitsInLau(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.POSITIVE_INTEGER, "0"))));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_BusInterface(),
					 _1Factory.eINSTANCE.createBusInterfaceType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_BusInterfaces(),
					 _1Factory.eINSTANCE.createBusInterfacesType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Channels(),
					 _1Factory.eINSTANCE.createChannelsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ComponentInstance(),
					 _1Factory.eINSTANCE.createComponentInstanceType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ComponentInstances(),
					 _1Factory.eINSTANCE.createComponentInstancesType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ConfigurableElementValue(),
					 _1Factory.eINSTANCE.createConfigurableElementValueType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_ConfigurableElementValues(),
					 _1Factory.eINSTANCE.createConfigurableElementValuesType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_EnumeratedValues(),
					 _1Factory.eINSTANCE.createEnumeratedValuesType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Group(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_InstanceName(),
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Interconnection(),
					 _1Factory.eINSTANCE.createInterconnectionType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Interconnections(),
					 _1Factory.eINSTANCE.createInterconnectionsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_MemoryMapRef(),
					 _1Factory.eINSTANCE.createMemoryMapRefType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_MemoryMaps(),
					 _1Factory.eINSTANCE.createMemoryMapsType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Model(),
					 _1Factory.eINSTANCE.createModelType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_MonitorInterconnection(),
					 _1Factory.eINSTANCE.createMonitorInterconnectionType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_RegisterFile(),
					 _1Factory.eINSTANCE.createRegisterFileType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_RemapStates(),
					 _1Factory.eINSTANCE.createRemapStatesType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Volatile(),
					 XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, "false"))));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_BusDefinition(),
					 _1Factory.eINSTANCE.createBusDefinitionType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Component(),
					 _1Factory.eINSTANCE.createComponentType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_Design(),
					 _1Factory.eINSTANCE.createDesignType())));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getVendorExtensionsType_Any(),
				 FeatureMapUtil.createEntry
					(_1Package.eINSTANCE.getDocumentRoot_DesignConfiguration(),
					 _1Factory.eINSTANCE.createDesignConfigurationType())));
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
