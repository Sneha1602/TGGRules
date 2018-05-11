/**
 */
package essentialIFML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.ViewContainer#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link essentialIFML.ViewContainer#isIsLandmark <em>Is Landmark</em>}</li>
 *   <li>{@link essentialIFML.ViewContainer#getViewcomponent <em>Viewcomponent</em>}</li>
 *   <li>{@link essentialIFML.ViewContainer#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link essentialIFML.ViewContainer#getNavBarContainer <em>Nav Bar Container</em>}</li>
 * </ul>
 *
 * @see essentialIFML.EssentialIFMLPackage#getViewContainer()
 * @model
 * @generated
 */
public interface ViewContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see essentialIFML.EssentialIFMLPackage#getViewContainer_IsDefault()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link essentialIFML.ViewContainer#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Landmark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Landmark</em>' attribute.
	 * @see #setIsLandmark(boolean)
	 * @see essentialIFML.EssentialIFMLPackage#getViewContainer_IsLandmark()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isIsLandmark();

	/**
	 * Sets the value of the '{@link essentialIFML.ViewContainer#isIsLandmark <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Landmark</em>' attribute.
	 * @see #isIsLandmark()
	 * @generated
	 */
	void setIsLandmark(boolean value);

	/**
	 * Returns the value of the '<em><b>Viewcomponent</b></em>' containment reference list.
	 * The list contents are of type {@link essentialIFML.ViewComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewcomponent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewcomponent</em>' containment reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getViewContainer_Viewcomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewComponent> getViewcomponent();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference.
	 * @see #setAnnotation(Annotation)
	 * @see essentialIFML.EssentialIFMLPackage#getViewContainer_Annotation()
	 * @model required="true"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link essentialIFML.ViewContainer#getAnnotation <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Nav Bar Container</b></em>' reference list.
	 * The list contents are of type {@link essentialIFML.ViewContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nav Bar Container</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nav Bar Container</em>' reference list.
	 * @see essentialIFML.EssentialIFMLPackage#getViewContainer_NavBarContainer()
	 * @model
	 * @generated
	 */
	EList<ViewContainer> getNavBarContainer();

} // ViewContainer
