/**
 */
package flotaVehiculos;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.Conductor#getCedula <em>Cedula</em>}</li>
 *   <li>{@link flotaVehiculos.Conductor#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link flotaVehiculos.Conductor#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see flotaVehiculos.FlotaVehiculosPackage#getConductor()
 * @model
 * @generated
 */
public interface Conductor extends EObject {
	/**
	 * Returns the value of the '<em><b>Cedula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cedula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cedula</em>' attribute.
	 * @see #setCedula(int)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getConductor_Cedula()
	 * @model
	 * @generated
	 */
	int getCedula();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Conductor#getCedula <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cedula</em>' attribute.
	 * @see #getCedula()
	 * @generated
	 */
	void setCedula(int value);

	/**
	 * Returns the value of the '<em><b>Fecha Nacimiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fecha Nacimiento</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #setFechaNacimiento(Date)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getConductor_FechaNacimiento()
	 * @model
	 * @generated
	 */
	Date getFechaNacimiento();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Conductor#getFechaNacimiento <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fecha Nacimiento</em>' attribute.
	 * @see #getFechaNacimiento()
	 * @generated
	 */
	void setFechaNacimiento(Date value);

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see flotaVehiculos.FlotaVehiculosPackage#getConductor_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link flotaVehiculos.Conductor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Conductor
