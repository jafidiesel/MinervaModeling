package modeloER.modeloER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class AtributoDerivadoEntidad2ItemSemanticEditPolicy
		extends modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AtributoDerivadoEntidad2ItemSemanticEditPolicy() {
		super(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4009);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
