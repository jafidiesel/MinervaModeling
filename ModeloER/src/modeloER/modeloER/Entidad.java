/**
 */
package modeloER.modeloER;

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
 *   <li>{@link modeloER.modeloER.Entidad#getAtributosEntidad <em>Atributos Entidad</em>}</li>
 *   <li>{@link modeloER.modeloER.Entidad#getNombreEntidad <em>Nombre Entidad</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getEntidad()
 * @model
 * @generated
 */
public interface Entidad extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributos Entidad</b></em>' containment reference list.
	 * The list contents are of type {@link modeloER.modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos Entidad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos Entidad</em>' containment reference list.
	 * @see modeloER.modeloER.ModeloERPackage#getEntidad_AtributosEntidad()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributosEntidad();

	/**
	 * Returns the value of the '<em><b>Nombre Entidad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Entidad</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Entidad</em>' attribute.
	 * @see #setNombreEntidad(String)
	 * @see modeloER.modeloER.ModeloERPackage#getEntidad_NombreEntidad()
	 * @model
	 * @generated
	 */
	String getNombreEntidad();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.Entidad#getNombreEntidad <em>Nombre Entidad</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Entidad</em>' attribute.
	 * @see #getNombreEntidad()
	 * @generated
	 */
	void setNombreEntidad(String value);

} // Entidad
