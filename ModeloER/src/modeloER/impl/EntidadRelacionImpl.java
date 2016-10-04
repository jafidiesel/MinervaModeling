/**
 */
package modeloER.impl;

import modeloER.Entidad;
import modeloER.EntidadRelacion;
import modeloER.ModeloERPackage;
import modeloER.Relacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.impl.EntidadRelacionImpl#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}</li>
 *   <li>{@link modeloER.impl.EntidadRelacionImpl#getRelacionEntidadRelacion <em>Relacion Entidad Relacion</em>}</li>
 *   <li>{@link modeloER.impl.EntidadRelacionImpl#getLimiteInferior <em>Limite Inferior</em>}</li>
 *   <li>{@link modeloER.impl.EntidadRelacionImpl#getLimiteSuperior <em>Limite Superior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadRelacionImpl extends MinimalEObjectImpl.Container implements EntidadRelacion {
	/**
	 * The cached value of the '{@link #getEntidadEntidadRelacion() <em>Entidad Entidad Relacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadEntidadRelacion()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidadEntidadRelacion;

	/**
	 * The cached value of the '{@link #getRelacionEntidadRelacion() <em>Relacion Entidad Relacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionEntidadRelacion()
	 * @generated
	 * @ordered
	 */
	protected Relacion relacionEntidadRelacion;

	/**
	 * The default value of the '{@link #getLimiteInferior() <em>Limite Inferior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteInferior()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMITE_INFERIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimiteInferior() <em>Limite Inferior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteInferior()
	 * @generated
	 * @ordered
	 */
	protected String limiteInferior = LIMITE_INFERIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimiteSuperior() <em>Limite Superior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteSuperior()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMITE_SUPERIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimiteSuperior() <em>Limite Superior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteSuperior()
	 * @generated
	 * @ordered
	 */
	protected String limiteSuperior = LIMITE_SUPERIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadRelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.ENTIDAD_RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad getEntidadEntidadRelacion() {
		if (entidadEntidadRelacion != null && entidadEntidadRelacion.eIsProxy()) {
			InternalEObject oldEntidadEntidadRelacion = (InternalEObject)entidadEntidadRelacion;
			entidadEntidadRelacion = (Entidad)eResolveProxy(oldEntidadEntidadRelacion);
			if (entidadEntidadRelacion != oldEntidadEntidadRelacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION, oldEntidadEntidadRelacion, entidadEntidadRelacion));
			}
		}
		return entidadEntidadRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidadEntidadRelacion() {
		return entidadEntidadRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidadEntidadRelacion(Entidad newEntidadEntidadRelacion) {
		Entidad oldEntidadEntidadRelacion = entidadEntidadRelacion;
		entidadEntidadRelacion = newEntidadEntidadRelacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION, oldEntidadEntidadRelacion, entidadEntidadRelacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion getRelacionEntidadRelacion() {
		if (relacionEntidadRelacion != null && relacionEntidadRelacion.eIsProxy()) {
			InternalEObject oldRelacionEntidadRelacion = (InternalEObject)relacionEntidadRelacion;
			relacionEntidadRelacion = (Relacion)eResolveProxy(oldRelacionEntidadRelacion);
			if (relacionEntidadRelacion != oldRelacionEntidadRelacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION, oldRelacionEntidadRelacion, relacionEntidadRelacion));
			}
		}
		return relacionEntidadRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion basicGetRelacionEntidadRelacion() {
		return relacionEntidadRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionEntidadRelacion(Relacion newRelacionEntidadRelacion) {
		Relacion oldRelacionEntidadRelacion = relacionEntidadRelacion;
		relacionEntidadRelacion = newRelacionEntidadRelacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION, oldRelacionEntidadRelacion, relacionEntidadRelacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimiteInferior() {
		return limiteInferior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteInferior(String newLimiteInferior) {
		String oldLimiteInferior = limiteInferior;
		limiteInferior = newLimiteInferior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR, oldLimiteInferior, limiteInferior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimiteSuperior() {
		return limiteSuperior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteSuperior(String newLimiteSuperior) {
		String oldLimiteSuperior = limiteSuperior;
		limiteSuperior = newLimiteSuperior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR, oldLimiteSuperior, limiteSuperior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION:
				if (resolve) return getEntidadEntidadRelacion();
				return basicGetEntidadEntidadRelacion();
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION:
				if (resolve) return getRelacionEntidadRelacion();
				return basicGetRelacionEntidadRelacion();
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR:
				return getLimiteInferior();
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR:
				return getLimiteSuperior();
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
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION:
				setEntidadEntidadRelacion((Entidad)newValue);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION:
				setRelacionEntidadRelacion((Relacion)newValue);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR:
				setLimiteInferior((String)newValue);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR:
				setLimiteSuperior((String)newValue);
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
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION:
				setEntidadEntidadRelacion((Entidad)null);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION:
				setRelacionEntidadRelacion((Relacion)null);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR:
				setLimiteInferior(LIMITE_INFERIOR_EDEFAULT);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR:
				setLimiteSuperior(LIMITE_SUPERIOR_EDEFAULT);
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
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION:
				return entidadEntidadRelacion != null;
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION:
				return relacionEntidadRelacion != null;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR:
				return LIMITE_INFERIOR_EDEFAULT == null ? limiteInferior != null : !LIMITE_INFERIOR_EDEFAULT.equals(limiteInferior);
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR:
				return LIMITE_SUPERIOR_EDEFAULT == null ? limiteSuperior != null : !LIMITE_SUPERIOR_EDEFAULT.equals(limiteSuperior);
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
		result.append(" (limiteInferior: ");
		result.append(limiteInferior);
		result.append(", limiteSuperior: ");
		result.append(limiteSuperior);
		result.append(')');
		return result.toString();
	}

} //EntidadRelacionImpl
