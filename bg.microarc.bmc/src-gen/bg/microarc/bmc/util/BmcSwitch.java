/**
 */
package bg.microarc.bmc.util;

import bg.microarc.bmc.*;

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
 * @see bg.microarc.bmc.BmcPackage
 * @generated
 */
public class BmcSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BmcPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BmcSwitch() {
		if (modelPackage == null) {
			modelPackage = BmcPackage.eINSTANCE;
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
		case BmcPackage.BMC_MODEL: {
			BMCModel bmcModel = (BMCModel) theEObject;
			T result = caseBMCModel(bmcModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T result = caseModelElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.INFRASTRUCTURE: {
			Infrastructure infrastructure = (Infrastructure) theEObject;
			T result = caseInfrastructure(infrastructure);
			if (result == null)
				result = caseModelElement(infrastructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.KEY_ACTIVITIES: {
			KeyActivities keyActivities = (KeyActivities) theEObject;
			T result = caseKeyActivities(keyActivities);
			if (result == null)
				result = caseInfrastructure(keyActivities);
			if (result == null)
				result = caseModelElement(keyActivities);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.KEY_PARTNERS: {
			KeyPartners keyPartners = (KeyPartners) theEObject;
			T result = caseKeyPartners(keyPartners);
			if (result == null)
				result = caseInfrastructure(keyPartners);
			if (result == null)
				result = caseModelElement(keyPartners);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.KEY_RESOURCES: {
			KeyResources keyResources = (KeyResources) theEObject;
			T result = caseKeyResources(keyResources);
			if (result == null)
				result = caseInfrastructure(keyResources);
			if (result == null)
				result = caseModelElement(keyResources);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.CUSTOMERS: {
			Customers customers = (Customers) theEObject;
			T result = caseCustomers(customers);
			if (result == null)
				result = caseModelElement(customers);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.CUSTOMER_SEGMENTS: {
			CustomerSegments customerSegments = (CustomerSegments) theEObject;
			T result = caseCustomerSegments(customerSegments);
			if (result == null)
				result = caseCustomers(customerSegments);
			if (result == null)
				result = caseModelElement(customerSegments);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.CUSTOMER_RELATIONSHIPS: {
			CustomerRelationships customerRelationships = (CustomerRelationships) theEObject;
			T result = caseCustomerRelationships(customerRelationships);
			if (result == null)
				result = caseCustomers(customerRelationships);
			if (result == null)
				result = caseModelElement(customerRelationships);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.CHANNELS: {
			Channels channels = (Channels) theEObject;
			T result = caseChannels(channels);
			if (result == null)
				result = caseCustomers(channels);
			if (result == null)
				result = caseModelElement(channels);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.PROPOSITION: {
			Proposition proposition = (Proposition) theEObject;
			T result = caseProposition(proposition);
			if (result == null)
				result = caseModelElement(proposition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.VALUE_PROPOSITION: {
			ValueProposition valueProposition = (ValueProposition) theEObject;
			T result = caseValueProposition(valueProposition);
			if (result == null)
				result = caseProposition(valueProposition);
			if (result == null)
				result = caseModelElement(valueProposition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.FINANCE: {
			Finance finance = (Finance) theEObject;
			T result = caseFinance(finance);
			if (result == null)
				result = caseModelElement(finance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.COST_STRUCTURE: {
			CostStructure costStructure = (CostStructure) theEObject;
			T result = caseCostStructure(costStructure);
			if (result == null)
				result = caseFinance(costStructure);
			if (result == null)
				result = caseModelElement(costStructure);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.REVENUE_STREAMS: {
			RevenueStreams revenueStreams = (RevenueStreams) theEObject;
			T result = caseRevenueStreams(revenueStreams);
			if (result == null)
				result = caseFinance(revenueStreams);
			if (result == null)
				result = caseModelElement(revenueStreams);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.BMC: {
			BMC bmc = (BMC) theEObject;
			T result = caseBMC(bmc);
			if (result == null)
				result = caseModelElement(bmc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseAdditional(event);
			if (result == null)
				result = caseModelElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BmcPackage.ADDITIONAL: {
			Additional additional = (Additional) theEObject;
			T result = caseAdditional(additional);
			if (result == null)
				result = caseModelElement(additional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BMC Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BMC Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMCModel(BMCModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructure(Infrastructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Activities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Activities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyActivities(KeyActivities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Partners</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Partners</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyPartners(KeyPartners object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyResources(KeyResources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomers(Customers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Segments</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Segments</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerSegments(CustomerSegments object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Relationships</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Relationships</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerRelationships(CustomerRelationships object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannels(Channels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProposition(Proposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueProposition(ValueProposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinance(Finance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cost Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cost Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCostStructure(CostStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revenue Streams</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revenue Streams</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevenueStreams(RevenueStreams object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BMC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BMC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBMC(BMC object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Additional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditional(Additional object) {
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

} //BmcSwitch
