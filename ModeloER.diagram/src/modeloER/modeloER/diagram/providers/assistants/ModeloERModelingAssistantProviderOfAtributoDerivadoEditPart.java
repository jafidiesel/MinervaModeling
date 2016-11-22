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
public class ModeloERModelingAssistantProviderOfAtributoDerivadoEditPart
		extends modeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart source) {
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
				(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart source, IGraphicalEditPart targetEditPart) {
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
		return doGetTypesForTarget((modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart source,
			IElementType relationshipType) {
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

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010);
		}
		return types;
	}

}
