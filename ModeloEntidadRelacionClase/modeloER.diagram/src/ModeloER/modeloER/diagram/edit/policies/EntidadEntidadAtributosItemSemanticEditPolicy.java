package ModeloER.modeloER.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class EntidadEntidadAtributosItemSemanticEditPolicy
		extends ModeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntidadEntidadAtributosItemSemanticEditPolicy() {
		super(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
