/**
 */
package bg.microarc.bmc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BMC Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bg.microarc.bmc.BMCModel#getName <em>Name</em>}</li>
 *   <li>{@link bg.microarc.bmc.BMCModel#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 *
 * @see bg.microarc.bmc.BmcPackage#getBMCModel()
 * @model
 * @generated
 */
public interface BMCModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bg.microarc.bmc.BmcPackage#getBMCModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bg.microarc.bmc.BMCModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modelelements</b></em>' containment reference list.
	 * The list contents are of type {@link bg.microarc.bmc.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelements</em>' containment reference list.
	 * @see bg.microarc.bmc.BmcPackage#getBMCModel_Modelelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelelements();

} // BMCModel
