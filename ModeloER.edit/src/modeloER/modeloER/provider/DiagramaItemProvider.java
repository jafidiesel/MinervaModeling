/**
 */
package modeloER.modeloER.provider;


import java.util.Collection;
import java.util.List;

import modeloER.modeloER.Diagrama;
import modeloER.modeloER.ModeloERFactory;
import modeloER.modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link modeloER.modeloER.Diagrama} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramaItemProvider 
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
	public DiagramaItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__LINKASAC_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA);
			childrenFeatures.add(ModeloERPackage.Literals.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA);
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
	 * This returns Diagrama.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Diagrama"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Diagrama_type");
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

		switch (notification.getFeatureID(Diagrama.class)) {
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__LINKASAC_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA:
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA:
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
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributo()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoDerivado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoMultivaluado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createClavePrimaria()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createClaveForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createClavePrimariaForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoDerivadoClavePrimaria()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoSimple()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoCompuesto()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createHerencia()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoDerivado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoMultivaluado()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createClavePrimaria()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createClaveForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createClavePrimariaForanea()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createRelacionTipoDebil()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createRelacionTipoFuerte()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createEntidadRelacionFuerte()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createEntidadRelacionDebil()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoDerivadoClavePrimaria()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createEntidadFuerte()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createEntidadDebil()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoSimple()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoCompuesto()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__LINKASAC_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createLinkASAC()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoDerivadoEntidad()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoEntidadLink()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createAtributoDerivadoEntidad()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createRelacionAtributoLink()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createLinkHerenciaPadre()));

		newChildDescriptors.add
			(createChildParameter
				(ModeloERPackage.Literals.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA,
				 ModeloERFactory.eINSTANCE.createLinkHerenciaHijo()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA ||
			childFeature == ModeloERPackage.Literals.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
