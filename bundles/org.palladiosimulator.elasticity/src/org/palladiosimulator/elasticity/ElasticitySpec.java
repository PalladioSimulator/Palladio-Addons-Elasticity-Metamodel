/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.elasticity.targets.TargetGroup;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Spec</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> The root elements that consists of all scaling policies under analysis
 * for a given cloud application. The Elasticity Spec is an Entity (PCM), it has a unique identifier
 * and it has a name. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.ElasticitySpec#getScalingPolicies <em>Scaling
 * Policies</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.ElasticitySpec#getTargetGroups <em>Target
 * Groups</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.ElasticityPackage#getElasticitySpec()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameInvariant
 *        noSameTargetGroup'"
 * @generated
 */
public interface ElasticitySpec extends Entity {
    /**
     * Returns the value of the '<em><b>Scaling Policies</b></em>' containment reference list. The
     * list contents are of type {@link org.palladiosimulator.elasticity.ScalingPolicy}. <!--
     * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of scaling policies
     * under analysis for the given cloud application model. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Scaling Policies</em>' containment reference list.
     * @see org.palladiosimulator.elasticity.ElasticityPackage#getElasticitySpec_ScalingPolicies()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ScalingPolicy> getScalingPolicies();

    /**
     * Returns the value of the '<em><b>Target Groups</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.elasticity.targets.TargetGroup}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Target Groups</em>' containment reference list.
     * @see org.palladiosimulator.elasticity.ElasticityPackage#getElasticitySpec_TargetGroups()
     * @model containment="true" required="true"
     * @generated
     */
    EList<TargetGroup> getTargetGroups();

} // ElasticitySpec
