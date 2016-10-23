/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.Conductor;
import flotaVehiculos.FlotaVehiculosPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conductor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.ConductorImpl#getCedula <em>Cedula</em>}</li>
 *   <li>{@link flotaVehiculos.impl.ConductorImpl#getFechaNacimiento <em>Fecha Nacimiento</em>}</li>
 *   <li>{@link flotaVehiculos.impl.ConductorImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductorImpl extends MinimalEObjectImpl.Container implements Conductor {
	/**
	 * The default value of the '{@link #getCedula() <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCedula()
	 * @generated
	 * @ordered
	 */
	protected static final int CEDULA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCedula() <em>Cedula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCedula()
	 * @generated
	 * @ordered
	 */
	protected int cedula = CEDULA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_NACIMIENTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaNacimiento() <em>Fecha Nacimiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaNacimiento()
	 * @generated
	 * @ordered
	 */
	protected Date fechaNacimiento = FECHA_NACIMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.CONDUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCedula() {
		return cedula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCedula(int newCedula) {
		int oldCedula = cedula;
		cedula = newCedula;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.CONDUCTOR__CEDULA, oldCedula, cedula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFechaNacimiento(Date newFechaNacimiento) {
		Date oldFechaNacimiento = fechaNacimiento;
		fechaNacimiento = newFechaNacimiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.CONDUCTOR__FECHA_NACIMIENTO, oldFechaNacimiento, fechaNacimiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.CONDUCTOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.CONDUCTOR__CEDULA:
				return getCedula();
			case FlotaVehiculosPackage.CONDUCTOR__FECHA_NACIMIENTO:
				return getFechaNacimiento();
			case FlotaVehiculosPackage.CONDUCTOR__NOMBRE:
				return getNombre();
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
			case FlotaVehiculosPackage.CONDUCTOR__CEDULA:
				setCedula((Integer)newValue);
				return;
			case FlotaVehiculosPackage.CONDUCTOR__FECHA_NACIMIENTO:
				setFechaNacimiento((Date)newValue);
				return;
			case FlotaVehiculosPackage.CONDUCTOR__NOMBRE:
				setNombre((String)newValue);
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
			case FlotaVehiculosPackage.CONDUCTOR__CEDULA:
				setCedula(CEDULA_EDEFAULT);
				return;
			case FlotaVehiculosPackage.CONDUCTOR__FECHA_NACIMIENTO:
				setFechaNacimiento(FECHA_NACIMIENTO_EDEFAULT);
				return;
			case FlotaVehiculosPackage.CONDUCTOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
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
			case FlotaVehiculosPackage.CONDUCTOR__CEDULA:
				return cedula != CEDULA_EDEFAULT;
			case FlotaVehiculosPackage.CONDUCTOR__FECHA_NACIMIENTO:
				return FECHA_NACIMIENTO_EDEFAULT == null ? fechaNacimiento != null : !FECHA_NACIMIENTO_EDEFAULT.equals(fechaNacimiento);
			case FlotaVehiculosPackage.CONDUCTOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		result.append(" (cedula: ");
		result.append(cedula);
		result.append(", fechaNacimiento: ");
		result.append(fechaNacimiento);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //ConductorImpl
