/**
 */
package modeloER;

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
 *   <li>{@link modeloER.Relacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloER.Relacion#getAtributosRelacion <em>Atributos Relacion</em>}</li>
 *   <li>{@link modeloER.Relacion#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}</li>
 * </ul>
 *
 * @see modeloER.ModeloERPackage#getRelacion()
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
	 * @see modeloER.ModeloERPackage#getRelacion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link modeloER.Relacion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Atributos Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos Relacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos Relacion</em>' containment reference list.
	 * @see modeloER.ModeloERPackage#getRelacion_AtributosRelacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributosRelacion();

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
	 * @see modeloER.ModeloERPackage#getRelacion_EntidadEntidadRelacion()
	 * @model required="true"
	 * @generated
	 */
	Entidad getEntidadEntidadRelacion();

	/**
	 * Sets the value of the '{@link modeloER.Relacion#getEntidadEntidadRelacion <em>Entidad Entidad Relacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entidad Entidad Relacion</em>' reference.
	 * @see #getEntidadEntidadRelacion()
	 * @generated
	 */
	void setEntidadEntidadRelacion(Entidad value);

} // Relacion
