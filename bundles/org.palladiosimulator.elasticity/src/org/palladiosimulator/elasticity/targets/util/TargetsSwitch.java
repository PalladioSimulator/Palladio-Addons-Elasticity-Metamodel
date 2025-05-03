/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget;
import org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget;
import org.palladiosimulator.elasticity.targets.ServiceGroupTarget;
import org.palladiosimulator.elasticity.targets.TargetGroup;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.elasticity.targets.TargetsPackage
 * @generated
 */
public class TargetsSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static TargetsPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TargetsSwitch() {
        if (modelPackage == null) {
            modelPackage = TargetsPackage.eINSTANCE;
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
        case TargetsPackage.TARGET_GROUP: {
            final TargetGroup targetGroup = (TargetGroup) theEObject;
            T result = this.caseTargetGroup(targetGroup);
            if (result == null) {
                result = this.caseEntity(targetGroup);
            }
            if (result == null) {
                result = this.caseIdentifier(targetGroup);
            }
            if (result == null) {
                result = this.caseNamedElement(targetGroup);
            }
            if (result == null) {
                result = this.casePCMBaseClass(targetGroup);
            }
            if (result == null) {
                result = this.casePCMClass(targetGroup);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TargetsPackage.INFRASTRUCTURE_GROUP_TARGET: {
            final InfrastructureGroupTarget infrastructureGroupTarget = (InfrastructureGroupTarget) theEObject;
            T result = this.caseInfrastructureGroupTarget(infrastructureGroupTarget);
            if (result == null) {
                result = this.caseTargetGroup(infrastructureGroupTarget);
            }
            if (result == null) {
                result = this.caseEntity(infrastructureGroupTarget);
            }
            if (result == null) {
                result = this.caseIdentifier(infrastructureGroupTarget);
            }
            if (result == null) {
                result = this.caseNamedElement(infrastructureGroupTarget);
            }
            if (result == null) {
                result = this.casePCMBaseClass(infrastructureGroupTarget);
            }
            if (result == null) {
                result = this.casePCMClass(infrastructureGroupTarget);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TargetsPackage.SERVICE_GROUP_TARGET: {
            final ServiceGroupTarget serviceGroupTarget = (ServiceGroupTarget) theEObject;
            T result = this.caseServiceGroupTarget(serviceGroupTarget);
            if (result == null) {
                result = this.caseTargetGroup(serviceGroupTarget);
            }
            if (result == null) {
                result = this.caseEntity(serviceGroupTarget);
            }
            if (result == null) {
                result = this.caseIdentifier(serviceGroupTarget);
            }
            if (result == null) {
                result = this.caseNamedElement(serviceGroupTarget);
            }
            if (result == null) {
                result = this.casePCMBaseClass(serviceGroupTarget);
            }
            if (result == null) {
                result = this.casePCMClass(serviceGroupTarget);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET: {
            final CompetingConsumersGroupTarget competingConsumersGroupTarget = (CompetingConsumersGroupTarget) theEObject;
            T result = this.caseCompetingConsumersGroupTarget(competingConsumersGroupTarget);
            if (result == null) {
                result = this.caseTargetGroup(competingConsumersGroupTarget);
            }
            if (result == null) {
                result = this.caseEntity(competingConsumersGroupTarget);
            }
            if (result == null) {
                result = this.caseIdentifier(competingConsumersGroupTarget);
            }
            if (result == null) {
                result = this.caseNamedElement(competingConsumersGroupTarget);
            }
            if (result == null) {
                result = this.casePCMBaseClass(competingConsumersGroupTarget);
            }
            if (result == null) {
                result = this.casePCMClass(competingConsumersGroupTarget);
            }
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
     * Returns the result of interpreting the object as an instance of '<em>Target Group</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTargetGroup(final TargetGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Infrastructure Group
     * Target</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Infrastructure Group
     *         Target</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInfrastructureGroupTarget(final InfrastructureGroupTarget object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Group
     * Target</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Group
     *         Target</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceGroupTarget(final ServiceGroupTarget object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Competing Consumers
     * Group Target</em>'. <!-- begin-user-doc --> This implementation returns null; returning a
     * non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Competing Consumers
     *         Group Target</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompetingConsumersGroupTarget(final CompetingConsumersGroupTarget object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PCM Class</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PCM Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCMClass(final PCMClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCMBaseClass(final PCMBaseClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object) {
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

} // TargetsSwitch
