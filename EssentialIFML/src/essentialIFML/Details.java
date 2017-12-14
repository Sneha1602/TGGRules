/**
 */
package essentialIFML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Details#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see essentialIFML.EssentialIFMLPackage#getDetails()
 * @model
 * @generated
 */
public interface Details extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(DetailsText)
	 * @see essentialIFML.EssentialIFMLPackage#getDetails_Text()
	 * @model containment="true"
	 * @generated
	 */
	DetailsText getText();

	/**
	 * Sets the value of the '{@link essentialIFML.Details#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(DetailsText value);

} // Details
