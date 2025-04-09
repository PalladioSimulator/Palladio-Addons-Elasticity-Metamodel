/**
 */
package org.palladiosimulator.spdmeasuringpoint.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage
 * @generated
 */
public class SpdmeasuringpointAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpdmeasuringpointPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpdmeasuringpointAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpdmeasuringpointPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpdmeasuringpointSwitch<Adapter> modelSwitch = new SpdmeasuringpointSwitch<>() {
		@Override
		public Adapter caseElasticInfrastructureMeasuringPoint(ElasticInfrastructureMeasuringPoint object) {
			return createElasticInfrastructureMeasuringPointAdapter();
		}

		@Override
		public Adapter caseServiceGroupMeasuringPoint(ServiceGroupMeasuringPoint object) {
			return createServiceGroupMeasuringPointAdapter();
		}

		@Override
		public Adapter caseCompetingConsumerGroupMeasuringPoint(CompetingConsumerGroupMeasuringPoint object) {
			return createCompetingConsumerGroupMeasuringPointAdapter();
		}

		@Override
		public Adapter caseServiceGroupReference(ServiceGroupReference object) {
			return createServiceGroupReferenceAdapter();
		}

		@Override
		public Adapter caseElasticInfrastructureReference(ElasticInfrastructureReference object) {
			return createElasticInfrastructureReferenceAdapter();
		}

		@Override
		public Adapter caseCompetingConsumerGroupReference(CompetingConsumerGroupReference object) {
			return createCompetingConsumerGroupReferenceAdapter();
		}

		@Override
		public Adapter caseMeasuringPoint(MeasuringPoint object) {
			return createMeasuringPointAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint <em>Elastic Infrastructure Measuring Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint
	 * @generated
	 */
	public Adapter createElasticInfrastructureMeasuringPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint <em>Service Group Measuring Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint
	 * @generated
	 */
	public Adapter createServiceGroupMeasuringPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint <em>Competing Consumer Group Measuring Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint
	 * @generated
	 */
	public Adapter createCompetingConsumerGroupMeasuringPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.spdmeasuringpoint.ServiceGroupReference <em>Service Group Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.spdmeasuringpoint.ServiceGroupReference
	 * @generated
	 */
	public Adapter createServiceGroupReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureReference <em>Elastic Infrastructure Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureReference
	 * @generated
	 */
	public Adapter createElasticInfrastructureReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference <em>Competing Consumer Group Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference
	 * @generated
	 */
	public Adapter createCompetingConsumerGroupReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint <em>Measuring Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint
	 * @generated
	 */
	public Adapter createMeasuringPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpdmeasuringpointAdapterFactory
