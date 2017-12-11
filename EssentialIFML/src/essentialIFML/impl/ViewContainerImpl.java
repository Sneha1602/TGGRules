/**
 */
package essentialIFML.impl;

import essentialIFML.EssentialIFMLPackage;
import essentialIFML.ViewComponent;
import essentialIFML.ViewContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.impl.ViewContainerImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link essentialIFML.impl.ViewContainerImpl#isIsLandmark <em>Is Landmark</em>}</li>
 *   <li>{@link essentialIFML.impl.ViewContainerImpl#getViewcomponent <em>Viewcomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewContainerImpl extends NamedElementImpl implements ViewContainer {
	/**
	 * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsLandmark() <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLandmark()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LANDMARK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLandmark() <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLandmark()
	 * @generated
	 * @ordered
	 */
	protected boolean isLandmark = IS_LANDMARK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewcomponent() <em>Viewcomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewcomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewComponent> viewcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssentialIFMLPackage.Literals.VIEW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(boolean newIsDefault) {
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialIFMLPackage.VIEW_CONTAINER__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLandmark() {
		return isLandmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLandmark(boolean newIsLandmark) {
		boolean oldIsLandmark = isLandmark;
		isLandmark = newIsLandmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialIFMLPackage.VIEW_CONTAINER__IS_LANDMARK, oldIsLandmark, isLandmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewComponent> getViewcomponent() {
		if (viewcomponent == null) {
			viewcomponent = new EObjectContainmentEList<ViewComponent>(ViewComponent.class, this, EssentialIFMLPackage.VIEW_CONTAINER__VIEWCOMPONENT);
		}
		return viewcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssentialIFMLPackage.VIEW_CONTAINER__VIEWCOMPONENT:
				return ((InternalEList<?>)getViewcomponent()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_DEFAULT:
				return isIsDefault();
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_LANDMARK:
				return isIsLandmark();
			case EssentialIFMLPackage.VIEW_CONTAINER__VIEWCOMPONENT:
				return getViewcomponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_LANDMARK:
				setIsLandmark((Boolean)newValue);
				return;
			case EssentialIFMLPackage.VIEW_CONTAINER__VIEWCOMPONENT:
				getViewcomponent().clear();
				getViewcomponent().addAll((Collection<? extends ViewComponent>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_LANDMARK:
				setIsLandmark(IS_LANDMARK_EDEFAULT);
				return;
			case EssentialIFMLPackage.VIEW_CONTAINER__VIEWCOMPONENT:
				getViewcomponent().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_DEFAULT:
				return isDefault != IS_DEFAULT_EDEFAULT;
			case EssentialIFMLPackage.VIEW_CONTAINER__IS_LANDMARK:
				return isLandmark != IS_LANDMARK_EDEFAULT;
			case EssentialIFMLPackage.VIEW_CONTAINER__VIEWCOMPONENT:
				return viewcomponent != null && !viewcomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDefault: ");
		result.append(isDefault);
		result.append(", isLandmark: ");
		result.append(isLandmark);
		result.append(')');
		return result.toString();
	}

} //ViewContainerImpl
