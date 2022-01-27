/**
 */
package bg.microarc.epc.impl;

import bg.microarc.epc.EpcPackage;
import bg.microarc.epc.ModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bg.microarc.epc.impl.ProcessImpl#getModelelements <em>Modelelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends ModelElementImpl implements bg.microarc.epc.Process {
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
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpcPackage.Literals.PROCESS;
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
					EpcPackage.PROCESS__MODELELEMENTS);
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
		case EpcPackage.PROCESS__MODELELEMENTS:
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
		case EpcPackage.PROCESS__MODELELEMENTS:
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
		case EpcPackage.PROCESS__MODELELEMENTS:
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
		case EpcPackage.PROCESS__MODELELEMENTS:
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
		case EpcPackage.PROCESS__MODELELEMENTS:
			return modelelements != null && !modelelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
