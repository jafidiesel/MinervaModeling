/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Herencia Hijo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoHerenciaDestino <em>Herencia Hijo Herencia Destino</em>}</li>
 *   <li>{@link modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoEntidadOrigen <em>Herencia Hijo Entidad Origen</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getLinkHerenciaHijo()
 * @model
 * @generated
 */
public interface LinkHerenciaHijo extends EObject {
	/**
	 * Returns the value of the '<em><b>Herencia Hijo Herencia Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencia Hijo Herencia Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencia Hijo Herencia Destino</em>' reference.
	 * @see #setHerenciaHijoHerenciaDestino(Herencia)
	 * @see modeloER.modeloER.ModeloERPackage#getLinkHerenciaHijo_HerenciaHijoHerenciaDestino()
	 * @model required="true"
	 * @generated
	 */
	Herencia getHerenciaHijoHerenciaDestino();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoHerenciaDestino <em>Herencia Hijo Herencia Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herencia Hijo Herencia Destino</em>' reference.
	 * @see #getHerenciaHijoHerenciaDestino()
	 * @generated
	 */
	void setHerenciaHijoHerenciaDestino(Herencia value);

	/**
	 * Returns the value of the '<em><b>Herencia Hijo Entidad Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Herencia Hijo Entidad Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Herencia Hijo Entidad Origen</em>' reference.
	 * @see #setHerenciaHijoEntidadOrigen(Entidad)
	 * @see modeloER.modeloER.ModeloERPackage#getLinkHerenciaHijo_HerenciaHijoEntidadOrigen()
	 * @model required="true"
	 * @generated
	 */
	Entidad getHerenciaHijoEntidadOrigen();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.LinkHerenciaHijo#getHerenciaHijoEntidadOrigen <em>Herencia Hijo Entidad Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herencia Hijo Entidad Origen</em>' reference.
	 * @see #getHerenciaHijoEntidadOrigen()
	 * @generated
	 */
	void setHerenciaHijoEntidadOrigen(Entidad value);

} // LinkHerenciaHijo
