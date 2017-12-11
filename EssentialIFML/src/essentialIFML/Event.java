/**
 */
package essentialIFML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.Event#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see essentialIFML.EssentialIFMLPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getEvent_Action()
	 * @model required="true"
	 * @generated
	 */
	EList<Action> getAction();

} // Event
