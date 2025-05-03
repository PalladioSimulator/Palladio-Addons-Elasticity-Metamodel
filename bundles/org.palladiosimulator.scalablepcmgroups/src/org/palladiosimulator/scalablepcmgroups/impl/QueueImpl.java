/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.scalablepcmgroups.Queue;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Queue</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroups.impl.QueueImpl#getPassiveResourceQueueMessages
 * <em>Passive Resource Queue Messages</em>}</li>
 * <li>{@link org.palladiosimulator.scalablepcmgroups.impl.QueueImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.scalablepcmgroups.impl.QueueImpl#getUsageScenarioForConsumption
 * <em>Usage Scenario For Consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueImpl extends CDOObjectImpl implements Queue {
    /**
     * The cached value of the '{@link #getPassiveResourceQueueMessages() <em>Passive Resource Queue
     * Messages</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPassiveResourceQueueMessages()
     * @generated
     * @ordered
     */
    protected PassiveResource passiveResourceQueueMessages;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getUsageScenarioForConsumption() <em>Usage Scenario For
     * Consumption</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUsageScenarioForConsumption()
     * @generated
     * @ordered
     */
    protected UsageScenario usageScenarioForConsumption;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QueueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return scalablepcmgroupsPackage.Literals.QUEUE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PassiveResource getPassiveResourceQueueMessages() {
        if (this.passiveResourceQueueMessages != null && this.passiveResourceQueueMessages.eIsProxy()) {
            final InternalEObject oldPassiveResourceQueueMessages = (InternalEObject) this.passiveResourceQueueMessages;
            this.passiveResourceQueueMessages = (PassiveResource) this.eResolveProxy(oldPassiveResourceQueueMessages);
            if (this.passiveResourceQueueMessages != oldPassiveResourceQueueMessages) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            scalablepcmgroupsPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES,
                            oldPassiveResourceQueueMessages, this.passiveResourceQueueMessages));
                }
            }
        }
        return this.passiveResourceQueueMessages;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public PassiveResource basicGetPassiveResourceQueueMessages() {
        return this.passiveResourceQueueMessages;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPassiveResourceQueueMessages(final PassiveResource newPassiveResourceQueueMessages) {
        final PassiveResource oldPassiveResourceQueueMessages = this.passiveResourceQueueMessages;
        this.passiveResourceQueueMessages = newPassiveResourceQueueMessages;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    scalablepcmgroupsPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES, oldPassiveResourceQueueMessages,
                    this.passiveResourceQueueMessages));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setName(final String newName) {
        final String oldName = this.name;
        this.name = newName;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, scalablepcmgroupsPackage.QUEUE__NAME, oldName,
                    this.name));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UsageScenario getUsageScenarioForConsumption() {
        if (this.usageScenarioForConsumption != null && this.usageScenarioForConsumption.eIsProxy()) {
            final InternalEObject oldUsageScenarioForConsumption = (InternalEObject) this.usageScenarioForConsumption;
            this.usageScenarioForConsumption = (UsageScenario) this.eResolveProxy(oldUsageScenarioForConsumption);
            if (this.usageScenarioForConsumption != oldUsageScenarioForConsumption) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            scalablepcmgroupsPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION,
                            oldUsageScenarioForConsumption, this.usageScenarioForConsumption));
                }
            }
        }
        return this.usageScenarioForConsumption;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UsageScenario basicGetUsageScenarioForConsumption() {
        return this.usageScenarioForConsumption;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageScenarioForConsumption(final UsageScenario newUsageScenarioForConsumption) {
        final UsageScenario oldUsageScenarioForConsumption = this.usageScenarioForConsumption;
        this.usageScenarioForConsumption = newUsageScenarioForConsumption;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    scalablepcmgroupsPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION, oldUsageScenarioForConsumption,
                    this.usageScenarioForConsumption));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case scalablepcmgroupsPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
            if (resolve) {
                return this.getPassiveResourceQueueMessages();
            }
            return this.basicGetPassiveResourceQueueMessages();
        case scalablepcmgroupsPackage.QUEUE__NAME:
            return this.getName();
        case scalablepcmgroupsPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
            if (resolve) {
                return this.getUsageScenarioForConsumption();
            }
            return this.basicGetUsageScenarioForConsumption();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case scalablepcmgroupsPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
            this.setPassiveResourceQueueMessages((PassiveResource) newValue);
            return;
        case scalablepcmgroupsPackage.QUEUE__NAME:
            this.setName((String) newValue);
            return;
        case scalablepcmgroupsPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
            this.setUsageScenarioForConsumption((UsageScenario) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case scalablepcmgroupsPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
            this.setPassiveResourceQueueMessages((PassiveResource) null);
            return;
        case scalablepcmgroupsPackage.QUEUE__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case scalablepcmgroupsPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
            this.setUsageScenarioForConsumption((UsageScenario) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case scalablepcmgroupsPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
            return this.passiveResourceQueueMessages != null;
        case scalablepcmgroupsPackage.QUEUE__NAME:
            return NAME_EDEFAULT == null ? this.name != null : !NAME_EDEFAULT.equals(this.name);
        case scalablepcmgroupsPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
            return this.usageScenarioForConsumption != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(this.name);
        result.append(')');
        return result.toString();
    }

} // QueueImpl
