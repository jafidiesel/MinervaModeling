/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.EntidadDebil;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entidad Debil</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntidadDebilTest extends EntidadTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntidadDebilTest.class);
	}

	/**
	 * Constructs a new Entidad Debil test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadDebilTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entidad Debil test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntidadDebil getFixture() {
		return (EntidadDebil)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createEntidadDebil());
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

} //EntidadDebilTest
