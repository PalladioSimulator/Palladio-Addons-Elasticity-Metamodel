/**
 */
package de.unistuttgart.slingshot.spd.adjustments.tests;

import de.unistuttgart.slingshot.spd.adjustments.AdjustmentsFactory;
import de.unistuttgart.slingshot.spd.adjustments.StepAdjustment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Step Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepAdjustmentTest extends AdjustmentTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StepAdjustmentTest.class);
	}

	/**
	 * Constructs a new Step Adjustment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepAdjustmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Step Adjustment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StepAdjustment getFixture() {
		return (StepAdjustment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdjustmentsFactory.eINSTANCE.createStepAdjustment());
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

} //StepAdjustmentTest
