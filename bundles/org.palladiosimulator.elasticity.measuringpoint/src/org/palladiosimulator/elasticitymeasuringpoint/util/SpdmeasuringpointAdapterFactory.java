/**
 */
package org.palladiosimulator.elasticitymeasuringpoint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.elasticitymeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.elasticitymeasuringpoint.SpdmeasuringpointPackage
 * @generated
 */
public class SpdmeasuringpointAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static SpdmeasuringpointPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdmeasuringpointAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SpdmeasuringpointPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected SpdmeasuringpointSwitch<Adapter> modelSwitch = new SpdmeasuringpointSwitch<>() {
        @Override
        public Adapter caseElasticInfrastructureMeasuringPoint(final ElasticInfrastructureMeasuringPoint object) {
            return SpdmeasuringpointAdapterFactory.this.createElasticInfrastructureMeasuringPointAdapter();
        }

        @Override
        public Adapter caseServiceGroupMeasuringPoint(final ServiceGroupMeasuringPoint object) {
            return SpdmeasuringpointAdapterFactory.this.createServiceGroupMeasuringPointAdapter();
        }

        @Override
        public Adapter caseCompetingConsumerGroupMeasuringPoint(final CompetingConsumerGroupMeasuringPoint object) {
            return SpdmeasuringpointAdapterFactory.this.createCompetingConsumerGroupMeasuringPointAdapter();
        }

        @Override
        public Adapter caseServiceGroupReference(final ServiceGroupReference object) {
            return SpdmeasuringpointAdapterFactory.this.createServiceGroupReferenceAdapter();
        }

        @Override
        public Adapter caseElasticInfrastructureReference(final ElasticInfrastructureReference object) {
            return SpdmeasuringpointAdapterFactory.this.createElasticInfrastructureReferenceAdapter();
        }

        @Override
        public Adapter caseCompetingConsumerGroupReference(final CompetingConsumerGroupReference object) {
            return SpdmeasuringpointAdapterFactory.this.createCompetingConsumerGroupReferenceAdapter();
        }

        @Override
        public Adapter caseMeasuringPoint(final MeasuringPoint object) {
            return SpdmeasuringpointAdapterFactory.this.createMeasuringPointAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return SpdmeasuringpointAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureMeasuringPoint
     * <em>Elastic Infrastructure Measuring Point</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureMeasuringPoint
     * @generated
     */
    public Adapter createElasticInfrastructureMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint <em>Service Group
     * Measuring Point</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint
     * @generated
     */
    public Adapter createServiceGroupMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupMeasuringPoint
     * <em>Competing Consumer Group Measuring Point</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupMeasuringPoint
     * @generated
     */
    public Adapter createCompetingConsumerGroupMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference <em>Service Group
     * Reference</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference
     * @generated
     */
    public Adapter createServiceGroupReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference <em>Elastic
     * Infrastructure Reference</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference
     * @generated
     */
    public Adapter createElasticInfrastructureReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference <em>Competing
     * Consumer Group Reference</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.elasticitymeasuringpoint.CompetingConsumerGroupReference
     * @generated
     */
    public Adapter createCompetingConsumerGroupReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint <em>Measuring
     * Point</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
     * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases
     * anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint
     * @generated
     */
    public Adapter createMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // SpdmeasuringpointAdapterFactory
