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
 * A representation of the literals of the enumeration '<em><b>Range Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This type is used to indicate how the minimum and maximum attributes values should be interpreted. For purposes of this attribute, an int is 4 bytes and a long is 8 bytes.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getRangeTypeType()
 * @model extendedMetaData="name='rangeTypeType'"
 * @generated
 */
public final class RangeTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT_LITERAL
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT = 0;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT_LITERAL
	 * @model name="int"
	 * @generated
	 * @ordered
	 */
	public static final int INT = 1;

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Int</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT_LITERAL
	 * @model name="unsignedInt" literal="unsigned int"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT = 2;

	/**
	 * The '<em><b>Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_LITERAL
	 * @model name="long"
	 * @generated
	 * @ordered
	 */
	public static final int LONG = 3;

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsigned Long</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG_LITERAL
	 * @model name="unsignedLong" literal="unsigned long"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_LONG = 4;

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @generated
	 * @ordered
	 */
	public static final RangeTypeType FLOAT_LITERAL = new RangeTypeType(FLOAT, "float", "float");

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @generated
	 * @ordered
	 */
	public static final RangeTypeType INT_LITERAL = new RangeTypeType(INT, "int", "int");

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT
	 * @generated
	 * @ordered
	 */
	public static final RangeTypeType UNSIGNED_INT_LITERAL = new RangeTypeType(UNSIGNED_INT, "unsignedInt", "unsigned int");

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @generated
	 * @ordered
	 */
	public static final RangeTypeType LONG_LITERAL = new RangeTypeType(LONG, "long", "long");

	/**
	 * The '<em><b>Unsigned Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_LONG
	 * @generated
	 * @ordered
	 */
	public static final RangeTypeType UNSIGNED_LONG_LITERAL = new RangeTypeType(UNSIGNED_LONG, "unsignedLong", "unsigned long");

	/**
	 * An array of all the '<em><b>Range Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RangeTypeType[] VALUES_ARRAY =
		new RangeTypeType[] {
			FLOAT_LITERAL,
			INT_LITERAL,
			UNSIGNED_INT_LITERAL,
			LONG_LITERAL,
			UNSIGNED_LONG_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Range Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Range Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RangeTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Range Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RangeTypeType get(int value) {
		switch (value) {
			case FLOAT: return FLOAT_LITERAL;
			case INT: return INT_LITERAL;
			case UNSIGNED_INT: return UNSIGNED_INT_LITERAL;
			case LONG: return LONG_LITERAL;
			case UNSIGNED_LONG: return UNSIGNED_LONG_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RangeTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //RangeTypeType
