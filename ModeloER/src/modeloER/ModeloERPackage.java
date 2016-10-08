/**
 */
package modeloER;

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
 * @see modeloER.ModeloERFactory
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
	ModeloERPackage eINSTANCE = modeloER.impl.ModeloERPackageImpl.init();

	/**
	 * The meta object id for the '{@link modeloER.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.EntidadImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getEntidad()
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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__NOMBRE = 1;

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
	 * The meta object id for the '{@link modeloER.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.AtributoImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NULO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__TIPO_DATO = 2;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__CLAVE_PRIMARIA = 3;

	/**
	 * The feature id for the '<em><b>Clave Foranea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__CLAVE_FORANEA = 4;

	/**
	 * The feature id for the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__ATRIBUTOS_ATRIBUTO = 5;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.RelacionImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getRelacion()
	 * @generated
	 */
	int RELACION = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ATRIBUTOS_RELACION = 1;

	/**
	 * The feature id for the '<em><b>Entidad Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION__ENTIDAD_ENTIDAD_RELACION = 2;

	/**
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.impl.DiagramaImpl <em>Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.DiagramaImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getDiagrama()
	 * @generated
	 */
	int DIAGRAMA = 3;

	/**
	 * The feature id for the '<em><b>Relaciones Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__RELACIONES_DEL_DIAGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Atributos Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA = 1;

	/**
	 * The feature id for the '<em><b>Entidades Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADES_DEL_DIAGRAMA = 2;

	/**
	 * The feature id for the '<em><b>Herencias Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__HERENCIAS_DEL_DIAGRAMA = 3;

	/**
	 * The feature id for the '<em><b>Entidad Relaciones Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA = 4;

	/**
	 * The feature id for the '<em><b>Atributoderivado Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTODERIVADO_DEL_DIAGRAMA = 5;

	/**
	 * The feature id for the '<em><b>Atributomultivaluado Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTOMULTIVALUADO_DEL_DIAGRAMA = 6;

	/**
	 * The feature id for the '<em><b>Claveprimaria Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CLAVEPRIMARIA_DEL_DIAGRAMA = 7;

	/**
	 * The feature id for the '<em><b>Claveforanea Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CLAVEFORANEA_DEL_DIAGRAMA = 8;

	/**
	 * The feature id for the '<em><b>Claveprimariaforanea Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CLAVEPRIMARIAFORANEA_DEL_DIAGRAMA = 9;

	/**
	 * The feature id for the '<em><b>Tipodebil Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA = 10;

	/**
	 * The feature id for the '<em><b>Tipofuerte Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA = 11;

	/**
	 * The feature id for the '<em><b>Entidades Relaciones Fuertes Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADES_RELACIONES_FUERTES_DEL_DIAGRAMA = 12;

	/**
	 * The feature id for the '<em><b>Entidades Relaciones Debiles Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADES_RELACIONES_DEBILES_DEL_DIAGRAMA = 13;

	/**
	 * The feature id for the '<em><b>Atributoderivadoclaveprimaria Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTODERIVADOCLAVEPRIMARIA_DEL_DIAGRAMA = 14;

	/**
	 * The feature id for the '<em><b>Entidadfuerte Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADFUERTE_DEL_DIAGRAMA = 15;

	/**
	 * The feature id for the '<em><b>Entidaddebil Del Diagrama</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDADDEBIL_DEL_DIAGRAMA = 16;

	/**
	 * The number of structural features of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.impl.EntidadRelacionImpl <em>Entidad Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.EntidadRelacionImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getEntidadRelacion()
	 * @generated
	 */
	int ENTIDAD_RELACION = 4;

	/**
	 * The feature id for the '<em><b>Entidad Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION = 0;

	/**
	 * The feature id for the '<em><b>Relacion Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION = 1;

	/**
	 * The feature id for the '<em><b>Limite Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__LIMITE_INFERIOR = 2;

	/**
	 * The feature id for the '<em><b>Limite Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__LIMITE_SUPERIOR = 3;

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
	 * The meta object id for the '{@link modeloER.impl.HerenciaImpl <em>Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.HerenciaImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getHerencia()
	 * @generated
	 */
	int HERENCIA = 5;

	/**
	 * The feature id for the '<em><b>Entidad Padre Herencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__ENTIDAD_PADRE_HERENCIA = 0;

	/**
	 * The feature id for the '<em><b>Entidades Hijas Herencia</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__ENTIDADES_HIJAS_HERENCIA = 1;

	/**
	 * The number of structural features of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloER.impl.AtributoDerivadoImpl <em>Atributo Derivado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.AtributoDerivadoImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getAtributoDerivado()
	 * @generated
	 */
	int ATRIBUTO_DERIVADO = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__NULO = ATRIBUTO__NULO;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__TIPO_DATO = ATRIBUTO__TIPO_DATO;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__CLAVE_PRIMARIA = ATRIBUTO__CLAVE_PRIMARIA;

	/**
	 * The feature id for the '<em><b>Clave Foranea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__CLAVE_FORANEA = ATRIBUTO__CLAVE_FORANEA;

	/**
	 * The feature id for the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO__ATRIBUTOS_ATRIBUTO = ATRIBUTO__ATRIBUTOS_ATRIBUTO;

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
	 * The meta object id for the '{@link modeloER.impl.AtributoMultivaluadoImpl <em>Atributo Multivaluado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.AtributoMultivaluadoImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getAtributoMultivaluado()
	 * @generated
	 */
	int ATRIBUTO_MULTIVALUADO = 7;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__NULO = ATRIBUTO__NULO;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__TIPO_DATO = ATRIBUTO__TIPO_DATO;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__CLAVE_PRIMARIA = ATRIBUTO__CLAVE_PRIMARIA;

	/**
	 * The feature id for the '<em><b>Clave Foranea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__CLAVE_FORANEA = ATRIBUTO__CLAVE_FORANEA;

	/**
	 * The feature id for the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_MULTIVALUADO__ATRIBUTOS_ATRIBUTO = ATRIBUTO__ATRIBUTOS_ATRIBUTO;

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
	 * The meta object id for the '{@link modeloER.impl.ClavePrimariaImpl <em>Clave Primaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.ClavePrimariaImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getClavePrimaria()
	 * @generated
	 */
	int CLAVE_PRIMARIA = 8;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__NULO = ATRIBUTO__NULO;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__TIPO_DATO = ATRIBUTO__TIPO_DATO;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__CLAVE_PRIMARIA = ATRIBUTO__CLAVE_PRIMARIA;

	/**
	 * The feature id for the '<em><b>Clave Foranea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__CLAVE_FORANEA = ATRIBUTO__CLAVE_FORANEA;

	/**
	 * The feature id for the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA__ATRIBUTOS_ATRIBUTO = ATRIBUTO__ATRIBUTOS_ATRIBUTO;

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
	 * The meta object id for the '{@link modeloER.impl.ClaveForaneaImpl <em>Clave Foranea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.ClaveForaneaImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getClaveForanea()
	 * @generated
	 */
	int CLAVE_FORANEA = 9;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__NULO = ATRIBUTO__NULO;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__TIPO_DATO = ATRIBUTO__TIPO_DATO;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__CLAVE_PRIMARIA = ATRIBUTO__CLAVE_PRIMARIA;

	/**
	 * The feature id for the '<em><b>Clave Foranea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__CLAVE_FORANEA = ATRIBUTO__CLAVE_FORANEA;

	/**
	 * The feature id for the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_FORANEA__ATRIBUTOS_ATRIBUTO = ATRIBUTO__ATRIBUTOS_ATRIBUTO;

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
	 * The meta object id for the '{@link modeloER.impl.ClavePrimariaForaneaImpl <em>Clave Primaria Foranea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.ClavePrimariaForaneaImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getClavePrimariaForanea()
	 * @generated
	 */
	int CLAVE_PRIMARIA_FORANEA = 10;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__NULO = ATRIBUTO__NULO;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__TIPO_DATO = ATRIBUTO__TIPO_DATO;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__CLAVE_PRIMARIA = ATRIBUTO__CLAVE_PRIMARIA;

	/**
	 * The feature id for the '<em><b>Clave Foranea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__CLAVE_FORANEA = ATRIBUTO__CLAVE_FORANEA;

	/**
	 * The feature id for the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAVE_PRIMARIA_FORANEA__ATRIBUTOS_ATRIBUTO = ATRIBUTO__ATRIBUTOS_ATRIBUTO;

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
	 * The meta object id for the '{@link modeloER.impl.TipoDebilImpl <em>Tipo Debil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.TipoDebilImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getTipoDebil()
	 * @generated
	 */
	int TIPO_DEBIL = 11;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEBIL__NOMBRE = RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEBIL__ATRIBUTOS_RELACION = RELACION__ATRIBUTOS_RELACION;

	/**
	 * The feature id for the '<em><b>Entidad Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEBIL__ENTIDAD_ENTIDAD_RELACION = RELACION__ENTIDAD_ENTIDAD_RELACION;

	/**
	 * The number of structural features of the '<em>Tipo Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEBIL_FEATURE_COUNT = RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tipo Debil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_DEBIL_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.impl.TipoFuerteImpl <em>Tipo Fuerte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.TipoFuerteImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getTipoFuerte()
	 * @generated
	 */
	int TIPO_FUERTE = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_FUERTE__NOMBRE = RELACION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_FUERTE__ATRIBUTOS_RELACION = RELACION__ATRIBUTOS_RELACION;

	/**
	 * The feature id for the '<em><b>Entidad Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_FUERTE__ENTIDAD_ENTIDAD_RELACION = RELACION__ENTIDAD_ENTIDAD_RELACION;

	/**
	 * The number of structural features of the '<em>Tipo Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_FUERTE_FEATURE_COUNT = RELACION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tipo Fuerte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIPO_FUERTE_OPERATION_COUNT = RELACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloER.impl.EntidadRelacionDebilImpl <em>Entidad Relacion Debil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.EntidadRelacionDebilImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getEntidadRelacionDebil()
	 * @generated
	 */
	int ENTIDAD_RELACION_DEBIL = 13;

	/**
	 * The feature id for the '<em><b>Entidad Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__ENTIDAD_ENTIDAD_RELACION = ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION;

	/**
	 * The feature id for the '<em><b>Relacion Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__RELACION_ENTIDAD_RELACION = ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION;

	/**
	 * The feature id for the '<em><b>Limite Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__LIMITE_INFERIOR = ENTIDAD_RELACION__LIMITE_INFERIOR;

	/**
	 * The feature id for the '<em><b>Limite Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_DEBIL__LIMITE_SUPERIOR = ENTIDAD_RELACION__LIMITE_SUPERIOR;

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
	 * The meta object id for the '{@link modeloER.impl.EntidadRelacionFuerteImpl <em>Entidad Relacion Fuerte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.EntidadRelacionFuerteImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getEntidadRelacionFuerte()
	 * @generated
	 */
	int ENTIDAD_RELACION_FUERTE = 14;

	/**
	 * The feature id for the '<em><b>Entidad Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__ENTIDAD_ENTIDAD_RELACION = ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION;

	/**
	 * The feature id for the '<em><b>Relacion Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__RELACION_ENTIDAD_RELACION = ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION;

	/**
	 * The feature id for the '<em><b>Limite Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__LIMITE_INFERIOR = ENTIDAD_RELACION__LIMITE_INFERIOR;

	/**
	 * The feature id for the '<em><b>Limite Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION_FUERTE__LIMITE_SUPERIOR = ENTIDAD_RELACION__LIMITE_SUPERIOR;

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
	 * The meta object id for the '{@link modeloER.impl.AtributoDerivadoClavePrimariaImpl <em>Atributo Derivado Clave Primaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.AtributoDerivadoClavePrimariaImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getAtributoDerivadoClavePrimaria()
	 * @generated
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA = 15;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__NOMBRE = ATRIBUTO__NOMBRE;

	/**
	 * The feature id for the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__NULO = ATRIBUTO__NULO;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__TIPO_DATO = ATRIBUTO__TIPO_DATO;

	/**
	 * The feature id for the '<em><b>Clave Primaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__CLAVE_PRIMARIA = ATRIBUTO__CLAVE_PRIMARIA;

	/**
	 * The feature id for the '<em><b>Clave Foranea</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__CLAVE_FORANEA = ATRIBUTO__CLAVE_FORANEA;

	/**
	 * The feature id for the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_DERIVADO_CLAVE_PRIMARIA__ATRIBUTOS_ATRIBUTO = ATRIBUTO__ATRIBUTOS_ATRIBUTO;

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
	 * The meta object id for the '{@link modeloER.impl.EntidadFuerteImpl <em>Entidad Fuerte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.EntidadFuerteImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getEntidadFuerte()
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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_FUERTE__NOMBRE = ENTIDAD__NOMBRE;

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
	 * The meta object id for the '{@link modeloER.impl.EntidadDebilImpl <em>Entidad Debil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.impl.EntidadDebilImpl
	 * @see modeloER.impl.ModeloERPackageImpl#getEntidadDebil()
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
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_DEBIL__NOMBRE = ENTIDAD__NOMBRE;

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
	 * The meta object id for the '{@link modeloER.TipoDato <em>Tipo Dato</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloER.TipoDato
	 * @see modeloER.impl.ModeloERPackageImpl#getTipoDato()
	 * @generated
	 */
	int TIPO_DATO = 18;


	/**
	 * Returns the meta object for class '{@link modeloER.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see modeloER.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Entidad#getAtributosEntidad <em>Atributos Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos Entidad</em>'.
	 * @see modeloER.Entidad#getAtributosEntidad()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_AtributosEntidad();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.Entidad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modeloER.Entidad#getNombre()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Nombre();

	/**
	 * Returns the meta object for class '{@link modeloER.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see modeloER.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modeloER.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.Atributo#isNulo <em>Nulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nulo</em>'.
	 * @see modeloER.Atributo#isNulo()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nulo();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.Atributo#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see modeloER.Atributo#getTipoDato()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.Atributo#isClavePrimaria <em>Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clave Primaria</em>'.
	 * @see modeloER.Atributo#isClavePrimaria()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_ClavePrimaria();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.Atributo#isClaveForanea <em>Clave Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clave Foranea</em>'.
	 * @see modeloER.Atributo#isClaveForanea()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_ClaveForanea();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Atributo#getAtributosAtributo <em>Atributos Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos Atributo</em>'.
	 * @see modeloER.Atributo#getAtributosAtributo()
	 * @see #getAtributo()
	 * @generated
	 */
	EReference getAtributo_AtributosAtributo();

	/**
	 * Returns the meta object for class '{@link modeloER.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see modeloER.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.Relacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see modeloER.Relacion#getNombre()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Relacion#getAtributosRelacion <em>Atributos Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos Relacion</em>'.
	 * @see modeloER.Relacion#getAtributosRelacion()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_AtributosRelacion();

	/**
	 * Returns the meta object for the reference '{@link modeloER.Relacion#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad Entidad Relacion</em>'.
	 * @see modeloER.Relacion#getEntidadEntidadRelacion()
	 * @see #getRelacion()
	 * @generated
	 */
	EReference getRelacion_EntidadEntidadRelacion();

	/**
	 * Returns the meta object for class '{@link modeloER.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama</em>'.
	 * @see modeloER.Diagrama
	 * @generated
	 */
	EClass getDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getRelacionesDelDiagrama <em>Relaciones Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relaciones Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getRelacionesDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_RelacionesDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getAtributosDelDiagrama <em>Atributos Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getAtributosDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributosDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getEntidadesDelDiagrama <em>Entidades Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getEntidadesDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadesDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getHerenciasDelDiagrama <em>Herencias Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Herencias Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getHerenciasDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_HerenciasDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getEntidadRelacionesDelDiagrama <em>Entidad Relaciones Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidad Relaciones Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getEntidadRelacionesDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadRelacionesDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getAtributoderivadoDelDiagrama <em>Atributoderivado Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributoderivado Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getAtributoderivadoDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributoderivadoDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getAtributomultivaluadoDelDiagrama <em>Atributomultivaluado Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributomultivaluado Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getAtributomultivaluadoDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributomultivaluadoDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getClaveprimariaDelDiagrama <em>Claveprimaria Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claveprimaria Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getClaveprimariaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_ClaveprimariaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getClaveforaneaDelDiagrama <em>Claveforanea Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claveforanea Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getClaveforaneaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_ClaveforaneaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getClaveprimariaforaneaDelDiagrama <em>Claveprimariaforanea Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claveprimariaforanea Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getClaveprimariaforaneaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_ClaveprimariaforaneaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getTipodebilDelDiagrama <em>Tipodebil Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipodebil Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getTipodebilDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_TipodebilDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getTipofuerteDelDiagrama <em>Tipofuerte Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tipofuerte Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getTipofuerteDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_TipofuerteDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getEntidadesRelacionesFuertesDelDiagrama <em>Entidades Relaciones Fuertes Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades Relaciones Fuertes Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getEntidadesRelacionesFuertesDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadesRelacionesFuertesDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getEntidadesRelacionesDebilesDelDiagrama <em>Entidades Relaciones Debiles Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidades Relaciones Debiles Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getEntidadesRelacionesDebilesDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadesRelacionesDebilesDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getAtributoderivadoclaveprimariaDelDiagrama <em>Atributoderivadoclaveprimaria Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributoderivadoclaveprimaria Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getAtributoderivadoclaveprimariaDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_AtributoderivadoclaveprimariaDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getEntidadfuerteDelDiagrama <em>Entidadfuerte Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidadfuerte Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getEntidadfuerteDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadfuerteDelDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloER.Diagrama#getEntidaddebilDelDiagrama <em>Entidaddebil Del Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidaddebil Del Diagrama</em>'.
	 * @see modeloER.Diagrama#getEntidaddebilDelDiagrama()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidaddebilDelDiagrama();

	/**
	 * Returns the meta object for class '{@link modeloER.EntidadRelacion <em>Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Relacion</em>'.
	 * @see modeloER.EntidadRelacion
	 * @generated
	 */
	EClass getEntidadRelacion();

	/**
	 * Returns the meta object for the reference '{@link modeloER.EntidadRelacion#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad Entidad Relacion</em>'.
	 * @see modeloER.EntidadRelacion#getEntidadEntidadRelacion()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EReference getEntidadRelacion_EntidadEntidadRelacion();

	/**
	 * Returns the meta object for the reference '{@link modeloER.EntidadRelacion#getRelacionEntidadRelacion <em>Relacion Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion Entidad Relacion</em>'.
	 * @see modeloER.EntidadRelacion#getRelacionEntidadRelacion()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EReference getEntidadRelacion_RelacionEntidadRelacion();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.EntidadRelacion#getLimiteInferior <em>Limite Inferior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite Inferior</em>'.
	 * @see modeloER.EntidadRelacion#getLimiteInferior()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EAttribute getEntidadRelacion_LimiteInferior();

	/**
	 * Returns the meta object for the attribute '{@link modeloER.EntidadRelacion#getLimiteSuperior <em>Limite Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite Superior</em>'.
	 * @see modeloER.EntidadRelacion#getLimiteSuperior()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EAttribute getEntidadRelacion_LimiteSuperior();

	/**
	 * Returns the meta object for class '{@link modeloER.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia</em>'.
	 * @see modeloER.Herencia
	 * @generated
	 */
	EClass getHerencia();

	/**
	 * Returns the meta object for the reference '{@link modeloER.Herencia#getEntidadPadreHerencia <em>Entidad Padre Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad Padre Herencia</em>'.
	 * @see modeloER.Herencia#getEntidadPadreHerencia()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_EntidadPadreHerencia();

	/**
	 * Returns the meta object for the reference list '{@link modeloER.Herencia#getEntidadesHijasHerencia <em>Entidades Hijas Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entidades Hijas Herencia</em>'.
	 * @see modeloER.Herencia#getEntidadesHijasHerencia()
	 * @see #getHerencia()
	 * @generated
	 */
	EReference getHerencia_EntidadesHijasHerencia();

	/**
	 * Returns the meta object for class '{@link modeloER.AtributoDerivado <em>Atributo Derivado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Derivado</em>'.
	 * @see modeloER.AtributoDerivado
	 * @generated
	 */
	EClass getAtributoDerivado();

	/**
	 * Returns the meta object for class '{@link modeloER.AtributoMultivaluado <em>Atributo Multivaluado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Multivaluado</em>'.
	 * @see modeloER.AtributoMultivaluado
	 * @generated
	 */
	EClass getAtributoMultivaluado();

	/**
	 * Returns the meta object for class '{@link modeloER.ClavePrimaria <em>Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Primaria</em>'.
	 * @see modeloER.ClavePrimaria
	 * @generated
	 */
	EClass getClavePrimaria();

	/**
	 * Returns the meta object for class '{@link modeloER.ClaveForanea <em>Clave Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Foranea</em>'.
	 * @see modeloER.ClaveForanea
	 * @generated
	 */
	EClass getClaveForanea();

	/**
	 * Returns the meta object for class '{@link modeloER.ClavePrimariaForanea <em>Clave Primaria Foranea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clave Primaria Foranea</em>'.
	 * @see modeloER.ClavePrimariaForanea
	 * @generated
	 */
	EClass getClavePrimariaForanea();

	/**
	 * Returns the meta object for class '{@link modeloER.TipoDebil <em>Tipo Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Debil</em>'.
	 * @see modeloER.TipoDebil
	 * @generated
	 */
	EClass getTipoDebil();

	/**
	 * Returns the meta object for class '{@link modeloER.TipoFuerte <em>Tipo Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tipo Fuerte</em>'.
	 * @see modeloER.TipoFuerte
	 * @generated
	 */
	EClass getTipoFuerte();

	/**
	 * Returns the meta object for class '{@link modeloER.EntidadRelacionDebil <em>Entidad Relacion Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Relacion Debil</em>'.
	 * @see modeloER.EntidadRelacionDebil
	 * @generated
	 */
	EClass getEntidadRelacionDebil();

	/**
	 * Returns the meta object for class '{@link modeloER.EntidadRelacionFuerte <em>Entidad Relacion Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Relacion Fuerte</em>'.
	 * @see modeloER.EntidadRelacionFuerte
	 * @generated
	 */
	EClass getEntidadRelacionFuerte();

	/**
	 * Returns the meta object for class '{@link modeloER.AtributoDerivadoClavePrimaria <em>Atributo Derivado Clave Primaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo Derivado Clave Primaria</em>'.
	 * @see modeloER.AtributoDerivadoClavePrimaria
	 * @generated
	 */
	EClass getAtributoDerivadoClavePrimaria();

	/**
	 * Returns the meta object for class '{@link modeloER.EntidadFuerte <em>Entidad Fuerte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Fuerte</em>'.
	 * @see modeloER.EntidadFuerte
	 * @generated
	 */
	EClass getEntidadFuerte();

	/**
	 * Returns the meta object for class '{@link modeloER.EntidadDebil <em>Entidad Debil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Debil</em>'.
	 * @see modeloER.EntidadDebil
	 * @generated
	 */
	EClass getEntidadDebil();

	/**
	 * Returns the meta object for enum '{@link modeloER.TipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Dato</em>'.
	 * @see modeloER.TipoDato
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
		 * The meta object literal for the '{@link modeloER.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.EntidadImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getEntidad()
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
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NOMBRE = eINSTANCE.getEntidad_Nombre();

		/**
		 * The meta object literal for the '{@link modeloER.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.AtributoImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

		/**
		 * The meta object literal for the '<em><b>Nulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__NULO = eINSTANCE.getAtributo_Nulo();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__TIPO_DATO = eINSTANCE.getAtributo_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Clave Primaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__CLAVE_PRIMARIA = eINSTANCE.getAtributo_ClavePrimaria();

		/**
		 * The meta object literal for the '<em><b>Clave Foranea</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTO__CLAVE_FORANEA = eINSTANCE.getAtributo_ClaveForanea();

		/**
		 * The meta object literal for the '<em><b>Atributos Atributo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATRIBUTO__ATRIBUTOS_ATRIBUTO = eINSTANCE.getAtributo_AtributosAtributo();

		/**
		 * The meta object literal for the '{@link modeloER.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.RelacionImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getRelacion()
		 * @generated
		 */
		EClass RELACION = eINSTANCE.getRelacion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELACION__NOMBRE = eINSTANCE.getRelacion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Atributos Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__ATRIBUTOS_RELACION = eINSTANCE.getRelacion_AtributosRelacion();

		/**
		 * The meta object literal for the '<em><b>Entidad Entidad Relacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELACION__ENTIDAD_ENTIDAD_RELACION = eINSTANCE.getRelacion_EntidadEntidadRelacion();

		/**
		 * The meta object literal for the '{@link modeloER.impl.DiagramaImpl <em>Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.DiagramaImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getDiagrama()
		 * @generated
		 */
		EClass DIAGRAMA = eINSTANCE.getDiagrama();

		/**
		 * The meta object literal for the '<em><b>Relaciones Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__RELACIONES_DEL_DIAGRAMA = eINSTANCE.getDiagrama_RelacionesDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributos Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTOS_DEL_DIAGRAMA = eINSTANCE.getDiagrama_AtributosDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Entidades Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDADES_DEL_DIAGRAMA = eINSTANCE.getDiagrama_EntidadesDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Herencias Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__HERENCIAS_DEL_DIAGRAMA = eINSTANCE.getDiagrama_HerenciasDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Entidad Relaciones Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDAD_RELACIONES_DEL_DIAGRAMA = eINSTANCE.getDiagrama_EntidadRelacionesDelDiagrama();

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
		 * The meta object literal for the '<em><b>Tipodebil Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__TIPODEBIL_DEL_DIAGRAMA = eINSTANCE.getDiagrama_TipodebilDelDiagrama();

		/**
		 * The meta object literal for the '<em><b>Tipofuerte Del Diagrama</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__TIPOFUERTE_DEL_DIAGRAMA = eINSTANCE.getDiagrama_TipofuerteDelDiagrama();

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
		 * The meta object literal for the '{@link modeloER.impl.EntidadRelacionImpl <em>Entidad Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.EntidadRelacionImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getEntidadRelacion()
		 * @generated
		 */
		EClass ENTIDAD_RELACION = eINSTANCE.getEntidadRelacion();

		/**
		 * The meta object literal for the '<em><b>Entidad Entidad Relacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_RELACION__ENTIDAD_ENTIDAD_RELACION = eINSTANCE.getEntidadRelacion_EntidadEntidadRelacion();

		/**
		 * The meta object literal for the '<em><b>Relacion Entidad Relacion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_RELACION__RELACION_ENTIDAD_RELACION = eINSTANCE.getEntidadRelacion_RelacionEntidadRelacion();

		/**
		 * The meta object literal for the '<em><b>Limite Inferior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD_RELACION__LIMITE_INFERIOR = eINSTANCE.getEntidadRelacion_LimiteInferior();

		/**
		 * The meta object literal for the '<em><b>Limite Superior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD_RELACION__LIMITE_SUPERIOR = eINSTANCE.getEntidadRelacion_LimiteSuperior();

		/**
		 * The meta object literal for the '{@link modeloER.impl.HerenciaImpl <em>Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.HerenciaImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getHerencia()
		 * @generated
		 */
		EClass HERENCIA = eINSTANCE.getHerencia();

		/**
		 * The meta object literal for the '<em><b>Entidad Padre Herencia</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__ENTIDAD_PADRE_HERENCIA = eINSTANCE.getHerencia_EntidadPadreHerencia();

		/**
		 * The meta object literal for the '<em><b>Entidades Hijas Herencia</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HERENCIA__ENTIDADES_HIJAS_HERENCIA = eINSTANCE.getHerencia_EntidadesHijasHerencia();

		/**
		 * The meta object literal for the '{@link modeloER.impl.AtributoDerivadoImpl <em>Atributo Derivado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.AtributoDerivadoImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getAtributoDerivado()
		 * @generated
		 */
		EClass ATRIBUTO_DERIVADO = eINSTANCE.getAtributoDerivado();

		/**
		 * The meta object literal for the '{@link modeloER.impl.AtributoMultivaluadoImpl <em>Atributo Multivaluado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.AtributoMultivaluadoImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getAtributoMultivaluado()
		 * @generated
		 */
		EClass ATRIBUTO_MULTIVALUADO = eINSTANCE.getAtributoMultivaluado();

		/**
		 * The meta object literal for the '{@link modeloER.impl.ClavePrimariaImpl <em>Clave Primaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.ClavePrimariaImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getClavePrimaria()
		 * @generated
		 */
		EClass CLAVE_PRIMARIA = eINSTANCE.getClavePrimaria();

		/**
		 * The meta object literal for the '{@link modeloER.impl.ClaveForaneaImpl <em>Clave Foranea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.ClaveForaneaImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getClaveForanea()
		 * @generated
		 */
		EClass CLAVE_FORANEA = eINSTANCE.getClaveForanea();

		/**
		 * The meta object literal for the '{@link modeloER.impl.ClavePrimariaForaneaImpl <em>Clave Primaria Foranea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.ClavePrimariaForaneaImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getClavePrimariaForanea()
		 * @generated
		 */
		EClass CLAVE_PRIMARIA_FORANEA = eINSTANCE.getClavePrimariaForanea();

		/**
		 * The meta object literal for the '{@link modeloER.impl.TipoDebilImpl <em>Tipo Debil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.TipoDebilImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getTipoDebil()
		 * @generated
		 */
		EClass TIPO_DEBIL = eINSTANCE.getTipoDebil();

		/**
		 * The meta object literal for the '{@link modeloER.impl.TipoFuerteImpl <em>Tipo Fuerte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.TipoFuerteImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getTipoFuerte()
		 * @generated
		 */
		EClass TIPO_FUERTE = eINSTANCE.getTipoFuerte();

		/**
		 * The meta object literal for the '{@link modeloER.impl.EntidadRelacionDebilImpl <em>Entidad Relacion Debil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.EntidadRelacionDebilImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getEntidadRelacionDebil()
		 * @generated
		 */
		EClass ENTIDAD_RELACION_DEBIL = eINSTANCE.getEntidadRelacionDebil();

		/**
		 * The meta object literal for the '{@link modeloER.impl.EntidadRelacionFuerteImpl <em>Entidad Relacion Fuerte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.EntidadRelacionFuerteImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getEntidadRelacionFuerte()
		 * @generated
		 */
		EClass ENTIDAD_RELACION_FUERTE = eINSTANCE.getEntidadRelacionFuerte();

		/**
		 * The meta object literal for the '{@link modeloER.impl.AtributoDerivadoClavePrimariaImpl <em>Atributo Derivado Clave Primaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.AtributoDerivadoClavePrimariaImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getAtributoDerivadoClavePrimaria()
		 * @generated
		 */
		EClass ATRIBUTO_DERIVADO_CLAVE_PRIMARIA = eINSTANCE.getAtributoDerivadoClavePrimaria();

		/**
		 * The meta object literal for the '{@link modeloER.impl.EntidadFuerteImpl <em>Entidad Fuerte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.EntidadFuerteImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getEntidadFuerte()
		 * @generated
		 */
		EClass ENTIDAD_FUERTE = eINSTANCE.getEntidadFuerte();

		/**
		 * The meta object literal for the '{@link modeloER.impl.EntidadDebilImpl <em>Entidad Debil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.impl.EntidadDebilImpl
		 * @see modeloER.impl.ModeloERPackageImpl#getEntidadDebil()
		 * @generated
		 */
		EClass ENTIDAD_DEBIL = eINSTANCE.getEntidadDebil();

		/**
		 * The meta object literal for the '{@link modeloER.TipoDato <em>Tipo Dato</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloER.TipoDato
		 * @see modeloER.impl.ModeloERPackageImpl#getTipoDato()
		 * @generated
		 */
		EEnum TIPO_DATO = eINSTANCE.getTipoDato();

	}

} //ModeloERPackage
