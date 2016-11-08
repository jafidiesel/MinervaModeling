package modeloER.modeloER.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ModeloERElementTypes {

	/**
	* @generated
	*/
	private ModeloERElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			modeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Diagrama_1000 = getElementType("ModeloER.diagram.Diagrama_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoDerivado_2001 = getElementType("ModeloER.diagram.AtributoDerivado_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClavePrimaria_2002 = getElementType("ModeloER.diagram.ClavePrimaria_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoDerivadoClavePrimaria_2003 = getElementType(
			"ModeloER.diagram.AtributoDerivadoClavePrimaria_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoSimple_2004 = getElementType("ModeloER.diagram.AtributoSimple_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoCompuesto_2005 = getElementType("ModeloER.diagram.AtributoCompuesto_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelacionTipoDebil_2006 = getElementType("ModeloER.diagram.RelacionTipoDebil_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelacionTipoFuerte_2007 = getElementType(
			"ModeloER.diagram.RelacionTipoFuerte_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoMultivaluado_2008 = getElementType(
			"ModeloER.diagram.AtributoMultivaluado_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClavePrimariaForanea_2009 = getElementType(
			"ModeloER.diagram.ClavePrimariaForanea_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ClaveForanea_2010 = getElementType("ModeloER.diagram.ClaveForanea_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Herencia_2011 = getElementType("ModeloER.diagram.Herencia_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadFuerte_2012 = getElementType("ModeloER.diagram.EntidadFuerte_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadDebil_2013 = getElementType("ModeloER.diagram.EntidadDebil_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoEntidadLink_4001 = getElementType(
			"ModeloER.diagram.AtributoEntidadLink_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LinkHerenciaHijo_4002 = getElementType("ModeloER.diagram.LinkHerenciaHijo_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadRelacionFuerte_4003 = getElementType(
			"ModeloER.diagram.EntidadRelacionFuerte_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadRelacionDebil_4004 = getElementType(
			"ModeloER.diagram.EntidadRelacionDebil_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LinkASAC_4005 = getElementType("ModeloER.diagram.LinkASAC_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RelacionAtributoLink_4006 = getElementType(
			"ModeloER.diagram.RelacionAtributoLink_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LinkHerenciaPadre_4007 = getElementType("ModeloER.diagram.LinkHerenciaPadre_4007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoDerivadoEntidad_4008 = getElementType(
			"ModeloER.diagram.AtributoDerivadoEntidad_4008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AtributoDerivadoEntidad_4009 = getElementType(
			"ModeloER.diagram.AtributoDerivadoEntidad_4009"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Diagrama_1000, modeloER.modeloER.ModeloERPackage.eINSTANCE.getDiagrama());

			elements.put(AtributoDerivado_2001, modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivado());

			elements.put(ClavePrimaria_2002, modeloER.modeloER.ModeloERPackage.eINSTANCE.getClavePrimaria());

			elements.put(AtributoDerivadoClavePrimaria_2003,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivadoClavePrimaria());

			elements.put(AtributoSimple_2004, modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoSimple());

			elements.put(AtributoCompuesto_2005, modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoCompuesto());

			elements.put(RelacionTipoDebil_2006, modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacionTipoDebil());

			elements.put(RelacionTipoFuerte_2007, modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacionTipoFuerte());

			elements.put(AtributoMultivaluado_2008,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoMultivaluado());

			elements.put(ClavePrimariaForanea_2009,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getClavePrimariaForanea());

			elements.put(ClaveForanea_2010, modeloER.modeloER.ModeloERPackage.eINSTANCE.getClaveForanea());

			elements.put(Herencia_2011, modeloER.modeloER.ModeloERPackage.eINSTANCE.getHerencia());

			elements.put(EntidadFuerte_2012, modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadFuerte());

			elements.put(EntidadDebil_2013, modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadDebil());

			elements.put(AtributoEntidadLink_4001,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoEntidadLink());

			elements.put(LinkHerenciaHijo_4002, modeloER.modeloER.ModeloERPackage.eINSTANCE.getLinkHerenciaHijo());

			elements.put(EntidadRelacionFuerte_4003,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacionFuerte());

			elements.put(EntidadRelacionDebil_4004,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacionDebil());

			elements.put(LinkASAC_4005, modeloER.modeloER.ModeloERPackage.eINSTANCE.getLinkASAC());

			elements.put(RelacionAtributoLink_4006,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacionAtributoLink());

			elements.put(LinkHerenciaPadre_4007, modeloER.modeloER.ModeloERPackage.eINSTANCE.getLinkHerenciaPadre());

			elements.put(AtributoDerivadoEntidad_4008,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivadoEntidad());

			elements.put(AtributoDerivadoEntidad_4009,
					modeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributoDerivadoEntidad());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Diagrama_1000);
			KNOWN_ELEMENT_TYPES.add(AtributoDerivado_2001);
			KNOWN_ELEMENT_TYPES.add(ClavePrimaria_2002);
			KNOWN_ELEMENT_TYPES.add(AtributoDerivadoClavePrimaria_2003);
			KNOWN_ELEMENT_TYPES.add(AtributoSimple_2004);
			KNOWN_ELEMENT_TYPES.add(AtributoCompuesto_2005);
			KNOWN_ELEMENT_TYPES.add(RelacionTipoDebil_2006);
			KNOWN_ELEMENT_TYPES.add(RelacionTipoFuerte_2007);
			KNOWN_ELEMENT_TYPES.add(AtributoMultivaluado_2008);
			KNOWN_ELEMENT_TYPES.add(ClavePrimariaForanea_2009);
			KNOWN_ELEMENT_TYPES.add(ClaveForanea_2010);
			KNOWN_ELEMENT_TYPES.add(Herencia_2011);
			KNOWN_ELEMENT_TYPES.add(EntidadFuerte_2012);
			KNOWN_ELEMENT_TYPES.add(EntidadDebil_2013);
			KNOWN_ELEMENT_TYPES.add(AtributoEntidadLink_4001);
			KNOWN_ELEMENT_TYPES.add(LinkHerenciaHijo_4002);
			KNOWN_ELEMENT_TYPES.add(EntidadRelacionFuerte_4003);
			KNOWN_ELEMENT_TYPES.add(EntidadRelacionDebil_4004);
			KNOWN_ELEMENT_TYPES.add(LinkASAC_4005);
			KNOWN_ELEMENT_TYPES.add(RelacionAtributoLink_4006);
			KNOWN_ELEMENT_TYPES.add(LinkHerenciaPadre_4007);
			KNOWN_ELEMENT_TYPES.add(AtributoDerivadoEntidad_4008);
			KNOWN_ELEMENT_TYPES.add(AtributoDerivadoEntidad_4009);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case modeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return Diagrama_1000;
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEditPart.VISUAL_ID:
			return AtributoDerivado_2001;
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaEditPart.VISUAL_ID:
			return ClavePrimaria_2002;
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoClavePrimariaEditPart.VISUAL_ID:
			return AtributoDerivadoClavePrimaria_2003;
		case modeloER.modeloER.diagram.edit.parts.AtributoSimpleEditPart.VISUAL_ID:
			return AtributoSimple_2004;
		case modeloER.modeloER.diagram.edit.parts.AtributoCompuestoEditPart.VISUAL_ID:
			return AtributoCompuesto_2005;
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoDebilEditPart.VISUAL_ID:
			return RelacionTipoDebil_2006;
		case modeloER.modeloER.diagram.edit.parts.RelacionTipoFuerteEditPart.VISUAL_ID:
			return RelacionTipoFuerte_2007;
		case modeloER.modeloER.diagram.edit.parts.AtributoMultivaluadoEditPart.VISUAL_ID:
			return AtributoMultivaluado_2008;
		case modeloER.modeloER.diagram.edit.parts.ClavePrimariaForaneaEditPart.VISUAL_ID:
			return ClavePrimariaForanea_2009;
		case modeloER.modeloER.diagram.edit.parts.ClaveForaneaEditPart.VISUAL_ID:
			return ClaveForanea_2010;
		case modeloER.modeloER.diagram.edit.parts.HerenciaEditPart.VISUAL_ID:
			return Herencia_2011;
		case modeloER.modeloER.diagram.edit.parts.EntidadFuerteEditPart.VISUAL_ID:
			return EntidadFuerte_2012;
		case modeloER.modeloER.diagram.edit.parts.EntidadDebilEditPart.VISUAL_ID:
			return EntidadDebil_2013;
		case modeloER.modeloER.diagram.edit.parts.AtributoEntidadLinkEditPart.VISUAL_ID:
			return AtributoEntidadLink_4001;
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaHijoEditPart.VISUAL_ID:
			return LinkHerenciaHijo_4002;
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionFuerteEditPart.VISUAL_ID:
			return EntidadRelacionFuerte_4003;
		case modeloER.modeloER.diagram.edit.parts.EntidadRelacionDebilEditPart.VISUAL_ID:
			return EntidadRelacionDebil_4004;
		case modeloER.modeloER.diagram.edit.parts.LinkASACEditPart.VISUAL_ID:
			return LinkASAC_4005;
		case modeloER.modeloER.diagram.edit.parts.RelacionAtributoLinkEditPart.VISUAL_ID:
			return RelacionAtributoLink_4006;
		case modeloER.modeloER.diagram.edit.parts.LinkHerenciaPadreEditPart.VISUAL_ID:
			return LinkHerenciaPadre_4007;
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidadEditPart.VISUAL_ID:
			return AtributoDerivadoEntidad_4008;
		case modeloER.modeloER.diagram.edit.parts.AtributoDerivadoEntidad2EditPart.VISUAL_ID:
			return AtributoDerivadoEntidad_4009;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return modeloER.modeloER.diagram.providers.ModeloERElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return modeloER.modeloER.diagram.providers.ModeloERElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return modeloER.modeloER.diagram.providers.ModeloERElementTypes.getElement(elementTypeAdapter);
		}
	};

}
