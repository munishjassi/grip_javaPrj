/**
 *
 * $Id$
 */
package com.w3schools.validation;

import com.w3schools.AppSpecificationsType;
import com.w3schools.SubmodulesType;

/**
 * A sample validator interface for {@link com.w3schools.ApplicationType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ApplicationTypeValidator {
	boolean validate();

	boolean validateSpecifications(AppSpecificationsType value);
	boolean validateSubmodules(SubmodulesType value);
}
