/**
 */
package org.palladiosimulator.scalablepcmgroups.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.scalablepcmgroups.InfrastructureGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureGroupTest extends TargetGroupTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(InfrastructureGroupTest.class);
    }

    /**
     * Constructs a new Infrastructure Group test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InfrastructureGroupTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Infrastructure Group test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected InfrastructureGroup getFixture() {
        return (InfrastructureGroup)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(scalablepcmgroupsFactory.eINSTANCE.createInfrastructureGroup());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //InfrastructureGroupTest
