/**
 */
package flotaVehiculos.util;

import flotaVehiculos.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see flotaVehiculos.FlotaVehiculosPackage
 * @generated
 */
public class FlotaVehiculosSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlotaVehiculosPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlotaVehiculosSwitch() {
		if (modelPackage == null) {
			modelPackage = FlotaVehiculosPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlotaVehiculosPackage.DIAGRAMA: {
				Diagrama diagrama = (Diagrama)theEObject;
				T result = caseDiagrama(diagrama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.VEHICULO: {
				Vehiculo vehiculo = (Vehiculo)theEObject;
				T result = caseVehiculo(vehiculo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.AUTOMOVIL: {
				Automovil automovil = (Automovil)theEObject;
				T result = caseAutomovil(automovil);
				if (result == null) result = caseVehiculo(automovil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.DE_SEGUNDA: {
				DeSegunda deSegunda = (DeSegunda)theEObject;
				T result = caseDeSegunda(deSegunda);
				if (result == null) result = caseConductor(deSegunda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.CONDUCTOR: {
				Conductor conductor = (Conductor)theEObject;
				T result = caseConductor(conductor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.DE_PRIMERA: {
				DePrimera dePrimera = (DePrimera)theEObject;
				T result = caseDePrimera(dePrimera);
				if (result == null) result = caseConductor(dePrimera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.PESADO: {
				Pesado pesado = (Pesado)theEObject;
				T result = casePesado(pesado);
				if (result == null) result = caseVehiculo(pesado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.CAMION: {
				Camion camion = (Camion)theEObject;
				T result = caseCamion(camion);
				if (result == null) result = casePesado(camion);
				if (result == null) result = caseVehiculo(camion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.CAMIONETA: {
				Camioneta camioneta = (Camioneta)theEObject;
				T result = caseCamioneta(camioneta);
				if (result == null) result = casePesado(camioneta);
				if (result == null) result = caseVehiculo(camioneta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.OMNIBUS: {
				Omnibus omnibus = (Omnibus)theEObject;
				T result = caseOmnibus(omnibus);
				if (result == null) result = casePesado(omnibus);
				if (result == null) result = caseVehiculo(omnibus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlotaVehiculosPackage.ASIGNACION_DIARIA: {
				AsignacionDiaria asignacionDiaria = (AsignacionDiaria)theEObject;
				T result = caseAsignacionDiaria(asignacionDiaria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagrama(Diagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehiculo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehiculo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehiculo(Vehiculo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automovil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automovil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomovil(Automovil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>De Segunda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>De Segunda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeSegunda(DeSegunda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conductor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConductor(Conductor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>De Primera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>De Primera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDePrimera(DePrimera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pesado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pesado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePesado(Pesado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamion(Camion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camioneta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camioneta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamioneta(Camioneta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Omnibus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Omnibus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOmnibus(Omnibus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion Diaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion Diaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacionDiaria(AsignacionDiaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlotaVehiculosSwitch
