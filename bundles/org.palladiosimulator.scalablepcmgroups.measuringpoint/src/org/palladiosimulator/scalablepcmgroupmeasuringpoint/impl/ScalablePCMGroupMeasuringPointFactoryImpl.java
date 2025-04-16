/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointFactory;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ScalablePCMGroupMeasuringPointFactoryImpl extends EFactoryImpl
        implements ScalablePCMGroupMeasuringPointFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ScalablePCMGroupMeasuringPointFactory init() {
        try {
            final ScalablePCMGroupMeasuringPointFactory theScalablePCMGroupMeasuringPointFactory = (ScalablePCMGroupMeasuringPointFactory) EPackage.Registry.INSTANCE
                .getEFactory(ScalablePCMGroupMeasuringPointPackage.eNS_URI);
            if (theScalablePCMGroupMeasuringPointFactory != null) {
                return theScalablePCMGroupMeasuringPointFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ScalablePCMGroupMeasuringPointFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ScalablePCMGroupMeasuringPointFactoryImpl() {
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT:
            return this.createInfrastructureGroupMeasuringPoint();
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT:
            return this.createServiceGroupMeasuringPoint();
        case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT:
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
    public InfrastructureGroupMeasuringPoint createInfrastructureGroupMeasuringPoint() {
        final InfrastructureGroupMeasuringPointImpl infrastructureGroupMeasuringPoint = new InfrastructureGroupMeasuringPointImpl();
        return infrastructureGroupMeasuringPoint;
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
    public ScalablePCMGroupMeasuringPointPackage getScalablePCMGroupMeasuringPointPackage() {
        return (ScalablePCMGroupMeasuringPointPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ScalablePCMGroupMeasuringPointPackage getPackage() {
        return ScalablePCMGroupMeasuringPointPackage.eINSTANCE;
    }

} // ScalablePCMGroupMeasuringPointFactoryImpl
