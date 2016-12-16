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
 * A representation of the model object '<em><b>Physical Port Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1#getName <em>Name</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1#getVector <em>Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getPhysicalPortType1()
 * @model extendedMetaData="name='physicalPort_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface PhysicalPortType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Component port name as specified inside the model port section
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getPhysicalPortType1_Name()
	 * @model dataType="org.spiritconsortium.xml.schema.spirit.spirit.PortName" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the indecies for a vectored port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(VectorType2)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getPhysicalPortType1_Vector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vector' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType2 getVector();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.PhysicalPortType1#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(VectorType2 value);

} // PhysicalPortType1
