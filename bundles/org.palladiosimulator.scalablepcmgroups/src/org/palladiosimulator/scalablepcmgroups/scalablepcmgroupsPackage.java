/**
 */
package org.palladiosimulator.scalablepcmgroups;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsFactory
 * @model kind="package"
 * @generated
 */
public interface scalablepcmgroupsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "scalablepcmgroups";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/ScalablePCMGroups/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "scalablepcmgroups";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    scalablepcmgroupsPackage eINSTANCE = org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.scalablepcmgroups.impl.ScalablePCMGroupsImpl <em>Scalable PCM Groups</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.scalablepcmgroups.impl.ScalablePCMGroupsImpl
     * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getScalablePCMGroups()
     * @generated
     */
    int SCALABLE_PCM_GROUPS = 0;

    /**
     * The feature id for the '<em><b>Elasticity Spec</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS__ELASTICITY_SPEC = 0;

    /**
     * The feature id for the '<em><b>Enacted Policy</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS__ENACTED_POLICY = 1;

    /**
     * The feature id for the '<em><b>Target Cfgs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS__TARGET_CFGS = 2;

    /**
     * The feature id for the '<em><b>Allocation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS__ALLOCATION = 3;

    /**
     * The feature id for the '<em><b>System</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS__SYSTEM = 4;

    /**
     * The feature id for the '<em><b>Resource Environment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS__RESOURCE_ENVIRONMENT = 5;

    /**
     * The feature id for the '<em><b>Repository</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS__REPOSITORY = 6;

    /**
     * The number of structural features of the '<em>Scalable PCM Groups</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Scalable PCM Groups</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCALABLE_PCM_GROUPS_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.scalablepcmgroups.impl.TargetGroupImpl <em>Target Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.scalablepcmgroups.impl.TargetGroupImpl
     * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getTargetGroup()
     * @generated
     */
    int TARGET_GROUP = 1;

    /**
     * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_GROUP__ENACTED_POLICIES = 0;

    /**
     * The number of structural features of the '<em>Target Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_GROUP_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Target Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TARGET_GROUP_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.scalablepcmgroups.impl.InfrastructureGroupImpl <em>Infrastructure Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.scalablepcmgroups.impl.InfrastructureGroupImpl
     * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getInfrastructureGroup()
     * @generated
     */
    int INFRASTRUCTURE_GROUP = 2;

    /**
     * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__ENACTED_POLICIES = TARGET_GROUP__ENACTED_POLICIES;

    /**
     * The feature id for the '<em><b>Unit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__UNIT = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__ELEMENTS = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Linking Resource</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__LINKING_RESOURCE = TARGET_GROUP_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Resource Environment</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP__RESOURCE_ENVIRONMENT = TARGET_GROUP_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Infrastructure Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Infrastructure Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_OPERATION_COUNT = TARGET_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.scalablepcmgroups.impl.ServiceGroupImpl <em>Service Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.scalablepcmgroups.impl.ServiceGroupImpl
     * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getServiceGroup()
     * @generated
     */
    int SERVICE_GROUP = 3;

    /**
     * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__ENACTED_POLICIES = TARGET_GROUP__ENACTED_POLICIES;

    /**
     * The feature id for the '<em><b>Unit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__UNIT = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__ELEMENTS = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Load Balancing Assembly</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY = TARGET_GROUP_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Service Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Service Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_OPERATION_COUNT = TARGET_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl <em>Competing Consumers Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl
     * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getCompetingConsumersGroup()
     * @generated
     */
    int COMPETING_CONSUMERS_GROUP = 4;

    /**
     * The feature id for the '<em><b>Enacted Policies</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__ENACTED_POLICIES = TARGET_GROUP__ENACTED_POLICIES;

    /**
     * The feature id for the '<em><b>Unit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__UNIT = TARGET_GROUP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__ELEMENTS = TARGET_GROUP_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Broker Assembly</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY = TARGET_GROUP_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Unit Queues</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP__UNIT_QUEUES = TARGET_GROUP_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Competing Consumers Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_FEATURE_COUNT = TARGET_GROUP_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Competing Consumers Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMERS_GROUP_OPERATION_COUNT = TARGET_GROUP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.scalablepcmgroups.impl.QueueImpl <em>Queue</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.scalablepcmgroups.impl.QueueImpl
     * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getQueue()
     * @generated
     */
    int QUEUE = 5;

    /**
     * The feature id for the '<em><b>Passive Resource Queue Messages</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUEUE__NAME = 1;

    /**
     * The feature id for the '<em><b>Usage Scenario For Consumption</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION = 2;

    /**
     * The number of structural features of the '<em>Queue</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUEUE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Queue</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUEUE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups <em>Scalable PCM Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scalable PCM Groups</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups
     * @generated
     */
    EClass getScalablePCMGroups();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getElasticitySpec <em>Elasticity Spec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Elasticity Spec</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getElasticitySpec()
     * @see #getScalablePCMGroups()
     * @generated
     */
    EReference getScalablePCMGroups_ElasticitySpec();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getEnactedPolicy <em>Enacted Policy</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Enacted Policy</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getEnactedPolicy()
     * @see #getScalablePCMGroups()
     * @generated
     */
    EReference getScalablePCMGroups_EnactedPolicy();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getTargetCfgs <em>Target Cfgs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Target Cfgs</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getTargetCfgs()
     * @see #getScalablePCMGroups()
     * @generated
     */
    EReference getScalablePCMGroups_TargetCfgs();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getAllocation <em>Allocation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Allocation</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getAllocation()
     * @see #getScalablePCMGroups()
     * @generated
     */
    EReference getScalablePCMGroups_Allocation();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getSystem <em>System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>System</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getSystem()
     * @see #getScalablePCMGroups()
     * @generated
     */
    EReference getScalablePCMGroups_System();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getResourceEnvironment <em>Resource Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Resource Environment</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getResourceEnvironment()
     * @see #getScalablePCMGroups()
     * @generated
     */
    EReference getScalablePCMGroups_ResourceEnvironment();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getRepository <em>Repository</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Repository</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getRepository()
     * @see #getScalablePCMGroups()
     * @generated
     */
    EReference getScalablePCMGroups_Repository();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.scalablepcmgroups.TargetGroup <em>Target Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Target Group</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.TargetGroup
     * @generated
     */
    EClass getTargetGroup();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.scalablepcmgroups.TargetGroup#getEnactedPolicies <em>Enacted Policies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Enacted Policies</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.TargetGroup#getEnactedPolicies()
     * @see #getTargetGroup()
     * @generated
     */
    EReference getTargetGroup_EnactedPolicies();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup <em>Infrastructure Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Infrastructure Group</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.InfrastructureGroup
     * @generated
     */
    EClass getInfrastructureGroup();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Unit</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getUnit()
     * @see #getInfrastructureGroup()
     * @generated
     */
    EReference getInfrastructureGroup_Unit();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Elements</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getElements()
     * @see #getInfrastructureGroup()
     * @generated
     */
    EReference getInfrastructureGroup_Elements();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getLinkingResource <em>Linking Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Linking Resource</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getLinkingResource()
     * @see #getInfrastructureGroup()
     * @generated
     */
    EReference getInfrastructureGroup_LinkingResource();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getResourceEnvironment <em>Resource Environment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Resource Environment</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getResourceEnvironment()
     * @see #getInfrastructureGroup()
     * @generated
     */
    EReference getInfrastructureGroup_ResourceEnvironment();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.scalablepcmgroups.ServiceGroup <em>Service Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Group</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ServiceGroup
     * @generated
     */
    EClass getServiceGroup();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ServiceGroup#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Unit</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ServiceGroup#getUnit()
     * @see #getServiceGroup()
     * @generated
     */
    EReference getServiceGroup_Unit();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.scalablepcmgroups.ServiceGroup#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Elements</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ServiceGroup#getElements()
     * @see #getServiceGroup()
     * @generated
     */
    EReference getServiceGroup_Elements();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.ServiceGroup#getLoadBalancingAssembly <em>Load Balancing Assembly</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Load Balancing Assembly</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.ServiceGroup#getLoadBalancingAssembly()
     * @see #getServiceGroup()
     * @generated
     */
    EReference getServiceGroup_LoadBalancingAssembly();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup <em>Competing Consumers Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Competing Consumers Group</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup
     * @generated
     */
    EClass getCompetingConsumersGroup();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getUnit <em>Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Unit</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getUnit()
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    EReference getCompetingConsumersGroup_Unit();

    /**
     * Returns the meta object for the reference list '{@link org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Elements</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getElements()
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    EReference getCompetingConsumersGroup_Elements();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getBrokerAssembly <em>Broker Assembly</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Broker Assembly</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getBrokerAssembly()
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    EReference getCompetingConsumersGroup_BrokerAssembly();

    /**
     * Returns the meta object for the containment reference list '{@link org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getUnitQueues <em>Unit Queues</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Unit Queues</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup#getUnitQueues()
     * @see #getCompetingConsumersGroup()
     * @generated
     */
    EReference getCompetingConsumersGroup_UnitQueues();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.scalablepcmgroups.Queue <em>Queue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Queue</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.Queue
     * @generated
     */
    EClass getQueue();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.Queue#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Passive Resource Queue Messages</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.Queue#getPassiveResourceQueueMessages()
     * @see #getQueue()
     * @generated
     */
    EReference getQueue_PassiveResourceQueueMessages();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.scalablepcmgroups.Queue#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.Queue#getName()
     * @see #getQueue()
     * @generated
     */
    EAttribute getQueue_Name();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.scalablepcmgroups.Queue#getUsageScenarioForConsumption <em>Usage Scenario For Consumption</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Usage Scenario For Consumption</em>'.
     * @see org.palladiosimulator.scalablepcmgroups.Queue#getUsageScenarioForConsumption()
     * @see #getQueue()
     * @generated
     */
    EReference getQueue_UsageScenarioForConsumption();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    scalablepcmgroupsFactory getscalablepcmgroupsFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.scalablepcmgroups.impl.ScalablePCMGroupsImpl <em>Scalable PCM Groups</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.scalablepcmgroups.impl.ScalablePCMGroupsImpl
         * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getScalablePCMGroups()
         * @generated
         */
        EClass SCALABLE_PCM_GROUPS = eINSTANCE.getScalablePCMGroups();

        /**
         * The meta object literal for the '<em><b>Elasticity Spec</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALABLE_PCM_GROUPS__ELASTICITY_SPEC = eINSTANCE.getScalablePCMGroups_ElasticitySpec();

        /**
         * The meta object literal for the '<em><b>Enacted Policy</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALABLE_PCM_GROUPS__ENACTED_POLICY = eINSTANCE.getScalablePCMGroups_EnactedPolicy();

        /**
         * The meta object literal for the '<em><b>Target Cfgs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALABLE_PCM_GROUPS__TARGET_CFGS = eINSTANCE.getScalablePCMGroups_TargetCfgs();

        /**
         * The meta object literal for the '<em><b>Allocation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALABLE_PCM_GROUPS__ALLOCATION = eINSTANCE.getScalablePCMGroups_Allocation();

        /**
         * The meta object literal for the '<em><b>System</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALABLE_PCM_GROUPS__SYSTEM = eINSTANCE.getScalablePCMGroups_System();

        /**
         * The meta object literal for the '<em><b>Resource Environment</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALABLE_PCM_GROUPS__RESOURCE_ENVIRONMENT = eINSTANCE.getScalablePCMGroups_ResourceEnvironment();

        /**
         * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCALABLE_PCM_GROUPS__REPOSITORY = eINSTANCE.getScalablePCMGroups_Repository();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.scalablepcmgroups.impl.TargetGroupImpl <em>Target Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.scalablepcmgroups.impl.TargetGroupImpl
         * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getTargetGroup()
         * @generated
         */
        EClass TARGET_GROUP = eINSTANCE.getTargetGroup();

        /**
         * The meta object literal for the '<em><b>Enacted Policies</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TARGET_GROUP__ENACTED_POLICIES = eINSTANCE.getTargetGroup_EnactedPolicies();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.scalablepcmgroups.impl.InfrastructureGroupImpl <em>Infrastructure Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.scalablepcmgroups.impl.InfrastructureGroupImpl
         * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getInfrastructureGroup()
         * @generated
         */
        EClass INFRASTRUCTURE_GROUP = eINSTANCE.getInfrastructureGroup();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP__UNIT = eINSTANCE.getInfrastructureGroup_Unit();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP__ELEMENTS = eINSTANCE.getInfrastructureGroup_Elements();

        /**
         * The meta object literal for the '<em><b>Linking Resource</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP__LINKING_RESOURCE = eINSTANCE.getInfrastructureGroup_LinkingResource();

        /**
         * The meta object literal for the '<em><b>Resource Environment</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP__RESOURCE_ENVIRONMENT = eINSTANCE.getInfrastructureGroup_ResourceEnvironment();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.scalablepcmgroups.impl.ServiceGroupImpl <em>Service Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.scalablepcmgroups.impl.ServiceGroupImpl
         * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getServiceGroup()
         * @generated
         */
        EClass SERVICE_GROUP = eINSTANCE.getServiceGroup();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_GROUP__UNIT = eINSTANCE.getServiceGroup_Unit();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_GROUP__ELEMENTS = eINSTANCE.getServiceGroup_Elements();

        /**
         * The meta object literal for the '<em><b>Load Balancing Assembly</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY = eINSTANCE.getServiceGroup_LoadBalancingAssembly();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl <em>Competing Consumers Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl
         * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getCompetingConsumersGroup()
         * @generated
         */
        EClass COMPETING_CONSUMERS_GROUP = eINSTANCE.getCompetingConsumersGroup();

        /**
         * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP__UNIT = eINSTANCE.getCompetingConsumersGroup_Unit();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP__ELEMENTS = eINSTANCE.getCompetingConsumersGroup_Elements();

        /**
         * The meta object literal for the '<em><b>Broker Assembly</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY = eINSTANCE.getCompetingConsumersGroup_BrokerAssembly();

        /**
         * The meta object literal for the '<em><b>Unit Queues</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPETING_CONSUMERS_GROUP__UNIT_QUEUES = eINSTANCE.getCompetingConsumersGroup_UnitQueues();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.scalablepcmgroups.impl.QueueImpl <em>Queue</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.scalablepcmgroups.impl.QueueImpl
         * @see org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl#getQueue()
         * @generated
         */
        EClass QUEUE = eINSTANCE.getQueue();

        /**
         * The meta object literal for the '<em><b>Passive Resource Queue Messages</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES = eINSTANCE.getQueue_PassiveResourceQueueMessages();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute QUEUE__NAME = eINSTANCE.getQueue_Name();

        /**
         * The meta object literal for the '<em><b>Usage Scenario For Consumption</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION = eINSTANCE.getQueue_UsageScenarioForConsumption();

    }

} //scalablepcmgroupsPackage
