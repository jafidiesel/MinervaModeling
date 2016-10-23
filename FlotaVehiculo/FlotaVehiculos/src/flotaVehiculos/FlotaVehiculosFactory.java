/**
 */
package flotaVehiculos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see flotaVehiculos.FlotaVehiculosPackage
 * @generated
 */
public interface FlotaVehiculosFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlotaVehiculosFactory eINSTANCE = flotaVehiculos.impl.FlotaVehiculosFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagrama</em>'.
	 * @generated
	 */
	Diagrama createDiagrama();

	/**
	 * Returns a new object of class '<em>Vehiculo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehiculo</em>'.
	 * @generated
	 */
	Vehiculo createVehiculo();

	/**
	 * Returns a new object of class '<em>Automovil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automovil</em>'.
	 * @generated
	 */
	Automovil createAutomovil();

	/**
	 * Returns a new object of class '<em>De Segunda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>De Segunda</em>'.
	 * @generated
	 */
	DeSegunda createDeSegunda();

	/**
	 * Returns a new object of class '<em>Conductor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conductor</em>'.
	 * @generated
	 */
	Conductor createConductor();

	/**
	 * Returns a new object of class '<em>De Primera</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>De Primera</em>'.
	 * @generated
	 */
	DePrimera createDePrimera();

	/**
	 * Returns a new object of class '<em>Pesado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pesado</em>'.
	 * @generated
	 */
	Pesado createPesado();

	/**
	 * Returns a new object of class '<em>Camion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camion</em>'.
	 * @generated
	 */
	Camion createCamion();

	/**
	 * Returns a new object of class '<em>Camioneta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camioneta</em>'.
	 * @generated
	 */
	Camioneta createCamioneta();

	/**
	 * Returns a new object of class '<em>Omnibus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Omnibus</em>'.
	 * @generated
	 */
	Omnibus createOmnibus();

	/**
	 * Returns a new object of class '<em>Asignacion Diaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asignacion Diaria</em>'.
	 * @generated
	 */
	AsignacionDiaria createAsignacionDiaria();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FlotaVehiculosPackage getFlotaVehiculosPackage();

} //FlotaVehiculosFactory
