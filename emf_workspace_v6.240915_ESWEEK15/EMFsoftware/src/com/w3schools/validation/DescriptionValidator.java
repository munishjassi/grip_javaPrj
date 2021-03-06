/**
 *
 * $Id$
 */
package com.w3schools.validation;


/**
 * A sample validator interface for {@link com.w3schools.Description}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DescriptionValidator {
	boolean validate();

	boolean validateCdescription(String value);
	boolean validateCppdescription(String value);
	boolean validateAsmdescription(String value);
}
