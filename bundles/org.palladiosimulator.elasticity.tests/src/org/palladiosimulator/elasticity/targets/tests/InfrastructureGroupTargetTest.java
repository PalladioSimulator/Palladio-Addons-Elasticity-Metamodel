/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.targets.tests;

import org.palladiosimulator.elasticity.targets.InfrastructureGroupTarget;
import org.palladiosimulator.elasticity.targets.TargetsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Infrastructure Group
 * Target</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class InfrastructureGroupTargetTest extends TargetGroupTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static void main(final String[] args) {
        TestRunner.run(InfrastructureGroupTargetTest.class);
    }

    /**
     * Constructs a new Infrastructure Group Target test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public InfrastructureGroupTargetTest(final String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Infrastructure Group Target test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected InfrastructureGroupTarget getFixture() {
        return (InfrastructureGroupTarget) this.fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        this.setFixture(TargetsFactory.eINSTANCE.createInfrastructureGroupTarget());
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

} // InfrastructureGroupTargetTest
