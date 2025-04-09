/**
 */
package org.palladiosimulator.semanticelasticityspec;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elastic Infrastructure Cfg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg#getLinkingResource <em>Linking Resource</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg#getResourceEnvironment <em>Resource Environment</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getElasticInfrastructureCfg()
 * @model
 * @generated
 */
public interface ElasticInfrastructureCfg extends TargetGroupCfg {
	/**
     * Returns the value of the '<em><b>Unit</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' reference.
     * @see #setUnit(ResourceContainer)
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getElasticInfrastructureCfg_Unit()
     * @model
     * @generated
     */
	ResourceContainer getUnit();

	/**
     * Sets the value of the '{@link org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg#getUnit <em>Unit</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit</em>' reference.
     * @see #getUnit()
     * @generated
     */
	void setUnit(ResourceContainer value);

	/**
     * Returns the value of the '<em><b>Elements</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.resourceenvironment.ResourceContainer}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' reference list.
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getElasticInfrastructureCfg_Elements()
     * @model required="true"
     * @generated
     */
	EList<ResourceContainer> getElements();

	/**
     * Returns the value of the '<em><b>Linking Resource</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Linking Resource</em>' reference.
     * @see #setLinkingResource(LinkingResource)
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getElasticInfrastructureCfg_LinkingResource()
     * @model
     * @generated
     */
	LinkingResource getLinkingResource();

	/**
     * Sets the value of the '{@link org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg#getLinkingResource <em>Linking Resource</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Linking Resource</em>' reference.
     * @see #getLinkingResource()
     * @generated
     */
	void setLinkingResource(LinkingResource value);

	/**
     * Returns the value of the '<em><b>Resource Environment</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Resource Environment</em>' reference.
     * @see #setResourceEnvironment(ResourceEnvironment)
     * @see org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage#getElasticInfrastructureCfg_ResourceEnvironment()
     * @model
     * @generated
     */
	ResourceEnvironment getResourceEnvironment();

	/**
     * Sets the value of the '{@link org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg#getResourceEnvironment <em>Resource Environment</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Environment</em>' reference.
     * @see #getResourceEnvironment()
     * @generated
     */
	void setResourceEnvironment(ResourceEnvironment value);

} // ElasticInfrastructureCfg
