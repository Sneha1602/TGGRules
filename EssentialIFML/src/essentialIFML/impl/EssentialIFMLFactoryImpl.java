/**
 */
package essentialIFML.impl;

import essentialIFML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EssentialIFMLFactoryImpl extends EFactoryImpl implements EssentialIFMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EssentialIFMLFactory init() {
		try {
			EssentialIFMLFactory theEssentialIFMLFactory = (EssentialIFMLFactory)EPackage.Registry.INSTANCE.getEFactory(EssentialIFMLPackage.eNS_URI);
			if (theEssentialIFMLFactory != null) {
				return theEssentialIFMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EssentialIFMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialIFMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EssentialIFMLPackage.ESSENTIAL_IFML_MODEL: return createEssentialIFMLModel();
			case EssentialIFMLPackage.ZOOM_SCREEN: return createZoomScreen();
			case EssentialIFMLPackage.VIEW_CONTAINER: return createViewContainer();
			case EssentialIFMLPackage.EVENT: return createEvent();
			case EssentialIFMLPackage.FIELD: return createField();
			case EssentialIFMLPackage.DETAILS_TEXT: return createDetailsText();
			case EssentialIFMLPackage.ACTION: return createAction();
			case EssentialIFMLPackage.NAMED_ELEMENT: return createNamedElement();
			case EssentialIFMLPackage.FORM: return createForm();
			case EssentialIFMLPackage.DETAILS: return createDetails();
			case EssentialIFMLPackage.ANNOTATION: return createAnnotation();
			case EssentialIFMLPackage.INCREASE_BUTTON_SIZE: return createIncreaseButtonSize();
			case EssentialIFMLPackage.DECREASE_BUTTON_SIZE: return createDecreaseButtonSize();
			case EssentialIFMLPackage.LIGHT_BACKGROUND_COLOR: return createLightBackgroundColor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EssentialIFMLPackage.DATATYPE:
				return createDatatypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EssentialIFMLPackage.DATATYPE:
				return convertDatatypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialIFMLModel createEssentialIFMLModel() {
		EssentialIFMLModelImpl essentialIFMLModel = new EssentialIFMLModelImpl();
		return essentialIFMLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoomScreen createZoomScreen() {
		ZoomScreenImpl zoomScreen = new ZoomScreenImpl();
		return zoomScreen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer createViewContainer() {
		ViewContainerImpl viewContainer = new ViewContainerImpl();
		return viewContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsText createDetailsText() {
		DetailsTextImpl detailsText = new DetailsTextImpl();
		return detailsText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Details createDetails() {
		DetailsImpl details = new DetailsImpl();
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncreaseButtonSize createIncreaseButtonSize() {
		IncreaseButtonSizeImpl increaseButtonSize = new IncreaseButtonSizeImpl();
		return increaseButtonSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecreaseButtonSize createDecreaseButtonSize() {
		DecreaseButtonSizeImpl decreaseButtonSize = new DecreaseButtonSizeImpl();
		return decreaseButtonSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightBackgroundColor createLightBackgroundColor() {
		LightBackgroundColorImpl lightBackgroundColor = new LightBackgroundColorImpl();
		return lightBackgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatypeFromString(EDataType eDataType, String initialValue) {
		Datatype result = Datatype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EssentialIFMLPackage getEssentialIFMLPackage() {
		return (EssentialIFMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EssentialIFMLPackage getPackage() {
		return EssentialIFMLPackage.eINSTANCE;
	}

} //EssentialIFMLFactoryImpl
