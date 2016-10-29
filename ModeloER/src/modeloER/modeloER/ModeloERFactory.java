/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modeloER.modeloER.ModeloERPackage
 * @generated
 */
public interface ModeloERFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloERFactory eINSTANCE = modeloER.modeloER.impl.ModeloERFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad</em>'.
	 * @generated
	 */
	Entidad createEntidad();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion</em>'.
	 * @generated
	 */
	Relacion createRelacion();

	/**
	 * Returns a new object of class '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagrama</em>'.
	 * @generated
	 */
	Diagrama createDiagrama();

	/**
	 * Returns a new object of class '<em>Entidad Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Relacion</em>'.
	 * @generated
	 */
	EntidadRelacion createEntidadRelacion();

	/**
	 * Returns a new object of class '<em>Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Herencia</em>'.
	 * @generated
	 */
	Herencia createHerencia();

	/**
	 * Returns a new object of class '<em>Atributo Derivado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Derivado</em>'.
	 * @generated
	 */
	AtributoDerivado createAtributoDerivado();

	/**
	 * Returns a new object of class '<em>Atributo Multivaluado</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Multivaluado</em>'.
	 * @generated
	 */
	AtributoMultivaluado createAtributoMultivaluado();

	/**
	 * Returns a new object of class '<em>Clave Primaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clave Primaria</em>'.
	 * @generated
	 */
	ClavePrimaria createClavePrimaria();

	/**
	 * Returns a new object of class '<em>Clave Foranea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clave Foranea</em>'.
	 * @generated
	 */
	ClaveForanea createClaveForanea();

	/**
	 * Returns a new object of class '<em>Clave Primaria Foranea</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clave Primaria Foranea</em>'.
	 * @generated
	 */
	ClavePrimariaForanea createClavePrimariaForanea();

	/**
	 * Returns a new object of class '<em>Relacion Tipo Debil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion Tipo Debil</em>'.
	 * @generated
	 */
	RelacionTipoDebil createRelacionTipoDebil();

	/**
	 * Returns a new object of class '<em>Relacion Tipo Fuerte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion Tipo Fuerte</em>'.
	 * @generated
	 */
	RelacionTipoFuerte createRelacionTipoFuerte();

	/**
	 * Returns a new object of class '<em>Entidad Relacion Debil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Relacion Debil</em>'.
	 * @generated
	 */
	EntidadRelacionDebil createEntidadRelacionDebil();

	/**
	 * Returns a new object of class '<em>Entidad Relacion Fuerte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Relacion Fuerte</em>'.
	 * @generated
	 */
	EntidadRelacionFuerte createEntidadRelacionFuerte();

	/**
	 * Returns a new object of class '<em>Atributo Derivado Clave Primaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Derivado Clave Primaria</em>'.
	 * @generated
	 */
	AtributoDerivadoClavePrimaria createAtributoDerivadoClavePrimaria();

	/**
	 * Returns a new object of class '<em>Entidad Fuerte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Fuerte</em>'.
	 * @generated
	 */
	EntidadFuerte createEntidadFuerte();

	/**
	 * Returns a new object of class '<em>Entidad Debil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entidad Debil</em>'.
	 * @generated
	 */
	EntidadDebil createEntidadDebil();

	/**
	 * Returns a new object of class '<em>Atributo Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Simple</em>'.
	 * @generated
	 */
	AtributoSimple createAtributoSimple();

	/**
	 * Returns a new object of class '<em>Atributo Compuesto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Compuesto</em>'.
	 * @generated
	 */
	AtributoCompuesto createAtributoCompuesto();

	/**
	 * Returns a new object of class '<em>Link ASAC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link ASAC</em>'.
	 * @generated
	 */
	LinkASAC createLinkASAC();

	/**
	 * Returns a new object of class '<em>Atributo Entidad Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Entidad Link</em>'.
	 * @generated
	 */
	AtributoEntidadLink createAtributoEntidadLink();

	/**
	 * Returns a new object of class '<em>Link Herencia Padre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Herencia Padre</em>'.
	 * @generated
	 */
	LinkHerenciaPadre createLinkHerenciaPadre();

	/**
	 * Returns a new object of class '<em>Link Herencia Hijo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Herencia Hijo</em>'.
	 * @generated
	 */
	LinkHerenciaHijo createLinkHerenciaHijo();

	/**
	 * Returns a new object of class '<em>Atributo Derivado Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo Derivado Entidad</em>'.
	 * @generated
	 */
	AtributoDerivadoEntidad createAtributoDerivadoEntidad();

	/**
	 * Returns a new object of class '<em>Relacion Atributo Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relacion Atributo Link</em>'.
	 * @generated
	 */
	RelacionAtributoLink createRelacionAtributoLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeloERPackage getModeloERPackage();

} //ModeloERFactory
