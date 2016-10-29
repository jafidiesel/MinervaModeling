/**
 */
package modeloER.modeloER.impl;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.ModeloERPackage;
import modeloER.modeloER.TipoDato;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.AtributoImpl#getNombreAtributo <em>Nombre Atributo</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.AtributoImpl#isNuloAtributo <em>Nulo Atributo</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.AtributoImpl#getTipoDatoAtributo <em>Tipo Dato Atributo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
	/**
	 * The default value of the '{@link #getNombreAtributo() <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ATRIBUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreAtributo() <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAtributo()
	 * @generated
	 * @ordered
	 */
	protected String nombreAtributo = NOMBRE_ATRIBUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #isNuloAtributo() <em>Nulo Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNuloAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULO_ATRIBUTO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNuloAtributo() <em>Nulo Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNuloAtributo()
	 * @generated
	 * @ordered
	 */
	protected boolean nuloAtributo = NULO_ATRIBUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDatoAtributo() <em>Tipo Dato Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDatoAtributo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_DATO_ATRIBUTO_EDEFAULT = TipoDato.VARCHAR;

	/**
	 * The cached value of the '{@link #getTipoDatoAtributo() <em>Tipo Dato Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDatoAtributo()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDatoAtributo = TIPO_DATO_ATRIBUTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreAtributo() {
		return nombreAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAtributo(String newNombreAtributo) {
		String oldNombreAtributo = nombreAtributo;
		nombreAtributo = newNombreAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__NOMBRE_ATRIBUTO, oldNombreAtributo, nombreAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNuloAtributo() {
		return nuloAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNuloAtributo(boolean newNuloAtributo) {
		boolean oldNuloAtributo = nuloAtributo;
		nuloAtributo = newNuloAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__NULO_ATRIBUTO, oldNuloAtributo, nuloAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDatoAtributo() {
		return tipoDatoAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDatoAtributo(TipoDato newTipoDatoAtributo) {
		TipoDato oldTipoDatoAtributo = tipoDatoAtributo;
		tipoDatoAtributo = newTipoDatoAtributo == null ? TIPO_DATO_ATRIBUTO_EDEFAULT : newTipoDatoAtributo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__TIPO_DATO_ATRIBUTO, oldTipoDatoAtributo, tipoDatoAtributo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				return getNombreAtributo();
			case ModeloERPackage.ATRIBUTO__NULO_ATRIBUTO:
				return isNuloAtributo();
			case ModeloERPackage.ATRIBUTO__TIPO_DATO_ATRIBUTO:
				return getTipoDatoAtributo();
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
			case ModeloERPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				setNombreAtributo((String)newValue);
				return;
			case ModeloERPackage.ATRIBUTO__NULO_ATRIBUTO:
				setNuloAtributo((Boolean)newValue);
				return;
			case ModeloERPackage.ATRIBUTO__TIPO_DATO_ATRIBUTO:
				setTipoDatoAtributo((TipoDato)newValue);
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
			case ModeloERPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				setNombreAtributo(NOMBRE_ATRIBUTO_EDEFAULT);
				return;
			case ModeloERPackage.ATRIBUTO__NULO_ATRIBUTO:
				setNuloAtributo(NULO_ATRIBUTO_EDEFAULT);
				return;
			case ModeloERPackage.ATRIBUTO__TIPO_DATO_ATRIBUTO:
				setTipoDatoAtributo(TIPO_DATO_ATRIBUTO_EDEFAULT);
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
			case ModeloERPackage.ATRIBUTO__NOMBRE_ATRIBUTO:
				return NOMBRE_ATRIBUTO_EDEFAULT == null ? nombreAtributo != null : !NOMBRE_ATRIBUTO_EDEFAULT.equals(nombreAtributo);
			case ModeloERPackage.ATRIBUTO__NULO_ATRIBUTO:
				return nuloAtributo != NULO_ATRIBUTO_EDEFAULT;
			case ModeloERPackage.ATRIBUTO__TIPO_DATO_ATRIBUTO:
				return tipoDatoAtributo != TIPO_DATO_ATRIBUTO_EDEFAULT;
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
		result.append(" (nombreAtributo: ");
		result.append(nombreAtributo);
		result.append(", nuloAtributo: ");
		result.append(nuloAtributo);
		result.append(", tipoDatoAtributo: ");
		result.append(tipoDatoAtributo);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
