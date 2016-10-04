/**
 */
package modeloER;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modeloER.ModeloERPackage
 * @generated
 */
public interface ModeloERFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloERFactory eINSTANCE = modeloER.impl.ModeloERFactoryImpl.init();

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
	 * Returns a new object of class '<em>Tipo Debil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Debil</em>'.
	 * @generated
	 */
	TipoDebil createTipoDebil();

	/**
	 * Returns a new object of class '<em>Tipo Fuerte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tipo Fuerte</em>'.
	 * @generated
	 */
	TipoFuerte createTipoFuerte();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModeloERPackage getModeloERPackage();

} //ModeloERFactory
