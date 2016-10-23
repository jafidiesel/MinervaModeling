/**
 */
package flotaVehiculos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flotaVehiculos.FlotaVehiculosFactory
 * @model kind="package"
 * @generated
 */
public interface FlotaVehiculosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flotaVehiculos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/flotaVehiculos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flotaVehiculos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlotaVehiculosPackage eINSTANCE = flotaVehiculos.impl.FlotaVehiculosPackageImpl.init();

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.DiagramaImpl <em>Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.DiagramaImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getDiagrama()
	 * @generated
	 */
	int DIAGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Vehiculo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__VEHICULO = 0;

	/**
	 * The feature id for the '<em><b>Conductores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CONDUCTORES = 1;

	/**
	 * The feature id for the '<em><b>Asignaciones Diarias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ASIGNACIONES_DIARIAS = 2;

	/**
	 * The number of structural features of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.VehiculoImpl <em>Vehiculo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.VehiculoImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getVehiculo()
	 * @generated
	 */
	int VEHICULO = 1;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO__MATRICULA = 0;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO__MODELO = 1;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO__MARCA = 2;

	/**
	 * The number of structural features of the '<em>Vehiculo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vehiculo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICULO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.AutomovilImpl <em>Automovil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.AutomovilImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getAutomovil()
	 * @generated
	 */
	int AUTOMOVIL = 2;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__MATRICULA = VEHICULO__MATRICULA;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__MODELO = VEHICULO__MODELO;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__MARCA = VEHICULO__MARCA;

	/**
	 * The feature id for the '<em><b>Pasajeros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL__PASAJEROS = VEHICULO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Automovil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL_FEATURE_COUNT = VEHICULO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Automovil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMOVIL_OPERATION_COUNT = VEHICULO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.ConductorImpl <em>Conductor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.ConductorImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getConductor()
	 * @generated
	 */
	int CONDUCTOR = 4;

	/**
	 * The feature id for the '<em><b>Cedula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__CEDULA = 0;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__FECHA_NACIMIENTO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR__NOMBRE = 2;

	/**
	 * The number of structural features of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conductor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.DeSegundaImpl <em>De Segunda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.DeSegundaImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getDeSegunda()
	 * @generated
	 */
	int DE_SEGUNDA = 3;

	/**
	 * The feature id for the '<em><b>Cedula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_SEGUNDA__CEDULA = CONDUCTOR__CEDULA;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_SEGUNDA__FECHA_NACIMIENTO = CONDUCTOR__FECHA_NACIMIENTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_SEGUNDA__NOMBRE = CONDUCTOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Conductor Asignacion Diaria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA = CONDUCTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Asignacion Diaria Vehiculo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO = CONDUCTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>De Segunda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_SEGUNDA_FEATURE_COUNT = CONDUCTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>De Segunda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_SEGUNDA_OPERATION_COUNT = CONDUCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.DePrimeraImpl <em>De Primera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.DePrimeraImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getDePrimera()
	 * @generated
	 */
	int DE_PRIMERA = 5;

	/**
	 * The feature id for the '<em><b>Cedula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_PRIMERA__CEDULA = CONDUCTOR__CEDULA;

	/**
	 * The feature id for the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_PRIMERA__FECHA_NACIMIENTO = CONDUCTOR__FECHA_NACIMIENTO;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_PRIMERA__NOMBRE = CONDUCTOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Asignacion Fija</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_PRIMERA__ASIGNACION_FIJA = CONDUCTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>De Primera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_PRIMERA_FEATURE_COUNT = CONDUCTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>De Primera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DE_PRIMERA_OPERATION_COUNT = CONDUCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.PesadoImpl <em>Pesado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.PesadoImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getPesado()
	 * @generated
	 */
	int PESADO = 6;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESADO__MATRICULA = VEHICULO__MATRICULA;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESADO__MODELO = VEHICULO__MODELO;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESADO__MARCA = VEHICULO__MARCA;

	/**
	 * The feature id for the '<em><b>Carga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESADO__CARGA = VEHICULO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pesado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESADO_FEATURE_COUNT = VEHICULO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pesado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PESADO_OPERATION_COUNT = VEHICULO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.CamionImpl <em>Camion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.CamionImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getCamion()
	 * @generated
	 */
	int CAMION = 7;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMION__MATRICULA = PESADO__MATRICULA;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMION__MODELO = PESADO__MODELO;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMION__MARCA = PESADO__MARCA;

	/**
	 * The feature id for the '<em><b>Carga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMION__CARGA = PESADO__CARGA;

	/**
	 * The feature id for the '<em><b>Cantidad De Ejes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMION__CANTIDAD_DE_EJES = PESADO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Camion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMION_FEATURE_COUNT = PESADO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Camion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMION_OPERATION_COUNT = PESADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.CamionetaImpl <em>Camioneta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.CamionetaImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getCamioneta()
	 * @generated
	 */
	int CAMIONETA = 8;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMIONETA__MATRICULA = PESADO__MATRICULA;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMIONETA__MODELO = PESADO__MODELO;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMIONETA__MARCA = PESADO__MARCA;

	/**
	 * The feature id for the '<em><b>Carga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMIONETA__CARGA = PESADO__CARGA;

	/**
	 * The feature id for the '<em><b>Doble Cabina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMIONETA__DOBLE_CABINA = PESADO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Camioneta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMIONETA_FEATURE_COUNT = PESADO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Camioneta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMIONETA_OPERATION_COUNT = PESADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.OmnibusImpl <em>Omnibus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.OmnibusImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getOmnibus()
	 * @generated
	 */
	int OMNIBUS = 9;

	/**
	 * The feature id for the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS__MATRICULA = PESADO__MATRICULA;

	/**
	 * The feature id for the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS__MODELO = PESADO__MODELO;

	/**
	 * The feature id for the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS__MARCA = PESADO__MARCA;

	/**
	 * The feature id for the '<em><b>Carga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS__CARGA = PESADO__CARGA;

	/**
	 * The feature id for the '<em><b>Cantidad Asientos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS__CANTIDAD_ASIENTOS = PESADO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Banio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS__BANIO = PESADO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Omnibus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS_FEATURE_COUNT = PESADO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Omnibus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OMNIBUS_OPERATION_COUNT = PESADO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link flotaVehiculos.impl.AsignacionDiariaImpl <em>Asignacion Diaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flotaVehiculos.impl.AsignacionDiariaImpl
	 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getAsignacionDiaria()
	 * @generated
	 */
	int ASIGNACION_DIARIA = 10;

	/**
	 * The feature id for the '<em><b>Asignacion Diaria Vehiculo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO = 0;

	/**
	 * The feature id for the '<em><b>Fecha Asignacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_DIARIA__FECHA_ASIGNACION = 1;

	/**
	 * The number of structural features of the '<em>Asignacion Diaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_DIARIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Asignacion Diaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_DIARIA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama</em>'.
	 * @see flotaVehiculos.Diagrama
	 * @generated
	 */
	EClass getDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link flotaVehiculos.Diagrama#getVehiculo <em>Vehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehiculo</em>'.
	 * @see flotaVehiculos.Diagrama#getVehiculo()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_Vehiculo();

	/**
	 * Returns the meta object for the containment reference list '{@link flotaVehiculos.Diagrama#getConductores <em>Conductores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conductores</em>'.
	 * @see flotaVehiculos.Diagrama#getConductores()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_Conductores();

	/**
	 * Returns the meta object for the containment reference list '{@link flotaVehiculos.Diagrama#getAsignacionesDiarias <em>Asignaciones Diarias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Asignaciones Diarias</em>'.
	 * @see flotaVehiculos.Diagrama#getAsignacionesDiarias()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AsignacionesDiarias();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Vehiculo <em>Vehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehiculo</em>'.
	 * @see flotaVehiculos.Vehiculo
	 * @generated
	 */
	EClass getVehiculo();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Vehiculo#getMatricula <em>Matricula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricula</em>'.
	 * @see flotaVehiculos.Vehiculo#getMatricula()
	 * @see #getVehiculo()
	 * @generated
	 */
	EAttribute getVehiculo_Matricula();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Vehiculo#getModelo <em>Modelo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modelo</em>'.
	 * @see flotaVehiculos.Vehiculo#getModelo()
	 * @see #getVehiculo()
	 * @generated
	 */
	EAttribute getVehiculo_Modelo();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Vehiculo#getMarca <em>Marca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Marca</em>'.
	 * @see flotaVehiculos.Vehiculo#getMarca()
	 * @see #getVehiculo()
	 * @generated
	 */
	EAttribute getVehiculo_Marca();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Automovil <em>Automovil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automovil</em>'.
	 * @see flotaVehiculos.Automovil
	 * @generated
	 */
	EClass getAutomovil();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Automovil#getPasajeros <em>Pasajeros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pasajeros</em>'.
	 * @see flotaVehiculos.Automovil#getPasajeros()
	 * @see #getAutomovil()
	 * @generated
	 */
	EAttribute getAutomovil_Pasajeros();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.DeSegunda <em>De Segunda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Segunda</em>'.
	 * @see flotaVehiculos.DeSegunda
	 * @generated
	 */
	EClass getDeSegunda();

	/**
	 * Returns the meta object for the reference list '{@link flotaVehiculos.DeSegunda#getConductorAsignacionDiaria <em>Conductor Asignacion Diaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conductor Asignacion Diaria</em>'.
	 * @see flotaVehiculos.DeSegunda#getConductorAsignacionDiaria()
	 * @see #getDeSegunda()
	 * @generated
	 */
	EReference getDeSegunda_ConductorAsignacionDiaria();

	/**
	 * Returns the meta object for the reference '{@link flotaVehiculos.DeSegunda#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asignacion Diaria Vehiculo</em>'.
	 * @see flotaVehiculos.DeSegunda#getAsignacionDiariaVehiculo()
	 * @see #getDeSegunda()
	 * @generated
	 */
	EReference getDeSegunda_AsignacionDiariaVehiculo();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conductor</em>'.
	 * @see flotaVehiculos.Conductor
	 * @generated
	 */
	EClass getConductor();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Conductor#getCedula <em>Cedula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cedula</em>'.
	 * @see flotaVehiculos.Conductor#getCedula()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Cedula();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Conductor#getFechaNacimiento <em>Fecha Nacimiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Nacimiento</em>'.
	 * @see flotaVehiculos.Conductor#getFechaNacimiento()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_FechaNacimiento();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Conductor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see flotaVehiculos.Conductor#getNombre()
	 * @see #getConductor()
	 * @generated
	 */
	EAttribute getConductor_Nombre();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.DePrimera <em>De Primera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>De Primera</em>'.
	 * @see flotaVehiculos.DePrimera
	 * @generated
	 */
	EClass getDePrimera();

	/**
	 * Returns the meta object for the reference '{@link flotaVehiculos.DePrimera#getAsignacionFija <em>Asignacion Fija</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asignacion Fija</em>'.
	 * @see flotaVehiculos.DePrimera#getAsignacionFija()
	 * @see #getDePrimera()
	 * @generated
	 */
	EReference getDePrimera_AsignacionFija();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Pesado <em>Pesado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pesado</em>'.
	 * @see flotaVehiculos.Pesado
	 * @generated
	 */
	EClass getPesado();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Pesado#getCarga <em>Carga</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Carga</em>'.
	 * @see flotaVehiculos.Pesado#getCarga()
	 * @see #getPesado()
	 * @generated
	 */
	EAttribute getPesado_Carga();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Camion <em>Camion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camion</em>'.
	 * @see flotaVehiculos.Camion
	 * @generated
	 */
	EClass getCamion();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Camion#getCantidadDeEjes <em>Cantidad De Ejes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad De Ejes</em>'.
	 * @see flotaVehiculos.Camion#getCantidadDeEjes()
	 * @see #getCamion()
	 * @generated
	 */
	EAttribute getCamion_CantidadDeEjes();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Camioneta <em>Camioneta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camioneta</em>'.
	 * @see flotaVehiculos.Camioneta
	 * @generated
	 */
	EClass getCamioneta();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Camioneta#isDobleCabina <em>Doble Cabina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doble Cabina</em>'.
	 * @see flotaVehiculos.Camioneta#isDobleCabina()
	 * @see #getCamioneta()
	 * @generated
	 */
	EAttribute getCamioneta_DobleCabina();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.Omnibus <em>Omnibus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Omnibus</em>'.
	 * @see flotaVehiculos.Omnibus
	 * @generated
	 */
	EClass getOmnibus();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Omnibus#getCantidadAsientos <em>Cantidad Asientos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cantidad Asientos</em>'.
	 * @see flotaVehiculos.Omnibus#getCantidadAsientos()
	 * @see #getOmnibus()
	 * @generated
	 */
	EAttribute getOmnibus_CantidadAsientos();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.Omnibus#isBanio <em>Banio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Banio</em>'.
	 * @see flotaVehiculos.Omnibus#isBanio()
	 * @see #getOmnibus()
	 * @generated
	 */
	EAttribute getOmnibus_Banio();

	/**
	 * Returns the meta object for class '{@link flotaVehiculos.AsignacionDiaria <em>Asignacion Diaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignacion Diaria</em>'.
	 * @see flotaVehiculos.AsignacionDiaria
	 * @generated
	 */
	EClass getAsignacionDiaria();

	/**
	 * Returns the meta object for the reference '{@link flotaVehiculos.AsignacionDiaria#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Asignacion Diaria Vehiculo</em>'.
	 * @see flotaVehiculos.AsignacionDiaria#getAsignacionDiariaVehiculo()
	 * @see #getAsignacionDiaria()
	 * @generated
	 */
	EReference getAsignacionDiaria_AsignacionDiariaVehiculo();

	/**
	 * Returns the meta object for the attribute '{@link flotaVehiculos.AsignacionDiaria#getFechaAsignacion <em>Fecha Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fecha Asignacion</em>'.
	 * @see flotaVehiculos.AsignacionDiaria#getFechaAsignacion()
	 * @see #getAsignacionDiaria()
	 * @generated
	 */
	EAttribute getAsignacionDiaria_FechaAsignacion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlotaVehiculosFactory getFlotaVehiculosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.DiagramaImpl <em>Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.DiagramaImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getDiagrama()
		 * @generated
		 */
		EClass DIAGRAMA = eINSTANCE.getDiagrama();

		/**
		 * The meta object literal for the '<em><b>Vehiculo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__VEHICULO = eINSTANCE.getDiagrama_Vehiculo();

		/**
		 * The meta object literal for the '<em><b>Conductores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__CONDUCTORES = eINSTANCE.getDiagrama_Conductores();

		/**
		 * The meta object literal for the '<em><b>Asignaciones Diarias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ASIGNACIONES_DIARIAS = eINSTANCE.getDiagrama_AsignacionesDiarias();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.VehiculoImpl <em>Vehiculo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.VehiculoImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getVehiculo()
		 * @generated
		 */
		EClass VEHICULO = eINSTANCE.getVehiculo();

		/**
		 * The meta object literal for the '<em><b>Matricula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULO__MATRICULA = eINSTANCE.getVehiculo_Matricula();

		/**
		 * The meta object literal for the '<em><b>Modelo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULO__MODELO = eINSTANCE.getVehiculo_Modelo();

		/**
		 * The meta object literal for the '<em><b>Marca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICULO__MARCA = eINSTANCE.getVehiculo_Marca();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.AutomovilImpl <em>Automovil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.AutomovilImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getAutomovil()
		 * @generated
		 */
		EClass AUTOMOVIL = eINSTANCE.getAutomovil();

		/**
		 * The meta object literal for the '<em><b>Pasajeros</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMOVIL__PASAJEROS = eINSTANCE.getAutomovil_Pasajeros();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.DeSegundaImpl <em>De Segunda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.DeSegundaImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getDeSegunda()
		 * @generated
		 */
		EClass DE_SEGUNDA = eINSTANCE.getDeSegunda();

		/**
		 * The meta object literal for the '<em><b>Conductor Asignacion Diaria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA = eINSTANCE.getDeSegunda_ConductorAsignacionDiaria();

		/**
		 * The meta object literal for the '<em><b>Asignacion Diaria Vehiculo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO = eINSTANCE.getDeSegunda_AsignacionDiariaVehiculo();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.ConductorImpl <em>Conductor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.ConductorImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getConductor()
		 * @generated
		 */
		EClass CONDUCTOR = eINSTANCE.getConductor();

		/**
		 * The meta object literal for the '<em><b>Cedula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__CEDULA = eINSTANCE.getConductor_Cedula();

		/**
		 * The meta object literal for the '<em><b>Fecha Nacimiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__FECHA_NACIMIENTO = eINSTANCE.getConductor_FechaNacimiento();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCTOR__NOMBRE = eINSTANCE.getConductor_Nombre();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.DePrimeraImpl <em>De Primera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.DePrimeraImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getDePrimera()
		 * @generated
		 */
		EClass DE_PRIMERA = eINSTANCE.getDePrimera();

		/**
		 * The meta object literal for the '<em><b>Asignacion Fija</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DE_PRIMERA__ASIGNACION_FIJA = eINSTANCE.getDePrimera_AsignacionFija();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.PesadoImpl <em>Pesado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.PesadoImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getPesado()
		 * @generated
		 */
		EClass PESADO = eINSTANCE.getPesado();

		/**
		 * The meta object literal for the '<em><b>Carga</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PESADO__CARGA = eINSTANCE.getPesado_Carga();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.CamionImpl <em>Camion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.CamionImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getCamion()
		 * @generated
		 */
		EClass CAMION = eINSTANCE.getCamion();

		/**
		 * The meta object literal for the '<em><b>Cantidad De Ejes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMION__CANTIDAD_DE_EJES = eINSTANCE.getCamion_CantidadDeEjes();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.CamionetaImpl <em>Camioneta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.CamionetaImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getCamioneta()
		 * @generated
		 */
		EClass CAMIONETA = eINSTANCE.getCamioneta();

		/**
		 * The meta object literal for the '<em><b>Doble Cabina</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMIONETA__DOBLE_CABINA = eINSTANCE.getCamioneta_DobleCabina();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.OmnibusImpl <em>Omnibus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.OmnibusImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getOmnibus()
		 * @generated
		 */
		EClass OMNIBUS = eINSTANCE.getOmnibus();

		/**
		 * The meta object literal for the '<em><b>Cantidad Asientos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMNIBUS__CANTIDAD_ASIENTOS = eINSTANCE.getOmnibus_CantidadAsientos();

		/**
		 * The meta object literal for the '<em><b>Banio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OMNIBUS__BANIO = eINSTANCE.getOmnibus_Banio();

		/**
		 * The meta object literal for the '{@link flotaVehiculos.impl.AsignacionDiariaImpl <em>Asignacion Diaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flotaVehiculos.impl.AsignacionDiariaImpl
		 * @see flotaVehiculos.impl.FlotaVehiculosPackageImpl#getAsignacionDiaria()
		 * @generated
		 */
		EClass ASIGNACION_DIARIA = eINSTANCE.getAsignacionDiaria();

		/**
		 * The meta object literal for the '<em><b>Asignacion Diaria Vehiculo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO = eINSTANCE.getAsignacionDiaria_AsignacionDiariaVehiculo();

		/**
		 * The meta object literal for the '<em><b>Fecha Asignacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION_DIARIA__FECHA_ASIGNACION = eINSTANCE.getAsignacionDiaria_FechaAsignacion();

	}

} //FlotaVehiculosPackage
