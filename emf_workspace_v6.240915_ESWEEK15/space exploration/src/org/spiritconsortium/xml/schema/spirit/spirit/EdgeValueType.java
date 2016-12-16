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
 * A representation of the literals of the enumeration '<em><b>Edge Value Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates legal values for edge specification attributes.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getEdgeValueType()
 * @model extendedMetaData="name='edgeValueType'"
 * @generated
 */
public final class EdgeValueType extends AbstractEnumerator {
	/**
	 * The '<em><b>Rise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RISE_LITERAL
	 * @model name="rise"
	 * @generated
	 * @ordered
	 */
	public static final int RISE = 0;

	/**
	 * The '<em><b>Fall</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fall</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FALL_LITERAL
	 * @model name="fall"
	 * @generated
	 * @ordered
	 */
	public static final int FALL = 1;

	/**
	 * The '<em><b>Rise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISE
	 * @generated
	 * @ordered
	 */
	public static final EdgeValueType RISE_LITERAL = new EdgeValueType(RISE, "rise", "rise");

	/**
	 * The '<em><b>Fall</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FALL
	 * @generated
	 * @ordered
	 */
	public static final EdgeValueType FALL_LITERAL = new EdgeValueType(FALL, "fall", "fall");

	/**
	 * An array of all the '<em><b>Edge Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EdgeValueType[] VALUES_ARRAY =
		new EdgeValueType[] {
			RISE_LITERAL,
			FALL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Edge Value Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Edge Value Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdgeValueType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdgeValueType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edge Value Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdgeValueType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdgeValueType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edge Value Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdgeValueType get(int value) {
		switch (value) {
			case RISE: return RISE_LITERAL;
			case FALL: return FALL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EdgeValueType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EdgeValueType
