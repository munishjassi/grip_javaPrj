/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ChannelsType#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getChannelsType()
 * @model extendedMetaData="name='channels_._type' kind='elementOnly'"
 * @generated
 */
public interface ChannelsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.ChannelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines a set of mirrored interfaces of this component that are connected to one another.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getChannelsType_Channel()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.ChannelType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='channel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getChannel();

} // ChannelsType
