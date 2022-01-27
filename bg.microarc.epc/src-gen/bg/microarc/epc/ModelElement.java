/**
 */
package bg.microarc.epc;

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
 *   <li>{@link bg.microarc.epc.ModelElement#getName <em>Name</em>}</li>
 *   <li>{@link bg.microarc.epc.ModelElement#getConnnection <em>Connnection</em>}</li>
 * </ul>
 *
 * @see bg.microarc.epc.EpcPackage#getModelElement()
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
	 * @see bg.microarc.epc.EpcPackage#getModelElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bg.microarc.epc.ModelElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connnection</b></em>' reference list.
	 * The list contents are of type {@link bg.microarc.epc.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connnection</em>' reference list.
	 * @see bg.microarc.epc.EpcPackage#getModelElement_Connnection()
	 * @model derived="true"
	 * @generated
	 */
	EList<ModelElement> getConnnection();

} // ModelElement
