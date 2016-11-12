package modeloER.modeloER.diagram.edit.policies;

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
		extends modeloER.modeloER.diagram.edit.policies.ModeloERBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DiagramaItemSemanticEditPolicy() {
		super(modeloER.modeloER.diagram.providers.ModeloERElementTypes.Diagrama_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoDerivadoCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimaria_2002 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.ClavePrimariaCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoClavePrimaria_2003 == req
				.getElementType()) {
			return getGEFWrapper(
					new modeloER.modeloER.diagram.edit.commands.AtributoDerivadoClavePrimariaCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2004 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoSimpleCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoCompuesto_2005 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoCompuestoCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2006 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.RelacionTipoDebilCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2007 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.RelacionTipoFuerteCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoMultivaluado_2008 == req
				.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.AtributoMultivaluadoCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimariaForanea_2009 == req
				.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.ClavePrimariaForaneaCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClaveForanea_2010 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.ClaveForaneaCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.Herencia_2011 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.HerenciaCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2012 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadFuerteCreateCommand(req));
		}
		if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2013 == req.getElementType()) {
			return getGEFWrapper(new modeloER.modeloER.diagram.edit.commands.EntidadDebilCreateCommand(req));
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
