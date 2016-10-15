package ModeloER.modeloER.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class DiagramaItemSemanticEditPolicy
		extends ModeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DiagramaItemSemanticEditPolicy() {
		super(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Diagrama_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Atributo_2001 == req.getElementType()) {
			return getGEFWrapper(new ModeloER.modeloER.diagram.edit.commands.AtributoCreateCommand(req));
		}
		if (ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Entidad_2002 == req.getElementType()) {
			return getGEFWrapper(new ModeloER.modeloER.diagram.edit.commands.EntidadCreateCommand(req));
		}
		if (ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Relacion_2003 == req.getElementType()) {
			return getGEFWrapper(new ModeloER.modeloER.diagram.edit.commands.RelacionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
