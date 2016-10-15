package ModeloER.modeloER.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ModeloERNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) {
			ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem item = (ModeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element;
			return ModeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
