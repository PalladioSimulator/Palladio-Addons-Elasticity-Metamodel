/**
 */
package org.palladiosimulator.elasticitymeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.elasticity.targets.ServiceGroup;
import org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.elasticitymeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Service Group Measuring
 * Point</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ServiceGroupMeasuringPointImpl#getServiceGroup
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
        return SpdmeasuringpointPackage.Literals.SERVICE_GROUP_MEASURING_POINT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceGroup getServiceGroup() {
        return (ServiceGroup) this.eDynamicGet(SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP,
                SpdmeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceGroup basicGetServiceGroup() {
        return (ServiceGroup) this.eDynamicGet(SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP,
                SpdmeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setServiceGroup(final ServiceGroup newServiceGroup) {
        this.eDynamicSet(SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP,
                SpdmeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, newServiceGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
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
        case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
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
        case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
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
        case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
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
            case SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP:
                return SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP;
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
            case SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
                return SpdmeasuringpointPackage.SERVICE_GROUP_MEASURING_POINT__SERVICE_GROUP;
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
        if (this.getServiceGroup() == null) {
            return "";
        }

        if (this.getServiceGroup()
            .getEntityName() == null) {
            return super.getStringRepresentation();
        }

        EcoreUtil.resolveAll(this);

        final StringBuilder result = new StringBuilder();

        result.append("Service Group ");
        result.append(this.getServiceGroup()
            .getEntityName());
        result.append(" [");
        result.append(this.getServiceGroup()
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
        if (this.getServiceGroup() == null) {
            return "";
        }
        EcoreUtil.resolveAll(this);
        return EMFLoadHelper.getResourceURI(this.getServiceGroup());
    }

} // ServiceGroupMeasuringPointImpl
