/**
 * generated by Xtext 2.10.0
 */
package org.xtext.projet.selemodel.selemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribuable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.Attribuable#getStr <em>Str</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.Attribuable#getAttr <em>Attr</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.Attribuable#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getAttribuable()
 * @model
 * @generated
 */
public interface Attribuable extends EObject
{
  /**
   * Returns the value of the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' attribute.
   * @see #setStr(String)
   * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getAttribuable_Str()
   * @model
   * @generated
   */
  String getStr();

  /**
   * Sets the value of the '{@link org.xtext.projet.selemodel.selemodel.Attribuable#getStr <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' attribute.
   * @see #getStr()
   * @generated
   */
  void setStr(String value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' containment reference.
   * @see #setAttr(Attribut)
   * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getAttribuable_Attr()
   * @model containment="true"
   * @generated
   */
  Attribut getAttr();

  /**
   * Sets the value of the '{@link org.xtext.projet.selemodel.selemodel.Attribuable#getAttr <em>Attr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' containment reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(Attribut value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Var)
   * @see org.xtext.projet.selemodel.selemodel.SelemodelPackage#getAttribuable_Ref()
   * @model
   * @generated
   */
  Var getRef();

  /**
   * Sets the value of the '{@link org.xtext.projet.selemodel.selemodel.Attribuable#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Var value);

} // Attribuable