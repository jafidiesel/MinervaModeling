/**
 */
package modeloER.modeloER.provider;


import java.util.Collection;
import java.util.List;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.ModeloERFactory;
import modeloER.modeloER.ModeloERPackage;

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
 * This is the item provider adapter for a {@link modeloER.modeloER.Atributo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtributoItemProvider 
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
	public AtributoItemProvider(AdapterFactory adapterFactory) {
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

			addNombrePropertyDescriptor(object);
			addNuloPropertyDescriptor(object);
			addTipoDatoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombrePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Atributo_nombre_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Atributo_nombre_feature", "_UI_Atributo_type"),
				 ModeloERPackage.Literals.ATRIBUTO__NOMBRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nulo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNuloPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Atributo_nulo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Atributo_nulo_feature", "_UI_Atributo_type"),
				 ModeloERPackage.Literals.ATRIBUTO__NULO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tipo Dato feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTipoDatoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Atributo_tipoDato_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Atributo_tipoDato_feature", "_UI_Atributo_type"),
				 ModeloERPackage.Literals.ATRIBUTO__TIPO_DATO,
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
			childrenFeatures.add(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO);
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
	 * This returns Atributo.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Atributo"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Atributo)object).getNombre();
		return label == null || label.length() == 0 ?
			getString("_UI_Atributo_type") :
			getString("_UI_Atributo_type") + " " + label;
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

		switch (notification.getFeatureID(Atributo.class)) {
			case ModeloERPackage.ATRIBUTO__NOMBRE:
			case ModeloERPackage.ATRIBUTO__NULO:
			case ModeloERPackage.ATRIBUTO__TIPO_DATO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModeloERPackage.ATRIBUTO__ATRIBUTOS_ATRIBUTO:
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
				(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO,
				 ModeloERFactory.eINSTANCE.createAtributo()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO,
				 ModeloERFactory.eINSTANCE.createAtributoDerivado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO,
				 ModeloERFactory.eINSTANCE.createAtributoMultivaluado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO,
				 ModeloERFactory.eINSTANCE.createClavePrimaria()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO,
				 ModeloERFactory.eINSTANCE.createClaveForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO,
				 ModeloERFactory.eINSTANCE.createClavePrimariaForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.ATRIBUTO__ATRIBUTOS_ATRIBUTO,
				 ModeloERFactory.eINSTANCE.createAtributoDerivadoClavePrimaria()));
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
