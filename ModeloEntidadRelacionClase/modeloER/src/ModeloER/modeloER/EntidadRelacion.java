/**
 */
package ModeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModeloER.modeloER.EntidadRelacion#getRelacionEntidades <em>Relacion Entidades</em>}</li>
 *   <li>{@link ModeloER.modeloER.EntidadRelacion#getEntidadRelacionRelaciones <em>Entidad Relacion Relaciones</em>}</li>
 *   <li>{@link ModeloER.modeloER.EntidadRelacion#getLimiteInferior <em>Limite Inferior</em>}</li>
 *   <li>{@link ModeloER.modeloER.EntidadRelacion#getLimiteSuperior <em>Limite Superior</em>}</li>
 * </ul>
 *
 * @see ModeloER.modeloER.ModeloERPackage#getEntidadRelacion()
 * @model
 * @generated
 */
public interface EntidadRelacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Relacion Entidades</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion Entidades</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion Entidades</em>' reference.
	 * @see #setRelacionEntidades(Entidad)
	 * @see ModeloER.modeloER.ModeloERPackage#getEntidadRelacion_RelacionEntidades()
	 * @model required="true"
	 * @generated
	 */
	Entidad getRelacionEntidades();

	/**
	 * Sets the value of the '{@link ModeloER.modeloER.EntidadRelacion#getRelacionEntidades <em>Relacion Entidades</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion Entidades</em>' reference.
	 * @see #getRelacionEntidades()
	 * @generated
	 */
	void setRelacionEntidades(Entidad value);

	/**
	 * Returns the value of the '<em><b>Entidad Relacion Relaciones</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Relacion Relaciones</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Relacion Relaciones</em>' reference.
	 * @see #setEntidadRelacionRelaciones(Relacion)
	 * @see ModeloER.modeloER.ModeloERPackage#getEntidadRelacion_EntidadRelacionRelaciones()
	 * @model required="true"
	 * @generated
	 */
	Relacion getEntidadRelacionRelaciones();

	/**
	 * Sets the value of the '{@link ModeloER.modeloER.EntidadRelacion#getEntidadRelacionRelaciones <em>Entidad Relacion Relaciones</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad Relacion Relaciones</em>' reference.
	 * @see #getEntidadRelacionRelaciones()
	 * @generated
	 */
	void setEntidadRelacionRelaciones(Relacion value);

	/**
	 * Returns the value of the '<em><b>Limite Inferior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Inferior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Inferior</em>' attribute.
	 * @see #setLimiteInferior(String)
	 * @see ModeloER.modeloER.ModeloERPackage#getEntidadRelacion_LimiteInferior()
	 * @model
	 * @generated
	 */
	String getLimiteInferior();

	/**
	 * Sets the value of the '{@link ModeloER.modeloER.EntidadRelacion#getLimiteInferior <em>Limite Inferior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Inferior</em>' attribute.
	 * @see #getLimiteInferior()
	 * @generated
	 */
	void setLimiteInferior(String value);

	/**
	 * Returns the value of the '<em><b>Limite Superior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Superior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Superior</em>' attribute.
	 * @see #setLimiteSuperior(String)
	 * @see ModeloER.modeloER.ModeloERPackage#getEntidadRelacion_LimiteSuperior()
	 * @model
	 * @generated
	 */
	String getLimiteSuperior();

	/**
	 * Sets the value of the '{@link ModeloER.modeloER.EntidadRelacion#getLimiteSuperior <em>Limite Superior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Superior</em>' attribute.
	 * @see #getLimiteSuperior()
	 * @generated
	 */
	void setLimiteSuperior(String value);

} // EntidadRelacion
