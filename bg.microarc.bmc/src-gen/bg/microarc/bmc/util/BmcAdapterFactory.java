/**
 */
package bg.microarc.bmc.util;

import bg.microarc.bmc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bg.microarc.bmc.BmcPackage
 * @generated
 */
public class BmcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BmcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BmcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BmcPackage.eINSTANCE;
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
	protected BmcSwitch<Adapter> modelSwitch = new BmcSwitch<Adapter>() {
		@Override
		public Adapter caseBMCModel(BMCModel object) {
			return createBMCModelAdapter();
		}

		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseInfrastructure(Infrastructure object) {
			return createInfrastructureAdapter();
		}

		@Override
		public Adapter caseKeyActivities(KeyActivities object) {
			return createKeyActivitiesAdapter();
		}

		@Override
		public Adapter caseKeyPartners(KeyPartners object) {
			return createKeyPartnersAdapter();
		}

		@Override
		public Adapter caseKeyResources(KeyResources object) {
			return createKeyResourcesAdapter();
		}

		@Override
		public Adapter caseCustomers(Customers object) {
			return createCustomersAdapter();
		}

		@Override
		public Adapter caseCustomerSegments(CustomerSegments object) {
			return createCustomerSegmentsAdapter();
		}

		@Override
		public Adapter caseCustomerRelationships(CustomerRelationships object) {
			return createCustomerRelationshipsAdapter();
		}

		@Override
		public Adapter caseChannels(Channels object) {
			return createChannelsAdapter();
		}

		@Override
		public Adapter caseProposition(Proposition object) {
			return createPropositionAdapter();
		}

		@Override
		public Adapter caseValueProposition(ValueProposition object) {
			return createValuePropositionAdapter();
		}

		@Override
		public Adapter caseFinance(Finance object) {
			return createFinanceAdapter();
		}

		@Override
		public Adapter caseCostStructure(CostStructure object) {
			return createCostStructureAdapter();
		}

		@Override
		public Adapter caseRevenueStreams(RevenueStreams object) {
			return createRevenueStreamsAdapter();
		}

		@Override
		public Adapter caseBMC(BMC object) {
			return createBMCAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseAdditional(Additional object) {
			return createAdditionalAdapter();
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
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.BMCModel <em>BMC Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.BMCModel
	 * @generated
	 */
	public Adapter createBMCModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.Infrastructure <em>Infrastructure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.Infrastructure
	 * @generated
	 */
	public Adapter createInfrastructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.KeyActivities <em>Key Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.KeyActivities
	 * @generated
	 */
	public Adapter createKeyActivitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.KeyPartners <em>Key Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.KeyPartners
	 * @generated
	 */
	public Adapter createKeyPartnersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.KeyResources <em>Key Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.KeyResources
	 * @generated
	 */
	public Adapter createKeyResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.Customers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.Customers
	 * @generated
	 */
	public Adapter createCustomersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.CustomerSegments <em>Customer Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.CustomerSegments
	 * @generated
	 */
	public Adapter createCustomerSegmentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.CustomerRelationships <em>Customer Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.CustomerRelationships
	 * @generated
	 */
	public Adapter createCustomerRelationshipsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.Channels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.Channels
	 * @generated
	 */
	public Adapter createChannelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.Proposition
	 * @generated
	 */
	public Adapter createPropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.ValueProposition <em>Value Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.ValueProposition
	 * @generated
	 */
	public Adapter createValuePropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.Finance <em>Finance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.Finance
	 * @generated
	 */
	public Adapter createFinanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.CostStructure <em>Cost Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.CostStructure
	 * @generated
	 */
	public Adapter createCostStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.RevenueStreams <em>Revenue Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.RevenueStreams
	 * @generated
	 */
	public Adapter createRevenueStreamsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.BMC <em>BMC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.BMC
	 * @generated
	 */
	public Adapter createBMCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.bmc.Additional <em>Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.bmc.Additional
	 * @generated
	 */
	public Adapter createAdditionalAdapter() {
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

} //BmcAdapterFactory
