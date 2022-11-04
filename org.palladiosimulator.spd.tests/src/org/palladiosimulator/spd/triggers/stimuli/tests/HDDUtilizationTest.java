/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.spd.triggers.stimuli.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.spd.triggers.stimuli.HDDUtilization;
import org.palladiosimulator.spd.triggers.stimuli.StimuliFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>HDD Utilization</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HDDUtilizationTest extends ResourceUtilizationStimulusTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HDDUtilizationTest.class);
	}

	/**
	 * Constructs a new HDD Utilization test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDDUtilizationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this HDD Utilization test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HDDUtilization getFixture() {
		return (HDDUtilization)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StimuliFactory.eINSTANCE.createHDDUtilization());
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

} //HDDUtilizationTest
