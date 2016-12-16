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
 * A representation of the literals of the enumeration '<em><b>Multiple Group Selection Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMultipleGroupSelectionOperatorType()
 * @model extendedMetaData="name='multipleGroupSelectionOperator_._type'"
 * @generated
 */
public final class MultipleGroupSelectionOperatorType extends AbstractEnumerator {
	/**
	 * The '<em><b>And</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>And</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND_LITERAL
	 * @model name="and"
	 * @generated
	 * @ordered
	 */
	public static final int AND = 0;

	/**
	 * The '<em><b>Or</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Or</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR_LITERAL
	 * @model name="or"
	 * @generated
	 * @ordered
	 */
	public static final int OR = 1;

	/**
	 * The '<em><b>And</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @generated
	 * @ordered
	 */
	public static final MultipleGroupSelectionOperatorType AND_LITERAL = new MultipleGroupSelectionOperatorType(AND, "and", "and");

	/**
	 * The '<em><b>Or</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @generated
	 * @ordered
	 */
	public static final MultipleGroupSelectionOperatorType OR_LITERAL = new MultipleGroupSelectionOperatorType(OR, "or", "or");

	/**
	 * An array of all the '<em><b>Multiple Group Selection Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultipleGroupSelectionOperatorType[] VALUES_ARRAY =
		new MultipleGroupSelectionOperatorType[] {
			AND_LITERAL,
			OR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiple Group Selection Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiple Group Selection Operator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleGroupSelectionOperatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleGroupSelectionOperatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Group Selection Operator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleGroupSelectionOperatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleGroupSelectionOperatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Group Selection Operator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleGroupSelectionOperatorType get(int value) {
		switch (value) {
			case AND: return AND_LITERAL;
			case OR: return OR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MultipleGroupSelectionOperatorType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //MultipleGroupSelectionOperatorType
