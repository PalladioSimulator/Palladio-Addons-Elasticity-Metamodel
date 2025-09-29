/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointFactory;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference;
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
public class ScalablePCMGroupMeasuringPointPackageImpl extends EPackageImpl
        implements ScalablePCMGroupMeasuringPointPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass infrastructureGroupMeasuringPointEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass serviceGroupMeasuringPointEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass competingConsumerGroupMeasuringPointEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass serviceGroupReferenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass infrastructureGroupReferenceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass competingConsumerGroupReferenceEClass = null;

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
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ScalablePCMGroupMeasuringPointPackageImpl() {
        super(eNS_URI, ScalablePCMGroupMeasuringPointFactory.eINSTANCE);
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
     * This method is used to initialize {@link ScalablePCMGroupMeasuringPointPackage#eINSTANCE}
     * when that field is accessed. Clients should not invoke it directly. Instead, they should
     * simply access that field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ScalablePCMGroupMeasuringPointPackage init() {
        if (isInited) {
            return (ScalablePCMGroupMeasuringPointPackage) EPackage.Registry.INSTANCE
                .getEPackage(ScalablePCMGroupMeasuringPointPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredScalablePCMGroupMeasuringPointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final ScalablePCMGroupMeasuringPointPackageImpl theScalablePCMGroupMeasuringPointPackage = registeredScalablePCMGroupMeasuringPointPackage instanceof ScalablePCMGroupMeasuringPointPackageImpl
                ? (ScalablePCMGroupMeasuringPointPackageImpl) registeredScalablePCMGroupMeasuringPointPackage
                : new ScalablePCMGroupMeasuringPointPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        EcorePackage.eINSTANCE.eClass();
        ExperimentDataPackage.eINSTANCE.eClass();
        RepositoryPackage.eINSTANCE.eClass();
        MeasuringpointPackage.eINSTANCE.eClass();
        ElasticityPackage.eINSTANCE.eClass();
        IdentifierPackage.eINSTANCE.eClass();
        MetricSpecPackage.eINSTANCE.eClass();
        PcmPackage.eINSTANCE.eClass();
        ProbfunctionPackage.eINSTANCE.eClass();
        scalablepcmgroupsPackage.eINSTANCE.eClass();
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theScalablePCMGroupMeasuringPointPackage.createPackageContents();

        // Initialize created meta-data
        theScalablePCMGroupMeasuringPointPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theScalablePCMGroupMeasuringPointPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ScalablePCMGroupMeasuringPointPackage.eNS_URI,
                theScalablePCMGroupMeasuringPointPackage);
        return theScalablePCMGroupMeasuringPointPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInfrastructureGroupMeasuringPoint() {
        return this.infrastructureGroupMeasuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getServiceGroupMeasuringPoint() {
        return this.serviceGroupMeasuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCompetingConsumerGroupMeasuringPoint() {
        return this.competingConsumerGroupMeasuringPointEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getServiceGroupReference() {
        return this.serviceGroupReferenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getServiceGroupReference_ServiceGroup() {
        return (EReference) this.serviceGroupReferenceEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInfrastructureGroupReference() {
        return this.infrastructureGroupReferenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInfrastructureGroupReference_InfrastructureGroup() {
        return (EReference) this.infrastructureGroupReferenceEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCompetingConsumerGroupReference() {
        return this.competingConsumerGroupReferenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCompetingConsumerGroupReference_CompetingConsumerGroup() {
        return (EReference) this.competingConsumerGroupReferenceEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ScalablePCMGroupMeasuringPointFactory getScalablePCMGroupMeasuringPointFactory() {
        return (ScalablePCMGroupMeasuringPointFactory) this.getEFactoryInstance();
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
        this.infrastructureGroupMeasuringPointEClass = this.createEClass(INFRASTRUCTURE_GROUP_MEASURING_POINT);

        this.serviceGroupMeasuringPointEClass = this.createEClass(SERVICE_GROUP_MEASURING_POINT);

        this.competingConsumerGroupMeasuringPointEClass = this.createEClass(COMPETING_CONSUMER_GROUP_MEASURING_POINT);

        this.serviceGroupReferenceEClass = this.createEClass(SERVICE_GROUP_REFERENCE);
        this.createEReference(this.serviceGroupReferenceEClass, SERVICE_GROUP_REFERENCE__SERVICE_GROUP);

        this.infrastructureGroupReferenceEClass = this.createEClass(INFRASTRUCTURE_GROUP_REFERENCE);
        this.createEReference(this.infrastructureGroupReferenceEClass,
                INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP);

        this.competingConsumerGroupReferenceEClass = this.createEClass(COMPETING_CONSUMER_GROUP_REFERENCE);
        this.createEReference(this.competingConsumerGroupReferenceEClass,
                COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP);
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
        final MeasuringpointPackage theMeasuringpointPackage = (MeasuringpointPackage) EPackage.Registry.INSTANCE
            .getEPackage(MeasuringpointPackage.eNS_URI);
        final scalablepcmgroupsPackage thescalablepcmgroupsPackage = (scalablepcmgroupsPackage) EPackage.Registry.INSTANCE
            .getEPackage(scalablepcmgroupsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.infrastructureGroupMeasuringPointEClass.getESuperTypes()
            .add(theMeasuringpointPackage.getMeasuringPoint());
        this.infrastructureGroupMeasuringPointEClass.getESuperTypes()
            .add(this.getInfrastructureGroupReference());
        this.serviceGroupMeasuringPointEClass.getESuperTypes()
            .add(theMeasuringpointPackage.getMeasuringPoint());
        this.serviceGroupMeasuringPointEClass.getESuperTypes()
            .add(this.getServiceGroupReference());
        this.competingConsumerGroupMeasuringPointEClass.getESuperTypes()
            .add(theMeasuringpointPackage.getMeasuringPoint());
        this.competingConsumerGroupMeasuringPointEClass.getESuperTypes()
            .add(this.getCompetingConsumerGroupReference());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.infrastructureGroupMeasuringPointEClass, InfrastructureGroupMeasuringPoint.class,
                "InfrastructureGroupMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.serviceGroupMeasuringPointEClass, ServiceGroupMeasuringPoint.class,
                "ServiceGroupMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.competingConsumerGroupMeasuringPointEClass, CompetingConsumerGroupMeasuringPoint.class,
                "CompetingConsumerGroupMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.serviceGroupReferenceEClass, ServiceGroupReference.class, "ServiceGroupReference",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getServiceGroupReference_ServiceGroup(), thescalablepcmgroupsPackage.getServiceGroup(),
                null, "serviceGroup", null, 1, 1, ServiceGroupReference.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.infrastructureGroupReferenceEClass, InfrastructureGroupReference.class,
                "InfrastructureGroupReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getInfrastructureGroupReference_InfrastructureGroup(),
                thescalablepcmgroupsPackage.getInfrastructureGroup(), null, "infrastructureGroup", null, 1, 1,
                InfrastructureGroupReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.competingConsumerGroupReferenceEClass, CompetingConsumerGroupReference.class,
                "CompetingConsumerGroupReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCompetingConsumerGroupReference_CompetingConsumerGroup(),
                thescalablepcmgroupsPackage.getCompetingConsumersGroup(), null, "competingConsumerGroup", null, 1, 1,
                CompetingConsumerGroupReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // ScalablePCMGroupMeasuringPointPackageImpl
