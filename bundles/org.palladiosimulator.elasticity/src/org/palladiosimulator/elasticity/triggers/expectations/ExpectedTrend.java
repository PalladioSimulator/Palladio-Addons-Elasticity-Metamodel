/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.triggers.expectations;

import org.palladiosimulator.elasticity.triggers.TrendPattern;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Expected Trend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.triggers.expectations.ExpectedTrend#getTrend
 * <em>Trend</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.triggers.expectations.ExpectationsPackage#getExpectedTrend()
 * @model
 * @generated
 */
public interface ExpectedTrend extends ExpectedValue {
    /**
     * Returns the value of the '<em><b>Trend</b></em>' attribute. The literals are from the
     * enumeration {@link org.palladiosimulator.elasticity.triggers.TrendPattern}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Trend</em>' attribute.
     * @see org.palladiosimulator.elasticity.triggers.TrendPattern
     * @see #setTrend(TrendPattern)
     * @see org.palladiosimulator.elasticity.triggers.expectations.ExpectationsPackage#getExpectedTrend_Trend()
     * @model
     * @generated
     */
    TrendPattern getTrend();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.triggers.expectations.ExpectedTrend#getTrend
     * <em>Trend</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Trend</em>' attribute.
     * @see org.palladiosimulator.elasticity.triggers.TrendPattern
     * @see #getTrend()
     * @generated
     */
    void setTrend(TrendPattern value);

} // ExpectedTrend
