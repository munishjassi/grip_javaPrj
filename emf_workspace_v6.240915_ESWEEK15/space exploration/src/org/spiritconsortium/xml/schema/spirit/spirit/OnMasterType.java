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
 * A representation of the model object '<em><b>On Master Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType#getPresence <em>Presence</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getOnMasterType()
 * @model extendedMetaData="name='onMaster_._type' kind='elementOnly'"
 * @generated
 */
public interface OnMasterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Presence</b></em>' attribute.
	 * The default value is <code>"optional"</code>.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit.spirit.PresenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this element is present, the existance of the port is controlled by the specified value. valid values are 'illegal', 'required' and 'optional'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Presence</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PresenceType
	 * @see #isSetPresence()
	 * @see #unsetPresence()
	 * @see #setPresence(PresenceType)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getOnMasterType_Presence()
	 * @model default="optional" unsettable="true"
	 *        extendedMetaData="kind='element' name='presence' namespace='##targetNamespace'"
	 * @generated
	 */
	PresenceType getPresence();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.PresenceType
	 * @see #isSetPresence()
	 * @see #unsetPresence()
	 * @see #getPresence()
	 * @generated
	 */
	void setPresence(PresenceType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType#getPresence <em>Presence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresence()
	 * @see #getPresence()
	 * @see #setPresence(PresenceType)
	 * @generated
	 */
	void unsetPresence();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType#getPresence <em>Presence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presence</em>' attribute is set.
	 * @see #unsetPresence()
	 * @see #getPresence()
	 * @see #setPresence(PresenceType)
	 * @generated
	 */
	boolean isSetPresence();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service that this transactional port can provide or requires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceType1)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getOnMasterType_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceType1 getService();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.OnMasterType#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceType1 value);

} // OnMasterType
