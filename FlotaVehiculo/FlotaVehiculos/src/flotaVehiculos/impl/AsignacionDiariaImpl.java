/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.AsignacionDiaria;
import flotaVehiculos.Automovil;
import flotaVehiculos.FlotaVehiculosPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Diaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.AsignacionDiariaImpl#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}</li>
 *   <li>{@link flotaVehiculos.impl.AsignacionDiariaImpl#getFechaAsignacion <em>Fecha Asignacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsignacionDiariaImpl extends MinimalEObjectImpl.Container implements AsignacionDiaria {
	/**
	 * The cached value of the '{@link #getAsignacionDiariaVehiculo() <em>Asignacion Diaria Vehiculo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignacionDiariaVehiculo()
	 * @generated
	 * @ordered
	 */
	protected Automovil asignacionDiariaVehiculo;

	/**
	 * The default value of the '{@link #getFechaAsignacion() <em>Fecha Asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAsignacion()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_ASIGNACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaAsignacion() <em>Fecha Asignacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaAsignacion()
	 * @generated
	 * @ordered
	 */
	protected Date fechaAsignacion = FECHA_ASIGNACION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsignacionDiariaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.ASIGNACION_DIARIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automovil getAsignacionDiariaVehiculo() {
		if (asignacionDiariaVehiculo != null && asignacionDiariaVehiculo.eIsProxy()) {
			InternalEObject oldAsignacionDiariaVehiculo = (InternalEObject)asignacionDiariaVehiculo;
			asignacionDiariaVehiculo = (Automovil)eResolveProxy(oldAsignacionDiariaVehiculo);
			if (asignacionDiariaVehiculo != oldAsignacionDiariaVehiculo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlotaVehiculosPackage.ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO, oldAsignacionDiariaVehiculo, asignacionDiariaVehiculo));
			}
		}
		return asignacionDiariaVehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automovil basicGetAsignacionDiariaVehiculo() {
		return asignacionDiariaVehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsignacionDiariaVehiculo(Automovil newAsignacionDiariaVehiculo) {
		Automovil oldAsignacionDiariaVehiculo = asignacionDiariaVehiculo;
		asignacionDiariaVehiculo = newAsignacionDiariaVehiculo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO, oldAsignacionDiariaVehiculo, asignacionDiariaVehiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaAsignacion(Date newFechaAsignacion) {
		Date oldFechaAsignacion = fechaAsignacion;
		fechaAsignacion = newFechaAsignacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.ASIGNACION_DIARIA__FECHA_ASIGNACION, oldFechaAsignacion, fechaAsignacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO:
				if (resolve) return getAsignacionDiariaVehiculo();
				return basicGetAsignacionDiariaVehiculo();
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__FECHA_ASIGNACION:
				return getFechaAsignacion();
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
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO:
				setAsignacionDiariaVehiculo((Automovil)newValue);
				return;
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__FECHA_ASIGNACION:
				setFechaAsignacion((Date)newValue);
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
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO:
				setAsignacionDiariaVehiculo((Automovil)null);
				return;
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__FECHA_ASIGNACION:
				setFechaAsignacion(FECHA_ASIGNACION_EDEFAULT);
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
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__ASIGNACION_DIARIA_VEHICULO:
				return asignacionDiariaVehiculo != null;
			case FlotaVehiculosPackage.ASIGNACION_DIARIA__FECHA_ASIGNACION:
				return FECHA_ASIGNACION_EDEFAULT == null ? fechaAsignacion != null : !FECHA_ASIGNACION_EDEFAULT.equals(fechaAsignacion);
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
		result.append(" (fechaAsignacion: ");
		result.append(fechaAsignacion);
		result.append(')');
		return result.toString();
	}

} //AsignacionDiariaImpl
