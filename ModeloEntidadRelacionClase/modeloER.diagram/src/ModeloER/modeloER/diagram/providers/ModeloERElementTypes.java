package ModeloER.modeloER.diagram.providers;

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
			ModeloER.modeloER.diagram.part.ModeloERDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Diagrama_1000 = getElementType("modeloER.diagram.Diagrama_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Atributo_2001 = getElementType("modeloER.diagram.Atributo_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entidad_2002 = getElementType("modeloER.diagram.Entidad_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Relacion_2003 = getElementType("modeloER.diagram.Relacion_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadRelacion_4001 = getElementType("modeloER.diagram.EntidadRelacion_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntidadEntidadAtributos_4002 = getElementType(
			"modeloER.diagram.EntidadEntidadAtributos_4002"); //$NON-NLS-1$

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

			elements.put(Diagrama_1000, ModeloER.modeloER.ModeloERPackage.eINSTANCE.getDiagrama());

			elements.put(Atributo_2001, ModeloER.modeloER.ModeloERPackage.eINSTANCE.getAtributo());

			elements.put(Entidad_2002, ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad());

			elements.put(Relacion_2003, ModeloER.modeloER.ModeloERPackage.eINSTANCE.getRelacion());

			elements.put(EntidadRelacion_4001, ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidadRelacion());

			elements.put(EntidadEntidadAtributos_4002,
					ModeloER.modeloER.ModeloERPackage.eINSTANCE.getEntidad_EntidadAtributos());
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
			KNOWN_ELEMENT_TYPES.add(Atributo_2001);
			KNOWN_ELEMENT_TYPES.add(Entidad_2002);
			KNOWN_ELEMENT_TYPES.add(Relacion_2003);
			KNOWN_ELEMENT_TYPES.add(EntidadRelacion_4001);
			KNOWN_ELEMENT_TYPES.add(EntidadEntidadAtributos_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ModeloER.modeloER.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return Diagrama_1000;
		case ModeloER.modeloER.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return Atributo_2001;
		case ModeloER.modeloER.diagram.edit.parts.EntidadEditPart.VISUAL_ID:
			return Entidad_2002;
		case ModeloER.modeloER.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return Relacion_2003;
		case ModeloER.modeloER.diagram.edit.parts.EntidadRelacionEditPart.VISUAL_ID:
			return EntidadRelacion_4001;
		case ModeloER.modeloER.diagram.edit.parts.EntidadEntidadAtributosEditPart.VISUAL_ID:
			return EntidadEntidadAtributos_4002;
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
			return ModeloER.modeloER.diagram.providers.ModeloERElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return ModeloER.modeloER.diagram.providers.ModeloERElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return ModeloER.modeloER.diagram.providers.ModeloERElementTypes.getElement(elementTypeAdapter);
		}
	};

}
