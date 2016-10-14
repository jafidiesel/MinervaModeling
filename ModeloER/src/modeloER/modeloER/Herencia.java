/**
 */
package modeloER.modeloER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Herencia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.Herencia#getEntidadPadreHerencia <em>Entidad Padre Herencia</em>}</li>
 *   <li>{@link modeloER.modeloER.Herencia#getEntidadesHijasHerencia <em>Entidades Hijas Herencia</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getHerencia()
 * @model
 * @generated
 */
public interface Herencia extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad Padre Herencia</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Padre Herencia</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Padre Herencia</em>' reference.
	 * @see #setEntidadPadreHerencia(Entidad)
	 * @see modeloER.modeloER.ModeloERPackage#getHerencia_EntidadPadreHerencia()
	 * @model required="true"
	 * @generated
	 */
	Entidad getEntidadPadreHerencia();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Herencia#getEntidadPadreHerencia <em>Entidad Padre Herencia</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad Padre Herencia</em>' reference.
	 * @see #getEntidadPadreHerencia()
	 * @generated
	 */
	void setEntidadPadreHerencia(Entidad value);

	/**
	 * Returns the value of the '<em><b>Entidades Hijas Herencia</b></em>' reference list.
	 * The list contents are of type {@link modeloER.modeloER.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidades Hijas Herencia</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidades Hijas Herencia</em>' reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getHerencia_EntidadesHijasHerencia()
	 * @model required="true"
	 * @generated
	 */
	EList<Entidad> getEntidadesHijasHerencia();

} // Herencia
