/**
 * generated by Xtext 2.10.0
 */
package org.xtext.selenium.selemodel.seleModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selenium.selemodel.seleModel.Navigate#getAttb <em>Attb</em>}</li>
 * </ul>
 *
 * @see org.xtext.selenium.selemodel.seleModel.SeleModelPackage#getNavigate()
 * @model
 * @generated
 */
public interface Navigate extends Action
{
  /**
   * Returns the value of the '<em><b>Attb</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attb</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attb</em>' containment reference.
   * @see #setAttb(Attribuable)
   * @see org.xtext.selenium.selemodel.seleModel.SeleModelPackage#getNavigate_Attb()
   * @model containment="true"
   * @generated
   */
  Attribuable getAttb();

  /**
   * Sets the value of the '{@link org.xtext.selenium.selemodel.seleModel.Navigate#getAttb <em>Attb</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attb</em>' containment reference.
   * @see #getAttb()
   * @generated
   */
  void setAttb(Attribuable value);

} // Navigate
