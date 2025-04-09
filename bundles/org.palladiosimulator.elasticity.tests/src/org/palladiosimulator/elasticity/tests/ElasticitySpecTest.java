/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.tests;

import org.palladiosimulator.elasticity.ElasticityFactory;
import org.palladiosimulator.elasticity.ElasticitySpec;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Spec</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ElasticitySpecTest extends TestCase {

    /**
     * The fixture for this Spec test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ElasticitySpec fixture = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ElasticitySpecTest.class);
    }

    /**
     * Constructs a new Spec test case with the given name. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ElasticitySpecTest(final String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Spec test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void setFixture(final ElasticitySpec fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Spec test case. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ElasticitySpec getFixture() {
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
        this.setFixture(ElasticityFactory.eINSTANCE.createElasticitySpec());
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

} // ElasticitySpecTest
