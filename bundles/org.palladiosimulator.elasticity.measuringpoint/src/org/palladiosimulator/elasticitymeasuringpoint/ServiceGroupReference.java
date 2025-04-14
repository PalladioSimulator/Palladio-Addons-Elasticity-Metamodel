/**
 */
package org.palladiosimulator.elasticitymeasuringpoint;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.elasticity.targets.ServiceGroup;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Service Group
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference#getServiceGroup <em>Service Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticitymeasuringpointPackage#getServiceGroupReference()
 * @model abstract="true"
 * @generated
 */
public interface ServiceGroupReference extends EObject {
    /**
     * Returns the value of the '<em><b>Service Group</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Service Group</em>' reference.
     * @see #setServiceGroup(ServiceGroup)
     * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticitymeasuringpointPackage#getServiceGroupReference_ServiceGroup()
     * @model required="true"
     * @generated
     */
    ServiceGroup getServiceGroup();

    /**
     * Sets the value of the '{@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupReference#getServiceGroup <em>Service Group</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Service Group</em>' reference.
     * @see #getServiceGroup()
     * @generated
     */
    void setServiceGroup(ServiceGroup value);

} // ServiceGroupReference
