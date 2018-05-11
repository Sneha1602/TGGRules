/**
 */
package essentialIFML.impl;

import essentialIFML.Action;
import essentialIFML.DecreaseButtonSize;
import essentialIFML.EssentialIFMLModel;
import essentialIFML.EssentialIFMLPackage;
import essentialIFML.IncreaseButtonSize;
import essentialIFML.LightBackgroundColor;
import essentialIFML.ViewContainer;
import essentialIFML.ZoomScreen;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link essentialIFML.impl.EssentialIFMLModelImpl#getViewcontainer <em>Viewcontainer</em>}</li>
 *   <li>{@link essentialIFML.impl.EssentialIFMLModelImpl#getAction <em>Action</em>}</li>
 *   <li>{@link essentialIFML.impl.EssentialIFMLModelImpl#getIncreasebuttonsize <em>Increasebuttonsize</em>}</li>
 *   <li>{@link essentialIFML.impl.EssentialIFMLModelImpl#getDecreasebuttonsize <em>Decreasebuttonsize</em>}</li>
 *   <li>{@link essentialIFML.impl.EssentialIFMLModelImpl#getChangeBackgroundColor <em>Change Background Color</em>}</li>
 *   <li>{@link essentialIFML.impl.EssentialIFMLModelImpl#getScreenZoom <em>Screen Zoom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EssentialIFMLModelImpl extends NamedElementImpl implements EssentialIFMLModel {
	/**
	 * The cached value of the '{@link #getViewcontainer() <em>Viewcontainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewcontainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewContainer> viewcontainer;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getIncreasebuttonsize() <em>Increasebuttonsize</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncreasebuttonsize()
	 * @generated
	 * @ordered
	 */
	protected EList<IncreaseButtonSize> increasebuttonsize;

	/**
	 * The cached value of the '{@link #getDecreasebuttonsize() <em>Decreasebuttonsize</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecreasebuttonsize()
	 * @generated
	 * @ordered
	 */
	protected EList<DecreaseButtonSize> decreasebuttonsize;

	/**
	 * The cached value of the '{@link #getChangeBackgroundColor() <em>Change Background Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected LightBackgroundColor changeBackgroundColor;

	/**
	 * The cached value of the '{@link #getScreenZoom() <em>Screen Zoom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenZoom()
	 * @generated
	 * @ordered
	 */
	protected ZoomScreen screenZoom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EssentialIFMLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EssentialIFMLPackage.Literals.ESSENTIAL_IFML_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewContainer> getViewcontainer() {
		if (viewcontainer == null) {
			viewcontainer = new EObjectContainmentEList<ViewContainer>(ViewContainer.class, this, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER);
		}
		return viewcontainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncreaseButtonSize> getIncreasebuttonsize() {
		if (increasebuttonsize == null) {
			increasebuttonsize = new EObjectContainmentEList<IncreaseButtonSize>(IncreaseButtonSize.class, this, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE);
		}
		return increasebuttonsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecreaseButtonSize> getDecreasebuttonsize() {
		if (decreasebuttonsize == null) {
			decreasebuttonsize = new EObjectContainmentEList<DecreaseButtonSize>(DecreaseButtonSize.class, this, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE);
		}
		return decreasebuttonsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightBackgroundColor getChangeBackgroundColor() {
		return changeBackgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeBackgroundColor(LightBackgroundColor newChangeBackgroundColor, NotificationChain msgs) {
		LightBackgroundColor oldChangeBackgroundColor = changeBackgroundColor;
		changeBackgroundColor = newChangeBackgroundColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR, oldChangeBackgroundColor, newChangeBackgroundColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeBackgroundColor(LightBackgroundColor newChangeBackgroundColor) {
		if (newChangeBackgroundColor != changeBackgroundColor) {
			NotificationChain msgs = null;
			if (changeBackgroundColor != null)
				msgs = ((InternalEObject)changeBackgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR, null, msgs);
			if (newChangeBackgroundColor != null)
				msgs = ((InternalEObject)newChangeBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR, null, msgs);
			msgs = basicSetChangeBackgroundColor(newChangeBackgroundColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR, newChangeBackgroundColor, newChangeBackgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoomScreen getScreenZoom() {
		if (screenZoom != null && screenZoom.eIsProxy()) {
			InternalEObject oldScreenZoom = (InternalEObject)screenZoom;
			screenZoom = (ZoomScreen)eResolveProxy(oldScreenZoom);
			if (screenZoom != oldScreenZoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__SCREEN_ZOOM, oldScreenZoom, screenZoom));
			}
		}
		return screenZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoomScreen basicGetScreenZoom() {
		return screenZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenZoom(ZoomScreen newScreenZoom) {
		ZoomScreen oldScreenZoom = screenZoom;
		screenZoom = newScreenZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__SCREEN_ZOOM, oldScreenZoom, screenZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER:
				return ((InternalEList<?>)getViewcontainer()).basicRemove(otherEnd, msgs);
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE:
				return ((InternalEList<?>)getIncreasebuttonsize()).basicRemove(otherEnd, msgs);
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE:
				return ((InternalEList<?>)getDecreasebuttonsize()).basicRemove(otherEnd, msgs);
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR:
				return basicSetChangeBackgroundColor(null, msgs);
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
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER:
				return getViewcontainer();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION:
				return getAction();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE:
				return getIncreasebuttonsize();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE:
				return getDecreasebuttonsize();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR:
				return getChangeBackgroundColor();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__SCREEN_ZOOM:
				if (resolve) return getScreenZoom();
				return basicGetScreenZoom();
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
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER:
				getViewcontainer().clear();
				getViewcontainer().addAll((Collection<? extends ViewContainer>)newValue);
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE:
				getIncreasebuttonsize().clear();
				getIncreasebuttonsize().addAll((Collection<? extends IncreaseButtonSize>)newValue);
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE:
				getDecreasebuttonsize().clear();
				getDecreasebuttonsize().addAll((Collection<? extends DecreaseButtonSize>)newValue);
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR:
				setChangeBackgroundColor((LightBackgroundColor)newValue);
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__SCREEN_ZOOM:
				setScreenZoom((ZoomScreen)newValue);
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
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER:
				getViewcontainer().clear();
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION:
				getAction().clear();
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE:
				getIncreasebuttonsize().clear();
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE:
				getDecreasebuttonsize().clear();
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR:
				setChangeBackgroundColor((LightBackgroundColor)null);
				return;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__SCREEN_ZOOM:
				setScreenZoom((ZoomScreen)null);
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
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER:
				return viewcontainer != null && !viewcontainer.isEmpty();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION:
				return action != null && !action.isEmpty();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__INCREASEBUTTONSIZE:
				return increasebuttonsize != null && !increasebuttonsize.isEmpty();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__DECREASEBUTTONSIZE:
				return decreasebuttonsize != null && !decreasebuttonsize.isEmpty();
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__CHANGE_BACKGROUND_COLOR:
				return changeBackgroundColor != null;
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__SCREEN_ZOOM:
				return screenZoom != null;
		}
		return super.eIsSet(featureID);
	}

} //EssentialIFMLModelImpl
