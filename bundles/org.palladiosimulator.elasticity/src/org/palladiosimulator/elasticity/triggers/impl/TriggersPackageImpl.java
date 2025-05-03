/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.triggers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
import org.palladiosimulator.elasticity.triggers.BaseTrigger;
import org.palladiosimulator.elasticity.triggers.ComposedTrigger;
import org.palladiosimulator.elasticity.triggers.LogicalOperator;
import org.palladiosimulator.elasticity.triggers.RelationalOperator;
import org.palladiosimulator.elasticity.triggers.ScalingTrigger;
import org.palladiosimulator.elasticity.triggers.SimpleFireOnTrend;
import org.palladiosimulator.elasticity.triggers.SimpleFireOnValue;
import org.palladiosimulator.elasticity.triggers.TrendPattern;
import org.palladiosimulator.elasticity.triggers.TriggersFactory;
import org.palladiosimulator.elasticity.triggers.TriggersPackage;
import org.palladiosimulator.elasticity.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.elasticity.triggers.expectations.impl.ExpectationsPackageImpl;
import org.palladiosimulator.elasticity.triggers.stimuli.StimuliPackage;
import org.palladiosimulator.elasticity.triggers.stimuli.impl.StimuliPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
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
public class TriggersPackageImpl extends EPackageImpl implements TriggersPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass scalingTriggerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass baseTriggerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass composedTriggerEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass simpleFireOnValueEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass simpleFireOnTrendEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum aggregationmethodEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum hddusagetypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum networkusagetypeEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum logicalOperatorEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum relationalOperatorEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum trendPatternEEnum = null;

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
     * @see org.palladiosimulator.elasticity.triggers.TriggersPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TriggersPackageImpl() {
        super(eNS_URI, TriggersFactory.eINSTANCE);
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
     * This method is used to initialize {@link TriggersPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TriggersPackage init() {
        if (isInited) {
            return (TriggersPackage) EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredTriggersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final TriggersPackageImpl theTriggersPackage = registeredTriggersPackage instanceof TriggersPackageImpl
                ? (TriggersPackageImpl) registeredTriggersPackage
                : new TriggersPackageImpl();

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
        theTriggersPackage.createPackageContents();
        theElasticityPackage.createPackageContents();
        theTargetsPackage.createPackageContents();
        theAdjustmentsPackage.createPackageContents();
        theConstraintsPackage.createPackageContents();
        thePolicyPackage.createPackageContents();
        theTargetPackage.createPackageContents();
        theStimuliPackage.createPackageContents();
        theExpectationsPackage.createPackageContents();
        theModelsPackage.createPackageContents();
        theDatatypesPackage.createPackageContents();
        thescalablepcmgroupsPackage.createPackageContents();

        // Initialize created meta-data
        theTriggersPackage.initializePackageContents();
        theElasticityPackage.initializePackageContents();
        theTargetsPackage.initializePackageContents();
        theAdjustmentsPackage.initializePackageContents();
        theConstraintsPackage.initializePackageContents();
        thePolicyPackage.initializePackageContents();
        theTargetPackage.initializePackageContents();
        theStimuliPackage.initializePackageContents();
        theExpectationsPackage.initializePackageContents();
        theModelsPackage.initializePackageContents();
        theDatatypesPackage.initializePackageContents();
        thescalablepcmgroupsPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTriggersPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TriggersPackage.eNS_URI, theTriggersPackage);
        return theTriggersPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getScalingTrigger() {
        return this.scalingTriggerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getBaseTrigger() {
        return this.baseTriggerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBaseTrigger_Stimulus() {
        return (EReference) this.baseTriggerEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getBaseTrigger_ExpectedValue() {
        return (EReference) this.baseTriggerEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getComposedTrigger() {
        return this.composedTriggerEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComposedTrigger_Scalingtrigger() {
        return (EReference) this.composedTriggerEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getComposedTrigger_LogicalOperator() {
        return (EAttribute) this.composedTriggerEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSimpleFireOnValue() {
        return this.simpleFireOnValueEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getSimpleFireOnValue_RelationalOperator() {
        return (EAttribute) this.simpleFireOnValueEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSimpleFireOnTrend() {
        return this.simpleFireOnTrendEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getAGGREGATIONMETHOD() {
        return this.aggregationmethodEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getHDDUSAGETYPE() {
        return this.hddusagetypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getNETWORKUSAGETYPE() {
        return this.networkusagetypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getLogicalOperator() {
        return this.logicalOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getRelationalOperator() {
        return this.relationalOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getTrendPattern() {
        return this.trendPatternEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TriggersFactory getTriggersFactory() {
        return (TriggersFactory) this.getEFactoryInstance();
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
        this.scalingTriggerEClass = this.createEClass(SCALING_TRIGGER);

        this.baseTriggerEClass = this.createEClass(BASE_TRIGGER);
        this.createEReference(this.baseTriggerEClass, BASE_TRIGGER__STIMULUS);
        this.createEReference(this.baseTriggerEClass, BASE_TRIGGER__EXPECTED_VALUE);

        this.composedTriggerEClass = this.createEClass(COMPOSED_TRIGGER);
        this.createEReference(this.composedTriggerEClass, COMPOSED_TRIGGER__SCALINGTRIGGER);
        this.createEAttribute(this.composedTriggerEClass, COMPOSED_TRIGGER__LOGICAL_OPERATOR);

        this.simpleFireOnValueEClass = this.createEClass(SIMPLE_FIRE_ON_VALUE);
        this.createEAttribute(this.simpleFireOnValueEClass, SIMPLE_FIRE_ON_VALUE__RELATIONAL_OPERATOR);

        this.simpleFireOnTrendEClass = this.createEClass(SIMPLE_FIRE_ON_TREND);

        // Create enums
        this.aggregationmethodEEnum = this.createEEnum(AGGREGATIONMETHOD);
        this.hddusagetypeEEnum = this.createEEnum(HDDUSAGETYPE);
        this.networkusagetypeEEnum = this.createEEnum(NETWORKUSAGETYPE);
        this.logicalOperatorEEnum = this.createEEnum(LOGICAL_OPERATOR);
        this.relationalOperatorEEnum = this.createEEnum(RELATIONAL_OPERATOR);
        this.trendPatternEEnum = this.createEEnum(TREND_PATTERN);
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
        final StimuliPackage theStimuliPackage = (StimuliPackage) EPackage.Registry.INSTANCE
            .getEPackage(StimuliPackage.eNS_URI);
        final ExpectationsPackage theExpectationsPackage = (ExpectationsPackage) EPackage.Registry.INSTANCE
            .getEPackage(ExpectationsPackage.eNS_URI);
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
            .getEPackage(IdentifierPackage.eNS_URI);

        // Add subpackages
        this.getESubpackages()
            .add(theStimuliPackage);
        this.getESubpackages()
            .add(theExpectationsPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.scalingTriggerEClass.getESuperTypes()
            .add(theIdentifierPackage.getIdentifier());
        this.baseTriggerEClass.getESuperTypes()
            .add(this.getScalingTrigger());
        this.composedTriggerEClass.getESuperTypes()
            .add(this.getScalingTrigger());
        this.simpleFireOnValueEClass.getESuperTypes()
            .add(this.getBaseTrigger());
        this.simpleFireOnTrendEClass.getESuperTypes()
            .add(this.getBaseTrigger());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.scalingTriggerEClass, ScalingTrigger.class, "ScalingTrigger", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.baseTriggerEClass, BaseTrigger.class, "BaseTrigger", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getBaseTrigger_Stimulus(), theStimuliPackage.getStimulus(), null, "stimulus", null, 1,
                1, BaseTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getBaseTrigger_ExpectedValue(), theExpectationsPackage.getExpectedValue(), null,
                "expectedValue", null, 1, 1, BaseTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.composedTriggerEClass, ComposedTrigger.class, "ComposedTrigger", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getComposedTrigger_Scalingtrigger(), this.getScalingTrigger(), null, "scalingtrigger",
                null, 2, -1, ComposedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getComposedTrigger_LogicalOperator(), this.getLogicalOperator(), "logicalOperator",
                null, 0, 1, ComposedTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.simpleFireOnValueEClass, SimpleFireOnValue.class, "SimpleFireOnValue", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getSimpleFireOnValue_RelationalOperator(), this.getRelationalOperator(),
                "relationalOperator", null, 0, 1, SimpleFireOnValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.simpleFireOnTrendEClass, SimpleFireOnTrend.class, "SimpleFireOnTrend", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        this.initEEnum(this.aggregationmethodEEnum, org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.class,
                "AGGREGATIONMETHOD");
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.AVERAGE);
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.MAX);
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.MIN);
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.MEDIAN);
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.SUM);
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.RATEOFCHANGE);
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.PERCENTILE95);
        this.addEEnumLiteral(this.aggregationmethodEEnum,
                org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD.PERCENTILE90);

        this.initEEnum(this.hddusagetypeEEnum, org.palladiosimulator.elasticity.triggers.HDDUSAGETYPE.class,
                "HDDUSAGETYPE");
        this.addEEnumLiteral(this.hddusagetypeEEnum, org.palladiosimulator.elasticity.triggers.HDDUSAGETYPE.READ);
        this.addEEnumLiteral(this.hddusagetypeEEnum, org.palladiosimulator.elasticity.triggers.HDDUSAGETYPE.WRITE);

        this.initEEnum(this.networkusagetypeEEnum, org.palladiosimulator.elasticity.triggers.NETWORKUSAGETYPE.class,
                "NETWORKUSAGETYPE");
        this.addEEnumLiteral(this.networkusagetypeEEnum,
                org.palladiosimulator.elasticity.triggers.NETWORKUSAGETYPE.SEND);
        this.addEEnumLiteral(this.networkusagetypeEEnum,
                org.palladiosimulator.elasticity.triggers.NETWORKUSAGETYPE.RECEIVE);

        this.initEEnum(this.logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
        this.addEEnumLiteral(this.logicalOperatorEEnum, LogicalOperator.AND);
        this.addEEnumLiteral(this.logicalOperatorEEnum, LogicalOperator.OR);
        this.addEEnumLiteral(this.logicalOperatorEEnum, LogicalOperator.XOR);

        this.initEEnum(this.relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
        this.addEEnumLiteral(this.relationalOperatorEEnum, RelationalOperator.LESS_THAN);
        this.addEEnumLiteral(this.relationalOperatorEEnum, RelationalOperator.GREATER_THAN);
        this.addEEnumLiteral(this.relationalOperatorEEnum, RelationalOperator.EQUAL_TO);
        this.addEEnumLiteral(this.relationalOperatorEEnum, RelationalOperator.LESS_THAN_OR_EQUAL_TO);
        this.addEEnumLiteral(this.relationalOperatorEEnum, RelationalOperator.GREATER_THAN_OR_EQUAL_TO);

        this.initEEnum(this.trendPatternEEnum, TrendPattern.class, "TrendPattern");
        this.addEEnumLiteral(this.trendPatternEEnum, TrendPattern.INCREASING);
        this.addEEnumLiteral(this.trendPatternEEnum, TrendPattern.DECREASING);
        this.addEEnumLiteral(this.trendPatternEEnum, TrendPattern.NON_INCREASING);
        this.addEEnumLiteral(this.trendPatternEEnum, TrendPattern.NON_DECREASING);
    }

} // TriggersPackageImpl
