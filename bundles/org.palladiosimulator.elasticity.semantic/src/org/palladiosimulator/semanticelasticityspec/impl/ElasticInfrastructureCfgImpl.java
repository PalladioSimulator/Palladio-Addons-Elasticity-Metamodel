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

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg;
import org.palladiosimulator.semanticelasticityspec.SemanticspdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elastic Infrastructure Cfg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.ElasticInfrastructureCfgImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.ElasticInfrastructureCfgImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.ElasticInfrastructureCfgImpl#getLinkingResource <em>Linking Resource</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.ElasticInfrastructureCfgImpl#getResourceEnvironment <em>Resource Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElasticInfrastructureCfgImpl extends TargetGroupCfgImpl implements ElasticInfrastructureCfg {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected ResourceContainer unit;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceContainer> elements;

	/**
	 * The cached value of the '{@link #getLinkingResource() <em>Linking Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingResource()
	 * @generated
	 * @ordered
	 */
	protected LinkingResource linkingResource;

	/**
	 * The cached value of the '{@link #getResourceEnvironment() <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ResourceEnvironment resourceEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElasticInfrastructureCfgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticspdPackage.Literals.ELASTIC_INFRASTRUCTURE_CFG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (ResourceContainer)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainer basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(ResourceContainer newUnit) {
		ResourceContainer oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceContainer> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<ResourceContainer>(ResourceContainer.class, this, SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource getLinkingResource() {
		if (linkingResource != null && linkingResource.eIsProxy()) {
			InternalEObject oldLinkingResource = (InternalEObject)linkingResource;
			linkingResource = (LinkingResource)eResolveProxy(oldLinkingResource);
			if (linkingResource != oldLinkingResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE, oldLinkingResource, linkingResource));
			}
		}
		return linkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkingResource basicGetLinkingResource() {
		return linkingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkingResource(LinkingResource newLinkingResource) {
		LinkingResource oldLinkingResource = linkingResource;
		linkingResource = newLinkingResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE, oldLinkingResource, linkingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment getResourceEnvironment() {
		if (resourceEnvironment != null && resourceEnvironment.eIsProxy()) {
			InternalEObject oldResourceEnvironment = (InternalEObject)resourceEnvironment;
			resourceEnvironment = (ResourceEnvironment)eResolveProxy(oldResourceEnvironment);
			if (resourceEnvironment != oldResourceEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
			}
		}
		return resourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEnvironment basicGetResourceEnvironment() {
		return resourceEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceEnvironment(ResourceEnvironment newResourceEnvironment) {
		ResourceEnvironment oldResourceEnvironment = resourceEnvironment;
		resourceEnvironment = newResourceEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS:
				return getElements();
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE:
				if (resolve) return getLinkingResource();
				return basicGetLinkingResource();
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT:
				if (resolve) return getResourceEnvironment();
				return basicGetResourceEnvironment();
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
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__UNIT:
				setUnit((ResourceContainer)newValue);
				return;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ResourceContainer>)newValue);
				return;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE:
				setLinkingResource((LinkingResource)newValue);
				return;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)newValue);
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
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__UNIT:
				setUnit((ResourceContainer)null);
				return;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS:
				getElements().clear();
				return;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE:
				setLinkingResource((LinkingResource)null);
				return;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)null);
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
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__UNIT:
				return unit != null;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__LINKING_RESOURCE:
				return linkingResource != null;
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG__RESOURCE_ENVIRONMENT:
				return resourceEnvironment != null;
		}
		return super.eIsSet(featureID);
	}

} //ElasticInfrastructureCfgImpl
