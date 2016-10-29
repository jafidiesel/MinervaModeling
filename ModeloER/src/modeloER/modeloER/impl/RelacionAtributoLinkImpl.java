/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.ModeloERPackage;
import modeloER.modeloER.Relacion;
import modeloER.modeloER.RelacionAtributoLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion Atributo Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.RelacionAtributoLinkImpl#getRelacionAtributoOrigen <em>Relacion Atributo Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.RelacionAtributoLinkImpl#getRelacionAtributoDestino <em>Relacion Atributo Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionAtributoLinkImpl extends MinimalEObjectImpl.Container implements RelacionAtributoLink {
	/**
	 * The cached value of the '{@link #getRelacionAtributoOrigen() <em>Relacion Atributo Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionAtributoOrigen()
	 * @generated
	 * @ordered
	 */
	protected Relacion relacionAtributoOrigen;

	/**
	 * The cached value of the '{@link #getRelacionAtributoDestino() <em>Relacion Atributo Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionAtributoDestino()
	 * @generated
	 * @ordered
	 */
	protected Atributo relacionAtributoDestino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionAtributoLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.RELACION_ATRIBUTO_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion getRelacionAtributoOrigen() {
		if (relacionAtributoOrigen != null && relacionAtributoOrigen.eIsProxy()) {
			InternalEObject oldRelacionAtributoOrigen = (InternalEObject)relacionAtributoOrigen;
			relacionAtributoOrigen = (Relacion)eResolveProxy(oldRelacionAtributoOrigen);
			if (relacionAtributoOrigen != oldRelacionAtributoOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN, oldRelacionAtributoOrigen, relacionAtributoOrigen));
			}
		}
		return relacionAtributoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion basicGetRelacionAtributoOrigen() {
		return relacionAtributoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionAtributoOrigen(Relacion newRelacionAtributoOrigen) {
		Relacion oldRelacionAtributoOrigen = relacionAtributoOrigen;
		relacionAtributoOrigen = newRelacionAtributoOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN, oldRelacionAtributoOrigen, relacionAtributoOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo getRelacionAtributoDestino() {
		if (relacionAtributoDestino != null && relacionAtributoDestino.eIsProxy()) {
			InternalEObject oldRelacionAtributoDestino = (InternalEObject)relacionAtributoDestino;
			relacionAtributoDestino = (Atributo)eResolveProxy(oldRelacionAtributoDestino);
			if (relacionAtributoDestino != oldRelacionAtributoDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO, oldRelacionAtributoDestino, relacionAtributoDestino));
			}
		}
		return relacionAtributoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo basicGetRelacionAtributoDestino() {
		return relacionAtributoDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionAtributoDestino(Atributo newRelacionAtributoDestino) {
		Atributo oldRelacionAtributoDestino = relacionAtributoDestino;
		relacionAtributoDestino = newRelacionAtributoDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO, oldRelacionAtributoDestino, relacionAtributoDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN:
				if (resolve) return getRelacionAtributoOrigen();
				return basicGetRelacionAtributoOrigen();
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO:
				if (resolve) return getRelacionAtributoDestino();
				return basicGetRelacionAtributoDestino();
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
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN:
				setRelacionAtributoOrigen((Relacion)newValue);
				return;
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO:
				setRelacionAtributoDestino((Atributo)newValue);
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
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN:
				setRelacionAtributoOrigen((Relacion)null);
				return;
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO:
				setRelacionAtributoDestino((Atributo)null);
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
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN:
				return relacionAtributoOrigen != null;
			case ModeloERPackage.RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO:
				return relacionAtributoDestino != null;
		}
		return super.eIsSet(featureID);
	}

} //RelacionAtributoLinkImpl
