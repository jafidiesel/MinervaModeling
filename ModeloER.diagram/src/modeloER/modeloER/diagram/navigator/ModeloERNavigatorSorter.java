package modeloER.modeloER.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class ModeloERNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4011;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) {
			modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem item = (modeloER.modeloER.diagram.navigator.ModeloERNavigatorItem) element;
			return modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
