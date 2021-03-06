package modeloER.modeloER.diagram.providers;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ModeloERValidationProvider {

	/**
	* @generated
	*/
	private static boolean constraintsActive = false;

	/**
	* @generated
	*/
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	* @generated
	*/
	public static void runWithConstraints(TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().logError("Validation failed", //$NON-NLS-1$
						e);
			}
		} else {
			task.run();
		}
	}

	/**
	* @generated
	*/
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive && modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.MODEL_ID
					.equals(modeloER.modeloER.diagram.part.ModeloERVisualIDRegistry.getModelID((View) object));
		}
		return true;
	}

	/**
	* @generated
	*/
	public static class DefaultCtx implements IClientSelector {

		/**
		* @generated
		*/
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

}
