/**
 */
package org.palladiosimulator.spdmeasuringpoint.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.elasticity.targets.ServiceGroup;
import org.palladiosimulator.spdmeasuringpoint.ServiceGroupReference;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Group Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.spdmeasuringpoint.impl.ServiceGroupReferenceImpl#getServiceGroup <em>Service Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceGroupReferenceImpl extends MinimalEObjectImpl.Container implements ServiceGroupReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceGroupReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpdmeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceGroup getServiceGroup() {
		return (ServiceGroup) eDynamicGet(SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP,
				SpdmeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceGroup basicGetServiceGroup() {
		return (ServiceGroup) eDynamicGet(SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP,
				SpdmeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceGroup(ServiceGroup newServiceGroup) {
		eDynamicSet(SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP,
				SpdmeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, newServiceGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
			if (resolve)
				return getServiceGroup();
			return basicGetServiceGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
			setServiceGroup((ServiceGroup) newValue);
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
		case SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
			setServiceGroup((ServiceGroup) null);
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
		case SpdmeasuringpointPackage.SERVICE_GROUP_REFERENCE__SERVICE_GROUP:
			return basicGetServiceGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceGroupReferenceImpl
