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
 * A representation of the literals of the enumeration '<em><b>Access Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The read/write accessability of an addess block.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAccessType()
 * @model extendedMetaData="name='accessType'"
 * @generated
 */
public final class AccessType extends AbstractEnumerator {
	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_LITERAL
	 * @model name="readOnly" literal="read-only"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY = 0;

	/**
	 * The '<em><b>Write Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY_LITERAL
	 * @model name="writeOnly" literal="write-only"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ONLY = 1;

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
	 * The '<em><b>Write Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write Once</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONCE_LITERAL
	 * @model name="writeOnce"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_ONCE = 3;

	/**
	 * The '<em><b>Read Write Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Write Once</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ONCE_LITERAL
	 * @model name="readWriteOnce" literal="read-writeOnce"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_ONCE = 4;

	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @generated
	 * @ordered
	 */
	public static final AccessType READ_ONLY_LITERAL = new AccessType(READ_ONLY, "readOnly", "read-only");

	/**
	 * The '<em><b>Write Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONLY
	 * @generated
	 * @ordered
	 */
	public static final AccessType WRITE_ONLY_LITERAL = new AccessType(WRITE_ONLY, "writeOnly", "write-only");

	/**
	 * The '<em><b>Read Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE
	 * @generated
	 * @ordered
	 */
	public static final AccessType READ_WRITE_LITERAL = new AccessType(READ_WRITE, "readWrite", "read-write");

	/**
	 * The '<em><b>Write Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_ONCE
	 * @generated
	 * @ordered
	 */
	public static final AccessType WRITE_ONCE_LITERAL = new AccessType(WRITE_ONCE, "writeOnce", "writeOnce");

	/**
	 * The '<em><b>Read Write Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ONCE
	 * @generated
	 * @ordered
	 */
	public static final AccessType READ_WRITE_ONCE_LITERAL = new AccessType(READ_WRITE_ONCE, "readWriteOnce", "read-writeOnce");

	/**
	 * An array of all the '<em><b>Access Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessType[] VALUES_ARRAY =
		new AccessType[] {
			READ_ONLY_LITERAL,
			WRITE_ONLY_LITERAL,
			READ_WRITE_LITERAL,
			WRITE_ONCE_LITERAL,
			READ_WRITE_ONCE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Access Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccessType get(int value) {
		switch (value) {
			case READ_ONLY: return READ_ONLY_LITERAL;
			case WRITE_ONLY: return WRITE_ONLY_LITERAL;
			case READ_WRITE: return READ_WRITE_LITERAL;
			case WRITE_ONCE: return WRITE_ONCE_LITERAL;
			case READ_WRITE_ONCE: return READ_WRITE_ONCE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AccessType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AccessType
