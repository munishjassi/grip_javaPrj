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
 * A representation of the literals of the enumeration '<em><b>Endianess Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 'big': means the most significant element of any multi-element  data field is stored at the lowest memory address. 'little' means the least significant element of any multi-element data field is stored at the lowest memory address. If this element is not present the default is 'little' endian.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getEndianessType()
 * @model extendedMetaData="name='endianessType'"
 * @generated
 */
public final class EndianessType extends AbstractEnumerator {
	/**
	 * The '<em><b>Big</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Big</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIG_LITERAL
	 * @model name="big"
	 * @generated
	 * @ordered
	 */
	public static final int BIG = 0;

	/**
	 * The '<em><b>Little</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Little</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LITTLE_LITERAL
	 * @model name="little"
	 * @generated
	 * @ordered
	 */
	public static final int LITTLE = 1;

	/**
	 * The '<em><b>Big</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIG
	 * @generated
	 * @ordered
	 */
	public static final EndianessType BIG_LITERAL = new EndianessType(BIG, "big", "big");

	/**
	 * The '<em><b>Little</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITTLE
	 * @generated
	 * @ordered
	 */
	public static final EndianessType LITTLE_LITERAL = new EndianessType(LITTLE, "little", "little");

	/**
	 * An array of all the '<em><b>Endianess Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EndianessType[] VALUES_ARRAY =
		new EndianessType[] {
			BIG_LITERAL,
			LITTLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Endianess Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Endianess Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndianessType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndianessType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianess Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndianessType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EndianessType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Endianess Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndianessType get(int value) {
		switch (value) {
			case BIG: return BIG_LITERAL;
			case LITTLE: return LITTLE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EndianessType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EndianessType
