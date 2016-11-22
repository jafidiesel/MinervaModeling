package modeloER.modeloER.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloERModelingAssistantProviderOfAtributoMultivaluadoEditPart
		extends modeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource(
				(modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(
			modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2005);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2006);
		}
		return types;
	}

}
