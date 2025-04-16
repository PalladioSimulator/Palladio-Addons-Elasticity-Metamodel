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
     * '{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupImpl
     * <em>Infrastructure Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupImpl
     * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getInfrastructureGroup()
     * @generated
     */
    int INFRASTRUCTURE_GROUP = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>PCM Resource Environment</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__PCM_RESOURCE_ENVIRONMENT = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Unit</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__UNIT = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Infrastructure Group</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP = TARGET_GROUP_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Infrastructure Group</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 3;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.elasticity.targets.impl.ServiceGroupImpl <em>Service
     * Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.elasticity.targets.impl.ServiceGroupImpl
     * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getServiceGroup()
     * @generated
     */
    int SERVICE_GROUP = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Unit Assembly</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__UNIT_ASSEMBLY = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Service Group</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__SERVICE_GROUP = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Service Group</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 2;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupImpl
     * <em>Competing Consumers Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupImpl
     * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getCompetingConsumersGroup()
     * @generated
     */
    int COMPETING_CONSUMERS_GROUP = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__ID = TARGET_GROUP__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__ENTITY_NAME = TARGET_GROUP__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Target Constraints</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__TARGET_CONSTRAINTS = TARGET_GROUP__TARGET_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Unit Assembly</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Competing Consumers Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__COMPETING_CONSUMERS_GROUP = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Competing Consumers Group</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 2;

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
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup <em>Infrastructure
     * Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Infrastructure Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.InfrastructureGroup
     * @generated
     */
    EClass getInfrastructureGroup();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getPCM_ResourceEnvironment
     * <em>PCM Resource Environment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>PCM Resource Environment</em>'.
     * @see org.palladiosimulator.elasticity.targets.InfrastructureGroup#getPCM_ResourceEnvironment()
     * @see #getInfrastructureGroup()
     * @generated
     */
    EReference getInfrastructureGroup_PCM_ResourceEnvironment();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Unit</em>'.
     * @see org.palladiosimulator.elasticity.targets.InfrastructureGroup#getUnit()
     * @see #getInfrastructureGroup()
     * @generated
     */
    EReference getInfrastructureGroup_Unit();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.InfrastructureGroup#getInfrastructureGroup
     * <em>Infrastructure Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Infrastructure Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.InfrastructureGroup#getInfrastructureGroup()
     * @see #getInfrastructureGroup()
     * @generated
     */
    EReference getInfrastructureGroup_InfrastructureGroup();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.elasticity.targets.ServiceGroup <em>Service Group</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Service Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.ServiceGroup
     * @generated
     */
    EClass getServiceGroup();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.ServiceGroup#getUnitAssembly <em>Unit
     * Assembly</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Unit Assembly</em>'.
     * @see org.palladiosimulator.elasticity.targets.ServiceGroup#getUnitAssembly()
     * @see #getServiceGroup()
     * @generated
     */
    EReference getServiceGroup_UnitAssembly();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.ServiceGroup#getServiceGroup <em>Service
     * Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Service Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.ServiceGroup#getServiceGroup()
     * @see #getServiceGroup()
     * @generated
     */
    EReference getServiceGroup_ServiceGroup();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.elasticity.targets.CompetingConsumersGroup <em>Competing
     * Consumers Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Competing Consumers Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.CompetingConsumersGroup
     * @generated
     */
    EClass getCompetingConsumersGroup();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.CompetingConsumersGroup#getUnitAssembly
     * <em>Unit Assembly</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Unit Assembly</em>'.
     * @see org.palladiosimulator.elasticity.targets.CompetingConsumersGroup#getUnitAssembly()
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    EReference getCompetingConsumersGroup_UnitAssembly();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.elasticity.targets.CompetingConsumersGroup#getCompetingConsumersGroup
     * <em>Competing Consumers Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Competing Consumers Group</em>'.
     * @see org.palladiosimulator.elasticity.targets.CompetingConsumersGroup#getCompetingConsumersGroup()
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    EReference getCompetingConsumersGroup_CompetingConsumersGroup();

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
         * '{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupImpl
         * <em>Infrastructure Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupImpl
         * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getInfrastructureGroup()
         * @generated
         */
        EClass INFRASTRUCTURE_GROUP = eINSTANCE.getInfrastructureGroup();

        /**
         * The meta object literal for the '<em><b>PCM Resource Environment</b></em>' reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP__PCM_RESOURCE_ENVIRONMENT = eINSTANCE
            .getInfrastructureGroup_PCM_ResourceEnvironment();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP__UNIT = eINSTANCE.getInfrastructureGroup_Unit();

        /**
         * The meta object literal for the '<em><b>Infrastructure Group</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP = eINSTANCE.getInfrastructureGroup_InfrastructureGroup();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.elasticity.targets.impl.ServiceGroupImpl <em>Service
         * Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.elasticity.targets.impl.ServiceGroupImpl
         * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getServiceGroup()
         * @generated
         */
        EClass SERVICE_GROUP = eINSTANCE.getServiceGroup();

        /**
         * The meta object literal for the '<em><b>Unit Assembly</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SERVICE_GROUP__UNIT_ASSEMBLY = eINSTANCE.getServiceGroup_UnitAssembly();

        /**
         * The meta object literal for the '<em><b>Service Group</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SERVICE_GROUP__SERVICE_GROUP = eINSTANCE.getServiceGroup_ServiceGroup();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupImpl
         * <em>Competing Consumers Group</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupImpl
         * @see org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl#getCompetingConsumersGroup()
         * @generated
         */
        EClass COMPETING_CONSUMERS_GROUP = eINSTANCE.getCompetingConsumersGroup();

        /**
         * The meta object literal for the '<em><b>Unit Assembly</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY = eINSTANCE.getCompetingConsumersGroup_UnitAssembly();

        /**
         * The meta object literal for the '<em><b>Competing Consumers Group</b></em>' reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP__COMPETING_CONSUMERS_GROUP = eINSTANCE
            .getCompetingConsumersGroup_CompetingConsumersGroup();

    }

} // TargetsPackage
