/**
 */
package org.palladiosimulator.scalablepcmgroups;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getLinkingResource <em>Linking Resource</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getResourceEnvironment <em>Resource Environment</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getInfrastructureGroup()
 * @model
 * @generated
 */
public interface InfrastructureGroup extends TargetGroup {
    /**
     * Returns the value of the '<em><b>Unit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit</em>' reference.
     * @see #setUnit(ResourceContainer)
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getInfrastructureGroup_Unit()
     * @model
     * @generated
     */
    ResourceContainer getUnit();

    /**
     * Sets the value of the '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getUnit <em>Unit</em>}' reference.
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
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getInfrastructureGroup_Elements()
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
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getInfrastructureGroup_LinkingResource()
     * @model
     * @generated
     */
    LinkingResource getLinkingResource();

    /**
     * Sets the value of the '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getLinkingResource <em>Linking Resource</em>}' reference.
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
     * @see org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage#getInfrastructureGroup_ResourceEnvironment()
     * @model
     * @generated
     */
    ResourceEnvironment getResourceEnvironment();

    /**
     * Sets the value of the '{@link org.palladiosimulator.scalablepcmgroups.InfrastructureGroup#getResourceEnvironment <em>Resource Environment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resource Environment</em>' reference.
     * @see #getResourceEnvironment()
     * @generated
     */
    void setResourceEnvironment(ResourceEnvironment value);

} // InfrastructureGroup
