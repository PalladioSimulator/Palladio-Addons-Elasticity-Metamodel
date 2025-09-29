/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage
 * @generated
 */
public interface ScalablePCMGroupMeasuringPointFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ScalablePCMGroupMeasuringPointFactory eINSTANCE = org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ScalablePCMGroupMeasuringPointFactoryImpl
        .init();

    /**
     * Returns a new object of class '<em>Infrastructure Group Measuring Point</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Infrastructure Group Measuring Point</em>'.
     * @generated
     */
    InfrastructureGroupMeasuringPoint createInfrastructureGroupMeasuringPoint();

    /**
     * Returns a new object of class '<em>Service Group Measuring Point</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Service Group Measuring Point</em>'.
     * @generated
     */
    ServiceGroupMeasuringPoint createServiceGroupMeasuringPoint();

    /**
     * Returns a new object of class '<em>Competing Consumer Group Measuring Point</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Competing Consumer Group Measuring Point</em>'.
     * @generated
     */
    CompetingConsumerGroupMeasuringPoint createCompetingConsumerGroupMeasuringPoint();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    ScalablePCMGroupMeasuringPointPackage getScalablePCMGroupMeasuringPointPackage();

} // ScalablePCMGroupMeasuringPointFactory
