/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.models.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import org.palladiosimulator.elasticity.triggers.stimuli.StimuliFactory;

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

            this.addTargetResponseTimePropertyDescriptor(object);
            this.addResponseTimeAggregationMethodPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
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
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
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
     * @generated NOT
     */
    @Override
    public String getText(final Object object) {
        final ResponseTimeSpecification responseTimeSpecification = (ResponseTimeSpecification) object;
        return this.getString("_UI_ResponseTimeSpecification_type") + " "
                + responseTimeSpecification.getResponseTimeAggregationMethod() + " < "
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
        case ModelsPackage.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors
            .add(this.createChildParameter(ModelsPackage.Literals.RESPONSE_TIME_SPECIFICATION__RESPONSE_TIME_STIMULUS,
                    StimuliFactory.eINSTANCE.createOperationResponseTime()));
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
