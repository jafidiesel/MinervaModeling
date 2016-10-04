/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.ClavePrimariaForanea;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clave Primaria Foranea</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClavePrimariaForaneaTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClavePrimariaForaneaTest.class);
	}

	/**
	 * Constructs a new Clave Primaria Foranea test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClavePrimariaForaneaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clave Primaria Foranea test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClavePrimariaForanea getFixture() {
		return (ClavePrimariaForanea)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createClavePrimariaForanea());
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

} //ClavePrimariaForaneaTest
