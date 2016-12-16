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
 * A representation of the literals of the enumeration '<em><b>Interface Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getInterfaceModeType()
 * @model extendedMetaData="name='interfaceMode_._type'"
 * @generated
 */
public final class InterfaceModeType extends AbstractEnumerator {
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
	public static final int SYSTEM = 2;

	/**
	 * The '<em><b>Mirrored Master</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Master</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MASTER_LITERAL
	 * @model name="mirroredMaster"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_MASTER = 3;

	/**
	 * The '<em><b>Mirrored Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored Slave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SLAVE_LITERAL
	 * @model name="mirroredSlave"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_SLAVE = 4;

	/**
	 * The '<em><b>Mirrored System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mirrored System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SYSTEM_LITERAL
	 * @model name="mirroredSystem"
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_SYSTEM = 5;

	/**
	 * The '<em><b>Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER
	 * @generated
	 * @ordered
	 */
	public static final InterfaceModeType MASTER_LITERAL = new InterfaceModeType(MASTER, "master", "master");

	/**
	 * The '<em><b>Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLAVE
	 * @generated
	 * @ordered
	 */
	public static final InterfaceModeType SLAVE_LITERAL = new InterfaceModeType(SLAVE, "slave", "slave");

	/**
	 * The '<em><b>System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM
	 * @generated
	 * @ordered
	 */
	public static final InterfaceModeType SYSTEM_LITERAL = new InterfaceModeType(SYSTEM, "system", "system");

	/**
	 * The '<em><b>Mirrored Master</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_MASTER
	 * @generated
	 * @ordered
	 */
	public static final InterfaceModeType MIRRORED_MASTER_LITERAL = new InterfaceModeType(MIRRORED_MASTER, "mirroredMaster", "mirroredMaster");

	/**
	 * The '<em><b>Mirrored Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SLAVE
	 * @generated
	 * @ordered
	 */
	public static final InterfaceModeType MIRRORED_SLAVE_LITERAL = new InterfaceModeType(MIRRORED_SLAVE, "mirroredSlave", "mirroredSlave");

	/**
	 * The '<em><b>Mirrored System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_SYSTEM
	 * @generated
	 * @ordered
	 */
	public static final InterfaceModeType MIRRORED_SYSTEM_LITERAL = new InterfaceModeType(MIRRORED_SYSTEM, "mirroredSystem", "mirroredSystem");

	/**
	 * An array of all the '<em><b>Interface Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterfaceModeType[] VALUES_ARRAY =
		new InterfaceModeType[] {
			MASTER_LITERAL,
			SLAVE_LITERAL,
			SYSTEM_LITERAL,
			MIRRORED_MASTER_LITERAL,
			MIRRORED_SLAVE_LITERAL,
			MIRRORED_SYSTEM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceModeType get(int value) {
		switch (value) {
			case MASTER: return MASTER_LITERAL;
			case SLAVE: return SLAVE_LITERAL;
			case SYSTEM: return SYSTEM_LITERAL;
			case MIRRORED_MASTER: return MIRRORED_MASTER_LITERAL;
			case MIRRORED_SLAVE: return MIRRORED_SLAVE_LITERAL;
			case MIRRORED_SYSTEM: return MIRRORED_SYSTEM_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InterfaceModeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //InterfaceModeType
