/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage
 * @generated
 */
public class ScalablePCMGroupMeasuringPointAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static ScalablePCMGroupMeasuringPointPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ScalablePCMGroupMeasuringPointAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ScalablePCMGroupMeasuringPointPackage.eINSTANCE;
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
    protected ScalablePCMGroupMeasuringPointSwitch<Adapter> modelSwitch = new ScalablePCMGroupMeasuringPointSwitch<>() {
        @Override
        public Adapter caseInfrastructureGroupMeasuringPoint(final InfrastructureGroupMeasuringPoint object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this.createInfrastructureGroupMeasuringPointAdapter();
        }

        @Override
        public Adapter caseServiceGroupMeasuringPoint(final ServiceGroupMeasuringPoint object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this.createServiceGroupMeasuringPointAdapter();
        }

        @Override
        public Adapter caseCompetingConsumerGroupMeasuringPoint(final CompetingConsumerGroupMeasuringPoint object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this
                .createCompetingConsumerGroupMeasuringPointAdapter();
        }

        @Override
        public Adapter caseServiceGroupReference(final ServiceGroupReference object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this.createServiceGroupReferenceAdapter();
        }

        @Override
        public Adapter caseInfrastructureGroupReference(final InfrastructureGroupReference object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this.createInfrastructureGroupReferenceAdapter();
        }

        @Override
        public Adapter caseCompetingConsumerGroupReference(final CompetingConsumerGroupReference object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this.createCompetingConsumerGroupReferenceAdapter();
        }

        @Override
        public Adapter caseMeasuringPoint(final MeasuringPoint object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this.createMeasuringPointAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return ScalablePCMGroupMeasuringPointAdapterFactory.this.createEObjectAdapter();
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
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint
     * <em>Infrastructure Group Measuring Point</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint
     * @generated
     */
    public Adapter createInfrastructureGroupMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint
     * <em>Service Group Measuring Point</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint
     * @generated
     */
    public Adapter createServiceGroupMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint
     * <em>Competing Consumer Group Measuring Point</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint
     * @generated
     */
    public Adapter createCompetingConsumerGroupMeasuringPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference
     * <em>Service Group Reference</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference
     * @generated
     */
    public Adapter createServiceGroupReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference
     * <em>Infrastructure Group Reference</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference
     * @generated
     */
    public Adapter createInfrastructureGroupReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference
     * <em>Competing Consumer Group Reference</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference
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

} // ScalablePCMGroupMeasuringPointAdapterFactory
