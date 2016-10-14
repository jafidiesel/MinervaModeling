/**
 */
package modeloER.modeloER;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link modeloER.modeloER.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloER.modeloER.Atributo#isNulo <em>Nulo</em>}</li>
 *   <li>{@link modeloER.modeloER.Atributo#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link modeloER.modeloER.Atributo#getAtributosAtributo <em>Atributos Atributo</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributo_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Atributo#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Nulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nulo</em>' attribute.
	 * @see #setNulo(boolean)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributo_Nulo()
	 * @model
	 * @generated
	 */
	boolean isNulo();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Atributo#isNulo <em>Nulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nulo</em>' attribute.
	 * @see #isNulo()
	 * @generated
	 */
	void setNulo(boolean value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * The literals are from the enumeration {@link modeloER.modeloER.TipoDato}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Dato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see modeloER.modeloER.TipoDato
	 * @see #setTipoDato(TipoDato)
	 * @see modeloER.modeloER.ModeloERPackage#getAtributo_TipoDato()
	 * @model
	 * @generated
	 */
	TipoDato getTipoDato();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Atributo#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see modeloER.modeloER.TipoDato
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(TipoDato value);

	/**
	 * Returns the value of the '<em><b>Atributos Atributo</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos Atributo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos Atributo</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getAtributo_AtributosAtributo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributosAtributo();

} // Atributo
