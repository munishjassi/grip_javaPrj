/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.spiritconsortium.xml.schema.spirit.spirit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package
 * @generated
 */
public class _1Switch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Switch() {
		if (modelPackage == null) {
			modelPackage = _1Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case _1Package.ABSTRACTION_DEFINITION_TYPE: {
				AbstractionDefinitionType abstractionDefinitionType = (AbstractionDefinitionType)theEObject;
				Object result = caseAbstractionDefinitionType(abstractionDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE: {
				AbstractionDefPortConstraintsType abstractionDefPortConstraintsType = (AbstractionDefPortConstraintsType)theEObject;
				Object result = caseAbstractionDefPortConstraintsType(abstractionDefPortConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_BUS_INTERFACE_TYPE: {
				AbstractorBusInterfaceType abstractorBusInterfaceType = (AbstractorBusInterfaceType)theEObject;
				Object result = caseAbstractorBusInterfaceType(abstractorBusInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_GENERATORS_TYPE: {
				AbstractorGeneratorsType abstractorGeneratorsType = (AbstractorGeneratorsType)theEObject;
				Object result = caseAbstractorGeneratorsType(abstractorGeneratorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_INTERFACES_TYPE: {
				AbstractorInterfacesType abstractorInterfacesType = (AbstractorInterfacesType)theEObject;
				Object result = caseAbstractorInterfacesType(abstractorInterfacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_MODEL_TYPE: {
				AbstractorModelType abstractorModelType = (AbstractorModelType)theEObject;
				Object result = caseAbstractorModelType(abstractorModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_MODE_TYPE1: {
				AbstractorModeType1 abstractorModeType1 = (AbstractorModeType1)theEObject;
				Object result = caseAbstractorModeType1(abstractorModeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_PORT_TYPE: {
				AbstractorPortType abstractorPortType = (AbstractorPortType)theEObject;
				Object result = caseAbstractorPortType(abstractorPortType);
				if (result == null) result = casePortType(abstractorPortType);
				if (result == null) result = casePortDeclarationType(abstractorPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_PORT_WIRE_TYPE: {
				AbstractorPortWireType abstractorPortWireType = (AbstractorPortWireType)theEObject;
				Object result = caseAbstractorPortWireType(abstractorPortWireType);
				if (result == null) result = casePortWireType(abstractorPortWireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTORS_TYPE: {
				AbstractorsType abstractorsType = (AbstractorsType)theEObject;
				Object result = caseAbstractorsType(abstractorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_TYPE: {
				AbstractorType abstractorType = (AbstractorType)theEObject;
				Object result = caseAbstractorType(abstractorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_TYPE1: {
				AbstractorType1 abstractorType1 = (AbstractorType1)theEObject;
				Object result = caseAbstractorType1(abstractorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ABSTRACTOR_VIEW_TYPE: {
				AbstractorViewType abstractorViewType = (AbstractorViewType)theEObject;
				Object result = caseAbstractorViewType(abstractorViewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ADDRESS_BANK_TYPE: {
				AddressBankType addressBankType = (AddressBankType)theEObject;
				Object result = caseAddressBankType(addressBankType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ADDRESS_BLOCK_TYPE: {
				AddressBlockType addressBlockType = (AddressBlockType)theEObject;
				Object result = caseAddressBlockType(addressBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ADDRESS_OFFSET_TYPE: {
				AddressOffsetType addressOffsetType = (AddressOffsetType)theEObject;
				Object result = caseAddressOffsetType(addressOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ADDRESS_SPACE_REF_TYPE: {
				AddressSpaceRefType addressSpaceRefType = (AddressSpaceRefType)theEObject;
				Object result = caseAddressSpaceRefType(addressSpaceRefType);
				if (result == null) result = caseAddrSpaceRefType(addressSpaceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ADDRESS_SPACES_TYPE: {
				AddressSpacesType addressSpacesType = (AddressSpacesType)theEObject;
				Object result = caseAddressSpacesType(addressSpacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ADDRESS_SPACE_TYPE: {
				AddressSpaceType addressSpaceType = (AddressSpaceType)theEObject;
				Object result = caseAddressSpaceType(addressSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ADDR_SPACE_REF_TYPE: {
				AddrSpaceRefType addrSpaceRefType = (AddrSpaceRefType)theEObject;
				Object result = caseAddrSpaceRefType(addrSpaceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.AD_HOC_CONNECTIONS_TYPE: {
				AdHocConnectionsType adHocConnectionsType = (AdHocConnectionsType)theEObject;
				Object result = caseAdHocConnectionsType(adHocConnectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.AD_HOC_CONNECTION_TYPE: {
				AdHocConnectionType adHocConnectionType = (AdHocConnectionType)theEObject;
				Object result = caseAdHocConnectionType(adHocConnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ALTERNATE_GROUPS_TYPE: {
				AlternateGroupsType alternateGroupsType = (AlternateGroupsType)theEObject;
				Object result = caseAlternateGroupsType(alternateGroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ALTERNATE_REGISTERS_TYPE: {
				AlternateRegistersType alternateRegistersType = (AlternateRegistersType)theEObject;
				Object result = caseAlternateRegistersType(alternateRegistersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ALTERNATE_REGISTER_TYPE: {
				AlternateRegisterType alternateRegisterType = (AlternateRegisterType)theEObject;
				Object result = caseAlternateRegisterType(alternateRegisterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ARGUMENT_TYPE: {
				ArgumentType argumentType = (ArgumentType)theEObject;
				Object result = caseArgumentType(argumentType);
				if (result == null) result = caseNameValuePairType(argumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BANKED_BANK_TYPE: {
				BankedBankType bankedBankType = (BankedBankType)theEObject;
				Object result = caseBankedBankType(bankedBankType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BANKED_BLOCK_TYPE: {
				BankedBlockType bankedBlockType = (BankedBlockType)theEObject;
				Object result = caseBankedBlockType(bankedBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BANKED_SUBSPACE_TYPE: {
				BankedSubspaceType bankedSubspaceType = (BankedSubspaceType)theEObject;
				Object result = caseBankedSubspaceType(bankedSubspaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BASE_ADDRESSES_TYPE: {
				BaseAddressesType baseAddressesType = (BaseAddressesType)theEObject;
				Object result = caseBaseAddressesType(baseAddressesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BASE_ADDRESS_TYPE: {
				BaseAddressType baseAddressType = (BaseAddressType)theEObject;
				Object result = caseBaseAddressType(baseAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BASE_ADDRESS_TYPE1: {
				BaseAddressType1 baseAddressType1 = (BaseAddressType1)theEObject;
				Object result = caseBaseAddressType1(baseAddressType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BIT_STEERING_TYPE1: {
				BitSteeringType1 bitSteeringType1 = (BitSteeringType1)theEObject;
				Object result = caseBitSteeringType1(bitSteeringType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BIT_WIDTH_TYPE: {
				BitWidthType bitWidthType = (BitWidthType)theEObject;
				Object result = caseBitWidthType(bitWidthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BRIDGE_TYPE: {
				BridgeType bridgeType = (BridgeType)theEObject;
				Object result = caseBridgeType(bridgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BUILD_COMMAND_TYPE: {
				BuildCommandType buildCommandType = (BuildCommandType)theEObject;
				Object result = caseBuildCommandType(buildCommandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BUS_DEFINITION_TYPE: {
				BusDefinitionType busDefinitionType = (BusDefinitionType)theEObject;
				Object result = caseBusDefinitionType(busDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BUS_INTERFACES_TYPE: {
				BusInterfacesType busInterfacesType = (BusInterfacesType)theEObject;
				Object result = caseBusInterfacesType(busInterfacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.BUS_INTERFACE_TYPE: {
				BusInterfaceType busInterfaceType = (BusInterfaceType)theEObject;
				Object result = caseBusInterfaceType(busInterfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CELL_CLASS_TYPE: {
				CellClassType cellClassType = (CellClassType)theEObject;
				Object result = caseCellClassType(cellClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CELL_FUNCTION_TYPE: {
				CellFunctionType cellFunctionType = (CellFunctionType)theEObject;
				Object result = caseCellFunctionType(cellFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CELL_SPECIFICATION_TYPE: {
				CellSpecificationType cellSpecificationType = (CellSpecificationType)theEObject;
				Object result = caseCellSpecificationType(cellSpecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CHANNELS_TYPE: {
				ChannelsType channelsType = (ChannelsType)theEObject;
				Object result = caseChannelsType(channelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CHANNEL_TYPE: {
				ChannelType channelType = (ChannelType)theEObject;
				Object result = caseChannelType(channelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CHOICES_TYPE: {
				ChoicesType choicesType = (ChoicesType)theEObject;
				Object result = caseChoicesType(choicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CHOICE_TYPE: {
				ChoiceType choiceType = (ChoiceType)theEObject;
				Object result = caseChoiceType(choiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CLOCK_DRIVER_TYPE: {
				ClockDriverType clockDriverType = (ClockDriverType)theEObject;
				Object result = caseClockDriverType(clockDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CLOCK_DRIVER_TYPE1: {
				ClockDriverType1 clockDriverType1 = (ClockDriverType1)theEObject;
				Object result = caseClockDriverType1(clockDriverType1);
				if (result == null) result = caseClockDriverType(clockDriverType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CLOCK_PERIOD_TYPE: {
				ClockPeriodType clockPeriodType = (ClockPeriodType)theEObject;
				Object result = caseClockPeriodType(clockPeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CLOCK_PULSE_DURATION_TYPE: {
				ClockPulseDurationType clockPulseDurationType = (ClockPulseDurationType)theEObject;
				Object result = caseClockPulseDurationType(clockPulseDurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CLOCK_PULSE_OFFSET_TYPE: {
				ClockPulseOffsetType clockPulseOffsetType = (ClockPulseOffsetType)theEObject;
				Object result = caseClockPulseOffsetType(clockPulseOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CLOCK_PULSE_VALUE_TYPE: {
				ClockPulseValueType clockPulseValueType = (ClockPulseValueType)theEObject;
				Object result = caseClockPulseValueType(clockPulseValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMMAND_LINE_SWITCH_TYPE: {
				CommandLineSwitchType commandLineSwitchType = (CommandLineSwitchType)theEObject;
				Object result = caseCommandLineSwitchType(commandLineSwitchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMMAND_TYPE: {
				CommandType commandType = (CommandType)theEObject;
				Object result = caseCommandType(commandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMMAND_TYPE1: {
				CommandType1 commandType1 = (CommandType1)theEObject;
				Object result = caseCommandType1(commandType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMMAND_TYPE2: {
				CommandType2 commandType2 = (CommandType2)theEObject;
				Object result = caseCommandType2(commandType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMPONENT_GENERATORS_TYPE: {
				ComponentGeneratorsType componentGeneratorsType = (ComponentGeneratorsType)theEObject;
				Object result = caseComponentGeneratorsType(componentGeneratorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMPONENT_GENERATOR_TYPE: {
				ComponentGeneratorType componentGeneratorType = (ComponentGeneratorType)theEObject;
				Object result = caseComponentGeneratorType(componentGeneratorType);
				if (result == null) result = caseInstanceGeneratorType(componentGeneratorType);
				if (result == null) result = caseGeneratorType1(componentGeneratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMPONENT_INSTANCES_TYPE: {
				ComponentInstancesType componentInstancesType = (ComponentInstancesType)theEObject;
				Object result = caseComponentInstancesType(componentInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMPONENT_INSTANCE_TYPE: {
				ComponentInstanceType componentInstanceType = (ComponentInstanceType)theEObject;
				Object result = caseComponentInstanceType(componentInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				Object result = caseComponentType(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONFIGURABLE_ELEMENT_VALUES_TYPE: {
				ConfigurableElementValuesType configurableElementValuesType = (ConfigurableElementValuesType)theEObject;
				Object result = caseConfigurableElementValuesType(configurableElementValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONFIGURABLE_ELEMENT_VALUE_TYPE: {
				ConfigurableElementValueType configurableElementValueType = (ConfigurableElementValueType)theEObject;
				Object result = caseConfigurableElementValueType(configurableElementValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONNECTION_TYPE: {
				ConnectionType connectionType = (ConnectionType)theEObject;
				Object result = caseConnectionType(connectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONSTRAINT_SETS_TYPE: {
				ConstraintSetsType constraintSetsType = (ConstraintSetsType)theEObject;
				Object result = caseConstraintSetsType(constraintSetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CONSTRAINT_SET_TYPE: {
				ConstraintSetType constraintSetType = (ConstraintSetType)theEObject;
				Object result = caseConstraintSetType(constraintSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CPUS_TYPE: {
				CpusType cpusType = (CpusType)theEObject;
				Object result = caseCpusType(cpusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.CPU_TYPE: {
				CpuType cpuType = (CpuType)theEObject;
				Object result = caseCpuType(cpuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DEFAULT_VALUE_TYPE: {
				DefaultValueType defaultValueType = (DefaultValueType)theEObject;
				Object result = caseDefaultValueType(defaultValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DESIGN_CONFIGURATION_TYPE: {
				DesignConfigurationType designConfigurationType = (DesignConfigurationType)theEObject;
				Object result = caseDesignConfigurationType(designConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DESIGN_TYPE: {
				DesignType designType = (DesignType)theEObject;
				Object result = caseDesignType(designType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DISABLED_TYPE: {
				DisabledType disabledType = (DisabledType)theEObject;
				Object result = caseDisabledType(disabledType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				Object result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DRIVE_CONSTRAINT_TYPE: {
				DriveConstraintType driveConstraintType = (DriveConstraintType)theEObject;
				Object result = caseDriveConstraintType(driveConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.DRIVER_TYPE: {
				DriverType driverType = (DriverType)theEObject;
				Object result = caseDriverType(driverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ENABLE_TYPE: {
				EnableType enableType = (EnableType)theEObject;
				Object result = caseEnableType(enableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ENUMERATED_VALUES_TYPE: {
				EnumeratedValuesType enumeratedValuesType = (EnumeratedValuesType)theEObject;
				Object result = caseEnumeratedValuesType(enumeratedValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ENUMERATED_VALUE_TYPE: {
				EnumeratedValueType enumeratedValueType = (EnumeratedValueType)theEObject;
				Object result = caseEnumeratedValueType(enumeratedValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ENUMERATION_TYPE: {
				EnumerationType enumerationType = (EnumerationType)theEObject;
				Object result = caseEnumerationType(enumerationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.EXECUTABLE_IMAGE_TYPE: {
				ExecutableImageType executableImageType = (ExecutableImageType)theEObject;
				Object result = caseExecutableImageType(executableImageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.EXTERNAL_PORT_REFERENCE_TYPE: {
				ExternalPortReferenceType externalPortReferenceType = (ExternalPortReferenceType)theEObject;
				Object result = caseExternalPortReferenceType(externalPortReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FIELD_TYPE: {
				FieldType fieldType = (FieldType)theEObject;
				Object result = caseFieldType(fieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_BUILDER_TYPE: {
				FileBuilderType fileBuilderType = (FileBuilderType)theEObject;
				Object result = caseFileBuilderType(fileBuilderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_BUILDER_TYPE1: {
				FileBuilderType1 fileBuilderType1 = (FileBuilderType1)theEObject;
				Object result = caseFileBuilderType1(fileBuilderType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_SET_REF_GROUP_TYPE: {
				FileSetRefGroupType fileSetRefGroupType = (FileSetRefGroupType)theEObject;
				Object result = caseFileSetRefGroupType(fileSetRefGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_SET_REF_GROUP_TYPE1: {
				FileSetRefGroupType1 fileSetRefGroupType1 = (FileSetRefGroupType1)theEObject;
				Object result = caseFileSetRefGroupType1(fileSetRefGroupType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_SET_REF_TYPE: {
				FileSetRefType fileSetRefType = (FileSetRefType)theEObject;
				Object result = caseFileSetRefType(fileSetRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_SETS_TYPE: {
				FileSetsType fileSetsType = (FileSetsType)theEObject;
				Object result = caseFileSetsType(fileSetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_SET_TYPE: {
				FileSetType fileSetType = (FileSetType)theEObject;
				Object result = caseFileSetType(fileSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				Object result = caseFileType(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FLAGS_TYPE: {
				FlagsType flagsType = (FlagsType)theEObject;
				Object result = caseFlagsType(flagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FLAGS_TYPE1: {
				FlagsType1 flagsType1 = (FlagsType1)theEObject;
				Object result = caseFlagsType1(flagsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FLAGS_TYPE2: {
				FlagsType2 flagsType2 = (FlagsType2)theEObject;
				Object result = caseFlagsType2(flagsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				Object result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.GENERATOR_CHAIN_CONFIGURATION_TYPE: {
				GeneratorChainConfigurationType generatorChainConfigurationType = (GeneratorChainConfigurationType)theEObject;
				Object result = caseGeneratorChainConfigurationType(generatorChainConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.GENERATOR_CHAIN_SELECTOR_TYPE: {
				GeneratorChainSelectorType generatorChainSelectorType = (GeneratorChainSelectorType)theEObject;
				Object result = caseGeneratorChainSelectorType(generatorChainSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.GENERATOR_CHAIN_TYPE: {
				GeneratorChainType generatorChainType = (GeneratorChainType)theEObject;
				Object result = caseGeneratorChainType(generatorChainType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.GENERATOR_SELECTOR_TYPE: {
				GeneratorSelectorType generatorSelectorType = (GeneratorSelectorType)theEObject;
				Object result = caseGeneratorSelectorType(generatorSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.GENERATOR_TYPE: {
				GeneratorType generatorType = (GeneratorType)theEObject;
				Object result = caseGeneratorType(generatorType);
				if (result == null) result = caseGeneratorType1(generatorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.GENERATOR_TYPE1: {
				GeneratorType1 generatorType1 = (GeneratorType1)theEObject;
				Object result = caseGeneratorType1(generatorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.GROUP_SELECTOR_TYPE: {
				GroupSelectorType groupSelectorType = (GroupSelectorType)theEObject;
				Object result = caseGroupSelectorType(groupSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.HIER_CONNECTIONS_TYPE: {
				HierConnectionsType hierConnectionsType = (HierConnectionsType)theEObject;
				Object result = caseHierConnectionsType(hierConnectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.HIER_CONNECTION_TYPE: {
				HierConnectionType hierConnectionType = (HierConnectionType)theEObject;
				Object result = caseHierConnectionType(hierConnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.HIER_INTERFACE: {
				HierInterface hierInterface = (HierInterface)theEObject;
				Object result = caseHierInterface(hierInterface);
				if (result == null) result = caseInterface(hierInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INSTANCE_GENERATOR_TYPE: {
				InstanceGeneratorType instanceGeneratorType = (InstanceGeneratorType)theEObject;
				Object result = caseInstanceGeneratorType(instanceGeneratorType);
				if (result == null) result = caseGeneratorType1(instanceGeneratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INTERCONNECTION_CONFIGURATION_TYPE: {
				InterconnectionConfigurationType interconnectionConfigurationType = (InterconnectionConfigurationType)theEObject;
				Object result = caseInterconnectionConfigurationType(interconnectionConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INTERCONNECTIONS_TYPE: {
				InterconnectionsType interconnectionsType = (InterconnectionsType)theEObject;
				Object result = caseInterconnectionsType(interconnectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INTERCONNECTION_TYPE: {
				InterconnectionType interconnectionType = (InterconnectionType)theEObject;
				Object result = caseInterconnectionType(interconnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				Object result = caseInterface(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.INTERNAL_PORT_REFERENCE_TYPE: {
				InternalPortReferenceType internalPortReferenceType = (InternalPortReferenceType)theEObject;
				Object result = caseInternalPortReferenceType(internalPortReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.IS_INCLUDE_FILE_TYPE: {
				IsIncludeFileType isIncludeFileType = (IsIncludeFileType)theEObject;
				Object result = caseIsIncludeFileType(isIncludeFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LANGUAGE_TOOLS_TYPE: {
				LanguageToolsType languageToolsType = (LanguageToolsType)theEObject;
				Object result = caseLanguageToolsType(languageToolsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LANGUAGE_TYPE: {
				LanguageType languageType = (LanguageType)theEObject;
				Object result = caseLanguageType(languageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LANGUAGE_TYPE1: {
				LanguageType1 languageType1 = (LanguageType1)theEObject;
				Object result = caseLanguageType1(languageType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LEFT_TYPE: {
				LeftType leftType = (LeftType)theEObject;
				Object result = caseLeftType(leftType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LEFT_TYPE1: {
				LeftType1 leftType1 = (LeftType1)theEObject;
				Object result = caseLeftType1(leftType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LEFT_TYPE2: {
				LeftType2 leftType2 = (LeftType2)theEObject;
				Object result = caseLeftType2(leftType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LEFT_TYPE11: {
				LeftType11 leftType11 = (LeftType11)theEObject;
				Object result = caseLeftType11(leftType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LIBRARY_REF_TYPE: {
				LibraryRefType libraryRefType = (LibraryRefType)theEObject;
				Object result = caseLibraryRefType(libraryRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LINKER_COMMAND_FILE_TYPE: {
				LinkerCommandFileType linkerCommandFileType = (LinkerCommandFileType)theEObject;
				Object result = caseLinkerCommandFileType(linkerCommandFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LINKER_FLAGS_TYPE: {
				LinkerFlagsType linkerFlagsType = (LinkerFlagsType)theEObject;
				Object result = caseLinkerFlagsType(linkerFlagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LINKER_TYPE: {
				LinkerType linkerType = (LinkerType)theEObject;
				Object result = caseLinkerType(linkerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOAD_CONSTRAINT_TYPE: {
				LoadConstraintType loadConstraintType = (LoadConstraintType)theEObject;
				Object result = caseLoadConstraintType(loadConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOCAL_MEMORY_MAP_TYPE: {
				LocalMemoryMapType localMemoryMapType = (LocalMemoryMapType)theEObject;
				Object result = caseLocalMemoryMapType(localMemoryMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOGICAL_NAME_TYPE: {
				LogicalNameType logicalNameType = (LogicalNameType)theEObject;
				Object result = caseLogicalNameType(logicalNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOGICAL_PORT_TYPE: {
				LogicalPortType logicalPortType = (LogicalPortType)theEObject;
				Object result = caseLogicalPortType(logicalPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.LOGICAL_PORT_TYPE1: {
				LogicalPortType1 logicalPortType1 = (LogicalPortType1)theEObject;
				Object result = caseLogicalPortType1(logicalPortType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MASK_TYPE: {
				MaskType maskType = (MaskType)theEObject;
				Object result = caseMaskType(maskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MASK_TYPE1: {
				MaskType1 maskType1 = (MaskType1)theEObject;
				Object result = caseMaskType1(maskType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MASTER_TYPE: {
				MasterType masterType = (MasterType)theEObject;
				Object result = caseMasterType(masterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MAXIMUM_TYPE: {
				MaximumType maximumType = (MaximumType)theEObject;
				Object result = caseMaximumType(maximumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MEMORY_MAP_REF_TYPE: {
				MemoryMapRefType memoryMapRefType = (MemoryMapRefType)theEObject;
				Object result = caseMemoryMapRefType(memoryMapRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MEMORY_MAPS_TYPE: {
				MemoryMapsType memoryMapsType = (MemoryMapsType)theEObject;
				Object result = caseMemoryMapsType(memoryMapsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MEMORY_MAP_TYPE: {
				MemoryMapType memoryMapType = (MemoryMapType)theEObject;
				Object result = caseMemoryMapType(memoryMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MEMORY_REMAP_TYPE: {
				MemoryRemapType memoryRemapType = (MemoryRemapType)theEObject;
				Object result = caseMemoryRemapType(memoryRemapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MINIMUM_TYPE: {
				MinimumType minimumType = (MinimumType)theEObject;
				Object result = caseMinimumType(minimumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MIRRORED_MASTER_TYPE: {
				MirroredMasterType mirroredMasterType = (MirroredMasterType)theEObject;
				Object result = caseMirroredMasterType(mirroredMasterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MIRRORED_SLAVE_TYPE: {
				MirroredSlaveType mirroredSlaveType = (MirroredSlaveType)theEObject;
				Object result = caseMirroredSlaveType(mirroredSlaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MIRRORED_SYSTEM_TYPE: {
				MirroredSystemType mirroredSystemType = (MirroredSystemType)theEObject;
				Object result = caseMirroredSystemType(mirroredSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODEL_PARAMETERS_TYPE: {
				ModelParametersType modelParametersType = (ModelParametersType)theEObject;
				Object result = caseModelParametersType(modelParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODEL_PARAMETERS_TYPE1: {
				ModelParametersType1 modelParametersType1 = (ModelParametersType1)theEObject;
				Object result = caseModelParametersType1(modelParametersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				Object result = caseModelType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MONITOR_INTERCONNECTION_TYPE: {
				MonitorInterconnectionType monitorInterconnectionType = (MonitorInterconnectionType)theEObject;
				Object result = caseMonitorInterconnectionType(monitorInterconnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.MONITOR_TYPE: {
				MonitorType monitorType = (MonitorType)theEObject;
				Object result = caseMonitorType(monitorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NAME_TYPE: {
				NameType nameType = (NameType)theEObject;
				Object result = caseNameType(nameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NAME_TYPE1: {
				NameType1 nameType1 = (NameType1)theEObject;
				Object result = caseNameType1(nameType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NAME_TYPE2: {
				NameType2 nameType2 = (NameType2)theEObject;
				Object result = caseNameType2(nameType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NAME_VALUE_PAIR_TYPE: {
				NameValuePairType nameValuePairType = (NameValuePairType)theEObject;
				Object result = caseNameValuePairType(nameValuePairType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.NAME_VALUE_TYPE_TYPE: {
				NameValueTypeType nameValueTypeType = (NameValueTypeType)theEObject;
				Object result = caseNameValueTypeType(nameValueTypeType);
				if (result == null) result = caseNameValuePairType(nameValueTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ON_MASTER_TYPE: {
				OnMasterType onMasterType = (OnMasterType)theEObject;
				Object result = caseOnMasterType(onMasterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ON_MASTER_TYPE1: {
				OnMasterType1 onMasterType1 = (OnMasterType1)theEObject;
				Object result = caseOnMasterType1(onMasterType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ON_SLAVE_TYPE: {
				OnSlaveType onSlaveType = (OnSlaveType)theEObject;
				Object result = caseOnSlaveType(onSlaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ON_SLAVE_TYPE1: {
				OnSlaveType1 onSlaveType1 = (OnSlaveType1)theEObject;
				Object result = caseOnSlaveType1(onSlaveType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ON_SYSTEM_TYPE: {
				OnSystemType onSystemType = (OnSystemType)theEObject;
				Object result = caseOnSystemType(onSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.ON_SYSTEM_TYPE1: {
				OnSystemType1 onSystemType1 = (OnSystemType1)theEObject;
				Object result = caseOnSystemType1(onSystemType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.OTHER_CLOCK_DRIVER_TYPE: {
				OtherClockDriverType otherClockDriverType = (OtherClockDriverType)theEObject;
				Object result = caseOtherClockDriverType(otherClockDriverType);
				if (result == null) result = caseClockDriverType(otherClockDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.OTHER_CLOCKS: {
				OtherClocks otherClocks = (OtherClocks)theEObject;
				Object result = caseOtherClocks(otherClocks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PARAMETERS_TYPE: {
				ParametersType parametersType = (ParametersType)theEObject;
				Object result = caseParametersType(parametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PARAMETERS_TYPE1: {
				ParametersType1 parametersType1 = (ParametersType1)theEObject;
				Object result = caseParametersType1(parametersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PHASE_TYPE: {
				PhaseType phaseType = (PhaseType)theEObject;
				Object result = casePhaseType(phaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PHYSICAL_PORT_TYPE: {
				PhysicalPortType physicalPortType = (PhysicalPortType)theEObject;
				Object result = casePhysicalPortType(physicalPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PHYSICAL_PORT_TYPE1: {
				PhysicalPortType1 physicalPortType1 = (PhysicalPortType1)theEObject;
				Object result = casePhysicalPortType1(physicalPortType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_ACCESS_TYPE: {
				PortAccessType portAccessType = (PortAccessType)theEObject;
				Object result = casePortAccessType(portAccessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_DECLARATION_TYPE: {
				PortDeclarationType portDeclarationType = (PortDeclarationType)theEObject;
				Object result = casePortDeclarationType(portDeclarationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_MAPS_TYPE: {
				PortMapsType portMapsType = (PortMapsType)theEObject;
				Object result = casePortMapsType(portMapsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_MAPS_TYPE1: {
				PortMapsType1 portMapsType1 = (PortMapsType1)theEObject;
				Object result = casePortMapsType1(portMapsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_MAP_TYPE: {
				PortMapType portMapType = (PortMapType)theEObject;
				Object result = casePortMapType(portMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_MAP_TYPE1: {
				PortMapType1 portMapType1 = (PortMapType1)theEObject;
				Object result = casePortMapType1(portMapType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORTS_TYPE: {
				PortsType portsType = (PortsType)theEObject;
				Object result = casePortsType(portsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORTS_TYPE1: {
				PortsType1 portsType1 = (PortsType1)theEObject;
				Object result = casePortsType1(portsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORTS_TYPE2: {
				PortsType2 portsType2 = (PortsType2)theEObject;
				Object result = casePortsType2(portsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_TRANSACTIONAL_TYPE: {
				PortTransactionalType portTransactionalType = (PortTransactionalType)theEObject;
				Object result = casePortTransactionalType(portTransactionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_TYPE: {
				PortType portType = (PortType)theEObject;
				Object result = casePortType(portType);
				if (result == null) result = casePortDeclarationType(portType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_TYPE1: {
				PortType1 portType1 = (PortType1)theEObject;
				Object result = casePortType1(portType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.PORT_WIRE_TYPE: {
				PortWireType portWireType = (PortWireType)theEObject;
				Object result = casePortWireType(portWireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.QUALIFIER_TYPE: {
				QualifierType qualifierType = (QualifierType)theEObject;
				Object result = caseQualifierType(qualifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.QUALIFIER_TYPE1: {
				QualifierType1 qualifierType1 = (QualifierType1)theEObject;
				Object result = caseQualifierType1(qualifierType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RANGE_TYPE: {
				RangeType rangeType = (RangeType)theEObject;
				Object result = caseRangeType(rangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RANGE_TYPE1: {
				RangeType1 rangeType1 = (RangeType1)theEObject;
				Object result = caseRangeType1(rangeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RANGE_TYPE2: {
				RangeType2 rangeType2 = (RangeType2)theEObject;
				Object result = caseRangeType2(rangeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RANGE_TYPE3: {
				RangeType3 rangeType3 = (RangeType3)theEObject;
				Object result = caseRangeType3(rangeType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REGISTER_FILE_TYPE: {
				RegisterFileType registerFileType = (RegisterFileType)theEObject;
				Object result = caseRegisterFileType(registerFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REGISTER_TYPE: {
				RegisterType registerType = (RegisterType)theEObject;
				Object result = caseRegisterType(registerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMAP_ADDRESS_TYPE: {
				RemapAddressType remapAddressType = (RemapAddressType)theEObject;
				Object result = caseRemapAddressType(remapAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMAP_PORTS_TYPE: {
				RemapPortsType remapPortsType = (RemapPortsType)theEObject;
				Object result = caseRemapPortsType(remapPortsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMAP_PORT_TYPE: {
				RemapPortType remapPortType = (RemapPortType)theEObject;
				Object result = caseRemapPortType(remapPortType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMAP_STATES_TYPE: {
				RemapStatesType remapStatesType = (RemapStatesType)theEObject;
				Object result = caseRemapStatesType(remapStatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REMAP_STATE_TYPE: {
				RemapStateType remapStateType = (RemapStateType)theEObject;
				Object result = caseRemapStateType(remapStateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REPLACE_DEFAULT_FLAGS_TYPE: {
				ReplaceDefaultFlagsType replaceDefaultFlagsType = (ReplaceDefaultFlagsType)theEObject;
				Object result = caseReplaceDefaultFlagsType(replaceDefaultFlagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REPLACE_DEFAULT_FLAGS_TYPE1: {
				ReplaceDefaultFlagsType1 replaceDefaultFlagsType1 = (ReplaceDefaultFlagsType1)theEObject;
				Object result = caseReplaceDefaultFlagsType1(replaceDefaultFlagsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REPLACE_DEFAULT_FLAGS_TYPE2: {
				ReplaceDefaultFlagsType2 replaceDefaultFlagsType2 = (ReplaceDefaultFlagsType2)theEObject;
				Object result = caseReplaceDefaultFlagsType2(replaceDefaultFlagsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.REQUIRES_DRIVER_TYPE: {
				RequiresDriverType requiresDriverType = (RequiresDriverType)theEObject;
				Object result = caseRequiresDriverType(requiresDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RESET_TYPE: {
				ResetType resetType = (ResetType)theEObject;
				Object result = caseResetType(resetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RESET_TYPE1: {
				ResetType1 resetType1 = (ResetType1)theEObject;
				Object result = caseResetType1(resetType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RESOLVED_LIBRARY_REF_TYPE: {
				ResolvedLibraryRefType resolvedLibraryRefType = (ResolvedLibraryRefType)theEObject;
				Object result = caseResolvedLibraryRefType(resolvedLibraryRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RIGHT_TYPE: {
				RightType rightType = (RightType)theEObject;
				Object result = caseRightType(rightType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RIGHT_TYPE1: {
				RightType1 rightType1 = (RightType1)theEObject;
				Object result = caseRightType1(rightType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RIGHT_TYPE2: {
				RightType2 rightType2 = (RightType2)theEObject;
				Object result = caseRightType2(rightType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.RIGHT_TYPE11: {
				RightType11 rightType11 = (RightType11)theEObject;
				Object result = caseRightType11(rightType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SEGMENTS_TYPE: {
				SegmentsType segmentsType = (SegmentsType)theEObject;
				Object result = caseSegmentsType(segmentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SEGMENT_TYPE: {
				SegmentType segmentType = (SegmentType)theEObject;
				Object result = caseSegmentType(segmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				Object result = caseServiceType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SERVICE_TYPE1: {
				ServiceType1 serviceType1 = (ServiceType1)theEObject;
				Object result = caseServiceType1(serviceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SERVICE_TYPE_DEFS_TYPE: {
				ServiceTypeDefsType serviceTypeDefsType = (ServiceTypeDefsType)theEObject;
				Object result = caseServiceTypeDefsType(serviceTypeDefsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SERVICE_TYPE_DEF_TYPE: {
				ServiceTypeDefType serviceTypeDefType = (ServiceTypeDefType)theEObject;
				Object result = caseServiceTypeDefType(serviceTypeDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SINGLE_SHOT_DRIVER_TYPE: {
				SingleShotDriverType singleShotDriverType = (SingleShotDriverType)theEObject;
				Object result = caseSingleShotDriverType(singleShotDriverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SINGLE_SHOT_DURATION_TYPE: {
				SingleShotDurationType singleShotDurationType = (SingleShotDurationType)theEObject;
				Object result = caseSingleShotDurationType(singleShotDurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SINGLE_SHOT_OFFSET_TYPE: {
				SingleShotOffsetType singleShotOffsetType = (SingleShotOffsetType)theEObject;
				Object result = caseSingleShotOffsetType(singleShotOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SINGLE_SHOT_VALUE_TYPE: {
				SingleShotValueType singleShotValueType = (SingleShotValueType)theEObject;
				Object result = caseSingleShotValueType(singleShotValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SIZE_TYPE: {
				SizeType sizeType = (SizeType)theEObject;
				Object result = caseSizeType(sizeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SLAVE_TYPE: {
				SlaveType slaveType = (SlaveType)theEObject;
				Object result = caseSlaveType(slaveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SOURCE_FILE_TYPE: {
				SourceFileType sourceFileType = (SourceFileType)theEObject;
				Object result = caseSourceFileType(sourceFileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SOURCE_NAME_TYPE: {
				SourceNameType sourceNameType = (SourceNameType)theEObject;
				Object result = caseSourceNameType(sourceNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SUBSPACE_REF_TYPE: {
				SubspaceRefType subspaceRefType = (SubspaceRefType)theEObject;
				Object result = caseSubspaceRefType(subspaceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SYSTEM_GROUP_NAMES_TYPE: {
				SystemGroupNamesType systemGroupNamesType = (SystemGroupNamesType)theEObject;
				Object result = caseSystemGroupNamesType(systemGroupNamesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				Object result = caseSystemType(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TARGET_NAME_TYPE: {
				TargetNameType targetNameType = (TargetNameType)theEObject;
				Object result = caseTargetNameType(targetNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TESTABLE_TYPE: {
				TestableType testableType = (TestableType)theEObject;
				Object result = caseTestableType(testableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TIMING_CONSTRAINT_TYPE: {
				TimingConstraintType timingConstraintType = (TimingConstraintType)theEObject;
				Object result = caseTimingConstraintType(timingConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TRANSACTIONAL_TYPE: {
				TransactionalType transactionalType = (TransactionalType)theEObject;
				Object result = caseTransactionalType(transactionalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TRANSPORT_METHODS_TYPE: {
				TransportMethodsType transportMethodsType = (TransportMethodsType)theEObject;
				Object result = caseTransportMethodsType(transportMethodsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TRANS_TYPE_DEF_TYPE: {
				TransTypeDefType transTypeDefType = (TransTypeDefType)theEObject;
				Object result = caseTransTypeDefType(transTypeDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_NAME_TYPE: {
				TypeNameType typeNameType = (TypeNameType)theEObject;
				Object result = caseTypeNameType(typeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_NAME_TYPE1: {
				TypeNameType1 typeNameType1 = (TypeNameType1)theEObject;
				Object result = caseTypeNameType1(typeNameType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_NAME_TYPE2: {
				TypeNameType2 typeNameType2 = (TypeNameType2)theEObject;
				Object result = caseTypeNameType2(typeNameType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.TYPE_NAME_TYPE3: {
				TypeNameType3 typeNameType3 = (TypeNameType3)theEObject;
				Object result = caseTypeNameType3(typeNameType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VALUE_MASK_CONFIG_TYPE: {
				ValueMaskConfigType valueMaskConfigType = (ValueMaskConfigType)theEObject;
				Object result = caseValueMaskConfigType(valueMaskConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				Object result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VALUE_TYPE1: {
				ValueType1 valueType1 = (ValueType1)theEObject;
				Object result = caseValueType1(valueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VALUE_TYPE2: {
				ValueType2 valueType2 = (ValueType2)theEObject;
				Object result = caseValueType2(valueType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VECTOR_TYPE: {
				VectorType vectorType = (VectorType)theEObject;
				Object result = caseVectorType(vectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VECTOR_TYPE1: {
				VectorType1 vectorType1 = (VectorType1)theEObject;
				Object result = caseVectorType1(vectorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VECTOR_TYPE2: {
				VectorType2 vectorType2 = (VectorType2)theEObject;
				Object result = caseVectorType2(vectorType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VECTOR_TYPE11: {
				VectorType11 vectorType11 = (VectorType11)theEObject;
				Object result = caseVectorType11(vectorType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VENDOR_EXTENSIONS_TYPE: {
				VendorExtensionsType vendorExtensionsType = (VendorExtensionsType)theEObject;
				Object result = caseVendorExtensionsType(vendorExtensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VIEW_CONFIGURATION_TYPE: {
				ViewConfigurationType viewConfigurationType = (ViewConfigurationType)theEObject;
				Object result = caseViewConfigurationType(viewConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VIEWS_TYPE: {
				ViewsType viewsType = (ViewsType)theEObject;
				Object result = caseViewsType(viewsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VIEWS_TYPE1: {
				ViewsType1 viewsType1 = (ViewsType1)theEObject;
				Object result = caseViewsType1(viewsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.VIEW_TYPE: {
				ViewType viewType = (ViewType)theEObject;
				Object result = caseViewType(viewType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WHITEBOX_ELEMENT_REFS_TYPE: {
				WhiteboxElementRefsType whiteboxElementRefsType = (WhiteboxElementRefsType)theEObject;
				Object result = caseWhiteboxElementRefsType(whiteboxElementRefsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WHITEBOX_ELEMENT_REF_TYPE: {
				WhiteboxElementRefType whiteboxElementRefType = (WhiteboxElementRefType)theEObject;
				Object result = caseWhiteboxElementRefType(whiteboxElementRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WHITEBOX_ELEMENTS_TYPE: {
				WhiteboxElementsType whiteboxElementsType = (WhiteboxElementsType)theEObject;
				Object result = caseWhiteboxElementsType(whiteboxElementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WHITEBOX_ELEMENT_TYPE: {
				WhiteboxElementType whiteboxElementType = (WhiteboxElementType)theEObject;
				Object result = caseWhiteboxElementType(whiteboxElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WHITEBOX_PATH_TYPE: {
				WhiteboxPathType whiteboxPathType = (WhiteboxPathType)theEObject;
				Object result = caseWhiteboxPathType(whiteboxPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WIDTH_TYPE: {
				WidthType widthType = (WidthType)theEObject;
				Object result = caseWidthType(widthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WIRE_TYPE: {
				WireType wireType = (WireType)theEObject;
				Object result = caseWireType(wireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WIRE_TYPE_DEFS_TYPE: {
				WireTypeDefsType wireTypeDefsType = (WireTypeDefsType)theEObject;
				Object result = caseWireTypeDefsType(wireTypeDefsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WIRE_TYPE_DEF_TYPE: {
				WireTypeDefType wireTypeDefType = (WireTypeDefType)theEObject;
				Object result = caseWireTypeDefType(wireTypeDefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case _1Package.WRITE_VALUE_CONSTRAINT_TYPE: {
				WriteValueConstraintType writeValueConstraintType = (WriteValueConstraintType)theEObject;
				Object result = caseWriteValueConstraintType(writeValueConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractionDefinitionType(AbstractionDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Def Port Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Def Port Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractionDefPortConstraintsType(AbstractionDefPortConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Bus Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Bus Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorBusInterfaceType(AbstractorBusInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Generators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Generators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorGeneratorsType(AbstractorGeneratorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Interfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorInterfacesType(AbstractorInterfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorModelType(AbstractorModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Mode Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Mode Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorModeType1(AbstractorModeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorPortType(AbstractorPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Port Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Port Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorPortWireType(AbstractorPortWireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorsType(AbstractorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorType(AbstractorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorType1(AbstractorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstractor View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstractor View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAbstractorViewType(AbstractorViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Bank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Bank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddressBankType(AddressBankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddressBlockType(AddressBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddressOffsetType(AddressOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddressSpaceRefType(AddressSpaceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Spaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Spaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddressSpacesType(AddressSpacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddressSpaceType(AddressSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addr Space Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addr Space Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddrSpaceRefType(AddrSpaceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ad Hoc Connections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ad Hoc Connections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdHocConnectionsType(AdHocConnectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ad Hoc Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ad Hoc Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAdHocConnectionType(AdHocConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlternateGroupsType(AlternateGroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Registers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Registers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlternateRegistersType(AlternateRegistersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternate Register Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternate Register Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAlternateRegisterType(AlternateRegisterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArgumentType(ArgumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banked Bank Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banked Bank Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBankedBankType(BankedBankType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banked Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banked Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBankedBlockType(BankedBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banked Subspace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banked Subspace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBankedSubspaceType(BankedSubspaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Addresses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Addresses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBaseAddressesType(BaseAddressesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBaseAddressType(BaseAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Address Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Address Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBaseAddressType1(BaseAddressType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Steering Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Steering Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBitSteeringType1(BitSteeringType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit Width Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBitWidthType(BitWidthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bridge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBridgeType(BridgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBuildCommandType(BuildCommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusDefinitionType(BusDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Interfaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Interfaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusInterfacesType(BusInterfacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus Interface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus Interface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBusInterfaceType(BusInterfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCellClassType(CellClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCellFunctionType(CellFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCellSpecificationType(CellSpecificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChannelsType(ChannelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChannelType(ChannelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choices Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choices Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChoicesType(ChoicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChoiceType(ChoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockDriverType(ClockDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Driver Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Driver Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockDriverType1(ClockDriverType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockPeriodType(ClockPeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Pulse Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Pulse Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockPulseDurationType(ClockPulseDurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Pulse Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Pulse Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockPulseOffsetType(ClockPulseOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Pulse Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Pulse Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClockPulseValueType(ClockPulseValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Line Switch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line Switch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommandLineSwitchType(CommandLineSwitchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommandType(CommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommandType1(CommandType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCommandType2(CommandType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Generators Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Generators Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentGeneratorsType(ComponentGeneratorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Generator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Generator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentGeneratorType(ComponentGeneratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentInstancesType(ComponentInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentInstanceType(ComponentInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable Element Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable Element Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfigurableElementValuesType(ConfigurableElementValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configurable Element Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configurable Element Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfigurableElementValueType(ConfigurableElementValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectionType(ConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Sets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Sets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraintSetsType(ConstraintSetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraintSetType(ConstraintSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpus Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpus Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCpusType(CpusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCpuType(CpuType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultValueType(DefaultValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDesignConfigurationType(DesignConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDesignType(DesignType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabled Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabled Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDisabledType(DisabledType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drive Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drive Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDriveConstraintType(DriveConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDriverType(DriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnableType(EnableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeratedValuesType(EnumeratedValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeratedValueType(EnumeratedValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumerationType(EnumerationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Image Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Image Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutableImageType(ExecutableImageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Port Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Port Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalPortReferenceType(ExternalPortReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFieldType(FieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Builder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Builder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileBuilderType(FileBuilderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Builder Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Builder Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileBuilderType1(FileBuilderType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Ref Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Ref Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileSetRefGroupType(FileSetRefGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Ref Group Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Ref Group Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileSetRefGroupType1(FileSetRefGroupType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileSetRefType(FileSetRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Sets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Sets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileSetsType(FileSetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileSetType(FileSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlagsType(FlagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flags Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flags Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlagsType1(FlagsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flags Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flags Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlagsType2(FlagsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Chain Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Chain Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneratorChainConfigurationType(GeneratorChainConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Chain Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Chain Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneratorChainSelectorType(GeneratorChainSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Chain Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Chain Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneratorChainType(GeneratorChainType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneratorSelectorType(GeneratorSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneratorType(GeneratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGeneratorType1(GeneratorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGroupSelectorType(GroupSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hier Connections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hier Connections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHierConnectionsType(HierConnectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hier Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hier Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHierConnectionType(HierConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hier Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hier Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseHierInterface(HierInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Generator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Generator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInstanceGeneratorType(InstanceGeneratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnection Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnection Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterconnectionConfigurationType(InterconnectionConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterconnectionsType(InterconnectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconnection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconnection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterconnectionType(InterconnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Port Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Port Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInternalPortReferenceType(InternalPortReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Include File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Include File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIsIncludeFileType(IsIncludeFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Tools Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Tools Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLanguageToolsType(LanguageToolsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLanguageType(LanguageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLanguageType1(LanguageType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeftType(LeftType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeftType1(LeftType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeftType2(LeftType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeftType11(LeftType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLibraryRefType(LibraryRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linker Command File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linker Command File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkerCommandFileType(LinkerCommandFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linker Flags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linker Flags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkerFlagsType(LinkerFlagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linker Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linker Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLinkerType(LinkerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoadConstraintType(LoadConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Memory Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Memory Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLocalMemoryMapType(LocalMemoryMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLogicalNameType(LogicalNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLogicalPortType(LogicalPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Port Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Port Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLogicalPortType1(LogicalPortType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMaskType(MaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMaskType1(MaskType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMasterType(MasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMaximumType(MaximumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Map Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Map Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMemoryMapRefType(MemoryMapRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMemoryMapsType(MemoryMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMemoryMapType(MemoryMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Remap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Remap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMemoryRemapType(MemoryRemapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minimum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minimum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMinimumType(MinimumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirrored Master Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirrored Master Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMirroredMasterType(MirroredMasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirrored Slave Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirrored Slave Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMirroredSlaveType(MirroredSlaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mirrored System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mirrored System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMirroredSystemType(MirroredSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelParametersType(ModelParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Parameters Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Parameters Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelParametersType1(ModelParametersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor Interconnection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor Interconnection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMonitorInterconnectionType(MonitorInterconnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMonitorType(MonitorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameType(NameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameType1(NameType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameType2(NameType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Value Pair Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Value Pair Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameValuePairType(NameValuePairType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Value Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Value Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameValueTypeType(NameValueTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Master Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Master Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnMasterType(OnMasterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Master Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Master Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnMasterType1(OnMasterType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Slave Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Slave Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnSlaveType(OnSlaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Slave Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Slave Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnSlaveType1(OnSlaveType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnSystemType(OnSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On System Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On System Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOnSystemType1(OnSystemType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Clock Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Clock Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOtherClockDriverType(OtherClockDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Clocks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Clocks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOtherClocks(OtherClocks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParametersType(ParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseParametersType1(ParametersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePhaseType(PhaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePhysicalPortType(PhysicalPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Port Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Port Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePhysicalPortType1(PhysicalPortType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Access Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Access Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortAccessType(PortAccessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Declaration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Declaration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortDeclarationType(PortDeclarationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Maps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Maps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortMapsType(PortMapsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Maps Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Maps Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortMapsType1(PortMapsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortMapType(PortMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Map Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Map Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortMapType1(PortMapType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortsType(PortsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortsType1(PortsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ports Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ports Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortsType2(PortsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Transactional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Transactional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortTransactionalType(PortTransactionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortType(PortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortType1(PortType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortWireType(PortWireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQualifierType(QualifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualifier Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualifier Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseQualifierType1(QualifierType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRangeType(RangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRangeType1(RangeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRangeType2(RangeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRangeType3(RangeType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegisterFileType(RegisterFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRegisterType(RegisterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemapAddressType(RemapAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap Ports Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap Ports Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemapPortsType(RemapPortsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap Port Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemapPortType(RemapPortType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap States Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap States Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemapStatesType(RemapStatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remap State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remap State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRemapStateType(RemapStateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Default Flags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Default Flags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReplaceDefaultFlagsType(ReplaceDefaultFlagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Default Flags Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Default Flags Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReplaceDefaultFlagsType1(ReplaceDefaultFlagsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Default Flags Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Default Flags Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReplaceDefaultFlagsType2(ReplaceDefaultFlagsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequiresDriverType(RequiresDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResetType(ResetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reset Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reset Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResetType1(ResetType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolved Library Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolved Library Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseResolvedLibraryRefType(ResolvedLibraryRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRightType(RightType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRightType1(RightType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRightType2(RightType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRightType11(RightType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSegmentsType(SegmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSegmentType(SegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceType1(ServiceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type Defs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type Defs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceTypeDefsType(ServiceTypeDefsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceTypeDefType(ServiceTypeDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Driver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Driver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleShotDriverType(SingleShotDriverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Duration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Duration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleShotDurationType(SingleShotDurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleShotOffsetType(SingleShotOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Shot Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Shot Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSingleShotValueType(SingleShotValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Size Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Size Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSizeType(SizeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slave Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slave Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSlaveType(SlaveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSourceFileType(SourceFileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSourceNameType(SourceNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subspace Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subspace Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSubspaceRefType(SubspaceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Group Names Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Group Names Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSystemGroupNamesType(SystemGroupNamesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTargetNameType(TargetNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTestableType(TestableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTimingConstraintType(TimingConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transactional Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transactional Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransactionalType(TransactionalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Methods Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Methods Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransportMethodsType(TransportMethodsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trans Type Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trans Type Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransTypeDefType(TransTypeDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeNameType(TypeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeNameType1(TypeNameType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeNameType2(TypeNameType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeNameType3(TypeNameType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Mask Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Mask Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueMaskConfigType(ValueMaskConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueType1(ValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueType2(ValueType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVectorType(VectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVectorType1(VectorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVectorType2(VectorType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVectorType11(VectorType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Extensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVendorExtensionsType(VendorExtensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewConfigurationType(ViewConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Views Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Views Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewsType(ViewsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Views Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Views Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewsType1(ViewsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseViewType(ViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Element Refs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Element Refs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhiteboxElementRefsType(WhiteboxElementRefsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Element Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Element Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhiteboxElementRefType(WhiteboxElementRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhiteboxElementsType(WhiteboxElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhiteboxElementType(WhiteboxElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Whitebox Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Whitebox Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhiteboxPathType(WhiteboxPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Width Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Width Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWidthType(WidthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWireType(WireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type Defs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type Defs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWireTypeDefsType(WireTypeDefsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Type Def Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Type Def Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWireTypeDefType(WireTypeDefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Value Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Value Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWriteValueConstraintType(WriteValueConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //_1Switch
