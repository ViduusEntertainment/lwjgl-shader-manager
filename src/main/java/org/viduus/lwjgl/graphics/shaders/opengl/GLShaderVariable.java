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

import org.lwjgl.opengl.*;
import org.viduus.lwjgl.graphics.shaders.core.ShaderProgram;
import org.viduus.lwjgl.graphics.shaders.core.ShaderVariable;
import org.viduus.lwjgl.graphics.shaders.core.UsageFlag;
import org.viduus.lwjgl.graphics.shaders.core.layouts.VariableType;

/**
 * @author ethan
 */
public class GLShaderVariable extends ShaderVariable {

	/**
	 *
	 */
	public GLShaderVariable(ShaderProgram program, String name, UsageFlag usage, int size, int type) {
		super(program, name, usage, size, type);
	}

	/* (non-Javadoc)
	 * @see org.viduus.lwjgl.graphics.shaders.core.ShaderVariable#convertGpuType(int)
	 */
	@Override
	protected VariableType convertGpuType(int gpu_type) {
		switch (gpu_type) {
			case GL20.GL_BOOL_VEC2:
				return VariableType.BOOL_VEC2;
			case GL20.GL_BOOL_VEC3:
				return VariableType.BOOL_VEC3;
			case GL20.GL_BOOL_VEC4:
				return VariableType.BOOL_VEC4;
			case GL20.GL_BOOL:
				return VariableType.BOOL;
			case GL40.GL_DOUBLE_MAT2:
				return VariableType.DOUBLE_MAT2;
			case GL40.GL_DOUBLE_MAT2x3:
				return VariableType.DOUBLE_MAT2x3;
			case GL40.GL_DOUBLE_MAT2x4:
				return VariableType.DOUBLE_MAT2x4;
			case GL40.GL_DOUBLE_MAT3:
				return VariableType.DOUBLE_MAT3;
			case GL40.GL_DOUBLE_MAT3x2:
				return VariableType.DOUBLE_MAT3x2;
			case GL40.GL_DOUBLE_MAT3x4:
				return VariableType.DOUBLE_MAT3x4;
			case GL40.GL_DOUBLE_MAT4:
				return VariableType.DOUBLE_MAT4;
			case GL40.GL_DOUBLE_MAT4x2:
				return VariableType.DOUBLE_MAT4x2;
			case GL40.GL_DOUBLE_MAT4x3:
				return VariableType.DOUBLE_MAT4x3;
			case GL40.GL_DOUBLE_VEC2:
				return VariableType.DOUBLE_VEC2;
			case GL40.GL_DOUBLE_VEC3:
				return VariableType.DOUBLE_VEC3;
			case GL40.GL_DOUBLE_VEC4:
				return VariableType.DOUBLE_VEC4;
			case GL11.GL_DOUBLE:
				return VariableType.DOUBLE;
			case GL20.GL_FLOAT_MAT2:
				return VariableType.FLOAT_MAT2;
			case GL21.GL_FLOAT_MAT2x3:
				return VariableType.FLOAT_MAT2x3;
			case GL21.GL_FLOAT_MAT2x4:
				return VariableType.FLOAT_MAT2x4;
			case GL20.GL_FLOAT_MAT3:
				return VariableType.FLOAT_MAT3;
			case GL21.GL_FLOAT_MAT3x2:
				return VariableType.FLOAT_MAT3x2;
			case GL21.GL_FLOAT_MAT3x4:
				return VariableType.FLOAT_MAT3x4;
			case GL20.GL_FLOAT_MAT4:
				return VariableType.FLOAT_MAT4;
			case GL21.GL_FLOAT_MAT4x2:
				return VariableType.FLOAT_MAT4x2;
			case GL21.GL_FLOAT_MAT4x3:
				return VariableType.FLOAT_MAT4x3;
			case GL20.GL_FLOAT_VEC2:
				return VariableType.FLOAT_VEC2;
			case GL20.GL_FLOAT_VEC3:
				return VariableType.FLOAT_VEC3;
			case GL20.GL_FLOAT_VEC4:
				return VariableType.FLOAT_VEC4;
			case GL11.GL_FLOAT:
				return VariableType.FLOAT;
			case GL42.GL_IMAGE_1D_ARRAY:
				return VariableType.IMAGE_1D_ARRAY;
			case GL42.GL_IMAGE_1D:
				return VariableType.IMAGE_1D;
			case GL42.GL_IMAGE_2D_ARRAY:
				return VariableType.IMAGE_2D_ARRAY;
			case GL42.GL_IMAGE_2D_MULTISAMPLE_ARRAY:
				return VariableType.IMAGE_2D_MULTISAMPLE_ARRAY;
			case GL42.GL_IMAGE_2D_MULTISAMPLE:
				return VariableType.IMAGE_2D_MULTISAMPLE;
			case GL42.GL_IMAGE_2D_RECT:
				return VariableType.IMAGE_2D_RECT;
			case GL42.GL_IMAGE_2D:
				return VariableType.IMAGE_2D;
			case GL42.GL_IMAGE_3D:
				return VariableType.IMAGE_3D;
			case GL42.GL_IMAGE_BUFFER:
				return VariableType.IMAGE_BUFFER;
			case GL42.GL_IMAGE_CUBE:
				return VariableType.IMAGE_CUBE;
			case GL42.GL_INT_IMAGE_1D_ARRAY:
				return VariableType.INT_IMAGE_1D_ARRAY;
			case GL42.GL_INT_IMAGE_1D:
				return VariableType.INT_IMAGE_1D;
			case GL42.GL_INT_IMAGE_2D_ARRAY:
				return VariableType.INT_IMAGE_2D_ARRAY;
			case GL42.GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY:
				return VariableType.INT_IMAGE_2D_MULTISAMPLE_ARRAY;
			case GL42.GL_INT_IMAGE_2D_MULTISAMPLE:
				return VariableType.INT_IMAGE_2D_MULTISAMPLE;
			case GL42.GL_INT_IMAGE_2D_RECT:
				return VariableType.INT_IMAGE_2D_RECT;
			case GL42.GL_INT_IMAGE_2D:
				return VariableType.INT_IMAGE_2D;
			case GL42.GL_INT_IMAGE_3D:
				return VariableType.INT_IMAGE_3D;
			case GL42.GL_INT_IMAGE_BUFFER:
				return VariableType.INT_IMAGE_BUFFER;
			case GL42.GL_INT_IMAGE_CUBE:
				return VariableType.INT_IMAGE_CUBE;
			case GL30.GL_INT_SAMPLER_1D_ARRAY:
				return VariableType.INT_SAMPLER_1D_ARRAY;
			case GL30.GL_INT_SAMPLER_1D:
				return VariableType.INT_SAMPLER_1D;
			case GL30.GL_INT_SAMPLER_2D_ARRAY:
				return VariableType.INT_SAMPLER_2D_ARRAY;
			case GL32.GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY:
				return VariableType.INT_SAMPLER_2D_MULTISAMPLE_ARRAY;
			case GL32.GL_INT_SAMPLER_2D_MULTISAMPLE:
				return VariableType.INT_SAMPLER_2D_MULTISAMPLE;
			case GL31.GL_INT_SAMPLER_2D_RECT:
				return VariableType.INT_SAMPLER_2D_RECT;
			case GL30.GL_INT_SAMPLER_2D:
				return VariableType.INT_SAMPLER_2D;
			case GL30.GL_INT_SAMPLER_3D:
				return VariableType.INT_SAMPLER_3D;
			case GL31.GL_INT_SAMPLER_BUFFER:
				return VariableType.INT_SAMPLER_BUFFER;
			case GL30.GL_INT_SAMPLER_CUBE:
				return VariableType.INT_SAMPLER_CUBE;
			case GL20.GL_INT_VEC2:
				return VariableType.INT_VEC2;
			case GL20.GL_INT_VEC3:
				return VariableType.INT_VEC3;
			case GL20.GL_INT_VEC4:
				return VariableType.INT_VEC4;
			case GL11.GL_INT:
				return VariableType.INT;
			case GL30.GL_SAMPLER_1D_ARRAY_SHADOW:
				return VariableType.SAMPLER_1D_ARRAY_SHADOW;
			case GL30.GL_SAMPLER_1D_ARRAY:
				return VariableType.SAMPLER_1D_ARRAY;
			case GL20.GL_SAMPLER_1D_SHADOW:
				return VariableType.SAMPLER_1D_SHADOW;
			case GL20.GL_SAMPLER_1D:
				return VariableType.SAMPLER_1D;
			case GL30.GL_SAMPLER_2D_ARRAY_SHADOW:
				return VariableType.SAMPLER_2D_ARRAY_SHADOW;
			case GL30.GL_SAMPLER_2D_ARRAY:
				return VariableType.SAMPLER_2D_ARRAY;
			case GL32.GL_SAMPLER_2D_MULTISAMPLE_ARRAY:
				return VariableType.SAMPLER_2D_MULTISAMPLE_ARRAY;
			case GL32.GL_SAMPLER_2D_MULTISAMPLE:
				return VariableType.SAMPLER_2D_MULTISAMPLE;
			case GL31.GL_SAMPLER_2D_RECT_SHADOW:
				return VariableType.SAMPLER_2D_RECT_SHADOW;
			case GL31.GL_SAMPLER_2D_RECT:
				return VariableType.SAMPLER_2D_RECT;
			case GL20.GL_SAMPLER_2D_SHADOW:
				return VariableType.SAMPLER_2D_SHADOW;
			case GL20.GL_SAMPLER_2D:
				return VariableType.SAMPLER_2D;
			case GL20.GL_SAMPLER_3D:
				return VariableType.SAMPLER_3D;
			case GL31.GL_SAMPLER_BUFFER:
				return VariableType.SAMPLER_BUFFER;
			case GL30.GL_SAMPLER_CUBE_SHADOW:
				return VariableType.SAMPLER_CUBE_SHADOW;
			case GL20.GL_SAMPLER_CUBE:
				return VariableType.SAMPLER_CUBE;
			case GL42.GL_UNSIGNED_INT_ATOMIC_COUNTER:
				return VariableType.UNSIGNED_INT_ATOMIC_COUNTER;
			case GL42.GL_UNSIGNED_INT_IMAGE_1D_ARRAY:
				return VariableType.UNSIGNED_INT_IMAGE_1D_ARRAY;
			case GL42.GL_UNSIGNED_INT_IMAGE_1D:
				return VariableType.UNSIGNED_INT_IMAGE_1D;
			case GL42.GL_UNSIGNED_INT_IMAGE_2D_ARRAY:
				return VariableType.UNSIGNED_INT_IMAGE_2D_ARRAY;
			case GL42.GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY:
				return VariableType.UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY;
			case GL42.GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE:
				return VariableType.UNSIGNED_INT_IMAGE_2D_MULTISAMPLE;
			case GL42.GL_UNSIGNED_INT_IMAGE_2D_RECT:
				return VariableType.UNSIGNED_INT_IMAGE_2D_RECT;
			case GL42.GL_UNSIGNED_INT_IMAGE_2D:
				return VariableType.UNSIGNED_INT_IMAGE_2D;
			case GL42.GL_UNSIGNED_INT_IMAGE_3D:
				return VariableType.UNSIGNED_INT_IMAGE_3D;
			case GL42.GL_UNSIGNED_INT_IMAGE_BUFFER:
				return VariableType.UNSIGNED_INT_IMAGE_BUFFER;
			case GL42.GL_UNSIGNED_INT_IMAGE_CUBE:
				return VariableType.UNSIGNED_INT_IMAGE_CUBE;
			case GL30.GL_UNSIGNED_INT_SAMPLER_1D_ARRAY:
				return VariableType.UNSIGNED_INT_SAMPLER_1D_ARRAY;
			case GL30.GL_UNSIGNED_INT_SAMPLER_1D:
				return VariableType.UNSIGNED_INT_SAMPLER_1D;
			case GL30.GL_UNSIGNED_INT_SAMPLER_2D_ARRAY:
				return VariableType.UNSIGNED_INT_SAMPLER_2D_ARRAY;
			case GL32.GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY:
				return VariableType.UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY;
			case GL32.GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE:
				return VariableType.UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE;
			case GL31.GL_UNSIGNED_INT_SAMPLER_2D_RECT:
				return VariableType.UNSIGNED_INT_SAMPLER_2D_RECT;
			case GL30.GL_UNSIGNED_INT_SAMPLER_2D:
				return VariableType.UNSIGNED_INT_SAMPLER_2D;
			case GL30.GL_UNSIGNED_INT_SAMPLER_3D:
				return VariableType.UNSIGNED_INT_SAMPLER_3D;
			case GL31.GL_UNSIGNED_INT_SAMPLER_BUFFER:
				return VariableType.UNSIGNED_INT_SAMPLER_BUFFER;
			case GL30.GL_UNSIGNED_INT_SAMPLER_CUBE:
				return VariableType.UNSIGNED_INT_SAMPLER_CUBE;
			case GL30.GL_UNSIGNED_INT_VEC2:
				return VariableType.UNSIGNED_INT_VEC2;
			case GL30.GL_UNSIGNED_INT_VEC3:
				return VariableType.UNSIGNED_INT_VEC3;
			case GL30.GL_UNSIGNED_INT_VEC4:
				return VariableType.UNSIGNED_INT_VEC4;
			case GL11.GL_UNSIGNED_INT:
				return VariableType.UNSIGNED_INT;
			default:
				throw new RuntimeException("Unknown gpu type id, " + gpu_type);
		}
	}

}
