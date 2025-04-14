/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.tests;

import org.palladiosimulator.elasticity.targets.tests.TargetsTests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>ElasticitySpec</b></em>' model. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class ElasticitySpecAllTests extends TestSuite {

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
        final TestSuite suite = new ElasticitySpecAllTests("ElasticitySpec Tests");
        suite.addTest(ElasticityTests.suite());
        suite.addTest(TargetsTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ElasticitySpecAllTests(final String name) {
        super(name);
    }

} // ElasticitySpecAllTests
