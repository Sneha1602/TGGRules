/**
 */
package essentialIFML.tests;

import essentialIFML.EssentialIFMLFactory;
import essentialIFML.ZoomScreen;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Zoom Screen</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZoomScreenTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ZoomScreenTest.class);
	}

	/**
	 * Constructs a new Zoom Screen test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoomScreenTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Zoom Screen test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ZoomScreen getFixture() {
		return (ZoomScreen)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialIFMLFactory.eINSTANCE.createZoomScreen());
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

} //ZoomScreenTest
