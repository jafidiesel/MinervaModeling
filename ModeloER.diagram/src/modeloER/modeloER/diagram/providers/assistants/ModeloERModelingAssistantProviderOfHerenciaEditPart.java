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
public class ModeloERModelingAssistantProviderOfHerenciaEditPart
		extends modeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((modeloER.modeloER.diagram.edit.parts.HerenciaEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(modeloER.modeloER.diagram.edit.parts.HerenciaEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((modeloER.modeloER.diagram.edit.parts.HerenciaEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			modeloER.modeloER.diagram.edit.parts.HerenciaEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((modeloER.modeloER.diagram.edit.parts.HerenciaEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(modeloER.modeloER.diagram.edit.parts.HerenciaEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((modeloER.modeloER.diagram.edit.parts.HerenciaEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(modeloER.modeloER.diagram.edit.parts.HerenciaEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((modeloER.modeloER.diagram.edit.parts.HerenciaEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(modeloER.modeloER.diagram.edit.parts.HerenciaEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010);
		}
		return types;
	}

}
