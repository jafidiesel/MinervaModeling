package ModeloER.modeloER.diagram.edit.commands;

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
public class EntidadRelacionReorientCommand extends EditElementCommand {

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
	public EntidadRelacionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof ModeloER.modeloER.EntidadRelacion) {
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
		if (!(oldEnd instanceof ModeloER.modeloER.Entidad && newEnd instanceof ModeloER.modeloER.Entidad)) {
			return false;
		}
		ModeloER.modeloER.Relacion target = getLink().getEntidadRelacionRelaciones();
		if (!(getLink().eContainer() instanceof ModeloER.modeloER.Diagrama)) {
			return false;
		}
		ModeloER.modeloER.Diagrama container = (ModeloER.modeloER.Diagrama) getLink().eContainer();
		return ModeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadRelacion_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ModeloER.modeloER.Relacion && newEnd instanceof ModeloER.modeloER.Relacion)) {
			return false;
		}
		ModeloER.modeloER.Entidad source = getLink().getRelacionEntidades();
		if (!(getLink().eContainer() instanceof ModeloER.modeloER.Diagrama)) {
			return false;
		}
		ModeloER.modeloER.Diagrama container = (ModeloER.modeloER.Diagrama) getLink().eContainer();
		return ModeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadRelacion_4001(container, getLink(), source, getNewTarget());
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
		getLink().setRelacionEntidades(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setEntidadRelacionRelaciones(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected ModeloER.modeloER.EntidadRelacion getLink() {
		return (ModeloER.modeloER.EntidadRelacion) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected ModeloER.modeloER.Entidad getOldSource() {
		return (ModeloER.modeloER.Entidad) oldEnd;
	}

	/**
	* @generated
	*/
	protected ModeloER.modeloER.Entidad getNewSource() {
		return (ModeloER.modeloER.Entidad) newEnd;
	}

	/**
	* @generated
	*/
	protected ModeloER.modeloER.Relacion getOldTarget() {
		return (ModeloER.modeloER.Relacion) oldEnd;
	}

	/**
	* @generated
	*/
	protected ModeloER.modeloER.Relacion getNewTarget() {
		return (ModeloER.modeloER.Relacion) newEnd;
	}
}
