/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.impl;

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
import org.palladiosimulator.elasticity.targets.CompetingConsumersGroup;
import org.palladiosimulator.elasticity.targets.InfrastructureGroup;
import org.palladiosimulator.elasticity.targets.ServiceGroup;
import org.palladiosimulator.elasticity.targets.TargetGroup;
import org.palladiosimulator.elasticity.targets.TargetsFactory;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.elasticity.triggers.TriggersPackage;
import org.palladiosimulator.elasticity.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.elasticity.triggers.expectations.impl.ExpectationsPackageImpl;
import org.palladiosimulator.elasticity.triggers.impl.TriggersPackageImpl;
import org.palladiosimulator.elasticity.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.elasticity.triggers.stimuli.impl.StimuliPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.composition.CompositionPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;
import org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class TargetsPackageImpl extends EPackageImpl implements TargetsPackage {
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
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.elasticity.targets.TargetsPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TargetsPackageImpl() {
        super(eNS_URI, TargetsFactory.eINSTANCE);
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
     * This method is used to initialize {@link TargetsPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TargetsPackage init() {
        if (isInited) {
            return (TargetsPackage) EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredTargetsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final TargetsPackageImpl theTargetsPackage = registeredTargetsPackage instanceof TargetsPackageImpl
                ? (TargetsPackageImpl) registeredTargetsPackage
                : new TargetsPackageImpl();

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
        registeredPackage = EPackage.Registry.INSTANCE.getEPackage(scalablepcmgroupsPackage.eNS_URI);
        final scalablepcmgroupsPackageImpl thescalablepcmgroupsPackage = (scalablepcmgroupsPackageImpl) (registeredPackage instanceof scalablepcmgroupsPackageImpl
                ? registeredPackage
                : scalablepcmgroupsPackage.eINSTANCE);

        // Create package meta-data objects
        theTargetsPackage.createPackageContents();
        theElasticityPackage.createPackageContents();
        theAdjustmentsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTargetPackage.createPackageContents();
        theTriggersPackage.createPackageContents();
        theStimuliPackage.createPackageContents();
        theExpectationsPackage.createPackageContents();
        theModelsPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();
        thescalablepcmgroupsPackage.createPackageContents();

        // Initialize created meta-data
        theTargetsPackage.initializePackageContents();
        theElasticityPackage.initializePackageContents();
        theAdjustmentsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTargetPackage.initializePackageContents();
        theTriggersPackage.initializePackageContents();
        theStimuliPackage.initializePackageContents();
        theExpectationsPackage.initializePackageContents();
        theModelsPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();
        thescalablepcmgroupsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTargetsPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TargetsPackage.eNS_URI, theTargetsPackage);
        return theTargetsPackage;
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
    public EReference getTargetGroup_TargetConstraints() {
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
    public EReference getInfrastructureGroup_PCM_ResourceEnvironment() {
        return (EReference) this.infrastructureGroupEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_Unit() {
        return (EReference) this.infrastructureGroupEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInfrastructureGroup_InfrastructureGroup() {
        return (EReference) this.infrastructureGroupEClass.getEStructuralFeatures()
            .get(2);
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
    public EReference getServiceGroup_UnitAssembly() {
        return (EReference) this.serviceGroupEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getServiceGroup_ServiceGroup() {
        return (EReference) this.serviceGroupEClass.getEStructuralFeatures()
            .get(1);
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
    public EReference getCompetingConsumersGroup_UnitAssembly() {
        return (EReference) this.competingConsumersGroupEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompetingConsumersGroup_CompetingConsumersGroup() {
        return (EReference) this.competingConsumersGroupEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TargetsFactory getTargetsFactory() {
        return (TargetsFactory) this.getEFactoryInstance();
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
        this.targetGroupEClass = this.createEClass(TARGET_GROUP);
        this.createEReference(this.targetGroupEClass, TARGET_GROUP__TARGET_CONSTRAINTS);

        this.infrastructureGroupEClass = this.createEClass(INFRASTRUCTURE_GROUP);
        this.createEReference(this.infrastructureGroupEClass, INFRASTRUCTURE_GROUP__PCM_RESOURCE_ENVIRONMENT);
        this.createEReference(this.infrastructureGroupEClass, INFRASTRUCTURE_GROUP__UNIT);
        this.createEReference(this.infrastructureGroupEClass, INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP);

        this.serviceGroupEClass = this.createEClass(SERVICE_GROUP);
        this.createEReference(this.serviceGroupEClass, SERVICE_GROUP__UNIT_ASSEMBLY);
        this.createEReference(this.serviceGroupEClass, SERVICE_GROUP__SERVICE_GROUP);

        this.competingConsumersGroupEClass = this.createEClass(COMPETING_CONSUMERS_GROUP);
        this.createEReference(this.competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__UNIT_ASSEMBLY);
        this.createEReference(this.competingConsumersGroupEClass, COMPETING_CONSUMERS_GROUP__COMPETING_CONSUMERS_GROUP);
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
        final TargetPackage theTargetPackage = (TargetPackage) EPackage.Registry.INSTANCE
            .getEPackage(TargetPackage.eNS_URI);
        final ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage) EPackage.Registry.INSTANCE
            .getEPackage(ResourceenvironmentPackage.eNS_URI);
        final scalablepcmgroupsPackage thescalablepcmgroupsPackage = (scalablepcmgroupsPackage) EPackage.Registry.INSTANCE
            .getEPackage(scalablepcmgroupsPackage.eNS_URI);
        final CompositionPackage theCompositionPackage = (CompositionPackage) EPackage.Registry.INSTANCE
            .getEPackage(CompositionPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.targetGroupEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.infrastructureGroupEClass.getESuperTypes()
            .add(this.getTargetGroup());
        this.serviceGroupEClass.getESuperTypes()
            .add(this.getTargetGroup());
        this.competingConsumersGroupEClass.getESuperTypes()
            .add(this.getTargetGroup());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.targetGroupEClass, TargetGroup.class, "TargetGroup", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTargetGroup_TargetConstraints(), theTargetPackage.getTargetConstraint(), null,
                "targetConstraints", null, 0, -1, TargetGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.infrastructureGroupEClass, InfrastructureGroup.class, "InfrastructureGroup", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getInfrastructureGroup_PCM_ResourceEnvironment(),
                theResourceenvironmentPackage.getResourceEnvironment(), null, "PCM_ResourceEnvironment", null, 0, 1,
                InfrastructureGroup.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getInfrastructureGroup_Unit(), theResourceenvironmentPackage.getResourceContainer(),
                null, "unit", null, 0, 1, InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getInfrastructureGroup_InfrastructureGroup(),
                thescalablepcmgroupsPackage.getInfrastructureGroup(), null, "infrastructureGroup", null, 0, 1,
                InfrastructureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.serviceGroupEClass, ServiceGroup.class, "ServiceGroup", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getServiceGroup_UnitAssembly(), theCompositionPackage.getAssemblyContext(), null,
                "unitAssembly", null, 0, 1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getServiceGroup_ServiceGroup(), thescalablepcmgroupsPackage.getServiceGroup(), null,
                "serviceGroup", null, 0, 1, ServiceGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.competingConsumersGroupEClass, CompetingConsumersGroup.class, "CompetingConsumersGroup",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCompetingConsumersGroup_UnitAssembly(), theCompositionPackage.getAssemblyContext(),
                null, "unitAssembly", null, 0, 1, CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getCompetingConsumersGroup_CompetingConsumersGroup(),
                thescalablepcmgroupsPackage.getCompetingConsumersGroup(), null, "competingConsumersGroup", null, 0, 1,
                CompetingConsumersGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    }

} // TargetsPackageImpl
