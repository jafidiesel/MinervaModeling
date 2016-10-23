/**
 */
package flotaVehiculos;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Diagrama#getVehiculo <em>Vehiculo</em>}</li>
 *   <li>{@link flotaVehiculos.Diagrama#getConductores <em>Conductores</em>}</li>
 *   <li>{@link flotaVehiculos.Diagrama#getAsignacionesDiarias <em>Asignaciones Diarias</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getDiagrama()
 * @model
 * @generated
 */
public interface Diagrama extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehiculo</b></em>' containment reference list.
	 * The list contents are of type {@link flotaVehiculos.Vehiculo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehiculo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehiculo</em>' containment reference list.
	 * @see flotaVehiculos.FlotaVehiculosPackage#getDiagrama_Vehiculo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Vehiculo> getVehiculo();

	/**
	 * Returns the value of the '<em><b>Conductores</b></em>' containment reference list.
	 * The list contents are of type {@link flotaVehiculos.Conductor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductores</em>' containment reference list.
	 * @see flotaVehiculos.FlotaVehiculosPackage#getDiagrama_Conductores()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Conductor> getConductores();

	/**
	 * Returns the value of the '<em><b>Asignaciones Diarias</b></em>' containment reference list.
	 * The list contents are of type {@link flotaVehiculos.AsignacionDiaria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asignaciones Diarias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asignaciones Diarias</em>' containment reference list.
	 * @see flotaVehiculos.FlotaVehiculosPackage#getDiagrama_AsignacionesDiarias()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AsignacionDiaria> getAsignacionesDiarias();

} // Diagrama
