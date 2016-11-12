package modeloER.modeloER.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloERModelingAssistantProviderOfDiagramaEditPart
		extends modeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(13);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimaria_2002);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoClavePrimaria_2003);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2004);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoCompuesto_2005);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2006);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2007);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoMultivaluado_2008);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimariaForanea_2009);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClaveForanea_2010);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.Herencia_2011);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2012);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2013);
		return types;
	}

}
