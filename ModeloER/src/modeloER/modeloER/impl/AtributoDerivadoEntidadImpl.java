/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.AtributoDerivado;
import modeloER.modeloER.AtributoDerivadoClavePrimaria;
import modeloER.modeloER.AtributoDerivadoEntidad;
import modeloER.modeloER.Entidad;
import modeloER.modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo Derivado Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.AtributoDerivadoEntidadImpl#getEntidadAtributoDerivadoOrigen <em>Entidad Atributo Derivado Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.AtributoDerivadoEntidadImpl#getAtributoderivadoclaveprimariaDestino <em>Atributoderivadoclaveprimaria Destino</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.AtributoDerivadoEntidadImpl#getAtributoderivadoDestino <em>Atributoderivado Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoDerivadoEntidadImpl extends MinimalEObjectImpl.Container implements AtributoDerivadoEntidad {
	/**
	 * The cached value of the '{@link #getEntidadAtributoDerivadoOrigen() <em>Entidad Atributo Derivado Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadAtributoDerivadoOrigen()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidadAtributoDerivadoOrigen;

	/**
	 * The cached value of the '{@link #getAtributoderivadoclaveprimariaDestino() <em>Atributoderivadoclaveprimaria Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoderivadoclaveprimariaDestino()
	 * @generated
	 * @ordered
	 */
	protected AtributoDerivadoClavePrimaria atributoderivadoclaveprimariaDestino;

	/**
	 * The cached value of the '{@link #getAtributoderivadoDestino() <em>Atributoderivado Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoderivadoDestino()
	 * @generated
	 * @ordered
	 */
	protected AtributoDerivado atributoderivadoDestino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoDerivadoEntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.ATRIBUTO_DERIVADO_ENTIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntidadAtributoDerivadoOrigen() {
		if (entidadAtributoDerivadoOrigen != null && entidadAtributoDerivadoOrigen.eIsProxy()) {
			InternalEObject oldEntidadAtributoDerivadoOrigen = (InternalEObject)entidadAtributoDerivadoOrigen;
			entidadAtributoDerivadoOrigen = (Entidad)eResolveProxy(oldEntidadAtributoDerivadoOrigen);
			if (entidadAtributoDerivadoOrigen != oldEntidadAtributoDerivadoOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN, oldEntidadAtributoDerivadoOrigen, entidadAtributoDerivadoOrigen));
			}
		}
		return entidadAtributoDerivadoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidadAtributoDerivadoOrigen() {
		return entidadAtributoDerivadoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidadAtributoDerivadoOrigen(Entidad newEntidadAtributoDerivadoOrigen) {
		Entidad oldEntidadAtributoDerivadoOrigen = entidadAtributoDerivadoOrigen;
		entidadAtributoDerivadoOrigen = newEntidadAtributoDerivadoOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN, oldEntidadAtributoDerivadoOrigen, entidadAtributoDerivadoOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoDerivadoClavePrimaria getAtributoderivadoclaveprimariaDestino() {
		if (atributoderivadoclaveprimariaDestino != null && atributoderivadoclaveprimariaDestino.eIsProxy()) {
			InternalEObject oldAtributoderivadoclaveprimariaDestino = (InternalEObject)atributoderivadoclaveprimariaDestino;
			atributoderivadoclaveprimariaDestino = (AtributoDerivadoClavePrimaria)eResolveProxy(oldAtributoderivadoclaveprimariaDestino);
			if (atributoderivadoclaveprimariaDestino != oldAtributoderivadoclaveprimariaDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO, oldAtributoderivadoclaveprimariaDestino, atributoderivadoclaveprimariaDestino));
			}
		}
		return atributoderivadoclaveprimariaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoDerivadoClavePrimaria basicGetAtributoderivadoclaveprimariaDestino() {
		return atributoderivadoclaveprimariaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributoderivadoclaveprimariaDestino(AtributoDerivadoClavePrimaria newAtributoderivadoclaveprimariaDestino) {
		AtributoDerivadoClavePrimaria oldAtributoderivadoclaveprimariaDestino = atributoderivadoclaveprimariaDestino;
		atributoderivadoclaveprimariaDestino = newAtributoderivadoclaveprimariaDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO, oldAtributoderivadoclaveprimariaDestino, atributoderivadoclaveprimariaDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoDerivado getAtributoderivadoDestino() {
		if (atributoderivadoDestino != null && atributoderivadoDestino.eIsProxy()) {
			InternalEObject oldAtributoderivadoDestino = (InternalEObject)atributoderivadoDestino;
			atributoderivadoDestino = (AtributoDerivado)eResolveProxy(oldAtributoderivadoDestino);
			if (atributoderivadoDestino != oldAtributoderivadoDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO, oldAtributoderivadoDestino, atributoderivadoDestino));
			}
		}
		return atributoderivadoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoDerivado basicGetAtributoderivadoDestino() {
		return atributoderivadoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributoderivadoDestino(AtributoDerivado newAtributoderivadoDestino) {
		AtributoDerivado oldAtributoderivadoDestino = atributoderivadoDestino;
		atributoderivadoDestino = newAtributoderivadoDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO, oldAtributoderivadoDestino, atributoderivadoDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN:
				if (resolve) return getEntidadAtributoDerivadoOrigen();
				return basicGetEntidadAtributoDerivadoOrigen();
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO:
				if (resolve) return getAtributoderivadoclaveprimariaDestino();
				return basicGetAtributoderivadoclaveprimariaDestino();
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO:
				if (resolve) return getAtributoderivadoDestino();
				return basicGetAtributoderivadoDestino();
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
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN:
				setEntidadAtributoDerivadoOrigen((Entidad)newValue);
				return;
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO:
				setAtributoderivadoclaveprimariaDestino((AtributoDerivadoClavePrimaria)newValue);
				return;
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO:
				setAtributoderivadoDestino((AtributoDerivado)newValue);
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
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN:
				setEntidadAtributoDerivadoOrigen((Entidad)null);
				return;
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO:
				setAtributoderivadoclaveprimariaDestino((AtributoDerivadoClavePrimaria)null);
				return;
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO:
				setAtributoderivadoDestino((AtributoDerivado)null);
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
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN:
				return entidadAtributoDerivadoOrigen != null;
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO:
				return atributoderivadoclaveprimariaDestino != null;
			case ModeloERPackage.ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO:
				return atributoderivadoDestino != null;
		}
		return super.eIsSet(featureID);
	}

} //AtributoDerivadoEntidadImpl
