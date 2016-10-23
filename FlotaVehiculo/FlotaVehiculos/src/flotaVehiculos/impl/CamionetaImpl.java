/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.Camioneta;
import flotaVehiculos.FlotaVehiculosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camioneta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.CamionetaImpl#isDobleCabina <em>Doble Cabina</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CamionetaImpl extends PesadoImpl implements Camioneta {
	/**
	 * The default value of the '{@link #isDobleCabina() <em>Doble Cabina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDobleCabina()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOBLE_CABINA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDobleCabina() <em>Doble Cabina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDobleCabina()
	 * @generated
	 * @ordered
	 */
	protected boolean dobleCabina = DOBLE_CABINA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CamionetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.CAMIONETA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDobleCabina() {
		return dobleCabina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDobleCabina(boolean newDobleCabina) {
		boolean oldDobleCabina = dobleCabina;
		dobleCabina = newDobleCabina;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.CAMIONETA__DOBLE_CABINA, oldDobleCabina, dobleCabina));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.CAMIONETA__DOBLE_CABINA:
				return isDobleCabina();
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
			case FlotaVehiculosPackage.CAMIONETA__DOBLE_CABINA:
				setDobleCabina((Boolean)newValue);
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
			case FlotaVehiculosPackage.CAMIONETA__DOBLE_CABINA:
				setDobleCabina(DOBLE_CABINA_EDEFAULT);
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
			case FlotaVehiculosPackage.CAMIONETA__DOBLE_CABINA:
				return dobleCabina != DOBLE_CABINA_EDEFAULT;
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
		result.append(" (dobleCabina: ");
		result.append(dobleCabina);
		result.append(')');
		return result.toString();
	}

} //CamionetaImpl
