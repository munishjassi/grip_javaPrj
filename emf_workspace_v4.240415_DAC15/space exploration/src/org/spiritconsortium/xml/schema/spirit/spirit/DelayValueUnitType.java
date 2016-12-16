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
 * A representation of the literals of the enumeration '<em><b>Delay Value Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Indicates legal units for delay values.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getDelayValueUnitType()
 * @model extendedMetaData="name='delayValueUnitType'"
 * @generated
 */
public final class DelayValueUnitType extends AbstractEnumerator {
	/**
	 * The '<em><b>Ps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PS_LITERAL
	 * @model name="ps"
	 * @generated
	 * @ordered
	 */
	public static final int PS = 0;

	/**
	 * The '<em><b>Ns</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ns</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NS_LITERAL
	 * @model name="ns"
	 * @generated
	 * @ordered
	 */
	public static final int NS = 1;

	/**
	 * The '<em><b>Ps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PS
	 * @generated
	 * @ordered
	 */
	public static final DelayValueUnitType PS_LITERAL = new DelayValueUnitType(PS, "ps", "ps");

	/**
	 * The '<em><b>Ns</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NS
	 * @generated
	 * @ordered
	 */
	public static final DelayValueUnitType NS_LITERAL = new DelayValueUnitType(NS, "ns", "ns");

	/**
	 * An array of all the '<em><b>Delay Value Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DelayValueUnitType[] VALUES_ARRAY =
		new DelayValueUnitType[] {
			PS_LITERAL,
			NS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Delay Value Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Delay Value Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DelayValueUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DelayValueUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delay Value Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DelayValueUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DelayValueUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Delay Value Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DelayValueUnitType get(int value) {
		switch (value) {
			case PS: return PS_LITERAL;
			case NS: return NS_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DelayValueUnitType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DelayValueUnitType
