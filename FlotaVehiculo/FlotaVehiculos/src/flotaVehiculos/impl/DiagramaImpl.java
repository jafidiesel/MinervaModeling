/**
 */
package flotaVehiculos.impl;

import flotaVehiculos.AsignacionDiaria;
import flotaVehiculos.Conductor;
import flotaVehiculos.Diagrama;
import flotaVehiculos.FlotaVehiculosPackage;
import flotaVehiculos.Vehiculo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flotaVehiculos.impl.DiagramaImpl#getVehiculo <em>Vehiculo</em>}</li>
 *   <li>{@link flotaVehiculos.impl.DiagramaImpl#getConductores <em>Conductores</em>}</li>
 *   <li>{@link flotaVehiculos.impl.DiagramaImpl#getAsignacionesDiarias <em>Asignaciones Diarias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaImpl extends MinimalEObjectImpl.Container implements Diagrama {
	/**
	 * The cached value of the '{@link #getVehiculo() <em>Vehiculo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehiculo()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehiculo> vehiculo;

	/**
	 * The cached value of the '{@link #getConductores() <em>Conductores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConductores()
	 * @generated
	 * @ordered
	 */
	protected EList<Conductor> conductores;

	/**
	 * The cached value of the '{@link #getAsignacionesDiarias() <em>Asignaciones Diarias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsignacionesDiarias()
	 * @generated
	 * @ordered
	 */
	protected EList<AsignacionDiaria> asignacionesDiarias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlotaVehiculosPackage.Literals.DIAGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehiculo> getVehiculo() {
		if (vehiculo == null) {
			vehiculo = new EObjectContainmentEList<Vehiculo>(Vehiculo.class, this, FlotaVehiculosPackage.DIAGRAMA__VEHICULO);
		}
		return vehiculo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conductor> getConductores() {
		if (conductores == null) {
			conductores = new EObjectContainmentEList<Conductor>(Conductor.class, this, FlotaVehiculosPackage.DIAGRAMA__CONDUCTORES);
		}
		return conductores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AsignacionDiaria> getAsignacionesDiarias() {
		if (asignacionesDiarias == null) {
			asignacionesDiarias = new EObjectContainmentEList<AsignacionDiaria>(AsignacionDiaria.class, this, FlotaVehiculosPackage.DIAGRAMA__ASIGNACIONES_DIARIAS);
		}
		return asignacionesDiarias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlotaVehiculosPackage.DIAGRAMA__VEHICULO:
				return ((InternalEList<?>)getVehiculo()).basicRemove(otherEnd, msgs);
			case FlotaVehiculosPackage.DIAGRAMA__CONDUCTORES:
				return ((InternalEList<?>)getConductores()).basicRemove(otherEnd, msgs);
			case FlotaVehiculosPackage.DIAGRAMA__ASIGNACIONES_DIARIAS:
				return ((InternalEList<?>)getAsignacionesDiarias()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlotaVehiculosPackage.DIAGRAMA__VEHICULO:
				return getVehiculo();
			case FlotaVehiculosPackage.DIAGRAMA__CONDUCTORES:
				return getConductores();
			case FlotaVehiculosPackage.DIAGRAMA__ASIGNACIONES_DIARIAS:
				return getAsignacionesDiarias();
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
			case FlotaVehiculosPackage.DIAGRAMA__VEHICULO:
				getVehiculo().clear();
				getVehiculo().addAll((Collection<? extends Vehiculo>)newValue);
				return;
			case FlotaVehiculosPackage.DIAGRAMA__CONDUCTORES:
				getConductores().clear();
				getConductores().addAll((Collection<? extends Conductor>)newValue);
				return;
			case FlotaVehiculosPackage.DIAGRAMA__ASIGNACIONES_DIARIAS:
				getAsignacionesDiarias().clear();
				getAsignacionesDiarias().addAll((Collection<? extends AsignacionDiaria>)newValue);
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
			case FlotaVehiculosPackage.DIAGRAMA__VEHICULO:
				getVehiculo().clear();
				return;
			case FlotaVehiculosPackage.DIAGRAMA__CONDUCTORES:
				getConductores().clear();
				return;
			case FlotaVehiculosPackage.DIAGRAMA__ASIGNACIONES_DIARIAS:
				getAsignacionesDiarias().clear();
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
			case FlotaVehiculosPackage.DIAGRAMA__VEHICULO:
				return vehiculo != null && !vehiculo.isEmpty();
			case FlotaVehiculosPackage.DIAGRAMA__CONDUCTORES:
				return conductores != null && !conductores.isEmpty();
			case FlotaVehiculosPackage.DIAGRAMA__ASIGNACIONES_DIARIAS:
				return asignacionesDiarias != null && !asignacionesDiarias.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramaImpl
