/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.models;

import org.palladiosimulator.elasticity.triggers.stimuli.Stimulus;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Fuzzy Learning
 * Model</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Fuzzy Learning models use fuzzy reasoning combined with reinforcement
 * learning in order to keep the observed response time under a given target response time. <!--
 * end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getWorkloadStimulus
 * <em>Workload Stimulus</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getEpsilon
 * <em>Epsilon</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getDiscountFactor
 * <em>Discount Factor</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getInitializationType
 * <em>Initialization Type</em>}</li>
 * <li>{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getResponseTimeSpecification
 * <em>Response Time Specification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticity.models.ModelsPackage#getFuzzyLearningModel()
 * @model abstract="true"
 * @generated
 */
public interface FuzzyLearningModel extends LearningBasedModel {
    /**
     * Returns the value of the '<em><b>Workload Stimulus</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Workload Stimulus</em>' containment reference.
     * @see #setWorkloadStimulus(Stimulus)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getFuzzyLearningModel_WorkloadStimulus()
     * @model containment="true" required="true"
     * @generated
     */
    Stimulus getWorkloadStimulus();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getWorkloadStimulus
     * <em>Workload Stimulus</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Workload Stimulus</em>' containment reference.
     * @see #getWorkloadStimulus()
     * @generated
     */
    void setWorkloadStimulus(Stimulus value);

    /**
     * Returns the value of the '<em><b>Epsilon</b></em>' attribute. The default value is
     * <code>"0.01"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Epsilon</em>' attribute.
     * @see #setEpsilon(double)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getFuzzyLearningModel_Epsilon()
     * @model default="0.01" dataType="org.palladiosimulator.elasticity.datatypes.PercentDouble"
     * @generated
     */
    double getEpsilon();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getEpsilon
     * <em>Epsilon</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Epsilon</em>' attribute.
     * @see #getEpsilon()
     * @generated
     */
    void setEpsilon(double value);

    /**
     * Returns the value of the '<em><b>Discount Factor</b></em>' attribute. The default value is
     * <code>"0.5"</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Discount Factor</em>' attribute.
     * @see #setDiscountFactor(double)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getFuzzyLearningModel_DiscountFactor()
     * @model default="0.5" dataType="org.palladiosimulator.elasticity.datatypes.PercentDouble"
     * @generated
     */
    double getDiscountFactor();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getDiscountFactor
     * <em>Discount Factor</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Discount Factor</em>' attribute.
     * @see #getDiscountFactor()
     * @generated
     */
    void setDiscountFactor(double value);

    /**
     * Returns the value of the '<em><b>Initialization Type</b></em>' attribute. The literals are
     * from the enumeration {@link org.palladiosimulator.elasticity.models.InitializationType}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Initialization Type</em>' attribute.
     * @see org.palladiosimulator.elasticity.models.InitializationType
     * @see #setInitializationType(InitializationType)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getFuzzyLearningModel_InitializationType()
     * @model
     * @generated
     */
    InitializationType getInitializationType();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getInitializationType
     * <em>Initialization Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Initialization Type</em>' attribute.
     * @see org.palladiosimulator.elasticity.models.InitializationType
     * @see #getInitializationType()
     * @generated
     */
    void setInitializationType(InitializationType value);

    /**
     * Returns the value of the '<em><b>Response Time Specification</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Response Time Specification</em>' containment reference.
     * @see #setResponseTimeSpecification(ResponseTimeSpecification)
     * @see org.palladiosimulator.elasticity.models.ModelsPackage#getFuzzyLearningModel_ResponseTimeSpecification()
     * @model containment="true" required="true"
     * @generated
     */
    ResponseTimeSpecification getResponseTimeSpecification();

    /**
     * Sets the value of the
     * '{@link org.palladiosimulator.elasticity.models.FuzzyLearningModel#getResponseTimeSpecification
     * <em>Response Time Specification</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Response Time Specification</em>' containment reference.
     * @see #getResponseTimeSpecification()
     * @generated
     */
    void setResponseTimeSpecification(ResponseTimeSpecification value);

} // FuzzyLearningModel
