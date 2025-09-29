/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Infrastructure Group
 * Target</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupTargetImpl#getInfrastructureGroup
 * <em>Infrastructure Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureGroupTargetImpl extends TargetGroupImpl implements InfrastructureGroupTarget {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InfrastructureGroupTargetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetsPackage.Literals.INFRASTRUCTURE_GROUP_TARGET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InfrastructureGroup getInfrastructureGroup() {
        return (InfrastructureGroup) this.eDynamicGet(TargetsPackage.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public InfrastructureGroup basicGetInfrastructureGroup() {
        return (InfrastructureGroup) this.eDynamicGet(TargetsPackage.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInfrastructureGroup(final InfrastructureGroup newInfrastructureGroup) {
        this.eDynamicSet(TargetsPackage.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP, newInfrastructureGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TargetsPackage.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP:
            if (resolve) {
                return this.getInfrastructureGroup();
            }
            return this.basicGetInfrastructureGroup();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case TargetsPackage.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP:
            this.setInfrastructureGroup((InfrastructureGroup) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case TargetsPackage.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP:
            this.setInfrastructureGroup((InfrastructureGroup) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case TargetsPackage.INFRASTRUCTURE_GROUP_TARGET__INFRASTRUCTURE_GROUP:
            return this.basicGetInfrastructureGroup() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public ResourceEnvironment basicGetPCM_ResourceEnvironment() {
        // TODO: implement this method to return the 'PCM Resource Environment' reference
        // -> do not perform proxy resolution
        // Ensure that you remove @generated or mark it @generated NOT
        return this.getInfrastructureGroup()
            .getUnit()
            .getResourceEnvironment_ResourceContainer();
        // throw new UnsupportedOperationException();
    }
} // InfrastructureGroupTargetImpl
