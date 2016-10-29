package modeloER.modeloER.diagram.preferences;

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
		modeloER.modeloER.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		modeloER.modeloER.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		modeloER.modeloER.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		modeloER.modeloER.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		modeloER.modeloER.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
