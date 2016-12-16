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
 * A representation of the literals of the enumeration '<em><b>Component Port Direction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The direction of a component port.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getComponentPortDirectionType()
 * @model extendedMetaData="name='componentPortDirectionType'"
 * @generated
 */
public final class ComponentPortDirectionType extends AbstractEnumerator {
	/**
	 * The '<em><b>In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_LITERAL
	 * @model name="in"
	 * @generated
	 * @ordered
	 */
	public static final int IN = 0;

	/**
	 * The '<em><b>Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUT_LITERAL
	 * @model name="out"
	 * @generated
	 * @ordered
	 */
	public static final int OUT = 1;

	/**
	 * The '<em><b>Inout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INOUT_LITERAL
	 * @model name="inout"
	 * @generated
	 * @ordered
	 */
	public static final int INOUT = 2;

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
	 * The '<em><b>In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @generated
	 * @ordered
	 */
	public static final ComponentPortDirectionType IN_LITERAL = new ComponentPortDirectionType(IN, "in", "in");

	/**
	 * The '<em><b>Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT
	 * @generated
	 * @ordered
	 */
	public static final ComponentPortDirectionType OUT_LITERAL = new ComponentPortDirectionType(OUT, "out", "out");

	/**
	 * The '<em><b>Inout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INOUT
	 * @generated
	 * @ordered
	 */
	public static final ComponentPortDirectionType INOUT_LITERAL = new ComponentPortDirectionType(INOUT, "inout", "inout");

	/**
	 * The '<em><b>Phantom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHANTOM
	 * @generated
	 * @ordered
	 */
	public static final ComponentPortDirectionType PHANTOM_LITERAL = new ComponentPortDirectionType(PHANTOM, "phantom", "phantom");

	/**
	 * An array of all the '<em><b>Component Port Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentPortDirectionType[] VALUES_ARRAY =
		new ComponentPortDirectionType[] {
			IN_LITERAL,
			OUT_LITERAL,
			INOUT_LITERAL,
			PHANTOM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Port Direction Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Port Direction Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentPortDirectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentPortDirectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Port Direction Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentPortDirectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentPortDirectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Port Direction Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentPortDirectionType get(int value) {
		switch (value) {
			case IN: return IN_LITERAL;
			case OUT: return OUT_LITERAL;
			case INOUT: return INOUT_LITERAL;
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
	public ComponentPortDirectionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ComponentPortDirectionType
