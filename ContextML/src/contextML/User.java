/**
 */
package contextML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link contextML.User#getRole <em>Role</em>}</li>
 *   <li>{@link contextML.User#getId <em>Id</em>}</li>
 *   <li>{@link contextML.User#getColorBlind <em>Color Blind</em>}</li>
 *   <li>{@link contextML.User#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see contextML.ContextMLPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Entity {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Role)
	 * @see contextML.ContextMLPackage#getUser_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link contextML.User#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see contextML.ContextMLPackage#getUser_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link contextML.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Color Blind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Blind</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Blind</em>' reference.
	 * @see #setColorBlind(Property)
	 * @see contextML.ContextMLPackage#getUser_ColorBlind()
	 * @model
	 * @generated
	 */
	Property getColorBlind();

	/**
	 * Sets the value of the '{@link contextML.User#getColorBlind <em>Color Blind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Blind</em>' reference.
	 * @see #getColorBlind()
	 * @generated
	 */
	void setColorBlind(Property value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' reference.
	 * @see #setAge(Age)
	 * @see contextML.ContextMLPackage#getUser_Age()
	 * @model
	 * @generated
	 */
	Age getAge();

	/**
	 * Sets the value of the '{@link contextML.User#getAge <em>Age</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Age value);

} // User
