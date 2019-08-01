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

import org.joml.Matrix4f;
import org.junit.Ignore;
import org.junit.Test;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryUtil;
import org.viduus.lwjgl.graphics.shaders.core.ShaderManager;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariable;
import org.viduus.lwjgl.graphics.shaders.core.util.RelativeShaderLoader;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.Paths;

public class GLRenderTest {

	private static final short[] IBO_ARR = {
			0, 1, 2
	};
	private static final float[] VBO_ARR = {
			-0.5f, -0.5f, 0.0f, 1.0f, 0.0f, 0.0f,
			0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f,
			0.0f,  0.5f, 0.0f, 0.0f, 0.0f, 1.0f
	};
	private static final int
			IBO_SIZE = Short.BYTES * IBO_ARR.length,
			VBO_SIZE = Float.BYTES * VBO_ARR.length;

	private final IntBuffer vao_ids, vbo_ids;
	private final ShaderManager shader_manager;
	private final ByteBuffer vbo, ibo;

	public GLRenderTest() {
		shader_manager = new GLShaderManager(new RelativeShaderLoader(Paths.get("./src/test/resources/shaders/glsl")));

		// allocate memory for vao and vbo ids
		vao_ids = BufferUtils.createIntBuffer(1);
		vbo_ids = BufferUtils.createIntBuffer(2);

		// allocate memory for ibo and vbo
		ibo = MemoryUtil.memAlloc(IBO_SIZE);
		vbo = MemoryUtil.memAlloc(VBO_SIZE);

		// fill both arrays with values
		for (short s : IBO_ARR)
			ibo.putShort(s);
		for (float f : VBO_ARR)
			vbo.putFloat(f);

		// reset position for upload later on
		ibo.position(0);
		vbo.position(0);
	}

	/**
	 * Manual test!
	 *
	 * Make sure that when you run this you set the JVM argument, -XstartOnFirstThread.
	 */
	@Ignore
	@Test
	public void test() {
		GLTestingUtil.windowTest(this::init, this::loop);
	}

	private void init(long window_id) {
		// generate indexes for vao and vbo
		GL30.glGenVertexArrays(vao_ids);
		GL15.glGenBuffers(vbo_ids);

		// bind to gpu
		GL30.glBindVertexArray(vao_ids.get(0));
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo_ids.get(0));
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, vbo_ids.get(1));

		// create our buffers with data
		GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, ibo, GL15.GL_STATIC_DRAW);
		GL15.glBufferData(GL15.GL_ARRAY_BUFFER, vbo, GL15.GL_STATIC_DRAW);

		// unbind from gpu
		GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
		GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
		GL30.glBindVertexArray(0);
	}

	private void loop(long window_id) {
		try {
			// tell opengl what shader we want to use
			ShaderProgram program = shader_manager.shader("simple");
			program.bind();

			// update model matrix
			ShaderVariable model_matrix = program.uniform("model_matrix");
			Matrix4f mat = (Matrix4f) model_matrix.value();
			mat.rotate(0.1f, 0, 1, 0);
			model_matrix.value(mat);

			// bind buffers
			GL30.glBindVertexArray(vao_ids.get(0));
			GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vbo_ids.get(0));
			GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, vbo_ids.get(1));

			// bind shader attributes
			ShaderVariable in_position = program.attribute("in_position");
			ShaderVariable in_color = program.attribute("in_color");
			program.bindAttributes(in_position, in_color);

			// tell opengl to draw the triangle
			GL11.glDrawElements(GL11.GL_TRIANGLES,  VBO_ARR.length / 6, GL11.GL_UNSIGNED_SHORT, 0);

			// unbind attributes
			program.unbindAttributes(in_position, in_color);

			// unbind buffers
			GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, 0);
			GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, 0);
			GL30.glBindVertexArray(0);

		} catch (IOException err) {
			throw new UncheckedIOException(err);
		}
	}

}
