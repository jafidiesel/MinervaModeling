/**
 */
package modeloER.modeloER;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link ASAC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloER.modeloER.LinkASAC#getAtributocompuestoOrigen <em>Atributocompuesto Origen</em>}</li>
 *   <li>{@link modeloER.modeloER.LinkASAC#getAtributosimpleDestino <em>Atributosimple Destino</em>}</li>
 * </ul>
 *
 * @see modeloER.modeloER.ModeloERPackage#getLinkASAC()
 * @model
 * @generated
 */
public interface LinkASAC extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributocompuesto Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributocompuesto Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributocompuesto Origen</em>' reference.
	 * @see #setAtributocompuestoOrigen(AtributoCompuesto)
	 * @see modeloER.modeloER.ModeloERPackage#getLinkASAC_AtributocompuestoOrigen()
	 * @model required="true"
	 * @generated
	 */
	AtributoCompuesto getAtributocompuestoOrigen();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.LinkASAC#getAtributocompuestoOrigen <em>Atributocompuesto Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributocompuesto Origen</em>' reference.
	 * @see #getAtributocompuestoOrigen()
	 * @generated
	 */
	void setAtributocompuestoOrigen(AtributoCompuesto value);

	/**
	 * Returns the value of the '<em><b>Atributosimple Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributosimple Destino</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributosimple Destino</em>' reference.
	 * @see #setAtributosimpleDestino(AtributoSimple)
	 * @see modeloER.modeloER.ModeloERPackage#getLinkASAC_AtributosimpleDestino()
	 * @model required="true"
	 * @generated
	 */
	AtributoSimple getAtributosimpleDestino();

	/**
	 * Sets the value of the '{@link modeloER.modeloER.LinkASAC#getAtributosimpleDestino <em>Atributosimple Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atributosimple Destino</em>' reference.
	 * @see #getAtributosimpleDestino()
	 * @generated
	 */
	void setAtributosimpleDestino(AtributoSimple value);

} // LinkASAC
