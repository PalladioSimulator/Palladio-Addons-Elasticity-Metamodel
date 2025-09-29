/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

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
 * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointFactory
 * @model kind="package"
 * @generated
 */
public interface ScalablePCMGroupMeasuringPointPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "scalablepcmgroupmeasuringpoint";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/PCM/ElasticityMeasuringPoint/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "scalablepcmgroupmeasuringpoint";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ScalablePCMGroupMeasuringPointPackage eINSTANCE = org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl
        .init();

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupMeasuringPointImpl
     * <em>Infrastructure Group Measuring Point</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupMeasuringPointImpl
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getInfrastructureGroupMeasuringPoint()
     * @generated
     */
    int INFRASTRUCTURE_GROUP_MEASURING_POINT = 0;

    /**
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Infrastructure Group</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT
            + 0;

    /**
     * The number of structural features of the '<em>Infrastructure Group Measuring Point</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupMeasuringPointImpl
     * <em>Service Group Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupMeasuringPointImpl
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getServiceGroupMeasuringPoint()
     * @generated
     */
    int SERVICE_GROUP_MEASURING_POINT = 1;

    /**
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Service Group</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service Group Measuring Point</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl
     * <em>Competing Consumer Group Measuring Point</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getCompetingConsumerGroupMeasuringPoint()
     * @generated
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT = 2;

    /**
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Competing Consumer Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT
            + 0;

    /**
     * The number of structural features of the '<em>Competing Consumer Group Measuring Point</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT
            + 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupReferenceImpl
     * <em>Service Group Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupReferenceImpl
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getServiceGroupReference()
     * @generated
     */
    int SERVICE_GROUP_REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Service Group</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_REFERENCE__SERVICE_GROUP = 0;

    /**
     * The number of structural features of the '<em>Service Group Reference</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupReferenceImpl
     * <em>Infrastructure Group Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupReferenceImpl
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getInfrastructureGroupReference()
     * @generated
     */
    int INFRASTRUCTURE_GROUP_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Infrastructure Group</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP = 0;

    /**
     * The number of structural features of the '<em>Infrastructure Group Reference</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int INFRASTRUCTURE_GROUP_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupReferenceImpl
     * <em>Competing Consumer Group Reference</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupReferenceImpl
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getCompetingConsumerGroupReference()
     * @generated
     */
    int COMPETING_CONSUMER_GROUP_REFERENCE = 5;

    /**
     * The feature id for the '<em><b>Competing Consumer Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP = 0;

    /**
     * The number of structural features of the '<em>Competing Consumer Group Reference</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_REFERENCE_FEATURE_COUNT = 1;

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint
     * <em>Infrastructure Group Measuring Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for class '<em>Infrastructure Group Measuring Point</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint
     * @generated
     */
    EClass getInfrastructureGroupMeasuringPoint();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint
     * <em>Service Group Measuring Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Service Group Measuring Point</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint
     * @generated
     */
    EClass getServiceGroupMeasuringPoint();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint
     * <em>Competing Consumer Group Measuring Point</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the meta object for class '<em>Competing Consumer Group Measuring Point</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint
     * @generated
     */
    EClass getCompetingConsumerGroupMeasuringPoint();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference
     * <em>Service Group Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Service Group Reference</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference
     * @generated
     */
    EClass getServiceGroupReference();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference#getServiceGroup
     * <em>Service Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Service Group</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference#getServiceGroup()
     * @see #getServiceGroupReference()
     * @generated
     */
    EReference getServiceGroupReference_ServiceGroup();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference
     * <em>Infrastructure Group Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Infrastructure Group Reference</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference
     * @generated
     */
    EClass getInfrastructureGroupReference();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference#getInfrastructureGroup
     * <em>Infrastructure Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Infrastructure Group</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference#getInfrastructureGroup()
     * @see #getInfrastructureGroupReference()
     * @generated
     */
    EReference getInfrastructureGroupReference_InfrastructureGroup();

    /**
     * Returns the meta object for class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference
     * <em>Competing Consumer Group Reference</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Competing Consumer Group Reference</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference
     * @generated
     */
    EClass getCompetingConsumerGroupReference();

    /**
     * Returns the meta object for the reference
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference#getCompetingConsumerGroup
     * <em>Competing Consumer Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Competing Consumer Group</em>'.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference#getCompetingConsumerGroup()
     * @see #getCompetingConsumerGroupReference()
     * @generated
     */
    EReference getCompetingConsumerGroupReference_CompetingConsumerGroup();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ScalablePCMGroupMeasuringPointFactory getScalablePCMGroupMeasuringPointFactory();

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
         * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupMeasuringPointImpl
         * <em>Infrastructure Group Measuring Point</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupMeasuringPointImpl
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getInfrastructureGroupMeasuringPoint()
         * @generated
         */
        EClass INFRASTRUCTURE_GROUP_MEASURING_POINT = eINSTANCE.getInfrastructureGroupMeasuringPoint();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupMeasuringPointImpl
         * <em>Service Group Measuring Point</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         *
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupMeasuringPointImpl
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getServiceGroupMeasuringPoint()
         * @generated
         */
        EClass SERVICE_GROUP_MEASURING_POINT = eINSTANCE.getServiceGroupMeasuringPoint();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl
         * <em>Competing Consumer Group Measuring Point</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getCompetingConsumerGroupMeasuringPoint()
         * @generated
         */
        EClass COMPETING_CONSUMER_GROUP_MEASURING_POINT = eINSTANCE.getCompetingConsumerGroupMeasuringPoint();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupReferenceImpl
         * <em>Service Group Reference</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupReferenceImpl
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getServiceGroupReference()
         * @generated
         */
        EClass SERVICE_GROUP_REFERENCE = eINSTANCE.getServiceGroupReference();

        /**
         * The meta object literal for the '<em><b>Service Group</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference SERVICE_GROUP_REFERENCE__SERVICE_GROUP = eINSTANCE.getServiceGroupReference_ServiceGroup();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupReferenceImpl
         * <em>Infrastructure Group Reference</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupReferenceImpl
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getInfrastructureGroupReference()
         * @generated
         */
        EClass INFRASTRUCTURE_GROUP_REFERENCE = eINSTANCE.getInfrastructureGroupReference();

        /**
         * The meta object literal for the '<em><b>Infrastructure Group</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP = eINSTANCE
            .getInfrastructureGroupReference_InfrastructureGroup();

        /**
         * The meta object literal for the
         * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupReferenceImpl
         * <em>Competing Consumer Group Reference</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         *
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupReferenceImpl
         * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointPackageImpl#getCompetingConsumerGroupReference()
         * @generated
         */
        EClass COMPETING_CONSUMER_GROUP_REFERENCE = eINSTANCE.getCompetingConsumerGroupReference();

        /**
         * The meta object literal for the '<em><b>Competing Consumer Group</b></em>' reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP = eINSTANCE
            .getCompetingConsumerGroupReference_CompetingConsumerGroup();

    }

} // ScalablePCMGroupMeasuringPointPackage
