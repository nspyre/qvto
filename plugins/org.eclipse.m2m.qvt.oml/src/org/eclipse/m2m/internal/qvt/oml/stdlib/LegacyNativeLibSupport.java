/*******************************************************************************
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.stdlib;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.m2m.internal.qvt.oml.ast.binding.ASTBindingHelper;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEnv;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEnvFactory;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEvaluationEnv;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalModuleEnv;
import org.eclipse.m2m.internal.qvt.oml.ast.parser.QvtOperationalUtil;
import org.eclipse.m2m.internal.qvt.oml.cst.CSTFactory;
import org.eclipse.m2m.internal.qvt.oml.expressions.Module;
import org.eclipse.m2m.internal.qvt.oml.expressions.impl.ExpressionsFactoryImpl;
import org.eclipse.m2m.internal.qvt.oml.library.IContext;
import org.eclipse.m2m.internal.qvt.oml.ocl.OclQvtoPlugin;
import org.eclipse.m2m.internal.qvt.oml.ocl.transformations.Library;
import org.eclipse.m2m.internal.qvt.oml.ocl.transformations.LibraryCreationException;
import org.eclipse.m2m.internal.qvt.oml.ocl.transformations.LibraryOperation;
import org.eclipse.ocl.expressions.ExpressionsFactory;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.util.TypeUtil;

/**
 * This class facilitates registration and invocation of legacy java native
 * operation hooked into QVT environments.
 * <p>
 * Remark: It has come from the initial contribution.
 */
public class LegacyNativeLibSupport {

	public static final LegacyNativeLibSupport INSTANCE = createInstance(); 
	
	private LegacyNativeLibSupport() {
	}
	
	public QvtOperationalModuleEnv defineLibrary(Library lib) throws LibraryCreationException {
		final org.eclipse.m2m.internal.qvt.oml.expressions.Library libModule = org.eclipse.m2m.internal.qvt.oml.expressions.ExpressionsFactory.eINSTANCE.createLibrary();		
		libModule.setName(lib.getId());
		// FIXME - set isBlackBox=TRUE, as soon is it gets into the AST metamodel
				
        // must set the instance factory as a QVT module is also a Package 
        libModule.setEFactoryInstance(new ExpressionsFactoryImpl());
		
        QvtOperationalModuleEnv libEnv = initLibEnvironment(lib, libModule);
		libModule.eResource().setURI(URI.createURI("qvto:/blackboxlib/" + lib.getId()));		
        		
		for (LibraryOperation libOp : lib.getLibraryOperations()) {
	        QvtLibraryOperation qvtLibOp = new QvtLibraryOperation(libEnv, libOp);
	        EClassifier ctxType = qvtLibOp.getContextType();
	        
	        if(ctxType  == libEnv.getOCLStandardLibrary().getOclVoid()) {
	        	ctxType = libModule;
	        }

	        defineOperation(libEnv, libOp, ctxType, qvtLibOp.getReturnType(), qvtLibOp.getParamTypes());
		}
		
		return libEnv;
	}
	
	public static Module getLibraryModule(String libraryID) throws LibraryCreationException  {
		Library library = OclQvtoPlugin.getDefault().getLibrariesRegistry().getLibrary(libraryID);
		if(library == null) {
			return null;
		}
		
		QvtOperationalModuleEnv libraryEnv = INSTANCE.defineLibrary(library);		
		// FIXME - workaround to make Environment available with the module
		ASTBindingHelper.createCST2ASTBinding(CSTFactory.eINSTANCE.createLibraryCS(), libraryEnv.getModuleContextType(), libraryEnv);		
		return libraryEnv.getModuleContextType();
	}
	
	private static QvtOperationalModuleEnv initLibEnvironment(Library lib, Module libModule) {
		QvtOperationalModuleEnv libEnv = QvtOperationalEnvFactory.INSTANCE.createModuleEnvironment(libModule);
		EPackage.Registry libEnvRegistry = libEnv.getEPackageRegistry();

		EPackage oclStdlibPackage = libEnv.getOCLStandardLibrary().getOclAny().getEPackage();
		libEnv.getEPackageRegistry().put(oclStdlibPackage.getNsURI(), oclStdlibPackage);
		if (lib.getInMetamodels() != null) {
			for (String mm : lib.getInMetamodels()) {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(mm);
				if(ePackage != null) {
					libEnvRegistry.put(mm, ePackage);
				}
			}
		}
		if (lib.getOutMetamodels() != null) {
			for (String mm : lib.getOutMetamodels()) {
				EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(mm);
				if(ePackage != null) {
					libEnvRegistry.put(mm, ePackage);
				}
			}
		}
		return libEnv;
	}
		
	private static class Handler implements CallHandler {
		private LibraryOperation fOperation;
		private Class<?> fReturnClass;

		private Handler(LibraryOperation operation, Class<?> returnClass) {
			assert operation != null;
			fOperation = operation;
			fReturnClass = returnClass;
		}
		
		public Object invoke(Object source, Object[] args, QvtOperationalEvaluationEnv evalEnv, IContext context) {		
			return callOperation(evalEnv, context, fOperation, source, args, fReturnClass);
		}
	}
	

	private static Object callOperation(QvtOperationalEvaluationEnv evalEnv, IContext context, 
			LibraryOperation libOp, Object source, Object[] args, Class<?> returnClass) {
		
		if(source == null || source == evalEnv.getInvalid()) {
			return evalEnv.getInvalid();
		}
		
        // reset OclInvalid to 'null'
    	Object[] callArgs = null;            
        if(args != null) {
            for (int i = 0; i < args.length; i++) {
            	if(evalEnv.isOclInvalid(args[i])) {
            		if(callArgs == null) {
            			callArgs = new Object[args.length];
            			System.arraycopy(args, 0, callArgs, 0, args.length);
            		}
            		callArgs[i] = null;
            	}
    		}
            callArgs = (callArgs == null) ? args : callArgs;
        }

        Object result = libOp.run(source, callArgs, new Object[0], returnClass);
        if (result == null) {
            return QvtOperationalUtil.getOclInvalid();
        }
        return result;
	}
	
	private static EOperation defineOperation(QvtOperationalEnv env, LibraryOperation libOperation, 
			EClassifier contextType, EClassifier returnType, EClassifier... paramTypes) {
		
		List<Variable<EClassifier, EParameter>> stringArgList = new ArrayList<Variable<EClassifier, EParameter>>();
		for (EClassifier cls : paramTypes) {
			Variable<EClassifier, EParameter> stringVariable = ExpressionsFactory.eINSTANCE.createVariable();
			stringVariable.setName(cls.getName());
			stringVariable.setType(cls);
			stringArgList.add(stringVariable);
		}
		
		String opName = libOperation.getName();
		EOperation operation = TypeUtil.findOperationMatching(env, contextType, opName, stringArgList);
		if (operation != null) {
			for (EParameter	eParameter : operation.getEParameters()) {
				eParameter.setName(eParameter.getEType().getName());
			}
			
			Class<?> returnClass = (returnType != null) ? returnType.getInstanceClass() : null;
			CallHandlerAdapter.attach(operation, new Handler(libOperation, returnClass)); 
		} else {
			// TODO - log error
		}

		return operation;
	}
        
	private static LegacyNativeLibSupport createInstance() {
		LegacyNativeLibSupport lib = new LegacyNativeLibSupport();
		return lib;
	}			
}
