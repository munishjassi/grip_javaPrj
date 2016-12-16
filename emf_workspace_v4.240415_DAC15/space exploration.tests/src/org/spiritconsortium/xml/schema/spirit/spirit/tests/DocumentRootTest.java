/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractionDefinition() <em>Abstraction Definition</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractorGenerator() <em>Abstractor Generator</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractorGenerators() <em>Abstractor Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getCellSpecification() <em>Cell Specification</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getChoices() <em>Choices</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getClockDriver() <em>Clock Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentGenerator() <em>Component Generator</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentGenerators() <em>Component Generators</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSet() <em>Constraint Set</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSetRef() <em>Constraint Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSets() <em>Constraint Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDefaultValue() <em>Default Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDependency() <em>Dependency</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDescription() <em>Description</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDisplayName() <em>Display Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDriveConstraint() <em>Drive Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDriver() <em>Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getExecutableImage() <em>Executable Image</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFile() <em>File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSet() <em>File Set</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSetRef() <em>File Set Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSets() <em>File Sets</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGenerator() <em>Generator</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGeneratorChain() <em>Generator Chain</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGeneratorRef() <em>Generator Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGroupSelector() <em>Group Selector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInitiative() <em>Initiative</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getLoadConstraint() <em>Load Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getOtherClockDriver() <em>Other Clock Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getParameter() <em>Parameter</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getParameters() <em>Parameters</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPhase() <em>Phase</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPort() <em>Port</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPortAccessHandle() <em>Port Access Handle</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPortAccessType() <em>Port Access Type</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPresence() <em>Presence</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRequiresDriver() <em>Requires Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getServiceTypeDef() <em>Service Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getServiceTypeDefs() <em>Service Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getSingleShotDriver() <em>Single Shot Driver</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getTimingConstraint() <em>Timing Constraint</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getTransTypeDef() <em>Trans Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getVector() <em>Vector</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getVendorExtensions() <em>Vendor Extensions</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getWireTypeDef() <em>Wire Type Def</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getWireTypeDefs() <em>Wire Type Defs</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractor() <em>Abstractor</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAccess() <em>Access</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressBlock() <em>Address Block</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressSpaceRef() <em>Address Space Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressSpaces() <em>Address Spaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressUnitBits() <em>Address Unit Bits</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAdHocConnection() <em>Ad Hoc Connection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAdHocConnections() <em>Ad Hoc Connections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBank() <em>Bank</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBaseAddress() <em>Base Address</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBitsInLau() <em>Bits In Lau</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusInterface() <em>Bus Interface</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusInterfaces() <em>Bus Interfaces</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getChannels() <em>Channels</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentInstance() <em>Component Instance</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentInstances() <em>Component Instances</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConfigurableElementValue() <em>Configurable Element Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConfigurableElementValues() <em>Configurable Element Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getEnumeratedValues() <em>Enumerated Values</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGroup() <em>Group</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInstanceName() <em>Instance Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInterconnection() <em>Interconnection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInterconnections() <em>Interconnections</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMemoryMapRef() <em>Memory Map Ref</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMemoryMaps() <em>Memory Maps</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getModel() <em>Model</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMonitorInterconnection() <em>Monitor Interconnection</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRegisterFile() <em>Register File</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRemapStates() <em>Remap States</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#isVolatile() <em>Volatile</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusDefinition() <em>Bus Definition</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponent() <em>Component</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDesign() <em>Design</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDesignConfiguration() <em>Design Configuration</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DocumentRootTest extends TestCase {

	/**
	 * The fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRoot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentRootTest.class);
	}

	/**
	 * Constructs a new Document Root test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DocumentRoot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document Root test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DocumentRoot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(_1Factory.eINSTANCE.createDocumentRoot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractionDefinition() <em>Abstraction Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractionDefinition()
	 * @generated
	 */
	public void testGetAbstractionDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractionDefinition(org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefinitionType) <em>Abstraction Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractionDefinition(org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefinitionType)
	 * @generated
	 */
	public void testSetAbstractionDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractorGenerator() <em>Abstractor Generator</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractorGenerator()
	 * @generated
	 */
	public void testGetAbstractorGenerator() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractorGenerator(org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType) <em>Abstractor Generator</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractorGenerator(org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType)
	 * @generated
	 */
	public void testSetAbstractorGenerator() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractorGenerators() <em>Abstractor Generators</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractorGenerators()
	 * @generated
	 */
	public void testGetAbstractorGenerators() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractorGenerators(org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType) <em>Abstractor Generators</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractorGenerators(org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType)
	 * @generated
	 */
	public void testSetAbstractorGenerators() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getCellSpecification() <em>Cell Specification</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getCellSpecification()
	 * @generated
	 */
	public void testGetCellSpecification() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setCellSpecification(org.spiritconsortium.xml.schema.spirit.spirit.CellSpecificationType) <em>Cell Specification</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setCellSpecification(org.spiritconsortium.xml.schema.spirit.spirit.CellSpecificationType)
	 * @generated
	 */
	public void testSetCellSpecification() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getChoices() <em>Choices</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getChoices()
	 * @generated
	 */
	public void testGetChoices() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setChoices(org.spiritconsortium.xml.schema.spirit.spirit.ChoicesType) <em>Choices</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setChoices(org.spiritconsortium.xml.schema.spirit.spirit.ChoicesType)
	 * @generated
	 */
	public void testSetChoices() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getClockDriver() <em>Clock Driver</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getClockDriver()
	 * @generated
	 */
	public void testGetClockDriver() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setClockDriver(org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType1) <em>Clock Driver</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setClockDriver(org.spiritconsortium.xml.schema.spirit.spirit.ClockDriverType1)
	 * @generated
	 */
	public void testSetClockDriver() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentGenerator() <em>Component Generator</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentGenerator()
	 * @generated
	 */
	public void testGetComponentGenerator() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentGenerator(org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType) <em>Component Generator</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentGenerator(org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType)
	 * @generated
	 */
	public void testSetComponentGenerator() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentGenerators() <em>Component Generators</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentGenerators()
	 * @generated
	 */
	public void testGetComponentGenerators() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentGenerators(org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorsType) <em>Component Generators</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentGenerators(org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorsType)
	 * @generated
	 */
	public void testSetComponentGenerators() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSet() <em>Constraint Set</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSet()
	 * @generated
	 */
	public void testGetConstraintSet() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConstraintSet(org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType) <em>Constraint Set</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConstraintSet(org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetType)
	 * @generated
	 */
	public void testSetConstraintSet() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSetRef() <em>Constraint Set Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSetRef()
	 * @generated
	 */
	public void testGetConstraintSetRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConstraintSetRef(java.lang.String) <em>Constraint Set Ref</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConstraintSetRef(java.lang.String)
	 * @generated
	 */
	public void testSetConstraintSetRef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSets() <em>Constraint Sets</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConstraintSets()
	 * @generated
	 */
	public void testGetConstraintSets() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConstraintSets(org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType) <em>Constraint Sets</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConstraintSets(org.spiritconsortium.xml.schema.spirit.spirit.ConstraintSetsType)
	 * @generated
	 */
	public void testSetConstraintSets() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDefaultValue() <em>Default Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDefaultValue()
	 * @generated
	 */
	public void testGetDefaultValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDefaultValue(org.spiritconsortium.xml.schema.spirit.spirit.DefaultValueType) <em>Default Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDefaultValue(org.spiritconsortium.xml.schema.spirit.spirit.DefaultValueType)
	 * @generated
	 */
	public void testSetDefaultValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDependency() <em>Dependency</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDependency()
	 * @generated
	 */
	public void testGetDependency() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDependency(java.lang.String) <em>Dependency</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDependency(java.lang.String)
	 * @generated
	 */
	public void testSetDependency() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDescription() <em>Description</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDescription()
	 * @generated
	 */
	public void testGetDescription() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDescription(java.lang.String) <em>Description</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDescription(java.lang.String)
	 * @generated
	 */
	public void testSetDescription() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDisplayName() <em>Display Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDisplayName()
	 * @generated
	 */
	public void testGetDisplayName() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDisplayName(java.lang.String) <em>Display Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDisplayName(java.lang.String)
	 * @generated
	 */
	public void testSetDisplayName() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDriveConstraint() <em>Drive Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDriveConstraint()
	 * @generated
	 */
	public void testGetDriveConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDriveConstraint(org.spiritconsortium.xml.schema.spirit.spirit.DriveConstraintType) <em>Drive Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDriveConstraint(org.spiritconsortium.xml.schema.spirit.spirit.DriveConstraintType)
	 * @generated
	 */
	public void testSetDriveConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDriver() <em>Driver</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDriver()
	 * @generated
	 */
	public void testGetDriver() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDriver(org.spiritconsortium.xml.schema.spirit.spirit.DriverType) <em>Driver</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDriver(org.spiritconsortium.xml.schema.spirit.spirit.DriverType)
	 * @generated
	 */
	public void testSetDriver() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getExecutableImage() <em>Executable Image</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getExecutableImage()
	 * @generated
	 */
	public void testGetExecutableImage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setExecutableImage(org.spiritconsortium.xml.schema.spirit.spirit.ExecutableImageType) <em>Executable Image</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setExecutableImage(org.spiritconsortium.xml.schema.spirit.spirit.ExecutableImageType)
	 * @generated
	 */
	public void testSetExecutableImage() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFile() <em>File</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFile()
	 * @generated
	 */
	public void testGetFile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFile(org.spiritconsortium.xml.schema.spirit.spirit.FileType) <em>File</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFile(org.spiritconsortium.xml.schema.spirit.spirit.FileType)
	 * @generated
	 */
	public void testSetFile() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSet() <em>File Set</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSet()
	 * @generated
	 */
	public void testGetFileSet() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFileSet(org.spiritconsortium.xml.schema.spirit.spirit.FileSetType) <em>File Set</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFileSet(org.spiritconsortium.xml.schema.spirit.spirit.FileSetType)
	 * @generated
	 */
	public void testSetFileSet() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSetRef() <em>File Set Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSetRef()
	 * @generated
	 */
	public void testGetFileSetRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFileSetRef(org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType) <em>File Set Ref</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFileSetRef(org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType)
	 * @generated
	 */
	public void testSetFileSetRef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSets() <em>File Sets</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getFileSets()
	 * @generated
	 */
	public void testGetFileSets() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFileSets(org.spiritconsortium.xml.schema.spirit.spirit.FileSetsType) <em>File Sets</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setFileSets(org.spiritconsortium.xml.schema.spirit.spirit.FileSetsType)
	 * @generated
	 */
	public void testSetFileSets() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGenerator() <em>Generator</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGenerator()
	 * @generated
	 */
	public void testGetGenerator() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGenerator(org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType) <em>Generator</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGenerator(org.spiritconsortium.xml.schema.spirit.spirit.GeneratorType)
	 * @generated
	 */
	public void testSetGenerator() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGeneratorChain() <em>Generator Chain</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGeneratorChain()
	 * @generated
	 */
	public void testGetGeneratorChain() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGeneratorChain(org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainType) <em>Generator Chain</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGeneratorChain(org.spiritconsortium.xml.schema.spirit.spirit.GeneratorChainType)
	 * @generated
	 */
	public void testSetGeneratorChain() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGeneratorRef() <em>Generator Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGeneratorRef()
	 * @generated
	 */
	public void testGetGeneratorRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGeneratorRef(java.lang.String) <em>Generator Ref</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGeneratorRef(java.lang.String)
	 * @generated
	 */
	public void testSetGeneratorRef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGroupSelector() <em>Group Selector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGroupSelector()
	 * @generated
	 */
	public void testGetGroupSelector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGroupSelector(org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType) <em>Group Selector</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGroupSelector(org.spiritconsortium.xml.schema.spirit.spirit.GroupSelectorType)
	 * @generated
	 */
	public void testSetGroupSelector() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInitiative() <em>Initiative</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInitiative()
	 * @generated
	 */
	public void testGetInitiative() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInitiative(org.spiritconsortium.xml.schema.spirit.spirit.InitiativeType) <em>Initiative</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInitiative(org.spiritconsortium.xml.schema.spirit.spirit.InitiativeType)
	 * @generated
	 */
	public void testSetInitiative() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getLoadConstraint() <em>Load Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getLoadConstraint()
	 * @generated
	 */
	public void testGetLoadConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setLoadConstraint(org.spiritconsortium.xml.schema.spirit.spirit.LoadConstraintType) <em>Load Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setLoadConstraint(org.spiritconsortium.xml.schema.spirit.spirit.LoadConstraintType)
	 * @generated
	 */
	public void testSetLoadConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getOtherClockDriver() <em>Other Clock Driver</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getOtherClockDriver()
	 * @generated
	 */
	public void testGetOtherClockDriver() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setOtherClockDriver(org.spiritconsortium.xml.schema.spirit.spirit.OtherClockDriverType) <em>Other Clock Driver</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setOtherClockDriver(org.spiritconsortium.xml.schema.spirit.spirit.OtherClockDriverType)
	 * @generated
	 */
	public void testSetOtherClockDriver() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getParameter() <em>Parameter</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getParameter()
	 * @generated
	 */
	public void testGetParameter() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setParameter(org.spiritconsortium.xml.schema.spirit.spirit.NameValuePairType) <em>Parameter</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setParameter(org.spiritconsortium.xml.schema.spirit.spirit.NameValuePairType)
	 * @generated
	 */
	public void testSetParameter() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getParameters() <em>Parameters</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getParameters()
	 * @generated
	 */
	public void testGetParameters() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setParameters(org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1) <em>Parameters</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setParameters(org.spiritconsortium.xml.schema.spirit.spirit.ParametersType1)
	 * @generated
	 */
	public void testSetParameters() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPhase() <em>Phase</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPhase()
	 * @generated
	 */
	public void testGetPhase() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPhase(org.spiritconsortium.xml.schema.spirit.spirit.PhaseType) <em>Phase</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPhase(org.spiritconsortium.xml.schema.spirit.spirit.PhaseType)
	 * @generated
	 */
	public void testSetPhase() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPort() <em>Port</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPort()
	 * @generated
	 */
	public void testGetPort() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPort(org.spiritconsortium.xml.schema.spirit.spirit.PortType) <em>Port</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPort(org.spiritconsortium.xml.schema.spirit.spirit.PortType)
	 * @generated
	 */
	public void testSetPort() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPortAccessHandle() <em>Port Access Handle</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPortAccessHandle()
	 * @generated
	 */
	public void testGetPortAccessHandle() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPortAccessHandle(java.lang.String) <em>Port Access Handle</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPortAccessHandle(java.lang.String)
	 * @generated
	 */
	public void testSetPortAccessHandle() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPortAccessType() <em>Port Access Type</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPortAccessType()
	 * @generated
	 */
	public void testGetPortAccessType() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPortAccessType(org.spiritconsortium.xml.schema.spirit.spirit.PortAccessTypeType) <em>Port Access Type</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPortAccessType(org.spiritconsortium.xml.schema.spirit.spirit.PortAccessTypeType)
	 * @generated
	 */
	public void testSetPortAccessType() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPresence() <em>Presence</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getPresence()
	 * @generated
	 */
	public void testGetPresence() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPresence(org.spiritconsortium.xml.schema.spirit.spirit.PresenceType) <em>Presence</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setPresence(org.spiritconsortium.xml.schema.spirit.spirit.PresenceType)
	 * @generated
	 */
	public void testSetPresence() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRequiresDriver() <em>Requires Driver</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRequiresDriver()
	 * @generated
	 */
	public void testGetRequiresDriver() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setRequiresDriver(org.spiritconsortium.xml.schema.spirit.spirit.RequiresDriverType) <em>Requires Driver</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setRequiresDriver(org.spiritconsortium.xml.schema.spirit.spirit.RequiresDriverType)
	 * @generated
	 */
	public void testSetRequiresDriver() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getServiceTypeDef() <em>Service Type Def</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getServiceTypeDef()
	 * @generated
	 */
	public void testGetServiceTypeDef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setServiceTypeDef(org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefType) <em>Service Type Def</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setServiceTypeDef(org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefType)
	 * @generated
	 */
	public void testSetServiceTypeDef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getServiceTypeDefs() <em>Service Type Defs</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getServiceTypeDefs()
	 * @generated
	 */
	public void testGetServiceTypeDefs() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setServiceTypeDefs(org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType) <em>Service Type Defs</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setServiceTypeDefs(org.spiritconsortium.xml.schema.spirit.spirit.ServiceTypeDefsType)
	 * @generated
	 */
	public void testSetServiceTypeDefs() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getSingleShotDriver() <em>Single Shot Driver</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getSingleShotDriver()
	 * @generated
	 */
	public void testGetSingleShotDriver() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setSingleShotDriver(org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDriverType) <em>Single Shot Driver</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setSingleShotDriver(org.spiritconsortium.xml.schema.spirit.spirit.SingleShotDriverType)
	 * @generated
	 */
	public void testSetSingleShotDriver() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getTimingConstraint() <em>Timing Constraint</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getTimingConstraint()
	 * @generated
	 */
	public void testGetTimingConstraint() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setTimingConstraint(org.spiritconsortium.xml.schema.spirit.spirit.TimingConstraintType) <em>Timing Constraint</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setTimingConstraint(org.spiritconsortium.xml.schema.spirit.spirit.TimingConstraintType)
	 * @generated
	 */
	public void testSetTimingConstraint() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getTransTypeDef() <em>Trans Type Def</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getTransTypeDef()
	 * @generated
	 */
	public void testGetTransTypeDef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setTransTypeDef(org.spiritconsortium.xml.schema.spirit.spirit.TransTypeDefType) <em>Trans Type Def</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setTransTypeDef(org.spiritconsortium.xml.schema.spirit.spirit.TransTypeDefType)
	 * @generated
	 */
	public void testSetTransTypeDef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getVector() <em>Vector</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getVector()
	 * @generated
	 */
	public void testGetVector() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setVector(org.spiritconsortium.xml.schema.spirit.spirit.VectorType2) <em>Vector</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setVector(org.spiritconsortium.xml.schema.spirit.spirit.VectorType2)
	 * @generated
	 */
	public void testSetVector() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getVendorExtensions() <em>Vendor Extensions</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getVendorExtensions()
	 * @generated
	 */
	public void testGetVendorExtensions() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setVendorExtensions(org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType) <em>Vendor Extensions</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setVendorExtensions(org.spiritconsortium.xml.schema.spirit.spirit.VendorExtensionsType)
	 * @generated
	 */
	public void testSetVendorExtensions() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getWireTypeDef() <em>Wire Type Def</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getWireTypeDef()
	 * @generated
	 */
	public void testGetWireTypeDef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setWireTypeDef(org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefType) <em>Wire Type Def</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setWireTypeDef(org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefType)
	 * @generated
	 */
	public void testSetWireTypeDef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getWireTypeDefs() <em>Wire Type Defs</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getWireTypeDefs()
	 * @generated
	 */
	public void testGetWireTypeDefs() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setWireTypeDefs(org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefsType) <em>Wire Type Defs</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setWireTypeDefs(org.spiritconsortium.xml.schema.spirit.spirit.WireTypeDefsType)
	 * @generated
	 */
	public void testSetWireTypeDefs() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractor() <em>Abstractor</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAbstractor()
	 * @generated
	 */
	public void testGetAbstractor() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractor(org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1) <em>Abstractor</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAbstractor(org.spiritconsortium.xml.schema.spirit.spirit.AbstractorType1)
	 * @generated
	 */
	public void testSetAbstractor() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAccess() <em>Access</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAccess()
	 * @generated
	 */
	public void testGetAccess() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAccess(org.spiritconsortium.xml.schema.spirit.spirit.AccessType) <em>Access</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAccess(org.spiritconsortium.xml.schema.spirit.spirit.AccessType)
	 * @generated
	 */
	public void testSetAccess() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressBlock() <em>Address Block</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressBlock()
	 * @generated
	 */
	public void testGetAddressBlock() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressBlock(org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType) <em>Address Block</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressBlock(org.spiritconsortium.xml.schema.spirit.spirit.AddressBlockType)
	 * @generated
	 */
	public void testSetAddressBlock() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressSpaceRef() <em>Address Space Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressSpaceRef()
	 * @generated
	 */
	public void testGetAddressSpaceRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressSpaceRef(org.spiritconsortium.xml.schema.spirit.spirit.AddrSpaceRefType) <em>Address Space Ref</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressSpaceRef(org.spiritconsortium.xml.schema.spirit.spirit.AddrSpaceRefType)
	 * @generated
	 */
	public void testSetAddressSpaceRef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressSpaces() <em>Address Spaces</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressSpaces()
	 * @generated
	 */
	public void testGetAddressSpaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressSpaces(org.spiritconsortium.xml.schema.spirit.spirit.AddressSpacesType) <em>Address Spaces</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressSpaces(org.spiritconsortium.xml.schema.spirit.spirit.AddressSpacesType)
	 * @generated
	 */
	public void testSetAddressSpaces() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressUnitBits() <em>Address Unit Bits</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAddressUnitBits()
	 * @generated
	 */
	public void testGetAddressUnitBits() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressUnitBits(java.math.BigInteger) <em>Address Unit Bits</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAddressUnitBits(java.math.BigInteger)
	 * @generated
	 */
	public void testSetAddressUnitBits() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAdHocConnection() <em>Ad Hoc Connection</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAdHocConnection()
	 * @generated
	 */
	public void testGetAdHocConnection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAdHocConnection(org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType) <em>Ad Hoc Connection</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAdHocConnection(org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionType)
	 * @generated
	 */
	public void testSetAdHocConnection() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAdHocConnections() <em>Ad Hoc Connections</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getAdHocConnections()
	 * @generated
	 */
	public void testGetAdHocConnections() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAdHocConnections(org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType) <em>Ad Hoc Connections</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setAdHocConnections(org.spiritconsortium.xml.schema.spirit.spirit.AdHocConnectionsType)
	 * @generated
	 */
	public void testSetAdHocConnections() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBank() <em>Bank</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBank()
	 * @generated
	 */
	public void testGetBank() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBank(org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType) <em>Bank</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBank(org.spiritconsortium.xml.schema.spirit.spirit.AddressBankType)
	 * @generated
	 */
	public void testSetBank() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBaseAddress() <em>Base Address</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBaseAddress()
	 * @generated
	 */
	public void testGetBaseAddress() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBaseAddress(org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType1) <em>Base Address</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBaseAddress(org.spiritconsortium.xml.schema.spirit.spirit.BaseAddressType1)
	 * @generated
	 */
	public void testSetBaseAddress() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBitsInLau() <em>Bits In Lau</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBitsInLau()
	 * @generated
	 */
	public void testGetBitsInLau() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBitsInLau(java.math.BigInteger) <em>Bits In Lau</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBitsInLau(java.math.BigInteger)
	 * @generated
	 */
	public void testSetBitsInLau() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusInterface() <em>Bus Interface</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusInterface()
	 * @generated
	 */
	public void testGetBusInterface() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBusInterface(org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType) <em>Bus Interface</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBusInterface(org.spiritconsortium.xml.schema.spirit.spirit.BusInterfaceType)
	 * @generated
	 */
	public void testSetBusInterface() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusInterfaces() <em>Bus Interfaces</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusInterfaces()
	 * @generated
	 */
	public void testGetBusInterfaces() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBusInterfaces(org.spiritconsortium.xml.schema.spirit.spirit.BusInterfacesType) <em>Bus Interfaces</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBusInterfaces(org.spiritconsortium.xml.schema.spirit.spirit.BusInterfacesType)
	 * @generated
	 */
	public void testSetBusInterfaces() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getChannels() <em>Channels</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getChannels()
	 * @generated
	 */
	public void testGetChannels() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setChannels(org.spiritconsortium.xml.schema.spirit.spirit.ChannelsType) <em>Channels</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setChannels(org.spiritconsortium.xml.schema.spirit.spirit.ChannelsType)
	 * @generated
	 */
	public void testSetChannels() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentInstance() <em>Component Instance</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentInstance()
	 * @generated
	 */
	public void testGetComponentInstance() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentInstance(org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType) <em>Component Instance</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentInstance(org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstanceType)
	 * @generated
	 */
	public void testSetComponentInstance() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentInstances() <em>Component Instances</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponentInstances()
	 * @generated
	 */
	public void testGetComponentInstances() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentInstances(org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType) <em>Component Instances</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponentInstances(org.spiritconsortium.xml.schema.spirit.spirit.ComponentInstancesType)
	 * @generated
	 */
	public void testSetComponentInstances() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConfigurableElementValue() <em>Configurable Element Value</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConfigurableElementValue()
	 * @generated
	 */
	public void testGetConfigurableElementValue() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConfigurableElementValue(org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValueType) <em>Configurable Element Value</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConfigurableElementValue(org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValueType)
	 * @generated
	 */
	public void testSetConfigurableElementValue() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConfigurableElementValues() <em>Configurable Element Values</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getConfigurableElementValues()
	 * @generated
	 */
	public void testGetConfigurableElementValues() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConfigurableElementValues(org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValuesType) <em>Configurable Element Values</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setConfigurableElementValues(org.spiritconsortium.xml.schema.spirit.spirit.ConfigurableElementValuesType)
	 * @generated
	 */
	public void testSetConfigurableElementValues() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getEnumeratedValues() <em>Enumerated Values</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getEnumeratedValues()
	 * @generated
	 */
	public void testGetEnumeratedValues() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setEnumeratedValues(org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValuesType) <em>Enumerated Values</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setEnumeratedValues(org.spiritconsortium.xml.schema.spirit.spirit.EnumeratedValuesType)
	 * @generated
	 */
	public void testSetEnumeratedValues() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGroup() <em>Group</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getGroup()
	 * @generated
	 */
	public void testGetGroup() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGroup(java.lang.String) <em>Group</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setGroup(java.lang.String)
	 * @generated
	 */
	public void testSetGroup() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInstanceName() <em>Instance Name</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInstanceName()
	 * @generated
	 */
	public void testGetInstanceName() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInstanceName(java.lang.String) <em>Instance Name</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInstanceName(java.lang.String)
	 * @generated
	 */
	public void testSetInstanceName() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInterconnection() <em>Interconnection</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInterconnection()
	 * @generated
	 */
	public void testGetInterconnection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInterconnection(org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType) <em>Interconnection</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInterconnection(org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionType)
	 * @generated
	 */
	public void testSetInterconnection() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInterconnections() <em>Interconnections</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getInterconnections()
	 * @generated
	 */
	public void testGetInterconnections() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInterconnections(org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType) <em>Interconnections</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setInterconnections(org.spiritconsortium.xml.schema.spirit.spirit.InterconnectionsType)
	 * @generated
	 */
	public void testSetInterconnections() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMemoryMapRef() <em>Memory Map Ref</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMemoryMapRef()
	 * @generated
	 */
	public void testGetMemoryMapRef() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setMemoryMapRef(org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapRefType) <em>Memory Map Ref</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setMemoryMapRef(org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapRefType)
	 * @generated
	 */
	public void testSetMemoryMapRef() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMemoryMaps() <em>Memory Maps</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMemoryMaps()
	 * @generated
	 */
	public void testGetMemoryMaps() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setMemoryMaps(org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapsType) <em>Memory Maps</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setMemoryMaps(org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapsType)
	 * @generated
	 */
	public void testSetMemoryMaps() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getModel() <em>Model</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getModel()
	 * @generated
	 */
	public void testGetModel() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setModel(org.spiritconsortium.xml.schema.spirit.spirit.ModelType) <em>Model</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setModel(org.spiritconsortium.xml.schema.spirit.spirit.ModelType)
	 * @generated
	 */
	public void testSetModel() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMonitorInterconnection() <em>Monitor Interconnection</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getMonitorInterconnection()
	 * @generated
	 */
	public void testGetMonitorInterconnection() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setMonitorInterconnection(org.spiritconsortium.xml.schema.spirit.spirit.MonitorInterconnectionType) <em>Monitor Interconnection</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setMonitorInterconnection(org.spiritconsortium.xml.schema.spirit.spirit.MonitorInterconnectionType)
	 * @generated
	 */
	public void testSetMonitorInterconnection() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRegisterFile() <em>Register File</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRegisterFile()
	 * @generated
	 */
	public void testGetRegisterFile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setRegisterFile(org.spiritconsortium.xml.schema.spirit.spirit.RegisterFileType) <em>Register File</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setRegisterFile(org.spiritconsortium.xml.schema.spirit.spirit.RegisterFileType)
	 * @generated
	 */
	public void testSetRegisterFile() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRemapStates() <em>Remap States</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getRemapStates()
	 * @generated
	 */
	public void testGetRemapStates() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setRemapStates(org.spiritconsortium.xml.schema.spirit.spirit.RemapStatesType) <em>Remap States</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setRemapStates(org.spiritconsortium.xml.schema.spirit.spirit.RemapStatesType)
	 * @generated
	 */
	public void testSetRemapStates() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#isVolatile() <em>Volatile</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#isVolatile()
	 * @generated
	 */
	public void testIsVolatile() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setVolatile(boolean) <em>Volatile</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setVolatile(boolean)
	 * @generated
	 */
	public void testSetVolatile() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusDefinition() <em>Bus Definition</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getBusDefinition()
	 * @generated
	 */
	public void testGetBusDefinition() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBusDefinition(org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType) <em>Bus Definition</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setBusDefinition(org.spiritconsortium.xml.schema.spirit.spirit.BusDefinitionType)
	 * @generated
	 */
	public void testSetBusDefinition() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponent() <em>Component</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getComponent()
	 * @generated
	 */
	public void testGetComponent() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponent(org.spiritconsortium.xml.schema.spirit.spirit.ComponentType) <em>Component</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setComponent(org.spiritconsortium.xml.schema.spirit.spirit.ComponentType)
	 * @generated
	 */
	public void testSetComponent() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDesign() <em>Design</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDesign()
	 * @generated
	 */
	public void testGetDesign() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDesign(org.spiritconsortium.xml.schema.spirit.spirit.DesignType) <em>Design</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDesign(org.spiritconsortium.xml.schema.spirit.spirit.DesignType)
	 * @generated
	 */
	public void testSetDesign() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDesignConfiguration() <em>Design Configuration</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#getDesignConfiguration()
	 * @generated
	 */
	public void testGetDesignConfiguration() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDesignConfiguration(org.spiritconsortium.xml.schema.spirit.spirit.DesignConfigurationType) <em>Design Configuration</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.DocumentRoot#setDesignConfiguration(org.spiritconsortium.xml.schema.spirit.spirit.DesignConfigurationType)
	 * @generated
	 */
	public void testSetDesignConfiguration() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DocumentRootTest
