/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.elasticity.targets.TargetsPackage
 * @generated
 */
public interface TargetsFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    TargetsFactory eINSTANCE = org.palladiosimulator.elasticity.targets.impl.TargetsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Infrastructure Group Target</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Infrastructure Group Target</em>'.
     * @generated
     */
    InfrastructureGroupTarget createInfrastructureGroupTarget();

    /**
     * Returns a new object of class '<em>Service Group Target</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Service Group Target</em>'.
     * @generated
     */
    ServiceGroupTarget createServiceGroupTarget();

    /**
     * Returns a new object of class '<em>Competing Consumers Group Target</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Competing Consumers Group Target</em>'.
     * @generated
     */
    CompetingConsumersGroupTarget createCompetingConsumersGroupTarget();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    TargetsPackage getTargetsPackage();

} // TargetsFactory
