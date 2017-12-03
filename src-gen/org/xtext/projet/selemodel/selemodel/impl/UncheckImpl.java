/**
 * generated by Xtext 2.10.0
 */
package org.xtext.projet.selemodel.selemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.projet.selemodel.selemodel.Containers;
import org.xtext.projet.selemodel.selemodel.SelemodelPackage;
import org.xtext.projet.selemodel.selemodel.Uncheck;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uncheck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.UncheckImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.UncheckImpl#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UncheckImpl extends MinimalEObjectImpl.Container implements Uncheck
{
  /**
   * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainer()
   * @generated
   * @ordered
   */
  protected org.xtext.projet.selemodel.selemodel.Container container;

  /**
   * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainers()
   * @generated
   * @ordered
   */
  protected Containers containers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UncheckImpl()
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
    return SelemodelPackage.Literals.UNCHECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.projet.selemodel.selemodel.Container getContainer()
  {
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContainer(org.xtext.projet.selemodel.selemodel.Container newContainer, NotificationChain msgs)
  {
    org.xtext.projet.selemodel.selemodel.Container oldContainer = container;
    container = newContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.UNCHECK__CONTAINER, oldContainer, newContainer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(org.xtext.projet.selemodel.selemodel.Container newContainer)
  {
    if (newContainer != container)
    {
      NotificationChain msgs = null;
      if (container != null)
        msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.UNCHECK__CONTAINER, null, msgs);
      if (newContainer != null)
        msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.UNCHECK__CONTAINER, null, msgs);
      msgs = basicSetContainer(newContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.UNCHECK__CONTAINER, newContainer, newContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Containers getContainers()
  {
    return containers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContainers(Containers newContainers, NotificationChain msgs)
  {
    Containers oldContainers = containers;
    containers = newContainers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.UNCHECK__CONTAINERS, oldContainers, newContainers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainers(Containers newContainers)
  {
    if (newContainers != containers)
    {
      NotificationChain msgs = null;
      if (containers != null)
        msgs = ((InternalEObject)containers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.UNCHECK__CONTAINERS, null, msgs);
      if (newContainers != null)
        msgs = ((InternalEObject)newContainers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.UNCHECK__CONTAINERS, null, msgs);
      msgs = basicSetContainers(newContainers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.UNCHECK__CONTAINERS, newContainers, newContainers));
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
      case SelemodelPackage.UNCHECK__CONTAINER:
        return basicSetContainer(null, msgs);
      case SelemodelPackage.UNCHECK__CONTAINERS:
        return basicSetContainers(null, msgs);
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
      case SelemodelPackage.UNCHECK__CONTAINER:
        return getContainer();
      case SelemodelPackage.UNCHECK__CONTAINERS:
        return getContainers();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SelemodelPackage.UNCHECK__CONTAINER:
        setContainer((org.xtext.projet.selemodel.selemodel.Container)newValue);
        return;
      case SelemodelPackage.UNCHECK__CONTAINERS:
        setContainers((Containers)newValue);
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
      case SelemodelPackage.UNCHECK__CONTAINER:
        setContainer((org.xtext.projet.selemodel.selemodel.Container)null);
        return;
      case SelemodelPackage.UNCHECK__CONTAINERS:
        setContainers((Containers)null);
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
      case SelemodelPackage.UNCHECK__CONTAINER:
        return container != null;
      case SelemodelPackage.UNCHECK__CONTAINERS:
        return containers != null;
    }
    return super.eIsSet(featureID);
  }

} //UncheckImpl