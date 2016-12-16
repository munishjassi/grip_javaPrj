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
 * A representation of the literals of the enumeration '<em><b>Read Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getReadActionType()
 * @model extendedMetaData="name='readAction_._type'"
 * @generated
 */
public final class ReadActionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Clear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEAR_LITERAL
	 * @model name="clear"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR = 0;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_LITERAL
	 * @model name="set"
	 * @generated
	 * @ordered
	 */
	public static final int SET = 1;

	/**
	 * The '<em><b>Modify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modify</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFY_LITERAL
	 * @model name="modify"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFY = 2;

	/**
	 * The '<em><b>Clear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR
	 * @generated
	 * @ordered
	 */
	public static final ReadActionType CLEAR_LITERAL = new ReadActionType(CLEAR, "clear", "clear");

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @generated
	 * @ordered
	 */
	public static final ReadActionType SET_LITERAL = new ReadActionType(SET, "set", "set");

	/**
	 * The '<em><b>Modify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFY
	 * @generated
	 * @ordered
	 */
	public static final ReadActionType MODIFY_LITERAL = new ReadActionType(MODIFY, "modify", "modify");

	/**
	 * An array of all the '<em><b>Read Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReadActionType[] VALUES_ARRAY =
		new ReadActionType[] {
			CLEAR_LITERAL,
			SET_LITERAL,
			MODIFY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Read Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Read Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReadActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Read Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReadActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReadActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Read Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReadActionType get(int value) {
		switch (value) {
			case CLEAR: return CLEAR_LITERAL;
			case SET: return SET_LITERAL;
			case MODIFY: return MODIFY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReadActionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ReadActionType
