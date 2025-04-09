/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.elasticity.ElasticityFactory;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.elasticity.ElasticitySpec;
import org.palladiosimulator.elasticity.ModelBasedScalingPolicy;
import org.palladiosimulator.elasticity.TriggerBasedScalingPolicy;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class ElasticityFactoryImpl extends EFactoryImpl implements ElasticityFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static ElasticityFactory init() {
        try {
            final ElasticityFactory theElasticityFactory = (ElasticityFactory) EPackage.Registry.INSTANCE
                .getEFactory(ElasticityPackage.eNS_URI);
            if (theElasticityFactory != null) {
                return theElasticityFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ElasticityFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ElasticityFactoryImpl() {
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
        case ElasticityPackage.TRIGGER_BASED_SCALING_POLICY:
            return this.createTriggerBasedScalingPolicy();
        case ElasticityPackage.ELASTICITY_SPEC:
            return this.createElasticitySpec();
        case ElasticityPackage.MODEL_BASED_SCALING_POLICY:
            return this.createModelBasedScalingPolicy();
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
    public TriggerBasedScalingPolicy createTriggerBasedScalingPolicy() {
        final TriggerBasedScalingPolicyImpl triggerBasedScalingPolicy = new TriggerBasedScalingPolicyImpl();
        return triggerBasedScalingPolicy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ElasticitySpec createElasticitySpec() {
        final ElasticitySpecImpl elasticitySpec = new ElasticitySpecImpl();
        return elasticitySpec;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ModelBasedScalingPolicy createModelBasedScalingPolicy() {
        final ModelBasedScalingPolicyImpl modelBasedScalingPolicy = new ModelBasedScalingPolicyImpl();
        return modelBasedScalingPolicy;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ElasticityPackage getElasticityPackage() {
        return (ElasticityPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ElasticityPackage getPackage() {
        return ElasticityPackage.eINSTANCE;
    }

} // ElasticityFactoryImpl
