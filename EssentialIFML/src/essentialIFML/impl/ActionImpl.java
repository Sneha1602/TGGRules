/**
 */
package essentialIFML.impl;

import essentialIFML.Action;
import essentialIFML.EssentialIFMLPackage;
import essentialIFML.ViewContainer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.impl.ActionImpl#getNavigates <em>Navigates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends NamedElementImpl implements Action {
	/**
	 * The cached value of the '{@link #getNavigates() <em>Navigates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigates()
	 * @generated
	 * @ordered
	 */
	protected ViewContainer navigates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssentialIFMLPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer getNavigates() {
		if (navigates != null && navigates.eIsProxy()) {
			InternalEObject oldNavigates = (InternalEObject)navigates;
			navigates = (ViewContainer)eResolveProxy(oldNavigates);
			if (navigates != oldNavigates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EssentialIFMLPackage.ACTION__NAVIGATES, oldNavigates, navigates));
			}
		}
		return navigates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer basicGetNavigates() {
		return navigates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigates(ViewContainer newNavigates) {
		ViewContainer oldNavigates = navigates;
		navigates = newNavigates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialIFMLPackage.ACTION__NAVIGATES, oldNavigates, navigates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EssentialIFMLPackage.ACTION__NAVIGATES:
				if (resolve) return getNavigates();
				return basicGetNavigates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EssentialIFMLPackage.ACTION__NAVIGATES:
				setNavigates((ViewContainer)newValue);
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
			case EssentialIFMLPackage.ACTION__NAVIGATES:
				setNavigates((ViewContainer)null);
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
			case EssentialIFMLPackage.ACTION__NAVIGATES:
				return navigates != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
