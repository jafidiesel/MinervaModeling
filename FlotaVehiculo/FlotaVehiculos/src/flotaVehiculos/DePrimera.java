/**
 */
package flotaVehiculos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>De Primera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.DePrimera#getAsignacionFija <em>Asignacion Fija</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getDePrimera()
 * @model
 * @generated
 */
public interface DePrimera extends Conductor {
	/**
	 * Returns the value of the '<em><b>Asignacion Fija</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asignacion Fija</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asignacion Fija</em>' reference.
	 * @see #setAsignacionFija(Pesado)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getDePrimera_AsignacionFija()
	 * @model required="true"
	 * @generated
	 */
	Pesado getAsignacionFija();

	/**
	 * Sets the value of the '{@link flotaVehiculos.DePrimera#getAsignacionFija <em>Asignacion Fija</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asignacion Fija</em>' reference.
	 * @see #getAsignacionFija()
	 * @generated
	 */
	void setAsignacionFija(Pesado value);

} // DePrimera
