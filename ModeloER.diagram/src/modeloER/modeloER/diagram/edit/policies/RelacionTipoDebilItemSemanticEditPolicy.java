package modeloER.modeloER.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RelacionTipoDebilItemSemanticEditPolicy
		extends modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RelacionTipoDebilItemSemanticEditPolicy() {
		super(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					incomingLink) == modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					incomingLink) == modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					outgoingLink) == modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003 == req
				.getElementType()) {
			return null;
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004 == req
				.getElementType()) {
			return null;
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006 == req
				.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.RelacionAtributoLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003 == req
				.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadRelacionFuerteCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004 == req
				.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadRelacionDebilCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadRelacionFuerteReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadRelacionDebilReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.RelacionAtributoLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
