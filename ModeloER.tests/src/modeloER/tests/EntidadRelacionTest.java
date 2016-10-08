/**
 */
package modeloER.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modeloER.EntidadRelacion;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entidad Relacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntidadRelacionTest extends TestCase {

	/**
	 * The fixture for this Entidad Relacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadRelacion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntidadRelacionTest.class);
	}

	/**
	 * Constructs a new Entidad Relacion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadRelacionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Entidad Relacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EntidadRelacion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Entidad Relacion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntidadRelacion getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createEntidadRelacion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EntidadRelacionTest