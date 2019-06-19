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
import java.nio.file.Paths;

import org.joml.Matrix4f;
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
public class GLShaderTest {
	
	/**
	 * Make sure that when you run this you set the JVM argument, -XstartOnFirstThread.
	 * This test passes if the program finishing executing and there are no errors or warnings.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		GLFWErrorCallback.createPrint(System.err).set();
		
		if (!GLFW.glfwInit())
			throw new IllegalStateException("Unable to initialize GLFW");
		
		GLFW.glfwDefaultWindowHints();
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3);
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 2);
		GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_FORWARD_COMPAT, GL11.GL_TRUE);
		GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);
		GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_FALSE);
		GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_TRUE);
		
		long window = GLFW.glfwCreateWindow(300, 300, "GLShaderTest", MemoryUtil.NULL, MemoryUtil.NULL);
		if (window == MemoryUtil.NULL)
			throw new RuntimeException("Failed to create the GLFW window");
		
		GLFW.glfwMakeContextCurrent(window);
		GLFW.glfwSwapInterval(1);
		
		GL.createCapabilities();

		ShaderManager shader_manager = new GLShaderManager(new RelativeShaderLoader(Paths.get("./src/test/resources/shaders/glsl")));
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
		
		GLFW.glfwDestroyWindow(window);
		
		GLFW.glfwTerminate();
		GLFW.glfwSetErrorCallback(null).free();
	}
	
}
