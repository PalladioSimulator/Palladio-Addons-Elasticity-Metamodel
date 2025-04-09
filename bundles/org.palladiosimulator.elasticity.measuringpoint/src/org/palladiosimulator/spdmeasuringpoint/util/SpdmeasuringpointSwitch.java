/**
 */
package org.palladiosimulator.spdmeasuringpoint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

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
 * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage
 * @generated
 */
public class SpdmeasuringpointSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpdmeasuringpointPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdmeasuringpointSwitch() {
		if (modelPackage == null) {
			modelPackage = SpdmeasuringpointPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT: {
			ElasticInfrastructureMeasuringPoint elasticInfrastructureMeasuringPoint = (ElasticInfrastructureMeasuringPoint) theEObject;
			T result = caseElasticInfrastructureMeasuringPoint(elasticInfrastructureMeasuringPoint);
			if (result == null)
				result = caseMeasuringPoint(elasticInfrastructureMeasuringPoint);
			if (result == null)
				result = caseElasticInfrastructureReference(elasticInfrastructureMeasuringPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT: {
			ServiceGroupMeasuringPoint serviceGroupMeasuringPoint = (ServiceGroupMeasuringPoint) theEObject;
			T result = caseServiceGroupMeasuringPoint(serviceGroupMeasuringPoint);
			if (result == null)
				result = caseMeasuringPoint(serviceGroupMeasuringPoint);
			if (result == null)
				result = caseServiceGroupReference(serviceGroupMeasuringPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT: {
			CompetingConsumerGroupMeasuringPoint competingConsumerGroupMeasuringPoint = (CompetingConsumerGroupMeasuringPoint) theEObject;
			T result = caseCompetingConsumerGroupMeasuringPoint(competingConsumerGroupMeasuringPoint);
			if (result == null)
				result = caseMeasuringPoint(competingConsumerGroupMeasuringPoint);
			if (result == null)
				result = caseCompetingConsumerGroupReference(competingConsumerGroupMeasuringPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE: {
			ServiceGroupReference serviceGroupReference = (ServiceGroupReference) theEObject;
			T result = caseServiceGroupReference(serviceGroupReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE: {
			ElasticInfrastructureReference elasticInfrastructureReference = (ElasticInfrastructureReference) theEObject;
			T result = caseElasticInfrastructureReference(elasticInfrastructureReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE: {
			CompetingConsumerGroupReference competingConsumerGroupReference = (CompetingConsumerGroupReference) theEObject;
			T result = caseCompetingConsumerGroupReference(competingConsumerGroupReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elastic Infrastructure Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elastic Infrastructure Measuring Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticInfrastructureMeasuringPoint(ElasticInfrastructureMeasuringPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Group Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Group Measuring Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceGroupMeasuringPoint(ServiceGroupMeasuringPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Competing Consumer Group Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Competing Consumer Group Measuring Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompetingConsumerGroupMeasuringPoint(CompetingConsumerGroupMeasuringPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Group Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Group Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceGroupReference(ServiceGroupReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elastic Infrastructure Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elastic Infrastructure Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticInfrastructureReference(ElasticInfrastructureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Competing Consumer Group Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Competing Consumer Group Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompetingConsumerGroupReference(CompetingConsumerGroupReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuringPoint(MeasuringPoint object) {
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

} //SpdmeasuringpointSwitch
