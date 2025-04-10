/**
 */
package org.palladiosimulator.spdmeasuringpoint.tests;

import org.palladiosimulator.spdmeasuringpoint.ServiceGroupMeasuringPoint;
import org.palladiosimulator.spdmeasuringpoint.SpdmeasuringpointFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Service Group Measuring
 * Point</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ServiceGroupMeasuringPointTest extends TestCase {

    /**
     * The fixture for this Service Group Measuring Point test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected ServiceGroupMeasuringPoint fixture = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(ServiceGroupMeasuringPointTest.class);
    }

    /**
     * Constructs a new Service Group Measuring Point test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ServiceGroupMeasuringPointTest(final String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Service Group Measuring Point test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void setFixture(final ServiceGroupMeasuringPoint fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Service Group Measuring Point test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected ServiceGroupMeasuringPoint getFixture() {
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
        this.setFixture(SpdmeasuringpointFactory.eINSTANCE.createServiceGroupMeasuringPoint());
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

} // ServiceGroupMeasuringPointTest
