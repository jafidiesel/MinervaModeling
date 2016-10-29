/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.AtributoCompuesto;
import modeloER.modeloER.AtributoSimple;
import modeloER.modeloER.LinkASAC;
import modeloER.modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link ASAC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.LinkASACImpl#getAtributocompuestoOrigen <em>Atributocompuesto Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.LinkASACImpl#getAtributosimpleDestino <em>Atributosimple Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkASACImpl extends MinimalEObjectImpl.Container implements LinkASAC {
	/**
	 * The cached value of the '{@link #getAtributocompuestoOrigen() <em>Atributocompuesto Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributocompuestoOrigen()
	 * @generated
	 * @ordered
	 */
	protected AtributoCompuesto atributocompuestoOrigen;
	/**
	 * The cached value of the '{@link #getAtributosimpleDestino() <em>Atributosimple Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributosimpleDestino()
	 * @generated
	 * @ordered
	 */
	protected AtributoSimple atributosimpleDestino;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkASACImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.LINK_ASAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoCompuesto getAtributocompuestoOrigen() {
		if (atributocompuestoOrigen != null && atributocompuestoOrigen.eIsProxy()) {
			InternalEObject oldAtributocompuestoOrigen = (InternalEObject)atributocompuestoOrigen;
			atributocompuestoOrigen = (AtributoCompuesto)eResolveProxy(oldAtributocompuestoOrigen);
			if (atributocompuestoOrigen != oldAtributocompuestoOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN, oldAtributocompuestoOrigen, atributocompuestoOrigen));
			}
		}
		return atributocompuestoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoCompuesto basicGetAtributocompuestoOrigen() {
		return atributocompuestoOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributocompuestoOrigen(AtributoCompuesto newAtributocompuestoOrigen) {
		AtributoCompuesto oldAtributocompuestoOrigen = atributocompuestoOrigen;
		atributocompuestoOrigen = newAtributocompuestoOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN, oldAtributocompuestoOrigen, atributocompuestoOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoSimple getAtributosimpleDestino() {
		if (atributosimpleDestino != null && atributosimpleDestino.eIsProxy()) {
			InternalEObject oldAtributosimpleDestino = (InternalEObject)atributosimpleDestino;
			atributosimpleDestino = (AtributoSimple)eResolveProxy(oldAtributosimpleDestino);
			if (atributosimpleDestino != oldAtributosimpleDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.LINK_ASAC__ATRIBUTOSIMPLE_DESTINO, oldAtributosimpleDestino, atributosimpleDestino));
			}
		}
		return atributosimpleDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoSimple basicGetAtributosimpleDestino() {
		return atributosimpleDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributosimpleDestino(AtributoSimple newAtributosimpleDestino) {
		AtributoSimple oldAtributosimpleDestino = atributosimpleDestino;
		atributosimpleDestino = newAtributosimpleDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.LINK_ASAC__ATRIBUTOSIMPLE_DESTINO, oldAtributosimpleDestino, atributosimpleDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN:
				if (resolve) return getAtributocompuestoOrigen();
				return basicGetAtributocompuestoOrigen();
			case ModeloERPackage.LINK_ASAC__ATRIBUTOSIMPLE_DESTINO:
				if (resolve) return getAtributosimpleDestino();
				return basicGetAtributosimpleDestino();
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
			case ModeloERPackage.LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN:
				setAtributocompuestoOrigen((AtributoCompuesto)newValue);
				return;
			case ModeloERPackage.LINK_ASAC__ATRIBUTOSIMPLE_DESTINO:
				setAtributosimpleDestino((AtributoSimple)newValue);
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
			case ModeloERPackage.LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN:
				setAtributocompuestoOrigen((AtributoCompuesto)null);
				return;
			case ModeloERPackage.LINK_ASAC__ATRIBUTOSIMPLE_DESTINO:
				setAtributosimpleDestino((AtributoSimple)null);
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
			case ModeloERPackage.LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN:
				return atributocompuestoOrigen != null;
			case ModeloERPackage.LINK_ASAC__ATRIBUTOSIMPLE_DESTINO:
				return atributosimpleDestino != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkASACImpl
