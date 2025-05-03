/**
 */
package org.palladiosimulator.scalablepcmgroups.util;

import de.uka.ipd.sdq.identifier.Identifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.scalablepcmgroups.*;

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
 * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage
 * @generated
 */
public class scalablepcmgroupsSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static scalablepcmgroupsPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public scalablepcmgroupsSwitch() {
        if (modelPackage == null) {
            modelPackage = scalablepcmgroupsPackage.eINSTANCE;
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
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS: {
                ScalablePCMGroups scalablePCMGroups = (ScalablePCMGroups)theEObject;
                T result = caseScalablePCMGroups(scalablePCMGroups);
                if (result == null) result = caseEntity(scalablePCMGroups);
                if (result == null) result = caseIdentifier(scalablePCMGroups);
                if (result == null) result = caseNamedElement(scalablePCMGroups);
                if (result == null) result = casePCMBaseClass(scalablePCMGroups);
                if (result == null) result = casePCMClass(scalablePCMGroups);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case scalablepcmgroupsPackage.TARGET_GROUP: {
                TargetGroup targetGroup = (TargetGroup)theEObject;
                T result = caseTargetGroup(targetGroup);
                if (result == null) result = caseEntity(targetGroup);
                if (result == null) result = caseIdentifier(targetGroup);
                if (result == null) result = caseNamedElement(targetGroup);
                if (result == null) result = casePCMBaseClass(targetGroup);
                if (result == null) result = casePCMClass(targetGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case scalablepcmgroupsPackage.INFRASTRUCTURE_GROUP: {
                InfrastructureGroup infrastructureGroup = (InfrastructureGroup)theEObject;
                T result = caseInfrastructureGroup(infrastructureGroup);
                if (result == null) result = caseTargetGroup(infrastructureGroup);
                if (result == null) result = caseEntity(infrastructureGroup);
                if (result == null) result = caseIdentifier(infrastructureGroup);
                if (result == null) result = caseNamedElement(infrastructureGroup);
                if (result == null) result = casePCMBaseClass(infrastructureGroup);
                if (result == null) result = casePCMClass(infrastructureGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case scalablepcmgroupsPackage.SERVICE_GROUP: {
                ServiceGroup serviceGroup = (ServiceGroup)theEObject;
                T result = caseServiceGroup(serviceGroup);
                if (result == null) result = caseTargetGroup(serviceGroup);
                if (result == null) result = caseEntity(serviceGroup);
                if (result == null) result = caseIdentifier(serviceGroup);
                if (result == null) result = caseNamedElement(serviceGroup);
                if (result == null) result = casePCMBaseClass(serviceGroup);
                if (result == null) result = casePCMClass(serviceGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP: {
                CompetingConsumersGroup competingConsumersGroup = (CompetingConsumersGroup)theEObject;
                T result = caseCompetingConsumersGroup(competingConsumersGroup);
                if (result == null) result = caseTargetGroup(competingConsumersGroup);
                if (result == null) result = caseEntity(competingConsumersGroup);
                if (result == null) result = caseIdentifier(competingConsumersGroup);
                if (result == null) result = caseNamedElement(competingConsumersGroup);
                if (result == null) result = casePCMBaseClass(competingConsumersGroup);
                if (result == null) result = casePCMClass(competingConsumersGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case scalablepcmgroupsPackage.QUEUE: {
                Queue queue = (Queue)theEObject;
                T result = caseQueue(queue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Scalable PCM Groups</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Scalable PCM Groups</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseScalablePCMGroups(ScalablePCMGroups object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Target Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Target Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTargetGroup(TargetGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Infrastructure Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Infrastructure Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInfrastructureGroup(InfrastructureGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Service Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Service Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseServiceGroup(ServiceGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Competing Consumers Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Competing Consumers Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCompetingConsumersGroup(CompetingConsumersGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Queue</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Queue</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQueue(Queue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PCM Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PCM Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCMClass(PCMClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>PCM Base Class</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePCMBaseClass(PCMBaseClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(Entity object) {
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

} //scalablepcmgroupsSwitch
