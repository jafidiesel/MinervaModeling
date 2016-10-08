/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.EntidadFuerte;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entidad Fuerte</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntidadFuerteTest extends EntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntidadFuerteTest.class);
	}

	/**
	 * Constructs a new Entidad Fuerte test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadFuerteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entidad Fuerte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntidadFuerte getFixture() {
		return (EntidadFuerte)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createEntidadFuerte());
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

} //EntidadFuerteTest
