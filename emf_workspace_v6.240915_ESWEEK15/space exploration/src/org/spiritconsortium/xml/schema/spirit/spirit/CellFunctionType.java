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
 * A representation of the model object '<em><b>Cell Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getValue <em>Value</em>}</li>
 *   <li>{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getCellStrength <em>Cell Strength</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getCellFunctionType()
 * @model extendedMetaData="name='cellFunction_._type' kind='simple'"
 * @generated
 */
public interface CellFunctionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(CellFunctionValueType)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getCellFunctionType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	CellFunctionValueType getValue();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionValueType
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CellFunctionValueType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(CellFunctionValueType)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(CellFunctionValueType)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Cell Strength</b></em>' attribute.
	 * The literals are from the enumeration {@link org.spiritconsortium.xml.schema.spirit.spirit.CellStrengthValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the desired strength of the specified cell.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cell Strength</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellStrengthValueType
	 * @see #isSetCellStrength()
	 * @see #unsetCellStrength()
	 * @see #setCellStrength(CellStrengthValueType)
	 * @see org.spiritconsortium.xml.schema.spirit.spirit._1Package#getCellFunctionType_CellStrength()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='cellStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	CellStrengthValueType getCellStrength();

	/**
	 * Sets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getCellStrength <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Strength</em>' attribute.
	 * @see org.spiritconsortium.xml.schema.spirit.spirit.CellStrengthValueType
	 * @see #isSetCellStrength()
	 * @see #unsetCellStrength()
	 * @see #getCellStrength()
	 * @generated
	 */
	void setCellStrength(CellStrengthValueType value);

	/**
	 * Unsets the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getCellStrength <em>Cell Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCellStrength()
	 * @see #getCellStrength()
	 * @see #setCellStrength(CellStrengthValueType)
	 * @generated
	 */
	void unsetCellStrength();

	/**
	 * Returns whether the value of the '{@link org.spiritconsortium.xml.schema.spirit.spirit.CellFunctionType#getCellStrength <em>Cell Strength</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cell Strength</em>' attribute is set.
	 * @see #unsetCellStrength()
	 * @see #getCellStrength()
	 * @see #setCellStrength(CellStrengthValueType)
	 * @generated
	 */
	boolean isSetCellStrength();

} // CellFunctionType
