/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets;

import org.palladiosimulator.scalablepcmgroups.ServiceGroup;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service Group
 * Target</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The ServiceGroup groups a set of components that are load balanced and
 * can be horizontally replicated. Upon replication the load balancer distributes the load to the
 * new replicas according to the predefined load balancing strategy. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.targets.ServiceGroupTarget#getServiceGroup
 * <em>Service Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getServiceGroupTarget()
 * @model
 * @generated
 */
public interface ServiceGroupTarget extends TargetGroup {
    /**
     * Returns the value of the '<em><b>Service Group</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service Group</em>' reference.
     * @see #setServiceGroup(ServiceGroup)
     * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getServiceGroupTarget_ServiceGroup()
     * @model
     * @generated
     */
    ServiceGroup getServiceGroup();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.targets.ServiceGroupTarget#getServiceGroup
     * <em>Service Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Service Group</em>' reference.
     * @see #getServiceGroup()
     * @generated
     */
    void setServiceGroup(ServiceGroup value);

} // ServiceGroupTarget
