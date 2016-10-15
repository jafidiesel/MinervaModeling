package ModeloER.modeloER.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class ModeloERDiagramUpdater {

	/**
	* @generated
	*/
	public static List<ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor> getSemanticChildren(View view) {
		switch (ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor> getDiagrama_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ModeloER.modeloER.Diagrama modelElement = (ModeloER.modeloER.Diagrama) view.getElement();
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributo().iterator(); it.hasNext();) {
			ModeloER.modeloER.Atributo childElement = (ModeloER.modeloER.Atributo) it.next();
			int visualID = ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID) {
				result.add(new ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntidad().iterator(); it.hasNext();) {
			ModeloER.modeloER.Entidad childElement = (ModeloER.modeloER.Entidad) it.next();
			int visualID = ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID) {
				result.add(new ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRelacion().iterator(); it.hasNext();) {
			ModeloER.modeloER.Relacion childElement = (ModeloER.modeloER.Relacion) it.next();
			int visualID = ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID) {
				result.add(new ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedLinks(View view) {
		switch (ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000ContainedLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_2001ContainedLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2002ContainedLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_2003ContainedLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
			return getEntidadRelacion_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingLinks(View view) {
		switch (ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_2001IncomingLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2002IncomingLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_2003IncomingLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
			return getEntidadRelacion_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingLinks(View view) {
		switch (ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_2001OutgoingLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2002OutgoingLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_2003OutgoingLinks(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
			return getEntidadRelacion_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getDiagrama_1000ContainedLinks(
			View view) {
		ModeloER.modeloER.Diagrama modelElement = (ModeloER.modeloER.Diagrama) view.getElement();
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_EntidadRelacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributo_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidad_2002ContainedLinks(View view) {
		ModeloER.modeloER.Entidad modelElement = (ModeloER.modeloER.Entidad) view.getElement();
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_EntidadAtributos_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacion_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributo_2001IncomingLinks(View view) {
		ModeloER.modeloER.Atributo modelElement = (ModeloER.modeloER.Atributo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entidad_EntidadAtributos_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidad_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacion_2003IncomingLinks(View view) {
		ModeloER.modeloER.Relacion modelElement = (ModeloER.modeloER.Relacion) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EntidadRelacion_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributo_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidad_2002OutgoingLinks(View view) {
		ModeloER.modeloER.Entidad modelElement = (ModeloER.modeloER.Entidad) view.getElement();
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EntidadRelacion_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entidad_EntidadAtributos_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacion_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_EntidadRelacion_4001(
			ModeloER.modeloER.Diagrama container) {
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getEntidadRelacion().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ModeloER.modeloER.EntidadRelacion) {
				continue;
			}
			ModeloER.modeloER.EntidadRelacion link = (ModeloER.modeloER.EntidadRelacion) linkObject;
			if (ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID != ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModeloER.modeloER.Relacion dst = link.getEntidadRelacionRelaciones();
			ModeloER.modeloER.Entidad src = link.getRelacionEntidades();
			result.add(new ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001,
					ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_EntidadRelacion_4001(
			ModeloER.modeloER.Relacion target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ModeloER.modeloER.ModeloERPackage.eINSTANCE
					.getEntidadRelacion_EntidadRelacionRelaciones()
					|| false == setting.getEObject() instanceof ModeloER.modeloER.EntidadRelacion) {
				continue;
			}
			ModeloER.modeloER.EntidadRelacion link = (ModeloER.modeloER.EntidadRelacion) setting.getEObject();
			if (ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID != ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModeloER.modeloER.Entidad src = link.getRelacionEntidades();
			result.add(new ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001,
					ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingFeatureModelFacetLinks_Entidad_EntidadAtributos_4002(
			ModeloER.modeloER.Atributo target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ModeloER.modeloER.ModeloERPackage.eINSTANCE
					.getEntidad_EntidadAtributos()) {
				result.add(new ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor(setting.getEObject(), target,
						ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002,
						ModeloER.modeloER.diagram.edit.parts.EntidadEntidadAtributosEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_EntidadRelacion_4001(
			ModeloER.modeloER.Entidad source) {
		ModeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ModeloER.modeloER.Diagrama) {
				container = (ModeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getEntidadRelacion().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ModeloER.modeloER.EntidadRelacion) {
				continue;
			}
			ModeloER.modeloER.EntidadRelacion link = (ModeloER.modeloER.EntidadRelacion) linkObject;
			if (ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID != ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ModeloER.modeloER.Relacion dst = link.getEntidadRelacionRelaciones();
			ModeloER.modeloER.Entidad src = link.getRelacionEntidades();
			if (src != source) {
				continue;
			}
			result.add(new ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001,
					ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entidad_EntidadAtributos_4002(
			ModeloER.modeloER.Entidad source) {
		LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> destinations = source.getEntidadAtributos().iterator(); destinations.hasNext();) {
			ModeloER.modeloER.Atributo destination = (ModeloER.modeloER.Atributo) destinations.next();
			result.add(new ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor(source, destination,
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002,
					ModeloER.modeloER.diagram.edit.parts.EntidadEntidadAtributosEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ModeloER.modeloER.diagram.part.ModeloERNodeDescriptor> getSemanticChildren(View view) {
			return ModeloERDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedLinks(View view) {
			return ModeloERDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingLinks(View view) {
			return ModeloERDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ModeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingLinks(View view) {
			return ModeloERDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
