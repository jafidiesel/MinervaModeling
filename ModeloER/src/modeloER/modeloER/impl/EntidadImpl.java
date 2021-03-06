/**
 */
package modeloER.modeloER.impl;

import java.util.Collection;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.Entidad;
import modeloER.modeloER.ModeloERPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.EntidadImpl#getAtributosEntidad <em>Atributos Entidad</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.EntidadImpl#getNombreEntidad <em>Nombre Entidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadImpl extends MinimalEObjectImpl.Container implements Entidad {
	/**
	 * The cached value of the '{@link #getAtributosEntidad() <em>Atributos Entidad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributosEntidad()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributosEntidad;

	/**
	 * The default value of the '{@link #getNombreEntidad() <em>Nombre Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEntidad()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_ENTIDAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreEntidad() <em>Nombre Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEntidad()
	 * @generated
	 * @ordered
	 */
	protected String nombreEntidad = NOMBRE_ENTIDAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.ENTIDAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributosEntidad() {
		if (atributosEntidad == null) {
			atributosEntidad = new EObjectContainmentEList<Atributo>(Atributo.class, this, ModeloERPackage.ENTIDAD__ATRIBUTOS_ENTIDAD);
		}
		return atributosEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreEntidad() {
		return nombreEntidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEntidad(String newNombreEntidad) {
		String oldNombreEntidad = nombreEntidad;
		nombreEntidad = newNombreEntidad;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ENTIDAD__NOMBRE_ENTIDAD, oldNombreEntidad, nombreEntidad));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloERPackage.ENTIDAD__ATRIBUTOS_ENTIDAD:
				return ((InternalEList<?>)getAtributosEntidad()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.ENTIDAD__ATRIBUTOS_ENTIDAD:
				return getAtributosEntidad();
			case ModeloERPackage.ENTIDAD__NOMBRE_ENTIDAD:
				return getNombreEntidad();
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
			case ModeloERPackage.ENTIDAD__ATRIBUTOS_ENTIDAD:
				getAtributosEntidad().clear();
				getAtributosEntidad().addAll((Collection<? extends Atributo>)newValue);
				return;
			case ModeloERPackage.ENTIDAD__NOMBRE_ENTIDAD:
				setNombreEntidad((String)newValue);
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
			case ModeloERPackage.ENTIDAD__ATRIBUTOS_ENTIDAD:
				getAtributosEntidad().clear();
				return;
			case ModeloERPackage.ENTIDAD__NOMBRE_ENTIDAD:
				setNombreEntidad(NOMBRE_ENTIDAD_EDEFAULT);
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
			case ModeloERPackage.ENTIDAD__ATRIBUTOS_ENTIDAD:
				return atributosEntidad != null && !atributosEntidad.isEmpty();
			case ModeloERPackage.ENTIDAD__NOMBRE_ENTIDAD:
				return NOMBRE_ENTIDAD_EDEFAULT == null ? nombreEntidad != null : !NOMBRE_ENTIDAD_EDEFAULT.equals(nombreEntidad);
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
		result.append(" (nombreEntidad: ");
		result.append(nombreEntidad);
		result.append(')');
		return result.toString();
	}

} //EntidadImpl
