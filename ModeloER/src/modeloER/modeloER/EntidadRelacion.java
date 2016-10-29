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
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getEntidadERLink <em>Entidad ER Link</em>}</li>
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getRelacionERLink <em>Relacion ER Link</em>}</li>
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getLimiteInferiorER <em>Limite Inferior ER</em>}</li>
 *   <li>{@link modeloER.modeloER.EntidadRelacion#getLimiteSuperiorER <em>Limite Superior ER</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion()
 * @model
 * @generated
 */
public interface EntidadRelacion extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad ER Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad ER Link</em>' reference.
	 * @see #setEntidadERLink(Entidad)
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_EntidadERLink()
	 * @model required="true"
	 * @generated
	 */
	Entidad getEntidadERLink();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getEntidadERLink <em>Entidad ER Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad ER Link</em>' reference.
	 * @see #getEntidadERLink()
	 * @generated
	 */
	void setEntidadERLink(Entidad value);

	/**
	 * Returns the value of the '<em><b>Relacion ER Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion ER Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion ER Link</em>' reference.
	 * @see #setRelacionERLink(Relacion)
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_RelacionERLink()
	 * @model required="true"
	 * @generated
	 */
	Relacion getRelacionERLink();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getRelacionERLink <em>Relacion ER Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion ER Link</em>' reference.
	 * @see #getRelacionERLink()
	 * @generated
	 */
	void setRelacionERLink(Relacion value);

	/**
	 * Returns the value of the '<em><b>Limite Inferior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Inferior ER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Inferior ER</em>' attribute.
	 * @see #setLimiteInferiorER(String)
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_LimiteInferiorER()
	 * @model
	 * @generated
	 */
	String getLimiteInferiorER();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getLimiteInferiorER <em>Limite Inferior ER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Inferior ER</em>' attribute.
	 * @see #getLimiteInferiorER()
	 * @generated
	 */
	void setLimiteInferiorER(String value);

	/**
	 * Returns the value of the '<em><b>Limite Superior ER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Superior ER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Superior ER</em>' attribute.
	 * @see #setLimiteSuperiorER(String)
	 * @see modeloER.modeloER.ModeloERPackage#getEntidadRelacion_LimiteSuperiorER()
	 * @model
	 * @generated
	 */
	String getLimiteSuperiorER();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.EntidadRelacion#getLimiteSuperiorER <em>Limite Superior ER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limite Superior ER</em>' attribute.
	 * @see #getLimiteSuperiorER()
	 * @generated
	 */
	void setLimiteSuperiorER(String value);

} // EntidadRelacion
