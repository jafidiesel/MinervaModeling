package modeloER.modeloER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class LinkHerenciaHijoItemSemanticEditPolicy
		extends modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LinkHerenciaHijoItemSemanticEditPolicy() {
		super(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
