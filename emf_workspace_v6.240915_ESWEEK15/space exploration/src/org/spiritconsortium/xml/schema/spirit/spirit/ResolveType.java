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
 * A representation of the literals of the enumeration '<em><b>Resolve Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Determines how a property is resolved.  Immediate means the value is included in the XML document and cannot be changed by the user.  User means the value must be obtained from the user.  Dependent means the value depends on the value of other properties.  A dependency expression must be supplied in the dependency attribute.  Generated means the value will be provided by a generator.
 * <!-- end-model-doc -->
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getResolveType()
 * @model extendedMetaData="name='resolveType'"
 * @generated
 */
public final class ResolveType extends AbstractEnumerator {
	/**
	 * The '<em><b>Immediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property value is included in the XML file.  It cannot be configured.
	 * <!-- end-model-doc -->
	 * @see #IMMEDIATE_LITERAL
	 * @model name="immediate"
	 * @generated
	 * @ordered
	 */
	public static final int IMMEDIATE = 0;

	/**
	 * The '<em><b>User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property content can be modified through confiugration.  Modifications will be saved with the design.
	 * <!-- end-model-doc -->
	 * @see #USER_LITERAL
	 * @model name="user"
	 * @generated
	 * @ordered
	 */
	public static final int USER = 1;

	/**
	 * The '<em><b>Dependent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property value is expressed as an XPath expression which may refer to other properties.  The expression must appear in the dendency attribute.
	 * <!-- end-model-doc -->
	 * @see #DEPENDENT_LITERAL
	 * @model name="dependent"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDENT = 2;

	/**
	 * The '<em><b>Generated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generators may modify this property.  Modifications get saved with the design.
	 * <!-- end-model-doc -->
	 * @see #GENERATED_LITERAL
	 * @model name="generated"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATED = 3;

	/**
	 * The '<em><b>Immediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE
	 * @generated
	 * @ordered
	 */
	public static final ResolveType IMMEDIATE_LITERAL = new ResolveType(IMMEDIATE, "immediate", "immediate");

	/**
	 * The '<em><b>User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER
	 * @generated
	 * @ordered
	 */
	public static final ResolveType USER_LITERAL = new ResolveType(USER, "user", "user");

	/**
	 * The '<em><b>Dependent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDENT
	 * @generated
	 * @ordered
	 */
	public static final ResolveType DEPENDENT_LITERAL = new ResolveType(DEPENDENT, "dependent", "dependent");

	/**
	 * The '<em><b>Generated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERATED
	 * @generated
	 * @ordered
	 */
	public static final ResolveType GENERATED_LITERAL = new ResolveType(GENERATED, "generated", "generated");

	/**
	 * An array of all the '<em><b>Resolve Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResolveType[] VALUES_ARRAY =
		new ResolveType[] {
			IMMEDIATE_LITERAL,
			USER_LITERAL,
			DEPENDENT_LITERAL,
			GENERATED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Resolve Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resolve Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolveType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolveType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolve Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolveType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResolveType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resolve Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResolveType get(int value) {
		switch (value) {
			case IMMEDIATE: return IMMEDIATE_LITERAL;
			case USER: return USER_LITERAL;
			case DEPENDENT: return DEPENDENT_LITERAL;
			case GENERATED: return GENERATED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResolveType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ResolveType
