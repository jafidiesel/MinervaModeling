package ModeloER.modeloER.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
