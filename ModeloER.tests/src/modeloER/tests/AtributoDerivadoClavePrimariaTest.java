/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.AtributoDerivadoClavePrimaria;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atributo Derivado Clave Primaria</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtributoDerivadoClavePrimariaTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtributoDerivadoClavePrimariaTest.class);
	}

	/**
	 * Constructs a new Atributo Derivado Clave Primaria test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoDerivadoClavePrimariaTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atributo Derivado Clave Primaria test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtributoDerivadoClavePrimaria getFixture() {
		return (AtributoDerivadoClavePrimaria)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createAtributoDerivadoClavePrimaria());
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

} //AtributoDerivadoClavePrimariaTest
