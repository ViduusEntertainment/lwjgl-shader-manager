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
package org.viduus.lwjgl.graphics.shaders.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Map;
import java.util.function.BiConsumer;

import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector2i;
import org.joml.Vector3f;
import org.joml.Vector3i;
import org.joml.Vector4f;
import org.joml.Vector4i;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;
import org.viduus.lwjgl.graphics.shaders.core.ShaderException;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariable;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface;
import org.viduus.lwjgl.graphics.shaders.core.parsers.glsl.GlslParser;

/**
 * @author ethan
 *
 */
public class GlVariableInterface extends ShaderVariableInterface {

	private int attribute_index = 0;
	
	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#bindAttribute(org.viduus.lwjgl.graphics.shaders.core.ShaderProgram, org.viduus.lwjgl.graphics.shaders.core.variables.ShaderAttribute)
	 */
	@Override
	public void bindAttribute(ShaderProgram program, ShaderVariable variable) {
		variable.id(attribute_index++);
		GL20.glBindAttribLocation(program.id(), variable.id(), variable.name());
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#bindUniform(org.viduus.lwjgl.graphics.shaders.core.ShaderProgram, org.viduus.lwjgl.graphics.shaders.core.variables.ShaderUniform)
	 */
	@Override
	public void bindUniform(ShaderProgram program, ShaderVariable variable) {
		variable.id(GL20.glGetUniformLocation(program.id(), variable.name()));
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#bindVariableHandlers(java.util.Map)
	 */
	@Override
	protected void bindVariableHandlers(Map<Class<?>, BiConsumer<ShaderVariable, Object[]>> variable_handlers) {
		/*
		 *  Java types
		 */
		variable_handlers.put(Integer.class, (var, val) -> {
			if (var.type != GlslParser.BOOL && var.type != GlslParser.INT && var.type != GlslParser.SAMPLER2D)
				throw new ShaderException("Can not assign variable '%s' a value of type 'int'.", var.name);
			
			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = stack.mallocInt(val.length);
				for (Object obj : val)
					data.put((int) obj);
				data.flip();
				GL20.glUniform1iv(var.id(), data);
			}
		});
		variable_handlers.put(Float.class, (var, val) -> {
			if (var.type != GlslParser.FLOAT)
				throw new ShaderException("Can not assign variable '%s' a value of type 'float'.", var.name);
			
			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(val.length);
				for (Object obj : val)
					data.put((float) obj);
				data.flip();
				GL20.glUniform1fv(var.id(), data);
			}
		});
		variable_handlers.put(Boolean.class, (var, val) -> {
			if (var.type != GlslParser.BOOL)
				throw new ShaderException("Can not assign variable '%s' a value of type 'bool'.", var.name);
			
			int[] data = new int[val.length];
			for (int i=0 ; i<val.length ; i++)
				data[i] = ((boolean) val[i]) ? 1 : 0;
			setUniform(null, var, data);
		});
		
		/*
		 *  Joml types
		 */
		// ivec2
		variable_handlers.put(Vector2i.class, (var, val) -> {
			if (var.type != GlslParser.IVEC2)
				throw new ShaderException("Can not assign variable '%s' a value of type 'ivec2'.", var.name);
			
			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = stack.mallocInt(val.length * 2);
				for (Object obj : val)
					((Vector2i)obj).get(data);
				data.flip();
				GL20.glUniform2iv(var.id(), data);
			}
		});
		// ivec3
		variable_handlers.put(Vector3i.class, (var, val) -> {
			if (var.type != GlslParser.IVEC3)
				throw new ShaderException("Can not assign variable '%s' a value of type 'ivec3'.", var.name);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = stack.mallocInt(val.length * 3);
				for (Object obj : val)
					((Vector3i)obj).get(data);
				data.flip();
				GL20.glUniform3iv(var.id(), data);
			}
		});
		// ivec4
		variable_handlers.put(Vector4i.class, (var, val) -> {
			if (var.type != GlslParser.IVEC4)
				throw new ShaderException("Can not assign variable '%s' a value of type 'ivec4'.", var.name);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = stack.mallocInt(val.length * 4);
				for (Object obj : val)
					((Vector4i)obj).get(data);
				data.flip();
				GL20.glUniform4iv(var.id(), data);
			}
		});
		// vec2
		variable_handlers.put(Vector2f.class, (var, val) -> {
			if (var.type != GlslParser.VEC2)
				throw new ShaderException("Can not assign variable '%s' a value of type 'vec2'.", var.name);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(val.length * 2);
				for (Object obj : val)
					((Vector2f)obj).get(data);
				data.flip();
				GL20.glUniform2fv(var.id(), data);
			}
		});
		// vec3
		variable_handlers.put(Vector3f.class, (var, val) -> {
			if (var.type != GlslParser.VEC3)
				throw new ShaderException("Can not assign variable '%s' a value of type 'vec3'.", var.name);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(val.length * 3);
				for (Object obj : val)
					((Vector3f)obj).get(data);
				data.flip();
				GL20.glUniform3fv(var.id(), data);
			}
		});
		// vec4
		variable_handlers.put(Vector4f.class, (var, val) -> {
			if (var.type != GlslParser.VEC4)
				throw new ShaderException("Can not assign variable '%s' a value of type 'vec4'.", var.name);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(val.length * 4);
				for (Object obj : val)
					((Vector4f)obj).get(data);
				data.flip();
				GL20.glUniform4fv(var.id(), data);
			}
		});
		// mat3
		variable_handlers.put(Matrix3f.class, (var, val) -> {
			if (var.type != GlslParser.MAT3)
				throw new ShaderException("Can not assign variable '%s' a value of type 'mat3'.", var.name);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(val.length * 9);
				for (Object obj : val)
					((Matrix3f)obj).get(data);
				data.flip();
				GL20.glUniformMatrix3fv(var.id(), false, data);
			}
		});
		// mat4
		variable_handlers.put(Matrix4f.class, (var, val) -> {
			if (var.type != GlslParser.MAT4)
				throw new ShaderException("Can not assign variable '%s' a value of type 'mat4'.", var.name);

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(val.length * 16);
				for (Object obj : val)
					((Matrix4f)obj).get(data);
				data.flip();
				GL20.glUniformMatrix4fv(var.id(), false, data);
			}
		});
	}

}
