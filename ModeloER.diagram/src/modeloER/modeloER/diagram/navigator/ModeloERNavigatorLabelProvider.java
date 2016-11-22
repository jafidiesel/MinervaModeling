package modeloER.modeloER.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ModeloERNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem
				&& !isOwnView(((modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) {
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup group = (modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) element;
			return modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) {
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem navigatorItem = (modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/modeloER?Diagrama", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.Diagrama_1000);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?AtributoDerivado", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001);
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?ClavePrimaria", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimaria_2002);
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?AtributoSimple", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2003);
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?AtributoCompuesto", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoCompuesto_2004);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?RelacionTipoDebil", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2005);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?RelacionTipoFuerte", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2006);
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?AtributoMultivaluado", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoMultivaluado_2007);
		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?Herencia", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.Herencia_2008);
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?EntidadFuerte", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009);
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?EntidadDebil", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010);
		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?AtributoEntidadLink", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?LinkHerenciaHijo", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?EntidadRelacionFuerte", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?EntidadRelacionDebil", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004);
		case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?LinkASAC", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005);
		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?RelacionAtributoLink", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?LinkHerenciaPadre", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?AtributoDerivadoEntidad", //$NON-NLS-1$
					modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& modeloER.modeloER.diagram.providers.ModeloERElementTypes.isKnownElementType(elementType)) {
			image = modeloER.modeloER.diagram.providers.ModeloERElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) {
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup group = (modeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) {
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem navigatorItem = (modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000Text(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
			return getAtributoDerivado_2001Text(view);
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
			return getClavePrimaria_2002Text(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
			return getAtributoSimple_2003Text(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
			return getAtributoCompuesto_2004Text(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
			return getRelacionTipoDebil_2005Text(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
			return getRelacionTipoFuerte_2006Text(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
			return getAtributoMultivaluado_2007Text(view);
		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
			return getHerencia_2008Text(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
			return getEntidadFuerte_2009Text(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			return getEntidadDebil_2010Text(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
			return getAtributoEntidadLink_4001Text(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
			return getLinkHerenciaHijo_4002Text(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return getEntidadRelacionFuerte_4003Text(view);
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return getEntidadRelacionDebil_4004Text(view);
		case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID:
			return getLinkASAC_4005Text(view);
		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
			return getRelacionAtributoLink_4006Text(view);
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
			return getLinkHerenciaPadre_4007Text(view);
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
			return getAtributoDerivadoEntidad_4008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getDiagrama_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAtributoDerivado_2001Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
						modeloER.modeloER.diagram.edit.parts.AtributoDerivadoNombreAtributoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getClavePrimaria_2002Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimaria_2002,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
						.getType(modeloER.modeloER.diagram.edit.parts.ClavePrimariaNombreAtributoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributoSimple_2003Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2003,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
						.getType(modeloER.modeloER.diagram.edit.parts.AtributoSimpleNombreAtributoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributoCompuesto_2004Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoCompuesto_2004,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
						modeloER.modeloER.diagram.edit.parts.AtributoCompuestoNombreAtributoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelacionTipoDebil_2005Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2005,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
						modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilNombreRelacionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelacionTipoFuerte_2006Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2006,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
						modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteNombreRelacionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributoMultivaluado_2007Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoMultivaluado_2007,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
						modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoNombreAtributoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHerencia_2008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEntidadFuerte_2009Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2009,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
						.getType(modeloER.modeloER.diagram.edit.parts.EntidadFuerteNombreEntidadEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadDebil_2010Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2010,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
						.getType(modeloER.modeloER.diagram.edit.parts.EntidadDebilNombreEntidadEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAtributoEntidadLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getLinkHerenciaHijo_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getEntidadRelacionFuerte_4003Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
						modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteLimiteInferiorEREditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadRelacionDebil_4004Text(View view) {
		IParser parser = modeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004,
				view.getElement() != null ? view.getElement() : view,
				modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
						modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilLimiteInferiorEREditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLinkASAC_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getRelacionAtributoLink_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getLinkHerenciaPadre_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getAtributoDerivadoEntidad_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(view));
	}

}
