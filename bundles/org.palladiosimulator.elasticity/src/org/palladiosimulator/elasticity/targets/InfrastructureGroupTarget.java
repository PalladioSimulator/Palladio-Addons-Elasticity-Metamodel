/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets;

import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Infrastructure Group
 * Target</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The ElasticInfrastructure target groups resource containers on which
 * components are allocated. The ElasticInfrastructure allows the definition of scaling policies for
 * the whole infrastructure which is a common use case covered by the prominent cloud providers. For
 * example, AWS allows the definition of an Autoscaling Group where EC2 instances are automatically
 * provisioned. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget#getInfrastructureGroup
 * <em>Infrastructure Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getInfrastructureGroupTarget()
 * @model
 * @generated
 */
public interface InfrastructureGroupTarget extends TargetGroup {
    /**
     * Returns the value of the '<em><b>Infrastructure Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Infrastructure Group</em>' reference.
     * @see #setInfrastructureGroup(InfrastructureGroup)
     * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getInfrastructureGroupTarget_InfrastructureGroup()
     * @model
     * @generated
     */
    InfrastructureGroup getInfrastructureGroup();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget#getInfrastructureGroup
     * <em>Infrastructure Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Infrastructure Group</em>' reference.
     * @see #getInfrastructureGroup()
     * @generated
     */
    void setInfrastructureGroup(InfrastructureGroup value);

} // InfrastructureGroupTarget
