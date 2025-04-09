/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.elasticity.targets.ElasticInfrastructure;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.ElasticInfrastructureReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elastic Infrastructure Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spdmeasuringpoint.impl.ElasticInfrastructureMeasuringPointImpl#getElasticInfrastructure <em>Elastic Infrastructure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElasticInfrastructureMeasuringPointImpl extends MeasuringPointImpl
		implements ElasticInfrastructureMeasuringPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElasticInfrastructureMeasuringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_MEASURING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElasticInfrastructure getElasticInfrastructure() {
		return (ElasticInfrastructure) eDynamicGet(
				SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE,
				SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticInfrastructure basicGetElasticInfrastructure() {
		return (ElasticInfrastructure) eDynamicGet(
				SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE,
				SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElasticInfrastructure(ElasticInfrastructure newElasticInfrastructure) {
		eDynamicSet(SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE,
				SpdmeasuringpointPackage.Literals.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE,
				newElasticInfrastructure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
			if (resolve)
				return getElasticInfrastructure();
			return basicGetElasticInfrastructure();
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
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
			setElasticInfrastructure((ElasticInfrastructure) newValue);
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
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
			setElasticInfrastructure((ElasticInfrastructure) null);
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
		case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
			return basicGetElasticInfrastructure() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElasticInfrastructureReference.class) {
			switch (derivedFeatureID) {
			case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE:
				return SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElasticInfrastructureReference.class) {
			switch (baseFeatureID) {
			case SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_REFERENCE__ELASTIC_INFRASTRUCTURE:
				return SpdmeasuringpointPackage.ELASTIC_INFRASTRUCTURE_MEASURING_POINT__ELASTIC_INFRASTRUCTURE;
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

		if (this.getElasticInfrastructure().getEntityName() == null) {
			return super.getStringRepresentation();
		}

		EcoreUtil.resolveAll(this);

		final StringBuilder result = new StringBuilder();

		result.append("Elastic Infrastructure ");
		result.append(this.getElasticInfrastructure().getEntityName());
		result.append(" [");
		result.append(this.getElasticInfrastructure().getId());
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

} //ElasticInfrastructureMeasuringPointImpl
