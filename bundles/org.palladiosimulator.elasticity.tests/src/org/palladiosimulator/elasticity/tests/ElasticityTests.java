/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>elasticity</b></em>' package. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ElasticityTests extends TestSuite {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static Test suite() {
        final TestSuite suite = new ElasticityTests("elasticity Tests");
        suite.addTestSuite(TriggerBasedScalingPolicyTest.class);
        suite.addTestSuite(ElasticitySpecTest.class);
        suite.addTestSuite(ModelBasedScalingPolicyTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ElasticityTests(final String name) {
        super(name);
    }

} // ElasticityTests
