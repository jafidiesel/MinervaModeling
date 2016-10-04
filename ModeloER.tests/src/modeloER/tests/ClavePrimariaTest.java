/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.ClavePrimaria;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clave Primaria</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClavePrimariaTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClavePrimariaTest.class);
	}

	/**
	 * Constructs a new Clave Primaria test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClavePrimariaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clave Primaria test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClavePrimaria getFixture() {
		return (ClavePrimaria)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createClavePrimaria());
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

} //ClavePrimariaTest
