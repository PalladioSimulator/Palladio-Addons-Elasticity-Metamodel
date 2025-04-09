/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.elasticity.constraints.policy.PolicyConstraint;
import org.palladiosimulator.elasticity.targets.TargetGroup;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A scaling policy determines the complete information for scaling a
 * parituclar target. Each ScalingPolicy is an Entity (PCM), it has a unique identifier and it has a
 * name. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.ScalingPolicy#isActive <em>Active</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.ScalingPolicy#getPolicyConstraints <em>Policy
 * Constraints</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.ScalingPolicy#getTargetGroup <em>Target Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.SpdPackage#getScalingPolicy()
 * @model abstract="true" annotation="http://www.eclipse.org/emf/2002/Ecore
 *        constraints='policyNameInvariant'"
 * @generated
 */
public interface ScalingPolicy extends Entity {
    /**
     * Returns the value of the '<em><b>Active</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Active</em>' attribute.
     * @see #setActive(boolean)
     * @see org.palladiosimulator.elasticity.SpdPackage#getScalingPolicy_Active()
     * @model
     * @generated
     */
    boolean isActive();

    /**
     * Sets the value of the '{@link org.palladiosimulator.elasticity.ScalingPolicy#isActive
     * <em>Active</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Active</em>' attribute.
     * @see #isActive()
     * @generated
     */
    void setActive(boolean value);

    /**
     * Returns the value of the '<em><b>Target Group</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Target Group</em>' reference.
     * @see #setTargetGroup(TargetGroup)
     * @see org.palladiosimulator.elasticity.SpdPackage#getScalingPolicy_TargetGroup()
     * @model required="true"
     * @generated
     */
    TargetGroup getTargetGroup();

    /**
     * Sets the value of the '{@link org.palladiosimulator.elasticity.ScalingPolicy#getTargetGroup
     * <em>Target Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Target Group</em>' reference.
     * @see #getTargetGroup()
     * @generated
     */
    void setTargetGroup(TargetGroup value);

    /**
     * Returns the value of the '<em><b>Policy Constraints</b></em>' containment reference list. The
     * list contents are of type
     * {@link org.palladiosimulator.elasticity.constraints.policy.PolicyConstraint}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Policy Constraints</em>' containment reference list.
     * @see org.palladiosimulator.elasticity.SpdPackage#getScalingPolicy_PolicyConstraints()
     * @model containment="true"
     * @generated
     */
    EList<PolicyConstraint> getPolicyConstraints();

} // ScalingPolicy
