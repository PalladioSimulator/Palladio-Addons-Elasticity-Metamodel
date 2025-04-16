/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets;

import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Infrastructure
 * Group</b></em>'. <!-- end-user-doc -->
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
 * <li>{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getPCM_ResourceEnvironment
 * <em>PCM Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getUnit
 * <em>Unit</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getInfrastructureGroup
 * <em>Infrastructure Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getInfrastructureGroup()
 * @model
 * @generated
 */
public interface InfrastructureGroup extends TargetGroup {
    /**
     * Returns the value of the '<em><b>PCM Resource Environment</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>PCM Resource Environment</em>' reference.
     * @see #isSetPCM_ResourceEnvironment()
     * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getInfrastructureGroup_PCM_ResourceEnvironment()
     * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    ResourceEnvironment getPCM_ResourceEnvironment();

    /**
     * Returns whether the value of the
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getPCM_ResourceEnvironment
     * <em>PCM Resource Environment</em>}' reference is set. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return whether the value of the '<em>PCM Resource Environment</em>' reference is set.
     * @see #getPCM_ResourceEnvironment()
     * @generated
     */
    boolean isSetPCM_ResourceEnvironment();

    /**
     * Returns the value of the '<em><b>Unit</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Unit</em>' reference.
     * @see #setUnit(ResourceContainer)
     * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getInfrastructureGroup_Unit()
     * @model
     * @generated
     */
    ResourceContainer getUnit();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getUnit <em>Unit</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Unit</em>' reference.
     * @see #getUnit()
     * @generated
     */
    void setUnit(ResourceContainer value);

    /**
     * Returns the value of the '<em><b>Infrastructure Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Infrastructure Group</em>' reference.
     * @see #setInfrastructureGroup(org.palladiosimulator.scalablepcmgroups.InfrastructureGroup)
     * @see org.palladiosimulator.elasticity.targets.TargetsPackage#getInfrastructureGroup_InfrastructureGroup()
     * @model
     * @generated
     */
    org.palladiosimulator.scalablepcmgroups.InfrastructureGroup getInfrastructureGroup();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getInfrastructureGroup
     * <em>Infrastructure Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Infrastructure Group</em>' reference.
     * @see #getInfrastructureGroup()
     * @generated
     */
    void setInfrastructureGroup(org.palladiosimulator.scalablepcmgroups.InfrastructureGroup value);

} // InfrastructureGroup
