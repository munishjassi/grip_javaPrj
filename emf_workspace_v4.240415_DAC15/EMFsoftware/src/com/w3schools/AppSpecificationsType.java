/**
 */
package com.w3schools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Specifications Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.w3schools.AppSpecificationsType#getApplicationname <em>Applicationname</em>}</li>
 *   <li>{@link com.w3schools.AppSpecificationsType#getCpucycles <em>Cpucycles</em>}</li>
 *   <li>{@link com.w3schools.AppSpecificationsType#getBuscycles <em>Buscycles</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.w3schools.W3schoolsPackage#getAppSpecificationsType()
 * @model extendedMetaData="name='appSpecificationsType' kind='elementOnly'"
 * @generated
 */
public interface AppSpecificationsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Applicationname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicationname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicationname</em>' attribute.
	 * @see #setApplicationname(String)
	 * @see com.w3schools.W3schoolsPackage#getAppSpecificationsType_Applicationname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='applicationname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApplicationname();

	/**
	 * Sets the value of the '{@link com.w3schools.AppSpecificationsType#getApplicationname <em>Applicationname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicationname</em>' attribute.
	 * @see #getApplicationname()
	 * @generated
	 */
	void setApplicationname(String value);

	/**
	 * Returns the value of the '<em><b>Cpucycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpucycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpucycles</em>' attribute.
	 * @see #isSetCpucycles()
	 * @see #unsetCpucycles()
	 * @see #setCpucycles(int)
	 * @see com.w3schools.W3schoolsPackage#getAppSpecificationsType_Cpucycles()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='cpucycles' namespace='##targetNamespace'"
	 * @generated
	 */
	int getCpucycles();

	/**
	 * Sets the value of the '{@link com.w3schools.AppSpecificationsType#getCpucycles <em>Cpucycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpucycles</em>' attribute.
	 * @see #isSetCpucycles()
	 * @see #unsetCpucycles()
	 * @see #getCpucycles()
	 * @generated
	 */
	void setCpucycles(int value);

	/**
	 * Unsets the value of the '{@link com.w3schools.AppSpecificationsType#getCpucycles <em>Cpucycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCpucycles()
	 * @see #getCpucycles()
	 * @see #setCpucycles(int)
	 * @generated
	 */
	void unsetCpucycles();

	/**
	 * Returns whether the value of the '{@link com.w3schools.AppSpecificationsType#getCpucycles <em>Cpucycles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cpucycles</em>' attribute is set.
	 * @see #unsetCpucycles()
	 * @see #getCpucycles()
	 * @see #setCpucycles(int)
	 * @generated
	 */
	boolean isSetCpucycles();

	/**
	 * Returns the value of the '<em><b>Buscycles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buscycles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buscycles</em>' attribute.
	 * @see #isSetBuscycles()
	 * @see #unsetBuscycles()
	 * @see #setBuscycles(int)
	 * @see com.w3schools.W3schoolsPackage#getAppSpecificationsType_Buscycles()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='buscycles' namespace='##targetNamespace'"
	 * @generated
	 */
	int getBuscycles();

	/**
	 * Sets the value of the '{@link com.w3schools.AppSpecificationsType#getBuscycles <em>Buscycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buscycles</em>' attribute.
	 * @see #isSetBuscycles()
	 * @see #unsetBuscycles()
	 * @see #getBuscycles()
	 * @generated
	 */
	void setBuscycles(int value);

	/**
	 * Unsets the value of the '{@link com.w3schools.AppSpecificationsType#getBuscycles <em>Buscycles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBuscycles()
	 * @see #getBuscycles()
	 * @see #setBuscycles(int)
	 * @generated
	 */
	void unsetBuscycles();

	/**
	 * Returns whether the value of the '{@link com.w3schools.AppSpecificationsType#getBuscycles <em>Buscycles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Buscycles</em>' attribute is set.
	 * @see #unsetBuscycles()
	 * @see #getBuscycles()
	 * @see #setBuscycles(int)
	 * @generated
	 */
	boolean isSetBuscycles();

} // AppSpecificationsType
