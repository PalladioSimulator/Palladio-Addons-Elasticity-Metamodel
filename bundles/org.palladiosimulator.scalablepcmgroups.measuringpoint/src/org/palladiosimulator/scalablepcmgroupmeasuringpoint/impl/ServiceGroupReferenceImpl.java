/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service Group
 * Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupReferenceImpl#getServiceGroup
 * <em>Service Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceGroupReferenceImpl extends MinimalEObjectImpl.Container implements ServiceGroupReference {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ServiceGroupReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScalablePCMGroupMeasuringPointPackage.Literals.SERVICE_GROUP_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.palladiosimulator.scalablepcmgroups.ServiceGroup getServiceGroup() {
        return (org.palladiosimulator.scalablepcmgroups.ServiceGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public org.palladiosimulator.scalablepcmgroups.ServiceGroup basicGetServiceGroup() {
        return (org.palladiosimulator.scalablepcmgroups.ServiceGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceGroup(final org.palladiosimulator.scalablepcmgroups.ServiceGroup newServiceGroup) {
        this.eDynamicSet(ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, newServiceGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
            this.setServiceGroup((org.palladiosimulator.scalablepcmgroups.ServiceGroup) newValue);
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
            this.setServiceGroup((org.palladiosimulator.scalablepcmgroups.ServiceGroup) null);
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
            return this.basicGetServiceGroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // ServiceGroupReferenceImpl
