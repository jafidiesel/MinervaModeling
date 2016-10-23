/**
 */
package flotaVehiculos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>De Segunda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.DeSegunda#getConductorAsignacionDiaria <em>Conductor Asignacion Diaria</em>}</li>
 *   <li>{@link flotaVehiculos.DeSegunda#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getDeSegunda()
 * @model
 * @generated
 */
public interface DeSegunda extends Conductor {
	/**
	 * Returns the value of the '<em><b>Conductor Asignacion Diaria</b></em>' reference list.
	 * The list contents are of type {@link flotaVehiculos.AsignacionDiaria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conductor Asignacion Diaria</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conductor Asignacion Diaria</em>' reference list.
	 * @see flotaVehiculos.FlotaVehiculosPackage#getDeSegunda_ConductorAsignacionDiaria()
	 * @model required="true"
	 * @generated
	 */
	EList<AsignacionDiaria> getConductorAsignacionDiaria();

	/**
	 * Returns the value of the '<em><b>Asignacion Diaria Vehiculo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asignacion Diaria Vehiculo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asignacion Diaria Vehiculo</em>' reference.
	 * @see #setAsignacionDiariaVehiculo(Automovil)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getDeSegunda_AsignacionDiariaVehiculo()
	 * @model required="true"
	 * @generated
	 */
	Automovil getAsignacionDiariaVehiculo();

	/**
	 * Sets the value of the '{@link flotaVehiculos.DeSegunda#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asignacion Diaria Vehiculo</em>' reference.
	 * @see #getAsignacionDiariaVehiculo()
	 * @generated
	 */
	void setAsignacionDiariaVehiculo(Automovil value);

} // DeSegunda
