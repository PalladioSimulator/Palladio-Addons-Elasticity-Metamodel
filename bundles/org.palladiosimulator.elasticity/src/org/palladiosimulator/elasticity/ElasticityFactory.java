/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.elasticity.ElasticityPackage
 * @generated
 */
public interface ElasticityFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    ElasticityFactory eINSTANCE = org.palladiosimulator.elasticity.impl.ElasticityFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Trigger Based Scaling Policy</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Trigger Based Scaling Policy</em>'.
     * @generated
     */
    TriggerBasedScalingPolicy createTriggerBasedScalingPolicy();

    /**
     * Returns a new object of class '<em>Spec</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Spec</em>'.
     * @generated
     */
    ElasticitySpec createElasticitySpec();

    /**
     * Returns a new object of class '<em>Model Based Scaling Policy</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Model Based Scaling Policy</em>'.
     * @generated
     */
    ModelBasedScalingPolicy createModelBasedScalingPolicy();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    ElasticityPackage getElasticityPackage();

} // ElasticityFactory
