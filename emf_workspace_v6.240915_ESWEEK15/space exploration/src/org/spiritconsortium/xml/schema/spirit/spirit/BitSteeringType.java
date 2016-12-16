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
 * A representation of the literals of the enumeration '<em><b>Bit Steering Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates whether bit steering should be used to map this interface onto a bus of different data width.
 * 
 * Values are "on", "off" (defaults to "off").
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getBitSteeringType()
 * @model extendedMetaData="name='bitSteeringType'"
 * @generated
 */
public final class BitSteeringType extends AbstractEnumerator {
	/**
	 * The '<em><b>On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_LITERAL
	 * @model name="on"
	 * @generated
	 * @ordered
	 */
	public static final int ON = 0;

	/**
	 * The '<em><b>Off</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Off</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF_LITERAL
	 * @model name="off"
	 * @generated
	 * @ordered
	 */
	public static final int OFF = 1;

	/**
	 * The '<em><b>On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON
	 * @generated
	 * @ordered
	 */
	public static final BitSteeringType ON_LITERAL = new BitSteeringType(ON, "on", "on");

	/**
	 * The '<em><b>Off</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @generated
	 * @ordered
	 */
	public static final BitSteeringType OFF_LITERAL = new BitSteeringType(OFF, "off", "off");

	/**
	 * An array of all the '<em><b>Bit Steering Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BitSteeringType[] VALUES_ARRAY =
		new BitSteeringType[] {
			ON_LITERAL,
			OFF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Bit Steering Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bit Steering Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitSteeringType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BitSteeringType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bit Steering Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitSteeringType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BitSteeringType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bit Steering Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BitSteeringType get(int value) {
		switch (value) {
			case ON: return ON_LITERAL;
			case OFF: return OFF_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BitSteeringType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //BitSteeringType
