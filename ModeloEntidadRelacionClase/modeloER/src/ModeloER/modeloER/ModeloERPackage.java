/**
 */
package ModeloER.modeloER;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ModeloER.modeloER.ModeloERFactory
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
	ModeloERPackage eINSTANCE = ModeloER.modeloER.impl.ModeloERPackageImpl.init();

	/**
	 * The meta object id for the '{@link ModeloER.modeloER.impl.DiagramaImpl <em>Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeloER.modeloER.impl.DiagramaImpl
	 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getDiagrama()
	 * @generated
	 */
	int DIAGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Atributo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ATRIBUTO = 0;

	/**
	 * The feature id for the '<em><b>Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__RELACION = 1;

	/**
	 * The feature id for the '<em><b>Entidad Relacion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDAD_RELACION = 2;

	/**
	 * The feature id for the '<em><b>Entidad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ENTIDAD = 3;

	/**
	 * The number of structural features of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModeloER.modeloER.impl.EntidadImpl <em>Entidad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeloER.modeloER.impl.EntidadImpl
	 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getEntidad()
	 * @generated
	 */
	int ENTIDAD = 1;

	/**
	 * The feature id for the '<em><b>Entidad Atributos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD__ENTIDAD_ATRIBUTOS = 0;

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
	 * The meta object id for the '{@link ModeloER.modeloER.impl.RelacionImpl <em>Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeloER.modeloER.impl.RelacionImpl
	 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getRelacion()
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
	 * The number of structural features of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELACION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModeloER.modeloER.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeloER.modeloER.impl.AtributoImpl
	 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NOMBRE = 0;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ModeloER.modeloER.impl.EntidadRelacionImpl <em>Entidad Relacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ModeloER.modeloER.impl.EntidadRelacionImpl
	 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacion()
	 * @generated
	 */
	int ENTIDAD_RELACION = 4;

	/**
	 * The feature id for the '<em><b>Relacion Entidades</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__RELACION_ENTIDADES = 0;

	/**
	 * The feature id for the '<em><b>Entidad Relacion Relaciones</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES = 1;

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
	 * Returns the meta object for class '{@link ModeloER.modeloER.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama</em>'.
	 * @see ModeloER.modeloER.Diagrama
	 * @generated
	 */
	EClass getDiagrama();

	/**
	 * Returns the meta object for the containment reference list '{@link ModeloER.modeloER.Diagrama#getAtributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributo</em>'.
	 * @see ModeloER.modeloER.Diagrama#getAtributo()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_Atributo();

	/**
	 * Returns the meta object for the containment reference list '{@link ModeloER.modeloER.Diagrama#getRelacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relacion</em>'.
	 * @see ModeloER.modeloER.Diagrama#getRelacion()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_Relacion();

	/**
	 * Returns the meta object for the containment reference list '{@link ModeloER.modeloER.Diagrama#getEntidadRelacion <em>Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidad Relacion</em>'.
	 * @see ModeloER.modeloER.Diagrama#getEntidadRelacion()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_EntidadRelacion();

	/**
	 * Returns the meta object for the containment reference list '{@link ModeloER.modeloER.Diagrama#getEntidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entidad</em>'.
	 * @see ModeloER.modeloER.Diagrama#getEntidad()
	 * @see #getDiagrama()
	 * @generated
	 */
	EReference getDiagrama_Entidad();

	/**
	 * Returns the meta object for class '{@link ModeloER.modeloER.Entidad <em>Entidad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad</em>'.
	 * @see ModeloER.modeloER.Entidad
	 * @generated
	 */
	EClass getEntidad();

	/**
	 * Returns the meta object for the reference list '{@link ModeloER.modeloER.Entidad#getEntidadAtributos <em>Entidad Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entidad Atributos</em>'.
	 * @see ModeloER.modeloER.Entidad#getEntidadAtributos()
	 * @see #getEntidad()
	 * @generated
	 */
	EReference getEntidad_EntidadAtributos();

	/**
	 * Returns the meta object for the attribute '{@link ModeloER.modeloER.Entidad#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ModeloER.modeloER.Entidad#getNombre()
	 * @see #getEntidad()
	 * @generated
	 */
	EAttribute getEntidad_Nombre();

	/**
	 * Returns the meta object for class '{@link ModeloER.modeloER.Relacion <em>Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relacion</em>'.
	 * @see ModeloER.modeloER.Relacion
	 * @generated
	 */
	EClass getRelacion();

	/**
	 * Returns the meta object for the attribute '{@link ModeloER.modeloER.Relacion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ModeloER.modeloER.Relacion#getNombre()
	 * @see #getRelacion()
	 * @generated
	 */
	EAttribute getRelacion_Nombre();

	/**
	 * Returns the meta object for class '{@link ModeloER.modeloER.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see ModeloER.modeloER.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for the attribute '{@link ModeloER.modeloER.Atributo#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see ModeloER.modeloER.Atributo#getNombre()
	 * @see #getAtributo()
	 * @generated
	 */
	EAttribute getAtributo_Nombre();

	/**
	 * Returns the meta object for class '{@link ModeloER.modeloER.EntidadRelacion <em>Entidad Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entidad Relacion</em>'.
	 * @see ModeloER.modeloER.EntidadRelacion
	 * @generated
	 */
	EClass getEntidadRelacion();

	/**
	 * Returns the meta object for the reference '{@link ModeloER.modeloER.EntidadRelacion#getRelacionEntidades <em>Relacion Entidades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relacion Entidades</em>'.
	 * @see ModeloER.modeloER.EntidadRelacion#getRelacionEntidades()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EReference getEntidadRelacion_RelacionEntidades();

	/**
	 * Returns the meta object for the reference '{@link ModeloER.modeloER.EntidadRelacion#getEntidadRelacionRelaciones <em>Entidad Relacion Relaciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entidad Relacion Relaciones</em>'.
	 * @see ModeloER.modeloER.EntidadRelacion#getEntidadRelacionRelaciones()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EReference getEntidadRelacion_EntidadRelacionRelaciones();

	/**
	 * Returns the meta object for the attribute '{@link ModeloER.modeloER.EntidadRelacion#getLimiteInferior <em>Limite Inferior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite Inferior</em>'.
	 * @see ModeloER.modeloER.EntidadRelacion#getLimiteInferior()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EAttribute getEntidadRelacion_LimiteInferior();

	/**
	 * Returns the meta object for the attribute '{@link ModeloER.modeloER.EntidadRelacion#getLimiteSuperior <em>Limite Superior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limite Superior</em>'.
	 * @see ModeloER.modeloER.EntidadRelacion#getLimiteSuperior()
	 * @see #getEntidadRelacion()
	 * @generated
	 */
	EAttribute getEntidadRelacion_LimiteSuperior();

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
		 * The meta object literal for the '{@link ModeloER.modeloER.impl.DiagramaImpl <em>Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeloER.modeloER.impl.DiagramaImpl
		 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getDiagrama()
		 * @generated
		 */
		EClass DIAGRAMA = eINSTANCE.getDiagrama();

		/**
		 * The meta object literal for the '<em><b>Atributo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ATRIBUTO = eINSTANCE.getDiagrama_Atributo();

		/**
		 * The meta object literal for the '<em><b>Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__RELACION = eINSTANCE.getDiagrama_Relacion();

		/**
		 * The meta object literal for the '<em><b>Entidad Relacion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDAD_RELACION = eINSTANCE.getDiagrama_EntidadRelacion();

		/**
		 * The meta object literal for the '<em><b>Entidad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAMA__ENTIDAD = eINSTANCE.getDiagrama_Entidad();

		/**
		 * The meta object literal for the '{@link ModeloER.modeloER.impl.EntidadImpl <em>Entidad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeloER.modeloER.impl.EntidadImpl
		 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getEntidad()
		 * @generated
		 */
		EClass ENTIDAD = eINSTANCE.getEntidad();

		/**
		 * The meta object literal for the '<em><b>Entidad Atributos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD__ENTIDAD_ATRIBUTOS = eINSTANCE.getEntidad_EntidadAtributos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTIDAD__NOMBRE = eINSTANCE.getEntidad_Nombre();

		/**
		 * The meta object literal for the '{@link ModeloER.modeloER.impl.RelacionImpl <em>Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeloER.modeloER.impl.RelacionImpl
		 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getRelacion()
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
		 * The meta object literal for the '{@link ModeloER.modeloER.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeloER.modeloER.impl.AtributoImpl
		 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getAtributo()
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
		 * The meta object literal for the '{@link ModeloER.modeloER.impl.EntidadRelacionImpl <em>Entidad Relacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ModeloER.modeloER.impl.EntidadRelacionImpl
		 * @see ModeloER.modeloER.impl.ModeloERPackageImpl#getEntidadRelacion()
		 * @generated
		 */
		EClass ENTIDAD_RELACION = eINSTANCE.getEntidadRelacion();

		/**
		 * The meta object literal for the '<em><b>Relacion Entidades</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_RELACION__RELACION_ENTIDADES = eINSTANCE.getEntidadRelacion_RelacionEntidades();

		/**
		 * The meta object literal for the '<em><b>Entidad Relacion Relaciones</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTIDAD_RELACION__ENTIDAD_RELACION_RELACIONES = eINSTANCE.getEntidadRelacion_EntidadRelacionRelaciones();

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

	}

} //ModeloERPackage
