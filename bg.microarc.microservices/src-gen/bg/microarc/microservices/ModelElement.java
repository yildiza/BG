/**
 */
package bg.microarc.microservices;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bg.microarc.microservices.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link bg.microarc.microservices.ModelElement#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see bg.microarc.microservices.MicroservicesPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bg.microarc.microservices.MicroservicesPackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bg.microarc.microservices.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference list.
	 * The list contents are of type {@link bg.microarc.microservices.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference list.
	 * @see bg.microarc.microservices.MicroservicesPackage#getModelElement_Connection()
	 * @model derived="true"
	 * @generated
	 */
	EList<ModelElement> getConnection();

} // ModelElement
