/*
 * generated by Xtext 2.16.0
 */
package org.example.entities.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.example.entities.EntitiesRuntimeModule
import org.example.entities.EntitiesStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class EntitiesIdeSetup extends EntitiesStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new EntitiesRuntimeModule, new EntitiesIdeModule))
	}
	
}
