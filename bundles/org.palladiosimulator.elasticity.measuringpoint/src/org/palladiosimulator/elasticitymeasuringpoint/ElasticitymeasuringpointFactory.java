/**
 */
package org.palladiosimulator.elasticitymeasuringpoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticitymeasuringpointPackage
 * @generated
 */
public interface ElasticitymeasuringpointFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ElasticitymeasuringpointFactory eINSTANCE = org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticitymeasuringpointFactoryImpl
        .init();

    /**
     * Returns a new object of class '<em>Elastic Infrastructure Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Elastic Infrastructure Measuring Point</em>'.
     * @generated
     */
    ElasticInfrastructureMeasuringPoint createElasticInfrastructureMeasuringPoint();

    /**
     * Returns a new object of class '<em>Service Group Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Group Measuring Point</em>'.
     * @generated
     */
    ServiceGroupMeasuringPoint createServiceGroupMeasuringPoint();

    /**
     * Returns a new object of class '<em>Competing Consumer Group Measuring Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Competing Consumer Group Measuring Point</em>'.
     * @generated
     */
    CompetingConsumerGroupMeasuringPoint createCompetingConsumerGroupMeasuringPoint();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ElasticitymeasuringpointPackage getElasticitymeasuringpointPackage();

} //ElasticitymeasuringpointFactory
