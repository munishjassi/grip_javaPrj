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
 * A representation of the model object '<em><b>Component Generators Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorsType#getComponentGenerator <em>Component Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getComponentGeneratorsType()
 * @model extendedMetaData="name='componentGenerators_._type' kind='elementOnly'"
 * @generated
 */
public interface ComponentGeneratorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Generator</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a set of component generators. The scope attribute applies to component generators and specifies whether the generator should be run for each instance of the entity (or module) or just once for all instances of the entity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component Generator</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getComponentGeneratorsType_ComponentGenerator()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.ComponentGeneratorType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentGenerator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getComponentGenerator();

} // ComponentGeneratorsType
