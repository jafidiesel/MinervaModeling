/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.*;

import org.eclipse.emf.ecore.EClass;
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
public class FlotaVehiculosFactoryImpl extends EFactoryImpl implements FlotaVehiculosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlotaVehiculosFactory init() {
		try {
			FlotaVehiculosFactory theFlotaVehiculosFactory = (FlotaVehiculosFactory)EPackage.Registry.INSTANCE.getEFactory(FlotaVehiculosPackage.eNS_URI);
			if (theFlotaVehiculosFactory != null) {
				return theFlotaVehiculosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FlotaVehiculosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotaVehiculosFactoryImpl() {
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
			case FlotaVehiculosPackage.DIAGRAMA: return createDiagrama();
			case FlotaVehiculosPackage.VEHICULO: return createVehiculo();
			case FlotaVehiculosPackage.AUTOMOVIL: return createAutomovil();
			case FlotaVehiculosPackage.DE_SEGUNDA: return createDeSegunda();
			case FlotaVehiculosPackage.CONDUCTOR: return createConductor();
			case FlotaVehiculosPackage.DE_PRIMERA: return createDePrimera();
			case FlotaVehiculosPackage.PESADO: return createPesado();
			case FlotaVehiculosPackage.CAMION: return createCamion();
			case FlotaVehiculosPackage.CAMIONETA: return createCamioneta();
			case FlotaVehiculosPackage.OMNIBUS: return createOmnibus();
			case FlotaVehiculosPackage.ASIGNACION_DIARIA: return createAsignacionDiaria();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public Vehiculo createVehiculo() {
		VehiculoImpl vehiculo = new VehiculoImpl();
		return vehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automovil createAutomovil() {
		AutomovilImpl automovil = new AutomovilImpl();
		return automovil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeSegunda createDeSegunda() {
		DeSegundaImpl deSegunda = new DeSegundaImpl();
		return deSegunda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conductor createConductor() {
		ConductorImpl conductor = new ConductorImpl();
		return conductor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DePrimera createDePrimera() {
		DePrimeraImpl dePrimera = new DePrimeraImpl();
		return dePrimera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pesado createPesado() {
		PesadoImpl pesado = new PesadoImpl();
		return pesado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camion createCamion() {
		CamionImpl camion = new CamionImpl();
		return camion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camioneta createCamioneta() {
		CamionetaImpl camioneta = new CamionetaImpl();
		return camioneta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Omnibus createOmnibus() {
		OmnibusImpl omnibus = new OmnibusImpl();
		return omnibus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsignacionDiaria createAsignacionDiaria() {
		AsignacionDiariaImpl asignacionDiaria = new AsignacionDiariaImpl();
		return asignacionDiaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotaVehiculosPackage getFlotaVehiculosPackage() {
		return (FlotaVehiculosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FlotaVehiculosPackage getPackage() {
		return FlotaVehiculosPackage.eINSTANCE;
	}

} //FlotaVehiculosFactoryImpl
