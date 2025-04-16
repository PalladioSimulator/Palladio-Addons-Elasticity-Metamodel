/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service Group Measuring
 * Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.ServiceGroupMeasuringPointImpl#getServiceGroup
 * <em>Service Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceGroupMeasuringPointImpl extends MeasuringPointImpl implements ServiceGroupMeasuringPoint {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ServiceGroupMeasuringPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScalablePCMGroupMeasuringPointPackage.Literals.SERVICE_GROUP_MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.palladiosimulator.scalablepcmgroups.ServiceGroup getServiceGroup() {
        return (org.palladiosimulator.scalablepcmgroups.ServiceGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public org.palladiosimulator.scalablepcmgroups.ServiceGroup basicGetServiceGroup() {
        return (org.palladiosimulator.scalablepcmgroups.ServiceGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceGroup(final org.palladiosimulator.scalablepcmgroups.ServiceGroup newServiceGroup) {
        this.eDynamicSet(ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP,
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
            return this.basicGetServiceGroup() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
        if (baseClass == ServiceGroupReference.class) {
            switch (derivedFeatureID) {
            case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
                return ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
        if (baseClass == ServiceGroupReference.class) {
            switch (baseFeatureID) {
            case ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
                return ScalablePCMGroupMeasuringPointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // ServiceGroupMeasuringPointImpl
