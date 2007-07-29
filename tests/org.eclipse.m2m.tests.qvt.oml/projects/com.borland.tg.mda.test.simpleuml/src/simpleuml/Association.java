/**
 * <copyright>
 * </copyright>
 *
 * $Id: Association.java,v 1.1 2007/07/29 21:25:31 radvorak Exp $
 */
package simpleuml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleuml.Association#getSource <em>Source</em>}</li>
 *   <li>{@link simpleuml.Association#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleuml.SimpleumlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends ModelElement, Packageable{
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(simpleuml.Class)
     * @see simpleuml.SimpleumlPackage#getAssociation_Source()
     * @model required="true"
     * @generated
     */
	simpleuml.Class getSource();

    /**
     * Sets the value of the '{@link simpleuml.Association#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
	void setSource(simpleuml.Class value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(simpleuml.Class)
     * @see simpleuml.SimpleumlPackage#getAssociation_Target()
     * @model required="true"
     * @generated
     */
	simpleuml.Class getTarget();

    /**
     * Sets the value of the '{@link simpleuml.Association#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
	void setTarget(simpleuml.Class value);

} // Association
