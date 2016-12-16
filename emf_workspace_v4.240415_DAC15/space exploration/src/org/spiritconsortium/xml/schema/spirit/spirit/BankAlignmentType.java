/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bank Alignment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 'serial' or 'parallel' bank alignment.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getBankAlignmentType()
 * @model extendedMetaData="name='bankAlignmentType'"
 * @generated
 */
public final class BankAlignmentType extends AbstractEnumerator {
	/**
	 * The '<em><b>Serial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Serial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIAL_LITERAL
	 * @model name="serial"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL = 0;

	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_LITERAL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL = 1;

	/**
	 * The '<em><b>Serial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @generated
	 * @ordered
	 */
	public static final BankAlignmentType SERIAL_LITERAL = new BankAlignmentType(SERIAL, "serial", "serial");

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @generated
	 * @ordered
	 */
	public static final BankAlignmentType PARALLEL_LITERAL = new BankAlignmentType(PARALLEL, "parallel", "parallel");

	/**
	 * An array of all the '<em><b>Bank Alignment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BankAlignmentType[] VALUES_ARRAY =
		new BankAlignmentType[] {
			SERIAL_LITERAL,
			PARALLEL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Bank Alignment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bank Alignment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BankAlignmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BankAlignmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bank Alignment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BankAlignmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BankAlignmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bank Alignment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BankAlignmentType get(int value) {
		switch (value) {
			case SERIAL: return SERIAL_LITERAL;
			case PARALLEL: return PARALLEL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BankAlignmentType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //BankAlignmentType
