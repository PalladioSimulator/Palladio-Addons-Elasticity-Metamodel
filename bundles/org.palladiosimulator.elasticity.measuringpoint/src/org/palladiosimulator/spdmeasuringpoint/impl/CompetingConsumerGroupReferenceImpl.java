/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.elasticity.targets.CompetingConsumersGroup;
import org.palladiosimulator.spdmeasuringpoint.CompetingConsumerGroupReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Competing Consumer Group
 * Reference</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spdmeasuringpoint.impl.CompetingConsumerGroupReferenceImpl#getCompetingConsumerGroup
 * <em>Competing Consumer Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CompetingConsumerGroupReferenceImpl extends MinimalEObjectImpl.Container
        implements CompetingConsumerGroupReference {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CompetingConsumerGroupReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CompetingConsumersGroup getCompetingConsumerGroup() {
        return (CompetingConsumersGroup) this.eDynamicGet(
                SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
                SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public CompetingConsumersGroup basicGetCompetingConsumerGroup() {
        return (CompetingConsumersGroup) this.eDynamicGet(
                SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
                SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP, false,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCompetingConsumerGroup(final CompetingConsumersGroup newCompetingConsumerGroup) {
        this.eDynamicSet(SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
                SpdmeasuringpointPackage.Literals.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP,
                newCompetingConsumerGroup);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP:
            if (resolve) {
                return this.getCompetingConsumerGroup();
            }
            return this.basicGetCompetingConsumerGroup();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP:
            this.setCompetingConsumerGroup((CompetingConsumersGroup) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP:
            this.setCompetingConsumerGroup((CompetingConsumersGroup) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case SpdmeasuringpointPackage.COMPETING_CONSUMER_GROUP_REFERENCE__COMPETING_CONSUMER_GROUP:
            return this.basicGetCompetingConsumerGroup() != null;
        }
        return super.eIsSet(featureID);
    }

} // CompetingConsumerGroupReferenceImpl
