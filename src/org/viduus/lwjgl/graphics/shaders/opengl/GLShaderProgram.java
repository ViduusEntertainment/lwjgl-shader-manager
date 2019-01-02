/**
 * Copyright 2018 Viduus Entertainment LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Created on Jun 26, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.opengl;

import java.io.IOException;
import java.nio.IntBuffer;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;
import org.viduus.lwjgl.graphics.shaders.core.ShaderException;
import org.viduus.lwjgl.graphics.shaders.core.ShaderManager;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderSource;
import org.viduus.lwjgl.graphics.shaders.core.ShaderType;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariable;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface;
import org.viduus.lwjgl.graphics.shaders.core.SymbolTable;
import org.viduus.lwjgl.graphics.shaders.core.UsageFlag;
import org.viduus.lwjgl.graphics.shaders.core.layouts.JavaLayout;

/**
 * @author ethan
 *
 */
public class GLShaderProgram extends ShaderProgram {

	/**
	 * @param absolute_path
	 * @throws IOException
	 */
	public GLShaderProgram(String absolute_path, ShaderManager manager, ShaderVariableInterface var_interface) throws IOException {
		super(absolute_path, manager, new JavaLayout(), var_interface);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#loadSource(java.lang.String, org.viduus.lwjgl.graphics.shaders.core.ShaderType)
	 */
	@Override
	protected ShaderSource loadSource(String absolute_path, ShaderType type) throws IOException {
		return new GLShaderSource(this, absolute_path, type);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#create()
	 */
	@Override
	protected void createProgram() {
		id(GL20.glCreateProgram());
		errorCheck("createProgram");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#link()
	 */
	@Override
	protected void link() {
		GL20.glLinkProgram(id());
		
		if (GL20.glGetProgrami(id(), GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
			String error = GL20.glGetProgramInfoLog(id());
			delete();
			throw new ShaderException("Failed to link shader program, '%s'.%nOpenGL Info Log:%s", name(), error);
		}
		errorCheck("link");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#validate()
	 */
	@Override
	protected void validate() {
		GL20.glValidateProgram(id());
		errorCheck("validate");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#close()
	 */
	@Override
	public void unbind() {
		GL20.glUseProgram(0);
		errorCheck("unbind");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#use()
	 */
	@Override
	public void bind() {
		GL20.glUseProgram(id());
		for (ShaderVariable var : uniforms()) {
			var.push();
		}
		errorCheck("bind");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#delete()
	 */
	@Override
	public void delete() {
		GL20.glDeleteProgram(id());
		errorCheck("delete");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#errorCheck(java.lang.String)
	 */
	@Override
	public void errorCheck(String info) {
		int err_id = GL11.glGetError();
		if (err_id != GL11.GL_NO_ERROR) {
			String error_code = "";
			switch(err_id){
			case(GL11.GL_INVALID_ENUM):
				error_code = "GL_INVALID_ENUM";
				break;
			case(GL11.GL_INVALID_OPERATION):
				error_code = "GL_INVALID_OPERATION";
				break;
			case(GL11.GL_INVALID_VALUE):
				error_code = "GL_INVALID_VALUE";
				break;
			case(GL11.GL_STACK_OVERFLOW):
				error_code = "GL_STACK_OVERFLOW";
				break;
			case(GL11.GL_STACK_UNDERFLOW):
				error_code = "GL_STACK_UNDERFLOW";
				break;
			case(GL11.GL_OUT_OF_MEMORY):
				error_code = "GL_OUT_OF_MEMORY";
				break;
			}
			System.err.println("OpenGL Error "+error_code+"("+err_id+"): "+info);
		}
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#bindAttributes(int, org.viduus.lwjgl.graphics.shaders.core.ShaderVariable[])
	 */
	@Override
	public void bindAttributes(int byte_offset, ShaderVariable... attributes) {
		// sanity check passed attributes and accumulate stride
		int java_byte_stride = 0;
		for (ShaderVariable attribute : attributes) {
			attribute.usageCheck(UsageFlag.ATTRIBUTE);
			java_byte_stride += attribute.byteSize();
		}

		for (ShaderVariable attribute : attributes) {
			int size = attribute.byteSize();
			int type_length = attribute.typeSize();

			GL20.glEnableVertexAttribArray(attribute.id());
			GL20.glVertexAttribPointer(attribute.id(), type_length, GL11.GL_FLOAT, false, java_byte_stride, byte_offset);
			byte_offset += size;
		}
		errorCheck("bindAttributes");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#unbindAttributes()
	 */
	@Override
	public void unbindAttributes(ShaderVariable ... attributes) {
		for (ShaderVariable attribute : attributes) {
			GL20.glDisableVertexAttribArray(attribute.id());
		}
		errorCheck("unbindAttributes");
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderProgram#loadShaderVariables(org.viduus.lwjgl.graphics.shaders.core.parsers.SymbolTable)
	 */
	@Override
	protected void loadShaderVariables(SymbolTable<ShaderVariable> variables) {
		final int pid = id();
		final int num_attributes = GL20.glGetProgrami(pid, GL20.GL_ACTIVE_ATTRIBUTES);
		final int num_uniforms = GL20.glGetProgrami(pid, GL20.GL_ACTIVE_UNIFORMS);
		
		try (MemoryStack stack = MemoryStack.stackPush()) {
			String name = null;
			IntBuffer size = stack.mallocInt(1);
			IntBuffer type = stack.mallocInt(1);
			
			for (int i=0 ; i<num_attributes ; i++) {
				size.position(0);
				type.position(0);
				name = GL20.glGetActiveAttrib(pid, i, size, type);
				variables.add(new GLShaderVariable(this, name, UsageFlag.ATTRIBUTE, size.get(0), type.get(0)));
			}
			
			for (int i=0 ; i<num_uniforms ; i++) {
				size.position(0);
				type.position(0);
				name = GL20.glGetActiveUniform(pid, i, size, type);
				variables.add(new GLShaderVariable(this, name, UsageFlag.UNIFORM, size.get(0), type.get(0)));
			}
		}
		errorCheck("loadShaderVariables");
	}

}
