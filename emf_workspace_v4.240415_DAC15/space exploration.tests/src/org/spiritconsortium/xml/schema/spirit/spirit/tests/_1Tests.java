/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>spirit</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class _1Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new _1Tests("spirit Tests");
		suite.addTestSuite(AddressBankTypeTest.class);
		suite.addTestSuite(BankedBankTypeTest.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(FileTypeTest.class);
		suite.addTestSuite(GeneratorChainTypeTest.class);
		suite.addTestSuite(LocalMemoryMapTypeTest.class);
		suite.addTestSuite(MemoryMapTypeTest.class);
		suite.addTestSuite(MemoryRemapTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _1Tests(String name) {
		super(name);
	}

} //_1Tests
