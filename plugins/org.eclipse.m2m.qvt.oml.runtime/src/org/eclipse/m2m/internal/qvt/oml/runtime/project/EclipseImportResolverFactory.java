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
package org.eclipse.m2m.internal.qvt.oml.runtime.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.m2m.qvt.oml.compiler.IImportResolver;
import org.eclipse.m2m.qvt.oml.compiler.IImportResolverFactory;


public class EclipseImportResolverFactory implements IImportResolverFactory {
	
	public EclipseImportResolverFactory() {	
	}
	
	public boolean isAccepted(Object source) {
		return source instanceof IProject;
	}
	
	public IImportResolver createResolver(Object source) {
		if(isAccepted(source)) {
			return new EclipseImportResolver((IProject)source);
		}
		throw new IllegalArgumentException("Invalid source object for import resolver:" + source);
	}
}
