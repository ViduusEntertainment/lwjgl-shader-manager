/**
 * Copyright 2017-2018, Viduus Entertainment LLC, All rights reserved.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.opengl;

import java.io.IOException;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.viduus.lwjgl.graphics.shaders.core.ShaderException;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderSource;
import org.viduus.lwjgl.graphics.shaders.core.ShaderType;
import org.viduus.lwjgl.graphics.shaders.core.layouts.JavaLayout;
import org.viduus.lwjgl.graphics.shaders.core.parsers.Variable;
import org.viduus.lwjgl.graphics.shaders.core.variables.ShaderAttribute;
import org.viduus.lwjgl.graphics.shaders.core.variables.ShaderUniform;

/**
 * @author ethan
 *
 */
public class GLShaderProgram extends ShaderProgram {

	/**
	 * @param absolute_path
	 * @throws IOException
	 */
	public GLShaderProgram(String absolute_path) throws IOException {
		super(absolute_path, new JavaLayout(), new GlVariableInterface());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#loadSource(java.lang.String, org.viduus.lwjgl.graphics.shaders.core.ShaderType)
	 */
	@Override
	protected ShaderSource loadSource(String absolute_path, ShaderType type) {
		return new GLShaderSource(this, absolute_path, type);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#create()
	 */
	@Override
	protected void createProgram() {
		id(GL20.glCreateProgram());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#link()
	 */
	@Override
	protected void link() {
		GL20.glLinkProgram(id());
		
        if (GL20.glGetProgrami(id(), GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
        		delete();
            throw new ShaderException("Failed to link shader program, '%s'.%nOpenGL Info Log:%s", name(), GL20.glGetProgramInfoLog(id()));
        }
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#initAttribute(org.viduus.lwjgl.graphics.shaders.core.parsers.Variable)
	 */
	@Override
	protected void bindAttribute(Variable attribute) {
		int id=0;
		
		// Assign variables an id, Has to happen before glLinkProgram
		for (ShaderArray<ShaderAttribute> array : attribute_variables.values()) {
			for (ShaderAttribute variable : array) {
				variable.setId(program_id, ++id);
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#bindUniform(org.viduus.lwjgl.graphics.shaders.core.parsers.Variable)
	 */
	@Override
	protected void bindUniform(Variable uniform) {
		// Assign varaibles an id, Has to happen after glLinkProgram
		for( ShaderArray<ShaderUniform> array : uniform_variables.values() ){
			for( ShaderUniform variable : array ){
				variable.setUniformId( program_id );
			}
		}
		
		for( ShaderArray<ShaderStruct> array : uniform_structs.values() ){
			for( ShaderStruct struct : array ){
				struct.setId( program_id );
			}
		}
		
		for( ShaderArray<ShaderUniformBlock> array : uniform_blocks.values() ){
			for( ShaderUniformBlock block : array ){
				block.setId( program_id );
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#validate()
	 */
	@Override
	protected void validate() {
		GL20.glValidateProgram(id());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#close()
	 */
	@Override
	public void close() {
		GL20.glUseProgram(0);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#use()
	 */
	@Override
	public void use() {
		GL20.glUseProgram(id());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#delete()
	 */
	@Override
	public void delete() {
		GL20.glDeleteProgram(id());
	}

}
