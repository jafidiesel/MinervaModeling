/**
 */
package flotaVehiculos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Omnibus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Omnibus#getCantidadAsientos <em>Cantidad Asientos</em>}</li>
 *   <li>{@link flotaVehiculos.Omnibus#isBanio <em>Banio</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getOmnibus()
 * @model
 * @generated
 */
public interface Omnibus extends Pesado {
	/**
	 * Returns the value of the '<em><b>Cantidad Asientos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cantidad Asientos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cantidad Asientos</em>' attribute.
	 * @see #setCantidadAsientos(int)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getOmnibus_CantidadAsientos()
	 * @model
	 * @generated
	 */
	int getCantidadAsientos();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Omnibus#getCantidadAsientos <em>Cantidad Asientos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cantidad Asientos</em>' attribute.
	 * @see #getCantidadAsientos()
	 * @generated
	 */
	void setCantidadAsientos(int value);

	/**
	 * Returns the value of the '<em><b>Banio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Banio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Banio</em>' attribute.
	 * @see #setBanio(boolean)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getOmnibus_Banio()
	 * @model
	 * @generated
	 */
	boolean isBanio();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Omnibus#isBanio <em>Banio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Banio</em>' attribute.
	 * @see #isBanio()
	 * @generated
	 */
	void setBanio(boolean value);

} // Omnibus
