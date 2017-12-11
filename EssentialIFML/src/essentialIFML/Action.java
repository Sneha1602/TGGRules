/**
 */
package essentialIFML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Action#getNavigates <em>Navigates</em>}</li>
 * </ul>
 *
 * @see essentialIFML.EssentialIFMLPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Navigates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigates</em>' reference.
	 * @see #setNavigates(ViewContainer)
	 * @see essentialIFML.EssentialIFMLPackage#getAction_Navigates()
	 * @model
	 * @generated
	 */
	ViewContainer getNavigates();

	/**
	 * Sets the value of the '{@link essentialIFML.Action#getNavigates <em>Navigates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigates</em>' reference.
	 * @see #getNavigates()
	 * @generated
	 */
	void setNavigates(ViewContainer value);

} // Action
