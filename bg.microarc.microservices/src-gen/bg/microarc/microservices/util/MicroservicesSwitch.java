/**
 */
package bg.microarc.microservices.util;

import bg.microarc.microservices.*;

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
 * @see bg.microarc.microservices.MicroservicesPackage
 * @generated
 */
public class MicroservicesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicroservicesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesSwitch() {
		if (modelPackage == null) {
			modelPackage = MicroservicesPackage.eINSTANCE;
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
		case MicroservicesPackage.MODEL_ELEMENT: {
			ModelElement modelElement = (ModelElement) theEObject;
			T result = caseModelElement(modelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.MICROSERVICE: {
			Microservice microservice = (Microservice) theEObject;
			T result = caseMicroservice(microservice);
			if (result == null)
				result = caseModelElement(microservice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.USER: {
			User user = (User) theEObject;
			T result = caseUser(user);
			if (result == null)
				result = caseAuxiliaryElements(user);
			if (result == null)
				result = caseModelElement(user);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.API_GATEWAY: {
			API_Gateway apI_Gateway = (API_Gateway) theEObject;
			T result = caseAPI_Gateway(apI_Gateway);
			if (result == null)
				result = caseAuxiliaryElements(apI_Gateway);
			if (result == null)
				result = caseModelElement(apI_Gateway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.LOAD_BALANCER: {
			LoadBalancer loadBalancer = (LoadBalancer) theEObject;
			T result = caseLoadBalancer(loadBalancer);
			if (result == null)
				result = caseAuxiliaryElements(loadBalancer);
			if (result == null)
				result = caseModelElement(loadBalancer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.DATA_BASE: {
			DataBase dataBase = (DataBase) theEObject;
			T result = caseDataBase(dataBase);
			if (result == null)
				result = caseMicroserviceElements(dataBase);
			if (result == null)
				result = caseModelElement(dataBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.MICROSERVICE_ELEMENTS: {
			MicroserviceElements microserviceElements = (MicroserviceElements) theEObject;
			T result = caseMicroserviceElements(microserviceElements);
			if (result == null)
				result = caseModelElement(microserviceElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.AUXILIARY_ELEMENTS: {
			AuxiliaryElements auxiliaryElements = (AuxiliaryElements) theEObject;
			T result = caseAuxiliaryElements(auxiliaryElements);
			if (result == null)
				result = caseModelElement(auxiliaryElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.EVENT_BROKER: {
			EventBroker eventBroker = (EventBroker) theEObject;
			T result = caseEventBroker(eventBroker);
			if (result == null)
				result = caseAuxiliaryElements(eventBroker);
			if (result == null)
				result = caseModelElement(eventBroker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.MESSAGE_BROKER: {
			MessageBroker messageBroker = (MessageBroker) theEObject;
			T result = caseMessageBroker(messageBroker);
			if (result == null)
				result = caseAuxiliaryElements(messageBroker);
			if (result == null)
				result = caseModelElement(messageBroker);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.MOBILE_UI: {
			MobileUI mobileUI = (MobileUI) theEObject;
			T result = caseMobileUI(mobileUI);
			if (result == null)
				result = caseAuxiliaryElements(mobileUI);
			if (result == null)
				result = caseModelElement(mobileUI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.WEB_UI: {
			WebUI webUI = (WebUI) theEObject;
			T result = caseWebUI(webUI);
			if (result == null)
				result = caseAuxiliaryElements(webUI);
			if (result == null)
				result = caseModelElement(webUI);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.MICROSERVICE_MODEL: {
			MicroserviceModel microserviceModel = (MicroserviceModel) theEObject;
			T result = caseMicroserviceModel(microserviceModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MicroservicesPackage.SERVICE_REGISTRY: {
			ServiceRegistry serviceRegistry = (ServiceRegistry) theEObject;
			T result = caseServiceRegistry(serviceRegistry);
			if (result == null)
				result = caseAuxiliaryElements(serviceRegistry);
			if (result == null)
				result = caseModelElement(serviceRegistry);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroservice(Microservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI_Gateway(API_Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load Balancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadBalancer(LoadBalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBase(DataBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroserviceElements(MicroserviceElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auxiliary Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auxiliary Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxiliaryElements(AuxiliaryElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBroker(EventBroker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Broker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Broker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageBroker(MessageBroker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileUI(MobileUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebUI(WebUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microservice Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microservice Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicroserviceModel(MicroserviceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Registry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Registry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRegistry(ServiceRegistry object) {
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

} //MicroservicesSwitch
