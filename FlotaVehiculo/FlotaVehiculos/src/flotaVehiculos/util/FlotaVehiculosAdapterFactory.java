/**
 */
package flotaVehiculos.util;

import flotaVehiculos.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see flotaVehiculos.FlotaVehiculosPackage
 * @generated
 */
public class FlotaVehiculosAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlotaVehiculosPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotaVehiculosAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FlotaVehiculosPackage.eINSTANCE;
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
	protected FlotaVehiculosSwitch<Adapter> modelSwitch =
		new FlotaVehiculosSwitch<Adapter>() {
			@Override
			public Adapter caseDiagrama(Diagrama object) {
				return createDiagramaAdapter();
			}
			@Override
			public Adapter caseVehiculo(Vehiculo object) {
				return createVehiculoAdapter();
			}
			@Override
			public Adapter caseAutomovil(Automovil object) {
				return createAutomovilAdapter();
			}
			@Override
			public Adapter caseDeSegunda(DeSegunda object) {
				return createDeSegundaAdapter();
			}
			@Override
			public Adapter caseConductor(Conductor object) {
				return createConductorAdapter();
			}
			@Override
			public Adapter caseDePrimera(DePrimera object) {
				return createDePrimeraAdapter();
			}
			@Override
			public Adapter casePesado(Pesado object) {
				return createPesadoAdapter();
			}
			@Override
			public Adapter caseCamion(Camion object) {
				return createCamionAdapter();
			}
			@Override
			public Adapter caseCamioneta(Camioneta object) {
				return createCamionetaAdapter();
			}
			@Override
			public Adapter caseOmnibus(Omnibus object) {
				return createOmnibusAdapter();
			}
			@Override
			public Adapter caseAsignacionDiaria(AsignacionDiaria object) {
				return createAsignacionDiariaAdapter();
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
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Diagrama
	 * @generated
	 */
	public Adapter createDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Vehiculo <em>Vehiculo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Vehiculo
	 * @generated
	 */
	public Adapter createVehiculoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Automovil <em>Automovil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Automovil
	 * @generated
	 */
	public Adapter createAutomovilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.DeSegunda <em>De Segunda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.DeSegunda
	 * @generated
	 */
	public Adapter createDeSegundaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Conductor <em>Conductor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Conductor
	 * @generated
	 */
	public Adapter createConductorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.DePrimera <em>De Primera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.DePrimera
	 * @generated
	 */
	public Adapter createDePrimeraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Pesado <em>Pesado</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Pesado
	 * @generated
	 */
	public Adapter createPesadoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Camion <em>Camion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Camion
	 * @generated
	 */
	public Adapter createCamionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Camioneta <em>Camioneta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Camioneta
	 * @generated
	 */
	public Adapter createCamionetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.Omnibus <em>Omnibus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.Omnibus
	 * @generated
	 */
	public Adapter createOmnibusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flotaVehiculos.AsignacionDiaria <em>Asignacion Diaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flotaVehiculos.AsignacionDiaria
	 * @generated
	 */
	public Adapter createAsignacionDiariaAdapter() {
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

} //FlotaVehiculosAdapterFactory
