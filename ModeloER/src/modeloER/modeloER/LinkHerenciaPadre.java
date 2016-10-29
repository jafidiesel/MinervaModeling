/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Herencia Padre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.LinkHerenciaPadre#getLinkHerenciaPadreHerenciaDestino <em>Link Herencia Padre Herencia Destino</em>}</li>
 *   <li>{@link modeloER.modeloER.LinkHerenciaPadre#getHerenciaPadreEntidadOrigen <em>Herencia Padre Entidad Origen</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getLinkHerenciaPadre()
 * @model
 * @generated
 */
public interface LinkHerenciaPadre extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Herencia Padre Herencia Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Herencia Padre Herencia Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Herencia Padre Herencia Destino</em>' reference.
	 * @see #setLinkHerenciaPadreHerenciaDestino(Herencia)
	 * @see modeloER.modeloER.ModeloERPackage#getLinkHerenciaPadre_LinkHerenciaPadreHerenciaDestino()
	 * @model required="true"
	 * @generated
	 */
	Herencia getLinkHerenciaPadreHerenciaDestino();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.LinkHerenciaPadre#getLinkHerenciaPadreHerenciaDestino <em>Link Herencia Padre Herencia Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Herencia Padre Herencia Destino</em>' reference.
	 * @see #getLinkHerenciaPadreHerenciaDestino()
	 * @generated
	 */
	void setLinkHerenciaPadreHerenciaDestino(Herencia value);

	/**
	 * Returns the value of the '<em><b>Herencia Padre Entidad Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencia Padre Entidad Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencia Padre Entidad Origen</em>' reference.
	 * @see #setHerenciaPadreEntidadOrigen(Entidad)
	 * @see modeloER.modeloER.ModeloERPackage#getLinkHerenciaPadre_HerenciaPadreEntidadOrigen()
	 * @model required="true"
	 * @generated
	 */
	Entidad getHerenciaPadreEntidadOrigen();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.LinkHerenciaPadre#getHerenciaPadreEntidadOrigen <em>Herencia Padre Entidad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herencia Padre Entidad Origen</em>' reference.
	 * @see #getHerenciaPadreEntidadOrigen()
	 * @generated
	 */
	void setHerenciaPadreEntidadOrigen(Entidad value);

} // LinkHerenciaPadre
