package modeloER.modeloER.diagram.part;

import org.eclipse.gmf.tooling.runtime.part.DefaultModelElementSelectionPage;

/**
 * Wizard page that allows to select element from model.
 * @generated
 */
public class ModelElementSelectionPage extends DefaultModelElementSelectionPage {

	/**
	* @generated
	*/
	public ModelElementSelectionPage(String pageName) {
		super(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory(),
				pageName);
	}

	/**
	 * Override to provide custom model element description.
	 * @generated
	 */
	protected String getSelectionTitle() {
		return modeloER.modeloER.diagram.part.Messages.ModelElementSelectionPageMessage;
	}

}
