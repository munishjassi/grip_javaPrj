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
 * A representation of the model object '<em><b>Model Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.ModelParametersType#getModelParameter <em>Model Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getModelParametersType()
 * @model extendedMetaData="name='modelParameters_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.spiritconsortium.xml.schema.spirit.spirit.NameValueTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A model parameter name value pair. The name is given in an attribute. The value is the element value. The dataType (applicable to high level modeling) is given in the dataType attribute. For hardware based models, the name should be identical to the RTL (VHDL generic or Verilog parameter). The usageType attribute indicates how the model parameter is to be used.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Parameter</em>' containment reference list.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getModelParametersType_ModelParameter()
	 * @model type="org.spiritconsortium.xml.schema.spirit.spirit.NameValueTypeType" containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modelParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getModelParameter();

} // ModelParametersType
