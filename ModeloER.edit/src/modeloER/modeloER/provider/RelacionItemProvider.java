/**
 */
package modeloER.modeloER.provider;


import java.util.Collection;
import java.util.List;

import modeloER.modeloER.ModeloERFactory;
import modeloER.modeloER.ModeloERPackage;
import modeloER.modeloER.Relacion;

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
 * This is the item provider adapter for a {@link modeloER.modeloER.Relacion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelacionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionItemProvider(AdapterFactory adapterFactory) {
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

			addNombreRelacionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre Relacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombreRelacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Relacion_nombreRelacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Relacion_nombreRelacion_feature", "_UI_Relacion_type"),
				 ModeloERPackage.Literals.RELACION__NOMBRE_RELACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION);
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
	 * This returns Relacion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Relacion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Relacion)object).getNombreRelacion();
		return label == null || label.length() == 0 ?
			getString("_UI_Relacion_type") :
			getString("_UI_Relacion_type") + " " + label;
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

		switch (notification.getFeatureID(Relacion.class)) {
			case ModeloERPackage.RELACION__NOMBRE_RELACION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
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
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createAtributo()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createAtributoDerivado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createAtributoMultivaluado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createClavePrimaria()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createClaveForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createClavePrimariaForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createAtributoDerivadoClavePrimaria()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createAtributoSimple()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.RELACION__ATRIBUTOS_RELACION,
				 ModeloERFactory.eINSTANCE.createAtributoCompuesto()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModeloEREditPlugin.INSTANCE;
	}

}
