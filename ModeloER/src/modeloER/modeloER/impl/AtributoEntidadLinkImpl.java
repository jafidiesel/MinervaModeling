/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.AtributoEntidadLink;
import modeloER.modeloER.Entidad;
import modeloER.modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo Entidad Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.AtributoEntidadLinkImpl#getEntidadAtributoLinkOrigen <em>Entidad Atributo Link Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.AtributoEntidadLinkImpl#getAtributoEntidadLinkDestino <em>Atributo Entidad Link Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoEntidadLinkImpl extends MinimalEObjectImpl.Container implements AtributoEntidadLink {
	/**
	 * The cached value of the '{@link #getEntidadAtributoLinkOrigen() <em>Entidad Atributo Link Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadAtributoLinkOrigen()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidadAtributoLinkOrigen;

	/**
	 * The cached value of the '{@link #getAtributoEntidadLinkDestino() <em>Atributo Entidad Link Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoEntidadLinkDestino()
	 * @generated
	 * @ordered
	 */
	protected Atributo atributoEntidadLinkDestino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoEntidadLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.ATRIBUTO_ENTIDAD_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntidadAtributoLinkOrigen() {
		if (entidadAtributoLinkOrigen != null && entidadAtributoLinkOrigen.eIsProxy()) {
			InternalEObject oldEntidadAtributoLinkOrigen = (InternalEObject)entidadAtributoLinkOrigen;
			entidadAtributoLinkOrigen = (Entidad)eResolveProxy(oldEntidadAtributoLinkOrigen);
			if (entidadAtributoLinkOrigen != oldEntidadAtributoLinkOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN, oldEntidadAtributoLinkOrigen, entidadAtributoLinkOrigen));
			}
		}
		return entidadAtributoLinkOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidadAtributoLinkOrigen() {
		return entidadAtributoLinkOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidadAtributoLinkOrigen(Entidad newEntidadAtributoLinkOrigen) {
		Entidad oldEntidadAtributoLinkOrigen = entidadAtributoLinkOrigen;
		entidadAtributoLinkOrigen = newEntidadAtributoLinkOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN, oldEntidadAtributoLinkOrigen, entidadAtributoLinkOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo getAtributoEntidadLinkDestino() {
		if (atributoEntidadLinkDestino != null && atributoEntidadLinkDestino.eIsProxy()) {
			InternalEObject oldAtributoEntidadLinkDestino = (InternalEObject)atributoEntidadLinkDestino;
			atributoEntidadLinkDestino = (Atributo)eResolveProxy(oldAtributoEntidadLinkDestino);
			if (atributoEntidadLinkDestino != oldAtributoEntidadLinkDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO, oldAtributoEntidadLinkDestino, atributoEntidadLinkDestino));
			}
		}
		return atributoEntidadLinkDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo basicGetAtributoEntidadLinkDestino() {
		return atributoEntidadLinkDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributoEntidadLinkDestino(Atributo newAtributoEntidadLinkDestino) {
		Atributo oldAtributoEntidadLinkDestino = atributoEntidadLinkDestino;
		atributoEntidadLinkDestino = newAtributoEntidadLinkDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO, oldAtributoEntidadLinkDestino, atributoEntidadLinkDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN:
				if (resolve) return getEntidadAtributoLinkOrigen();
				return basicGetEntidadAtributoLinkOrigen();
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO:
				if (resolve) return getAtributoEntidadLinkDestino();
				return basicGetAtributoEntidadLinkDestino();
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
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN:
				setEntidadAtributoLinkOrigen((Entidad)newValue);
				return;
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO:
				setAtributoEntidadLinkDestino((Atributo)newValue);
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
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN:
				setEntidadAtributoLinkOrigen((Entidad)null);
				return;
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO:
				setAtributoEntidadLinkDestino((Atributo)null);
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
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN:
				return entidadAtributoLinkOrigen != null;
			case ModeloERPackage.ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO:
				return atributoEntidadLinkDestino != null;
		}
		return super.eIsSet(featureID);
	}

} //AtributoEntidadLinkImpl
