/**
 */
package com.w3schools.util;

import com.w3schools.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.w3schools.W3schoolsPackage
 * @generated
 */
public class W3schoolsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static W3schoolsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W3schoolsSwitch() {
		if (modelPackage == null) {
			modelPackage = W3schoolsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case W3schoolsPackage.APPLICATION_TYPE: {
				ApplicationType applicationType = (ApplicationType)theEObject;
				T result = caseApplicationType(applicationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.APP_SPECIFICATIONS_TYPE: {
				AppSpecificationsType appSpecificationsType = (AppSpecificationsType)theEObject;
				T result = caseAppSpecificationsType(appSpecificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.HWMAPPING: {
				Hwmapping hwmapping = (Hwmapping)theEObject;
				T result = caseHwmapping(hwmapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.HWMAPPINGS: {
				Hwmappings hwmappings = (Hwmappings)theEObject;
				T result = caseHwmappings(hwmappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.LOOP_SPECIFICATIONS_TYPE: {
				LoopSpecificationsType loopSpecificationsType = (LoopSpecificationsType)theEObject;
				T result = caseLoopSpecificationsType(loopSpecificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.LOOP_TYPE: {
				LoopType loopType = (LoopType)theEObject;
				T result = caseLoopType(loopType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.MOD_SPECIFICATIONS_TYPE: {
				ModSpecificationsType modSpecificationsType = (ModSpecificationsType)theEObject;
				T result = caseModSpecificationsType(modSpecificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.PERFORMANCE: {
				Performance performance = (Performance)theEObject;
				T result = casePerformance(performance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.SUBMODULES_TYPE: {
				SubmodulesType submodulesType = (SubmodulesType)theEObject;
				T result = caseSubmodulesType(submodulesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case W3schoolsPackage.SUBMODULE_TYPE: {
				SubmoduleType submoduleType = (SubmoduleType)theEObject;
				T result = caseSubmoduleType(submoduleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationType(ApplicationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Specifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Specifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppSpecificationsType(AppSpecificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hwmapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hwmapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwmapping(Hwmapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hwmappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hwmappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwmappings(Hwmappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Specifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Specifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopSpecificationsType(LoopSpecificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoopType(LoopType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mod Specifications Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mod Specifications Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModSpecificationsType(ModSpecificationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformance(Performance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodules Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodules Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodulesType(SubmodulesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmoduleType(SubmoduleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //W3schoolsSwitch
