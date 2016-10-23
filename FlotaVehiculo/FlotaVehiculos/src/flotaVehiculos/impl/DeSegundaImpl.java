/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.AsignacionDiaria;
import flotaVehiculos.Automovil;
import flotaVehiculos.DeSegunda;
import flotaVehiculos.FlotaVehiculosPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>De Segunda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.DeSegundaImpl#getConductorAsignacionDiaria <em>Conductor Asignacion Diaria</em>}</li>
 *   <li>{@link flotaVehiculos.impl.DeSegundaImpl#getAsignacionDiariaVehiculo <em>Asignacion Diaria Vehiculo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeSegundaImpl extends ConductorImpl implements DeSegunda {
	/**
	 * The cached value of the '{@link #getConductorAsignacionDiaria() <em>Conductor Asignacion Diaria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductorAsignacionDiaria()
	 * @generated
	 * @ordered
	 */
	protected EList<AsignacionDiaria> conductorAsignacionDiaria;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeSegundaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.DE_SEGUNDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsignacionDiaria> getConductorAsignacionDiaria() {
		if (conductorAsignacionDiaria == null) {
			conductorAsignacionDiaria = new EObjectResolvingEList<AsignacionDiaria>(AsignacionDiaria.class, this, FlotaVehiculosPackage.DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA);
		}
		return conductorAsignacionDiaria;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlotaVehiculosPackage.DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO, oldAsignacionDiariaVehiculo, asignacionDiariaVehiculo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FlotaVehiculosPackage.DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO, oldAsignacionDiariaVehiculo, asignacionDiariaVehiculo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA:
				return getConductorAsignacionDiaria();
			case FlotaVehiculosPackage.DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO:
				if (resolve) return getAsignacionDiariaVehiculo();
				return basicGetAsignacionDiariaVehiculo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FlotaVehiculosPackage.DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA:
				getConductorAsignacionDiaria().clear();
				getConductorAsignacionDiaria().addAll((Collection<? extends AsignacionDiaria>)newValue);
				return;
			case FlotaVehiculosPackage.DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO:
				setAsignacionDiariaVehiculo((Automovil)newValue);
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
			case FlotaVehiculosPackage.DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA:
				getConductorAsignacionDiaria().clear();
				return;
			case FlotaVehiculosPackage.DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO:
				setAsignacionDiariaVehiculo((Automovil)null);
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
			case FlotaVehiculosPackage.DE_SEGUNDA__CONDUCTOR_ASIGNACION_DIARIA:
				return conductorAsignacionDiaria != null && !conductorAsignacionDiaria.isEmpty();
			case FlotaVehiculosPackage.DE_SEGUNDA__ASIGNACION_DIARIA_VEHICULO:
				return asignacionDiariaVehiculo != null;
		}
		return super.eIsSet(featureID);
	}

} //DeSegundaImpl
