/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.FlotaVehiculosPackage;
import flotaVehiculos.Pesado;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pesado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.PesadoImpl#getCarga <em>Carga</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PesadoImpl extends VehiculoImpl implements Pesado {
	/**
	 * The default value of the '{@link #getCarga() <em>Carga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarga()
	 * @generated
	 * @ordered
	 */
	protected static final int CARGA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCarga() <em>Carga</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarga()
	 * @generated
	 * @ordered
	 */
	protected int carga = CARGA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PesadoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.PESADO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarga(int newCarga) {
		int oldCarga = carga;
		carga = newCarga;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.PESADO__CARGA, oldCarga, carga));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.PESADO__CARGA:
				return getCarga();
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
			case FlotaVehiculosPackage.PESADO__CARGA:
				setCarga((Integer)newValue);
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
			case FlotaVehiculosPackage.PESADO__CARGA:
				setCarga(CARGA_EDEFAULT);
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
			case FlotaVehiculosPackage.PESADO__CARGA:
				return carga != CARGA_EDEFAULT;
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
		result.append(" (carga: ");
		result.append(carga);
		result.append(')');
		return result.toString();
	}

} //PesadoImpl
