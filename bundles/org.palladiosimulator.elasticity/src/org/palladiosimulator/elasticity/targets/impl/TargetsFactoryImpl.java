/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget;
import org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget;
import org.palladiosimulator.elasticity.targets.ServiceGroupTarget;
import org.palladiosimulator.elasticity.targets.TargetsFactory;
import org.palladiosimulator.elasticity.targets.TargetsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class TargetsFactoryImpl extends EFactoryImpl implements TargetsFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static TargetsFactory init() {
        try {
            final TargetsFactory theTargetsFactory = (TargetsFactory) EPackage.Registry.INSTANCE
                .getEFactory(TargetsPackage.eNS_URI);
            if (theTargetsFactory != null) {
                return theTargetsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TargetsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public TargetsFactoryImpl() {
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
        case TargetsPackage.INFRASTRUCTURE_GROUP_TARGET:
            return this.createInfrastructureGroupTarget();
        case TargetsPackage.SERVICE_GROUP_TARGET:
            return this.createServiceGroupTarget();
        case TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET:
            return this.createCompetingConsumersGroupTarget();
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
    public InfrastructureGroupTarget createInfrastructureGroupTarget() {
        final InfrastructureGroupTargetImpl infrastructureGroupTarget = new InfrastructureGroupTargetImpl();
        return infrastructureGroupTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceGroupTarget createServiceGroupTarget() {
        final ServiceGroupTargetImpl serviceGroupTarget = new ServiceGroupTargetImpl();
        return serviceGroupTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CompetingConsumersGroupTarget createCompetingConsumersGroupTarget() {
        final CompetingConsumersGroupTargetImpl competingConsumersGroupTarget = new CompetingConsumersGroupTargetImpl();
        return competingConsumersGroupTarget;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TargetsPackage getTargetsPackage() {
        return (TargetsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TargetsPackage getPackage() {
        return TargetsPackage.eINSTANCE;
    }

} // TargetsFactoryImpl
