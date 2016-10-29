package modeloER.modeloER.diagram.providers;

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
		ElementInitializers cached = modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
