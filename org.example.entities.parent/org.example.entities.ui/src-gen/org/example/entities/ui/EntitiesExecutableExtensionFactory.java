/*
 * generated by Xtext 2.17.0
 */
package org.example.entities.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.example.entities.ui.internal.EntitiesActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntitiesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(EntitiesActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		EntitiesActivator activator = EntitiesActivator.getInstance();
		return activator != null ? activator.getInjector(EntitiesActivator.ORG_EXAMPLE_ENTITIES_ENTITIES) : null;
	}

}
