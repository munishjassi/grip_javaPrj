/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2#isConstrained <em>Constrained</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getTypeNameType2()
 * @model extendedMetaData="name='typeName_._3_._type' kind='simple'"
 * @generated
 */
public interface TypeNameType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getTypeNameType2_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Constrained</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines that the type for the port has constrainted the number of bits in the vector
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constrained</em>' attribute.
	 * @see #isSetConstrained()
	 * @see #unsetConstrained()
	 * @see #setConstrained(boolean)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getTypeNameType2_Constrained()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='constrained' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isConstrained();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2#isConstrained <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrained</em>' attribute.
	 * @see #isSetConstrained()
	 * @see #unsetConstrained()
	 * @see #isConstrained()
	 * @generated
	 */
	void setConstrained(boolean value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2#isConstrained <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstrained()
	 * @see #isConstrained()
	 * @see #setConstrained(boolean)
	 * @generated
	 */
	void unsetConstrained();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.TypeNameType2#isConstrained <em>Constrained</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constrained</em>' attribute is set.
	 * @see #unsetConstrained()
	 * @see #isConstrained()
	 * @see #setConstrained(boolean)
	 * @generated
	 */
	boolean isSetConstrained();

} // TypeNameType2
