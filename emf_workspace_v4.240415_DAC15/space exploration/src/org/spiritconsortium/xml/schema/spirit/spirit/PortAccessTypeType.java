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
 * A representation of the literals of the enumeration '<em><b>Port Access Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getPortAccessTypeType()
 * @model extendedMetaData="name='portAccessType_._type'"
 * @generated
 */
public final class PortAccessTypeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Ref</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ref</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REF_LITERAL
	 * @model name="ref"
	 * @generated
	 * @ordered
	 */
	public static final int REF = 0;

	/**
	 * The '<em><b>Ptr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ptr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PTR_LITERAL
	 * @model name="ptr"
	 * @generated
	 * @ordered
	 */
	public static final int PTR = 1;

	/**
	 * The '<em><b>Ref</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REF
	 * @generated
	 * @ordered
	 */
	public static final PortAccessTypeType REF_LITERAL = new PortAccessTypeType(REF, "ref", "ref");

	/**
	 * The '<em><b>Ptr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PTR
	 * @generated
	 * @ordered
	 */
	public static final PortAccessTypeType PTR_LITERAL = new PortAccessTypeType(PTR, "ptr", "ptr");

	/**
	 * An array of all the '<em><b>Port Access Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortAccessTypeType[] VALUES_ARRAY =
		new PortAccessTypeType[] {
			REF_LITERAL,
			PTR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Port Access Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Port Access Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortAccessTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortAccessTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Access Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortAccessTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortAccessTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Access Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PortAccessTypeType get(int value) {
		switch (value) {
			case REF: return REF_LITERAL;
			case PTR: return PTR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortAccessTypeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PortAccessTypeType
