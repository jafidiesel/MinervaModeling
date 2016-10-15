package ModeloER.modeloER.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EntidadEntidadAtributosReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

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
	public EntidadEntidadAtributosReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof ModeloER.modeloER.Entidad) {
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
		if (!(oldEnd instanceof ModeloER.modeloER.Atributo && newEnd instanceof ModeloER.modeloER.Entidad)) {
			return false;
		}
		return ModeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadEntidadAtributos_4002(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ModeloER.modeloER.Atributo && newEnd instanceof ModeloER.modeloER.Atributo)) {
			return false;
		}
		return ModeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntidadEntidadAtributos_4002(getOldSource(), getNewTarget());
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
		getOldSource().getEntidadAtributos().remove(getOldTarget());
		getNewSource().getEntidadAtributos().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getEntidadAtributos().remove(getOldTarget());
		getOldSource().getEntidadAtributos().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected ModeloER.modeloER.Entidad getOldSource() {
		return (ModeloER.modeloER.Entidad) referenceOwner;
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
	protected ModeloER.modeloER.Atributo getOldTarget() {
		return (ModeloER.modeloER.Atributo) oldEnd;
	}

	/**
	* @generated
	*/
	protected ModeloER.modeloER.Atributo getNewTarget() {
		return (ModeloER.modeloER.Atributo) newEnd;
	}
}
