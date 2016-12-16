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
 * A representation of the literals of the enumeration '<em><b>Usage Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Describes the usage of an address block.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getUsageType1()
 * @model extendedMetaData="name='usageType'"
 * @generated
 */
public final class UsageType1 extends AbstractEnumerator {
	/**
	 * The '<em><b>Memory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes an address range that can be used for read-write or read-only data storage.
	 * <!-- end-model-doc -->
	 * @see #MEMORY_LITERAL
	 * @model name="memory"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY = 0;

	/**
	 * The '<em><b>Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes an address block that is used to communicate with hardware.
	 * <!-- end-model-doc -->
	 * @see #REGISTER_LITERAL
	 * @model name="register"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER = 1;

	/**
	 * The '<em><b>Reserved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes an address range that must remain unoccupied.
	 * <!-- end-model-doc -->
	 * @see #RESERVED_LITERAL
	 * @model name="reserved"
	 * @generated
	 * @ordered
	 */
	public static final int RESERVED = 2;

	/**
	 * The '<em><b>Memory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY
	 * @generated
	 * @ordered
	 */
	public static final UsageType1 MEMORY_LITERAL = new UsageType1(MEMORY, "memory", "memory");

	/**
	 * The '<em><b>Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTER
	 * @generated
	 * @ordered
	 */
	public static final UsageType1 REGISTER_LITERAL = new UsageType1(REGISTER, "register", "register");

	/**
	 * The '<em><b>Reserved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVED
	 * @generated
	 * @ordered
	 */
	public static final UsageType1 RESERVED_LITERAL = new UsageType1(RESERVED, "reserved", "reserved");

	/**
	 * An array of all the '<em><b>Usage Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UsageType1[] VALUES_ARRAY =
		new UsageType1[] {
			MEMORY_LITERAL,
			REGISTER_LITERAL,
			RESERVED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Usage Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Usage Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType1 get(int value) {
		switch (value) {
			case MEMORY: return MEMORY_LITERAL;
			case REGISTER: return REGISTER_LITERAL;
			case RESERVED: return RESERVED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UsageType1(int value, String name, String literal) {
		super(value, name, literal);
	}

} //UsageType1
