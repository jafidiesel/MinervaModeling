/**
 */
package modeloER.modeloER.tests;

import junit.textui.TestRunner;

import modeloER.modeloER.EntidadRelacionDebil;
import modeloER.modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Entidad Relacion Debil</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntidadRelacionDebilTest extends EntidadRelacionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EntidadRelacionDebilTest.class);
	}

	/**
	 * Constructs a new Entidad Relacion Debil test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntidadRelacionDebilTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Entidad Relacion Debil test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EntidadRelacionDebil getFixture() {
		return (EntidadRelacionDebil)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createEntidadRelacionDebil());
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

} //EntidadRelacionDebilTest
