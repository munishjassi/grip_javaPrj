/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hwmapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.Hwmapping#getMappingname <em>Mappingname</em>}</li>
 *   <li>{@link com.w3schools.Hwmapping#getPerformance <em>Performance</em>}</li>
 *   <li>{@link com.w3schools.Hwmapping#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getHwmapping()
 * @model extendedMetaData="name='hwmapping' kind='elementOnly'"
 * @generated
 */
public interface Hwmapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappingname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappingname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappingname</em>' attribute.
	 * @see #setMappingname(String)
	 * @see com.w3schools.W3schoolsPackage#getHwmapping_Mappingname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='mappingname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMappingname();

	/**
	 * Sets the value of the '{@link com.w3schools.Hwmapping#getMappingname <em>Mappingname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mappingname</em>' attribute.
	 * @see #getMappingname()
	 * @generated
	 */
	void setMappingname(String value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference.
	 * @see #setPerformance(Performance)
	 * @see com.w3schools.W3schoolsPackage#getHwmapping_Performance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='performance' namespace='##targetNamespace'"
	 * @generated
	 */
	Performance getPerformance();

	/**
	 * Sets the value of the '{@link com.w3schools.Hwmapping#getPerformance <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' containment reference.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(Performance value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see com.w3schools.W3schoolsPackage#getHwmapping_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link com.w3schools.Hwmapping#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

} // Hwmapping
