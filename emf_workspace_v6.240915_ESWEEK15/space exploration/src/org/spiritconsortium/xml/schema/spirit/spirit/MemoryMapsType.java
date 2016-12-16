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
 * A representation of the model object '<em><b>Memory Maps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapsType#getMemoryMap <em>Memory Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapsType()
 * @model extendedMetaData="name='memoryMaps_._type' kind='elementOnly'"
 * @generated
 */
public interface MemoryMapsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of address blocks a bus slave contributes to the bus' address space.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Map</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getMemoryMapsType_MemoryMap()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.MemoryMapType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='memoryMap' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getMemoryMap();

} // MemoryMapsType
