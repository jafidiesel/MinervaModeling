/**
 */
package flotaVehiculos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Camion#getCantidadDeEjes <em>Cantidad De Ejes</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getCamion()
 * @model
 * @generated
 */
public interface Camion extends Pesado {
	/**
	 * Returns the value of the '<em><b>Cantidad De Ejes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cantidad De Ejes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad De Ejes</em>' attribute.
	 * @see #setCantidadDeEjes(int)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getCamion_CantidadDeEjes()
	 * @model
	 * @generated
	 */
	int getCantidadDeEjes();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Camion#getCantidadDeEjes <em>Cantidad De Ejes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad De Ejes</em>' attribute.
	 * @see #getCantidadDeEjes()
	 * @generated
	 */
	void setCantidadDeEjes(int value);

} // Camion
