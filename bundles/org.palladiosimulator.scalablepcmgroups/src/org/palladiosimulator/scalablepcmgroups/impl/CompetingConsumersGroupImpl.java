/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup;
import org.palladiosimulator.scalablepcmgroups.Queue;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Competing Consumers Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl#getBrokerAssembly <em>Broker Assembly</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.CompetingConsumersGroupImpl#getUnitQueues <em>Unit Queues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompetingConsumersGroupImpl extends TargetGroupImpl implements CompetingConsumersGroup {
    /**
     * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnit()
     * @generated
     * @ordered
     */
    protected AssemblyContext unit;

    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<AssemblyContext> elements;

    /**
     * The cached value of the '{@link #getBrokerAssembly() <em>Broker Assembly</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBrokerAssembly()
     * @generated
     * @ordered
     */
    protected AssemblyContext brokerAssembly;

    /**
     * The cached value of the '{@link #getUnitQueues() <em>Unit Queues</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitQueues()
     * @generated
     * @ordered
     */
    protected EList<Queue> unitQueues;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CompetingConsumersGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return scalablepcmgroupsPackage.Literals.COMPETING_CONSUMERS_GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssemblyContext getUnit() {
        if (unit != null && unit.eIsProxy()) {
            InternalEObject oldUnit = (InternalEObject)unit;
            unit = (AssemblyContext)eResolveProxy(oldUnit);
            if (unit != oldUnit) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT, oldUnit, unit));
            }
        }
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssemblyContext basicGetUnit() {
        return unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnit(AssemblyContext newUnit) {
        AssemblyContext oldUnit = unit;
        unit = newUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AssemblyContext> getElements() {
        if (elements == null) {
            elements = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__ELEMENTS);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssemblyContext getBrokerAssembly() {
        if (brokerAssembly != null && brokerAssembly.eIsProxy()) {
            InternalEObject oldBrokerAssembly = (InternalEObject)brokerAssembly;
            brokerAssembly = (AssemblyContext)eResolveProxy(oldBrokerAssembly);
            if (brokerAssembly != oldBrokerAssembly) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY, oldBrokerAssembly, brokerAssembly));
            }
        }
        return brokerAssembly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssemblyContext basicGetBrokerAssembly() {
        return brokerAssembly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBrokerAssembly(AssemblyContext newBrokerAssembly) {
        AssemblyContext oldBrokerAssembly = brokerAssembly;
        brokerAssembly = newBrokerAssembly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY, oldBrokerAssembly, brokerAssembly));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Queue> getUnitQueues() {
        if (unitQueues == null) {
            unitQueues = new EObjectContainmentEList<Queue>(Queue.class, this, scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT_QUEUES);
        }
        return unitQueues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT_QUEUES:
                return ((InternalEList<?>)getUnitQueues()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT:
                if (resolve) return getUnit();
                return basicGetUnit();
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__ELEMENTS:
                return getElements();
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY:
                if (resolve) return getBrokerAssembly();
                return basicGetBrokerAssembly();
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT_QUEUES:
                return getUnitQueues();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT:
                setUnit((AssemblyContext)newValue);
                return;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends AssemblyContext>)newValue);
                return;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY:
                setBrokerAssembly((AssemblyContext)newValue);
                return;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT_QUEUES:
                getUnitQueues().clear();
                getUnitQueues().addAll((Collection<? extends Queue>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT:
                setUnit((AssemblyContext)null);
                return;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__ELEMENTS:
                getElements().clear();
                return;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY:
                setBrokerAssembly((AssemblyContext)null);
                return;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT_QUEUES:
                getUnitQueues().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT:
                return unit != null;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__BROKER_ASSEMBLY:
                return brokerAssembly != null;
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP__UNIT_QUEUES:
                return unitQueues != null && !unitQueues.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CompetingConsumersGroupImpl
