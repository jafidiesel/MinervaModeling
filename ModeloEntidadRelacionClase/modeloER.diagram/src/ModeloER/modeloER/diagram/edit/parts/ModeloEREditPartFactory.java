package ModeloER.modeloER.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class ModeloEREditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {

			case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.AtributoEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.AtributoNombreEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.EntidadEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.EntidadNombreEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.EntidadNombreEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.RelacionEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.RelacionNombreEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionLimiteInferiorLimiteSupEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.EntidadRelacionLimiteInferiorLimiteSupEditPart(view);

			case ModeloER.modeloER.diagram.edit.parts.EntidadEntidadAtributosEditPart.VISUAL_ID:
				return new ModeloER.modeloER.diagram.edit.parts.EntidadEntidadAtributosEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
