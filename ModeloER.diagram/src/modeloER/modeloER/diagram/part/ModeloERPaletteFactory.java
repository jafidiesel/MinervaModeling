
package modeloER.modeloER.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class ModeloERPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAtributos1Group());
		paletteRoot.add(createNodos2Group());
		paletteRoot.add(createRelaciones3Group());
	}

	/**
	* Creates "Atributos" palette tool group
	* @generated
	*/
	private PaletteContainer createAtributos1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(modeloER.modeloER.diagram.part.Messages.Atributos1Group_title);
		paletteContainer.setId("createAtributos1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributoDerivado1CreationTool());
		paletteContainer.add(createAtributoMultivaluado2CreationTool());
		paletteContainer.add(createClavePrimaria3CreationTool());
		paletteContainer.add(createClaveForanea4CreationTool());
		paletteContainer.add(createClavePrimariaForanea5CreationTool());
		paletteContainer.add(createAtributo6CreationTool());
		paletteContainer.add(createAtributoDerivadoClavePrimaria7CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Nodos" palette tool group
	* @generated
	*/
	private PaletteContainer createNodos2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(modeloER.modeloER.diagram.part.Messages.Nodos2Group_title);
		paletteContainer.setId("createNodos2Group"); //$NON-NLS-1$
		paletteContainer.add(createHerencia1CreationTool());
		paletteContainer.add(createRelacionTipoDebil2CreationTool());
		paletteContainer.add(createRelacionTipoFuerte3CreationTool());
		paletteContainer.add(createEntidad4CreationTool());
		paletteContainer.add(createEntidadDebil5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Relaciones" palette tool group
	* @generated
	*/
	private PaletteContainer createRelaciones3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				modeloER.modeloER.diagram.part.Messages.Relaciones3Group_title);
		paletteContainer.setId("createRelaciones3Group"); //$NON-NLS-1$
		paletteContainer.add(createLinkEntidadRelacion1CreationTool());
		paletteContainer.add(createLinkEntidadRelacionDebil2CreationTool());
		paletteContainer.add(createLinkSimple3CreationTool());
		paletteContainer.add(createRelacionLineaDiscontinua4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributoDerivado1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.AtributoDerivado1CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.AtributoDerivado1CreationTool_desc, Collections
						.singletonList(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivado_2001));
		entry.setId("createAtributoDerivado1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoDerivadoIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoDerivadoIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributoMultivaluado2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.AtributoMultivaluado2CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.AtributoMultivaluado2CreationTool_desc,
				Collections.singletonList(
						modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoMultivaluado_2008));
		entry.setId("createAtributoMultivaluado2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoMultivaluadoIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoMultivaluadoIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClavePrimaria3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.ClavePrimaria3CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.ClavePrimaria3CreationTool_desc,
				Collections.singletonList(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimaria_2002));
		entry.setId("createClavePrimaria3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoClaveIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoClaveIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClaveForanea4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.ClaveForanea4CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.ClaveForanea4CreationTool_desc,
				Collections.singletonList(modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClaveForanea_2010));
		entry.setId("createClaveForanea4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoClaveForaneaIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoClaveForaneaIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createClavePrimariaForanea5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.ClavePrimariaForanea5CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.ClavePrimariaForanea5CreationTool_desc,
				Collections.singletonList(
						modeloER.modeloER.diagram.providers.ModeloERElementTypes.ClavePrimariaForanea_2009));
		entry.setId("createClavePrimariaForanea5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoClavePrimariaForaneaIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoClavePrimariaForaneaIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributo6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoSimple_2004);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoCompuesto_2005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.Atributo6CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.Atributo6CreationTool_desc, types);
		entry.setId("createAtributo6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAtributoDerivadoClavePrimaria7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.AtributoDerivadoClavePrimaria7CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.AtributoDerivadoClavePrimaria7CreationTool_desc,
				Collections.singletonList(
						modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoClavePrimaria_2003));
		entry.setId("createAtributoDerivadoClavePrimaria7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoDerivadoClavePrimariaIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/AtributoDerivadoClavePrimariaIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createHerencia1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.Herencia1CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.Herencia1CreationTool_desc,
				Collections.singletonList(modeloER.modeloER.diagram.providers.ModeloERElementTypes.Herencia_2011));
		entry.setId("createHerencia1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/HerenciaIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/HerenciaIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelacionTipoDebil2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.RelacionTipoDebil2CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.RelacionTipoDebil2CreationTool_desc, Collections.singletonList(
						modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoDebil_2006));
		entry.setId("createRelacionTipoDebil2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/VinculoDebilIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/VinculoDebilIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelacionTipoFuerte3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.RelacionTipoFuerte3CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.RelacionTipoFuerte3CreationTool_desc, Collections.singletonList(
						modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionTipoFuerte_2007));
		entry.setId("createRelacionTipoFuerte3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/VinculoIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/VinculoIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidad4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.Entidad4CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.Entidad4CreationTool_desc,
				Collections.singletonList(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadFuerte_2012));
		entry.setId("createEntidad4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/EntidadIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/EntidadIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntidadDebil5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				modeloER.modeloER.diagram.part.Messages.EntidadDebil5CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.EntidadDebil5CreationTool_desc,
				Collections.singletonList(modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadDebil_2013));
		entry.setId("createEntidadDebil5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/EntidadDebilIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/EntidadDebilIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLinkEntidadRelacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				modeloER.modeloER.diagram.part.Messages.LinkEntidadRelacion1CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.LinkEntidadRelacion1CreationTool_desc,
				Collections.singletonList(
						modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionFuerte_4003));
		entry.setId("createLinkEntidadRelacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLinkEntidadRelacionDebil2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				modeloER.modeloER.diagram.part.Messages.LinkEntidadRelacionDebil2CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.LinkEntidadRelacionDebil2CreationTool_desc,
				Collections.singletonList(
						modeloER.modeloER.diagram.providers.ModeloERElementTypes.EntidadRelacionDebil_4004));
		entry.setId("createLinkEntidadRelacionDebil2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionParticipacionTotalIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionParticipacionTotalIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLinkSimple3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoEntidadLink_4001);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaHijo_4002);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkASAC_4005);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.RelacionAtributoLink_4006);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.LinkHerenciaPadre_4007);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				modeloER.modeloER.diagram.part.Messages.LinkSimple3CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.LinkSimple3CreationTool_desc, types);
		entry.setId("createLinkSimple3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionIcon.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionIcon.svg")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelacionLineaDiscontinua4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4008);
		types.add(modeloER.modeloER.diagram.providers.ModeloERElementTypes.AtributoDerivadoEntidad_4009);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				modeloER.modeloER.diagram.part.Messages.RelacionLineaDiscontinua4CreationTool_title,
				modeloER.modeloER.diagram.part.Messages.RelacionLineaDiscontinua4CreationTool_desc, types);
		entry.setId("createRelacionLineaDiscontinua4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionAtributoDerivado.svg")); //$NON-NLS-1$
		entry.setLargeIcon(modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin
				.findImageDescriptor("/ModeloER.edit/icons/full/obj16/RelacionAtributoDerivado.svg")); //$NON-NLS-1$
		return entry;
	}

}
