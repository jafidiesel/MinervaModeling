/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.DePrimera;
import flotaVehiculos.FlotaVehiculosPackage;
import flotaVehiculos.Pesado;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>De Primera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.DePrimeraImpl#getAsignacionFija <em>Asignacion Fija</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DePrimeraImpl extends ConductorImpl implements DePrimera {
	/**
	 * The cached value of the '{@link #getAsignacionFija() <em>Asignacion Fija</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignacionFija()
	 * @generated
	 * @ordered
	 */
	protected Pesado asignacionFija;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DePrimeraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.DE_PRIMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pesado getAsignacionFija() {
		if (asignacionFija != null && asignacionFija.eIsProxy()) {
			InternalEObject oldAsignacionFija = (InternalEObject)asignacionFija;
			asignacionFija = (Pesado)eResolveProxy(oldAsignacionFija);
			if (asignacionFija != oldAsignacionFija) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlotaVehiculosPackage.DE_PRIMERA__ASIGNACION_FIJA, oldAsignacionFija, asignacionFija));
			}
		}
		return asignacionFija;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pesado basicGetAsignacionFija() {
		return asignacionFija;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsignacionFija(Pesado newAsignacionFija) {
		Pesado oldAsignacionFija = asignacionFija;
		asignacionFija = newAsignacionFija;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.DE_PRIMERA__ASIGNACION_FIJA, oldAsignacionFija, asignacionFija));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.DE_PRIMERA__ASIGNACION_FIJA:
				if (resolve) return getAsignacionFija();
				return basicGetAsignacionFija();
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
			case FlotaVehiculosPackage.DE_PRIMERA__ASIGNACION_FIJA:
				setAsignacionFija((Pesado)newValue);
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
			case FlotaVehiculosPackage.DE_PRIMERA__ASIGNACION_FIJA:
				setAsignacionFija((Pesado)null);
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
			case FlotaVehiculosPackage.DE_PRIMERA__ASIGNACION_FIJA:
				return asignacionFija != null;
		}
		return super.eIsSet(featureID);
	}

} //DePrimeraImpl
