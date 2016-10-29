/**
 */
package modeloER.modeloER.impl;

import java.util.Collection;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.ModeloERPackage;
import modeloER.modeloER.Relacion;

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
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.impl.RelacionImpl#getNombreRelacion <em>Nombre Relacion</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.RelacionImpl#getAtributosRelacion <em>Atributos Relacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
	/**
	 * The default value of the '{@link #getNombreRelacion() <em>Nombre Relacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRelacion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_RELACION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreRelacion() <em>Nombre Relacion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreRelacion()
	 * @generated
	 * @ordered
	 */
	protected String nombreRelacion = NOMBRE_RELACION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtributosRelacion() <em>Atributos Relacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributosRelacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributosRelacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreRelacion() {
		return nombreRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreRelacion(String newNombreRelacion) {
		String oldNombreRelacion = nombreRelacion;
		nombreRelacion = newNombreRelacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.RELACION__NOMBRE_RELACION, oldNombreRelacion, nombreRelacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributosRelacion() {
		if (atributosRelacion == null) {
			atributosRelacion = new EObjectContainmentEList<Atributo>(Atributo.class, this, ModeloERPackage.RELACION__ATRIBUTOS_RELACION);
		}
		return atributosRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				return ((InternalEList<?>)getAtributosRelacion()).basicRemove(otherEnd, msgs);
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
			case ModeloERPackage.RELACION__NOMBRE_RELACION:
				return getNombreRelacion();
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				return getAtributosRelacion();
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
			case ModeloERPackage.RELACION__NOMBRE_RELACION:
				setNombreRelacion((String)newValue);
				return;
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				getAtributosRelacion().clear();
				getAtributosRelacion().addAll((Collection<? extends Atributo>)newValue);
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
			case ModeloERPackage.RELACION__NOMBRE_RELACION:
				setNombreRelacion(NOMBRE_RELACION_EDEFAULT);
				return;
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				getAtributosRelacion().clear();
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
			case ModeloERPackage.RELACION__NOMBRE_RELACION:
				return NOMBRE_RELACION_EDEFAULT == null ? nombreRelacion != null : !NOMBRE_RELACION_EDEFAULT.equals(nombreRelacion);
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				return atributosRelacion != null && !atributosRelacion.isEmpty();
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
		result.append(" (nombreRelacion: ");
		result.append(nombreRelacion);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
