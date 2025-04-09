/**
 */
package org.palladiosimulator.semanticelasticityspec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.elasticity.ScalingPolicy;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Group Cfg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.TargetGroupCfg#getEnactedPolicies <em>Enacted Policies</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getTargetGroupCfg()
 * @model abstract="true"
 * @generated
 */
public interface TargetGroupCfg extends EObject {
	/**
     * Returns the value of the '<em><b>Enacted Policies</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.elasticity.ScalingPolicy}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enacted Policies</em>' reference list.
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getTargetGroupCfg_EnactedPolicies()
     * @model
     * @generated
     */
	EList<ScalingPolicy> getEnactedPolicies();

} // TargetGroupCfg
