/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.Camion;
import flotaVehiculos.FlotaVehiculosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.CamionImpl#getCantidadDeEjes <em>Cantidad De Ejes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamionImpl extends PesadoImpl implements Camion {
	/**
	 * The default value of the '{@link #getCantidadDeEjes() <em>Cantidad De Ejes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidadDeEjes()
	 * @generated
	 * @ordered
	 */
	protected static final int CANTIDAD_DE_EJES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCantidadDeEjes() <em>Cantidad De Ejes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidadDeEjes()
	 * @generated
	 * @ordered
	 */
	protected int cantidadDeEjes = CANTIDAD_DE_EJES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.CAMION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCantidadDeEjes() {
		return cantidadDeEjes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantidadDeEjes(int newCantidadDeEjes) {
		int oldCantidadDeEjes = cantidadDeEjes;
		cantidadDeEjes = newCantidadDeEjes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.CAMION__CANTIDAD_DE_EJES, oldCantidadDeEjes, cantidadDeEjes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.CAMION__CANTIDAD_DE_EJES:
				return getCantidadDeEjes();
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
			case FlotaVehiculosPackage.CAMION__CANTIDAD_DE_EJES:
				setCantidadDeEjes((Integer)newValue);
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
			case FlotaVehiculosPackage.CAMION__CANTIDAD_DE_EJES:
				setCantidadDeEjes(CANTIDAD_DE_EJES_EDEFAULT);
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
			case FlotaVehiculosPackage.CAMION__CANTIDAD_DE_EJES:
				return cantidadDeEjes != CANTIDAD_DE_EJES_EDEFAULT;
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
		result.append(" (cantidadDeEjes: ");
		result.append(cantidadDeEjes);
		result.append(')');
		return result.toString();
	}

} //CamionImpl
