/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Competing Consumer Group
 * Measuring Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl#getCompetingConsumerGroup
 * <em>Competing Consumer Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetingConsumerGroupMeasuringPointImpl extends MeasuringPointImpl
        implements CompetingConsumerGroupMeasuringPoint {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CompetingConsumerGroupMeasuringPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScalablePCMGroupMeasuringPointPackage.Literals.COMPETING_CONSUMER_GROUP_MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup getCompetingConsumerGroup() {
        return (org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup basicGetCompetingConsumerGroup() {
        return (org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCompetingConsumerGroup(
            final org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup newCompetingConsumerGroup) {
        this.eDynamicSet(
                ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP,
                ScalablePCMGroupMeasuringPointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
                newCompetingConsumerGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
            if (resolve) {
                return this.getCompetingConsumerGroup();
            }
            return this.basicGetCompetingConsumerGroup();
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
        case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
            this.setCompetingConsumerGroup((org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup) newValue);
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
        case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
            this.setCompetingConsumerGroup((org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup) null);
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
        case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
            return this.basicGetCompetingConsumerGroup() != null;
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
        if (baseClass == CompetingConsumerGroupReference.class) {
            switch (derivedFeatureID) {
            case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
                return ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP;
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
        if (baseClass == CompetingConsumerGroupReference.class) {
            switch (baseFeatureID) {
            case ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP:
                return ScalablePCMGroupMeasuringPointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP;
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
    public String getResourceURIRepresentation() {
        if (this.getCompetingConsumerGroup() == null) {
            return "";
        }
        EcoreUtil.resolveAll(this);
        return EMFLoadHelper.getResourceURI(this.getCompetingConsumerGroup());
    }

} // CompetingConsumerGroupMeasuringPointImpl
