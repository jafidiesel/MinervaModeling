
package ModeloER.modeloER.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ModeloERPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createModeloER1Group());
	}

	/**
	* Creates "modeloER" palette tool group
	* @generated
	*/
	private PaletteContainer createModeloER1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(ModeloER.modeloER.diagram.part.Messages.ModeloER1Group_title);
		paletteContainer.setId("createModeloER1Group"); //$NON-NLS-1$
		paletteContainer.add(createEntidad1CreationTool());
		paletteContainer.add(createEntidadEntidadAtributos2CreationTool());
		paletteContainer.add(createAtributo3CreationTool());
		paletteContainer.add(createEntidadRelacion4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidad1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ModeloER.modeloER.diagram.part.Messages.Entidad1CreationTool_title,
				ModeloER.modeloER.diagram.part.Messages.Entidad1CreationTool_desc,
				Collections.singletonList(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Entidad_2002));
		entry.setId("createEntidad1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/Entidad.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/Entidad.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidadEntidadAtributos2CreationTool() {
		ToolEntry entry = new ToolEntry(
				ModeloER.modeloER.diagram.part.Messages.EntidadEntidadAtributos2CreationTool_title,
				ModeloER.modeloER.diagram.part.Messages.EntidadEntidadAtributos2CreationTool_desc, null, null) {
		};
		entry.setId("createEntidadEntidadAtributos2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/EntidadAtributos.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/EntidadAtributos.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributo3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ModeloER.modeloER.diagram.part.Messages.Atributo3CreationTool_title,
				ModeloER.modeloER.diagram.part.Messages.Atributo3CreationTool_desc,
				Collections.singletonList(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Atributo_2001));
		entry.setId("createAtributo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/Atributo.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/Atributo.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidadRelacion4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ModeloER.modeloER.diagram.part.Messages.EntidadRelacion4CreationTool_title,
				ModeloER.modeloER.diagram.part.Messages.EntidadRelacion4CreationTool_desc,
				Collections.singletonList(ModeloER.modeloER.diagram.providers.ModeloERElementTypes.Relacion_2003));
		entry.setId("createEntidadRelacion4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/EntidadRelacion.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/modeloER.edit/icons/full/obj16/EntidadRelacion.gif")); //$NON-NLS-1$
		return entry;
	}

}
