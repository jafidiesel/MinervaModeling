package modeloER.modeloER.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class LinkASACReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public LinkASACReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof modeloER.modeloER.LinkASAC) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof modeloER.modeloER.AtributoCompuesto
				&& newEnd instanceof modeloER.modeloER.AtributoCompuesto)) {
			return false;
		}
		modeloER.modeloER.AtributoSimple target = getLink().getAtributosimpleDestino();
		if (!(getLink().eContainer() instanceof modeloER.modeloER.Diagrama)) {
			return false;
		}
		modeloER.modeloER.Diagrama container = (modeloER.modeloER.Diagrama) getLink().eContainer();
		return modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkASAC_4005(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof modeloER.modeloER.AtributoSimple
				&& newEnd instanceof modeloER.modeloER.AtributoSimple)) {
			return false;
		}
		modeloER.modeloER.AtributoCompuesto source = getLink().getAtributocompuestoOrigen();
		if (!(getLink().eContainer() instanceof modeloER.modeloER.Diagrama)) {
			return false;
		}
		modeloER.modeloER.Diagrama container = (modeloER.modeloER.Diagrama) getLink().eContainer();
		return modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkASAC_4005(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setAtributocompuestoOrigen(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setAtributosimpleDestino(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.LinkASAC getLink() {
		return (modeloER.modeloER.LinkASAC) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.AtributoCompuesto getOldSource() {
		return (modeloER.modeloER.AtributoCompuesto) oldEnd;
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.AtributoCompuesto getNewSource() {
		return (modeloER.modeloER.AtributoCompuesto) newEnd;
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.AtributoSimple getOldTarget() {
		return (modeloER.modeloER.AtributoSimple) oldEnd;
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.AtributoSimple getNewTarget() {
		return (modeloER.modeloER.AtributoSimple) newEnd;
	}
}
