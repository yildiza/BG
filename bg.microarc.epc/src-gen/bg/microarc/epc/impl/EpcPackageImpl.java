/**
 */
package bg.microarc.epc.impl;

import bg.microarc.epc.And;
import bg.microarc.epc.Database;
import bg.microarc.epc.Document;
import bg.microarc.epc.EpcFactory;
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
public class EpcPackageImpl extends EPackageImpl implements EpcPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

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
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPathEClass = null;

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
	 * @see bg.microarc.epc.EpcPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EpcPackageImpl() {
		super(eNS_URI, EpcFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EpcPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EpcPackage init() {
		if (isInited)
			return (EpcPackage) EPackage.Registry.INSTANCE.getEPackage(EpcPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEpcPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EpcPackageImpl theEpcPackage = registeredEpcPackage instanceof EpcPackageImpl
				? (EpcPackageImpl) registeredEpcPackage
				: new EpcPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEpcPackage.createPackageContents();

		// Initialize created meta-data
		theEpcPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEpcPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EpcPackage.eNS_URI, theEpcPackage);
		return theEpcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Modelelements() {
		return (EReference) processEClass.getEStructuralFeatures().get(0);
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
	public EReference getModelElement_Connnection() {
		return (EReference) modelElementEClass.getEStructuralFeatures().get(1);
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
	public EClass getOperators() {
		return operatorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXor() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessElements() {
		return processElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessInterface() {
		return processInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessPath() {
		return processPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EpcFactory getEpcFactory() {
		return (EpcFactory) getEFactoryInstance();
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
		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__MODELELEMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
		createEReference(modelElementEClass, MODEL_ELEMENT__CONNNECTION);

		eventEClass = createEClass(EVENT);

		operatorsEClass = createEClass(OPERATORS);

		xorEClass = createEClass(XOR);

		orEClass = createEClass(OR);

		andEClass = createEClass(AND);

		processElementsEClass = createEClass(PROCESS_ELEMENTS);

		roleEClass = createEClass(ROLE);

		databaseEClass = createEClass(DATABASE);

		documentEClass = createEClass(DOCUMENT);

		processInterfaceEClass = createEClass(PROCESS_INTERFACE);

		processPathEClass = createEClass(PROCESS_PATH);
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
		processEClass.getESuperTypes().add(this.getModelElement());
		eventEClass.getESuperTypes().add(this.getModelElement());
		operatorsEClass.getESuperTypes().add(this.getModelElement());
		xorEClass.getESuperTypes().add(this.getOperators());
		orEClass.getESuperTypes().add(this.getOperators());
		andEClass.getESuperTypes().add(this.getOperators());
		processElementsEClass.getESuperTypes().add(this.getModelElement());
		roleEClass.getESuperTypes().add(this.getProcessElements());
		databaseEClass.getESuperTypes().add(this.getProcessElements());
		documentEClass.getESuperTypes().add(this.getProcessElements());
		processInterfaceEClass.getESuperTypes().add(this.getProcessElements());
		processPathEClass.getESuperTypes().add(this.getProcessElements());

		// Initialize classes, features, and operations; add parameters
		initEClass(processEClass, bg.microarc.epc.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Modelelements(), this.getModelElement(), null, "modelelements", null, 0, -1,
				bg.microarc.epc.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Connnection(), this.getModelElement(), null, "connnection", null, 0, -1,
				ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorsEClass, Operators.class, "Operators", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, Xor.class, "Xor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processElementsEClass, ProcessElements.class, "ProcessElements", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(processInterfaceEClass, ProcessInterface.class, "ProcessInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(processPathEClass, ProcessPath.class, "ProcessPath", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EpcPackageImpl
