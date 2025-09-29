/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.models.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.elasticity.models.ModelsPackage;
import org.palladiosimulator.elasticity.models.ResponseTimeSpecification;
import org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.elasticity.triggers.stimuli.OperationResponseTime;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Response Time
 * Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.models.impl.ResponseTimeSpecificationImpl#getResponseTimeStimulus
 * <em>Response Time Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.impl.ResponseTimeSpecificationImpl#getTargetResponseTime
 * <em>Target Response Time</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.impl.ResponseTimeSpecificationImpl#getResponseTimeAggregationMethod
 * <em>Response Time Aggregation Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseTimeSpecificationImpl extends CDOObjectImpl implements ResponseTimeSpecification {
    /**
     * The default value of the '{@link #getTargetResponseTime() <em>Target Response Time</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTargetResponseTime()
     * @generated
     * @ordered
     */
    protected static final double TARGET_RESPONSE_TIME_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getResponseTimeAggregationMethod() <em>Response Time
     * Aggregation Method</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getResponseTimeAggregationMethod()
     * @generated
     * @ordered
     */
    protected static final AGGREGATIONMETHOD RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT = AGGREGATIONMETHOD.AVERAGE;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResponseTimeSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OperationResponseTime getResponseTimeStimulus() {
        return (OperationResponseTime) this.eDynamicGet(
                ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newResponseTimeStimulus,
                ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponseTimeStimulus(final OperationResponseTime newResponseTimeStimulus) {
        this.eDynamicSet(ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS,
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS, newResponseTimeStimulus);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getTargetResponseTime() {
        return (Double) this.eDynamicGet(ModelsPackage.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTargetResponseTime(final double newTargetResponseTime) {
        this.eDynamicSet(ModelsPackage.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME,
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME, newTargetResponseTime);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AGGREGATIONMETHOD getResponseTimeAggregationMethod() {
        return (AGGREGATIONMETHOD) this.eDynamicGet(
                ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD,
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setResponseTimeAggregationMethod(final AGGREGATIONMETHOD newResponseTimeAggregationMethod) {
        this.eDynamicSet(ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD,
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD,
                newResponseTimeAggregationMethod);
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
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS:
            return this.basicSetResponseTimeStimulus(null, msgs);
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
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus();
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime();
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD:
            return this.getResponseTimeAggregationMethod();
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
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) newValue);
            return;
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime((Double) newValue);
            return;
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD:
            this.setResponseTimeAggregationMethod((AGGREGATIONMETHOD) newValue);
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
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS:
            this.setResponseTimeStimulus((OperationResponseTime) null);
            return;
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME:
            this.setTargetResponseTime(TARGET_RESPONSE_TIME_EDEFAULT);
            return;
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD:
            this.setResponseTimeAggregationMethod(RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT);
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
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS:
            return this.getResponseTimeStimulus() != null;
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME:
            return this.getTargetResponseTime() != TARGET_RESPONSE_TIME_EDEFAULT;
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD:
            return this.getResponseTimeAggregationMethod() != RESPONSE_TIME_AGGREGATION_METHOD_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // ResponseTimeSpecificationImpl
