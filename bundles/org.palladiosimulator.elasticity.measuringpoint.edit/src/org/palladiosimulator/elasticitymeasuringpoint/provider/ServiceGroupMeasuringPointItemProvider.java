/**
 */
package org.palladiosimulator.elasticitymeasuringpoint.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.palladiosimulator.edp2.models.measuringpoint.provider.MeasuringPointItemProvider;

import org.palladiosimulator.elasticitymeasuringpoint.ElasticitymeasuringpointPackage;
import org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.elasticitymeasuringpoint.ServiceGroupMeasuringPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceGroupMeasuringPointItemProvider extends MeasuringPointItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ServiceGroupMeasuringPointItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addServiceGroupPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Service Group feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceGroupPropertyDescriptor(Object object) {
        itemPropertyDescriptors
            .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                    getResourceLocator(), getString("_UI_ServiceGroupReference_serviceGroup_feature"),
                    getString("_UI_PropertyDescriptor_description", "_UI_ServiceGroupReference_serviceGroup_feature",
                            "_UI_ServiceGroupReference_type"),
                    ElasticitymeasuringpointPackage.Literals.SERVICE_GROUP_REFERENCE__SERVICE_GROUP, true, false, true,
                    null, null, null));
    }

    /**
     * This returns ServiceGroupMeasuringPoint.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceGroupMeasuringPoint"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((ServiceGroupMeasuringPoint) object).getStringRepresentation();
        return label == null || label.length() == 0 ? getString("_UI_ServiceGroupMeasuringPoint_type")
                : getString("_UI_ServiceGroupMeasuringPoint_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ElasticitymeasuringpointEditPlugin.INSTANCE;
    }

}
