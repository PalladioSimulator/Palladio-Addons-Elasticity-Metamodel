/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.elasticity.ElasticityFactory;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.elasticity.ElasticitySpec;
import org.palladiosimulator.elasticity.ModelBasedScalingPolicy;
import org.palladiosimulator.elasticity.ScalingPolicy;
import org.palladiosimulator.elasticity.TriggerBasedScalingPolicy;
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
import org.palladiosimulator.elasticity.util.ElasticityValidator;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ElasticityPackageImpl extends EPackageImpl implements ElasticityPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass triggerBasedScalingPolicyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass elasticitySpecEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass scalingPolicyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass modelBasedScalingPolicyEClass = null;

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
     * @see org.palladiosimulator.elasticity.ElasticityPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ElasticityPackageImpl() {
        super(eNS_URI, ElasticityFactory.eINSTANCE);
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
     * This method is used to initialize {@link ElasticityPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ElasticityPackage init() {
        if (isInited) {
            return (ElasticityPackage) EPackage.Registry.INSTANCE.getEPackage(ElasticityPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredElasticityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final ElasticityPackageImpl theElasticityPackage = registeredElasticityPackage instanceof ElasticityPackageImpl
                ? (ElasticityPackageImpl) registeredElasticityPackage
                : new ElasticityPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TargetsPackage.eNS_URI);
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

        // Register package validator
        EValidator.Registry.INSTANCE.put(theElasticityPackage, new EValidator.Descriptor() {
            @Override
            public EValidator getEValidator() {
                return ElasticityValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        theElasticityPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ElasticityPackage.eNS_URI, theElasticityPackage);
        return theElasticityPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTriggerBasedScalingPolicy() {
        return this.triggerBasedScalingPolicyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTriggerBasedScalingPolicy_AdjustmentType() {
        return (EReference) this.triggerBasedScalingPolicyEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getTriggerBasedScalingPolicy_ScalingTrigger() {
        return (EReference) this.triggerBasedScalingPolicyEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getElasticitySpec() {
        return this.elasticitySpecEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getElasticitySpec_ScalingPolicies() {
        return (EReference) this.elasticitySpecEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getElasticitySpec_TargetGroups() {
        return (EReference) this.elasticitySpecEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getScalingPolicy() {
        return this.scalingPolicyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getScalingPolicy_Active() {
        return (EAttribute) this.scalingPolicyEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getScalingPolicy_PolicyConstraints() {
        return (EReference) this.scalingPolicyEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getScalingPolicy_TargetGroup() {
        return (EReference) this.scalingPolicyEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getModelBasedScalingPolicy() {
        return this.modelBasedScalingPolicyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getModelBasedScalingPolicy_Model() {
        return (EReference) this.modelBasedScalingPolicyEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getModelBasedScalingPolicy_Adjustment() {
        return (EAttribute) this.modelBasedScalingPolicyEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ElasticityFactory getElasticityFactory() {
        return (ElasticityFactory) this.getEFactoryInstance();
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
        this.triggerBasedScalingPolicyEClass = this.createEClass(TRIGGER_BASED_SCALING_POLICY);
        this.createEReference(this.triggerBasedScalingPolicyEClass, TRIGGER_BASED_SCALING_POLICY__ADJUSTMENT_TYPE);
        this.createEReference(this.triggerBasedScalingPolicyEClass, TRIGGER_BASED_SCALING_POLICY__SCALING_TRIGGER);

        this.elasticitySpecEClass = this.createEClass(ELASTICITY_SPEC);
        this.createEReference(this.elasticitySpecEClass, ELASTICITY_SPEC__SCALING_POLICIES);
        this.createEReference(this.elasticitySpecEClass, ELASTICITY_SPEC__TARGET_GROUPS);

        this.scalingPolicyEClass = this.createEClass(SCALING_POLICY);
        this.createEAttribute(this.scalingPolicyEClass, SCALING_POLICY__ACTIVE);
        this.createEReference(this.scalingPolicyEClass, SCALING_POLICY__POLICY_CONSTRAINTS);
        this.createEReference(this.scalingPolicyEClass, SCALING_POLICY__TARGET_GROUP);

        this.modelBasedScalingPolicyEClass = this.createEClass(MODEL_BASED_SCALING_POLICY);
        this.createEReference(this.modelBasedScalingPolicyEClass, MODEL_BASED_SCALING_POLICY__MODEL);
        this.createEAttribute(this.modelBasedScalingPolicyEClass, MODEL_BASED_SCALING_POLICY__ADJUSTMENT);
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
        final TargetsPackage theTargetsPackage = (TargetsPackage) EPackage.Registry.INSTANCE
            .getEPackage(TargetsPackage.eNS_URI);
        final AdjustmentsPackage theAdjustmentsPackage = (AdjustmentsPackage) EPackage.Registry.INSTANCE
            .getEPackage(AdjustmentsPackage.eNS_URI);
        final ConstraintsPackage theConstraintsPackage = (ConstraintsPackage) EPackage.Registry.INSTANCE
            .getEPackage(ConstraintsPackage.eNS_URI);
        final TriggersPackage theTriggersPackage = (TriggersPackage) EPackage.Registry.INSTANCE
            .getEPackage(TriggersPackage.eNS_URI);
        final ModelsPackage theModelsPackage = (ModelsPackage) EPackage.Registry.INSTANCE
            .getEPackage(ModelsPackage.eNS_URI);
        final DatatypesPackage theDatatypesPackage = (DatatypesPackage) EPackage.Registry.INSTANCE
            .getEPackage(DatatypesPackage.eNS_URI);
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
            .getEPackage(EntityPackage.eNS_URI);
        final PolicyPackage thePolicyPackage = (PolicyPackage) EPackage.Registry.INSTANCE
            .getEPackage(PolicyPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
            .getEPackage(EcorePackage.eNS_URI);

        // Add subpackages
        this.getESubpackages()
            .add(theTargetsPackage);
        this.getESubpackages()
            .add(theAdjustmentsPackage);
        this.getESubpackages()
            .add(theConstraintsPackage);
        this.getESubpackages()
            .add(theTriggersPackage);
        this.getESubpackages()
            .add(theModelsPackage);
        this.getESubpackages()
            .add(theDatatypesPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.triggerBasedScalingPolicyEClass.getESuperTypes()
            .add(this.getScalingPolicy());
        this.elasticitySpecEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.scalingPolicyEClass.getESuperTypes()
            .add(theEntityPackage.getEntity());
        this.modelBasedScalingPolicyEClass.getESuperTypes()
            .add(this.getScalingPolicy());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.triggerBasedScalingPolicyEClass, TriggerBasedScalingPolicy.class,
                "TriggerBasedScalingPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getTriggerBasedScalingPolicy_AdjustmentType(),
                theAdjustmentsPackage.getAdjustmentType(), null, "adjustmentType", null, 1, 1,
                TriggerBasedScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getTriggerBasedScalingPolicy_ScalingTrigger(), theTriggersPackage.getScalingTrigger(),
                null, "scalingTrigger", null, 1, 1, TriggerBasedScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.elasticitySpecEClass, ElasticitySpec.class, "ElasticitySpec", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getElasticitySpec_ScalingPolicies(), this.getScalingPolicy(), null, "scalingPolicies",
                null, 1, -1, ElasticitySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getElasticitySpec_TargetGroups(), theTargetsPackage.getTargetGroup(), null,
                "targetGroups", null, 1, -1, ElasticitySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.scalingPolicyEClass, ScalingPolicy.class, "ScalingPolicy", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getScalingPolicy_Active(), this.ecorePackage.getEBoolean(), "active", null, 0, 1,
                ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getScalingPolicy_PolicyConstraints(), thePolicyPackage.getPolicyConstraint(), null,
                "policyConstraints", null, 0, -1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getScalingPolicy_TargetGroup(), theTargetsPackage.getTargetGroup(), null,
                "targetGroup", null, 1, 1, ScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.modelBasedScalingPolicyEClass, ModelBasedScalingPolicy.class, "ModelBasedScalingPolicy",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getModelBasedScalingPolicy_Model(), theModelsPackage.getBaseModel(), null, "model",
                null, 1, 1, ModelBasedScalingPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getModelBasedScalingPolicy_Adjustment(), theEcorePackage.getEInt(), "adjustment", null,
                0, 1, ModelBasedScalingPolicy.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/emf/2002/Ecore
        this.createEcoreAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createEcoreAnnotations() {
        final String source = "http://www.eclipse.org/emf/2002/Ecore";
        this.addAnnotation(this.elasticitySpecEClass, source,
                new String[] { "constraints", "nameInvariant noSameTargetGroup" });
        this.addAnnotation(this.scalingPolicyEClass, source, new String[] { "constraints", "policyNameInvariant" });
    }

} // ElasticityPackageImpl
