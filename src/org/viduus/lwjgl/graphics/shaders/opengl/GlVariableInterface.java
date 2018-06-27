/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.opengl;

import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface;
import org.viduus.lwjgl.graphics.shaders.core.variables.ShaderAttribute;
import org.viduus.lwjgl.graphics.shaders.core.variables.ShaderUniform;

/**
 * @author ethan
 *
 */
public class GlVariableInterface implements ShaderVariableInterface {

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#bindAttribute(org.viduus.lwjgl.graphics.shaders.core.ShaderProgram, org.viduus.lwjgl.graphics.shaders.core.variables.ShaderAttribute)
	 */
	@Override
	public void bindAttribute(ShaderProgram program, ShaderAttribute variable) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#bindUniform(org.viduus.lwjgl.graphics.shaders.core.ShaderProgram, org.viduus.lwjgl.graphics.shaders.core.variables.ShaderUniform)
	 */
	@Override
	public void bindUniform(ShaderProgram program, ShaderUniform variable) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#setUniform(org.viduus.lwjgl.graphics.shaders.core.ShaderProgram, org.viduus.lwjgl.graphics.shaders.core.variables.ShaderUniform, java.lang.Object)
	 */
	@Override
	public void setUniform(ShaderProgram program, ShaderUniform variable, Object value) {
		// TODO Auto-generated method stub
		
	}

}
