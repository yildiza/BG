/**
 */
package bg.microarc.microservices.util;

import bg.microarc.microservices.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bg.microarc.microservices.MicroservicesPackage
 * @generated
 */
public class MicroservicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MicroservicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MicroservicesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroservicesSwitch<Adapter> modelSwitch = new MicroservicesSwitch<Adapter>() {
		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseMicroservice(Microservice object) {
			return createMicroserviceAdapter();
		}

		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter caseAPI_Gateway(API_Gateway object) {
			return createAPI_GatewayAdapter();
		}

		@Override
		public Adapter caseLoadBalancer(LoadBalancer object) {
			return createLoadBalancerAdapter();
		}

		@Override
		public Adapter caseDataBase(DataBase object) {
			return createDataBaseAdapter();
		}

		@Override
		public Adapter caseMicroserviceElements(MicroserviceElements object) {
			return createMicroserviceElementsAdapter();
		}

		@Override
		public Adapter caseAuxiliaryElements(AuxiliaryElements object) {
			return createAuxiliaryElementsAdapter();
		}

		@Override
		public Adapter caseEventBroker(EventBroker object) {
			return createEventBrokerAdapter();
		}

		@Override
		public Adapter caseMessageBroker(MessageBroker object) {
			return createMessageBrokerAdapter();
		}

		@Override
		public Adapter caseMobileUI(MobileUI object) {
			return createMobileUIAdapter();
		}

		@Override
		public Adapter caseWebUI(WebUI object) {
			return createWebUIAdapter();
		}

		@Override
		public Adapter caseMicroserviceModel(MicroserviceModel object) {
			return createMicroserviceModelAdapter();
		}

		@Override
		public Adapter caseServiceRegistry(ServiceRegistry object) {
			return createServiceRegistryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.API_Gateway <em>API Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.API_Gateway
	 * @generated
	 */
	public Adapter createAPI_GatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.LoadBalancer
	 * @generated
	 */
	public Adapter createLoadBalancerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.DataBase
	 * @generated
	 */
	public Adapter createDataBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.MicroserviceElements <em>Microservice Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.MicroserviceElements
	 * @generated
	 */
	public Adapter createMicroserviceElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.AuxiliaryElements <em>Auxiliary Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.AuxiliaryElements
	 * @generated
	 */
	public Adapter createAuxiliaryElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.EventBroker <em>Event Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.EventBroker
	 * @generated
	 */
	public Adapter createEventBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.MessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.MessageBroker
	 * @generated
	 */
	public Adapter createMessageBrokerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.MobileUI <em>Mobile UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.MobileUI
	 * @generated
	 */
	public Adapter createMobileUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.WebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.WebUI
	 * @generated
	 */
	public Adapter createWebUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.MicroserviceModel <em>Microservice Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.MicroserviceModel
	 * @generated
	 */
	public Adapter createMicroserviceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.microservices.ServiceRegistry <em>Service Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.microservices.ServiceRegistry
	 * @generated
	 */
	public Adapter createServiceRegistryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MicroservicesAdapterFactory
