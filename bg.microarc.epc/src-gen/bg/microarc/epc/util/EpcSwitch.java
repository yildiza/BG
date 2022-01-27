/**
 */
package bg.microarc.epc.util;

import bg.microarc.epc.And;
import bg.microarc.epc.Database;
import bg.microarc.epc.Document;
import bg.microarc.epc.EpcPackage;
import bg.microarc.epc.Event;
import bg.microarc.epc.ModelElement;
import bg.microarc.epc.Operators;
import bg.microarc.epc.Or;
import bg.microarc.epc.ProcessElements;
import bg.microarc.epc.ProcessInterface;
import bg.microarc.epc.ProcessPath;
import bg.microarc.epc.Role;
import bg.microarc.epc.Xor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see bg.microarc.epc.EpcPackage
 * @generated
 */
public class EpcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EpcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpcSwitch() {
		if (modelPackage == null) {
			modelPackage = EpcPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case EpcPackage.PROCESS: {
			bg.microarc.epc.Process process = (bg.microarc.epc.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseModelElement(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T result = caseModelElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseModelElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.OPERATORS: {
			Operators operators = (Operators) theEObject;
			T result = caseOperators(operators);
			if (result == null)
				result = caseModelElement(operators);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.XOR: {
			Xor xor = (Xor) theEObject;
			T result = caseXor(xor);
			if (result == null)
				result = caseOperators(xor);
			if (result == null)
				result = caseModelElement(xor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseOperators(or);
			if (result == null)
				result = caseModelElement(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseOperators(and);
			if (result == null)
				result = caseModelElement(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.PROCESS_ELEMENTS: {
			ProcessElements processElements = (ProcessElements) theEObject;
			T result = caseProcessElements(processElements);
			if (result == null)
				result = caseModelElement(processElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.ROLE: {
			Role role = (Role) theEObject;
			T result = caseRole(role);
			if (result == null)
				result = caseProcessElements(role);
			if (result == null)
				result = caseModelElement(role);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.DATABASE: {
			Database database = (Database) theEObject;
			T result = caseDatabase(database);
			if (result == null)
				result = caseProcessElements(database);
			if (result == null)
				result = caseModelElement(database);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.DOCUMENT: {
			Document document = (Document) theEObject;
			T result = caseDocument(document);
			if (result == null)
				result = caseProcessElements(document);
			if (result == null)
				result = caseModelElement(document);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.PROCESS_INTERFACE: {
			ProcessInterface processInterface = (ProcessInterface) theEObject;
			T result = caseProcessInterface(processInterface);
			if (result == null)
				result = caseProcessElements(processInterface);
			if (result == null)
				result = caseModelElement(processInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case EpcPackage.PROCESS_PATH: {
			ProcessPath processPath = (ProcessPath) theEObject;
			T result = caseProcessPath(processPath);
			if (result == null)
				result = caseProcessElements(processPath);
			if (result == null)
				result = caseModelElement(processPath);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(bg.microarc.epc.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperators(Operators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXor(Xor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessElements(ProcessElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessInterface(ProcessInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPath(ProcessPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EpcSwitch
