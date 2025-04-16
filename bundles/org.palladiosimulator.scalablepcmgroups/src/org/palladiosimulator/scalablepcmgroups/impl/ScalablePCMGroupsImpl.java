/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.elasticity.ScalingPolicy;
import org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups;
import org.palladiosimulator.scalablepcmgroups.TargetGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalable PCM Groups</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.ScalablePCMGroupsImpl#getEnactedPolicy <em>Enacted Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.ScalablePCMGroupsImpl#getTargetCfgs <em>Target Cfgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalablePCMGroupsImpl extends MinimalEObjectImpl.Container implements ScalablePCMGroups {
    /**
     * The cached value of the '{@link #getEnactedPolicy() <em>Enacted Policy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnactedPolicy()
     * @generated
     * @ordered
     */
    protected ScalingPolicy enactedPolicy;

    /**
     * The cached value of the '{@link #getTargetCfgs() <em>Target Cfgs</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetCfgs()
     * @generated
     * @ordered
     */
    protected EList<TargetGroup> targetCfgs;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ScalablePCMGroupsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return scalablepcmgroupsPackage.Literals.SCALABLE_PCM_GROUPS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ScalingPolicy getEnactedPolicy() {
        if (enactedPolicy != null && enactedPolicy.eIsProxy()) {
            InternalEObject oldEnactedPolicy = (InternalEObject)enactedPolicy;
            enactedPolicy = (ScalingPolicy)eResolveProxy(oldEnactedPolicy);
            if (enactedPolicy != oldEnactedPolicy) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__ENACTED_POLICY, oldEnactedPolicy, enactedPolicy));
            }
        }
        return enactedPolicy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScalingPolicy basicGetEnactedPolicy() {
        return enactedPolicy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnactedPolicy(ScalingPolicy newEnactedPolicy) {
        ScalingPolicy oldEnactedPolicy = enactedPolicy;
        enactedPolicy = newEnactedPolicy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__ENACTED_POLICY, oldEnactedPolicy, enactedPolicy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<TargetGroup> getTargetCfgs() {
        if (targetCfgs == null) {
            targetCfgs = new EObjectContainmentEList<TargetGroup>(TargetGroup.class, this, scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__TARGET_CFGS);
        }
        return targetCfgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__TARGET_CFGS:
                return ((InternalEList<?>)getTargetCfgs()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__ENACTED_POLICY:
                if (resolve) return getEnactedPolicy();
                return basicGetEnactedPolicy();
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__TARGET_CFGS:
                return getTargetCfgs();
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
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__ENACTED_POLICY:
                setEnactedPolicy((ScalingPolicy)newValue);
                return;
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__TARGET_CFGS:
                getTargetCfgs().clear();
                getTargetCfgs().addAll((Collection<? extends TargetGroup>)newValue);
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
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__ENACTED_POLICY:
                setEnactedPolicy((ScalingPolicy)null);
                return;
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__TARGET_CFGS:
                getTargetCfgs().clear();
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
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__ENACTED_POLICY:
                return enactedPolicy != null;
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS__TARGET_CFGS:
                return targetCfgs != null && !targetCfgs.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ScalablePCMGroupsImpl
