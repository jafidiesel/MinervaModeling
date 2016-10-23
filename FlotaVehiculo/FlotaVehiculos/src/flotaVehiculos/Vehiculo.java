/**
 */
package flotaVehiculos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehiculo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Vehiculo#getMatricula <em>Matricula</em>}</li>
 *   <li>{@link flotaVehiculos.Vehiculo#getModelo <em>Modelo</em>}</li>
 *   <li>{@link flotaVehiculos.Vehiculo#getMarca <em>Marca</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getVehiculo()
 * @model
 * @generated
 */
public interface Vehiculo extends EObject {
	/**
	 * Returns the value of the '<em><b>Matricula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricula</em>' attribute.
	 * @see #setMatricula(String)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getVehiculo_Matricula()
	 * @model
	 * @generated
	 */
	String getMatricula();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Vehiculo#getMatricula <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricula</em>' attribute.
	 * @see #getMatricula()
	 * @generated
	 */
	void setMatricula(String value);

	/**
	 * Returns the value of the '<em><b>Modelo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelo</em>' attribute.
	 * @see #setModelo(String)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getVehiculo_Modelo()
	 * @model
	 * @generated
	 */
	String getModelo();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Vehiculo#getModelo <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelo</em>' attribute.
	 * @see #getModelo()
	 * @generated
	 */
	void setModelo(String value);

	/**
	 * Returns the value of the '<em><b>Marca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marca</em>' attribute.
	 * @see #setMarca(String)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getVehiculo_Marca()
	 * @model
	 * @generated
	 */
	String getMarca();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Vehiculo#getMarca <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marca</em>' attribute.
	 * @see #getMarca()
	 * @generated
	 */
	void setMarca(String value);

} // Vehiculo
