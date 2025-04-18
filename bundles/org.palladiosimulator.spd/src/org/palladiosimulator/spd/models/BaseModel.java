/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Base Model</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> The BaseModel is the parent for all models used for model-based scaling.
 * It enables the core concepts of models, i.e. periodical adjustments based on the model output,
 * and contains common attributes. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.spd.models.BaseModel#getInterval <em>Interval</em>}</li>
 * <li>{@link org.palladiosimulator.spd.models.BaseModel#getIntervalOffset <em>Interval
 * Offset</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.spd.models.ModelsPackage#getBaseModel()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface BaseModel extends CDOObject {

    /**
     * Returns the value of the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc --> <!-- begin-model-doc --> The interval after which a scaling decision should
     * be made by the model, in seconds. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Interval</em>' attribute.
     * @see #setInterval(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getBaseModel_Interval()
     * @model required="true"
     * @generated
     */
    double getInterval();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.BaseModel#getInterval
     * <em>Interval</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Interval</em>' attribute.
     * @see #getInterval()
     * @generated
     */
    void setInterval(double value);

    /**
     * Returns the value of the '<em><b>Interval Offset</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc --> <!-- begin-model-doc --> The intervalOffset gives an initial offset
     * after which a scaling decision is made each interval. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Interval Offset</em>' attribute.
     * @see #setIntervalOffset(double)
     * @see org.palladiosimulator.spd.models.ModelsPackage#getBaseModel_IntervalOffset()
     * @model required="true"
     * @generated
     */
    double getIntervalOffset();

    /**
     * Sets the value of the '{@link org.palladiosimulator.spd.models.BaseModel#getIntervalOffset
     * <em>Interval Offset</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Interval Offset</em>' attribute.
     * @see #getIntervalOffset()
     * @generated
     */
    void setIntervalOffset(double value);

} // BaseModel
