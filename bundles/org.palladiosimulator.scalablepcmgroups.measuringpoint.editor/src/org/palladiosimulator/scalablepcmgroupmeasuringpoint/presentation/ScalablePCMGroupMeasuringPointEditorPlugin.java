/**
 */
package org.palladiosimulator.scalablepcmgroupmeasuringpoint.presentation;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.palladiosimulator.edp2.models.ExperimentData.provider.EDP2EditPlugin;
import org.palladiosimulator.elasticity.provider.ElasticityEditPlugin;
import org.palladiosimulator.metricspec.provider.MetricSpecEditPlugin;
import org.palladiosimulator.pcm.core.provider.PalladioComponentModelEditPlugin;
import org.palladiosimulator.scalablepcmgroups.provider.ScalablePCMGroupsEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;
import de.uka.ipd.sdq.probfunction.provider.ProbabilityFunctionEditPlugin;
import de.uka.ipd.sdq.stoex.provider.StoexEditPlugin;
import de.uka.ipd.sdq.units.provider.UnitsEditPlugin;

/**
 * This is the central singleton for the ScalablePCMGroupMeasuringPoint editor plugin. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public final class ScalablePCMGroupMeasuringPointEditorPlugin extends EMFPlugin {
    /**
     * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final ScalablePCMGroupMeasuringPointEditorPlugin INSTANCE = new ScalablePCMGroupMeasuringPointEditorPlugin();

    /**
     * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static Implementation plugin;

    /**
     * Create the instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ScalablePCMGroupMeasuringPointEditorPlugin() {
        super(new ResourceLocator[] { EcoreEditPlugin.INSTANCE, EDP2EditPlugin.INSTANCE, ElasticityEditPlugin.INSTANCE,
                IdentifierEditPlugin.INSTANCE, MetricSpecEditPlugin.INSTANCE, PalladioComponentModelEditPlugin.INSTANCE,
                ProbabilityFunctionEditPlugin.INSTANCE, ScalablePCMGroupsEditPlugin.INSTANCE, StoexEditPlugin.INSTANCE,
                UnitsEditPlugin.INSTANCE, });
    }

    /**
     * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the singleton instance.
     * @generated
     */
    @Override
    public ResourceLocator getPluginResourceLocator() {
        return plugin;
    }

    /**
     * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the singleton instance.
     * @generated
     */
    public static Implementation getPlugin() {
        return plugin;
    }

    /**
     * The actual implementation of the Eclipse <b>Plugin</b>. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static class Implementation extends EclipseUIPlugin {
        /**
         * Creates an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        public Implementation() {
            super();

            // Remember the static instance.
            //
            plugin = this;
        }
    }

}
