/**
 */
package modeloER.modeloER.tests;

import junit.textui.TestRunner;

import modeloER.modeloER.ModeloERFactory;
import modeloER.modeloER.RelacionTipoFuerte;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relacion Tipo Fuerte</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelacionTipoFuerteTest extends RelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelacionTipoFuerteTest.class);
	}

	/**
	 * Constructs a new Relacion Tipo Fuerte test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelacionTipoFuerteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relacion Tipo Fuerte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelacionTipoFuerte getFixture() {
		return (RelacionTipoFuerte)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createRelacionTipoFuerte());
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

} //RelacionTipoFuerteTest
