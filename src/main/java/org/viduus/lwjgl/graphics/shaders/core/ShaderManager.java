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
package org.viduus.lwjgl.graphics.shaders.core;

import org.viduus.lwjgl.graphics.shaders.core.util.ShaderLoader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ethan
 */
public abstract class ShaderManager {

	final ShaderLoader loader;
	private final Map<String, ShaderProgram> programs;

	/**
	 * Creates a new shader manager instance.
	 *
	 * @param loader A loader that handles all of the file IO operations
	 */
	public ShaderManager(ShaderLoader loader) {
		this.loader = loader;
		this.programs = new HashMap<>();
	}

	/**
	 * Loads the specified shader program.
	 *
	 * @param shader_name The name of the shader program to load
	 * @return The new shader program
	 * @throws IOException If the shaders could not be found or read
	 */
	protected abstract ShaderProgram load(String shader_name) throws IOException;

	/**
	 * Get the specified shader. If not already loaded it will be loaded.
	 *
	 * @param shader_name The name of the shader program
	 * @return The shader program
	 * @throws IOException If the shader was not already loaded and could not be loaded
	 */
	public ShaderProgram shader(String shader_name) throws IOException {
		if (!programs.containsKey(shader_name)) {
			programs.put(shader_name, load(shader_name));
		}

		return programs.get(shader_name);
	}

}
