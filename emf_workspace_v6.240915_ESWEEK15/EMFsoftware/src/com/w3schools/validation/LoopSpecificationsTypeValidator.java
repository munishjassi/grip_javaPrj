/**
 *
 * $Id$
 */
package com.w3schools.validation;


/**
 * A sample validator interface for {@link com.w3schools.LoopSpecificationsType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LoopSpecificationsTypeValidator {
	boolean validate();

	boolean validateLoopname(String value);
	boolean validateNumber(String value);
	boolean validateStartsubmodule(String value);
}
