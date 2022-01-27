/**
 */
package bg.microarc.epc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bg.microarc.epc.Process#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 *
 * @see bg.microarc.epc.EpcPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Modelelements</b></em>' containment reference list.
	 * The list contents are of type {@link bg.microarc.epc.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelelements</em>' containment reference list.
	 * @see bg.microarc.epc.EpcPackage#getProcess_Modelelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelElement> getModelelements();

} // Process
