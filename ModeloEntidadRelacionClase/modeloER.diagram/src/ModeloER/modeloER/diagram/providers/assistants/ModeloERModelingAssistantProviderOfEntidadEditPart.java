package ModeloER.modeloER.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloERModelingAssistantProviderOfEntidadEditPart
		extends ModeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ModeloER.modeloER.diagram.edit.parts.EntidadEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(ModeloER.modeloER.diagram.edit.parts.EntidadEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001);
		types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ModeloER.modeloER.diagram.edit.parts.EntidadEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ModeloER.modeloER.diagram.edit.parts.EntidadEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ModeloER.modeloER.diagram.edit.parts.RelacionEditPart) {
			types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001);
		}
		if (targetEditPart instanceof ModeloER.modeloER.diagram.edit.parts.AtributoEditPart) {
			types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ModeloER.modeloER.diagram.edit.parts.EntidadEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(ModeloER.modeloER.diagram.edit.parts.EntidadEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001) {
			types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Relacion_2003);
		} else
			if (relationshipType == ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002) {
			types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Atributo_2001);
		}
		return types;
	}

}
