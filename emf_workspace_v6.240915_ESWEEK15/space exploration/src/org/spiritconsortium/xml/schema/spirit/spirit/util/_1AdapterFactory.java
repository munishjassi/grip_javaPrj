/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.spiritconsortium.xml.schema.spirit.spirit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package
 * @generated
 */
public class _1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _1Switch modelSwitch =
		new _1Switch() {
			public Object caseAbstractionDefinitionType(AbstractionDefinitionType object) {
				return createAbstractionDefinitionTypeAdapter();
			}
			public Object caseAbstractionDefPortConstraintsType(AbstractionDefPortConstraintsType object) {
				return createAbstractionDefPortConstraintsTypeAdapter();
			}
			public Object caseAbstractorBusInterfaceType(AbstractorBusInterfaceType object) {
				return createAbstractorBusInterfaceTypeAdapter();
			}
			public Object caseAbstractorGeneratorsType(AbstractorGeneratorsType object) {
				return createAbstractorGeneratorsTypeAdapter();
			}
			public Object caseAbstractorInterfacesType(AbstractorInterfacesType object) {
				return createAbstractorInterfacesTypeAdapter();
			}
			public Object caseAbstractorModelType(AbstractorModelType object) {
				return createAbstractorModelTypeAdapter();
			}
			public Object caseAbstractorModeType1(AbstractorModeType1 object) {
				return createAbstractorModeType1Adapter();
			}
			public Object caseAbstractorPortType(AbstractorPortType object) {
				return createAbstractorPortTypeAdapter();
			}
			public Object caseAbstractorPortWireType(AbstractorPortWireType object) {
				return createAbstractorPortWireTypeAdapter();
			}
			public Object caseAbstractorsType(AbstractorsType object) {
				return createAbstractorsTypeAdapter();
			}
			public Object caseAbstractorType(AbstractorType object) {
				return createAbstractorTypeAdapter();
			}
			public Object caseAbstractorType1(AbstractorType1 object) {
				return createAbstractorType1Adapter();
			}
			public Object caseAbstractorViewType(AbstractorViewType object) {
				return createAbstractorViewTypeAdapter();
			}
			public Object caseAddressBankType(AddressBankType object) {
				return createAddressBankTypeAdapter();
			}
			public Object caseAddressBlockType(AddressBlockType object) {
				return createAddressBlockTypeAdapter();
			}
			public Object caseAddressOffsetType(AddressOffsetType object) {
				return createAddressOffsetTypeAdapter();
			}
			public Object caseAddressSpaceRefType(AddressSpaceRefType object) {
				return createAddressSpaceRefTypeAdapter();
			}
			public Object caseAddressSpacesType(AddressSpacesType object) {
				return createAddressSpacesTypeAdapter();
			}
			public Object caseAddressSpaceType(AddressSpaceType object) {
				return createAddressSpaceTypeAdapter();
			}
			public Object caseAddrSpaceRefType(AddrSpaceRefType object) {
				return createAddrSpaceRefTypeAdapter();
			}
			public Object caseAdHocConnectionsType(AdHocConnectionsType object) {
				return createAdHocConnectionsTypeAdapter();
			}
			public Object caseAdHocConnectionType(AdHocConnectionType object) {
				return createAdHocConnectionTypeAdapter();
			}
			public Object caseAlternateGroupsType(AlternateGroupsType object) {
				return createAlternateGroupsTypeAdapter();
			}
			public Object caseAlternateRegistersType(AlternateRegistersType object) {
				return createAlternateRegistersTypeAdapter();
			}
			public Object caseAlternateRegisterType(AlternateRegisterType object) {
				return createAlternateRegisterTypeAdapter();
			}
			public Object caseArgumentType(ArgumentType object) {
				return createArgumentTypeAdapter();
			}
			public Object caseBankedBankType(BankedBankType object) {
				return createBankedBankTypeAdapter();
			}
			public Object caseBankedBlockType(BankedBlockType object) {
				return createBankedBlockTypeAdapter();
			}
			public Object caseBankedSubspaceType(BankedSubspaceType object) {
				return createBankedSubspaceTypeAdapter();
			}
			public Object caseBaseAddressesType(BaseAddressesType object) {
				return createBaseAddressesTypeAdapter();
			}
			public Object caseBaseAddressType(BaseAddressType object) {
				return createBaseAddressTypeAdapter();
			}
			public Object caseBaseAddressType1(BaseAddressType1 object) {
				return createBaseAddressType1Adapter();
			}
			public Object caseBitSteeringType1(BitSteeringType1 object) {
				return createBitSteeringType1Adapter();
			}
			public Object caseBitWidthType(BitWidthType object) {
				return createBitWidthTypeAdapter();
			}
			public Object caseBridgeType(BridgeType object) {
				return createBridgeTypeAdapter();
			}
			public Object caseBuildCommandType(BuildCommandType object) {
				return createBuildCommandTypeAdapter();
			}
			public Object caseBusDefinitionType(BusDefinitionType object) {
				return createBusDefinitionTypeAdapter();
			}
			public Object caseBusInterfacesType(BusInterfacesType object) {
				return createBusInterfacesTypeAdapter();
			}
			public Object caseBusInterfaceType(BusInterfaceType object) {
				return createBusInterfaceTypeAdapter();
			}
			public Object caseCellClassType(CellClassType object) {
				return createCellClassTypeAdapter();
			}
			public Object caseCellFunctionType(CellFunctionType object) {
				return createCellFunctionTypeAdapter();
			}
			public Object caseCellSpecificationType(CellSpecificationType object) {
				return createCellSpecificationTypeAdapter();
			}
			public Object caseChannelsType(ChannelsType object) {
				return createChannelsTypeAdapter();
			}
			public Object caseChannelType(ChannelType object) {
				return createChannelTypeAdapter();
			}
			public Object caseChoicesType(ChoicesType object) {
				return createChoicesTypeAdapter();
			}
			public Object caseChoiceType(ChoiceType object) {
				return createChoiceTypeAdapter();
			}
			public Object caseClockDriverType(ClockDriverType object) {
				return createClockDriverTypeAdapter();
			}
			public Object caseClockDriverType1(ClockDriverType1 object) {
				return createClockDriverType1Adapter();
			}
			public Object caseClockPeriodType(ClockPeriodType object) {
				return createClockPeriodTypeAdapter();
			}
			public Object caseClockPulseDurationType(ClockPulseDurationType object) {
				return createClockPulseDurationTypeAdapter();
			}
			public Object caseClockPulseOffsetType(ClockPulseOffsetType object) {
				return createClockPulseOffsetTypeAdapter();
			}
			public Object caseClockPulseValueType(ClockPulseValueType object) {
				return createClockPulseValueTypeAdapter();
			}
			public Object caseCommandLineSwitchType(CommandLineSwitchType object) {
				return createCommandLineSwitchTypeAdapter();
			}
			public Object caseCommandType(CommandType object) {
				return createCommandTypeAdapter();
			}
			public Object caseCommandType1(CommandType1 object) {
				return createCommandType1Adapter();
			}
			public Object caseCommandType2(CommandType2 object) {
				return createCommandType2Adapter();
			}
			public Object caseComponentGeneratorsType(ComponentGeneratorsType object) {
				return createComponentGeneratorsTypeAdapter();
			}
			public Object caseComponentGeneratorType(ComponentGeneratorType object) {
				return createComponentGeneratorTypeAdapter();
			}
			public Object caseComponentInstancesType(ComponentInstancesType object) {
				return createComponentInstancesTypeAdapter();
			}
			public Object caseComponentInstanceType(ComponentInstanceType object) {
				return createComponentInstanceTypeAdapter();
			}
			public Object caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			public Object caseConfigurableElementValuesType(ConfigurableElementValuesType object) {
				return createConfigurableElementValuesTypeAdapter();
			}
			public Object caseConfigurableElementValueType(ConfigurableElementValueType object) {
				return createConfigurableElementValueTypeAdapter();
			}
			public Object caseConnectionType(ConnectionType object) {
				return createConnectionTypeAdapter();
			}
			public Object caseConstraintSetsType(ConstraintSetsType object) {
				return createConstraintSetsTypeAdapter();
			}
			public Object caseConstraintSetType(ConstraintSetType object) {
				return createConstraintSetTypeAdapter();
			}
			public Object caseCpusType(CpusType object) {
				return createCpusTypeAdapter();
			}
			public Object caseCpuType(CpuType object) {
				return createCpuTypeAdapter();
			}
			public Object caseDefaultValueType(DefaultValueType object) {
				return createDefaultValueTypeAdapter();
			}
			public Object caseDesignConfigurationType(DesignConfigurationType object) {
				return createDesignConfigurationTypeAdapter();
			}
			public Object caseDesignType(DesignType object) {
				return createDesignTypeAdapter();
			}
			public Object caseDisabledType(DisabledType object) {
				return createDisabledTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseDriveConstraintType(DriveConstraintType object) {
				return createDriveConstraintTypeAdapter();
			}
			public Object caseDriverType(DriverType object) {
				return createDriverTypeAdapter();
			}
			public Object caseEnableType(EnableType object) {
				return createEnableTypeAdapter();
			}
			public Object caseEnumeratedValuesType(EnumeratedValuesType object) {
				return createEnumeratedValuesTypeAdapter();
			}
			public Object caseEnumeratedValueType(EnumeratedValueType object) {
				return createEnumeratedValueTypeAdapter();
			}
			public Object caseEnumerationType(EnumerationType object) {
				return createEnumerationTypeAdapter();
			}
			public Object caseExecutableImageType(ExecutableImageType object) {
				return createExecutableImageTypeAdapter();
			}
			public Object caseExternalPortReferenceType(ExternalPortReferenceType object) {
				return createExternalPortReferenceTypeAdapter();
			}
			public Object caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			public Object caseFileBuilderType(FileBuilderType object) {
				return createFileBuilderTypeAdapter();
			}
			public Object caseFileBuilderType1(FileBuilderType1 object) {
				return createFileBuilderType1Adapter();
			}
			public Object caseFileSetRefGroupType(FileSetRefGroupType object) {
				return createFileSetRefGroupTypeAdapter();
			}
			public Object caseFileSetRefGroupType1(FileSetRefGroupType1 object) {
				return createFileSetRefGroupType1Adapter();
			}
			public Object caseFileSetRefType(FileSetRefType object) {
				return createFileSetRefTypeAdapter();
			}
			public Object caseFileSetsType(FileSetsType object) {
				return createFileSetsTypeAdapter();
			}
			public Object caseFileSetType(FileSetType object) {
				return createFileSetTypeAdapter();
			}
			public Object caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			public Object caseFlagsType(FlagsType object) {
				return createFlagsTypeAdapter();
			}
			public Object caseFlagsType1(FlagsType1 object) {
				return createFlagsType1Adapter();
			}
			public Object caseFlagsType2(FlagsType2 object) {
				return createFlagsType2Adapter();
			}
			public Object caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			public Object caseGeneratorChainConfigurationType(GeneratorChainConfigurationType object) {
				return createGeneratorChainConfigurationTypeAdapter();
			}
			public Object caseGeneratorChainSelectorType(GeneratorChainSelectorType object) {
				return createGeneratorChainSelectorTypeAdapter();
			}
			public Object caseGeneratorChainType(GeneratorChainType object) {
				return createGeneratorChainTypeAdapter();
			}
			public Object caseGeneratorSelectorType(GeneratorSelectorType object) {
				return createGeneratorSelectorTypeAdapter();
			}
			public Object caseGeneratorType(GeneratorType object) {
				return createGeneratorTypeAdapter();
			}
			public Object caseGeneratorType1(GeneratorType1 object) {
				return createGeneratorType1Adapter();
			}
			public Object caseGroupSelectorType(GroupSelectorType object) {
				return createGroupSelectorTypeAdapter();
			}
			public Object caseHierConnectionsType(HierConnectionsType object) {
				return createHierConnectionsTypeAdapter();
			}
			public Object caseHierConnectionType(HierConnectionType object) {
				return createHierConnectionTypeAdapter();
			}
			public Object caseHierInterface(HierInterface object) {
				return createHierInterfaceAdapter();
			}
			public Object caseInstanceGeneratorType(InstanceGeneratorType object) {
				return createInstanceGeneratorTypeAdapter();
			}
			public Object caseInterconnectionConfigurationType(InterconnectionConfigurationType object) {
				return createInterconnectionConfigurationTypeAdapter();
			}
			public Object caseInterconnectionsType(InterconnectionsType object) {
				return createInterconnectionsTypeAdapter();
			}
			public Object caseInterconnectionType(InterconnectionType object) {
				return createInterconnectionTypeAdapter();
			}
			public Object caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			public Object caseInternalPortReferenceType(InternalPortReferenceType object) {
				return createInternalPortReferenceTypeAdapter();
			}
			public Object caseIsIncludeFileType(IsIncludeFileType object) {
				return createIsIncludeFileTypeAdapter();
			}
			public Object caseLanguageToolsType(LanguageToolsType object) {
				return createLanguageToolsTypeAdapter();
			}
			public Object caseLanguageType(LanguageType object) {
				return createLanguageTypeAdapter();
			}
			public Object caseLanguageType1(LanguageType1 object) {
				return createLanguageType1Adapter();
			}
			public Object caseLeftType(LeftType object) {
				return createLeftTypeAdapter();
			}
			public Object caseLeftType1(LeftType1 object) {
				return createLeftType1Adapter();
			}
			public Object caseLeftType2(LeftType2 object) {
				return createLeftType2Adapter();
			}
			public Object caseLeftType11(LeftType11 object) {
				return createLeftType11Adapter();
			}
			public Object caseLibraryRefType(LibraryRefType object) {
				return createLibraryRefTypeAdapter();
			}
			public Object caseLinkerCommandFileType(LinkerCommandFileType object) {
				return createLinkerCommandFileTypeAdapter();
			}
			public Object caseLinkerFlagsType(LinkerFlagsType object) {
				return createLinkerFlagsTypeAdapter();
			}
			public Object caseLinkerType(LinkerType object) {
				return createLinkerTypeAdapter();
			}
			public Object caseLoadConstraintType(LoadConstraintType object) {
				return createLoadConstraintTypeAdapter();
			}
			public Object caseLocalMemoryMapType(LocalMemoryMapType object) {
				return createLocalMemoryMapTypeAdapter();
			}
			public Object caseLogicalNameType(LogicalNameType object) {
				return createLogicalNameTypeAdapter();
			}
			public Object caseLogicalPortType(LogicalPortType object) {
				return createLogicalPortTypeAdapter();
			}
			public Object caseLogicalPortType1(LogicalPortType1 object) {
				return createLogicalPortType1Adapter();
			}
			public Object caseMaskType(MaskType object) {
				return createMaskTypeAdapter();
			}
			public Object caseMaskType1(MaskType1 object) {
				return createMaskType1Adapter();
			}
			public Object caseMasterType(MasterType object) {
				return createMasterTypeAdapter();
			}
			public Object caseMaximumType(MaximumType object) {
				return createMaximumTypeAdapter();
			}
			public Object caseMemoryMapRefType(MemoryMapRefType object) {
				return createMemoryMapRefTypeAdapter();
			}
			public Object caseMemoryMapsType(MemoryMapsType object) {
				return createMemoryMapsTypeAdapter();
			}
			public Object caseMemoryMapType(MemoryMapType object) {
				return createMemoryMapTypeAdapter();
			}
			public Object caseMemoryRemapType(MemoryRemapType object) {
				return createMemoryRemapTypeAdapter();
			}
			public Object caseMinimumType(MinimumType object) {
				return createMinimumTypeAdapter();
			}
			public Object caseMirroredMasterType(MirroredMasterType object) {
				return createMirroredMasterTypeAdapter();
			}
			public Object caseMirroredSlaveType(MirroredSlaveType object) {
				return createMirroredSlaveTypeAdapter();
			}
			public Object caseMirroredSystemType(MirroredSystemType object) {
				return createMirroredSystemTypeAdapter();
			}
			public Object caseModelParametersType(ModelParametersType object) {
				return createModelParametersTypeAdapter();
			}
			public Object caseModelParametersType1(ModelParametersType1 object) {
				return createModelParametersType1Adapter();
			}
			public Object caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			public Object caseMonitorInterconnectionType(MonitorInterconnectionType object) {
				return createMonitorInterconnectionTypeAdapter();
			}
			public Object caseMonitorType(MonitorType object) {
				return createMonitorTypeAdapter();
			}
			public Object caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			public Object caseNameType1(NameType1 object) {
				return createNameType1Adapter();
			}
			public Object caseNameType2(NameType2 object) {
				return createNameType2Adapter();
			}
			public Object caseNameValuePairType(NameValuePairType object) {
				return createNameValuePairTypeAdapter();
			}
			public Object caseNameValueTypeType(NameValueTypeType object) {
				return createNameValueTypeTypeAdapter();
			}
			public Object caseOnMasterType(OnMasterType object) {
				return createOnMasterTypeAdapter();
			}
			public Object caseOnMasterType1(OnMasterType1 object) {
				return createOnMasterType1Adapter();
			}
			public Object caseOnSlaveType(OnSlaveType object) {
				return createOnSlaveTypeAdapter();
			}
			public Object caseOnSlaveType1(OnSlaveType1 object) {
				return createOnSlaveType1Adapter();
			}
			public Object caseOnSystemType(OnSystemType object) {
				return createOnSystemTypeAdapter();
			}
			public Object caseOnSystemType1(OnSystemType1 object) {
				return createOnSystemType1Adapter();
			}
			public Object caseOtherClockDriverType(OtherClockDriverType object) {
				return createOtherClockDriverTypeAdapter();
			}
			public Object caseOtherClocks(OtherClocks object) {
				return createOtherClocksAdapter();
			}
			public Object caseParametersType(ParametersType object) {
				return createParametersTypeAdapter();
			}
			public Object caseParametersType1(ParametersType1 object) {
				return createParametersType1Adapter();
			}
			public Object casePhaseType(PhaseType object) {
				return createPhaseTypeAdapter();
			}
			public Object casePhysicalPortType(PhysicalPortType object) {
				return createPhysicalPortTypeAdapter();
			}
			public Object casePhysicalPortType1(PhysicalPortType1 object) {
				return createPhysicalPortType1Adapter();
			}
			public Object casePortAccessType(PortAccessType object) {
				return createPortAccessTypeAdapter();
			}
			public Object casePortDeclarationType(PortDeclarationType object) {
				return createPortDeclarationTypeAdapter();
			}
			public Object casePortMapsType(PortMapsType object) {
				return createPortMapsTypeAdapter();
			}
			public Object casePortMapsType1(PortMapsType1 object) {
				return createPortMapsType1Adapter();
			}
			public Object casePortMapType(PortMapType object) {
				return createPortMapTypeAdapter();
			}
			public Object casePortMapType1(PortMapType1 object) {
				return createPortMapType1Adapter();
			}
			public Object casePortsType(PortsType object) {
				return createPortsTypeAdapter();
			}
			public Object casePortsType1(PortsType1 object) {
				return createPortsType1Adapter();
			}
			public Object casePortsType2(PortsType2 object) {
				return createPortsType2Adapter();
			}
			public Object casePortTransactionalType(PortTransactionalType object) {
				return createPortTransactionalTypeAdapter();
			}
			public Object casePortType(PortType object) {
				return createPortTypeAdapter();
			}
			public Object casePortType1(PortType1 object) {
				return createPortType1Adapter();
			}
			public Object casePortWireType(PortWireType object) {
				return createPortWireTypeAdapter();
			}
			public Object caseQualifierType(QualifierType object) {
				return createQualifierTypeAdapter();
			}
			public Object caseQualifierType1(QualifierType1 object) {
				return createQualifierType1Adapter();
			}
			public Object caseRangeType(RangeType object) {
				return createRangeTypeAdapter();
			}
			public Object caseRangeType1(RangeType1 object) {
				return createRangeType1Adapter();
			}
			public Object caseRangeType2(RangeType2 object) {
				return createRangeType2Adapter();
			}
			public Object caseRangeType3(RangeType3 object) {
				return createRangeType3Adapter();
			}
			public Object caseRegisterFileType(RegisterFileType object) {
				return createRegisterFileTypeAdapter();
			}
			public Object caseRegisterType(RegisterType object) {
				return createRegisterTypeAdapter();
			}
			public Object caseRemapAddressType(RemapAddressType object) {
				return createRemapAddressTypeAdapter();
			}
			public Object caseRemapPortsType(RemapPortsType object) {
				return createRemapPortsTypeAdapter();
			}
			public Object caseRemapPortType(RemapPortType object) {
				return createRemapPortTypeAdapter();
			}
			public Object caseRemapStatesType(RemapStatesType object) {
				return createRemapStatesTypeAdapter();
			}
			public Object caseRemapStateType(RemapStateType object) {
				return createRemapStateTypeAdapter();
			}
			public Object caseReplaceDefaultFlagsType(ReplaceDefaultFlagsType object) {
				return createReplaceDefaultFlagsTypeAdapter();
			}
			public Object caseReplaceDefaultFlagsType1(ReplaceDefaultFlagsType1 object) {
				return createReplaceDefaultFlagsType1Adapter();
			}
			public Object caseReplaceDefaultFlagsType2(ReplaceDefaultFlagsType2 object) {
				return createReplaceDefaultFlagsType2Adapter();
			}
			public Object caseRequiresDriverType(RequiresDriverType object) {
				return createRequiresDriverTypeAdapter();
			}
			public Object caseResetType(ResetType object) {
				return createResetTypeAdapter();
			}
			public Object caseResetType1(ResetType1 object) {
				return createResetType1Adapter();
			}
			public Object caseResolvedLibraryRefType(ResolvedLibraryRefType object) {
				return createResolvedLibraryRefTypeAdapter();
			}
			public Object caseRightType(RightType object) {
				return createRightTypeAdapter();
			}
			public Object caseRightType1(RightType1 object) {
				return createRightType1Adapter();
			}
			public Object caseRightType2(RightType2 object) {
				return createRightType2Adapter();
			}
			public Object caseRightType11(RightType11 object) {
				return createRightType11Adapter();
			}
			public Object caseSegmentsType(SegmentsType object) {
				return createSegmentsTypeAdapter();
			}
			public Object caseSegmentType(SegmentType object) {
				return createSegmentTypeAdapter();
			}
			public Object caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			public Object caseServiceType1(ServiceType1 object) {
				return createServiceType1Adapter();
			}
			public Object caseServiceTypeDefsType(ServiceTypeDefsType object) {
				return createServiceTypeDefsTypeAdapter();
			}
			public Object caseServiceTypeDefType(ServiceTypeDefType object) {
				return createServiceTypeDefTypeAdapter();
			}
			public Object caseSingleShotDriverType(SingleShotDriverType object) {
				return createSingleShotDriverTypeAdapter();
			}
			public Object caseSingleShotDurationType(SingleShotDurationType object) {
				return createSingleShotDurationTypeAdapter();
			}
			public Object caseSingleShotOffsetType(SingleShotOffsetType object) {
				return createSingleShotOffsetTypeAdapter();
			}
			public Object caseSingleShotValueType(SingleShotValueType object) {
				return createSingleShotValueTypeAdapter();
			}
			public Object caseSizeType(SizeType object) {
				return createSizeTypeAdapter();
			}
			public Object caseSlaveType(SlaveType object) {
				return createSlaveTypeAdapter();
			}
			public Object caseSourceFileType(SourceFileType object) {
				return createSourceFileTypeAdapter();
			}
			public Object caseSourceNameType(SourceNameType object) {
				return createSourceNameTypeAdapter();
			}
			public Object caseSubspaceRefType(SubspaceRefType object) {
				return createSubspaceRefTypeAdapter();
			}
			public Object caseSystemGroupNamesType(SystemGroupNamesType object) {
				return createSystemGroupNamesTypeAdapter();
			}
			public Object caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			public Object caseTargetNameType(TargetNameType object) {
				return createTargetNameTypeAdapter();
			}
			public Object caseTestableType(TestableType object) {
				return createTestableTypeAdapter();
			}
			public Object caseTimingConstraintType(TimingConstraintType object) {
				return createTimingConstraintTypeAdapter();
			}
			public Object caseTransactionalType(TransactionalType object) {
				return createTransactionalTypeAdapter();
			}
			public Object caseTransportMethodsType(TransportMethodsType object) {
				return createTransportMethodsTypeAdapter();
			}
			public Object caseTransTypeDefType(TransTypeDefType object) {
				return createTransTypeDefTypeAdapter();
			}
			public Object caseTypeNameType(TypeNameType object) {
				return createTypeNameTypeAdapter();
			}
			public Object caseTypeNameType1(TypeNameType1 object) {
				return createTypeNameType1Adapter();
			}
			public Object caseTypeNameType2(TypeNameType2 object) {
				return createTypeNameType2Adapter();
			}
			public Object caseTypeNameType3(TypeNameType3 object) {
				return createTypeNameType3Adapter();
			}
			public Object caseValueMaskConfigType(ValueMaskConfigType object) {
				return createValueMaskConfigTypeAdapter();
			}
			public Object caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			public Object caseValueType1(ValueType1 object) {
				return createValueType1Adapter();
			}
			public Object caseValueType2(ValueType2 object) {
				return createValueType2Adapter();
			}
			public Object caseVectorType(VectorType object) {
				return createVectorTypeAdapter();
			}
			public Object caseVectorType1(VectorType1 object) {
				return createVectorType1Adapter();
			}
			public Object caseVectorType2(VectorType2 object) {
				return createVectorType2Adapter();
			}
			public Object caseVectorType11(VectorType11 object) {
				return createVectorType11Adapter();
			}
			public Object caseVendorExtensionsType(VendorExtensionsType object) {
				return createVendorExtensionsTypeAdapter();
			}
			public Object caseViewConfigurationType(ViewConfigurationType object) {
				return createViewConfigurationTypeAdapter();
			}
			public Object caseViewsType(ViewsType object) {
				return createViewsTypeAdapter();
			}
			public Object caseViewsType1(ViewsType1 object) {
				return createViewsType1Adapter();
			}
			public Object caseViewType(ViewType object) {
				return createViewTypeAdapter();
			}
			public Object caseWhiteboxElementRefsType(WhiteboxElementRefsType object) {
				return createWhiteboxElementRefsTypeAdapter();
			}
			public Object caseWhiteboxElementRefType(WhiteboxElementRefType object) {
				return createWhiteboxElementRefTypeAdapter();
			}
			public Object caseWhiteboxElementsType(WhiteboxElementsType object) {
				return createWhiteboxElementsTypeAdapter();
			}
			public Object caseWhiteboxElementType(WhiteboxElementType object) {
				return createWhiteboxElementTypeAdapter();
			}
			public Object caseWhiteboxPathType(WhiteboxPathType object) {
				return createWhiteboxPathTypeAdapter();
			}
			public Object caseWidthType(WidthType object) {
				return createWidthTypeAdapter();
			}
			public Object caseWireType(WireType object) {
				return createWireTypeAdapter();
			}
			public Object caseWireTypeDefsType(WireTypeDefsType object) {
				return createWireTypeDefsTypeAdapter();
			}
			public Object caseWireTypeDefType(WireTypeDefType object) {
				return createWireTypeDefTypeAdapter();
			}
			public Object caseWriteValueConstraintType(WriteValueConstraintType object) {
				return createWriteValueConstraintTypeAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefinitionType <em>Abstraction Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefinitionType
	 * @generated
	 */
	public Adapter createAbstractionDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefPortConstraintsType <em>Abstraction Def Port Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefPortConstraintsType
	 * @generated
	 */
	public Adapter createAbstractionDefPortConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorBusInterfaceType <em>Abstractor Bus Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorBusInterfaceType
	 * @generated
	 */
	public Adapter createAbstractorBusInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType <em>Abstractor Generators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType
	 * @generated
	 */
	public Adapter createAbstractorGeneratorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorInterfacesType <em>Abstractor Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorInterfacesType
	 * @generated
	 */
	public Adapter createAbstractorInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModelType <em>Abstractor Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModelType
	 * @generated
	 */
	public Adapter createAbstractorModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModeType1 <em>Abstractor Mode Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorModeType1
	 * @generated
	 */
	public Adapter createAbstractorModeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortType <em>Abstractor Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortType
	 * @generated
	 */
	public Adapter createAbstractorPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortWireType <em>Abstractor Port Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorPortWireType
	 * @generated
	 */
	public Adapter createAbstractorPortWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorsType <em>Abstractors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorsType
	 * @generated
	 */
	public Adapter createAbstractorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType <em>Abstractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType
	 * @generated
	 */
	public Adapter createAbstractorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1 <em>Abstractor Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1
	 * @generated
	 */
	public Adapter createAbstractorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType <em>Abstractor View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AbstractorViewType
	 * @generated
	 */
	public Adapter createAbstractorViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType <em>Address Bank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType
	 * @generated
	 */
	public Adapter createAddressBankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType <em>Address Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType
	 * @generated
	 */
	public Adapter createAddressBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressOffsetType <em>Address Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressOffsetType
	 * @generated
	 */
	public Adapter createAddressOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceRefType <em>Address Space Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceRefType
	 * @generated
	 */
	public Adapter createAddressSpaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressSpacesType <em>Address Spaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressSpacesType
	 * @generated
	 */
	public Adapter createAddressSpacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceType <em>Address Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddressSpaceType
	 * @generated
	 */
	public Adapter createAddressSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AddrSpaceRefType <em>Addr Space Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AddrSpaceRefType
	 * @generated
	 */
	public Adapter createAddrSpaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType <em>Ad Hoc Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType
	 * @generated
	 */
	public Adapter createAdHocConnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType <em>Ad Hoc Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType
	 * @generated
	 */
	public Adapter createAdHocConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateGroupsType <em>Alternate Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AlternateGroupsType
	 * @generated
	 */
	public Adapter createAlternateGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegistersType <em>Alternate Registers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegistersType
	 * @generated
	 */
	public Adapter createAlternateRegistersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegisterType <em>Alternate Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.AlternateRegisterType
	 * @generated
	 */
	public Adapter createAlternateRegisterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ArgumentType <em>Argument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ArgumentType
	 * @generated
	 */
	public Adapter createArgumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BankedBankType <em>Banked Bank Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankedBankType
	 * @generated
	 */
	public Adapter createBankedBankTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BankedBlockType <em>Banked Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankedBlockType
	 * @generated
	 */
	public Adapter createBankedBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BankedSubspaceType <em>Banked Subspace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BankedSubspaceType
	 * @generated
	 */
	public Adapter createBankedSubspaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressesType <em>Base Addresses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressesType
	 * @generated
	 */
	public Adapter createBaseAddressesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType <em>Base Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType
	 * @generated
	 */
	public Adapter createBaseAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType1 <em>Base Address Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType1
	 * @generated
	 */
	public Adapter createBaseAddressType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BitSteeringType1 <em>Bit Steering Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BitSteeringType1
	 * @generated
	 */
	public Adapter createBitSteeringType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BitWidthType <em>Bit Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BitWidthType
	 * @generated
	 */
	public Adapter createBitWidthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BridgeType <em>Bridge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BridgeType
	 * @generated
	 */
	public Adapter createBridgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BuildCommandType <em>Build Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BuildCommandType
	 * @generated
	 */
	public Adapter createBuildCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType <em>Bus Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType
	 * @generated
	 */
	public Adapter createBusDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BusInterfacesType <em>Bus Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BusInterfacesType
	 * @generated
	 */
	public Adapter createBusInterfacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType <em>Bus Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType
	 * @generated
	 */
	public Adapter createBusInterfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellClassType <em>Cell Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellClassType
	 * @generated
	 */
	public Adapter createCellClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType <em>Cell Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType
	 * @generated
	 */
	public Adapter createCellFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellSpecificationType <em>Cell Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellSpecificationType
	 * @generated
	 */
	public Adapter createCellSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChannelsType <em>Channels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChannelsType
	 * @generated
	 */
	public Adapter createChannelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChannelType <em>Channel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChannelType
	 * @generated
	 */
	public Adapter createChannelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChoicesType <em>Choices Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChoicesType
	 * @generated
	 */
	public Adapter createChoicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ChoiceType <em>Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ChoiceType
	 * @generated
	 */
	public Adapter createChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType <em>Clock Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType
	 * @generated
	 */
	public Adapter createClockDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType1 <em>Clock Driver Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType1
	 * @generated
	 */
	public Adapter createClockDriverType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPeriodType <em>Clock Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPeriodType
	 * @generated
	 */
	public Adapter createClockPeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseDurationType <em>Clock Pulse Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseDurationType
	 * @generated
	 */
	public Adapter createClockPulseDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseOffsetType <em>Clock Pulse Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseOffsetType
	 * @generated
	 */
	public Adapter createClockPulseOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseValueType <em>Clock Pulse Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ClockPulseValueType
	 * @generated
	 */
	public Adapter createClockPulseValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandLineSwitchType <em>Command Line Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandLineSwitchType
	 * @generated
	 */
	public Adapter createCommandLineSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandType
	 * @generated
	 */
	public Adapter createCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandType1 <em>Command Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandType1
	 * @generated
	 */
	public Adapter createCommandType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CommandType2 <em>Command Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CommandType2
	 * @generated
	 */
	public Adapter createCommandType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorsType <em>Component Generators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorsType
	 * @generated
	 */
	public Adapter createComponentGeneratorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType <em>Component Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType
	 * @generated
	 */
	public Adapter createComponentGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType <em>Component Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType
	 * @generated
	 */
	public Adapter createComponentInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType <em>Component Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType
	 * @generated
	 */
	public Adapter createComponentInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValuesType <em>Configurable Element Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValuesType
	 * @generated
	 */
	public Adapter createConfigurableElementValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValueType <em>Configurable Element Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValueType
	 * @generated
	 */
	public Adapter createConfigurableElementValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConnectionType
	 * @generated
	 */
	public Adapter createConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType <em>Constraint Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType
	 * @generated
	 */
	public Adapter createConstraintSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType <em>Constraint Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType
	 * @generated
	 */
	public Adapter createConstraintSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CpusType <em>Cpus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CpusType
	 * @generated
	 */
	public Adapter createCpusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.CpuType <em>Cpu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CpuType
	 * @generated
	 */
	public Adapter createCpuTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DefaultValueType <em>Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DefaultValueType
	 * @generated
	 */
	public Adapter createDefaultValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DesignConfigurationType <em>Design Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DesignConfigurationType
	 * @generated
	 */
	public Adapter createDesignConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DesignType <em>Design Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DesignType
	 * @generated
	 */
	public Adapter createDesignTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DisabledType <em>Disabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DisabledType
	 * @generated
	 */
	public Adapter createDisabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DriveConstraintType <em>Drive Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DriveConstraintType
	 * @generated
	 */
	public Adapter createDriveConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.DriverType <em>Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DriverType
	 * @generated
	 */
	public Adapter createDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnableType <em>Enable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnableType
	 * @generated
	 */
	public Adapter createEnableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValuesType <em>Enumerated Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValuesType
	 * @generated
	 */
	public Adapter createEnumeratedValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValueType <em>Enumerated Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValueType
	 * @generated
	 */
	public Adapter createEnumeratedValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.EnumerationType
	 * @generated
	 */
	public Adapter createEnumerationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ExecutableImageType <em>Executable Image Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ExecutableImageType
	 * @generated
	 */
	public Adapter createExecutableImageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType <em>External Port Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ExternalPortReferenceType
	 * @generated
	 */
	public Adapter createExternalPortReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType <em>File Builder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType
	 * @generated
	 */
	public Adapter createFileBuilderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType1 <em>File Builder Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileBuilderType1
	 * @generated
	 */
	public Adapter createFileBuilderType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType <em>File Set Ref Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType
	 * @generated
	 */
	public Adapter createFileSetRefGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType1 <em>File Set Ref Group Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType1
	 * @generated
	 */
	public Adapter createFileSetRefGroupType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType <em>File Set Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType
	 * @generated
	 */
	public Adapter createFileSetRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetsType <em>File Sets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetsType
	 * @generated
	 */
	public Adapter createFileSetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetType <em>File Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileSetType
	 * @generated
	 */
	public Adapter createFileSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FlagsType <em>Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FlagsType
	 * @generated
	 */
	public Adapter createFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FlagsType1 <em>Flags Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FlagsType1
	 * @generated
	 */
	public Adapter createFlagsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FlagsType2 <em>Flags Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FlagsType2
	 * @generated
	 */
	public Adapter createFlagsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainConfigurationType <em>Generator Chain Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainConfigurationType
	 * @generated
	 */
	public Adapter createGeneratorChainConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainSelectorType <em>Generator Chain Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainSelectorType
	 * @generated
	 */
	public Adapter createGeneratorChainSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainType <em>Generator Chain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainType
	 * @generated
	 */
	public Adapter createGeneratorChainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorSelectorType <em>Generator Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorSelectorType
	 * @generated
	 */
	public Adapter createGeneratorSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType <em>Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType
	 * @generated
	 */
	public Adapter createGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType1 <em>Generator Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType1
	 * @generated
	 */
	public Adapter createGeneratorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType <em>Group Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType
	 * @generated
	 */
	public Adapter createGroupSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionsType <em>Hier Connections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionsType
	 * @generated
	 */
	public Adapter createHierConnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionType <em>Hier Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.HierConnectionType
	 * @generated
	 */
	public Adapter createHierConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.HierInterface <em>Hier Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.HierInterface
	 * @generated
	 */
	public Adapter createHierInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType <em>Instance Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType
	 * @generated
	 */
	public Adapter createInstanceGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionConfigurationType <em>Interconnection Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionConfigurationType
	 * @generated
	 */
	public Adapter createInterconnectionConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType <em>Interconnections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType
	 * @generated
	 */
	public Adapter createInterconnectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType <em>Interconnection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType
	 * @generated
	 */
	public Adapter createInterconnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType <em>Internal Port Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.InternalPortReferenceType
	 * @generated
	 */
	public Adapter createInternalPortReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.IsIncludeFileType <em>Is Include File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.IsIncludeFileType
	 * @generated
	 */
	public Adapter createIsIncludeFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LanguageToolsType <em>Language Tools Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LanguageToolsType
	 * @generated
	 */
	public Adapter createLanguageToolsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LanguageType
	 * @generated
	 */
	public Adapter createLanguageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LanguageType1 <em>Language Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LanguageType1
	 * @generated
	 */
	public Adapter createLanguageType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType <em>Left Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType
	 * @generated
	 */
	public Adapter createLeftTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType1 <em>Left Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType1
	 * @generated
	 */
	public Adapter createLeftType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType2 <em>Left Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType2
	 * @generated
	 */
	public Adapter createLeftType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LeftType11 <em>Left Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LeftType11
	 * @generated
	 */
	public Adapter createLeftType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType <em>Library Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LibraryRefType
	 * @generated
	 */
	public Adapter createLibraryRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LinkerCommandFileType <em>Linker Command File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LinkerCommandFileType
	 * @generated
	 */
	public Adapter createLinkerCommandFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LinkerFlagsType <em>Linker Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LinkerFlagsType
	 * @generated
	 */
	public Adapter createLinkerFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LinkerType <em>Linker Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LinkerType
	 * @generated
	 */
	public Adapter createLinkerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LoadConstraintType <em>Load Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LoadConstraintType
	 * @generated
	 */
	public Adapter createLoadConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LocalMemoryMapType <em>Local Memory Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LocalMemoryMapType
	 * @generated
	 */
	public Adapter createLocalMemoryMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LogicalNameType <em>Logical Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LogicalNameType
	 * @generated
	 */
	public Adapter createLogicalNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType <em>Logical Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType
	 * @generated
	 */
	public Adapter createLogicalPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType1 <em>Logical Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.LogicalPortType1
	 * @generated
	 */
	public Adapter createLogicalPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MaskType <em>Mask Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MaskType
	 * @generated
	 */
	public Adapter createMaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MaskType1 <em>Mask Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MaskType1
	 * @generated
	 */
	public Adapter createMaskType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MasterType
	 * @generated
	 */
	public Adapter createMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MaximumType <em>Maximum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MaximumType
	 * @generated
	 */
	public Adapter createMaximumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapRefType <em>Memory Map Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapRefType
	 * @generated
	 */
	public Adapter createMemoryMapRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapsType <em>Memory Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapsType
	 * @generated
	 */
	public Adapter createMemoryMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType <em>Memory Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType
	 * @generated
	 */
	public Adapter createMemoryMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryRemapType <em>Memory Remap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MemoryRemapType
	 * @generated
	 */
	public Adapter createMemoryRemapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MinimumType <em>Minimum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MinimumType
	 * @generated
	 */
	public Adapter createMinimumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MirroredMasterType <em>Mirrored Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MirroredMasterType
	 * @generated
	 */
	public Adapter createMirroredMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MirroredSlaveType <em>Mirrored Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MirroredSlaveType
	 * @generated
	 */
	public Adapter createMirroredSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MirroredSystemType <em>Mirrored System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MirroredSystemType
	 * @generated
	 */
	public Adapter createMirroredSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType <em>Model Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType
	 * @generated
	 */
	public Adapter createModelParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType1 <em>Model Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType1
	 * @generated
	 */
	public Adapter createModelParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MonitorInterconnectionType <em>Monitor Interconnection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MonitorInterconnectionType
	 * @generated
	 */
	public Adapter createMonitorInterconnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.MonitorType <em>Monitor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.MonitorType
	 * @generated
	 */
	public Adapter createMonitorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameType1 <em>Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameType1
	 * @generated
	 */
	public Adapter createNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameType2 <em>Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameType2
	 * @generated
	 */
	public Adapter createNameType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameValuePairType <em>Name Value Pair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameValuePairType
	 * @generated
	 */
	public Adapter createNameValuePairTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.NameValueTypeType <em>Name Value Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.NameValueTypeType
	 * @generated
	 */
	public Adapter createNameValueTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType <em>On Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType
	 * @generated
	 */
	public Adapter createOnMasterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType1 <em>On Master Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType1
	 * @generated
	 */
	public Adapter createOnMasterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType <em>On Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType
	 * @generated
	 */
	public Adapter createOnSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType1 <em>On Slave Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSlaveType1
	 * @generated
	 */
	public Adapter createOnSlaveType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType <em>On System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType
	 * @generated
	 */
	public Adapter createOnSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType1 <em>On System Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OnSystemType1
	 * @generated
	 */
	public Adapter createOnSystemType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OtherClockDriverType <em>Other Clock Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OtherClockDriverType
	 * @generated
	 */
	public Adapter createOtherClockDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.OtherClocks <em>Other Clocks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.OtherClocks
	 * @generated
	 */
	public Adapter createOtherClocksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ParametersType
	 * @generated
	 */
	public Adapter createParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1 <em>Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1
	 * @generated
	 */
	public Adapter createParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhaseType <em>Phase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PhaseType
	 * @generated
	 */
	public Adapter createPhaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType <em>Physical Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType
	 * @generated
	 */
	public Adapter createPhysicalPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1 <em>Physical Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1
	 * @generated
	 */
	public Adapter createPhysicalPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortAccessType <em>Port Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortAccessType
	 * @generated
	 */
	public Adapter createPortAccessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortDeclarationType <em>Port Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortDeclarationType
	 * @generated
	 */
	public Adapter createPortDeclarationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType <em>Port Maps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType
	 * @generated
	 */
	public Adapter createPortMapsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType1 <em>Port Maps Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapsType1
	 * @generated
	 */
	public Adapter createPortMapsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapType <em>Port Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapType
	 * @generated
	 */
	public Adapter createPortMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortMapType1 <em>Port Map Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortMapType1
	 * @generated
	 */
	public Adapter createPortMapType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortsType <em>Ports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortsType
	 * @generated
	 */
	public Adapter createPortsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortsType1 <em>Ports Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortsType1
	 * @generated
	 */
	public Adapter createPortsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortsType2 <em>Ports Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortsType2
	 * @generated
	 */
	public Adapter createPortsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortTransactionalType <em>Port Transactional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortTransactionalType
	 * @generated
	 */
	public Adapter createPortTransactionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortType
	 * @generated
	 */
	public Adapter createPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortType1 <em>Port Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortType1
	 * @generated
	 */
	public Adapter createPortType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.PortWireType <em>Port Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PortWireType
	 * @generated
	 */
	public Adapter createPortWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.QualifierType <em>Qualifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.QualifierType
	 * @generated
	 */
	public Adapter createQualifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.QualifierType1 <em>Qualifier Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.QualifierType1
	 * @generated
	 */
	public Adapter createQualifierType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType
	 * @generated
	 */
	public Adapter createRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType1 <em>Range Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType1
	 * @generated
	 */
	public Adapter createRangeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType2 <em>Range Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType2
	 * @generated
	 */
	public Adapter createRangeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RangeType3 <em>Range Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RangeType3
	 * @generated
	 */
	public Adapter createRangeType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RegisterFileType <em>Register File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RegisterFileType
	 * @generated
	 */
	public Adapter createRegisterFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RegisterType <em>Register Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RegisterType
	 * @generated
	 */
	public Adapter createRegisterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapAddressType <em>Remap Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapAddressType
	 * @generated
	 */
	public Adapter createRemapAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapPortsType <em>Remap Ports Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapPortsType
	 * @generated
	 */
	public Adapter createRemapPortsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapPortType <em>Remap Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapPortType
	 * @generated
	 */
	public Adapter createRemapPortTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapStatesType <em>Remap States Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapStatesType
	 * @generated
	 */
	public Adapter createRemapStatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapStateType <em>Remap State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RemapStateType
	 * @generated
	 */
	public Adapter createRemapStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType <em>Replace Default Flags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType1 <em>Replace Default Flags Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType1
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType2 <em>Replace Default Flags Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ReplaceDefaultFlagsType2
	 * @generated
	 */
	public Adapter createReplaceDefaultFlagsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RequiresDriverType <em>Requires Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RequiresDriverType
	 * @generated
	 */
	public Adapter createRequiresDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ResetType <em>Reset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ResetType
	 * @generated
	 */
	public Adapter createResetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ResetType1 <em>Reset Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ResetType1
	 * @generated
	 */
	public Adapter createResetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ResolvedLibraryRefType <em>Resolved Library Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ResolvedLibraryRefType
	 * @generated
	 */
	public Adapter createResolvedLibraryRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType <em>Right Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType
	 * @generated
	 */
	public Adapter createRightTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType1 <em>Right Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType1
	 * @generated
	 */
	public Adapter createRightType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType2 <em>Right Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType2
	 * @generated
	 */
	public Adapter createRightType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.RightType11 <em>Right Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.RightType11
	 * @generated
	 */
	public Adapter createRightType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SegmentsType <em>Segments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SegmentsType
	 * @generated
	 */
	public Adapter createSegmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SegmentType <em>Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SegmentType
	 * @generated
	 */
	public Adapter createSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceType1 <em>Service Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceType1
	 * @generated
	 */
	public Adapter createServiceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType <em>Service Type Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType
	 * @generated
	 */
	public Adapter createServiceTypeDefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefType <em>Service Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefType
	 * @generated
	 */
	public Adapter createServiceTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDriverType <em>Single Shot Driver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDriverType
	 * @generated
	 */
	public Adapter createSingleShotDriverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDurationType <em>Single Shot Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDurationType
	 * @generated
	 */
	public Adapter createSingleShotDurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotOffsetType <em>Single Shot Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotOffsetType
	 * @generated
	 */
	public Adapter createSingleShotOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SingleShotValueType <em>Single Shot Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SingleShotValueType
	 * @generated
	 */
	public Adapter createSingleShotValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SizeType <em>Size Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SizeType
	 * @generated
	 */
	public Adapter createSizeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SlaveType <em>Slave Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SlaveType
	 * @generated
	 */
	public Adapter createSlaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SourceFileType <em>Source File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SourceFileType
	 * @generated
	 */
	public Adapter createSourceFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SourceNameType <em>Source Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SourceNameType
	 * @generated
	 */
	public Adapter createSourceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SubspaceRefType <em>Subspace Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SubspaceRefType
	 * @generated
	 */
	public Adapter createSubspaceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SystemGroupNamesType <em>System Group Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SystemGroupNamesType
	 * @generated
	 */
	public Adapter createSystemGroupNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TargetNameType <em>Target Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TargetNameType
	 * @generated
	 */
	public Adapter createTargetNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TestableType <em>Testable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TestableType
	 * @generated
	 */
	public Adapter createTestableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TimingConstraintType <em>Timing Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TimingConstraintType
	 * @generated
	 */
	public Adapter createTimingConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TransactionalType <em>Transactional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TransactionalType
	 * @generated
	 */
	public Adapter createTransactionalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TransportMethodsType <em>Transport Methods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TransportMethodsType
	 * @generated
	 */
	public Adapter createTransportMethodsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TransTypeDefType <em>Trans Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TransTypeDefType
	 * @generated
	 */
	public Adapter createTransTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType <em>Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType
	 * @generated
	 */
	public Adapter createTypeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType1 <em>Type Name Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType1
	 * @generated
	 */
	public Adapter createTypeNameType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2 <em>Type Name Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2
	 * @generated
	 */
	public Adapter createTypeNameType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType3 <em>Type Name Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType3
	 * @generated
	 */
	public Adapter createTypeNameType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueMaskConfigType <em>Value Mask Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueMaskConfigType
	 * @generated
	 */
	public Adapter createValueMaskConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueType1 <em>Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueType1
	 * @generated
	 */
	public Adapter createValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ValueType2 <em>Value Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ValueType2
	 * @generated
	 */
	public Adapter createValueType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType
	 * @generated
	 */
	public Adapter createVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType1 <em>Vector Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType1
	 * @generated
	 */
	public Adapter createVectorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType2 <em>Vector Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType2
	 * @generated
	 */
	public Adapter createVectorType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VectorType11 <em>Vector Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VectorType11
	 * @generated
	 */
	public Adapter createVectorType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType <em>Vendor Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType
	 * @generated
	 */
	public Adapter createVendorExtensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewConfigurationType <em>View Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewConfigurationType
	 * @generated
	 */
	public Adapter createViewConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewsType <em>Views Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewsType
	 * @generated
	 */
	public Adapter createViewsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewsType1 <em>Views Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewsType1
	 * @generated
	 */
	public Adapter createViewsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.ViewType
	 * @generated
	 */
	public Adapter createViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefsType <em>Whitebox Element Refs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefsType
	 * @generated
	 */
	public Adapter createWhiteboxElementRefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType <em>Whitebox Element Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType
	 * @generated
	 */
	public Adapter createWhiteboxElementRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementsType <em>Whitebox Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementsType
	 * @generated
	 */
	public Adapter createWhiteboxElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType <em>Whitebox Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementType
	 * @generated
	 */
	public Adapter createWhiteboxElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxPathType <em>Whitebox Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxPathType
	 * @generated
	 */
	public Adapter createWhiteboxPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WidthType <em>Width Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WidthType
	 * @generated
	 */
	public Adapter createWidthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WireType <em>Wire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WireType
	 * @generated
	 */
	public Adapter createWireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefsType <em>Wire Type Defs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefsType
	 * @generated
	 */
	public Adapter createWireTypeDefsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefType <em>Wire Type Def Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefType
	 * @generated
	 */
	public Adapter createWireTypeDefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.spiritconsortium.xml.schema.spirit.spirit.WriteValueConstraintType <em>Write Value Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.WriteValueConstraintType
	 * @generated
	 */
	public Adapter createWriteValueConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_1AdapterFactory
