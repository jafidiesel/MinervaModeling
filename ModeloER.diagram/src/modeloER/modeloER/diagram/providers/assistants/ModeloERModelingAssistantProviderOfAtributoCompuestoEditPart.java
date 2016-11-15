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
public class ModeloERModelingAssistantProviderOfAtributoCompuestoEditPart
		extends modeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005);
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
				(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2012);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2013);
		} else
			if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2006);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2007);
		}
		return types;
	}

}
