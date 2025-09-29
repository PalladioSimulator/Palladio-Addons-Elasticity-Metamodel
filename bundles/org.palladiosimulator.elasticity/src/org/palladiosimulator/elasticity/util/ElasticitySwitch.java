/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.elasticity.ElasticitySpec;
import org.palladiosimulator.elasticity.ModelBasedScalingPolicy;
import org.palladiosimulator.elasticity.ScalingPolicy;
import org.palladiosimulator.elasticity.TriggerBasedScalingPolicy;
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
 * @see org.palladiosimulator.elasticity.ElasticityPackage
 * @generated
 */
public class ElasticitySwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ElasticityPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ElasticitySwitch() {
        if (modelPackage == null) {
            modelPackage = ElasticityPackage.eINSTANCE;
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
        case ElasticityPackage.TRIGGER_BASED_SCALING_POLICY: {
            final TriggerBasedScalingPolicy triggerBasedScalingPolicy = (TriggerBasedScalingPolicy) theEObject;
            T result = this.caseTriggerBasedScalingPolicy(triggerBasedScalingPolicy);
            if (result == null) {
                result = this.caseScalingPolicy(triggerBasedScalingPolicy);
            }
            if (result == null) {
                result = this.caseEntity(triggerBasedScalingPolicy);
            }
            if (result == null) {
                result = this.caseIdentifier(triggerBasedScalingPolicy);
            }
            if (result == null) {
                result = this.caseNamedElement(triggerBasedScalingPolicy);
            }
            if (result == null) {
                result = this.casePCMBaseClass(triggerBasedScalingPolicy);
            }
            if (result == null) {
                result = this.casePCMClass(triggerBasedScalingPolicy);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ElasticityPackage.ELASTICITY_SPEC: {
            final ElasticitySpec elasticitySpec = (ElasticitySpec) theEObject;
            T result = this.caseElasticitySpec(elasticitySpec);
            if (result == null) {
                result = this.caseEntity(elasticitySpec);
            }
            if (result == null) {
                result = this.caseIdentifier(elasticitySpec);
            }
            if (result == null) {
                result = this.caseNamedElement(elasticitySpec);
            }
            if (result == null) {
                result = this.casePCMBaseClass(elasticitySpec);
            }
            if (result == null) {
                result = this.casePCMClass(elasticitySpec);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ElasticityPackage.SCALING_POLICY: {
            final ScalingPolicy scalingPolicy = (ScalingPolicy) theEObject;
            T result = this.caseScalingPolicy(scalingPolicy);
            if (result == null) {
                result = this.caseEntity(scalingPolicy);
            }
            if (result == null) {
                result = this.caseIdentifier(scalingPolicy);
            }
            if (result == null) {
                result = this.caseNamedElement(scalingPolicy);
            }
            if (result == null) {
                result = this.casePCMBaseClass(scalingPolicy);
            }
            if (result == null) {
                result = this.casePCMClass(scalingPolicy);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case ElasticityPackage.MODEL_BASED_SCALING_POLICY: {
            final ModelBasedScalingPolicy modelBasedScalingPolicy = (ModelBasedScalingPolicy) theEObject;
            T result = this.caseModelBasedScalingPolicy(modelBasedScalingPolicy);
            if (result == null) {
                result = this.caseScalingPolicy(modelBasedScalingPolicy);
            }
            if (result == null) {
                result = this.caseEntity(modelBasedScalingPolicy);
            }
            if (result == null) {
                result = this.caseIdentifier(modelBasedScalingPolicy);
            }
            if (result == null) {
                result = this.caseNamedElement(modelBasedScalingPolicy);
            }
            if (result == null) {
                result = this.casePCMBaseClass(modelBasedScalingPolicy);
            }
            if (result == null) {
                result = this.casePCMClass(modelBasedScalingPolicy);
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
     * Returns the result of interpreting the object as an instance of '<em>Trigger Based Scaling
     * Policy</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Trigger Based Scaling
     *         Policy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTriggerBasedScalingPolicy(final TriggerBasedScalingPolicy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Spec</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Spec</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElasticitySpec(final ElasticitySpec object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scaling Policy</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scaling Policy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScalingPolicy(final ScalingPolicy object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Model Based Scaling
     * Policy</em>'. <!-- begin-user-doc --> This implementation returns null; returning a non-null
     * result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Model Based Scaling
     *         Policy</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseModelBasedScalingPolicy(final ModelBasedScalingPolicy object) {
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

} // ElasticitySwitch
