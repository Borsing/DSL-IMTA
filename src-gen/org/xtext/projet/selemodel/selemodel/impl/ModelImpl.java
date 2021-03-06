/**
 * generated by Xtext 2.10.0
 */
package org.xtext.projet.selemodel.selemodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.projet.selemodel.selemodel.Function;
import org.xtext.projet.selemodel.selemodel.Model;
import org.xtext.projet.selemodel.selemodel.SelemodelPackage;
import org.xtext.projet.selemodel.selemodel.Test;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ModelImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ModelImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected EList<Test> test;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SelemodelPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Test> getTest()
  {
    if (test == null)
    {
      test = new EObjectContainmentEList<Test>(Test.class, this, SelemodelPackage.MODEL__TEST);
    }
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, SelemodelPackage.MODEL__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SelemodelPackage.MODEL__TEST:
        return ((InternalEList<?>)getTest()).basicRemove(otherEnd, msgs);
      case SelemodelPackage.MODEL__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SelemodelPackage.MODEL__TEST:
        return getTest();
      case SelemodelPackage.MODEL__FUNCTIONS:
        return getFunctions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SelemodelPackage.MODEL__TEST:
        getTest().clear();
        getTest().addAll((Collection<? extends Test>)newValue);
        return;
      case SelemodelPackage.MODEL__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SelemodelPackage.MODEL__TEST:
        getTest().clear();
        return;
      case SelemodelPackage.MODEL__FUNCTIONS:
        getFunctions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SelemodelPackage.MODEL__TEST:
        return test != null && !test.isEmpty();
      case SelemodelPackage.MODEL__FUNCTIONS:
        return functions != null && !functions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
