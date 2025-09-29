/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets;

import org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Competing Consumers Group
 * Target</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The CompetingConsumersGroup represents a set of elements that consume
 * messages from a channel/queue asynchronously. In Palladio and the Elasticity extension it is
 * represented as a set of assembly context that deplete a queue modelled through a PassiveResource.
 * The intention of use behind CompetingConsumersGroup is to represent services that asynchronously
 * process workload by fetching messages from a queue. For understanding the pattern itself one can
 * read https://www.enterpriseintegrationpatterns.com/patterns/messaging/CompetingConsumers.html.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget#getCompetingConsumersGroup
 * <em>Competing Consumers Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getCompetingConsumersGroupTarget()
 * @model
 * @generated
 */
public interface CompetingConsumersGroupTarget extends TargetGroup {
    /**
     * Returns the value of the '<em><b>Competing Consumers Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Competing Consumers Group</em>' reference.
     * @see #setCompetingConsumersGroup(CompetingConsumersGroup)
     * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getCompetingConsumersGroupTarget_CompetingConsumersGroup()
     * @model
     * @generated
     */
    CompetingConsumersGroup getCompetingConsumersGroup();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget#getCompetingConsumersGroup
     * <em>Competing Consumers Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Competing Consumers Group</em>' reference.
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    void setCompetingConsumersGroup(CompetingConsumersGroup value);

} // CompetingConsumersGroupTarget
