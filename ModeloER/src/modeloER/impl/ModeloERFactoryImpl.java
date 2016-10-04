/**
 */
package modeloER.impl;

import modeloER.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloERFactoryImpl extends EFactoryImpl implements ModeloERFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeloERFactory init() {
		try {
			ModeloERFactory theModeloERFactory = (ModeloERFactory)EPackage.Registry.INSTANCE.getEFactory(ModeloERPackage.eNS_URI);
			if (theModeloERFactory != null) {
				return theModeloERFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeloERFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloERFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModeloERPackage.ENTIDAD: return createEntidad();
			case ModeloERPackage.ATRIBUTO: return createAtributo();
			case ModeloERPackage.RELACION: return createRelacion();
			case ModeloERPackage.DIAGRAMA: return createDiagrama();
			case ModeloERPackage.ENTIDAD_RELACION: return createEntidadRelacion();
			case ModeloERPackage.HERENCIA: return createHerencia();
			case ModeloERPackage.ATRIBUTO_DERIVADO: return createAtributoDerivado();
			case ModeloERPackage.ATRIBUTO_MULTIVALUADO: return createAtributoMultivaluado();
			case ModeloERPackage.CLAVE_PRIMARIA: return createClavePrimaria();
			case ModeloERPackage.CLAVE_FORANEA: return createClaveForanea();
			case ModeloERPackage.CLAVE_PRIMARIA_FORANEA: return createClavePrimariaForanea();
			case ModeloERPackage.TIPO_DEBIL: return createTipoDebil();
			case ModeloERPackage.TIPO_FUERTE: return createTipoFuerte();
			case ModeloERPackage.ENTIDAD_RELACION_DEBIL: return createEntidadRelacionDebil();
			case ModeloERPackage.ENTIDAD_RELACION_FUERTE: return createEntidadRelacionFuerte();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModeloERPackage.TIPO_DATO:
				return createTipoDatoFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModeloERPackage.TIPO_DATO:
				return convertTipoDatoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad createEntidad() {
		EntidadImpl entidad = new EntidadImpl();
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion createRelacion() {
		RelacionImpl relacion = new RelacionImpl();
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagrama createDiagrama() {
		DiagramaImpl diagrama = new DiagramaImpl();
		return diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadRelacion createEntidadRelacion() {
		EntidadRelacionImpl entidadRelacion = new EntidadRelacionImpl();
		return entidadRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia createHerencia() {
		HerenciaImpl herencia = new HerenciaImpl();
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoDerivado createAtributoDerivado() {
		AtributoDerivadoImpl atributoDerivado = new AtributoDerivadoImpl();
		return atributoDerivado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoMultivaluado createAtributoMultivaluado() {
		AtributoMultivaluadoImpl atributoMultivaluado = new AtributoMultivaluadoImpl();
		return atributoMultivaluado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClavePrimaria createClavePrimaria() {
		ClavePrimariaImpl clavePrimaria = new ClavePrimariaImpl();
		return clavePrimaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaveForanea createClaveForanea() {
		ClaveForaneaImpl claveForanea = new ClaveForaneaImpl();
		return claveForanea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClavePrimariaForanea createClavePrimariaForanea() {
		ClavePrimariaForaneaImpl clavePrimariaForanea = new ClavePrimariaForaneaImpl();
		return clavePrimariaForanea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDebil createTipoDebil() {
		TipoDebilImpl tipoDebil = new TipoDebilImpl();
		return tipoDebil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoFuerte createTipoFuerte() {
		TipoFuerteImpl tipoFuerte = new TipoFuerteImpl();
		return tipoFuerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadRelacionDebil createEntidadRelacionDebil() {
		EntidadRelacionDebilImpl entidadRelacionDebil = new EntidadRelacionDebilImpl();
		return entidadRelacionDebil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadRelacionFuerte createEntidadRelacionFuerte() {
		EntidadRelacionFuerteImpl entidadRelacionFuerte = new EntidadRelacionFuerteImpl();
		return entidadRelacionFuerte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato createTipoDatoFromString(EDataType eDataType, String initialValue) {
		TipoDato result = TipoDato.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoDatoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloERPackage getModeloERPackage() {
		return (ModeloERPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeloERPackage getPackage() {
		return ModeloERPackage.eINSTANCE;
	}

} //ModeloERFactoryImpl
