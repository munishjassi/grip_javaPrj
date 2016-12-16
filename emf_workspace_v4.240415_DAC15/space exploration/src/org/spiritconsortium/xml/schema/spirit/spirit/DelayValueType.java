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
 * A representation of the literals of the enumeration '<em><b>Delay Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates the type of delay value - minimum or maximum delay.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getDelayValueType()
 * @model extendedMetaData="name='delayValueType'"
 * @generated
 */
public final class DelayValueType extends AbstractEnumerator {
	/**
	 * The '<em><b>Min</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Min</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN_LITERAL
	 * @model name="min"
	 * @generated
	 * @ordered
	 */
	public static final int MIN = 0;

	/**
	 * The '<em><b>Max</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Max</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_LITERAL
	 * @model name="max"
	 * @generated
	 * @ordered
	 */
	public static final int MAX = 1;

	/**
	 * The '<em><b>Min</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @generated
	 * @ordered
	 */
	public static final DelayValueType MIN_LITERAL = new DelayValueType(MIN, "min", "min");

	/**
	 * The '<em><b>Max</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @generated
	 * @ordered
	 */
	public static final DelayValueType MAX_LITERAL = new DelayValueType(MAX, "max", "max");

	/**
	 * An array of all the '<em><b>Delay Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DelayValueType[] VALUES_ARRAY =
		new DelayValueType[] {
			MIN_LITERAL,
			MAX_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Delay Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Delay Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DelayValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DelayValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delay Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DelayValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DelayValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delay Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DelayValueType get(int value) {
		switch (value) {
			case MIN: return MIN_LITERAL;
			case MAX: return MAX_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DelayValueType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DelayValueType
