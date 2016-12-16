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
 * A representation of the literals of the enumeration '<em><b>Test Constraint Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getTestConstraintType()
 * @model extendedMetaData="name='testConstraint_._type'"
 * @generated
 */
public final class TestConstraintType extends AbstractEnumerator {
	/**
	 * The '<em><b>Unconstrained</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unconstrained</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNCONSTRAINED_LITERAL
	 * @model name="unconstrained"
	 * @generated
	 * @ordered
	 */
	public static final int UNCONSTRAINED = 0;

	/**
	 * The '<em><b>Restore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Restore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTORE_LITERAL
	 * @model name="restore"
	 * @generated
	 * @ordered
	 */
	public static final int RESTORE = 1;

	/**
	 * The '<em><b>Write As Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write As Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE_AS_READ_LITERAL
	 * @model name="writeAsRead"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_AS_READ = 2;

	/**
	 * The '<em><b>Read Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_LITERAL
	 * @model name="readOnly"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY = 3;

	/**
	 * The '<em><b>Unconstrained</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNCONSTRAINED
	 * @generated
	 * @ordered
	 */
	public static final TestConstraintType UNCONSTRAINED_LITERAL = new TestConstraintType(UNCONSTRAINED, "unconstrained", "unconstrained");

	/**
	 * The '<em><b>Restore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTORE
	 * @generated
	 * @ordered
	 */
	public static final TestConstraintType RESTORE_LITERAL = new TestConstraintType(RESTORE, "restore", "restore");

	/**
	 * The '<em><b>Write As Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_AS_READ
	 * @generated
	 * @ordered
	 */
	public static final TestConstraintType WRITE_AS_READ_LITERAL = new TestConstraintType(WRITE_AS_READ, "writeAsRead", "writeAsRead");

	/**
	 * The '<em><b>Read Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @generated
	 * @ordered
	 */
	public static final TestConstraintType READ_ONLY_LITERAL = new TestConstraintType(READ_ONLY, "readOnly", "readOnly");

	/**
	 * An array of all the '<em><b>Test Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TestConstraintType[] VALUES_ARRAY =
		new TestConstraintType[] {
			UNCONSTRAINED_LITERAL,
			RESTORE_LITERAL,
			WRITE_AS_READ_LITERAL,
			READ_ONLY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Test Constraint Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Test Constraint Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestConstraintType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestConstraintType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Constraint Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestConstraintType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TestConstraintType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Test Constraint Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestConstraintType get(int value) {
		switch (value) {
			case UNCONSTRAINED: return UNCONSTRAINED_LITERAL;
			case RESTORE: return RESTORE_LITERAL;
			case WRITE_AS_READ: return WRITE_AS_READ_LITERAL;
			case READ_ONLY: return READ_ONLY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TestConstraintType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //TestConstraintType
