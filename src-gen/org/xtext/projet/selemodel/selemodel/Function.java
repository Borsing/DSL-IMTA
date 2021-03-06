/**
 * generated by Xtext 2.10.0
 */
package org.xtext.projet.selemodel.selemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.Function#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.Function#getParam <em>Param</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.Function#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getFunction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.projet.selemodel.selemodel.Function#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.projet.selemodel.selemodel.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference list.
   * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getFunction_Param()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getParam();

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.projet.selemodel.selemodel.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getFunction_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpressions();

} // Function
