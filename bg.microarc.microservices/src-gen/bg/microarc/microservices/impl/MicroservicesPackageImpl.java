/**
 */
package bg.microarc.microservices.impl;

import bg.microarc.microservices.API_Gateway;
import bg.microarc.microservices.AuxiliaryElements;
import bg.microarc.microservices.DataBase;
import bg.microarc.microservices.EventBroker;
import bg.microarc.microservices.LoadBalancer;
import bg.microarc.microservices.MessageBroker;
import bg.microarc.microservices.Microservice;
import bg.microarc.microservices.MicroserviceElements;
import bg.microarc.microservices.MicroserviceModel;
import bg.microarc.microservices.MicroservicesFactory;
import bg.microarc.microservices.MicroservicesPackage;
import bg.microarc.microservices.MobileUI;
import bg.microarc.microservices.ModelElement;
import bg.microarc.microservices.ServiceRegistry;
import bg.microarc.microservices.User;
import bg.microarc.microservices.WebUI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroservicesPackageImpl extends EPackageImpl implements MicroservicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apI_GatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBalancerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxiliaryElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBrokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microserviceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRegistryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bg.microarc.microservices.MicroservicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MicroservicesPackageImpl() {
		super(eNS_URI, MicroservicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MicroservicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MicroservicesPackage init() {
		if (isInited)
			return (MicroservicesPackage) EPackage.Registry.INSTANCE.getEPackage(MicroservicesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMicroservicesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MicroservicesPackageImpl theMicroservicesPackage = registeredMicroservicesPackage instanceof MicroservicesPackageImpl
				? (MicroservicesPackageImpl) registeredMicroservicesPackage
				: new MicroservicesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMicroservicesPackage.createPackageContents();

		// Initialize created meta-data
		theMicroservicesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMicroservicesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MicroservicesPackage.eNS_URI, theMicroservicesPackage);
		return theMicroservicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Name() {
		return (EAttribute) modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Connection() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMicroservice() {
		return microserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAPI_Gateway() {
		return apI_GatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoadBalancer() {
		return loadBalancerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataBase() {
		return dataBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMicroserviceElements() {
		return microserviceElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuxiliaryElements() {
		return auxiliaryElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventBroker() {
		return eventBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageBroker() {
		return messageBrokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMobileUI() {
		return mobileUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebUI() {
		return webUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMicroserviceModel() {
		return microserviceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMicroserviceModel_Name() {
		return (EAttribute) microserviceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMicroserviceModel_Modelelements() {
		return (EReference) microserviceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceRegistry() {
		return serviceRegistryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MicroservicesFactory getMicroservicesFactory() {
		return (MicroservicesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__CONNECTION);

		microserviceEClass = createEClass(MICROSERVICE);

		userEClass = createEClass(USER);

		apI_GatewayEClass = createEClass(API_GATEWAY);

		loadBalancerEClass = createEClass(LOAD_BALANCER);

		dataBaseEClass = createEClass(DATA_BASE);

		microserviceElementsEClass = createEClass(MICROSERVICE_ELEMENTS);

		auxiliaryElementsEClass = createEClass(AUXILIARY_ELEMENTS);

		eventBrokerEClass = createEClass(EVENT_BROKER);

		messageBrokerEClass = createEClass(MESSAGE_BROKER);

		mobileUIEClass = createEClass(MOBILE_UI);

		webUIEClass = createEClass(WEB_UI);

		microserviceModelEClass = createEClass(MICROSERVICE_MODEL);
		createEAttribute(microserviceModelEClass, MICROSERVICE_MODEL__NAME);
		createEReference(microserviceModelEClass, MICROSERVICE_MODEL__MODELELEMENTS);

		serviceRegistryEClass = createEClass(SERVICE_REGISTRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		microserviceEClass.getESuperTypes().add(this.getModelElement());
		userEClass.getESuperTypes().add(this.getAuxiliaryElements());
		apI_GatewayEClass.getESuperTypes().add(this.getAuxiliaryElements());
		loadBalancerEClass.getESuperTypes().add(this.getAuxiliaryElements());
		dataBaseEClass.getESuperTypes().add(this.getMicroserviceElements());
		microserviceElementsEClass.getESuperTypes().add(this.getModelElement());
		auxiliaryElementsEClass.getESuperTypes().add(this.getModelElement());
		eventBrokerEClass.getESuperTypes().add(this.getAuxiliaryElements());
		messageBrokerEClass.getESuperTypes().add(this.getAuxiliaryElements());
		mobileUIEClass.getESuperTypes().add(this.getAuxiliaryElements());
		webUIEClass.getESuperTypes().add(this.getAuxiliaryElements());
		serviceRegistryEClass.getESuperTypes().add(this.getAuxiliaryElements());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Connection(), this.getModelElement(), null, "connection", null, 0, -1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(microserviceEClass, Microservice.class, "Microservice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apI_GatewayEClass, API_Gateway.class, "API_Gateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(loadBalancerEClass, LoadBalancer.class, "LoadBalancer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataBaseEClass, DataBase.class, "DataBase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(microserviceElementsEClass, MicroserviceElements.class, "MicroserviceElements", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(auxiliaryElementsEClass, AuxiliaryElements.class, "AuxiliaryElements", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventBrokerEClass, EventBroker.class, "EventBroker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageBrokerEClass, MessageBroker.class, "MessageBroker", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobileUIEClass, MobileUI.class, "MobileUI", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(webUIEClass, WebUI.class, "WebUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(microserviceModelEClass, MicroserviceModel.class, "MicroserviceModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroserviceModel_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MicroserviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMicroserviceModel_Modelelements(), this.getModelElement(), null, "modelelements", null, 0, -1,
				MicroserviceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRegistryEClass, ServiceRegistry.class, "ServiceRegistry", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MicroservicesPackageImpl
