/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.tests;

import junit.textui.TestRunner;

import org.spiritconsortium.xml.schema.spirit.spirit.PortType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PortTypeTest extends PortDeclarationTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PortTypeTest.class);
	}

	/**
	 * Constructs a new Port Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Port Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortType getFixture() {
		return (PortType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(_1Factory.eINSTANCE.createPortType());
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

} //PortTypeTest
