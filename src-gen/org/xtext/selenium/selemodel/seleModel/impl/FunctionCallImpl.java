/**
 * generated by Xtext 2.10.0
 */
package org.xtext.selenium.selemodel.seleModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.selenium.selemodel.seleModel.Attribuable;
import org.xtext.selenium.selemodel.seleModel.Function;
import org.xtext.selenium.selemodel.seleModel.FunctionCall;
import org.xtext.selenium.selemodel.seleModel.SeleModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.selenium.selemodel.seleModel.impl.FunctionCallImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.selenium.selemodel.seleModel.impl.FunctionCallImpl#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends ExpressionImpl implements FunctionCall
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected Function ref;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected EList<Attribuable> param;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionCallImpl()
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
    return SeleModelPackage.Literals.FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (Function)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SeleModelPackage.FUNCTION_CALL__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(Function newRef)
  {
    Function oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeleModelPackage.FUNCTION_CALL__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribuable> getParam()
  {
    if (param == null)
    {
      param = new EObjectContainmentEList<Attribuable>(Attribuable.class, this, SeleModelPackage.FUNCTION_CALL__PARAM);
    }
    return param;
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
      case SeleModelPackage.FUNCTION_CALL__PARAM:
        return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
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
      case SeleModelPackage.FUNCTION_CALL__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case SeleModelPackage.FUNCTION_CALL__PARAM:
        return getParam();
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
      case SeleModelPackage.FUNCTION_CALL__REF:
        setRef((Function)newValue);
        return;
      case SeleModelPackage.FUNCTION_CALL__PARAM:
        getParam().clear();
        getParam().addAll((Collection<? extends Attribuable>)newValue);
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
      case SeleModelPackage.FUNCTION_CALL__REF:
        setRef((Function)null);
        return;
      case SeleModelPackage.FUNCTION_CALL__PARAM:
        getParam().clear();
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
      case SeleModelPackage.FUNCTION_CALL__REF:
        return ref != null;
      case SeleModelPackage.FUNCTION_CALL__PARAM:
        return param != null && !param.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionCallImpl