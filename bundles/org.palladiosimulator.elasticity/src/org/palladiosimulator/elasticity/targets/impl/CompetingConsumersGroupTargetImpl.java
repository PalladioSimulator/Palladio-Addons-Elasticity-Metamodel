/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.elasticity.targets.CompetingConsumersGroupTarget;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Competing Consumers Group
 * Target</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.targets.impl.CompetingConsumersGroupTargetImpl#getCompetingConsumersGroup
 * <em>Competing Consumers Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetingConsumersGroupTargetImpl extends TargetGroupImpl implements CompetingConsumersGroupTarget {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CompetingConsumersGroupTargetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP_TARGET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CompetingConsumersGroup getCompetingConsumersGroup() {
        return (CompetingConsumersGroup) this.eDynamicGet(
                TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP,
                TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CompetingConsumersGroup basicGetCompetingConsumersGroup() {
        return (CompetingConsumersGroup) this.eDynamicGet(
                TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP,
                TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCompetingConsumersGroup(final CompetingConsumersGroup newCompetingConsumersGroup) {
        this.eDynamicSet(TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP,
                TargetsPackage.Literals.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP,
                newCompetingConsumersGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP:
            if (resolve) {
                return this.getCompetingConsumersGroup();
            }
            return this.basicGetCompetingConsumersGroup();
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
        case TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP:
            this.setCompetingConsumersGroup((CompetingConsumersGroup) newValue);
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
        case TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP:
            this.setCompetingConsumersGroup((CompetingConsumersGroup) null);
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
        case TargetsPackage.COMPETING_CONSUMERS_GROUP_TARGET__COMPETING_CONSUMERS_GROUP:
            return this.basicGetCompetingConsumersGroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // CompetingConsumersGroupTargetImpl
