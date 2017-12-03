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

import org.xtext.projet.selemodel.selemodel.Action;
import org.xtext.projet.selemodel.selemodel.Check;
import org.xtext.projet.selemodel.selemodel.Choose;
import org.xtext.projet.selemodel.selemodel.Click;
import org.xtext.projet.selemodel.selemodel.Fill;
import org.xtext.projet.selemodel.selemodel.Navigate;
import org.xtext.projet.selemodel.selemodel.OpenBrowser;
import org.xtext.projet.selemodel.selemodel.SelemodelPackage;
import org.xtext.projet.selemodel.selemodel.Uncheck;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ActionImpl#getBrw <em>Brw</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ActionImpl#getFil <em>Fil</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ActionImpl#getCli <em>Cli</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ActionImpl#getNav <em>Nav</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ActionImpl#getCho <em>Cho</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ActionImpl#getChe <em>Che</em>}</li>
 *   <li>{@link org.xtext.projet.selemodel.selemodel.impl.ActionImpl#getUnc <em>Unc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The cached value of the '{@link #getBrw() <em>Brw</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBrw()
   * @generated
   * @ordered
   */
  protected OpenBrowser brw;

  /**
   * The cached value of the '{@link #getFil() <em>Fil</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFil()
   * @generated
   * @ordered
   */
  protected Fill fil;

  /**
   * The cached value of the '{@link #getCli() <em>Cli</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCli()
   * @generated
   * @ordered
   */
  protected Click cli;

  /**
   * The cached value of the '{@link #getNav() <em>Nav</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNav()
   * @generated
   * @ordered
   */
  protected Navigate nav;

  /**
   * The cached value of the '{@link #getCho() <em>Cho</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCho()
   * @generated
   * @ordered
   */
  protected Choose cho;

  /**
   * The cached value of the '{@link #getChe() <em>Che</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChe()
   * @generated
   * @ordered
   */
  protected Check che;

  /**
   * The cached value of the '{@link #getUnc() <em>Unc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnc()
   * @generated
   * @ordered
   */
  protected Uncheck unc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return SelemodelPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenBrowser getBrw()
  {
    return brw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBrw(OpenBrowser newBrw, NotificationChain msgs)
  {
    OpenBrowser oldBrw = brw;
    brw = newBrw;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__BRW, oldBrw, newBrw);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBrw(OpenBrowser newBrw)
  {
    if (newBrw != brw)
    {
      NotificationChain msgs = null;
      if (brw != null)
        msgs = ((InternalEObject)brw).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__BRW, null, msgs);
      if (newBrw != null)
        msgs = ((InternalEObject)newBrw).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__BRW, null, msgs);
      msgs = basicSetBrw(newBrw, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__BRW, newBrw, newBrw));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fill getFil()
  {
    return fil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFil(Fill newFil, NotificationChain msgs)
  {
    Fill oldFil = fil;
    fil = newFil;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__FIL, oldFil, newFil);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFil(Fill newFil)
  {
    if (newFil != fil)
    {
      NotificationChain msgs = null;
      if (fil != null)
        msgs = ((InternalEObject)fil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__FIL, null, msgs);
      if (newFil != null)
        msgs = ((InternalEObject)newFil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__FIL, null, msgs);
      msgs = basicSetFil(newFil, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__FIL, newFil, newFil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Click getCli()
  {
    return cli;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCli(Click newCli, NotificationChain msgs)
  {
    Click oldCli = cli;
    cli = newCli;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__CLI, oldCli, newCli);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCli(Click newCli)
  {
    if (newCli != cli)
    {
      NotificationChain msgs = null;
      if (cli != null)
        msgs = ((InternalEObject)cli).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__CLI, null, msgs);
      if (newCli != null)
        msgs = ((InternalEObject)newCli).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__CLI, null, msgs);
      msgs = basicSetCli(newCli, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__CLI, newCli, newCli));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navigate getNav()
  {
    return nav;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNav(Navigate newNav, NotificationChain msgs)
  {
    Navigate oldNav = nav;
    nav = newNav;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__NAV, oldNav, newNav);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNav(Navigate newNav)
  {
    if (newNav != nav)
    {
      NotificationChain msgs = null;
      if (nav != null)
        msgs = ((InternalEObject)nav).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__NAV, null, msgs);
      if (newNav != null)
        msgs = ((InternalEObject)newNav).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__NAV, null, msgs);
      msgs = basicSetNav(newNav, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__NAV, newNav, newNav));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Choose getCho()
  {
    return cho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCho(Choose newCho, NotificationChain msgs)
  {
    Choose oldCho = cho;
    cho = newCho;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__CHO, oldCho, newCho);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCho(Choose newCho)
  {
    if (newCho != cho)
    {
      NotificationChain msgs = null;
      if (cho != null)
        msgs = ((InternalEObject)cho).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__CHO, null, msgs);
      if (newCho != null)
        msgs = ((InternalEObject)newCho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__CHO, null, msgs);
      msgs = basicSetCho(newCho, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__CHO, newCho, newCho));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Check getChe()
  {
    return che;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChe(Check newChe, NotificationChain msgs)
  {
    Check oldChe = che;
    che = newChe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__CHE, oldChe, newChe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChe(Check newChe)
  {
    if (newChe != che)
    {
      NotificationChain msgs = null;
      if (che != null)
        msgs = ((InternalEObject)che).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__CHE, null, msgs);
      if (newChe != null)
        msgs = ((InternalEObject)newChe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__CHE, null, msgs);
      msgs = basicSetChe(newChe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__CHE, newChe, newChe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uncheck getUnc()
  {
    return unc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnc(Uncheck newUnc, NotificationChain msgs)
  {
    Uncheck oldUnc = unc;
    unc = newUnc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__UNC, oldUnc, newUnc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnc(Uncheck newUnc)
  {
    if (newUnc != unc)
    {
      NotificationChain msgs = null;
      if (unc != null)
        msgs = ((InternalEObject)unc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__UNC, null, msgs);
      if (newUnc != null)
        msgs = ((InternalEObject)newUnc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelemodelPackage.ACTION__UNC, null, msgs);
      msgs = basicSetUnc(newUnc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SelemodelPackage.ACTION__UNC, newUnc, newUnc));
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
      case SelemodelPackage.ACTION__BRW:
        return basicSetBrw(null, msgs);
      case SelemodelPackage.ACTION__FIL:
        return basicSetFil(null, msgs);
      case SelemodelPackage.ACTION__CLI:
        return basicSetCli(null, msgs);
      case SelemodelPackage.ACTION__NAV:
        return basicSetNav(null, msgs);
      case SelemodelPackage.ACTION__CHO:
        return basicSetCho(null, msgs);
      case SelemodelPackage.ACTION__CHE:
        return basicSetChe(null, msgs);
      case SelemodelPackage.ACTION__UNC:
        return basicSetUnc(null, msgs);
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
      case SelemodelPackage.ACTION__BRW:
        return getBrw();
      case SelemodelPackage.ACTION__FIL:
        return getFil();
      case SelemodelPackage.ACTION__CLI:
        return getCli();
      case SelemodelPackage.ACTION__NAV:
        return getNav();
      case SelemodelPackage.ACTION__CHO:
        return getCho();
      case SelemodelPackage.ACTION__CHE:
        return getChe();
      case SelemodelPackage.ACTION__UNC:
        return getUnc();
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
      case SelemodelPackage.ACTION__BRW:
        setBrw((OpenBrowser)newValue);
        return;
      case SelemodelPackage.ACTION__FIL:
        setFil((Fill)newValue);
        return;
      case SelemodelPackage.ACTION__CLI:
        setCli((Click)newValue);
        return;
      case SelemodelPackage.ACTION__NAV:
        setNav((Navigate)newValue);
        return;
      case SelemodelPackage.ACTION__CHO:
        setCho((Choose)newValue);
        return;
      case SelemodelPackage.ACTION__CHE:
        setChe((Check)newValue);
        return;
      case SelemodelPackage.ACTION__UNC:
        setUnc((Uncheck)newValue);
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
      case SelemodelPackage.ACTION__BRW:
        setBrw((OpenBrowser)null);
        return;
      case SelemodelPackage.ACTION__FIL:
        setFil((Fill)null);
        return;
      case SelemodelPackage.ACTION__CLI:
        setCli((Click)null);
        return;
      case SelemodelPackage.ACTION__NAV:
        setNav((Navigate)null);
        return;
      case SelemodelPackage.ACTION__CHO:
        setCho((Choose)null);
        return;
      case SelemodelPackage.ACTION__CHE:
        setChe((Check)null);
        return;
      case SelemodelPackage.ACTION__UNC:
        setUnc((Uncheck)null);
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
      case SelemodelPackage.ACTION__BRW:
        return brw != null;
      case SelemodelPackage.ACTION__FIL:
        return fil != null;
      case SelemodelPackage.ACTION__CLI:
        return cli != null;
      case SelemodelPackage.ACTION__NAV:
        return nav != null;
      case SelemodelPackage.ACTION__CHO:
        return cho != null;
      case SelemodelPackage.ACTION__CHE:
        return che != null;
      case SelemodelPackage.ACTION__UNC:
        return unc != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
