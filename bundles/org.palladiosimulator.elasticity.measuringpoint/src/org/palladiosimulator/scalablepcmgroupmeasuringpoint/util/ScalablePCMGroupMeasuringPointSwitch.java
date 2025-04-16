/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage
 * @generated
 */
public class ScalablePCMGroupMeasuringPointSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ScalablePCMGroupMeasuringPointPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ScalablePCMGroupMeasuringPointSwitch() {
        if (modelPackage == null) {
            modelPackage = ScalablePCMGroupMeasuringPointPackage.eINSTANCE;
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT: {
            final InfrastructureGroupMeasuringPoint infrastructureGroupMeasuringPoint = (InfrastructureGroupMeasuringPoint) theEObject;
            T result = this.caseInfrastructureGroupMeasuringPoint(infrastructureGroupMeasuringPoint);
            if (result == null) {
                result = this.caseMeasuringPoint(infrastructureGroupMeasuringPoint);
            }
            if (result == null) {
                result = this.caseInfrastructureGroupReference(infrastructureGroupMeasuringPoint);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT: {
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
        case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT: {
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE: {
            final ServiceGroupReference serviceGroupReference = (ServiceGroupReference) theEObject;
            T result = this.caseServiceGroupReference(serviceGroupReference);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE: {
            final InfrastructureGroupReference infrastructureGroupReference = (InfrastructureGroupReference) theEObject;
            T result = this.caseInfrastructureGroupReference(infrastructureGroupReference);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_REFERENCE: {
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
     * Returns the result of interpreting the object as an instance of '<em>Infrastructure Group
     * Measuring Point</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Infrastructure Group
     *         Measuring Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInfrastructureGroupMeasuringPoint(final InfrastructureGroupMeasuringPoint object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Infrastructure Group
     * Reference</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Infrastructure Group
     *         Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInfrastructureGroupReference(final InfrastructureGroupReference object) {
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

} // ScalablePCMGroupMeasuringPointSwitch
