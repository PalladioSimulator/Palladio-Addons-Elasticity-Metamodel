/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.elasticity.targets.ElasticInfrastructure;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupMeasuringPoint;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference;
import org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Infrastructure Group
 * Measuring Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.impl.InfrastructureGroupMeasuringPointImpl#getElasticInfrastructure
 * <em>Elastic Infrastructure</em>}</li>
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
    public ElasticInfrastructure getElasticInfrastructure() {
        return (ElasticInfrastructure) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE,
                ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_REFERENCE__ELASTIC_INFRASTRUCTURE,
                true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ElasticInfrastructure basicGetElasticInfrastructure() {
        return (ElasticInfrastructure) this.eDynamicGet(
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE,
                ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_REFERENCE__ELASTIC_INFRASTRUCTURE,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setElasticInfrastructure(final ElasticInfrastructure newElasticInfrastructure) {
        this.eDynamicSet(
                ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE,
                ScalablePCMGroupMeasuringPointPackage.Literals.INFRASTRUCTURE_GROUP_REFERENCE__ELASTIC_INFRASTRUCTURE,
                newElasticInfrastructure);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
            if (resolve) {
                return this.getElasticInfrastructure();
            }
            return this.basicGetElasticInfrastructure();
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
            this.setElasticInfrastructure((ElasticInfrastructure) newValue);
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
            this.setElasticInfrastructure((ElasticInfrastructure) null);
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
        case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
            return this.basicGetElasticInfrastructure() != null;
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
            case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
                return ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__ELASTIC_INFRASTRUCTURE;
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
            case ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_REFERENCE__ELASTIC_INFRASTRUCTURE:
                return ScalablePCMGroupMeasuringPointPackage.INFRASTRUCTURE_GROUP_MEASURING_POINT__ELASTIC_INFRASTRUCTURE;
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
        if (this.getElasticInfrastructure() == null) {
            return "";
        }

        if (this.getElasticInfrastructure()
            .getEntityName() == null) {
            return super.getStringRepresentation();
        }

        EcoreUtil.resolveAll(this);

        final StringBuilder result = new StringBuilder();

        result.append("Elastic Infrastructure ");
        result.append(this.getElasticInfrastructure()
            .getEntityName());
        result.append(" [");
        result.append(this.getElasticInfrastructure()
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
        if (this.getElasticInfrastructure() == null) {
            return "";
        }
        EcoreUtil.resolveAll(this);
        return EMFLoadHelper.getResourceURI(this.getElasticInfrastructure());
    }

} // InfrastructureGroupMeasuringPointImpl
