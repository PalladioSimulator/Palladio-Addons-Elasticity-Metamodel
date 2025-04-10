/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointFactory;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class SpdmeasuringpointPackageImpl extends EPackageImpl implements SpdmeasuringpointPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass elasticInfrastructureMeasuringPointEClass = null;

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
    private EClass elasticInfrastructureReferenceEClass = null;

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
     * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SpdmeasuringpointPackageImpl() {
        super(eNS_URI, SpdmeasuringpointFactory.eINSTANCE);
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
     * This method is used to initialize {@link SpdmeasuringpointPackage#eINSTANCE} when that field
     * is accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SpdmeasuringpointPackage init() {
        if (isInited) {
            return (SpdmeasuringpointPackage) EPackage.Registry.INSTANCE.getEPackage(SpdmeasuringpointPackage.eNS_URI);
        }

        // Obtain or create and register package
        final Object registeredSpdmeasuringpointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        final SpdmeasuringpointPackageImpl theSpdmeasuringpointPackage = registeredSpdmeasuringpointPackage instanceof SpdmeasuringpointPackageImpl
                ? (SpdmeasuringpointPackageImpl) registeredSpdmeasuringpointPackage
                : new SpdmeasuringpointPackageImpl();

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
        StoexPackage.eINSTANCE.eClass();
        UnitsPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSpdmeasuringpointPackage.createPackageContents();

        // Initialize created meta-data
        theSpdmeasuringpointPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theSpdmeasuringpointPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SpdmeasuringpointPackage.eNS_URI, theSpdmeasuringpointPackage);
        return theSpdmeasuringpointPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getElasticInfrastructureMeasuringPoint() {
        return this.elasticInfrastructureMeasuringPointEClass;
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
    public EClass getElasticInfrastructureReference() {
        return this.elasticInfrastructureReferenceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getElasticInfrastructureReference_ElasticInfrastructure() {
        return (EReference) this.elasticInfrastructureReferenceEClass.getEStructuralFeatures()
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
    public SpdmeasuringpointFactory getSpdmeasuringpointFactory() {
        return (SpdmeasuringpointFactory) this.getEFactoryInstance();
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
        this.elasticInfrastructureMeasuringPointEClass = this.createEClass(ELASTIC_INFRASTRUCTURE_MEASURING_POINT);

        this.serviceGroupMeasuringPointEClass = this.createEClass(SERVICE_GROUP_MEASURING_POINT);

        this.competingConsumerGroupMeasuringPointEClass = this.createEClass(COMPETING_CONSUMER_GROUP_MEASURING_POINT);

        this.serviceGroupReferenceEClass = this.createEClass(SERVICE_GROUP_REFERENCE);
        this.createEReference(this.serviceGroupReferenceEClass, SERVICE_GROUP_REFERENCE__SERVICE_GROUP);

        this.elasticInfrastructureReferenceEClass = this.createEClass(ELASTIC_INFRASTRUCTURE_REFERENCE);
        this.createEReference(this.elasticInfrastructureReferenceEClass,
                ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE);

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
        final TargetsPackage theTargetsPackage = (TargetsPackage) EPackage.Registry.INSTANCE
            .getEPackage(TargetsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.elasticInfrastructureMeasuringPointEClass.getESuperTypes()
            .add(theMeasuringpointPackage.getMeasuringPoint());
        this.elasticInfrastructureMeasuringPointEClass.getESuperTypes()
            .add(this.getElasticInfrastructureReference());
        this.serviceGroupMeasuringPointEClass.getESuperTypes()
            .add(theMeasuringpointPackage.getMeasuringPoint());
        this.serviceGroupMeasuringPointEClass.getESuperTypes()
            .add(this.getServiceGroupReference());
        this.competingConsumerGroupMeasuringPointEClass.getESuperTypes()
            .add(theMeasuringpointPackage.getMeasuringPoint());
        this.competingConsumerGroupMeasuringPointEClass.getESuperTypes()
            .add(this.getCompetingConsumerGroupReference());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.elasticInfrastructureMeasuringPointEClass, ElasticInfrastructureMeasuringPoint.class,
                "ElasticInfrastructureMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.serviceGroupMeasuringPointEClass, ServiceGroupMeasuringPoint.class,
                "ServiceGroupMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.competingConsumerGroupMeasuringPointEClass, CompetingConsumerGroupMeasuringPoint.class,
                "CompetingConsumerGroupMeasuringPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.serviceGroupReferenceEClass, ServiceGroupReference.class, "ServiceGroupReference",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getServiceGroupReference_ServiceGroup(), theTargetsPackage.getServiceGroup(), null,
                "serviceGroup", null, 1, 1, ServiceGroupReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.elasticInfrastructureReferenceEClass, ElasticInfrastructureReference.class,
                "ElasticInfrastructureReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getElasticInfrastructureReference_ElasticInfrastructure(),
                theTargetsPackage.getElasticInfrastructure(), null, "elasticInfrastructure", null, 1, 1,
                ElasticInfrastructureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.competingConsumerGroupReferenceEClass, CompetingConsumerGroupReference.class,
                "CompetingConsumerGroupReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCompetingConsumerGroupReference_CompetingConsumerGroup(),
                theTargetsPackage.getCompetingConsumersGroup(), null, "competingConsumerGroup", null, 1, 1,
                CompetingConsumerGroupReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // SpdmeasuringpointPackageImpl
