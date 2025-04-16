/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.scalablepcmgroups.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class scalablepcmgroupsFactoryImpl extends EFactoryImpl implements scalablepcmgroupsFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static scalablepcmgroupsFactory init() {
        try {
            scalablepcmgroupsFactory thescalablepcmgroupsFactory = (scalablepcmgroupsFactory)EPackage.Registry.INSTANCE.getEFactory(scalablepcmgroupsPackage.eNS_URI);
            if (thescalablepcmgroupsFactory != null) {
                return thescalablepcmgroupsFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new scalablepcmgroupsFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public scalablepcmgroupsFactoryImpl() {
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
            case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS: return createScalablePCMGroups();
            case scalablepcmgroupsPackage.INFRASTRUCTURE_GROUP: return createInfrastructureGroup();
            case scalablepcmgroupsPackage.SERVICE_GROUP: return createServiceGroup();
            case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP: return createCompetingConsumersGroup();
            case scalablepcmgroupsPackage.QUEUE: return createQueue();
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
    public ScalablePCMGroups createScalablePCMGroups() {
        ScalablePCMGroupsImpl scalablePCMGroups = new ScalablePCMGroupsImpl();
        return scalablePCMGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public InfrastructureGroup createInfrastructureGroup() {
        InfrastructureGroupImpl infrastructureGroup = new InfrastructureGroupImpl();
        return infrastructureGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ServiceGroup createServiceGroup() {
        ServiceGroupImpl serviceGroup = new ServiceGroupImpl();
        return serviceGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CompetingConsumersGroup createCompetingConsumersGroup() {
        CompetingConsumersGroupImpl competingConsumersGroup = new CompetingConsumersGroupImpl();
        return competingConsumersGroup;
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
    public scalablepcmgroupsPackage getscalablepcmgroupsPackage() {
        return (scalablepcmgroupsPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static scalablepcmgroupsPackage getPackage() {
        return scalablepcmgroupsPackage.eINSTANCE;
    }

} //scalablepcmgroupsFactoryImpl
