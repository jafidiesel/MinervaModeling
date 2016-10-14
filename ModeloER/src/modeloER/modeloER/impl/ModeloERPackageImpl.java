/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.AtributoDerivado;
import modeloER.modeloER.AtributoDerivadoClavePrimaria;
import modeloER.modeloER.AtributoMultivaluado;
import modeloER.modeloER.ClaveForanea;
import modeloER.modeloER.ClavePrimaria;
import modeloER.modeloER.ClavePrimariaForanea;
import modeloER.modeloER.Diagrama;
import modeloER.modeloER.Entidad;
import modeloER.modeloER.EntidadDebil;
import modeloER.modeloER.EntidadFuerte;
import modeloER.modeloER.EntidadRelacion;
import modeloER.modeloER.EntidadRelacionDebil;
import modeloER.modeloER.EntidadRelacionFuerte;
import modeloER.modeloER.Herencia;
import modeloER.modeloER.ModeloERFactory;
import modeloER.modeloER.ModeloERPackage;
import modeloER.modeloER.Relacion;
import modeloER.modeloER.RelacionTipoDebil;
import modeloER.modeloER.RelacionTipoFuerte;
import modeloER.modeloER.TipoDato;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloERPackageImpl extends EPackageImpl implements ModeloERPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadRelacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoDerivadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoMultivaluadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clavePrimariaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claveForaneaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clavePrimariaForaneaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionTipoDebilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relacionTipoFuerteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadRelacionDebilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadRelacionFuerteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoDerivadoClavePrimariaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadFuerteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entidadDebilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoDatoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modeloER.modeloER.ModeloERPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeloERPackageImpl() {
		super(eNS_URI, ModeloERFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModeloERPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeloERPackage init() {
		if (isInited) return (ModeloERPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloERPackage.eNS_URI);

		// Obtain or create and register package
		ModeloERPackageImpl theModeloERPackage = (ModeloERPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModeloERPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModeloERPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModeloERPackage.createPackageContents();

		// Initialize created meta-data
		theModeloERPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeloERPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeloERPackage.eNS_URI, theModeloERPackage);
		return theModeloERPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidad() {
		return entidadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidad_AtributosEntidad() {
		return (EReference)entidadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidad_Nombre() {
		return (EAttribute)entidadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Nombre() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_Nulo() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributo_TipoDato() {
		return (EAttribute)atributoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtributo_AtributosAtributo() {
		return (EReference)atributoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacion() {
		return relacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelacion_Nombre() {
		return (EAttribute)relacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelacion_AtributosRelacion() {
		return (EReference)relacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagrama() {
		return diagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_RelacionesDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_AtributosDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_EntidadesDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_HerenciasDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_EntidadRelacionesDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_AtributoderivadoDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_AtributomultivaluadoDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_ClaveprimariaDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_ClaveforaneaDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_ClaveprimariaforaneaDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_TipodebilDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_TipofuerteDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_EntidadesRelacionesFuertesDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_EntidadesRelacionesDebilesDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_AtributoderivadoclaveprimariaDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_EntidadfuerteDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_EntidaddebilDelDiagrama() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidadRelacion() {
		return entidadRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidadRelacion_EntidadEntidadRelacion() {
		return (EReference)entidadRelacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntidadRelacion_RelacionEntidadRelacion() {
		return (EReference)entidadRelacionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidadRelacion_LimiteInferior() {
		return (EAttribute)entidadRelacionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntidadRelacion_LimiteSuperior() {
		return (EAttribute)entidadRelacionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHerencia() {
		return herenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_EntidadPadreHerencia() {
		return (EReference)herenciaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHerencia_EntidadesHijasHerencia() {
		return (EReference)herenciaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoDerivado() {
		return atributoDerivadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoMultivaluado() {
		return atributoMultivaluadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClavePrimaria() {
		return clavePrimariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaveForanea() {
		return claveForaneaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClavePrimariaForanea() {
		return clavePrimariaForaneaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacionTipoDebil() {
		return relacionTipoDebilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelacionTipoFuerte() {
		return relacionTipoFuerteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidadRelacionDebil() {
		return entidadRelacionDebilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidadRelacionFuerte() {
		return entidadRelacionFuerteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributoDerivadoClavePrimaria() {
		return atributoDerivadoClavePrimariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidadFuerte() {
		return entidadFuerteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntidadDebil() {
		return entidadDebilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoDato() {
		return tipoDatoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloERFactory getModeloERFactory() {
		return (ModeloERFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		entidadEClass = createEClass(ENTIDAD);
		createEReference(entidadEClass, ENTIDAD__ATRIBUTOS_ENTIDAD);
		createEAttribute(entidadEClass, ENTIDAD__NOMBRE);

		atributoEClass = createEClass(ATRIBUTO);
		createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
		createEAttribute(atributoEClass, ATRIBUTO__NULO);
		createEAttribute(atributoEClass, ATRIBUTO__TIPO_DATO);
		createEReference(atributoEClass, ATRIBUTO__ATRIBUTOS_ATRIBUTO);

		relacionEClass = createEClass(RELACION);
		createEAttribute(relacionEClass, RELACION__NOMBRE);
		createEReference(relacionEClass, RELACION__ATRIBUTOS_RELACION);

		diagramaEClass = createEClass(DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__RELACIONES_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ENTIDADES_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__HERENCIAS_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA);

		entidadRelacionEClass = createEClass(ENTIDAD_RELACION);
		createEReference(entidadRelacionEClass, ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION);
		createEReference(entidadRelacionEClass, ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION);
		createEAttribute(entidadRelacionEClass, ENTIDAD_RELACION__LIMITE_INFERIOR);
		createEAttribute(entidadRelacionEClass, ENTIDAD_RELACION__LIMITE_SUPERIOR);

		herenciaEClass = createEClass(HERENCIA);
		createEReference(herenciaEClass, HERENCIA__ENTIDAD_PADRE_HERENCIA);
		createEReference(herenciaEClass, HERENCIA__ENTIDADES_HIJAS_HERENCIA);

		atributoDerivadoEClass = createEClass(ATRIBUTO_DERIVADO);

		atributoMultivaluadoEClass = createEClass(ATRIBUTO_MULTIVALUADO);

		clavePrimariaEClass = createEClass(CLAVE_PRIMARIA);

		claveForaneaEClass = createEClass(CLAVE_FORANEA);

		clavePrimariaForaneaEClass = createEClass(CLAVE_PRIMARIA_FORANEA);

		relacionTipoDebilEClass = createEClass(RELACION_TIPO_DEBIL);

		relacionTipoFuerteEClass = createEClass(RELACION_TIPO_FUERTE);

		entidadRelacionDebilEClass = createEClass(ENTIDAD_RELACION_DEBIL);

		entidadRelacionFuerteEClass = createEClass(ENTIDAD_RELACION_FUERTE);

		atributoDerivadoClavePrimariaEClass = createEClass(ATRIBUTO_DERIVADO_CLAVE_PRIMARIA);

		entidadFuerteEClass = createEClass(ENTIDAD_FUERTE);

		entidadDebilEClass = createEClass(ENTIDAD_DEBIL);

		// Create enums
		tipoDatoEEnum = createEEnum(TIPO_DATO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atributoDerivadoEClass.getESuperTypes().add(this.getAtributo());
		atributoMultivaluadoEClass.getESuperTypes().add(this.getAtributo());
		clavePrimariaEClass.getESuperTypes().add(this.getAtributo());
		claveForaneaEClass.getESuperTypes().add(this.getAtributo());
		clavePrimariaForaneaEClass.getESuperTypes().add(this.getAtributo());
		relacionTipoDebilEClass.getESuperTypes().add(this.getRelacion());
		relacionTipoFuerteEClass.getESuperTypes().add(this.getRelacion());
		entidadRelacionDebilEClass.getESuperTypes().add(this.getEntidadRelacion());
		entidadRelacionFuerteEClass.getESuperTypes().add(this.getEntidadRelacion());
		atributoDerivadoClavePrimariaEClass.getESuperTypes().add(this.getAtributo());
		entidadFuerteEClass.getESuperTypes().add(this.getEntidad());
		entidadDebilEClass.getESuperTypes().add(this.getEntidad());

		// Initialize classes, features, and operations; add parameters
		initEClass(entidadEClass, Entidad.class, "Entidad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidad_AtributosEntidad(), this.getAtributo(), null, "atributosEntidad", null, 0, -1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidad_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Entidad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_Nulo(), ecorePackage.getEBoolean(), "nulo", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributo_TipoDato(), this.getTipoDato(), "tipoDato", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtributo_AtributosAtributo(), this.getAtributo(), null, "atributosAtributo", null, 0, -1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelacion_AtributosRelacion(), this.getAtributo(), null, "atributosRelacion", null, 0, -1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramaEClass, Diagrama.class, "Diagrama", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagrama_RelacionesDelDiagrama(), this.getRelacion(), null, "relacionesDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_AtributosDelDiagrama(), this.getAtributo(), null, "atributosDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_EntidadesDelDiagrama(), this.getEntidad(), null, "entidadesDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_HerenciasDelDiagrama(), this.getHerencia(), null, "herenciasDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_EntidadRelacionesDelDiagrama(), this.getEntidadRelacion(), null, "entidadRelacionesDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_AtributoderivadoDelDiagrama(), this.getAtributoDerivado(), null, "atributoderivadoDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_AtributomultivaluadoDelDiagrama(), this.getAtributoMultivaluado(), null, "atributomultivaluadoDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_ClaveprimariaDelDiagrama(), this.getClavePrimaria(), null, "claveprimariaDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_ClaveforaneaDelDiagrama(), this.getClaveForanea(), null, "claveforaneaDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_ClaveprimariaforaneaDelDiagrama(), this.getClavePrimariaForanea(), null, "claveprimariaforaneaDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_TipodebilDelDiagrama(), this.getRelacionTipoDebil(), null, "tipodebilDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_TipofuerteDelDiagrama(), this.getRelacionTipoFuerte(), null, "tipofuerteDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_EntidadesRelacionesFuertesDelDiagrama(), this.getEntidadRelacionFuerte(), null, "entidadesRelacionesFuertesDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_EntidadesRelacionesDebilesDelDiagrama(), this.getEntidadRelacionDebil(), null, "entidadesRelacionesDebilesDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_AtributoderivadoclaveprimariaDelDiagrama(), this.getAtributoDerivadoClavePrimaria(), null, "atributoderivadoclaveprimariaDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_EntidadfuerteDelDiagrama(), this.getEntidadFuerte(), null, "entidadfuerteDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_EntidaddebilDelDiagrama(), this.getEntidadDebil(), null, "entidaddebilDelDiagrama", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entidadRelacionEClass, EntidadRelacion.class, "EntidadRelacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntidadRelacion_EntidadEntidadRelacion(), this.getEntidad(), null, "entidadEntidadRelacion", null, 1, 1, EntidadRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntidadRelacion_RelacionEntidadRelacion(), this.getRelacion(), null, "relacionEntidadRelacion", null, 1, 1, EntidadRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidadRelacion_LimiteInferior(), ecorePackage.getEString(), "limiteInferior", null, 0, 1, EntidadRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntidadRelacion_LimiteSuperior(), ecorePackage.getEString(), "limiteSuperior", null, 0, 1, EntidadRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(herenciaEClass, Herencia.class, "Herencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHerencia_EntidadPadreHerencia(), this.getEntidad(), null, "entidadPadreHerencia", null, 1, 1, Herencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHerencia_EntidadesHijasHerencia(), this.getEntidad(), null, "entidadesHijasHerencia", null, 1, -1, Herencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributoDerivadoEClass, AtributoDerivado.class, "AtributoDerivado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atributoMultivaluadoEClass, AtributoMultivaluado.class, "AtributoMultivaluado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clavePrimariaEClass, ClavePrimaria.class, "ClavePrimaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(claveForaneaEClass, ClaveForanea.class, "ClaveForanea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clavePrimariaForaneaEClass, ClavePrimariaForanea.class, "ClavePrimariaForanea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relacionTipoDebilEClass, RelacionTipoDebil.class, "RelacionTipoDebil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relacionTipoFuerteEClass, RelacionTipoFuerte.class, "RelacionTipoFuerte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entidadRelacionDebilEClass, EntidadRelacionDebil.class, "EntidadRelacionDebil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entidadRelacionFuerteEClass, EntidadRelacionFuerte.class, "EntidadRelacionFuerte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atributoDerivadoClavePrimariaEClass, AtributoDerivadoClavePrimaria.class, "AtributoDerivadoClavePrimaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entidadFuerteEClass, EntidadFuerte.class, "EntidadFuerte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entidadDebilEClass, EntidadDebil.class, "EntidadDebil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(tipoDatoEEnum, TipoDato.class, "TipoDato");
		addEEnumLiteral(tipoDatoEEnum, TipoDato.VARCHAR);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.INT);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.CHAR);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.FLOAT);
		addEEnumLiteral(tipoDatoEEnum, TipoDato.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //ModeloERPackageImpl
