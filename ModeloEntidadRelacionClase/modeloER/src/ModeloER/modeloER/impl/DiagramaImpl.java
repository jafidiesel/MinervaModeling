/**
 */
package ModeloER.modeloER.impl;

import ModeloER.modeloER.Atributo;
import ModeloER.modeloER.Diagrama;
import ModeloER.modeloER.Entidad;
import ModeloER.modeloER.EntidadRelacion;
import ModeloER.modeloER.ModeloERPackage;
import ModeloER.modeloER.Relacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ModeloER.modeloER.impl.DiagramaImpl#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link ModeloER.modeloER.impl.DiagramaImpl#getRelacion <em>Relacion</em>}</li>
 *   <li>{@link ModeloER.modeloER.impl.DiagramaImpl#getEntidadRelacion <em>Entidad Relacion</em>}</li>
 *   <li>{@link ModeloER.modeloER.impl.DiagramaImpl#getEntidad <em>Entidad</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaImpl extends MinimalEObjectImpl.Container implements Diagrama {
	/**
	 * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributo()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributo;

	/**
	 * The cached value of the '{@link #getRelacion() <em>Relacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacion()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relacion;

	/**
	 * The cached value of the '{@link #getEntidadRelacion() <em>Entidad Relacion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadRelacion()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadRelacion> entidadRelacion;

	/**
	 * The cached value of the '{@link #getEntidad() <em>Entidad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidad()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidad;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.DIAGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributo() {
		if (atributo == null) {
			atributo = new EObjectContainmentEList<Atributo>(Atributo.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTO);
		}
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relacion> getRelacion() {
		if (relacion == null) {
			relacion = new EObjectContainmentEList<Relacion>(Relacion.class, this, ModeloERPackage.DIAGRAMA__RELACION);
		}
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadRelacion> getEntidadRelacion() {
		if (entidadRelacion == null) {
			entidadRelacion = new EObjectContainmentEList<EntidadRelacion>(EntidadRelacion.class, this, ModeloERPackage.DIAGRAMA__ENTIDAD_RELACION);
		}
		return entidadRelacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidad() {
		if (entidad == null) {
			entidad = new EObjectContainmentEList<Entidad>(Entidad.class, this, ModeloERPackage.DIAGRAMA__ENTIDAD);
		}
		return entidad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloERPackage.DIAGRAMA__ATRIBUTO:
				return ((InternalEList<?>)getAtributo()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__RELACION:
				return ((InternalEList<?>)getRelacion()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACION:
				return ((InternalEList<?>)getEntidadRelacion()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDAD:
				return ((InternalEList<?>)getEntidad()).basicRemove(otherEnd, msgs);
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTO:
				return getAtributo();
			case ModeloERPackage.DIAGRAMA__RELACION:
				return getRelacion();
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACION:
				return getEntidadRelacion();
			case ModeloERPackage.DIAGRAMA__ENTIDAD:
				return getEntidad();
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTO:
				getAtributo().clear();
				getAtributo().addAll((Collection<? extends Atributo>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__RELACION:
				getRelacion().clear();
				getRelacion().addAll((Collection<? extends Relacion>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACION:
				getEntidadRelacion().clear();
				getEntidadRelacion().addAll((Collection<? extends EntidadRelacion>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDAD:
				getEntidad().clear();
				getEntidad().addAll((Collection<? extends Entidad>)newValue);
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTO:
				getAtributo().clear();
				return;
			case ModeloERPackage.DIAGRAMA__RELACION:
				getRelacion().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACION:
				getEntidadRelacion().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDAD:
				getEntidad().clear();
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTO:
				return atributo != null && !atributo.isEmpty();
			case ModeloERPackage.DIAGRAMA__RELACION:
				return relacion != null && !relacion.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACION:
				return entidadRelacion != null && !entidadRelacion.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDAD:
				return entidad != null && !entidad.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramaImpl
