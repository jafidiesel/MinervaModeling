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
public class LinkHerenciaPadreReorientCommand extends EditElementCommand {

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
	public LinkHerenciaPadreReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof modeloER.modeloER.LinkHerenciaPadre) {
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
		if (!(oldEnd instanceof modeloER.modeloER.Entidad && newEnd instanceof modeloER.modeloER.Entidad)) {
			return false;
		}
		modeloER.modeloER.Herencia target = getLink().getLinkHerenciaPadreHerenciaDestino();
		if (!(getLink().eContainer() instanceof modeloER.modeloER.Diagrama)) {
			return false;
		}
		modeloER.modeloER.Diagrama container = (modeloER.modeloER.Diagrama) getLink().eContainer();
		return modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkHerenciaPadre_4007(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof modeloER.modeloER.Herencia && newEnd instanceof modeloER.modeloER.Herencia)) {
			return false;
		}
		modeloER.modeloER.Entidad source = getLink().getHerenciaPadreEntidadOrigen();
		if (!(getLink().eContainer() instanceof modeloER.modeloER.Diagrama)) {
			return false;
		}
		modeloER.modeloER.Diagrama container = (modeloER.modeloER.Diagrama) getLink().eContainer();
		return modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLinkHerenciaPadre_4007(container, getLink(), source, getNewTarget());
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
		getLink().setHerenciaPadreEntidadOrigen(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setLinkHerenciaPadreHerenciaDestino(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.LinkHerenciaPadre getLink() {
		return (modeloER.modeloER.LinkHerenciaPadre) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.Entidad getOldSource() {
		return (modeloER.modeloER.Entidad) oldEnd;
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.Entidad getNewSource() {
		return (modeloER.modeloER.Entidad) newEnd;
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.Herencia getOldTarget() {
		return (modeloER.modeloER.Herencia) oldEnd;
	}

	/**
	* @generated
	*/
	protected modeloER.modeloER.Herencia getNewTarget() {
		return (modeloER.modeloER.Herencia) newEnd;
	}
}
