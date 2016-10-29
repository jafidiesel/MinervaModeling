/**
 */
package modeloER.modeloER.util;

import modeloER.modeloER.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see modeloER.modeloER.ModeloERPackage
 * @generated
 */
public class ModeloERAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeloERPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloERAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModeloERPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeloERSwitch<Adapter> modelSwitch =
		new ModeloERSwitch<Adapter>() {
			@Override
			public Adapter caseEntidad(Entidad object) {
				return createEntidadAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseRelacion(Relacion object) {
				return createRelacionAdapter();
			}
			@Override
			public Adapter caseDiagrama(Diagrama object) {
				return createDiagramaAdapter();
			}
			@Override
			public Adapter caseEntidadRelacion(EntidadRelacion object) {
				return createEntidadRelacionAdapter();
			}
			@Override
			public Adapter caseHerencia(Herencia object) {
				return createHerenciaAdapter();
			}
			@Override
			public Adapter caseAtributoDerivado(AtributoDerivado object) {
				return createAtributoDerivadoAdapter();
			}
			@Override
			public Adapter caseAtributoMultivaluado(AtributoMultivaluado object) {
				return createAtributoMultivaluadoAdapter();
			}
			@Override
			public Adapter caseClavePrimaria(ClavePrimaria object) {
				return createClavePrimariaAdapter();
			}
			@Override
			public Adapter caseClaveForanea(ClaveForanea object) {
				return createClaveForaneaAdapter();
			}
			@Override
			public Adapter caseClavePrimariaForanea(ClavePrimariaForanea object) {
				return createClavePrimariaForaneaAdapter();
			}
			@Override
			public Adapter caseRelacionTipoDebil(RelacionTipoDebil object) {
				return createRelacionTipoDebilAdapter();
			}
			@Override
			public Adapter caseRelacionTipoFuerte(RelacionTipoFuerte object) {
				return createRelacionTipoFuerteAdapter();
			}
			@Override
			public Adapter caseEntidadRelacionDebil(EntidadRelacionDebil object) {
				return createEntidadRelacionDebilAdapter();
			}
			@Override
			public Adapter caseEntidadRelacionFuerte(EntidadRelacionFuerte object) {
				return createEntidadRelacionFuerteAdapter();
			}
			@Override
			public Adapter caseAtributoDerivadoClavePrimaria(AtributoDerivadoClavePrimaria object) {
				return createAtributoDerivadoClavePrimariaAdapter();
			}
			@Override
			public Adapter caseEntidadFuerte(EntidadFuerte object) {
				return createEntidadFuerteAdapter();
			}
			@Override
			public Adapter caseEntidadDebil(EntidadDebil object) {
				return createEntidadDebilAdapter();
			}
			@Override
			public Adapter caseAtributoSimple(AtributoSimple object) {
				return createAtributoSimpleAdapter();
			}
			@Override
			public Adapter caseAtributoCompuesto(AtributoCompuesto object) {
				return createAtributoCompuestoAdapter();
			}
			@Override
			public Adapter caseLinkASAC(LinkASAC object) {
				return createLinkASACAdapter();
			}
			@Override
			public Adapter caseAtributoEntidadLink(AtributoEntidadLink object) {
				return createAtributoEntidadLinkAdapter();
			}
			@Override
			public Adapter caseLinkHerenciaPadre(LinkHerenciaPadre object) {
				return createLinkHerenciaPadreAdapter();
			}
			@Override
			public Adapter caseLinkHerenciaHijo(LinkHerenciaHijo object) {
				return createLinkHerenciaHijoAdapter();
			}
			@Override
			public Adapter caseAtributoDerivadoEntidad(AtributoDerivadoEntidad object) {
				return createAtributoDerivadoEntidadAdapter();
			}
			@Override
			public Adapter caseRelacionAtributoLink(RelacionAtributoLink object) {
				return createRelacionAtributoLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.Entidad
	 * @generated
	 */
	public Adapter createEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.Relacion
	 * @generated
	 */
	public Adapter createRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.Diagrama
	 * @generated
	 */
	public Adapter createDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.EntidadRelacion <em>Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.EntidadRelacion
	 * @generated
	 */
	public Adapter createEntidadRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.Herencia
	 * @generated
	 */
	public Adapter createHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.AtributoDerivado <em>Atributo Derivado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.AtributoDerivado
	 * @generated
	 */
	public Adapter createAtributoDerivadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.AtributoMultivaluado <em>Atributo Multivaluado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.AtributoMultivaluado
	 * @generated
	 */
	public Adapter createAtributoMultivaluadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.ClavePrimaria <em>Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.ClavePrimaria
	 * @generated
	 */
	public Adapter createClavePrimariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.ClaveForanea <em>Clave Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.ClaveForanea
	 * @generated
	 */
	public Adapter createClaveForaneaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.ClavePrimariaForanea <em>Clave Primaria Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.ClavePrimariaForanea
	 * @generated
	 */
	public Adapter createClavePrimariaForaneaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.RelacionTipoDebil <em>Relacion Tipo Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.RelacionTipoDebil
	 * @generated
	 */
	public Adapter createRelacionTipoDebilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.RelacionTipoFuerte <em>Relacion Tipo Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.RelacionTipoFuerte
	 * @generated
	 */
	public Adapter createRelacionTipoFuerteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.EntidadRelacionDebil <em>Entidad Relacion Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.EntidadRelacionDebil
	 * @generated
	 */
	public Adapter createEntidadRelacionDebilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.EntidadRelacionFuerte <em>Entidad Relacion Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.EntidadRelacionFuerte
	 * @generated
	 */
	public Adapter createEntidadRelacionFuerteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.AtributoDerivadoClavePrimaria <em>Atributo Derivado Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.AtributoDerivadoClavePrimaria
	 * @generated
	 */
	public Adapter createAtributoDerivadoClavePrimariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.EntidadFuerte <em>Entidad Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.EntidadFuerte
	 * @generated
	 */
	public Adapter createEntidadFuerteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.EntidadDebil <em>Entidad Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.EntidadDebil
	 * @generated
	 */
	public Adapter createEntidadDebilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.AtributoSimple <em>Atributo Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.AtributoSimple
	 * @generated
	 */
	public Adapter createAtributoSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.AtributoCompuesto <em>Atributo Compuesto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.AtributoCompuesto
	 * @generated
	 */
	public Adapter createAtributoCompuestoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.LinkASAC <em>Link ASAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.LinkASAC
	 * @generated
	 */
	public Adapter createLinkASACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.AtributoEntidadLink <em>Atributo Entidad Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.AtributoEntidadLink
	 * @generated
	 */
	public Adapter createAtributoEntidadLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.LinkHerenciaPadre <em>Link Herencia Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.LinkHerenciaPadre
	 * @generated
	 */
	public Adapter createLinkHerenciaPadreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.LinkHerenciaHijo <em>Link Herencia Hijo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.LinkHerenciaHijo
	 * @generated
	 */
	public Adapter createLinkHerenciaHijoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.AtributoDerivadoEntidad <em>Atributo Derivado Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.AtributoDerivadoEntidad
	 * @generated
	 */
	public Adapter createAtributoDerivadoEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.modeloER.RelacionAtributoLink <em>Relacion Atributo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.modeloER.RelacionAtributoLink
	 * @generated
	 */
	public Adapter createRelacionAtributoLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModeloERAdapterFactory
