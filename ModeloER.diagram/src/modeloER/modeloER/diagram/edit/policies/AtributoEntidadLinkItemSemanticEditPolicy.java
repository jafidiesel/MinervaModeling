package modeloER.modeloER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class AtributoEntidadLinkItemSemanticEditPolicy
		extends modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AtributoEntidadLinkItemSemanticEditPolicy() {
		super(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
