/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;

import org.palladiosimulator.scalablepcmgroups.ServiceGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.ServiceGroupImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.ServiceGroupImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.scalablepcmgroups.impl.ServiceGroupImpl#getLoadBalancingAssembly <em>Load Balancing Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceGroupImpl extends TargetGroupImpl implements ServiceGroup {
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
     * The cached value of the '{@link #getLoadBalancingAssembly() <em>Load Balancing Assembly</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadBalancingAssembly()
     * @generated
     * @ordered
     */
    protected AssemblyContext loadBalancingAssembly;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ServiceGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return scalablepcmgroupsPackage.Literals.SERVICE_GROUP;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, scalablepcmgroupsPackage.SERVICE_GROUP__UNIT, oldUnit, unit));
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
            eNotify(new ENotificationImpl(this, Notification.SET, scalablepcmgroupsPackage.SERVICE_GROUP__UNIT, oldUnit, unit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AssemblyContext> getElements() {
        if (elements == null) {
            elements = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, scalablepcmgroupsPackage.SERVICE_GROUP__ELEMENTS);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AssemblyContext getLoadBalancingAssembly() {
        if (loadBalancingAssembly != null && loadBalancingAssembly.eIsProxy()) {
            InternalEObject oldLoadBalancingAssembly = (InternalEObject)loadBalancingAssembly;
            loadBalancingAssembly = (AssemblyContext)eResolveProxy(oldLoadBalancingAssembly);
            if (loadBalancingAssembly != oldLoadBalancingAssembly) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, scalablepcmgroupsPackage.SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY, oldLoadBalancingAssembly, loadBalancingAssembly));
            }
        }
        return loadBalancingAssembly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssemblyContext basicGetLoadBalancingAssembly() {
        return loadBalancingAssembly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoadBalancingAssembly(AssemblyContext newLoadBalancingAssembly) {
        AssemblyContext oldLoadBalancingAssembly = loadBalancingAssembly;
        loadBalancingAssembly = newLoadBalancingAssembly;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, scalablepcmgroupsPackage.SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY, oldLoadBalancingAssembly, loadBalancingAssembly));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case scalablepcmgroupsPackage.SERVICE_GROUP__UNIT:
                if (resolve) return getUnit();
                return basicGetUnit();
            case scalablepcmgroupsPackage.SERVICE_GROUP__ELEMENTS:
                return getElements();
            case scalablepcmgroupsPackage.SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY:
                if (resolve) return getLoadBalancingAssembly();
                return basicGetLoadBalancingAssembly();
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
            case scalablepcmgroupsPackage.SERVICE_GROUP__UNIT:
                setUnit((AssemblyContext)newValue);
                return;
            case scalablepcmgroupsPackage.SERVICE_GROUP__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends AssemblyContext>)newValue);
                return;
            case scalablepcmgroupsPackage.SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY:
                setLoadBalancingAssembly((AssemblyContext)newValue);
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
            case scalablepcmgroupsPackage.SERVICE_GROUP__UNIT:
                setUnit((AssemblyContext)null);
                return;
            case scalablepcmgroupsPackage.SERVICE_GROUP__ELEMENTS:
                getElements().clear();
                return;
            case scalablepcmgroupsPackage.SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY:
                setLoadBalancingAssembly((AssemblyContext)null);
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
            case scalablepcmgroupsPackage.SERVICE_GROUP__UNIT:
                return unit != null;
            case scalablepcmgroupsPackage.SERVICE_GROUP__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case scalablepcmgroupsPackage.SERVICE_GROUP__LOAD_BALANCING_ASSEMBLY:
                return loadBalancingAssembly != null;
        }
        return super.eIsSet(featureID);
    }

} //ServiceGroupImpl
