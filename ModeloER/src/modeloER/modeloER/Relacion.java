/**
 */
package modeloER.modeloER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.Relacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloER.modeloER.Relacion#getAtributosRelacion <em>Atributos Relacion</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getRelacion()
 * @model
 * @generated
 */
public interface Relacion extends EObject {
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
	 * @see modeloER.modeloER.ModeloERPackage#getRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Relacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos Relacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos Relacion</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getRelacion_AtributosRelacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributosRelacion();

} // Relacion
