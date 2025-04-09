/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.models.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.elasticity.models.ModelsPackage;
import org.palladiosimulator.elasticity.models.ResponseTimeSpecification;
import org.palladiosimulator.elasticity.provider.ElasticityEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.elasticity.models.ResponseTimeSpecification} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ResponseTimeSpecificationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ResponseTimeSpecificationItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addResponseTimeStimulusPropertyDescriptor(object);
            this.addTargetResponseTimePropertyDescriptor(object);
            this.addResponseTimeAggregationMethodPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Response Time Stimulus feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addResponseTimeStimulusPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResponseTimeSpecification_responseTimeStimulus_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResponseTimeSpecification_responseTimeStimulus_feature",
                        "_UI_ResponseTimeSpecification_type"),
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS, true, false, true, null,
                null, null));
    }

    /**
     * This adds a property descriptor for the Target Response Time feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addTargetResponseTimePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResponseTimeSpecification_targetResponseTime_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResponseTimeSpecification_targetResponseTime_feature",
                        "_UI_ResponseTimeSpecification_type"),
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME, true, false, false,
                ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Response Time Aggregation Method feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addResponseTimeAggregationMethodPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_ResponseTimeSpecification_responseTimeAggregationMethod_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_ResponseTimeSpecification_responseTimeAggregationMethod_feature",
                        "_UI_ResponseTimeSpecification_type"),
                ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD, true, false,
                false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns ResponseTimeSpecification.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/obj16/ResponseTimeSpecification"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final ResponseTimeSpecification responseTimeSpecification = (ResponseTimeSpecification) object;
        return this.getString("_UI_ResponseTimeSpecification_type") + " "
                + responseTimeSpecification.getTargetResponseTime();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to
     * {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(ResponseTimeSpecification.class)) {
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__TARGET_RESPONSE_TIME:
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_AGGREGATION_METHOD:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ElasticityEditPlugin.INSTANCE;
    }

}
