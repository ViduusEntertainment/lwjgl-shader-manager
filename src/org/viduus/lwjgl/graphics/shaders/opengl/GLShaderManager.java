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

import org.viduus.lwjgl.graphics.shaders.core.ShaderManager;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;

/**
 * @author ethan
 *
 */
public class GLShaderManager extends ShaderManager {

	/**
	 * @param base_path
	 */
	public GLShaderManager(String base_path) {
		super(base_path);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderManager#load(java.lang.String)
	 */
	@Override
	protected ShaderProgram load(String name) throws IOException {
		return new GLShaderProgram(getPath(name), this, new GlVariableInterface());
	}

}
