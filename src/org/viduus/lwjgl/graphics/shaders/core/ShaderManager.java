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
package org.viduus.lwjgl.graphics.shaders.core;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ethan
 *
 */
public abstract class ShaderManager {

	private final String base_path;
	private final Map<String, ShaderProgram> programs;
	
	private ShaderProgram active_program;
	
	public ShaderManager(String base_path) {
		this.base_path = base_path;
		programs = new HashMap<>();
		active_program = null;
	}
	
	protected String getPath(String name) {
		return String.join("/", base_path, name);
	}
	
	public File getShaderFile(String path) {
		return new File(path);
	}
	
	protected abstract ShaderProgram load(String name) throws IOException;
	
	/**
	 * Set the active shader.
	 * 
	 * @param name
	 */
	public void shader(String name) throws IOException {
		if (!programs.containsKey(name)) {
			programs.put(name, load(name));
		}
		
		active_program = programs.get(name);
	}
	
	/**
	 * Get the active shader.
	 * 
	 * @return
	 */
	public ShaderProgram shader() {
		return active_program;
	}
	
}
