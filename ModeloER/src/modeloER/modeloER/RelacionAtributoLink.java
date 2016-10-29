/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion Atributo Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoOrigen <em>Relacion Atributo Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoDestino <em>Relacion Atributo Destino</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getRelacionAtributoLink()
 * @model
 * @generated
 */
public interface RelacionAtributoLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Relacion Atributo Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion Atributo Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion Atributo Origen</em>' reference.
	 * @see #setRelacionAtributoOrigen(Relacion)
	 * @see modeloER.modeloER.ModeloERPackage#getRelacionAtributoLink_RelacionAtributoOrigen()
	 * @model required="true"
	 * @generated
	 */
	Relacion getRelacionAtributoOrigen();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoOrigen <em>Relacion Atributo Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion Atributo Origen</em>' reference.
	 * @see #getRelacionAtributoOrigen()
	 * @generated
	 */
	void setRelacionAtributoOrigen(Relacion value);

	/**
	 * Returns the value of the '<em><b>Relacion Atributo Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion Atributo Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion Atributo Destino</em>' reference.
	 * @see #setRelacionAtributoDestino(Atributo)
	 * @see modeloER.modeloER.ModeloERPackage#getRelacionAtributoLink_RelacionAtributoDestino()
	 * @model required="true"
	 * @generated
	 */
	Atributo getRelacionAtributoDestino();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.RelacionAtributoLink#getRelacionAtributoDestino <em>Relacion Atributo Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relacion Atributo Destino</em>' reference.
	 * @see #getRelacionAtributoDestino()
	 * @generated
	 */
	void setRelacionAtributoDestino(Atributo value);

} // RelacionAtributoLink
