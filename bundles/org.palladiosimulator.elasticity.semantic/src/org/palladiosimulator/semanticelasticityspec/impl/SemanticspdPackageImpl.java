/**
 */
package org.palladiosimulator.semanticelasticityspec.impl;

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
import org.palladiosimulator.elasticity.SpdPackage;
import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.allocation.AllocationPackage;

import org.palladiosimulator.pcm.core.composition.CompositionPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import org.palladiosimulator.pcm.system.SystemPackage;

import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;
import org.palladiosimulator.semanticelasticityspec.CompetingConsumersGroupCfg;
import org.palladiosimulator.semanticelasticityspec.Configuration;
import org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg;
import org.palladiosimulator.semanticelasticityspec.Queue;
import org.palladiosimulator.semanticelasticityspec.SemanticspdFactory;
import org.palladiosimulator.semanticelasticityspec.SemanticspdPackage;
import org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg;
import org.palladiosimulator.semanticelasticityspec.TargetGroupCfg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticspdPackageImpl extends EPackageImpl implements SemanticspdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetGroupCfgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elasticInfrastructureCfgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGroupCfgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass competingConsumersGroupCfgEClass = null;

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
	 * @see org.palladiosimulator.semanticelasticityspec.SemanticspdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SemanticspdPackageImpl() {
		super(eNS_URI, SemanticspdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SemanticspdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SemanticspdPackage init() {
		if (isInited) return (SemanticspdPackage)EPackage.Registry.INSTANCE.getEPackage(SemanticspdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSemanticspdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SemanticspdPackageImpl theSemanticspdPackage = registeredSemanticspdPackage instanceof SemanticspdPackageImpl ? (SemanticspdPackageImpl)registeredSemanticspdPackage : new SemanticspdPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		SpdPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSemanticspdPackage.createPackageContents();

		// Initialize created meta-data
		theSemanticspdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSemanticspdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SemanticspdPackage.eNS_URI, theSemanticspdPackage);
		return theSemanticspdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Spd() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_EnactedPolicy() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_TargetCfgs() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Allocation() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_System() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ResourceEnvironment() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Repository() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetGroupCfg() {
		return targetGroupCfgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetGroupCfg_EnactedPolicies() {
		return (EReference)targetGroupCfgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElasticInfrastructureCfg() {
		return elasticInfrastructureCfgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElasticInfrastructureCfg_Unit() {
		return (EReference)elasticInfrastructureCfgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElasticInfrastructureCfg_Elements() {
		return (EReference)elasticInfrastructureCfgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElasticInfrastructureCfg_LinkingResource() {
		return (EReference)elasticInfrastructureCfgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElasticInfrastructureCfg_ResourceEnvironment() {
		return (EReference)elasticInfrastructureCfgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceGroupCfg() {
		return serviceGroupCfgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGroupCfg_Unit() {
		return (EReference)serviceGroupCfgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGroupCfg_Elements() {
		return (EReference)serviceGroupCfgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGroupCfg_LoadBalancingAssembly() {
		return (EReference)serviceGroupCfgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompetingConsumersGroupCfg() {
		return competingConsumersGroupCfgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompetingConsumersGroupCfg_Unit() {
		return (EReference)competingConsumersGroupCfgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompetingConsumersGroupCfg_Elements() {
		return (EReference)competingConsumersGroupCfgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompetingConsumersGroupCfg_BrokerAssembly() {
		return (EReference)competingConsumersGroupCfgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompetingConsumersGroupCfg_UnitQueues() {
		return (EReference)competingConsumersGroupCfgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueue() {
		return queueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueue_PassiveResourceQueueMessages() {
		return (EReference)queueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueue_Name() {
		return (EAttribute)queueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueue_UsageScenarioForConsumption() {
		return (EReference)queueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticspdFactory getSemanticspdFactory() {
		return (SemanticspdFactory)getEFactoryInstance();
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
		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__SPD);
		createEReference(configurationEClass, CONFIGURATION__ENACTED_POLICY);
		createEReference(configurationEClass, CONFIGURATION__TARGET_CFGS);
		createEReference(configurationEClass, CONFIGURATION__ALLOCATION);
		createEReference(configurationEClass, CONFIGURATION__SYSTEM);
		createEReference(configurationEClass, CONFIGURATION__RESOURCE_ENVIRONMENT);
		createEReference(configurationEClass, CONFIGURATION__REPOSITORY);

		targetGroupCfgEClass = createEClass(TARGET_GROUP_CFG);
		createEReference(targetGroupCfgEClass, TARGET_GROUP_CFG__ENACTED_POLICIES);

		elasticInfrastructureCfgEClass = createEClass(ELASTIC_INFRASTRUCTURE_CFG);
		createEReference(elasticInfrastructureCfgEClass, ELASTIC_INFRASTRUCTURE_CFG__UNIT);
		createEReference(elasticInfrastructureCfgEClass, ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS);
		createEReference(elasticInfrastructureCfgEClass, ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE);
		createEReference(elasticInfrastructureCfgEClass, ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT);

		serviceGroupCfgEClass = createEClass(SERVICE_GROUP_CFG);
		createEReference(serviceGroupCfgEClass, SERVICE_GROUP_CFG__UNIT);
		createEReference(serviceGroupCfgEClass, SERVICE_GROUP_CFG__ELEMENTS);
		createEReference(serviceGroupCfgEClass, SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY);

		competingConsumersGroupCfgEClass = createEClass(COMPETING_CONSUMERS_GROUP_CFG);
		createEReference(competingConsumersGroupCfgEClass, COMPETING_CONSUMERS_GROUP_CFG__UNIT);
		createEReference(competingConsumersGroupCfgEClass, COMPETING_CONSUMERS_GROUP_CFG__ELEMENTS);
		createEReference(competingConsumersGroupCfgEClass, COMPETING_CONSUMERS_GROUP_CFG__BROKER_ASSEMBLY);
		createEReference(competingConsumersGroupCfgEClass, COMPETING_CONSUMERS_GROUP_CFG__UNIT_QUEUES);

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
		SpdPackage theSpdPackage = (SpdPackage)EPackage.Registry.INSTANCE.getEPackage(SpdPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage)EPackage.Registry.INSTANCE.getEPackage(AllocationPackage.eNS_URI);
		SystemPackage theSystemPackage = (SystemPackage)EPackage.Registry.INSTANCE.getEPackage(SystemPackage.eNS_URI);
		ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceenvironmentPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		CompositionPackage theCompositionPackage = (CompositionPackage)EPackage.Registry.INSTANCE.getEPackage(CompositionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		UsagemodelPackage theUsagemodelPackage = (UsagemodelPackage)EPackage.Registry.INSTANCE.getEPackage(UsagemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elasticInfrastructureCfgEClass.getESuperTypes().add(this.getTargetGroupCfg());
		serviceGroupCfgEClass.getESuperTypes().add(this.getTargetGroupCfg());
		competingConsumersGroupCfgEClass.getESuperTypes().add(this.getTargetGroupCfg());

		// Initialize classes, features, and operations; add parameters
		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Spd(), theSpdPackage.getSPD(), null, "spd", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_EnactedPolicy(), theSpdPackage.getScalingPolicy(), null, "enactedPolicy", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_TargetCfgs(), this.getTargetGroupCfg(), null, "targetCfgs", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Allocation(), theAllocationPackage.getAllocation(), null, "allocation", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_System(), theSystemPackage.getSystem(), null, "system", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_ResourceEnvironment(), theResourceenvironmentPackage.getResourceEnvironment(), null, "resourceEnvironment", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Repository(), theRepositoryPackage.getRepository(), null, "repository", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetGroupCfgEClass, TargetGroupCfg.class, "TargetGroupCfg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetGroupCfg_EnactedPolicies(), theSpdPackage.getScalingPolicy(), null, "enactedPolicies", null, 0, -1, TargetGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elasticInfrastructureCfgEClass, ElasticInfrastructureCfg.class, "ElasticInfrastructureCfg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElasticInfrastructureCfg_Unit(), theResourceenvironmentPackage.getResourceContainer(), null, "unit", null, 0, 1, ElasticInfrastructureCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElasticInfrastructureCfg_Elements(), theResourceenvironmentPackage.getResourceContainer(), null, "elements", null, 1, -1, ElasticInfrastructureCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElasticInfrastructureCfg_LinkingResource(), theResourceenvironmentPackage.getLinkingResource(), null, "linkingResource", null, 0, 1, ElasticInfrastructureCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElasticInfrastructureCfg_ResourceEnvironment(), theResourceenvironmentPackage.getResourceEnvironment(), null, "resourceEnvironment", null, 0, 1, ElasticInfrastructureCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceGroupCfgEClass, ServiceGroupCfg.class, "ServiceGroupCfg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceGroupCfg_Unit(), theCompositionPackage.getAssemblyContext(), null, "unit", null, 0, 1, ServiceGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceGroupCfg_Elements(), theCompositionPackage.getAssemblyContext(), null, "elements", null, 1, -1, ServiceGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceGroupCfg_LoadBalancingAssembly(), theCompositionPackage.getAssemblyContext(), null, "loadBalancingAssembly", null, 0, 1, ServiceGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(competingConsumersGroupCfgEClass, CompetingConsumersGroupCfg.class, "CompetingConsumersGroupCfg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompetingConsumersGroupCfg_Unit(), theCompositionPackage.getAssemblyContext(), null, "unit", null, 0, 1, CompetingConsumersGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetingConsumersGroupCfg_Elements(), theCompositionPackage.getAssemblyContext(), null, "elements", null, 1, -1, CompetingConsumersGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetingConsumersGroupCfg_BrokerAssembly(), theCompositionPackage.getAssemblyContext(), null, "brokerAssembly", null, 0, 1, CompetingConsumersGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompetingConsumersGroupCfg_UnitQueues(), this.getQueue(), null, "unitQueues", null, 1, -1, CompetingConsumersGroupCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueEClass, Queue.class, "Queue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueue_PassiveResourceQueueMessages(), theRepositoryPackage.getPassiveResource(), null, "passiveResourceQueueMessages", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueue_UsageScenarioForConsumption(), theUsagemodelPackage.getUsageScenario(), null, "usageScenarioForConsumption", null, 0, 1, Queue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SemanticspdPackageImpl
