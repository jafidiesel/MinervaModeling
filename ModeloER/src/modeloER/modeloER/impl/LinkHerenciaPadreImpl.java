/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.Entidad;
import modeloER.modeloER.Herencia;
import modeloER.modeloER.LinkHerenciaPadre;
import modeloER.modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Herencia Padre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.LinkHerenciaPadreImpl#getLinkHerenciaPadreHerenciaDestino <em>Link Herencia Padre Herencia Destino</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.LinkHerenciaPadreImpl#getHerenciaPadreEntidadOrigen <em>Herencia Padre Entidad Origen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkHerenciaPadreImpl extends MinimalEObjectImpl.Container implements LinkHerenciaPadre {
	/**
	 * The cached value of the '{@link #getLinkHerenciaPadreHerenciaDestino() <em>Link Herencia Padre Herencia Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHerenciaPadreHerenciaDestino()
	 * @generated
	 * @ordered
	 */
	protected Herencia linkHerenciaPadreHerenciaDestino;

	/**
	 * The cached value of the '{@link #getHerenciaPadreEntidadOrigen() <em>Herencia Padre Entidad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciaPadreEntidadOrigen()
	 * @generated
	 * @ordered
	 */
	protected Entidad herenciaPadreEntidadOrigen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkHerenciaPadreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.LINK_HERENCIA_PADRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia getLinkHerenciaPadreHerenciaDestino() {
		if (linkHerenciaPadreHerenciaDestino != null && linkHerenciaPadreHerenciaDestino.eIsProxy()) {
			InternalEObject oldLinkHerenciaPadreHerenciaDestino = (InternalEObject)linkHerenciaPadreHerenciaDestino;
			linkHerenciaPadreHerenciaDestino = (Herencia)eResolveProxy(oldLinkHerenciaPadreHerenciaDestino);
			if (linkHerenciaPadreHerenciaDestino != oldLinkHerenciaPadreHerenciaDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO, oldLinkHerenciaPadreHerenciaDestino, linkHerenciaPadreHerenciaDestino));
			}
		}
		return linkHerenciaPadreHerenciaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia basicGetLinkHerenciaPadreHerenciaDestino() {
		return linkHerenciaPadreHerenciaDestino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkHerenciaPadreHerenciaDestino(Herencia newLinkHerenciaPadreHerenciaDestino) {
		Herencia oldLinkHerenciaPadreHerenciaDestino = linkHerenciaPadreHerenciaDestino;
		linkHerenciaPadreHerenciaDestino = newLinkHerenciaPadreHerenciaDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO, oldLinkHerenciaPadreHerenciaDestino, linkHerenciaPadreHerenciaDestino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getHerenciaPadreEntidadOrigen() {
		if (herenciaPadreEntidadOrigen != null && herenciaPadreEntidadOrigen.eIsProxy()) {
			InternalEObject oldHerenciaPadreEntidadOrigen = (InternalEObject)herenciaPadreEntidadOrigen;
			herenciaPadreEntidadOrigen = (Entidad)eResolveProxy(oldHerenciaPadreEntidadOrigen);
			if (herenciaPadreEntidadOrigen != oldHerenciaPadreEntidadOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN, oldHerenciaPadreEntidadOrigen, herenciaPadreEntidadOrigen));
			}
		}
		return herenciaPadreEntidadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetHerenciaPadreEntidadOrigen() {
		return herenciaPadreEntidadOrigen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHerenciaPadreEntidadOrigen(Entidad newHerenciaPadreEntidadOrigen) {
		Entidad oldHerenciaPadreEntidadOrigen = herenciaPadreEntidadOrigen;
		herenciaPadreEntidadOrigen = newHerenciaPadreEntidadOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN, oldHerenciaPadreEntidadOrigen, herenciaPadreEntidadOrigen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO:
				if (resolve) return getLinkHerenciaPadreHerenciaDestino();
				return basicGetLinkHerenciaPadreHerenciaDestino();
			case ModeloERPackage.LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN:
				if (resolve) return getHerenciaPadreEntidadOrigen();
				return basicGetHerenciaPadreEntidadOrigen();
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
			case ModeloERPackage.LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO:
				setLinkHerenciaPadreHerenciaDestino((Herencia)newValue);
				return;
			case ModeloERPackage.LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN:
				setHerenciaPadreEntidadOrigen((Entidad)newValue);
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
			case ModeloERPackage.LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO:
				setLinkHerenciaPadreHerenciaDestino((Herencia)null);
				return;
			case ModeloERPackage.LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN:
				setHerenciaPadreEntidadOrigen((Entidad)null);
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
			case ModeloERPackage.LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO:
				return linkHerenciaPadreHerenciaDestino != null;
			case ModeloERPackage.LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN:
				return herenciaPadreEntidadOrigen != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkHerenciaPadreImpl
