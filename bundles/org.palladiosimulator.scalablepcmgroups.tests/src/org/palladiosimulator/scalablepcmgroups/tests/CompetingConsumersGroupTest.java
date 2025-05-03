/**
 */
package org.palladiosimulator.scalablepcmgroups.tests;

import junit.textui.TestRunner;

import org.palladiosimulator.scalablepcmgroups.CompetingConsumersGroup;
import org.palladiosimulator.scalablepcmgroups.scalablepcmgroupsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Competing Consumers Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompetingConsumersGroupTest extends TargetGroupTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(CompetingConsumersGroupTest.class);
    }

    /**
     * Constructs a new Competing Consumers Group test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CompetingConsumersGroupTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Competing Consumers Group test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected CompetingConsumersGroup getFixture() {
        return (CompetingConsumersGroup)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(scalablepcmgroupsFactory.eINSTANCE.createCompetingConsumersGroup());
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

} //CompetingConsumersGroupTest
