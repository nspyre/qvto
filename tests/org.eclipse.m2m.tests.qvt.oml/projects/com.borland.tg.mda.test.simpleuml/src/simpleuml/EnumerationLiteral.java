/**
 * <copyright>
 * </copyright>
 *
 * $Id: EnumerationLiteral.java,v 1.1 2007/07/29 21:25:31 radvorak Exp $
 */
package simpleuml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link simpleuml.EnumerationLiteral#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see simpleuml.SimpleumlPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends EObject{
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
     * @see simpleuml.SimpleumlPackage#getEnumerationLiteral_Name()
     * @model
     * @generated
     */
	String getName();

    /**
     * Sets the value of the '{@link simpleuml.EnumerationLiteral#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

} // EnumerationLiteral
