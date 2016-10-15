package ModeloER.modeloER.diagram.navigator;

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
		ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem
				&& !isOwnView(((ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof ModeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) {
			ModeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup group = (ModeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) element;
			return ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) {
			ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem navigatorItem = (ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element;
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
		switch (ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/modeloER?Diagrama", //$NON-NLS-1$
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Diagrama_1000);
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?Atributo", //$NON-NLS-1$
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Atributo_2001);
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?Entidad", //$NON-NLS-1$
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Entidad_2002);
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/modeloER?Relacion", //$NON-NLS-1$
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Relacion_2003);
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?EntidadRelacion", //$NON-NLS-1$
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001);
		case ModeloER.modeloER.diagram.edit.parts.EntidadEntidadAtributosEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/modeloER?Entidad?entidadAtributos", //$NON-NLS-1$
					ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadEntidadAtributos_4002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ModeloER.modeloER.diagram.providers.ModeloERElementTypes.isKnownElementType(elementType)) {
			image = ModeloER.modeloER.diagram.providers.ModeloERElementTypes.getImage(elementType);
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
		if (element instanceof ModeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) {
			ModeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup group = (ModeloER.modeloER.diagram.navigator.ModeloERNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) {
			ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem navigatorItem = (ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element;
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
		switch (ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(view)) {
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000Text(view);
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_2001Text(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return getEntidad_2002Text(view);
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_2003Text(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
			return getEntidadRelacion_4001Text(view);
		case ModeloER.modeloER.diagram.edit.parts.EntidadEntidadAtributosEditPart.VISUAL_ID:
			return getEntidadEntidadAtributos_4002Text(view);
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
	private String getAtributo_2001Text(View view) {
		IParser parser = ModeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Atributo_2001,
				view.getElement() != null ? view.getElement() : view,
				ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
						.getType(ModeloER.modeloER.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidad_2002Text(View view) {
		IParser parser = ModeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Entidad_2002,
				view.getElement() != null ? view.getElement() : view,
				ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
						.getType(ModeloER.modeloER.diagram.edit.parts.EntidadNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelacion_2003Text(View view) {
		IParser parser = ModeloER.modeloER.diagram.providers.ModeloERParserProvider.getParser(
				ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Relacion_2003,
				view.getElement() != null ? view.getElement() : view,
				ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry
						.getType(ModeloER.modeloER.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadRelacion_4001Text(View view) {
		IParser parser = ModeloER.modeloER.diagram.providers.ModeloERParserProvider
				.getParser(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacion_4001,
						view.getElement() != null ? view.getElement()
								: view,
						ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getType(
								ModeloER.modeloER.diagram.edit.parts.EntidadRelacionLimiteInferiorLimiteSupEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntidadEntidadAtributos_4002Text(View view) {
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
		return ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID(view));
	}

}
