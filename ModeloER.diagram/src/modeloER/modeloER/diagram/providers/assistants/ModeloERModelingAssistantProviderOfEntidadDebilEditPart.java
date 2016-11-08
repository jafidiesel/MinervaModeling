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
public class ModeloERModelingAssistantProviderOfEntidadDebilEditPart
		extends modeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4009);
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
				(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.HerenciaEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008);
		}
		if (targetEditPart instanceof modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4009);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimaria_2002);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoClavePrimaria_2003);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2004);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoCompuesto_2005);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoMultivaluado_2008);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimariaForanea_2009);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClaveForanea_2010);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2006);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2007);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2006);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2007);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.Herencia_2011);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4009) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoClavePrimaria_2003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.Herencia_2011);
		}
		return types;
	}

}
