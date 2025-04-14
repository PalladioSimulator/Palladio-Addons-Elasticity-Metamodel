/**
 */
package org.palladiosimulator.elasticitymeasuringpoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticitymeasuringpointFactory
 * @model kind="package"
 * @generated
 */
public interface ElasticitymeasuringpointPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "elasticitymeasuringpoint";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/PCM/ElasticityMeasuringPoint/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "elasticitymeasuringpoint";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ElasticitymeasuringpointPackage eINSTANCE = org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl
        .init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureMeasuringPointImpl <em>Elastic Infrastructure Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureMeasuringPointImpl
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getElasticInfrastructureMeasuringPoint()
     * @generated
     */
    int ELASTIC_INFRASTRUCTURE_MEASURING_POINT = 0;

    /**
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Elastic Infrastructure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT
            + 0;

    /**
     * The number of structural features of the '<em>Elastic Infrastructure Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupMeasuringPointImpl <em>Service Group Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupMeasuringPointImpl
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getServiceGroupMeasuringPoint()
     * @generated
     */
    int SERVICE_GROUP_MEASURING_POINT = 1;

    /**
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Service Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Service Group Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl <em>Competing Consumer Group Measuring Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getCompetingConsumerGroupMeasuringPoint()
     * @generated
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT = 2;

    /**
     * The feature id for the '<em><b>Measuring Point Repository</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__MEASURING_POINT_REPOSITORY = MeasuringpointPackage.MEASURING_POINT__MEASURING_POINT_REPOSITORY;

    /**
     * The feature id for the '<em><b>String Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__STRING_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__STRING_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Resource URI Representation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__RESOURCE_URI_REPRESENTATION = MeasuringpointPackage.MEASURING_POINT__RESOURCE_URI_REPRESENTATION;

    /**
     * The feature id for the '<em><b>Competing Consumer Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT
            + 0;

    /**
     * The number of structural features of the '<em>Competing Consumer Group Measuring Point</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_MEASURING_POINT_FEATURE_COUNT = MeasuringpointPackage.MEASURING_POINT_FEATURE_COUNT
            + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupReferenceImpl <em>Service Group Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupReferenceImpl
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getServiceGroupReference()
     * @generated
     */
    int SERVICE_GROUP_REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Service Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_REFERENCE__SERVICE_GROUP = 0;

    /**
     * The number of structural features of the '<em>Service Group Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_GROUP_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureReferenceImpl <em>Elastic Infrastructure Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureReferenceImpl
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getElasticInfrastructureReference()
     * @generated
     */
    int ELASTIC_INFRASTRUCTURE_REFERENCE = 4;

    /**
     * The feature id for the '<em><b>Elastic Infrastructure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE = 0;

    /**
     * The number of structural features of the '<em>Elastic Infrastructure Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELASTIC_INFRASTRUCTURE_REFERENCE_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupReferenceImpl <em>Competing Consumer Group Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupReferenceImpl
     * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getCompetingConsumerGroupReference()
     * @generated
     */
    int COMPETING_CONSUMER_GROUP_REFERENCE = 5;

    /**
     * The feature id for the '<em><b>Competing Consumer Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP = 0;

    /**
     * The number of structural features of the '<em>Competing Consumer Group Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPETING_CONSUMER_GROUP_REFERENCE_FEATURE_COUNT = 1;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureMeasuringPoint <em>Elastic Infrastructure Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elastic Infrastructure Measuring Point</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureMeasuringPoint
     * @generated
     */
    EClass getElasticInfrastructureMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint <em>Service Group Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Group Measuring Point</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint
     * @generated
     */
    EClass getServiceGroupMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupMeasuringPoint <em>Competing Consumer Group Measuring Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Competing Consumer Group Measuring Point</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupMeasuringPoint
     * @generated
     */
    EClass getCompetingConsumerGroupMeasuringPoint();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference <em>Service Group Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service Group Reference</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference
     * @generated
     */
    EClass getServiceGroupReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference#getServiceGroup <em>Service Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Service Group</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference#getServiceGroup()
     * @see #getServiceGroupReference()
     * @generated
     */
    EReference getServiceGroupReference_ServiceGroup();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference <em>Elastic Infrastructure Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elastic Infrastructure Reference</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference
     * @generated
     */
    EClass getElasticInfrastructureReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference#getElasticInfrastructure <em>Elastic Infrastructure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Elastic Infrastructure</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference#getElasticInfrastructure()
     * @see #getElasticInfrastructureReference()
     * @generated
     */
    EReference getElasticInfrastructureReference_ElasticInfrastructure();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference <em>Competing Consumer Group Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Competing Consumer Group Reference</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference
     * @generated
     */
    EClass getCompetingConsumerGroupReference();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference#getCompetingConsumerGroup <em>Competing Consumer Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Competing Consumer Group</em>'.
     * @see org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference#getCompetingConsumerGroup()
     * @see #getCompetingConsumerGroupReference()
     * @generated
     */
    EReference getCompetingConsumerGroupReference_CompetingConsumerGroup();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ElasticitymeasuringpointFactory getElasticitymeasuringpointFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureMeasuringPointImpl <em>Elastic Infrastructure Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureMeasuringPointImpl
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getElasticInfrastructureMeasuringPoint()
         * @generated
         */
        EClass ELASTIC_INFRASTRUCTURE_MEASURING_POINT = eINSTANCE.getElasticInfrastructureMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupMeasuringPointImpl <em>Service Group Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupMeasuringPointImpl
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getServiceGroupMeasuringPoint()
         * @generated
         */
        EClass SERVICE_GROUP_MEASURING_POINT = eINSTANCE.getServiceGroupMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl <em>Competing Consumer Group Measuring Point</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getCompetingConsumerGroupMeasuringPoint()
         * @generated
         */
        EClass COMPETING_CONSUMER_GROUP_MEASURING_POINT = eINSTANCE.getCompetingConsumerGroupMeasuringPoint();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupReferenceImpl <em>Service Group Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupReferenceImpl
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getServiceGroupReference()
         * @generated
         */
        EClass SERVICE_GROUP_REFERENCE = eINSTANCE.getServiceGroupReference();

        /**
         * The meta object literal for the '<em><b>Service Group</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SERVICE_GROUP_REFERENCE__SERVICE_GROUP = eINSTANCE.getServiceGroupReference_ServiceGroup();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureReferenceImpl <em>Elastic Infrastructure Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureReferenceImpl
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getElasticInfrastructureReference()
         * @generated
         */
        EClass ELASTIC_INFRASTRUCTURE_REFERENCE = eINSTANCE.getElasticInfrastructureReference();

        /**
         * The meta object literal for the '<em><b>Elastic Infrastructure</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE = eINSTANCE
            .getElasticInfrastructureReference_ElasticInfrastructure();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupReferenceImpl <em>Competing Consumer Group Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.CompetingConsumerGroupReferenceImpl
         * @see org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointPackageImpl#getCompetingConsumerGroupReference()
         * @generated
         */
        EClass COMPETING_CONSUMER_GROUP_REFERENCE = eINSTANCE.getCompetingConsumerGroupReference();

        /**
         * The meta object literal for the '<em><b>Competing Consumer Group</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP = eINSTANCE
            .getCompetingConsumerGroupReference_CompetingConsumerGroup();

    }

} //ElasticitymeasuringpointPackage
