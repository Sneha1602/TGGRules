/**
 */
package essentialIFML.tests;

import essentialIFML.EssentialIFMLFactory;
import essentialIFML.LightBackgroundColor;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Light Background Color</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LightBackgroundColorTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LightBackgroundColorTest.class);
	}

	/**
	 * Constructs a new Light Background Color test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightBackgroundColorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Light Background Color test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LightBackgroundColor getFixture() {
		return (LightBackgroundColor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EssentialIFMLFactory.eINSTANCE.createLightBackgroundColor());
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

} //LightBackgroundColorTest
