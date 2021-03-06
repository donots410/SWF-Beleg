/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Functor;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Predicate;
import org.xtext.example.mydsl.myDsl.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PredicateImpl#getFunctor <em>Functor</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PredicateImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.PredicateImpl#getNextterm <em>Nextterm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredicateImpl extends MinimalEObjectImpl.Container implements Predicate
{
  /**
   * The cached value of the '{@link #getFunctor() <em>Functor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctor()
   * @generated
   * @ordered
   */
  protected Functor functor;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected Term term;

  /**
   * The cached value of the '{@link #getNextterm() <em>Nextterm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNextterm()
   * @generated
   * @ordered
   */
  protected EList<Term> nextterm;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PredicateImpl()
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
    return MyDslPackage.Literals.PREDICATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Functor getFunctor()
  {
    return functor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctor(Functor newFunctor, NotificationChain msgs)
  {
    Functor oldFunctor = functor;
    functor = newFunctor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PREDICATE__FUNCTOR, oldFunctor, newFunctor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctor(Functor newFunctor)
  {
    if (newFunctor != functor)
    {
      NotificationChain msgs = null;
      if (functor != null)
        msgs = ((InternalEObject)functor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PREDICATE__FUNCTOR, null, msgs);
      if (newFunctor != null)
        msgs = ((InternalEObject)newFunctor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PREDICATE__FUNCTOR, null, msgs);
      msgs = basicSetFunctor(newFunctor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PREDICATE__FUNCTOR, newFunctor, newFunctor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs)
  {
    Term oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PREDICATE__TERM, oldTerm, newTerm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTerm(Term newTerm)
  {
    if (newTerm != term)
    {
      NotificationChain msgs = null;
      if (term != null)
        msgs = ((InternalEObject)term).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PREDICATE__TERM, null, msgs);
      if (newTerm != null)
        msgs = ((InternalEObject)newTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PREDICATE__TERM, null, msgs);
      msgs = basicSetTerm(newTerm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PREDICATE__TERM, newTerm, newTerm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getNextterm()
  {
    if (nextterm == null)
    {
      nextterm = new EObjectContainmentEList<Term>(Term.class, this, MyDslPackage.PREDICATE__NEXTTERM);
    }
    return nextterm;
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
      case MyDslPackage.PREDICATE__FUNCTOR:
        return basicSetFunctor(null, msgs);
      case MyDslPackage.PREDICATE__TERM:
        return basicSetTerm(null, msgs);
      case MyDslPackage.PREDICATE__NEXTTERM:
        return ((InternalEList<?>)getNextterm()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.PREDICATE__FUNCTOR:
        return getFunctor();
      case MyDslPackage.PREDICATE__TERM:
        return getTerm();
      case MyDslPackage.PREDICATE__NEXTTERM:
        return getNextterm();
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
      case MyDslPackage.PREDICATE__FUNCTOR:
        setFunctor((Functor)newValue);
        return;
      case MyDslPackage.PREDICATE__TERM:
        setTerm((Term)newValue);
        return;
      case MyDslPackage.PREDICATE__NEXTTERM:
        getNextterm().clear();
        getNextterm().addAll((Collection<? extends Term>)newValue);
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
      case MyDslPackage.PREDICATE__FUNCTOR:
        setFunctor((Functor)null);
        return;
      case MyDslPackage.PREDICATE__TERM:
        setTerm((Term)null);
        return;
      case MyDslPackage.PREDICATE__NEXTTERM:
        getNextterm().clear();
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
      case MyDslPackage.PREDICATE__FUNCTOR:
        return functor != null;
      case MyDslPackage.PREDICATE__TERM:
        return term != null;
      case MyDslPackage.PREDICATE__NEXTTERM:
        return nextterm != null && !nextterm.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PredicateImpl
