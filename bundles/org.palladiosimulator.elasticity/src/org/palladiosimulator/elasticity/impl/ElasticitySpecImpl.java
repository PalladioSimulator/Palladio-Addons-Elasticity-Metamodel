/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.elasticity.ElasticitySpec;
import org.palladiosimulator.elasticity.ScalingPolicy;
import org.palladiosimulator.elasticity.targets.TargetGroup;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Spec</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.impl.ElasticitySpecImpl#getScalingPolicies
 * <em>Scaling Policies</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.impl.ElasticitySpecImpl#getTargetGroups <em>Target
 * Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElasticitySpecImpl extends EntityImpl implements ElasticitySpec {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ElasticitySpecImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ElasticityPackage.Literals.ELASTICITY_SPEC;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<ScalingPolicy> getScalingPolicies() {
        return (EList<ScalingPolicy>) this.eDynamicGet(ElasticityPackage.ELASTICITY_SPEC__SCALING_POLICIES,
                ElasticityPackage.Literals.ELASTICITY_SPEC__SCALING_POLICIES, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<TargetGroup> getTargetGroups() {
        return (EList<TargetGroup>) this.eDynamicGet(ElasticityPackage.ELASTICITY_SPEC__TARGET_GROUPS,
                ElasticityPackage.Literals.ELASTICITY_SPEC__TARGET_GROUPS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ElasticityPackage.ELASTICITY_SPEC__SCALING_POLICIES:
            return ((InternalEList<?>) this.getScalingPolicies()).basicRemove(otherEnd, msgs);
        case ElasticityPackage.ELASTICITY_SPEC__TARGET_GROUPS:
            return ((InternalEList<?>) this.getTargetGroups()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ElasticityPackage.ELASTICITY_SPEC__SCALING_POLICIES:
            return this.getScalingPolicies();
        case ElasticityPackage.ELASTICITY_SPEC__TARGET_GROUPS:
            return this.getTargetGroups();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ElasticityPackage.ELASTICITY_SPEC__SCALING_POLICIES:
            this.getScalingPolicies()
                .clear();
            this.getScalingPolicies()
                .addAll((Collection<? extends ScalingPolicy>) newValue);
            return;
        case ElasticityPackage.ELASTICITY_SPEC__TARGET_GROUPS:
            this.getTargetGroups()
                .clear();
            this.getTargetGroups()
                .addAll((Collection<? extends TargetGroup>) newValue);
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
        case ElasticityPackage.ELASTICITY_SPEC__SCALING_POLICIES:
            this.getScalingPolicies()
                .clear();
            return;
        case ElasticityPackage.ELASTICITY_SPEC__TARGET_GROUPS:
            this.getTargetGroups()
                .clear();
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
        case ElasticityPackage.ELASTICITY_SPEC__SCALING_POLICIES:
            return !this.getScalingPolicies()
                .isEmpty();
        case ElasticityPackage.ELASTICITY_SPEC__TARGET_GROUPS:
            return !this.getTargetGroups()
                .isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ElasticitySpecImpl
