/**
 */
package essentialIFML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Form#getField <em>Field</em>}</li>
 *   <li>{@link essentialIFML.Form#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see essentialIFML.EssentialIFMLPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getForm_Field()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getForm_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Event> getEvent();

} // Form
