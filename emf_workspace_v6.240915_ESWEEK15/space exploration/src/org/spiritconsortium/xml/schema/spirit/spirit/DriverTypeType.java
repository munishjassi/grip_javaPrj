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
 * A representation of the literals of the enumeration '<em><b>Driver Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getDriverTypeType()
 * @model extendedMetaData="name='driverType_._type'"
 * @generated
 */
public final class DriverTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Clock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOCK_LITERAL
	 * @model name="clock"
	 * @generated
	 * @ordered
	 */
	public static final int CLOCK = 0;

	/**
	 * The '<em><b>Single Shot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Single Shot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_SHOT_LITERAL
	 * @model name="singleShot"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_SHOT = 1;

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Any</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY_LITERAL
	 * @model name="any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY = 2;

	/**
	 * The '<em><b>Clock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCK
	 * @generated
	 * @ordered
	 */
	public static final DriverTypeType CLOCK_LITERAL = new DriverTypeType(CLOCK, "clock", "clock");

	/**
	 * The '<em><b>Single Shot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_SHOT
	 * @generated
	 * @ordered
	 */
	public static final DriverTypeType SINGLE_SHOT_LITERAL = new DriverTypeType(SINGLE_SHOT, "singleShot", "singleShot");

	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @generated
	 * @ordered
	 */
	public static final DriverTypeType ANY_LITERAL = new DriverTypeType(ANY, "any", "any");

	/**
	 * An array of all the '<em><b>Driver Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DriverTypeType[] VALUES_ARRAY =
		new DriverTypeType[] {
			CLOCK_LITERAL,
			SINGLE_SHOT_LITERAL,
			ANY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Driver Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Driver Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DriverTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DriverTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Driver Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DriverTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DriverTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Driver Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DriverTypeType get(int value) {
		switch (value) {
			case CLOCK: return CLOCK_LITERAL;
			case SINGLE_SHOT: return SINGLE_SHOT_LITERAL;
			case ANY: return ANY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DriverTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DriverTypeType
