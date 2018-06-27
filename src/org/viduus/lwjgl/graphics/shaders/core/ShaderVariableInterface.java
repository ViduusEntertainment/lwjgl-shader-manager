/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.core;

/**
 * @author ethan
 *
 */
public interface ShaderVariableInterface {
	
	public void bindAttribute(ShaderProgram program, ShaderVariable variable);
	
	public void bindUniform(ShaderProgram program, ShaderVariable variable);
	
	public void setUniform(ShaderProgram program, ShaderVariable variable, Object value);
	
}
