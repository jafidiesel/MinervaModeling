package ModeloER.modeloER.diagram.part;

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
	private static final String DEBUG_KEY = "modeloER.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(view.getType())) {
				return ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view.getType());
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
				ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
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
		if (ModeloER.modeloER.ModeloERPackage.eINSTANCE.getDiagrama().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ModeloER.modeloER.Diagrama) domainElement)) {
			return ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
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
		String containerModelID = ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(containerView);
		if (!ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			if (ModeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo().isSuperTypeOf(domainElement.eClass())) {
				return ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID;
			}
			if (ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad().isSuperTypeOf(domainElement.eClass())) {
				return ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID;
			}
			if (ModeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion().isSuperTypeOf(domainElement.eClass())) {
				return ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(containerView);
		if (!ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			if (ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			if (ModeloER.modeloER.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			if (ModeloER.modeloER.diagram.edit.parts.EntidadNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			if (ModeloER.modeloER.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
			if (ModeloER.modeloER.diagram.edit.parts.EntidadRelacionLimiteInferiorLimiteSupEditPart.VISUAL_ID == nodeVisualID) {
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
		if (ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion().isSuperTypeOf(domainElement.eClass())) {
			return ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ModeloER.modeloER.Diagrama element) {
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
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return false;
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
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
			return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
