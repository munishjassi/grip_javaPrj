/**
 *
 * $Id$
 */
package com.w3schools.validation;

import com.w3schools.AppSpecificationsType;
import com.w3schools.ApplicationType;
import com.w3schools.SubmodulesType;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link com.w3schools.DocumentRoot}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DocumentRootValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateXMLNSPrefixMap(EMap<String, String> value);
	boolean validateXSISchemaLocation(EMap<String, String> value);
	boolean validateApplication(ApplicationType value);
	boolean validateSpecifications(AppSpecificationsType value);
	boolean validateSubmodules(SubmodulesType value);
}