/**
 */
package ModeloER.modeloER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModeloER.modeloER.Diagrama#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link ModeloER.modeloER.Diagrama#getRelacion <em>Relacion</em>}</li>
 *   <li>{@link ModeloER.modeloER.Diagrama#getEntidadRelacion <em>Entidad Relacion</em>}</li>
 *   <li>{@link ModeloER.modeloER.Diagrama#getEntidad <em>Entidad</em>}</li>
 * </ul>
 *
 * @see ModeloER.modeloER.ModeloERPackage#getDiagrama()
 * @model
 * @generated
 */
public interface Diagrama extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributo</b></em>' containment reference list.
	 * The list contents are of type {@link ModeloER.modeloER.Atributo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributo</em>' containment reference list.
	 * @see ModeloER.modeloER.ModeloERPackage#getDiagrama_Atributo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributo> getAtributo();

	/**
	 * Returns the value of the '<em><b>Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link ModeloER.modeloER.Relacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relacion</em>' containment reference list.
	 * @see ModeloER.modeloER.ModeloERPackage#getDiagrama_Relacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relacion> getRelacion();

	/**
	 * Returns the value of the '<em><b>Entidad Relacion</b></em>' containment reference list.
	 * The list contents are of type {@link ModeloER.modeloER.EntidadRelacion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad Relacion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad Relacion</em>' containment reference list.
	 * @see ModeloER.modeloER.ModeloERPackage#getDiagrama_EntidadRelacion()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntidadRelacion> getEntidadRelacion();

	/**
	 * Returns the value of the '<em><b>Entidad</b></em>' containment reference list.
	 * The list contents are of type {@link ModeloER.modeloER.Entidad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entidad</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entidad</em>' containment reference list.
	 * @see ModeloER.modeloER.ModeloERPackage#getDiagrama_Entidad()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entidad> getEntidad();

} // Diagrama
