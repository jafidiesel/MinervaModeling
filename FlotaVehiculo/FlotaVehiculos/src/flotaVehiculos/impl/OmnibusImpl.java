/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.FlotaVehiculosPackage;
import flotaVehiculos.Omnibus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Omnibus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.OmnibusImpl#getCantidadAsientos <em>Cantidad Asientos</em>}</li>
 *   <li>{@link flotaVehiculos.impl.OmnibusImpl#isBanio <em>Banio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OmnibusImpl extends PesadoImpl implements Omnibus {
	/**
	 * The default value of the '{@link #getCantidadAsientos() <em>Cantidad Asientos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidadAsientos()
	 * @generated
	 * @ordered
	 */
	protected static final int CANTIDAD_ASIENTOS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCantidadAsientos() <em>Cantidad Asientos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantidadAsientos()
	 * @generated
	 * @ordered
	 */
	protected int cantidadAsientos = CANTIDAD_ASIENTOS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBanio() <em>Banio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBanio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BANIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBanio() <em>Banio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBanio()
	 * @generated
	 * @ordered
	 */
	protected boolean banio = BANIO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OmnibusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.OMNIBUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantidadAsientos(int newCantidadAsientos) {
		int oldCantidadAsientos = cantidadAsientos;
		cantidadAsientos = newCantidadAsientos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.OMNIBUS__CANTIDAD_ASIENTOS, oldCantidadAsientos, cantidadAsientos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBanio() {
		return banio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBanio(boolean newBanio) {
		boolean oldBanio = banio;
		banio = newBanio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.OMNIBUS__BANIO, oldBanio, banio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.OMNIBUS__CANTIDAD_ASIENTOS:
				return getCantidadAsientos();
			case FlotaVehiculosPackage.OMNIBUS__BANIO:
				return isBanio();
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
			case FlotaVehiculosPackage.OMNIBUS__CANTIDAD_ASIENTOS:
				setCantidadAsientos((Integer)newValue);
				return;
			case FlotaVehiculosPackage.OMNIBUS__BANIO:
				setBanio((Boolean)newValue);
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
			case FlotaVehiculosPackage.OMNIBUS__CANTIDAD_ASIENTOS:
				setCantidadAsientos(CANTIDAD_ASIENTOS_EDEFAULT);
				return;
			case FlotaVehiculosPackage.OMNIBUS__BANIO:
				setBanio(BANIO_EDEFAULT);
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
			case FlotaVehiculosPackage.OMNIBUS__CANTIDAD_ASIENTOS:
				return cantidadAsientos != CANTIDAD_ASIENTOS_EDEFAULT;
			case FlotaVehiculosPackage.OMNIBUS__BANIO:
				return banio != BANIO_EDEFAULT;
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
		result.append(" (cantidadAsientos: ");
		result.append(cantidadAsientos);
		result.append(", banio: ");
		result.append(banio);
		result.append(')');
		return result.toString();
	}

} //OmnibusImpl
