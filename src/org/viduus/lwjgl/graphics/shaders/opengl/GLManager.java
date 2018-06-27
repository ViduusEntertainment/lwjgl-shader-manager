/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.opengl;

import org.viduus.lwjgl.graphics.shaders.core.ShaderManager;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;

/**
 * @author ethan
 *
 */
public class GLManager extends ShaderManager {

	/**
	 * @param base_path
	 */
	public GLManager(String base_path) {
		super(base_path);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderManager#load(java.lang.String)
	 */
	@Override
	protected ShaderProgram load(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
