/**
 */
package bg.microarc.bmc.impl;

import bg.microarc.bmc.Additional;
import bg.microarc.bmc.BMCModel;
import bg.microarc.bmc.BmcFactory;
import bg.microarc.bmc.BmcPackage;
import bg.microarc.bmc.Channels;
import bg.microarc.bmc.CostStructure;
import bg.microarc.bmc.CustomerRelationships;
import bg.microarc.bmc.CustomerSegments;
import bg.microarc.bmc.Customers;
import bg.microarc.bmc.Event;
import bg.microarc.bmc.Finance;
import bg.microarc.bmc.Infrastructure;
import bg.microarc.bmc.KeyActivities;
import bg.microarc.bmc.KeyPartners;
import bg.microarc.bmc.KeyResources;
import bg.microarc.bmc.ModelElement;
import bg.microarc.bmc.Proposition;
import bg.microarc.bmc.RevenueStreams;
import bg.microarc.bmc.ValueProposition;

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
public class BmcPackageImpl extends EPackageImpl implements BmcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bmcModelEClass = null;

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
	private EClass infrastructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyActivitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPartnersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerSegmentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerRelationshipsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePropositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass financeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass costStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revenueStreamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bmcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalEClass = null;

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
	 * @see bg.microarc.bmc.BmcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BmcPackageImpl() {
		super(eNS_URI, BmcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BmcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BmcPackage init() {
		if (isInited)
			return (BmcPackage) EPackage.Registry.INSTANCE.getEPackage(BmcPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBmcPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BmcPackageImpl theBmcPackage = registeredBmcPackage instanceof BmcPackageImpl
				? (BmcPackageImpl) registeredBmcPackage
				: new BmcPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBmcPackage.createPackageContents();

		// Initialize created meta-data
		theBmcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBmcPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BmcPackage.eNS_URI, theBmcPackage);
		return theBmcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBMCModel() {
		return bmcModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBMCModel_Name() {
		return (EAttribute) bmcModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBMCModel_Modelelements() {
		return (EReference) bmcModelEClass.getEStructuralFeatures().get(1);
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
	public EClass getInfrastructure() {
		return infrastructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyActivities() {
		return keyActivitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyPartners() {
		return keyPartnersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyResources() {
		return keyResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomers() {
		return customersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerSegments() {
		return customerSegmentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomerRelationships() {
		return customerRelationshipsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChannels() {
		return channelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProposition() {
		return propositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueProposition() {
		return valuePropositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinance() {
		return financeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCostStructure() {
		return costStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevenueStreams() {
		return revenueStreamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBMC() {
		return bmcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditional() {
		return additionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BmcFactory getBmcFactory() {
		return (BmcFactory) getEFactoryInstance();
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
		bmcModelEClass = createEClass(BMC_MODEL);
		createEAttribute(bmcModelEClass, BMC_MODEL__NAME);
		createEReference(bmcModelEClass, BMC_MODEL__MODELELEMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__CONNECTION);

		infrastructureEClass = createEClass(INFRASTRUCTURE);

		keyActivitiesEClass = createEClass(KEY_ACTIVITIES);

		keyPartnersEClass = createEClass(KEY_PARTNERS);

		keyResourcesEClass = createEClass(KEY_RESOURCES);

		customersEClass = createEClass(CUSTOMERS);

		customerSegmentsEClass = createEClass(CUSTOMER_SEGMENTS);

		customerRelationshipsEClass = createEClass(CUSTOMER_RELATIONSHIPS);

		channelsEClass = createEClass(CHANNELS);

		propositionEClass = createEClass(PROPOSITION);

		valuePropositionEClass = createEClass(VALUE_PROPOSITION);

		financeEClass = createEClass(FINANCE);

		costStructureEClass = createEClass(COST_STRUCTURE);

		revenueStreamsEClass = createEClass(REVENUE_STREAMS);

		bmcEClass = createEClass(BMC);

		eventEClass = createEClass(EVENT);

		additionalEClass = createEClass(ADDITIONAL);
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
		infrastructureEClass.getESuperTypes().add(this.getModelElement());
		keyActivitiesEClass.getESuperTypes().add(this.getInfrastructure());
		keyPartnersEClass.getESuperTypes().add(this.getInfrastructure());
		keyResourcesEClass.getESuperTypes().add(this.getInfrastructure());
		customersEClass.getESuperTypes().add(this.getModelElement());
		customerSegmentsEClass.getESuperTypes().add(this.getCustomers());
		customerRelationshipsEClass.getESuperTypes().add(this.getCustomers());
		channelsEClass.getESuperTypes().add(this.getCustomers());
		propositionEClass.getESuperTypes().add(this.getModelElement());
		valuePropositionEClass.getESuperTypes().add(this.getProposition());
		financeEClass.getESuperTypes().add(this.getModelElement());
		costStructureEClass.getESuperTypes().add(this.getFinance());
		revenueStreamsEClass.getESuperTypes().add(this.getFinance());
		bmcEClass.getESuperTypes().add(this.getModelElement());
		eventEClass.getESuperTypes().add(this.getAdditional());
		additionalEClass.getESuperTypes().add(this.getModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(bmcModelEClass, BMCModel.class, "BMCModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBMCModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, BMCModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBMCModel_Modelelements(), this.getModelElement(), null, "modelelements", null, 0, -1,
				BMCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Connection(), this.getModelElement(), null, "connection", null, 0, -1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureEClass, Infrastructure.class, "Infrastructure", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyActivitiesEClass, KeyActivities.class, "KeyActivities", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyPartnersEClass, KeyPartners.class, "KeyPartners", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyResourcesEClass, KeyResources.class, "KeyResources", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(customersEClass, Customers.class, "Customers", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(customerSegmentsEClass, CustomerSegments.class, "CustomerSegments", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(customerRelationshipsEClass, CustomerRelationships.class, "CustomerRelationships", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelsEClass, Channels.class, "Channels", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propositionEClass, Proposition.class, "Proposition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuePropositionEClass, ValueProposition.class, "ValueProposition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(financeEClass, Finance.class, "Finance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(costStructureEClass, CostStructure.class, "CostStructure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(revenueStreamsEClass, RevenueStreams.class, "RevenueStreams", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bmcEClass, bg.microarc.bmc.BMC.class, "BMC", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionalEClass, Additional.class, "Additional", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BmcPackageImpl
