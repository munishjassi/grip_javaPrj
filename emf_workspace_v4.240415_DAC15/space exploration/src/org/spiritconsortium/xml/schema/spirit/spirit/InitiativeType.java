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
 * A representation of the literals of the enumeration '<em><b>Initiative Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getInitiativeType()
 * @model extendedMetaData="name='initiative_._1_._type'"
 * @generated
 */
public final class InitiativeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Requires</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Requires</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRES_LITERAL
	 * @model name="requires"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES = 0;

	/**
	 * The '<em><b>Provides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provides</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDES_LITERAL
	 * @model name="provides"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDES = 1;

	/**
	 * The '<em><b>Both</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH_LITERAL
	 * @model name="both"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH = 2;

	/**
	 * The '<em><b>Phantom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Phantom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHANTOM_LITERAL
	 * @model name="phantom"
	 * @generated
	 * @ordered
	 */
	public static final int PHANTOM = 3;

	/**
	 * The '<em><b>Requires</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRES
	 * @generated
	 * @ordered
	 */
	public static final InitiativeType REQUIRES_LITERAL = new InitiativeType(REQUIRES, "requires", "requires");

	/**
	 * The '<em><b>Provides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDES
	 * @generated
	 * @ordered
	 */
	public static final InitiativeType PROVIDES_LITERAL = new InitiativeType(PROVIDES, "provides", "provides");

	/**
	 * The '<em><b>Both</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @generated
	 * @ordered
	 */
	public static final InitiativeType BOTH_LITERAL = new InitiativeType(BOTH, "both", "both");

	/**
	 * The '<em><b>Phantom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHANTOM
	 * @generated
	 * @ordered
	 */
	public static final InitiativeType PHANTOM_LITERAL = new InitiativeType(PHANTOM, "phantom", "phantom");

	/**
	 * An array of all the '<em><b>Initiative Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InitiativeType[] VALUES_ARRAY =
		new InitiativeType[] {
			REQUIRES_LITERAL,
			PROVIDES_LITERAL,
			BOTH_LITERAL,
			PHANTOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Initiative Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Initiative Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiativeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitiativeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initiative Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiativeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitiativeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initiative Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiativeType get(int value) {
		switch (value) {
			case REQUIRES: return REQUIRES_LITERAL;
			case PROVIDES: return PROVIDES_LITERAL;
			case BOTH: return BOTH_LITERAL;
			case PHANTOM: return PHANTOM_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InitiativeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //InitiativeType
