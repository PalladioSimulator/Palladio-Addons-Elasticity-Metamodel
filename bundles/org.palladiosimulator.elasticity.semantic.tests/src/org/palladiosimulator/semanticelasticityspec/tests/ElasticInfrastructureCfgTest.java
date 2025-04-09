/**
 */
package org.palladiosimulator.semanticelasticityspec.tests;

import org.palladiosimulator.semanticelasticityspec.ElasticInfrastructureCfg;
import org.palladiosimulator.semanticelasticityspec.SemanticelasticityFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elastic Infrastructure Cfg</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElasticInfrastructureCfgTest extends TargetGroupCfgTest {

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static void main(String[] args) {
        TestRunner.run(ElasticInfrastructureCfgTest.class);
    }

	/**
     * Constructs a new Elastic Infrastructure Cfg test case with the given name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ElasticInfrastructureCfgTest(String name) {
        super(name);
    }

	/**
     * Returns the fixture for this Elastic Infrastructure Cfg test case.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected ElasticInfrastructureCfg getFixture() {
        return (ElasticInfrastructureCfg)fixture;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
	@Override
	protected void setUp() throws Exception {
        setFixture(SemanticelasticityFactory.eINSTANCE.createElasticInfrastructureCfg());
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

} //ElasticInfrastructureCfgTest
