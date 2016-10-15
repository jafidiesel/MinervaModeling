/**
 */
package ModeloER.modeloER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModeloER.modeloER.Entidad#getEntidadAtributos <em>Entidad Atributos</em>}</li>
 *   <li>{@link ModeloER.modeloER.Entidad#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see ModeloER.modeloER.ModeloERPackage#getEntidad()
 * @model
 * @generated
 */
public interface Entidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Entidad Atributos</b></em>' reference list.
	 * The list contents are of type {@link ModeloER.modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Atributos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Atributos</em>' reference list.
	 * @see ModeloER.modeloER.ModeloERPackage#getEntidad_EntidadAtributos()
	 * @model required="true"
	 * @generated
	 */
	EList<Atributo> getEntidadAtributos();

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
	 * @see ModeloER.modeloER.ModeloERPackage#getEntidad_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link ModeloER.modeloER.Entidad#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

} // Entidad
