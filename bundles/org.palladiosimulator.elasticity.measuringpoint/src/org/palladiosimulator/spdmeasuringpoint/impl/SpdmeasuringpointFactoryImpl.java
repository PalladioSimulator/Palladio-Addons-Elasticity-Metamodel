/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointFactory;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class SpdmeasuringpointFactoryImpl extends EFactoryImpl implements SpdmeasuringpointFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static SpdmeasuringpointFactory init() {
        try {
            final SpdmeasuringpointFactory theSpdmeasuringpointFactory = (SpdmeasuringpointFactory) EPackage.Registry.INSTANCE
                .getEFactory(SpdmeasuringpointPackage.eNS_URI);
            if (theSpdmeasuringpointFactory != null) {
                return theSpdmeasuringpointFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SpdmeasuringpointFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdmeasuringpointFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT:
            return this.createElasticInfrastructureMeasuringPoint();
        case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT:
            return this.createServiceGroupMeasuringPoint();
        case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT:
            return this.createCompetingConsumerGroupMeasuringPoint();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ElasticInfrastructureMeasuringPoint createElasticInfrastructureMeasuringPoint() {
        final ElasticInfrastructureMeasuringPointImpl elasticInfrastructureMeasuringPoint = new ElasticInfrastructureMeasuringPointImpl();
        return elasticInfrastructureMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceGroupMeasuringPoint createServiceGroupMeasuringPoint() {
        final ServiceGroupMeasuringPointImpl serviceGroupMeasuringPoint = new ServiceGroupMeasuringPointImpl();
        return serviceGroupMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CompetingConsumerGroupMeasuringPoint createCompetingConsumerGroupMeasuringPoint() {
        final CompetingConsumerGroupMeasuringPointImpl competingConsumerGroupMeasuringPoint = new CompetingConsumerGroupMeasuringPointImpl();
        return competingConsumerGroupMeasuringPoint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SpdmeasuringpointPackage getSpdmeasuringpointPackage() {
        return (SpdmeasuringpointPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SpdmeasuringpointPackage getPackage() {
        return SpdmeasuringpointPackage.eINSTANCE;
    }

} // SpdmeasuringpointFactoryImpl
