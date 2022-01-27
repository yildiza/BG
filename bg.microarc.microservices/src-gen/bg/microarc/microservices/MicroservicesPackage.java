/**
 */
package bg.microarc.microservices;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bg.microarc.microservices.MicroservicesFactory
 * @model kind="package"
 * @generated
 */
public interface MicroservicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "microservices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bg.com.tr/microarc/microservices/1.0.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "microservices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MicroservicesPackage eINSTANCE = bg.microarc.microservices.impl.MicroservicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.ModelElementImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONNECTION = 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.MicroserviceImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.AuxiliaryElementsImpl <em>Auxiliary Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.AuxiliaryElementsImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getAuxiliaryElements()
	 * @generated
	 */
	int AUXILIARY_ELEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ELEMENTS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ELEMENTS__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Auxiliary Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ELEMENTS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auxiliary Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUXILIARY_ELEMENTS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.UserImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.API_GatewayImpl <em>API Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.API_GatewayImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getAPI_Gateway()
	 * @generated
	 */
	int API_GATEWAY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>API Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>API Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_GATEWAY_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.LoadBalancerImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getLoadBalancer()
	 * @generated
	 */
	int LOAD_BALANCER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.MicroserviceElementsImpl <em>Microservice Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.MicroserviceElementsImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMicroserviceElements()
	 * @generated
	 */
	int MICROSERVICE_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ELEMENTS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ELEMENTS__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Microservice Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ELEMENTS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Microservice Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_ELEMENTS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.DataBaseImpl <em>Data Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.DataBaseImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getDataBase()
	 * @generated
	 */
	int DATA_BASE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__NAME = MICROSERVICE_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE__CONNECTION = MICROSERVICE_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_FEATURE_COUNT = MICROSERVICE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_OPERATION_COUNT = MICROSERVICE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.EventBrokerImpl <em>Event Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.EventBrokerImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getEventBroker()
	 * @generated
	 */
	int EVENT_BROKER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BROKER__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BROKER__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Event Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BROKER_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BROKER_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.MessageBrokerImpl <em>Message Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.MessageBrokerImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMessageBroker()
	 * @generated
	 */
	int MESSAGE_BROKER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Message Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BROKER_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.MobileUIImpl <em>Mobile UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.MobileUIImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMobileUI()
	 * @generated
	 */
	int MOBILE_UI = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_UI__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_UI__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Mobile UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_UI_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mobile UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_UI_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.WebUIImpl <em>Web UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.WebUIImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getWebUI()
	 * @generated
	 */
	int WEB_UI = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Web UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_UI_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.MicroserviceModelImpl <em>Microservice Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.MicroserviceModelImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMicroserviceModel()
	 * @generated
	 */
	int MICROSERVICE_MODEL = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modelelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_MODEL__MODELELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Microservice Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Microservice Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bg.microarc.microservices.impl.ServiceRegistryImpl <em>Service Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.microservices.impl.ServiceRegistryImpl
	 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getServiceRegistry()
	 * @generated
	 */
	int SERVICE_REGISTRY = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__NAME = AUXILIARY_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY__CONNECTION = AUXILIARY_ELEMENTS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Service Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_FEATURE_COUNT = AUXILIARY_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REGISTRY_OPERATION_COUNT = AUXILIARY_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see bg.microarc.microservices.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link bg.microarc.microservices.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bg.microarc.microservices.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link bg.microarc.microservices.ModelElement#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection</em>'.
	 * @see bg.microarc.microservices.ModelElement#getConnection()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Connection();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see bg.microarc.microservices.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see bg.microarc.microservices.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.API_Gateway <em>API Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Gateway</em>'.
	 * @see bg.microarc.microservices.API_Gateway
	 * @generated
	 */
	EClass getAPI_Gateway();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer</em>'.
	 * @see bg.microarc.microservices.LoadBalancer
	 * @generated
	 */
	EClass getLoadBalancer();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.DataBase <em>Data Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base</em>'.
	 * @see bg.microarc.microservices.DataBase
	 * @generated
	 */
	EClass getDataBase();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.MicroserviceElements <em>Microservice Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice Elements</em>'.
	 * @see bg.microarc.microservices.MicroserviceElements
	 * @generated
	 */
	EClass getMicroserviceElements();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.AuxiliaryElements <em>Auxiliary Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auxiliary Elements</em>'.
	 * @see bg.microarc.microservices.AuxiliaryElements
	 * @generated
	 */
	EClass getAuxiliaryElements();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.EventBroker <em>Event Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Broker</em>'.
	 * @see bg.microarc.microservices.EventBroker
	 * @generated
	 */
	EClass getEventBroker();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.MessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Broker</em>'.
	 * @see bg.microarc.microservices.MessageBroker
	 * @generated
	 */
	EClass getMessageBroker();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.MobileUI <em>Mobile UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile UI</em>'.
	 * @see bg.microarc.microservices.MobileUI
	 * @generated
	 */
	EClass getMobileUI();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.WebUI <em>Web UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web UI</em>'.
	 * @see bg.microarc.microservices.WebUI
	 * @generated
	 */
	EClass getWebUI();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.MicroserviceModel <em>Microservice Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice Model</em>'.
	 * @see bg.microarc.microservices.MicroserviceModel
	 * @generated
	 */
	EClass getMicroserviceModel();

	/**
	 * Returns the meta object for the attribute '{@link bg.microarc.microservices.MicroserviceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bg.microarc.microservices.MicroserviceModel#getName()
	 * @see #getMicroserviceModel()
	 * @generated
	 */
	EAttribute getMicroserviceModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bg.microarc.microservices.MicroserviceModel#getModelelements <em>Modelelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelelements</em>'.
	 * @see bg.microarc.microservices.MicroserviceModel#getModelelements()
	 * @see #getMicroserviceModel()
	 * @generated
	 */
	EReference getMicroserviceModel_Modelelements();

	/**
	 * Returns the meta object for class '{@link bg.microarc.microservices.ServiceRegistry <em>Service Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Registry</em>'.
	 * @see bg.microarc.microservices.ServiceRegistry
	 * @generated
	 */
	EClass getServiceRegistry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MicroservicesFactory getMicroservicesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.ModelElementImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CONNECTION = eINSTANCE.getModelElement_Connection();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.MicroserviceImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.UserImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.API_GatewayImpl <em>API Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.API_GatewayImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getAPI_Gateway()
		 * @generated
		 */
		EClass API_GATEWAY = eINSTANCE.getAPI_Gateway();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.LoadBalancerImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getLoadBalancer()
		 * @generated
		 */
		EClass LOAD_BALANCER = eINSTANCE.getLoadBalancer();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.DataBaseImpl <em>Data Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.DataBaseImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getDataBase()
		 * @generated
		 */
		EClass DATA_BASE = eINSTANCE.getDataBase();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.MicroserviceElementsImpl <em>Microservice Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.MicroserviceElementsImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMicroserviceElements()
		 * @generated
		 */
		EClass MICROSERVICE_ELEMENTS = eINSTANCE.getMicroserviceElements();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.AuxiliaryElementsImpl <em>Auxiliary Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.AuxiliaryElementsImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getAuxiliaryElements()
		 * @generated
		 */
		EClass AUXILIARY_ELEMENTS = eINSTANCE.getAuxiliaryElements();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.EventBrokerImpl <em>Event Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.EventBrokerImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getEventBroker()
		 * @generated
		 */
		EClass EVENT_BROKER = eINSTANCE.getEventBroker();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.MessageBrokerImpl <em>Message Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.MessageBrokerImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMessageBroker()
		 * @generated
		 */
		EClass MESSAGE_BROKER = eINSTANCE.getMessageBroker();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.MobileUIImpl <em>Mobile UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.MobileUIImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMobileUI()
		 * @generated
		 */
		EClass MOBILE_UI = eINSTANCE.getMobileUI();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.WebUIImpl <em>Web UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.WebUIImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getWebUI()
		 * @generated
		 */
		EClass WEB_UI = eINSTANCE.getWebUI();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.MicroserviceModelImpl <em>Microservice Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.MicroserviceModelImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getMicroserviceModel()
		 * @generated
		 */
		EClass MICROSERVICE_MODEL = eINSTANCE.getMicroserviceModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE_MODEL__NAME = eINSTANCE.getMicroserviceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Modelelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE_MODEL__MODELELEMENTS = eINSTANCE.getMicroserviceModel_Modelelements();

		/**
		 * The meta object literal for the '{@link bg.microarc.microservices.impl.ServiceRegistryImpl <em>Service Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.microservices.impl.ServiceRegistryImpl
		 * @see bg.microarc.microservices.impl.MicroservicesPackageImpl#getServiceRegistry()
		 * @generated
		 */
		EClass SERVICE_REGISTRY = eINSTANCE.getServiceRegistry();

	}

} //MicroservicesPackage
