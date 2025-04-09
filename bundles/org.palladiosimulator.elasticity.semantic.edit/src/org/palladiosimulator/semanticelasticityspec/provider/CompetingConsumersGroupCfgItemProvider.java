/**
 */
package org.palladiosimulator.semanticelasticityspec.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.semanticelasticityspec.CompetingConsumersGroupCfg;
import org.palladiosimulator.semanticelasticityspec.SemanticelasticityFactory;
import org.palladiosimulator.semanticelasticityspec.SemanticelasticityPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.semanticelasticityspec.CompetingConsumersGroupCfg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompetingConsumersGroupCfgItemProvider extends TargetGroupCfgItemProvider {
	/**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompetingConsumersGroupCfgItemProvider(AdapterFactory adapterFactory) {
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

            addUnitPropertyDescriptor(object);
            addElementsPropertyDescriptor(object);
            addBrokerAssemblyPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

	/**
     * This adds a property descriptor for the Unit feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addUnitPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CompetingConsumersGroupCfg_unit_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CompetingConsumersGroupCfg_unit_feature", "_UI_CompetingConsumersGroupCfg_type"),
                 SemanticelasticityPackage.Literals.COMPETING_CONSUMERS_GROUP_CFG__UNIT,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Elements feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addElementsPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CompetingConsumersGroupCfg_elements_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CompetingConsumersGroupCfg_elements_feature", "_UI_CompetingConsumersGroupCfg_type"),
                 SemanticelasticityPackage.Literals.COMPETING_CONSUMERS_GROUP_CFG__ELEMENTS,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This adds a property descriptor for the Broker Assembly feature.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected void addBrokerAssemblyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_CompetingConsumersGroupCfg_brokerAssembly_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_CompetingConsumersGroupCfg_brokerAssembly_feature", "_UI_CompetingConsumersGroupCfg_type"),
                 SemanticelasticityPackage.Literals.COMPETING_CONSUMERS_GROUP_CFG__BROKER_ASSEMBLY,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

	/**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(SemanticelasticityPackage.Literals.COMPETING_CONSUMERS_GROUP_CFG__UNIT_QUEUES);
        }
        return childrenFeatures;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

	/**
     * This returns CompetingConsumersGroupCfg.gif.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/CompetingConsumersGroupCfg"));
    }

	/**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String getText(Object object) {
        return getString("_UI_CompetingConsumersGroupCfg_type");
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

        switch (notification.getFeatureID(CompetingConsumersGroupCfg.class)) {
            case SemanticelasticityPackage.COMPETING_CONSUMERS_GROUP_CFG__UNIT_QUEUES:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (SemanticelasticityPackage.Literals.COMPETING_CONSUMERS_GROUP_CFG__UNIT_QUEUES,
                 SemanticelasticityFactory.eINSTANCE.createQueue()));
    }

}
