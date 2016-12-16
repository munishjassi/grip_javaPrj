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
 * A representation of the literals of the enumeration '<em><b>Presence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getPresenceType()
 * @model extendedMetaData="name='presence_._type'"
 * @generated
 */
public final class PresenceType extends AbstractEnumerator {
	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_LITERAL
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED = 0;

	/**
	 * The '<em><b>Illegal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Illegal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ILLEGAL_LITERAL
	 * @model name="illegal"
	 * @generated
	 * @ordered
	 */
	public static final int ILLEGAL = 1;

	/**
	 * The '<em><b>Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_LITERAL
	 * @model name="optional"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL = 2;

	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @generated
	 * @ordered
	 */
	public static final PresenceType REQUIRED_LITERAL = new PresenceType(REQUIRED, "required", "required");

	/**
	 * The '<em><b>Illegal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ILLEGAL
	 * @generated
	 * @ordered
	 */
	public static final PresenceType ILLEGAL_LITERAL = new PresenceType(ILLEGAL, "illegal", "illegal");

	/**
	 * The '<em><b>Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL
	 * @generated
	 * @ordered
	 */
	public static final PresenceType OPTIONAL_LITERAL = new PresenceType(OPTIONAL, "optional", "optional");

	/**
	 * An array of all the '<em><b>Presence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PresenceType[] VALUES_ARRAY =
		new PresenceType[] {
			REQUIRED_LITERAL,
			ILLEGAL_LITERAL,
			OPTIONAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Presence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Presence Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presence Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PresenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Presence Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PresenceType get(int value) {
		switch (value) {
			case REQUIRED: return REQUIRED_LITERAL;
			case ILLEGAL: return ILLEGAL_LITERAL;
			case OPTIONAL: return OPTIONAL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PresenceType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PresenceType
