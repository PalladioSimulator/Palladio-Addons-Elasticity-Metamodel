/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.spd.models.FuzzyLearningModel;
import org.palladiosimulator.spd.models.InitializationType;
import org.palladiosimulator.spd.models.ModelsPackage;
import org.palladiosimulator.spd.models.ResponseTimeSpecification;
import org.palladiosimulator.spd.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Fuzzy Learning
 * Model</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getWorkloadStimulus
 * <em>Workload Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getEpsilon
 * <em>Epsilon</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getDiscountFactor
 * <em>Discount Factor</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getInitializationType
 * <em>Initialization Type</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.impl.FuzzyLearningModelImpl#getResponseTimeSpecification
 * <em>Response Time Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FuzzyLearningModelImpl extends LearningBasedModelImpl implements FuzzyLearningModel {
    /**
     * The default value of the '{@link #getEpsilon() <em>Epsilon</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEpsilon()
     * @generated
     * @ordered
     */
    protected static final double EPSILON_EDEFAULT = 0.01;

    /**
     * The default value of the '{@link #getDiscountFactor() <em>Discount Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDiscountFactor()
     * @generated
     * @ordered
     */
    protected static final double DISCOUNT_FACTOR_EDEFAULT = 0.5;

    /**
     * The default value of the '{@link #getInitializationType() <em>Initialization Type</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInitializationType()
     * @generated
     * @ordered
     */
    protected static final InitializationType INITIALIZATION_TYPE_EDEFAULT = InitializationType.OPTIMISTIC;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected FuzzyLearningModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.FUZZY_LEARNING_MODEL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Stimulus getWorkloadStimulus() {
        return (Stimulus) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetWorkloadStimulus(final Stimulus newWorkloadStimulus, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newWorkloadStimulus,
                ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWorkloadStimulus(final Stimulus newWorkloadStimulus) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS, newWorkloadStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getEpsilon() {
        return (Double) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__EPSILON, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEpsilon(final double newEpsilon) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__EPSILON, newEpsilon);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getDiscountFactor() {
        return (Double) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDiscountFactor(final double newDiscountFactor) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR, newDiscountFactor);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InitializationType getInitializationType() {
        return (InitializationType) this.eDynamicGet(ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setInitializationType(final InitializationType newInitializationType) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE, newInitializationType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResponseTimeSpecification getResponseTimeSpecification() {
        return (ResponseTimeSpecification) this.eDynamicGet(
                ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetResponseTimeSpecification(
            final ResponseTimeSpecification newResponseTimeSpecification, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newResponseTimeSpecification,
                ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponseTimeSpecification(final ResponseTimeSpecification newResponseTimeSpecification) {
        this.eDynamicSet(ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION,
                ModelsPackage.Literals.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION, newResponseTimeSpecification);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            return this.basicSetWorkloadStimulus(null, msgs);
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION:
            return this.basicSetResponseTimeSpecification(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            return this.getWorkloadStimulus();
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            return this.getEpsilon();
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            return this.getDiscountFactor();
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            return this.getInitializationType();
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION:
            return this.getResponseTimeSpecification();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            this.setWorkloadStimulus((Stimulus) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            this.setEpsilon((Double) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            this.setDiscountFactor((Double) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            this.setInitializationType((InitializationType) newValue);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION:
            this.setResponseTimeSpecification((ResponseTimeSpecification) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            this.setWorkloadStimulus((Stimulus) null);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            this.setEpsilon(EPSILON_EDEFAULT);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            this.setDiscountFactor(DISCOUNT_FACTOR_EDEFAULT);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            this.setInitializationType(INITIALIZATION_TYPE_EDEFAULT);
            return;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION:
            this.setResponseTimeSpecification((ResponseTimeSpecification) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ModelsPackage.FUZZY_LEARNING_MODEL__WORKLOAD_STIMULUS:
            return this.getWorkloadStimulus() != null;
        case ModelsPackage.FUZZY_LEARNING_MODEL__EPSILON:
            return this.getEpsilon() != EPSILON_EDEFAULT;
        case ModelsPackage.FUZZY_LEARNING_MODEL__DISCOUNT_FACTOR:
            return this.getDiscountFactor() != DISCOUNT_FACTOR_EDEFAULT;
        case ModelsPackage.FUZZY_LEARNING_MODEL__INITIALIZATION_TYPE:
            return this.getInitializationType() != INITIALIZATION_TYPE_EDEFAULT;
        case ModelsPackage.FUZZY_LEARNING_MODEL__RESPONSE_TIME_SPECIFICATION:
            return this.getResponseTimeSpecification() != null;
        }
        return super.eIsSet(featureID);
    }

} // FuzzyLearningModelImpl
