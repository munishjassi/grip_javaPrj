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
 * A representation of the literals of the enumeration '<em><b>Whitebox Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getWhiteboxTypeType()
 * @model extendedMetaData="name='whiteboxType_._type'"
 * @generated
 */
public final class WhiteboxTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Register</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Register</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTER_LITERAL
	 * @model name="register"
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER = 0;

	/**
	 * The '<em><b>Signal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNAL_LITERAL
	 * @model name="signal"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNAL = 1;

	/**
	 * The '<em><b>Pin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_LITERAL
	 * @model name="pin"
	 * @generated
	 * @ordered
	 */
	public static final int PIN = 2;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_LITERAL
	 * @model name="interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE = 3;

	/**
	 * The '<em><b>Register</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTER
	 * @generated
	 * @ordered
	 */
	public static final WhiteboxTypeType REGISTER_LITERAL = new WhiteboxTypeType(REGISTER, "register", "register");

	/**
	 * The '<em><b>Signal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNAL
	 * @generated
	 * @ordered
	 */
	public static final WhiteboxTypeType SIGNAL_LITERAL = new WhiteboxTypeType(SIGNAL, "signal", "signal");

	/**
	 * The '<em><b>Pin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN
	 * @generated
	 * @ordered
	 */
	public static final WhiteboxTypeType PIN_LITERAL = new WhiteboxTypeType(PIN, "pin", "pin");

	/**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @generated
	 * @ordered
	 */
	public static final WhiteboxTypeType INTERFACE_LITERAL = new WhiteboxTypeType(INTERFACE, "interface", "interface");

	/**
	 * An array of all the '<em><b>Whitebox Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WhiteboxTypeType[] VALUES_ARRAY =
		new WhiteboxTypeType[] {
			REGISTER_LITERAL,
			SIGNAL_LITERAL,
			PIN_LITERAL,
			INTERFACE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Whitebox Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Whitebox Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WhiteboxTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WhiteboxTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Whitebox Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WhiteboxTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WhiteboxTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Whitebox Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WhiteboxTypeType get(int value) {
		switch (value) {
			case REGISTER: return REGISTER_LITERAL;
			case SIGNAL: return SIGNAL_LITERAL;
			case PIN: return PIN_LITERAL;
			case INTERFACE: return INTERFACE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private WhiteboxTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //WhiteboxTypeType
