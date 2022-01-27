/**
 */
package bg.microarc.epc.impl;

import bg.microarc.epc.And;
import bg.microarc.epc.Database;
import bg.microarc.epc.Document;
import bg.microarc.epc.EpcFactory;
import bg.microarc.epc.EpcPackage;
import bg.microarc.epc.Event;
import bg.microarc.epc.Or;
import bg.microarc.epc.ProcessInterface;
import bg.microarc.epc.ProcessPath;
import bg.microarc.epc.Role;
import bg.microarc.epc.Xor;

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
public class EpcFactoryImpl extends EFactoryImpl implements EpcFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EpcFactory init() {
		try {
			EpcFactory theEpcFactory = (EpcFactory) EPackage.Registry.INSTANCE.getEFactory(EpcPackage.eNS_URI);
			if (theEpcFactory != null) {
				return theEpcFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EpcFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpcFactoryImpl() {
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
		case EpcPackage.PROCESS:
			return createProcess();
		case EpcPackage.EVENT:
			return createEvent();
		case EpcPackage.XOR:
			return createXor();
		case EpcPackage.OR:
			return createOr();
		case EpcPackage.AND:
			return createAnd();
		case EpcPackage.ROLE:
			return createRole();
		case EpcPackage.DATABASE:
			return createDatabase();
		case EpcPackage.DOCUMENT:
			return createDocument();
		case EpcPackage.PROCESS_INTERFACE:
			return createProcessInterface();
		case EpcPackage.PROCESS_PATH:
			return createProcessPath();
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
	public bg.microarc.epc.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
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
	public Xor createXor() {
		XorImpl xor = new XorImpl();
		return xor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessInterface createProcessInterface() {
		ProcessInterfaceImpl processInterface = new ProcessInterfaceImpl();
		return processInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessPath createProcessPath() {
		ProcessPathImpl processPath = new ProcessPathImpl();
		return processPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpcPackage getEpcPackage() {
		return (EpcPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EpcPackage getPackage() {
		return EpcPackage.eINSTANCE;
	}

} //EpcFactoryImpl
