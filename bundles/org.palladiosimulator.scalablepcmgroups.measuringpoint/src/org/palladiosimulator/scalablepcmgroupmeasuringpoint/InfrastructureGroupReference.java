/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Infrastructure Group
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference#getInfrastructureGroup
 * <em>Infrastructure Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage#getInfrastructureGroupReference()
 * @model abstract="true"
 * @generated
 */
public interface InfrastructureGroupReference extends EObject {
    /**
     * Returns the value of the '<em><b>Infrastructure Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Infrastructure Group</em>' reference.
     * @see #setInfrastructureGroup(InfrastructureGroup)
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage#getInfrastructureGroupReference_InfrastructureGroup()
     * @model required="true"
     * @generated
     */
    InfrastructureGroup getInfrastructureGroup();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.InfrastructureGroupReference#getInfrastructureGroup
     * <em>Infrastructure Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Infrastructure Group</em>' reference.
     * @see #getInfrastructureGroup()
     * @generated
     */
    void setInfrastructureGroup(InfrastructureGroup value);

} // InfrastructureGroupReference
