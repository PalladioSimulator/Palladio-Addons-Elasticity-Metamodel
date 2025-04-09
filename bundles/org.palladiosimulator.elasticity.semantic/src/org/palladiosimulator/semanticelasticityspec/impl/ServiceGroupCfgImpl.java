/**
 */
package org.palladiosimulator.semanticelasticityspec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage;
import org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Group Cfg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.ServiceGroupCfgImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.ServiceGroupCfgImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.ServiceGroupCfgImpl#getLoadBalancingAssembly <em>Load Balancing Assembly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceGroupCfgImpl extends TargetGroupCfgImpl implements ServiceGroupCfg {
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
	protected ServiceGroupCfgImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return SemanticelasticityPackage.Literals.SERVICE_GROUP_CFG;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticelasticityPackage.SERVICE_GROUP_CFG__UNIT, oldUnit, unit));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SemanticelasticityPackage.SERVICE_GROUP_CFG__UNIT, oldUnit, unit));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
    public EList<AssemblyContext> getElements() {
        if (elements == null) {
            elements = new EObjectResolvingEList<AssemblyContext>(AssemblyContext.class, this, SemanticelasticityPackage.SERVICE_GROUP_CFG__ELEMENTS);
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticelasticityPackage.SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY, oldLoadBalancingAssembly, loadBalancingAssembly));
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
            eNotify(new ENotificationImpl(this, Notification.SET, SemanticelasticityPackage.SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY, oldLoadBalancingAssembly, loadBalancingAssembly));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__UNIT:
                if (resolve) return getUnit();
                return basicGetUnit();
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__ELEMENTS:
                return getElements();
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY:
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
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__UNIT:
                setUnit((AssemblyContext)newValue);
                return;
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends AssemblyContext>)newValue);
                return;
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY:
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
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__UNIT:
                setUnit((AssemblyContext)null);
                return;
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__ELEMENTS:
                getElements().clear();
                return;
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY:
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
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__UNIT:
                return unit != null;
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case SemanticelasticityPackage.SERVICE_GROUP_CFG__LOAD_BALANCING_ASSEMBLY:
                return loadBalancingAssembly != null;
        }
        return super.eIsSet(featureID);
    }

} //ServiceGroupCfgImpl
