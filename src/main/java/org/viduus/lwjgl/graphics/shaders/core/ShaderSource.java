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

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author ethan
 */
public abstract class ShaderSource {

	private final ShaderType type;
	private final File source_file;
	private final String
			name,
			source;
	private int gpu_id;

	/**
	 * Constructs, compiles, and attaches a new shader source to the active shader program.
	 *
	 * @param program     The parent shader program
	 * @param shader_name The name of the shader
	 * @param type        The type of shader
	 * @throws IOException     If the file failed to read, not thrown if the file does not exist
	 * @throws ShaderException If the source failed to compile
	 */
	public ShaderSource(ShaderProgram program, String shader_name, ShaderType type) throws IOException, ShaderException {
		this.type = type;

		switch (type) {
			case VERTEX:
				shader_name += ".vert";
				break;
			case FRAGMENT:
				shader_name += ".frag";
				break;
			case GEOMETRY:
				shader_name += ".geom";
				break;
		}

		source_file = program.manager().loader.loadShader(shader_name);
		name = source_file.getName();

		// compile and attach to GPU
		if (exists()) {
			source = new String(Files.readAllBytes(source_file.toPath()));
			create();
			compile();
			attach(program);
		} else {
			source = null;
		}
	}

	public String name() {
		return name;
	}

	protected void id(int id) {
		gpu_id = id;
	}

	protected int id() {
		return gpu_id;
	}

	protected String source() {
		return source;
	}

	protected abstract void create();

	protected abstract void compile();

	protected abstract void attach(ShaderProgram program);

	public abstract void delete();

	public boolean exists() {
		return source_file.exists();
	}

	protected ShaderType type() {
		return type;
	}

	protected File file() {
		return source_file;
	}

}
