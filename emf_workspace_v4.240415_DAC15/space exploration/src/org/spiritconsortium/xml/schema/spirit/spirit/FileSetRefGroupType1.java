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
 * A representation of the model object '<em><b>File Set Ref Group Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefGroupType1#getFileSetRef <em>File Set Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getFileSetRefGroupType1()
 * @model extendedMetaData="name='fileSetRefGroup_._type' kind='elementOnly'"
 * @generated
 */
public interface FileSetRefGroupType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>File Set Ref</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a fileSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Set Ref</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getFileSetRefGroupType1_FileSetRef()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.FileSetRefType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fileSetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getFileSetRef();

} // FileSetRefGroupType1
