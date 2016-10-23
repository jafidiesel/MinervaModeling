/**
 */
package flotaVehiculos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Automovil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Automovil#getPasajeros <em>Pasajeros</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getAutomovil()
 * @model
 * @generated
 */
public interface Automovil extends Vehiculo {
	/**
	 * Returns the value of the '<em><b>Pasajeros</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pasajeros</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pasajeros</em>' attribute.
	 * @see #setPasajeros(int)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getAutomovil_Pasajeros()
	 * @model
	 * @generated
	 */
	int getPasajeros();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Automovil#getPasajeros <em>Pasajeros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pasajeros</em>' attribute.
	 * @see #getPasajeros()
	 * @generated
	 */
	void setPasajeros(int value);

} // Automovil
