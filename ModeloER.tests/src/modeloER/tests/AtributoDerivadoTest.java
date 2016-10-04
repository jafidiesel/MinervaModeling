/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.AtributoDerivado;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atributo Derivado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtributoDerivadoTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtributoDerivadoTest.class);
	}

	/**
	 * Constructs a new Atributo Derivado test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoDerivadoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atributo Derivado test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtributoDerivado getFixture() {
		return (AtributoDerivado)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createAtributoDerivado());
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

} //AtributoDerivadoTest
