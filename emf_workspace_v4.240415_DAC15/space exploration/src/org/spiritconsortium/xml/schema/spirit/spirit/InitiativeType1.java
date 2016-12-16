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
 * A representation of the literals of the enumeration '<em><b>Initiative Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getInitiativeType1()
 * @model extendedMetaData="name='initiative_._type'"
 * @generated
 */
public final class InitiativeType1 extends AbstractEnumerator {
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
	 * The '<em><b>Requires</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRES
	 * @generated
	 * @ordered
	 */
	public static final InitiativeType1 REQUIRES_LITERAL = new InitiativeType1(REQUIRES, "requires", "requires");

	/**
	 * The '<em><b>Provides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDES
	 * @generated
	 * @ordered
	 */
	public static final InitiativeType1 PROVIDES_LITERAL = new InitiativeType1(PROVIDES, "provides", "provides");

	/**
	 * The '<em><b>Both</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @generated
	 * @ordered
	 */
	public static final InitiativeType1 BOTH_LITERAL = new InitiativeType1(BOTH, "both", "both");

	/**
	 * An array of all the '<em><b>Initiative Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InitiativeType1[] VALUES_ARRAY =
		new InitiativeType1[] {
			REQUIRES_LITERAL,
			PROVIDES_LITERAL,
			BOTH_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Initiative Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Initiative Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiativeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitiativeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initiative Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiativeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitiativeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initiative Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiativeType1 get(int value) {
		switch (value) {
			case REQUIRES: return REQUIRES_LITERAL;
			case PROVIDES: return PROVIDES_LITERAL;
			case BOTH: return BOTH_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InitiativeType1(int value, String name, String literal) {
		super(value, name, literal);
	}

} //InitiativeType1
