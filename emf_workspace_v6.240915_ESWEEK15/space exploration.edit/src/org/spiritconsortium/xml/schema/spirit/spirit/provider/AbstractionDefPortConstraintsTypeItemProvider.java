/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.spiritconsortium.xml.schema.spirit.spirit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefPortConstraintsType;
import org.spiritconsortium.xml.schema.spirit.spirit._1Factory;
import org.spiritconsortium.xml.schema.spirit.spirit._1Package;

/**
 * This is the item provider adapter for a {@link org.spiritconsortium.xml.schema.spirit.spirit.AbstractionDefPortConstraintsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractionDefPortConstraintsTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionDefPortConstraintsTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_TimingConstraint());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_DriveConstraint());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_DriveConstraint1());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint1());
			childrenFeatures.add(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint2());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AbstractionDefPortConstraintsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractionDefPortConstraintsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_AbstractionDefPortConstraintsType_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AbstractionDefPortConstraintsType.class)) {
			case _1Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__TIMING_CONSTRAINT:
			case _1Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT:
			case _1Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT:
			case _1Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__DRIVE_CONSTRAINT1:
			case _1Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT1:
			case _1Package.ABSTRACTION_DEF_PORT_CONSTRAINTS_TYPE__LOAD_CONSTRAINT2:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_TimingConstraint(),
				 _1Factory.eINSTANCE.createTimingConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_DriveConstraint(),
				 _1Factory.eINSTANCE.createDriveConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint(),
				 _1Factory.eINSTANCE.createLoadConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_DriveConstraint1(),
				 _1Factory.eINSTANCE.createDriveConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint1(),
				 _1Factory.eINSTANCE.createLoadConstraintType()));

		newChildDescriptors.add
			(createChildParameter
				(_1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint2(),
				 _1Factory.eINSTANCE.createLoadConstraintType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == _1Package.eINSTANCE.getAbstractionDefPortConstraintsType_DriveConstraint() ||
			childFeature == _1Package.eINSTANCE.getAbstractionDefPortConstraintsType_DriveConstraint1() ||
			childFeature == _1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint() ||
			childFeature == _1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint1() ||
			childFeature == _1Package.eINSTANCE.getAbstractionDefPortConstraintsType_LoadConstraint2();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return AbstractionDefinitionEditPlugin.INSTANCE;
	}

}
