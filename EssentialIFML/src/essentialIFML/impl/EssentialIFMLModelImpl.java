/**
 */
package essentialIFML.impl;

import essentialIFML.Action;
import essentialIFML.EssentialIFMLModel;
import essentialIFML.EssentialIFMLPackage;
import essentialIFML.ViewContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__VIEWCONTAINER:
				return ((InternalEList<?>)getViewcontainer()).basicRemove(otherEnd, msgs);
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //EssentialIFMLModelImpl
