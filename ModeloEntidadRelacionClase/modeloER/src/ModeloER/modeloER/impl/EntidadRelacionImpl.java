/**
 */
package ModeloER.modeloER.impl;

import ModeloER.modeloER.Entidad;
import ModeloER.modeloER.EntidadRelacion;
import ModeloER.modeloER.ModeloERPackage;
import ModeloER.modeloER.Relacion;

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
 *   <li>{@link ModeloER.modeloER.impl.EntidadRelacionImpl#getRelacionEntidades <em>Relacion Entidades</em>}</li>
 *   <li>{@link ModeloER.modeloER.impl.EntidadRelacionImpl#getEntidadRelacionRelaciones <em>Entidad Relacion Relaciones</em>}</li>
 *   <li>{@link ModeloER.modeloER.impl.EntidadRelacionImpl#getLimiteInferior <em>Limite Inferior</em>}</li>
 *   <li>{@link ModeloER.modeloER.impl.EntidadRelacionImpl#getLimiteSuperior <em>Limite Superior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadRelacionImpl extends MinimalEObjectImpl.Container implements EntidadRelacion {
	/**
	 * The cached value of the '{@link #getRelacionEntidades() <em>Relacion Entidades</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionEntidades()
	 * @generated
	 * @ordered
	 */
	protected Entidad relacionEntidades;

	/**
	 * The cached value of the '{@link #getEntidadRelacionRelaciones() <em>Entidad Relacion Relaciones</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadRelacionRelaciones()
	 * @generated
	 * @ordered
	 */
	protected Relacion entidadRelacionRelaciones;

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
	public Entidad getRelacionEntidades() {
		if (relacionEntidades != null && relacionEntidades.eIsProxy()) {
			InternalEObject oldRelacionEntidades = (InternalEObject)relacionEntidades;
			relacionEntidades = (Entidad)eResolveProxy(oldRelacionEntidades);
			if (relacionEntidades != oldRelacionEntidades) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDADES, oldRelacionEntidades, relacionEntidades));
			}
		}
		return relacionEntidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetRelacionEntidades() {
		return relacionEntidades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionEntidades(Entidad newRelacionEntidades) {
		Entidad oldRelacionEntidades = relacionEntidades;
		relacionEntidades = newRelacionEntidades;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDADES, oldRelacionEntidades, relacionEntidades));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion getEntidadRelacionRelaciones() {
		if (entidadRelacionRelaciones != null && entidadRelacionRelaciones.eIsProxy()) {
			InternalEObject oldEntidadRelacionRelaciones = (InternalEObject)entidadRelacionRelaciones;
			entidadRelacionRelaciones = (Relacion)eResolveProxy(oldEntidadRelacionRelaciones);
			if (entidadRelacionRelaciones != oldEntidadRelacionRelaciones) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES, oldEntidadRelacionRelaciones, entidadRelacionRelaciones));
			}
		}
		return entidadRelacionRelaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion basicGetEntidadRelacionRelaciones() {
		return entidadRelacionRelaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidadRelacionRelaciones(Relacion newEntidadRelacionRelaciones) {
		Relacion oldEntidadRelacionRelaciones = entidadRelacionRelaciones;
		entidadRelacionRelaciones = newEntidadRelacionRelaciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES, oldEntidadRelacionRelaciones, entidadRelacionRelaciones));
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
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDADES:
				if (resolve) return getRelacionEntidades();
				return basicGetRelacionEntidades();
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES:
				if (resolve) return getEntidadRelacionRelaciones();
				return basicGetEntidadRelacionRelaciones();
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
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDADES:
				setRelacionEntidades((Entidad)newValue);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES:
				setEntidadRelacionRelaciones((Relacion)newValue);
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
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDADES:
				setRelacionEntidades((Entidad)null);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES:
				setEntidadRelacionRelaciones((Relacion)null);
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
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ENTIDADES:
				return relacionEntidades != null;
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES:
				return entidadRelacionRelaciones != null;
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
