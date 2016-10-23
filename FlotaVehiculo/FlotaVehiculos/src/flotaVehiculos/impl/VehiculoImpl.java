/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.FlotaVehiculosPackage;
import flotaVehiculos.Vehiculo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehiculo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.VehiculoImpl#getMatricula <em>Matricula</em>}</li>
 *   <li>{@link flotaVehiculos.impl.VehiculoImpl#getModelo <em>Modelo</em>}</li>
 *   <li>{@link flotaVehiculos.impl.VehiculoImpl#getMarca <em>Marca</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehiculoImpl extends MinimalEObjectImpl.Container implements Vehiculo {
	/**
	 * The default value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICULA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatricula() <em>Matricula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricula()
	 * @generated
	 * @ordered
	 */
	protected String matricula = MATRICULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelo() <em>Modelo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelo()
	 * @generated
	 * @ordered
	 */
	protected String modelo = MODELO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected static final String MARCA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected String marca = MARCA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiculoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.VEHICULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricula(String newMatricula) {
		String oldMatricula = matricula;
		matricula = newMatricula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.VEHICULO__MATRICULA, oldMatricula, matricula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelo(String newModelo) {
		String oldModelo = modelo;
		modelo = newModelo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.VEHICULO__MODELO, oldModelo, modelo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarca(String newMarca) {
		String oldMarca = marca;
		marca = newMarca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.VEHICULO__MARCA, oldMarca, marca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.VEHICULO__MATRICULA:
				return getMatricula();
			case FlotaVehiculosPackage.VEHICULO__MODELO:
				return getModelo();
			case FlotaVehiculosPackage.VEHICULO__MARCA:
				return getMarca();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlotaVehiculosPackage.VEHICULO__MATRICULA:
				setMatricula((String)newValue);
				return;
			case FlotaVehiculosPackage.VEHICULO__MODELO:
				setModelo((String)newValue);
				return;
			case FlotaVehiculosPackage.VEHICULO__MARCA:
				setMarca((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FlotaVehiculosPackage.VEHICULO__MATRICULA:
				setMatricula(MATRICULA_EDEFAULT);
				return;
			case FlotaVehiculosPackage.VEHICULO__MODELO:
				setModelo(MODELO_EDEFAULT);
				return;
			case FlotaVehiculosPackage.VEHICULO__MARCA:
				setMarca(MARCA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FlotaVehiculosPackage.VEHICULO__MATRICULA:
				return MATRICULA_EDEFAULT == null ? matricula != null : !MATRICULA_EDEFAULT.equals(matricula);
			case FlotaVehiculosPackage.VEHICULO__MODELO:
				return MODELO_EDEFAULT == null ? modelo != null : !MODELO_EDEFAULT.equals(modelo);
			case FlotaVehiculosPackage.VEHICULO__MARCA:
				return MARCA_EDEFAULT == null ? marca != null : !MARCA_EDEFAULT.equals(marca);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (matricula: ");
		result.append(matricula);
		result.append(", modelo: ");
		result.append(modelo);
		result.append(", marca: ");
		result.append(marca);
		result.append(')');
		return result.toString();
	}

} //VehiculoImpl
