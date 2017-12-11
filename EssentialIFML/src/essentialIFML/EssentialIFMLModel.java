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

} // EssentialIFMLModel
