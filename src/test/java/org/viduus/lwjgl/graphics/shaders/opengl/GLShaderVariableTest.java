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

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Paths;

import org.joml.Matrix4f;
import org.junit.Ignore;
import org.junit.Test;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;
import org.viduus.lwjgl.graphics.shaders.core.ShaderManager;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.util.RelativeShaderLoader;

/**
 * @author ethan
 *
 */
public class GLShaderVariableTest {
	
	/**
	 * Manual test!
	 *
	 * Make sure that when you run this you set the JVM argument, -XstartOnFirstThread.
	 */
	@Ignore
	@Test
	public void test() {
		ShaderManager shader_manager = new GLShaderManager(new RelativeShaderLoader(Paths.get("./src/test/resources/shaders/glsl")));

		GLTestingUtil.windowTest(null, window -> {
			try {
				ShaderProgram program = shader_manager.shader("core_test");
				program.bind();

				program.attributes().forEach(System.out::println);
				program.uniforms().forEach(System.out::println);
				System.out.println();

				program.uniform("num1").value(1);
				program.uniform("projection_matrix").value(new Matrix4f());
				program.uniform("tex_buffer").value(5, 1);

				program.attributes().forEach(System.out::println);
				program.uniforms().forEach(System.out::println);
			} catch (IOException err) {
				throw new UncheckedIOException(err);
			}
		});
	}
	
}
