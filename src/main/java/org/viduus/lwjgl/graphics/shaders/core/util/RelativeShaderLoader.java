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

package org.viduus.lwjgl.graphics.shaders.core.util;

import java.io.File;
import java.nio.file.Path;

/**
 * This basic ShaderLoader implementation takes a base path and assumes that all shader names
 * correspond to paths relative to the base path.
 */
public class RelativeShaderLoader implements ShaderLoader {

	private final Path base_path;

	public RelativeShaderLoader(Path base_path) {
		this.base_path = base_path;
	}

	@Override
	public File loadShader(String shader_name) {
		return base_path.resolve(shader_name).toFile();
	}

}
