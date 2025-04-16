/**
 */
package org.palladiosimulator.scalablepcmgroups.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.scalablepcmgroups.Queue;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueueTest extends TestCase {

    /**
     * The fixture for this Queue test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Queue fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(QueueTest.class);
    }

    /**
     * Constructs a new Queue test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QueueTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Queue test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(Queue fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Queue test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Queue getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(scalablepcmgroupsFactory.eINSTANCE.createQueue());
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

} //QueueTest
