/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PathNameCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Transformation Header CS</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS#getQualifiers <em>Qualifiers</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS#getPathNameCS <em>Path Name CS</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS#getModuleUsages <em>Module Usages</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS#getTransformationRefineCS <em>Transformation Refine CS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage#getTransformationHeaderCS()
 * @model
 * @generated
 */
public interface TransformationHeaderCS
		extends ElementCS {

	/**
	 * Returns the value of the '<em><b>Qualifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.StringLiteralExpCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifiers</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifiers</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage#getTransformationHeaderCS_Qualifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<StringLiteralExpCS> getQualifiers();

	/**
	 * Returns the value of the '<em><b>Path Name CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Name CS</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Name CS</em>' containment reference.
	 * @see #setPathNameCS(PathNameCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage#getTransformationHeaderCS_PathNameCS()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PathNameCS getPathNameCS();

	/**
	 * Sets the value of the '{@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS#getPathNameCS <em>Path Name CS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Name CS</em>' containment reference.
	 * @see #getPathNameCS()
	 * @generated
	 */
	void setPathNameCS(PathNameCS value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ParameterDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage#getTransformationHeaderCS_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterDeclarationCS> getParameters();

	/**
	 * Returns the value of the '<em><b>Module Usages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModuleUsageCS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Usages</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Usages</em>' containment reference list.
	 * @see org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage#getTransformationHeaderCS_ModuleUsages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleUsageCS> getModuleUsages();

	/**
	 * Returns the value of the '<em><b>Transformation Refine CS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation Refine CS</em>' containment
	 * reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation Refine CS</em>' containment reference.
	 * @see #setTransformationRefineCS(TransformationRefineCS)
	 * @see org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage#getTransformationHeaderCS_TransformationRefineCS()
	 * @model containment="true"
	 * @generated
	 */
	TransformationRefineCS getTransformationRefineCS();

	/**
	 * Sets the value of the '
	 * {@link org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS#getTransformationRefineCS
	 * <em>Transformation Refine CS</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Transformation Refine CS</em>'
	 *            containment reference.
	 * @see #getTransformationRefineCS()
	 * @generated
	 */
	void setTransformationRefineCS(TransformationRefineCS value);

} // TransformationHeaderCS