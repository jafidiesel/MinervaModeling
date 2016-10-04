/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.ModeloERFactory;
import modeloER.TipoFuerte;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tipo Fuerte</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TipoFuerteTest extends RelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TipoFuerteTest.class);
	}

	/**
	 * Constructs a new Tipo Fuerte test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoFuerteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tipo Fuerte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TipoFuerte getFixture() {
		return (TipoFuerte)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createTipoFuerte());
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

} //TipoFuerteTest
