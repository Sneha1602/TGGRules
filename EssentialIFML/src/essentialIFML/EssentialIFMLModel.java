/**
 */
package essentialIFML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.EssentialIFMLModel#getViewcontainer <em>Viewcontainer</em>}</li>
 *   <li>{@link essentialIFML.EssentialIFMLModel#getAction <em>Action</em>}</li>
 *   <li>{@link essentialIFML.EssentialIFMLModel#getIncreasebuttonsize <em>Increasebuttonsize</em>}</li>
 *   <li>{@link essentialIFML.EssentialIFMLModel#getDecreasebuttonsize <em>Decreasebuttonsize</em>}</li>
 *   <li>{@link essentialIFML.EssentialIFMLModel#getChangeBackgroundColor <em>Change Background Color</em>}</li>
 *   <li>{@link essentialIFML.EssentialIFMLModel#getScreenZoom <em>Screen Zoom</em>}</li>
 * </ul>
 *
 * @see essentialIFML.EssentialIFMLPackage#getEssentialIFMLModel()
 * @model
 * @generated
 */
public interface EssentialIFMLModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Viewcontainer</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.ViewContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewcontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewcontainer</em>' containment reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getEssentialIFMLModel_Viewcontainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ViewContainer> getViewcontainer();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getEssentialIFMLModel_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Increasebuttonsize</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.IncreaseButtonSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increasebuttonsize</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increasebuttonsize</em>' containment reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getEssentialIFMLModel_Increasebuttonsize()
	 * @model containment="true"
	 * @generated
	 */
	EList<IncreaseButtonSize> getIncreasebuttonsize();

	/**
	 * Returns the value of the '<em><b>Decreasebuttonsize</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.DecreaseButtonSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decreasebuttonsize</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decreasebuttonsize</em>' containment reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getEssentialIFMLModel_Decreasebuttonsize()
	 * @model containment="true"
	 * @generated
	 */
	EList<DecreaseButtonSize> getDecreasebuttonsize();

	/**
	 * Returns the value of the '<em><b>Change Background Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Background Color</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Background Color</em>' containment reference.
	 * @see #setChangeBackgroundColor(LightBackgroundColor)
	 * @see essentialIFML.EssentialIFMLPackage#getEssentialIFMLModel_ChangeBackgroundColor()
	 * @model containment="true"
	 * @generated
	 */
	LightBackgroundColor getChangeBackgroundColor();

	/**
	 * Sets the value of the '{@link essentialIFML.EssentialIFMLModel#getChangeBackgroundColor <em>Change Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Background Color</em>' containment reference.
	 * @see #getChangeBackgroundColor()
	 * @generated
	 */
	void setChangeBackgroundColor(LightBackgroundColor value);

	/**
	 * Returns the value of the '<em><b>Screen Zoom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Zoom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Zoom</em>' reference.
	 * @see #setScreenZoom(ZoomScreen)
	 * @see essentialIFML.EssentialIFMLPackage#getEssentialIFMLModel_ScreenZoom()
	 * @model
	 * @generated
	 */
	ZoomScreen getScreenZoom();

	/**
	 * Sets the value of the '{@link essentialIFML.EssentialIFMLModel#getScreenZoom <em>Screen Zoom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Zoom</em>' reference.
	 * @see #getScreenZoom()
	 * @generated
	 */
	void setScreenZoom(ZoomScreen value);

} // EssentialIFMLModel
