/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Infrastructure Group
 * Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupReferenceImpl#getInfrastructureGroup
 * <em>Infrastructure Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InfrastructureGroupReferenceImpl extends MinimalEObjectImpl.Container
        implements InfrastructureGroupReference {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InfrastructureGroupReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_REFERENCE;
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
    public InfrastructureGroup getInfrastructureGroup() {
        return (InfrastructureGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public InfrastructureGroup basicGetInfrastructureGroup() {
        return (InfrastructureGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInfrastructureGroup(final InfrastructureGroup newInfrastructureGroup) {
        this.eDynamicSet(ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP,
                newInfrastructureGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP:
            return this.basicGetInfrastructureGroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // InfrastructureGroupReferenceImpl
