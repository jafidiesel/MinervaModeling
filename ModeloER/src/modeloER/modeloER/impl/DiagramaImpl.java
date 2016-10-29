/**
 */
package modeloER.modeloER.impl;

import java.util.Collection;

import modeloER.modeloER.Atributo;
import modeloER.modeloER.AtributoCompuesto;
import modeloER.modeloER.AtributoDerivado;
import modeloER.modeloER.AtributoDerivadoClavePrimaria;
import modeloER.modeloER.AtributoDerivadoEntidad;
import modeloER.modeloER.AtributoEntidadLink;
import modeloER.modeloER.AtributoMultivaluado;
import modeloER.modeloER.AtributoSimple;
import modeloER.modeloER.ClaveForanea;
import modeloER.modeloER.ClavePrimaria;
import modeloER.modeloER.ClavePrimariaForanea;
import modeloER.modeloER.Diagrama;
import modeloER.modeloER.EntidadDebil;
import modeloER.modeloER.EntidadFuerte;
import modeloER.modeloER.EntidadRelacionDebil;
import modeloER.modeloER.EntidadRelacionFuerte;
import modeloER.modeloER.Herencia;
import modeloER.modeloER.LinkASAC;
import modeloER.modeloER.LinkHerenciaHijo;
import modeloER.modeloER.LinkHerenciaPadre;
import modeloER.modeloER.ModeloERPackage;
import modeloER.modeloER.RelacionAtributoLink;
import modeloER.modeloER.RelacionTipoDebil;
import modeloER.modeloER.RelacionTipoFuerte;

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
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributosDelDiagrama <em>Atributos Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getHerenciasDelDiagrama <em>Herencias Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributoderivadoDelDiagrama <em>Atributoderivado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributomultivaluadoDelDiagrama <em>Atributomultivaluado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getClaveprimariaDelDiagrama <em>Claveprimaria Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getClaveforaneaDelDiagrama <em>Claveforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getClaveprimariaforaneaDelDiagrama <em>Claveprimariaforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getRelacionesTipodebilDelDiagrama <em>Relaciones Tipodebil Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getRelacionesTipofuerteDelDiagrama <em>Relaciones Tipofuerte Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getEntidadesRelacionesFuertesDelDiagrama <em>Entidades Relaciones Fuertes Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getEntidadesRelacionesDebilesDelDiagrama <em>Entidades Relaciones Debiles Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributoderivadoclaveprimariaDelDiagrama <em>Atributoderivadoclaveprimaria Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getEntidadfuerteDelDiagrama <em>Entidadfuerte Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getEntidaddebilDelDiagrama <em>Entidaddebil Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributosimpleDelDiagrama <em>Atributosimple Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributocompuestoDelDiagrama <em>Atributocompuesto Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getLinkasacDelDiagrama <em>Linkasac Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributoderivadoentidadDelDiagrama <em>Atributoderivadoentidad Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributoentidadlinkDiagrama <em>Atributoentidadlink Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getAtributoderivadoentidadDiagrama <em>Atributoderivadoentidad Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getRelacionatributolinkDiagrama <em>Relacionatributolink Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getLinkherenciapadreDiagrama <em>Linkherenciapadre Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.impl.DiagramaImpl#getLinkherenciahijoDiagrama <em>Linkherenciahijo Diagrama</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagramaImpl extends MinimalEObjectImpl.Container implements Diagrama {
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
	 * The cached value of the '{@link #getHerenciasDelDiagrama() <em>Herencias Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHerenciasDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<Herencia> herenciasDelDiagrama;

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
	 * The cached value of the '{@link #getRelacionesTipodebilDelDiagrama() <em>Relaciones Tipodebil Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesTipodebilDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<RelacionTipoDebil> relacionesTipodebilDelDiagrama;

	/**
	 * The cached value of the '{@link #getRelacionesTipofuerteDelDiagrama() <em>Relaciones Tipofuerte Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionesTipofuerteDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<RelacionTipoFuerte> relacionesTipofuerteDelDiagrama;

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
	 * The cached value of the '{@link #getAtributoderivadoclaveprimariaDelDiagrama() <em>Atributoderivadoclaveprimaria Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoderivadoclaveprimariaDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoDerivadoClavePrimaria> atributoderivadoclaveprimariaDelDiagrama;

	/**
	 * The cached value of the '{@link #getEntidadfuerteDelDiagrama() <em>Entidadfuerte Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidadfuerteDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadFuerte> entidadfuerteDelDiagrama;

	/**
	 * The cached value of the '{@link #getEntidaddebilDelDiagrama() <em>Entidaddebil Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntidaddebilDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<EntidadDebil> entidaddebilDelDiagrama;

	/**
	 * The cached value of the '{@link #getAtributosimpleDelDiagrama() <em>Atributosimple Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributosimpleDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoSimple> atributosimpleDelDiagrama;

	/**
	 * The cached value of the '{@link #getAtributocompuestoDelDiagrama() <em>Atributocompuesto Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributocompuestoDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoCompuesto> atributocompuestoDelDiagrama;

	/**
	 * The cached value of the '{@link #getLinkasacDelDiagrama() <em>Linkasac Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkasacDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkASAC> linkasacDelDiagrama;

	/**
	 * The cached value of the '{@link #getAtributoderivadoentidadDelDiagrama() <em>Atributoderivadoentidad Del Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoderivadoentidadDelDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoDerivadoEntidad> atributoderivadoentidadDelDiagrama;

	/**
	 * The cached value of the '{@link #getAtributoentidadlinkDiagrama() <em>Atributoentidadlink Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoentidadlinkDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoEntidadLink> atributoentidadlinkDiagrama;

	/**
	 * The cached value of the '{@link #getAtributoderivadoentidadDiagrama() <em>Atributoderivadoentidad Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributoderivadoentidadDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<AtributoDerivadoEntidad> atributoderivadoentidadDiagrama;

	/**
	 * The cached value of the '{@link #getRelacionatributolinkDiagrama() <em>Relacionatributolink Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacionatributolinkDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<RelacionAtributoLink> relacionatributolinkDiagrama;

	/**
	 * The cached value of the '{@link #getLinkherenciapadreDiagrama() <em>Linkherenciapadre Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkherenciapadreDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkHerenciaPadre> linkherenciapadreDiagrama;

	/**
	 * The cached value of the '{@link #getLinkherenciahijoDiagrama() <em>Linkherenciahijo Diagrama</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkherenciahijoDiagrama()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkHerenciaHijo> linkherenciahijoDiagrama;

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
	public EList<RelacionTipoDebil> getRelacionesTipodebilDelDiagrama() {
		if (relacionesTipodebilDelDiagrama == null) {
			relacionesTipodebilDelDiagrama = new EObjectContainmentEList<RelacionTipoDebil>(RelacionTipoDebil.class, this, ModeloERPackage.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA);
		}
		return relacionesTipodebilDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelacionTipoFuerte> getRelacionesTipofuerteDelDiagrama() {
		if (relacionesTipofuerteDelDiagrama == null) {
			relacionesTipofuerteDelDiagrama = new EObjectContainmentEList<RelacionTipoFuerte>(RelacionTipoFuerte.class, this, ModeloERPackage.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA);
		}
		return relacionesTipofuerteDelDiagrama;
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
	public EList<AtributoDerivadoClavePrimaria> getAtributoderivadoclaveprimariaDelDiagrama() {
		if (atributoderivadoclaveprimariaDelDiagrama == null) {
			atributoderivadoclaveprimariaDelDiagrama = new EObjectContainmentEList<AtributoDerivadoClavePrimaria>(AtributoDerivadoClavePrimaria.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA);
		}
		return atributoderivadoclaveprimariaDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadFuerte> getEntidadfuerteDelDiagrama() {
		if (entidadfuerteDelDiagrama == null) {
			entidadfuerteDelDiagrama = new EObjectContainmentEList<EntidadFuerte>(EntidadFuerte.class, this, ModeloERPackage.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA);
		}
		return entidadfuerteDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntidadDebil> getEntidaddebilDelDiagrama() {
		if (entidaddebilDelDiagrama == null) {
			entidaddebilDelDiagrama = new EObjectContainmentEList<EntidadDebil>(EntidadDebil.class, this, ModeloERPackage.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA);
		}
		return entidaddebilDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoSimple> getAtributosimpleDelDiagrama() {
		if (atributosimpleDelDiagrama == null) {
			atributosimpleDelDiagrama = new EObjectContainmentEList<AtributoSimple>(AtributoSimple.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA);
		}
		return atributosimpleDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoCompuesto> getAtributocompuestoDelDiagrama() {
		if (atributocompuestoDelDiagrama == null) {
			atributocompuestoDelDiagrama = new EObjectContainmentEList<AtributoCompuesto>(AtributoCompuesto.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA);
		}
		return atributocompuestoDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkASAC> getLinkasacDelDiagrama() {
		if (linkasacDelDiagrama == null) {
			linkasacDelDiagrama = new EObjectContainmentEList<LinkASAC>(LinkASAC.class, this, ModeloERPackage.DIAGRAMA__LINKASAC_DEL_DIAGRAMA);
		}
		return linkasacDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoDerivadoEntidad> getAtributoderivadoentidadDelDiagrama() {
		if (atributoderivadoentidadDelDiagrama == null) {
			atributoderivadoentidadDelDiagrama = new EObjectContainmentEList<AtributoDerivadoEntidad>(AtributoDerivadoEntidad.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA);
		}
		return atributoderivadoentidadDelDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoEntidadLink> getAtributoentidadlinkDiagrama() {
		if (atributoentidadlinkDiagrama == null) {
			atributoentidadlinkDiagrama = new EObjectContainmentEList<AtributoEntidadLink>(AtributoEntidadLink.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA);
		}
		return atributoentidadlinkDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AtributoDerivadoEntidad> getAtributoderivadoentidadDiagrama() {
		if (atributoderivadoentidadDiagrama == null) {
			atributoderivadoentidadDiagrama = new EObjectContainmentEList<AtributoDerivadoEntidad>(AtributoDerivadoEntidad.class, this, ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA);
		}
		return atributoderivadoentidadDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelacionAtributoLink> getRelacionatributolinkDiagrama() {
		if (relacionatributolinkDiagrama == null) {
			relacionatributolinkDiagrama = new EObjectContainmentEList<RelacionAtributoLink>(RelacionAtributoLink.class, this, ModeloERPackage.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA);
		}
		return relacionatributolinkDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkHerenciaPadre> getLinkherenciapadreDiagrama() {
		if (linkherenciapadreDiagrama == null) {
			linkherenciapadreDiagrama = new EObjectContainmentEList<LinkHerenciaPadre>(LinkHerenciaPadre.class, this, ModeloERPackage.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA);
		}
		return linkherenciapadreDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkHerenciaHijo> getLinkherenciahijoDiagrama() {
		if (linkherenciahijoDiagrama == null) {
			linkherenciahijoDiagrama = new EObjectContainmentEList<LinkHerenciaHijo>(LinkHerenciaHijo.class, this, ModeloERPackage.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA);
		}
		return linkherenciahijoDiagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributosDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				return ((InternalEList<?>)getHerenciasDelDiagrama()).basicRemove(otherEnd, msgs);
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA:
				return ((InternalEList<?>)getRelacionesTipodebilDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA:
				return ((InternalEList<?>)getRelacionesTipofuerteDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidadesRelacionesFuertesDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidadesRelacionesDebilesDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributoderivadoclaveprimariaDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidadfuerteDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA:
				return ((InternalEList<?>)getEntidaddebilDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributosimpleDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributocompuestoDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__LINKASAC_DEL_DIAGRAMA:
				return ((InternalEList<?>)getLinkasacDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA:
				return ((InternalEList<?>)getAtributoderivadoentidadDelDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA:
				return ((InternalEList<?>)getAtributoentidadlinkDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA:
				return ((InternalEList<?>)getAtributoderivadoentidadDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA:
				return ((InternalEList<?>)getRelacionatributolinkDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA:
				return ((InternalEList<?>)getLinkherenciapadreDiagrama()).basicRemove(otherEnd, msgs);
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA:
				return ((InternalEList<?>)getLinkherenciahijoDiagrama()).basicRemove(otherEnd, msgs);
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				return getAtributosDelDiagrama();
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				return getHerenciasDelDiagrama();
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA:
				return getRelacionesTipodebilDelDiagrama();
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA:
				return getRelacionesTipofuerteDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				return getEntidadesRelacionesFuertesDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				return getEntidadesRelacionesDebilesDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA:
				return getAtributoderivadoclaveprimariaDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA:
				return getEntidadfuerteDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA:
				return getEntidaddebilDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA:
				return getAtributosimpleDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA:
				return getAtributocompuestoDelDiagrama();
			case ModeloERPackage.DIAGRAMA__LINKASAC_DEL_DIAGRAMA:
				return getLinkasacDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA:
				return getAtributoderivadoentidadDelDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA:
				return getAtributoentidadlinkDiagrama();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA:
				return getAtributoderivadoentidadDiagrama();
			case ModeloERPackage.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA:
				return getRelacionatributolinkDiagrama();
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA:
				return getLinkherenciapadreDiagrama();
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA:
				return getLinkherenciahijoDiagrama();
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				getAtributosDelDiagrama().clear();
				getAtributosDelDiagrama().addAll((Collection<? extends Atributo>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				getHerenciasDelDiagrama().clear();
				getHerenciasDelDiagrama().addAll((Collection<? extends Herencia>)newValue);
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA:
				getRelacionesTipodebilDelDiagrama().clear();
				getRelacionesTipodebilDelDiagrama().addAll((Collection<? extends RelacionTipoDebil>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA:
				getRelacionesTipofuerteDelDiagrama().clear();
				getRelacionesTipofuerteDelDiagrama().addAll((Collection<? extends RelacionTipoFuerte>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				getEntidadesRelacionesFuertesDelDiagrama().clear();
				getEntidadesRelacionesFuertesDelDiagrama().addAll((Collection<? extends EntidadRelacionFuerte>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				getEntidadesRelacionesDebilesDelDiagrama().clear();
				getEntidadesRelacionesDebilesDelDiagrama().addAll((Collection<? extends EntidadRelacionDebil>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA:
				getAtributoderivadoclaveprimariaDelDiagrama().clear();
				getAtributoderivadoclaveprimariaDelDiagrama().addAll((Collection<? extends AtributoDerivadoClavePrimaria>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA:
				getEntidadfuerteDelDiagrama().clear();
				getEntidadfuerteDelDiagrama().addAll((Collection<? extends EntidadFuerte>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA:
				getEntidaddebilDelDiagrama().clear();
				getEntidaddebilDelDiagrama().addAll((Collection<? extends EntidadDebil>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA:
				getAtributosimpleDelDiagrama().clear();
				getAtributosimpleDelDiagrama().addAll((Collection<? extends AtributoSimple>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA:
				getAtributocompuestoDelDiagrama().clear();
				getAtributocompuestoDelDiagrama().addAll((Collection<? extends AtributoCompuesto>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__LINKASAC_DEL_DIAGRAMA:
				getLinkasacDelDiagrama().clear();
				getLinkasacDelDiagrama().addAll((Collection<? extends LinkASAC>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA:
				getAtributoderivadoentidadDelDiagrama().clear();
				getAtributoderivadoentidadDelDiagrama().addAll((Collection<? extends AtributoDerivadoEntidad>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA:
				getAtributoentidadlinkDiagrama().clear();
				getAtributoentidadlinkDiagrama().addAll((Collection<? extends AtributoEntidadLink>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA:
				getAtributoderivadoentidadDiagrama().clear();
				getAtributoderivadoentidadDiagrama().addAll((Collection<? extends AtributoDerivadoEntidad>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA:
				getRelacionatributolinkDiagrama().clear();
				getRelacionatributolinkDiagrama().addAll((Collection<? extends RelacionAtributoLink>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA:
				getLinkherenciapadreDiagrama().clear();
				getLinkherenciapadreDiagrama().addAll((Collection<? extends LinkHerenciaPadre>)newValue);
				return;
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA:
				getLinkherenciahijoDiagrama().clear();
				getLinkherenciahijoDiagrama().addAll((Collection<? extends LinkHerenciaHijo>)newValue);
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				getAtributosDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				getHerenciasDelDiagrama().clear();
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA:
				getRelacionesTipodebilDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA:
				getRelacionesTipofuerteDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				getEntidadesRelacionesFuertesDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				getEntidadesRelacionesDebilesDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA:
				getAtributoderivadoclaveprimariaDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA:
				getEntidadfuerteDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA:
				getEntidaddebilDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA:
				getAtributosimpleDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA:
				getAtributocompuestoDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__LINKASAC_DEL_DIAGRAMA:
				getLinkasacDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA:
				getAtributoderivadoentidadDelDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA:
				getAtributoentidadlinkDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA:
				getAtributoderivadoentidadDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA:
				getRelacionatributolinkDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA:
				getLinkherenciapadreDiagrama().clear();
				return;
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA:
				getLinkherenciahijoDiagrama().clear();
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
			case ModeloERPackage.DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA:
				return atributosDelDiagrama != null && !atributosDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__HERENCIAS_DEL_DIAGRAMA:
				return herenciasDelDiagrama != null && !herenciasDelDiagrama.isEmpty();
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
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA:
				return relacionesTipodebilDelDiagrama != null && !relacionesTipodebilDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA:
				return relacionesTipofuerteDelDiagrama != null && !relacionesTipofuerteDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA:
				return entidadesRelacionesFuertesDelDiagrama != null && !entidadesRelacionesFuertesDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA:
				return entidadesRelacionesDebilesDelDiagrama != null && !entidadesRelacionesDebilesDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA:
				return atributoderivadoclaveprimariaDelDiagrama != null && !atributoderivadoclaveprimariaDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA:
				return entidadfuerteDelDiagrama != null && !entidadfuerteDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA:
				return entidaddebilDelDiagrama != null && !entidaddebilDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA:
				return atributosimpleDelDiagrama != null && !atributosimpleDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA:
				return atributocompuestoDelDiagrama != null && !atributocompuestoDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__LINKASAC_DEL_DIAGRAMA:
				return linkasacDelDiagrama != null && !linkasacDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA:
				return atributoderivadoentidadDelDiagrama != null && !atributoderivadoentidadDelDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA:
				return atributoentidadlinkDiagrama != null && !atributoentidadlinkDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA:
				return atributoderivadoentidadDiagrama != null && !atributoderivadoentidadDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA:
				return relacionatributolinkDiagrama != null && !relacionatributolinkDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA:
				return linkherenciapadreDiagrama != null && !linkherenciapadreDiagrama.isEmpty();
			case ModeloERPackage.DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA:
				return linkherenciahijoDiagrama != null && !linkherenciahijoDiagrama.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramaImpl
