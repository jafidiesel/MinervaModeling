/**
 */
package modeloER.impl;

import java.util.Collection;

import modeloER.Atributo;
import modeloER.AtributoDerivado;
import modeloER.AtributoMultivaluado;
import modeloER.ClaveForanea;
import modeloER.ClavePrimaria;
import modeloER.ClavePrimariaForanea;
import modeloER.Diagrama;
import modeloER.Entidad;
import modeloER.EntidadRelacion;
import modeloER.EntidadRelacionDebil;
import modeloER.EntidadRelacionFuerte;
import modeloER.Herencia;
import modeloER.ModeloERPackage;
import modeloER.Relacion;
import modeloER.TipoDebil;
import modeloER.TipoFuerte;

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
 *   <li>{@link modeloER.impl.DiagramaImpl#getRelacionesDelDiagrama <em>Relaciones Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getAtributosDelDiagrama <em>Atributos Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getEntidadesDelDiagrama <em>Entidades Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getHerenciasDelDiagrama <em>Herencias Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getEntidadRelacionesDelDiagrama <em>Entidad Relaciones Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getAtributoderivadoDelDiagrama <em>Atributoderivado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getAtributomultivaluadoDelDiagrama <em>Atributomultivaluado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getClaveprimariaDelDiagrama <em>Claveprimaria Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getClaveforaneaDelDiagrama <em>Claveforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getClaveprimariaforaneaDelDiagrama <em>Claveprimariaforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getTipodebilDelDiagrama <em>Tipodebil Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getTipofuerteDelDiagrama <em>Tipofuerte Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getEntidadesRelacionesFuertesDelDiagrama <em>Entidades Relaciones Fuertes Del Diagrama</em>}</li>
 *   <li>{@link modeloER.impl.DiagramaImpl#getEntidadesRelacionesDebilesDelDiagrama <em>Entidades Relaciones Debiles Del Diagrama</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaImpl extends MinimalEObjectImpl.Container implements Diagrama {
	/**
	 * The cached value of the '{@link #getRelacionesDelDiagrama() <em>Relaciones Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Relacion> relacionesDelDiagrama;

	/**
	 * The cached value of the '{@link #getAtributosDelDiagrama() <em>Atributos Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributosDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributosDelDiagrama;

	/**
	 * The cached value of the '{@link #getEntidadesDelDiagrama() <em>Entidades Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadesDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Entidad> entidadesDelDiagrama;

	/**
	 * The cached value of the '{@link #getHerenciasDelDiagrama() <em>Herencias Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciasDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Herencia> herenciasDelDiagrama;

	/**
	 * The cached value of the '{@link #getEntidadRelacionesDelDiagrama() <em>Entidad Relaciones Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadRelacionesDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadRelacion> entidadRelacionesDelDiagrama;

	/**
	 * The cached value of the '{@link #getAtributoderivadoDelDiagrama() <em>Atributoderivado Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoderivadoDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoDerivado> atributoderivadoDelDiagrama;

	/**
	 * The cached value of the '{@link #getAtributomultivaluadoDelDiagrama() <em>Atributomultivaluado Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributomultivaluadoDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoMultivaluado> atributomultivaluadoDelDiagrama;

	/**
	 * The cached value of the '{@link #getClaveprimariaDelDiagrama() <em>Claveprimaria Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaveprimariaDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<ClavePrimaria> claveprimariaDelDiagrama;

	/**
	 * The cached value of the '{@link #getClaveforaneaDelDiagrama() <em>Claveforanea Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaveforaneaDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaveForanea> claveforaneaDelDiagrama;

	/**
	 * The cached value of the '{@link #getClaveprimariaforaneaDelDiagrama() <em>Claveprimariaforanea Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaveprimariaforaneaDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<ClavePrimariaForanea> claveprimariaforaneaDelDiagrama;

	/**
	 * The cached value of the '{@link #getTipodebilDelDiagrama() <em>Tipodebil Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipodebilDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoDebil> tipodebilDelDiagrama;

	/**
	 * The cached value of the '{@link #getTipofuerteDelDiagrama() <em>Tipofuerte Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipofuerteDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<TipoFuerte> tipofuerteDelDiagrama;

	/**
	 * The cached value of the '{@link #getEntidadesRelacionesFuertesDelDiagrama() <em>Entidades Relaciones Fuertes Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadesRelacionesFuertesDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadRelacionFuerte> entidadesRelacionesFuertesDelDiagrama;

	/**
	 * The cached value of the '{@link #getEntidadesRelacionesDebilesDelDiagrama() <em>Entidades Relaciones Debiles Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadesRelacionesDebilesDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadRelacionDebil> entidadesRelacionesDebilesDelDiagrama;

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
	public EList<Relacion> getRelacionesDelDiagrama() {
		if (relacionesDelDiagrama == null) {
			relacionesDelDiagrama = new EObjectContainmentEList<Relacion>(Relacion.class, this, ModeloERPackage.DIAGRAMA__RELACIONES_DEL_DIAGRAMA);
		}
		return relacionesDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributosDelDiagrama() {
		if (atributosDelDiagrama == null) {
			atributosDelDiagrama = new EObjectContainmentEList<Atributo>(Atributo.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA);
		}
		return atributosDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entidad> getEntidadesDelDiagrama() {
		if (entidadesDelDiagrama == null) {
			entidadesDelDiagrama = new EObjectContainmentEList<Entidad>(Entidad.class, this, ModeloERPackage.DIAGRAMA__ENTIDADES_DEL_DIAGRAMA);
		}
		return entidadesDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Herencia> getHerenciasDelDiagrama() {
		if (herenciasDelDiagrama == null) {
			herenciasDelDiagrama = new EObjectContainmentEList<Herencia>(Herencia.class, this, ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA);
		}
		return herenciasDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadRelacion> getEntidadRelacionesDelDiagrama() {
		if (entidadRelacionesDelDiagrama == null) {
			entidadRelacionesDelDiagrama = new EObjectContainmentEList<EntidadRelacion>(EntidadRelacion.class, this, ModeloERPackage.DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA);
		}
		return entidadRelacionesDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoDerivado> getAtributoderivadoDelDiagrama() {
		if (atributoderivadoDelDiagrama == null) {
			atributoderivadoDelDiagrama = new EObjectContainmentEList<AtributoDerivado>(AtributoDerivado.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA);
		}
		return atributoderivadoDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoMultivaluado> getAtributomultivaluadoDelDiagrama() {
		if (atributomultivaluadoDelDiagrama == null) {
			atributomultivaluadoDelDiagrama = new EObjectContainmentEList<AtributoMultivaluado>(AtributoMultivaluado.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA);
		}
		return atributomultivaluadoDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClavePrimaria> getClaveprimariaDelDiagrama() {
		if (claveprimariaDelDiagrama == null) {
			claveprimariaDelDiagrama = new EObjectContainmentEList<ClavePrimaria>(ClavePrimaria.class, this, ModeloERPackage.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA);
		}
		return claveprimariaDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaveForanea> getClaveforaneaDelDiagrama() {
		if (claveforaneaDelDiagrama == null) {
			claveforaneaDelDiagrama = new EObjectContainmentEList<ClaveForanea>(ClaveForanea.class, this, ModeloERPackage.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA);
		}
		return claveforaneaDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClavePrimariaForanea> getClaveprimariaforaneaDelDiagrama() {
		if (claveprimariaforaneaDelDiagrama == null) {
			claveprimariaforaneaDelDiagrama = new EObjectContainmentEList<ClavePrimariaForanea>(ClavePrimariaForanea.class, this, ModeloERPackage.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA);
		}
		return claveprimariaforaneaDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoDebil> getTipodebilDelDiagrama() {
		if (tipodebilDelDiagrama == null) {
			tipodebilDelDiagrama = new EObjectContainmentEList<TipoDebil>(TipoDebil.class, this, ModeloERPackage.DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA);
		}
		return tipodebilDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TipoFuerte> getTipofuerteDelDiagrama() {
		if (tipofuerteDelDiagrama == null) {
			tipofuerteDelDiagrama = new EObjectContainmentEList<TipoFuerte>(TipoFuerte.class, this, ModeloERPackage.DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA);
		}
		return tipofuerteDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadRelacionFuerte> getEntidadesRelacionesFuertesDelDiagrama() {
		if (entidadesRelacionesFuertesDelDiagrama == null) {
			entidadesRelacionesFuertesDelDiagrama = new EObjectContainmentEList<EntidadRelacionFuerte>(EntidadRelacionFuerte.class, this, ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA);
		}
		return entidadesRelacionesFuertesDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadRelacionDebil> getEntidadesRelacionesDebilesDelDiagrama() {
		if (entidadesRelacionesDebilesDelDiagrama == null) {
			entidadesRelacionesDebilesDelDiagrama = new EObjectContainmentEList<EntidadRelacionDebil>(EntidadRelacionDebil.class, this, ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA);
		}
		return entidadesRelacionesDebilesDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloERPackage.DIAGRAMA__RELACIONES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getRelacionesDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributosDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDADES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidadesDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				return ((InternalEList<?>)getHerenciasDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidadRelacionesDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributoderivadoDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributomultivaluadoDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA:
				return ((InternalEList<?>)getClaveprimariaDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA:
				return ((InternalEList<?>)getClaveforaneaDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA:
				return ((InternalEList<?>)getClaveprimariaforaneaDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA:
				return ((InternalEList<?>)getTipodebilDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA:
				return ((InternalEList<?>)getTipofuerteDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidadesRelacionesFuertesDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidadesRelacionesDebilesDelDiagrama()).basicRemove(otherEnd, msgs);
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_DEL_DIAGRAMA:
				return getRelacionesDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				return getAtributosDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_DEL_DIAGRAMA:
				return getEntidadesDelDiagrama();
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				return getHerenciasDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA:
				return getEntidadRelacionesDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA:
				return getAtributoderivadoDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA:
				return getAtributomultivaluadoDelDiagrama();
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA:
				return getClaveprimariaDelDiagrama();
			case ModeloERPackage.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA:
				return getClaveforaneaDelDiagrama();
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA:
				return getClaveprimariaforaneaDelDiagrama();
			case ModeloERPackage.DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA:
				return getTipodebilDelDiagrama();
			case ModeloERPackage.DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA:
				return getTipofuerteDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				return getEntidadesRelacionesFuertesDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				return getEntidadesRelacionesDebilesDelDiagrama();
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_DEL_DIAGRAMA:
				getRelacionesDelDiagrama().clear();
				getRelacionesDelDiagrama().addAll((Collection<? extends Relacion>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				getAtributosDelDiagrama().clear();
				getAtributosDelDiagrama().addAll((Collection<? extends Atributo>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_DEL_DIAGRAMA:
				getEntidadesDelDiagrama().clear();
				getEntidadesDelDiagrama().addAll((Collection<? extends Entidad>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				getHerenciasDelDiagrama().clear();
				getHerenciasDelDiagrama().addAll((Collection<? extends Herencia>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA:
				getEntidadRelacionesDelDiagrama().clear();
				getEntidadRelacionesDelDiagrama().addAll((Collection<? extends EntidadRelacion>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA:
				getAtributoderivadoDelDiagrama().clear();
				getAtributoderivadoDelDiagrama().addAll((Collection<? extends AtributoDerivado>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA:
				getAtributomultivaluadoDelDiagrama().clear();
				getAtributomultivaluadoDelDiagrama().addAll((Collection<? extends AtributoMultivaluado>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA:
				getClaveprimariaDelDiagrama().clear();
				getClaveprimariaDelDiagrama().addAll((Collection<? extends ClavePrimaria>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA:
				getClaveforaneaDelDiagrama().clear();
				getClaveforaneaDelDiagrama().addAll((Collection<? extends ClaveForanea>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA:
				getClaveprimariaforaneaDelDiagrama().clear();
				getClaveprimariaforaneaDelDiagrama().addAll((Collection<? extends ClavePrimariaForanea>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA:
				getTipodebilDelDiagrama().clear();
				getTipodebilDelDiagrama().addAll((Collection<? extends TipoDebil>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA:
				getTipofuerteDelDiagrama().clear();
				getTipofuerteDelDiagrama().addAll((Collection<? extends TipoFuerte>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				getEntidadesRelacionesFuertesDelDiagrama().clear();
				getEntidadesRelacionesFuertesDelDiagrama().addAll((Collection<? extends EntidadRelacionFuerte>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				getEntidadesRelacionesDebilesDelDiagrama().clear();
				getEntidadesRelacionesDebilesDelDiagrama().addAll((Collection<? extends EntidadRelacionDebil>)newValue);
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_DEL_DIAGRAMA:
				getRelacionesDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				getAtributosDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_DEL_DIAGRAMA:
				getEntidadesDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				getHerenciasDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA:
				getEntidadRelacionesDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA:
				getAtributoderivadoDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA:
				getAtributomultivaluadoDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA:
				getClaveprimariaDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA:
				getClaveforaneaDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA:
				getClaveprimariaforaneaDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA:
				getTipodebilDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA:
				getTipofuerteDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				getEntidadesRelacionesFuertesDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				getEntidadesRelacionesDebilesDelDiagrama().clear();
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_DEL_DIAGRAMA:
				return relacionesDelDiagrama != null && !relacionesDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				return atributosDelDiagrama != null && !atributosDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_DEL_DIAGRAMA:
				return entidadesDelDiagrama != null && !entidadesDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				return herenciasDelDiagrama != null && !herenciasDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA:
				return entidadRelacionesDelDiagrama != null && !entidadRelacionesDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA:
				return atributoderivadoDelDiagrama != null && !atributoderivadoDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA:
				return atributomultivaluadoDelDiagrama != null && !atributomultivaluadoDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA:
				return claveprimariaDelDiagrama != null && !claveprimariaDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA:
				return claveforaneaDelDiagrama != null && !claveforaneaDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA:
				return claveprimariaforaneaDelDiagrama != null && !claveprimariaforaneaDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA:
				return tipodebilDelDiagrama != null && !tipodebilDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA:
				return tipofuerteDelDiagrama != null && !tipofuerteDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				return entidadesRelacionesFuertesDelDiagrama != null && !entidadesRelacionesFuertesDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				return entidadesRelacionesDebilesDelDiagrama != null && !entidadesRelacionesDebilesDelDiagrama.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramaImpl
