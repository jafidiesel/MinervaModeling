/**
 */
package modeloER.modeloER;

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
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}</li>
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getRelacionEntidadRelacion <em>Relacion Entidad Relacion</em>}</li>
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getLimiteInferior <em>Limite Inferior</em>}</li>
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getLimiteSuperior <em>Limite Superior</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion()
 * @model
 * @generated
 */
public interface EntidadRelacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Entidad Relacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Entidad Relacion</em>' reference.
	 * @see #setEntidadEntidadRelacion(Entidad)
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_EntidadEntidadRelacion()
	 * @model required="true"
	 * @generated
	 */
	Entidad getEntidadEntidadRelacion();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad Entidad Relacion</em>' reference.
	 * @see #getEntidadEntidadRelacion()
	 * @generated
	 */
	void setEntidadEntidadRelacion(Entidad value);

	/**
	 * Returns the value of the '<em><b>Relacion Entidad Relacion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion Entidad Relacion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion Entidad Relacion</em>' reference.
	 * @see #setRelacionEntidadRelacion(Relacion)
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_RelacionEntidadRelacion()
	 * @model required="true"
	 * @generated
	 */
	Relacion getRelacionEntidadRelacion();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getRelacionEntidadRelacion <em>Relacion Entidad Relacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion Entidad Relacion</em>' reference.
	 * @see #getRelacionEntidadRelacion()
	 * @generated
	 */
	void setRelacionEntidadRelacion(Relacion value);

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
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_LimiteInferior()
	 * @model
	 * @generated
	 */
	String getLimiteInferior();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getLimiteInferior <em>Limite Inferior</em>}' attribute.
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
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_LimiteSuperior()
	 * @model
	 * @generated
	 */
	String getLimiteSuperior();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getLimiteSuperior <em>Limite Superior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Superior</em>' attribute.
	 * @see #getLimiteSuperior()
	 * @generated
	 */
	void setLimiteSuperior(String value);

} // EntidadRelacion
