/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;
import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Infrastructure Group
 * Measuring Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupMeasuringPointImpl#getInfrastructureGroup
 * <em>Infrastructure Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfrastructureGroupMeasuringPointImpl extends MeasuringPointImpl
        implements InfrastructureGroupMeasuringPoint {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InfrastructureGroupMeasuringPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InfrastructureGroup getInfrastructureGroup() {
        return (InfrastructureGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP,
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
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP,
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
        this.eDynamicSet(
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP,
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP:
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP:
            return this.basicGetInfrastructureGroup() != null;
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
        if (baseClass == InfrastructureGroupReference.class) {
            switch (derivedFeatureID) {
            case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP:
                return ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP;
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
        if (baseClass == InfrastructureGroupReference.class) {
            switch (baseFeatureID) {
            case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__INFRASTRUCTURE_GROUP:
                return ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__INFRASTRUCTURE_GROUP;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getStringRepresentation() {
        if (this.getInfrastructureGroup() == null) {
            return "";
        }

        if (this.getInfrastructureGroup()
            .getEntityName() == null) {
            return super.getStringRepresentation();
        }

        EcoreUtil.resolveAll(this);

        final StringBuilder result = new StringBuilder();

        result.append("Elastic Infrastructure ");
        result.append(this.getInfrastructureGroup()
            .getEntityName());
        result.append(" [");
        result.append(this.getInfrastructureGroup()
            .getId());
        result.append("]");

        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated NOT
     */
    @Override
    public String getResourceURIRepresentation() {
        if (this.getInfrastructureGroup() == null) {
            return "";
        }
        EcoreUtil.resolveAll(this);
        return EMFLoadHelper.getResourceURI(this.getInfrastructureGroup());
    }

} // InfrastructureGroupMeasuringPointImpl
