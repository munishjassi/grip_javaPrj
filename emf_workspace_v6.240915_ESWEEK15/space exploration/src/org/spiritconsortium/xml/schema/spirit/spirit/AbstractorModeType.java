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
 * A representation of the literals of the enumeration '<em><b>Abstractor Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Mode for this abstractor
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorModeType()
 * @model extendedMetaData="name='abstractorModeType'"
 * @generated
 */
public final class AbstractorModeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Master</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTER_LITERAL
	 * @model name="master"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER = 0;

	/**
	 * The '<em><b>Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Slave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLAVE_LITERAL
	 * @model name="slave"
	 * @generated
	 * @ordered
	 */
	public static final int SLAVE = 1;

	/**
	 * The '<em><b>Direct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Direct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIRECT_LITERAL
	 * @model name="direct"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT = 2;

	/**
	 * The '<em><b>System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_LITERAL
	 * @model name="system"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM = 3;

	/**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @generated
	 * @ordered
	 */
	public static final AbstractorModeType MASTER_LITERAL = new AbstractorModeType(MASTER, "master", "master");

	/**
	 * The '<em><b>Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLAVE
	 * @generated
	 * @ordered
	 */
	public static final AbstractorModeType SLAVE_LITERAL = new AbstractorModeType(SLAVE, "slave", "slave");

	/**
	 * The '<em><b>Direct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT
	 * @generated
	 * @ordered
	 */
	public static final AbstractorModeType DIRECT_LITERAL = new AbstractorModeType(DIRECT, "direct", "direct");

	/**
	 * The '<em><b>System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @generated
	 * @ordered
	 */
	public static final AbstractorModeType SYSTEM_LITERAL = new AbstractorModeType(SYSTEM, "system", "system");

	/**
	 * An array of all the '<em><b>Abstractor Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AbstractorModeType[] VALUES_ARRAY =
		new AbstractorModeType[] {
			MASTER_LITERAL,
			SLAVE_LITERAL,
			DIRECT_LITERAL,
			SYSTEM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Abstractor Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Abstractor Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractorModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractorModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstractor Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractorModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AbstractorModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Abstractor Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbstractorModeType get(int value) {
		switch (value) {
			case MASTER: return MASTER_LITERAL;
			case SLAVE: return SLAVE_LITERAL;
			case DIRECT: return DIRECT_LITERAL;
			case SYSTEM: return SYSTEM_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AbstractorModeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AbstractorModeType
