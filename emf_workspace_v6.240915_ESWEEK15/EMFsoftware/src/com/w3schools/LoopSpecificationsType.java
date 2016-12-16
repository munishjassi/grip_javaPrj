/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Specifications Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.LoopSpecificationsType#getLoopname <em>Loopname</em>}</li>
 *   <li>{@link com.w3schools.LoopSpecificationsType#getNumber <em>Number</em>}</li>
 *   <li>{@link com.w3schools.LoopSpecificationsType#getStartsubmodule <em>Startsubmodule</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getLoopSpecificationsType()
 * @model extendedMetaData="name='loopSpecificationsType' kind='elementOnly'"
 * @generated
 */
public interface LoopSpecificationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Loopname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loopname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loopname</em>' attribute.
	 * @see #setLoopname(String)
	 * @see com.w3schools.W3schoolsPackage#getLoopSpecificationsType_Loopname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='loopname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLoopname();

	/**
	 * Sets the value of the '{@link com.w3schools.LoopSpecificationsType#getLoopname <em>Loopname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loopname</em>' attribute.
	 * @see #getLoopname()
	 * @generated
	 */
	void setLoopname(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see com.w3schools.W3schoolsPackage#getLoopSpecificationsType_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='number' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link com.w3schools.LoopSpecificationsType#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Startsubmodule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startsubmodule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startsubmodule</em>' attribute.
	 * @see #setStartsubmodule(String)
	 * @see com.w3schools.W3schoolsPackage#getLoopSpecificationsType_Startsubmodule()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='startsubmodule' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStartsubmodule();

	/**
	 * Sets the value of the '{@link com.w3schools.LoopSpecificationsType#getStartsubmodule <em>Startsubmodule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startsubmodule</em>' attribute.
	 * @see #getStartsubmodule()
	 * @generated
	 */
	void setStartsubmodule(String value);

} // LoopSpecificationsType
