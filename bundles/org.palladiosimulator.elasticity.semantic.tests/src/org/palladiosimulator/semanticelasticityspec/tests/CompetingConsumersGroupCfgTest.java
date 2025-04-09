/**
 */
package org.palladiosimulator.semanticelasticityspec.tests;

import org.palladiosimulator.semanticelasticityspec.CompetingConsumersGroupCfg;
import org.palladiosimulator.semanticelasticityspec.SemanticspdFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Competing Consumers Group Cfg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompetingConsumersGroupCfgTest extends TargetGroupCfgTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompetingConsumersGroupCfgTest.class);
	}

	/**
	 * Constructs a new Competing Consumers Group Cfg test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompetingConsumersGroupCfgTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Competing Consumers Group Cfg test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompetingConsumersGroupCfg getFixture() {
		return (CompetingConsumersGroupCfg)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SemanticspdFactory.eINSTANCE.createCompetingConsumersGroupCfg());
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

} //CompetingConsumersGroupCfgTest
