/**
 */
package bg.microarc.microservices.impl;

import bg.microarc.microservices.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroservicesFactoryImpl extends EFactoryImpl implements MicroservicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MicroservicesFactory init() {
		try {
			MicroservicesFactory theMicroservicesFactory = (MicroservicesFactory) EPackage.Registry.INSTANCE
					.getEFactory(MicroservicesPackage.eNS_URI);
			if (theMicroservicesFactory != null) {
				return theMicroservicesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MicroservicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroservicesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MicroservicesPackage.MICROSERVICE:
			return createMicroservice();
		case MicroservicesPackage.USER:
			return createUser();
		case MicroservicesPackage.API_GATEWAY:
			return createAPI_Gateway();
		case MicroservicesPackage.LOAD_BALANCER:
			return createLoadBalancer();
		case MicroservicesPackage.DATA_BASE:
			return createDataBase();
		case MicroservicesPackage.EVENT_BROKER:
			return createEventBroker();
		case MicroservicesPackage.MESSAGE_BROKER:
			return createMessageBroker();
		case MicroservicesPackage.MOBILE_UI:
			return createMobileUI();
		case MicroservicesPackage.WEB_UI:
			return createWebUI();
		case MicroservicesPackage.MICROSERVICE_MODEL:
			return createMicroserviceModel();
		case MicroservicesPackage.SERVICE_REGISTRY:
			return createServiceRegistry();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public API_Gateway createAPI_Gateway() {
		API_GatewayImpl apI_Gateway = new API_GatewayImpl();
		return apI_Gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoadBalancer createLoadBalancer() {
		LoadBalancerImpl loadBalancer = new LoadBalancerImpl();
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataBase createDataBase() {
		DataBaseImpl dataBase = new DataBaseImpl();
		return dataBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventBroker createEventBroker() {
		EventBrokerImpl eventBroker = new EventBrokerImpl();
		return eventBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageBroker createMessageBroker() {
		MessageBrokerImpl messageBroker = new MessageBrokerImpl();
		return messageBroker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MobileUI createMobileUI() {
		MobileUIImpl mobileUI = new MobileUIImpl();
		return mobileUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebUI createWebUI() {
		WebUIImpl webUI = new WebUIImpl();
		return webUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroserviceModel createMicroserviceModel() {
		MicroserviceModelImpl microserviceModel = new MicroserviceModelImpl();
		return microserviceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceRegistry createServiceRegistry() {
		ServiceRegistryImpl serviceRegistry = new ServiceRegistryImpl();
		return serviceRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroservicesPackage getMicroservicesPackage() {
		return (MicroservicesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MicroservicesPackage getPackage() {
		return MicroservicesPackage.eINSTANCE;
	}

} //MicroservicesFactoryImpl
