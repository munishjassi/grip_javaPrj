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
 * A representation of the literals of the enumeration '<em><b>Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This is an indication on the formatof the value for user defined properties.  bitString means either a double quoted string of 1's an 0's or a scaledInteger number. bool means a boolean (true, false) is expected.  float means a decimal floating point number is expected.  long means an value of scaledInteger is expected.  String means any text is acceptable.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getFormatType()
 * @model extendedMetaData="name='formatType'"
 * @generated
 */
public final class FormatType extends AbstractEnumerator {
	/**
	 * The '<em><b>Bit String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bit String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIT_STRING_LITERAL
	 * @model name="bitString"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_STRING = 0;

	/**
	 * The '<em><b>Bool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bool</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOL_LITERAL
	 * @model name="bool"
	 * @generated
	 * @ordered
	 */
	public static final int BOOL = 1;

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
	public static final int FLOAT = 2;

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
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 4;

	/**
	 * The '<em><b>Bit String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_STRING
	 * @generated
	 * @ordered
	 */
	public static final FormatType BIT_STRING_LITERAL = new FormatType(BIT_STRING, "bitString", "bitString");

	/**
	 * The '<em><b>Bool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOL
	 * @generated
	 * @ordered
	 */
	public static final FormatType BOOL_LITERAL = new FormatType(BOOL, "bool", "bool");

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @generated
	 * @ordered
	 */
	public static final FormatType FLOAT_LITERAL = new FormatType(FLOAT, "float", "float");

	/**
	 * The '<em><b>Long</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @generated
	 * @ordered
	 */
	public static final FormatType LONG_LITERAL = new FormatType(LONG, "long", "long");

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final FormatType STRING_LITERAL = new FormatType(STRING, "string", "string");

	/**
	 * An array of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormatType[] VALUES_ARRAY =
		new FormatType[] {
			BIT_STRING_LITERAL,
			BOOL_LITERAL,
			FLOAT_LITERAL,
			LONG_LITERAL,
			STRING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Format Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormatType get(int value) {
		switch (value) {
			case BIT_STRING: return BIT_STRING_LITERAL;
			case BOOL: return BOOL_LITERAL;
			case FLOAT: return FLOAT_LITERAL;
			case LONG: return LONG_LITERAL;
			case STRING: return STRING_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FormatType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //FormatType
