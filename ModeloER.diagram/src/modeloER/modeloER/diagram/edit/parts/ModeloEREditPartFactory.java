package modeloER.modeloER.diagram.edit.parts;

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
			switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {

			case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.DiagramaEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoDerivadoNombreAtributoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.ClavePrimariaNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.ClavePrimariaNombreAtributoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaNombreAtributoEditPart(
						view);

			case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoSimpleNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoSimpleNombreAtributoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilNombreRelacionEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilNombreRelacionEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteNombreRelacionEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteNombreRelacionEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaNombreAtributoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.HerenciaEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadFuerteNombreEntidadEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadFuerteNombreEntidadEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadDebilNombreEntidadEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadDebilNombreEntidadEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteSuperiorEREditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteSuperiorEREditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart(view);

			case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteSuperiorEREditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteSuperiorEREditPart(view);

			case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.LinkASACEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart(view);

			case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidad2EditPart.VISUAL_ID:
				return new modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidad2EditPart(view);

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
