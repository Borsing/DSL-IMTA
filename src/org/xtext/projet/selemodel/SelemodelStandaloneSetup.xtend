/*
 * generated by Xtext 2.10.0
 */
package org.xtext.projet.selemodel


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SelemodelStandaloneSetup extends SelemodelStandaloneSetupGenerated {

	def static void doSetup() {
		new SelemodelStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}