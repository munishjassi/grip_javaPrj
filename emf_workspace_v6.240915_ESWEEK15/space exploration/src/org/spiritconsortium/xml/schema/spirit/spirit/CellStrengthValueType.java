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
 * A representation of the literals of the enumeration '<em><b>Cell Strength Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates legal cell strength values.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getCellStrengthValueType()
 * @model extendedMetaData="name='cellStrengthValueType'"
 * @generated
 */
public final class CellStrengthValueType extends AbstractEnumerator {
	/**
	 * The '<em><b>Low</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_LITERAL
	 * @model name="low"
	 * @generated
	 * @ordered
	 */
	public static final int LOW = 0;

	/**
	 * The '<em><b>Median</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Median</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIAN_LITERAL
	 * @model name="median"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIAN = 1;

	/**
	 * The '<em><b>High</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_LITERAL
	 * @model name="high"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH = 2;

	/**
	 * The '<em><b>Low</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @generated
	 * @ordered
	 */
	public static final CellStrengthValueType LOW_LITERAL = new CellStrengthValueType(LOW, "low", "low");

	/**
	 * The '<em><b>Median</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIAN
	 * @generated
	 * @ordered
	 */
	public static final CellStrengthValueType MEDIAN_LITERAL = new CellStrengthValueType(MEDIAN, "median", "median");

	/**
	 * The '<em><b>High</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @generated
	 * @ordered
	 */
	public static final CellStrengthValueType HIGH_LITERAL = new CellStrengthValueType(HIGH, "high", "high");

	/**
	 * An array of all the '<em><b>Cell Strength Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CellStrengthValueType[] VALUES_ARRAY =
		new CellStrengthValueType[] {
			LOW_LITERAL,
			MEDIAN_LITERAL,
			HIGH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cell Strength Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cell Strength Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellStrengthValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellStrengthValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Strength Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellStrengthValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellStrengthValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Strength Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellStrengthValueType get(int value) {
		switch (value) {
			case LOW: return LOW_LITERAL;
			case MEDIAN: return MEDIAN_LITERAL;
			case HIGH: return HIGH_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CellStrengthValueType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CellStrengthValueType
