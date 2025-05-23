/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.PCMBaseClass;
import org.palladiosimulator.pcm.PCMClass;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.spd.ModelBasedScalingPolicy;
import org.palladiosimulator.spd.SPD;
import org.palladiosimulator.spd.ScalingPolicy;
import org.palladiosimulator.spd.SpdPackage;
import org.palladiosimulator.spd.TriggerBasedScalingPolicy;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.spd.SpdPackage
 * @generated
 */
public class SpdAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static SpdPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SpdAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SpdPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass()
                .getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected SpdSwitch<Adapter> modelSwitch = new SpdSwitch<>() {
        @Override
        public Adapter caseTriggerBasedScalingPolicy(final TriggerBasedScalingPolicy object) {
            return SpdAdapterFactory.this.createTriggerBasedScalingPolicyAdapter();
        }

        @Override
        public Adapter caseSPD(final SPD object) {
            return SpdAdapterFactory.this.createSPDAdapter();
        }

        @Override
        public Adapter caseScalingPolicy(final ScalingPolicy object) {
            return SpdAdapterFactory.this.createScalingPolicyAdapter();
        }

        @Override
        public Adapter caseModelBasedScalingPolicy(final ModelBasedScalingPolicy object) {
            return SpdAdapterFactory.this.createModelBasedScalingPolicyAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return SpdAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter casePCMClass(final PCMClass object) {
            return SpdAdapterFactory.this.createPCMClassAdapter();
        }

        @Override
        public Adapter casePCMBaseClass(final PCMBaseClass object) {
            return SpdAdapterFactory.this.createPCMBaseClassAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object) {
            return SpdAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object) {
            return SpdAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return SpdAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.TriggerBasedScalingPolicy <em>Trigger Based Scaling
     * Policy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.TriggerBasedScalingPolicy
     * @generated
     */
    public Adapter createTriggerBasedScalingPolicyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.ScalingPolicy
     * <em>Scaling Policy</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.ScalingPolicy
     * @generated
     */
    public Adapter createScalingPolicyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.spd.ModelBasedScalingPolicy <em>Model Based Scaling
     * Policy</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.ModelBasedScalingPolicy
     * @generated
     */
    public Adapter createModelBasedScalingPolicyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.spd.SPD
     * <em>SPD</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we
     * can easily ignore cases; it's useful to ignore a case when inheritance will catch all the
     * cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.spd.SPD
     * @generated
     */
    public Adapter createSPDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMClass
     * <em>PCM Class</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.PCMClass
     * @generated
     */
    public Adapter createPCMClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.PCMBaseClass
     * <em>PCM Base Class</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.PCMBaseClass
     * @generated
     */
    public Adapter createPCMBaseClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class
     * '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // SpdAdapterFactory
