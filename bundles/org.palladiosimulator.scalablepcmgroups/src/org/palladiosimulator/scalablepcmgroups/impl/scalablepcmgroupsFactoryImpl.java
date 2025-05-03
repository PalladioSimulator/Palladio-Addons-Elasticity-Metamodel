/**
 */
package org.palladiosimulator.scalablepcmgroups.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup;
import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;
import org.palladiosimulator.scalablepcmgroups.Queue;
import org.palladiosimulator.scalablepcmgroups.ScalablePCMGroups;
import org.palladiosimulator.scalablepcmgroups.ServiceGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsFactory;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class scalablepcmgroupsFactoryImpl extends EFactoryImpl implements scalablepcmgroupsFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static scalablepcmgroupsFactory init() {
        try {
            final scalablepcmgroupsFactory thescalablepcmgroupsFactory = (scalablepcmgroupsFactory) EPackage.Registry.INSTANCE
                .getEFactory(scalablepcmgroupsPackage.eNS_URI);
            if (thescalablepcmgroupsFactory != null) {
                return thescalablepcmgroupsFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new scalablepcmgroupsFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public scalablepcmgroupsFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case scalablepcmgroupsPackage.SCALABLE_PCM_GROUPS:
            return this.createScalablePCMGroups();
        case scalablepcmgroupsPackage.INFRASTRUCTURE_GROUP:
            return this.createInfrastructureGroup();
        case scalablepcmgroupsPackage.SERVICE_GROUP:
            return this.createServiceGroup();
        case scalablepcmgroupsPackage.COMPETING_CONSUMERS_GROUP:
            return this.createCompetingConsumersGroup();
        case scalablepcmgroupsPackage.QUEUE:
            return this.createQueue();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ScalablePCMGroups createScalablePCMGroups() {
        final ScalablePCMGroupsImpl scalablePCMGroups = new ScalablePCMGroupsImpl();
        return scalablePCMGroups;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InfrastructureGroup createInfrastructureGroup() {
        final InfrastructureGroupImpl infrastructureGroup = new InfrastructureGroupImpl();
        return infrastructureGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ServiceGroup createServiceGroup() {
        final ServiceGroupImpl serviceGroup = new ServiceGroupImpl();
        return serviceGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CompetingConsumersGroup createCompetingConsumersGroup() {
        final CompetingConsumersGroupImpl competingConsumersGroup = new CompetingConsumersGroupImpl();
        return competingConsumersGroup;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Queue createQueue() {
        final QueueImpl queue = new QueueImpl();
        return queue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public scalablepcmgroupsPackage getscalablepcmgroupsPackage() {
        return (scalablepcmgroupsPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static scalablepcmgroupsPackage getPackage() {
        return scalablepcmgroupsPackage.eINSTANCE;
    }

} // scalablepcmgroupsFactoryImpl
