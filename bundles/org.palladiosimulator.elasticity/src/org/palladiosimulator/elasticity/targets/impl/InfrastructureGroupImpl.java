/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.elasticity.targets.InfrastructureGroup;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Infrastructure
 * Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupImpl#getPCM_ResourceEnvironment
 * <em>PCM Resource Environment</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupImpl#getUnit
 * <em>Unit</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.targets.impl.InfrastructureGroupImpl#getInfrastructureGroup
 * <em>Infrastructure Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureGroupImpl extends TargetGroupImpl implements InfrastructureGroup {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InfrastructureGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetsPackage.Literals.INFRASTRUCTURE_GROUP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceEnvironment getPCM_ResourceEnvironment() {
        final ResourceEnvironment pcM_ResourceEnvironment = this.basicGetPCM_ResourceEnvironment();
        return pcM_ResourceEnvironment != null && pcM_ResourceEnvironment.eIsProxy()
                ? (ResourceEnvironment) this.eResolveProxy((InternalEObject) pcM_ResourceEnvironment)
                : pcM_ResourceEnvironment;
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
        return this.getUnit()
            .getResourceEnvironment_ResourceContainer();
        // throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public boolean isSetPCM_ResourceEnvironment() {
        // TODO: implement this method to return whether the 'PCM Resource Environment' reference is
        // set
        // Ensure that you remove @generated or mark it @generated NOT
        return this.basicGetUnit()
            .getResourceEnvironment_ResourceContainer() != null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceContainer getUnit() {
        return (ResourceContainer) this.eDynamicGet(TargetsPackage.INFRASTRUCTURE_GROUP__UNIT,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP__UNIT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ResourceContainer basicGetUnit() {
        return (ResourceContainer) this.eDynamicGet(TargetsPackage.INFRASTRUCTURE_GROUP__UNIT,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP__UNIT, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUnit(final ResourceContainer newUnit) {
        this.eDynamicSet(TargetsPackage.INFRASTRUCTURE_GROUP__UNIT, TargetsPackage.Literals.INFRASTRUCTURE_GROUP__UNIT,
                newUnit);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.palladiosimulator.scalablepcmgroups.InfrastructureGroup getInfrastructureGroup() {
        return (org.palladiosimulator.scalablepcmgroups.InfrastructureGroup) this.eDynamicGet(
                TargetsPackage.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public org.palladiosimulator.scalablepcmgroups.InfrastructureGroup basicGetInfrastructureGroup() {
        return (org.palladiosimulator.scalablepcmgroups.InfrastructureGroup) this.eDynamicGet(
                TargetsPackage.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInfrastructureGroup(
            final org.palladiosimulator.scalablepcmgroups.InfrastructureGroup newInfrastructureGroup) {
        this.eDynamicSet(TargetsPackage.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP,
                TargetsPackage.Literals.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP, newInfrastructureGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TargetsPackage.INFRASTRUCTURE_GROUP__PCM_RESOURCE_ENVIRONMENT:
            if (resolve) {
                return this.getPCM_ResourceEnvironment();
            }
            return this.basicGetPCM_ResourceEnvironment();
        case TargetsPackage.INFRASTRUCTURE_GROUP__UNIT:
            if (resolve) {
                return this.getUnit();
            }
            return this.basicGetUnit();
        case TargetsPackage.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP:
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
        case TargetsPackage.INFRASTRUCTURE_GROUP__UNIT:
            this.setUnit((ResourceContainer) newValue);
            return;
        case TargetsPackage.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP:
            this.setInfrastructureGroup((org.palladiosimulator.scalablepcmgroups.InfrastructureGroup) newValue);
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
        case TargetsPackage.INFRASTRUCTURE_GROUP__UNIT:
            this.setUnit((ResourceContainer) null);
            return;
        case TargetsPackage.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP:
            this.setInfrastructureGroup((org.palladiosimulator.scalablepcmgroups.InfrastructureGroup) null);
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
        case TargetsPackage.INFRASTRUCTURE_GROUP__PCM_RESOURCE_ENVIRONMENT:
            return this.isSetPCM_ResourceEnvironment();
        case TargetsPackage.INFRASTRUCTURE_GROUP__UNIT:
            return this.basicGetUnit() != null;
        case TargetsPackage.INFRASTRUCTURE_GROUP__INFRASTRUCTURE_GROUP:
            return this.basicGetInfrastructureGroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // InfrastructureGroupImpl
