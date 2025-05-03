/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.elasticity.adjustments.AdjustmentsPackage;
import org.palladiosimulator.elasticity.adjustments.impl.AdjustmentsPackageImpl;
import org.palladiosimulator.elasticity.constraints.ConstraintsPackage;
import org.palladiosimulator.elasticity.constraints.impl.ConstraintsPackageImpl;
import org.palladiosimulator.elasticity.constraints.policy.PolicyPackage;
import org.palladiosimulator.elasticity.constraints.policy.impl.PolicyPackageImpl;
import org.palladiosimulator.elasticity.constraints.target.TargetPackage;
import org.palladiosimulator.elasticity.constraints.target.impl.TargetPackageImpl;
import org.palladiosimulator.elasticity.datatypes.DatatypesPackage;
import org.palladiosimulator.elasticity.datatypes.impl.DatatypesPackageImpl;
import org.palladiosimulator.elasticity.impl.ElasticityPackageImpl;
import org.palladiosimulator.elasticity.models.ModelsPackage;
import org.palladiosimulator.elasticity.models.impl.ModelsPackageImpl;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.elasticity.targets.impl.TargetsPackageImpl;
import org.palladiosimulator.elasticity.triggers.TriggersPackage;
import org.palladiosimulator.elasticity.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.elasticity.triggers.expectations.impl.ExpectationsPackageImpl;
import org.palladiosimulator.elasticity.triggers.impl.TriggersPackageImpl;
import org.palladiosimulator.elasticity.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.elasticity.triggers.stimuli.impl.StimuliPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.composition.CompositionPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;
import org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup;
import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;
import org.palladiosimulator.scalablepcmgroups.Queue;
import org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups;
import org.palladiosimulator.scalablepcmgroups.ServiceGroup;
import org.palladiosimulator.scalablepcmgroups.TargetGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsFactory;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class scalablepcmgroupsPackageImpl extends EPackageImpl implements scalablepcmgroupsPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass scalablePCMGroupsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass targetGroupEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass infrastructureGroupEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass serviceGroupEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass competingConsumersGroupEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass queueEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private scalablepcmgroupsPackageImpl() {
        super(eNS_URI, scalablepcmgroupsFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link scalablepcmgroupsPackage#eINSTANCE} when that field
     * is accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static scalablepcmgroupsPackage init() {
        if (isInited) {
            return (scalablepcmgroupsPackage) EPackage.Registry.INSTANCE.getEPackage(scalablepcmgroupsPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredscalablepcmgroupsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final scalablepcmgroupsPackageImpl thescalablepcmgroupsPackage = registeredscalablepcmgroupsPackage instanceof scalablepcmgroupsPackageImpl
                ? (scalablepcmgroupsPackageImpl) registeredscalablepcmgroupsPackage
                : new scalablepcmgroupsPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElasticityPackage.eNS_URI);
        final ElasticityPackageImpl theElasticityPackage = (ElasticityPackageImpl) (registeredPackage instanceof ElasticityPackageImpl
                ? registeredPackage
                : ElasticityPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
        final TargetsPackageImpl theTargetsPackage = (TargetsPackageImpl) (registeredPackage instanceof TargetsPackageImpl
                ? registeredPackage
                : TargetsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdjustmentsPackage.eNS_URI);
        final AdjustmentsPackageImpl theAdjustmentsPackage = (AdjustmentsPackageImpl) (registeredPackage instanceof AdjustmentsPackageImpl
                ? registeredPackage
                : AdjustmentsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
        final ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl) (registeredPackage instanceof ConstraintsPackageImpl
                ? registeredPackage
                : ConstraintsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PolicyPackage.eNS_URI);
        final PolicyPackageImpl thePolicyPackage = (PolicyPackageImpl) (registeredPackage instanceof PolicyPackageImpl
                ? registeredPackage
                : PolicyPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetPackage.eNS_URI);
        final TargetPackageImpl theTargetPackage = (TargetPackageImpl) (registeredPackage instanceof TargetPackageImpl
                ? registeredPackage
                : TargetPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
        final TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl) (registeredPackage instanceof TriggersPackageImpl
                ? registeredPackage
                : TriggersPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI);
        final StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl) (registeredPackage instanceof StimuliPackageImpl
                ? registeredPackage
                : StimuliPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExpectationsPackage.eNS_URI);
        final ExpectationsPackageImpl theExpectationsPackage = (ExpectationsPackageImpl) (registeredPackage instanceof ExpectationsPackageImpl
                ? registeredPackage
                : ExpectationsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelsPackage.eNS_URI);
        final ModelsPackageImpl theModelsPackage = (ModelsPackageImpl) (registeredPackage instanceof ModelsPackageImpl
                ? registeredPackage
                : ModelsPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);
        final DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (registeredPackage instanceof DatatypesPackageImpl
                ? registeredPackage
                : DatatypesPackage.eINSTANCE);

        // Create package meta-data objects
        thescalablepcmgroupsPackage.createPackageContents();
        theElasticityPackage.createPackageContents();
        theTargetsPackage.createPackageContents();
        theAdjustmentsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTargetPackage.createPackageContents();
        theTriggersPackage.createPackageContents();
        theStimuliPackage.createPackageContents();
        theExpectationsPackage.createPackageContents();
        theModelsPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();

        // Initialize created meta-data
        thescalablepcmgroupsPackage.initializePackageContents();
        theElasticityPackage.initializePackageContents();
        theTargetsPackage.initializePackageContents();
        theAdjustmentsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTargetPackage.initializePackageContents();
        theTriggersPackage.initializePackageContents();
        theStimuliPackage.initializePackageContents();
        theExpectationsPackage.initializePackageContents();
        theModelsPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thescalablepcmgroupsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(scalablepcmgroupsPackage.eNS_URI, thescalablepcmgroupsPackage);
        return thescalablepcmgroupsPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getScalablePCMGroups() {
        return this.scalablePCMGroupsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getScalablePCMGroups_EnactedPolicy() {
        return (EReference) this.scalablePCMGroupsEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getScalablePCMGroups_TargetCfgs() {
        return (EReference) this.scalablePCMGroupsEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTargetGroup() {
        return this.targetGroupEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTargetGroup_EnactedPolicies() {
        return (EReference) this.targetGroupEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInfrastructureGroup() {
        return this.infrastructureGroupEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_Unit() {
        return (EReference) this.infrastructureGroupEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_Elements() {
        return (EReference) this.infrastructureGroupEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_LinkingResource() {
        return (EReference) this.infrastructureGroupEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_ResourceEnvironment() {
        return (EReference) this.infrastructureGroupEClass.getEStructuralFeatures()
            .get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getServiceGroup() {
        return this.serviceGroupEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getServiceGroup_Unit() {
        return (EReference) this.serviceGroupEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getServiceGroup_Elements() {
        return (EReference) this.serviceGroupEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getServiceGroup_LoadBalancingAssembly() {
        return (EReference) this.serviceGroupEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCompetingConsumersGroup() {
        return this.competingConsumersGroupEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_Unit() {
        return (EReference) this.competingConsumersGroupEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_Elements() {
        return (EReference) this.competingConsumersGroupEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_BrokerAssembly() {
        return (EReference) this.competingConsumersGroupEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_UnitQueues() {
        return (EReference) this.competingConsumersGroupEClass.getEStructuralFeatures()
            .get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getQueue() {
        return this.queueEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getQueue_PassiveResourceQueueMessages() {
        return (EReference) this.queueEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getQueue_Name() {
        return (EAttribute) this.queueEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getQueue_UsageScenarioForConsumption() {
        return (EReference) this.queueEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public scalablepcmgroupsFactory getscalablepcmgroupsFactory() {
        return (scalablepcmgroupsFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.scalablePCMGroupsEClass = this.createEClass(SCALABLE_PCM_GROUPS);
        this.createEReference(this.scalablePCMGroupsEClass, SCALABLE_PCM_GROUPS__ENACTED_POLICY);
        this.createEReference(this.scalablePCMGroupsEClass, SCALABLE_PCM_GROUPS__TARGET_CFGS);

        this.targetGroupEClass = this.createEClass(TARGET_GROUP);
        this.createEReference(this.targetGroupEClass, TARGET_GROUP__ENACTED_POLICIES);

        this.infrastructureGroupEClass = this.createEClass(INFRASTRUCTURE_GROUP);
        this.createEReference(this.infrastructureGroupEClass, INFRASTRUCTURE_GROUP__UNIT);
        this.createEReference(this.infrastructureGroupEClass, INFRASTRUCTURE_GROUP__ELEMENTS);
        this.createEReference(this.infrastructureGroupEClass, INFRASTRUCTURE_GROUP__LINKING_RESOURCE);
        this.createEReference(this.infrastructureGroupEClass, INFRASTRUCTURE_GROUP__RESOURCE_ENVIRONMENT);

        this.serviceGroupEClass = this.createEClass(SERVICE_GROUP);
        this.createEReference(this.serviceGroupEClass, SERVICE_GROUP__UNIT);
        this.createEReference(this.serviceGroupEClass, SERVICE_GROUP__ELEMENTS);
        this.createEReference(this.serviceGroupEClass, SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY);

        this.competingConsumersGroupEClass = this.createEClass(COMPETING_CONSUMERS_GROUP);
        this.createEReference(this.competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__UNIT);
        this.createEReference(this.competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__ELEMENTS);
        this.createEReference(this.competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY);
        this.createEReference(this.competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__UNIT_QUEUES);

        this.queueEClass = this.createEClass(QUEUE);
        this.createEReference(this.queueEClass, QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES);
        this.createEAttribute(this.queueEClass, QUEUE__NAME);
        this.createEReference(this.queueEClass, QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
            .getEPackage(EntityPackage.eNS_URI);
        final ElasticityPackage theElasticityPackage = (ElasticityPackage) EPackage.Registry.INSTANCE
            .getEPackage(ElasticityPackage.eNS_URI);
        final ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage) EPackage.Registry.INSTANCE
            .getEPackage(ResourceenvironmentPackage.eNS_URI);
        final CompositionPackage theCompositionPackage = (CompositionPackage) EPackage.Registry.INSTANCE
            .getEPackage(CompositionPackage.eNS_URI);
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
            .getEPackage(RepositoryPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
            .getEPackage(EcorePackage.eNS_URI);
        final UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage) EPackage.Registry.INSTANCE
            .getEPackage(UsagemodelPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.scalablePCMGroupsEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.targetGroupEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.infrastructureGroupEClass.getESuperTypes()
            .add(this.getTargetGroup());
        this.serviceGroupEClass.getESuperTypes()
            .add(this.getTargetGroup());
        this.competingConsumersGroupEClass.getESuperTypes()
            .add(this.getTargetGroup());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.scalablePCMGroupsEClass, ScalablePCMGroups.class, "ScalablePCMGroups", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getScalablePCMGroups_EnactedPolicy(), theElasticityPackage.getScalingPolicy(), null,
                "enactedPolicy", null, 0, 1, ScalablePCMGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getScalablePCMGroups_TargetCfgs(), this.getTargetGroup(), null, "targetCfgs", null, 0,
                -1, ScalablePCMGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.targetGroupEClass, TargetGroup.class, "TargetGroup", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTargetGroup_EnactedPolicies(), theElasticityPackage.getScalingPolicy(), null,
                "enactedPolicies", null, 0, -1, TargetGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.infrastructureGroupEClass, InfrastructureGroup.class, "InfrastructureGroup", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getInfrastructureGroup_Unit(), theResourceenvironmentPackage.getResourceContainer(),
                null, "unit", null, 0, 1, InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getInfrastructureGroup_Elements(),
                theResourceenvironmentPackage.getResourceContainer(), null, "elements", null, 1, -1,
                InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getInfrastructureGroup_LinkingResource(),
                theResourceenvironmentPackage.getLinkingResource(), null, "linkingResource", null, 0, 1,
                InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getInfrastructureGroup_ResourceEnvironment(),
                theResourceenvironmentPackage.getResourceEnvironment(), null, "resourceEnvironment", null, 0, 1,
                InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.serviceGroupEClass, ServiceGroup.class, "ServiceGroup", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getServiceGroup_Unit(), theCompositionPackage.getAssemblyContext(), null, "unit", null,
                0, 1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getServiceGroup_Elements(), theCompositionPackage.getAssemblyContext(), null,
                "elements", null, 1, -1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getServiceGroup_LoadBalancingAssembly(), theCompositionPackage.getAssemblyContext(),
                null, "loadBalancingAssembly", null, 0, 1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.competingConsumersGroupEClass, CompetingConsumersGroup.class, "CompetingConsumersGroup",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCompetingConsumersGroup_Unit(), theCompositionPackage.getAssemblyContext(), null,
                "unit", null, 0, 1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getCompetingConsumersGroup_Elements(), theCompositionPackage.getAssemblyContext(),
                null, "elements", null, 1, -1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getCompetingConsumersGroup_BrokerAssembly(),
                theCompositionPackage.getAssemblyContext(), null, "brokerAssembly", null, 0, 1,
                CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getCompetingConsumersGroup_UnitQueues(), this.getQueue(), null, "unitQueues", null, 1,
                -1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.queueEClass, Queue.class, "Queue", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getQueue_PassiveResourceQueueMessages(), theRepositoryPackage.getPassiveResource(),
                null, "passiveResourceQueueMessages", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getQueue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Queue.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getQueue_UsageScenarioForConsumption(), theUsagemodelPackage.getUsageScenario(), null,
                "usageScenarioForConsumption", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // scalablepcmgroupsPackageImpl
