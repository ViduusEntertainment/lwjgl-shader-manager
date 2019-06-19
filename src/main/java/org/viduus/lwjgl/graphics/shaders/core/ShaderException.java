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

/**
 * A basic shader exception that could be thrown for any number of reasons. Such as a shader
 * variable not being found or being of the wrong type.
 */
public class ShaderException extends RuntimeException {

	private static final long serialVersionUID = -4324426805264293422L;

	public ShaderException(String text, Object... objects) {
		super(String.format(text, objects));
	}

}
