/**
 */
package org.palladiosimulator.scalablepcmgroups.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.scalablepcmgroups.ServiceGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceGroupTest extends TargetGroupTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ServiceGroupTest.class);
    }

    /**
     * Constructs a new Service Group test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceGroupTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Service Group test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ServiceGroup getFixture() {
        return (ServiceGroup)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(scalablepcmgroupsFactory.eINSTANCE.createServiceGroup());
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

} //ServiceGroupTest
