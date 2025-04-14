/**
 */
package org.palladiosimulator.elasticitymeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.elasticity.targets.ElasticInfrastructure;
import org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.elasticitymeasuringpoint.ElasticitymeasuringpointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Elastic Infrastructure
 * Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.elasticitymeasuringpoint.impl.ElasticInfrastructureReferenceImpl#getElasticInfrastructure <em>Elastic Infrastructure</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElasticInfrastructureReferenceImpl extends MinimalEObjectImpl.Container
        implements ElasticInfrastructureReference {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ElasticInfrastructureReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ElasticitymeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElasticInfrastructure getElasticInfrastructure() {
        return (ElasticInfrastructure) eDynamicGet(
                ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE,
                ElasticitymeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public ElasticInfrastructure basicGetElasticInfrastructure() {
        return (ElasticInfrastructure) eDynamicGet(
                ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE,
                ElasticitymeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE,
                false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElasticInfrastructure(ElasticInfrastructure newElasticInfrastructure) {
        eDynamicSet(ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE,
                ElasticitymeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE,
                newElasticInfrastructure);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE:
            if (resolve)
                return getElasticInfrastructure();
            return basicGetElasticInfrastructure();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE:
            setElasticInfrastructure((ElasticInfrastructure) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE:
            setElasticInfrastructure((ElasticInfrastructure) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case ElasticitymeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE:
            return basicGetElasticInfrastructure() != null;
        }
        return super.eIsSet(featureID);
    }

} // ElasticInfrastructureReferenceImpl
