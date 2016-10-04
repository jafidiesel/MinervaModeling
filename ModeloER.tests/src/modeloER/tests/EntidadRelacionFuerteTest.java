/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.EntidadRelacionFuerte;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entidad Relacion Fuerte</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntidadRelacionFuerteTest extends EntidadRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntidadRelacionFuerteTest.class);
	}

	/**
	 * Constructs a new Entidad Relacion Fuerte test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadRelacionFuerteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entidad Relacion Fuerte test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntidadRelacionFuerte getFixture() {
		return (EntidadRelacionFuerte)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createEntidadRelacionFuerte());
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

} //EntidadRelacionFuerteTest
