package ModeloER.modeloER.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ModeloERModelingAssistantProviderOfDiagramaEditPart
		extends ModeloER.modeloER.diagram.providers.ModeloERModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Atributo_2001);
		types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Entidad_2002);
		types.add(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Relacion_2003);
		return types;
	}

}
