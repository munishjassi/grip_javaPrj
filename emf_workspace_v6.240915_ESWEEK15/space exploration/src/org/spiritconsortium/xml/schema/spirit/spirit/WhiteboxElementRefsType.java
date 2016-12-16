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
 * A representation of the model object '<em><b>Whitebox Element Refs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefsType#getWhiteboxElementRef <em>Whitebox Element Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getWhiteboxElementRefsType()
 * @model extendedMetaData="name='whiteboxElementRefs_._type' kind='elementOnly'"
 * @generated
 */
public interface WhiteboxElementRefsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Whitebox Element Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Reference to a white box element which is visible within this view.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Whitebox Element Ref</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getWhiteboxElementRefsType_WhiteboxElementRef()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.WhiteboxElementRefType" containment="true"
	 *        extendedMetaData="kind='element' name='whiteboxElementRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getWhiteboxElementRef();

} // WhiteboxElementRefsType
