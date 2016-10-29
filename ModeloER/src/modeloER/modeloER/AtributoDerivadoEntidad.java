/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Derivado Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.AtributoDerivadoEntidad#getEntidadAtributoDerivadoOrigen <em>Entidad Atributo Derivado Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoclaveprimariaDestino <em>Atributoderivadoclaveprimaria Destino</em>}</li>
 *   <li>{@link modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoDestino <em>Atributoderivado Destino</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getAtributoDerivadoEntidad()
 * @model
 * @generated
 */
public interface AtributoDerivadoEntidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad Atributo Derivado Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Atributo Derivado Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Atributo Derivado Origen</em>' reference.
	 * @see #setEntidadAtributoDerivadoOrigen(Entidad)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributoDerivadoEntidad_EntidadAtributoDerivadoOrigen()
	 * @model required="true"
	 * @generated
	 */
	Entidad getEntidadAtributoDerivadoOrigen();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.AtributoDerivadoEntidad#getEntidadAtributoDerivadoOrigen <em>Entidad Atributo Derivado Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad Atributo Derivado Origen</em>' reference.
	 * @see #getEntidadAtributoDerivadoOrigen()
	 * @generated
	 */
	void setEntidadAtributoDerivadoOrigen(Entidad value);

	/**
	 * Returns the value of the '<em><b>Atributoderivadoclaveprimaria Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivadoclaveprimaria Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivadoclaveprimaria Destino</em>' reference.
	 * @see #setAtributoderivadoclaveprimariaDestino(AtributoDerivadoClavePrimaria)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributoDerivadoEntidad_AtributoderivadoclaveprimariaDestino()
	 * @model required="true"
	 * @generated
	 */
	AtributoDerivadoClavePrimaria getAtributoderivadoclaveprimariaDestino();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoclaveprimariaDestino <em>Atributoderivadoclaveprimaria Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributoderivadoclaveprimaria Destino</em>' reference.
	 * @see #getAtributoderivadoclaveprimariaDestino()
	 * @generated
	 */
	void setAtributoderivadoclaveprimariaDestino(AtributoDerivadoClavePrimaria value);

	/**
	 * Returns the value of the '<em><b>Atributoderivado Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributoderivado Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributoderivado Destino</em>' reference.
	 * @see #setAtributoderivadoDestino(AtributoDerivado)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributoDerivadoEntidad_AtributoderivadoDestino()
	 * @model required="true"
	 * @generated
	 */
	AtributoDerivado getAtributoderivadoDestino();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.AtributoDerivadoEntidad#getAtributoderivadoDestino <em>Atributoderivado Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributoderivado Destino</em>' reference.
	 * @see #getAtributoderivadoDestino()
	 * @generated
	 */
	void setAtributoderivadoDestino(AtributoDerivado value);

} // AtributoDerivadoEntidad
