/**
 */
package flotaVehiculos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pesado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Pesado#getCarga <em>Carga</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getPesado()
 * @model
 * @generated
 */
public interface Pesado extends Vehiculo {
	/**
	 * Returns the value of the '<em><b>Carga</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carga</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carga</em>' attribute.
	 * @see #setCarga(int)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getPesado_Carga()
	 * @model
	 * @generated
	 */
	int getCarga();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Pesado#getCarga <em>Carga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carga</em>' attribute.
	 * @see #getCarga()
	 * @generated
	 */
	void setCarga(int value);

} // Pesado
