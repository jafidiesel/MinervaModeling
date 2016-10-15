package ModeloER.modeloER.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ModeloERParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser atributoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getAtributoNombre_5001Parser() {
		if (atributoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_Nombre() };
			EAttribute[] editableFeatures = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_Nombre() };
			ModeloER.modeloER.diagram.parsers.MessageFormatParser parser = new ModeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			atributoNombre_5001Parser = parser;
		}
		return atributoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getEntidadNombre_5002Parser() {
		if (entidadNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad_Nombre() };
			EAttribute[] editableFeatures = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad_Nombre() };
			ModeloER.modeloER.diagram.parsers.MessageFormatParser parser = new ModeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			entidadNombre_5002Parser = parser;
		}
		return entidadNombre_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser relacionNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getRelacionNombre_5003Parser() {
		if (relacionNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion_Nombre() };
			EAttribute[] editableFeatures = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion_Nombre() };
			ModeloER.modeloER.diagram.parsers.MessageFormatParser parser = new ModeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			relacionNombre_5003Parser = parser;
		}
		return relacionNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadRelacionLimiteInferiorLimiteSuperior_6001Parser;

	/**
	* @generated
	*/
	private IParser getEntidadRelacionLimiteInferiorLimiteSuperior_6001Parser() {
		if (entidadRelacionLimiteInferiorLimiteSuperior_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteInferior(),
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteSuperior() };
			EAttribute[] editableFeatures = new EAttribute[] {
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteInferior(),
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteSuperior() };
			ModeloER.modeloER.diagram.parsers.MessageFormatParser parser = new ModeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			parser.setViewPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditorPattern("({0},{1})"); //$NON-NLS-1$
			parser.setEditPattern("({0},{1})"); //$NON-NLS-1$
			entidadRelacionLimiteInferiorLimiteSuperior_6001Parser = parser;
		}
		return entidadRelacionLimiteInferiorLimiteSuperior_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ModeloER.modeloER.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID:
			return getAtributoNombre_5001Parser();
		case ModeloER.modeloER.diagram.edit.parts.EntidadNombreEditPart.VISUAL_ID:
			return getEntidadNombre_5002Parser();
		case ModeloER.modeloER.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID:
			return getRelacionNombre_5003Parser();
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionLimiteInferiorLimiteSupEditPart.VISUAL_ID:
			return getEntidadRelacionLimiteInferiorLimiteSuperior_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ModeloER.modeloER.diagram.providers.ModeloERElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
