/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.commons.emfutils.EMFLoadHelper;
import org.palladiosimulator.edp2.models.measuringpoint.impl.MeasuringPointImpl;
import org.palladiosimulator.elasticity.targets.CompetingConsumersGroup;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Competing Consumer Group Measuring Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spdmeasuringpoint.impl.CompetingConsumerGroupMeasuringPointImpl#getCompetingConsumerGroup <em>Competing Consumer Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetingConsumerGroupMeasuringPointImpl extends MeasuringPointImpl
		implements CompetingConsumerGroupMeasuringPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompetingConsumerGroupMeasuringPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_MEASURING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompetingConsumersGroup getCompetingConsumerGroup() {
		return (CompetingConsumersGroup) eDynamicGet(
				SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP,
				SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP, true,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompetingConsumersGroup basicGetCompetingConsumerGroup() {
		return (CompetingConsumersGroup) eDynamicGet(
				SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP,
				SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP, false,
				true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompetingConsumerGroup(CompetingConsumersGroup newCompetingConsumerGroup) {
		eDynamicSet(SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP,
				SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
				newCompetingConsumerGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
			if (resolve)
				return getCompetingConsumerGroup();
			return basicGetCompetingConsumerGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
			setCompetingConsumerGroup((CompetingConsumersGroup) newValue);
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
		case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
			setCompetingConsumerGroup((CompetingConsumersGroup) null);
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
		case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
			return basicGetCompetingConsumerGroup() != null;
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
		if (baseClass == CompetingConsumerGroupReference.class) {
			switch (derivedFeatureID) {
			case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP:
				return SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP;
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
		if (baseClass == CompetingConsumerGroupReference.class) {
			switch (baseFeatureID) {
			case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP:
				return SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_MEASURING_POINT__COMPETING_CONSUMER_GROUP;
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
		if (this.getCompetingConsumerGroup() == null) {
			return "";
		}

		if (this.getCompetingConsumerGroup().getEntityName() == null) {
			return super.getStringRepresentation();
		}

		EcoreUtil.resolveAll(this);

		final StringBuilder result = new StringBuilder();

		result.append("Competing Consumer Group ");
		result.append(this.getCompetingConsumerGroup().getEntityName());
		result.append(" [");
		result.append(this.getCompetingConsumerGroup().getId());
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
		if (this.getCompetingConsumerGroup() == null) {
			return "";
		}
		EcoreUtil.resolveAll(this);
		return EMFLoadHelper.getResourceURI(this.getCompetingConsumerGroup());
	}

} //CompetingConsumerGroupMeasuringPointImpl
