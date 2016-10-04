/**
 */
package modeloER.impl;

import java.util.Collection;

import modeloER.Entidad;
import modeloER.Herencia;
import modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.impl.HerenciaImpl#getEntidadPadreHerencia <em>Entidad Padre Herencia</em>}</li>
 *   <li>{@link modeloER.impl.HerenciaImpl#getEntidadesHijasHerencia <em>Entidades Hijas Herencia</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HerenciaImpl extends MinimalEObjectImpl.Container implements Herencia {
	/**
	 * The cached value of the '{@link #getEntidadPadreHerencia() <em>Entidad Padre Herencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadPadreHerencia()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidadPadreHerencia;

	/**
	 * The cached value of the '{@link #getEntidadesHijasHerencia() <em>Entidades Hijas Herencia</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadesHijasHerencia()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidadesHijasHerencia;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HerenciaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.HERENCIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntidadPadreHerencia() {
		if (entidadPadreHerencia != null && entidadPadreHerencia.eIsProxy()) {
			InternalEObject oldEntidadPadreHerencia = (InternalEObject)entidadPadreHerencia;
			entidadPadreHerencia = (Entidad)eResolveProxy(oldEntidadPadreHerencia);
			if (entidadPadreHerencia != oldEntidadPadreHerencia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.HERENCIA__ENTIDAD_PADRE_HERENCIA, oldEntidadPadreHerencia, entidadPadreHerencia));
			}
		}
		return entidadPadreHerencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidadPadreHerencia() {
		return entidadPadreHerencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidadPadreHerencia(Entidad newEntidadPadreHerencia) {
		Entidad oldEntidadPadreHerencia = entidadPadreHerencia;
		entidadPadreHerencia = newEntidadPadreHerencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.HERENCIA__ENTIDAD_PADRE_HERENCIA, oldEntidadPadreHerencia, entidadPadreHerencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidadesHijasHerencia() {
		if (entidadesHijasHerencia == null) {
			entidadesHijasHerencia = new EObjectResolvingEList<Entidad>(Entidad.class, this, ModeloERPackage.HERENCIA__ENTIDADES_HIJAS_HERENCIA);
		}
		return entidadesHijasHerencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.HERENCIA__ENTIDAD_PADRE_HERENCIA:
				if (resolve) return getEntidadPadreHerencia();
				return basicGetEntidadPadreHerencia();
			case ModeloERPackage.HERENCIA__ENTIDADES_HIJAS_HERENCIA:
				return getEntidadesHijasHerencia();
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
			case ModeloERPackage.HERENCIA__ENTIDAD_PADRE_HERENCIA:
				setEntidadPadreHerencia((Entidad)newValue);
				return;
			case ModeloERPackage.HERENCIA__ENTIDADES_HIJAS_HERENCIA:
				getEntidadesHijasHerencia().clear();
				getEntidadesHijasHerencia().addAll((Collection<? extends Entidad>)newValue);
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
			case ModeloERPackage.HERENCIA__ENTIDAD_PADRE_HERENCIA:
				setEntidadPadreHerencia((Entidad)null);
				return;
			case ModeloERPackage.HERENCIA__ENTIDADES_HIJAS_HERENCIA:
				getEntidadesHijasHerencia().clear();
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
			case ModeloERPackage.HERENCIA__ENTIDAD_PADRE_HERENCIA:
				return entidadPadreHerencia != null;
			case ModeloERPackage.HERENCIA__ENTIDADES_HIJAS_HERENCIA:
				return entidadesHijasHerencia != null && !entidadesHijasHerencia.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HerenciaImpl
