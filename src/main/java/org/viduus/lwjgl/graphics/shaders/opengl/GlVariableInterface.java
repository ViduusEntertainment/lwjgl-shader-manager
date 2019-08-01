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

import org.joml.*;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;
import org.viduus.lwjgl.graphics.shaders.core.ShaderException;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariable;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface;
import org.viduus.lwjgl.graphics.shaders.core.layouts.VariableType;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author ethan
 */
public class GlVariableInterface extends ShaderVariableInterface {

	private static IntBuffer intBufferHelper(MemoryStack stack, int stride, Object[] data, BiConsumer<IntBuffer, Object> normal, Consumer<IntBuffer> backup) {
		IntBuffer buffer = stack.mallocInt(data.length * stride);
		for (int i = 0; i < data.length; i++) {
			buffer.position(i * stride);
			if (data[i] == null) {
				backup.accept(buffer);
			} else {
				normal.accept(buffer, data[i]);
			}
		}
		buffer.position(0);
		return buffer;
	}

	private static FloatBuffer floatBufferHelper(MemoryStack stack, int stride, Object[] data, BiConsumer<FloatBuffer, Object> normal, Consumer<FloatBuffer> backup) {
		FloatBuffer buffer = stack.mallocFloat(data.length * stride);
		for (int i = 0; i < data.length; i++) {
			buffer.position(i * stride);
			if (data[i] == null) {
				backup.accept(buffer);
			} else {
				normal.accept(buffer, data[i]);
			}
		}
		buffer.position(0);
		return buffer;
	}

