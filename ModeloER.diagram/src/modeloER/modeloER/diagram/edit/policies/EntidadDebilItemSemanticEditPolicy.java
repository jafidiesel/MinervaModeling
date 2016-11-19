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
public class EntidadDebilItemSemanticEditPolicy
		extends modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntidadDebilItemSemanticEditPolicy() {
		super(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2013);
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
					incomingLink) == modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					outgoingLink) == modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					outgoingLink) == modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					outgoingLink) == modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					outgoingLink) == modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					outgoingLink) == modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(
					outgoingLink) == modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidad2EditPart.VISUAL_ID) {
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
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoEntidadLinkCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002 == req.getElementType()) {
			return null;
		}
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
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.LinkHerenciaPadreCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008 == req
				.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoDerivadoEntidadCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4009 == req
				.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoDerivadoEntidad2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001 == req.getElementType()) {
			return null;
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.LinkHerenciaHijoCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003 == req
				.getElementType()) {
			return null;
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004 == req
				.getElementType()) {
			return null;
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007 == req.getElementType()) {
			return null;
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008 == req
				.getElementType()) {
			return null;
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4009 == req
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
		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoEntidadLinkReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.LinkHerenciaHijoReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadRelacionFuerteReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadRelacionDebilReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.LinkHerenciaPadreReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
			return getGEFWrapper(
					new modeloER.modeloER.diagram.edit.commands.AtributoDerivadoEntidadReorientCommand(req));
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidad2EditPart.VISUAL_ID:
			return getGEFWrapper(
					new modeloER.modeloER.diagram.edit.commands.AtributoDerivadoEntidad2ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}