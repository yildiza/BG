/**
 */
package bg.microarc.microservices.provider;

import bg.microarc.microservices.MicroserviceModel;
import bg.microarc.microservices.MicroservicesFactory;
import bg.microarc.microservices.MicroservicesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bg.microarc.microservices.MicroserviceModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroserviceModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroserviceModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MicroserviceModel_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MicroserviceModel_name_feature",
								"_UI_MicroserviceModel_type"),
						MicroservicesPackage.Literals.MICROSERVICE_MODEL__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MicroserviceModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MicroserviceModel"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MicroserviceModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MicroserviceModel_type")
				: getString("_UI_MicroserviceModel_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MicroserviceModel.class)) {
		case MicroservicesPackage.MICROSERVICE_MODEL__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MicroservicesPackage.MICROSERVICE_MODEL__MODELELEMENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createMicroservice()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createUser()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createAPI_Gateway()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createLoadBalancer()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createDataBase()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createEventBroker()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createMessageBroker()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createMobileUI()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createWebUI()));

		newChildDescriptors.add(createChildParameter(MicroservicesPackage.Literals.MICROSERVICE_MODEL__MODELELEMENTS,
				MicroservicesFactory.eINSTANCE.createServiceRegistry()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MicroservicesEditPlugin.INSTANCE;
	}

}
