/**
 */
package org.palladiosimulator.semanticelasticityspec;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Group Cfg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg#getLoadBalancingAssembly <em>Load Balancing Assembly</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getServiceGroupCfg()
 * @model
 * @generated
 */
public interface ServiceGroupCfg extends TargetGroupCfg {
	/**
     * Returns the value of the '<em><b>Unit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' reference.
     * @see #setUnit(AssemblyContext)
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getServiceGroupCfg_Unit()
     * @model
     * @generated
     */
	AssemblyContext getUnit();

	/**
     * Sets the value of the '{@link org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg#getUnit <em>Unit</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' reference.
     * @see #getUnit()
     * @generated
     */
	void setUnit(AssemblyContext value);

	/**
     * Returns the value of the '<em><b>Elements</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.core.composition.AssemblyContext}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' reference list.
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getServiceGroupCfg_Elements()
     * @model required="true"
     * @generated
     */
	EList<AssemblyContext> getElements();

	/**
     * Returns the value of the '<em><b>Load Balancing Assembly</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Load Balancing Assembly</em>' reference.
     * @see #setLoadBalancingAssembly(AssemblyContext)
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getServiceGroupCfg_LoadBalancingAssembly()
     * @model
     * @generated
     */
	AssemblyContext getLoadBalancingAssembly();

	/**
     * Sets the value of the '{@link org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg#getLoadBalancingAssembly <em>Load Balancing Assembly</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Balancing Assembly</em>' reference.
     * @see #getLoadBalancingAssembly()
     * @generated
     */
	void setLoadBalancingAssembly(AssemblyContext value);

} // ServiceGroupCfg
