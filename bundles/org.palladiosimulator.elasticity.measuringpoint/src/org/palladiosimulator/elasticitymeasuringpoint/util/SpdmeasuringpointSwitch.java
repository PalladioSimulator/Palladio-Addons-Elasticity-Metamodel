/**
 */
package org.palladiosimulator.elasticitymeasuringpoint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.elasticitymeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.elasticitymeasuringpoint.SpdmeasuringpointPackage
 * @generated
 */
public class SpdmeasuringpointSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static SpdmeasuringpointPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdmeasuringpointSwitch() {
        if (modelPackage == null) {
            modelPackage = SpdmeasuringpointPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT: {
            final ElasticInfrastructureMeasuringPoint elasticInfrastructureMeasuringPoint = (ElasticInfrastructureMeasuringPoint) theEObject;
            T result = this.caseElasticInfrastructureMeasuringPoint(elasticInfrastructureMeasuringPoint);
            if (result == null) {
                result = this.caseMeasuringPoint(elasticInfrastructureMeasuringPoint);
            }
            if (result == null) {
                result = this.caseElasticInfrastructureReference(elasticInfrastructureMeasuringPoint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT: {
            final ServiceGroupMeasuringPoint serviceGroupMeasuringPoint = (ServiceGroupMeasuringPoint) theEObject;
            T result = this.caseServiceGroupMeasuringPoint(serviceGroupMeasuringPoint);
            if (result == null) {
                result = this.caseMeasuringPoint(serviceGroupMeasuringPoint);
            }
            if (result == null) {
                result = this.caseServiceGroupReference(serviceGroupMeasuringPoint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT: {
            final CompetingConsumerGroupMeasuringPoint competingConsumerGroupMeasuringPoint = (CompetingConsumerGroupMeasuringPoint) theEObject;
            T result = this.caseCompetingConsumerGroupMeasuringPoint(competingConsumerGroupMeasuringPoint);
            if (result == null) {
                result = this.caseMeasuringPoint(competingConsumerGroupMeasuringPoint);
            }
            if (result == null) {
                result = this.caseCompetingConsumerGroupReference(competingConsumerGroupMeasuringPoint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE: {
            final ServiceGroupReference serviceGroupReference = (ServiceGroupReference) theEObject;
            T result = this.caseServiceGroupReference(serviceGroupReference);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE: {
            final ElasticInfrastructureReference elasticInfrastructureReference = (ElasticInfrastructureReference) theEObject;
            T result = this.caseElasticInfrastructureReference(elasticInfrastructureReference);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE: {
            final CompetingConsumerGroupReference competingConsumerGroupReference = (CompetingConsumerGroupReference) theEObject;
            T result = this.caseCompetingConsumerGroupReference(competingConsumerGroupReference);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Elastic Infrastructure
     * Measuring Point</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Elastic Infrastructure
     *         Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElasticInfrastructureMeasuringPoint(final ElasticInfrastructureMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Group Measuring
     * Point</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Group Measuring
     *         Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceGroupMeasuringPoint(final ServiceGroupMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Competing Consumer Group
     * Measuring Point</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Competing Consumer Group
     *         Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompetingConsumerGroupMeasuringPoint(final CompetingConsumerGroupMeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Group
     * Reference</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Group
     *         Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceGroupReference(final ServiceGroupReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Elastic Infrastructure
     * Reference</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Elastic Infrastructure
     *         Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElasticInfrastructureReference(final ElasticInfrastructureReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Competing Consumer Group
     * Reference</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Competing Consumer Group
     *         Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompetingConsumerGroupReference(final CompetingConsumerGroupReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasuringPoint(final MeasuringPoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // SpdmeasuringpointSwitch
