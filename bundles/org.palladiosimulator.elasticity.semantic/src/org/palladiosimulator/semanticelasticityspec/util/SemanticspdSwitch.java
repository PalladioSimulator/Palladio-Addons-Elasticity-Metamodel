/**
 */
package org.palladiosimulator.semanticelasticityspec.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.semanticelasticityspec.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.semanticelasticityspec.SemanticspdPackage
 * @generated
 */
public class SemanticspdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SemanticspdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticspdSwitch() {
		if (modelPackage == null) {
			modelPackage = SemanticspdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SemanticspdPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticspdPackage.TARGET_GROUP_CFG: {
				TargetGroupCfg targetGroupCfg = (TargetGroupCfg)theEObject;
				T result = caseTargetGroupCfg(targetGroupCfg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG: {
				ElasticInfrastructureCfg elasticInfrastructureCfg = (ElasticInfrastructureCfg)theEObject;
				T result = caseElasticInfrastructureCfg(elasticInfrastructureCfg);
				if (result == null) result = caseTargetGroupCfg(elasticInfrastructureCfg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticspdPackage.SERVICE_GROUP_CFG: {
				ServiceGroupCfg serviceGroupCfg = (ServiceGroupCfg)theEObject;
				T result = caseServiceGroupCfg(serviceGroupCfg);
				if (result == null) result = caseTargetGroupCfg(serviceGroupCfg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticspdPackage.COMPETING_CONSUMERS_GROUP_CFG: {
				CompetingConsumersGroupCfg competingConsumersGroupCfg = (CompetingConsumersGroupCfg)theEObject;
				T result = caseCompetingConsumersGroupCfg(competingConsumersGroupCfg);
				if (result == null) result = caseTargetGroupCfg(competingConsumersGroupCfg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SemanticspdPackage.QUEUE: {
				Queue queue = (Queue)theEObject;
				T result = caseQueue(queue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Group Cfg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Group Cfg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetGroupCfg(TargetGroupCfg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elastic Infrastructure Cfg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elastic Infrastructure Cfg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticInfrastructureCfg(ElasticInfrastructureCfg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Group Cfg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Group Cfg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceGroupCfg(ServiceGroupCfg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Competing Consumers Group Cfg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Competing Consumers Group Cfg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompetingConsumersGroupCfg(CompetingConsumersGroupCfg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueue(Queue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SemanticspdSwitch
