package ModeloER.modeloER.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ModeloER.modeloER.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ModeloER.modeloER.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ModeloER.modeloER.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ModeloER.modeloER.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ModeloER.modeloER.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
