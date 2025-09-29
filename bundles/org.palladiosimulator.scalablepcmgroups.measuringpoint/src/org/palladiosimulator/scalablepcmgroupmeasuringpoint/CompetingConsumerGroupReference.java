/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Competing Consumer Group
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference#getCompetingConsumerGroup
 * <em>Competing Consumer Group</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage#getCompetingConsumerGroupReference()
 * @model abstract="true"
 * @generated
 */
public interface CompetingConsumerGroupReference extends EObject {
    /**
     * Returns the value of the '<em><b>Competing Consumer Group</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Competing Consumer Group</em>' reference.
     * @see #setCompetingConsumerGroup(CompetingConsumersGroup)
     * @see org.palladiosimulator.scalablepcmgroupmeasuringpoint.ScalablePCMGroupMeasuringPointPackage#getCompetingConsumerGroupReference_CompetingConsumerGroup()
     * @model required="true"
     * @generated
     */
    org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup getCompetingConsumerGroup();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.scalablepcmgroupmeasuringpoint.CompetingConsumerGroupReference#getCompetingConsumerGroup
     * <em>Competing Consumer Group</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Competing Consumer Group</em>' reference.
     * @see #getCompetingConsumerGroup()
     * @generated
     */
    void setCompetingConsumerGroup(org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup value);

} // CompetingConsumerGroupReference
