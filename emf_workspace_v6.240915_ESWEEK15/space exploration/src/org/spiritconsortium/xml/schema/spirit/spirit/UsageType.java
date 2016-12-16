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
 * A representation of the literals of the enumeration '<em><b>Usage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getUsageType()
 * @model extendedMetaData="name='usage_._type'"
 * @generated
 */
public final class UsageType extends AbstractEnumerator {
	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_LITERAL
	 * @model name="read"
	 * @generated
	 * @ordered
	 */
	public static final int READ = 0;

	/**
	 * The '<em><b>Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_LITERAL
	 * @model name="write"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE = 1;

	/**
	 * The '<em><b>Read Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_LITERAL
	 * @model name="readWrite" literal="read-write"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE = 2;

	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @generated
	 * @ordered
	 */
	public static final UsageType READ_LITERAL = new UsageType(READ, "read", "read");

	/**
	 * The '<em><b>Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE
	 * @generated
	 * @ordered
	 */
	public static final UsageType WRITE_LITERAL = new UsageType(WRITE, "write", "write");

	/**
	 * The '<em><b>Read Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE
	 * @generated
	 * @ordered
	 */
	public static final UsageType READ_WRITE_LITERAL = new UsageType(READ_WRITE, "readWrite", "read-write");

	/**
	 * An array of all the '<em><b>Usage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UsageType[] VALUES_ARRAY =
		new UsageType[] {
			READ_LITERAL,
			WRITE_LITERAL,
			READ_WRITE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Usage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageType get(int value) {
		switch (value) {
			case READ: return READ_LITERAL;
			case WRITE: return WRITE_LITERAL;
			case READ_WRITE: return READ_WRITE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UsageType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //UsageType
