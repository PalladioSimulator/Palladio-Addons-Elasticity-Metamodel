/**
 */
package spd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link spd.SPD#getScalingpolicy <em>Scalingpolicy</em>}</li>
 *   <li>{@link spd.SPD#getName <em>Name</em>}</li>
 *   <li>{@link spd.SPD#getTargetgroup <em>Targetgroup</em>}</li>
 * </ul>
 *
 * @see spd.SpdPackage#getSPD()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameInvariant'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameInvariant='name &lt;&gt;\'\''"
 * @generated
 */
public interface SPD extends EObject {
	/**
	 * Returns the value of the '<em><b>Scalingpolicy</b></em>' containment reference list.
	 * The list contents are of type {@link spd.ScalingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalingpolicy</em>' containment reference list.
	 * @see spd.SpdPackage#getSPD_Scalingpolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ScalingPolicy> getScalingpolicy();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see spd.SpdPackage#getSPD_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link spd.SPD#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Targetgroup</b></em>' containment reference list.
	 * The list contents are of type {@link spd.TargetGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetgroup</em>' containment reference list.
	 * @see spd.SpdPackage#getSPD_Targetgroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<TargetGroup> getTargetgroup();

} // SPD
