/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service Group
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference#getServiceGroup
 * <em>Service Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage#getServiceGroupReference()
 * @model abstract="true"
 * @generated
 */
public interface ServiceGroupReference extends EObject {
    /**
     * Returns the value of the '<em><b>Service Group</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Service Group</em>' reference.
     * @see #setServiceGroup(org.palladiosimulator.scalablepcmgroups.ServiceGroup)
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage#getServiceGroupReference_ServiceGroup()
     * @model required="true"
     * @generated
     */
    org.palladiosimulator.scalablepcmgroups.ServiceGroup getServiceGroup();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.ServiceGroupReference#getServiceGroup
     * <em>Service Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Service Group</em>' reference.
     * @see #getServiceGroup()
     * @generated
     */
    void setServiceGroup(org.palladiosimulator.scalablepcmgroups.ServiceGroup value);

} // ServiceGroupReference
