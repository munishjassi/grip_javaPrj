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
 * A representation of the model object '<em><b>Views Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ViewsType#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getViewsType()
 * @model extendedMetaData="name='views_._type' kind='elementOnly'"
 * @generated
 */
public interface ViewsType extends EObject {
	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.ViewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Single view of a component
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getViewsType_View()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.ViewType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='view' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getView();

} // ViewsType
