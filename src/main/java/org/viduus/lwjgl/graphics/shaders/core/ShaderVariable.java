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

import org.viduus.lwjgl.graphics.shaders.core.layouts.DataLayout;
import org.viduus.lwjgl.graphics.shaders.core.layouts.VariableType;

/**
 * @author ethan
 */
public abstract class ShaderVariable {

	protected final ShaderProgram program;
	protected final String name;
	protected final UsageFlag usage;
	protected final VariableType type;
	protected final int length;
	protected final Object value;

	protected int id;

	/**
	 * @param program The parent shader program
	 * @param name    The name of the variable
	 * @param usage   Enum flagging whether or not this variable is an attribute or uniform
	 * @param length  The array length of this variable (1 for non-array variables)
	 * @param gl_type The glsl type id
	 */
	public ShaderVariable(ShaderProgram program, String name, UsageFlag usage, int length, int gl_type) {
		this.program = program;
		this.name = filterName(name);
		this.usage = usage;
		this.type = convertGpuType(gl_type);
		this.length = length;
		this.value = new Object[length];
	}

	private static String filterName(String name) {
		int idx = name.indexOf('[');
		if (idx == -1)
			idx = name.length();
		return name.substring(0, idx);
	}

	protected abstract VariableType convertGpuType(int gpu_type);

	public void id(int id) {
		this.id = id;
	}

	public int id() {
		return id;
	}

	/**
	 * @return the encompassing shader program for this shader variable.
	 */
	public ShaderProgram program() {
		return program;
	}

	/**
	 * @return the name of this shader variable.
	 */
	public String name() {
		return name;
	}

	/**
	 * @return the type of this shader variable.
	 */
	public VariableType type() {
		return type;
	}

	public UsageFlag usage() {
		return usage;
	}

	public int byteSize(DataLayout layout) {
		return layout.getByteSize(type, length);
	}

	public int byteSize() {
		return byteSize(program.dataLayout());
	}

	/**
	 * Uses the passed layout to determine the size of this shader variable.
	 *
	 * @param layout Layout used to compute variable size.
	 * @return The size in bytes
	 */
	public int typeSize(DataLayout layout) {
		return layout.getTypeSize(type);
	}

	/**
	 * The encompassing shader program for this varaible's data layout is used.
	 *
	 * @return the size, in bytes, of this varaible's type.
	 */
	public int typeSize() {
		return typeSize(program.dataLayout());
	}

	/**
	 * @return The current value of this shader variable.
	 */
	public Object value() {
		return length() == 1 ? ((Object[]) value)[0] : value;
	}

	/**
	 * The length of this shader variable.
	 *
	 * @return One for all non array variables. For array variables it will be the maximum size
	 * used in the shader.
	 */
	public int length() {
		return length;
	}

	/**
	 * Sets the raw value of this shader variable. Does not push the value to the GPU.
	 *
	 * @param i   Index into this variable to write value
	 * @param obj New value
	 */
	public void rawValue(int i, Object obj) {
		// if non array
		if (i >= length())
			throw new IndexOutOfBoundsException();

		((Object[]) value)[i] = obj;
	}

	/**
	 * Shorthand for {@link #rawValue(int, Object)}
	 */
	public void rawValue(Object obj) {
		rawValue(0, obj);
	}

	/**
	 * Sets and pushes the value of this shader variable to the GPU. If it is not a uniform
	 * variable nothing happens.
	 *
	 * @param obj The new value
	 */
	public void value(int i, Object obj) {
		rawValue(i, obj);
		push();
	}

	public void value(Object obj) {
		value(0, obj);
	}

	/**
	 * Pushes the value of this shader variable to the GPU. If it is not a uniform variable nothing
	 * happens.
	 */
	public void push() {
		if (usage == UsageFlag.UNIFORM)
			program.var_interface.setUniform(program, this, value);
	}

	public void usageCheck(UsageFlag flag) {
		if (usage != flag)
			throw new ShaderException("Variable '%s' is not a %s variable.", name, flag);
	}

	@Override
	public String toString() {
		return String.format("variable[name:%s, id:%d, usage:%s, type:%s, length:%d, value:%s]", name(), id(), usage(), type(), length(), value());
	}

}
