/**
 */
package modeloER;

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
 *   <li>{@link modeloER.Diagrama#getRelacionesDelDiagrama <em>Relaciones Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getAtributosDelDiagrama <em>Atributos Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getEntidadesDelDiagrama <em>Entidades Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getHerenciasDelDiagrama <em>Herencias Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getEntidadRelacionesDelDiagrama <em>Entidad Relaciones Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getAtributoderivadoDelDiagrama <em>Atributoderivado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getAtributomultivaluadoDelDiagrama <em>Atributomultivaluado Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getClaveprimariaDelDiagrama <em>Claveprimaria Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getClaveforaneaDelDiagrama <em>Claveforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getClaveprimariaforaneaDelDiagrama <em>Claveprimariaforanea Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getTipodebilDelDiagrama <em>Tipodebil Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getTipofuerteDelDiagrama <em>Tipofuerte Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getEntidadesRelacionesFuertesDelDiagrama <em>Entidades Relaciones Fuertes Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getEntidadesRelacionesDebilesDelDiagrama <em>Entidades Relaciones Debiles Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getAtributoderivadoclaveprimariaDelDiagrama <em>Atributoderivadoclaveprimaria Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getEntidadfuerteDelDiagrama <em>Entidadfuerte Del Diagrama</em>}</li>
 *   <li>{@link modeloER.Diagrama#getEntidaddebilDelDiagrama <em>Entidaddebil Del Diagrama</em>}</li>
 * </ul>
 *
 * @see modeloER.ModeloERPackage#getDiagrama()
 * @model
 * @generated
 */
public interface Diagrama extends EObject {
	/**
	 * Returns the value of the '<em><b>Relaciones Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.Relacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaciones Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaciones Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_RelacionesDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacion> getRelacionesDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributos Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_AtributosDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributosDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidades Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_EntidadesDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidadesDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Herencias Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.Herencia}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencias Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencias Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_HerenciasDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<Herencia> getHerenciasDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidad Relaciones Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.EntidadRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Relaciones Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Relaciones Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_EntidadRelacionesDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadRelacion> getEntidadRelacionesDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributoderivado Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.AtributoDerivado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivado Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivado Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_AtributoderivadoDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoDerivado> getAtributoderivadoDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributomultivaluado Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.AtributoMultivaluado}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributomultivaluado Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributomultivaluado Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_AtributomultivaluadoDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoMultivaluado> getAtributomultivaluadoDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Claveprimaria Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.ClavePrimaria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claveprimaria Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claveprimaria Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_ClaveprimariaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClavePrimaria> getClaveprimariaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Claveforanea Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.ClaveForanea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claveforanea Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claveforanea Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_ClaveforaneaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClaveForanea> getClaveforaneaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Claveprimariaforanea Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.ClavePrimariaForanea}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claveprimariaforanea Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claveprimariaforanea Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_ClaveprimariaforaneaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClavePrimariaForanea> getClaveprimariaforaneaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Tipodebil Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.TipoDebil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipodebil Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipodebil Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_TipodebilDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoDebil> getTipodebilDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Tipofuerte Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.TipoFuerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipofuerte Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipofuerte Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_TipofuerteDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<TipoFuerte> getTipofuerteDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidades Relaciones Fuertes Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.EntidadRelacionFuerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades Relaciones Fuertes Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades Relaciones Fuertes Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_EntidadesRelacionesFuertesDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadRelacionFuerte> getEntidadesRelacionesFuertesDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidades Relaciones Debiles Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.EntidadRelacionDebil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades Relaciones Debiles Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades Relaciones Debiles Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_EntidadesRelacionesDebilesDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadRelacionDebil> getEntidadesRelacionesDebilesDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Atributoderivadoclaveprimaria Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.AtributoDerivadoClavePrimaria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivadoclaveprimaria Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivadoclaveprimaria Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_AtributoderivadoclaveprimariaDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<AtributoDerivadoClavePrimaria> getAtributoderivadoclaveprimariaDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidadfuerte Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.EntidadFuerte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidadfuerte Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidadfuerte Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_EntidadfuerteDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadFuerte> getEntidadfuerteDelDiagrama();

	/**
	 * Returns the value of the '<em><b>Entidaddebil Del Diagrama</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.EntidadDebil}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidaddebil Del Diagrama</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidaddebil Del Diagrama</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getDiagrama_EntidaddebilDelDiagrama()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadDebil> getEntidaddebilDelDiagrama();

} // Diagrama
