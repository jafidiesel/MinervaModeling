/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.Entidad;
import modeloER.modeloER.Herencia;
import modeloER.modeloER.LinkHerenciaHijo;
import modeloER.modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Herencia Hijo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.LinkHerenciaHijoImpl#getHerenciaHijoHerenciaDestino <em>Herencia Hijo Herencia Destino</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.LinkHerenciaHijoImpl#getHerenciaHijoEntidadOrigen <em>Herencia Hijo Entidad Origen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkHerenciaHijoImpl extends MinimalEObjectImpl.Container implements LinkHerenciaHijo {
	/**
	 * The cached value of the '{@link #getHerenciaHijoHerenciaDestino() <em>Herencia Hijo Herencia Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciaHijoHerenciaDestino()
	 * @generated
	 * @ordered
	 */
	protected Herencia herenciaHijoHerenciaDestino;

	/**
	 * The cached value of the '{@link #getHerenciaHijoEntidadOrigen() <em>Herencia Hijo Entidad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciaHijoEntidadOrigen()
	 * @generated
	 * @ordered
	 */
	protected Entidad herenciaHijoEntidadOrigen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkHerenciaHijoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.LINK_HERENCIA_HIJO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia getHerenciaHijoHerenciaDestino() {
		if (herenciaHijoHerenciaDestino != null && herenciaHijoHerenciaDestino.eIsProxy()) {
			InternalEObject oldHerenciaHijoHerenciaDestino = (InternalEObject)herenciaHijoHerenciaDestino;
			herenciaHijoHerenciaDestino = (Herencia)eResolveProxy(oldHerenciaHijoHerenciaDestino);
			if (herenciaHijoHerenciaDestino != oldHerenciaHijoHerenciaDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO, oldHerenciaHijoHerenciaDestino, herenciaHijoHerenciaDestino));
			}
		}
		return herenciaHijoHerenciaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia basicGetHerenciaHijoHerenciaDestino() {
		return herenciaHijoHerenciaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerenciaHijoHerenciaDestino(Herencia newHerenciaHijoHerenciaDestino) {
		Herencia oldHerenciaHijoHerenciaDestino = herenciaHijoHerenciaDestino;
		herenciaHijoHerenciaDestino = newHerenciaHijoHerenciaDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO, oldHerenciaHijoHerenciaDestino, herenciaHijoHerenciaDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getHerenciaHijoEntidadOrigen() {
		if (herenciaHijoEntidadOrigen != null && herenciaHijoEntidadOrigen.eIsProxy()) {
			InternalEObject oldHerenciaHijoEntidadOrigen = (InternalEObject)herenciaHijoEntidadOrigen;
			herenciaHijoEntidadOrigen = (Entidad)eResolveProxy(oldHerenciaHijoEntidadOrigen);
			if (herenciaHijoEntidadOrigen != oldHerenciaHijoEntidadOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN, oldHerenciaHijoEntidadOrigen, herenciaHijoEntidadOrigen));
			}
		}
		return herenciaHijoEntidadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetHerenciaHijoEntidadOrigen() {
		return herenciaHijoEntidadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerenciaHijoEntidadOrigen(Entidad newHerenciaHijoEntidadOrigen) {
		Entidad oldHerenciaHijoEntidadOrigen = herenciaHijoEntidadOrigen;
		herenciaHijoEntidadOrigen = newHerenciaHijoEntidadOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN, oldHerenciaHijoEntidadOrigen, herenciaHijoEntidadOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO:
				if (resolve) return getHerenciaHijoHerenciaDestino();
				return basicGetHerenciaHijoHerenciaDestino();
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN:
				if (resolve) return getHerenciaHijoEntidadOrigen();
				return basicGetHerenciaHijoEntidadOrigen();
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
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO:
				setHerenciaHijoHerenciaDestino((Herencia)newValue);
				return;
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN:
				setHerenciaHijoEntidadOrigen((Entidad)newValue);
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
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO:
				setHerenciaHijoHerenciaDestino((Herencia)null);
				return;
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN:
				setHerenciaHijoEntidadOrigen((Entidad)null);
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
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO:
				return herenciaHijoHerenciaDestino != null;
			case ModeloERPackage.LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN:
				return herenciaHijoEntidadOrigen != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkHerenciaHijoImpl
