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
 * A representation of the literals of the enumeration '<em><b>Usage Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getUsageTypeType()
 * @model extendedMetaData="name='usageType_._type'"
 * @generated
 */
public final class UsageTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Nontyped</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nontyped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONTYPED_LITERAL
	 * @model name="nontyped"
	 * @generated
	 * @ordered
	 */
	public static final int NONTYPED = 0;

	/**
	 * The '<em><b>Typed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Typed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPED_LITERAL
	 * @model name="typed"
	 * @generated
	 * @ordered
	 */
	public static final int TYPED = 1;

	/**
	 * The '<em><b>Nontyped</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONTYPED
	 * @generated
	 * @ordered
	 */
	public static final UsageTypeType NONTYPED_LITERAL = new UsageTypeType(NONTYPED, "nontyped", "nontyped");

	/**
	 * The '<em><b>Typed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPED
	 * @generated
	 * @ordered
	 */
	public static final UsageTypeType TYPED_LITERAL = new UsageTypeType(TYPED, "typed", "typed");

	/**
	 * An array of all the '<em><b>Usage Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UsageTypeType[] VALUES_ARRAY =
		new UsageTypeType[] {
			NONTYPED_LITERAL,
			TYPED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Usage Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Usage Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageTypeType get(int value) {
		switch (value) {
			case NONTYPED: return NONTYPED_LITERAL;
			case TYPED: return TYPED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UsageTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //UsageTypeType
