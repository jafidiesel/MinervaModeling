/**
 */
package modeloER.modeloER.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modeloER.modeloER.LinkASAC;
import modeloER.modeloER.ModeloERFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link ASAC</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkASACTest extends TestCase {

	/**
	 * The fixture for this Link ASAC test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkASAC fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkASACTest.class);
	}

	/**
	 * Constructs a new Link ASAC test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkASACTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Link ASAC test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LinkASAC fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Link ASAC test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkASAC getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModeloERFactory.eINSTANCE.createLinkASAC());
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

} //LinkASACTest
