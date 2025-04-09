/**
 */
package org.palladiosimulator.semanticelasticityspec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.semanticelasticityspec.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticspdFactoryImpl extends EFactoryImpl implements SemanticspdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SemanticspdFactory init() {
		try {
			SemanticspdFactory theSemanticspdFactory = (SemanticspdFactory)EPackage.Registry.INSTANCE.getEFactory(SemanticspdPackage.eNS_URI);
			if (theSemanticspdFactory != null) {
				return theSemanticspdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SemanticspdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticspdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SemanticspdPackage.CONFIGURATION: return createConfiguration();
			case SemanticspdPackage.ELASTIC_INFRASTRUCTURE_CFG: return createElasticInfrastructureCfg();
			case SemanticspdPackage.SERVICE_GROUP_CFG: return createServiceGroupCfg();
			case SemanticspdPackage.COMPETING_CONSUMERS_GROUP_CFG: return createCompetingConsumersGroupCfg();
			case SemanticspdPackage.QUEUE: return createQueue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticInfrastructureCfg createElasticInfrastructureCfg() {
		ElasticInfrastructureCfgImpl elasticInfrastructureCfg = new ElasticInfrastructureCfgImpl();
		return elasticInfrastructureCfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceGroupCfg createServiceGroupCfg() {
		ServiceGroupCfgImpl serviceGroupCfg = new ServiceGroupCfgImpl();
		return serviceGroupCfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompetingConsumersGroupCfg createCompetingConsumersGroupCfg() {
		CompetingConsumersGroupCfgImpl competingConsumersGroupCfg = new CompetingConsumersGroupCfgImpl();
		return competingConsumersGroupCfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Queue createQueue() {
		QueueImpl queue = new QueueImpl();
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticspdPackage getSemanticspdPackage() {
		return (SemanticspdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SemanticspdPackage getPackage() {
		return SemanticspdPackage.eINSTANCE;
	}

} //SemanticspdFactoryImpl
