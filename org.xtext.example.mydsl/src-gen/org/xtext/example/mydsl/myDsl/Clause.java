/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Clause#getFact <em>Fact</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Clause#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject
{
  /**
   * Returns the value of the '<em><b>Fact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fact</em>' containment reference.
   * @see #setFact(Fact)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClause_Fact()
   * @model containment="true"
   * @generated
   */
  Fact getFact();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Clause#getFact <em>Fact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fact</em>' containment reference.
   * @see #getFact()
   * @generated
   */
  void setFact(Fact value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(Rule)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getClause_Rule()
   * @model containment="true"
   * @generated
   */
  Rule getRule();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Clause#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(Rule value);

} // Clause
