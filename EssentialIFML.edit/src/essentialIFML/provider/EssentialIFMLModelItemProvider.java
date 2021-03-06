/**
 */
package essentialIFML.provider;


import essentialIFML.EssentialIFMLFactory;
import essentialIFML.EssentialIFMLModel;
import essentialIFML.EssentialIFMLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link essentialIFML.EssentialIFMLModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EssentialIFMLModelItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialIFMLModelItemProvider(AdapterFactory adapterFactory) {
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

			addScreenZoomPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Screen Zoom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScreenZoomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EssentialIFMLModel_screenZoom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EssentialIFMLModel_screenZoom_feature", "_UI_EssentialIFMLModel_type"),
				 EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__SCREEN_ZOOM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__VIEWCONTAINER);
			childrenFeatures.add(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__ACTION);
			childrenFeatures.add(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE);
			childrenFeatures.add(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE);
			childrenFeatures.add(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR);
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
	 * This returns EssentialIFMLModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EssentialIFMLModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EssentialIFMLModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EssentialIFMLModel_type") :
			getString("_UI_EssentialIFMLModel_type") + " " + label;
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

		switch (notification.getFeatureID(EssentialIFMLModel.class)) {
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER:
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION:
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE:
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE:
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR:
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

		newChildDescriptors.add
			(createChildParameter
				(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__VIEWCONTAINER,
				 EssentialIFMLFactory.eINSTANCE.createViewContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__ACTION,
				 EssentialIFMLFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE,
				 EssentialIFMLFactory.eINSTANCE.createIncreaseButtonSize()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE,
				 EssentialIFMLFactory.eINSTANCE.createDecreaseButtonSize()));

		newChildDescriptors.add
			(createChildParameter
				(EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR,
				 EssentialIFMLFactory.eINSTANCE.createLightBackgroundColor()));
	}

}
