/**
 */
package org.palladiosimulator.spdmeasuringpoint.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpdmeasuringpointXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdmeasuringpointXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SpdmeasuringpointPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the SpdmeasuringpointResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SpdmeasuringpointResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SpdmeasuringpointResourceFactoryImpl());
		}
		return registrations;
	}

} //SpdmeasuringpointXMLProcessor
