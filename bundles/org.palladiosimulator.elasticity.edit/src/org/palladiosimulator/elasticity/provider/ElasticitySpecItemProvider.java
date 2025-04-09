/**
 * Copyright 2022 by palladiosimulator.org
 */
package org.palladiosimulator.elasticity.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.elasticity.ElasticityFactory;
import org.palladiosimulator.elasticity.ElasticityPackage;
import org.palladiosimulator.elasticity.ElasticitySpec;
import org.palladiosimulator.elasticity.targets.TargetsFactory;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.elasticity.ElasticitySpec}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ElasticitySpecItemProvider extends EntityItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ElasticitySpecItemProvider(final AdapterFactory adapterFactory) {
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

        }
        return this.itemPropertyDescriptors;
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
            this.childrenFeatures.add(ElasticityPackage.Literals.ELASTICITY_SPEC__SCALING_POLICIES);
            this.childrenFeatures.add(ElasticityPackage.Literals.ELASTICITY_SPEC__TARGET_GROUPS);
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
     * This returns the icon for an Elasticity Spec item. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
            .getImage("full/spdicons16/spd-icon-alt.png"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated NOT
     */
    @Override
    public String getText(final Object object) {
        final String label = ((ElasticitySpec) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_ElasticitySpec_type")
                : this.getString("_UI_ElasticitySpec_type") + " " + label;
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

        switch (notification.getFeatureID(ElasticitySpec.class)) {
        case ElasticityPackage.ELASTICITY_SPEC__SCALING_POLICIES:
        case ElasticityPackage.ELASTICITY_SPEC__TARGET_GROUPS:
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

        newChildDescriptors.add(this.createChildParameter(ElasticityPackage.Literals.ELASTICITY_SPEC__SCALING_POLICIES,
                ElasticityFactory.eINSTANCE.createTriggerBasedScalingPolicy()));

        newChildDescriptors.add(this.createChildParameter(ElasticityPackage.Literals.ELASTICITY_SPEC__SCALING_POLICIES,
                ElasticityFactory.eINSTANCE.createModelBasedScalingPolicy()));

        newChildDescriptors.add(this.createChildParameter(ElasticityPackage.Literals.ELASTICITY_SPEC__TARGET_GROUPS,
                TargetsFactory.eINSTANCE.createElasticInfrastructure()));

        newChildDescriptors.add(this.createChildParameter(ElasticityPackage.Literals.ELASTICITY_SPEC__TARGET_GROUPS,
                TargetsFactory.eINSTANCE.createServiceGroup()));

        newChildDescriptors.add(this.createChildParameter(ElasticityPackage.Literals.ELASTICITY_SPEC__TARGET_GROUPS,
                TargetsFactory.eINSTANCE.createCompetingConsumersGroup()));
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
