/*
 * generated by Xtext 2.10.0
 */
package org.xtext.selenium.selemodel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SeleModelStandaloneSetup extends SeleModelStandaloneSetupGenerated {

	def static void doSetup() {
		new SeleModelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}