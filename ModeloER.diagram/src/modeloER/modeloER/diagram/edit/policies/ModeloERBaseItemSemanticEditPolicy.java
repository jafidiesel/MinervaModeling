package modeloER.modeloER.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

/**
 * @generated
 */
public class ModeloERBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	* Extended request data key to hold editpart visual id.
	* @generated
	*/
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	* @generated
	*/
	private final IElementType myElementType;

	/**
	* @generated
	*/
	protected ModeloERBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	* Extended request data key to hold editpart visual id.
	* Add visual id of edited editpart to extended data of the request
	* so command switch can decide what kind of diagram element is being edited.
	* It is done in those cases when it's not possible to deduce diagram
	* element kind from domain element.
	* 
	* @generated
	*/
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart().getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	* Returns visual id from request parameters.
	* @generated
	*/
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest, semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	* @generated
	*/
	protected Command addDeleteViewCommand(Command mainCommand, DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand.chain(deleteViewCommand);
	}

	/**
	* @generated
	*/
	private Command getEditHelperCommand(IEditCommandRequest request, Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy
					? ((ICommandProxy) editPolicyCommand).getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(), command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	* @generated
	*/
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = modeloER.modeloER.diagram.providers.ModeloERElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType : myElementType;
	}

	/**
	* @generated
	*/
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	* @generated
	*/
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	* Returns editing domain from the host edit part.
	* @generated
	*/
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	* Clean all shortcuts to the host element from the same diagram
	* @generated
	*/
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() //$NON-NLS-1$
					|| nextView.getElement() != view.getElement()) {
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	* @generated
	*/
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		* @generated
		*/
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateAtributoEntidadLink_4001(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Entidad source, modeloER.modeloER.Atributo target) {
			return canExistAtributoEntidadLink_4001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLinkHerenciaHijo_4002(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Herencia source, modeloER.modeloER.Entidad target) {
			return canExistLinkHerenciaHijo_4002(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEntidadRelacionFuerte_4003(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Entidad source, modeloER.modeloER.Relacion target) {
			return canExistEntidadRelacionFuerte_4003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateEntidadRelacionDebil_4004(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Entidad source, modeloER.modeloER.Relacion target) {
			return canExistEntidadRelacionDebil_4004(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLinkASAC_4005(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.AtributoCompuesto source, modeloER.modeloER.AtributoSimple target) {
			return canExistLinkASAC_4005(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRelacionAtributoLink_4006(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Relacion source, modeloER.modeloER.Atributo target) {
			return canExistRelacionAtributoLink_4006(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateLinkHerenciaPadre_4007(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Entidad source, modeloER.modeloER.Herencia target) {
			return canExistLinkHerenciaPadre_4007(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAtributoDerivadoEntidad_4008(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Entidad source, modeloER.modeloER.AtributoDerivado target) {
			return canExistAtributoDerivadoEntidad_4008(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAtributoDerivadoEntidad_4009(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.Entidad source, modeloER.modeloER.AtributoDerivadoClavePrimaria target) {
			return canExistAtributoDerivadoEntidad_4009(container, null, source, target);
		}

		/**
		* @generated
		*/
		public boolean canExistAtributoEntidadLink_4001(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.AtributoEntidadLink linkInstance, modeloER.modeloER.Entidad source,
				modeloER.modeloER.Atributo target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLinkHerenciaHijo_4002(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.LinkHerenciaHijo linkInstance, modeloER.modeloER.Herencia source,
				modeloER.modeloER.Entidad target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistEntidadRelacionFuerte_4003(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.EntidadRelacionFuerte linkInstance, modeloER.modeloER.Entidad source,
				modeloER.modeloER.Relacion target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistEntidadRelacionDebil_4004(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.EntidadRelacionDebil linkInstance, modeloER.modeloER.Entidad source,
				modeloER.modeloER.Relacion target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLinkASAC_4005(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.LinkASAC linkInstance, modeloER.modeloER.AtributoCompuesto source,
				modeloER.modeloER.AtributoSimple target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistRelacionAtributoLink_4006(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.RelacionAtributoLink linkInstance, modeloER.modeloER.Relacion source,
				modeloER.modeloER.Atributo target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistLinkHerenciaPadre_4007(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.LinkHerenciaPadre linkInstance, modeloER.modeloER.Entidad source,
				modeloER.modeloER.Herencia target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistAtributoDerivadoEntidad_4008(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.AtributoDerivadoEntidad linkInstance, modeloER.modeloER.Entidad source,
				modeloER.modeloER.AtributoDerivado target) {
			return true;
		}

		/**
		* @generated
		*/
		public boolean canExistAtributoDerivadoEntidad_4009(modeloER.modeloER.Diagrama container,
				modeloER.modeloER.AtributoDerivadoEntidad linkInstance, modeloER.modeloER.Entidad source,
				modeloER.modeloER.AtributoDerivadoClavePrimaria target) {
			return true;
		}
	}

}
