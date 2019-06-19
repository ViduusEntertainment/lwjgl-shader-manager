/*
 * Copyright 2019 Viduus Entertainment LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.viduus.lwjgl.graphics.shaders.opengl;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL32;
import org.viduus.lwjgl.graphics.shaders.core.ShaderException;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderSource;
import org.viduus.lwjgl.graphics.shaders.core.ShaderType;

import java.io.IOException;

/**
 * @author ethan
 */
public class GLShaderSource extends ShaderSource {

	/**
	 * @param absolute_path
	 * @param type
	 * @throws IOException
	 */
	public GLShaderSource(ShaderProgram program, String absolute_path, ShaderType type) throws IOException {
		super(program, absolute_path, type);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#create()
	 */
	@Override
	protected void create() {
		switch (type()) {
			case VERTEX:
				id(GL20.glCreateShader(GL20.GL_VERTEX_SHADER));
				break;
			case FRAGMENT:
				id(GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER));
				break;
			case GEOMETRY:
				id(GL20.glCreateShader(GL32.GL_GEOMETRY_SHADER));
				break;
			default:
				throw new ShaderException("Can not create shader of type '%s'", type());
		}
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#compile()
	 */
	@Override
	protected void compile() {
		GL20.glShaderSource(id(), source());
		GL20.glCompileShader(id());

		if (GL20.glGetShaderi(id(), GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
			String error = GL20.glGetShaderInfoLog(id());
			delete();
			throw new ShaderException("Failed to compile shader program, '%s'.%nOpenGL Info Log:%s", name(), error);
		}
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#attach()
	 */
	@Override
	protected void attach(ShaderProgram prog) {
		GL20.glAttachShader(prog.id(), id());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderSource#delete()
	 */
	@Override
	public void delete() {
		GL20.glDeleteShader(id());
	}

}
