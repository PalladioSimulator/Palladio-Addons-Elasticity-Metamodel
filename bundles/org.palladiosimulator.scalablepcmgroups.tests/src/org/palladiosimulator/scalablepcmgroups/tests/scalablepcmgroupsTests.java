/**
 */
package org.palladiosimulator.scalablepcmgroups.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>scalablepcmgroups</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class scalablepcmgroupsTests extends TestSuite {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite() {
        TestSuite suite = new scalablepcmgroupsTests("scalablepcmgroups Tests");
        suite.addTestSuite(ScalablePCMGroupsTest.class);
        suite.addTestSuite(InfrastructureGroupTest.class);
        suite.addTestSuite(ServiceGroupTest.class);
        suite.addTestSuite(CompetingConsumersGroupTest.class);
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public scalablepcmgroupsTests(String name) {
        super(name);
    }

} //scalablepcmgroupsTests
