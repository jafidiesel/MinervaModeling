/**
 */
package modeloER.modeloER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributosDelDiagrama <em>Atributos Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getHerenciasDelDiagrama <em>Herencias Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributoderivadoDelDiagrama <em>Atributoderivado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributomultivaluadoDelDiagrama <em>Atributomultivaluado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getClaveprimariaDelDiagrama <em>Claveprimaria Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getClaveforaneaDelDiagrama <em>Claveforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getClaveprimariaforaneaDelDiagrama <em>Claveprimariaforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getRelacionesTipodebilDelDiagrama <em>Relaciones Tipodebil Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getRelacionesTipofuerteDelDiagrama <em>Relaciones Tipofuerte Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getEntidadesRelacionesFuertesDelDiagrama <em>Entidades Relaciones Fuertes Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getEntidadesRelacionesDebilesDelDiagrama <em>Entidades Relaciones Debiles Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributoderivadoclaveprimariaDelDiagrama <em>Atributoderivadoclaveprimaria Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getEntidadfuerteDelDiagrama <em>Entidadfuerte Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getEntidaddebilDelDiagrama <em>Entidaddebil Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributosimpleDelDiagrama <em>Atributosimple Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributocompuestoDelDiagrama <em>Atributocompuesto Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getLinkasacDelDiagrama <em>Linkasac Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributoderivadoentidadDelDiagrama <em>Atributoderivadoentidad Del Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributoentidadlinkDiagrama <em>Atributoentidadlink Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getAtributoderivadoentidadDiagrama <em>Atributoderivadoentidad Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getRelacionatributolinkDiagrama <em>Relacionatributolink Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getLinkherenciapadreDiagrama <em>Linkherenciapadre Diagrama</em>}</li>
 *   <li>{@link modeloER.modeloER.Diagrama#getLinkherenciahijoDiagrama <em>Linkherenciahijo Diagrama</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getDiagrama()
 * @model
 * @generated
 */
public interface Diagrama extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributos Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributosDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributosDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Herencias Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_HerenciasDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Herencia> getHerenciasDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributoderivado Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoDerivado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivado Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivado Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributoderivadoDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoDerivado> getAtributoderivadoDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributomultivaluado Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoMultivaluado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributomultivaluado Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributomultivaluado Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributomultivaluadoDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoMultivaluado> getAtributomultivaluadoDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Claveprimaria Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.ClavePrimaria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claveprimaria Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claveprimaria Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_ClaveprimariaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClavePrimaria> getClaveprimariaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Claveforanea Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.ClaveForanea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claveforanea Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claveforanea Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_ClaveforaneaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaveForanea> getClaveforaneaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Claveprimariaforanea Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.ClavePrimariaForanea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claveprimariaforanea Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claveprimariaforanea Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_ClaveprimariaforaneaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClavePrimariaForanea> getClaveprimariaforaneaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Relaciones Tipodebil Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.RelacionTipoDebil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones Tipodebil Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones Tipodebil Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_RelacionesTipodebilDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelacionTipoDebil> getRelacionesTipodebilDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Relaciones Tipofuerte Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.RelacionTipoFuerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones Tipofuerte Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones Tipofuerte Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_RelacionesTipofuerteDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelacionTipoFuerte> getRelacionesTipofuerteDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidades Relaciones Fuertes Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.EntidadRelacionFuerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades Relaciones Fuertes Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades Relaciones Fuertes Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_EntidadesRelacionesFuertesDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadRelacionFuerte> getEntidadesRelacionesFuertesDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidades Relaciones Debiles Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.EntidadRelacionDebil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades Relaciones Debiles Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades Relaciones Debiles Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_EntidadesRelacionesDebilesDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadRelacionDebil> getEntidadesRelacionesDebilesDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributoderivadoclaveprimaria Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoDerivadoClavePrimaria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivadoclaveprimaria Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivadoclaveprimaria Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributoderivadoclaveprimariaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoDerivadoClavePrimaria> getAtributoderivadoclaveprimariaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidadfuerte Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.EntidadFuerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidadfuerte Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidadfuerte Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_EntidadfuerteDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadFuerte> getEntidadfuerteDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidaddebil Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.EntidadDebil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidaddebil Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidaddebil Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_EntidaddebilDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadDebil> getEntidaddebilDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributosimple Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoSimple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributosimple Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributosimple Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributosimpleDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoSimple> getAtributosimpleDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributocompuesto Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoCompuesto}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributocompuesto Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributocompuesto Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributocompuestoDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoCompuesto> getAtributocompuestoDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Linkasac Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.LinkASAC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkasac Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkasac Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_LinkasacDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkASAC> getLinkasacDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributoderivadoentidad Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoDerivadoEntidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivadoentidad Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivadoentidad Del Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributoderivadoentidadDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoDerivadoEntidad> getAtributoderivadoentidadDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributoentidadlink Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoEntidadLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoentidadlink Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoentidadlink Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributoentidadlinkDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoEntidadLink> getAtributoentidadlinkDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributoderivadoentidad Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.AtributoDerivadoEntidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivadoentidad Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivadoentidad Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_AtributoderivadoentidadDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoDerivadoEntidad> getAtributoderivadoentidadDiagrama();

	/**
	 * Returns the value of the '<em><b>Relacionatributolink Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.RelacionAtributoLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacionatributolink Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacionatributolink Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_RelacionatributolinkDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelacionAtributoLink> getRelacionatributolinkDiagrama();

	/**
	 * Returns the value of the '<em><b>Linkherenciapadre Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.LinkHerenciaPadre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkherenciapadre Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkherenciapadre Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_LinkherenciapadreDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkHerenciaPadre> getLinkherenciapadreDiagrama();

	/**
	 * Returns the value of the '<em><b>Linkherenciahijo Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.LinkHerenciaHijo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkherenciahijo Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkherenciahijo Diagrama</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getDiagrama_LinkherenciahijoDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkHerenciaHijo> getLinkherenciahijoDiagrama();

} // Diagrama
