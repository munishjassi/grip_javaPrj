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
 * A representation of the model object '<em><b>Abstractor Generators Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractorGeneratorsType#getAbstractorGenerator <em>Abstractor Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorGeneratorsType()
 * @model extendedMetaData="name='abstractorGenerators_._type' kind='elementOnly'"
 * @generated
 */
public interface AbstractorGeneratorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstractor Generator</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of abstractor generators. The scope attribute applies to abstractor generators and specifies whether the generator should be run for each instance of the entity (or module) or just once for all instances of the entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstractor Generator</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getAbstractorGeneratorsType_AbstractorGenerator()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.InstanceGeneratorType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstractorGenerator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getAbstractorGenerator();

} // AbstractorGeneratorsType
