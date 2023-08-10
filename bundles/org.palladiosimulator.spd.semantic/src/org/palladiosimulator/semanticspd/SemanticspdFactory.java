/**
 */
package org.palladiosimulator.semanticspd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.semanticspd.SemanticspdPackage
 * @generated
 */
public interface SemanticspdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemanticspdFactory eINSTANCE = org.palladiosimulator.semanticspd.impl.SemanticspdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Elastic Infrastructure Cfg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elastic Infrastructure Cfg</em>'.
	 * @generated
	 */
	ElasticInfrastructureCfg createElasticInfrastructureCfg();

	/**
	 * Returns a new object of class '<em>Service Group Cfg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Group Cfg</em>'.
	 * @generated
	 */
	ServiceGroupCfg createServiceGroupCfg();

	/**
	 * Returns a new object of class '<em>Competing Consumers Group Cfg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Competing Consumers Group Cfg</em>'.
	 * @generated
	 */
	CompetingConsumersGroupCfg createCompetingConsumersGroupCfg();

	/**
	 * Returns a new object of class '<em>Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue</em>'.
	 * @generated
	 */
	Queue createQueue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SemanticspdPackage getSemanticspdPackage();

} //SemanticspdFactory
