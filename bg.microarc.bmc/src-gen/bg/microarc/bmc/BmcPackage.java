/**
 */
package bg.microarc.bmc;

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
 * @see bg.microarc.bmc.BmcFactory
 * @model kind="package"
 * @generated
 */
public interface BmcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bmc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bg.com.tr/microarc/bmc/1.0.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bmc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BmcPackage eINSTANCE = bg.microarc.bmc.impl.BmcPackageImpl.init();

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.BMCModelImpl <em>BMC Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.BMCModelImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getBMCModel()
	 * @generated
	 */
	int BMC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modelelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC_MODEL__MODELELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>BMC Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BMC Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.ModelElementImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

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
	 * The meta object id for the '{@link bg.microarc.bmc.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.InfrastructureImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getInfrastructure()
	 * @generated
	 */
	int INFRASTRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Infrastructure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.KeyActivitiesImpl <em>Key Activities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.KeyActivitiesImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getKeyActivities()
	 * @generated
	 */
	int KEY_ACTIVITIES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ACTIVITIES__NAME = INFRASTRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ACTIVITIES__CONNECTION = INFRASTRUCTURE__CONNECTION;

	/**
	 * The number of structural features of the '<em>Key Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ACTIVITIES_FEATURE_COUNT = INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Activities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_ACTIVITIES_OPERATION_COUNT = INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.KeyPartnersImpl <em>Key Partners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.KeyPartnersImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getKeyPartners()
	 * @generated
	 */
	int KEY_PARTNERS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PARTNERS__NAME = INFRASTRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PARTNERS__CONNECTION = INFRASTRUCTURE__CONNECTION;

	/**
	 * The number of structural features of the '<em>Key Partners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PARTNERS_FEATURE_COUNT = INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Partners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PARTNERS_OPERATION_COUNT = INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.KeyResourcesImpl <em>Key Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.KeyResourcesImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getKeyResources()
	 * @generated
	 */
	int KEY_RESOURCES = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RESOURCES__NAME = INFRASTRUCTURE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RESOURCES__CONNECTION = INFRASTRUCTURE__CONNECTION;

	/**
	 * The number of structural features of the '<em>Key Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RESOURCES_FEATURE_COUNT = INFRASTRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_RESOURCES_OPERATION_COUNT = INFRASTRUCTURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.CustomersImpl <em>Customers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.CustomersImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCustomers()
	 * @generated
	 */
	int CUSTOMERS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Customers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.CustomerSegmentsImpl <em>Customer Segments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.CustomerSegmentsImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCustomerSegments()
	 * @generated
	 */
	int CUSTOMER_SEGMENTS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SEGMENTS__NAME = CUSTOMERS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SEGMENTS__CONNECTION = CUSTOMERS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Customer Segments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SEGMENTS_FEATURE_COUNT = CUSTOMERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customer Segments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_SEGMENTS_OPERATION_COUNT = CUSTOMERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.CustomerRelationshipsImpl <em>Customer Relationships</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.CustomerRelationshipsImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCustomerRelationships()
	 * @generated
	 */
	int CUSTOMER_RELATIONSHIPS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_RELATIONSHIPS__NAME = CUSTOMERS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_RELATIONSHIPS__CONNECTION = CUSTOMERS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Customer Relationships</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_RELATIONSHIPS_FEATURE_COUNT = CUSTOMERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Customer Relationships</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_RELATIONSHIPS_OPERATION_COUNT = CUSTOMERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.ChannelsImpl <em>Channels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.ChannelsImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getChannels()
	 * @generated
	 */
	int CHANNELS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__NAME = CUSTOMERS__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS__CONNECTION = CUSTOMERS__CONNECTION;

	/**
	 * The number of structural features of the '<em>Channels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_FEATURE_COUNT = CUSTOMERS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Channels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNELS_OPERATION_COUNT = CUSTOMERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.PropositionImpl <em>Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.PropositionImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getProposition()
	 * @generated
	 */
	int PROPOSITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.ValuePropositionImpl <em>Value Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.ValuePropositionImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getValueProposition()
	 * @generated
	 */
	int VALUE_PROPOSITION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__NAME = PROPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION__CONNECTION = PROPOSITION__CONNECTION;

	/**
	 * The number of structural features of the '<em>Value Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION_FEATURE_COUNT = PROPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PROPOSITION_OPERATION_COUNT = PROPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.FinanceImpl <em>Finance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.FinanceImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getFinance()
	 * @generated
	 */
	int FINANCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Finance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Finance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANCE_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.CostStructureImpl <em>Cost Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.CostStructureImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCostStructure()
	 * @generated
	 */
	int COST_STRUCTURE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_STRUCTURE__NAME = FINANCE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_STRUCTURE__CONNECTION = FINANCE__CONNECTION;

	/**
	 * The number of structural features of the '<em>Cost Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_STRUCTURE_FEATURE_COUNT = FINANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cost Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COST_STRUCTURE_OPERATION_COUNT = FINANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.RevenueStreamsImpl <em>Revenue Streams</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.RevenueStreamsImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getRevenueStreams()
	 * @generated
	 */
	int REVENUE_STREAMS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVENUE_STREAMS__NAME = FINANCE__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVENUE_STREAMS__CONNECTION = FINANCE__CONNECTION;

	/**
	 * The number of structural features of the '<em>Revenue Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVENUE_STREAMS_FEATURE_COUNT = FINANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Revenue Streams</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVENUE_STREAMS_OPERATION_COUNT = FINANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.BMCImpl <em>BMC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.BMCImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getBMC()
	 * @generated
	 */
	int BMC = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>BMC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BMC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BMC_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.AdditionalImpl <em>Additional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.AdditionalImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getAdditional()
	 * @generated
	 */
	int ADDITIONAL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL__CONNECTION = MODEL_ELEMENT__CONNECTION;

	/**
	 * The number of structural features of the '<em>Additional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Additional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.bmc.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.bmc.impl.EventImpl
	 * @see bg.microarc.bmc.impl.BmcPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = ADDITIONAL__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONNECTION = ADDITIONAL__CONNECTION;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = ADDITIONAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = ADDITIONAL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.BMCModel <em>BMC Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BMC Model</em>'.
	 * @see bg.microarc.bmc.BMCModel
	 * @generated
	 */
	EClass getBMCModel();

	/**
	 * Returns the meta object for the attribute '{@link bg.microarc.bmc.BMCModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bg.microarc.bmc.BMCModel#getName()
	 * @see #getBMCModel()
	 * @generated
	 */
	EAttribute getBMCModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link bg.microarc.bmc.BMCModel#getModelelements <em>Modelelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelelements</em>'.
	 * @see bg.microarc.bmc.BMCModel#getModelelements()
	 * @see #getBMCModel()
	 * @generated
	 */
	EReference getBMCModel_Modelelements();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see bg.microarc.bmc.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link bg.microarc.bmc.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bg.microarc.bmc.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link bg.microarc.bmc.ModelElement#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection</em>'.
	 * @see bg.microarc.bmc.ModelElement#getConnection()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Connection();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure</em>'.
	 * @see bg.microarc.bmc.Infrastructure
	 * @generated
	 */
	EClass getInfrastructure();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.KeyActivities <em>Key Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Activities</em>'.
	 * @see bg.microarc.bmc.KeyActivities
	 * @generated
	 */
	EClass getKeyActivities();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.KeyPartners <em>Key Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Partners</em>'.
	 * @see bg.microarc.bmc.KeyPartners
	 * @generated
	 */
	EClass getKeyPartners();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.KeyResources <em>Key Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Resources</em>'.
	 * @see bg.microarc.bmc.KeyResources
	 * @generated
	 */
	EClass getKeyResources();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.Customers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customers</em>'.
	 * @see bg.microarc.bmc.Customers
	 * @generated
	 */
	EClass getCustomers();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.CustomerSegments <em>Customer Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Segments</em>'.
	 * @see bg.microarc.bmc.CustomerSegments
	 * @generated
	 */
	EClass getCustomerSegments();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.CustomerRelationships <em>Customer Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Relationships</em>'.
	 * @see bg.microarc.bmc.CustomerRelationships
	 * @generated
	 */
	EClass getCustomerRelationships();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.Channels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channels</em>'.
	 * @see bg.microarc.bmc.Channels
	 * @generated
	 */
	EClass getChannels();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition</em>'.
	 * @see bg.microarc.bmc.Proposition
	 * @generated
	 */
	EClass getProposition();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.ValueProposition <em>Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Proposition</em>'.
	 * @see bg.microarc.bmc.ValueProposition
	 * @generated
	 */
	EClass getValueProposition();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.Finance <em>Finance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finance</em>'.
	 * @see bg.microarc.bmc.Finance
	 * @generated
	 */
	EClass getFinance();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.CostStructure <em>Cost Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cost Structure</em>'.
	 * @see bg.microarc.bmc.CostStructure
	 * @generated
	 */
	EClass getCostStructure();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.RevenueStreams <em>Revenue Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revenue Streams</em>'.
	 * @see bg.microarc.bmc.RevenueStreams
	 * @generated
	 */
	EClass getRevenueStreams();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.BMC <em>BMC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BMC</em>'.
	 * @see bg.microarc.bmc.BMC
	 * @generated
	 */
	EClass getBMC();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see bg.microarc.bmc.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link bg.microarc.bmc.Additional <em>Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional</em>'.
	 * @see bg.microarc.bmc.Additional
	 * @generated
	 */
	EClass getAdditional();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BmcFactory getBmcFactory();

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
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.BMCModelImpl <em>BMC Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.BMCModelImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getBMCModel()
		 * @generated
		 */
		EClass BMC_MODEL = eINSTANCE.getBMCModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BMC_MODEL__NAME = eINSTANCE.getBMCModel_Name();

		/**
		 * The meta object literal for the '<em><b>Modelelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BMC_MODEL__MODELELEMENTS = eINSTANCE.getBMCModel_Modelelements();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.ModelElementImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getModelElement()
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
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.InfrastructureImpl <em>Infrastructure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.InfrastructureImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getInfrastructure()
		 * @generated
		 */
		EClass INFRASTRUCTURE = eINSTANCE.getInfrastructure();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.KeyActivitiesImpl <em>Key Activities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.KeyActivitiesImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getKeyActivities()
		 * @generated
		 */
		EClass KEY_ACTIVITIES = eINSTANCE.getKeyActivities();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.KeyPartnersImpl <em>Key Partners</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.KeyPartnersImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getKeyPartners()
		 * @generated
		 */
		EClass KEY_PARTNERS = eINSTANCE.getKeyPartners();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.KeyResourcesImpl <em>Key Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.KeyResourcesImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getKeyResources()
		 * @generated
		 */
		EClass KEY_RESOURCES = eINSTANCE.getKeyResources();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.CustomersImpl <em>Customers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.CustomersImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCustomers()
		 * @generated
		 */
		EClass CUSTOMERS = eINSTANCE.getCustomers();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.CustomerSegmentsImpl <em>Customer Segments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.CustomerSegmentsImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCustomerSegments()
		 * @generated
		 */
		EClass CUSTOMER_SEGMENTS = eINSTANCE.getCustomerSegments();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.CustomerRelationshipsImpl <em>Customer Relationships</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.CustomerRelationshipsImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCustomerRelationships()
		 * @generated
		 */
		EClass CUSTOMER_RELATIONSHIPS = eINSTANCE.getCustomerRelationships();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.ChannelsImpl <em>Channels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.ChannelsImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getChannels()
		 * @generated
		 */
		EClass CHANNELS = eINSTANCE.getChannels();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.PropositionImpl <em>Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.PropositionImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getProposition()
		 * @generated
		 */
		EClass PROPOSITION = eINSTANCE.getProposition();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.ValuePropositionImpl <em>Value Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.ValuePropositionImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getValueProposition()
		 * @generated
		 */
		EClass VALUE_PROPOSITION = eINSTANCE.getValueProposition();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.FinanceImpl <em>Finance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.FinanceImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getFinance()
		 * @generated
		 */
		EClass FINANCE = eINSTANCE.getFinance();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.CostStructureImpl <em>Cost Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.CostStructureImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getCostStructure()
		 * @generated
		 */
		EClass COST_STRUCTURE = eINSTANCE.getCostStructure();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.RevenueStreamsImpl <em>Revenue Streams</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.RevenueStreamsImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getRevenueStreams()
		 * @generated
		 */
		EClass REVENUE_STREAMS = eINSTANCE.getRevenueStreams();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.BMCImpl <em>BMC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.BMCImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getBMC()
		 * @generated
		 */
		EClass BMC = eINSTANCE.getBMC();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.EventImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link bg.microarc.bmc.impl.AdditionalImpl <em>Additional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.bmc.impl.AdditionalImpl
		 * @see bg.microarc.bmc.impl.BmcPackageImpl#getAdditional()
		 * @generated
		 */
		EClass ADDITIONAL = eINSTANCE.getAdditional();

	}

} //BmcPackage