	private static Consumer<ShaderVariable> jomlFloatTypeHandler(Function<FloatBuffer, Object> constructor) {
		return var -> {
			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(var.length() * var.typeSize());
				GL20.glGetUniformfv(var.program().id(), var.id(), data);

				Object[] f_data = new Object[var.length()];
				for (int i = 0; i < f_data.length; i++)
					f_data[i] = constructor.apply(data);

				if (f_data.length == 1)
					var.rawValue(f_data[0]);
				else
					var.rawValue(f_data);
			}
		};
	}

	private static Consumer<ShaderVariable> jomlIntTypeHandler(Function<IntBuffer, Object> constructor) {
		return var -> {
			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = stack.mallocInt(var.length() * var.typeSize());
				GL20.glGetUniformiv(var.program().id(), var.id(), data);

				Object[] i_data = new Object[var.length()];
				for (int i = 0; i < i_data.length; i++)
					i_data[i] = constructor.apply(data);

				if (i_data.length == 1)
					var.rawValue(i_data[0]);
				else
					var.rawValue(i_data);
			}
		};
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#bindAttribute(org.viduus.lwjgl.graphics.shaders.core.ShaderProgram, org.viduus.lwjgl.graphics.shaders.core.variables.ShaderAttribute)
	 */
	@Override
	public void bindAttribute(ShaderProgram program, ShaderVariable variable) {
		variable.id(GL20.glGetAttribLocation(program.id(), variable.name()));
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
			if (var.type() != VariableType.BOOL && var.type() != VariableType.INT && var.type() != VariableType.SAMPLER_2D)
				throw new ShaderException("Can not assign variable '%s' a value of type 'int'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = intBufferHelper(stack, 1, val,
						(b, v) -> b.put((int) v),
						b -> b.put(0));
				GL20.glUniform1iv(var.id(), data);
			}
		});
		variable_handlers.put(Float.class, (var, val) -> {
			if (var.type() != VariableType.FLOAT)
				throw new ShaderException("Can not assign variable '%s' a value of type 'float'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = floatBufferHelper(stack, 1, val,
						(b, v) -> b.put((float) v),
						b -> b.put(0f));
				GL20.glUniform1fv(var.id(), data);
			}
		});
		variable_handlers.put(Boolean.class, (var, val) -> {
			if (var.type() != VariableType.BOOL)
				throw new ShaderException("Can not assign variable '%s' a value of type 'bool'.", var.name());

			int[] data = new int[val.length];
			for (int i = 0; i < val.length; i++)
				data[i] = ((boolean) val[i]) ? 1 : 0;
			setUniform(null, var, data);
		});

		/*
		 *  Joml types
		 */
		// ivec2
		variable_handlers.put(Vector2i.class, (var, val) -> {
			if (var.type() != VariableType.INT_VEC2)
				throw new ShaderException("Can not assign variable '%s' a value of type 'ivec2'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = intBufferHelper(stack, 2, val,
						(b, v) -> ((Vector2i) v).get(b),
						b -> new Vector2i().get(b));
				GL20.glUniform2iv(var.id(), data);
			}
		});
		// ivec3
		variable_handlers.put(Vector3i.class, (var, val) -> {
			if (var.type() != VariableType.INT_VEC3)
				throw new ShaderException("Can not assign variable '%s' a value of type 'ivec3'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = intBufferHelper(stack, 3, val,
						(b, v) -> ((Vector3i) v).get(b),
						b -> new Vector3i().get(b));
				GL20.glUniform3iv(var.id(), data);
			}
		});
		// ivec4
		variable_handlers.put(Vector4i.class, (var, val) -> {
			if (var.type() != VariableType.INT_VEC4)
				throw new ShaderException("Can not assign variable '%s' a value of type 'ivec4'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = intBufferHelper(stack, 4, val,
						(b, v) -> ((Vector4i) v).get(b),
						b -> new Vector4i().get(b));
				GL20.glUniform4iv(var.id(), data);
			}
		});
		// vec2
		variable_handlers.put(Vector2f.class, (var, val) -> {
			if (var.type() != VariableType.FLOAT_VEC2)
				throw new ShaderException("Can not assign variable '%s' a value of type 'vec2'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = floatBufferHelper(stack, 2, val,
						(b, v) -> ((Vector2f) v).get(b),
						b -> new Vector2f().get(b));
				GL20.glUniform2fv(var.id(), data);
			}
		});
		// vec3
		variable_handlers.put(Vector3f.class, (var, val) -> {
			if (var.type() != VariableType.FLOAT_VEC3)
				throw new ShaderException("Can not assign variable '%s' a value of type 'vec3'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = floatBufferHelper(stack, 3, val,
						(b, v) -> ((Vector3f) v).get(b),
						b -> new Vector3f().get(b));
				GL20.glUniform3fv(var.id(), data);
			}
		});
		// vec4
		variable_handlers.put(Vector4f.class, (var, val) -> {
			if (var.type() != VariableType.FLOAT_VEC4)
				throw new ShaderException("Can not assign variable '%s' a value of type 'vec4'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = floatBufferHelper(stack, 4, val,
						(b, v) -> ((Vector4f) v).get(b),
						b -> new Vector4f().get(b));
				GL20.glUniform4fv(var.id(), data);
			}
		});
		// mat3
		variable_handlers.put(Matrix3f.class, (var, val) -> {
			if (var.type() != VariableType.FLOAT_MAT3)
				throw new ShaderException("Can not assign variable '%s' a value of type 'mat3'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = floatBufferHelper(stack, 9, val,
						(b, v) -> ((Matrix3f) v).get(b),
						b -> new Matrix3f().get(b));
				GL20.glUniformMatrix3fv(var.id(), false, data);
			}
		});
		// mat4
		variable_handlers.put(Matrix4f.class, (var, val) -> {
			if (var.type() != VariableType.FLOAT_MAT4)
				throw new ShaderException("Can not assign variable '%s' a value of type 'mat4'.", var.name());

			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = floatBufferHelper(stack, 16, val,
						(b, v) -> ((Matrix4f) v).get(b),
						b -> new Matrix4f().get(b));
				GL20.glUniformMatrix4fv(var.id(), false, data);
			}
		});
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariableInterface#bindTypeHandlers(java.util.Map)
	 */
	@Override
	protected void bindTypeHandlers(Map<VariableType, Consumer<ShaderVariable>> type_handlers) {
		// array like float consumer
		type_handlers.put(VariableType.FLOAT, var -> {
			try (MemoryStack stack = MemoryStack.stackPush()) {
				FloatBuffer data = stack.mallocFloat(var.length());
				GL20.glGetUniformfv(var.program().id(), var.id(), data);

				Float[] f_data = new Float[var.length()];
				for (int i = 0; i < f_data.length; i++)
					f_data[i] = data.get(i);

				if (f_data.length == 1)
					var.rawValue(f_data[0]);
				else
					var.rawValue(f_data);
			}
		});
		type_handlers.put(VariableType.FLOAT_VEC2, jomlFloatTypeHandler(Vector2f::new));
		type_handlers.put(VariableType.FLOAT_VEC3, jomlFloatTypeHandler(Vector3f::new));
		type_handlers.put(VariableType.FLOAT_VEC4, jomlFloatTypeHandler(Vector4f::new));
		type_handlers.put(VariableType.FLOAT_MAT3, jomlFloatTypeHandler(Matrix3f::new));
		type_handlers.put(VariableType.FLOAT_MAT4, jomlFloatTypeHandler(Matrix4f::new));

		// array like int consumer
		type_handlers.put(VariableType.INT, var -> {
			try (MemoryStack stack = MemoryStack.stackPush()) {
				IntBuffer data = stack.mallocInt(var.length());
				GL20.glGetUniformiv(var.program().id(), var.id(), data);

				Integer[] i_data = new Integer[var.length()];
				for (int i = 0; i < i_data.length; i++)
					i_data[i] = data.get(i);

				if (i_data.length == 1)
					var.rawValue(i_data[0]);
				else
					var.rawValue(i_data);
			}
		});
		type_handlers.put(VariableType.INT_VEC2, jomlIntTypeHandler(Vector2i::new));
		type_handlers.put(VariableType.INT_VEC3, jomlIntTypeHandler(Vector3i::new));
		type_handlers.put(VariableType.INT_VEC4, jomlIntTypeHandler(Vector4i::new));
	}

}
