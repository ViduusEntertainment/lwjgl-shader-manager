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
 * Created on Jun 27, 2018 by Ethan Toney
 */
package org.viduus.lwjgl.graphics.shaders.opengl;

import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;
import org.viduus.lwjgl.graphics.shaders.core.ShaderManager;

/**
 * @author ethan
 *
 */
public class GLShaderTest {
	
	/**
	 * Make sure that when you run this you set the JVM argument, -XstartOnFirstThread.
	 * This test passes if the program finishing executing and there are no errors or warnings.
	 */
	public static void main(String[] args) {
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
		
		ShaderManager shader_manager = new GLShaderManager("./resources/shaders/glsl");
		shader_manager.shader("core_test");
		shader_manager.shader().bind();
		shader_manager.shader().uniform("number").value(1);
		shader_manager.shader().uniform("projection_matrix").value(new Matrix4f());
		
		GLFW.glfwDestroyWindow(window);
		
		GLFW.glfwTerminate();
		GLFW.glfwSetErrorCallback(null).free();
	}
	
}
