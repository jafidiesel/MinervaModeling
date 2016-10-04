/**
 */
package modeloER.tests;

import junit.textui.TestRunner;

import modeloER.AtributoMultivaluado;
import modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atributo Multivaluado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtributoMultivaluadoTest extends AtributoTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtributoMultivaluadoTest.class);
	}

	/**
	 * Constructs a new Atributo Multivaluado test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtributoMultivaluadoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Atributo Multivaluado test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AtributoMultivaluado getFixture() {
		return (AtributoMultivaluado)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createAtributoMultivaluado());
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

} //AtributoMultivaluadoTest
