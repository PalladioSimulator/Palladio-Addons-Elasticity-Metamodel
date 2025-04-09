/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.models;

import org.eclipse.emf.cdo.CDOObject;
import org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD;
import org.palladiosimulator.elasticity.triggers.stimuli.OperationResponseTime;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Response Time
 * Specification</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The ResponseTimeSpecification groups settings regarding the observation
 * of response times including the performed aggregation and the target response time a learning
 * model should adhere to. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.models.ResponseTimeSpecification#getResponseTimeStimulus
 * <em>Response Time Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.ResponseTimeSpecification#getTargetResponseTime
 * <em>Target Response Time</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.ResponseTimeSpecification#getResponseTimeAggregationMethod
 * <em>Response Time Aggregation Method</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.models.ModelsPackage#getResponseTimeSpecification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ResponseTimeSpecification extends CDOObject {
    /**
     * Returns the value of the '<em><b>Response Time Stimulus</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Response Time Stimulus</em>' reference.
     * @see #setResponseTimeStimulus(OperationResponseTime)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getResponseTimeSpecification_ResponseTimeStimulus()
     * @model required="true"
     * @generated
     */
    OperationResponseTime getResponseTimeStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.ResponseTimeSpecification#getResponseTimeStimulus
     * <em>Response Time Stimulus</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Response Time Stimulus</em>' reference.
     * @see #getResponseTimeStimulus()
     * @generated
     */
    void setResponseTimeStimulus(OperationResponseTime value);

    /**
     * Returns the value of the '<em><b>Target Response Time</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Target Response Time</em>' attribute.
     * @see #setTargetResponseTime(double)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getResponseTimeSpecification_TargetResponseTime()
     * @model dataType="org.palladiosimulator.spd.datatypes.PositiveDouble"
     * @generated
     */
    double getTargetResponseTime();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.ResponseTimeSpecification#getTargetResponseTime
     * <em>Target Response Time</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Target Response Time</em>' attribute.
     * @see #getTargetResponseTime()
     * @generated
     */
    void setTargetResponseTime(double value);

    /**
     * Returns the value of the '<em><b>Response Time Aggregation Method</b></em>' attribute. The
     * literals are from the enumeration
     * {@link org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD}. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the value of the '<em>Response Time Aggregation Method</em>' attribute.
     * @see org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD
     * @see #setResponseTimeAggregationMethod(AGGREGATIONMETHOD)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getResponseTimeSpecification_ResponseTimeAggregationMethod()
     * @model
     * @generated
     */
    AGGREGATIONMETHOD getResponseTimeAggregationMethod();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.ResponseTimeSpecification#getResponseTimeAggregationMethod
     * <em>Response Time Aggregation Method</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Response Time Aggregation Method</em>' attribute.
     * @see org.palladiosimulator.elasticity.triggers.AGGREGATIONMETHOD
     * @see #getResponseTimeAggregationMethod()
     * @generated
     */
    void setResponseTimeAggregationMethod(AGGREGATIONMETHOD value);

} // ResponseTimeSpecification
