package modeloER.modeloER.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloERModelingAssistantProviderOfRelacionTipoFuerteEditPart
		extends modeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(
			modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010);
		} else if (relationshipType == modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006) {
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimaria_2002);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2003);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoCompuesto_2004);
			types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoMultivaluado_2007);
		}
		return types;
	}

}
