/**
 */
package org.palladiosimulator.scalablepcmgroups;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.PassiveResource;

import org.palladiosimulator.pcm.usagemodel.UsageScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.Queue#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.Queue#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.Queue#getUsageScenarioForConsumption <em>Usage Scenario For Consumption</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getQueue()
 * @model
 * @generated
 */
public interface Queue extends EObject {
    /**
     * Returns the value of the '<em><b>Passive Resource Queue Messages</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Passive Resource Queue Messages</em>' reference.
     * @see #setPassiveResourceQueueMessages(PassiveResource)
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getQueue_PassiveResourceQueueMessages()
     * @model
     * @generated
     */
    PassiveResource getPassiveResourceQueueMessages();

    /**
     * Sets the value of the '{@link org.palladiosimulator.scalablepcmgroups.Queue#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Passive Resource Queue Messages</em>' reference.
     * @see #getPassiveResourceQueueMessages()
     * @generated
     */
    void setPassiveResourceQueueMessages(PassiveResource value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getQueue_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.palladiosimulator.scalablepcmgroups.Queue#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Usage Scenario For Consumption</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage Scenario For Consumption</em>' reference.
     * @see #setUsageScenarioForConsumption(UsageScenario)
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getQueue_UsageScenarioForConsumption()
     * @model
     * @generated
     */
    UsageScenario getUsageScenarioForConsumption();

    /**
     * Sets the value of the '{@link org.palladiosimulator.scalablepcmgroups.Queue#getUsageScenarioForConsumption <em>Usage Scenario For Consumption</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage Scenario For Consumption</em>' reference.
     * @see #getUsageScenarioForConsumption()
     * @generated
     */
    void setUsageScenarioForConsumption(UsageScenario value);

} // Queue
