/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.adjustments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.adjustments.AdjustmentsPackage;
import org.palladiosimulator.spd.adjustments.RelativeAdjustment;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relative
 * Adjustment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl#getPercentageGrowthValue <em>Percentage Growth Value</em>}</li>
 *   <li>{@link org.palladiosimulator.spd.adjustments.impl.RelativeAdjustmentImpl#getMinAdjustmentValue <em>Min Adjustment Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeAdjustmentImpl extends AdjustmentTypeImpl implements RelativeAdjustment {
	/**
	 * The default value of the '{@link #getPercentageGrowthValue() <em>Percentage Growth Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPercentageGrowthValue()
	 * @generated
	 * @ordered
	 */
	protected static final int PERCENTAGE_GROWTH_VALUE_EDEFAULT = 100;

	/**
	 * The default value of the '{@link #getMinAdjustmentValue() <em>Min Adjustment Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMinAdjustmentValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ADJUSTMENT_VALUE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeAdjustmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPercentageGrowthValue() {
		return (Integer) eDynamicGet(AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE,
				AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentageGrowthValue(int newPercentageGrowthValue) {
		eDynamicSet(AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE,
				AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE, newPercentageGrowthValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinAdjustmentValue() {
		return (Integer) eDynamicGet(AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE,
				AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinAdjustmentValue(int newMinAdjustmentValue) {
		eDynamicSet(AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE,
				AdjustmentsPackage.Literals.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE, newMinAdjustmentValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
			return getPercentageGrowthValue();
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
			return getMinAdjustmentValue();
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
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
			setPercentageGrowthValue((Integer) newValue);
			return;
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
			setMinAdjustmentValue((Integer) newValue);
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
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
			setPercentageGrowthValue(PERCENTAGE_GROWTH_VALUE_EDEFAULT);
			return;
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
			setMinAdjustmentValue(MIN_ADJUSTMENT_VALUE_EDEFAULT);
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
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__PERCENTAGE_GROWTH_VALUE:
			return getPercentageGrowthValue() != PERCENTAGE_GROWTH_VALUE_EDEFAULT;
		case AdjustmentsPackage.RELATIVE_ADJUSTMENT__MIN_ADJUSTMENT_VALUE:
			return getMinAdjustmentValue() != MIN_ADJUSTMENT_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} // RelativeAdjustmentImpl
