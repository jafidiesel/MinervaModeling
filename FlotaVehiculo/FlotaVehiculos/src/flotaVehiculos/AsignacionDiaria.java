/**
 */
package flotaVehiculos;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Diaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.AsignacionDiaria#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}</li>
 *   <li>{@link flotaVehiculos.AsignacionDiaria#getFechaAsignacion <em>Fecha Asignacion</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getAsignacionDiaria()
 * @model
 * @generated
 */
public interface AsignacionDiaria extends EObject {
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
	 * @see flotaVehiculos.FlotaVehiculosPackage#getAsignacionDiaria_AsignacionDiariaVehiculo()
	 * @model required="true"
	 * @generated
	 */
	Automovil getAsignacionDiariaVehiculo();

	/**
	 * Sets the value of the '{@link flotaVehiculos.AsignacionDiaria#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asignacion Diaria Vehiculo</em>' reference.
	 * @see #getAsignacionDiariaVehiculo()
	 * @generated
	 */
	void setAsignacionDiariaVehiculo(Automovil value);

	/**
	 * Returns the value of the '<em><b>Fecha Asignacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Asignacion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Asignacion</em>' attribute.
	 * @see #setFechaAsignacion(Date)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getAsignacionDiaria_FechaAsignacion()
	 * @model
	 * @generated
	 */
	Date getFechaAsignacion();

	/**
	 * Sets the value of the '{@link flotaVehiculos.AsignacionDiaria#getFechaAsignacion <em>Fecha Asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Asignacion</em>' attribute.
	 * @see #getFechaAsignacion()
	 * @generated
	 */
	void setFechaAsignacion(Date value);

} // AsignacionDiaria
