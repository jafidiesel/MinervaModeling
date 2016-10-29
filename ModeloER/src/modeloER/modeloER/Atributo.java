/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.Atributo#getNombreAtributo <em>Nombre Atributo</em>}</li>
 *   <li>{@link modeloER.modeloER.Atributo#isNuloAtributo <em>Nulo Atributo</em>}</li>
 *   <li>{@link modeloER.modeloER.Atributo#getTipoDatoAtributo <em>Tipo Dato Atributo</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Atributo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Atributo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Atributo</em>' attribute.
	 * @see #setNombreAtributo(String)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributo_NombreAtributo()
	 * @model
	 * @generated
	 */
	String getNombreAtributo();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Atributo#getNombreAtributo <em>Nombre Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Atributo</em>' attribute.
	 * @see #getNombreAtributo()
	 * @generated
	 */
	void setNombreAtributo(String value);

	/**
	 * Returns the value of the '<em><b>Nulo Atributo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nulo Atributo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nulo Atributo</em>' attribute.
	 * @see #setNuloAtributo(boolean)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributo_NuloAtributo()
	 * @model default="false"
	 * @generated
	 */
	boolean isNuloAtributo();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Atributo#isNuloAtributo <em>Nulo Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nulo Atributo</em>' attribute.
	 * @see #isNuloAtributo()
	 * @generated
	 */
	void setNuloAtributo(boolean value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato Atributo</b></em>' attribute.
	 * The default value is <code>"varchar"</code>.
	 * The literals are from the enumeration {@link modeloER.modeloER.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato Atributo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato Atributo</em>' attribute.
	 * @see modeloER.modeloER.TipoDato
	 * @see #setTipoDatoAtributo(TipoDato)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributo_TipoDatoAtributo()
	 * @model default="varchar"
	 * @generated
	 */
	TipoDato getTipoDatoAtributo();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Atributo#getTipoDatoAtributo <em>Tipo Dato Atributo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato Atributo</em>' attribute.
	 * @see modeloER.modeloER.TipoDato
	 * @see #getTipoDatoAtributo()
	 * @generated
	 */
	void setTipoDatoAtributo(TipoDato value);

} // Atributo
