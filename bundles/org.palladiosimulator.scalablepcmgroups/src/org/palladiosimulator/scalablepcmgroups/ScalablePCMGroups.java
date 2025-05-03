/**
 */
package org.palladiosimulator.scalablepcmgroups;

import org.eclipse.emf.common.util.EList;
import org.palladiosimulator.elasticity.ScalingPolicy;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalable PCM Groups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getEnactedPolicy <em>Enacted Policy</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getTargetCfgs <em>Target Cfgs</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getScalablePCMGroups()
 * @model
 * @generated
 */
public interface ScalablePCMGroups extends Entity {
    /**
     * Returns the value of the '<em><b>Enacted Policy</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enacted Policy</em>' reference.
     * @see #setEnactedPolicy(ScalingPolicy)
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getScalablePCMGroups_EnactedPolicy()
     * @model
     * @generated
     */
    ScalingPolicy getEnactedPolicy();

    /**
     * Sets the value of the '{@link org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups#getEnactedPolicy <em>Enacted Policy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enacted Policy</em>' reference.
     * @see #getEnactedPolicy()
     * @generated
     */
    void setEnactedPolicy(ScalingPolicy value);

    /**
     * Returns the value of the '<em><b>Target Cfgs</b></em>' containment reference list.
     * The list contents are of type {@link org.palladiosimulator.scalablepcmgroups.TargetGroup}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Cfgs</em>' containment reference list.
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getScalablePCMGroups_TargetCfgs()
     * @model containment="true"
     * @generated
     */
    EList<TargetGroup> getTargetCfgs();

} // ScalablePCMGroups
