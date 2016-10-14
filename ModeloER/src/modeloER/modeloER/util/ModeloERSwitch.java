/**
 */
package modeloER.modeloER.util;

import modeloER.modeloER.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see modeloER.modeloER.ModeloERPackage
 * @generated
 */
public class ModeloERSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModeloERPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloERSwitch() {
		if (modelPackage == null) {
			modelPackage = ModeloERPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModeloERPackage.ENTIDAD: {
				Entidad entidad = (Entidad)theEObject;
				T result = caseEntidad(entidad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ATRIBUTO: {
				Atributo atributo = (Atributo)theEObject;
				T result = caseAtributo(atributo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.RELACION: {
				Relacion relacion = (Relacion)theEObject;
				T result = caseRelacion(relacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.DIAGRAMA: {
				Diagrama diagrama = (Diagrama)theEObject;
				T result = caseDiagrama(diagrama);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ENTIDAD_RELACION: {
				EntidadRelacion entidadRelacion = (EntidadRelacion)theEObject;
				T result = caseEntidadRelacion(entidadRelacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.HERENCIA: {
				Herencia herencia = (Herencia)theEObject;
				T result = caseHerencia(herencia);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ATRIBUTO_DERIVADO: {
				AtributoDerivado atributoDerivado = (AtributoDerivado)theEObject;
				T result = caseAtributoDerivado(atributoDerivado);
				if (result == null) result = caseAtributo(atributoDerivado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ATRIBUTO_MULTIVALUADO: {
				AtributoMultivaluado atributoMultivaluado = (AtributoMultivaluado)theEObject;
				T result = caseAtributoMultivaluado(atributoMultivaluado);
				if (result == null) result = caseAtributo(atributoMultivaluado);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.CLAVE_PRIMARIA: {
				ClavePrimaria clavePrimaria = (ClavePrimaria)theEObject;
				T result = caseClavePrimaria(clavePrimaria);
				if (result == null) result = caseAtributo(clavePrimaria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.CLAVE_FORANEA: {
				ClaveForanea claveForanea = (ClaveForanea)theEObject;
				T result = caseClaveForanea(claveForanea);
				if (result == null) result = caseAtributo(claveForanea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.CLAVE_PRIMARIA_FORANEA: {
				ClavePrimariaForanea clavePrimariaForanea = (ClavePrimariaForanea)theEObject;
				T result = caseClavePrimariaForanea(clavePrimariaForanea);
				if (result == null) result = caseAtributo(clavePrimariaForanea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.RELACION_TIPO_DEBIL: {
				RelacionTipoDebil relacionTipoDebil = (RelacionTipoDebil)theEObject;
				T result = caseRelacionTipoDebil(relacionTipoDebil);
				if (result == null) result = caseRelacion(relacionTipoDebil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.RELACION_TIPO_FUERTE: {
				RelacionTipoFuerte relacionTipoFuerte = (RelacionTipoFuerte)theEObject;
				T result = caseRelacionTipoFuerte(relacionTipoFuerte);
				if (result == null) result = caseRelacion(relacionTipoFuerte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ENTIDAD_RELACION_DEBIL: {
				EntidadRelacionDebil entidadRelacionDebil = (EntidadRelacionDebil)theEObject;
				T result = caseEntidadRelacionDebil(entidadRelacionDebil);
				if (result == null) result = caseEntidadRelacion(entidadRelacionDebil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ENTIDAD_RELACION_FUERTE: {
				EntidadRelacionFuerte entidadRelacionFuerte = (EntidadRelacionFuerte)theEObject;
				T result = caseEntidadRelacionFuerte(entidadRelacionFuerte);
				if (result == null) result = caseEntidadRelacion(entidadRelacionFuerte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ATRIBUTO_DERIVADO_CLAVE_PRIMARIA: {
				AtributoDerivadoClavePrimaria atributoDerivadoClavePrimaria = (AtributoDerivadoClavePrimaria)theEObject;
				T result = caseAtributoDerivadoClavePrimaria(atributoDerivadoClavePrimaria);
				if (result == null) result = caseAtributo(atributoDerivadoClavePrimaria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ENTIDAD_FUERTE: {
				EntidadFuerte entidadFuerte = (EntidadFuerte)theEObject;
				T result = caseEntidadFuerte(entidadFuerte);
				if (result == null) result = caseEntidad(entidadFuerte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModeloERPackage.ENTIDAD_DEBIL: {
				EntidadDebil entidadDebil = (EntidadDebil)theEObject;
				T result = caseEntidadDebil(entidadDebil);
				if (result == null) result = caseEntidad(entidadDebil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidad(Entidad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributo(Atributo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelacion(Relacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagrama</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagrama(Diagrama object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad Relacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidadRelacion(EntidadRelacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Herencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHerencia(Herencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Derivado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Derivado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoDerivado(AtributoDerivado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Multivaluado</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Multivaluado</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoMultivaluado(AtributoMultivaluado object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clave Primaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clave Primaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClavePrimaria(ClavePrimaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clave Foranea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clave Foranea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaveForanea(ClaveForanea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clave Primaria Foranea</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clave Primaria Foranea</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClavePrimariaForanea(ClavePrimariaForanea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relacion Tipo Debil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relacion Tipo Debil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelacionTipoDebil(RelacionTipoDebil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relacion Tipo Fuerte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relacion Tipo Fuerte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelacionTipoFuerte(RelacionTipoFuerte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad Relacion Debil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad Relacion Debil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidadRelacionDebil(EntidadRelacionDebil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad Relacion Fuerte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad Relacion Fuerte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidadRelacionFuerte(EntidadRelacionFuerte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributo Derivado Clave Primaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributo Derivado Clave Primaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributoDerivadoClavePrimaria(AtributoDerivadoClavePrimaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad Fuerte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad Fuerte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidadFuerte(EntidadFuerte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entidad Debil</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entidad Debil</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntidadDebil(EntidadDebil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModeloERSwitch
