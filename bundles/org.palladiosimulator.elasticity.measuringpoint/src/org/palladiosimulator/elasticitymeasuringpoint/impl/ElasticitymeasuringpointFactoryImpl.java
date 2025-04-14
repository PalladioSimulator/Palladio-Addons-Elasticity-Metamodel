/**
 */
package org.palladiosimulator.elasticitymeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.elasticitymeasuringpoint.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticitymeasuringpointFactoryImpl extends EFactoryImpl implements ElasticitymeasuringpointFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ElasticitymeasuringpointFactory init() {
        try {
            ElasticitymeasuringpointFactory theElasticitymeasuringpointFactory = (ElasticitymeasuringpointFactory) EPackage.Registry.INSTANCE
                .getEFactory(ElasticitymeasuringpointPackage.eNS_URI);
            if (theElasticitymeasuringpointFactory != null) {
                return theElasticitymeasuringpointFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ElasticitymeasuringpointFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElasticitymeasuringpointFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT:
            return createElasticInfrastructureMeasuringPoint();
        case ElasticitymeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT:
            return createServiceGroupMeasuringPoint();
        case ElasticitymeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT:
            return createCompetingConsumerGroupMeasuringPoint();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElasticInfrastructureMeasuringPoint createElasticInfrastructureMeasuringPoint() {
        ElasticInfrastructureMeasuringPointImpl elasticInfrastructureMeasuringPoint = new ElasticInfrastructureMeasuringPointImpl();
        return elasticInfrastructureMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceGroupMeasuringPoint createServiceGroupMeasuringPoint() {
        ServiceGroupMeasuringPointImpl serviceGroupMeasuringPoint = new ServiceGroupMeasuringPointImpl();
        return serviceGroupMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CompetingConsumerGroupMeasuringPoint createCompetingConsumerGroupMeasuringPoint() {
        CompetingConsumerGroupMeasuringPointImpl competingConsumerGroupMeasuringPoint = new CompetingConsumerGroupMeasuringPointImpl();
        return competingConsumerGroupMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElasticitymeasuringpointPackage getElasticitymeasuringpointPackage() {
        return (ElasticitymeasuringpointPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ElasticitymeasuringpointPackage getPackage() {
        return ElasticitymeasuringpointPackage.eINSTANCE;
    }

} //ElasticitymeasuringpointFactoryImpl
