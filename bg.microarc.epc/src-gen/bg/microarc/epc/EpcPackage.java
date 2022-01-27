/**
 */
package bg.microarc.epc;

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
 * @see bg.microarc.epc.EpcFactory
 * @model kind="package"
 * @generated
 */
public interface EpcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "epc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bg.com.tr/microarc/epc/1.0.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "epc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EpcPackage eINSTANCE = bg.microarc.epc.impl.EpcPackageImpl.init();

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.ModelElementImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getModelElement()
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
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONNNECTION = 1;

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
	 * The meta object id for the '{@link bg.microarc.epc.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.ProcessImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONNNECTION = MODEL_ELEMENT__CONNNECTION;

	/**
	 * The feature id for the '<em><b>Modelelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MODELELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.EventImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CONNNECTION = MODEL_ELEMENT__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.OperatorsImpl <em>Operators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.OperatorsImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getOperators()
	 * @generated
	 */
	int OPERATORS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATORS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATORS__CONNNECTION = MODEL_ELEMENT__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATORS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATORS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.XorImpl <em>Xor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.XorImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getXor()
	 * @generated
	 */
	int XOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__NAME = OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR__CONNNECTION = OPERATORS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_FEATURE_COUNT = OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Xor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_OPERATION_COUNT = OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.OrImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getOr()
	 * @generated
	 */
	int OR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__NAME = OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__CONNNECTION = OPERATORS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.AndImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__NAME = OPERATORS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__CONNNECTION = OPERATORS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = OPERATORS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = OPERATORS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.ProcessElementsImpl <em>Process Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.ProcessElementsImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcessElements()
	 * @generated
	 */
	int PROCESS_ELEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENTS__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENTS__CONNNECTION = MODEL_ELEMENT__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Process Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENTS_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_ELEMENTS_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.RoleImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = PROCESS_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNNECTION = PROCESS_ELEMENTS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = PROCESS_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.DatabaseImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = PROCESS_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__CONNNECTION = PROCESS_ELEMENTS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = PROCESS_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.DocumentImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = PROCESS_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CONNNECTION = PROCESS_ELEMENTS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = PROCESS_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.ProcessInterfaceImpl <em>Process Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.ProcessInterfaceImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcessInterface()
	 * @generated
	 */
	int PROCESS_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE__NAME = PROCESS_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE__CONNNECTION = PROCESS_ELEMENTS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Process Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INTERFACE_OPERATION_COUNT = PROCESS_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bg.microarc.epc.impl.ProcessPathImpl <em>Process Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bg.microarc.epc.impl.ProcessPathImpl
	 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcessPath()
	 * @generated
	 */
	int PROCESS_PATH = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PATH__NAME = PROCESS_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Connnection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PATH__CONNNECTION = PROCESS_ELEMENTS__CONNNECTION;

	/**
	 * The number of structural features of the '<em>Process Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PATH_FEATURE_COUNT = PROCESS_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PATH_OPERATION_COUNT = PROCESS_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see bg.microarc.epc.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link bg.microarc.epc.Process#getModelelements <em>Modelelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelelements</em>'.
	 * @see bg.microarc.epc.Process#getModelelements()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Modelelements();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see bg.microarc.epc.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link bg.microarc.epc.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bg.microarc.epc.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link bg.microarc.epc.ModelElement#getConnnection <em>Connnection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connnection</em>'.
	 * @see bg.microarc.epc.ModelElement#getConnnection()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Connnection();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see bg.microarc.epc.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Operators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operators</em>'.
	 * @see bg.microarc.epc.Operators
	 * @generated
	 */
	EClass getOperators();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Xor <em>Xor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xor</em>'.
	 * @see bg.microarc.epc.Xor
	 * @generated
	 */
	EClass getXor();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see bg.microarc.epc.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see bg.microarc.epc.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.ProcessElements <em>Process Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Elements</em>'.
	 * @see bg.microarc.epc.ProcessElements
	 * @generated
	 */
	EClass getProcessElements();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see bg.microarc.epc.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see bg.microarc.epc.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see bg.microarc.epc.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.ProcessInterface <em>Process Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Interface</em>'.
	 * @see bg.microarc.epc.ProcessInterface
	 * @generated
	 */
	EClass getProcessInterface();

	/**
	 * Returns the meta object for class '{@link bg.microarc.epc.ProcessPath <em>Process Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Path</em>'.
	 * @see bg.microarc.epc.ProcessPath
	 * @generated
	 */
	EClass getProcessPath();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EpcFactory getEpcFactory();

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
		 * The meta object literal for the '{@link bg.microarc.epc.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.ProcessImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Modelelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__MODELELEMENTS = eINSTANCE.getProcess_Modelelements();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.ModelElementImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getModelElement()
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
		 * The meta object literal for the '<em><b>Connnection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CONNNECTION = eINSTANCE.getModelElement_Connnection();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.EventImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.OperatorsImpl <em>Operators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.OperatorsImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getOperators()
		 * @generated
		 */
		EClass OPERATORS = eINSTANCE.getOperators();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.XorImpl <em>Xor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.XorImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getXor()
		 * @generated
		 */
		EClass XOR = eINSTANCE.getXor();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.OrImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.AndImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.ProcessElementsImpl <em>Process Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.ProcessElementsImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcessElements()
		 * @generated
		 */
		EClass PROCESS_ELEMENTS = eINSTANCE.getProcessElements();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.RoleImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.DatabaseImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.DocumentImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.ProcessInterfaceImpl <em>Process Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.ProcessInterfaceImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcessInterface()
		 * @generated
		 */
		EClass PROCESS_INTERFACE = eINSTANCE.getProcessInterface();

		/**
		 * The meta object literal for the '{@link bg.microarc.epc.impl.ProcessPathImpl <em>Process Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bg.microarc.epc.impl.ProcessPathImpl
		 * @see bg.microarc.epc.impl.EpcPackageImpl#getProcessPath()
		 * @generated
		 */
		EClass PROCESS_PATH = eINSTANCE.getProcessPath();

	}

} //EpcPackage
