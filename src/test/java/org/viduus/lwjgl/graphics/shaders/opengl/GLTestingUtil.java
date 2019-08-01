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

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.MemoryUtil;

import java.util.function.Consumer;

class GLTestingUtil {

	public static void windowTest(Consumer<Long> init, Consumer<Long> test) {
		GLFWErrorCallback.createPrint(System.err).set();

		if (!GLFW.glfwInit())
			throw new IllegalStateException("Unable to initialize GLFW");

		GLFW.glfwDefaultWindowHints();
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3);
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 2);
		GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_FORWARD_COMPAT, GL11.GL_TRUE);
		GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);
		GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GLFW.GLFW_TRUE);
		GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GLFW.GLFW_TRUE);

		long window_id = GLFW.glfwCreateWindow(300, 300, "GLShaderTest", MemoryUtil.NULL, MemoryUtil.NULL);
		if (window_id == MemoryUtil.NULL)
			throw new RuntimeException("Failed to create the GLFW window");

		GLFW.glfwSetKeyCallback(window_id, (long window, int key, int scancode, int action, int mods) -> {
			if (key == GLFW.GLFW_KEY_ESCAPE && action == GLFW.GLFW_RELEASE)
				GLFW.glfwSetWindowShouldClose(window, true);
		});

		GLFW.glfwMakeContextCurrent(window_id);
		GLFW.glfwSwapInterval(1);

		GL.createCapabilities();

		if (init != null)
			init.accept(window_id);

		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

		while (!GLFW.glfwWindowShouldClose(window_id)) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);

			if (test != null)
				test.accept(window_id);

			GLFW.glfwSwapBuffers(window_id);
			GLFW.glfwPollEvents();
		}

		GLFW.glfwDestroyWindow(window_id);

		GLFW.glfwTerminate();
		GLFW.glfwSetErrorCallback(null).free();
	}

}
