/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.triggers.expectations;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Expected
 * Percentage</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.triggers.expectations.ExpectedPercentage#getValue
 * <em>Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.triggers.expectations.ExpectationsPackage#getExpectedPercentage()
 * @model
 * @generated
 */
public interface ExpectedPercentage extends ExpectedPrimitive {
    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(double)
     * @see org.palladiosimulator.elasticity.triggers.expectations.ExpectationsPackage#getExpectedPercentage_Value()
     * @model dataType="org.palladiosimulator.elasticity.datatypes.WholePercentDouble"
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.triggers.expectations.ExpectedPercentage#getValue
     * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // ExpectedPercentage
