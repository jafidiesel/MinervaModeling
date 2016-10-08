/**
 */
package modeloER.util;

import modeloER.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see modeloER.ModeloERPackage
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
			public Adapter caseTipoDebil(TipoDebil object) {
				return createTipoDebilAdapter();
			}
			@Override
			public Adapter caseTipoFuerte(TipoFuerte object) {
				return createTipoFuerteAdapter();
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
	 * Creates a new adapter for an object of class '{@link modeloER.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.Entidad
	 * @generated
	 */
	public Adapter createEntidadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.Relacion
	 * @generated
	 */
	public Adapter createRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.Diagrama
	 * @generated
	 */
	public Adapter createDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.EntidadRelacion <em>Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.EntidadRelacion
	 * @generated
	 */
	public Adapter createEntidadRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.Herencia
	 * @generated
	 */
	public Adapter createHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.AtributoDerivado <em>Atributo Derivado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.AtributoDerivado
	 * @generated
	 */
	public Adapter createAtributoDerivadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.AtributoMultivaluado <em>Atributo Multivaluado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.AtributoMultivaluado
	 * @generated
	 */
	public Adapter createAtributoMultivaluadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.ClavePrimaria <em>Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.ClavePrimaria
	 * @generated
	 */
	public Adapter createClavePrimariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.ClaveForanea <em>Clave Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.ClaveForanea
	 * @generated
	 */
	public Adapter createClaveForaneaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.ClavePrimariaForanea <em>Clave Primaria Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.ClavePrimariaForanea
	 * @generated
	 */
	public Adapter createClavePrimariaForaneaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.TipoDebil <em>Tipo Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.TipoDebil
	 * @generated
	 */
	public Adapter createTipoDebilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.TipoFuerte <em>Tipo Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.TipoFuerte
	 * @generated
	 */
	public Adapter createTipoFuerteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.EntidadRelacionDebil <em>Entidad Relacion Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.EntidadRelacionDebil
	 * @generated
	 */
	public Adapter createEntidadRelacionDebilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.EntidadRelacionFuerte <em>Entidad Relacion Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.EntidadRelacionFuerte
	 * @generated
	 */
	public Adapter createEntidadRelacionFuerteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.AtributoDerivadoClavePrimaria <em>Atributo Derivado Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.AtributoDerivadoClavePrimaria
	 * @generated
	 */
	public Adapter createAtributoDerivadoClavePrimariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.EntidadFuerte <em>Entidad Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.EntidadFuerte
	 * @generated
	 */
	public Adapter createEntidadFuerteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link modeloER.EntidadDebil <em>Entidad Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see modeloER.EntidadDebil
	 * @generated
	 */
	public Adapter createEntidadDebilAdapter() {
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
