/**
 */
package org.palladiosimulator.scalablepcmgroups;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage
 * @generated
 */
public interface scalablepcmgroupsFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    scalablepcmgroupsFactory eINSTANCE = org.palladiosimulator.scalablepcmgroups.impl.scalablepcmgroupsFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Scalable PCM Groups</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Scalable PCM Groups</em>'.
     * @generated
     */
    ScalablePCMGroups createScalablePCMGroups();

    /**
     * Returns a new object of class '<em>Infrastructure Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Infrastructure Group</em>'.
     * @generated
     */
    InfrastructureGroup createInfrastructureGroup();

    /**
     * Returns a new object of class '<em>Service Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service Group</em>'.
     * @generated
     */
    ServiceGroup createServiceGroup();

    /**
     * Returns a new object of class '<em>Competing Consumers Group</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Competing Consumers Group</em>'.
     * @generated
     */
    CompetingConsumersGroup createCompetingConsumersGroup();

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
    scalablepcmgroupsPackage getscalablepcmgroupsPackage();

} //scalablepcmgroupsFactory
