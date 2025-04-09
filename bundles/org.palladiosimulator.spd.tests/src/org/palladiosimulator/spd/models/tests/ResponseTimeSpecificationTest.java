/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.models.tests;

import org.palladiosimulator.spd.models.ModelsFactory;
import org.palladiosimulator.spd.models.ResponseTimeSpecification;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Response Time
 * Specification</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseTimeSpecificationTest extends TestCase {

    /**
     * The fixture for this Response Time Specification test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ResponseTimeSpecification fixture = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ResponseTimeSpecificationTest.class);
    }

    /**
     * Constructs a new Response Time Specification test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ResponseTimeSpecificationTest(final String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Response Time Specification test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void setFixture(final ResponseTimeSpecification fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Response Time Specification test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ResponseTimeSpecification getFixture() {
        return this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(ModelsFactory.eINSTANCE.createResponseTimeSpecification());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        this.setFixture(null);
    }

} // ResponseTimeSpecificationTest
