/**
 */
package flotaVehiculos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camioneta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Camioneta#isDobleCabina <em>Doble Cabina</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getCamioneta()
 * @model
 * @generated
 */
public interface Camioneta extends Pesado {
	/**
	 * Returns the value of the '<em><b>Doble Cabina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doble Cabina</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doble Cabina</em>' attribute.
	 * @see #setDobleCabina(boolean)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getCamioneta_DobleCabina()
	 * @model
	 * @generated
	 */
	boolean isDobleCabina();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Camioneta#isDobleCabina <em>Doble Cabina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doble Cabina</em>' attribute.
	 * @see #isDobleCabina()
	 * @generated
	 */
	void setDobleCabina(boolean value);

} // Camioneta
