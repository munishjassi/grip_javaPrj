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
 * A representation of the literals of the enumeration '<em><b>Cell Class Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates legal cell class values.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getCellClassValueType()
 * @model extendedMetaData="name='cellClassValueType'"
 * @generated
 */
public final class CellClassValueType extends AbstractEnumerator {
	/**
	 * The '<em><b>Combinational</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Combinational</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMBINATIONAL_LITERAL
	 * @model name="combinational"
	 * @generated
	 * @ordered
	 */
	public static final int COMBINATIONAL = 0;

	/**
	 * The '<em><b>Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_LITERAL
	 * @model name="sequential"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL = 1;

	/**
	 * The '<em><b>Combinational</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBINATIONAL
	 * @generated
	 * @ordered
	 */
	public static final CellClassValueType COMBINATIONAL_LITERAL = new CellClassValueType(COMBINATIONAL, "combinational", "combinational");

	/**
	 * The '<em><b>Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @generated
	 * @ordered
	 */
	public static final CellClassValueType SEQUENTIAL_LITERAL = new CellClassValueType(SEQUENTIAL, "sequential", "sequential");

	/**
	 * An array of all the '<em><b>Cell Class Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CellClassValueType[] VALUES_ARRAY =
		new CellClassValueType[] {
			COMBINATIONAL_LITERAL,
			SEQUENTIAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cell Class Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cell Class Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellClassValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellClassValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Class Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellClassValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CellClassValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cell Class Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CellClassValueType get(int value) {
		switch (value) {
			case COMBINATIONAL: return COMBINATIONAL_LITERAL;
			case SEQUENTIAL: return SEQUENTIAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CellClassValueType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CellClassValueType
