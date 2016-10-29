/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modeloER.modeloER.ModeloERFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloERPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modeloER";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modeloER";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modeloER";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloERPackage eINSTANCE = modeloER.modeloER.impl.ModeloERPackageImpl.init();

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.EntidadImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 0;

	/**
	 * The feature id for the '<em><b>Atributos Entidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ATRIBUTOS_ENTIDAD = 0;

	/**
	 * The feature id for the '<em><b>Nombre Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NOMBRE_ENTIDAD = 1;

	/**
	 * The number of structural features of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE_ATRIBUTO = 0;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NULO_ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO_DATO_ATRIBUTO = 2;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.RelacionImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 2;

	/**
	 * The feature id for the '<em><b>Nombre Relacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NOMBRE_RELACION = 0;

	/**
	 * The feature id for the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ATRIBUTOS_RELACION = 1;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.DiagramaImpl <em>Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.DiagramaImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getDiagrama()
	 * @generated
	 */
	int DIAGRAMA = 3;

	/**
	 * The feature id for the '<em><b>Atributos Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Herencias Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__HERENCIAS_DEL_DIAGRAMA = 1;

	/**
	 * The feature id for the '<em><b>Atributoderivado Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA = 2;

	/**
	 * The feature id for the '<em><b>Atributomultivaluado Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA = 3;

	/**
	 * The feature id for the '<em><b>Claveprimaria Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA = 4;

	/**
	 * The feature id for the '<em><b>Claveforanea Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA = 5;

	/**
	 * The feature id for the '<em><b>Claveprimariaforanea Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA = 6;

	/**
	 * The feature id for the '<em><b>Relaciones Tipodebil Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA = 7;

	/**
	 * The feature id for the '<em><b>Relaciones Tipofuerte Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA = 8;

	/**
	 * The feature id for the '<em><b>Entidades Relaciones Fuertes Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA = 9;

	/**
	 * The feature id for the '<em><b>Entidades Relaciones Debiles Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA = 10;

	/**
	 * The feature id for the '<em><b>Atributoderivadoclaveprimaria Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA = 11;

	/**
	 * The feature id for the '<em><b>Entidadfuerte Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA = 12;

	/**
	 * The feature id for the '<em><b>Entidaddebil Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA = 13;

	/**
	 * The feature id for the '<em><b>Atributosimple Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA = 14;

	/**
	 * The feature id for the '<em><b>Atributocompuesto Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA = 15;

	/**
	 * The feature id for the '<em><b>Linkasac Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__LINKASAC_DEL_DIAGRAMA = 16;

	/**
	 * The feature id for the '<em><b>Atributoderivadoentidad Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA = 17;

	/**
	 * The feature id for the '<em><b>Atributoentidadlink Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA = 18;

	/**
	 * The feature id for the '<em><b>Atributoderivadoentidad Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA = 19;

	/**
	 * The feature id for the '<em><b>Relacionatributolink Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA = 20;

	/**
	 * The feature id for the '<em><b>Linkherenciapadre Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA = 21;

	/**
	 * The feature id for the '<em><b>Linkherenciahijo Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA = 22;

	/**
	 * The number of structural features of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.EntidadRelacionImpl <em>Entidad Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.EntidadRelacionImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacion()
	 * @generated
	 */
	int ENTIDAD_RELACION = 4;

	/**
	 * The feature id for the '<em><b>Entidad ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__ENTIDAD_ER_LINK = 0;

	/**
	 * The feature id for the '<em><b>Relacion ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__RELACION_ER_LINK = 1;

	/**
	 * The feature id for the '<em><b>Limite Inferior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__LIMITE_INFERIOR_ER = 2;

	/**
	 * The feature id for the '<em><b>Limite Superior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__LIMITE_SUPERIOR_ER = 3;

	/**
	 * The number of structural features of the '<em>Entidad Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entidad Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.HerenciaImpl <em>Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.HerenciaImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getHerencia()
	 * @generated
	 */
	int HERENCIA = 5;

	/**
	 * The number of structural features of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoDerivadoImpl <em>Atributo Derivado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoDerivadoImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoDerivado()
	 * @generated
	 */
	int ATRIBUTO_DERIVADO = 6;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Atributo Derivado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atributo Derivado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoMultivaluadoImpl <em>Atributo Multivaluado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoMultivaluadoImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoMultivaluado()
	 * @generated
	 */
	int ATRIBUTO_MULTIVALUADO = 7;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Atributo Multivaluado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atributo Multivaluado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.ClavePrimariaImpl <em>Clave Primaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.ClavePrimariaImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getClavePrimaria()
	 * @generated
	 */
	int CLAVE_PRIMARIA = 8;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Clave Primaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clave Primaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.ClaveForaneaImpl <em>Clave Foranea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.ClaveForaneaImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getClaveForanea()
	 * @generated
	 */
	int CLAVE_FORANEA = 9;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Clave Foranea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clave Foranea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.ClavePrimariaForaneaImpl <em>Clave Primaria Foranea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.ClavePrimariaForaneaImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getClavePrimariaForanea()
	 * @generated
	 */
	int CLAVE_PRIMARIA_FORANEA = 10;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Clave Primaria Foranea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clave Primaria Foranea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.RelacionTipoDebilImpl <em>Relacion Tipo Debil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.RelacionTipoDebilImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacionTipoDebil()
	 * @generated
	 */
	int RELACION_TIPO_DEBIL = 11;

	/**
	 * The feature id for the '<em><b>Nombre Relacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_DEBIL__NOMBRE_RELACION = RELACION__NOMBRE_RELACION;

	/**
	 * The feature id for the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_DEBIL__ATRIBUTOS_RELACION = RELACION__ATRIBUTOS_RELACION;

	/**
	 * The number of structural features of the '<em>Relacion Tipo Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_DEBIL_FEATURE_COUNT = RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relacion Tipo Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_DEBIL_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.RelacionTipoFuerteImpl <em>Relacion Tipo Fuerte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.RelacionTipoFuerteImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacionTipoFuerte()
	 * @generated
	 */
	int RELACION_TIPO_FUERTE = 12;

	/**
	 * The feature id for the '<em><b>Nombre Relacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_FUERTE__NOMBRE_RELACION = RELACION__NOMBRE_RELACION;

	/**
	 * The feature id for the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_FUERTE__ATRIBUTOS_RELACION = RELACION__ATRIBUTOS_RELACION;

	/**
	 * The number of structural features of the '<em>Relacion Tipo Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_FUERTE_FEATURE_COUNT = RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relacion Tipo Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_TIPO_FUERTE_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.EntidadRelacionDebilImpl <em>Entidad Relacion Debil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.EntidadRelacionDebilImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacionDebil()
	 * @generated
	 */
	int ENTIDAD_RELACION_DEBIL = 13;

	/**
	 * The feature id for the '<em><b>Entidad ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__ENTIDAD_ER_LINK = ENTIDAD_RELACION__ENTIDAD_ER_LINK;

	/**
	 * The feature id for the '<em><b>Relacion ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__RELACION_ER_LINK = ENTIDAD_RELACION__RELACION_ER_LINK;

	/**
	 * The feature id for the '<em><b>Limite Inferior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__LIMITE_INFERIOR_ER = ENTIDAD_RELACION__LIMITE_INFERIOR_ER;

	/**
	 * The feature id for the '<em><b>Limite Superior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__LIMITE_SUPERIOR_ER = ENTIDAD_RELACION__LIMITE_SUPERIOR_ER;

	/**
	 * The number of structural features of the '<em>Entidad Relacion Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL_FEATURE_COUNT = ENTIDAD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entidad Relacion Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL_OPERATION_COUNT = ENTIDAD_RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.EntidadRelacionFuerteImpl <em>Entidad Relacion Fuerte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.EntidadRelacionFuerteImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacionFuerte()
	 * @generated
	 */
	int ENTIDAD_RELACION_FUERTE = 14;

	/**
	 * The feature id for the '<em><b>Entidad ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__ENTIDAD_ER_LINK = ENTIDAD_RELACION__ENTIDAD_ER_LINK;

	/**
	 * The feature id for the '<em><b>Relacion ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__RELACION_ER_LINK = ENTIDAD_RELACION__RELACION_ER_LINK;

	/**
	 * The feature id for the '<em><b>Limite Inferior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__LIMITE_INFERIOR_ER = ENTIDAD_RELACION__LIMITE_INFERIOR_ER;

	/**
	 * The feature id for the '<em><b>Limite Superior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__LIMITE_SUPERIOR_ER = ENTIDAD_RELACION__LIMITE_SUPERIOR_ER;

	/**
	 * The number of structural features of the '<em>Entidad Relacion Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE_FEATURE_COUNT = ENTIDAD_RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entidad Relacion Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE_OPERATION_COUNT = ENTIDAD_RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoDerivadoClavePrimariaImpl <em>Atributo Derivado Clave Primaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoDerivadoClavePrimariaImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoDerivadoClavePrimaria()
	 * @generated
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA = 15;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Atributo Derivado Clave Primaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atributo Derivado Clave Primaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.EntidadFuerteImpl <em>Entidad Fuerte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.EntidadFuerteImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadFuerte()
	 * @generated
	 */
	int ENTIDAD_FUERTE = 16;

	/**
	 * The feature id for the '<em><b>Atributos Entidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FUERTE__ATRIBUTOS_ENTIDAD = ENTIDAD__ATRIBUTOS_ENTIDAD;

	/**
	 * The feature id for the '<em><b>Nombre Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FUERTE__NOMBRE_ENTIDAD = ENTIDAD__NOMBRE_ENTIDAD;

	/**
	 * The number of structural features of the '<em>Entidad Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FUERTE_FEATURE_COUNT = ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entidad Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FUERTE_OPERATION_COUNT = ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.EntidadDebilImpl <em>Entidad Debil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.EntidadDebilImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadDebil()
	 * @generated
	 */
	int ENTIDAD_DEBIL = 17;

	/**
	 * The feature id for the '<em><b>Atributos Entidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_DEBIL__ATRIBUTOS_ENTIDAD = ENTIDAD__ATRIBUTOS_ENTIDAD;

	/**
	 * The feature id for the '<em><b>Nombre Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_DEBIL__NOMBRE_ENTIDAD = ENTIDAD__NOMBRE_ENTIDAD;

	/**
	 * The number of structural features of the '<em>Entidad Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_DEBIL_FEATURE_COUNT = ENTIDAD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entidad Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_DEBIL_OPERATION_COUNT = ENTIDAD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoSimpleImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoSimple()
	 * @generated
	 */
	int ATRIBUTO_SIMPLE = 18;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Atributo Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atributo Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_SIMPLE_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoCompuestoImpl <em>Atributo Compuesto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoCompuestoImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoCompuesto()
	 * @generated
	 */
	int ATRIBUTO_COMPUESTO = 19;

	/**
	 * The feature id for the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO__NOMBRE_ATRIBUTO = ATRIBUTO__NOMBRE_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Nulo Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO__NULO_ATRIBUTO = ATRIBUTO__NULO_ATRIBUTO;

	/**
	 * The feature id for the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO__TIPO_DATO_ATRIBUTO = ATRIBUTO__TIPO_DATO_ATRIBUTO;

	/**
	 * The number of structural features of the '<em>Atributo Compuesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO_FEATURE_COUNT = ATRIBUTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atributo Compuesto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_COMPUESTO_OPERATION_COUNT = ATRIBUTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.LinkASACImpl <em>Link ASAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.LinkASACImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getLinkASAC()
	 * @generated
	 */
	int LINK_ASAC = 20;

	/**
	 * The feature id for the '<em><b>Atributocompuesto Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Atributosimple Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASAC__ATRIBUTOSIMPLE_DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Link ASAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASAC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link ASAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_ASAC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoEntidadLinkImpl <em>Atributo Entidad Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoEntidadLinkImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoEntidadLink()
	 * @generated
	 */
	int ATRIBUTO_ENTIDAD_LINK = 21;

	/**
	 * The feature id for the '<em><b>Entidad Atributo Link Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Atributo Entidad Link Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Atributo Entidad Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ENTIDAD_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Atributo Entidad Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_ENTIDAD_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.LinkHerenciaPadreImpl <em>Link Herencia Padre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.LinkHerenciaPadreImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getLinkHerenciaPadre()
	 * @generated
	 */
	int LINK_HERENCIA_PADRE = 22;

	/**
	 * The feature id for the '<em><b>Link Herencia Padre Herencia Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO = 0;

	/**
	 * The feature id for the '<em><b>Herencia Padre Entidad Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN = 1;

	/**
	 * The number of structural features of the '<em>Link Herencia Padre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_PADRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link Herencia Padre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_PADRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.LinkHerenciaHijoImpl <em>Link Herencia Hijo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.LinkHerenciaHijoImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getLinkHerenciaHijo()
	 * @generated
	 */
	int LINK_HERENCIA_HIJO = 23;

	/**
	 * The feature id for the '<em><b>Herencia Hijo Herencia Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO = 0;

	/**
	 * The feature id for the '<em><b>Herencia Hijo Entidad Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN = 1;

	/**
	 * The number of structural features of the '<em>Link Herencia Hijo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_HIJO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link Herencia Hijo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_HERENCIA_HIJO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.AtributoDerivadoEntidadImpl <em>Atributo Derivado Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.AtributoDerivadoEntidadImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoDerivadoEntidad()
	 * @generated
	 */
	int ATRIBUTO_DERIVADO_ENTIDAD = 24;

	/**
	 * The feature id for the '<em><b>Entidad Atributo Derivado Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Atributoderivadoclaveprimaria Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO = 1;

	/**
	 * The feature id for the '<em><b>Atributoderivado Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO = 2;

	/**
	 * The number of structural features of the '<em>Atributo Derivado Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_ENTIDAD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributo Derivado Entidad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_ENTIDAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.impl.RelacionAtributoLinkImpl <em>Relacion Atributo Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.impl.RelacionAtributoLinkImpl
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacionAtributoLink()
	 * @generated
	 */
	int RELACION_ATRIBUTO_LINK = 25;

	/**
	 * The feature id for the '<em><b>Relacion Atributo Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN = 0;

	/**
	 * The feature id for the '<em><b>Relacion Atributo Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO = 1;

	/**
	 * The number of structural features of the '<em>Relacion Atributo Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ATRIBUTO_LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relacion Atributo Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_ATRIBUTO_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.modeloER.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.modeloER.TipoDato
	 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 26;


	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see modeloER.modeloER.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Entidad#getAtributosEntidad <em>Atributos Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos Entidad</em>'.
	 * @see modeloER.modeloER.Entidad#getAtributosEntidad()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_AtributosEntidad();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.modeloER.Entidad#getNombreEntidad <em>Nombre Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Entidad</em>'.
	 * @see modeloER.modeloER.Entidad#getNombreEntidad()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_NombreEntidad();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see modeloER.modeloER.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.modeloER.Atributo#getNombreAtributo <em>Nombre Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Atributo</em>'.
	 * @see modeloER.modeloER.Atributo#getNombreAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_NombreAtributo();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.modeloER.Atributo#isNuloAtributo <em>Nulo Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nulo Atributo</em>'.
	 * @see modeloER.modeloER.Atributo#isNuloAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_NuloAtributo();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.modeloER.Atributo#getTipoDatoAtributo <em>Tipo Dato Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato Atributo</em>'.
	 * @see modeloER.modeloER.Atributo#getTipoDatoAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_TipoDatoAtributo();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see modeloER.modeloER.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.modeloER.Relacion#getNombreRelacion <em>Nombre Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Relacion</em>'.
	 * @see modeloER.modeloER.Relacion#getNombreRelacion()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_NombreRelacion();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Relacion#getAtributosRelacion <em>Atributos Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos Relacion</em>'.
	 * @see modeloER.modeloER.Relacion#getAtributosRelacion()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_AtributosRelacion();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama
	 * @generated
	 */
	EClass getDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributosDelDiagrama <em>Atributos Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributosDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributosDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getHerenciasDelDiagrama <em>Herencias Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getHerenciasDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_HerenciasDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributoderivadoDelDiagrama <em>Atributoderivado Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributoderivado Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributoderivadoDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributoderivadoDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributomultivaluadoDelDiagrama <em>Atributomultivaluado Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributomultivaluado Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributomultivaluadoDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributomultivaluadoDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getClaveprimariaDelDiagrama <em>Claveprimaria Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claveprimaria Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getClaveprimariaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_ClaveprimariaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getClaveforaneaDelDiagrama <em>Claveforanea Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claveforanea Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getClaveforaneaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_ClaveforaneaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getClaveprimariaforaneaDelDiagrama <em>Claveprimariaforanea Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claveprimariaforanea Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getClaveprimariaforaneaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_ClaveprimariaforaneaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getRelacionesTipodebilDelDiagrama <em>Relaciones Tipodebil Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones Tipodebil Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getRelacionesTipodebilDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_RelacionesTipodebilDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getRelacionesTipofuerteDelDiagrama <em>Relaciones Tipofuerte Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones Tipofuerte Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getRelacionesTipofuerteDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_RelacionesTipofuerteDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getEntidadesRelacionesFuertesDelDiagrama <em>Entidades Relaciones Fuertes Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades Relaciones Fuertes Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getEntidadesRelacionesFuertesDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadesRelacionesFuertesDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getEntidadesRelacionesDebilesDelDiagrama <em>Entidades Relaciones Debiles Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades Relaciones Debiles Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getEntidadesRelacionesDebilesDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadesRelacionesDebilesDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributoderivadoclaveprimariaDelDiagrama <em>Atributoderivadoclaveprimaria Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributoderivadoclaveprimaria Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributoderivadoclaveprimariaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributoderivadoclaveprimariaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getEntidadfuerteDelDiagrama <em>Entidadfuerte Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidadfuerte Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getEntidadfuerteDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadfuerteDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getEntidaddebilDelDiagrama <em>Entidaddebil Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidaddebil Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getEntidaddebilDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidaddebilDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributosimpleDelDiagrama <em>Atributosimple Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributosimple Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributosimpleDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributosimpleDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributocompuestoDelDiagrama <em>Atributocompuesto Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributocompuesto Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributocompuestoDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributocompuestoDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getLinkasacDelDiagrama <em>Linkasac Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkasac Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getLinkasacDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_LinkasacDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributoderivadoentidadDelDiagrama <em>Atributoderivadoentidad Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributoderivadoentidad Del Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributoderivadoentidadDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributoderivadoentidadDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributoentidadlinkDiagrama <em>Atributoentidadlink Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributoentidadlink Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributoentidadlinkDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributoentidadlinkDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getAtributoderivadoentidadDiagrama <em>Atributoderivadoentidad Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributoderivadoentidad Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getAtributoderivadoentidadDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributoderivadoentidadDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getRelacionatributolinkDiagrama <em>Relacionatributolink Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relacionatributolink Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getRelacionatributolinkDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_RelacionatributolinkDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getLinkherenciapadreDiagrama <em>Linkherenciapadre Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkherenciapadre Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getLinkherenciapadreDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_LinkherenciapadreDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.modeloER.Diagrama#getLinkherenciahijoDiagrama <em>Linkherenciahijo Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkherenciahijo Diagrama</em>'.
	 * @see modeloER.modeloER.Diagrama#getLinkherenciahijoDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_LinkherenciahijoDiagrama();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.EntidadRelacion <em>Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Relacion</em>'.
	 * @see modeloER.modeloER.EntidadRelacion
	 * @generated
	 */
	EClass getEntidadRelacion();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.EntidadRelacion#getEntidadERLink <em>Entidad ER Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad ER Link</em>'.
	 * @see modeloER.modeloER.EntidadRelacion#getEntidadERLink()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EReference getEntidadRelacion_EntidadERLink();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.EntidadRelacion#getRelacionERLink <em>Relacion ER Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion ER Link</em>'.
	 * @see modeloER.modeloER.EntidadRelacion#getRelacionERLink()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EReference getEntidadRelacion_RelacionERLink();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.modeloER.EntidadRelacion#getLimiteInferiorER <em>Limite Inferior ER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite Inferior ER</em>'.
	 * @see modeloER.modeloER.EntidadRelacion#getLimiteInferiorER()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EAttribute getEntidadRelacion_LimiteInferiorER();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.modeloER.EntidadRelacion#getLimiteSuperiorER <em>Limite Superior ER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite Superior ER</em>'.
	 * @see modeloER.modeloER.EntidadRelacion#getLimiteSuperiorER()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EAttribute getEntidadRelacion_LimiteSuperiorER();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia</em>'.
	 * @see modeloER.modeloER.Herencia
	 * @generated
	 */
	EClass getHerencia();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.AtributoDerivado <em>Atributo Derivado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Derivado</em>'.
	 * @see modeloER.modeloER.AtributoDerivado
	 * @generated
	 */
	EClass getAtributoDerivado();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.AtributoMultivaluado <em>Atributo Multivaluado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Multivaluado</em>'.
	 * @see modeloER.modeloER.AtributoMultivaluado
	 * @generated
	 */
	EClass getAtributoMultivaluado();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.ClavePrimaria <em>Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Primaria</em>'.
	 * @see modeloER.modeloER.ClavePrimaria
	 * @generated
	 */
	EClass getClavePrimaria();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.ClaveForanea <em>Clave Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Foranea</em>'.
	 * @see modeloER.modeloER.ClaveForanea
	 * @generated
	 */
	EClass getClaveForanea();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.ClavePrimariaForanea <em>Clave Primaria Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Primaria Foranea</em>'.
	 * @see modeloER.modeloER.ClavePrimariaForanea
	 * @generated
	 */
	EClass getClavePrimariaForanea();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.RelacionTipoDebil <em>Relacion Tipo Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion Tipo Debil</em>'.
	 * @see modeloER.modeloER.RelacionTipoDebil
	 * @generated
	 */
	EClass getRelacionTipoDebil();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.RelacionTipoFuerte <em>Relacion Tipo Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion Tipo Fuerte</em>'.
	 * @see modeloER.modeloER.RelacionTipoFuerte
	 * @generated
	 */
	EClass getRelacionTipoFuerte();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.EntidadRelacionDebil <em>Entidad Relacion Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Relacion Debil</em>'.
	 * @see modeloER.modeloER.EntidadRelacionDebil
	 * @generated
	 */
	EClass getEntidadRelacionDebil();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.EntidadRelacionFuerte <em>Entidad Relacion Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Relacion Fuerte</em>'.
	 * @see modeloER.modeloER.EntidadRelacionFuerte
	 * @generated
	 */
	EClass getEntidadRelacionFuerte();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.AtributoDerivadoClavePrimaria <em>Atributo Derivado Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Derivado Clave Primaria</em>'.
	 * @see modeloER.modeloER.AtributoDerivadoClavePrimaria
	 * @generated
	 */
	EClass getAtributoDerivadoClavePrimaria();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.EntidadFuerte <em>Entidad Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Fuerte</em>'.
	 * @see modeloER.modeloER.EntidadFuerte
	 * @generated
	 */
	EClass getEntidadFuerte();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.EntidadDebil <em>Entidad Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Debil</em>'.
	 * @see modeloER.modeloER.EntidadDebil
	 * @generated
	 */
	EClass getEntidadDebil();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.AtributoSimple <em>Atributo Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Simple</em>'.
	 * @see modeloER.modeloER.AtributoSimple
	 * @generated
	 */
	EClass getAtributoSimple();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.AtributoCompuesto <em>Atributo Compuesto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Compuesto</em>'.
	 * @see modeloER.modeloER.AtributoCompuesto
	 * @generated
	 */
	EClass getAtributoCompuesto();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.LinkASAC <em>Link ASAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link ASAC</em>'.
	 * @see modeloER.modeloER.LinkASAC
	 * @generated
	 */
	EClass getLinkASAC();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.LinkASAC#getAtributocompuestoOrigen <em>Atributocompuesto Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributocompuesto Origen</em>'.
	 * @see modeloER.modeloER.LinkASAC#getAtributocompuestoOrigen()
	 * @see #getLinkASAC()
	 * @generated
	 */
	EReference getLinkASAC_AtributocompuestoOrigen();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.LinkASAC#getAtributosimpleDestino <em>Atributosimple Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributosimple Destino</em>'.
	 * @see modeloER.modeloER.LinkASAC#getAtributosimpleDestino()
	 * @see #getLinkASAC()
	 * @generated
	 */
	EReference getLinkASAC_AtributosimpleDestino();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.AtributoEntidadLink <em>Atributo Entidad Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Entidad Link</em>'.
	 * @see modeloER.modeloER.AtributoEntidadLink
	 * @generated
	 */
	EClass getAtributoEntidadLink();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.AtributoEntidadLink#getEntidadAtributoLinkOrigen <em>Entidad Atributo Link Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad Atributo Link Origen</em>'.
	 * @see modeloER.modeloER.AtributoEntidadLink#getEntidadAtributoLinkOrigen()
	 * @see #getAtributoEntidadLink()
	 * @generated
	 */
	EReference getAtributoEntidadLink_EntidadAtributoLinkOrigen();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.AtributoEntidadLink#getAtributoEntidadLinkDestino <em>Atributo Entidad Link Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributo Entidad Link Destino</em>'.
	 * @see modeloER.modeloER.AtributoEntidadLink#getAtributoEntidadLinkDestino()
	 * @see #getAtributoEntidadLink()
	 * @generated
	 */
	EReference getAtributoEntidadLink_AtributoEntidadLinkDestino();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.LinkHerenciaPadre <em>Link Herencia Padre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Herencia Padre</em>'.
	 * @see modeloER.modeloER.LinkHerenciaPadre
	 * @generated
	 */
	EClass getLinkHerenciaPadre();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.LinkHerenciaPadre#getLinkHerenciaPadreHerenciaDestino <em>Link Herencia Padre Herencia Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Herencia Padre Herencia Destino</em>'.
	 * @see modeloER.modeloER.LinkHerenciaPadre#getLinkHerenciaPadreHerenciaDestino()
	 * @see #getLinkHerenciaPadre()
	 * @generated
	 */
	EReference getLinkHerenciaPadre_LinkHerenciaPadreHerenciaDestino();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.LinkHerenciaPadre#getHerenciaPadreEntidadOrigen <em>Herencia Padre Entidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Herencia Padre Entidad Origen</em>'.
	 * @see modeloER.modeloER.LinkHerenciaPadre#getHerenciaPadreEntidadOrigen()
	 * @see #getLinkHerenciaPadre()
	 * @generated
	 */
	EReference getLinkHerenciaPadre_HerenciaPadreEntidadOrigen();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.LinkHerenciaHijo <em>Link Herencia Hijo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Herencia Hijo</em>'.
	 * @see modeloER.modeloER.LinkHerenciaHijo
	 * @generated
	 */
	EClass getLinkHerenciaHijo();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoHerenciaDestino <em>Herencia Hijo Herencia Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Herencia Hijo Herencia Destino</em>'.
	 * @see modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoHerenciaDestino()
	 * @see #getLinkHerenciaHijo()
	 * @generated
	 */
	EReference getLinkHerenciaHijo_HerenciaHijoHerenciaDestino();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoEntidadOrigen <em>Herencia Hijo Entidad Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Herencia Hijo Entidad Origen</em>'.
	 * @see modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoEntidadOrigen()
	 * @see #getLinkHerenciaHijo()
	 * @generated
	 */
	EReference getLinkHerenciaHijo_HerenciaHijoEntidadOrigen();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.AtributoDerivadoEntidad <em>Atributo Derivado Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Derivado Entidad</em>'.
	 * @see modeloER.modeloER.AtributoDerivadoEntidad
	 * @generated
	 */
	EClass getAtributoDerivadoEntidad();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.AtributoDerivadoEntidad#getEntidadAtributoDerivadoOrigen <em>Entidad Atributo Derivado Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad Atributo Derivado Origen</em>'.
	 * @see modeloER.modeloER.AtributoDerivadoEntidad#getEntidadAtributoDerivadoOrigen()
	 * @see #getAtributoDerivadoEntidad()
	 * @generated
	 */
	EReference getAtributoDerivadoEntidad_EntidadAtributoDerivadoOrigen();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoclaveprimariaDestino <em>Atributoderivadoclaveprimaria Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributoderivadoclaveprimaria Destino</em>'.
	 * @see modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoclaveprimariaDestino()
	 * @see #getAtributoDerivadoEntidad()
	 * @generated
	 */
	EReference getAtributoDerivadoEntidad_AtributoderivadoclaveprimariaDestino();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoDestino <em>Atributoderivado Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atributoderivado Destino</em>'.
	 * @see modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoDestino()
	 * @see #getAtributoDerivadoEntidad()
	 * @generated
	 */
	EReference getAtributoDerivadoEntidad_AtributoderivadoDestino();

	/**
	 * Returns the meta object for class '{@link modeloER.modeloER.RelacionAtributoLink <em>Relacion Atributo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion Atributo Link</em>'.
	 * @see modeloER.modeloER.RelacionAtributoLink
	 * @generated
	 */
	EClass getRelacionAtributoLink();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoOrigen <em>Relacion Atributo Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion Atributo Origen</em>'.
	 * @see modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoOrigen()
	 * @see #getRelacionAtributoLink()
	 * @generated
	 */
	EReference getRelacionAtributoLink_RelacionAtributoOrigen();

	/**
	 * Returns the meta object for the reference '{@link modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoDestino <em>Relacion Atributo Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion Atributo Destino</em>'.
	 * @see modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoDestino()
	 * @see #getRelacionAtributoLink()
	 * @generated
	 */
	EReference getRelacionAtributoLink_RelacionAtributoDestino();

	/**
	 * Returns the meta object for enum '{@link modeloER.modeloER.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see modeloER.modeloER.TipoDato
	 * @generated
	 */
	EEnum getTipoDato();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloERFactory getModeloERFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.EntidadImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Atributos Entidad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ATRIBUTOS_ENTIDAD = eINSTANCE.getEntidad_AtributosEntidad();

		/**
		 * The meta object literal for the '<em><b>Nombre Entidad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NOMBRE_ENTIDAD = eINSTANCE.getEntidad_NombreEntidad();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE_ATRIBUTO = eINSTANCE.getAtributo_NombreAtributo();

		/**
		 * The meta object literal for the '<em><b>Nulo Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NULO_ATRIBUTO = eINSTANCE.getAtributo_NuloAtributo();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato Atributo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO_DATO_ATRIBUTO = eINSTANCE.getAtributo_TipoDatoAtributo();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.RelacionImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Nombre Relacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__NOMBRE_RELACION = eINSTANCE.getRelacion_NombreRelacion();

		/**
		 * The meta object literal for the '<em><b>Atributos Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__ATRIBUTOS_RELACION = eINSTANCE.getRelacion_AtributosRelacion();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.DiagramaImpl <em>Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.DiagramaImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getDiagrama()
		 * @generated
		 */
		EClass DIAGRAMA = eINSTANCE.getDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributos Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributosDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Herencias Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__HERENCIAS_DEL_DIAGRAMA = eINSTANCE.getDiagrama_HerenciasDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributoderivado Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributoderivadoDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributomultivaluado Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributomultivaluadoDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Claveprimaria Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA = eINSTANCE.getDiagrama_ClaveprimariaDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Claveforanea Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA = eINSTANCE.getDiagrama_ClaveforaneaDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Claveprimariaforanea Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA = eINSTANCE.getDiagrama_ClaveprimariaforaneaDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Relaciones Tipodebil Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__RELACIONES_TIPODEBIL_DEL_DIAGRAMA = eINSTANCE.getDiagrama_RelacionesTipodebilDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Relaciones Tipofuerte Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__RELACIONES_TIPOFUERTE_DEL_DIAGRAMA = eINSTANCE.getDiagrama_RelacionesTipofuerteDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Entidades Relaciones Fuertes Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA = eINSTANCE.getDiagrama_EntidadesRelacionesFuertesDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Entidades Relaciones Debiles Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA = eINSTANCE.getDiagrama_EntidadesRelacionesDebilesDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributoderivadoclaveprimaria Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributoderivadoclaveprimariaDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Entidadfuerte Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA = eINSTANCE.getDiagrama_EntidadfuerteDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Entidaddebil Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA = eINSTANCE.getDiagrama_EntidaddebilDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributosimple Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTOSIMPLE_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributosimpleDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributocompuesto Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTOCOMPUESTO_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributocompuestoDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Linkasac Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__LINKASAC_DEL_DIAGRAMA = eINSTANCE.getDiagrama_LinkasacDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributoderivadoentidad Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributoderivadoentidadDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributoentidadlink Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTOENTIDADLINK_DIAGRAMA = eINSTANCE.getDiagrama_AtributoentidadlinkDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributoderivadoentidad Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTODERIVADOENTIDAD_DIAGRAMA = eINSTANCE.getDiagrama_AtributoderivadoentidadDiagrama();

		/**
		 * The meta object literal for the '<em><b>Relacionatributolink Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__RELACIONATRIBUTOLINK_DIAGRAMA = eINSTANCE.getDiagrama_RelacionatributolinkDiagrama();

		/**
		 * The meta object literal for the '<em><b>Linkherenciapadre Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__LINKHERENCIAPADRE_DIAGRAMA = eINSTANCE.getDiagrama_LinkherenciapadreDiagrama();

		/**
		 * The meta object literal for the '<em><b>Linkherenciahijo Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__LINKHERENCIAHIJO_DIAGRAMA = eINSTANCE.getDiagrama_LinkherenciahijoDiagrama();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.EntidadRelacionImpl <em>Entidad Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.EntidadRelacionImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacion()
		 * @generated
		 */
		EClass ENTIDAD_RELACION = eINSTANCE.getEntidadRelacion();

		/**
		 * The meta object literal for the '<em><b>Entidad ER Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_RELACION__ENTIDAD_ER_LINK = eINSTANCE.getEntidadRelacion_EntidadERLink();

		/**
		 * The meta object literal for the '<em><b>Relacion ER Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_RELACION__RELACION_ER_LINK = eINSTANCE.getEntidadRelacion_RelacionERLink();

		/**
		 * The meta object literal for the '<em><b>Limite Inferior ER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD_RELACION__LIMITE_INFERIOR_ER = eINSTANCE.getEntidadRelacion_LimiteInferiorER();

		/**
		 * The meta object literal for the '<em><b>Limite Superior ER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD_RELACION__LIMITE_SUPERIOR_ER = eINSTANCE.getEntidadRelacion_LimiteSuperiorER();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.HerenciaImpl <em>Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.HerenciaImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getHerencia()
		 * @generated
		 */
		EClass HERENCIA = eINSTANCE.getHerencia();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoDerivadoImpl <em>Atributo Derivado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoDerivadoImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoDerivado()
		 * @generated
		 */
		EClass ATRIBUTO_DERIVADO = eINSTANCE.getAtributoDerivado();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoMultivaluadoImpl <em>Atributo Multivaluado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoMultivaluadoImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoMultivaluado()
		 * @generated
		 */
		EClass ATRIBUTO_MULTIVALUADO = eINSTANCE.getAtributoMultivaluado();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.ClavePrimariaImpl <em>Clave Primaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.ClavePrimariaImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getClavePrimaria()
		 * @generated
		 */
		EClass CLAVE_PRIMARIA = eINSTANCE.getClavePrimaria();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.ClaveForaneaImpl <em>Clave Foranea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.ClaveForaneaImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getClaveForanea()
		 * @generated
		 */
		EClass CLAVE_FORANEA = eINSTANCE.getClaveForanea();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.ClavePrimariaForaneaImpl <em>Clave Primaria Foranea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.ClavePrimariaForaneaImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getClavePrimariaForanea()
		 * @generated
		 */
		EClass CLAVE_PRIMARIA_FORANEA = eINSTANCE.getClavePrimariaForanea();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.RelacionTipoDebilImpl <em>Relacion Tipo Debil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.RelacionTipoDebilImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacionTipoDebil()
		 * @generated
		 */
		EClass RELACION_TIPO_DEBIL = eINSTANCE.getRelacionTipoDebil();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.RelacionTipoFuerteImpl <em>Relacion Tipo Fuerte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.RelacionTipoFuerteImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacionTipoFuerte()
		 * @generated
		 */
		EClass RELACION_TIPO_FUERTE = eINSTANCE.getRelacionTipoFuerte();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.EntidadRelacionDebilImpl <em>Entidad Relacion Debil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.EntidadRelacionDebilImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacionDebil()
		 * @generated
		 */
		EClass ENTIDAD_RELACION_DEBIL = eINSTANCE.getEntidadRelacionDebil();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.EntidadRelacionFuerteImpl <em>Entidad Relacion Fuerte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.EntidadRelacionFuerteImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacionFuerte()
		 * @generated
		 */
		EClass ENTIDAD_RELACION_FUERTE = eINSTANCE.getEntidadRelacionFuerte();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoDerivadoClavePrimariaImpl <em>Atributo Derivado Clave Primaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoDerivadoClavePrimariaImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoDerivadoClavePrimaria()
		 * @generated
		 */
		EClass ATRIBUTO_DERIVADO_CLAVE_PRIMARIA = eINSTANCE.getAtributoDerivadoClavePrimaria();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.EntidadFuerteImpl <em>Entidad Fuerte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.EntidadFuerteImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadFuerte()
		 * @generated
		 */
		EClass ENTIDAD_FUERTE = eINSTANCE.getEntidadFuerte();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.EntidadDebilImpl <em>Entidad Debil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.EntidadDebilImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getEntidadDebil()
		 * @generated
		 */
		EClass ENTIDAD_DEBIL = eINSTANCE.getEntidadDebil();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoSimpleImpl <em>Atributo Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoSimpleImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoSimple()
		 * @generated
		 */
		EClass ATRIBUTO_SIMPLE = eINSTANCE.getAtributoSimple();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoCompuestoImpl <em>Atributo Compuesto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoCompuestoImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoCompuesto()
		 * @generated
		 */
		EClass ATRIBUTO_COMPUESTO = eINSTANCE.getAtributoCompuesto();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.LinkASACImpl <em>Link ASAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.LinkASACImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getLinkASAC()
		 * @generated
		 */
		EClass LINK_ASAC = eINSTANCE.getLinkASAC();

		/**
		 * The meta object literal for the '<em><b>Atributocompuesto Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ASAC__ATRIBUTOCOMPUESTO_ORIGEN = eINSTANCE.getLinkASAC_AtributocompuestoOrigen();

		/**
		 * The meta object literal for the '<em><b>Atributosimple Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_ASAC__ATRIBUTOSIMPLE_DESTINO = eINSTANCE.getLinkASAC_AtributosimpleDestino();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoEntidadLinkImpl <em>Atributo Entidad Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoEntidadLinkImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoEntidadLink()
		 * @generated
		 */
		EClass ATRIBUTO_ENTIDAD_LINK = eINSTANCE.getAtributoEntidadLink();

		/**
		 * The meta object literal for the '<em><b>Entidad Atributo Link Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO_ENTIDAD_LINK__ENTIDAD_ATRIBUTO_LINK_ORIGEN = eINSTANCE.getAtributoEntidadLink_EntidadAtributoLinkOrigen();

		/**
		 * The meta object literal for the '<em><b>Atributo Entidad Link Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO_ENTIDAD_LINK__ATRIBUTO_ENTIDAD_LINK_DESTINO = eINSTANCE.getAtributoEntidadLink_AtributoEntidadLinkDestino();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.LinkHerenciaPadreImpl <em>Link Herencia Padre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.LinkHerenciaPadreImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getLinkHerenciaPadre()
		 * @generated
		 */
		EClass LINK_HERENCIA_PADRE = eINSTANCE.getLinkHerenciaPadre();

		/**
		 * The meta object literal for the '<em><b>Link Herencia Padre Herencia Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HERENCIA_PADRE__LINK_HERENCIA_PADRE_HERENCIA_DESTINO = eINSTANCE.getLinkHerenciaPadre_LinkHerenciaPadreHerenciaDestino();

		/**
		 * The meta object literal for the '<em><b>Herencia Padre Entidad Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HERENCIA_PADRE__HERENCIA_PADRE_ENTIDAD_ORIGEN = eINSTANCE.getLinkHerenciaPadre_HerenciaPadreEntidadOrigen();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.LinkHerenciaHijoImpl <em>Link Herencia Hijo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.LinkHerenciaHijoImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getLinkHerenciaHijo()
		 * @generated
		 */
		EClass LINK_HERENCIA_HIJO = eINSTANCE.getLinkHerenciaHijo();

		/**
		 * The meta object literal for the '<em><b>Herencia Hijo Herencia Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HERENCIA_HIJO__HERENCIA_HIJO_HERENCIA_DESTINO = eINSTANCE.getLinkHerenciaHijo_HerenciaHijoHerenciaDestino();

		/**
		 * The meta object literal for the '<em><b>Herencia Hijo Entidad Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_HERENCIA_HIJO__HERENCIA_HIJO_ENTIDAD_ORIGEN = eINSTANCE.getLinkHerenciaHijo_HerenciaHijoEntidadOrigen();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.AtributoDerivadoEntidadImpl <em>Atributo Derivado Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.AtributoDerivadoEntidadImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getAtributoDerivadoEntidad()
		 * @generated
		 */
		EClass ATRIBUTO_DERIVADO_ENTIDAD = eINSTANCE.getAtributoDerivadoEntidad();

		/**
		 * The meta object literal for the '<em><b>Entidad Atributo Derivado Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO_DERIVADO_ENTIDAD__ENTIDAD_ATRIBUTO_DERIVADO_ORIGEN = eINSTANCE.getAtributoDerivadoEntidad_EntidadAtributoDerivadoOrigen();

		/**
		 * The meta object literal for the '<em><b>Atributoderivadoclaveprimaria Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADOCLAVEPRIMARIA_DESTINO = eINSTANCE.getAtributoDerivadoEntidad_AtributoderivadoclaveprimariaDestino();

		/**
		 * The meta object literal for the '<em><b>Atributoderivado Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO_DERIVADO_ENTIDAD__ATRIBUTODERIVADO_DESTINO = eINSTANCE.getAtributoDerivadoEntidad_AtributoderivadoDestino();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.impl.RelacionAtributoLinkImpl <em>Relacion Atributo Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.impl.RelacionAtributoLinkImpl
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getRelacionAtributoLink()
		 * @generated
		 */
		EClass RELACION_ATRIBUTO_LINK = eINSTANCE.getRelacionAtributoLink();

		/**
		 * The meta object literal for the '<em><b>Relacion Atributo Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_ORIGEN = eINSTANCE.getRelacionAtributoLink_RelacionAtributoOrigen();

		/**
		 * The meta object literal for the '<em><b>Relacion Atributo Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION_ATRIBUTO_LINK__RELACION_ATRIBUTO_DESTINO = eINSTANCE.getRelacionAtributoLink_RelacionAtributoDestino();

		/**
		 * The meta object literal for the '{@link modeloER.modeloER.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.modeloER.TipoDato
		 * @see modeloER.modeloER.impl.ModeloERPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

	}

} //ModeloERPackage
