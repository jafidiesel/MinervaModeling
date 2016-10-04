/**
 */
package modeloER.impl;

import java.util.Collection;

import modeloER.Atributo;
import modeloER.ModeloERPackage;
import modeloER.TipoDato;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloER.impl.AtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link modeloER.impl.AtributoImpl#isNulo <em>Nulo</em>}</li>
 *   <li>{@link modeloER.impl.AtributoImpl#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link modeloER.impl.AtributoImpl#isClavePrimaria <em>Clave Primaria</em>}</li>
 *   <li>{@link modeloER.impl.AtributoImpl#isClaveForanea <em>Clave Foranea</em>}</li>
 *   <li>{@link modeloER.impl.AtributoImpl#getAtributosAtributo <em>Atributos Atributo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNulo() <em>Nulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNulo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNulo() <em>Nulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNulo()
	 * @generated
	 * @ordered
	 */
	protected boolean nulo = NULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final TipoDato TIPO_DATO_EDEFAULT = TipoDato.VARCHAR;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected TipoDato tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * The default value of the '{@link #isClavePrimaria() <em>Clave Primaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClavePrimaria()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLAVE_PRIMARIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClavePrimaria() <em>Clave Primaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClavePrimaria()
	 * @generated
	 * @ordered
	 */
	protected boolean clavePrimaria = CLAVE_PRIMARIA_EDEFAULT;

	/**
	 * The default value of the '{@link #isClaveForanea() <em>Clave Foranea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClaveForanea()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLAVE_FORANEA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClaveForanea() <em>Clave Foranea</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClaveForanea()
	 * @generated
	 * @ordered
	 */
	protected boolean claveForanea = CLAVE_FORANEA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAtributosAtributo() <em>Atributos Atributo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributosAtributo()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributo> atributosAtributo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloERPackage.Literals.ATRIBUTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNulo() {
		return nulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNulo(boolean newNulo) {
		boolean oldNulo = nulo;
		nulo = newNulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__NULO, oldNulo, nulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDato getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoDato(TipoDato newTipoDato) {
		TipoDato oldTipoDato = tipoDato;
		tipoDato = newTipoDato == null ? TIPO_DATO_EDEFAULT : newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClavePrimaria() {
		return clavePrimaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClavePrimaria(boolean newClavePrimaria) {
		boolean oldClavePrimaria = clavePrimaria;
		clavePrimaria = newClavePrimaria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__CLAVE_PRIMARIA, oldClavePrimaria, clavePrimaria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClaveForanea() {
		return claveForanea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaveForanea(boolean newClaveForanea) {
		boolean oldClaveForanea = claveForanea;
		claveForanea = newClaveForanea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloERPackage.ATRIBUTO__CLAVE_FORANEA, oldClaveForanea, claveForanea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Atributo> getAtributosAtributo() {
		if (atributosAtributo == null) {
			atributosAtributo = new EObjectContainmentEList<Atributo>(Atributo.class, this, ModeloERPackage.ATRIBUTO__ATRIBUTOS_ATRIBUTO);
		}
		return atributosAtributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO__ATRIBUTOS_ATRIBUTO:
				return ((InternalEList<?>)getAtributosAtributo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO__NOMBRE:
				return getNombre();
			case ModeloERPackage.ATRIBUTO__NULO:
				return isNulo();
			case ModeloERPackage.ATRIBUTO__TIPO_DATO:
				return getTipoDato();
			case ModeloERPackage.ATRIBUTO__CLAVE_PRIMARIA:
				return isClavePrimaria();
			case ModeloERPackage.ATRIBUTO__CLAVE_FORANEA:
				return isClaveForanea();
			case ModeloERPackage.ATRIBUTO__ATRIBUTOS_ATRIBUTO:
				return getAtributosAtributo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO__NOMBRE:
				setNombre((String)newValue);
				return;
			case ModeloERPackage.ATRIBUTO__NULO:
				setNulo((Boolean)newValue);
				return;
			case ModeloERPackage.ATRIBUTO__TIPO_DATO:
				setTipoDato((TipoDato)newValue);
				return;
			case ModeloERPackage.ATRIBUTO__CLAVE_PRIMARIA:
				setClavePrimaria((Boolean)newValue);
				return;
			case ModeloERPackage.ATRIBUTO__CLAVE_FORANEA:
				setClaveForanea((Boolean)newValue);
				return;
			case ModeloERPackage.ATRIBUTO__ATRIBUTOS_ATRIBUTO:
				getAtributosAtributo().clear();
				getAtributosAtributo().addAll((Collection<? extends Atributo>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case ModeloERPackage.ATRIBUTO__NULO:
				setNulo(NULO_EDEFAULT);
				return;
			case ModeloERPackage.ATRIBUTO__TIPO_DATO:
				setTipoDato(TIPO_DATO_EDEFAULT);
				return;
			case ModeloERPackage.ATRIBUTO__CLAVE_PRIMARIA:
				setClavePrimaria(CLAVE_PRIMARIA_EDEFAULT);
				return;
			case ModeloERPackage.ATRIBUTO__CLAVE_FORANEA:
				setClaveForanea(CLAVE_FORANEA_EDEFAULT);
				return;
			case ModeloERPackage.ATRIBUTO__ATRIBUTOS_ATRIBUTO:
				getAtributosAtributo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModeloERPackage.ATRIBUTO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case ModeloERPackage.ATRIBUTO__NULO:
				return nulo != NULO_EDEFAULT;
			case ModeloERPackage.ATRIBUTO__TIPO_DATO:
				return tipoDato != TIPO_DATO_EDEFAULT;
			case ModeloERPackage.ATRIBUTO__CLAVE_PRIMARIA:
				return clavePrimaria != CLAVE_PRIMARIA_EDEFAULT;
			case ModeloERPackage.ATRIBUTO__CLAVE_FORANEA:
				return claveForanea != CLAVE_FORANEA_EDEFAULT;
			case ModeloERPackage.ATRIBUTO__ATRIBUTOS_ATRIBUTO:
				return atributosAtributo != null && !atributosAtributo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", nulo: ");
		result.append(nulo);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(", clavePrimaria: ");
		result.append(clavePrimaria);
		result.append(", claveForanea: ");
		result.append(claveForanea);
		result.append(')');
		return result.toString();
	}

} //AtributoImpl
