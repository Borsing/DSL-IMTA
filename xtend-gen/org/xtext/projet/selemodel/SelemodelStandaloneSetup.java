/**
 * generated by Xtext 2.10.0
 */
package org.xtext.projet.selemodel;

import org.xtext.projet.selemodel.SelemodelStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class SelemodelStandaloneSetup extends SelemodelStandaloneSetupGenerated {
  public static void doSetup() {
    SelemodelStandaloneSetup _selemodelStandaloneSetup = new SelemodelStandaloneSetup();
    _selemodelStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
