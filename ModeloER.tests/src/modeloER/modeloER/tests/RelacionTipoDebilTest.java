/**
 */
package modeloER.modeloER.tests;

import junit.textui.TestRunner;

import modeloER.modeloER.ModeloERFactory;
import modeloER.modeloER.RelacionTipoDebil;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relacion Tipo Debil</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelacionTipoDebilTest extends RelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelacionTipoDebilTest.class);
	}

	/**
	 * Constructs a new Relacion Tipo Debil test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionTipoDebilTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relacion Tipo Debil test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelacionTipoDebil getFixture() {
		return (RelacionTipoDebil)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createRelacionTipoDebil());
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

} //RelacionTipoDebilTest
