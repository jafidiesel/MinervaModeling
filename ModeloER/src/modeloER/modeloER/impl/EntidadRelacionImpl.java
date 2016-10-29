/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.Entidad;
import modeloER.modeloER.EntidadRelacion;
import modeloER.modeloER.ModeloERPackage;
import modeloER.modeloER.Relacion;

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
 *   <li>{@link modeloER.modeloER.impl.EntidadRelacionImpl#getEntidadERLink <em>Entidad ER Link</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.EntidadRelacionImpl#getRelacionERLink <em>Relacion ER Link</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.EntidadRelacionImpl#getLimiteInferiorER <em>Limite Inferior ER</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.EntidadRelacionImpl#getLimiteSuperiorER <em>Limite Superior ER</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadRelacionImpl extends MinimalEObjectImpl.Container implements EntidadRelacion {
	/**
	 * The cached value of the '{@link #getEntidadERLink() <em>Entidad ER Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadERLink()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidadERLink;

	/**
	 * The cached value of the '{@link #getRelacionERLink() <em>Relacion ER Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionERLink()
	 * @generated
	 * @ordered
	 */
	protected Relacion relacionERLink;

	/**
	 * The default value of the '{@link #getLimiteInferiorER() <em>Limite Inferior ER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteInferiorER()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMITE_INFERIOR_ER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimiteInferiorER() <em>Limite Inferior ER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteInferiorER()
	 * @generated
	 * @ordered
	 */
	protected String limiteInferiorER = LIMITE_INFERIOR_ER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimiteSuperiorER() <em>Limite Superior ER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteSuperiorER()
	 * @generated
	 * @ordered
	 */
	protected static final String LIMITE_SUPERIOR_ER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimiteSuperiorER() <em>Limite Superior ER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimiteSuperiorER()
	 * @generated
	 * @ordered
	 */
	protected String limiteSuperiorER = LIMITE_SUPERIOR_ER_EDEFAULT;

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
	public Entidad getEntidadERLink() {
		if (entidadERLink != null && entidadERLink.eIsProxy()) {
			InternalEObject oldEntidadERLink = (InternalEObject)entidadERLink;
			entidadERLink = (Entidad)eResolveProxy(oldEntidadERLink);
			if (entidadERLink != oldEntidadERLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ER_LINK, oldEntidadERLink, entidadERLink));
			}
		}
		return entidadERLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entidad basicGetEntidadERLink() {
		return entidadERLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntidadERLink(Entidad newEntidadERLink) {
		Entidad oldEntidadERLink = entidadERLink;
		entidadERLink = newEntidadERLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ER_LINK, oldEntidadERLink, entidadERLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion getRelacionERLink() {
		if (relacionERLink != null && relacionERLink.eIsProxy()) {
			InternalEObject oldRelacionERLink = (InternalEObject)relacionERLink;
			relacionERLink = (Relacion)eResolveProxy(oldRelacionERLink);
			if (relacionERLink != oldRelacionERLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.ENTIDAD_RELACION__RELACION_ER_LINK, oldRelacionERLink, relacionERLink));
			}
		}
		return relacionERLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relacion basicGetRelacionERLink() {
		return relacionERLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacionERLink(Relacion newRelacionERLink) {
		Relacion oldRelacionERLink = relacionERLink;
		relacionERLink = newRelacionERLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__RELACION_ER_LINK, oldRelacionERLink, relacionERLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimiteInferiorER() {
		return limiteInferiorER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteInferiorER(String newLimiteInferiorER) {
		String oldLimiteInferiorER = limiteInferiorER;
		limiteInferiorER = newLimiteInferiorER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR_ER, oldLimiteInferiorER, limiteInferiorER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLimiteSuperiorER() {
		return limiteSuperiorER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimiteSuperiorER(String newLimiteSuperiorER) {
		String oldLimiteSuperiorER = limiteSuperiorER;
		limiteSuperiorER = newLimiteSuperiorER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR_ER, oldLimiteSuperiorER, limiteSuperiorER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ER_LINK:
				if (resolve) return getEntidadERLink();
				return basicGetEntidadERLink();
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ER_LINK:
				if (resolve) return getRelacionERLink();
				return basicGetRelacionERLink();
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR_ER:
				return getLimiteInferiorER();
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR_ER:
				return getLimiteSuperiorER();
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
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ER_LINK:
				setEntidadERLink((Entidad)newValue);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ER_LINK:
				setRelacionERLink((Relacion)newValue);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR_ER:
				setLimiteInferiorER((String)newValue);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR_ER:
				setLimiteSuperiorER((String)newValue);
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
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ER_LINK:
				setEntidadERLink((Entidad)null);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ER_LINK:
				setRelacionERLink((Relacion)null);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR_ER:
				setLimiteInferiorER(LIMITE_INFERIOR_ER_EDEFAULT);
				return;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR_ER:
				setLimiteSuperiorER(LIMITE_SUPERIOR_ER_EDEFAULT);
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
			case ModeloERPackage.ENTIDAD_RELACION__ENTIDAD_ER_LINK:
				return entidadERLink != null;
			case ModeloERPackage.ENTIDAD_RELACION__RELACION_ER_LINK:
				return relacionERLink != null;
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_INFERIOR_ER:
				return LIMITE_INFERIOR_ER_EDEFAULT == null ? limiteInferiorER != null : !LIMITE_INFERIOR_ER_EDEFAULT.equals(limiteInferiorER);
			case ModeloERPackage.ENTIDAD_RELACION__LIMITE_SUPERIOR_ER:
				return LIMITE_SUPERIOR_ER_EDEFAULT == null ? limiteSuperiorER != null : !LIMITE_SUPERIOR_ER_EDEFAULT.equals(limiteSuperiorER);
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
		result.append(" (limiteInferiorER: ");
		result.append(limiteInferiorER);
		result.append(", limiteSuperiorER: ");
		result.append(limiteSuperiorER);
		result.append(')');
		return result.toString();
	}

} //EntidadRelacionImpl
