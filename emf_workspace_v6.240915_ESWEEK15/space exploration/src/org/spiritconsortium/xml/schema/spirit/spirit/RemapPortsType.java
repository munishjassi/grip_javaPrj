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
 * A representation of the model object '<em><b>Remap Ports Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.RemapPortsType#getRemapPort <em>Remap Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getRemapPortsType()
 * @model extendedMetaData="name='remapPorts_._type' kind='elementOnly'"
 * @generated
 */
public interface RemapPortsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Remap Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.RemapPortType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the name and value of a port on the component, the value indicates the logic value which this port must take to effect the remapping. The portMapRef attribute stores the name of the port which takes that value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remap Port</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getRemapPortsType_RemapPort()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.RemapPortType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='remapPort' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getRemapPort();

} // RemapPortsType
