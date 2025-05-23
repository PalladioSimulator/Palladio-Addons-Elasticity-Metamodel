/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.expectations.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.spd.triggers.expectations.ExpectationsPackage;
import org.palladiosimulator.spd.triggers.expectations.ExpectedTime;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Expected Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.triggers.expectations.impl.ExpectedTimeImpl#getValue
 * <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpectedTimeImpl extends ExpectedPrimitiveImpl implements ExpectedTime {
    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final double VALUE_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExpectedTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpectationsPackage.Literals.EXPECTED_TIME;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getValue() {
        return (Double) this.eDynamicGet(ExpectationsPackage.EXPECTED_TIME__VALUE,
                ExpectationsPackage.Literals.EXPECTED_TIME__VALUE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValue(final double newValue) {
        this.eDynamicSet(ExpectationsPackage.EXPECTED_TIME__VALUE, ExpectationsPackage.Literals.EXPECTED_TIME__VALUE,
                newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExpectationsPackage.EXPECTED_TIME__VALUE:
            return this.getValue();
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
        case ExpectationsPackage.EXPECTED_TIME__VALUE:
            this.setValue((Double) newValue);
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
        case ExpectationsPackage.EXPECTED_TIME__VALUE:
            this.setValue(VALUE_EDEFAULT);
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
        case ExpectationsPackage.EXPECTED_TIME__VALUE:
            return this.getValue() != VALUE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ExpectedTimeImpl
