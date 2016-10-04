/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.ModeloERFactory;
import modeloER.TipoDebil;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tipo Debil</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TipoDebilTest extends RelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TipoDebilTest.class);
	}

	/**
	 * Constructs a new Tipo Debil test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoDebilTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tipo Debil test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TipoDebil getFixture() {
		return (TipoDebil)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createTipoDebil());
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

} //TipoDebilTest
