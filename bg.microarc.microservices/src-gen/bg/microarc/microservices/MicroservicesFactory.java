/**
 */
package bg.microarc.microservices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bg.microarc.microservices.MicroservicesPackage
 * @generated
 */
public interface MicroservicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroservicesFactory eINSTANCE = bg.microarc.microservices.impl.MicroservicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Microservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice</em>'.
	 * @generated
	 */
	Microservice createMicroservice();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>API Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Gateway</em>'.
	 * @generated
	 */
	API_Gateway createAPI_Gateway();

	/**
	 * Returns a new object of class '<em>Load Balancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Balancer</em>'.
	 * @generated
	 */
	LoadBalancer createLoadBalancer();

	/**
	 * Returns a new object of class '<em>Data Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Base</em>'.
	 * @generated
	 */
	DataBase createDataBase();

	/**
	 * Returns a new object of class '<em>Event Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Broker</em>'.
	 * @generated
	 */
	EventBroker createEventBroker();

	/**
	 * Returns a new object of class '<em>Message Broker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Broker</em>'.
	 * @generated
	 */
	MessageBroker createMessageBroker();

	/**
	 * Returns a new object of class '<em>Mobile UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile UI</em>'.
	 * @generated
	 */
	MobileUI createMobileUI();

	/**
	 * Returns a new object of class '<em>Web UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Web UI</em>'.
	 * @generated
	 */
	WebUI createWebUI();

	/**
	 * Returns a new object of class '<em>Microservice Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microservice Model</em>'.
	 * @generated
	 */
	MicroserviceModel createMicroserviceModel();

	/**
	 * Returns a new object of class '<em>Service Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Registry</em>'.
	 * @generated
	 */
	ServiceRegistry createServiceRegistry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MicroservicesPackage getMicroservicesPackage();

} //MicroservicesFactory
