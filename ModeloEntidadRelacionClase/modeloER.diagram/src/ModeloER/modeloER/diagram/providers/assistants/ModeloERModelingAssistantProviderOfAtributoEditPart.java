package ModeloER.modeloER.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloERModelingAssistantProviderOfAtributoEditPart
		extends ModeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ModeloER.modeloER.diagram.edit.parts.AtributoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(ModeloER.modeloER.diagram.edit.parts.AtributoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ModeloER.modeloER.diagram.edit.parts.AtributoEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(ModeloER.modeloER.diagram.edit.parts.AtributoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002) {
			types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Entidad_2002);
		}
		return types;
	}

}
