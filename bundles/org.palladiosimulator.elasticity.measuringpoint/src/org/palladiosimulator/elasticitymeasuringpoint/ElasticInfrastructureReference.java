/**
 */
package org.palladiosimulator.elasticitymeasuringpoint;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.elasticity.targets.ElasticInfrastructure;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Elastic Infrastructure
 * Reference</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference#getElasticInfrastructure <em>Elastic Infrastructure</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.elasticitymeasuringpoint.ElasticitymeasuringpointPackage#getElasticInfrastructureReference()
 * @model abstract="true"
 * @generated
 */
public interface ElasticInfrastructureReference extends EObject {
    /**
     * Returns the value of the '<em><b>Elastic Infrastructure</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the value of the '<em>Elastic Infrastructure</em>' reference.
     * @see #setElasticInfrastructure(ElasticInfrastructure)
     * @see org.palladiosimulator.elasticitymeasuringpoint.SpdmeasuringpointPackage#getElasticInfrastructureReference_ElasticInfrastructure()
     * @model required="true"
     * @generated
     */
    ElasticInfrastructure getElasticInfrastructure();

    /**
     * Sets the value of the '{@link org.palladiosimulator.elasticitymeasuringpoint.ElasticInfrastructureReference#getElasticInfrastructure <em>Elastic Infrastructure</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @param value the new value of the '<em>Elastic Infrastructure</em>' reference.
     * @see #getElasticInfrastructure()
     * @generated
     */
    void setElasticInfrastructure(ElasticInfrastructure value);

} // ElasticInfrastructureReference
