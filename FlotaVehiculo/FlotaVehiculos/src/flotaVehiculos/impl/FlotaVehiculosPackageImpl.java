/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.AsignacionDiaria;
import flotaVehiculos.Automovil;
import flotaVehiculos.Camion;
import flotaVehiculos.Camioneta;
import flotaVehiculos.Conductor;
import flotaVehiculos.DePrimera;
import flotaVehiculos.DeSegunda;
import flotaVehiculos.Diagrama;
import flotaVehiculos.FlotaVehiculosFactory;
import flotaVehiculos.FlotaVehiculosPackage;
import flotaVehiculos.Omnibus;
import flotaVehiculos.Pesado;
import flotaVehiculos.Vehiculo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlotaVehiculosPackageImpl extends EPackageImpl implements FlotaVehiculosPackage {
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
	private EClass vehiculoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automovilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deSegundaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dePrimeraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pesadoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass camionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass camionetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass omnibusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignacionDiariaEClass = null;

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
	 * @see flotaVehiculos.FlotaVehiculosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlotaVehiculosPackageImpl() {
		super(eNS_URI, FlotaVehiculosFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FlotaVehiculosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlotaVehiculosPackage init() {
		if (isInited) return (FlotaVehiculosPackage)EPackage.Registry.INSTANCE.getEPackage(FlotaVehiculosPackage.eNS_URI);

		// Obtain or create and register package
		FlotaVehiculosPackageImpl theFlotaVehiculosPackage = (FlotaVehiculosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FlotaVehiculosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FlotaVehiculosPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFlotaVehiculosPackage.createPackageContents();

		// Initialize created meta-data
		theFlotaVehiculosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlotaVehiculosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlotaVehiculosPackage.eNS_URI, theFlotaVehiculosPackage);
		return theFlotaVehiculosPackage;
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
	public EReference getDiagrama_Vehiculo() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_Conductores() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagrama_AsignacionesDiarias() {
		return (EReference)diagramaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehiculo() {
		return vehiculoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehiculo_Matricula() {
		return (EAttribute)vehiculoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehiculo_Modelo() {
		return (EAttribute)vehiculoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehiculo_Marca() {
		return (EAttribute)vehiculoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomovil() {
		return automovilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomovil_Pasajeros() {
		return (EAttribute)automovilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeSegunda() {
		return deSegundaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeSegunda_ConductorAsignacionDiaria() {
		return (EReference)deSegundaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeSegunda_AsignacionDiariaVehiculo() {
		return (EReference)deSegundaEClass.getEStructuralFeatures().get(-1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConductor() {
		return conductorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Cedula() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_FechaNacimiento() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConductor_Nombre() {
		return (EAttribute)conductorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDePrimera() {
		return dePrimeraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDePrimera_AsignacionFija() {
		return (EReference)dePrimeraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPesado() {
		return pesadoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPesado_Carga() {
		return (EAttribute)pesadoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCamion() {
		return camionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamion_CantidadDeEjes() {
		return (EAttribute)camionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCamioneta() {
		return camionetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCamioneta_DobleCabina() {
		return (EAttribute)camionetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOmnibus() {
		return omnibusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOmnibus_CantidadAsientos() {
		return (EAttribute)omnibusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOmnibus_Banio() {
		return (EAttribute)omnibusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsignacionDiaria() {
		return asignacionDiariaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsignacionDiaria_AsignacionDiariaVehiculo() {
		return (EReference)asignacionDiariaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsignacionDiaria_FechaAsignacion() {
		return (EAttribute)asignacionDiariaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotaVehiculosFactory getFlotaVehiculosFactory() {
		return (FlotaVehiculosFactory)getEFactoryInstance();
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
		diagramaEClass = createEClass(DIAGRAMA);
		createEReference(diagramaEClass, DIAGRAMA__VEHICULO);
		createEReference(diagramaEClass, DIAGRAMA__CONDUCTORES);
		createEReference(diagramaEClass, DIAGRAMA__ASIGNACIONES_DIARIAS);

		vehiculoEClass = createEClass(VEHICULO);
		createEAttribute(vehiculoEClass, VEHICULO__MATRICULA);
		createEAttribute(vehiculoEClass, VEHICULO__MODELO);
		createEAttribute(vehiculoEClass, VEHICULO__MARCA);

		automovilEClass = createEClass(AUTOMOVIL);
		createEAttribute(automovilEClass, AUTOMOVIL__PASAJEROS);

		deSegundaEClass = createEClass(DE_SEGUNDA);
		createEReference(deSegundaEClass, DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA);
		createEReference(deSegundaEClass, DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO);

		conductorEClass = createEClass(CONDUCTOR);
		createEAttribute(conductorEClass, CONDUCTOR__CEDULA);
		createEAttribute(conductorEClass, CONDUCTOR__FECHA_NACIMIENTO);
		createEAttribute(conductorEClass, CONDUCTOR__NOMBRE);

		dePrimeraEClass = createEClass(DE_PRIMERA);
		createEReference(dePrimeraEClass, DE_PRIMERA__ASIGNACION_FIJA);

		pesadoEClass = createEClass(PESADO);
		createEAttribute(pesadoEClass, PESADO__CARGA);

		camionEClass = createEClass(CAMION);
		createEAttribute(camionEClass, CAMION__CANTIDAD_DE_EJES);

		camionetaEClass = createEClass(CAMIONETA);
		createEAttribute(camionetaEClass, CAMIONETA__DOBLE_CABINA);

		omnibusEClass = createEClass(OMNIBUS);
		createEAttribute(omnibusEClass, OMNIBUS__CANTIDAD_ASIENTOS);
		createEAttribute(omnibusEClass, OMNIBUS__BANIO);

		asignacionDiariaEClass = createEClass(ASIGNACION_DIARIA);
		createEReference(asignacionDiariaEClass, ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO);
		createEAttribute(asignacionDiariaEClass, ASIGNACION_DIARIA__FECHA_ASIGNACION);
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
		automovilEClass.getESuperTypes().add(this.getVehiculo());
		deSegundaEClass.getESuperTypes().add(this.getConductor());
		dePrimeraEClass.getESuperTypes().add(this.getConductor());
		pesadoEClass.getESuperTypes().add(this.getVehiculo());
		camionEClass.getESuperTypes().add(this.getPesado());
		camionetaEClass.getESuperTypes().add(this.getPesado());
		omnibusEClass.getESuperTypes().add(this.getPesado());

		// Initialize classes, features, and operations; add parameters
		initEClass(diagramaEClass, Diagrama.class, "Diagrama", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagrama_Vehiculo(), this.getVehiculo(), null, "vehiculo", null, 1, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_Conductores(), this.getConductor(), null, "conductores", null, 1, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagrama_AsignacionesDiarias(), this.getAsignacionDiaria(), null, "asignacionesDiarias", null, 1, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehiculoEClass, Vehiculo.class, "Vehiculo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehiculo_Matricula(), ecorePackage.getEString(), "matricula", null, 0, 1, Vehiculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiculo_Modelo(), ecorePackage.getEString(), "modelo", null, 0, 1, Vehiculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehiculo_Marca(), ecorePackage.getEString(), "marca", null, 0, 1, Vehiculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automovilEClass, Automovil.class, "Automovil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomovil_Pasajeros(), ecorePackage.getEInt(), "pasajeros", null, 0, 1, Automovil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deSegundaEClass, DeSegunda.class, "DeSegunda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeSegunda_ConductorAsignacionDiaria(), this.getAsignacionDiaria(), null, "conductorAsignacionDiaria", null, 1, -1, DeSegunda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeSegunda_AsignacionDiariaVehiculo(), this.getAutomovil(), null, "asignacionDiariaVehiculo", null, 1, 1, DeSegunda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conductorEClass, Conductor.class, "Conductor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConductor_Cedula(), ecorePackage.getEInt(), "cedula", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_FechaNacimiento(), ecorePackage.getEDate(), "fechaNacimiento", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConductor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Conductor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dePrimeraEClass, DePrimera.class, "DePrimera", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDePrimera_AsignacionFija(), this.getPesado(), null, "asignacionFija", null, 1, 1, DePrimera.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pesadoEClass, Pesado.class, "Pesado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPesado_Carga(), ecorePackage.getEInt(), "carga", null, 0, 1, Pesado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camionEClass, Camion.class, "Camion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamion_CantidadDeEjes(), ecorePackage.getEInt(), "cantidadDeEjes", null, 0, 1, Camion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(camionetaEClass, Camioneta.class, "Camioneta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCamioneta_DobleCabina(), ecorePackage.getEBoolean(), "dobleCabina", null, 0, 1, Camioneta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(omnibusEClass, Omnibus.class, "Omnibus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOmnibus_CantidadAsientos(), ecorePackage.getEInt(), "cantidadAsientos", null, 0, 1, Omnibus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOmnibus_Banio(), ecorePackage.getEBoolean(), "banio", null, 0, 1, Omnibus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asignacionDiariaEClass, AsignacionDiaria.class, "AsignacionDiaria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsignacionDiaria_AsignacionDiariaVehiculo(), this.getAutomovil(), null, "asignacionDiariaVehiculo", null, 1, 1, AsignacionDiaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsignacionDiaria_FechaAsignacion(), ecorePackage.getEDate(), "fechaAsignacion", null, 0, 1, AsignacionDiaria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FlotaVehiculosPackageImpl
