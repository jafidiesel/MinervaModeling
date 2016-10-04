/**
 */
package modeloER.impl;

import java.util.Collection;

import modeloER.Atributo;
import modeloER.Entidad;
import modeloER.ModeloERPackage;
import modeloER.Relacion;

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
 *   <li>{@link modeloER.impl.RelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloER.impl.RelacionImpl#getAtributosRelacion <em>Atributos Relacion</em>}</li>
 *   <li>{@link modeloER.impl.RelacionImpl#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelacionImpl extends MinimalEObjectImpl.Container implements Relacion {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

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
	 * The cached value of the '{@link #getEntidadEntidadRelacion() <em>Entidad Entidad Relacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadEntidadRelacion()
	 * @generated
	 * @ordered
	 */
	protected Entidad entidadEntidadRelacion;

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
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.RELACION__NOMBRE, oldNombre, nombre));
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
	public Entidad getEntidadEntidadRelacion() {
		if (entidadEntidadRelacion != null && entidadEntidadRelacion.eIsProxy()) {
			InternalEObject oldEntidadEntidadRelacion = (InternalEObject)entidadEntidadRelacion;
			entidadEntidadRelacion = (Entidad)eResolveProxy(oldEntidadEntidadRelacion);
			if (entidadEntidadRelacion != oldEntidadEntidadRelacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModeloERPackage.RELACION__ENTIDAD_ENTIDAD_RELACION, oldEntidadEntidadRelacion, entidadEntidadRelacion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.RELACION__ENTIDAD_ENTIDAD_RELACION, oldEntidadEntidadRelacion, entidadEntidadRelacion));
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
			case ModeloERPackage.RELACION__NOMBRE:
				return getNombre();
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				return getAtributosRelacion();
			case ModeloERPackage.RELACION__ENTIDAD_ENTIDAD_RELACION:
				if (resolve) return getEntidadEntidadRelacion();
				return basicGetEntidadEntidadRelacion();
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
			case ModeloERPackage.RELACION__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				getAtributosRelacion().clear();
				getAtributosRelacion().addAll((Collection<? extends Atributo>)newValue);
				return;
			case ModeloERPackage.RELACION__ENTIDAD_ENTIDAD_RELACION:
				setEntidadEntidadRelacion((Entidad)newValue);
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
			case ModeloERPackage.RELACION__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				getAtributosRelacion().clear();
				return;
			case ModeloERPackage.RELACION__ENTIDAD_ENTIDAD_RELACION:
				setEntidadEntidadRelacion((Entidad)null);
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
			case ModeloERPackage.RELACION__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModeloERPackage.RELACION__ATRIBUTOS_RELACION:
				return atributosRelacion != null && !atributosRelacion.isEmpty();
			case ModeloERPackage.RELACION__ENTIDAD_ENTIDAD_RELACION:
				return entidadEntidadRelacion != null;
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //RelacionImpl
