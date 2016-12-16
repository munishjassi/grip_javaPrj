/**
 *
 * $Id$
 */
package com.w3schools.validation;


/**
 * A sample validator interface for {@link com.w3schools.Performance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PerformanceValidator {
	boolean validate();

	boolean validateCpucycles(int value);
	boolean validateBuscycles(int value);
}