/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.elasticity.ScalingPolicy;

import org.palladiosimulator.scalablepcmgroups.TargetGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.TargetGroupImpl#getEnactedPolicies <em>Enacted Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TargetGroupImpl extends MinimalEObjectImpl.Container implements TargetGroup {
    /**
     * The cached value of the '{@link #getEnactedPolicies() <em>Enacted Policies</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnactedPolicies()
     * @generated
     * @ordered
     */
    protected EList<ScalingPolicy> enactedPolicies;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TargetGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return scalablepcmgroupsPackage.Literals.TARGET_GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ScalingPolicy> getEnactedPolicies() {
        if (enactedPolicies == null) {
            enactedPolicies = new EObjectResolvingEList<ScalingPolicy>(ScalingPolicy.class, this, scalablepcmgroupsPackage.TARGET_GROUP__ENACTED_POLICIES);
        }
        return enactedPolicies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case scalablepcmgroupsPackage.TARGET_GROUP__ENACTED_POLICIES:
                return getEnactedPolicies();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case scalablepcmgroupsPackage.TARGET_GROUP__ENACTED_POLICIES:
                getEnactedPolicies().clear();
                getEnactedPolicies().addAll((Collection<? extends ScalingPolicy>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case scalablepcmgroupsPackage.TARGET_GROUP__ENACTED_POLICIES:
                getEnactedPolicies().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case scalablepcmgroupsPackage.TARGET_GROUP__ENACTED_POLICIES:
                return enactedPolicies != null && !enactedPolicies.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TargetGroupImpl
