/**
 */
package org.palladiosimulator.semanticelasticityspec.tests;

import org.palladiosimulator.semanticelasticityspec.ServiceGroupCfg;

import junit.textui.TestRunner;
import org.palladiosimulator.semanticelasticityspec.SemanticelasticityFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Group Cfg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceGroupCfgTest extends TargetGroupCfgTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(ServiceGroupCfgTest.class);
    }

	/**
     * Constructs a new Service Group Cfg test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ServiceGroupCfgTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Service Group Cfg test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected ServiceGroupCfg getFixture() {
        return (ServiceGroupCfg)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(SemanticelasticityFactory.eINSTANCE.createServiceGroupCfg());
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

} //ServiceGroupCfgTest
