package modeloER.modeloER.diagram.part;

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
	public static List<modeloER.modeloER.diagram.part.ModeloERNodeDescriptor> getSemanticChildren(View view) {
		switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<modeloER.modeloER.diagram.part.ModeloERNodeDescriptor> getDiagrama_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		modeloER.modeloER.Diagrama modelElement = (modeloER.modeloER.Diagrama) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERNodeDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributoderivadoDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.AtributoDerivado childElement = (modeloER.modeloER.AtributoDerivado) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getClaveprimariaDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.ClavePrimaria childElement = (modeloER.modeloER.ClavePrimaria) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAtributosimpleDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.AtributoSimple childElement = (modeloER.modeloER.AtributoSimple) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAtributocompuestoDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.AtributoCompuesto childElement = (modeloER.modeloER.AtributoCompuesto) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRelacionesTipodebilDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.RelacionTipoDebil childElement = (modeloER.modeloER.RelacionTipoDebil) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRelacionesTipofuerteDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.RelacionTipoFuerte childElement = (modeloER.modeloER.RelacionTipoFuerte) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getAtributomultivaluadoDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.AtributoMultivaluado childElement = (modeloER.modeloER.AtributoMultivaluado) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHerenciasDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.Herencia childElement = (modeloER.modeloER.Herencia) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntidadfuerteDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.EntidadFuerte childElement = (modeloER.modeloER.EntidadFuerte) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntidaddebilDelDiagrama().iterator(); it.hasNext();) {
			modeloER.modeloER.EntidadDebil childElement = (modeloER.modeloER.EntidadDebil) it.next();
			int visualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID) {
				result.add(new modeloER.modeloER.diagram.part.ModeloERNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedLinks(View view) {
		switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
			return getAtributoDerivado_2001ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
			return getClavePrimaria_2002ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2003ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2004ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
			return getRelacionTipoDebil_2005ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
			return getRelacionTipoFuerte_2006ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
			return getAtributoMultivaluado_2007ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
			return getHerencia_2008ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
			return getEntidadFuerte_2009ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			return getEntidadDebil_2010ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
			return getAtributoEntidadLink_4001ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
			return getLinkHerenciaHijo_4002ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return getEntidadRelacionFuerte_4003ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return getEntidadRelacionDebil_4004ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID:
			return getLinkASAC_4005ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
			return getRelacionAtributoLink_4006ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
			return getLinkHerenciaPadre_4007ContainedLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
			return getAtributoDerivadoEntidad_4008ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingLinks(View view) {
		switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
			return getAtributoDerivado_2001IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
			return getClavePrimaria_2002IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2003IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2004IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
			return getRelacionTipoDebil_2005IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
			return getRelacionTipoFuerte_2006IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
			return getAtributoMultivaluado_2007IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
			return getHerencia_2008IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
			return getEntidadFuerte_2009IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			return getEntidadDebil_2010IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
			return getAtributoEntidadLink_4001IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
			return getLinkHerenciaHijo_4002IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return getEntidadRelacionFuerte_4003IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return getEntidadRelacionDebil_4004IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID:
			return getLinkASAC_4005IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
			return getRelacionAtributoLink_4006IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
			return getLinkHerenciaPadre_4007IncomingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
			return getAtributoDerivadoEntidad_4008IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingLinks(View view) {
		switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
			return getAtributoDerivado_2001OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
			return getClavePrimaria_2002OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2003OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2004OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
			return getRelacionTipoDebil_2005OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
			return getRelacionTipoFuerte_2006OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
			return getAtributoMultivaluado_2007OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
			return getHerencia_2008OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
			return getEntidadFuerte_2009OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			return getEntidadDebil_2010OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
			return getAtributoEntidadLink_4001OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
			return getLinkHerenciaHijo_4002OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return getEntidadRelacionFuerte_4003OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return getEntidadRelacionDebil_4004OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID:
			return getLinkASAC_4005OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
			return getRelacionAtributoLink_4006OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
			return getLinkHerenciaPadre_4007OutgoingLinks(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
			return getAtributoDerivadoEntidad_4008OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getDiagrama_1000ContainedLinks(
			View view) {
		modeloER.modeloER.Diagrama modelElement = (modeloER.modeloER.Diagrama) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkHerenciaHijo_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EntidadRelacionFuerte_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EntidadRelacionDebil_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkASAC_4005(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_LinkHerenciaPadre_4007(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_AtributoDerivadoEntidad_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoDerivado_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getClavePrimaria_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoSimple_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoCompuesto_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionTipoDebil_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionTipoFuerte_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoMultivaluado_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getHerencia_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadFuerte_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadDebil_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoEntidadLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkHerenciaHijo_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacionFuerte_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacionDebil_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkASAC_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionAtributoLink_4006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkHerenciaPadre_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoDerivadoEntidad_4008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoDerivado_2001IncomingLinks(
			View view) {
		modeloER.modeloER.AtributoDerivado modelElement = (modeloER.modeloER.AtributoDerivado) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AtributoDerivadoEntidad_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getClavePrimaria_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoSimple_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoCompuesto_2004IncomingLinks(
			View view) {
		modeloER.modeloER.AtributoCompuesto modelElement = (modeloER.modeloER.AtributoCompuesto) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkASAC_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionTipoDebil_2005IncomingLinks(
			View view) {
		modeloER.modeloER.RelacionTipoDebil modelElement = (modeloER.modeloER.RelacionTipoDebil) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EntidadRelacionFuerte_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EntidadRelacionDebil_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionTipoFuerte_2006IncomingLinks(
			View view) {
		modeloER.modeloER.RelacionTipoFuerte modelElement = (modeloER.modeloER.RelacionTipoFuerte) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EntidadRelacionFuerte_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_EntidadRelacionDebil_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoMultivaluado_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getHerencia_2008IncomingLinks(View view) {
		modeloER.modeloER.Herencia modelElement = (modeloER.modeloER.Herencia) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_LinkHerenciaPadre_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadFuerte_2009IncomingLinks(
			View view) {
		modeloER.modeloER.EntidadFuerte modelElement = (modeloER.modeloER.EntidadFuerte) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkHerenciaHijo_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadDebil_2010IncomingLinks(
			View view) {
		modeloER.modeloER.EntidadDebil modelElement = (modeloER.modeloER.EntidadDebil) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_LinkHerenciaHijo_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoEntidadLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkHerenciaHijo_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacionFuerte_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacionDebil_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkASAC_4005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionAtributoLink_4006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkHerenciaPadre_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoDerivadoEntidad_4008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoDerivado_2001OutgoingLinks(
			View view) {
		modeloER.modeloER.AtributoDerivado modelElement = (modeloER.modeloER.AtributoDerivado) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getClavePrimaria_2002OutgoingLinks(
			View view) {
		modeloER.modeloER.ClavePrimaria modelElement = (modeloER.modeloER.ClavePrimaria) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoSimple_2003OutgoingLinks(
			View view) {
		modeloER.modeloER.AtributoSimple modelElement = (modeloER.modeloER.AtributoSimple) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkASAC_4005(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoCompuesto_2004OutgoingLinks(
			View view) {
		modeloER.modeloER.AtributoCompuesto modelElement = (modeloER.modeloER.AtributoCompuesto) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionTipoDebil_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionTipoFuerte_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoMultivaluado_2007OutgoingLinks(
			View view) {
		modeloER.modeloER.AtributoMultivaluado modelElement = (modeloER.modeloER.AtributoMultivaluado) view
				.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_AtributoEntidadLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_RelacionAtributoLink_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getHerencia_2008OutgoingLinks(View view) {
		modeloER.modeloER.Herencia modelElement = (modeloER.modeloER.Herencia) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_LinkHerenciaHijo_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadFuerte_2009OutgoingLinks(
			View view) {
		modeloER.modeloER.EntidadFuerte modelElement = (modeloER.modeloER.EntidadFuerte) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EntidadRelacionFuerte_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EntidadRelacionDebil_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkHerenciaPadre_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AtributoDerivadoEntidad_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadDebil_2010OutgoingLinks(
			View view) {
		modeloER.modeloER.EntidadDebil modelElement = (modeloER.modeloER.EntidadDebil) view.getElement();
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EntidadRelacionFuerte_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_EntidadRelacionDebil_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_LinkHerenciaPadre_4007(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_AtributoDerivadoEntidad_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoEntidadLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkHerenciaHijo_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacionFuerte_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getEntidadRelacionDebil_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkASAC_4005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getRelacionAtributoLink_4006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getLinkHerenciaPadre_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getAtributoDerivadoEntidad_4008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_AtributoEntidadLink_4001(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getAtributoentidadlinkDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.AtributoEntidadLink) {
				continue;
			}
			modeloER.modeloER.AtributoEntidadLink link = (modeloER.modeloER.AtributoEntidadLink) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad dst = link.getEntidadAtributoLinkOrigen();
			modeloER.modeloER.Atributo src = link.getAtributoEntidadLinkDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001,
					modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_LinkHerenciaHijo_4002(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getLinkherenciahijoDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.LinkHerenciaHijo) {
				continue;
			}
			modeloER.modeloER.LinkHerenciaHijo link = (modeloER.modeloER.LinkHerenciaHijo) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad dst = link.getHerenciaHijoEntidadOrigen();
			modeloER.modeloER.Herencia src = link.getHerenciaHijoHerenciaDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002,
					modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_EntidadRelacionFuerte_4003(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getEntidadesRelacionesFuertesDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.EntidadRelacionFuerte) {
				continue;
			}
			modeloER.modeloER.EntidadRelacionFuerte link = (modeloER.modeloER.EntidadRelacionFuerte) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Relacion dst = link.getRelacionERLink();
			modeloER.modeloER.Entidad src = link.getEntidadERLink();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003,
					modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_EntidadRelacionDebil_4004(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getEntidadesRelacionesDebilesDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.EntidadRelacionDebil) {
				continue;
			}
			modeloER.modeloER.EntidadRelacionDebil link = (modeloER.modeloER.EntidadRelacionDebil) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Relacion dst = link.getRelacionERLink();
			modeloER.modeloER.Entidad src = link.getEntidadERLink();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004,
					modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_LinkASAC_4005(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getLinkasacDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.LinkASAC) {
				continue;
			}
			modeloER.modeloER.LinkASAC link = (modeloER.modeloER.LinkASAC) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.AtributoCompuesto dst = link.getAtributocompuestoOrigen();
			modeloER.modeloER.AtributoSimple src = link.getAtributosimpleDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005,
					modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_RelacionAtributoLink_4006(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getRelacionatributolinkDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.RelacionAtributoLink) {
				continue;
			}
			modeloER.modeloER.RelacionAtributoLink link = (modeloER.modeloER.RelacionAtributoLink) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Relacion dst = link.getRelacionAtributoOrigen();
			modeloER.modeloER.Atributo src = link.getRelacionAtributoDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006,
					modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_LinkHerenciaPadre_4007(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getLinkherenciapadreDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.LinkHerenciaPadre) {
				continue;
			}
			modeloER.modeloER.LinkHerenciaPadre link = (modeloER.modeloER.LinkHerenciaPadre) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Herencia dst = link.getLinkHerenciaPadreHerenciaDestino();
			modeloER.modeloER.Entidad src = link.getHerenciaPadreEntidadOrigen();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007,
					modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedTypeModelFacetLinks_AtributoDerivadoEntidad_4008(
			modeloER.modeloER.Diagrama container) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getAtributoderivadoentidadDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.AtributoDerivadoEntidad) {
				continue;
			}
			modeloER.modeloER.AtributoDerivadoEntidad link = (modeloER.modeloER.AtributoDerivadoEntidad) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.AtributoDerivado dst = link.getAtributoderivadoDestino();
			modeloER.modeloER.Entidad src = link.getEntidadAtributoDerivadoOrigen();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008,
					modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_AtributoEntidadLink_4001(
			modeloER.modeloER.Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getAtributoEntidadLink_EntidadAtributoLinkOrigen()
					|| false == setting.getEObject() instanceof modeloER.modeloER.AtributoEntidadLink) {
				continue;
			}
			modeloER.modeloER.AtributoEntidadLink link = (modeloER.modeloER.AtributoEntidadLink) setting.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Atributo src = link.getAtributoEntidadLinkDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001,
					modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_LinkHerenciaHijo_4002(
			modeloER.modeloER.Entidad target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getLinkHerenciaHijo_HerenciaHijoEntidadOrigen()
					|| false == setting.getEObject() instanceof modeloER.modeloER.LinkHerenciaHijo) {
				continue;
			}
			modeloER.modeloER.LinkHerenciaHijo link = (modeloER.modeloER.LinkHerenciaHijo) setting.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Herencia src = link.getHerenciaHijoHerenciaDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002,
					modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_EntidadRelacionFuerte_4003(
			modeloER.modeloER.Relacion target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getEntidadRelacion_RelacionERLink()
					|| false == setting.getEObject() instanceof modeloER.modeloER.EntidadRelacionFuerte) {
				continue;
			}
			modeloER.modeloER.EntidadRelacionFuerte link = (modeloER.modeloER.EntidadRelacionFuerte) setting
					.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad src = link.getEntidadERLink();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003,
					modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_EntidadRelacionDebil_4004(
			modeloER.modeloER.Relacion target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getEntidadRelacion_RelacionERLink()
					|| false == setting.getEObject() instanceof modeloER.modeloER.EntidadRelacionDebil) {
				continue;
			}
			modeloER.modeloER.EntidadRelacionDebil link = (modeloER.modeloER.EntidadRelacionDebil) setting.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad src = link.getEntidadERLink();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004,
					modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_LinkASAC_4005(
			modeloER.modeloER.AtributoCompuesto target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getLinkASAC_AtributocompuestoOrigen()
					|| false == setting.getEObject() instanceof modeloER.modeloER.LinkASAC) {
				continue;
			}
			modeloER.modeloER.LinkASAC link = (modeloER.modeloER.LinkASAC) setting.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.AtributoSimple src = link.getAtributosimpleDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005,
					modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_RelacionAtributoLink_4006(
			modeloER.modeloER.Relacion target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getRelacionAtributoLink_RelacionAtributoOrigen()
					|| false == setting.getEObject() instanceof modeloER.modeloER.RelacionAtributoLink) {
				continue;
			}
			modeloER.modeloER.RelacionAtributoLink link = (modeloER.modeloER.RelacionAtributoLink) setting.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Atributo src = link.getRelacionAtributoDestino();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006,
					modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_LinkHerenciaPadre_4007(
			modeloER.modeloER.Herencia target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getLinkHerenciaPadre_LinkHerenciaPadreHerenciaDestino()
					|| false == setting.getEObject() instanceof modeloER.modeloER.LinkHerenciaPadre) {
				continue;
			}
			modeloER.modeloER.LinkHerenciaPadre link = (modeloER.modeloER.LinkHerenciaPadre) setting.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad src = link.getHerenciaPadreEntidadOrigen();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007,
					modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingTypeModelFacetLinks_AtributoDerivadoEntidad_4008(
			modeloER.modeloER.AtributoDerivado target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != modeloER.modeloER.ModeloERPackage.eINSTANCE
					.getAtributoDerivadoEntidad_AtributoderivadoDestino()
					|| false == setting.getEObject() instanceof modeloER.modeloER.AtributoDerivadoEntidad) {
				continue;
			}
			modeloER.modeloER.AtributoDerivadoEntidad link = (modeloER.modeloER.AtributoDerivadoEntidad) setting
					.getEObject();
			if (modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad src = link.getEntidadAtributoDerivadoOrigen();
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, target, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008,
					modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_AtributoEntidadLink_4001(
			modeloER.modeloER.Atributo source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getAtributoentidadlinkDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.AtributoEntidadLink) {
				continue;
			}
			modeloER.modeloER.AtributoEntidadLink link = (modeloER.modeloER.AtributoEntidadLink) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad dst = link.getEntidadAtributoLinkOrigen();
			modeloER.modeloER.Atributo src = link.getAtributoEntidadLinkDestino();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001,
					modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkHerenciaHijo_4002(
			modeloER.modeloER.Herencia source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getLinkherenciahijoDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.LinkHerenciaHijo) {
				continue;
			}
			modeloER.modeloER.LinkHerenciaHijo link = (modeloER.modeloER.LinkHerenciaHijo) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Entidad dst = link.getHerenciaHijoEntidadOrigen();
			modeloER.modeloER.Herencia src = link.getHerenciaHijoHerenciaDestino();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002,
					modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_EntidadRelacionFuerte_4003(
			modeloER.modeloER.Entidad source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getEntidadesRelacionesFuertesDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.EntidadRelacionFuerte) {
				continue;
			}
			modeloER.modeloER.EntidadRelacionFuerte link = (modeloER.modeloER.EntidadRelacionFuerte) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Relacion dst = link.getRelacionERLink();
			modeloER.modeloER.Entidad src = link.getEntidadERLink();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003,
					modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_EntidadRelacionDebil_4004(
			modeloER.modeloER.Entidad source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getEntidadesRelacionesDebilesDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.EntidadRelacionDebil) {
				continue;
			}
			modeloER.modeloER.EntidadRelacionDebil link = (modeloER.modeloER.EntidadRelacionDebil) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Relacion dst = link.getRelacionERLink();
			modeloER.modeloER.Entidad src = link.getEntidadERLink();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004,
					modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkASAC_4005(
			modeloER.modeloER.AtributoSimple source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getLinkasacDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.LinkASAC) {
				continue;
			}
			modeloER.modeloER.LinkASAC link = (modeloER.modeloER.LinkASAC) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.AtributoCompuesto dst = link.getAtributocompuestoOrigen();
			modeloER.modeloER.AtributoSimple src = link.getAtributosimpleDestino();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005,
					modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_RelacionAtributoLink_4006(
			modeloER.modeloER.Atributo source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getRelacionatributolinkDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.RelacionAtributoLink) {
				continue;
			}
			modeloER.modeloER.RelacionAtributoLink link = (modeloER.modeloER.RelacionAtributoLink) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Relacion dst = link.getRelacionAtributoOrigen();
			modeloER.modeloER.Atributo src = link.getRelacionAtributoDestino();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006,
					modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_LinkHerenciaPadre_4007(
			modeloER.modeloER.Entidad source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getLinkherenciapadreDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.LinkHerenciaPadre) {
				continue;
			}
			modeloER.modeloER.LinkHerenciaPadre link = (modeloER.modeloER.LinkHerenciaPadre) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.Herencia dst = link.getLinkHerenciaPadreHerenciaDestino();
			modeloER.modeloER.Entidad src = link.getHerenciaPadreEntidadOrigen();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007,
					modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingTypeModelFacetLinks_AtributoDerivadoEntidad_4008(
			modeloER.modeloER.Entidad source) {
		modeloER.modeloER.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof modeloER.modeloER.Diagrama) {
				container = (modeloER.modeloER.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> result = new LinkedList<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor>();
		for (Iterator<?> links = container.getAtributoderivadoentidadDelDiagrama().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof modeloER.modeloER.AtributoDerivadoEntidad) {
				continue;
			}
			modeloER.modeloER.AtributoDerivadoEntidad link = (modeloER.modeloER.AtributoDerivadoEntidad) linkObject;
			if (modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID != modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			modeloER.modeloER.AtributoDerivado dst = link.getAtributoderivadoDestino();
			modeloER.modeloER.Entidad src = link.getEntidadAtributoDerivadoOrigen();
			if (src != source) {
				continue;
			}
			result.add(new modeloER.modeloER.diagram.part.ModeloERLinkDescriptor(src, dst, link,
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008,
					modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID));
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

		public List<modeloER.modeloER.diagram.part.ModeloERNodeDescriptor> getSemanticChildren(View view) {
			return ModeloERDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getContainedLinks(View view) {
			return ModeloERDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getIncomingLinks(View view) {
			return ModeloERDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<modeloER.modeloER.diagram.part.ModeloERLinkDescriptor> getOutgoingLinks(View view) {
			return ModeloERDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
