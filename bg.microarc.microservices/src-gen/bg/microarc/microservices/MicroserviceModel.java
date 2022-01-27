/**
 */
package bg.microarc.microservices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bg.microarc.microservices.MicroserviceModel#getName <em>Name</em>}</li>
 *   <li>{@link bg.microarc.microservices.MicroserviceModel#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 *
 * @see bg.microarc.microservices.MicroservicesPackage#getMicroserviceModel()
 * @model
 * @generated
 */
public interface MicroserviceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bg.microarc.microservices.MicroservicesPackage#getMicroserviceModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bg.microarc.microservices.MicroserviceModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modelelements</b></em>' containment reference list.
	 * The list contents are of type {@link bg.microarc.microservices.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelements</em>' containment reference list.
	 * @see bg.microarc.microservices.MicroservicesPackage#getMicroserviceModel_Modelelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelelements();

} // MicroserviceModel
