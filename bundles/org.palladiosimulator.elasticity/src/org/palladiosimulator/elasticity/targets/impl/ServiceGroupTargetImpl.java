/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.elasticity.targets.ServiceGroupTarget;
import org.palladiosimulator.elasticity.targets.TargetsPackage;
import org.palladiosimulator.scalablepcmgroups.ServiceGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service Group
 * Target</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.targets.impl.ServiceGroupTargetImpl#getServiceGroup
 * <em>Service Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceGroupTargetImpl extends TargetGroupImpl implements ServiceGroupTarget {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ServiceGroupTargetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetsPackage.Literals.SERVICE_GROUP_TARGET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceGroup getServiceGroup() {
        return (ServiceGroup) this.eDynamicGet(TargetsPackage.SERVICE_GROUP_TARGET__SERVICE_GROUP,
                TargetsPackage.Literals.SERVICE_GROUP_TARGET__SERVICE_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceGroup basicGetServiceGroup() {
        return (ServiceGroup) this.eDynamicGet(TargetsPackage.SERVICE_GROUP_TARGET__SERVICE_GROUP,
                TargetsPackage.Literals.SERVICE_GROUP_TARGET__SERVICE_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceGroup(final ServiceGroup newServiceGroup) {
        this.eDynamicSet(TargetsPackage.SERVICE_GROUP_TARGET__SERVICE_GROUP,
                TargetsPackage.Literals.SERVICE_GROUP_TARGET__SERVICE_GROUP, newServiceGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case TargetsPackage.SERVICE_GROUP_TARGET__SERVICE_GROUP:
            if (resolve) {
                return this.getServiceGroup();
            }
            return this.basicGetServiceGroup();
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
        case TargetsPackage.SERVICE_GROUP_TARGET__SERVICE_GROUP:
            this.setServiceGroup((ServiceGroup) newValue);
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
        case TargetsPackage.SERVICE_GROUP_TARGET__SERVICE_GROUP:
            this.setServiceGroup((ServiceGroup) null);
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
        case TargetsPackage.SERVICE_GROUP_TARGET__SERVICE_GROUP:
            return this.basicGetServiceGroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // ServiceGroupTargetImpl
