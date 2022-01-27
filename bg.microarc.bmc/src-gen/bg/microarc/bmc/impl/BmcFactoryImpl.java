/**
 */
package bg.microarc.bmc.impl;

import bg.microarc.bmc.*;

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
public class BmcFactoryImpl extends EFactoryImpl implements BmcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BmcFactory init() {
		try {
			BmcFactory theBmcFactory = (BmcFactory) EPackage.Registry.INSTANCE.getEFactory(BmcPackage.eNS_URI);
			if (theBmcFactory != null) {
				return theBmcFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BmcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BmcFactoryImpl() {
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
		case BmcPackage.BMC_MODEL:
			return createBMCModel();
		case BmcPackage.KEY_ACTIVITIES:
			return createKeyActivities();
		case BmcPackage.KEY_PARTNERS:
			return createKeyPartners();
		case BmcPackage.KEY_RESOURCES:
			return createKeyResources();
		case BmcPackage.CUSTOMER_SEGMENTS:
			return createCustomerSegments();
		case BmcPackage.CUSTOMER_RELATIONSHIPS:
			return createCustomerRelationships();
		case BmcPackage.CHANNELS:
			return createChannels();
		case BmcPackage.VALUE_PROPOSITION:
			return createValueProposition();
		case BmcPackage.COST_STRUCTURE:
			return createCostStructure();
		case BmcPackage.REVENUE_STREAMS:
			return createRevenueStreams();
		case BmcPackage.BMC:
			return createBMC();
		case BmcPackage.EVENT:
			return createEvent();
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
	public BMCModel createBMCModel() {
		BMCModelImpl bmcModel = new BMCModelImpl();
		return bmcModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyActivities createKeyActivities() {
		KeyActivitiesImpl keyActivities = new KeyActivitiesImpl();
		return keyActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyPartners createKeyPartners() {
		KeyPartnersImpl keyPartners = new KeyPartnersImpl();
		return keyPartners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyResources createKeyResources() {
		KeyResourcesImpl keyResources = new KeyResourcesImpl();
		return keyResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerSegments createCustomerSegments() {
		CustomerSegmentsImpl customerSegments = new CustomerSegmentsImpl();
		return customerSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerRelationships createCustomerRelationships() {
		CustomerRelationshipsImpl customerRelationships = new CustomerRelationshipsImpl();
		return customerRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Channels createChannels() {
		ChannelsImpl channels = new ChannelsImpl();
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueProposition createValueProposition() {
		ValuePropositionImpl valueProposition = new ValuePropositionImpl();
		return valueProposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CostStructure createCostStructure() {
		CostStructureImpl costStructure = new CostStructureImpl();
		return costStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RevenueStreams createRevenueStreams() {
		RevenueStreamsImpl revenueStreams = new RevenueStreamsImpl();
		return revenueStreams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BMC createBMC() {
		BMCImpl bmc = new BMCImpl();
		return bmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BmcPackage getBmcPackage() {
		return (BmcPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BmcPackage getPackage() {
		return BmcPackage.eINSTANCE;
	}

} //BmcFactoryImpl
