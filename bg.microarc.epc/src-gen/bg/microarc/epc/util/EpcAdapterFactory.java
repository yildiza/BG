/**
 */
package bg.microarc.epc.util;

import bg.microarc.epc.And;
import bg.microarc.epc.Database;
import bg.microarc.epc.Document;
import bg.microarc.epc.EpcPackage;
import bg.microarc.epc.Event;
import bg.microarc.epc.ModelElement;
import bg.microarc.epc.Operators;
import bg.microarc.epc.Or;
import bg.microarc.epc.ProcessElements;
import bg.microarc.epc.ProcessInterface;
import bg.microarc.epc.ProcessPath;
import bg.microarc.epc.Role;
import bg.microarc.epc.Xor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see bg.microarc.epc.EpcPackage
 * @generated
 */
public class EpcAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EpcPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpcAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EpcPackage.eINSTANCE;
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
	protected EpcSwitch<Adapter> modelSwitch = new EpcSwitch<Adapter>() {
		@Override
		public Adapter caseProcess(bg.microarc.epc.Process object) {
			return createProcessAdapter();
		}

		@Override
		public Adapter caseModelElement(ModelElement object) {
			return createModelElementAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseOperators(Operators object) {
			return createOperatorsAdapter();
		}

		@Override
		public Adapter caseXor(Xor object) {
			return createXorAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseProcessElements(ProcessElements object) {
			return createProcessElementsAdapter();
		}

		@Override
		public Adapter caseRole(Role object) {
			return createRoleAdapter();
		}

		@Override
		public Adapter caseDatabase(Database object) {
			return createDatabaseAdapter();
		}

		@Override
		public Adapter caseDocument(Document object) {
			return createDocumentAdapter();
		}

		@Override
		public Adapter caseProcessInterface(ProcessInterface object) {
			return createProcessInterfaceAdapter();
		}

		@Override
		public Adapter caseProcessPath(ProcessPath object) {
			return createProcessPathAdapter();
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
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Operators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Operators
	 * @generated
	 */
	public Adapter createOperatorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Xor
	 * @generated
	 */
	public Adapter createXorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.ProcessElements <em>Process Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.ProcessElements
	 * @generated
	 */
	public Adapter createProcessElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.ProcessInterface <em>Process Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.ProcessInterface
	 * @generated
	 */
	public Adapter createProcessInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link bg.microarc.epc.ProcessPath <em>Process Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see bg.microarc.epc.ProcessPath
	 * @generated
	 */
	public Adapter createProcessPathAdapter() {
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

} //EpcAdapterFactory
