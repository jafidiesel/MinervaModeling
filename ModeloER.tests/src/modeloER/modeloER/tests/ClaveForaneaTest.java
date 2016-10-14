/**
 */
package modeloER.modeloER.tests;

import junit.textui.TestRunner;

import modeloER.modeloER.ClaveForanea;
import modeloER.modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clave Foranea</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaveForaneaTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClaveForaneaTest.class);
	}

	/**
	 * Constructs a new Clave Foranea test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaveForaneaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Clave Foranea test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClaveForanea getFixture() {
		return (ClaveForanea)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createClaveForanea());
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

} //ClaveForaneaTest
