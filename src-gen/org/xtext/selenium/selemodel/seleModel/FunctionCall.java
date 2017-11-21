/**
 * generated by Xtext 2.10.0
 */
package org.xtext.selenium.selemodel.seleModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selenium.selemodel.seleModel.FunctionCall#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.selenium.selemodel.seleModel.FunctionCall#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see org.xtext.selenium.selemodel.seleModel.SeleModelPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Function)
   * @see org.xtext.selenium.selemodel.seleModel.SeleModelPackage#getFunctionCall_Ref()
   * @model
   * @generated
   */
  Function getRef();

  /**
   * Sets the value of the '{@link org.xtext.selenium.selemodel.seleModel.FunctionCall#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Function value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.selenium.selemodel.seleModel.Attribuable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see org.xtext.selenium.selemodel.seleModel.SeleModelPackage#getFunctionCall_Param()
   * @model containment="true"
   * @generated
   */
  EList<Attribuable> getParam();

} // FunctionCall