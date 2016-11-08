package modeloER.modeloER.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ModeloERVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "ModeloER.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(view.getType())) {
				return modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getDiagrama().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((modeloER.modeloER.Diagrama) domainElement)) {
			return modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(containerView);
		if (!modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivado()
					.isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getClavePrimaria().isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivadoClavePrimaria()
					.isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoSimple().isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoCompuesto()
					.isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacionTipoDebil()
					.isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacionTipoFuerte()
					.isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoMultivaluado()
					.isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getClavePrimariaForanea()
					.isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getClaveForanea().isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getHerencia().isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadFuerte().isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID;
			}
			if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadDebil().isSuperTypeOf(domainElement.eClass())) {
				return modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(containerView);
		if (!modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.AtributoDerivadoNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.ClavePrimariaNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.AtributoSimpleNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilNombreRelacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteNombreRelacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.EntidadFuerteNombreEntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.EntidadDebilNombreEntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteSuperiorEREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteSuperiorEREditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoEntidadLink()
				.isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getLinkHerenciaHijo().isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacionFuerte()
				.isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacionDebil()
				.isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getLinkASAC().isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacionAtributoLink()
				.isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getLinkHerenciaPadre().isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivadoEntidad()
				.isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID;
		}
		if (modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivadoEntidad()
				.isSuperTypeOf(domainElement.eClass())) {
			return modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidad2EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(modeloER.modeloER.Diagrama element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return false;
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
