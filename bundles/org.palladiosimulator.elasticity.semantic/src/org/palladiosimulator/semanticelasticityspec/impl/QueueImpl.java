/**
 */
package org.palladiosimulator.semanticelasticityspec.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.pcm.repository.PassiveResource;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.palladiosimulator.semanticelasticityspec.Queue;
import org.palladiosimulator.semanticelasticityspec.SemanticspdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.QueueImpl#getPassiveResourceQueueMessages <em>Passive Resource Queue Messages</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.QueueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.semanticelasticityspec.impl.QueueImpl#getUsageScenarioForConsumption <em>Usage Scenario For Consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueImpl extends MinimalEObjectImpl.Container implements Queue {
	/**
	 * The cached value of the '{@link #getPassiveResourceQueueMessages() <em>Passive Resource Queue Messages</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveResourceQueueMessages()
	 * @generated
	 * @ordered
	 */
	protected PassiveResource passiveResourceQueueMessages;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsageScenarioForConsumption() <em>Usage Scenario For Consumption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageScenarioForConsumption()
	 * @generated
	 * @ordered
	 */
	protected UsageScenario usageScenarioForConsumption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticspdPackage.Literals.QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource getPassiveResourceQueueMessages() {
		if (passiveResourceQueueMessages != null && passiveResourceQueueMessages.eIsProxy()) {
			InternalEObject oldPassiveResourceQueueMessages = (InternalEObject)passiveResourceQueueMessages;
			passiveResourceQueueMessages = (PassiveResource)eResolveProxy(oldPassiveResourceQueueMessages);
			if (passiveResourceQueueMessages != oldPassiveResourceQueueMessages) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES, oldPassiveResourceQueueMessages, passiveResourceQueueMessages));
			}
		}
		return passiveResourceQueueMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveResource basicGetPassiveResourceQueueMessages() {
		return passiveResourceQueueMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassiveResourceQueueMessages(PassiveResource newPassiveResourceQueueMessages) {
		PassiveResource oldPassiveResourceQueueMessages = passiveResourceQueueMessages;
		passiveResourceQueueMessages = newPassiveResourceQueueMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES, oldPassiveResourceQueueMessages, passiveResourceQueueMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.QUEUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario getUsageScenarioForConsumption() {
		if (usageScenarioForConsumption != null && usageScenarioForConsumption.eIsProxy()) {
			InternalEObject oldUsageScenarioForConsumption = (InternalEObject)usageScenarioForConsumption;
			usageScenarioForConsumption = (UsageScenario)eResolveProxy(oldUsageScenarioForConsumption);
			if (usageScenarioForConsumption != oldUsageScenarioForConsumption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SemanticspdPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION, oldUsageScenarioForConsumption, usageScenarioForConsumption));
			}
		}
		return usageScenarioForConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageScenario basicGetUsageScenarioForConsumption() {
		return usageScenarioForConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageScenarioForConsumption(UsageScenario newUsageScenarioForConsumption) {
		UsageScenario oldUsageScenarioForConsumption = usageScenarioForConsumption;
		usageScenarioForConsumption = newUsageScenarioForConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SemanticspdPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION, oldUsageScenarioForConsumption, usageScenarioForConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				if (resolve) return getPassiveResourceQueueMessages();
				return basicGetPassiveResourceQueueMessages();
			case SemanticspdPackage.QUEUE__NAME:
				return getName();
			case SemanticspdPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
				if (resolve) return getUsageScenarioForConsumption();
				return basicGetUsageScenarioForConsumption();
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
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				setPassiveResourceQueueMessages((PassiveResource)newValue);
				return;
			case SemanticspdPackage.QUEUE__NAME:
				setName((String)newValue);
				return;
			case SemanticspdPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
				setUsageScenarioForConsumption((UsageScenario)newValue);
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
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				setPassiveResourceQueueMessages((PassiveResource)null);
				return;
			case SemanticspdPackage.QUEUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SemanticspdPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
				setUsageScenarioForConsumption((UsageScenario)null);
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
			case SemanticspdPackage.QUEUE__PASSIVE_RESOURCE_QUEUE_MESSAGES:
				return passiveResourceQueueMessages != null;
			case SemanticspdPackage.QUEUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SemanticspdPackage.QUEUE__USAGE_SCENARIO_FOR_CONSUMPTION:
				return usageScenarioForConsumption != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QueueImpl
