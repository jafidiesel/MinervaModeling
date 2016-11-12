package modeloER.modeloER.diagram.providers;

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
	private IParser atributoDerivadoNombreAtributo_5001Parser;

	/**
	* @generated
	*/
	private IParser getAtributoDerivadoNombreAtributo_5001Parser() {
		if (atributoDerivadoNombreAtributo_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			atributoDerivadoNombreAtributo_5001Parser = parser;
		}
		return atributoDerivadoNombreAtributo_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser clavePrimariaNombreAtributo_5002Parser;

	/**
	* @generated
	*/
	private IParser getClavePrimariaNombreAtributo_5002Parser() {
		if (clavePrimariaNombreAtributo_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			clavePrimariaNombreAtributo_5002Parser = parser;
		}
		return clavePrimariaNombreAtributo_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser atributoDerivadoClavePrimariaNombreAtributo_5003Parser;

	/**
	* @generated
	*/
	private IParser getAtributoDerivadoClavePrimariaNombreAtributo_5003Parser() {
		if (atributoDerivadoClavePrimariaNombreAtributo_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			atributoDerivadoClavePrimariaNombreAtributo_5003Parser = parser;
		}
		return atributoDerivadoClavePrimariaNombreAtributo_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser atributoSimpleNombreAtributo_5004Parser;

	/**
	* @generated
	*/
	private IParser getAtributoSimpleNombreAtributo_5004Parser() {
		if (atributoSimpleNombreAtributo_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			atributoSimpleNombreAtributo_5004Parser = parser;
		}
		return atributoSimpleNombreAtributo_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser atributoCompuestoNombreAtributo_5005Parser;

	/**
	* @generated
	*/
	private IParser getAtributoCompuestoNombreAtributo_5005Parser() {
		if (atributoCompuestoNombreAtributo_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			atributoCompuestoNombreAtributo_5005Parser = parser;
		}
		return atributoCompuestoNombreAtributo_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser relacionTipoDebilNombreRelacion_5006Parser;

	/**
	* @generated
	*/
	private IParser getRelacionTipoDebilNombreRelacion_5006Parser() {
		if (relacionTipoDebilNombreRelacion_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion_NombreRelacion() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion_NombreRelacion() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			relacionTipoDebilNombreRelacion_5006Parser = parser;
		}
		return relacionTipoDebilNombreRelacion_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser relacionTipoFuerteNombreRelacion_5007Parser;

	/**
	* @generated
	*/
	private IParser getRelacionTipoFuerteNombreRelacion_5007Parser() {
		if (relacionTipoFuerteNombreRelacion_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion_NombreRelacion() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion_NombreRelacion() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			relacionTipoFuerteNombreRelacion_5007Parser = parser;
		}
		return relacionTipoFuerteNombreRelacion_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser atributoMultivaluadoNombreAtributo_5008Parser;

	/**
	* @generated
	*/
	private IParser getAtributoMultivaluadoNombreAtributo_5008Parser() {
		if (atributoMultivaluadoNombreAtributo_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			atributoMultivaluadoNombreAtributo_5008Parser = parser;
		}
		return atributoMultivaluadoNombreAtributo_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser clavePrimariaForaneaNombreAtributo_5009Parser;

	/**
	* @generated
	*/
	private IParser getClavePrimariaForaneaNombreAtributo_5009Parser() {
		if (clavePrimariaForaneaNombreAtributo_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			clavePrimariaForaneaNombreAtributo_5009Parser = parser;
		}
		return clavePrimariaForaneaNombreAtributo_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser claveForaneaNombreAtributo_5010Parser;

	/**
	* @generated
	*/
	private IParser getClaveForaneaNombreAtributo_5010Parser() {
		if (claveForaneaNombreAtributo_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo_NombreAtributo() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			claveForaneaNombreAtributo_5010Parser = parser;
		}
		return claveForaneaNombreAtributo_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadFuerteNombreEntidad_5011Parser;

	/**
	* @generated
	*/
	private IParser getEntidadFuerteNombreEntidad_5011Parser() {
		if (entidadFuerteNombreEntidad_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad_NombreEntidad() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad_NombreEntidad() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			entidadFuerteNombreEntidad_5011Parser = parser;
		}
		return entidadFuerteNombreEntidad_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadDebilNombreEntidad_5012Parser;

	/**
	* @generated
	*/
	private IParser getEntidadDebilNombreEntidad_5012Parser() {
		if (entidadDebilNombreEntidad_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad_NombreEntidad() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad_NombreEntidad() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			entidadDebilNombreEntidad_5012Parser = parser;
		}
		return entidadDebilNombreEntidad_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadRelacionFuerteLimiteInferiorER_6001Parser;

	/**
	* @generated
	*/
	private IParser getEntidadRelacionFuerteLimiteInferiorER_6001Parser() {
		if (entidadRelacionFuerteLimiteInferiorER_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteInferiorER() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteInferiorER() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			entidadRelacionFuerteLimiteInferiorER_6001Parser = parser;
		}
		return entidadRelacionFuerteLimiteInferiorER_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadRelacionFuerteLimiteSuperiorER_6002Parser;

	/**
	* @generated
	*/
	private IParser getEntidadRelacionFuerteLimiteSuperiorER_6002Parser() {
		if (entidadRelacionFuerteLimiteSuperiorER_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteSuperiorER() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteSuperiorER() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			entidadRelacionFuerteLimiteSuperiorER_6002Parser = parser;
		}
		return entidadRelacionFuerteLimiteSuperiorER_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadRelacionDebilLimiteInferiorER_6003Parser;

	/**
	* @generated
	*/
	private IParser getEntidadRelacionDebilLimiteInferiorER_6003Parser() {
		if (entidadRelacionDebilLimiteInferiorER_6003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteInferiorER() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteInferiorER() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			entidadRelacionDebilLimiteInferiorER_6003Parser = parser;
		}
		return entidadRelacionDebilLimiteInferiorER_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser entidadRelacionDebilLimiteSuperiorER_6004Parser;

	/**
	* @generated
	*/
	private IParser getEntidadRelacionDebilLimiteSuperiorER_6004Parser() {
		if (entidadRelacionDebilLimiteSuperiorER_6004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteSuperiorER() };
			EAttribute[] editableFeatures = new EAttribute[] {
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion_LimiteSuperiorER() };
			modeloER.modeloER.diagram.parsers.MessageFormatParser parser = new modeloER.modeloER.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			entidadRelacionDebilLimiteSuperiorER_6004Parser = parser;
		}
		return entidadRelacionDebilLimiteSuperiorER_6004Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoNombreAtributoEditPart.VISUAL_ID:
			return getAtributoDerivadoNombreAtributo_5001Parser();
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaNombreAtributoEditPart.VISUAL_ID:
			return getClavePrimariaNombreAtributo_5002Parser();
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaNombreAtributoEditPart.VISUAL_ID:
			return getAtributoDerivadoClavePrimariaNombreAtributo_5003Parser();
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleNombreAtributoEditPart.VISUAL_ID:
			return getAtributoSimpleNombreAtributo_5004Parser();
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart.VISUAL_ID:
			return getAtributoCompuestoNombreAtributo_5005Parser();
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilNombreRelacionEditPart.VISUAL_ID:
			return getRelacionTipoDebilNombreRelacion_5006Parser();
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteNombreRelacionEditPart.VISUAL_ID:
			return getRelacionTipoFuerteNombreRelacion_5007Parser();
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart.VISUAL_ID:
			return getAtributoMultivaluadoNombreAtributo_5008Parser();
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaNombreAtributoEditPart.VISUAL_ID:
			return getClavePrimariaForaneaNombreAtributo_5009Parser();
		case modeloER.modeloER.diagram.edit.parts.ClaveForaneaNombreAtributoEditPart.VISUAL_ID:
			return getClaveForaneaNombreAtributo_5010Parser();
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteNombreEntidadEditPart.VISUAL_ID:
			return getEntidadFuerteNombreEntidad_5011Parser();
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilNombreEntidadEditPart.VISUAL_ID:
			return getEntidadDebilNombreEntidad_5012Parser();
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart.VISUAL_ID:
			return getEntidadRelacionFuerteLimiteInferiorER_6001Parser();
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteSuperiorEREditPart.VISUAL_ID:
			return getEntidadRelacionFuerteLimiteSuperiorER_6002Parser();
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart.VISUAL_ID:
			return getEntidadRelacionDebilLimiteInferiorER_6003Parser();
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteSuperiorEREditPart.VISUAL_ID:
			return getEntidadRelacionDebilLimiteSuperiorER_6004Parser();
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
			return getParser(modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (modeloER.modeloER.diagram.providers.ModeloERElementTypes.getElement(hint) == null) {
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
