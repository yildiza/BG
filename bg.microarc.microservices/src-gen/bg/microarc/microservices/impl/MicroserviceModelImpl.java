/**
 */
package bg.microarc.microservices.impl;

import bg.microarc.microservices.MicroserviceModel;
import bg.microarc.microservices.MicroservicesPackage;
import bg.microarc.microservices.ModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bg.microarc.microservices.impl.MicroserviceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link bg.microarc.microservices.impl.MicroserviceModelImpl#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceModelImpl extends MinimalEObjectImpl.Container implements MicroserviceModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelelements() <em>Modelelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelelements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> modelelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MicroservicesPackage.Literals.MICROSERVICE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MicroservicesPackage.MICROSERVICE_MODEL__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModelElement> getModelelements() {
		if (modelelements == null) {
			modelelements = new EObjectContainmentEList<ModelElement>(ModelElement.class, this,
					MicroservicesPackage.MICROSERVICE_MODEL__MODELELEMENTS);
		}
		return modelelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MicroservicesPackage.MICROSERVICE_MODEL__MODELELEMENTS:
			return ((InternalEList<?>) getModelelements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MicroservicesPackage.MICROSERVICE_MODEL__NAME:
			return getName();
		case MicroservicesPackage.MICROSERVICE_MODEL__MODELELEMENTS:
			return getModelelements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MicroservicesPackage.MICROSERVICE_MODEL__NAME:
			setName((String) newValue);
			return;
		case MicroservicesPackage.MICROSERVICE_MODEL__MODELELEMENTS:
			getModelelements().clear();
			getModelelements().addAll((Collection<? extends ModelElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MicroservicesPackage.MICROSERVICE_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MicroservicesPackage.MICROSERVICE_MODEL__MODELELEMENTS:
			getModelelements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MicroservicesPackage.MICROSERVICE_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MicroservicesPackage.MICROSERVICE_MODEL__MODELELEMENTS:
			return modelelements != null && !modelelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MicroserviceModelImpl
