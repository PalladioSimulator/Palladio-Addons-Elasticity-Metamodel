/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.elasticity.ElasticityPackage;

import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.composition.CompositionPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class scalablepcmgroupsPackageImpl extends EPackageImpl implements scalablepcmgroupsPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scalablePCMGroupsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass targetGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass infrastructureGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass competingConsumersGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass queueEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private scalablepcmgroupsPackageImpl() {
        super(eNS_URI, scalablepcmgroupsFactory.eINSTANCE);
    }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link scalablepcmgroupsPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static scalablepcmgroupsPackage init() {
        if (isInited) return (scalablepcmgroupsPackage)EPackage.Registry.INSTANCE.getEPackage(scalablepcmgroupsPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredscalablepcmgroupsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        scalablepcmgroupsPackageImpl thescalablepcmgroupsPackage = registeredscalablepcmgroupsPackage instanceof scalablepcmgroupsPackageImpl ? (scalablepcmgroupsPackageImpl)registeredscalablepcmgroupsPackage : new scalablepcmgroupsPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        ElasticityPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        thescalablepcmgroupsPackage.createPackageContents();

        // Initialize created meta-data
        thescalablepcmgroupsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thescalablepcmgroupsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(scalablepcmgroupsPackage.eNS_URI, thescalablepcmgroupsPackage);
        return thescalablepcmgroupsPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getScalablePCMGroups() {
        return scalablePCMGroupsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScalablePCMGroups_EnactedPolicy() {
        return (EReference)scalablePCMGroupsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getScalablePCMGroups_TargetCfgs() {
        return (EReference)scalablePCMGroupsEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTargetGroup() {
        return targetGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTargetGroup_EnactedPolicies() {
        return (EReference)targetGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getInfrastructureGroup() {
        return infrastructureGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_Unit() {
        return (EReference)infrastructureGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_Elements() {
        return (EReference)infrastructureGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_LinkingResource() {
        return (EReference)infrastructureGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_ResourceEnvironment() {
        return (EReference)infrastructureGroupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getServiceGroup() {
        return serviceGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceGroup_Unit() {
        return (EReference)serviceGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceGroup_Elements() {
        return (EReference)serviceGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getServiceGroup_LoadBalancingAssembly() {
        return (EReference)serviceGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCompetingConsumersGroup() {
        return competingConsumersGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_Unit() {
        return (EReference)competingConsumersGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_Elements() {
        return (EReference)competingConsumersGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_BrokerAssembly() {
        return (EReference)competingConsumersGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_UnitQueues() {
        return (EReference)competingConsumersGroupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getQueue() {
        return queueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQueue_PassiveResourceQueueMessages() {
        return (EReference)queueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getQueue_Name() {
        return (EAttribute)queueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getQueue_UsageScenarioForConsumption() {
        return (EReference)queueEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public scalablepcmgroupsFactory getscalablepcmgroupsFactory() {
        return (scalablepcmgroupsFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        scalablePCMGroupsEClass = createEClass(SCALABLE_PCM_GROUPS);
        createEReference(scalablePCMGroupsEClass, SCALABLE_PCM_GROUPS__ENACTED_POLICY);
        createEReference(scalablePCMGroupsEClass, SCALABLE_PCM_GROUPS__TARGET_CFGS);

        targetGroupEClass = createEClass(TARGET_GROUP);
        createEReference(targetGroupEClass, TARGET_GROUP__ENACTED_POLICIES);

        infrastructureGroupEClass = createEClass(INFRASTRUCTURE_GROUP);
        createEReference(infrastructureGroupEClass, INFRASTRUCTURE_GROUP__UNIT);
        createEReference(infrastructureGroupEClass, INFRASTRUCTURE_GROUP__ELEMENTS);
        createEReference(infrastructureGroupEClass, INFRASTRUCTURE_GROUP__LINKING_RESOURCE);
        createEReference(infrastructureGroupEClass, INFRASTRUCTURE_GROUP__RESOURCE_ENVIRONMENT);

        serviceGroupEClass = createEClass(SERVICE_GROUP);
        createEReference(serviceGroupEClass, SERVICE_GROUP__UNIT);
        createEReference(serviceGroupEClass, SERVICE_GROUP__ELEMENTS);
        createEReference(serviceGroupEClass, SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY);

        competingConsumersGroupEClass = createEClass(COMPETING_CONSUMERS_GROUP);
        createEReference(competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__UNIT);
        createEReference(competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__ELEMENTS);
        createEReference(competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY);
        createEReference(competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__UNIT_QUEUES);

        queueEClass = createEClass(QUEUE);
        createEReference(queueEClass, QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES);
        createEAttribute(queueEClass, QUEUE__NAME);
        createEReference(queueEClass, QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ElasticityPackage theElasticityPackage = (ElasticityPackage)EPackage.Registry.INSTANCE.getEPackage(ElasticityPackage.eNS_URI);
        ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
        CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
        RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
        EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
        UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        infrastructureGroupEClass.getESuperTypes().add(this.getTargetGroup());
        serviceGroupEClass.getESuperTypes().add(this.getTargetGroup());
        competingConsumersGroupEClass.getESuperTypes().add(this.getTargetGroup());

        // Initialize classes, features, and operations; add parameters
        initEClass(scalablePCMGroupsEClass, ScalablePCMGroups.class, "ScalablePCMGroups", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getScalablePCMGroups_EnactedPolicy(), theElasticityPackage.getScalingPolicy(), null, "enactedPolicy", null, 0, 1, ScalablePCMGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getScalablePCMGroups_TargetCfgs(), this.getTargetGroup(), null, "targetCfgs", null, 0, -1, ScalablePCMGroups.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(targetGroupEClass, TargetGroup.class, "TargetGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTargetGroup_EnactedPolicies(), theElasticityPackage.getScalingPolicy(), null, "enactedPolicies", null, 0, -1, TargetGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(infrastructureGroupEClass, InfrastructureGroup.class, "InfrastructureGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInfrastructureGroup_Unit(), theResourceenvironmentPackage.getResourceContainer(), null, "unit", null, 0, 1, InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInfrastructureGroup_Elements(), theResourceenvironmentPackage.getResourceContainer(), null, "elements", null, 1, -1, InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInfrastructureGroup_LinkingResource(), theResourceenvironmentPackage.getLinkingResource(), null, "linkingResource", null, 0, 1, InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInfrastructureGroup_ResourceEnvironment(), theResourceenvironmentPackage.getResourceEnvironment(), null, "resourceEnvironment", null, 0, 1, InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(serviceGroupEClass, ServiceGroup.class, "ServiceGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getServiceGroup_Unit(), theCompositionPackage.getAssemblyContext(), null, "unit", null, 0, 1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getServiceGroup_Elements(), theCompositionPackage.getAssemblyContext(), null, "elements", null, 1, -1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getServiceGroup_LoadBalancingAssembly(), theCompositionPackage.getAssemblyContext(), null, "loadBalancingAssembly", null, 0, 1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(competingConsumersGroupEClass, CompetingConsumersGroup.class, "CompetingConsumersGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompetingConsumersGroup_Unit(), theCompositionPackage.getAssemblyContext(), null, "unit", null, 0, 1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCompetingConsumersGroup_Elements(), theCompositionPackage.getAssemblyContext(), null, "elements", null, 1, -1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCompetingConsumersGroup_BrokerAssembly(), theCompositionPackage.getAssemblyContext(), null, "brokerAssembly", null, 0, 1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getCompetingConsumersGroup_UnitQueues(), this.getQueue(), null, "unitQueues", null, 1, -1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(queueEClass, Queue.class, "Queue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getQueue_PassiveResourceQueueMessages(), theRepositoryPackage.getPassiveResource(), null, "passiveResourceQueueMessages", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getQueue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getQueue_UsageScenarioForConsumption(), theUsagemodelPackage.getUsageScenario(), null, "usageScenarioForConsumption", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //scalablepcmgroupsPackageImpl
