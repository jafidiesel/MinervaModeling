/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo Entidad Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.AtributoEntidadLink#getEntidadAtributoLinkOrigen <em>Entidad Atributo Link Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.AtributoEntidadLink#getAtributoEntidadLinkDestino <em>Atributo Entidad Link Destino</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getAtributoEntidadLink()
 * @model
 * @generated
 */
public interface AtributoEntidadLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad Atributo Link Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Atributo Link Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Atributo Link Origen</em>' reference.
	 * @see #setEntidadAtributoLinkOrigen(Entidad)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributoEntidadLink_EntidadAtributoLinkOrigen()
	 * @model required="true"
	 * @generated
	 */
	Entidad getEntidadAtributoLinkOrigen();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.AtributoEntidadLink#getEntidadAtributoLinkOrigen <em>Entidad Atributo Link Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad Atributo Link Origen</em>' reference.
	 * @see #getEntidadAtributoLinkOrigen()
	 * @generated
	 */
	void setEntidadAtributoLinkOrigen(Entidad value);

	/**
	 * Returns the value of the '<em><b>Atributo Entidad Link Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributo Entidad Link Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo Entidad Link Destino</em>' reference.
	 * @see #setAtributoEntidadLinkDestino(Atributo)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributoEntidadLink_AtributoEntidadLinkDestino()
	 * @model required="true"
	 * @generated
	 */
	Atributo getAtributoEntidadLinkDestino();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.AtributoEntidadLink#getAtributoEntidadLinkDestino <em>Atributo Entidad Link Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributo Entidad Link Destino</em>' reference.
	 * @see #getAtributoEntidadLinkDestino()
	 * @generated
	 */
	void setAtributoEntidadLinkDestino(Atributo value);

} // AtributoEntidadLink
