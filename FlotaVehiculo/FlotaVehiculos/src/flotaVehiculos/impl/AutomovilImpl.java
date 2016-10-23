/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.Automovil;
import flotaVehiculos.FlotaVehiculosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automovil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.AutomovilImpl#getPasajeros <em>Pasajeros</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomovilImpl extends VehiculoImpl implements Automovil {
	/**
	 * The default value of the '{@link #getPasajeros() <em>Pasajeros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasajeros()
	 * @generated
	 * @ordered
	 */
	protected static final int PASAJEROS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPasajeros() <em>Pasajeros</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasajeros()
	 * @generated
	 * @ordered
	 */
	protected int pasajeros = PASAJEROS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomovilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.AUTOMOVIL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPasajeros() {
		return pasajeros;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasajeros(int newPasajeros) {
		int oldPasajeros = pasajeros;
		pasajeros = newPasajeros;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.AUTOMOVIL__PASAJEROS, oldPasajeros, pasajeros));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.AUTOMOVIL__PASAJEROS:
				return getPasajeros();
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
			case FlotaVehiculosPackage.AUTOMOVIL__PASAJEROS:
				setPasajeros((Integer)newValue);
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
			case FlotaVehiculosPackage.AUTOMOVIL__PASAJEROS:
				setPasajeros(PASAJEROS_EDEFAULT);
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
			case FlotaVehiculosPackage.AUTOMOVIL__PASAJEROS:
				return pasajeros != PASAJEROS_EDEFAULT;
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
		result.append(" (pasajeros: ");
		result.append(pasajeros);
		result.append(')');
		return result.toString();
	}

} //AutomovilImpl
