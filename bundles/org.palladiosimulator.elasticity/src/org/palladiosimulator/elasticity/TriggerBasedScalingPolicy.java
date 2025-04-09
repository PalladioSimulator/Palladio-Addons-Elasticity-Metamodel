/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity;

import org.palladiosimulator.elasticity.adjustments.AdjustmentType;
import org.palladiosimulator.elasticity.triggers.ScalingTrigger;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Trigger Based Scaling
 * Policy</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A trigger-based scaling policy contains a scaling trigger that
 * determines whether an adjustment should be made and an adjustment that defines the performed
 * adjustment. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.TriggerBasedScalingPolicy#getAdjustmentType <em>Adjustment
 * Type</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.TriggerBasedScalingPolicy#getScalingTrigger <em>Scaling
 * Trigger</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.SpdPackage#getTriggerBasedScalingPolicy()
 * @model
 * @generated
 */
public interface TriggerBasedScalingPolicy extends ScalingPolicy {
    /**
     * Returns the value of the '<em><b>Adjustment Type</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Adjustment Type</em>' containment reference.
     * @see #setAdjustmentType(AdjustmentType)
     * @see org.palladiosimulator.elasticity.SpdPackage#getTriggerBasedScalingPolicy_AdjustmentType()
     * @model containment="true" required="true"
     * @generated
     */
    AdjustmentType getAdjustmentType();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.TriggerBasedScalingPolicy#getAdjustmentType <em>Adjustment
     * Type</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Adjustment Type</em>' containment reference.
     * @see #getAdjustmentType()
     * @generated
     */
    void setAdjustmentType(AdjustmentType value);

    /**
     * Returns the value of the '<em><b>Scaling Trigger</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Scaling Trigger</em>' containment reference.
     * @see #setScalingTrigger(ScalingTrigger)
     * @see org.palladiosimulator.elasticity.SpdPackage#getTriggerBasedScalingPolicy_ScalingTrigger()
     * @model containment="true" required="true"
     * @generated
     */
    ScalingTrigger getScalingTrigger();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.TriggerBasedScalingPolicy#getScalingTrigger <em>Scaling
     * Trigger</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Scaling Trigger</em>' containment reference.
     * @see #getScalingTrigger()
     * @generated
     */
    void setScalingTrigger(ScalingTrigger value);

} // TriggerBasedScalingPolicy
