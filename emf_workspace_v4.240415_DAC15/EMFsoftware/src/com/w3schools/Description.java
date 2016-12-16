/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.Description#getCdescription <em>Cdescription</em>}</li>
 *   <li>{@link com.w3schools.Description#getCppdescription <em>Cppdescription</em>}</li>
 *   <li>{@link com.w3schools.Description#getAsmdescription <em>Asmdescription</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getDescription()
 * @model extendedMetaData="name='description' kind='elementOnly'"
 * @generated
 */
public interface Description extends EObject {
	/**
	 * Returns the value of the '<em><b>Cdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdescription</em>' attribute.
	 * @see #setCdescription(String)
	 * @see com.w3schools.W3schoolsPackage#getDescription_Cdescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='cdescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCdescription();

	/**
	 * Sets the value of the '{@link com.w3schools.Description#getCdescription <em>Cdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdescription</em>' attribute.
	 * @see #getCdescription()
	 * @generated
	 */
	void setCdescription(String value);

	/**
	 * Returns the value of the '<em><b>Cppdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cppdescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cppdescription</em>' attribute.
	 * @see #setCppdescription(String)
	 * @see com.w3schools.W3schoolsPackage#getDescription_Cppdescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='cppdescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCppdescription();

	/**
	 * Sets the value of the '{@link com.w3schools.Description#getCppdescription <em>Cppdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cppdescription</em>' attribute.
	 * @see #getCppdescription()
	 * @generated
	 */
	void setCppdescription(String value);

	/**
	 * Returns the value of the '<em><b>Asmdescription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asmdescription</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asmdescription</em>' attribute.
	 * @see #setAsmdescription(String)
	 * @see com.w3schools.W3schoolsPackage#getDescription_Asmdescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='asmdescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAsmdescription();

	/**
	 * Sets the value of the '{@link com.w3schools.Description#getAsmdescription <em>Asmdescription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asmdescription</em>' attribute.
	 * @see #getAsmdescription()
	 * @generated
	 */
	void setAsmdescription(String value);

} // Description
