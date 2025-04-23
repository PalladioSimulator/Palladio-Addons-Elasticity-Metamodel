/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.elasticity.targets.TargetsFactory
 * @model kind="package"
 * @generated
 */
public interface TargetsPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "targets";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/Elasticity/Targets/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "targets";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TargetsPackage eINSTANCE = org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl.init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.elasticity.targets.impl.TargetGroupImpl <em>Target Group</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.elasticity.targets.impl.TargetGroupImpl
     * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getTargetGroup()
     * @generated
     */
    int TARGET_GROUP = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP__TARGET_CONSTRAINTS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Target Group</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TARGET_GROUP_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupTargetImpl
     * <em>Infrastructure Group Target</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupTargetImpl
     * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getInfrastructureGroupTarget()
     * @generated
     */
    int INFRASTRUCTURE_GROUP_TARGET = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_TARGET__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_TARGET__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_TARGET__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Infrastructure Group</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Infrastructure Group Target</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_TARGET_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.elasticity.targets.impl.ServiceGroupTargetImpl <em>Service
     * Group Target</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.elasticity.targets.impl.ServiceGroupTargetImpl
     * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getServiceGroupTarget()
     * @generated
     */
    int SERVICE_GROUP_TARGET = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_TARGET__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_TARGET__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_TARGET__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Service Group</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_TARGET__SERVICE_GROUP = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service Group Target</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_TARGET_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupTargetImpl
     * <em>Competing Consumers Group Target</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupTargetImpl
     * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getCompetingConsumersGroupTarget()
     * @generated
     */
    int COMPETING_CONSUMERS_GROUP_TARGET = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_TARGET__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_TARGET__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_TARGET__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Competing Consumers Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Competing Consumers Group Target</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_TARGET_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.elasticity.targets.TargetGroup <em>Target Group</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Target Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.TargetGroup
     * @generated
     */
    EClass getTargetGroup();

    /**
     * Returns the meta object for the containment reference list
     * '{@link org.palladiosimulator.elasticity.targets.TargetGroup#getTargetConstraints <em>Target
     * Constraints</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Target Constraints</em>'.
     * @see org.palladiosimulator.elasticity.targets.TargetGroup#getTargetConstraints()
     * @see #getTargetGroup()
     * @generated
     */
    EReference getTargetGroup_TargetConstraints();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget <em>Infrastructure
     * Group Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Infrastructure Group Target</em>'.
     * @see org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget
     * @generated
     */
    EClass getInfrastructureGroupTarget();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget#getInfrastructureGroup
     * <em>Infrastructure Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Infrastructure Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget#getInfrastructureGroup()
     * @see #getInfrastructureGroupTarget()
     * @generated
     */
    EReference getInfrastructureGroupTarget_InfrastructureGroup();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.elasticity.targets.ServiceGroupTarget <em>Service Group
     * Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Service Group Target</em>'.
     * @see org.palladiosimulator.elasticity.targets.ServiceGroupTarget
     * @generated
     */
    EClass getServiceGroupTarget();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.ServiceGroupTarget#getServiceGroup
     * <em>Service Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Service Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.ServiceGroupTarget#getServiceGroup()
     * @see #getServiceGroupTarget()
     * @generated
     */
    EReference getServiceGroupTarget_ServiceGroup();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget <em>Competing
     * Consumers Group Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Competing Consumers Group Target</em>'.
     * @see org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget
     * @generated
     */
    EClass getCompetingConsumersGroupTarget();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget#getCompetingConsumersGroup
     * <em>Competing Consumers Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Competing Consumers Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget#getCompetingConsumersGroup()
     * @see #getCompetingConsumersGroupTarget()
     * @generated
     */
    EReference getCompetingConsumersGroupTarget_CompetingConsumersGroup();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TargetsFactory getTargetsFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.elasticity.targets.impl.TargetGroupImpl <em>Target
         * Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.elasticity.targets.impl.TargetGroupImpl
         * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getTargetGroup()
         * @generated
         */
        EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

        /**
         * The meta object literal for the '<em><b>Target Constraints</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference TARGET_GROUP__TARGET_CONSTRAINTS = eINSTANCE.getTargetGroup_TargetConstraints();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupTargetImpl
         * <em>Infrastructure Group Target</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupTargetImpl
         * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getInfrastructureGroupTarget()
         * @generated
         */
        EClass INFRASTRUCTURE_GROUP_TARGET = eINSTANCE.getInfrastructureGroupTarget();

        /**
         * The meta object literal for the '<em><b>Infrastructure Group</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP = eINSTANCE
            .getInfrastructureGroupTarget_InfrastructureGroup();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.elasticity.targets.impl.ServiceGroupTargetImpl <em>Service
         * Group Target</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.elasticity.targets.impl.ServiceGroupTargetImpl
         * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getServiceGroupTarget()
         * @generated
         */
        EClass SERVICE_GROUP_TARGET = eINSTANCE.getServiceGroupTarget();

        /**
         * The meta object literal for the '<em><b>Service Group</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SERVICE_GROUP_TARGET__SERVICE_GROUP = eINSTANCE.getServiceGroupTarget_ServiceGroup();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupTargetImpl
         * <em>Competing Consumers Group Target</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupTargetImpl
         * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getCompetingConsumersGroupTarget()
         * @generated
         */
        EClass COMPETING_CONSUMERS_GROUP_TARGET = eINSTANCE.getCompetingConsumersGroupTarget();

        /**
         * The meta object literal for the '<em><b>Competing Consumers Group</b></em>' reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP = eINSTANCE
            .getCompetingConsumersGroupTarget_CompetingConsumersGroup();

    }

} // TargetsPackage
