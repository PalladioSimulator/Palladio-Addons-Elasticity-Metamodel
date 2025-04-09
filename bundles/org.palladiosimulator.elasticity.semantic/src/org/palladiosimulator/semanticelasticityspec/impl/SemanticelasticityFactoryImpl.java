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
public class SemanticelasticityFactoryImpl extends EFactoryImpl implements SemanticelasticityFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SemanticelasticityFactory init() {
        try {
            SemanticelasticityFactory theSemanticelasticityFactory = (SemanticelasticityFactory)EPackage.Registry.INSTANCE.getEFactory(SemanticelasticityPackage.eNS_URI);
            if (theSemanticelasticityFactory != null) {
                return theSemanticelasticityFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SemanticelasticityFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SemanticelasticityFactoryImpl() {
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
            case SemanticelasticityPackage.CONFIGURATION: return createConfiguration();
            case SemanticelasticityPackage.ELASTIC_INFRASTRUCTURE_CFG: return createElasticInfrastructureCfg();
            case SemanticelasticityPackage.SERVICE_GROUP_CFG: return createServiceGroupCfg();
            case SemanticelasticityPackage.COMPETING_CONSUMERS_GROUP_CFG: return createCompetingConsumersGroupCfg();
            case SemanticelasticityPackage.QUEUE: return createQueue();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Configuration createConfiguration() {
        ConfigurationImpl configuration = new ConfigurationImpl();
        return configuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElasticInfrastructureCfg createElasticInfrastructureCfg() {
        ElasticInfrastructureCfgImpl elasticInfrastructureCfg = new ElasticInfrastructureCfgImpl();
        return elasticInfrastructureCfg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceGroupCfg createServiceGroupCfg() {
        ServiceGroupCfgImpl serviceGroupCfg = new ServiceGroupCfgImpl();
        return serviceGroupCfg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CompetingConsumersGroupCfg createCompetingConsumersGroupCfg() {
        CompetingConsumersGroupCfgImpl competingConsumersGroupCfg = new CompetingConsumersGroupCfgImpl();
        return competingConsumersGroupCfg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Queue createQueue() {
        QueueImpl queue = new QueueImpl();
        return queue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SemanticelasticityPackage getSemanticelasticityPackage() {
        return (SemanticelasticityPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SemanticelasticityPackage getPackage() {
        return SemanticelasticityPackage.eINSTANCE;
    }

} //SemanticelasticityFactoryImpl
